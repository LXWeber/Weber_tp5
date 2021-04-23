package entidades;

public class Arreglo {
    //-------------A------------//
    public static void sumarLista(int lista[]){
        int suma=0;
        float prom;
        for (int i=0;i<lista.length;i++){
            suma+=lista[i];
        }
        prom=suma/lista.length;
        System.out.println("La suma de los elementos de la lista recibida dan como resultado: "+suma+" y su promedio es: "+prom);   
    }
    //-------------B------------//
    public static void buscarMayor(int lista[][]){
        int mayor=0;
        for (int[] lista1 : lista) {
            for (int col = 0; col < lista1.length; col++) {
                if (mayor < lista1[col]) {
                    mayor = lista1[col];
                }
            }
        }
        System.out.println("El mayor valor de la lista ingresada es: "+mayor);
    }
    //-------------C------------//
    public static void cuentaVocales(String string){
        int vocales=0;
        char caracteres[]=string.toCharArray();
        for(int i=0;i<caracteres.length;i++){
            switch(caracteres[i]){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u': vocales++;
            }
        }
        System.out.println("La cantidad de vocales del String recibido es de: "+vocales);
    }
    //-------------D------------//
    public static void cuentaCaracter(String string, char caracter){
        int cant=0;
        char caracteres[]=string.toCharArray();
        for(int i=0;i<caracteres.length;i++){
            if(caracteres[i]==caracter){
                cant++;
            }
        }
        System.out.println("La cantidad de veces que aparece el caracter '"+caracter+"' es de: "+cant);
    }
}