package com.ean.entities;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Milen on 5/17/2016.
 */
public class HotelImage {
    private Long hotelImageId;
    private String name;
    private Integer category;
    private Integer type;
    private String caption;
    private String url;
    private String thumbnailUrl;
    private Long supplierId;
    private Long width;
    private Long height;
    private Long byteSize;

    public HotelImage() {
    }

    public Long getByteSize() {
        return byteSize;
    }

    @XmlElement
    public void setByteSize(Long byteSize) {
        this.byteSize = byteSize;
    }

    public String getCaption() {
        return caption;
    }

    @XmlElement
    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Integer getCategory() {
        return category;
    }

    @XmlElement
    public void setCategory(Integer category) {
        this.category = category;
    }

    public Long getHeight() {
        return height;
    }

    @XmlElement
    public void setHeight(Long height) {
        this.height = height;
    }

    public Long getHotelImageId() {
        return hotelImageId;
    }

    @XmlElement
    public void setHotelImageId(Long hotelImageId) {
        this.hotelImageId = hotelImageId;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    @XmlElement
    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    @XmlElement
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public Integer getType() {
        return type;
    }

    @XmlElement
    public void setType(Integer type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    @XmlElement
    public void setUrl(String url) {
        this.url = url;
    }

    public Long getWidth() {
        return width;
    }

    @XmlElement
    public void setWidth(Long width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "HotelImage{" +
                "byteSize=" + byteSize +
                ", hotelImageId=" + hotelImageId +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", type=" + type +
                ", caption='" + caption + '\'' +
                ", url='" + url + '\'' +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                ", supplierId=" + supplierId +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
