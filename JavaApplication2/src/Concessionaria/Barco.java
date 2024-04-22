package Concessionaria;

public class Barco extends Veiculos
{
    private double comprimento;
    private String tipoCasco;
    private int capacidadePassageiros;
    private double potenciaMotor;
    private String tipoPropulsao;

    public Barco(String marca, String modelo, int ano, double preco, double comprimento, String tipoCasco, int capacidadePassageiros, double potenciaMotor, String tipoPropulsao) {
        super(marca, modelo, ano, preco);
        this.comprimento = comprimento;
        this.tipoCasco = tipoCasco;
        this.capacidadePassageiros = capacidadePassageiros;
        this.potenciaMotor = potenciaMotor;
        this.tipoPropulsao = tipoPropulsao;
    }

    public double getComprimento()
    {
        return comprimento;
    }

    public void setComprimento(double comprimento)
    {
        this.comprimento = comprimento;
    }

    public String getTipoCasco()
    {
        return tipoCasco;
    }

    public void setTipoCasco(String tipoCasco)
    {
        this.tipoCasco = tipoCasco;
    }

    public int getCapacidadePassageiros()
    {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros)
    {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public double getPotenciaMotor()
    {
        return potenciaMotor;
    }

    public void setPotenciaMotor(double potenciaMotor)
    {
        this.potenciaMotor = potenciaMotor;
    }

    public String getTipoPropulsao()
    {
        return tipoPropulsao;
    }

    public void setTipoPropulsao(String tipoPropulsao)
    {
        this.tipoPropulsao = tipoPropulsao;
    }
    
    @Override
    public String ObterInformacoes()
    {
        return "Marca: " + getMarca() + 
                "\nModelo: " + getModelo() + 
                "\nAno: " + getAno() +
                "\nPreco: " + getPreco() +
                "\nComprimento: " + getComprimento() +
                "\nTipo do casco: " + getTipoCasco() +
                "\nCapacidade de Passageiros: " + getCapacidadePassageiros() +
                "\nPotência do Motor: " + getPotenciaMotor() +
                "\nTipo de Propulsão: " + getTipoPropulsao();
    } 
}
