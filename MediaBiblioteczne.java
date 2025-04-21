public class MediaBiblioteczne {
    protected String tytul;
    protected int rokWydania;
    protected boolean dostepny = true;

    public MediaBiblioteczne(String tytul, int rokWydania) {
        this.tytul = tytul;
        this.rokWydania = rokWydania;
    }
    public void wypozycz() {
        if (dostepny) {
            dostepny = false;
            System.out.println("Produkt jest dostepny");
        }
        else{
            System.out.println("Produkt jest nie dostepny");
        }
    }
    public void zwroc(){
        if(!dostepny){
            dostepny = true;
            System.out.println("Produkt do zwrotu");
        }
        else{
            System.out.println("Produkt jest wypożyczony");
        }
    }
    public void wyswietlInformacje(){
        String status = dostepny ? "Dostępne" : "Wypożyczone";
        System.out.println("Tytuł: " + tytul);
        System.out.println("Rok wydania: " + rokWydania);
        System.out.println("Status: " + status);
    }
}