/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Santiago
 */
public class ClienteDao {
    JdbcTemplate jdbcTemplate;
    ConectarDB con = new ConectarDB();
    
    public List consultarClienteById(int id){
    
    List cli = new ArrayList();
    this.jdbcTemplate = new JdbcTemplate(con.conectar());
    String sql = "select * from cliente where id =?";
    cli = this.jdbcTemplate.queryForList(sql,id);
    return cli;
    
    
    }
    
    public List consultarClienteByNombre(String nombre){
    
    List cli = new ArrayList();
    this.jdbcTemplate = new JdbcTemplate(con.conectar());
    String sql = "select * from cliente where nombre like '%" + nombre + "%'";
    cli = this.jdbcTemplate.queryForList(sql);
    return cli;
    
}
}