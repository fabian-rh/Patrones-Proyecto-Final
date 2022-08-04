package The.developers.Principal;

import Creacionales.Fabrica_Abstracta.FabricaAbstracta.Fabrica.FabAbs_CreadorConcreto.Fabrica_Dados;
import Creacionales.Fabrica_Abstracta.FabricaAbstracta.Fabrica.FabAbs_Producto.FabAbs_Dado;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class Main_Controller {

	public static void main(String[] args) {
		FabAbs_Dado d1;
		Fabrica_Dados f = new Fabrica_Dados();
		Proto_Gestor gestorCasillas = new Proto_Gestor();

		//Fabrica Abstracta - Crear Dados
		d1 = f.crearDados(1);
		System.out.println(d1.toString());;
		System.out.println(d1.lanzarDado());
		d1 = f.crearDados(2);
		System.out.println(d1.toString());;
		System.out.println(d1.lanzarDado());
		d1 = f.crearDados(3);
		System.out.println(d1.toString());;
		System.out.println(d1.lanzarDado());

		//Fabrica Prototipo - Casillas
		gestorCasillas.crearCasillas();
		for(int i = 0; i < gestorCasillas.getListaCasillas().size(); i++){
			System.out.println(gestorCasillas.getListaCasillas().get(i).toString()+"\n");
		}



		SpringApplication.run(Main_Controller.class, args);
	}

	//Thymeleaf


}
