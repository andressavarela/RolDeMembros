package rolmembros;

/**
 *
 * @author andre
 */
public class AppRolMembros {

    public static void main(String[] args) {
        ListaMembros lista;
        lista = new ListaMembros();

        lista.adicionaMembro("Andressa Varela", "40028922", "07/11/2014");
        lista.adicionaMembro("Vanessa Varela", "198319203", "01/01/2010");

        lista.editaMembro("Andressa Varela", "38912389108", "39/12/2003");
        lista.imprimeListaMembros();

        //Forma de adicionar infos por interface, a ignorar na APS
        /*
        System.out.println("----");
        
        String entradaNome = 
                JOptionPane.showInputDialog("Digite o nome: ");
        String entradaTel = 
                JOptionPane.showInputDialog("Digite o telefone: ");
        String entradaData = 
                JOptionPane.showInputDialog("Digite a data de inicio de membresia: ");
        
        lista.adicionaMembro(entradaNome, entradaTel, entradaData);
        lista.imprimeListaMembros();
         */
    }

}
