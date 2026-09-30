package im.toss.standardtermsv2.param;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.featurescommon.servicetermsagreement.standardtermsv2.domain.model.request.AgreementReceiverInfoRequest;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class StandardTermsV2BizReceiver implements Parcelable {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String bizName;
    private final String bizRegNo;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<StandardTermsV2BizReceiver> CREATOR = new IAuthTabCallback();

    public static final class IAuthTabCallback implements Parcelable.Creator<StandardTermsV2BizReceiver> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final StandardTermsV2BizReceiver IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            StandardTermsV2BizReceiver standardTermsV2BizReceiver = new StandardTermsV2BizReceiver(parcel.readString(), parcel.readString());
            int i2 = onExtraCallback + 103;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 55 / 0;
            }
            return standardTermsV2BizReceiver;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ StandardTermsV2BizReceiver createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            StandardTermsV2BizReceiver standardTermsV2BizReceiverIAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = onExtraCallback + 81;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return standardTermsV2BizReceiverIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ StandardTermsV2BizReceiver[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 57;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            StandardTermsV2BizReceiver[] standardTermsV2BizReceiverArrOnExtraCallback = onExtraCallback(i);
            if (i4 == 0) {
                int i5 = 73 / 0;
            }
            int i6 = onExtraCallback + 79;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return standardTermsV2BizReceiverArrOnExtraCallback;
        }

        public final StandardTermsV2BizReceiver[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 125;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            StandardTermsV2BizReceiver[] standardTermsV2BizReceiverArr = new StandardTermsV2BizReceiver[i];
            int i6 = i3 + 5;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return standardTermsV2BizReceiverArr;
        }
    }

    static {
        int i = onExtraCallback + 11;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 90 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 83;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof StandardTermsV2BizReceiver)) {
            return false;
        }
        StandardTermsV2BizReceiver standardTermsV2BizReceiver = (StandardTermsV2BizReceiver) obj;
        if (Intrinsics.areEqual(this.bizRegNo, standardTermsV2BizReceiver.bizRegNo)) {
            return !(Intrinsics.areEqual(this.bizName, standardTermsV2BizReceiver.bizName) ^ true);
        }
        int i4 = onWarmupCompleted + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.bizRegNo.hashCode();
        return i3 != 0 ? (iHashCode - 114) / this.bizName.hashCode() : (iHashCode * 31) + this.bizName.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StandardTermsV2BizReceiver(bizRegNo=" + this.bizRegNo + ", bizName=" + this.bizName + ")";
        int i2 = onWarmupCompleted + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 41;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.bizRegNo);
        parcel.writeString(this.bizName);
        int i5 = onNavigationEvent + 73;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StandardTermsV2BizReceiver> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                StandardTermsV2BizReceiver$$serializer standardTermsV2BizReceiver$$serializer = StandardTermsV2BizReceiver$$serializer.INSTANCE;
                obj.hashCode();
                throw null;
            }
            StandardTermsV2BizReceiver$$serializer standardTermsV2BizReceiver$$serializer2 = StandardTermsV2BizReceiver$$serializer.INSTANCE;
            int i3 = onExtraCallbackWithResult + 83;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return standardTermsV2BizReceiver$$serializer2;
            }
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ StandardTermsV2BizReceiver(int i, String str, String str2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onWarmupCompleted + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, StandardTermsV2BizReceiver$$serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 79;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.bizRegNo = str;
        this.bizName = str2;
    }

    public StandardTermsV2BizReceiver(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.bizRegNo = str;
        this.bizName = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(StandardTermsV2BizReceiver standardTermsV2BizReceiver, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, standardTermsV2BizReceiver.bizRegNo);
        vylVar.onExtraCallback(serialDescriptor, 1, standardTermsV2BizReceiver.bizName);
    }

    public final AgreementReceiverInfoRequest onExtraCallback() {
        int i = 2 % 2;
        AgreementReceiverInfoRequest agreementReceiverInfoRequest = new AgreementReceiverInfoRequest(this.bizRegNo, this.bizName);
        int i2 = onNavigationEvent + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return agreementReceiverInfoRequest;
    }
}
