package rolmembros;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class AppRolMembros {

    /**
     Lista encadeada - Objetivo
     * Visualizar a lista de membros da igreja, 
     * remover ou adicionar membros e 
     * visualizar e editar informações sobre eles.
     */
    public static void main(String[] args) {
        ListaMembros lista;
        lista = new ListaMembros();
        
        lista.adicionaMembro("Andressa Varela", "40028922", "07/11/2014");
        lista.adicionaMembro("Vanessa Varela", "198319203", "01/01/2010");
        
        
        lista.editaMembro("Andressa Varela", "38912389108", "39/12/2003");
        lista.imprimeListaMembros();
        System.out.println("----");
        
        String entradaNome = 
                JOptionPane.showInputDialog("Digite o nome: ");
        String entradaTel = 
                JOptionPane.showInputDialog("Digite o telefone: ");
        String entradaData = 
                JOptionPane.showInputDialog("Digite a data de inicio de membresia: ");
        
        lista.adicionaMembro(entradaNome, entradaTel, entradaData);
        lista.imprimeListaMembros();
        
    }
    
}
