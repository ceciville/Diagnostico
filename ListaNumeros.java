import java.util.ArrayList;
import java.util.List;

public class ListaNumeros {
    //atributo: una lista
    public List<Integer> elementos;
    
    //constructor (es necesario?)
    public ListaNumeros(List<Integer> elementos) {
        this.elementos = elementos;
        }

    //método CONTADOR DE IMPARES
    public static int contadorImpares(List<Integer> elementos) {
        int contador = 0;
        for (int e : elementos) {
            if (e % 2 != 0) {
                contador++;
            }
        }
        return contador;
}
//método MUESTRA NUM CONSECUTIVOS

public static List<Integer> numerosConsecutivos(List<Integer> elementos) {
    List<Integer> numConsecutivos = new ArrayList<>();
    for (int i = 0; i < elementos.size() - 1; i++) {
        if (elementos.get(i) + 1 == elementos.get(i + 1)) {
            numConsecutivos.add(elementos.get(i));
            numConsecutivos.add(elementos.get(i + 1));

// esta condición la puse por si hay más de dos números consecutivos
    if (numConsecutivos.isEmpty()){
        System.out.println("No hay números consecutivos.");

    }
    for (int j = 0; j < numConsecutivos.size() - 1; j++) {
        if (numConsecutivos.get(j) == numConsecutivos.get( j + 1)) {
            numConsecutivos.remove(j);
            }
        
        }

    }
    
    }
    return numConsecutivos;
}
 
    public static void main(String[] args) throws Exception {
        List<Integer> miLista = new ArrayList<>();
        miLista.add(27);
        miLista.add(6);
        miLista.add(14);
        miLista.add(8);
        miLista.add(9);
        miLista.add(12);
        miLista.add(13);
        miLista.add(22);


        int cantidad = ListaNumeros.contadorImpares(miLista);

        System.out.println( "Cantidad de números impares: " + cantidad ); 
        // Salida: Cantidad de núemeros impares: 3

        List<Integer> numConsecutivos = ListaNumeros.numerosConsecutivos(miLista);
        System.out.println("Números consecutivos de la lista: " + numConsecutivos);
        //Salida: Números consecutivos de la lista: [8, 9, 12, 13]
    } 
}

            
        

 