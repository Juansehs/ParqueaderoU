import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

public class Parqueadero {

    private String nombre;
    private HashMap<String,Registro> vehiculos;
    private int cantidadEspaciosTotal;
    private List<Registro> historialTotalVehiculos;
    private String[] parquins;


    public Parqueadero() {
    }
    public Parqueadero(String nombre, HashMap<String, Registro> vehiculos, int cantidadEspaciosTotal, List<Registro> historialTotalVehiculos,String[] parquins) {
        this.nombre = nombre;
        this.vehiculos = vehiculos;
        this.cantidadEspaciosTotal = cantidadEspaciosTotal;
        this.historialTotalVehiculos = historialTotalVehiculos;
        this.parquins = parquins;
    }
    public String[] getParquins(){ return parquins; }
    public void setParquins(String[] parquins){ this.parquins = parquins; }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<String, Registro> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(HashMap<String, Registro> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getCantidadEspaciosTotal() {
        return cantidadEspaciosTotal;
    }

    public void setCantidadEspaciosTotal(int cantidadEspaciosTotal) {
        this.cantidadEspaciosTotal = cantidadEspaciosTotal;
    }

    public List<Registro> getHistorialTotalVehiculos() {
        return historialTotalVehiculos;
    }

    public void setHistorialTotalVehiculos(List<Registro> historialTotalVehiculos) {
        this.historialTotalVehiculos = historialTotalVehiculos;
    }

    @Override
    public String toString() {
        return "Parqueadero{" +
                "nombre='" + nombre + '\'' +
                ", vehiculos=" + vehiculos +
                ", cantidadEspaciosTotal=" + cantidadEspaciosTotal +
                ", historialTotalVehiculos=" + historialTotalVehiculos +
                '}';
    }

    public void mostrarHistorial(LocalDateTime fechaHoraInicioFiltro,LocalDateTime fechaHoraFinFiltro){

    }
    public void mostrarEspaciosLibres(){

    }
    public void mostrarVehiculosActivosParquedero(){

    }
    public void agregarRegistro(Registro registro){

    }
    public void cerrarRegistro(String Parquin){

    }
}