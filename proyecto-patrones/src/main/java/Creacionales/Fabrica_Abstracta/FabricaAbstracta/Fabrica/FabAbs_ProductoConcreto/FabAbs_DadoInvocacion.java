package Creacionales.Fabrica_Abstracta.FabricaAbstracta.Fabrica.FabAbs_ProductoConcreto;

import Creacionales.Fabrica_Abstracta.FabricaAbstracta.Fabrica.FabAbs_Producto.FabAbs_Dado;


public class FabAbs_DadoInvocacion extends FabAbs_Dado {

    public FabAbs_DadoInvocacion(String lado1, String lado2, String lado3, String lado4, String lado5, String lado6, String tipoDado) {
        super(lado1, lado2, lado3, lado4, lado5, lado6, tipoDado);
    }

    public FabAbs_DadoInvocacion() {
        super.setLado1("Infanteria");
        super.setLado2("Artillero");
        super.setLado3("Tanque");
        super.setLado4("Infanteria");
        super.setLado5("Artillero");
        super.setLado6("Tanque");
        super.setTipoDado("DadoInvocacion");
    }

}
