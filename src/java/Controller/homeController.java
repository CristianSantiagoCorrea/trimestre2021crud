package Controller;

import dao.ConectarDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;


import dao.ClienteDao;
import models.Cliente;
import models.clienteValidation;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *@version 1.0
 * @author Santiago
 * @since 10 marzo 2021
 */
@Controller
public class homeController {
    
    
    private JdbcTemplate jdbcTemplate;
         clienteValidation cliValidar;

    /**
     *
     */
    public homeController() {
        this.cliValidar = new clienteValidation();
        ConectarDB con = new ConectarDB();
        this.jdbcTemplate = new  JdbcTemplate(con.conectar());
        
    }
    
    //-------------------------------------------------//

    /**
     *
     * @return
     */
    @RequestMapping(value = "formConsultarCliente.htm", method = RequestMethod.GET)
    public ModelAndView consultarClientexNombre(){
    ModelAndView mov = new ModelAndView();
    Cliente cliente = new Cliente();
    mov.addObject("cliente",cliente);
    mov.setViewName("views/formConsultarCliente");
    return mov;
        
    } 

    /**
     *
     * @param cli cliente
     * @param result resultado
     * @param status
     * @return
     */
    @RequestMapping(value = "formConsultarCliente.htm", method = RequestMethod.POST)
    public ModelAndView consultarClientexNombre(
    @ModelAttribute("cliente")Cliente cli,
      BindingResult result,
      SessionStatus status 
            ){
         ModelAndView mav = new ModelAndView();
         
        ClienteDao cliDao = new  ClienteDao();
         
                String nom = cli.getNombre();
          
                   mav.addObject("cliente",cliDao.consultarClienteByNombre(nom));
               mav.setViewName("views/listarClientes");
                 return mav;
    }
     
   
    
    
    
    //--------------------------------------------------//

    /**
     *
     * @return
     */
    
    
    
    @RequestMapping(value = "formCliente.htm", method = RequestMethod.GET)
    public ModelAndView homeCliente(){
    ModelAndView mov = new ModelAndView();
    Cliente cliente = new Cliente();
    mov.addObject("cliente",cliente);
    mov.setViewName("views/formCliente");
    return mov;
      
    } 

    /**
     *
     * @return
     */
    @RequestMapping(value = "formCliente.htm", method = RequestMethod.POST)
    public ModelAndView homeClientePOST(){
    ModelAndView mov = new ModelAndView();
   
    try{
     String sql = "select * from cliente";
    List datos = this.jdbcTemplate.queryForList(sql);
     mov.addObject("cliente",datos);
    }catch(Exception ex){
    
    System.out.println("Error en la conexion:" + ex);
    }
    
   
    mov.setViewName("views/mostrarCliente");
    return mov;
        
    } 
    
    /**
     *
     * @return
     */
    @RequestMapping(value = "agregarCliente.htm", method = RequestMethod.GET)
    public ModelAndView agregarCliente(){
    ModelAndView mov = new ModelAndView();
    Cliente cliente = new Cliente();
    mov.addObject("cliente",cliente);
    mov.setViewName("views/formCliente");
    return mov;
} 

    /**
     *
     * @param cli
     * @return
     */
    @RequestMapping(value = "agregarCliente.htm", method = RequestMethod.POST)
    public ModelAndView agregarCliente(Cliente cli){
     ModelAndView mov = new ModelAndView();
    try{
    String sql = "INSERT INTO CLIENTE (NOMBRE,APELLIDO,CORREO,EDAD)" + "VALUES(?,?,?,?);";
    this.jdbcTemplate.update(sql,cli.getNombre(),cli.getApellido(),cli.getCorreo(),cli.getEdad());
    }catch(Exception ex){
    System.out.println("Error en la conexion:" + ex); 
    }
    mov.setViewName("redirect:/formCliente.htm");
    return mov;
    }
    
