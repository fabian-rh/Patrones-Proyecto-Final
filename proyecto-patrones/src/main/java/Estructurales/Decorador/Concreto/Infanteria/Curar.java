package Estructurales.Decorador_Concreto.Infanteria;

import Estructurales.Decorador.Componente.Tropa;
import Estructurales.Decorador.ObjetoDecorado;

public class Curar extends ObjetoDecorado {
    public Curar(Tropa tropa){
        this.cTropa = tropa;
    }

    @Override
    public String getTipo() {
        return "Habilidad que cura 1 punto de vida a cualquier aliado";
    }

    @Override
    public int getMovimiento() {
        return this.cTropa.getMovimiento();
    }

    @Override
    public int getVida() {
        return this.cTropa.getVida() + 1;
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
