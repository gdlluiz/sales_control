package Modelo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Controlador.Coordinador;

import Modelo.ConexionBD;
import Modelo.VO.EmpleadoVO;
import Modelo.VO.EmpleadoVO;
import Modelo.VO.CiudadVO;
import Modelo.ConexionBD;
import Vista.Login;
import Vista.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;


//Clase que permite el Acceso a la BD

public class EmpleadoDAO {
	// se crean los objetos de las clases necesarias
	private EmpleadoVO empleado;
        private CiudadVO ciudad;
        
        private Ventana principal;
        DefaultComboBoxModel model;
        private Login login;
        
       
	Connection conecta;

    public EmpleadoDAO() {
        // se chace la instancia a los objetos
        
        this.principal = new Ventana();
        this.login = new Login();
        
        // Programo los actionListener de los botones de la ventana Principal
        
        
        //Empleados
        this.principal.getBtnIngresarEmpleado().addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){  
               
                //se crea la instancia de empleado
                
               empleado = new EmpleadoVO();
               ciudad = new CiudadVO();
               
               //paso al objeto los datos Ingresados en la ventana
               
               empleado.setNombreEmpleado(principal.getTxtNombreEmpleado().getText());
               empleado.setApellidoEmpleado(principal.getTxtApellidoEmplado().getText());
               empleado.setDireccionEmpleado(principal.getTxtDireccionEmpleado().getText());
               empleado.setCodigoCiudadEmpleado(principal.getCbxCiudadE().getSelectedIndex());
               empleado.setTelefonoEmpleado(principal.getTxtTelefonoEmpleado().getText());
               empleado.setContrasenaEmpleado(principal.getTxtPassword().getText());              
               
                // Me conecto a la Base de datos
               conectar();
               
               //pasamos datos a la tabla Empleado
                try{
                    String sql;
                    sql ="INSERT INTO usuario(nombreUsuario, apellidoUsuario, DireccionUsuario, "
                           + "telefono, codigoCiudad, contrasena) "
                           + "VALUES(?,?,?,?,?,?)";
                    PreparedStatement ps = conecta.prepareCall(sql);
                    ps.setString(1, empleado.getNombreEmpleado());
                    ps.setString(2, empleado.getApellidoEmpleado());
                    ps.setString(3, empleado.getDireccionEmpleado());
                    ps.setString(4, empleado.getTelefonoEmpleado());
                    ps.setString(5, obtenerIndex(principal.getCbxCiudadE().getSelectedItem().toString()));
                    ps.setString(6, empleado.getContrasenaEmpleado());
                                
                    int n = ps.executeUpdate();
                    if(n>0){
                        JOptionPane.showMessageDialog(null, "Datos Guardados");
                    }
                    // desconectamos la bd
                    desconectar();
                    //limpiamos los datos Guardados
                    limpiar();
                }catch(Exception ex){
                        JOptionPane.showMessageDialog(null,"error"+ ex);
                }
            }         
        });    
    }
    
    
    
    public String obtenerIndex(String ciudad){
        int id=0;
        String base[] = {"", "Ajijic", "Chapala",  "Cocula", "Guadalajara", "Jocotepec",
            "Lagos de Moreno", "Puerto Vallarta", "Tequila", "Tlajomulco", "Tlaquepaque",
            "Tonala", "Zapopan"};
    
        for(int i=0;i<13;i++){
             if(ciudad.matches(base[i])){
                id=i;
                break;
            }
        }
         return Integer.toString(id);
    }
    
    
    public void manejaVista(){
        //Hago visible la ventana principal
        principal.setVisible(true);
    }
    
    
    // Metodo que Conecta a la Base de Datos
    public void conectar(){
        
        try{
            conecta = ConexionBD.getConexion();
        }catch(Exception e ){
            JOptionPane.showMessageDialog(null,"Error"+ e);
        }
    }
    //Metodo que limpia campos 
    public void limpiar(){
        principal.getTxtNombreEmpleado().setText("");
        principal.getTxtApellidoEmplado().setText("");
        principal.getTxtDireccionEmpleado().setText("");
        principal.getCbxCiudadE().getItemAt(1);
        principal.getTxtTelefonoEmpleado().setText("");
        principal.getTxtPassword().setText("");
    }
    // metodo que desconecta la base de datos
    public void desconectar(){
        conecta=null;
    }
    
   
    
}



































