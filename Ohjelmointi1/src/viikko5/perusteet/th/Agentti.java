package viikko5.perusteet.th;

public class Agentti {

	private String etunimi;
    private String sukunimi;

    public Agentti(String etunimi, String sukunimi) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
    }

    public String toString() {
		return "My name is "+ this.sukunimi + ", " + this.etunimi + " " + this.sukunimi;
    }
    
    public static void main (String[] args) {
    	Agentti agentti = new Agentti("Johnny", "English");
    	agentti.toString();
    	
    	System.out.println(agentti);
    }
}
