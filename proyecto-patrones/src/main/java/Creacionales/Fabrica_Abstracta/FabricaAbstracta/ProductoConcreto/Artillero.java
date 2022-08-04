package Creacionales.Fabrica_Abstracta.FabricaAbstracta.ProductoConcreto;

import Creacionales.Fabrica_Abstracta.FabricaAbstracta.ProductoAbstracto.I_Tropa;

public class Artillero implements I_Tropa {
    private int movimiento = 5;
    private int vida = 4;
    private int ataque = 6;
    private int defensa = 10;
    private int ataqueEspecialArtillero;

    private static final String TIPO = "Artillero";


    @Override
    public String obtener_info_tropa() {
        return "Artillero creado exitosamente";
    }


    public String getTipo() {
        return TIPO;
    }


}
