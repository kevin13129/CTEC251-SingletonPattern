public class Main {
    public static void main(String[] args) {

        ConfigurationManager config1 =
                ConfigurationManager.getInstance();

        ConfigurationManager config2 =
                ConfigurationManager.getInstance();

        System.out.println(config1 == config2);

        config1.setVolume(80);

        System.out.println("Config 1 volume: " + config1.getVolume());
        System.out.println("Config 2 volume: " + config2.getVolume());

    }

}