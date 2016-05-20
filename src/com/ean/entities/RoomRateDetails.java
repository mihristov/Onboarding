package com.ean.entities;

import javax.xml.bind.annotation.XmlElement;
import java.util.Arrays;

/**
 * Created by Milen on 5/17/2016.
 */
public class RoomRateDetails {
    private String roomTypeCode;
    private String rateCode;
    private Integer maxRoomOccupancy;
    private Integer quotedRoomOccupancy;
    private Integer minGuestAge;
    private String roomDescription;
    private String promoId;
    private String promoDescription;
    private String promoDetailText;
    private Integer currentAllotment;
    private Boolean propertyAvailable;
    private Boolean propertyRestricted;
    private String expediaPropertyId;
    private RateInfos rateInfos;
    private BedTypes[] bedTypes;
    private String smokingPreferences; // csv
    private ValueAdds valueAdds;

    public RoomRateDetails() {
    }

    public BedTypes[] getBedTypes() {
        return bedTypes;
    }

    @XmlElement(name = "BedTypes")
    public void setBedTypes(BedTypes[] bedTypes) {
        this.bedTypes = bedTypes;
    }

    public Integer getCurrentAllotment() {
        return currentAllotment;
    }

    @XmlElement
    public void setCurrentAllotment(Integer currentAllotment) {
        this.currentAllotment = currentAllotment;
    }

    public String getExpediaPropertyId() {
        return expediaPropertyId;
    }

    @XmlElement
    public void setExpediaPropertyId(String expediaPropertyId) {
        this.expediaPropertyId = expediaPropertyId;
    }

    public Integer getMaxRoomOccupancy() {
        return maxRoomOccupancy;
    }

    @XmlElement
    public void setMaxRoomOccupancy(Integer maxRoomOccupancy) {
        this.maxRoomOccupancy = maxRoomOccupancy;
    }

    public Integer getMinGuestAge() {
        return minGuestAge;
    }

    @XmlElement
    public void setMinGuestAge(Integer minGuestAge) {
        this.minGuestAge = minGuestAge;
    }

    public String getPromoDescription() {
        return promoDescription;
    }

    @XmlElement
    public void setPromoDescription(String promoDescription) {
        this.promoDescription = promoDescription;
    }

    public String getPromoDetailText() {
        return promoDetailText;
    }

    @XmlElement
    public void setPromoDetailText(String promoDetailText) {
        this.promoDetailText = promoDetailText;
    }

    public String getPromoId() {
        return promoId;
    }

    @XmlElement
    public void setPromoId(String promoId) {
        this.promoId = promoId;
    }

    public Boolean getPropertyAvailable() {
        return propertyAvailable;
    }

    @XmlElement
    public void setPropertyAvailable(Boolean propertyAvailable) {
        this.propertyAvailable = propertyAvailable;
    }

    public Boolean getPropertyRestricted() {
        return propertyRestricted;
    }

    @XmlElement
    public void setPropertyRestricted(Boolean propertyRestricted) {
        this.propertyRestricted = propertyRestricted;
    }

    public Integer getQuotedRoomOccupancy() {
        return quotedRoomOccupancy;
    }

    @XmlElement
    public void setQuotedRoomOccupancy(Integer quotedRoomOccupancy) {
        this.quotedRoomOccupancy = quotedRoomOccupancy;
    }

    public String getRateCode() {
        return rateCode;
    }

    @XmlElement
    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    @XmlElement
    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    @XmlElement
    public void setRoomTypeCode(String roomTypeCode) {
        this.roomTypeCode = roomTypeCode;
    }

    public String getSmokingPreferences() {
        return smokingPreferences;
    }

    @XmlElement
    public void setSmokingPreferences(String smokingPreferences) {
        this.smokingPreferences = smokingPreferences;
    }

    public ValueAdds getValueAdds() {
        return valueAdds;
    }

    @XmlElement(name = "ValueAdds")
    public void setValueAdds(ValueAdds valueAdds) {
        this.valueAdds = valueAdds;
    }

    public RateInfos getRateInfos() {
        return rateInfos;
    }

    @XmlElement(name = "RateInfos")
    public void setRateInfos(RateInfos rateInfos) {
        this.rateInfos = rateInfos;
    }

    @Override
    public String toString() {
        return "RoomRateDetails{" +
                "bedTypes=" + Arrays.toString(bedTypes) +
                ", roomTypeCode='" + roomTypeCode + '\'' +
                ", rateCode='" + rateCode + '\'' +
                ", maxRoomOccupancy=" + maxRoomOccupancy +
                ", quotedRoomOccupancy=" + quotedRoomOccupancy +
                ", minGuestAge=" + minGuestAge +
                ", roomDescription='" + roomDescription + '\'' +
                ", promoId='" + promoId + '\'' +
                ", promoDescription='" + promoDescription + '\'' +
                ", promoDetailText='" + promoDetailText + '\'' +
                ", currentAllotment=" + currentAllotment +
                ", propertyAvailable=" + propertyAvailable +
                ", propertyRestricted=" + propertyRestricted +
                ", expediaPropertyId='" + expediaPropertyId + '\'' +
                ", rateInfos=" + rateInfos +
                ", smokingPreferences='" + smokingPreferences + '\'' +
                ", valueAdds=" + valueAdds +
                '}';
    }
}
