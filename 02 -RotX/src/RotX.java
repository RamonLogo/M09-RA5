public class RotX {
    public static  final String ALFABET = "aàáäbçcdeèéëfghiíïjklmnñoòóöpqrstuùúüvwxyz";    

    public static final char[] minuscules = ALFABET.toCharArray();
    public static final char[] majuscules = ALFABET.toUpperCase().toCharArray();

    public static String xifraRotX (String cadena, int desplacament) {
        // resultado
        String resultat = "";
        int novaPos = 0;
    // recorrer cadena
        for (int i = 0; i < cadena.length(); i++) {
        // coger carácter
        char c = cadena.charAt(i);
        // ¿mayúscula?
            if (Character.isUpperCase(c)){
               for (int j = 0; j < majuscules.length;j++) {
                    if (c == majuscules[j]) {
                        novaPos = (j+13) /majuscules.length;
                    }
               } 
          // ¿minúscula?  
            } else if (Character.isLowerCase(c)){
                for (int k = 0; k < minuscules.length; k++) {

                }
            // ¿otro carácter?
            } else {

            }
                   
        }
        

        
    
    // devolver resultado
        return resultat;
    }

    public static String desxifraRotX (String cadena, int desplacament) {
        
    }

    public static void main(String[] args) {
        
        String msgs[] = {"ABC", "XYZ", "Hola, Mr.Calçot", "Perdó, per tu què és?"};
        String msgsXifrats[] = new String[msgs.length];
       
        System.out.println("\nXifrat\n------");

        for (int i = 0; i<msgs.length; i++) {
            msgsXifrats[i] = xifraRotX(msgs[i]);
            System.out.printf("%-23s => %s%n", msgs[i], msgsXifrats[i]);
        }
   
        System.out.println("\nDesxifrat\n------");

        for (String msg: msgsXifrats) {
            System.out.printf("%-23s => %s%n", msg, desxifraRotX(msg));
        }
        
    }
}