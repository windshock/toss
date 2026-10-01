package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class overrideBySynchronousMountPropsAtMountingAndroid implements Parcelable {
    public static final Parcelable.Creator<overrideBySynchronousMountPropsAtMountingAndroid> CREATOR = new onExtraCallback();
    private long IAuthTabCallback;
    private final String onExtraCallback;
    private String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public static final class onExtraCallback implements Parcelable.Creator<overrideBySynchronousMountPropsAtMountingAndroid> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final overrideBySynchronousMountPropsAtMountingAndroid[] newArray(int i) {
            return new overrideBySynchronousMountPropsAtMountingAndroid[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final overrideBySynchronousMountPropsAtMountingAndroid createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            return new overrideBySynchronousMountPropsAtMountingAndroid(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }
    }

    public overrideBySynchronousMountPropsAtMountingAndroid() {
        this(null, null, null, null, 0L, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof overrideBySynchronousMountPropsAtMountingAndroid)) {
            return false;
        }
        overrideBySynchronousMountPropsAtMountingAndroid overridebysynchronousmountpropsatmountingandroid = (overrideBySynchronousMountPropsAtMountingAndroid) obj;
        return Intrinsics.areEqual(this.onExtraCallback, overridebysynchronousmountpropsatmountingandroid.onExtraCallback) && Intrinsics.areEqual(this.onNavigationEvent, overridebysynchronousmountpropsatmountingandroid.onNavigationEvent) && Intrinsics.areEqual(this.onWarmupCompleted, overridebysynchronousmountpropsatmountingandroid.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallbackWithResult, overridebysynchronousmountpropsatmountingandroid.onExtraCallbackWithResult) && this.IAuthTabCallback == overridebysynchronousmountpropsatmountingandroid.IAuthTabCallback;
    }

    public int hashCode() {
        return (((((((this.onExtraCallback.hashCode() * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + Long.hashCode(this.IAuthTabCallback);
    }

    public String toString() {
        return "AccountToVerify(accountName=" + this.onExtraCallback + ", accountNumber=" + this.onNavigationEvent + ", bankCode=" + this.onWarmupCompleted + ", accountPassword=" + this.onExtraCallbackWithResult + ", verifyId=" + this.IAuthTabCallback + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeString(this.onExtraCallback);
        parcel.writeString(this.onNavigationEvent);
        parcel.writeString(this.onWarmupCompleted);
        parcel.writeString(this.onExtraCallbackWithResult);
        parcel.writeLong(this.IAuthTabCallback);
    }

    public overrideBySynchronousMountPropsAtMountingAndroid(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str4, BuildConfig.FLAVOR);
        this.onExtraCallback = str;
        this.onNavigationEvent = str2;
        this.onWarmupCompleted = str3;
        this.onExtraCallbackWithResult = str4;
        this.IAuthTabCallback = j;
    }

    public /* synthetic */ overrideBySynchronousMountPropsAtMountingAndroid(String str, String str2, String str3, String str4, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2, (i & 4) != 0 ? BuildConfig.FLAVOR : str3, (i & 8) == 0 ? str4 : BuildConfig.FLAVOR, (i & 16) != 0 ? 0L : j);
    }

    public final String onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public final String onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public final String IAuthTabCallback() {
        return this.onWarmupCompleted;
    }
}
