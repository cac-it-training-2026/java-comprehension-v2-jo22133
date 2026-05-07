package q02_advanced.question03;

import java.util.List;

public class MemberManager {

	private MemberManager() {

		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void showAllMembers(List<Member> mem) {

		for (Member memb : mem) {
			memb.showMember();
		}

	}

	public static void updatePassword(List<Member> mem, int targetid, String newPassword) {

		boolean flag = false;

		for (Member memb : mem) {
			if (memb.getId() == targetid) {
				memb.setPassword(newPassword);
				flag = true;

				break;

			}
		}
		if (!flag) {

			System.out.println("該当者はいませんでした。");
		}

	}

}
