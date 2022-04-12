package by.salei.rental.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public class BaseEntity {

    @Id
    private Integer id;
}
