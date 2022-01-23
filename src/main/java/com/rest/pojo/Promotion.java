package com.rest.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Promotion {

    private String promotionId;
    private Integer orderId;
    private List<String> promoArea = null;
    private String promoType;
    private Boolean showPrice;
    private Boolean showText;
    private LocalizedTexts localizedTexts;
//    private List<Property> properties = null;
//    private List<Image> images = null;
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getPromotionId() {
        return promotionId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public List<String> getPromoArea() {
        return promoArea;
    }

    public String getPromoType() {
        return promoType;
    }

    public Boolean getShowPrice() {
        return showPrice;
    }

    public Boolean getShowText() {
        return showText;
    }

    public LocalizedTexts getLocalizedTexts() {
        return localizedTexts;
    }

}
