/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Vehiculo {
    ArrayList <Auto> listauto=new ArrayList();
    ArrayList <moto> moto;
    public void auto(){

       
    }
        public void connect(String placa, String Propietario, String tipo, int Servicio, int precio){
         
    String url = "jdbc:mysql://localhost:3306/empresa";
    String user = "root";
    String pass = "";
System.out.println("iniciamos Conecccion ...");
    try(Connection connection = (Connection) DriverManager.getConnection(url, user,pass)){
        System.out.println("Conectado!!");
        
System.out.println("vamos a Insertar un registro ...");
        
        Statement s = connection.createStatement();
        String query1 = "insert into servicios (placa, propietario, Tipo_Vehiculo, Cambio_de_aceite, Precio) value ('"+placa+"','"+Propietario+"','"+tipo+"','"+Servicio+"','"+precio+"')";
        s.executeUpdate(query1);
    /*    
        String query = "select * from user";
        ResultSet r = s.executeQuery(query);
        while (r.next()) {
                System.out.println(
                         "Nombre: " + r.getString("username") + " " 
                        + "pasword: " + r.getString("password"));
            }
/*        
        System.out.println("\n\n otra consulta");
        query = "select * from user where password =1234";
        r = s.executeQuery(query);
        while (r.next()) {
                System.out.println(
                         "Nombre: " + r.getString("username") + " " 
                        + "pasword: " + r.getString("password"));
            }
        
        System.out.println("\n\n borrando un registro");
        String Query = "DELETE FROM user WHERE password =2332";
        Statement st = connection.createStatement();
        st.executeUpdate(Query);

        query = "select * from user";
        r = s.executeQuery(query);
        while (r.next()) {
                System.out.println(
                         "Nombre: " + r.getString("username") + " " 
                        + "pasword: " + r.getString("password"));
            }
*/
        connection.close();
} catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        }

    }

}
