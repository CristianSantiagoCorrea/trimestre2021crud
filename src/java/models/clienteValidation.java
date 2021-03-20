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
               "Ela campo nombre es obligatorio");
       
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, 
               "apellido", 
               "requiered.apellido", 
               "Ela campo nombre es obligatorio");
       
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, 
               "correo", 
               "requiered.correo", 
               "Ela campo nombre es obligatorio");
       
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, 
               "edad", 
               "requiered.edad", 
               "Ela campo nombre es obligatorio");
    }
    
}
