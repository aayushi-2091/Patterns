public class pattern9{
    public static void main(String[] args) {
        int n=4,k=2,l=11;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(l);
                l--;
            }
            System.out.println();
        }
    }
}