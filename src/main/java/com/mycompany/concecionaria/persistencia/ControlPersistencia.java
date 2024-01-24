/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concecionaria.persistencia;

import com.mycompany.concecionaria.logica.Automovil;
import com.mycompany.concecionaria.persistencia.exceptions.NonexistentEntityException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ControlPersistencia {
    
    AutomovilJpaController autojpa = new AutomovilJpaController();
    Automovil auto = new Automovil();
    
    //metodos CRUD

    public void crearAuto(Automovil aut) {
         autojpa.create(aut);
    }

    public void eliminar(int id) {
        try {
            autojpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControlPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editar(Automovil aut) {
        try {
            autojpa.edit(aut);
        } catch (Exception ex) {
            Logger.getLogger(ControlPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAuto(int id) {
       return autojpa.findAutomovil(id);
    }

    public LinkedList<Automovil> ListaAutomovil() {
        List<Automovil> lista = autojpa.findAutomovilEntities();
        LinkedList<Automovil> listaAutomovil = new LinkedList(lista); 
        return listaAutomovil;
    }

    public List<Automovil> traerAutos() {
    try {
        List<Automovil> autos = autojpa.findAutomovilEntities();
        System.out.println("Número de automóviles obtenidos: " + autos.size());
        return autos;
    } catch (Exception e) { // o loguea el error de alguna manera
        // o loguea el error de alguna manera
        return null;
    }
}

    
    
}
