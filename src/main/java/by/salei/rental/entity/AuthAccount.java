package by.salei.rental.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "auth_account")
public class AuthAccount extends BaseEntity {

    private String login;
    private String password;
    private String email;

    @Enumerated(EnumType.STRING)
    private AccountStatus status;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Profile profile;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private DataForPurchase dataForPurchase;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private UserRole role;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private DriverLicense license;
}
