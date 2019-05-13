public class Main {
    public static void main(String[] args) {
        String first = "Hello"; // литеральная форма записи
        String second = new String("Hello"); // как объект, но так лучше не писать

        String filename = "image.png";
        System.out.println(filename.endsWith(".png")); // заканчивается на

        String person = "mr. Bin";
        System.out.println(person.startsWith("mr.")); // начинается с

        // TODO: сделать, чтобы работало для
        // "Ivan Petrov" -> "IP"
        // "Huan Pedro Rodriges" -> "HR"
        // "Ivan" -> "I"
        // ivan petrov -> IP

    }
}
