package viikko5.perusteet.th;

public class Song {

	private String title;
	private Artist artist;
	private int year;
	private int length;

	/*
	 * public static void main(String[] args) { Artist artist = new
	 * Artist("Rick Astley", 1966);
	 * 
	 * System.out.println(artist);
	 * 
	 * Song song = new Song();
	 * 
	 * song.setTitle("Never Gonna Give You Up");
	 * 
	 * song.setYear(1987);
	 * 
	 * song.setLength(215);
	 * 
	 * System.out.println(song);
	 * 
	 * song.setArtist(artist);
	 * 
	 * System.out.println(song);
	 * 
	 * }
	 */

	public Song() {

	}

	public void setArtist(Artist artist) {
		this.artist = artist;

	}

	public Artist getArtist() {

		return this.artist;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {

		return title;

	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public String toString() {

		if (artist == null) {
			return this.title;
		} else {
			return this.title + " by " + this.artist;
		}

	}

}
