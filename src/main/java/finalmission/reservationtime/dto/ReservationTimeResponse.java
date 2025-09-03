package finalmission.reservationtime.dto;

import finalmission.reservationtime.domain.ReservationTime;
import java.time.LocalTime;

public record ReservationTimeResponse(
        Long id,
        LocalTime startAt
) {
    public static ReservationTimeResponse from(ReservationTime reservationTime) {
        return new ReservationTimeResponse(
                reservationTime.getId(),
                reservationTime.getStartAt()
        );
    }
}
