public class App {
    public static void main(String[] args) {

        ArvoreBinariaDeBusca arvore = new ArvoreBinariaDeBusca();
    
        arvore.adicionar(6);
        arvore.adicionar(4);
        arvore.adicionar(8);
        arvore.adicionar(3);
        arvore.adicionar(5);
        arvore.adicionar(7);
        arvore.adicionar(9);
    

        arvore.printarArvore(arvore.raiz);

        System.out.println("O nó buscado é o : " + arvore.buscaNo(5).valor + " ");

    }
}
