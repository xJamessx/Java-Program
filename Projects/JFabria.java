public class JFabria {
    public static void main(String[] args) {
        String fname = "James";
        String lname = "Fabria";
        String[] friends = {"Ezra", "Ian", "Sigmund"};
        String[] games = {"Plants vs. Zombies", "Minecraft"};
        String vehicle = "e-bus";
        String place = "Rizal High School";
        String food = "ice cream ";
        double price = 0.53;
        char currency = '$';
        String feeling = "hot";

        System.out.print("Greetings! I am " + fname + " " + lname + ". ");
        System.out.println("I have close friends, and they are " + friends[0] + ", " + friends[1] + ", and " + friends[2] + ".");
        System.out.print("I love playing games like " + games[0] + " and " + games[1] + ". ");
        System.out.println("Meanwhile, Sigmund likes to play baseball—and I don't know what is the favorite sport or game of my two other friends.");
        System.out.println("A few months ago, we traveled to " + place + " by " + vehicle + "." + " We simply missed our alma mater.");
        System.out.printf("Afterwards, we ate delicious and cold " + food + "which costs " + currency + price + ".");
        System.out.println("\nOn that sunny day, we felt really " + feeling + "!");
    }
}