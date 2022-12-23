package medved.java.spring_jdbc.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import medved.java.spring_jdbc.entity.OrderInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<OrderInfo> getProductName(String name) {
        return entityManager
//                .createQuery("select o.product_name from Orders as o, Customers as c where c.name = :name")
//                .createQuery("select o.productName from Order as o inner join Customers as c where c.name=:name")
                .createQuery("select distinct o.order from Order as o where o.customer.name=:name order by o.order.date")
                .setParameter("name", name)
                .getResultList();
    }
}
