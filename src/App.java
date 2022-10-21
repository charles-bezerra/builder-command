import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        BuilderCommands bc = new BuilderCommands();

        bc.setCommand(Commands.A, () -> {
            System.out.println("command -a");
        }).setCommand(Commands.B, () -> {
            System.out.println("command -b");
        }).setCommand(Commands.C, () -> {
            System.out.println("command -c");
        });

        String line = scanner.nextLine();
        scanner.close();
        bc.run(line);
    }
}
