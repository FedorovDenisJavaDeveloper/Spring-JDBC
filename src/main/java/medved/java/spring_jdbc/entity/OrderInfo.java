package medved.java.spring_jdbc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@Embeddable
public class OrderInfo {
    private Date date;
    @Column(name = "product_name")
    private String productName;
    private int amount;
}
