package rolmembros;

/**
 * Interface que define as operações para manipulação de datas em uma pilha.
 *
 * @author Igor Marques de Sousa
 */
public interface IDataMod {

    /**
     * Insere um novo elemento no topo da pilha.
     *
     * @param data o elemento a ser inserido na pilha.
     * @throws Exception se a pilha estiver cheia.
     */
    public void adiciona(String data) throws Exception;

    /**
     * Remove e retorna o elemento no topo da pilha.
     *
     * @return o elemento no topo da pilha.
     * @throws Exception se a pilha estiver vazia.
     */
    public String remove() throws Exception;

    /**
     * Retorna o elemento no topo da pilha.
     *
     * @return a data no topo da pilha.
     * @throws Exception se a pilha estiver vazia.
     */
    public String topo() throws Exception;

    /**
     * Verifica se a pilha está vazia.
     *
     * @return true se a pilha estiver vazia, false caso contrário.
     */
    public boolean vazia();

    /**
     * Verifica se a pilha está cheia.
     *
     * @return true se a pilha estiver cheia, false caso contrário.
     */
    public boolean cheia();

    /**
     * Imprime os elementos da pilha.
     */
    public void imprime();

}
