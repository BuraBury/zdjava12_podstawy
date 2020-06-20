package solutions_by_me;

public class SitoErastotenesa {

    private boolean[] tablica;
    private int[] liczby;
    private int zakres;
    private char separator;
    private int iloscLiczbPierwszych;

    SitoErastotenesa(int zakres) {
        this.zakres = zakres;
        this.separator = ' ';
    }

    SitoErastotenesa() {
        this.zakres = 0;
        this.separator = ' ';
    }

    public int[] wyznacz() {
        tablica = new boolean[this.zakres + 1];

        for (int i = 2; i < this.zakres; i++) {
            if (!tablica[i]) {
                for (int j = 2; j * i < this.zakres; j++) {
                    tablica[i * j] = true;
                }
            }
        }
        for (int w = 2; w < tablica.length; w++) {
            if (!tablica[w]) {
                this.iloscLiczbPierwszych++;
            }
        }

        liczby = new int[this.iloscLiczbPierwszych];

        int wskaznik = 0;
        for (int e = 2; e < tablica.length; e++) {
            if (!tablica[e]) {
                liczby[wskaznik] = e;
                wskaznik++;
            }
        }
        return liczby;
    }

    public int getIloscLiczbPierwszych() {
        return this.iloscLiczbPierwszych;
    }

    public void wyswietl() {
        String liczbyPierwsze = "";
        for (int q = 0; q < liczby.length; q++) {
            liczbyPierwsze += liczby[q] + "" + separator;
        }
        System.out.println(liczbyPierwsze);
    }

    public int getZakres() {
        return zakres;
    }

    public void setZakres(int zakres) {
        this.zakres = zakres;
    }

    public char getSeparator() {
        return separator;
    }

    public void setSeparator(char separator) {
        this.separator = separator;
    }

    public static void main(String[] args) {

        SitoErastotenesa sito = new SitoErastotenesa(200);
        sito.wyznacz();
        int i = sito.getIloscLiczbPierwszych();
        System.out.println(i);
        sito.wyswietl();


    }


}


