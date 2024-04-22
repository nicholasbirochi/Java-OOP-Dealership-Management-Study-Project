package Concessionaria;

public class Caminhao extends Veiculos
{
    private String tipoCarga;
    private double capacidadeCarga;
    private int numEixos;
    private double potenciaMotor;
    private String tipoTransmissao;

    public Caminhao(String marca, String modelo, int ano, double preco, String tipoCarga, double capacidadeCarga, int numEixos, double potenciaMotor, String tipoTransmissao) {
        super(marca, modelo, ano, preco);
        this.tipoCarga = tipoCarga;
        this.capacidadeCarga = capacidadeCarga;
        this.numEixos = numEixos;
        this.potenciaMotor = potenciaMotor;
        this.tipoTransmissao = tipoTransmissao;
    }

    public String getTipoCarga()
    {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga)
    {
        this.tipoCarga = tipoCarga;
    }

    public double getCapacidadeCarga()
    {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga)
    {
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getNumEixos()
    {
        return numEixos;
    }

    public void setNumEixos(int numEixos)
    {
        this.numEixos = numEixos;
    }

    public double getPotenciaMotor()
    {
        return potenciaMotor;
    }

    public void setPotenciaMotor(double potenciaMotor)
    {
        this.potenciaMotor = potenciaMotor;
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
                "\nTipo de Carga: " + getTipoCarga() +
                "\nCapacidade de Carga: " + getCapacidadeCarga() +
                "\nNúmero de Eixos: " + getNumEixos() +
                "\nPotencia do Motor: " + getPotenciaMotor() +
                "\nTipo de Transmissão: " + getTipoTransmissao()
                ;
    } 
}