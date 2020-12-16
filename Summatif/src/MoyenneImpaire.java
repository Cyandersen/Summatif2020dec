/*
* Author: cy.andersen
* Date: Dec. 16, 2020
* Description:
*/

public class MoyenneImpaire
{
	public static void main(String[] args)		{
		//Code pour produire un tableau de 20 entiers générés aléatoirement
		int[] arr = new int[20];       
		for(int i = 0; i < arr.length;) {
		      arr[i] = (int)(Math.random()*999);
		 //renvoie la moyenne des nombres
		 System.out.println("Moynne des nombres impaires est " + Moyennedesnombresimpairs(arr));
		 break;
		}}
	//methode pour calculer la moyenne des nombres impairs dans le tableau généré
	static double Moyennedesnombresimpairs(int[] tab) {
		double sum = 0;
		int count = 0;
		for (int val : tab) {
			if (val % 2 == 1) {
				sum+=val; 
				count++; 
				}
			}
		//Code pour quand le tableau généré ne contient aucun nombre impair
		if (count == 0) {
			System.out.println("Pas de nombres impairs dans le tableau généré");
		
		}
		return sum;
		}
	}
		 