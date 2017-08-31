
import static java.lang.System.out;
import static java.lang.Math.PI;
import static java.lang.Math.E;

import static com.test.B.x;
import static com.test.B.y;

public class StaticImportsDemo {

	public static void main(String[] args) {

		out.println("Date 1");
		out.println("Date 1");
		out.println("Date 1");
		out.println("Date 1");

		out.println(Math.floor(123.6));// 124
		out.println(Math.ceil(123.4));// 123
		out.println(PI);
		out.println(E);

		out.println(x);
		out.println(y);
	}

}
