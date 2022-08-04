package Estructurales.Decorador_Concreto.Infanteria;

import Estructurales.Decorador.Componente.Tropa;
import Estructurales.Decorador.ObjetoDecorado;

public class SubirAtaque extends ObjetoDecorado {
    public SubirAtaque(Tropa tropa){
        this.cTropa = tropa;
    }

    @Override
    public String getTipo() {
        return "Habilidad que suma 3 puntos al ataque de un aliado";
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
        return this.cTropa.getAtaque() + 3;
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
