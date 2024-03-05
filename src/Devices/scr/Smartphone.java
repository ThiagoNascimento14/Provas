package ProvaDevices;

public class Smartphone extends Device implements DeviceInterface {

    private String BotaoDeLigar;
    private  String BotaoDeDesligar;
    private String EntradaDeCarregador;

    public String getBotaoDeLigar() {
        return BotaoDeLigar;
    }

    public void setBotaoDeLigar(String botaoDeLigar) {
        BotaoDeLigar = botaoDeLigar;
    }

    public String getBotaoDeDesligar() {
        return BotaoDeDesligar;
    }

    public void setBotaoDeDesligar(String botaoDeDesligar) {
        BotaoDeDesligar = botaoDeDesligar;
    }

    public String getEntradaDeCarregador() {
        return EntradaDeCarregador;
    }

    public void setEntradaDeCarregador(String entradaDeCarregador) {
        EntradaDeCarregador = entradaDeCarregador;
    }
public void performAction() {
        System.out.println("Realizando uma ligação");

    }
}
