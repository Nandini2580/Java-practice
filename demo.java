class calculator{
    public int add(int num1,int num2){
        return num1+num2;
    }
    public double add(double num1,int num2,int num3){
        return num1+num2+num3;
    }
}

public class demo{
    public static void main(String a[]){
        calculator calc=new calculator();
        //int r=calc.add(2,3);
        System.out.println(calc.add(2.3426789,3,5));


    }
}