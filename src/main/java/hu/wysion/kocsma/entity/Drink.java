package hu.wysion.kocsma.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "drink")

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
