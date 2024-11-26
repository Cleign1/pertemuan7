public class Main {
    public static void main(String[] args) {
        System.out.println("Hello guys!");

        String[] books = {"Java Programming", "Database Design", "Web Development"};
        System.out.println("Available books:");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }
}