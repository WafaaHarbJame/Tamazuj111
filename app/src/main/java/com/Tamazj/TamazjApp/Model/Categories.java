package com.Tamazj.TamazjApp.Model;

public class Categories {
    private String percent;
    private  String profileimage;
    private  String profile_name;
    private String profile_dsc;
    private  String catoroytype;
    private String id;
    private String categoryId;

    public Categories(String percent, String profileimage, String profile_name, String profile_dsc, String catoroytype) {
        this.percent = percent;
        this.profileimage = profileimage;
        this.profile_name = profile_name;
        this.profile_dsc = profile_dsc;
        this.catoroytype = catoroytype;
    }

    public Categories(String percent, String profileimage, String profile_name, String profile_dsc, String catoroytype, String id) {
        this.percent = percent;
        this.profileimage = profileimage;
        this.profile_name = profile_name;
        this.profile_dsc = profile_dsc;
        this.catoroytype = catoroytype;
        this.id = id;
    }

    public Categories(String percent, String profileimage, String profile_name, String profile_dsc, String catoroytype, String id, String categoryId) {
        this.percent = percent;
        this.profileimage = profileimage;
        this.profile_name = profile_name;
        this.profile_dsc = profile_dsc;
        this.catoroytype = catoroytype;
        this.id = id;
        this.categoryId = categoryId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public String getProfileimage() {
        return profileimage;
    }

    public void setProfileimage(String profileimage) {
        this.profileimage = profileimage;
    }

    public String getProfile_name() {
        return profile_name;
    }

    public void setProfile_name(String profile_name) {
        this.profile_name = profile_name;
    }

    public String getProfile_dsc() {
        return profile_dsc;
    }

    public void setProfile_dsc(String profile_dsc) {
        this.profile_dsc = profile_dsc;
    }

    public String getCatoroytype() {
        return catoroytype;
    }

    public void setCatoroytype(String catoroytype) {
        this.catoroytype = catoroytype;
    }
}
