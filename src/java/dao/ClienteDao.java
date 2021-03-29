/*
 * En esta clase clienteDao tiene ina comunicacion directa con la clase conectarDB
 * La esta clase tiene dos metodos un para consultar cliente por id y otro consultar
 * cliente por nombre que despues se comunica con el controller.homecontroller en la linea 49
 * para el control de el formulario Formconsultar.jsp
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *@version 1.0
 * @author Santiago
 * @since 10 marzo 2021
 */
public class ClienteDao {
    JdbcTemplate jdbcTemplate;
    ConectarDB con = new ConectarDB();
    
    /**
     *
     * @param id
     * @return
     */
    public List consultarClienteById(int id){
    
    List cli = new ArrayList();
    this.jdbcTemplate = new JdbcTemplate(con.conectar());
    String sql = "select * from cliente where id =?";
    cli = this.jdbcTemplate.queryForList(sql,id);
    return cli;
    
    
    }
    
    /**
     *
     * @param nombre
     * @return
     */
    public List consultarClienteByNombre(String nombre){
    
    List cli = new ArrayList();
    this.jdbcTemplate = new JdbcTemplate(con.conectar());
    String sql = "select * from cliente where nombre like '%" + nombre + "%'";
    cli = this.jdbcTemplate.queryForList(sql);
    return cli;
     
}
}