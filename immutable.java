public class immutable {
    
    public static void main(String[] args) {
        String name="nandini";
        char[] arr=name.toCharArray();
        arr[0]='m';
        name=new String(arr);
        System.out.println(name);
        //we have StringBuffer and StringBuilder which are mutable 
        StringBuffer sb=new StringBuffer("nandini");
        System.out.println(sb);
    }
}
