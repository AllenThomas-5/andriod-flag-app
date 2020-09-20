package com.example.allen.myapplication;

/**
 * Created by Allen on 20/12/2018.
 */

public class RowItem {

    private String heading;
    private String subHeading;
    private int smallImageName;
    private int bigImageName;

    //Heading
    public void setHeading( String theHeading ) {

        this.heading = theHeading;

    }

    public String getHeading() {

        return this.heading;

    }

    // Sub Heading

    public void setSubHeading( String theSubHeading ) {

        this.subHeading = theSubHeading;

    }

    public String getSubHeading( ) {

        return this.subHeading;

    }

    // Image Getter and Setter

    public void setSmallImageName(int smallName) {

        this.smallImageName = smallName;

    }

    public int getSmallImageName() {

        return this.smallImageName;

    }

    // Big Image Getter and Setter

    public void setBigImageName(int bigName) {

        this.bigImageName = bigName;

    }

    public int getBigImageName( ) {

        return this.bigImageName;

    }
}

