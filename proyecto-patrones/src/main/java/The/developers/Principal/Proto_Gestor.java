package The.developers.Principal;

import Creacionales.Fabrica_Abstracta.FabricaAbstracta.Prototipo.Proto_Prototipo.Proto_CasillaConcreta;

import java.util.ArrayList;

public class Proto_Gestor {
    private ArrayList<Proto_CasillaConcreta> listaCasillas = new ArrayList<>();
    Proto_CasillaConcreta protoCasilla = new Proto_CasillaConcreta();
    private int idCasilla;


    public void crearCasillas(){
        this.idCasilla = 0;
        for(int i = 0; i < 400; i++){
            listaCasillas.add(protoCasilla.clonar());
            listaCasillas.get(i).setId(i);
        }
    }

    public ArrayList<Proto_CasillaConcreta> getListaCasillas() {
        return listaCasillas;
    }

    public int getIdCasilla() {
        return idCasilla;
    }

    public void setIdCasilla(int idCasilla) {
        this.idCasilla = idCasilla;
    }

    public Proto_CasillaConcreta getProtoCasilla() {
        return protoCasilla;
    }

    public void setProtoCasilla(Proto_CasillaConcreta protoCasilla) {
        this.protoCasilla = protoCasilla;
    }
}
