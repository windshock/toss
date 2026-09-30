package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class NativeAdLayoutApi$onNavigationEvent implements Parcelable.Creator<NativeAdLayoutApi> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    @Override // android.os.Parcelable.Creator
    public /* synthetic */ NativeAdLayoutApi createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(parcel);
        }
        onExtraCallback(parcel);
        throw null;
    }

    @Override // android.os.Parcelable.Creator
    public /* synthetic */ NativeAdLayoutApi[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 103;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallbackWithResult(i);
        }
        onExtraCallbackWithResult(i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final NativeAdLayoutApi onExtraCallback(Parcel parcel) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        NativeAdLayoutApi nativeAdLayoutApi = new NativeAdLayoutApi(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        int i2 = onExtraCallback + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return nativeAdLayoutApi;
    }

    public final NativeAdLayoutApi[] onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 29;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        NativeAdLayoutApi[] nativeAdLayoutApiArr = new NativeAdLayoutApi[i];
        int i6 = i4 + 65;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return nativeAdLayoutApiArr;
    }
}
