public class Third {
    static int a=10; //static
    void fun(){
        int b=10;  //local
        System.out.println(a+" "+b);
        a=a+1;
        b=b+1;
    }
    public static void main(String[] args){
        Third obj= new Third();
        obj.fun();
        obj.fun();

    }
    
}
