package ProvaDevices;

public class SmartTV extends Device implements DeviceInterface {

    private String Tela;
    private String AutoFalante;
    private String BotaoAumentaVolume;
    private String BotaoAbaixaVolume;

    public String getTela() {
        return Tela;
    }

    public void setTela(String tela) {
        Tela = tela;
    }

    public String getAutoFalante() {
        return AutoFalante;
    }

    public void setAutoFalante(String autoFalante) {
        AutoFalante = autoFalante;
    }

    public String getBotaoAumentaVolume() {
        return BotaoAumentaVolume;
    }

    public void setBotaoAumentaVolume(String botaoAumentaVolume) {
        BotaoAumentaVolume = botaoAumentaVolume;
    }

    public String getBotaoAbaixaVolume() {
        return BotaoAbaixaVolume;
    }

    public void setBotaoAbaixaVolume(String botaoAbaixaVolume) {
        BotaoAbaixaVolume = botaoAbaixaVolume;
    }
    public void performAction() {
        System.out.println ("Acessando Netflix");
    }

}