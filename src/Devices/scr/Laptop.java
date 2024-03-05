package ProvaDevices;

public class Laptop extends Device implements DeviceInterface {

    private String Teclado;
    private  String Tela;
    private String Mouse;

    public String getTeclado() {
        return Teclado;
    }

    public void setTeclado(String teclado) {
        Teclado = teclado;
    }

    public String getTela() {
        return Tela;
    }

    public void setTela(String tela) {
        Tela = tela;
    }

    public String getMouse() {
        return Mouse;
    }

    public void setMouse(String mouse) {
        Mouse = mouse;
    }
    public void performAction() {
        System.out.println ("Inicializando Windows");
    }
}
