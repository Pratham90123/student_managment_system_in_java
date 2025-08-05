public class student {
    
    int rollno;
    String name;
    int age;
    String course;


    public student(int rollno,String name,int age,String course)
    {
        this.rollno = rollno;
        this.name=name;
        this.age=age;
        this.course=course;
    }
    public void display(){
        System.out.println("rollno"rollno,"Name",name,"Age",age,"course",course);
    }
}
