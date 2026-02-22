public class OOPSString
{
	public static void main(String args[])
	{
		String[] a=
		{
			String.join("   ","   ***   ", "   ***   " , " ******  " , "   *****  "),
	        String.join("   "," **   ** " ," **   ** " , "**    ** " , " **      "),
			String.join("   ","**     **" ,"**     **" , "**     **" , "**       "),
			String.join("   ","**     **" ,"**     **" , "**    ** " , " **      "),
			String.join("   ","**     **" ,"**     **" , "******   " , "   ***   "),
			String.join("   ","**     **" ,"**     **" , "**       " , "      ** "),
			String.join("   ","**     **" ,"**     **" , "**       " , "       **"),
			String.join("   "," **    **" ," **   ** " , "**       " , "       ** "),
			String.join("   ","   ***   ", "   ***   " , "**       " , "  *****   "),
		};
	for (String line : a) 
	{
			System.out.println(line);
	}
}

}
