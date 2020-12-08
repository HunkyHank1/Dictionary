public class driver {
    public static void main(String[] args) {
        Dictionary dic1 = new Dictionary();
        Dictionary dic2 = new Dictionary();
        dic1.put("Chimp","chimpanzee, a pretty goofy monkey");
        System.out.println("should print the definition of Chimp");
        System.out.println(dic1.get("Chimp"));
        System.out.println("should print 1");
        System.out.println(dic1.size());
        System.out.println("should print true");
        System.out.println(dic2.isEmpty());
        dic1.put("Monkey","MMMMMMM... Monkey");
        System.out.println("should print the definition of Monkey and remove Monkey");
        System.out.println(dic1.remove("Monkey"));
    }
}
