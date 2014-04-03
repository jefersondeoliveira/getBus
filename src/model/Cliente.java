package model;


public class Cliente extends Pessoa{
    private String cpf;
    private String telefone;
    
    public Cliente(){
        GeraCodigo();
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void GeraCodigo(){
        codigo = r.nextInt(100);
    }
    
}
