package q01_basic.question05;

public class MemberManager extends AbstMember {

	/**
	 * 
	 */
	private MemberManager() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void showAllMember(AbstMember[] mem) {
		for (AbstMember m : mem) {
			m.showMember();
		}

	}

	@Override
	public void buyItem() {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void showMember() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
