import java.util.ArrayList;
import java.util.HashSet;

/**
 * class ArrayListCustom 
 * @author  abjal riski
 * @version 0.02
 */
public class ArrayListCustom<E> extends ArrayList<E>
{
    public boolean allowDuplicates;
    
    public ArrayListCustom(boolean allowDuplicates)
    {
        this.allowDuplicates = allowDuplicates;
    }
    
    HashSet <Object> mySet = new HashSet<Object>();
    public boolean add(E e){
        if(this.allowDuplicates == false && mySet.add(e) == false)
{
            throw new IllegalArgumentException("NIM Sudah Ada!!");
        }else if(this.allowDuplicates == true && mySet.add(e) == false)
        {
            super.add(e);
        }
        return allowDuplicates;
    }
    /**
     * Constructor for objects of class ArrayListCustom
     */
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
}

   