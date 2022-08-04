package Creacionales.Fabrica_Abstracta.FabricaAbstracta.FabricaConcreta;

import Creacionales.Fabrica_Abstracta.FabricaAbstracta.Armada;
import Creacionales.Fabrica_Abstracta.FabricaAbstracta.ProductoAbstracto.I_Tropa;
import Creacionales.Fabrica_Abstracta.FabricaAbstracta.ProductoConcreto.Tanque;

public class FabricaTanque implements Armada {

    @Override
    public I_Tropa crearArmada() {
        Tanque miTanque = new Tanque();
        miTanque.obtener_info_tropa();
        return miTanque;
    }
}
