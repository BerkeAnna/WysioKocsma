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
@Table(name = "pub")
@Data

public class Pub {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    @Temporal(TemporalType.DATE)
    private Date guestArrived;
    @Temporal(TemporalType.DATE)
    private Date guestLeave;
    @Column
    private boolean goToDetox;
    @ManyToOne
//    @JoinColumn(name = "guest_id", nullable = false)
    private Guest guest;
    @OneToMany(mappedBy = "pub")
    private List<Consumption> consumptionList;
}