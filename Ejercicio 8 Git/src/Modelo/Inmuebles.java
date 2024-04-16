package Modelo;

public class Inmuebles {
    private String calle; 
    private String metrosCuadrados;
    private Integer precio;

    public Inmuebles(java.lang.String calle, java.lang.String metrosCuadrados, java.lang.Integer precio) {
        this.calle = calle;
        this.metrosCuadrados = metrosCuadrados;
        this.precio = precio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(String metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}