    /*
    @RequestMapping(value = "actCliente.htm", method = RequestMethod.GET)
    public ModelAndView actCliente(HttpServletRequest request){
    ModelAndView mov = new ModelAndView();
    int id =Integer.parseInt( request.getParameter("id"));
    String sql = "select * from cliente where id= ?";
    List datos = this.jdbcTemplate.queryForList(sql, id);
    mov.addObject("cliente",datos);
    mov.setViewName("views/actCliente");
    return mov;
}
      
    @RequestMapping(value = "actCliente.htm", method = RequestMethod.POST)
    public ModelAndView actCliente(Cliente c){
     ModelAndView mov = new ModelAndView();
    try{    
    String sql = "update cliente set nombre = ?, apellido = ?, correo= ?,edad=? where id = ?";
    this.jdbcTemplate.update(sql, c.getNombre(),c.getApellido(),c.getCorreo(),c.getEdad(),c.getId());
    mov.setViewName("redirect:/formCliente.htm");
    }catch(Exception e){
          
           System.out.println("Error" + e.getMessage());
            } 
    return mov;
    
   }
*/
    
    /**
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "actCliente.htm", method = RequestMethod.GET)
    public ModelAndView actCliente(HttpServletRequest request){
    ModelAndView mav = new ModelAndView();
    int id =Integer.parseInt( request.getParameter("id"));
    Cliente cli = this.cargarClientebyId(id);
    mav.addObject("cliente", new Cliente (id, cli.getNombre(),
    cli.getApellido(),cli.getCorreo(),cli.getEdad()));
    mav.setViewName("views/actCliente");
        return mav;
    }
    
    
    //=========================================================================

    /**
     *
     * @param cli
     * @param result
     * @param status
     * @return
     */
    @RequestMapping(value = "actCliente.htm", method = RequestMethod.POST)
    public ModelAndView actCliente(
    @ModelAttribute("cliente")Cliente cli,
            BindingResult result,
            SessionStatus status
    ){
        this.cliValidar.validate(cli,result);
        if(result.hasErrors()){
     ModelAndView mov = new ModelAndView();
        mov.addObject("cliente", new Cliente());
        mov.setViewName("views/actCliente");
       return mov; 
    }else{   
     ModelAndView mav = new ModelAndView();   
    String sql = "update cliente set nombre = ?, apellido = ?, correo = ?, edad = ? where id = ?";
    this.jdbcTemplate.update(
            sql, 
            cli.getNombre(),
            cli.getApellido(),
            cli.getCorreo(),
            cli.getEdad(),
            cli.getId());
        mav.setViewName("redirect:/formCliente.htm");
     return mav;   
    }
    }
    
    /**
     *
     * @param id
     * @return
     */
    public Cliente cargarClientebyId(int id){
        final Cliente cli = new Cliente();
        
        
        String sql ="select * from cliente where id = " + id;
        
        
        return(Cliente) jdbcTemplate.query(sql,new ResultSetExtractor<Cliente>()
        {
        
            public Cliente extractData (ResultSet rs)throws SQLException, DataAccessException{
            if(rs.next()){
            cli.setId(rs.getInt("id"));
            cli.setNombre(rs.getString("nombre"));
            cli.setApellido(rs.getString("apellido"));
            cli.setCorreo(rs.getString("correo"));
            cli.setEdad(rs.getInt("edad"));
                      
            
            }
            
            return cli;
            
            
            }
            
            
        
        });
    }
    
    /**
     *
     * @param request
     * @return
     */
    @RequestMapping("borrarCliente.htm")
    public ModelAndView borrarCliente(HttpServletRequest request){
    ModelAndView mov = new ModelAndView();
    try{
    int id =Integer.parseInt( request.getParameter("id"));
       
    String sql = "delete from cliente where id = ?";
    this.jdbcTemplate.update(sql, id);
    }catch(Exception e){
    
    System.out.println("Error" + e);
    
    }
    
    
     mov.setViewName("redirect:/formCliente.htm");
    return mov;
    
    
    
    
    }
   
    /**
     *
     * @return
     */
    @RequestMapping(value="listarClientes.htm", method=RequestMethod.GET)
    public ModelAndView listarClientesid(){
    ModelAndView mov = new ModelAndView();
    Cliente cliente = new Cliente();
    mov.setViewName("views/listarClientes");
    return mov;
       
    
    
    }
    
}  
    
    

   
    

