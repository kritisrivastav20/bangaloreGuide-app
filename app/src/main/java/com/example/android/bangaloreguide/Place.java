package com.example.android.bangaloreguide;


public class Place {
    private int mplaceName;
    private int mplaceDetails;
    private int mImageResourceId;

    public Place(int placeName, int placeDetails, int imageResourceId) {
        mplaceName = placeName;
        mplaceDetails = placeDetails;
        mImageResourceId = imageResourceId;
    }
    public int getplaceName() {
        return mplaceName;
    }
    public int getplaceDetails() {
        return mplaceDetails;
    }
    public int getImageResourceId() {
        return mImageResourceId;
    }

}
