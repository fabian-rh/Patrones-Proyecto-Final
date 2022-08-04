package Creacionales.Fabrica_Abstracta.FabricaAbstracta.Fabrica.FabAbs_Producto;

public abstract class FabAbs_Dado {

    //Atributos del dado
    private String lado1;
    private String lado2;
    private String lado3;
    private String lado4;
    private String lado5;
    private String lado6;
    private String tipoDado;

    //Metodos
    public String lanzarDado(){
        String ladoEscogido="";

        switch (generadorRandom()){
            case 1:
                ladoEscogido = getLado1();
                break;
            case 2:
                ladoEscogido = getLado2();
                break;
            case 3:
                ladoEscogido = getLado3();
                break;
            case 4:
                ladoEscogido = getLado4();
                break;
            case 5:
                ladoEscogido = getLado5();
                break;
            case 6:
                ladoEscogido = getLado6();
                break;
            default:
                ladoEscogido = "Error en FabAbs_Dado "+getTipoDado()+".lanzarDado()\n ";
                break;
        }
        return ladoEscogido;
    };

    protected int generadorRandom() {
        return ((int) (Math.random()*6)+1);
    }

    //Constructores
    public FabAbs_Dado() {
    }

    public FabAbs_Dado(String lado1, String lado2, String lado3, String lado4, String lado5, String lado6, String tipoDado) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
        this.lado5 = lado5;
        this.lado6 = lado6;
        this.tipoDado = tipoDado;
    }

    //Setters Getters
    public String getLado1() {
        return lado1;
    }

    public void setLado1(String lado1) {
        this.lado1 = lado1;
    }

    public String getLado2() {
        return lado2;
    }

    public void setLado2(String lado2) {
        this.lado2 = lado2;
    }

    public String getLado3() {
        return lado3;
    }

    public void setLado3(String lado3) {
        this.lado3 = lado3;
    }

    public String getLado4() {
        return lado4;
    }

    public void setLado4(String lado4) {
        this.lado4 = lado4;
    }

    public String getLado5() {
        return lado5;
    }

    public void setLado5(String lado5) {
        this.lado5 = lado5;
    }

    public String getLado6() {
        return lado6;
    }

    public void setLado6(String lado6) {
        this.lado6 = lado6;
    }

    public String getTipoDado() {
        return tipoDado;
    }

    public void setTipoDado(String tipoDado) {
        this.tipoDado = tipoDado;
    }

    @Override
    public String toString() {
        return "FabAbs_Dado{" +
                "lado1='" + lado1 + '\'' +
                ", lado2='" + lado2 + '\'' +
                ", lado3='" + lado3 + '\'' +
                ", lado4='" + lado4 + '\'' +
                ", lado5='" + lado5 + '\'' +
                ", lado6='" + lado6 + '\'' +
                ", tipoDado='" + tipoDado + '\'' +
                '}';
    }
}
