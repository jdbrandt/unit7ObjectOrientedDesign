import java.util.Scanner;
import java.util.ArrayList;

public class PersonTester
{

    public PersonTester() {}
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Person[] people = {new Person("Cicero"), new Person("Caesar"), new Person("Pompey"),
            new Person("Joseph McCarthy"), new Person("Josef Stalin"), new Person("Vladmir Lenin"), 
            new Person("Marcus Lepidus"), new Person("Scipio Africanus"), 
            new Person("Quintus Fabius"), new Person("Augustus")};
        
        /**
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Name of person: ");
            people.add(new Person(s.next()));
            System.out.println("");
        }
        **/
        //sorts

        people = new PersonTester().sort(people);
        
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

    