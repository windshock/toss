package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AdInternalSettings implements RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 {
    public static final Parcelable.Creator<AdInternalSettings> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final String designCode;

    public static final class onExtraCallback implements Parcelable.Creator<AdInternalSettings> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final AdInternalSettings IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            AdInternalSettings adInternalSettings = new AdInternalSettings(parcel.readString());
            int i2 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return adInternalSettings;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AdInternalSettings createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AdInternalSettings adInternalSettingsIAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return adInternalSettingsIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AdInternalSettings[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return onNavigationEvent(i);
            }
            onNavigationEvent(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AdInternalSettings[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 71;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            AdInternalSettings[] adInternalSettingsArr = new AdInternalSettings[i];
            int i6 = i3 + 15;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return adInternalSettingsArr;
            }
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 95;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2 == 0 ? 1 : 0;
        int i5 = i3 + 67;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdInternalSettings)) {
            int i4 = i3 + 15;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.designCode, ((AdInternalSettings) obj).designCode)) {
            return true;
        }
        int i6 = onExtraCallback + 77;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.designCode.hashCode();
        int i4 = onExtraCallbackWithResult + 11;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardDesignFormValue(designCode=" + this.designCode + ")";
        int i2 = onExtraCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.designCode);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AdInternalSettings(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.designCode = str;
    }
}
