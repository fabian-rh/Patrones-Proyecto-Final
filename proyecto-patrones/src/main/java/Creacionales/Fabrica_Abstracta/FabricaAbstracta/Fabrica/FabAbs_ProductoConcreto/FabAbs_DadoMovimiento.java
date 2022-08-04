package Creacionales.Fabrica_Abstracta.FabricaAbstracta.Fabrica.FabAbs_ProductoConcreto;

import Creacionales.Fabrica_Abstracta.FabricaAbstracta.Fabrica.FabAbs_Producto.FabAbs_Dado;


public class FabAbs_DadoMovimiento extends FabAbs_Dado {

    public FabAbs_DadoMovimiento(String lado1, String lado2, String lado3, String lado4, String lado5, String lado6, String tipoDado) {
        super(lado1, lado2, lado3, lado4, lado5, lado6, tipoDado);
    }

    public FabAbs_DadoMovimiento() {
        super.setLado1("1");
        super.setLado2("2");
        super.setLado3("3");
        super.setLado4("4");
        super.setLado5("5");
        super.setLado6("6");
        super.setTipoDado("DadoMovimiento");
    }
}
