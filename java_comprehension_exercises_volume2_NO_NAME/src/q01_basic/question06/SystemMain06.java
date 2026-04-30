package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) throws IOException {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");
		//TODO ここから実装する

		try {
			System.out.print("input id>>");
			inputId = cr.inputNumber();

		} catch (NumberFormatException e) {

			System.out.println("error! ");
			System.out.println("java.lang.NumberFormatException: For input string: \"" + inputId + "\" \n");
			System.out.println(
					" at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67) \n");
			System.out.println(" at java.base/java.lang.Integer.parseInt(Integer.java:668) \n");
			System.out.println(" at java.base/java.lang.Integer.parseInt(Integer.java:786) \n");
			System.out.println(" at q01_basic.question06.ConsoleReader.inputNumber(ConsoleReader.java:34) \n");
			System.out.println(" at q01_basic.question06.SystemMain06.main(SystemMain06.java:45) ");
			return;
		}

		try {
			System.out.print("input password>>");
			inputPassword = cr.inputString();

		} catch (Exception e) {

		}

		Member mem = new Member(inputId, inputPassword, name, age, rank);

		mem.showMember();

	}

}
