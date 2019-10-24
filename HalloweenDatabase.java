import java.util.ArrayList;

public class HalloweenDatabase {
  ArrayList<Monster> monsterListe = new ArrayList<Monster>();

  public HalloweenDatabase() {

  }

  public void meny() {
    System.out.println("Welcome to the Halloween Database! What can we help you with?");
    System.out.println("Enter the number corresponding to your desired action.");

    System.out.println();

    System.out.println("(1): Search monster by name");
    System.out.println("(2): Search monster by number");
    System.out.println("(3): Print out a list of all the available monsters.");
    System.out.println("(4): Print out all the monsters alphabetically.");
    System.out.println("(5): Print out all the monsters numerically.");
    System.out.println("(6): Take me to a random monster page.");
    System.out.println("(7): Print out all the monsters in any order.");

    System.out.println();

  }

  public void settInnMonster(Monster m) {
    monsterListe.add(m);
  }

  public void nyttMonster(String navn, int nr, String beskrivelse) {
    Monster nyttMonster = new Monster(navn, nr, beskrivelse);
    monsterListe.add(nyttMonster);
  }

  public void printUtAlt() {
    for (Monster m : monsterListe) {
      m.printAll();
    }
  }

  public Monster finnMonsterNavn(String navn) {
    for (Monster m : monsterListe) {
      if (m.hentNavn().equalsIgnoreCase(navn)) {
        return m;
      }
    }
    System.out.println("Could not find a monster with that name.");
    return null;
  }
}
