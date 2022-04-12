package by.salei.rental.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "order")
public class Order extends BaseEntity {

    private String status;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private AuthAccount authAccount;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Car car;
}
