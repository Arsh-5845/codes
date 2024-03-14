

public class Box {
    String container;
    Box(String container){
        this.container=container;
    }
    public String getContainer(){
        System.out.println();
        return container;

    }
}
class Main{
    public static void main(String[] args) {
        Box box1=new Box("Bhupendra jogi");
        System.out.println(box1.getContainer());
    }
}
