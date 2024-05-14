public class Sorveteria {
    private SaborSorvete sabor;
    private TamanhoSorvete tamanho;

    // Construtor que recebe as dependências
    public Sorveteria(SaborSorvete sabor, TamanhoSorvete tamanho) {
        this.sabor = sabor;
        this.tamanho = tamanho;
    }

    public void venderSorvete() {
        System.out.println("Vendendo um sorvete de sabor: " + sabor.getSabor() + " e tamanho: " + tamanho.getTamanho());
    }
}