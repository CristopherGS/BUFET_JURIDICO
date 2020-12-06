/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Cris
 */
public class Informe {

    public void registroInforme(String nis, String nombre, String monto, String municipio, String fecha, String estado, String comentario) throws SQLException {
        try {
            Conexion sql = new Conexion();
            Connection con = sql.conectarMySQL();
            String sentencia
                    = "insert into informe(NIS, demandado_cliente, monto_reclamado, minicipio_ID, fecha_abogado) values"
                    + "('" + nis + "' , '" + nombre + "','" + monto + "','" + municipio + "','" + fecha + "'," + estado + ",'" + comentario + ")";
            System.out.println("sentencia: " + sentencia);
            Statement stm = con.createStatement();
            int rs = stm.executeUpdate(sentencia);
            if (rs == 1) {
                //Mensaje de que se llenó correctamente y resetear valores
                JOptionPane.showMessageDialog(null, "Infrome Registrado Correctamente", "Correcto",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Corrobore los campos ingresados", "Error",
                    JOptionPane.WARNING_MESSAGE);
        }
    }


}
