package model;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Onibus {
    private String origem;
    private String destino;
    private Assento lugares[];
    private String hora;

    public Onibus(String origem, String destino, String hora){
        this.origem  = origem;
        this.destino = destino;
        this.hora    = hora;
        this.lugares = new Assento[41];
    }
    
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
    
    private String getDataHora() {  
        DateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        Date date = new Date();  
        return data.format(date);  
    }
    
    public boolean gerenciaPassageiro(int lugar, Cliente c){
        if(lugar<this.lugares.length & lugar>=0){
            if(lugares[lugar]==null){
                Assento a = new Assento();
                a.setCliente(c);
                this.lugares[lugar] = a;
                return true;
            }else{
                return false;
            }
        }else{
                return false;
        }
    }
    
    public boolean gerenciaPassageiro(int lugar){
        if(lugar<this.lugares.length & lugar>=0){
            if(lugares[lugar]!=null){
                this.lugares[lugar] = null;
                return true;
            }else{
                return false;
            }
        }else{
                return false;
        }
    }
    
    public String verificaAssento(int lugar){
        if(lugar<this.lugares.length & lugar>=0){
            if(lugares[lugar] != null){
                return lugares[lugar].getCliente().getNome()+"-"+lugares[lugar].getCliente().getCpf()+"-"+lugares[lugar].getCliente().getTelefone()+"-"+lugares[lugar].getCliente().getCodigo();
            }else{
                return "vazio";
            }   
        }else{
            return "Assento invalido";
        }
    }
    
    public String listaAssentos(){
        String lista = "";
        for(int cont = 0;cont<this.lugares.length;cont++){
            if(lugares[cont] != null){
               lista+="Assento: "+(cont+1)+" - Situação: Ocupado - Passageiro: "+lugares[cont].getCliente().getNome()+"\n"; 
            }else{
               lista+="Assento: "+(cont+1)+" - Situação: Vago\n"; 
            }
        }
        return lista;
    }
    
    public int qtdVagas(){
        int qtdV=0;
        for(int cont = 0;cont<this.lugares.length;cont++){
            if(lugares[cont] == null){
                qtdV++;
            }
        }
        return qtdV-1;
    }
    
    public String imprimeComprovante(int lugar){
        String comprovante = "";
        lugar--;
        if(lugares[lugar] != null){
                comprovante+="====================================\n";
                comprovante+="      COMPROVANTE DE COMPRA         \n";
                comprovante+="====================================\n";
                comprovante+="                                    \n";
                comprovante+="   Assento: "+(lugar+1)+"\n";
                comprovante+="                                    \n";
                comprovante+="    Origem: "+this.getOrigem()+"\n";
                comprovante+="   Destino: "+this.getDestino()+"\n";
                comprovante+="                                    \n";
                comprovante+="   Cliente: "+lugares[lugar].getCliente().getNome()+"\n";
                comprovante+="       Cpf: "+lugares[lugar].getCliente().getCpf()+"\n";
                comprovante+="  Telefone: "+lugares[lugar].getCliente().getTelefone()+"\n";
                comprovante+="                                    \n";
                comprovante+="                                    \n";
                comprovante+="====================================\n";
                comprovante+="       "+getDataHora()+"\n";
                comprovante+="====================================\n";
            }else{
        }
        return comprovante;
    }
 
    
}
