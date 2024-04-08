package utils;

/**
 *
 * @author enric
 */
public class MyUtils {
    public static String inverteix (String cadena)
{
    String resultat="";
    for (int i = cadena.length() - 1; i >= 0; i--) {
        resultat += cadena.charAt(i);
    }
    return resultat;    
}
/**
 *
 * @param day int dia del naixement
 * @param month int  mes del naixement
 * @param year int any del naixement
 * @return edat de la persona, per edat>150 retorna -1, per dates impossibles retorna -2
 *
 */
public static int edat (int day, int month, int year){
    int anys = year - 2023;
    if (anys > 150 && anys >= 0) {
        int resultat=-1;
        return resultat;
    } else{
        int resultat=-2;
        return resultat;
    }   
}
/**
 *
 * @param numero número del que es calcula el factorial
 * @return retorna el factorial d'un número. Si el nombre es negatiu retorna -1.
 */
public static double factorial (double numero) {
 
if (numero<0){
return -1;
} 
else{
    double resultat = numero * factorial(numero-1);
    return resultat;
}
}
}


