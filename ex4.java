public class ex4 {
    // nao esta funcionando :(
      public static void main(String[] args) {
        String palavra = "Adoro";
        int len = palavra.length();
        String result = inverte(palavra, len);
        System.out.println(result);
      }
    public static String inverte (String palavra, int len) {
        int cont = len/2;
        if(cont == len){
            return palavra;
        }
        else {
          return palavra.replace(palavra.charAt(len-(len-1)), palavra.charAt(len-1));
        }
    }
}
