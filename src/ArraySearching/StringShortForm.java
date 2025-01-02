package ArraySearching;

public class StringShortForm {
    public static void main(String[] args) {
        String []names = {"Vivek Bhukya","Andrea A Sen ","Sachin Thomas","Sai Karthik"};
        for (String name : names) {
            // Split the name into words
            String[] parts = name.split(" ");

            // Get the short form
            String shortForm = parts[0]; // First name remains unchanged
            if (parts.length > 1) {
                shortForm += " " + parts[1].charAt(0); // Add the first letter of the last name
            }

            // Print the short form
            System.out.println(shortForm);
        }

    }
}
