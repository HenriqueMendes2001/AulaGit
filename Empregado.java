public class Empregado{
    private String nome;
    private int idade;
    private int tipo;
    private double salario;
    private double comissao;
    private double bonus;
    
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double calcularSalario(){
        switch(tipo){
            case 1:
                return salario;
            case 2:
                return salario + salario * comissao;
            default:
                return 0;
        }
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade (int idade){
        this.idade = idade;
    }
}