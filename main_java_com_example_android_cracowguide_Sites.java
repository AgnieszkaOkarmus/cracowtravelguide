package com.example.android.cracowguide;

public class Sites {

    private int mPicture;
    private String mDescription;
    private  String mAdress;
    public Sites (int Picture, String Description, String Adress) {
        mPicture = Picture;
        mDescription = Description;
        mAdress = Adress;
    }
    public int getPicture() {
        return mPicture;
    }

    public  String getDescription(){
        return mDescription;
    }
    public String getAdress(){
        return mAdress;
    }


}
