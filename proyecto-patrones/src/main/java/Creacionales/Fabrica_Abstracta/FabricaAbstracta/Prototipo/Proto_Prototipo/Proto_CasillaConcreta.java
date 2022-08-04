package Creacionales.Fabrica_Abstracta.FabricaAbstracta.Prototipo.Proto_Prototipo;

import Creacionales.Fabrica_Abstracta.FabricaAbstracta.Prototipo.Proto_I_Prototipo.Proto_Casilla;


public class Proto_CasillaConcreta extends Proto_Casilla {


    @Override
    public Proto_CasillaConcreta clonar() {
        Proto_CasillaConcreta c = new Proto_CasillaConcreta();
        c.setDisponible(this.isDisponible());
        c.setLimiteDerecha(this.isLimiteDerecha());
        c.setLimiteIzquierda(this.isLimiteIzquierda());
        c.setLimiteArriba(this.isLimiteArriba());
        c.setLimiteAbajo(this.isLimiteAbajo());
        setJugador1(this.isJugador1());
        setJugador2(this.isJugador2());
        setId(this.getId());
        setColorCasilla(this.getColorCasilla());
        setFilaActual(this.getFilaActual());
        setColumnaActual(this.getColumnaActual());
        return c;
    }
}
