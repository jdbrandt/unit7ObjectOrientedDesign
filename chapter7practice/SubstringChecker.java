public class SubstringChecker
{
    public String substr;
    
    public SubstringChecker(String s)
    {
        substr = s;
    }
    
    public boolean accepts(String text)
    {
        for (int i = 0; i < text.length()-substr.length(); i++)
        {
            if (text.substring(i, i+substr.length()+1).equals(substr))
            {
                return true;
            }
        }
        return false;
    }
}