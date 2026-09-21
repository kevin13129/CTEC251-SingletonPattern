public class ConfigurationManager {

    private static final ConfigurationManager instance =
            new ConfigurationManager();

    private int volume = 50;
    private String resolution = "1920x1080";
    private String displayMode = "Windowed";

    private ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getDisplayMode() {
        return displayMode;
    }

    public void setDisplayMode(String displayMode) {
        this.displayMode = displayMode;
    }
}