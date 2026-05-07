package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する

		ConsoleReader cr = new ConsoleReader();

		Member m1 = Member.getInstance(1, "PassWord", "Miura Manabu", 28, 2);

		Member m2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		List<Member> members = new ArrayList<Member>();

		members.add(m1);
		members.add(m2);

		//		MemberManager mm = new MemberManager();
		//
		//		mm.showAllMembers(members);

		MemberManager.showAllMembers(members);

		int targetId;
		String newPassword;

		try {

			// 会員ID入力
			System.out.print("会員IDを入力してください：");

			targetId = cr.inputNumber();

			// 新パスワード入力
			System.out.print("新しいパスワードを入力してください：");

			newPassword = cr.inputString();

		} catch (IOException e) {

			e.printStackTrace();

			return;

		} catch (NumberFormatException e) {

			e.printStackTrace();

			return;
		}

		// パスワード変更
		MemberManager.updatePassword(
				members,
				targetId,
				newPassword);

		// 更新後表示

		MemberManager.showAllMembers(members);
	}

}
