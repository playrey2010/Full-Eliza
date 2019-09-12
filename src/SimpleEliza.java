import java.util.*;

public class SimpleEliza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String problem = "";
        HashMap<String, String> map = new HashMap<>();
        map.put("I", "you");
        map.put("i ", "you ");
        map.put(" me", " you");
        map.put(" my", " your");
        map.put("my ", "your ");
        map.put(" am", " are");
        map.put("My", "Your");
        ArrayList<String> qualifiers = new ArrayList<>();
        qualifiers.add("Why do you say that ");
        qualifiers.add("Why do you feel that ");
        String[] hedges = new String[3];
        hedges[0] = "Please tell me more. ";
        hedges[1] = "Many of my patients tell me the same thing. ";
        hedges[2] = "It is getting late, maybe we had better quit. ";
        int hedorqual = 0;

        System.out.print("Good day. What is your problem?\n");
        while (!(problem.equalsIgnoreCase("I am feeling great")) && !problem.equalsIgnoreCase("q")) {
            hedorqual = r.nextInt(2);
            System.out.print("Enter your response here or Q to quit: ");
            problem = sc.nextLine();
            if (problem.equalsIgnoreCase("q") || problem.equalsIgnoreCase("I am feeling great")) {
                break;
            }
//            problem = problem.replaceAll("ME".toLowerCase(), "you");
//            System.out.println(problem);
            if (hedorqual == 0) {
                System.out.println(hedges[r.nextInt(3)]);
            } else {
                for (String key: map.keySet()) {
                    if (problem.contains(key)) {
                        problem = problem.replaceAll(key, map.get(key));
                    }
                }
                Collections.shuffle(qualifiers);
                System.out.println(qualifiers.get(0) + problem + "?");
            }
        }
    }
//    public static String help (String str) {
//        str = str.toLowerCase();
//        return str;
//    }
}
