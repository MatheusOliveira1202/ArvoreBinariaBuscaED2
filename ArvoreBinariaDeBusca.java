public class ArvoreBinariaDeBusca {
    No raiz;
  
    class No {
        int valor;
        No esquerda;
        No direita;

        No(int valor) {
            this.valor = valor;
            direita = null;
            esquerda = null;
        }
    }

    private No adicionar(No atual, int valor) {
        if (atual == null) {
            return new No(valor);
        }

        if (valor < atual.valor) {
            atual.esquerda = adicionar(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = adicionar(atual.direita, valor);
        } else {
            return atual;
        }

        return atual;
    }

    public void adicionar(int valor) {
        raiz = adicionar(raiz, valor);
    }

    public void printarArvore(No no) {
        if (no != null) {
            printarArvore(no.esquerda);
            System.out.print(" " + no.valor);
            printarArvore(no.direita);
        }
    }

    private No buscaNo(No atual, int valor) {
        if (atual == null) {
            return atual;
        } 
        if (valor == atual.valor) {
            return atual;
        } 
        return valor < atual.valor ? buscaNo(atual.esquerda, valor) : buscaNo(atual.direita, valor);
    }

    public No buscaNo(int valor) {
        return buscaNo(raiz, valor);
    }
}
