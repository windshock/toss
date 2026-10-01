package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.createAdSizeApi;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class createAdSizeApi$IAuthTabCallback$IAuthTabCallback implements Parcelable.Creator<createAdSizeApi.IAuthTabCallback> {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    @Override // android.os.Parcelable.Creator
    public /* synthetic */ createAdSizeApi.IAuthTabCallback createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        createAdSizeApi.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = onNavigationEvent(parcel);
        int i4 = onWarmupCompleted + 33;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iAuthTabCallbackOnNavigationEvent;
    }

    @Override // android.os.Parcelable.Creator
    public /* synthetic */ createAdSizeApi.IAuthTabCallback[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 61;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        createAdSizeApi.IAuthTabCallback[] iAuthTabCallbackArrOnWarmupCompleted = onWarmupCompleted(i);
        int i5 = IAuthTabCallback + 93;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return iAuthTabCallbackArrOnWarmupCompleted;
    }

    public final createAdSizeApi.IAuthTabCallback onNavigationEvent(Parcel parcel) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        createAdSizeApi.IAuthTabCallback iAuthTabCallback = new createAdSizeApi.IAuthTabCallback(parcel.readString(), parcel.readString());
        int i2 = onWarmupCompleted + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    public final createAdSizeApi.IAuthTabCallback[] onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 71;
        IAuthTabCallback = i3 % 128;
        createAdSizeApi.IAuthTabCallback[] iAuthTabCallbackArr = new createAdSizeApi.IAuthTabCallback[i];
        if (i3 % 2 == 0) {
            return iAuthTabCallbackArr;
        }
        throw null;
    }
}
