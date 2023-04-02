
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Controlador {
    private VectorHeap v1;
    private PriorityQueue<procesos> v2;
    private ArrayList<procesos> l;

    public Controlador(int n) {

        l = importText();
        if (n == 1) {
            v1 = new VectorHeap(l);
        }
        if (n == 2) {
            v2 = new PriorityQueue<>();
            for (procesos l1 : l) {
                v2.add(l1);
            }
        }
    }

    public String recorrer() {
        String mensaje = "";
        if (v1 == null) {
            for (procesos l1 : l) {
                procesos temp = v2.remove();
                mensaje += temp.getName() + ", " + temp.getPrioridad() + "\n";
            }
        } else {
            for (procesos l1 : l) {
                procesos temp = v1.remove();
                mensaje += temp.getName() + ", " + temp.getPrioridad() + "\n";
            }
        }
        return mensaje;
    }

    public ArrayList<procesos> importText() {
        File inputStream = null;
        ArrayList<procesos> lista = new ArrayList<procesos>();
        String everything = "";
        try {
            inputStream = new File("procesos.txt");
            Scanner myReader = new Scanner(inputStream);
            while (myReader.hasNextLine()) {
                everything = myReader.nextLine();
                String[] l = everything.split(",");
                procesos p = new procesos();
                p.setName(l[0] + "," + l[1]);
                p.setPrioridad(l[2]);
                lista.add(p);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
            System.exit(0);
        } catch (Exception ex) {
            System.out.println("Error en la lectura del archivo.");
            System.exit(0);
        }
        return lista;
    }
}
