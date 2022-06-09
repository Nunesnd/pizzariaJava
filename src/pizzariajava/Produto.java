/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzariajava;

/**
 *
 * @author nunes
 */
public class Produto {
    private int cadProd;
    private String tamanho;
    private String sabor;
    private int preco;

    public Produto(int cadProd, String tamanho, String sabor, int preco) {
        this.cadProd = cadProd;
        this.tamanho = tamanho;
        this.sabor = sabor;
        this.preco = preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
    
    
}
