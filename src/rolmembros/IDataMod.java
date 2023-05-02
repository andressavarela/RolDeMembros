/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rolmembros;

/*
Interface que define as operações para manipulação de datas em uma pilha.
*/
public interface IDataMod {

    /**
     *
     * Insere uma nova data no topo da pilha.
     *
     * @param data a data a ser inserida na pilha.
     * @throws Exception se a pilha estiver cheia.
     */
    public void adcdata(int data) throws Exception;

    /**
     *
     * Remove e retorna a data no topo da pilha.
     *
     * @return a data no topo da pilha.
     * @throws Exception se a pilha estiver vazia.
     */
    public int removeData() throws Exception;

    /**
     *
     * Retorna a data no topo da pilha sem removê-la.
     *
     * @return a data no topo da pilha.
     * @throws Exception se a pilha estiver vazia.
     */
    public int topo() throws Exception;

    /**
     *
     * Verifica se a pilha está vazia.
     *
     * @return true se a pilha estiver vazia, false caso contrário.
     */
    public boolean vazia();

    /**
     *
     * Verifica se a pilha está cheia.
     *
     * @return true se a pilha estiver cheia, false caso contrário.
     */
    public boolean cheia();

    /**
     *
     * Retorna uma representação da pilha em forma de String.
     *
     * @return a representação da pilha em forma de String.
     */
    public String toString();
}
