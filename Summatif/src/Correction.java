/*
* Author: cy.andersen
* Date: Dec. 16, 2020
* Description:Correction d'un programme donner
*/
public class Correction
{

	public static void main(String[] args)
	{
		//ajouter un escpace entre " et John pour le format
		System.out.println(saluerAmi(" John"));
			
	}
	//changer public static saluerAmi(String a) a "public static String saluerAmi(String a)"
	public static String saluerAmi(String a)
	{
		String message="Bonjour mon ami" + a;
			return message;
	
	}

}
