/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Modelo.ConexionBD;
import Modelo.Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import javax.swing.JTextField;

/**
 *
 * @author Luiz
 */
public class Ventana extends javax.swing.JFrame {
    Logica logica;
    Connection conecta;
   
   
    public Ventana() {
        
        initComponents();
        cargarCbx();
        cargaProveedores();
    }

    public JButton getBtnBuscarConsulta() {
        return btnBuscarConsulta;
    }

    public void setBtnBuscarConsulta(JButton btnBuscarConsulta) {
        this.btnBuscarConsulta = btnBuscarConsulta;
    }
 
    public JTable getTablaConsultas() {
        return tablaConsultas;
    }

    public void setTablaConsultas(JTable tablaConsultas) {
        this.tablaConsultas = tablaConsultas;
    }

    public JTable getTablaInventario() {
        return tablaInventario;
    }

    public void setTablaInventario(JTable tablaInventario) {
        this.tablaInventario = tablaInventario;
    }

    public JTextField getTxtProductoDescripcion() {
        return txtProductoDescripcion;
    }

    public JComboBox getCbxArticulo() {
        return cbxArticulo;
    }

    public JComboBox getCbxBuscar() {
        return cbxBuscar;
    }

    public void setCbxBuscar(JComboBox cbxBuscar) {
        this.cbxBuscar = cbxBuscar;
    }

    public void setCbxArticulo(JComboBox cbxArticulo) {
        this.cbxArticulo = cbxArticulo;
    }

    public void setTxtProductoDescripcion(JTextField txtProductoDescripcion) {
        this.txtProductoDescripcion = txtProductoDescripcion;
    }

    public JComboBox getCbxProveedores() {
        return cbxProveedores;
    }

    public void setCbxProveedores(JComboBox cbxProveedores) {
        this.cbxProveedores = cbxProveedores;
    }

    public JButton getBtnBorrarEmpleado() {
        return btnBorrarEmpleado;
    }

    public void setBtnBorrarEmpleado(JButton btnBorrarEmpleado) {
        this.btnBorrarEmpleado = btnBorrarEmpleado;
    }

    public JButton getBtnBorrarProducto() {
        return btnBorrarProducto;
    }

    public void setBtnBorrarProducto(JButton btnBorrarProducto) {
        this.btnBorrarProducto = btnBorrarProducto;
    }

    public JButton getBtnBuscarInventario() {
        return btnBuscarConsulta;
    }

    public void setBtnBuscarInventario(JButton btnBuscarInventario) {
        this.btnBuscarConsulta = btnBuscarInventario;
    }

    public JButton getBtnEntradaArticulo() {
        return btnEntradaArticulo;
    }

    public void setBtnEntradaArticulo(JButton btnEntradaArticulo) {
        this.btnEntradaArticulo = btnEntradaArticulo;
    }

    public JButton getBtnIngresarEmpleado() {
        return btnIngresarEmpleado;
    }

    public void setBtnIngresarEmpleado(JButton btnIngresarEmpleado) {
        this.btnIngresarEmpleado = btnIngresarEmpleado;
    }

    public JButton getBtnIngresarProducto() {
        return btnIngresarProducto;
    }

    public void setBtnIngresarProducto(JButton btnIngresarProducto) {
        this.btnIngresarProducto = btnIngresarProducto;
    }

    public JButton getBtnIngresarProveedor() {
        return btnIngresarProveedor;
    }

    public void setBtnIngresarProveedor(JButton btnIngresarProveedor) {
        this.btnIngresarProveedor = btnIngresarProveedor;
    }

    public JButton getBtnSalidaArticulo() {
        return btnSalidaArticulo;
    }

    public void setBtnSalidaArticulo(JButton btnSalidaArticulo) {
        this.btnSalidaArticulo = btnSalidaArticulo;
    }

    public JButton getBtnBorrarProveedor() {
        return btnBorrarProveedor;
    }

    public void setBtnBorrarProveedor(JButton btnBorrarProveedor) {
        this.btnBorrarProveedor = btnBorrarProveedor;
    }

    public JTextField getTxtApellidoEmplado() {
        return txtApellidoEmplado;
    }

