package ru.learningskills.cardlearn.dataclass;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by nikitalevchenko on 18.12.2017.
 */

public class Language implements Parcelable {
    private long id;
    private String name;
    private String imageRecId;

    public Language(long id, String name, String imageRecId) {
        this.id = id;
        this.name = name;
        this.imageRecId = imageRecId;
    }


    protected Language(Parcel in) {
        id = in.readLong();
        name = in.readString();
        imageRecId = in.readString();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return imageRecId;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(id);
        dest.writeString(name);
        dest.writeString(imageRecId);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Language> CREATOR = new Creator<Language>() {
        @Override
        public Language createFromParcel(Parcel in) {
            return new Language(in);
        }

        @Override
        public Language[] newArray(int size) {
            return new Language[size];
        }
    };
}
