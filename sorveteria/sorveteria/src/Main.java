public class Main {
    public static void main(String[] args) {
        // Criar instâncias das implementações de sabor e tamanho
        SaborSorvete sabor = new SaborChocolate();
        TamanhoSorvete tamanho = new TamanhoPequeno();

        // Criar a sorveteria com as dependências injetadas
        Sorveteria sorveteria = new Sorveteria(sabor, tamanho);

        // Vender sorvete
        sorveteria.venderSorvete();

        // Testar com outros sabores e tamanhos
        SaborSorvete outroSabor = new SaborBaunilha();
        TamanhoSorvete outroTamanho = new TamanhoGrande();

        Sorveteria outraSorveteria = new Sorveteria(outroSabor, outroTamanho);
        outraSorveteria.venderSorvete();
    }
}
