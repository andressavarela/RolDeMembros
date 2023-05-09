package rolmembros;

/**
 * Classe que representa um membro de uma lista de membros.
 *
 * @author Andressa Araujo Varela
 */
public class Membro {

    private String nome;
    private String telefone;
    private String dataMemb;
    private Membro proximo;

    /**
     * Método para retorno do nome do membro
     *
     * @return String - nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Método para retorno do telefone do membro.
     *
     * @return String - telefone
     */
    public String getTelefone() {
        return this.telefone;
    }

    /**
     * Configura um novo telefone para o membro.
     *
     * @param telefone O telefone do membro
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Método para retorno da data de início da membresia.
     *
     * @return String - dataMemb
     */
    public String getDataMemb() {
        return this.dataMemb;
    }

    /**
     * Configura uma nova data de início da membresia para o membro.
     *
     * @param dataMemb A data de início da membresia do membro
     */
    public void setDataMemb(String dataMemb) {
        this.dataMemb = dataMemb;
    }

    /**
     * Método para retorno do próximo do membro.
     *
     * @return Membro - proximo
     */
    public Membro getProximo() {
        return this.proximo;
    }

    /**
     * Configura um novo próximo para a célula membro.
     *
     * @param proximo O próximo membro na lista
     */
    public void setProximo(Membro proximo) {
        this.proximo = proximo;
    }

    /**
     * O construtor Membro sem argumento inicializa cada variável como zero.
     * Isso assegura aos objetos Membro um início consistente.
     */
    public Membro() {
    }

    /**
     * Construtor Membro
     *
     * @param nome
     * @param telefone
     * @param dataMemb
     */
    public Membro(String nome, String telefone, String dataMemb) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataMemb = dataMemb;
        this.proximo = null;
    }

    /**
     * Retorna uma string com informações do contato, incluindo nome, telefone e
     * data de membro.
     *
     * @return String com informações do contato
     */
    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Telefone: " + this.telefone + ", Membro desde: " + this.dataMemb;
    }

}
