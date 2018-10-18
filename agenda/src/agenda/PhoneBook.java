package agenda;

/**
 *
 * @author Kayke Bonafé de Luca
 * R.A.: 22.217.003-7
 * 
 */
public class PhoneBook {

    /**
     *
     * Construtor da classe
     * 
     * @param nome
     * @param telefone
     */
    public PhoneBook(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    /**
     *
     * @return o nome
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return o telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     *
     * @param telefone
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * Variavéis da classe
     */
    protected String nome;
    private int telefone;

}
