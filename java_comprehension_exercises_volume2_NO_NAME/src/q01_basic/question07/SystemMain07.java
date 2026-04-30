package q01_basic.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain07 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		ConsoleReader cr = new ConsoleReader();

		NumberList numberList = new NumberList();
		System.out.println("1-任意の整数をListに代入します");
		System.out.print("input number>>");
		int limit = 0;
		try {
			String str = reader.readLine();

			limit = Integer.parseInt(str);

			cr.inputNumber(limit);
			//TODO ここから実装する
		} catch (Exception e) {

			e.printStackTrace();

		}
		NumberList nl = new NumberList();
		nl.addFromOneTo(limit);

		System.out.println(nl.getNumbers());

		System.out.println("****************");
		System.out.println("Listの合計を計算します");
		int sum = 0;
		//TODO ここから実装する

		sum = nl.calcSumOfList();
		System.out.println("1から" + limit + "までの合計は" + sum + "です。");

		System.out.println("****************");
		System.out.println("Listの各要素を2倍します");
		//TODO ここから実装する
		nl.doubleListEachValue();

		System.out.println(nl.getNumbers());

		System.out.println("****************");
		System.out.println("Listの前半分のインデックスの要素を削除します");
		//TODO ここから実装する
		nl.removeIndexOfFirstHalf();
		System.out.println(nl.getNumbers());

	}

}
