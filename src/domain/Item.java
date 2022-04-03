package domain;

//sobre os itens disponíveis é necessário saber o código (alfanuḿerico), nome e valor.

public class Item {
    private String nome;
    private int valor;
    private String codigo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Item(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public Item(int valor) {
        this.valor = valor;
    }

}
