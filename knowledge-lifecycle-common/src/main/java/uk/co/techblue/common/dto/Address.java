package uk.co.techblue.common.dto;

/**
 * The Class Address.
 */
public class Address {

    /** The address id. */
    private Long addressId;

    /** The flat no. */
    private Integer flatNo;

    /** The house number. */
    private Integer houseNumber;

    /** The house name. */
    private String houseName;

    /** The county. */
    private String county;

    /** The locality. */
    private String locality;

    /** The postcode. */
    private String postcode;

    /**
     * Gets the address id.
     * 
     * @return the address id
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * Sets the address id.
     * 
     * @param addressId the new address id
     */
    public void setAddressId(final Long addressId) {
        this.addressId = addressId;
    }

    /**
     * Gets the flat no.
     * 
     * @return the flat no
     */
    public Integer getFlatNo() {
        return flatNo;
    }

    /**
     * Sets the flat no.
     * 
     * @param flatNo the new flat no
     */
    public void setFlatNo(final Integer flatNo) {
        this.flatNo = flatNo;
    }

    /**
     * Gets the house number.
     * 
     * @return the house number
     */
    public Integer getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the house number.
     * 
     * @param houseNumber the new house number
     */
    public void setHouseNumber(final Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    /**
     * Gets the house name.
     * 
     * @return the house name
     */
    public String getHouseName() {
        return houseName;
    }

    /**
     * Sets the house name.
     * 
     * @param houseName the new house name
     */
    public void setHouseName(final String houseName) {
        this.houseName = houseName;
    }

    /**
     * Gets the county.
     * 
     * @return the county
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the county.
     * 
     * @param county the new county
     */
    public void setCounty(final String county) {
        this.county = county;
    }

    /**
     * Gets the locality.
     * 
     * @return the locality
     */
    public String getLocality() {
        return locality;
    }

    /**
     * Sets the locality.
     * 
     * @param locality the new locality
     */
    public void setLocality(final String locality) {
        this.locality = locality;
    }

    /**
     * Gets the postcode.
     * 
     * @return the postcode
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the postcode.
     * 
     * @param postcode the new postcode
     */
    public void setPostcode(final String postcode) {
        this.postcode = postcode;
    }

}
