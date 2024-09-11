public class right_tri_invert1{
    public static void main(String[] args) {
        int n=4, k=6;
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(k+" ");
            }
            k--;
            System.out.println();
        }
    }
}