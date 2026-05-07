package q01_basic.question01;

/**
 * question01出力例
 * 詳細は問題ドキュメントを参照すること

---SHOW DATA---
***MEMBER DATA***
name:Miura Manabu
age:24
rank:1
*****************
***MEMBER DATA***
name:Sato Kensuke
age:36
rank:2
*****************

 * 
 */
public class SystemMain01 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member mem = new Member();

		Member mem1 = new Member();
		mem.name = "Miura Mnabu";
		mem.age = 24;
		mem.rank = 1;

		mem.showMember();

		mem1.name = "Sato Kensuke";
		mem1.age = 36;
		mem1.rank = 2;
		mem1.showMember();

	}

}
