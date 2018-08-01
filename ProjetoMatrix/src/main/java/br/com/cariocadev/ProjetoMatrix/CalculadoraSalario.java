package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;

public class CalculadoraSalario {

	public BigDecimal getSalarioLiquido(BigDecimal salarioBruto, BigDecimal percentualImpostoINSS) {
		// Implementar o código aqui.
		BigDecimal salarioLiquido = new BigDecimal("0");
		BigDecimal desconto = new BigDecimal("0");

		if (salarioBruto != null && percentualImpostoINSS != null) {

			desconto = salarioBruto.multiply(percentualImpostoINSS).divide(new BigDecimal("100"),
					BigDecimal.ROUND_HALF_UP);
			salarioLiquido = salarioBruto.subtract(desconto);
			return salarioLiquido.setScale(2);
		} else
			throw new IllegalArgumentException();

	}

	public BigDecimal getValorINSS(BigDecimal salarioBruto) {
		// Implementar o código aqui

		BigDecimal calculoValorInss = new BigDecimal("0");

		if (salarioBruto == null) {
			throw new IllegalArgumentException();

		}

		else if (salarioBruto.compareTo(new BigDecimal("1693.72")) <= 0) {
			calculoValorInss = salarioBruto.multiply(new BigDecimal("8")).divide(new BigDecimal("100"),
					BigDecimal.ROUND_HALF_UP);

		}

		else if (salarioBruto.compareTo(new BigDecimal("1693.73")) >= 0
				&& salarioBruto.compareTo(new BigDecimal("2822.90")) <= 0) {
			calculoValorInss = salarioBruto.multiply(new BigDecimal("9")).divide(new BigDecimal("100"),
					BigDecimal.ROUND_HALF_UP);

		}

		else {
			calculoValorInss = salarioBruto.multiply(new BigDecimal("11")).divide(new BigDecimal("100"),
					BigDecimal.ROUND_HALF_UP);

		}

		return calculoValorInss;

	}

	public BigDecimal getValorPlanoDeSaude(Integer idade) {
		BigDecimal valorDesconto = new BigDecimal("0");
		if (idade != null && idade >= 0) {
			if (idade >= 0 && idade <= 9) {
				valorDesconto = new BigDecimal("75.00");
			} else if (idade >= 10 && idade <= 19) {
				valorDesconto = new BigDecimal("112.50");
			} else if (idade >= 20 && idade <= 29) {
				valorDesconto = new BigDecimal("168.75");
			} else if (idade >= 30 && idade <= 39) {
				valorDesconto = new BigDecimal("253.13");
			} else if (idade >= 40 && idade <= 49) {
				valorDesconto = new BigDecimal("379.69");
			} else if (idade >= 50 && idade <= 59) {
				valorDesconto = new BigDecimal("569.54");
			} else {
				valorDesconto = new BigDecimal("854.30");
			}

			return valorDesconto.setScale(2);
		}

		throw new IllegalArgumentException();

	}

}
