public class Rot13 {
    public static  final String ALFABET = "aàáäbçcdeèéëfghiíïjklmnñoòóöpqrstuùúüvwxyz";    

    public static final char[] minuscules = ALFABET.toCharArray();
    public static final char[] majuscules = ALFABET.toUpperCase().toCharArray();

    public static String xifraRot13 (String cadena) {
        String resultat = "";
        int novaPos = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (Character.isUpperCase(c)) {
                
                for (int j = 0; j < majuscules.length; j++) {
                    
                    if (c == majuscules[j]){
                        novaPos = (j+13) % majuscules.length;
                        c = majuscules[novaPos];                        
                        resultat += c;
                        break;
                    }
                }
            } else if (Character.isLowerCase(c)) {
                for (int k = 0; k < minuscules.length; k++) {
                    if (c == minuscules[k]){
                        novaPos = (k+13) % minuscules.length;
                        c = minuscules[novaPos];               
                        resultat += c;
                        break;
                    }
                }
            } else {
                resultat += c;
            }
        }
        return resultat;
    }

    public static String desxifraRot13 (String cadena) {
        String resultat = "";
        int novaPos = 0;
        

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isUpperCase(c)) {
                for (int j = 0; j < majuscules.length; j++) {
                    if (c == majuscules[j]) {
                        novaPos = (j - 13 + majuscules.length) % majuscules.length; 
                        c = majuscules[novaPos];
                        resultat += c;
                        break;
                    }
                }
            } else if (Character.isLowerCase(c)) {
                for (int k = 0; k < minuscules.length; k++) {
                    if (c == minuscules[k]) {
                        novaPos = (k - 13 + minuscules.length) % minuscules.length; 
                        c = minuscules[novaPos];
                        resultat += c;
                        break;
                    }
                }
            } else {
                resultat += c;
            }

        }
        return resultat;
    }

    public static void main(String[] args) {
        
        String msgs[] = {"ABC", "XYZ", "Hola, Mr.Calçot", "Perdó, per tu què és?"};
        String msgsXifrats[] = new String[msgs.length];
       
        System.out.println("\nXifrat\n------");

        for (int i = 0; i<msgs.length; i++) {
            msgsXifrats[i] = xifraRot13(msgs[i]);
            System.out.printf("%-23s => %s%n", msgs[i], msgsXifrats[i]);
        }
   
        System.out.println("\nDesxifrat\n------");

        for (String msg: msgsXifrats) {
            System.out.printf("%-23s => %s%n", msg, desxifraRot13(msg));
        }
        
    }
}