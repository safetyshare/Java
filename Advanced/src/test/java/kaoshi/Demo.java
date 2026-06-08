package kaoshi;

public class Demo {
    public static void main(String[] args){
        Outer.Inner obj=new Outer().new Inner();
        obj.show();
    }
}
class Outer{
    public int number=10;
    class Inner{
        public int number=20;
        public void show(){
            int number=30;
            System.out.print(number);
            System.out.print(new Inner().number);
            System.out.print(new Outer().number);
            }
        }
    }
