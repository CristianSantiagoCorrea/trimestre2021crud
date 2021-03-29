/**@author : Santiago correa
 *En este modelo se valida si el formulario de la views/actualizarCliente.jsp
 *tiene campos validos ejemplo si el campo nombre esta vacio aparece mensaje
 * 
 */
package models;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @version 1.0
 * @author Santiago
 * @since 10 marzo 2021
 */
public class clienteValidation implements Validator {

    /**
     *
     * @param type
     * @return
     */
    @Override
    public boolean supports(Class<?> type) {
       return Cliente.class.isAssignableFrom(type);
    }

    /**
     *
     * @param o
     * @param errors
     */
    @Override
    public void validate(Object o, Errors errors) {
       Cliente cliente =  (Cliente)o;
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, 
               "nombre", 
               "requiered.nombre", 
               "Inserte datos en el campo nombre");
       
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, 
               "apellido", 
               "requiered.apellido", 
               "inserte datos en el campo apellido");
       
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, 
               "correo", 
               "requiered.correo", 
               "El  campo correo es obligatorio");
       
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, 
               "edad", 
               "requiered.edad", 
               "El campo edad es obligatorio");
    }
    
}
