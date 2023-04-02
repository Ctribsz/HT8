
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controlador controlador;
        String type = "";

        while (!type.equals("3")) {
            System.out.print(
                    "Ingrese el numero el tipo de Heap que quiere para analizar su arhivo de txt  en source llamado pacientes.txt o ponga 3 si desea salir: \n1.'VectorHeap'\n2.'PriorityQueue'\n3. Salir\n");
            type = scanner.nextLine();
            if (type.equals("1") || type.equals("2")) {
                controlador = new Controlador(Integer.valueOf(type));
                System.out.println(controlador.recorrer());
            }

        }

    }

}
