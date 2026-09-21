import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ConfigurationManager config =
                ConfigurationManager.getInstance();

        AudioSystem audio = new AudioSystem();
        GraphicsRenderer graphics = new GraphicsRenderer();

        boolean running = true;

        while (running) {

            System.out.println("\n--- Game Engine Menu ---");
            System.out.println("1. View current settings");
            System.out.println("2. Change volume");
            System.out.println("3. Change resolution");
            System.out.println("4. Test subsystems");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    System.out.println("Volume: " + config.getVolume());
                    System.out.println("Resolution: " + config.getResolution());
                    System.out.println("Display Mode: " + config.getDisplayMode());
                    break;

                case "2":
                    System.out.print("Enter new volume: ");
                    int volume = Integer.parseInt(scanner.nextLine());
                    config.setVolume(volume);
                    break;

                case "3":
                    System.out.print("Enter new resolution: ");
                    String resolution = scanner.nextLine();
                    config.setResolution(resolution);
                    break;

                case "4":
                    audio.playSound();
                    graphics.render();
                    break;

                case "5":
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}