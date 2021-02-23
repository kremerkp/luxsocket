package lu.lux.socket;



import java.time.Instant;

public interface SimpleRoutingAppointment {

	Long getAppointmentid();

	String getCustomerfullname();

	Long getTransporttype();

	Long getAppointmentstate();

	Instant getStarttime();

	Instant getEndtime();

	Long getStationtype();

	String getFromaddress();

	String getToaddress();

	String getFirstDriverName();

	String getSecondDriverName();

	Long getTransportTypeLine();

	String getDepartmentFrm();

	String getRoomFrm();

	String getDepartmentTo();

	String getRoomTo();

	String getFirstCarLicencePlate();

	String getSecondCarLicensePlate();

	Boolean getInfusion();

	Boolean getOxygen();

	Boolean getDsa();

	Boolean getCorona();

	Boolean getHinfahrt();

	Boolean getRueckfahrt();

	String getRemark();
	
	Long getFromAddressId();
	
	Long getToAddressId();

}
