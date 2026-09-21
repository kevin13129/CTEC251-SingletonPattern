public class AudioSystem {

    public void playSound() {
        ConfigurationManager config =
                ConfigurationManager.getInstance();

        System.out.println(
                "Playing audio at volume " + config.getVolume()
        );
    }

    public void setVolume(int volume) {
        ConfigurationManager.getInstance().setVolume(volume);
    }
}