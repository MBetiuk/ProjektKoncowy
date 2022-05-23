package pl.betiuk.projektkoncowy.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "addresses")
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String streetName;
    private String houseNo;
    private String flatNo;
    private String postCode;
    private String town;

//    @OneToMany (mappedBy = "address")
//    private List<Client> clients = new ArrayList<>();

}
