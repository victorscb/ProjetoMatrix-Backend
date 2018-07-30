package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;

/*
 * Ajustar a indentação do código.
 * Lembre se que a IDE faz isso
 */
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
	
	
	/*
	 * Encapsular a validação em um método
	 */
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
	
	    	return media.setScale(2); 
				}
		else
		{

        throw new IllegalArgumentException();
		}

		
	}

	/*
	 * pegarMedia não é um nome adequado para variável
	 * 
	 */
	public String getStatus(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
		 //Implementação o código aqui
	   String resultado;
	   BigDecimal pegarMedia = new BigDecimal("0");  
       pegarMedia=getMedia(nota1,nota2,nota3);
      
      
       if(pegarMedia.compareTo(new BigDecimal("6"))>=1) {
		resultado="APROVADO";       }
       else
    	   if(pegarMedia.compareTo(new BigDecimal("4"))>=0) {
   		resultado="PROVA_FINAL";       }
       
       else 
    	   resultado="REPROVADO";       
       return resultado;
	}
} 
