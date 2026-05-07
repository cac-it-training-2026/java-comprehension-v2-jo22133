package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		//TODO ここから実装する

		Member mem = new Member();
		mem.setName("Miura Manabu");
		mem.setAge(30);
		mem.setRank(1);

		mem.showMember();

		mem.rankUp();
		mem.getRank();

	}
}
