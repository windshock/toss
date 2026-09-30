package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class NestfputmSurfaceIdsWithPendingMountNotification$onExtraCallbackWithResult implements Parcelable.Creator<NestfputmSurfaceIdsWithPendingMountNotification> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public final NestfputmSurfaceIdsWithPendingMountNotification[] newArray(int i) {
        return new NestfputmSurfaceIdsWithPendingMountNotification[i];
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public final NestfputmSurfaceIdsWithPendingMountNotification createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        int i = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        for (int i2 = 0; i2 != i; i2++) {
            linkedHashMap.put(parcel.readString(), parcel.readString());
        }
        return new NestfputmSurfaceIdsWithPendingMountNotification(string, string2, string3, linkedHashMap);
    }
}
