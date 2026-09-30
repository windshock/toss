package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.NestfgetmBinding;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class NestfgetmBinding$onNavigationEvent$onExtraCallbackWithResult implements Parcelable.Creator<NestfgetmBinding.onNavigationEvent> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public final NestfgetmBinding.onNavigationEvent[] newArray(int i) {
        return new NestfgetmBinding.onNavigationEvent[i];
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public final NestfgetmBinding.onNavigationEvent createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        return new NestfgetmBinding.onNavigationEvent(parcel.readString());
    }
}
