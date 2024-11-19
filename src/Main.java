import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Titulo
        System.out.println("========================================");
        System.out.println("       PROGRAMA SORTEO DE EQUIPOS       ");
        System.out.println("========================================");

        // Ingreso de Datos
        System.out.println("1.- Octavos");
        System.out.println("2.- Cuartos");
        System.out.println("3.- Semifinales");
        System.out.print("Seleccione una opcion entre [1-3]: ");
        String opcion = scanner.nextLine().toLowerCase();

        //Utilizamos un Switch para poder seleccionar los equipos
        int numEquipos = 0;
        switch (opcion) {
            case "1":
                System.out.println("========================================");
                System.out.println("            OCTAVOS DE FINALES          ");
                System.out.println("========================================");
                numEquipos = 16;  // 16 equipos para octavos
                break;
            case "2":
                System.out.println("========================================");
                System.out.println("            CUARTOS DE FINALES          ");
                System.out.println("========================================");
                numEquipos = 8;   // 8 equipos para cuartos
                break;
            case "3":
                System.out.println("========================================");
                System.out.println("                SEMIFINALES             ");
                System.out.println("========================================");
                numEquipos = 4;   // 4 equipos para semifinales
                break;
            default:
                System.out.println("Etapa no válida.");
                return;
        }

        // INGRESO DE DATOS DE LOS EQUIPOS
        String[] equipos = new String[numEquipos];
        for (int i = 0; i < numEquipos; i++) {
            System.out.print("INGRESE NOMBRE DEL EQUIPO [" + (i + 1) + "]: ");
            equipos[i] = scanner.nextLine();
        }

        // LLAMADA DEL METODO (SORTEO DE QUIPOS PARA LA ETAPA SELECCIONADA)
        Sorteo.sorteoEquipos(equipos, 0);

        scanner.close();
    }
}
