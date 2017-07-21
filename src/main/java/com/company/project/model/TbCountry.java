package com.company.project.model;

import javax.persistence.*;

@Table(name = "tb_country")
public class TbCountry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "countryName")
    private String countryname;

    @Column(name = "countryCode")
    private String countrycode;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return countryName
     */
    public String getCountryname() {
        return countryname;
    }

    /**
     * @param countryname
     */
    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    /**
     * @return countryCode
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * @param countrycode
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}