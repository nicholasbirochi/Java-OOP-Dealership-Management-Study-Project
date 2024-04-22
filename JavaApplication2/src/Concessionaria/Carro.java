package Concessionaria;

public class Carro extends Veiculos
{
    private int numPortas;
    private String tipoCombustivel;
    private double potenciaMotor;
    private double capacidadePortaMalas;
    private String tipoTransmissao;

    public Carro(String marca, String modelo, int ano, double preco, int numPortas, String tipoCombustivel, double potenciaMotor, double capacidadePortaMalas, String tipoTransmissao) {
        super(marca, modelo, ano, preco);
        this.numPortas = numPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.potenciaMotor = potenciaMotor;
        this.capacidadePortaMalas = capacidadePortaMalas;
        this.tipoTransmissao = tipoTransmissao;
    }

    public int getNumPortas()
    {
        return numPortas;
    }

    public void setNumPortas(int numPortas)
    {
        this.numPortas = numPortas;
    }

    public String getTipoCombustivel()
    {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel)
    {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getPotenciaMotor()
    {
        return potenciaMotor;
    }

    public void setPotenciaMotor(double potenciaMotor)
    {
        this.potenciaMotor = potenciaMotor;
    }

    public double getCapacidadePortaMalas()
    {
        return capacidadePortaMalas;
    }

    public void setCapacidadePortaMalas(double capacidadePortaMalas)
    {
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    public String getTipoTransmissao()
    {
        return tipoTransmissao;
    }

    public void setTipoTransmissao(String tipoTransmissao)
    {
        this.tipoTransmissao = tipoTransmissao;
    }
    
    @Override
    public String ObterInformacoes()
    {
        return "Marca: " + getMarca() + 
                "\nModelo: " + getModelo() + 
                "\nAno: " + getAno() +
                "\nPreco: " + getPreco() +
                "\nNúmero de Portas: " + getNumPortas() +
                "\nTipo de Combustível: " + getTipoCombustivel() +
                "\nPotência do Motor: " + getPotenciaMotor() +
                "\nCapacidade de PortaMalas: " + getCapacidadePortaMalas() +
                "\nTipo de Transmissão: " + getTipoTransmissao();
    } 
}
