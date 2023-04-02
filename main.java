
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controlador controlador;
        String type = "";

        while (!type.equals("3")) {
            System.out.print("Ingrese el tipo de Heap que quiere. 3 para salir.\n");
            System.out.println("1.VectorHeap");
            System.out.println("2.PriorityQueue");
            System.out.println("3.Salir");
            type = scanner.nextLine();
            if (type.equals("1") || type.equals("2")) {
                controlador = new Controlador(Integer.valueOf(type));
                System.out.println(controlador.recorrer());
            }

        }

    }

}
