package Estructurales.Decorador_Concreto.Artillero;

import Estructurales.Decorador.Componente.Tropa;
import Estructurales.Decorador.ObjetoDecorado;

public class DobleAtaque extends ObjetoDecorado {
    public DobleAtaque(Tropa tropa){
        this.cTropa = tropa;
    }

    @Override
    public String getTipo() {
        return "Artillero con doble ataque";
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
        return this.cTropa.getAtaque() * 2;
    }

    @Override
    public int getDefensa() {
        return this.cTropa.getDefensa();
    }

    @Override
    public int getRangoDeAtaque() {
        return this.cTropa.getRangoDeAtaque();
    }
}
