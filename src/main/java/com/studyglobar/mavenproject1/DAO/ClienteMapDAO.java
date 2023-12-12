/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyglobar.mavenproject1.DAO;
import com.studyglobar.mavenproject1.domain.Cliente;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 8292
 */
public class ClienteMapDAO implements IClienteDAO {
        private Map <Long, Cliente> map;

    public ClienteMapDAO() {
        this.map = new HashMap<>();
    }
    
    public Boolean cadastrar(Cliente cliente) {
        if(this.map.containsKey(cliente.getCpf())){
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true;
    }
    
    public void excluir (Long cpf) {
  
    }
    
    public void alterar (Cliente cliente){
  
    }
    
    public Cliente consultar (Long cpf){
        return null;
    }
    
    public Collection<Cliente> buscarTodos(){
        return null;
    }
    
    
}
