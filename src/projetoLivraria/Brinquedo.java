package projetoLivraria;

public class Brinquedo extends Produto {

    private String tipo;

    public Brinquedo(String nome, int id, Double preco, String tipo) {
        super(nome, id, preco);
        this.tipo = tipo;
    }

    public Brinquedo() {
        super();
    }

    public static void add(Brinquedo cp) {
    }

    public String getTipo () {
        return tipo;
    }

    public void setTipo (String tipo) {
        this.tipo = tipo;
    }

}
