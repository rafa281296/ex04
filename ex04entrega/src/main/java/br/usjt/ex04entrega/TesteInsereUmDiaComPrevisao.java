package br.usjt.ex04entrega;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteInsereUmDiaComPrevisao {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Previsao p = new Previsao();
		p.setNome("Previsao");
		p.setDataeH("teste");
		p.setDescr("desc");
		p.setDiads("segunda-feira");
		p.setHumidadear(10);
		p.setLati(23.0);
		p.setLongi(43.5);
		p.setTempmax(17.3);
		p.setTempmin(23.7);
		manager.persist(p);
		DiaDaSemana u = new DiaDaSemana();
		u.setDiad("Segunda-Feira");
		u.setPerfil(p);
		manager.persist(u);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}