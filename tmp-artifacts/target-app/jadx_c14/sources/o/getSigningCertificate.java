package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getSigningCertificate extends FbValidationUtils {
    public static final Parcelable.Creator<getSigningCertificate> CREATOR = new onExtraCallbackWithResult();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String jobId;
    private final long timeoutInSeconds;
    private final String type;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<getSigningCertificate> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getSigningCertificate createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getSigningCertificate getsigningcertificateOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            if (i3 == 0) {
                int i4 = 33 / 0;
            }
            return getsigningcertificateOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getSigningCertificate[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                onNavigationEvent(i);
                throw null;
            }
            getSigningCertificate[] getsigningcertificateArrOnNavigationEvent = onNavigationEvent(i);
            int i4 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getsigningcertificateArrOnNavigationEvent;
        }

        public final getSigningCertificate onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            getSigningCertificate getsigningcertificate = new getSigningCertificate(parcel.readString(), parcel.readLong(), parcel.readString());
            int i2 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return getsigningcertificate;
        }

        public final getSigningCertificate[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 15;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            getSigningCertificate[] getsigningcertificateArr = new getSigningCertificate[i];
            int i6 = i4 + 95;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                return getsigningcertificateArr;
            }
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 115;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 77;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 65;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeLong(this.timeoutInSeconds);
        parcel.writeString(this.jobId);
        int i5 = onExtraCallback + 47;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getSigningCertificate(@NotNull String str, long j, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.type = str;
        this.timeoutInSeconds = j;
        this.jobId = str2;
    }

    @Override // o.FbValidationUtils
    public long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        long j = this.timeoutInSeconds;
        int i5 = i3 + 125;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    @Override // o.FbValidationUtils
    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.jobId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
