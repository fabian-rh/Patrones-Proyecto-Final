package Creacionales.Fabrica_Abstracta.FabricaAbstracta.Prototipo.Proto_I_Prototipo;

import Creacionales.Fabrica_Abstracta.FabricaAbstracta.Prototipo.Proto_Colores.Proto_Colores;

public abstract class Proto_Casilla {

    private boolean disponible;
    private boolean limiteDerecha; // Esta en la columna limite derecha
    private boolean limiteIzquierda;// Esta en la columna limite izquierda
    private boolean limiteArriba;// Esta en la columna limite de arriba
    private boolean limiteAbajo;// Esta en la columna limite de abajo
    private boolean jugador1; // La esta utilizando el jugador 1
    private boolean jugador2;// La esta utilizando el jugador 2
    private int id;
    private Proto_Colores colorCasilla;
    private String filaActual; // Almacena en que fila esta
    private String columnaActual; //Almacena en que columna esta

    //Metodos Abstractos
    public abstract Proto_Casilla clonar();

    public Proto_Casilla(boolean disponible, boolean limiteDerecha, boolean limiteIzquierda, boolean limiteArriba, boolean limiteAbajo, boolean jugador1, boolean jugador2, int id, Proto_Colores colorCasilla, String filaActual, String columnaActual) {
        this.disponible = disponible;
        this.limiteDerecha = limiteDerecha;
        this.limiteIzquierda = limiteIzquierda;
        this.limiteArriba = limiteArriba;
        this.limiteAbajo = limiteAbajo;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.id = id;
        this.colorCasilla = colorCasilla;
        this.filaActual = filaActual;
        this.columnaActual = columnaActual;
    }

    public Proto_Casilla() {
    }

    public Proto_Casilla(int id) {
        setId(id);
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isLimiteDerecha() {
        return limiteDerecha;
    }

    public void setLimiteDerecha(boolean limiteDerecha) {
        this.limiteDerecha = limiteDerecha;
    }

    public boolean isLimiteIzquierda() {
        return limiteIzquierda;
    }

    public void setLimiteIzquierda(boolean limiteIzquierda) {
        this.limiteIzquierda = limiteIzquierda;
    }

    public boolean isLimiteArriba() {
        return limiteArriba;
    }

    public void setLimiteArriba(boolean limiteArriba) {
        this.limiteArriba = limiteArriba;
    }

    public boolean isLimiteAbajo() {
        return limiteAbajo;
    }

    public void setLimiteAbajo(boolean limiteAbajo) {
        this.limiteAbajo = limiteAbajo;
    }

    public boolean isJugador1() {
        return jugador1;
    }

    public void setJugador1(boolean jugador1) {
        this.jugador1 = jugador1;
    }

    public boolean isJugador2() {
        return jugador2;
    }

    public void setJugador2(boolean jugador2) {
        this.jugador2 = jugador2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Proto_Colores getColorCasilla() {
        return colorCasilla;
    }

    public void setColorCasilla(Proto_Colores colorCasilla) {
        this.colorCasilla = colorCasilla;
    }

    public String getFilaActual() {
        return filaActual;
    }

    public void setFilaActual(String filaActual) {
        this.filaActual = filaActual;
    }

    public String getColumnaActual() {
        return columnaActual;
    }

    public void setColumnaActual(String columnaActual) {
        this.columnaActual = columnaActual;
    }

    @Override
    public String toString() {
        return "Proto_Casilla{" + " Tipo: "+this.getClass().getSimpleName()+ "\n"+
                "disponible=" + disponible +
                ", limiteDerecha=" + limiteDerecha +
                ", limiteIzquierda=" + limiteIzquierda +
                ", limiteArriba=" + limiteArriba +
                ", limiteAbajo=" + limiteAbajo +
                ", jugador1=" + jugador1 +
                ", jugador2=" + jugador2 +
                ", id=" + id +
                ", colorCasilla=" + colorCasilla +
                ", filaActual='" + filaActual + '\'' +
                ", columnaActual='" + columnaActual + '\'' +
                '}';
    }
}
