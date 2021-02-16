/*This program uses break and continue using for loop
*/
public class for4
{  
	public static void main(String args[]){
                int no=10;
                int i=1,j;
                        for(i=1;i<10;i++)
                        {
                           if ( (i %2 ) == 0)
                                continue;  //check the result by removing comment in next statement
                               /* break;*/
                           System.out.println(i);
                        }
                
        }

}
