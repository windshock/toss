package viva.republica.toss.network.model.electronicdocument.wallet;

import android.os.Parcel;
import android.os.Parcelable;
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
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class EDocButton implements Parcelable {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String buttonName;
    private final String schemeUrl;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EDocButton> CREATOR = new onExtraCallback();

    public static final class onExtraCallback implements Parcelable.Creator<EDocButton> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ EDocButton createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            EDocButton eDocButtonOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return eDocButtonOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ EDocButton[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            EDocButton[] eDocButtonArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onExtraCallbackWithResult + 115;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 24 / 0;
            }
            return eDocButtonArrOnWarmupCompleted;
        }

        public final EDocButton onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            EDocButton eDocButton = new EDocButton(parcel.readString(), parcel.readString());
            int i2 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 47 / 0;
            }
            return eDocButton;
        }

        public final EDocButton[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i3 % 128;
            EDocButton[] eDocButtonArr = new EDocButton[i];
            if (i3 % 2 != 0) {
                int i4 = 36 / 0;
            }
            return eDocButtonArr;
        }
    }

    static {
        int i = IAuthTabCallback + 87;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 15;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 97;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof EDocButton)) {
            int i4 = onExtraCallback + 67;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        EDocButton eDocButton = (EDocButton) obj;
        if (Intrinsics.areEqual(this.buttonName, eDocButton.buttonName)) {
            return Intrinsics.areEqual(this.schemeUrl, eDocButton.schemeUrl);
        }
        int i6 = onExtraCallback + 35;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onWarmupCompleted = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.buttonName.hashCode() % 110) >> this.schemeUrl.hashCode() : (this.buttonName.hashCode() * 31) + this.schemeUrl.hashCode();
        int i3 = onExtraCallback + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EDocButton(buttonName=" + this.buttonName + ", schemeUrl=" + this.schemeUrl + ")";
        int i2 = onExtraCallback + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 123;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.buttonName);
        parcel.writeString(this.schemeUrl);
        int i5 = onWarmupCompleted + 107;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EDocButton> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            EDocButton$$serializer eDocButton$$serializer = EDocButton$$serializer.INSTANCE;
            int i4 = onExtraCallback + 69;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return eDocButton$$serializer;
            }
            throw null;
        }
    }

    public /* synthetic */ EDocButton(int i, String str, String str2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onExtraCallback + 39;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                htf31.onExtraCallbackWithResult(i, 2, EDocButton$$serializer.INSTANCE.getDescriptor());
            } else {
                htf31.onExtraCallbackWithResult(i, 3, EDocButton$$serializer.INSTANCE.getDescriptor());
            }
            int i3 = 2 % 2;
        }
        this.buttonName = str;
        this.schemeUrl = str2;
    }

    public EDocButton(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.buttonName = str;
        this.schemeUrl = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(EDocButton eDocButton, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            vylVar.onExtraCallback(serialDescriptor, 0, eDocButton.buttonName);
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, eDocButton.buttonName);
        }
        vylVar.onExtraCallback(serialDescriptor, 1, eDocButton.schemeUrl);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.buttonName;
        int i5 = i3 + 83;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.schemeUrl;
        int i5 = i2 + 73;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
