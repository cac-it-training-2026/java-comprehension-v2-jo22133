package q01_basic.question05;

public class MemberManager {

	/**
	 * 
	 */
	private MemberManager() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void showAllMember(AbstMember[] mem) {
		for (AbstMember member : mem) {
			showAllMember(member);
		}
	}

}
