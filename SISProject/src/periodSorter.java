
import java.util.Comparator;

public class periodSorter implements Comparator<Student>
    {
    public int compare(Song s1, Song s2)
        {
            return s1.getPeriod().compareTo(s2.getPeriod());
        }
    }