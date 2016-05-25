package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by Milen on 5/17/2016.
 */
public class CachedSupplierResponse {
    private SupplierCacheTolerance supplierCacheTolerance;
    private Long cachedTime;
    private Integer cacheEntryHitNum;
    private Integer cacheEntryMissNum;
    private Integer cacheEntryExpiredNum;
    private Long cacheRetrievalTime;
    private Integer supplierRequestNum;
    private Integer supplierResponseNum;
    private Long supplierResponseTime;
    private Long candidatePreptime;
    private Long otherOverheadTime;
    private Integer tpidUsed;
    private Boolean matchedCurrency;
    private Boolean matchedLocale;
    private Boolean extrapolatedCurrency;
    private Boolean extrapolatedLocale;

    public CachedSupplierResponse() {
    }

    public Long getCachedTime() {
        return cachedTime;
    }

    @XmlAttribute
    public void setCachedTime(Long cachedTime) {
        this.cachedTime = cachedTime;
    }

    public Integer getCacheEntryExpiredNum() {
        return cacheEntryExpiredNum;
    }

    @XmlAttribute
    public void setCacheEntryExpiredNum(Integer cacheEntryExpiredNum) {
        this.cacheEntryExpiredNum = cacheEntryExpiredNum;
    }

    public Integer getCacheEntryHitNum() {
        return cacheEntryHitNum;
    }

    @XmlAttribute
    public void setCacheEntryHitNum(Integer cacheEntryHitNum) {
        this.cacheEntryHitNum = cacheEntryHitNum;
    }

    public Integer getCacheEntryMissNum() {
        return cacheEntryMissNum;
    }

    @XmlAttribute
    public void setCacheEntryMissNum(Integer cacheEntryMissNum) {
        this.cacheEntryMissNum = cacheEntryMissNum;
    }

    public Long getCacheRetrievalTime() {
        return cacheRetrievalTime;
    }

    @XmlAttribute
    public void setCacheRetrievalTime(Long cacheRetrievalTime) {
        this.cacheRetrievalTime = cacheRetrievalTime;
    }

    public Long getCandidatePreptime() {
        return candidatePreptime;
    }

    @XmlAttribute
    public void setCandidatePreptime(Long candidatePreptime) {
        this.candidatePreptime = candidatePreptime;
    }

    public Boolean getExtrapolatedCurrency() {
        return extrapolatedCurrency;
    }

    @XmlAttribute
    public void setExtrapolatedCurrency(Boolean extrapolatedCurrency) {
        this.extrapolatedCurrency = extrapolatedCurrency;
    }

    public Boolean getExtrapolatedLocale() {
        return extrapolatedLocale;
    }

    @XmlAttribute
    public void setExtrapolatedLocale(Boolean extrapolatedLocale) {
        this.extrapolatedLocale = extrapolatedLocale;
    }

    public Boolean getMatchedCurrency() {
        return matchedCurrency;
    }

    @XmlAttribute
    public void setMatchedCurrency(Boolean matchedCurrency) {
        this.matchedCurrency = matchedCurrency;
    }

    public Boolean getMatchedLocale() {
        return matchedLocale;
    }

    @XmlAttribute
    public void setMatchedLocale(Boolean matchedLocale) {
        this.matchedLocale = matchedLocale;
    }

    public Long getOtherOverheadTime() {
        return otherOverheadTime;
    }

    @XmlAttribute
    public void setOtherOverheadTime(Long otherOverheadTime) {
        this.otherOverheadTime = otherOverheadTime;
    }

    public SupplierCacheTolerance getSupplierCacheTolerance() {
        return supplierCacheTolerance;
    }

    @XmlAttribute(name = "SupplierCacheTolerance")
    public void setSupplierCacheTolerance(SupplierCacheTolerance supplierCacheTolerance) {
        this.supplierCacheTolerance = supplierCacheTolerance;
    }

    public Integer getSupplierRequestNum() {
        return supplierRequestNum;
    }

    @XmlAttribute
    public void setSupplierRequestNum(Integer supplierRequestNum) {
        this.supplierRequestNum = supplierRequestNum;
    }

    public Integer getSupplierResponseNum() {
        return supplierResponseNum;
    }

    @XmlAttribute
    public void setSupplierResponseNum(Integer supplierResponseNum) {
        this.supplierResponseNum = supplierResponseNum;
    }

    public Long getSupplierResponseTime() {
        return supplierResponseTime;
    }

    @XmlAttribute
    public void setSupplierResponseTime(Long supplierResponseTime) {
        this.supplierResponseTime = supplierResponseTime;
    }

    public Integer getTpidUsed() {
        return tpidUsed;
    }

    @XmlAttribute
    public void setTpidUsed(Integer tpidUsed) {
        this.tpidUsed = tpidUsed;
    }

    @Override
    public String toString() {
        return "CachedSupplierResponse{" +
                "cachedTime=" + cachedTime +
                ", supplierCacheTolerance=" + supplierCacheTolerance +
                ", cacheEntryHitNum=" + cacheEntryHitNum +
                ", cacheEntryMissNum=" + cacheEntryMissNum +
                ", cacheEntryExpiredNum=" + cacheEntryExpiredNum +
                ", cacheRetrievalTime=" + cacheRetrievalTime +
                ", supplierRequestNum=" + supplierRequestNum +
                ", supplierResponseNum=" + supplierResponseNum +
                ", supplierResponseTime=" + supplierResponseTime +
                ", candidatePreptime=" + candidatePreptime +
                ", otherOverheadTime=" + otherOverheadTime +
                ", tpidUsed=" + tpidUsed +
                ", matchedCurrency=" + matchedCurrency +
                ", matchedLocale=" + matchedLocale +
                ", extrapolatedCurrency=" + extrapolatedCurrency +
                ", extrapolatedLocale=" + extrapolatedLocale +
                '}';
    }
}
