package viikko5.perusteet.th;

public class Artist {

    private String name;
    private int yearOfBirth;

    public Artist(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        return;
    }

    public int getYearOfBirth() {
        // Kirjoita tämän metodin toteutus
    	return this.yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        return;
    }

    @Override
    public String toString() {
        return this.name;
    }
}