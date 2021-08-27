package lu.lux.socket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class AppointmentController {

	@Autowired
	AppointmentRepository appointmentRepository;

	//private final SimpMessagingTemplate simpMessagingTemplate = null;

	@Autowired
	private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/refreshAppointments")
    @SendTo("/luxablApp/appointments")
    public SimpleRoutingAppointment greet3(Long appointmentId) throws Exception {
    	Thread.sleep(10); // simulated delay
		SimpleRoutingAppointment simp =  appointmentRepository.findSimpleRoutingAppointmentsById(appointmentId);
        return simp;

    }



}
