package com.pnikosis.materialishprogress;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class ProgressWheel$onExtraCallbackWithResult extends View.BaseSavedState {
    public static final Parcelable.Creator<ProgressWheel$onExtraCallbackWithResult> CREATOR = new Parcelable.Creator<ProgressWheel$onExtraCallbackWithResult>() { // from class: com.pnikosis.materialishprogress.ProgressWheel$onExtraCallbackWithResult.2
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public ProgressWheel$onExtraCallbackWithResult createFromParcel(Parcel parcel) {
            return new ProgressWheel$onExtraCallbackWithResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public ProgressWheel$onExtraCallbackWithResult[] newArray(int i) {
            return new ProgressWheel$onExtraCallbackWithResult[i];
        }
    };
    boolean IAuthTabCallback;
    boolean IAuthTabCallbackDefault;
    int IAuthTabCallbackStub;
    float access000;
    float asBinder;
    float asInterface;
    int onExtraCallback;
    int onExtraCallbackWithResult;
    boolean onNavigationEvent;
    int onTransact;
    int onWarmupCompleted;

    ProgressWheel$onExtraCallbackWithResult(Parcelable parcelable) {
        super(parcelable);
    }

    private ProgressWheel$onExtraCallbackWithResult(Parcel parcel) {
        super(parcel);
        this.asBinder = parcel.readFloat();
        this.asInterface = parcel.readFloat();
        this.onNavigationEvent = parcel.readByte() != 0;
        this.access000 = parcel.readFloat();
        this.onWarmupCompleted = parcel.readInt();
        this.onExtraCallbackWithResult = parcel.readInt();
        this.IAuthTabCallbackStub = parcel.readInt();
        this.onTransact = parcel.readInt();
        this.onExtraCallback = parcel.readInt();
        this.IAuthTabCallbackDefault = parcel.readByte() != 0;
        this.IAuthTabCallback = parcel.readByte() != 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.asBinder);
        parcel.writeFloat(this.asInterface);
        parcel.writeByte(this.onNavigationEvent ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.access000);
        parcel.writeInt(this.onWarmupCompleted);
        parcel.writeInt(this.onExtraCallbackWithResult);
        parcel.writeInt(this.IAuthTabCallbackStub);
        parcel.writeInt(this.onTransact);
        parcel.writeInt(this.onExtraCallback);
        parcel.writeByte(this.IAuthTabCallbackDefault ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.IAuthTabCallback ? (byte) 1 : (byte) 0);
    }
}
