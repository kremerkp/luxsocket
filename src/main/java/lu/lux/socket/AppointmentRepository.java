package lu.lux.socket;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
	
	@Query(nativeQuery = true, value="select * from v_simpleroutingappointment where starttime between :start and :end" )
	public List<SimpleRoutingAppointment> findSimpleRoutingAppointments(@Param("start") Date start, @Param("end") Date end );
	
	@Query(nativeQuery = true, value="select * from v_simpleroutingappointment where starttime between :start and :end limit 1" )
	public SimpleRoutingAppointment findSimpleRoutingAppointmentsFirst(@Param("start") Date start, @Param("end") Date end );
	
	@Query(nativeQuery = true, value="select * from v_simpleroutingappointment where appointmentid = :id " )
	public SimpleRoutingAppointment findSimpleRoutingAppointmentsById(@Param("id") Long id);
 
}
