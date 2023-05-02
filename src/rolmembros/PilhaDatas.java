/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rolmembros;

/**
 *
 * Classe que implementa uma pilha de datas.
 */
public class PilhaDatas implements IDataMod {

    private int topo;
    private int[] pilha;

    /**
     *
     * Construtor da classe PilhaDatas.
     *
     * @param tamanho o tamanho máximo da pilha.
     */
    public PilhaDatas(int tamanho) {
        this.topo = -1;
        this.pilha = new int[tamanho];
    }

    @Override
    public void adcdata(int data) throws Exception {
        if (cheia()) {
            throw new Exception("Pilha cheia.");
        }
        topo++;
        pilha[topo] = data;
    }

    @Override
    public int removeData() throws Exception {
        if (vazia()) {
            throw new Exception("Pilha vazia.");
        }
        int dataRemovida = pilha[topo];
        topo--;
        return dataRemovida;
    }

    @Override
    public int topo() throws Exception {
        if (vazia()) {
            throw new Exception("Pilha vazia.");
        }
        return pilha[topo];
    }

    @Override
    public boolean vazia() {
        return topo == -1;
    }

    @Override
    public boolean cheia() {
        return topo == pilha.length - 1;
    }

    @Override
    public String toString() {
        String pilhaStr = "";
        for (int i = topo; i >= 0; i--) {
            pilhaStr += pilha[i] + " ";
        }
        return pilhaStr.trim();
    }
}
