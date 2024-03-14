public class starpatttern {
    public static void main(String[] args) {
        int row=5;
        for(int i=0;i<=row;i++){
            for(int j=0;j<=5;j++){
                if (i==3) {
                    continue;
                }
                System.out.print("* ");
                if(i==3){
                    continue;
                }
            }
            System.out.println();
        }

    }
}
