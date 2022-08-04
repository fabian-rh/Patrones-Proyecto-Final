package Creacionales.Fabrica_Abstracta.FabricaAbstracta.Fabrica.FabAbs_CreadorConcreto;

import Creacionales.Fabrica_Abstracta.FabricaAbstracta.Fabrica.FabAbs_Creador.FabAbs_Int_Dados;
import Creacionales.Fabrica_Abstracta.FabricaAbstracta.Fabrica.FabAbs_Producto.FabAbs_Dado;
import Creacionales.Fabrica_Abstracta.FabricaAbstracta.Fabrica.FabAbs_ProductoConcreto.FabAbs_DadoAcciones;
import Creacionales.Fabrica_Abstracta.FabricaAbstracta.Fabrica.FabAbs_ProductoConcreto.FabAbs_DadoInvocacion;
import Creacionales.Fabrica_Abstracta.FabricaAbstracta.Fabrica.FabAbs_ProductoConcreto.FabAbs_DadoMovimiento;

public class Fabrica_Dados implements FabAbs_Int_Dados {


    @Override
    public FabAbs_Dado crearDados(int tipo) {
        if(tipo == 1){
            FabAbs_DadoAcciones da = new FabAbs_DadoAcciones();
            return da;
        }else if(tipo == 2){
            FabAbs_DadoInvocacion di = new FabAbs_DadoInvocacion();
            return di;
        }else if(tipo == 3){
            FabAbs_DadoMovimiento dm = new FabAbs_DadoMovimiento();
            return dm;
        }
        return null;
    }
}
