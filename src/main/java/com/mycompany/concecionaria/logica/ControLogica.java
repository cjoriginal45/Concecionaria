/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concecionaria.logica;

import com.mycompany.concecionaria.persistencia.ControlPersistencia;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControLogica {
    
    ControlPersistencia control = new ControlPersistencia();
    
    public void crearAuto(Automovil aut){
        control.crearAuto(aut);
    }
    
    public void eliminar(int id){
        control.eliminar(id);
    }
    
    public void editar(Automovil aut){
        control.editar(aut);
    }
    
    public Automovil traerAuto(int id){
        return control.traerAuto(id);      
    }
    
     public LinkedList<Automovil> ListaAutomovil(){
        return control.ListaAutomovil();    
    }

    public List<Automovil> traerAutos() {
         return control.traerAutos();
    }
/*
    public void modificarMascota(String mar, String mod, String motor, String col, String pat, int puertas){ 
       Automovil aut = new Automovil(mar,mod,motor,col,pat,puertas);     
       control.editar(aut);
    }
   */ 
}
