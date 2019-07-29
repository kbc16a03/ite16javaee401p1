package beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class MeasurementDb {

    @PersistenceContext
    private EntityManager em;

    public void create(Measurement measurement) {
        em.persist(measurement);
    }
    
    public List<Measurement> getAll() {
        return em.createQuery("SELECT c FROM Measurement c").getResultList();
    }
}