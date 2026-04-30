package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		//TODO ここから実装する

		members[0] = new NonMember("Sato Kensuke");

		Member mb = new Member(1, "PasswOrd", "Miura Manabu", 28, 2);

		members[1] = mb;

		MemberManager.showAllMember(members);

		mb.buyItem();

		NonMember nm = new NonMember("Sato Kensuke");
		nm.buyItem();

	}

}
