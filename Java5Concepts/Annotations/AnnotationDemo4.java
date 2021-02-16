//SuppressWarning Annotation Example
import java.util.*;
/*class AnnotationDemo4
{
public void nonGenericsMethod()
{
 List wordList = new ArrayList(); // no typing information on the List
 wordList.add("foo"); // causes error on list addition
}
}*/

/* The above ccode when compiled gives an error, which the user doesn't know.
   In order to have the knowledge of at which line error has occured, we use 
   these type of annotations called SuppressWarnings. The following code illustrates that:
*/
public class AnnotationDemo4
{

@SuppressWarings(value={"unchecked"});  //this is how to declare the annotation

public void nonGenericsMethod() {
List wordList = new ArrayList(); // no typing information on the List
wordList.add("foo"); // causes error on list addition
}
}