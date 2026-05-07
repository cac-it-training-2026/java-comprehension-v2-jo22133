package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {

	public static void main(String[] args) {

		LoginService loginService = new LoginService(new MemberStorage());
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;
		//TODO ここから実装する

		ConsoleReader cr = new ConsoleReader();

		MemberStorage ms = new MemberStorage();

		LoginService ls = new LoginService(ms);

		Member login = null;

		while (login == null) {
			try {

				System.out.print("input id>>");
				int id = cr.inputNumber();

				System.out.print("input password>>");
				String pass = cr.inputString();

				login = ls.doLogin(id, pass);

				if (login == null) {

					System.out.println(
							"IDまたはパスワードが違っています。再度入力してください。");
				} else {

					System.out.println("ログインに成功しました。");
				}

			} catch (NullPointerException e) {

				System.out.println("不正は入力です。");
				continue;

			} catch (IOException e) {

				e.printStackTrace();
				return;

			}

		}

		System.out.println("ログインに成功しました。");
		login.showMember();

	}

}
