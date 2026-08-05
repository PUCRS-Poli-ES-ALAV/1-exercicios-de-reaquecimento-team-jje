public class ex3 {
      public static void main(String[] args) {
        float n = 3;
        float result = somaMeio(n);
        System.out.println(result);
      }
    public static float somaMeio (float n) {
        if(n == 1){
            return 1;
        }
        else {
            return 1/n + somaMeio(n-1);
            
        }
    }
}
