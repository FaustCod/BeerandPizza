package org.example.beerandpizza;

public class Producto {
    //DECLARACIÓN DE VARIABLES
    private String nombre;
    private String descripcion;
    private int imagenID;
    private int precio ;

    //DECLARACIÓN DE ARREGLO CONSTANTE QUE CONTIENE PRODUCTOS DEL TIPO CERVEZAS
    public final static Producto cervezas[]={
            new Producto("Lager","Deliciosa Cerveza Rubia",R.drawable.lager,3),
            new Producto("Ambar", "Exquisita Cerveza Ambar",R.drawable.ambar,2),
            new Producto("Bock","Sabrosa Cerveza Negra",R.drawable.bock,3)
    };
    //DECLARACIÓN DE ARREGLO CONSTANTE QUE CONTIENE PRODUCTOS DEL TIPO PIZZAS
    public final static Producto pizzas[]={
            new Producto("Hawaiana","Contiene jamón, trozos de piña y extra queso. Tamaño Familiar",R.drawable.hawaiana,15),
            new Producto("Pollo BBQ","Contiene pollo, cebollas, salsa BBQ, queso cheddar, provolone y extra queso. Tamaño Familiar",R.drawable.pollo_bbq,17),
            new Producto("Americana","Contiene salsa de tomate extra, queso mozzarella, jamón, carne, salchicha italiana," +
                    "tocino, pepperoni y extra queso",R.drawable.americana,18)
    };


    public Producto() {
    }


    public Producto(String nombre, String descripcion, int imagenID, int precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagenID = imagenID;
        this.precio = precio;
    }

    //GETTERS Y SETTERS
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagenID() {
        return imagenID;
    }

    public void setImagenID(int imagenID) {
        this.imagenID = imagenID;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String toString() {
        return nombre;
    }

    public static Producto[] getCervezas() {
        return cervezas;
    }

    public static Producto[] getPizzas() {
        return pizzas;
    }
}
