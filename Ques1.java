import java.util.*;

public class Ques1
{
    public static void main(String[] args)
    {
        //creating new array list
        List<String> list= new ArrayList<String>();
        list.add("India");
        list.add("Pakistan");
        list.add("Bangladesh");
        list.add("Nepal");
        list.add("China");

        // to print the list
        for (String element : list)
        {
            System.out.println(element);
        }

    }
}
