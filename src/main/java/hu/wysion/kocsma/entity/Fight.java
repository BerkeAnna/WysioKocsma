package hu.wysion.kocsma.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@Data


public class Fight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long ID;
    @Column
    private LocalDateTime theFightStartingDate;
    @Column
    private LocalDateTime theFightEndingDate;
    @ManyToOne
    private Guest winnerGuest;
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "fight_id"), inverseJoinColumns = @JoinColumn(name = "guest_id"))
    private List<Guest> fightingGuests;

}
