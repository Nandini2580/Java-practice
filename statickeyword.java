class mobile{
    int version;
    static String name;
    public void show(){
        System.out.println(name+":"+version);
    }

}
public class statickeyword {
public static void main(String[] args) {
    mobile obj=new mobile();
    obj.version=65;
    mobile.name="smart phone";//can assign with class name as it is a static 
    mobile obj2=new mobile();
    obj2.version=85;
    mobile.name="phone";
    obj.show();
    obj2.show();



        
    }
    
}
