import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controlador controlador;
        String type = "";

        while (!type.equals("3")) {
            System.out.print(
                    "Ingrese que tipo de Heap quiere hacer.-- o ponga 3 si desea salir: 

            
            type = scanner.nextLine();
            if (type.equals("1") || type.equals("2")) {
                controlador = new Controlador(Integer.valueOf(type));
                System.out.println(controlador.recorrer());
            }

        }

    }

}
