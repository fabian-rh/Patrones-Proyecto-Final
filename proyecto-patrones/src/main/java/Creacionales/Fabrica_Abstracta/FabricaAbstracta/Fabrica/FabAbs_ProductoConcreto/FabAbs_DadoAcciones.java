package Creacionales.Fabrica_Abstracta.FabricaAbstracta.Fabrica.FabAbs_ProductoConcreto;

import Creacionales.Fabrica_Abstracta.FabricaAbstracta.Fabrica.FabAbs_Producto.FabAbs_Dado;


public class FabAbs_DadoAcciones extends FabAbs_Dado {

    public FabAbs_DadoAcciones(String lado1, String lado2, String lado3, String lado4, String lado5, String lado6, String tipoDado) {
        super(lado1, lado2, lado3, lado4, lado5, lado6, tipoDado);
    }

    public FabAbs_DadoAcciones() {
        super.setLado1("Moverse");
        super.setLado2("Atacar");
        super.setLado3("AtaqueEsp");
        super.setLado4("Moverse");
        super.setLado5("Atacar");
        super.setLado6("AtaqueEsp");
        super.setTipoDado("DadoAcciones");
    }

}
