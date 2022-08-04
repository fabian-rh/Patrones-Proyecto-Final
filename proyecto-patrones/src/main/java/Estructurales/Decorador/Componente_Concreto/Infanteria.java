package Estructurales.Componente_Concreto;

import Estructurales.Componente.Tropa;

public class Infanteria extends Tropa {
    private static final String TIPO = "Infanteria";
    private int movimiento = 7;
    private int vida = 5;
    private int ataque = 3;
    private int defensa = 5;

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
