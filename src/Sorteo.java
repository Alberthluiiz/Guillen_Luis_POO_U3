import java.util.ArrayList;
import java.util.Collections;

public class Sorteo {

    // METODO RECURSIVO PARA REALIZAR EL SORTEO
    public static void sorteoEquipos(String[] equipos, int index) {
        if (index >= equipos.length - 1) {
            return;
        }

        // MEZCLA ALEATORIA DE LOS EQUIPOS, UTILIZAMOS
        // COLLECTIONS.SHUFFLE Y EL ARREGLO QUE CREAMOS PARA PODER
        // REALIZAR UNA MEZCLA ALEATORIA DE LOS EQUIPOS
        ArrayList<String> equiposList = new ArrayList<>();
        for (String equipo : equipos) {
            equiposList.add(equipo);
        }
        Collections.shuffle(equiposList);

        // MOSTRAMOS LOS NOMBRES DEL EMPAREJAMIENTO
        System.out.println("\nSorteo de " + (equipos.length / 2) + " partidos:");
        for (int i = 0; i < equiposList.size(); i += 2) {
            System.out.println(equiposList.get(i) + " vs " + equiposList.get(i + 1));
        }

        // HACEMOS LA LLAMADA A LA RECURSIVIDAD PARA LA SIGUIENTE
        //RONDA DONDE SE REDUCE LOS EQUIPOS A LA MITAD
        String[] equiposSiguientes = new String[equiposList.size() / 2];
        for (int i = 0; i < equiposSiguientes.length; i++) {
            equiposSiguientes[i] = equiposList.get(i * 2);
            // SOLO VAMOS A TOMAR EL PRIMERO EQUIPO DE CADA PAR
        }
        sorteoEquipos(equiposSiguientes, index + 1);
    }
}
