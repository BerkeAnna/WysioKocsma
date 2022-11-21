package hu.wysion.kocsma.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "fight")

public class Fight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long ID;
    @Temporal(TemporalType.DATE)
    @Column
    private Date theFightStartingDate;
    @Temporal(TemporalType.DATE)
    @Column
    private Date theFightEndingDate;
    //a guest változó nem működik -> mo. onetoone, ect.
    @ManyToOne // csak ilyenkor nem pirosn ????
//    @JoinColumn(name = "winnerGuestId", nullable = false)
    private Guest winnerGuest;
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "fight_id"), inverseJoinColumns = @JoinColumn(name = "guest_id"))
    private List<Guest> fightingGuests;

}
