package Gestor;

import Creacionales.Fabrica_Abstracta.FabricaAbstracta.Armada;
import Creacionales.Fabrica_Abstracta.FabricaAbstracta.ProductoAbstracto.I_Tropa;

import java.util.ArrayList;

public class FabricaTropas {

    private static ArrayList<I_Tropa> ttropas = new ArrayList<>();


    public static String crearFabricaTropas(Armada fabrica) {

        I_Tropa objTropa = fabrica.crearArmada();
        nuevaTropa(objTropa);
        return objTropa.obtener_info_tropa();

    }

    private static void nuevaTropa(I_Tropa objTropa) {
        ttropas.add(objTropa);
    }

    public static String informacionTropas() {
        String datos = "";
        for (int i = 0; i < ttropas.size(); i++) {
            datos = ttropas.get(i).obtener_info_tropa();
        }
        return datos;
    }

    public static String infoArtillero() {
        String datos = "";

        for (int i = 0; i < ttropas.size(); i++) {
            if (ttropas.get(i).getTipo() == "Artillero") {
                datos = ttropas.get(i).obtener_info_tropa() + "\n";
            }

        }
        return datos;
    }

    public static String infoInfanteria() {
        String datos = "";

        for (int i = 0; i < ttropas.size(); i++) {
            if (ttropas.get(i).getTipo() == "Infanteria") {
                datos = ttropas.get(i).obtener_info_tropa() + "\n";
            }

        }
        return datos;
    }

    public static String infoTanque() {
        String datos = "";

        for (int i = 0; i < ttropas.size(); i++) {
            if (ttropas.get(i).getTipo() == "Tanque") {
                datos = ttropas.get(i).obtener_info_tropa() + "\n";
            }

        }
        return datos;
    }





}
