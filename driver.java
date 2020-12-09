/*
Henry Johnson
the function of this program is to test the dictionary class
created: 12/8/20
las edited: 12/9/20
 */
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
        System.out.println("should print 1");
        System.out.println(dic1.size());
        dic1.put("Human","Basically an overapreciated species monkey that shout words at eachother insead" +
                " of throwing poop");
        dic1.put("Harambe","the only monkey to ever be appreciated until he grabbed one of the human monkeys, and was " +
                "shot by another human monkey");
        System.out.println("should print the collection containing all of the words in the dictionary of monkeys");
        System.out.println(dic1.keys());
        System.out.println("should print the collection containing all of the definitions of the monkeys");
        System.out.println(dic1.values());
    }
}
