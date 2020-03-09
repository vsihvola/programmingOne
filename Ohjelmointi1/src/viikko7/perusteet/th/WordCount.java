package viikko7.perusteet.th;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WordCount {

	public static void main(String[] args) {

		Path path = Paths.get("C:\\loreipsum.txt");

		try {
			List<String> list = Files.readAllLines(path, StandardCharsets.UTF_8);

			int lineCount = list.size();
			int wordCount = list.toString().split(" ").length;
			String string = list.toString().replace("[", "").replace("]", "");
			int markCount = string.length();
			System.out.println("Tiedostossa on: ");

			System.out.println(lineCount + " riviä");
			System.out.println(wordCount + " sanaa");
			System.out.println(markCount + " merkkiä");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}