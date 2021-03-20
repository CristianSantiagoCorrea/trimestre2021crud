package Controller;

import dao.ConectarDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
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

@Controller
public class homeController {
    
    
    private JdbcTemplate jdbcTemplate;
         clienteValidation cliValidar;

    
    public homeController() {
        this.cliValidar = new clienteValidation();
        ConectarDB con = new ConectarDB();
        this.jdbcTemplate = new  JdbcTemplate(con.conectar());
        
    }
    
    
    
    
    
    @RequestMapping(value = "formCliente.htm", method = RequestMethod.GET)
    public ModelAndView homeCliente(){
    ModelAndView mov = new ModelAndView();
    Cliente cliente = new Cliente();
    mov.addObject("cliente",cliente);
    
 
   
    mov.setViewName("views/formCliente");
    return mov;
        
    } 

    @RequestMapping(value = "formCliente.htm", method = RequestMethod.POST)
    public ModelAndView homeClientePOST(){
    ModelAndView mov = new ModelAndView();
    String sql = "select * from cliente";
    List datos = this.jdbcTemplate.queryForList(sql);
    mov.addObject("cliente",datos);
    mov.setViewName("views/mostrarCliente");
    return mov;
        
    } 
    
    @RequestMapping(value = "agregarCliente.htm", method = RequestMethod.GET)
    public ModelAndView agregarCliente(){
    ModelAndView mov = new ModelAndView();
    Cliente cliente = new Cliente();
    mov.addObject("cliente",cliente);
    mov.setViewName("views/formCliente");
    return mov;
} 
    
    @RequestMapping(value = "agregarCliente.htm", method = RequestMethod.POST)
    public ModelAndView agregarCliente(Cliente cli){
     ModelAndView mov = new ModelAndView();
    String sql = "INSERT INTO CLIENTE (NOMBRE,APELLIDO,CORREO,EDAD)" + "VALUES(?,?,?,?);";
    this.jdbcTemplate.update(sql,cli.getNombre(),cli.getApellido(),cli.getCorreo(),cli.getEdad());
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
    
    @RequestMapping(value = "actCliente.htm", method = RequestMethod.GET)
    public ModelAndView actCliente(HttpServletRequest request){
    ModelAndView mov = new ModelAndView();
    int id =Integer.parseInt( request.getParameter("id"));
    
    Cliente cli = this.cargarClientebyId(id);
    mov.addObject("cliente", new Cliente (id, cli.getNombre(), cli.getApellido(),
     cli.getCorreo(),cli.getEdad()));
    mov.setViewName("views/actCliente");
        return mov;
    }
    
    
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
        mav.setViewName("redirect://formCliente.htm");
     return mav;   
    }
    }
    
    @RequestMapping("borrarCliente.htm")
    public ModelAndView borrarCliente(HttpServletRequest request){
    ModelAndView mov = new ModelAndView();
    int id =Integer.parseInt( request.getParameter("id"));
    String sql = "delete from cliente where id = ?";
    this.jdbcTemplate.update(sql, id);
    
     mov.setViewName("redirect:/formCliente.htm");
    return mov;
    
    
    
    
    }
   
    
    
}  
    
    

   
    

