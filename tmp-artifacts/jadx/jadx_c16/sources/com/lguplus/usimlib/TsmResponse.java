package com.lguplus.usimlib;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class TsmResponse extends TsmMsg {
    public static final Parcelable.Creator<TsmResponse> CREATOR = new Parcelable.Creator<TsmResponse>() { // from class: com.lguplus.usimlib.TsmResponse.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TsmResponse createFromParcel(Parcel parcel) {
            try {
                return new TsmResponse(parcel);
            } catch (JSONException e) {
                TsmUtil.loge("TsmResponse", "createFromParcel", e);
                return null;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TsmResponse[] newArray(int i) {
            return new TsmResponse[i];
        }
    };
    public static final String errorCode = "errorCode";
    public static final String errorMsg = "errorMsg";

    public TsmResponse() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TsmResponse(String str) throws JSONException {
        try {
            put(errorCode, str);
        } catch (JSONException e) {
            TsmUtil.loge("TsmResponse", "TsmResponse", e);
        }
    }

    TsmResponse(Parcel parcel) throws JSONException {
        super(parcel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String getErrorCode() {
        try {
            if (has(errorCode)) {
                return getString(errorCode);
            }
            return null;
        } catch (JSONException e) {
            TsmUtil.loge("TsmResponse", "getErrorCode", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String getErrorMsg() {
        try {
            if (has(errorMsg)) {
                return getString(errorMsg);
            }
            return null;
        } catch (JSONException e) {
            TsmUtil.loge("TsmResponse", "getErrorMsg", e);
            return null;
        }
    }

    public int describeContents() {
        return super.describeContents();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
