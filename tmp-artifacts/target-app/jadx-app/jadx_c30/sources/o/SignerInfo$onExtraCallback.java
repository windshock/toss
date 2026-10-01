package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class SignerInfo$onExtraCallback implements Parcelable.Creator<SignerInfo> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public final SignerInfo[] newArray(int i) {
        return new SignerInfo[i];
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public final SignerInfo createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        return new SignerInfo(parcel.readString(), parcel.readParcelable(SignerInfo.class.getClassLoader()), parcel.readString(), parcel.readString());
    }
}
