package hu.wysion.kocsma.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "guest")


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
