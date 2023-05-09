package rolmembros;

/**
 * Classe que representa uma lista de membros. Possui métodos para adicionar,
 * remover, editar e imprimir membros da lista.
 *
 * @author Andressa Araujo Varela
 */
public class ListaMembros {

    private Membro cabeca;

    /**
     * Cria uma lista vazia de membros.
     *
     */
    public ListaMembros() {
        this.cabeca = null;
    }

    /**
     * Método para adicionar um novo membro à lista.
     *
     * @param nome O nome do novo membro
     * @param telefone O telefone do novo membro
     * @param dataMemb A data de ínicio da membresia do membro
     */
    public void adicionaMembro(String nome, String telefone, String dataMemb) {
        Membro novoMembro = new Membro(nome, telefone, dataMemb);
        if (this.cabeca == null) {
            this.cabeca = novoMembro;
        } else {
            Membro atual = cabeca;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoMembro);
        }

    }

    /**
     * Método para remover um membro da lista a partir de seu nome.
     *
     * @param nome O nome do membro a ser removido
     * @throws Exception se o membro não for encontrado
     */
    public void removeMembro(String nome) throws Exception {
        if (this.cabeca == null) {
            return;
        }
        if (this.cabeca.getNome().equals(nome)) {
            this.cabeca = this.cabeca.getProximo();
            return;
        }
        Membro atual = this.cabeca;
        while (atual.getProximo() != null) {
            if (atual.getProximo().getNome().equals(nome)) {
                atual.setProximo(atual.getProximo().getProximo());
                return;
            }
            atual = atual.getProximo();
        }
        throw new Exception("Membro não encontrado");
    }

    /**
     * Método para editar informações de um membro na lista a partir de seu
     * nome.
     *
     * @param nome O nome do membro a ser editado
     * @param novoTelefone O novo telefone do membro na lista
     * @param novaDataMemb A nova data de início da membresia do membro
     * @throws Exception se o membro não for encontrado na lista
     */
    public void editaMembro(String nome, String novoTelefone, String novaDataMemb) throws Exception {
        Membro atual = this.cabeca;
        while (atual != null) {
            if (atual.getNome().equals(nome)) {
                atual.setTelefone(novoTelefone);
                atual.setDataMemb(novaDataMemb);
                return;
            }
            atual = atual.getProximo();
        }
        throw new Exception("Membro não encontrado");
    }

    /**
     * Imprime na tela do console todos os membros da lista.
     *
     */
    public void imprimeListaMembros() {
        Membro atual = this.cabeca;
        while (atual != null) {
            System.out.println(atual);
            atual = atual.getProximo();
        }
    }

}
