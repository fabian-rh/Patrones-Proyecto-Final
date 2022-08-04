package Estructurales.Decorador_Concreto.Tanque;

import Estructurales.Decorador.Componente.Tropa;
import Estructurales.Decorador.ObjetoDecorado;

public class VidaPorDobleMovimiento extends ObjetoDecorado {
    public VidaPorDobleMovimiento(Tropa tropa){
        this.cTropa = tropa;
    }

    @Override
    public String getTipo() {
        return "Habilidad que sacrifica 1 punto de vida por doble movimiento por 2 turnos";
    }

    @Override
    public int getMovimiento() {
        return this.cTropa.getMovimiento();
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
        return 0;
    }

    @Override
    public int getRangoDeAtaque() {
        return 0;
    }
}
