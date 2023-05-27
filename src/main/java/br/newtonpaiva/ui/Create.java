package br.newtonpaiva.ui;

import br.newtonpaiva.domain.Categoria;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Create {
    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("EC-PU");

        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();

        Categoria c = new Categoria();
        c.setId(1);
        c.setNome("Jogos");

        em.persist(c);

        em.getTransaction().commit();

        em.close();
        factory.close();
    }
}
