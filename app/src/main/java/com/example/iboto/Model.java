package com.example.iboto;

import android.os.Parcel;
import android.os.Parcelable;

public class Model implements Parcelable {
    private int candidateImage;
    private String name;

    protected Model(Parcel in) {
        candidateImage = in.readInt();
        name = in.readString();
        partylist = in.readString();
        info = in.readString();
        platform = in.readString();
        accomplishment = in.readString();
    }

    public static final Creator<Model> CREATOR = new Creator<Model>() {
        @Override
        public Model createFromParcel(Parcel in) {
            return new Model(in);
        }

        @Override
        public Model[] newArray(int size) {
            return new Model[size];
        }
    };

    public String getPartylist() {
        return partylist;
    }

    public void setPartylist(String partylist) {
        this.partylist = partylist;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getAccomplishment() {
        return accomplishment;
    }

    public void setAccomplishment(String accomplishment) {
        this.accomplishment = accomplishment;
    }

    private String partylist;
    private String info;
    private String platform;
    private String accomplishment;

    public Model(int candidateImage, String name, String partylist, String info, String platform, String accomplishment) {
        this.candidateImage = candidateImage;
        this.name = name;
        this.partylist = partylist;
        this.info = info;
        this.platform = platform;
        this.accomplishment = accomplishment;
    }


    public int getCandidateImage() {
        return candidateImage;
    }

    public void setCandidateImage(int candidateImage) {
        this.candidateImage = candidateImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(candidateImage);
        parcel.writeString(name);
        parcel.writeString(partylist);
        parcel.writeString(info);
        parcel.writeString(platform);
        parcel.writeString(accomplishment);
    }
}
