package com.example.android.tourguide_moscow_ni;

import android.os.Parcel;
import android.os.Parcelable;

import java.lang.ref.SoftReference;

public class List implements Parcelable{

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mObjectName;
    private String mClassName;
    private String mObjectAddress;
    private String mObjectDesc;
    private int mimageResourceID = NO_IMAGE_PROVIDED;

    public List (String ObjectName, int ImageID, String ClassName, String ObjectAddress, String ObjectDesc){
        mObjectName = ObjectName;
        mimageResourceID = ImageID;
        mClassName = ClassName;
        mObjectAddress = ObjectAddress;
        mObjectDesc = ObjectDesc;
    }

    protected List(Parcel in) {
        mObjectName = in.readString();
        mClassName = in.readString();
        mObjectAddress = in.readString();
        mObjectDesc = in.readString();
        mimageResourceID = in.readInt();
    }

    public static final Creator<List> CREATOR = new Creator<List>() {
        @Override
        public List createFromParcel(Parcel in) {
            return new List(in);
        }

        @Override
        public List[] newArray(int size) {
            return new List[size];
        }
    };

    public String getmObjectName() {
        return mObjectName;
    }

    public String getmClassName() {
        return mClassName;
    }

    public String getmObjectAddress() {
        return mObjectAddress;
    }

    public String getmObjectDesc() {
        return mObjectDesc;
    }

    public int getMimageResourceID() {
        return mimageResourceID;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mObjectName);
        parcel.writeString(mClassName);
        parcel.writeString(mObjectAddress);
        parcel.writeString(mObjectDesc);
        parcel.writeInt(mimageResourceID);
    }
}
