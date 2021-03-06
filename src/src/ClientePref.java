package src;

// @author Jhony_Angulo
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ClientePref {

    public boolean validarExistencia(String cc) {
        boolean insertar = false;
        try {
            Conexion con = new Conexion();
            Connection link = con.conectar();
            String SQL = "SELECT documento FROM tblClientes WHERE documento = ?";
            PreparedStatement pSQL = link.prepareStatement(SQL);
            pSQL.setString(1, cc);
            ResultSet res = pSQL.executeQuery();
            if (!res.next()) {
                insertar = true;
            }
            link.close();
            pSQL.close();
            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error validando existencia\n" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return (insertar);
    }

    public int crearClientePref(String nombre, int tipo, String cc, int telefono, String mail) {
        //Se crean objetos y se abre la conexión a la BDD
        Connection link = null;
        Conexion con = new Conexion();
        String SQL = null;
        //Líneas SQL para insertar datos
        SQL = "INSERT INTO tblClientes(idCliente, nombre, tipo, documento, telefono, email, hospedaje)"
                + "VALUES (DEFAULT,?,?,?,?,?,0)";
        //Inserción en la base de datos en la tabla tblClientes
        try {
            //Se compila la query y se setean los parámetros a insertar.
            link = con.conectar();
            PreparedStatement pSQL = link.prepareStatement(SQL);
            pSQL.setString(1, nombre);
            pSQL.setInt(2, tipo);
            pSQL.setString(3, cc);
            pSQL.setInt(4, telefono);
            pSQL.setString(5, mail);

            pSQL.executeUpdate();
            pSQL.close();
            //Después de crearlo se pregunta si quiere crear otro y devuelve a la pantalla la opción.

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar almacenar el cliente:\n"
                    + e, "ERROR", JOptionPane.ERROR_MESSAGE);
            // Después de ejecutar la instrucción se cierra la conexión.
        } finally {
            try {
                if (con != null) {
                    link.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al intentar cerrar la conexión:\n"
                        + ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);
            }
        }
        int opc = JOptionPane.showConfirmDialog(null, "Cliente creado exitosamente\n¿Desea crear otro cliente?", "CONFIRMACIÓN", 0, 1);
        return (opc);
    }

    public double generarDescuento(String tipo, double subtotal, String cc) {
        double dctoFinal = 0;
        double dctoSuite = 0.04, dcto1 = 0;
        double dctoEstandar = 0.025, dcto2 = 0;
        double dctoCamaExtra = 0.10, dcto3 = 0;
        int veces = 0;

        try {
            //Se crea la conexión a la BDD y la query que consultará
            Conexion con = new Conexion();
            Connection link = con.conectar();
            String SQL = "SELECT documento, hospedaje FROM tblClientes WHERE documento = ?";
            PreparedStatement pSQL = link.prepareStatement(SQL);
            pSQL.setString(1, cc);
            ResultSet rs = pSQL.executeQuery();
            if (rs.next()) {
                veces = Integer.parseInt(rs.getString("hospedaje"));
            }
            link.close();
            pSQL.close();
            rs.close();
        } catch (Exception e) {
        }

        //Si tiene más de 1 vez que ha ingresado al hotel se calculan los descuentos, sino no aplican y quedan en 0
        if (veces > 1) {
            if (tipo == "Suite") {
                dcto1 = subtotal * dctoSuite;
            } else if (tipo == "Estándar") {
                dcto2 = subtotal * dctoEstandar;
            } else {
                dcto3 = subtotal * dctoCamaExtra;
            }
        }

        dctoFinal = dcto1 + dcto2 + dcto3;
        return (dctoFinal);
    }

    public DefaultTableModel mostrarClientes() {
        //Se crea conexión y la query para consultar en BDD los clientes.
        DefaultTableModel modelo = new DefaultTableModel();
        Connection link = null;
        Conexion con = new Conexion();
        String SQL = "SELECT nombre,\n"
                + "CASE WHEN tipo = 1 THEN \"Cédula de ciudadanía\"\n"
                + "     WHEN tipo = 2 THEN \"Cédula extranjería\"\n"
                + "     WHEN tipo = 3 THEN \"Pasaporte\" END as tipo,documento,telefono,email, hospedaje FROM tblclientes";
        try {
            //Se compila la sentencia SQL
            link = con.conectar();
            PreparedStatement pSQL = link.prepareStatement(SQL);
            //Se almacena el resultado en un resultset
            ResultSet res = pSQL.executeQuery(SQL);
            ModeloTabla mt = new ModeloTabla();
            //Se pasa el result set a la clase ModeloTabla para que sea transformado en un modelo para la grid que es lo que se retornará.
            modelo = mt.generarModelo(res);

            res.close();
            link.close();
            pSQL.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al momento de cargar la grid de clientes\n" + e, "ALERTA", JOptionPane.ERROR_MESSAGE);
        }
        return (modelo);
    }

    public DefaultTableModel buscarCliente(String cc) {
        //Se crea la conexión y la sentencia SQL para la BDD
        DefaultTableModel modelo = new DefaultTableModel();
        String SQL = "SELECT nombre,\n"
                + "CASE WHEN tipo = 1 THEN \"Cédula de ciudadanía\"\n"
                + "     WHEN tipo = 2 THEN \"Cédula extranjería\"\n"
                + "     WHEN tipo = 3 THEN \"Pasaporte\" END as tipo,documento,telefono,email, hospedaje FROM tblclientes WHERE documento = ?";
        try {
            //Se hace la consulta
            Conexion con = new Conexion();
            Connection link = con.conectar();
            PreparedStatement pSQL = link.prepareStatement(SQL);
            pSQL.setString(1, cc);
            // se almacena el resultado en un resultset
            ResultSet rs = pSQL.executeQuery();
            ModeloTabla mt = new ModeloTabla();
            //Se pasa result set a ModeloTabla
            modelo = mt.generarModelo(rs);
            /*if (rs.next()) {
                ModeloTabla mt = new ModeloTabla();
                modelo = mt.generarModelo(rs);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún cliente con el documento: " + cc, "ALERTA", JOptionPane.ERROR_MESSAGE);
            }*/

            //Se cierran las variables de conexiones
            link.close();
            rs.close();
            pSQL.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se ha presentado un error generando la búsqueda\n" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return (modelo);
    }

}
