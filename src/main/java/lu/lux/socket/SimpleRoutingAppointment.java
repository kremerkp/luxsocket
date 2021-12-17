package lu.lux.socket;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Date;

/**
 * interface with SimpleRoutingAppointment attributes that are shown in Calender
 * / Frontend
 */
public interface SimpleRoutingAppointment {

	Long getAppointmentid();

	String getCustomerfullname();

	Long getTransportType();

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

	Instant getCreateDate();

	Instant getLastmodifydDate();

	String getLastmodifyUserName();

	String getCreateUserName();

	Boolean getIsolated();

	Boolean getShowDescription();

	Boolean getOpenInvoices();

	BigDecimal getNotPaid();

	Date getLastInvoiceDate();

	String getLastInvoiceNumber();

	String getFullFromAddress();

	String getFullToAddress();

	Integer getTitleId();

	Integer getCustomerId();

	LocalTime getReturnAppointment();
	
	String getHealthInsuranceNumber();
	
	Integer getOxyliter();
	
	LocalTime getMeetingTime();
	
	Boolean getVaccinated();
	
	String getLastName();
	
	Boolean getStayByPatient();

}
