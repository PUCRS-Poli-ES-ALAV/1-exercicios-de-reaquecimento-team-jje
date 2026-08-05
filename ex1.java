public class ex1 {
      public static void main(String[] args) {
        int multiplicador = 6;
        int multiplicado = 5;
        int result = mult(multiplicador,multiplicado);
        System.out.println("A multiplicacao de " + multiplicador + " com " + multiplicado + " resulta em " + result);
      }
    public static int mult (int multiplicador, int multiplicado) {
        if(multiplicador == 1){
            return multiplicado;
        }
        else {
            return multiplicado + mult(multiplicador-1,multiplicado);
        }
    }
}