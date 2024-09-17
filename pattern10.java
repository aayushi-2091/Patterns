public class pattern10 {
    public static void main(String[] args) {
        int n=4, k=3,l=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(k+" ");
            }
            k++;
            System.out.println();
        }
        for(int i=n;i>1;i--){
            for(int j=1;j<i;j++){
                System.out.print(l+" ");
            }
            l--;
            System.out.println();
        }
    }
}
