package hu.wysion.kocsma.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@Data

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
    private Pub pub;
}
