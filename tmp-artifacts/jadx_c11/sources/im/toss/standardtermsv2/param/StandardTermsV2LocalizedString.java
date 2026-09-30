package im.toss.standardtermsv2.param;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.standardtermsv2.param.StandardTermsV2LocalizedString$;
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
public final class StandardTermsV2LocalizedString implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<StandardTermsV2LocalizedString> CREATOR = new IAuthTabCallback();
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String koreaString;
    private final String localizedString;

    public static final class IAuthTabCallback implements Parcelable.Creator<StandardTermsV2LocalizedString> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public final StandardTermsV2LocalizedString IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            StandardTermsV2LocalizedString standardTermsV2LocalizedString = new StandardTermsV2LocalizedString(parcel.readString(), parcel.readString());
            int i2 = onExtraCallback + 37;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 74 / 0;
            }
            return standardTermsV2LocalizedString;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ StandardTermsV2LocalizedString createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(parcel);
            }
            IAuthTabCallback(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ StandardTermsV2LocalizedString[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 45;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                onWarmupCompleted(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            StandardTermsV2LocalizedString[] standardTermsV2LocalizedStringArrOnWarmupCompleted = onWarmupCompleted(i);
            int i4 = onExtraCallback + 121;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return standardTermsV2LocalizedStringArrOnWarmupCompleted;
        }

        public final StandardTermsV2LocalizedString[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 21;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            StandardTermsV2LocalizedString[] standardTermsV2LocalizedStringArr = new StandardTermsV2LocalizedString[i];
            if (i3 % 2 == 0) {
                int i5 = 75 / 0;
            }
            int i6 = i4 + 85;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return standardTermsV2LocalizedStringArr;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onExtraCallback + 5;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 125;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 125;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StandardTermsV2LocalizedString)) {
            int i2 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        StandardTermsV2LocalizedString standardTermsV2LocalizedString = (StandardTermsV2LocalizedString) obj;
        if (!Intrinsics.areEqual(this.localizedString, standardTermsV2LocalizedString.localizedString)) {
            int i4 = onExtraCallbackWithResult + 7;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.koreaString, standardTermsV2LocalizedString.koreaString)) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.localizedString.hashCode() * 31) + this.koreaString.hashCode();
        int i4 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StandardTermsV2LocalizedString(localizedString=" + this.localizedString + ", koreaString=" + this.koreaString + ")";
        int i2 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.localizedString);
        parcel.writeString(this.koreaString);
        int i5 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StandardTermsV2LocalizedString> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            StandardTermsV2LocalizedString$.serializer serializerVar = StandardTermsV2LocalizedString$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 49;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ StandardTermsV2LocalizedString(int i, String str, String str2, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 3;
        if (3 != (i & 3)) {
            int i3 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = StandardTermsV2LocalizedString$.serializer.INSTANCE.getDescriptor();
                i2 = 4;
            } else {
                descriptor = StandardTermsV2LocalizedString$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.localizedString = str;
        this.koreaString = str2;
    }

    public StandardTermsV2LocalizedString(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.localizedString = str;
        this.koreaString = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(StandardTermsV2LocalizedString standardTermsV2LocalizedString, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, standardTermsV2LocalizedString.localizedString);
        vylVar.onExtraCallback(serialDescriptor, 1, standardTermsV2LocalizedString.koreaString);
        int i4 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.localizedString;
        int i5 = i2 + 89;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.koreaString;
        int i5 = i2 + 61;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
