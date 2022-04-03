package domain;

//As mesas são numeradas, classificadas pela localização (interna ou externa) e é necessário saber a quantidade de cadeiras das mesmas

public class Mesa {
    private int numero;
    private String localizacao;
    private int quantidadeCadeira;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getQuantidadeCadeira() {
        return quantidadeCadeira;
    }

    public void setQuantidadeCadeira(int quantidadeCadeira) {
        this.quantidadeCadeira = quantidadeCadeira;
    }

    public Mesa(int numero, int quantidadeCadeira) {
        this.numero = numero;
        this.quantidadeCadeira = quantidadeCadeira;
    }

    public Mesa(String localizacao) {
        this.localizacao = localizacao;
    }


}
