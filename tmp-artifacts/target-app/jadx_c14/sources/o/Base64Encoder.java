package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class Base64Encoder implements Comparable<Base64Encoder>, Parcelable {
    public static final Parcelable.Creator<Base64Encoder> CREATOR = new onWarmupCompleted();
    private int onExtraCallback;
    private String onExtraCallbackWithResult;
    private int onNavigationEvent;
    private String onWarmupCompleted;

    public static final class onWarmupCompleted implements Parcelable.Creator<Base64Encoder> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Base64Encoder createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Base64Encoder(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Base64Encoder[] newArray(int i) {
            return new Base64Encoder[i];
        }
    }

    public Base64Encoder() {
        this(null, 0, 0, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.onExtraCallbackWithResult);
        parcel.writeInt(this.onNavigationEvent);
        parcel.writeInt(this.onExtraCallback);
        parcel.writeString(this.onWarmupCompleted);
    }

    public Base64Encoder(@NotNull String str, int i, int i2, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallbackWithResult = str;
        this.onNavigationEvent = i;
        this.onExtraCallback = i2;
        this.onWarmupCompleted = str2;
    }

    public /* synthetic */ Base64Encoder(String str, int i, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? -1 : i2, (i3 & 8) != 0 ? "" : str2);
    }

    public final int IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public final String onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public final String onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public final boolean onExtraCallback() {
        return this.onExtraCallbackWithResult.length() > 0 && this.onNavigationEvent > 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull Base64Encoder base64Encoder) {
        Intrinsics.checkNotNullParameter(base64Encoder, "");
        return this.onExtraCallback - base64Encoder.onExtraCallback;
    }
}
