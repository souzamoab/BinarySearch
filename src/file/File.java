package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class File {
	Path fileInPath = Paths.get("src/fileIn.txt");
	Path fileOutPath = Paths.get("src/fileOut.txt");

	public int[] readFile() throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new FileReader(fileInPath.toString()));

		List<Integer> lines = new ArrayList<Integer>();
		String line = bufferedReader.readLine();
		int tam = Integer.parseInt(line);
		int[] vector = new int[tam];

		while ((line = bufferedReader.readLine()) != null) {
			lines.add(Integer.parseInt(line));

			if (lines.size() == tam)
				break;
		}

		bufferedReader.close();

		for (int i = 0; i < lines.size(); i++) {
			vector[i] = lines.get(i);
		}

		return vector;
	}

	public int getLastLine() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(fileInPath.toString()));

		List<Integer> lines = new ArrayList<Integer>();
		String line = bufferedReader.readLine();

		while ((line = bufferedReader.readLine()) != null) {
			lines.add(Integer.parseInt(line));
		}

		bufferedReader.close();

		return lines.get(lines.size() - 1);
	}

	public void writeFile(String message, int result) throws IOException {

		FileWriter file = new FileWriter(fileOutPath.toString(), false);

		PrintWriter printWriter = new PrintWriter(file);

		printWriter.println(message);
		printWriter.println(result);

		printWriter.close();

	}
}
