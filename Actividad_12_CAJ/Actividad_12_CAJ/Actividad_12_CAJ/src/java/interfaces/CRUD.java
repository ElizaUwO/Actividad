/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import modelos.Triangulo;

/**
 *
 * @author ferna
 */
public interface CRUD {
    
    public List listar();

    public Triangulo list(int id);

    public boolean add(Triangulo figura);
    
    public boolean edit(Triangulo figura);
    
    public boolean delete(Triangulo figura);
    
}
