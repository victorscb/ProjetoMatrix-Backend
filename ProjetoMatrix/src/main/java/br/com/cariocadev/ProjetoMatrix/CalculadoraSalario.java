package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;

public class CalculadoraSalario {

	public BigDecimal getSalarioLiquido(BigDecimal salarioBruto, BigDecimal percentualImpostoINSS) {
		// Implementar o código aqui
		BigDecimal salarioLiquido = new BigDecimal("0");
		BigDecimal desconto = new BigDecimal("0");

		if (salarioBruto !=null && percentualImpostoINSS !=null) {

		desconto=salarioBruto.multiply(percentualImpostoINSS).divide(new BigDecimal("100"), BigDecimal.ROUND_HALF_UP);
		salarioLiquido=salarioBruto.subtract(desconto);
		/*salarioLiquido=salarioBruto.subtract(getValorINSS(salarioBruto));
		 *  pensei primeiro nisso pois na questao dizia 
		 *  " retorne o valor do salário líquido descontado o INSS de acordo com a
		tabela informada */
		System.out.println("percent: "+salarioLiquido);
		return salarioLiquido.setScale(2); 
		}
		else
        throw new IllegalArgumentException();

	}

	public BigDecimal getValorINSS(BigDecimal salarioBruto) {
		// Implementar o código aqui
		BigDecimal multi = new BigDecimal("8");
		BigDecimal multi2 = new BigDecimal("9");
		BigDecimal multi3 = new BigDecimal("11");
		BigDecimal calculoValorInss = new BigDecimal("0");


		if (salarioBruto ==null)  {
	        throw new IllegalArgumentException();

		}
				
		if (salarioBruto.compareTo(new BigDecimal("1693.72"))<=0)
		{
		calculoValorInss=salarioBruto.multiply(multi).divide(new BigDecimal("100"), BigDecimal.ROUND_HALF_UP);
		
		System.out.println("valor inss: "+calculoValorInss);
		System.out.println("valor bruto: "+salarioBruto);
		}

		if (salarioBruto.compareTo(new BigDecimal("1693.73"))>=0 && salarioBruto.compareTo(new BigDecimal("2822.90"))<=0)
		{
		calculoValorInss=salarioBruto.multiply(multi2).divide(new BigDecimal("100"), BigDecimal.ROUND_HALF_UP);
		
		System.out.println("valor inss2: "+calculoValorInss);
		System.out.println("valor bruto2: "+salarioBruto);
		}  
		
		if (salarioBruto.compareTo(new BigDecimal("2822.91"))>=0 )
			{
			calculoValorInss=salarioBruto.multiply(multi3).divide(new BigDecimal("100"), BigDecimal.ROUND_HALF_UP);
			
			System.out.println("valor inss3: "+calculoValorInss);
			System.out.println("valor bruto3: "+salarioBruto);
			}  
		
		
		return calculoValorInss;
		
	}
	
	
	

	public BigDecimal getValorPlanoDeSaude(Integer idade) {
		// TODO Auto-generated method stub
		return null;
	}

}
