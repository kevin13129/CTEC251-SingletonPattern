public class Main {
    public static void main(String[] args) {

        AudioSystem audio = new AudioSystem();
        GraphicsRenderer graphics = new GraphicsRenderer();

        audio.playSound();
        graphics.render();

        audio.setVolume(90);

        audio.playSound();

        ConfigurationManager.getInstance()
                .setResolution("2560x1440");

        graphics.render();
    }
}4