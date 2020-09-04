package check;

import constants.Constants;

public class Check {

	private String firstName = "表";
	private String lastName = "達也";

	public static void main(String[] args) {

		Check  name = new Check();
		name.printName();

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		RobotPet robo = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE );
		robo.introduce();

	}

	private void printName() {
		System.out.println("printNameメソッド  ➡  ︎" + firstName + lastName);
	}

}
