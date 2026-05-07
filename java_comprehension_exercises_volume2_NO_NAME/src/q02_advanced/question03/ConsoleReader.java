package q02_advanced.question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public String inputString() throws IOException {

		String str = reader.readLine();

		return str;

	}

	public int inputNumber() throws IOException {

		String str = reader.readLine();
		int num = Integer.parseInt(str);

		return num;
	}

}
