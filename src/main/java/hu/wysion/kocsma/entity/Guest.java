package hu.wysion.kocsma.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@Data


public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @Column(nullable = false)
    private String nickname;
    @Column
    private String liverStrength;
    @Column
    private Double bicepSize;
    @OneToMany(mappedBy = "guest")
    private List<Pub> pubList;
    @ManyToMany(mappedBy = "fightingGuests")
    private List<Fight> FightList;
}
