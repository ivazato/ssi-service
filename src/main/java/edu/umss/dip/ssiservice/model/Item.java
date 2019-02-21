package edu.umss.dip.ssiservice.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Item extends ModelBase {
    private String name;
    private String code;
    private Byte[] img;
    @OneToOne(targetEntity = SubCategory.class)
    private SubCategory subCategory;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Byte[] getImg() {
        return img;
    }

    public void setImg(Byte[] img) {
        this.img = img;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }
}
