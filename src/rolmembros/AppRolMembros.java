package rolmembros;

/**
 *
 * @author andre
 */
public class AppRolMembros {

    public static void main(String[] args) {
        ListaMembros lista = new ListaMembros();

        System.out.println("LISTA DE MEMBROS:");
        lista.adicionaMembro("Andressa Varela", "40028922", "07/11/2014");
        lista.adicionaMembro("Igor Marques", "198319203", "01/01/2010");
        lista.adicionaMembro("José Maria", "11594513546", "11/08/1998");
        lista.adicionaMembro("Maria José", "11940028922", "21/10/2018");
        lista.imprimeListaMembros();

        lista.editaMembro("Andressa Varela", "38912389108", "39/12/2003");
        System.out.println("-- após edição --");
        System.out.println("LISTA DE MEMBROS:");
        lista.imprimeListaMembros();

        PilhaDatas pilha = new PilhaDatas(5);

        try {
            pilha.adcdata(1);
            pilha.adcdata(2);
            pilha.adcdata(3);
            pilha.adcdata(4);
            System.out.println("Pilha após adicionar: " + pilha.toString());
        } catch (Exception e) {
            System.out.println("Erro ao adicionar data: " + e.getMessage());
        }
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
