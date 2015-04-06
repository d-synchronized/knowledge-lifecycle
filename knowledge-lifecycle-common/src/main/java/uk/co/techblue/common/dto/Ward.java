package uk.co.techblue.common.dto;

/**
 * The Class Ward.
 */
public class Ward {

    /** The ward id. */
    private Long wardId;

    /** The ward number. */
    private String wardNumber;

    /** The number of beds. */
    private String numberOfBeds;

    /** The price. */
    private Double price;

    /** The ward type. */
    private WardType wardType;

    /**
     * Gets the ward id.
     * 
     * @return the ward id
     */
    public Long getWardId() {
        return wardId;
    }

    /**
     * Sets the ward id.
     * 
     * @param wardId the new ward id
     */
    public void setWardId(final Long wardId) {
        this.wardId = wardId;
    }

    /**
     * Gets the ward number.
     * 
     * @return the ward number
     */
    public String getWardNumber() {
        return wardNumber;
    }

    /**
     * Sets the ward number.
     * 
     * @param wardNumber the new ward number
     */
    public void setWardNumber(final String wardNumber) {
        this.wardNumber = wardNumber;
    }

    /**
     * Gets the number of beds.
     * 
     * @return the number of beds
     */
    public String getNumberOfBeds() {
        return numberOfBeds;
    }

    /**
     * Sets the number of beds.
     * 
     * @param numberOfBeds the new number of beds
     */
    public void setNumberOfBeds(final String numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    /**
     * Gets the price.
     * 
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Sets the price.
     * 
     * @param price the new price
     */
    public void setPrice(final Double price) {
        this.price = price;
    }

    /**
     * Gets the ward type.
     * 
     * @return the ward type
     */
    public WardType getWardType() {
        return wardType;
    }

    /**
     * Sets the ward type.
     * 
     * @param wardType the new ward type
     */
    public void setWardType(final WardType wardType) {
        this.wardType = wardType;
    }

}
