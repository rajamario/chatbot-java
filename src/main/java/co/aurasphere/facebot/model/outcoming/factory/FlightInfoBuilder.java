package co.aurasphere.facebot.model.outcoming.factory;

import java.util.Calendar;

import co.aurasphere.facebot.model.outcoming.template.airline.Airport;
import co.aurasphere.facebot.model.outcoming.template.airline.FlightInfo;
import co.aurasphere.facebot.model.outcoming.template.airline.FlightSchedule;

/**
 * Builder for a {@link FlightInfo} object.
 * 
 * @author Donato Rimenti
 * @date Aug 25, 2016
 * @param <T>
 *            the class of the parent builder. Used for casting before returning
 *            it.
 */
public class FlightInfoBuilder<T extends FlightInfoBuilderDelegator> {

	/**
	 * The parent builder of this one. Used to return to the parent once the
	 * build is finished calling {@link #endFlightInfo()}.
	 */
	private T parentBuilder;

	/**
	 * The object managed by this builder.
	 */
	private FlightInfo flightInfo;

	/**
	 * Default constructor. Creates a builder for a {@link FlightInfo} object.
	 * 
	 * @param parentBuilder
	 *            the parent builder of this one. It can't be null.
	 * @param flightNumber
	 *            the flight number. It can't be empty.
	 */
	FlightInfoBuilder(T parentBuilder, String flightNumber) {
		this.parentBuilder = parentBuilder;
		this.flightInfo = new FlightInfo(flightNumber);
	}

	/**
	 * Sets the departure {@link Airport} for the current {@link FlightInfo}
	 * object. This field is mandatory for this object and can't be null.
	 * 
	 * @param airportCode
	 *            the airport code. It can't be empty.
	 * @param city
	 *            the city name. The city will be displayed over the airport
	 *            code in the template. It can't be empty.
	 * @param gate
	 *            the airport gate. This field is optional.
	 * @param terminal
	 *            the airport terminal. This field is optional.
	 * @return this builder.
	 */
	public FlightInfoBuilder<T> setDepartureAirport(String airportCode, String city,
			String gate, String terminal) {
		Airport departureAirport = new Airport(airportCode, city, gate,
				terminal);
		this.flightInfo.setDepartureAirport(departureAirport);
		return this;
	}

	/**
	 * Sets the departure {@link Airport} for the current {@link FlightInfo}
	 * object. This field is mandatory for this object and can't be null.
	 * 
	 * @param airportCode
	 *            the airport code. It can't be empty.
	 * @param city
	 *            the city name. The city will be displayed over the airport
	 *            code in the template. It can't be empty.
	 * @return this builder.
	 */
	public FlightInfoBuilder<T> setDepartureAirport(String airportCode, String city) {
		Airport departureAirport = new Airport(airportCode, city);
		this.flightInfo.setDepartureAirport(departureAirport);
		return this;
	}

	/**
	 * Sets the departure {@link Airport} for the current {@link FlightInfo}
	 * object. This field is mandatory for this object and can't be null.
	 * 
	 * @param airport
	 *            the departure airport. It can't be null.
	 * @return this builder.
	 */
	public FlightInfoBuilder<T> setDepartureAirport(Airport airport) {
		this.flightInfo.setDepartureAirport(airport);
		return this;
	}

	/**
	 * Sets the arrival {@link Airport} for the current {@link FlightInfo}
	 * object. This field is mandatory for this object and can't be null.
	 * 
	 * @param airportCode
	 *            the airport code. It can't be empty.
	 * @param city
	 *            the city name. The city will be displayed over the airport
	 *            code in the template. It can't be empty.
	 * @param gate
	 *            the airport gate. This field is optional.
	 * @param terminal
	 *            the airport terminal. This field is optional.
	 * @return this builder.
	 */
	public FlightInfoBuilder<T> setArrivalAirport(String airportCode, String city, String gate,
			String terminal) {
		Airport arrivalAirport = new Airport(airportCode, city, gate, terminal);
		this.flightInfo.setArrivalAirport(arrivalAirport);
		return this;
	}

	/**
	 * Sets the arrival {@link Airport} for the current {@link FlightInfo}
	 * object. This field is mandatory for this object and can't be null.
	 * 
	 * @param airportCode
	 *            the airport code. It can't be empty.
	 * @param city
	 *            the city name. The city will be displayed over the airport
	 *            code in the template. It can't be empty.
	 * @return this builder.
	 */
	public FlightInfoBuilder<T> setArrivalAirport(String airportCode, String city) {
		Airport arrivalAirport = new Airport(airportCode, city);
		this.flightInfo.setArrivalAirport(arrivalAirport);
		return this;
	}

	/**
	 * Sets the arrival {@link Airport} for the current {@link FlightInfo}
	 * object. This field is mandatory for this object and can't be null.
	 * 
	 * @param airport
	 *            the arrival airport. It can't be null.
	 * @return this builder.
	 */
	public FlightInfoBuilder<T> setArrivalAirport(Airport airport) {
		this.flightInfo.setArrivalAirport(airport);
		return this;
	}

	/**
	 * Sets the {@FlightSchedule} object for the current
	 * {@link FlightInfo} object. This field is mandatory for this object and
	 * can't be null.
	 * 
	 * @param departureTime
	 *            the departure time. It can't be null.
	 * @param arrivalTime
	 *            the arrival time. It can't be null.
	 * @return this builder.
	 */
	public FlightInfoBuilder<T> setFlightSchedule(Calendar departureTime, Calendar arrivalTime) {
		FlightSchedule flightSchedule = new FlightSchedule(departureTime,
				arrivalTime);
		this.flightInfo.setFlightSchedule(flightSchedule);
		return this;
	}

	/**
	 * Sets the {@FlightSchedule} object for the current
	 * {@link FlightInfo} object. This field is mandatory for this object and
	 * can't be null.
	 * 
	 * @param departureTime
	 *            the departure time. It can't be null.
	 * @param arrivalTime
	 *            the arrival time. It can't be null.
	 * @param boardingTime
	 *            the boarding time. This field is optional.
	 * @return this builder.
	 */
	public FlightInfoBuilder<T> setFlightSchedule(Calendar departureTime, Calendar arrivalTime,
			Calendar boardingTime) {
		FlightSchedule flightSchedule = new FlightSchedule(departureTime,
				arrivalTime, boardingTime);
		this.flightInfo.setFlightSchedule(flightSchedule);
		return this;
	}

	/**
	 * Sets the {@FlightSchedule} object for the current
	 * {@link FlightInfo} object. This field is mandatory for this object and
	 * can't be null.
	 * 
	 * @param flightSchedule
	 *            the flight schedule to set. It can't be null.
	 * @return this builder.
	 */
	public FlightInfoBuilder<T> setFlightSchedule(FlightSchedule flightSchedule) {
		this.flightInfo.setFlightSchedule(flightSchedule);
		return this;
	}

	/**
	 * Builds the current object, adds it to the parent builder and returns the
	 * parent builder.
	 * 
	 * @return the parent builder of this builder.
	 */
	public T endFlightInfo() {
		parentBuilder.addFlightInfo(flightInfo);
		return parentBuilder;
	}

}
