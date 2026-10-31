package pe.edu.pucp.iweb.lab7.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import pe.edu.pucp.iweb.lab7.beans.EquipoRed;
import pe.edu.pucp.iweb.lab7.beans.EquipoSwitch;
import pe.edu.pucp.iweb.lab7.beans.Sede;

public class EquipoDao extends BaseDao{ // TODO 2a: debe heredar de BaseDao

    /**
     * Ejercicio 2c: retorna los equipos de la sede indicada, ordenados por sede y modelo.
     * Si idSede es 0, retorna todos los equipos.
     *
     * Según la columna tipo, cree un objeto EquipoSwitch ('SWITCH') o EquipoAP ('AP').
     * Use PreparedStatement.
     */
    public ArrayList<EquipoRed> listarPorSede(int idSede) {
        ArrayList<EquipoRed> lista = new ArrayList<>();
        // TODO 2c
        String sql = "SELECT s.*, g.modelo"+
                "FROM sede s"+
                "INNER JOIN equipo e ON s.idsede = g.idsede";
        try(Connection conn = this.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            while(rs.next()){
                Sede sede = new Sede();
                sede.setIdSede(rs.getInt("id"));
                sede.setNombre(rs.getString("nombre"));

                EquipoSwitch equipoSwitch = new EquipoSwitch();
                equipoSwitch.setIdEquipo(rs.getInt("idequipo"));
                equipoSwitch.setModelo(rs.getString("modelo"));
                equipoSwitch.setCantidad(rs.getDouble("cantidad"));


                libro.setGenero(genero);

                lista.add(libro);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }


        return lista;
    }
}
