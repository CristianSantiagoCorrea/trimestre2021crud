/**
 * esta es la conexion a la base de datos de momento no tiene contraseña
 * @author Santiago
 */

package dao;


import org.springframework.jdbc.datasource.DriverManagerDataSource;
   
/**
 *@version 1.0
 * @author Santiago
 * @since 10 marzo 2021
 */
public class ConectarDB {

    /**
     *
     * @return
     */
    public DriverManagerDataSource conectar(){
    
    DriverManagerDataSource datasource = new DriverManagerDataSource();
            datasource.setDriverClassName("com.mysql.jdbc.Driver");
            datasource.setUrl("jdbc:mysql://localhost:3306/prueba");
            datasource.setUsername("root");
            datasource.setPassword("") ;  
            return datasource;
    }
}
