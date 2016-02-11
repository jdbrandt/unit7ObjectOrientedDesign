public class Person implements Comparable<Person>
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
    
    
    public int compareTo(Person other)
    {    
        return this.name.compareTo(other.name);
        
        
    }
    
    public String toString()
    {
        return this.name;
    }
    
}


    
    