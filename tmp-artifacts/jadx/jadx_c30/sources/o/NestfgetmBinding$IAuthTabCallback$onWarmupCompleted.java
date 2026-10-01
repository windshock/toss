package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.NestfgetmBinding;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class NestfgetmBinding$IAuthTabCallback$onWarmupCompleted implements Parcelable.Creator<NestfgetmBinding.IAuthTabCallback> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public final NestfgetmBinding.IAuthTabCallback createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        return new NestfgetmBinding.IAuthTabCallback(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (NestfputmSurfaceIdsWithPendingMountNotification) (parcel.readInt() == 0 ? null : NestfputmSurfaceIdsWithPendingMountNotification.CREATOR.createFromParcel(parcel)));
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public final NestfgetmBinding.IAuthTabCallback[] newArray(int i) {
        return new NestfgetmBinding.IAuthTabCallback[i];
    }
}
