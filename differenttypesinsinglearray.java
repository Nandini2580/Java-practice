class student{
    int rollno;
    String name;

}

public class differenttypesinsinglearray {
    public static void main(String[] args) {
        student s1=new student();
        s1.rollno=32;
        s1.name="nandini";
        student s2=new student();
        s2.rollno=33;
        s2.name="rama";

        student students[]=new student[2];
        students[0]=s1;
        students[1]=s2;
        //for(int i=0;i<students.length;i++){
            //System.out.println(students[i].name + ":" + students[i].rollno);
        //}
        //Enhanced for loop
        for(student stud:students){
            System.out.println(stud.name+":"+stud.rollno);
        }

    }
    
}
