package rolmembros;

/**
 * Classe de teste para as classes ListaMembros e PilhaDatas. Esta classe contém
 * o método main que realiza testes nas classes ListaMembros e PilhaDatas. Ela
 * imprime a lista de membros antes e depois de editar e remover membros, além
 * de imprimir a pilha de datas após adicionar algumas datas.
 *
 * @author Andressa Araujo Varela
 * @author Igor Marques de Sousa
 */
public class AppRolMembros {

    /**
     *
     * O método main realiza testes nas classes ListaMembros e PilhaDatas. Ele
     * imprime a lista de membros antes e depois de editar e remover membros,
     * além de imprimir a pilha de datas após adicionar algumas datas.
     *
     * @param args os argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        ListaMembros lista = new ListaMembros();

        System.out.println("LISTA DE MEMBROS:");

        try {
            lista.adicionaMembro("Andressa Varela", "40028922", "07/11/2014");
            lista.adicionaMembro("Igor Marques", "198319203", "01/01/2010");
            lista.adicionaMembro("José Maria", "11594513546", "11/08/1988");
            lista.adicionaMembro("Maria José", "11940028922", "21/10/2018");
            lista.imprimeListaMembros();

            lista.editaMembro("Andressa Varela", "38912389108", "39/12/2003");
            lista.removeMembro("José Maria");
            System.out.println("-- após edição --");
            System.out.println("LISTA DE MEMBROS:");
            lista.imprimeListaMembros();

            System.out.println("-- edição de membro não existente --");
            lista.editaMembro("Paulo Silveira", "1972873874", "21/11/2022");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        PilhaDatas pilha = new PilhaDatas(5);
        System.out.println("");

        try {
            System.out.println("DATAS DE PUBLICAÇÃO DAS LISTAS: ");
            pilha.adiciona("10/12/2017");
            pilha.adiciona("20/03/2018");
            pilha.adiciona("31/12/2018");
            pilha.adiciona("04/04/2019");
            pilha.imprime();
            System.out.println("-- remoção da última data --");
            pilha.remove();
            pilha.imprime();
        } catch (Exception e) {
            System.out.println("Erro ao adicionar data: " + e.getMessage());
        }

    }

}
