package q02_advanced.question01;

import java.util.ArrayList;
import java.util.List;

public class Member extends Coupon {

	private int id;
	private String passwordString;
	private String name;
	private int age;
	private int rank;

	/**
	 * 
	 */
	public Member() {
	}

	/**
	* @param id
	* @param passwordString
	* @param name
	* @param age
	* @param rank
	*/
	public Member(int id, String passwordString, String name, int age, int rank) {
		this.id = id;
		this.passwordString = passwordString;
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPasswordString() {
		return passwordString;
	}

	public void setPasswordString(String passwordString) {
		this.passwordString = passwordString;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	Coupon cp = new Coupon(1, 0.5, "s最初の特典");

	Coupon cp2 = new Coupon(2, 0.25, "今月の特典");

	List<Coupon> cparr = new ArrayList<>();

}
