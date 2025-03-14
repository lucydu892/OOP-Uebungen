public class Application {
    public static void main(String[] args) {

        //Initialize Hund
        Hund hund1 = new Hund();
        hund1.gibLaut();
        hund1.zeigeInfo(2," Louie");
        hund1.saeugtierMerkmal();
        //Initialize Katze
        Katze katze1 = new Katze();
        katze1.gibLaut();
        katze1.zeigeInfo(2," Hantu");
        katze1.saeugtierMerkmal();
        //Initialize Papagei
        Papagei papagei1 = new Papagei();
        papagei1.gibLaut();
        papagei1.zeigeInfo(6," Pedro");
        papagei1.fliegen();
        //Erstellen Array
        Tier[] tiere = {hund1,katze1,papagei1};

        System.out.println(tiere);
    }
}
