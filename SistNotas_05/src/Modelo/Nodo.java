package Modelo;

public class Nodo {

    public int id, creditos;
    public String nombre, apellido;
    public Nodo siguiente;

    public Nodo(int id, int creditos, String nombre, String apellido) {
        this.id = id;
        this.creditos = creditos;
        this.nombre = nombre;
        this.apellido = apellido;
        this.siguiente = null;
    }

    public Nodo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
