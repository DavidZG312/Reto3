/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3.Reto3.Repositorio;

import Reto3.Reto3.tabla.Boat;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Reto3.Reto3.Interfaz.InterfaceBoat;

/**
 *
 * @author USUARIO
 */
@Repository
public class RepositorioBoat {
    
    @Autowired
    private InterfaceBoat crud;

    public List<Boat> getAll(){
        return (List<Boat>) crud.findAll();
    }

    public Optional<Boat> getBoat(int id){
        return crud.findById(id);
    }

    public Boat save(Boat boat){
        return crud.save(boat);
    }
    public void delete(Boat boat){
        crud.delete(boat);
    }
    
}
