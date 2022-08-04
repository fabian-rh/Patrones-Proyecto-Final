package Estructurales.Componente_Concreto;

import Estructurales.Componente.Tropa;

public class Tanque extends Tropa {
    private static final String TIPO = "Tanque";
    private int movimiento = 3;
    private int vida = 2;
    private int ataque = 10;
    private int defensa = 10 ;

    @Override
    public String getTipo() {
        return TIPO;
    }

    @Override
    public int getMovimiento() {
        return movimiento;
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public int getDefensa() {
        return defensa;
    }
}
