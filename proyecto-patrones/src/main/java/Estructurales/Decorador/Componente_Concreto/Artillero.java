package Estructurales.Componente_Concreto;

import Estructurales.Componente.Tropa;

public class Artillero extends Tropa {
    private static final String TIPO = "Artillero";
    private int movimiento = 5;
    private int vida = 4;
    private int ataque = 6;
    private int defensa = 10;

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
