package agenda;

public class PhoneBook {

    public PhoneBook(String nome) {
        this.nome = nome;
    }
    
    public PhoneBook(int telefone){
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    protected String nome;
    private int telefone;

}
