package Creacionales.Fabrica_Abstracta.FabricaAbstracta.FabricaConcreta;

import Creacionales.Fabrica_Abstracta.FabricaAbstracta.Armada;
import Creacionales.Fabrica_Abstracta.FabricaAbstracta.ProductoAbstracto.I_Tropa;
import Creacionales.Fabrica_Abstracta.FabricaAbstracta.ProductoConcreto.Infanteria;

public class FabricaInfanteria implements Armada {

    @Override
    public I_Tropa crearArmada() {
        Infanteria miInfanteria = new Infanteria();
        miInfanteria.obtener_info_tropa();
        return miInfanteria;
    }
}
