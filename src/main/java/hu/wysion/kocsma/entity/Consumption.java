package hu.wysion.kocsma.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "consumption")

public class Consumption {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long ID;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "drink_id")
    private Drink drink;
    @Column
    private int howManyUnit;
    @ManyToOne
//    @JoinColumn(name = "pubId", nullable = false)
    private Pub pub;
}
