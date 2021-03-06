package org.art.web.persistence.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class BillingDetails {

    public BillingDetails() {}

    public BillingDetails(User owner) {
        this.owner = owner;
    }

    @Id
    @GeneratedValue(generator = "ADVANCED_GENERATOR")
    @GenericGenerator(
            name = "ADVANCED_GENERATOR",
            strategy = "enhanced-sequence",
            parameters = {
                    @Parameter(
                            name = "sequence_name",
                            value = "DOMAIN_TEST_SEQUENCE"
                    )
            })
    @Column(name = "BILLING_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User owner;

    public Long getId() {
        return id;
    }

    public User getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "BillingDetails{" +
                "id=" + id +
                '}';
    }
}
