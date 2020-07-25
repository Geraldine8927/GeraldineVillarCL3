package com.example.geraldinevillarcl3.POJO;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.*;
import com.google.gson.annotations.*;
public class SERVICIORESPONSE implements Serializable, Parcelable
{

    @SerializedName("ObjServicio")
    @Expose
    private ObjServicio ObjServicio;
    @SerializedName("ObjListaSERVICIO")
    @Expose
    private List<com.example.geraldinevillarcl3.POJO.ObjListaSERVICIO> ObjListaSERVICIO = new ArrayList<ObjListaSERVICIO>();
    public final static Creator<SERVICIORESPONSE> CREATOR = new Creator<SERVICIORESPONSE>() {


        @SuppressWarnings({
                "unchecked"
        })
        public SERVICIORESPONSE createFromParcel(Parcel in) {
            return new SERVICIORESPONSE(in);
        }

        public SERVICIORESPONSE[] newArray(int size) {
            return (new SERVICIORESPONSE[size]);
        }

    }
            ;

    protected SERVICIORESPONSE(Parcel in) {
        this.ObjServicio = ((ObjServicio) in.readValue((ObjServicio.class.getClassLoader())));
        in.readList(this. ObjListaSERVICIO, (com.example.geraldinevillarcl3.POJO.ObjListaSERVICIO.class.getClassLoader()));
    }

    public SERVICIORESPONSE() {
    }

    public ObjServicio getObjSERVICIO() {
        return ObjServicio;
    }

    public void setObjSERVICIO(ObjServicio ObjServicio) {
        this.ObjServicio = ObjServicio;
    }

    public List<ObjListaSERVICIO> getObjListaSERVICIO() {
        return ObjListaSERVICIO;
    }

    public void setObjListaSERVICIO(List<ObjListaSERVICIO> ObjListaSERVICIO) {
        this.ObjListaSERVICIO = ObjListaSERVICIO;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(ObjServicio);
        dest.writeList(ObjListaSERVICIO);
    }

    public int describeContents() {
        return  0;
    }
}
