package model;

import view.TelaDetalheOnibus;
import view.TelaInicio;
import view.TelaNovaRota;


public class Principal {
    
    public static void main(String[] args) {
        Repositorio.rotas.add(new Onibus("Patos de Minas","Uberlandia","07:00"));
        Repositorio.rotas.add(new Onibus("Patos de Minas","Uberlandia","12:00"));
        Repositorio.rotas.add(new Onibus("Patos de Minas","Uberlandia","14:00"));
        Repositorio.rotas.add(new Onibus("Patos de Minas","Uberlandia","20:00"));
        Repositorio.rotas.add(new Onibus("Patos de Minas","São Paulo","07:00"));
        Repositorio.rotas.add(new Onibus("Patos de Minas","São Paulo","12:00"));
        Repositorio.rotas.add(new Onibus("Patos de Minas","São Paulo","14:00"));
        Repositorio.rotas.add(new Onibus("Patos de Minas","São Paulo","20:00"));
        Repositorio.rotas.add(new Onibus("Patos de Minas","Belo Horizonte","07:00"));
        Repositorio.rotas.add(new Onibus("Patos de Minas","Belo Horizonte","12:00"));
        Repositorio.rotas.add(new Onibus("Patos de Minas","Belo Horizonte","14:00"));
        Repositorio.rotas.add(new Onibus("Patos de Minas","Belo Horizonte","20:00"));
           
        TelaInicio t = new TelaInicio();
        t.setVisible(true);
    }
    
}
