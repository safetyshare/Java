package kaoshi;

public class test1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.outputInformation("a",5,'M');
    }
}
class Student{
    String name;
    char sex;
    int ages;
    public void outputInformation(String inputName,int inputAge,char inputSex){
        name=inputName;
        ages=inputAge;
        sex=inputSex;
        System.out.println("Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", ages=" + ages +
                '}');
    }
}