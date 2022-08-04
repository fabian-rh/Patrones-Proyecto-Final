package Creacionales.Fabrica_Abstracta.FabricaAbstracta.ProductoConcreto;

import Creacionales.Fabrica_Abstracta.FabricaAbstracta.ProductoAbstracto.I_Tropa;

public class Infanteria implements I_Tropa {
    private int movimiento = 7;
    private int vida = 5;
    private int ataque = 3;
    private int defensa = 5;
    private int ataqueEspecialInfanteria;
    private static final String TIPO = "Infanteria";

    @Override
    public String obtener_info_tropa() {
        return "Infanteria creado exitosamente";
    }


    @Override
    public String getTipo() {
        return TIPO;
    }
}
