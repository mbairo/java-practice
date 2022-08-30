public class Calculos {
    String nome;
   private double quantidade;
   private double precoMedio;
   private double valorAtual;
   private double porcentagem;
   private double lucroEmReal;
    
    public Calculos (String nome, double quantidade, double precoMedio, double valorAtual) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoMedio = precoMedio;
        this.valorAtual = valorAtual;
        lucroEmReal(quantidade, precoMedio, valorAtual);
        porcentagem(precoMedio, valorAtual);
    }
    public void lucroEmReal (double quantidade, double precoMedio, double valorAtual){
        lucroEmReal = (quantidade * valorAtual) - (quantidade * precoMedio);
    }

    public void porcentagem (double precoMedio, double valorAtual) {
        this.porcentagem = (valorAtual / precoMedio) * 100 - 100;
    }

    public String toString(){
        return "\n========================\nNome: " + nome +
        "\nQuantidade: " + quantidade +
        "\nPreço médio: "+ precoMedio +
        "\nValor Final: " + valorAtual + 
        "\nLucro: " + String.format("%.2f",lucroEmReal) +
        "\nPorcentagem: " + String.format("%.2f" ,porcentagem) + "%\n========================\n"; 
    }
}