/*
 * Author : stephanerheaume
 *Date : 16-Dec-2020
 */
public class Moyenne
{
		public static void main(String[]args)
			{
			
				int [] myTab= {14,12,24,12,2,9,8,3,1000,4,10,1,345,65,76,87,6,5,4,5};
				
				
				System.out.println(moyenneNotes(myTab));
			}
		
		 static int moyenneNotes(int [] a)
		{
				
		int somme=0;
		for(int i=0;i<a.length;i++)
		{
			somme+=a[i];  // somme = somme+a[i];
		}
		return somme/a.length;
				
			
				
			}
			
}