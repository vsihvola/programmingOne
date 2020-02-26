package viikko5.perusteet.th;

public class ArtistName {

	public static void main(String[] args) {
	Artist rick = new Artist("Rick", 1966);

	System.out.println(rick.getName());

	System.out.println(rick.getYearOfBirth());



	rick.setName("Rick Astley");

	System.out.println(rick.getName());
	}
	
}
