
    /*
    One of the new features is the introduction of record classes, which are a new type of class in Java
    that makes it easy to create immutable data objects1
     */


//public record code_v15(String name, int age) {
//    public code_v15 {
//        if (age < 0) {
//            throw new IllegalArgumentException("Age cannot be negative");
//        }
//    }
//}
    public class code_v15 {
        private String name;
        private int age;

        public code_v15(String name, int age) {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
            this.name = name;
            this.age = age;
        }
    }
