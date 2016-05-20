package com.ean.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Milen on 5/17/2016.
 */
@XmlType(propOrder = {
        "policy",
        "rateCode",
        "roomTypeCode",
        "rateDescription",
        "roomTypeDescription",
        "roomType",
        "supplierType",
        "otherInformation",
        "propertyId",
        "bedTypes",
        "smokingPreferences",
        "rateOccupancyPerRoom",
        "quotedOccupancy",
        "minGuestAge",
        "rateInfos",
        "valueAdds",
        "deepLink",
        "roomImages"
})
public class HotelRoomResponse {
    private String policy;
    private String rateCode;
    private String roomTypeCode;
    private String rateDescription;
    private String roomTypeDescription;
    private String supplierType;
    private String otherInformation;
    private String propertyId;
    private String smokingPreferences;
    private Integer minGuestAge;
    private Integer quotedOccupancy;
    private Integer rateOccupancyPerRoom;
    private String deepLink;
    private BedTypes bedTypes;
    private ValueAdds valueAdds;
    private RoomImages[] roomImages;
    private RoomType roomType;
    private RateInfos rateInfos;

    public HotelRoomResponse() {
    }

    public BedTypes getBedTypes() {
        return bedTypes;
    }

    @XmlElement(name = "BedTypes")
    public void setBedTypes(BedTypes bedTypes) {
        this.bedTypes = bedTypes;
    }

    public String getDeepLink() {
        return deepLink;
    }

    @XmlElement
    public void setDeepLink(String deepLink) {
        this.deepLink = deepLink;
    }

    public Integer getMinGuestAge() {
        return minGuestAge;
    }

    @XmlElement
    public void setMinGuestAge(Integer minGuestAge) {
        this.minGuestAge = minGuestAge;
    }

    public String getOtherInformation() {
        return otherInformation;
    }

    @XmlElement
    public void setOtherInformation(String otherInformation) {
        this.otherInformation = otherInformation;
    }

    public String getPolicy() {
        return policy;
    }

    @XmlElement
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getPropertyId() {
        return propertyId;
    }

    @XmlElement
    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public Integer getQuotedOccupancy() {
        return quotedOccupancy;
    }

    @XmlElement
    public void setQuotedOccupancy(Integer quotedOccupancy) {
        this.quotedOccupancy = quotedOccupancy;
    }

    public String getRateCode() {
        return rateCode;
    }

    @XmlElement
    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public String getRateDescription() {
        return rateDescription;
    }

    @XmlElement
    public void setRateDescription(String rateDescription) {
        this.rateDescription = rateDescription;
    }

    public Integer getRateOccupancyPerRoom() {
        return rateOccupancyPerRoom;
    }

    @XmlElement
    public void setRateOccupancyPerRoom(Integer rateOccupancyPerRoom) {
        this.rateOccupancyPerRoom = rateOccupancyPerRoom;
    }

    public RoomImages[] getRoomImages() {
        return roomImages;
    }

    @XmlElement(name = "RoomImages")
    public void setRoomImages(RoomImages[] roomImages) {
        this.roomImages = roomImages;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    @XmlElement(name = "RoomType")
    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    @XmlElement
    public void setRoomTypeCode(String roomTypeCode) {
        this.roomTypeCode = roomTypeCode;
    }

    public String getRoomTypeDescription() {
        return roomTypeDescription;
    }

    @XmlElement
    public void setRoomTypeDescription(String roomTypeDescription) {
        this.roomTypeDescription = roomTypeDescription;
    }

    public String getSmokingPreferences() {
        return smokingPreferences;
    }

    @XmlElement
    public void setSmokingPreferences(String smokingPreferences) {
        this.smokingPreferences = smokingPreferences;
    }

    public String getSupplierType() {
        return supplierType;
    }

    @XmlElement
    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
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
        StringBuilder sb = new StringBuilder();
        if (valueAdds != null) {
            for (ValueAdd va : valueAdds.getValueAdd()) {
                sb.append("Value add: ");
                sb.append(va.getDescription() + "\n");
            }
        }
        if (rateInfos.getRateInfo()[0].getNonRefundable()) {
            sb.append("Non Refundable\n");
        }
        sb.append("Nightly price: " + rateInfos.getRateInfo()[0].getChargeableRateInfo().getAverageRate());
        sb.append(" " + rateInfos.getRateInfo()[0].getChargeableRateInfo().getCurrencyCode() + "\nBed types:\n");

        for (int i = 0; i < bedTypes.getBedType().length; i++) {
            sb.append((i + 1) + ") " + bedTypes.getBedType()[i].getDescription() + "\n");
        }
        sb.append("Smoking preferences:\n");
        String[] smokingPrefs = smokingPreferences.split("[,]");
        for (int i = 0; i < smokingPrefs.length; i++) {
            sb.append((i+1) + ") " + SmokingPreference.valueOf(smokingPrefs[i]).getValue() + "\n");
        }
        return roomTypeDescription + "\n" + sb.toString() + "\n";
    }
}
