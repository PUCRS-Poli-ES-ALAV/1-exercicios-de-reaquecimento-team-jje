public class ex2 {
      public static void main(String[] args) {
        int incrementador = 3;
        int incrementado = 2;
        int result = inc(incrementador,incrementado);
        System.out.println("A soma de " + incrementador + " com " + incrementado + " resulta em " + result);
      }
    public static int inc (int incrementador, int incrementado) {
        if(incrementador == 0){
            return incrementado;
        }
        else {
            return 1 + inc(incrementador-1,incrementado);
        }
    }
}
