package Modelo;


import Vista.Ventana;
import Modelo.ConexionBD;
import Modelo.VO.ArticuloVO;
import Modelo.VO.EmpleadoVO;
import Modelo.VO.Entradas_SalidasVO;
import Modelo.VO.InventarioVO;
import Modelo.VO.ProveedorVO;
import Modelo.VO.TipoArticuloVO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Logica {
    Ventana principal = new Ventana();
    Connection conecta;
    EmpleadoVO empleado;
    ProveedorVO proveedor;
    ArticuloVO articulo;
    TipoArticuloVO tipoArticulo;
    Entradas_SalidasVO entradasSalidas;
    InventarioVO inventario;
    
    public Logica() {
        conectar();
        
        // panel Empleado
        this.principal.getBtnIngresarEmpleado().addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){  
               
                empleado = new EmpleadoVO();         
              
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
                    limpiarEmpleado();
                }catch(Exception ecx){
                        JOptionPane.showMessageDialog(null,"Todos los campos son requeridos!!");
                }
            }         
        });    
        
       this.principal.getBtnBorrarEmpleado().addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){  
                limpiarEmpleado();
            }      
       });   
       
       
       // Panel Proveedor
       this.principal.getBtnIngresarProveedor().addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){  
                //Creo el Objeto Proveedor
                proveedor = new ProveedorVO();
                
                               
                //Capturo los datos ingresados en el Objeto Proveedor
                proveedor.setNombreEmpresa(principal.getTxtNombreCompania().getText());
                proveedor.setNombreProveedor(principal.getTxtNombreProveedor().getText());
                proveedor.setApellidoProveedor(principal.getTxtApellidoProveedor().getText());
                proveedor.setDireccionProveedor(principal.getTxtDireccionProveedor().getText());
                proveedor.setTelefonoProveedor(principal.getTxtTelefonoProveedor().getText());
                proveedor.setCodigoCiudad(principal.getCbxCiudadP().getSelectedIndex());
                               
                
                // Me conecto a la base de datos
                
                  conectar();
                // Ingreso los datos a la BD
                try{
                  
                    String sql;
                    sql ="INSERT INTO proovedor(nombreProovedor, apellidoProovedor,nombreComercial, "
                           + "direccionProovedor, telefono, codigoCiudad) "
                           + "VALUES(?,?,?,?,?,?)";
                    PreparedStatement ps = conecta.prepareCall(sql);
                    ps.setString(1, proveedor.getNombreProveedor());
                    ps.setString(2, proveedor.getApellidoProveedor());
                    ps.setString(3, proveedor.getNombreEmpresa());
                    ps.setString(4, proveedor.getDireccionProveedor());
                    ps.setString(5, proveedor.getTelefonoProveedor());
                    ps.setString(6, obtenerIndex(principal.getCbxCiudadP().getSelectedItem().toString()));
                    
                                
                    int n = ps.executeUpdate();
                    if(n>0){
                        JOptionPane.showMessageDialog(null, "Datos Guardados");
                    }
                    // desconectamos la bd
                    desconectar();
                    //limpiamos los datos Guardados
                    limpiarProveedor();
                }catch(Exception ex){
                        JOptionPane.showMessageDialog(null," Todos los campos son requeridos ");
                }
                
            }
        });     
        
         
        this.principal.getBtnBorrarProveedor().addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){  
                limpiarProveedor();
            }
        });   
        
        
        
        // Panel Articulo
        
       
        this.principal.getBtnIngresarProducto().addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){  
                conectar();
                //Creo los Objetos Articulo, inventario y tipo de articulo
                articulo = new ArticuloVO();
                tipoArticulo = new TipoArticuloVO();
                inventario = new InventarioVO();
                entradasSalidas = new Entradas_SalidasVO();
                float aux;                
                int idProveedor =0;
                int idAr=0;
                int minimo=0, existencia= 0;
                                
                //paso los datos en la ventana a el objeto Articulo
                tipoArticulo.setTipo(principal.getCbxArticulo().getSelectedItem().toString());
                idAr = ObtenerIdArticulo(tipoArticulo.getTipo());
                articulo.setDescripcion(principal.getTxtProductoDescripcion().getText());
                articulo.setMarca(principal.getTxtMarcaArticulo().getText());
                articulo.setTalla(principal.getCbxTallaProducto().getSelectedItem().toString());
                aux = Float.parseFloat(principal.getTxtPrecioCompra().getText());
                articulo.setPrecioCompra(aux);
                existencia = Integer.parseInt(principal.getTxtCantidadProducto().getText());
                inventario.setExistencia(existencia);
                minimo = Integer.parseInt(principal.getTxtMinimoProducto().getText());
                inventario.setStockMinimo(minimo);
                idProveedor=principal.ObtenerIdProvedor(principal.getCbxProveedores().getSelectedItem().toString());
                articulo.setCodigoProveedor(idProveedor);
              
                 
                   // Ingreso los datos a la BD
                try{
                  // datos de el articulo
                    String sql;
                    sql ="INSERT INTO articulo(descripcion, marca, no_Tamano,"
                            + "precioCompra, codigoTipoArticulo, codigoProovedor)VALUES(?,?,?,?,?,?);";
                    PreparedStatement ps = conecta.prepareCall(sql);
                    ps.setString(1, articulo.getDescripcion());
                    ps.setString(2, articulo.getMarca());
                    ps.setString(3, articulo.getTalla());
                    ps.setFloat(4, aux);
                    ps.setInt(5, idAr);
                    ps.setInt(6, articulo.getCodigoProveedor());
                   
                    ps.executeUpdate();
                    
              
                    inventario.setCodArticulo(principal.ObtenerIdADescripcion(articulo.getDescripcion(), tipoArticulo.getTipo()));
                    
                    String sql2="INSERT INTO inventario(existencia, stockMinimo)"
                            + "VALUES(?,?);";
                    PreparedStatement ps2 = conecta.prepareCall(sql2);
                   
                    ps2.setInt(1, inventario.getExistencia());
                    ps2.setInt(2, inventario.getStockMinimo());
                                        
                    int m=ps2.executeUpdate();
                    limpiarProducto();
                     if(m>0){
                        JOptionPane.showMessageDialog(null, "Datos Guardados");
                        conectar();
                        mostrarTabla();
                        
                        desconectar();
                       // conectar();
                    }
                   
                }catch(Exception ecx){
                        JOptionPane.showMessageDialog(null," Todos los campos son requeridos ");
                }
                
            }
        });
        
         this.principal.getBtnBorrarProducto().addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){  
                
                 limpiarProducto();
            }
        });
        
        this.principal.getBtnBuscarConsulta().addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){ 
                conectar();
               String articulo="";
               articulo = principal.getCbxBuscar().getSelectedItem().toString();
               ObtenerArticuloBuscado(articulo);
               
            }   
        });    
       
        
        
        // Panel Movimientos
        
        
        this.principal.getBtnEntradaArticulo().addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){ 
                conectar();
            entradasSalidas = new Entradas_SalidasVO();
            String cantidad, idProducto, empleado;
                       
            cantidad= (principal.getTxtESCantidad().getText());
            idProducto= (principal.getTxtESIdProducto().getText());
            empleado= (principal.getTxtESIdEmpleado().getText());
            
            entradasSalidas.setCantidad(Integer.parseInt(cantidad));
            entradasSalidas.setCodUsuario(Integer.parseInt(empleado));
            entradasSalidas.setCodArticulo(Integer.parseInt(idProducto));
            cargarEntrada();
            conectar();
            mostrarTabla();
            mostrarTabla2();
            desconectar();
            limpiarES();
            }   
        });   
        
        this.principal.getBtnSalidaArticulo().addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){  
             conectar();
            entradasSalidas = new Entradas_SalidasVO();
            String cantidad, idProducto, empleado ;
            int stock, min, evaluar;
            
            cantidad= (principal.getTxtESCantidad().getText());
            idProducto= (principal.getTxtESIdProducto().getText());
            empleado= (principal.getTxtESIdEmpleado().getText());
            evaluar=Integer.parseInt(cantidad);
            entradasSalidas.setCantidad(Integer.parseInt(cantidad));
            entradasSalidas.setCodUsuario(Integer.parseInt(empleado));
            entradasSalidas.setCodArticulo(Integer.parseInt(idProducto));
    
            stock = obtenerExistencia(entradasSalidas.getCodArticulo());
            min = obtenerMinimo(entradasSalidas.getCodArticulo());
            if(evaluar > stock){
                JOptionPane.showMessageDialog(null, "No hay articulos suficientes");
            }
            else if((stock-evaluar)>min){
                cargarSalida();
                conectar();
                mostrarTabla();
                mostrarTabla2();
                desconectar();
            }
            else if((stock-evaluar)<= min && (stock-evaluar>= 0)){
                JOptionPane.showMessageDialog(null, "Senecesitan surtir mas productos");
                cargarSalida();
                conectar();
                mostrarTabla();
                mostrarTabla2();
                desconectar();
            }
            else if((stock)== 0){
               
                JOptionPane.showMessageDialog(null, "producto Agotado");
                
            }
            else{
                  JOptionPane.showMessageDialog(null,"Ingresa datos correctos");
            }
            
            limpiarES();
            }   
        });    
    }
    
    
    
    // Metodos
    
    //Metodo que limpia campos 
    public void limpiarProveedor(){
      principal.getTxtNombreProveedor().setText("");
      principal.getTxtApellidoProveedor().setText("");
      principal.getTxtNombreCompania().setText("");
      principal.getTxtDireccionProveedor().setText("");
      principal.getTxtTelefonoProveedor().setText("");
      principal.cargarCbx();
    }
     
    
    public void limpiarES()
    {
        principal.getTxtESCantidad().setText("");
        principal.getTxtESIdEmpleado().setText("");
        principal.getTxtESIdProducto().setText("");
    }
    public void limpiarEmpleado(){
        principal.getTxtNombreEmpleado().setText("");
        principal.getTxtApellidoEmplado().setText("");
        principal.getTxtDireccionEmpleado().setText("");
        principal.cargarCbx();
        principal.getTxtTelefonoEmpleado().setText("");
        principal.getTxtPassword().setText("");
    }
    public void limpiarProducto(){
        principal.getTxtProductoDescripcion().setText("");
        principal.getTxtMarcaArticulo().setText("");
        principal.getTxtPrecioCompra().setText("");
        principal.getTxtCantidadProducto().setText("");
        principal.getTxtMinimoProducto().setText("");
        principal.cargarCbx();
        principal.getCbxProveedores().setSelectedItem("");
    }
    
    
    // obtienen ID
    
    public int ObtenerIdArticulo(String articulo)
    {
        int id=0;
        String base[] = {"","Sweter","Chamarra","camisa","Pantalon","Vestido","Falda","Bota",
            "Sandalia","Zapato","Tenis","Tacon"};        
        for(int i =0;i<base.length;i++){
            if (articulo.matches(base[i])){
                id=i;
                break;            }
            else{
                id =66;
            }
        }
        return (id);
    }
    
    
    //Tablas
     public void ObtenerArticuloBuscado(String articulo)
    {
       DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("Articulo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Talla");
        modelo.addColumn("Marca");
        modelo.addColumn("Existencia");
        //modelo.addColumn("Minimo");
        
        principal.getTablaConsultas().setModel(modelo);
        
        String consulta="SELECT articulo.idArticulo,tipo_articulo.tipo, articulo.descripcion, articulo.no_Tamano,"
            + " articulo.marca, inventario.existencia from Articulo\n" +
            "JOIN tipo_articulo on articulo.codigoTipoArticulo=tipo_articulo.idTipoArticulo \n" +
            "JOIN inventario on idArticulo = inventario.codArticulo  WHERE tipo_articulo.tipo='"+articulo+"'"
            + "ORDER BY articulo.idArticulo ASC;";  
        String datos[] = new String[6];
        try {
            Statement st =conecta.createStatement();
            ResultSet rs= st.executeQuery(consulta);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                
                modelo.addRow(datos);
            }
            principal.getTablaConsultas().setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
    
	 // Obtener el Indice de la ciudad
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
             else{
                 id=0;
             }
        }
         return Integer.toString(id);
    }
    
    public void manejaVista(){
        //Hago visible la ventana principal
       //principal = new Ventana();
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
    
    public void desconectar(){
        conecta=null;
    }
    // Metodo que llena la tabla de inventario
    public void mostrarTabla(){
       // conectar();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("Articulo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Talla");
        modelo.addColumn("Marca");
        modelo.addColumn("Existencia");
        modelo.addColumn("Minimo");
        
        principal.getTablaInventario().setModel(modelo);
        // Consulta que une las tablas tpo Articulo, articulo e inventario
        String tabla="SELECT articulo.idArticulo,tipo_articulo.tipo, articulo.descripcion, articulo.no_Tamano,"
            + " articulo.marca, inventario.existencia, inventario.StockMinimo from Articulo\n" +
            "JOIN tipo_articulo on articulo.codigoTipoArticulo=tipo_articulo.idTipoArticulo \n" +
            "JOIN inventario on idArticulo = inventario.codArticulo ORDER BY articulo.idArticulo ASC ;";
        
        String datos[] = new String[7];
        try {
            Statement st =conecta.createStatement();
            ResultSet rs= st.executeQuery(tabla);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                modelo.addRow(datos);
            }
            principal.getTablaInventario().setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    
    public int obtenerExistencia(int articulo){
            String cantidad="";
            String consulta="select  existencia from inventario where codArticulo ='"+articulo+"';";
            try {
                Statement st =conecta.createStatement();
                ResultSet rs= st.executeQuery(consulta);
                while(rs.next()){
                 
                    cantidad =rs.getString(1);
                }
            }catch(SQLException ex){
                
            }
            return Integer.parseInt(cantidad);
        }
    public int obtenerMinimo(int articulo){
        String cantidad="";
        String consulta="select stockMinimo from inventario where codArticulo ='"+articulo+"';";
        try {
            Statement st =conecta.createStatement();
            ResultSet rs= st.executeQuery(consulta);
            while(rs.next()){           
                cantidad =rs.getString(1);
            }
        }catch(SQLException ex){  
            
            }
            return Integer.parseInt(cantidad);
        }
     
     public void cargarSalida (){
         String sql="INSERT INTO entradas_salidas (codArticulo, mov_entrada_salida, "
                    + "cantidad, codUsuario) VALUES(?,?,?,?)";
                   
                    PreparedStatement ps;
                try {
                        ps = conecta.prepareCall(sql);
                    
                        ps.setInt(1,entradasSalidas.getCodArticulo() );
                        ps.setInt(2, 1);
                        ps.setInt(3, entradasSalidas.getCantidad());
                        ps.setInt(4, entradasSalidas.getCodUsuario());                             
                        int m=ps.executeUpdate();
                        if(m>1){
                            JOptionPane.showMessageDialog(null, "Inventario Actualizado");
                            desconectar();
                        }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Todos los campos son requeridos");
                }
     }
     
     public void cargarEntrada(){
        String sql="INSERT INTO entradas_salidas (codArticulo, mov_entrada_salida, "
                    + "cantidad, codUsuario) VALUES(?,?,?,?)";
            
        PreparedStatement ps;
        try {
            ps = conecta.prepareCall(sql);
                   
            ps.setInt(1,entradasSalidas.getCodArticulo() );
            ps.setInt(2, 0);
            ps.setInt(3, entradasSalidas.getCantidad());
            ps.setInt(4, entradasSalidas.getCodUsuario());                             
            int m=ps.executeUpdate();
            if(m>1){
                JOptionPane.showMessageDialog(null, "Inventario Actualizado");
                desconectar();
            }
        }catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Todos los campos son requeridos");
        }
    }
    public void mostrarTabla2(){
       // conectar();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("Articulo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Talla");
        modelo.addColumn("Marca");
        modelo.addColumn("Existencia");
        modelo.addColumn("Minimo");
        
        principal.getTablaMovimientos().setModel(modelo);
        // Consulta que une las tablas tpo Articulo, articulo e inventario
        String tabla="SELECT articulo.idArticulo,tipo_articulo.tipo, articulo.descripcion, articulo.no_Tamano,"
            + " articulo.marca, inventario.existencia, inventario.StockMinimo from Articulo\n" +
            "JOIN tipo_articulo on articulo.codigoTipoArticulo=tipo_articulo.idTipoArticulo \n" +
            "JOIN inventario on idArticulo = inventario.codArticulo ORDER BY articulo.idArticulo ASC ;";
        
        String datos[] = new String[7];
        try {
            Statement st =conecta.createStatement();
            ResultSet rs= st.executeQuery(tabla);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                modelo.addRow(datos);
            }
            principal.getTablaMovimientos().setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
}
