/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author informatica
 */
public class Repositorio {
    static ArrayList<Onibus> rotas = new ArrayList<>();
    static ArrayList<Cliente> clientes = new ArrayList<>();

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(ArrayList<Cliente> clientes) {
        Repositorio.clientes = clientes;
    }
    
    public static ArrayList<Onibus> getRotas() {
        return rotas;
    }

    public static void addRota(String origem, String destino, String hora){
        rotas.add(new Onibus(origem,destino,hora));
    }
    
     public static void removeRota(int index){
        rotas.remove(index);
    }
    
     public static void removeCliente(int index){
        clientes.remove(index);
    }
}
