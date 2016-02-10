public class Person implements Comparable
{
    private String name;
    
    
    public Person()
    {
        this.name = "";
    }
    
    
    public Person(String n)
    {
        this.name = n;
    }
    
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    
    public int compareTo(Object other)
    {    
        Person otherPerson = (Person) other;
        return this.name.compareTo(otherPerson.name);
        
        
    }
    
    public String toString()
    {
        return this.name;
    }
    
}


    
    