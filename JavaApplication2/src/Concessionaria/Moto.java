package Concessionaria;

public class Moto extends Veiculos
{
    private String tipoMotor;
    private double cilindrada;
    private String tipoPartida;
    private double peso;

    public String getTipoMotor()
    {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor)
    {
        this.tipoMotor = tipoMotor;
    }

    public double getCilindrada()
    {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada)
    {
        this.cilindrada = cilindrada;
    }

    public String getTipoPartida()
    {
        return tipoPartida;
    }

    public void setTipoPartida(String tipoPartida)
    {
        this.tipoPartida = tipoPartida;
    }

    public double getPeso()
    {
        return peso;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }
    
    @Override
    public String ObterInformacoes()
    {
        return "Marca: " + getMarca() + 
                "\nModelo: " + getModelo() + 
                "\nAno: " + getAno() +
                "\nPreco: " + getPreco() +
                "\nTipo de Motor: " + getTipoMotor() +
                "\nCilindrada: " + getCilindrada() +
                "\nTipo de Partida: " + getTipoPartida() +
                "\nPeso: " + getPeso();
    } 
}
