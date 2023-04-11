/*
 * Isso é documentação Javadoc
 * 
 */
package rolmembros;

/**
 *
 * @author andre
 */
public class Membro {
    private String nome;
    private String telefone;
    private String dataMemb;
    private Membro proximo;
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getDataMemb(){
        return this.dataMemb;
    }
    
    public void setDataMemb(String dataMemb){
        this.dataMemb = dataMemb;
    }
    
    public Membro getProximo(){
        return this.proximo;
    }
    
    public void setProximo(Membro proximo){
        this.proximo = proximo;
    }
    
    public Membro(){}
    
    public Membro(String nome, String telefone, String dataMemb){
        this.nome = nome;
        this.telefone = telefone;
        this.dataMemb = dataMemb;
        this.proximo = proximo;
    }
    
    
    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Telefone: " + this.telefone + ", Membro desde: " + this.dataMemb;
    }
    
    
    
}
