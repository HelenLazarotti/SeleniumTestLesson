package executores;
import robos.DoraRobo;
import robos.HelenRobo;

public class Executora {
    public static void main(String[] args) {
        HelenRobo umaHelenRobo =  new HelenRobo();
        DoraRobo dogDora = new DoraRobo();

        dogDora.abrirNavegador();
        umaHelenRobo.fazerLogin();
    }
}
