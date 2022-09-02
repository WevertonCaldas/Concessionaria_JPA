package br.edu.catolica.ppi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "owner_id")
@SuperBuilder(toBuilder = true)
@NoArgsConstructor

public class CarStore extends Owner {

    @Column(unique = true, nullable = false)
    private String cnpj;

    @OneToMany(cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<Customer> customers;


}
