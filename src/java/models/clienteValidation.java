/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author Santiago
 */
public class clienteValidation implements Validator {

    @Override
    public boolean supports(Class<?> type) {
       return Cliente.class.isAssignableFrom(type);
    }

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
