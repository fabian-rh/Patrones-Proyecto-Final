package Creacionales.Fabrica_Abstracta.FabricaAbstracta.ProductoConcreto;

import Creacionales.Fabrica_Abstracta.FabricaAbstracta.ProductoAbstracto.I_Tropa;

public class Tanque implements I_Tropa {
    private int movimiento = 3;
    private int vida = 2;
    private int ataque = 10;
    private int defensa = 10 ;
    private int ataqueEspecialTanque;

    private static final String TIPO = "Tanque";

    @Override
    public String obtener_info_tropa() {
        return "Tanque creado con exito";
    }


    @Override
    public String getTipo() {
        return TIPO;
    }
}
