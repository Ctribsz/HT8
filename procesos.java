public class procesos implements Comparable<procesos> {
    private String name;
    private String prioridad;

    public void setName(String n) {
        name = n;
    }

    public void setPrioridad(String p) {
        prioridad = p;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(procesos o) {
        if (prioridad.compareTo(o.prioridad) > 0)
            return 1;
        else
            return -1;
    }
}