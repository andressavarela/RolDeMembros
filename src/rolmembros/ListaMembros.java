package rolmembros;

/**
 *
 * @author andre
 */
public class ListaMembros {
    private Membro cabeca;
    
    public ListaMembros(){
        this.cabeca = null;
    }
    
    public void adicionaMembro(String nome, String telefone, String dataMemb){
        Membro novoMembro = new Membro(nome, telefone, dataMemb);
        if(this.cabeca == null){
            this.cabeca = novoMembro;
        }else{
            Membro atual = cabeca;
            while(atual.getProximo() != null){
                atual = atual.getProximo();
            }
            atual.setProximo(novoMembro);
        }
        
    }
    
    public void removeMembro(String nome){
        if(this.cabeca == null){
            return;
        }
        if(this.cabeca.getNome().equals(nome)){
            this.cabeca = this.cabeca.getProximo();
            return;
        }
        Membro atual = this.cabeca;
        while(atual.getProximo() != null){
            if(atual.getProximo().getNome().equals(nome)){
                atual.setProximo(atual.getProximo().getProximo());
                return;
            }
            atual = atual.getProximo();
        }
        throw new IllegalArgumentException("Membro não encontrado");
    }
    
    public void editaMembro(String nome, String novoTelefone, String novaDataMemb){
        Membro atual = this.cabeca;
        while(atual != null){
            if(atual.getNome().equals(nome)){
                atual.setTelefone(novoTelefone);
                atual.setDataMemb(novaDataMemb);
                return;
            }
            atual = atual.getProximo();
        }
        throw new IllegalArgumentException("Membro não encontrado");
    }
    
    public void imprimeListaMembros(){
        Membro atual = this.cabeca;
        while(atual != null){
            System.out.println(atual);
            atual = atual.getProximo();
        }
    }
    
    
}
