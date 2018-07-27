package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;

public class AvaliadorAluno {

	public BigDecimal getMaiorNota(BigDecimal[] notas) {
		// Implementação o código aqui
	
		BigDecimal maiornota = new BigDecimal("0");
		if(notas ==null) 
	        throw new IllegalArgumentException();
		for(int i=0;i<=3;i++)  {
			if (notas[i].compareTo(maiornota) ==1)
				maiornota = notas[i];		
		} 		return maiornota.setScale(2);

		}
	
	

	public BigDecimal getMedia(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
		BigDecimal media = new BigDecimal("0");
		BigDecimal divisor = new BigDecimal("3");
		if((nota1 !=null && nota2 !=null && nota3 !=null) &&
		(nota1.compareTo(new BigDecimal("10"))<=0 && 
		nota2.compareTo(new BigDecimal("10"))<=0 && 
		nota3.compareTo(new BigDecimal("10"))<=0) &&
		(nota1.compareTo(new BigDecimal("0"))>0 && 
		nota2.compareTo(new BigDecimal("0"))>0 && 
		nota3.compareTo(new BigDecimal("0"))>0))
				{

			media=nota1.add(nota2).add(nota3).divide(divisor, BigDecimal.ROUND_HALF_UP);
	        //System.out.println("media é:"+media);
	
	    	return media.setScale(2); 
				}
		else
		{
        //System.out.println("zero "+media);

        throw new IllegalArgumentException();
		}

		
	}

	public String getStatus(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
		 //Implementação o código aqui
		
	   BigDecimal pegarMedia = new BigDecimal("0");  
       pegarMedia=getMedia(nota1,nota2,nota3);
       //System.out.println("pegamedia"+pegarMedia);
      
      
       if(pegarMedia.compareTo(new BigDecimal("6"))>=1) {
		return "APROVADO";       }
       if(pegarMedia.compareTo(new BigDecimal("4"))>=0) {
       return "PROVA_FINAL"; 	 }
       
       return "REPROVADO";
	}
}