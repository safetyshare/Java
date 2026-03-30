public class example2 {
    public static void main(String[] args) {
        //标识符，基本数据类型。
        //byte wt=300;//注意该类型能表示的数的范围
        byte bt=1;//注意该类型能表示的数的范围
        short st=2;int it=3;long lt=4;
        float ft=3.56f;double dt=6.78;//2.3：double类型的数，2.3f：float类型的数
        //字符型变量
        char c1='a',c2='中';//char型变量占两个字节
        boolean b1=true,b2=false;
        int x1=013;
        int x2=13;
        int x3=0x13;
        x3=0x1b;
        System.out.println("x1的值为"+x1+"，x2的值为"+x2+"，x3的值为"+x3);
        //'\t' '\n'
        System.out.println("Hello\tWorld\n你好");//\t制表符  跳转的下一个输出去，一个输出区域有八个字符
        System.out.println("D:\\JavaExample\\D0306");
        System.out.println("I say \"hello\"");
        System.out.println(x1+x2);
        }
}
