package medved.java.spring_jdbc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Check;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;
    @Check(constraints = "age>0 and age<150")
    private int age;
    @Column(name = "phone_number")
    private String phoneNumber;
}
