//Examples of System class 

class SystemDemo 
{
	public static void main(String[] args) 
	{
		if(System.getProperty("user.name").equals("aptech"))
		{
		System.out.println("userhome is "+System.getProperty("user.home"));  //gives the user home directory
		System.out.println("osname is "+System.getProperty("os.name"));      //gives the name of operating system 
		System.out.println("present classpath is "+System.getProperty("java.class.path"));//classpath
		System.out.println("java vendor is "+System.getProperty("java.vendor"));//classpath
		System.out.println("user name is "+System.getProperty("user.name"));//classpath
		}
		else
			System.out.println("invalid user");
	}
}
/* In the same way we can find allthe following system Environment properties.

file.separator
java.specification.version
java.vm.version
java.vendor
line.separator
java.class.version
java.vendor.url
os.arch
java.compiler
java.version
os.name
java.ext.dirs
java.vm.name
os.version
java.home 
java.vm.specification.name
path.separator
java.io.tmpdir 
java.vm.specification.vendor
user.dir
java.library.path 
java.vm.specification.version
user.home
java.specification.name 
java.vm.vendor 
user.name
java.specification.vendor

Try all the above properties as shown in program. 
*/