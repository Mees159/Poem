public class Poem
{
    String title;
    int lines;
    Poem(){
    }
    Poem(String t,int l)
    {
        title=t;
        lines=l;
    }
    public String getTitle(){
        return title;
    }
    public int getLines(){
        return lines;
    }

}
