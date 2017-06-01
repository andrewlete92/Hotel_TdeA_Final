package src;

import Pantallas.P_Habitaciones;
import com.sun.xml.internal.ws.api.addressing.WSEndpointReference;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import src.Habitaciones;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Hotel {

    Scanner sc = new Scanner(System.in);
    private static ArrayList<Habitaciones> rooms = new ArrayList<>();

    public void generarMenu() {
        String nombreHotel, nit;
        int opc = 0;
        nombreHotel = "HOSTAL EL PASANTE";
        nit = "12345567";
        String banner = "==================";

        System.out.println(banner + " SISTEMA DE INFORMACIÓN " + " " + banner + "\n" + banner + "    " + nombreHotel + "    " + banner);
        System.out.println("1. Reservar\n2. Registrar Ingreso\n3. Imprimir Factura\n4. Cliente Preferencial\n5. Salir");
        System.out.println(banner + banner + banner + "=======    ");
        opc = sc.nextInt();

        switch (opc) {
            case 1:
                //Reserva r = new Reserva();
                //r.GenerarReserva();
                break;
            case 2:
                Ingreso c = new Ingreso();
                c.generarIngreso();
                break;
            case 3:
                //Factura f = new Factura();
                //f.generarFactura();
                break;
            case 4:
                ClientePref cp = new ClientePref();
                //cp.crearClientePref();
                break;
            case 5:
                System.out.println("Gracias por utilizar nuestros servicios, ADIOS");
                System.exit(0);
                break;
            default:
                System.out.println("Esta opción no es válida");
                break;
        }
    }

    /*public void generarHabitaciones() {
        //ArrayList<Habitaciones> rooms = new ArrayList<Habitaciones>();
        Habitaciones ha1 = new Habitaciones(1, "Suite   ", 2, 215000, true);
        rooms.add(ha1);
        //habitazione.add(ha1);
        Habitaciones ha2 = new Habitaciones(2, "Suite   ", 2, 215000, true);
        rooms.add(ha2);
        Habitaciones ha3 = new Habitaciones(3, "Estándar", 2, 132000, true);
        rooms.add(ha3);
        Habitaciones ha4 = new Habitaciones(4, "Estándar", 3, 180000, true);
        rooms.add(ha4);
        Habitaciones ha5 = new Habitaciones(5, "Estándar", 4, 230000, true);
        rooms.add(ha5);
        Habitaciones ha6 = new Habitaciones(6, "Estándar", 4, 230000, true);
        rooms.add(ha6);
    }*/

    public DefaultTableModel mostrarHabitaciones(String fIngreso) {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            String SQL = "SELECT num_habitacion,capacidad, h.tipo_habitacion, \n"
                    +"CASE WHEN r.fecha_ingreso >= ? AND r.fecha_ingreso <= ? THEN 'Ocupada' ELSE 'Disponible' END as estado, precio_noche\n"
                    +"FROM tblHabitaciones h\n"
                    +"LEFT JOIN tblreservas r ON h.num_habitacion = r.numhabitacion";
            Conexion con = new Conexion();
            Connection link = con.conectar();
            PreparedStatement pSQL = link.prepareStatement(SQL);
            pSQL.setString(1, fIngreso);
            pSQL.setString(2, fIngreso);
            ResultSet rs = pSQL.executeQuery();
            ModeloTabla mt = new ModeloTabla();
            modelo = mt.generarModelo(rs);

            link.close();
            pSQL.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al momento de cargar la grid de habitaciones\n" + e, "ALERTA", JOptionPane.ERROR_MESSAGE);
        }
        return(modelo);
    }

    public Object buscarDisponiblidad() {
        Object[] precios = null;
        try {
            String SQL = "";
            Conexion con = new Conexion();
            Connection link = con.conectar();
            PreparedStatement pSQL = link.prepareStatement(SQL);
            ResultSet rs = pSQL.executeQuery();
            int ta = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    precios[i] = rs.getString(i + 1);
                }
            }

        } catch (Exception e) {
        }
        return (precios);
    }

    /*public String mostrarEstado(int pos) {
        String estado = "";
        if (rooms.get(pos).estado == true) {
            estado = "Disponible";
        } else {
            estado = "Ocupada";
        }
        return (estado);
    }*/

 /*System.out.println("Número\tTipo\t\tCapacidad\tPrecioNoche\tEstado");
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).estado == true) {
                estado = "Disponible";
            } else {
                estado = "Ocupada";
            }
            System.out.println(rooms.get(i).numHabitacion + "\t" + rooms.get(i).tipoHabitacion + "\t" + rooms.get(i).Capacidad + " personas\t" + "$ " + (int) rooms.get(i).precioXNoche + "\t" + estado);
        }
        /*Iterator it = rooms.iterator();
        while (it.hasNext()){
        Clientes c = it.next();
            System.out.println(c.nombre,c.cc);
        }*/
 /*public void actualizarEstado(Date checkin) {
        int ha;
        boolean validar = true;
        Reserva r = new Reserva();
        ArrayList<Reservas> re = r.getCliente();
        ArrayList<Reservas> reActivas = new ArrayList<Reservas>();
        Iterator it = re.iterator();
        while (it.hasNext()) {
            Reservas cl = (Reservas) it.next();
            if (cl.estado == "Activa") {
                reActivas.add(cl);
            }
        }
        for (ha = 0; ha <= rooms.size(); ha++) {
            Iterator ir = reActivas.iterator();
            while (it.hasNext() && validar == true) {
                Reservas cl1 = (Reservas) it.next();
                if (cl1.numHabitacion == ha) {
                    if (cl1.fingreso >= checkin && cl1.fsalida <= checkin) {
                        rooms.get(ha).setEstado(false);
                        validar = false;
                    } else {
                        rooms.get(ha).setEstado(true);
                        validar = false;
                    }
                }
            }
        }
        /*if (rooms.get(habitacion).estado == true) {
            rooms.get(1).setEstado(false);
            System.out.println(rooms.get(habitacion).estado);
    }*/
}
