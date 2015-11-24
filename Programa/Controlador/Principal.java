package Controlador;



import Modelo.DAO.EmpleadoDAO;

public class Principal {

	public static void main(String[] args) {
		// Se declara  las Clase con mis metodos
            EmpleadoDAO empleado;
            
            // se crea el Objeto
            
            empleado = new EmpleadoDAO();
            
		
            // Mando a llamar los metodos
            empleado.manejaVista();
		
		
		
		

	}

}
