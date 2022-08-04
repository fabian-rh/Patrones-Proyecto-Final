package Estructurales.Decorador_Concreto.Tanque;

import Estructurales.Decorador.Componente.Tropa;
import Estructurales.Decorador.ObjetoDecorado;

public class AtaqueBomba extends ObjetoDecorado {
    public AtaqueBomba(Tropa tropa){
        this.cTropa = tropa;
    }

    @Override
    public String getTipo() {
        return "Habilidad que mata a todos los personajes que se encuentren a tres casillas a la redonda";
    }

    @Override
    public int getMovimiento() {
        return this.cTropa.getMovimiento();
    }

    @Override
    public int getVida() {
        return this.cTropa.getVida() - 100;
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
        return this.cTropa.getRangoDeAtaque();
    }
}
