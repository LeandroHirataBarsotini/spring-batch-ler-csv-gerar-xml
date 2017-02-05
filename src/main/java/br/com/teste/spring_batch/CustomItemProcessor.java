package br.com.teste.spring_batch;

import org.springframework.batch.item.ItemProcessor;

import br.com.teste.spring_batch.model.Relatorio;

public class CustomItemProcessor implements ItemProcessor<Relatorio, Relatorio>{

	public Relatorio process(Relatorio item) throws Exception {

		System.out.println("Processando: " + item);
		return item;
		
	}
	
}
