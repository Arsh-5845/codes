public class Second
{
  int a=10;  //instance
  static int c=30; //static
 public static void main(String [] args){
    int b=20; //local
    System.out.println(b);
    System.out.println(Second.c);
    Second obj=new Second();
    System.out.println(obj.a);

 }
 
}