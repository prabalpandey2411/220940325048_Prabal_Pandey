import java.util.*;
class GrandParent
{
    GrandParent()
    {

    }
    String grandfather;
    String grandmother;
     GrandParent(String gf, String gm)
    {
        this.grandfather =gf;
        this.grandmother =gm;

        System.out.println("Grandfather_name "+ gf);
        System.out.println("Grandmother_name "+ gm);

    }
}

class Parents extends GrandParent
{
    Parents()
    {

    }
    public String father;
    public String mother;

    public Parents(String fn, String mn, String grandfather, String grandmother)
    {
        this.father = fn;
        this.mother = mn;
        System.out.println("Father_name "+ fn);
        System.out.println("Mother_name "+ mn);
    }
    public Parents(String grandfather, String grandmother, String father, String mother)
    {
        super(grandfather,grandmother);
    }
}
 class Child extends Parents {

     public Child(String father, String mother, String grandfather, String grandmother) {
         super(father, mother, grandfather, grandmother);
     }
 }

public class Ques4 {
public static void main(String[] args)
{
    Child c= new Child("Ram", "Sita","Dashrath","Sumitra");
    System.out.println(c.father+" "+c.mother+" "+c.grandfather+""+c.grandmother);
}
}
