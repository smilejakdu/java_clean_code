package clean.code.houseutils.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class Apartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public String address;

    @Column(nullable = false)
    public Long price;


}
