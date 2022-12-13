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

public class Pub {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    private LocalDateTime guestArrived;
    private LocalDateTime guestLeave;
    @Column
    private boolean goToDetox;
    @ManyToOne
    private Guest guest;
    @OneToMany(mappedBy = "pub")
    private List<Consumption> consumptionList;
}