    public void setTxtApellidoEmplado(JTextField txtApellidoEmplado) {
        this.txtApellidoEmplado = txtApellidoEmplado;
    }

    public JTextField getTxtApellidoProveedor() {
        return txtApellidoProveedor;
    }

    public void setTxtApellidoProveedor(JTextField txtApellidoProveedor) {
        this.txtApellidoProveedor = txtApellidoProveedor;
    }

    public JTextField getTxtCantidadProducto() {
        return txtCantidadProducto;
    }

    public void setTxtCantidadProducto(JTextField txtCantidadProducto) {
        this.txtCantidadProducto = txtCantidadProducto;
    }

    public JTextField getTxtDireccionEmpleado() {
        return txtDireccionEmpleado;
    }

    public void setTxtDireccionEmpleado(JTextField txtDireccionEmpleado) {
        this.txtDireccionEmpleado = txtDireccionEmpleado;
    }

    public JTextField getTxtDireccionProveedor() {
        return txtDireccionProveedor;
    }

    public void setTxtDireccionProveedor(JTextField txtDireccionProveedor) {
        this.txtDireccionProveedor = txtDireccionProveedor;
    }

    public JTextField getTxtESCantidad() {
        return txtESCantidad;
    }

    public void setTxtESCantidad(JTextField txtESCantidad) {
        this.txtESCantidad = txtESCantidad;
    }

    public JTextField getTxtESIdEmpleado() {
        return txtESIdEmpleado;
    }

    public void setTxtESIdEmpleado(JTextField txtESIdEmpleado) {
        this.txtESIdEmpleado = txtESIdEmpleado;
    }

    public JTable getTablaMovimientos() {
        return tablaMovimientos;
    }

    public void setTablaMovimientos(JTable tablaMovimientos) {
        this.tablaMovimientos = tablaMovimientos;
    }

    public JTextField getTxtESIdProducto() {
        return txtESIdProducto;
    }

    public void setTxtESIdProducto(JTextField txtESIdProducto) {
        this.txtESIdProducto = txtESIdProducto;
    }

   
    public JTextField getTxtMarcaArticulo() {
        return txtMarcaArticulo;
    }

    public void setTxtMarcaArticulo(JTextField txtMarcaArticulo) {
        this.txtMarcaArticulo = txtMarcaArticulo;
    }

    public JTextField getTxtMinimoProducto() {
        return txtMinimoProducto;
    }

    public void setTxtMinimoProducto(JTextField txtMinimoProducto) {
        this.txtMinimoProducto = txtMinimoProducto;
    }

    public JTextField getTxtNombreCompania() {
        return txtNombreCompania;
    }

    public void setTxtNombreCompania(JTextField txtNombreCompania) {
        this.txtNombreCompania = txtNombreCompania;
    }

    public JTextField getTxtNombreEmpleado() {
        return txtNombreEmpleado;
    }

    public void setTxtNombreEmpleado(JTextField txtNombreEmpleado) {
        this.txtNombreEmpleado = txtNombreEmpleado;
    }
    
    public JTextField getTxtNombreProveedor() {
        return txtNombreProveedor;
    }

    public void setTxtNombreProveedor(JTextField txtNombreProveedor) {
        this.txtNombreProveedor = txtNombreProveedor;
    }

    public JTextField getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(JTextField txtPassword) {
        this.txtPassword = txtPassword;
    }

    public JTextField getTxtPrecioCompra() {
        return txtPrecioCompra;
    }

    public void setTxtPrecioCompra(JTextField txtPrecioCompra) {
        this.txtPrecioCompra = txtPrecioCompra;
    }
  
    public JTextField getTxtTelefonoEmpleado() {
        return txtTelefonoEmpleado;
    }

    public void setTxtTelefonoEmpleado(JTextField txtTelefonoEmpleado) {
        this.txtTelefonoEmpleado = txtTelefonoEmpleado;
    }

    public JTextField getTxtTelefonoProveedor() {
        return txtTelefonoProveedor;
    }

    public void setTxtTelefonoProveedor(JTextField txtTelefonoProveedor) {
        this.txtTelefonoProveedor = txtTelefonoProveedor;
    }

