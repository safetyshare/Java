
public class Example2{
	public static void main(String[] args){
		//标识符，基本数据类型
		//定义四个不同类型的整型变量，并赋初值
		//byte bt = 300;//注意该类型能够表示的数的范围
		short st = 12;
		int it = 321;
		long lg = 1000;
		//定义两个不同类型的浮点型变量，并赋初值
		float ft = 2.3f;//2.3：double    2.3f:float
		double dl = 5.6;
		//字符型变量
		char c1 ='a', c2 = '中';//char型变量占2B，可以表示汉字
		//布尔型变量
		boolean b1 = true, b2 = false;
		//整型常量的表示形式
		int x1 = 013;//八进制
		int x2 = 13;//十进制
		int x3 = 0x1b;//十六进制
		//输出这三个变量的值
		System.out.println("x1:" + x1 + ", x2:" + x2 + ", x3:" + x3);
		// '\t' '\n'
		System.out.println("hello\tWorld!\n你好");
		//'\\','\"':输出一个路径：D:\JavaExample\D0306
		System.out.println("D:\\JavaExample\\D0306");
		//输出：I say, "hello!".
		System.out.println("I say, \"hello!\".");
	}
}