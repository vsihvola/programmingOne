package viikko5.perusteet.th;

import java.util.ArrayList;

public class Playlist {

	private ArrayList<Song> songs;

	public static void main(String[] args) {
		Playlist playlist = new Playlist();

		Artist artist = new Artist("Rick Astley", 1966);

		Song song = new Song();

		song.setTitle("Never Gonna Give You Up");

		song.setYear(1987);

		song.setLength(215);

		song.setArtist(artist);

		playlist.addSong(song);

		System.out.println(playlist);

		System.out.println(playlist.getTotalLength());

		Artist artist2 = new Artist("David Hasselhoff", 1952);

		Song song2 = new Song();

		song2.setTitle("Hooked on a Feeling");

		song2.setYear(1997);

		song2.setLength(211);

		song2.setArtist(artist2);

		playlist.addSong(song2);

		System.out.println(playlist);

		System.out.println(playlist.getTotalLength());
	}

	public Playlist() {
		songs = new ArrayList<Song>();

	}

	public void addSong(Song song) {
		songs.add(song);

	}

	public Song getSong(int index) {
		if (index <= songs.size()) {
			return songs.get(index);

		} else {
			return null;
		}

	}

	public int getTotalLength() {

		int temp = 0;

		for (int i = 0; i < songs.size(); i++) {
			temp += songs.get(i).getLength();
		}

		return temp;

	}

	public String toString() {

		int slot = 1;
		String whatWePrint = "";

		for (int i = 0; i < songs.size(); i++) {
			if (songs.size() > 1) {
				whatWePrint += slot + ": " + songs.get(i).getTitle() + " by " + songs.get(i).getArtist().toString()
						+ "\n";
			} else {
				whatWePrint += slot + ": " + songs.get(i).getTitle() + " by " + songs.get(i).getArtist().toString();
			}
			slot++;

		}

		return whatWePrint;
	}

}
