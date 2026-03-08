//运算符
public class Example3{
	public static void main(String[] args){
		//+
		System.out.println(3 + 5);//8
		System.out.println("hello" + 5);//hello5
		System.out.println("hello" + 3 + 5);//hello35
		System.out.println(5/2);//2
		System.out.println(5.0/2);//2.5
		//%:两个整数可以求余，浮点数也可以进行求余运算
		System.out.println(5%2);//1
		System.out.println(5.2%2);//1.2
		
		int x, y, z;
		x = 5;
		y = 7;
		z = (x++) + y;
		System.out.println("x:" + x + "\tz:" + z);//x:6 	z:12
		x = 5;
		z = (++x) + y;
		System.out.println("x:" + x + "\tz:" + z);//x:6		z:13
		x = 5;
		z = -x++;//z:-5   x:6
		System.out.println("z:" + z + "\tx:" + x);
		//关系运算符
		x = 4;
		y = 6;
		z = 4;
		Boolean b;
		b = x > y;
		System.out.println(b);//false
		System.out.println(x <= y);//true
		System.out.println(x == y);
		System.out.println(x != y);
		System.out.println(x == z);
		
	}
}