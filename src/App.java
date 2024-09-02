import java.util.Scanner;

class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String line = scanner.nextLine();
            int[] dimensions = Parser.parseDimensions(line);

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                WalkParameters walkParameters = Parser.parseWalkParameters(line);
                System.out.println(Robot.walk(walkParameters, dimensions));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {

            scanner.close();
        }
    }
};