package weber_tp5;

public class PruebaArreglo {

    public static void main(String[] args) {
        
        //-------------A------------//
        int lista[]={1,2,3,4,5};
        
        Arreglo.sumarLista(lista);
        
        //-------------B------------//
        int listaBI[][]={{1,2,3,4},{56},{7,8,9},{10,11,12,13,14,15,16}};
        
        Arreglo.buscarMayor(listaBI);
        
        //-------------C-------------//
        String string="esto es una frase de prueba con 17 vocales y 6 letras s";
        
        Arreglo.cuentaVocales(string);
        
        //-------------D-------------//
        Arreglo.cuentaCaracter(string, 's');
    }
}