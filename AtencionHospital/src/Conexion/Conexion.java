package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

public final class Conexion {   

    private Connection cn;
    public DataSource datasource;

    public Conexion() {
        conecion();
    }

    public Connection getCn() {
        return cn;
    }

    public Connection conecion() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection("jdbc:sqlserver://KEVIN-PC\\ROOT:1433;DatabaseName=Atencion;", "sa", "sa");
            if (cn == null) {
                System.out.println("no pudo conectarse");
            } else {
                System.out.println("conectado");
            }
        } catch (ClassNotFoundException | SQLException c) {
            System.out.println(c);
        }
        return cn;
    }

    public void ejecutarConsulta(String sql) throws SQLException {
        Statement consulta = cn.createStatement();
        consulta.executeUpdate(sql);
    }

    public ResultSet obtenerConsulta(String sql) throws SQLException {
        Statement consulta = cn.createStatement();
        return consulta.executeQuery(sql);
    }

    public static void main(String[] args) {
        Conexion conect = new Conexion();
    }
}
