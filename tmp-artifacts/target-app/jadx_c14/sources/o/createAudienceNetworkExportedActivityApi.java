package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createAudienceNetworkExportedActivityApi implements RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 {
    public static final Parcelable.Creator<createAudienceNetworkExportedActivityApi> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String cardPassword;
    private final String eccEncryptionKeyNo;
    private final String rsaEncryptionKeyNo;

    public static final class IAuthTabCallback implements Parcelable.Creator<createAudienceNetworkExportedActivityApi> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createAudienceNetworkExportedActivityApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            createAudienceNetworkExportedActivityApi createaudiencenetworkexportedactivityapiOnWarmupCompleted = onWarmupCompleted(parcel);
            int i4 = onNavigationEvent + 13;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return createaudiencenetworkexportedactivityapiOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createAudienceNetworkExportedActivityApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 113;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return onExtraCallbackWithResult(i);
            }
            onExtraCallbackWithResult(i);
            throw null;
        }

        public final createAudienceNetworkExportedActivityApi[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 125;
            onNavigationEvent = i4 % 128;
            createAudienceNetworkExportedActivityApi[] createaudiencenetworkexportedactivityapiArr = new createAudienceNetworkExportedActivityApi[i];
            if (i4 % 2 == 0) {
                int i5 = 67 / 0;
            }
            int i6 = i3 + 103;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return createaudiencenetworkexportedactivityapiArr;
        }

        public final createAudienceNetworkExportedActivityApi onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            createAudienceNetworkExportedActivityApi createaudiencenetworkexportedactivityapi = new createAudienceNetworkExportedActivityApi(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = onNavigationEvent + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return createaudiencenetworkexportedactivityapi;
        }
    }

    static {
        int i = IAuthTabCallback + 49;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 89 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 125;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof createAudienceNetworkExportedActivityApi)) {
            int i3 = onExtraCallback + 75;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        createAudienceNetworkExportedActivityApi createaudiencenetworkexportedactivityapi = (createAudienceNetworkExportedActivityApi) obj;
        if (!Intrinsics.areEqual(this.cardPassword, createaudiencenetworkexportedactivityapi.cardPassword)) {
            int i5 = onExtraCallback + 19;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.eccEncryptionKeyNo, createaudiencenetworkexportedactivityapi.eccEncryptionKeyNo)) {
            return false;
        }
        if (Intrinsics.areEqual(this.rsaEncryptionKeyNo, createaudiencenetworkexportedactivityapi.rsaEncryptionKeyNo)) {
            return true;
        }
        int i7 = onExtraCallbackWithResult + 17;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.cardPassword.hashCode();
        String str = this.eccEncryptionKeyNo;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.rsaEncryptionKeyNo;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
            int i4 = onExtraCallbackWithResult + 73;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
        int i7 = onExtraCallback + 69;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PasswordFormValue(cardPassword=" + this.cardPassword + ", eccEncryptionKeyNo=" + this.eccEncryptionKeyNo + ", rsaEncryptionKeyNo=" + this.rsaEncryptionKeyNo + ")";
        int i2 = onExtraCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 107;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        String str = this.cardPassword;
        if (i4 != 0) {
            parcel.writeString(str);
            parcel.writeString(this.eccEncryptionKeyNo);
            parcel.writeString(this.rsaEncryptionKeyNo);
        } else {
            parcel.writeString(str);
            parcel.writeString(this.eccEncryptionKeyNo);
            parcel.writeString(this.rsaEncryptionKeyNo);
            int i5 = 44 / 0;
        }
    }

    public createAudienceNetworkExportedActivityApi(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cardPassword = str;
        this.eccEncryptionKeyNo = str2;
        this.rsaEncryptionKeyNo = str3;
    }
}
