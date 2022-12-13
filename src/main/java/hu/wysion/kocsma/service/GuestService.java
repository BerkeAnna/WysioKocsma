package hu.wysion.kocsma.service;

import hu.wysion.kocsma.entity.Guest;
import hu.wysion.kocsma.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

import static org.springframework.util.StringUtils.hasText;

@Service
public class GuestService {

    @Autowired
    private GuestRepository guestRepository;

    public Guest saveGuest(Guest guest) {
        return guestRepository.save(guest);
    }

    public List<Guest> fetchGuestList() {
        return (List<Guest>) guestRepository.findAll();
    }

    public Guest fetchGuestById(Long guestID) {
        return guestRepository.findById(guestID).get();
    }

    public Guest updateGuest(Guest guest, Long guestId) {
        Guest guestDB = guestRepository.findById(guestId).get();

        if (Objects.nonNull(guest.getNickname()) && hasText(
                guest.getNickname())) {
            guestDB.setNickname(
                    guest.getNickname());
        }
        if (Objects.nonNull(guest.getLiverStrength()) && hasText(guest.getLiverStrength())) {
            guestDB.setLiverStrength(
                    guest.getLiverStrength());
        }
        if (Objects.nonNull(guest.getBicepSize())) {
            guestDB.setBicepSize(
                    guest.getBicepSize());
        }
        if (Objects.nonNull(guest.getPubList())) {
            guestDB.setPubList(
                    guest.getPubList());
        }
        if (Objects.nonNull(guest.getFightList())) {
            guestDB.setFightList(
                    guest.getFightList());
        }


        return guestRepository.save(guestDB);
    }


    public void deleteGuestByID(Long guestId) {
        guestRepository.deleteById(guestId);
    }


}
