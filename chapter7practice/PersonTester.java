import java.util.Scanner;
import java.util.*;

public class PersonTester
{

    public PersonTester() {}
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<Person>();
        
        
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Name of person: ");
            people.add(new Person(s.next()));
            System.out.println("");
        }
        
        //sorts

        Collections.sort(people);
        
        for (Person p : people)
        {
            System.out.println(p);
        }
        

    }
    
    public static Person[] sort(Person[] people)
    {
        while (!new PersonTester().sorted(people))
        {
            for (int i = 0; i < people.length; i++)
            {
                for (int j = 0; j < people.length; j++)
                {
                    if (i < j && people[i].compareTo(people[j])==1)
                    {
                        Person temp = people[i];
                        people[i] = people[j];
                        people[j] = temp;
                    }
                    
                    else if (i > j && people[i].compareTo(people[j])==-1)
                    {
                        Person temp = people[i];
                        people[i] = people[j];
                        people[j] = temp;
                    }
                }
            }
        
        }
        return people;
    
    }
    
    
        public static boolean sorted(Person[] people)
        {
        
        
        for (int i = 0; i < people.length-1; i++)
        {
            if (!(people[i+1].compareTo(people[i])==-1))
            {
                return false;
            }
        }
        return true;
    }
}

    