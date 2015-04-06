package uk.co.techblue.common.dto.doctor;

import uk.co.techblue.common.dto.Qualification;

/**
 * The Class Doctor.
 */
public class Doctor {

    /** The doctor id. */
    private Long doctorId;

    /** The first name. */
    private String firstName;

    /** The last name. */
    private String lastName;

    /** The cases handled. */
    private int casesHandled;

    /** The highest qualification. */
    private String highestQualification;

    /** The qualification. */
    private Qualification qualification;

    /**
     * Gets the doctor id.
     * 
     * @return the doctor id
     */
    public Long getDoctorId() {
        return doctorId;
    }

    /**
     * Sets the doctor id.
     * 
     * @param doctorId the new doctor id
     */
    public void setDoctorId(final Long doctorId) {
        this.doctorId = doctorId;
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
     * Gets the cases handled.
     * 
     * @return the cases handled
     */
    public int getCasesHandled() {
        return casesHandled;
    }

    /**
     * Sets the cases handled.
     * 
     * @param casesHandled the new cases handled
     */
    public void setCasesHandled(final int casesHandled) {
        this.casesHandled = casesHandled;
    }

    /**
     * Gets the highest qualification.
     * 
     * @return the highest qualification
     */
    public String getHighestQualification() {
        return highestQualification;
    }

    /**
     * Sets the highest qualification.
     * 
     * @param highestQualification the new highest qualification
     */
    public void setHighestQualification(final String highestQualification) {
        this.highestQualification = highestQualification;
    }

    /**
     * Gets the qualification.
     * 
     * @return the qualification
     */
    public Qualification getQualification() {
        return qualification;
    }

    /**
     * Sets the qualification.
     * 
     * @param qualification the new qualification
     */
    public void setQualification(final Qualification qualification) {
        this.qualification = qualification;
    }

}
