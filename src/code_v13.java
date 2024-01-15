public class code_v13 {
    public static void main(String[] args) {
        // Example of a Text Block (JEP 355)
        String json = """
            {
                "name": "John Doe",
                "age": 30,
                "city": "New York"
            }
            """;

        System.out.println(json);

        // Example of a Switch Expression (JEP 354)
        String day = "MONDAY";
        String typeOfDay = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };

        System.out.println(typeOfDay);
    }
}
