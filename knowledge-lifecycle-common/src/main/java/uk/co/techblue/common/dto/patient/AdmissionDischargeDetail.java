package uk.co.techblue.common.dto.patient;

import java.util.Date;

import uk.co.techblue.common.dto.Ward;

/**
 * The Class AdmissionDischargeDetail.
 */
public class AdmissionDischargeDetail {

    /** The admission discharge id. */
    private Long admissionDischargeId;

    /** The ward. */
    private Ward ward;

    /** The admitted on. */
    private Date admittedOn;

    /** The discharged on. */
    private Date dischargedOn;

    /** The patient. */
    private Patient patient;

    /**
     * Gets the admission discharge id.
     * 
     * @return the admission discharge id
     */
    public Long getAdmissionDischargeId() {
        return admissionDischargeId;
    }

    /**
     * Sets the admission discharge id.
     * 
     * @param admissionDischargeId the new admission discharge id
     */
    public void setAdmissionDischargeId(final Long admissionDischargeId) {
        this.admissionDischargeId = admissionDischargeId;
    }

    /**
     * Gets the ward.
     * 
     * @return the ward
     */
    public Ward getWard() {
        return ward;
    }

    /**
     * Sets the ward.
     * 
     * @param ward the new ward
     */
    public void setWard(final Ward ward) {
        this.ward = ward;
    }

    /**
     * Gets the admitted on.
     * 
     * @return the admitted on
     */
    public Date getAdmittedOn() {
        return admittedOn;
    }

    /**
     * Sets the admitted on.
     * 
     * @param admittedOn the new admitted on
     */
    public void setAdmittedOn(final Date admittedOn) {
        this.admittedOn = admittedOn;
    }

    /**
     * Gets the discharged on.
     * 
     * @return the discharged on
     */
    public Date getDischargedOn() {
        return dischargedOn;
    }

    /**
     * Sets the discharged on.
     * 
     * @param dischargedOn the new discharged on
     */
    public void setDischargedOn(final Date dischargedOn) {
        this.dischargedOn = dischargedOn;
    }

    /**
     * Gets the patient.
     * 
     * @return the patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Sets the patient.
     * 
     * @param patient the new patient
     */
    public void setPatient(final Patient patient) {
        this.patient = patient;
    }

}
