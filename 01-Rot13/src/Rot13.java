public class Rot13 {
    
    public static String xifraRot13 (String cadena) {
        String resultat = "";
        
        for (int i = 0; i < cadena.length();i++) {
            char c = cadena.charAt(i);

            for (int j = 0; j < minuscules.length; j++) {
                if (c == minuscules[i]) {
                    c = (i + 13) % minuscules.length;
                    resultat += c;
                }
            }         
           for (int j = 0; j < majuscules.length; j++) {
                if (c == majuscules[i]) {
                    c = (i + 13) % majuscules.length;
                    resultat += c;
                }
            } 
            //resultat += c;  
        }

        return resultat;    
    }

    public static String desxifraRot13 (String cadena) {
        String resultat = "";

        return resultat;
    }
    
    public static  final String ALFABET = "aàáäbçcdeèéëfghiíïjklmnñoòóöpqrstuùúüvwxyz"; 
   

    public static final char[] minuscules = ALFABET.toCharArray();
    public static final char[] majuscules = ALFABET.toUpperCase().toCharArray();

    public static void main(String[] args) {  
       
        String msgs[] = {"ABC", "XYZ", "Hola, Mr.Calçot", "Perdó, per tu què és?"};
        String msgsXifrats[] = new String[msgs.length];
       
        System.out.println("\nXifrat\n------");

        for (int i = 0; i<msgs.length; i++) {
            msgsXifrats[i] = xifraRot13(msgs[i]);
            System.out.print("%-23s => %s%n", msgs[i], msgsXifrats[i]);
        }
   
        System.out.println("\nDesxifrat\n------");

        for (String msg: msgsXifrats) {
            System.out.print("%-23s => %s%n", msgs, DesxifratRot13(msg));
        }

    }
    
}