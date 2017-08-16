
public class EnumDemo {

	public static void main(String[] args) {

		 A obj = new A();
		 obj.setGender(GENDER.MALE);
		 obj.setMonth(Months.Feb);
	}

}

class A{
	
	public void setGender(GENDER gender){
	}
	public void setMonth(Months month){
	}
}

enum GENDER{
	MALE,FEMALE
}

enum Months{
	Jan,Feb,Mar,Apr
}