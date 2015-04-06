package uk.co.techblue.common.dto.patient;

import java.util.Date;

import uk.co.techblue.common.dto.Diagnosis;
import uk.co.techblue.common.dto.Drug;
import uk.co.techblue.common.dto.doctor.Doctor;

public class Prescription {

    private Long prescriptionId;

    private Diagnosis diagnosisDetails;

    private Drug drugDetails;

    private Date prescriptionDate;

    private Doctor doctor;

}
