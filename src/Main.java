
void main() {

    IO.println("1. Enkripto");
    IO.println("2. Dekripto");

    int zgjedhja = Integer.parseInt(IO.readln("Zgjedhja (1-2): "));

    var drejtimi = switch (zgjedhja) {
        case 1 -> 1;
        case 2 -> -1;
        default -> 0;
    };

    if (drejtimi == 0) {
        IO.println("Zgjedhje e panjohur.");
    } else {

        String shkronja = IO.readln("Shkronja: ").trim();
        int zhvendosja = Integer.parseInt(IO.readln("Zhvendosja (1-25): "));

        if (shkronja.length() == 1) {

            char c = shkronja.charAt(0);

            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {

                if (zhvendosja >= 1 && zhvendosja <= 25) {

                    char fillimi = (c >= 'A' && c <= 'Z') ? 'A' : 'a';

                    int pozita = c - fillimi;
                    int pozitaRe = (pozita + drejtimi * zhvendosja + 26) % 26;

                    char rezultati = (char) (fillimi + pozitaRe);

                    IO.println(c + " -> " + rezultati);

                    System.out.printf("Zhvendosja: %d nga 26 (%.2f %%)%n",
                            zhvendosja, zhvendosja / 26.0 * 100);

                } else {
                    IO.println("Zhvendosja: nga 1 deri ne 25.");
                }

            } else {
                IO.println("Vetem shkronjat a-z, pa ë dhe ç.");
            }

        } else {
            IO.println("Shkruani vetem nje shkronje.");
        }
    }
}
