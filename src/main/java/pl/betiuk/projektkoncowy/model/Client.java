package pl.betiuk.projektkoncowy.model;


import org.hibernate.validator.constraints.pl.PESEL;

import javax.persistence.*;

@Entity
@Table
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;
    private String firstName;
    private String lastName;
    @PESEL
    private String pesel;



//    @ManyToOne
//       private Address address;
}
