package lecture02;

public class Human {

    String name;
    int age;

    Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void print(){

        if(this.age <= 18){
            System.out.print("生徒:");
        }else if(this.age <= 22){
            System.out.print("学生:");
        }
        System.out.println(this.name + " " + this.age + "歳です。");

    }

}
