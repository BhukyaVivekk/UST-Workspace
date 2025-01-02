package ArraySearching;

public class ArrayString {
    public static void main(String[] args) {
        String []names = {"Vivek","Andrea","Sachin","Jagadeesh"};
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].toUpperCase();
        }
        for (String str : names) {
            System.out.println(str);
        }
        String max = " ";
        for(String str:names){
            if(str.length() > max.length()){
                max = str;
            }
        }
       System.out.println(max);

    }
}
