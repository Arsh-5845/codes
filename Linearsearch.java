public class Linearsearch {
    public static void main(String[] args) {
        int[] A={32,33,44,56,596,23,334};
        int index =0;
        int search=12;
        for(int i=0; i<A.length;i++){
            if(A[i]==search){
                index =i;
                break;
            }
        }
       System.out.println(index);

        }
        
    }

