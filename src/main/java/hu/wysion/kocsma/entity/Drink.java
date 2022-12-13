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

public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long ID;
    @Column
    private String drinkName;
    @Column
    private Double alcoholPercent;
    @Column
    private Double doseAmount;
    @OneToOne(mappedBy = "drink")
    private Consumption consumption;
}
