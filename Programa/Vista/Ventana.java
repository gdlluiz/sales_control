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

    public JComboBox getCbxProveedores() {
        return cbxProveedores;
    }

    public void setCbxProveedores(JComboBox cbxProveedores) {
        this.cbxProveedores = cbxProveedores;
    }

    public JButton getBtnBorrarBusqueda() {
        return btnBorrarBusqueda;
    }

    public void setBtnBorrarBusqueda(JButton btnBorrarBusqueda) {
        this.btnBorrarBusqueda = btnBorrarBusqueda;
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
        return btnBuscarInventario;
    }

    public void setBtnBuscarInventario(JButton btnBuscarInventario) {
        this.btnBuscarInventario = btnBuscarInventario;
    }

    public JButton getBtnClearArticulo() {
        return btnClearArticulo;
    }

    public void setBtnClearArticulo(JButton btnClearArticulo) {
        this.btnClearArticulo = btnClearArticulo;
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

    public JComboBox getCbxArticulo() {
        return cbxArticulo;
    }

    public void setCbxArticulo(JComboBox cbxArticulo) {
        this.cbxArticulo = cbxArticulo;
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

    public JTextField getTxtPoductoIdInventario() {
        return txtPoductoIdInventario;
    }

    public void setTxtPoductoIdInventario(JTextField txtPoductoIdInventario) {
        this.txtPoductoIdInventario = txtPoductoIdInventario;
    }

    public JTextField getTxtPrecioCompra() {
        return txtPrecioCompra;
    }

    public void setTxtPrecioCompra(JTextField txtPrecioCompra) {
        this.txtPrecioCompra = txtPrecioCompra;
    }

    public JTextField getTxtProductoExistenciaInventario() {
        return txtProductoExistenciaInventario;
    }

    public void setTxtProductoExistenciaInventario(JTextField txtProductoExistenciaInventario) {
        this.txtProductoExistenciaInventario = txtProductoExistenciaInventario;
    }

    public JTextField getTxtProductoInventario() {
        return txtProductoInventario;
    }

    public void setTxtProductoInventario(JTextField txtProductoInventario) {
        this.txtProductoInventario = txtProductoInventario;
    }

    public JTextField getTxtProductoMinimoInventario() {
        return txtProductoMinimoInventario;
    }

    public void setTxtProductoMinimoInventario(JTextField txtProductoMinimoInventario) {
        this.txtProductoMinimoInventario = txtProductoMinimoInventario;
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
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
        jPanel3 = new javax.swing.JPanel();
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
        jPanel4 = new javax.swing.JPanel();
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
        cbxArticulo = new javax.swing.JComboBox();
        cbxProveedores = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtProductoMinimoInventario = new javax.swing.JTextField();
        txtProductoExistenciaInventario = new javax.swing.JTextField();
        txtProductoInventario = new javax.swing.JTextField();
        txtPoductoIdInventario = new javax.swing.JTextField();
        rdoId = new javax.swing.JRadioButton();
        rdoExistencia = new javax.swing.JRadioButton();
        rdoMinimo = new javax.swing.JRadioButton();
        rdoProducto = new javax.swing.JRadioButton();
        btnBorrarBusqueda = new javax.swing.JButton();
        btnBuscarInventario = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtESIdProducto = new javax.swing.JTextField();
        txtESCantidad = new javax.swing.JTextField();
        txtESIdEmpleado = new javax.swing.JTextField();
        btnEntradaArticulo = new javax.swing.JButton();
        btnSalidaArticulo = new javax.swing.JButton();
        btnClearArticulo = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));

        jLabel2.setText("Nombre");

        jLabel3.setText("Direccion");

        jLabel4.setText("Telefono");

        jLabel5.setText("Ciudad");

        jLabel6.setText("Contraseña");

        btnBorrarEmpleado.setText("Reiniciar");

        btnIngresarEmpleado.setText("Ingresar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtApellidoEmplado, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtDireccionEmpleado))
                            .addComponent(cbxCiudadE, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnBorrarEmpleado)
                        .addGap(38, 38, 38)
                        .addComponent(btnIngresarEmpleado)))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoEmplado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDireccionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cbxCiudadE, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrarEmpleado)
                    .addComponent(btnIngresarEmpleado))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Empleados", jPanel2);

        jLabel7.setText("Compania");

        jLabel8.setText("Nombre");

        jLabel9.setText("Direccion");

        jLabel10.setText("Ciudad");

        jLabel11.setText("Telefono");

        btnBorrarProveedor.setText("Reiniciar");

        btnIngresarProveedor.setText("Ingresar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombreCompania, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtApellidoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtDireccionProveedor)
                                .addComponent(cbxCiudadP, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnBorrarProveedor)
                        .addGap(87, 87, 87)
                        .addComponent(btnIngresarProveedor)))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(txtNombreCompania, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbxCiudadP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrarProveedor)
                    .addComponent(btnIngresarProveedor))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Proveedores", jPanel3);

        jLabel12.setText("Producto");

        jLabel13.setText("Marca");

        jLabel14.setText("Tamaño");

        jLabel15.setText("Precio Compra");

        jLabel16.setText("Proveedor ");

        btnBorrarProducto.setText("Reiniciar");

        btnIngresarProducto.setText("Ingresar");

        jLabel17.setText("Cantidad");

        jLabel22.setText("Stock Minimo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel22)
                            .addComponent(jLabel16))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMarcaArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(txtPrecioCompra)
                            .addComponent(cbxTallaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMinimoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxArticulo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxProveedores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnBorrarProducto)
                        .addGap(84, 84, 84)
                        .addComponent(btnIngresarProducto)))
                .addContainerGap(331, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbxArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtMarcaArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbxTallaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtMinimoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cbxProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrarProducto)
                    .addComponent(btnIngresarProducto))
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Productos", jPanel4);

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));

        jLabel23.setText("Id Producto");

        jLabel24.setText("Producto");

        jLabel25.setText("Existencia");

        jLabel26.setText("Stock Minimo");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel23)
                        .addComponent(jLabel24)
                        .addComponent(jLabel25)
                        .addComponent(jLabel26))
                    .addGap(28, 28, 28)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtPoductoIdInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                        .addComponent(txtProductoInventario)
                        .addComponent(txtProductoExistenciaInventario)
                        .addComponent(txtProductoMinimoInventario))
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel23)
                        .addComponent(txtPoductoIdInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(txtProductoInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(txtProductoExistenciaInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(11, 11, 11)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(txtProductoMinimoInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(24, Short.MAX_VALUE)))
        );

        rdoId.setText("Id");

        rdoExistencia.setText("Existencia");

        rdoMinimo.setText("Stock Minimo");

        rdoProducto.setText("Producto");

        btnBorrarBusqueda.setText("Reiniciar");

        btnBuscarInventario.setText("Buscar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnBorrarBusqueda)
                        .addGap(89, 89, 89)
                        .addComponent(btnBuscarInventario))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoExistencia)
                            .addComponent(rdoProducto))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoId)
                            .addComponent(rdoMinimo))
                        .addGap(46, 46, 46)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoId)
                            .addComponent(rdoProducto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoExistencia)
                            .addComponent(rdoMinimo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrarBusqueda)
                    .addComponent(btnBuscarInventario))
                .addGap(57, 57, 57))
        );

        jTabbedPane1.addTab("Inventario", jPanel5);

        jLabel18.setText("Articulo Id");

        jLabel19.setText("Cantidad");

        jLabel20.setText("Id Empleado");

        btnEntradaArticulo.setText("Entrada");

        btnSalidaArticulo.setText("Salida");

        btnClearArticulo.setText("Reiniciar");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtESIdProducto)
                            .addComponent(txtESCantidad)
                            .addComponent(txtESIdEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addGap(81, 81, 81)
                        .addComponent(btnClearArticulo))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnEntradaArticulo)
                        .addGap(68, 68, 68)
                        .addComponent(btnSalidaArticulo)))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtESIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClearArticulo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtESCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtESIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntradaArticulo)
                    .addComponent(btnSalidaArticulo))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Entradas Salidas", jPanel7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Reportes", jPanel8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
  
  
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarBusqueda;
    private javax.swing.JButton btnBorrarEmpleado;
    private javax.swing.JButton btnBorrarProducto;
    private javax.swing.JButton btnBorrarProveedor;
    private javax.swing.JButton btnBuscarInventario;
    private javax.swing.JButton btnClearArticulo;
    private javax.swing.JButton btnEntradaArticulo;
    private javax.swing.JButton btnIngresarEmpleado;
    private javax.swing.JButton btnIngresarProducto;
    private javax.swing.JButton btnIngresarProveedor;
    private javax.swing.JButton btnSalidaArticulo;
    private javax.swing.JComboBox cbxArticulo;
    private javax.swing.JComboBox cbxCiudadE;
    private javax.swing.JComboBox cbxCiudadP;
    private javax.swing.JComboBox cbxProveedores;
    private javax.swing.JComboBox cbxTallaProducto;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rdoExistencia;
    private javax.swing.JRadioButton rdoId;
    private javax.swing.JRadioButton rdoMinimo;
    private javax.swing.JRadioButton rdoProducto;
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
    private javax.swing.JTextField txtPoductoIdInventario;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtProductoExistenciaInventario;
    private javax.swing.JTextField txtProductoInventario;
    private javax.swing.JTextField txtProductoMinimoInventario;
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
            cbxArticulo.addItem("Bota");
            cbxArticulo.addItem("Sandalia");
            cbxArticulo.addItem("Zapato");
            cbxArticulo.addItem("Tenis");
            cbxArticulo.addItem("Tacon");
            
            
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
   
   // aqui me quede
   public void ObtenerIdProvedor(String Nombre) {
        
        Conecta();
        try {
            
            String sql ="Select IdProovedor from proovedor where;";
           
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
   
   
   public void Conecta(){
       conecta = ConexionBD.getConexion();
   }

    
}
