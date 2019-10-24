public class Monster {
  private String navn;
  private int nummer;
  private String beskrivelse;

  public Monster(String navn, int nummer, String beskrivelse) {
    this.navn = navn;
    this.nummer = nummer;
    this.beskrivelse = beskrivelse;
  }

  public String hentNavn() {
    return navn;
  }

  public String hentBeskrivelse() {
    return beskrivelse;
  }

  public int hentNummer() {
    return nummer;
  }

  public void printAll() {
    System.out.println("Name: " + navn);
    System.out.println("Databasenummer: " + nummer);
    System.out.println("Description: " + beskrivelse);
  }
}
