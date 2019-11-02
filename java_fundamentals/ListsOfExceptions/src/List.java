import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        List test = new List();

    }
    public List(){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        for(int i = 0; i < myList.size(); i++) {
            try {

                    Integer castedValue = (Integer) myList.get(i);
                    System.out.println(castedValue);

            }
            catch (ClassCastException e){
                System.out.println("Not Integer "+myList.get(i)+" Index: "+i);

            }
        }
    }
}
