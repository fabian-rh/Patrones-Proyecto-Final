package Estructurales.Decorador_Concreto.Tanque;

import Estructurales.Decorador.Componente.Tropa;
import Estructurales.Decorador.ObjetoDecorado;

public class Proteccion extends ObjetoDecorado {
    public Proteccion(Tropa tropa, Tropa tropa2){
        this.cTropa = tropa;
    }

    @Override
    public String getTipo() {
        return "Habilidad que da el 50% de la defensa y se la da a un aliado por un turno";
    }

    @Override
    public int getMovimiento() {
        return 0;
    }

    @Override
    public int getVida() {
        return 0;
    }

    @Override
    public int getAtaque() {
        return 0;
    }

    @Override
    public int getDefensa() {
        return Math.round(this.cTropa.getDefensa() / 2);
    }

    @Override
    public int getRangoDeAtaque() {
        return 0;
    }
}
