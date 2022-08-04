package Estructurales.Decorador;

import Creacionales.Fabrica_Abstracta.FabricaAbstracta.ProductoAbstracto.I_Tropa;

public abstract class ObjetoDecorador implements I_Tropa{
    protected I_Tropa tropa;

    public I_Tropa getTropa(){
        return tropa;
    }
}
