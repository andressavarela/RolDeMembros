package rolmembros;

/**
 *
 * Classe que implementa uma pilha de datas.
 *
 * @author Igor Marques de Sousa
 */
public class PilhaDatas implements IDataMod {

    private int topo;
    private String[] pilha;

    /**
     *
     * Construtor da classe PilhaDatas.
     *
     * @param tamanho o tamanho máximo da pilha.
     */
    public PilhaDatas(int tamanho) {
        this.pilha = new String[tamanho];
        this.topo = -1;
    }

    /**
     *
     * Insere uma nova data no topo da pilha.
     *
     * @param data a data a ser inserida na pilha.
     * @throws Exception se a pilha estiver cheia.
     */
    public void adiciona(String data) throws Exception {
        if (cheia()) {
            throw new Exception("Pilha cheia.");
        }
        topo++;
        pilha[topo] = data;
    }

    /**
     *
     * Remove e retorna a data no topo da pilha.
     *
     * @return a data no topo da pilha.
     * @throws Exception se a pilha estiver vazia.
     */
    @Override
    public String remove() throws Exception {
        if (vazia()) {
            throw new Exception("Pilha vazia.");
        }
        String dataRemovida = pilha[topo];
        topo--;
        return dataRemovida;
    }

    /**
     *
     * Retorna a data no topo da pilha.
     *
     * @return a data no topo da pilha.
     * @throws Exception se a pilha estiver vazia.
     */
    @Override
    public String topo() throws Exception {
        if (vazia()) {
            throw new Exception("Pilha vazia.");
        }
        return pilha[topo];
    }

    /**
     *
     * Verifica se a pilha está vazia.
     *
     * @return true se a pilha estiver vazia, false caso contrário.
     */

    @Override
    public boolean vazia() {
        return topo == -1;
    }

    /**
     *
     * Verifica se a pilha está cheia.
     *
     * @return true se a pilha estiver cheia, false caso contrário.
     */
    public boolean cheia() {
        return topo == pilha.length - 1;
    }

    public void imprime() {
        for (int i = 0; i <= topo; i++) {
            System.out.println(pilha[i] + " ");
        }
    }
}
