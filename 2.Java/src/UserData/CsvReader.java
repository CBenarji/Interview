package UserData;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CsvReader {

	public static void main(String[] args) {

try {
	List<String> lines=Files.readAllLines(Paths.get("src\\data\\Sacramentorealestatetransactionss.csv"));
for (String line:lines) {
	line=line.replace("\"", "");
	System.out.println(line);
	
}
} catch (IOException e) {
	System.err.println(e.getMessage());
	
}

	}

}
