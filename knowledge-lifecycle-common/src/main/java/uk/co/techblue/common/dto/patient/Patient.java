package uk.co.techblue.common.dto.patient;

import java.util.Date;

import uk.co.techblue.common.dto.Address;
import uk.co.techblue.common.dto.MaritalStatus;
import uk.co.techblue.common.dto.Sex;

/**
 * The Class Patient.
 */
public class Patient {

    /** The patient id. */
    private int patientId;

    /** The first name. */
    private String firstName;

    /** The last name. */
    private String lastName;

    /** The occupation. */
    private String occupation;

    /** The address. */
    private Address address;

    /** The marital status. */
    private MaritalStatus maritalStatus;

    /** The sex. */
    private Sex sex;

    /** The age. */
    private int age;

    /** The phone number. */
    private String phoneNumber;

    /** The nationality. */
    private String nationality;

    /** The registration date. */
    private Date registrationDate;

    /**
     * Gets the patient id.
     * 
     * @return the patient id
     */
    public int getPatientId() {
        return patientId;
    }

    /**
     * Sets the patient id.
     * 
     * @param patientId the new patient id
     */
    public void setPatientId(final int patientId) {
        this.patientId = patientId;
    }

    /**
     * Gets the first name.
     * 
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name.
     * 
     * @param firstName the new first name
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name.
     * 
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name.
     * 
     * @param lastName the new last name
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the occupation.
     * 
     * @return the occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the occupation.
     * 
     * @param occupation the new occupation
     */
    public void setOccupation(final String occupation) {
        this.occupation = occupation;
    }

    /**
     * Gets the address.
     * 
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the address.
     * 
     * @param address the new address
     */
    public void setAddress(final Address address) {
        this.address = address;
    }

    /**
     * Gets the marital status.
     * 
     * @return the marital status
     */
    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the marital status.
     * 
     * @param maritalStatus the new marital status
     */
    public void setMaritalStatus(final MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * Gets the sex.
     * 
     * @return the sex
     */
    public Sex getSex() {
        return sex;
    }

    /**
     * Sets the sex.
     * 
     * @param sex the new sex
     */
    public void setSex(final Sex sex) {
        this.sex = sex;
    }

    /**
     * Gets the age.
     * 
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age.
     * 
     * @param age the new age
     */
    public void setAge(final int age) {
        this.age = age;
    }

    /**
     * Gets the phone number.
     * 
     * @return the phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number.
     * 
     * @param phoneNumber the new phone number
     */
    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the nationality.
     * 
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the nationality.
     * 
     * @param nationality the new nationality
     */
    public void setNationality(final String nationality) {
        this.nationality = nationality;
    }

    /**
     * Gets the registration date.
     * 
     * @return the registration date
     */
    public Date getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the registration date.
     * 
     * @param registrationDate the new registration date
     */
    public void setRegistrationDate(final Date registrationDate) {
        this.registrationDate = registrationDate;
    }

}