    public JComboBox getCbxCiudadE() {
        return cbxCiudadE;
    }

    public void setCbxCiudadE(JComboBox cbxCiudadE) {
        this.cbxCiudadE = cbxCiudadE;
    }

    public JComboBox getCbxTallaProducto() {
        return cbxTallaProducto;
    }

    public void setCbxTallaProducto(JComboBox cbxTallaProducto) {
        this.cbxTallaProducto = cbxTallaProducto;
    }

    public JComboBox getCbxCiudadP() {
        return cbxCiudadP;
    }

    public void setCbxCiudadP(JComboBox cbxCiudadP) {
        this.cbxCiudadP = cbxCiudadP;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelInventarios = new javax.swing.JTabbedPane();
        panelEmpleados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JTextField();
        txtApellidoEmplado = new javax.swing.JTextField();
        txtDireccionEmpleado = new javax.swing.JTextField();
        txtTelefonoEmpleado = new javax.swing.JTextField();
        btnBorrarEmpleado = new javax.swing.JButton();
        btnIngresarEmpleado = new javax.swing.JButton();
        cbxCiudadE = new javax.swing.JComboBox();
        txtPassword = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        panelProveedores = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombreCompania = new javax.swing.JTextField();
        txtNombreProveedor = new javax.swing.JTextField();
        txtApellidoProveedor = new javax.swing.JTextField();
        txtDireccionProveedor = new javax.swing.JTextField();
        cbxCiudadP = new javax.swing.JComboBox();
        txtTelefonoProveedor = new javax.swing.JTextField();
        btnBorrarProveedor = new javax.swing.JButton();
        btnIngresarProveedor = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        panelProductos = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtMarcaArticulo = new javax.swing.JTextField();
        txtPrecioCompra = new javax.swing.JTextField();
        btnBorrarProducto = new javax.swing.JButton();
        btnIngresarProducto = new javax.swing.JButton();
        cbxTallaProducto = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        txtCantidadProducto = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtMinimoProducto = new javax.swing.JTextField();
        cbxProveedores = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtProductoDescripcion = new javax.swing.JTextField();
        cbxArticulo = new javax.swing.JComboBox();
        panelInventario = new javax.swing.JPanel();
        btnBuscarConsulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInventario = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        cbxBuscar = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaConsultas = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        panelMovimientos = new javax.swing.JPanel();
        btnEntradaArticulo = new javax.swing.JButton();
        btnSalidaArticulo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaMovimientos = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        txtESIdProducto = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtESCantidad = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtESIdEmpleado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));

        jLabel2.setText("Nombre");

        jLabel3.setText("Direccion");

        jLabel4.setText("Telefono");

        jLabel5.setText("Ciudad");

        jLabel6.setText("Contraseña");

        btnBorrarEmpleado.setText("Reiniciar");

        btnIngresarEmpleado.setText("Ingresar");

        jLabel23.setText("Apellido");

        javax.swing.GroupLayout panelEmpleadosLayout = new javax.swing.GroupLayout(panelEmpleados);
        panelEmpleados.setLayout(panelEmpleadosLayout);
        panelEmpleadosLayout.setHorizontalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEmpleadosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(31, 31, 31)
                        .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                                .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApellidoEmplado, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDireccionEmpleado)
                            .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTelefonoEmpleado, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbxCiudadE, javax.swing.GroupLayout.Alignment.LEADING, 0, 151, Short.MAX_VALUE))))
                    .addGroup(panelEmpleadosLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnBorrarEmpleado)
                        .addGap(38, 38, 38)
                        .addComponent(btnIngresarEmpleado)))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        panelEmpleadosLayout.setVerticalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoEmplado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDireccionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cbxCiudadE, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrarEmpleado)
                    .addComponent(btnIngresarEmpleado))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        panelInventarios.addTab("Empleados", panelEmpleados);

        jLabel7.setText("Compania");

        jLabel8.setText("Nombre");

        jLabel9.setText("Direccion");

        jLabel10.setText("Ciudad");

        jLabel11.setText("Telefono");

        btnBorrarProveedor.setText("Reiniciar");

        btnIngresarProveedor.setText("Ingresar");

        jLabel24.setText("Apellido");

        javax.swing.GroupLayout panelProveedoresLayout = new javax.swing.GroupLayout(panelProveedores);
        panelProveedores.setLayout(panelProveedoresLayout);
        panelProveedoresLayout.setHorizontalGroup(
            panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProveedoresLayout.createSequentialGroup()
                .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProveedoresLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(34, 34, 34)
                        .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelProveedoresLayout.createSequentialGroup()
                                .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel24)
                                .addGap(5, 5, 5)
                                .addComponent(txtApellidoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreCompania, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProveedoresLayout.createSequentialGroup()
                                .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxCiudadP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(145, 145, 145))))
                    .addGroup(panelProveedoresLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnBorrarProveedor)
                        .addGap(87, 87, 87)
                        .addComponent(btnIngresarProveedor)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        panelProveedoresLayout.setVerticalGroup(
            panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProveedoresLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(txtNombreCompania, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbxCiudadP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrarProveedor)
                    .addComponent(btnIngresarProveedor))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        panelInventarios.addTab("Proveedores", panelProveedores);

        jLabel12.setText("Producto");

        jLabel13.setText("Marca");

        jLabel14.setText("Tamaño");

        jLabel15.setText("Precio Compra");

        jLabel16.setText("Proveedor ");

        btnBorrarProducto.setText("Reiniciar");

        btnIngresarProducto.setText("Ingresar");

        jLabel17.setText("Cantidad");

        jLabel22.setText("Stock Minimo");

        jLabel1.setText("Descripcion");

        javax.swing.GroupLayout panelProductosLayout = new javax.swing.GroupLayout(panelProductos);
        panelProductos.setLayout(panelProductosLayout);
        panelProductosLayout.setHorizontalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel22)
                            .addComponent(jLabel16)
                            .addComponent(jLabel1))
                        .addGap(26, 26, 26)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxTallaProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMarcaArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(txtPrecioCompra)
                            .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMinimoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxProveedores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtProductoDescripcion)
                            .addComponent(cbxArticulo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnBorrarProducto)
                        .addGap(82, 82, 82)
                        .addComponent(btnIngresarProducto)))
                .addContainerGap(348, Short.MAX_VALUE))
        );
        panelProductosLayout.setVerticalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtProductoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMarcaArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelProductosLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(cbxTallaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtMinimoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cbxProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrarProducto)
                    .addComponent(btnIngresarProducto))
                .addContainerGap())
        );

        panelInventarios.addTab("Productos", panelProductos);

        btnBuscarConsulta.setText("Buscar");

        tablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaInventario);

        jLabel21.setText("Existencias");

        tablaConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaConsultas);

        jLabel26.setText("Producto");

        javax.swing.GroupLayout panelInventarioLayout = new javax.swing.GroupLayout(panelInventario);
        panelInventario.setLayout(panelInventarioLayout);
        panelInventarioLayout.setHorizontalGroup(
            panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                    .addGroup(panelInventarioLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelInventarioLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addGroup(panelInventarioLayout.createSequentialGroup()
                                .addComponent(cbxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelInventarioLayout.setVerticalGroup(
            panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInventarioLayout.createSequentialGroup()
                .addGroup(panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInventarioLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarConsulta)
                            .addComponent(cbxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInventarioLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        panelInventarios.addTab("Inventario", panelInventario);

        btnEntradaArticulo.setText("Entrada");

        btnSalidaArticulo.setText("Salida");

        tablaMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaMovimientos);

        jLabel27.setText("Articulo Id");

        jLabel28.setText("Cantidad");

        jLabel29.setText("Id Empleado");

        javax.swing.GroupLayout panelMovimientosLayout = new javax.swing.GroupLayout(panelMovimientos);
        panelMovimientos.setLayout(panelMovimientosLayout);
        panelMovimientosLayout.setHorizontalGroup(
            panelMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovimientosLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelMovimientosLayout.createSequentialGroup()
                        .addGroup(panelMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelMovimientosLayout.createSequentialGroup()
                                .addComponent(btnEntradaArticulo)
                                .addGap(59, 59, 59)
                                .addComponent(btnSalidaArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel29)
                            .addComponent(jLabel28))
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(panelMovimientosLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(37, 37, 37)
                        .addGroup(panelMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtESCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(txtESIdProducto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtESIdEmpleado, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(468, 468, 468))))
        );
        panelMovimientosLayout.setVerticalGroup(
            panelMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovimientosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtESIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtESCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtESIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntradaArticulo)
                    .addComponent(btnSalidaArticulo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        panelInventarios.addTab("Entradas Salidas", panelMovimientos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelInventarios, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelInventarios, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
  
  
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarEmpleado;
    private javax.swing.JButton btnBorrarProducto;
    private javax.swing.JButton btnBorrarProveedor;
    private javax.swing.JButton btnBuscarConsulta;
    private javax.swing.JButton btnEntradaArticulo;
    private javax.swing.JButton btnIngresarEmpleado;
    private javax.swing.JButton btnIngresarProducto;
    private javax.swing.JButton btnIngresarProveedor;
    private javax.swing.JButton btnSalidaArticulo;
    private javax.swing.JComboBox cbxArticulo;
    private javax.swing.JComboBox cbxBuscar;
    private javax.swing.JComboBox cbxCiudadE;
    private javax.swing.JComboBox cbxCiudadP;
    private javax.swing.JComboBox cbxProveedores;
    private javax.swing.JComboBox cbxTallaProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelEmpleados;
    private javax.swing.JPanel panelInventario;
    private javax.swing.JTabbedPane panelInventarios;
    private javax.swing.JPanel panelMovimientos;
    private javax.swing.JPanel panelProductos;
    private javax.swing.JPanel panelProveedores;
    private javax.swing.JTable tablaConsultas;
    private javax.swing.JTable tablaInventario;
    private javax.swing.JTable tablaMovimientos;
    private javax.swing.JTextField txtApellidoEmplado;
    private javax.swing.JTextField txtApellidoProveedor;
    private javax.swing.JTextField txtCantidadProducto;
    private javax.swing.JTextField txtDireccionEmpleado;
    private javax.swing.JTextField txtDireccionProveedor;
    private javax.swing.JTextField txtESCantidad;
    private javax.swing.JTextField txtESIdEmpleado;
    private javax.swing.JTextField txtESIdProducto;
    private javax.swing.JTextField txtMarcaArticulo;
    private javax.swing.JTextField txtMinimoProducto;
    private javax.swing.JTextField txtNombreCompania;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtProductoDescripcion;
    private javax.swing.JTextField txtTelefonoEmpleado;
    private javax.swing.JTextField txtTelefonoProveedor;
    // End of variables declaration//GEN-END:variables

    // Limpia y genera lista de LosComboBox
   public void cargarCbx(){
       
            cbxCiudadE.removeAllItems();
            cbxCiudadE.addItem("");
            cbxCiudadE.addItem("Ajijic");
            cbxCiudadE.addItem("Chapala");
            cbxCiudadE.addItem("Cocula");
            cbxCiudadE.addItem("Guadalajara");
            cbxCiudadE.addItem("Jocotepec");
            cbxCiudadE.addItem("Lagos de Moreno");
            cbxCiudadE.addItem("Puerto Vallarta");
            cbxCiudadE.addItem("Tequila");
            cbxCiudadE.addItem("Tlajomulco");
            cbxCiudadE.addItem("Tlaquepaque");
            cbxCiudadE.addItem("Tonala");
            cbxCiudadE.addItem("Zapopan");
            
            cbxCiudadP.removeAllItems();
            cbxCiudadP.addItem("");
            cbxCiudadP.addItem("Ajijic");
            cbxCiudadP.addItem("Chapala");
            cbxCiudadP.addItem("Cocula");
            cbxCiudadP.addItem("Guadalajara");
            cbxCiudadP.addItem("Jocotepec");
            cbxCiudadP.addItem("Lagos de Moreno");
            cbxCiudadP.addItem("Puerto Vallarta");
            cbxCiudadP.addItem("Tequila");
            cbxCiudadP.addItem("Tlajomulco");
            cbxCiudadP.addItem("Tlaquepaque");
            cbxCiudadP.addItem("Tonala");
            cbxCiudadP.addItem("Zapopan");
            
            cbxTallaProducto.removeAllItems();
            cbxTallaProducto.addItem("");
            cbxTallaProducto.addItem("S");
            cbxTallaProducto.addItem("M");
            cbxTallaProducto.addItem("L");
            cbxTallaProducto.addItem("XL");
            cbxTallaProducto.addItem("2");
            cbxTallaProducto.addItem("3");
            cbxTallaProducto.addItem("3.5");
            cbxTallaProducto.addItem("4");
            cbxTallaProducto.addItem("4.5");
            cbxTallaProducto.addItem("5");
            cbxTallaProducto.addItem("5.5");
            cbxTallaProducto.addItem("6");
            cbxTallaProducto.addItem("6.5");
            cbxTallaProducto.addItem("7");
            cbxTallaProducto.addItem("7.5");
            cbxTallaProducto.addItem("8");
            cbxTallaProducto.addItem("8.5");
            
            
            cbxArticulo.removeAllItems();
            cbxArticulo.addItem("");
            cbxArticulo.addItem("Sweter");
            cbxArticulo.addItem("Chamarra");
            cbxArticulo.addItem("camisa");
            cbxArticulo.addItem("Pantalon");
            cbxArticulo.addItem("Vestido");
            cbxArticulo.addItem("Falda");            
            cbxArticulo.addItem("Bota");
            cbxArticulo.addItem("Sandalia");
            cbxArticulo.addItem("Zapato");
            cbxArticulo.addItem("Tenis");
            cbxArticulo.addItem("Tacon");
            
            cbxBuscar.removeAllItems();
            cbxBuscar.addItem("");
            cbxBuscar.addItem("Sweter");
            cbxBuscar.addItem("Chamarra");
            cbxBuscar.addItem("camisa");
            cbxBuscar.addItem("Pantalon");
            cbxBuscar.addItem("Vestido");
            cbxBuscar.addItem("Falda");            
            cbxBuscar.addItem("Bota");
            cbxBuscar.addItem("Sandalia");
            cbxBuscar.addItem("Zapato");
            cbxBuscar.addItem("Tenis");
            cbxBuscar.addItem("Tacon");
            
   }
   
    
   
   public void cargaProveedores() {   
        Conecta();
        try {  
            String sql ="Select nombreComercial from proovedor;";
            Statement st= conecta.createStatement();
            ResultSet rs=st.executeQuery(sql);
            cbxProveedores.removeAllItems();
            while(rs.next()){    
                cbxProveedores.addItem(rs.getString(1));
            }   
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   public void cargaTipoArticulo() {   
        Conecta();
        try {  
            String sql ="Select tipo from tipo_articulo;";
            Statement st= conecta.createStatement();
            ResultSet rs=st.executeQuery(sql);
            cbxArticulo.removeAllItems();
            while(rs.next()){    
                cbxArticulo.addItem(rs.getString(1));
            }   
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
  
   
  
   
   public int ObtenerIdADescripcion(String descripcion, String tipo) {
        String id="";
        Conecta();
        try {            
            String sql ="Select IdArticulo from articulo where descripcion = '"+descripcion+"';";           
            Statement st= conecta.createStatement();
            ResultSet rs=st.executeQuery(sql);            
            while(rs.next()){
                id= rs.getString(1);
                break;         
           }
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Integer.parseInt(id);
   }
   
   
   // Obtiene el Id del Proveeedor segun se encuentre en la tabla proovedor
   public int ObtenerIdProvedor(String Nombre) {
        String id="";
        Conecta();
        try {
            
            String sql ="Select IdProovedor from proovedor where nombreComercial = '"+Nombre+"';";
           
            Statement st= conecta.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
                
                id= rs.getString(1);
                break;
                        
            }
               
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Integer.parseInt(id);
   }
   
   
   public void Conecta(){
       conecta = ConexionBD.getConexion();
   }
   
}
