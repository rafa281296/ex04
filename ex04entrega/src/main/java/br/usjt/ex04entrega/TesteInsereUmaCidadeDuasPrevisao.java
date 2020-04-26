package br.usjt.ex04entrega;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteInsereUmaCidadeDuasPrevisao {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Cidade f = new Cidade();
		f.setLati(10.5);
		f.setLongi(27.9);
		f.setNome("Rafael City");
		List<Previsao> previsoes = new ArrayList<>();
		Previsao c1 = new Previsao();
		c1.setDataeH("teste");
		c1.setDescr("desc");
		c1.setDiads("dia");
		c1.setLati(10.5);
		c1.setLongi(37.9);
		c1.setNome("Previsao");
		c1.setTempmax(10.9);
		c1.setTempmin(29.3);
		c1.setCidade(f);
		Previsao c2 = new Previsao();
		c2.setNome("NOMEDAORA");
		c1.setDataeH("teste");
		c1.setDescr("desc");
		c1.setDiads("dia");
		c1.setLati(10.5);
		c1.setLongi(37.9);
		c1.setTempmax(10.9);
		c1.setTempmin(29.3);
		c2.setCidade(f);
		previsoes.add(c1);
		previsoes.add(c2);
		f.setPrevisao(previsoes);
		manager.persist(f);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}
