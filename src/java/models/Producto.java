/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Santiago
 */
public class Producto {
    public int calcularcosto(int cantidad,int costo){
    int valor =0;
    valor = cantidad * costo;
    return valor; 
    
}
    
    public int descuento(int valor, int desc){
    int  descuento = valor - desc;
    return descuento;    
}
    
}