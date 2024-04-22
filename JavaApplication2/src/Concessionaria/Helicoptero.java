package Concessionaria;

public class Helicoptero extends Veiculos
{
    private int capacidadePassageiros;
    private double autonomiaVoo;
    private String tipoRotor;
    private double potenciaMotor;
    private double altitudeMaximaOperacao;

    public int getCapacidadePassageiros()
    {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros)
    {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public double getAutonomiaVoo()
    {
        return autonomiaVoo;
    }

    public void setAutonomiaVoo(double autonomiaVoo)
    {
        this.autonomiaVoo = autonomiaVoo;
    }

    public String getTipoRotor()
    {
        return tipoRotor;
    }

    public void setTipoRotor(String tipoRotor)
    {
        this.tipoRotor = tipoRotor;
    }

    public double getPotenciaMotor()
    {
        return potenciaMotor;
    }

    public void setPotenciaMotor(double potenciaMotor)
    {
        this.potenciaMotor = potenciaMotor;
    }

    public double getAltitudeMaximaOperacao()
    {
        return altitudeMaximaOperacao;
    }

    public void setAltitudeMaximaOperacao(double altitudeMaximaOperacao)
    {
        this.altitudeMaximaOperacao = altitudeMaximaOperacao;
    }
    
    @Override
    public String ObterInformacoes()
    {
        return "Marca: " + getMarca() + 
                "\nModelo: " + getModelo() + 
                "\nAno: " + getAno() +
                "\nPreco: " + getPreco() +
                "\nCapacidade de Passageiros: " + getCapacidadePassageiros() + 
                "\nAutonomia de Voo: " + getAutonomiaVoo() +
                "\nTipo de Rotor: " + getTipoRotor() +
                "\nPotencia de Motor: " + getPotenciaMotor() +
                "\nAltitude Máxima de Operação: " + getaltitudeMaximaOperacao()
                ;
    } 


        private int capacidadePassageiros;
    private double autonomiaVoo;
    private String tipoRotor;
    private double potenciaMotor;
    private double altitudeMaximaOperacao;
}