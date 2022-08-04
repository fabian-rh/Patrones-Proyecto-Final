package Creacionales.Fabrica_Abstracta.FabricaAbstracta.FabricaConcreta;

import Creacionales.Fabrica_Abstracta.FabricaAbstracta.Armada;
import Creacionales.Fabrica_Abstracta.FabricaAbstracta.ProductoAbstracto.I_Tropa;
import Creacionales.Fabrica_Abstracta.FabricaAbstracta.ProductoConcreto.Artillero;

public class FabricaArtillero implements Armada {
    @Override
    public I_Tropa crearArmada() {
        Artillero miArtillero = new Artillero();
        miArtillero.obtener_info_tropa();
        return miArtillero;
    }
}
