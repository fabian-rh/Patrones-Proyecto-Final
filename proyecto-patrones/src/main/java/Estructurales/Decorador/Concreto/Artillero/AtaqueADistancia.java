package Estructurales.Decorador_Concreto.Artillero;

import Estructurales.Decorador.ObjetoDecorado;
import Estructurales.Decorador.Componente.Tropa;

public class AtaqueADistancia extends ObjetoDecorado {

    public AtaqueADistancia(Tropa tropa){
        this.cTropa = tropa;
    }

    @Override
    public String getTipo() {
        return "Artillero con rango de 2 casillas por 1 turno";
    }

    @Override
    public int getMovimiento() {
        return this.cTropa.getMovimiento();
    }

    @Override
    public int getVida() {
        return this.cTropa.getVida();
    }

    @Override
    public int getAtaque() {
        return this.cTropa.getAtaque();
    }

    @Override
    public int getDefensa() {
        return this.cTropa.getDefensa();
    }

    @Override
    public int getRangoDeAtaque() {
        return this.cTropa.getRangoDeAtaque() + 1;
    }
}
