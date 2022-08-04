package Creacionales.Fabrica_Abstracta.FabricaAbstracta.Prototipo.Proto_Colores;

public abstract class Proto_Colores {
    String descripcion;
    String color;

    public Proto_Colores(String descripcion, String color) {
        this.descripcion = descripcion;
        this.color = color;
    }

    public Proto_Colores() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Proto_Colores{" +
                "descripcion='" + descripcion + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
