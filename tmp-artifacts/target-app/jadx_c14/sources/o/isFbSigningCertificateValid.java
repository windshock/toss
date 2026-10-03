package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class isFbSigningCertificateValid extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<isFbSigningCertificateValid> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final Boolean clearPreviousLayouts;
    private final List<Integer> excludedBankCodes;
    private final String headerTitle;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String type;

    public static final class onWarmupCompleted implements Parcelable.Creator<isFbSigningCertificateValid> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ isFbSigningCertificateValid createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            isFbSigningCertificateValid isfbsigningcertificatevalidOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = onExtraCallback + 61;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return isfbsigningcertificatevalidOnExtraCallbackWithResult;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ isFbSigningCertificateValid[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 121;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            isFbSigningCertificateValid[] isfbsigningcertificatevalidArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = IAuthTabCallback + 35;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return isfbsigningcertificatevalidArrOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final isFbSigningCertificateValid onExtraCallbackWithResult(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(isFbSigningCertificateValid.class.getClassLoader());
            DynamicLoader dynamicLoaderCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i2 = IAuthTabCallback + 29;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() != 0) {
                int i4 = onExtraCallback + 111;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
            }
            DynamicLoader dynamicLoader = dynamicLoaderCreateFromParcel;
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            int i6 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i6);
            for (int i7 = 0; i7 != i6; i7++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new isFbSigningCertificateValid(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoader, mapOnNavigationEvent, string3, arrayList);
        }

        public final isFbSigningCertificateValid[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 17;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            isFbSigningCertificateValid[] isfbsigningcertificatevalidArr = new isFbSigningCertificateValid[i];
            int i6 = i3 + 111;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return isfbsigningcertificatevalidArr;
        }
    }

    static {
        int i = IAuthTabCallback + 29;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 119;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isFbSigningCertificateValid)) {
            return false;
        }
        isFbSigningCertificateValid isfbsigningcertificatevalid = (isFbSigningCertificateValid) obj;
        if (!Intrinsics.areEqual(this.type, isfbsigningcertificatevalid.type)) {
            int i2 = onExtraCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.key, isfbsigningcertificatevalid.key) || !Intrinsics.areEqual(this.onBack, isfbsigningcertificatevalid.onBack)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.clearPreviousLayouts, isfbsigningcertificatevalid.clearPreviousLayouts)) {
            int i3 = onExtraCallback + 13;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.navigationRightButton, isfbsigningcertificatevalid.navigationRightButton)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.logParam, isfbsigningcertificatevalid.logParam)) {
            int i5 = onExtraCallback + 71;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.headerTitle, isfbsigningcertificatevalid.headerTitle)) {
            int i7 = onExtraCallbackWithResult + 51;
            onExtraCallback = i7 % 128;
            return i7 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.excludedBankCodes, isfbsigningcertificatevalid.excludedBankCodes)) {
            return false;
        }
        int i8 = onExtraCallbackWithResult + 77;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iHashCode4 = this.type.hashCode();
        int iHashCode5 = this.key.hashCode();
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        if (rCTCodelessLoggingEventListener == null) {
            int i2 = onExtraCallbackWithResult + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = rCTCodelessLoggingEventListener.hashCode();
            int i4 = onExtraCallbackWithResult + 7;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            int i6 = onExtraCallback + 43;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = bool.hashCode();
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            int i8 = onExtraCallbackWithResult + 111;
            onExtraCallback = i8 % 128;
            iHashCode3 = i8 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode3 = dynamicLoader.hashCode();
        }
        Map<String, Object> map = this.logParam;
        return (((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (map != null ? map.hashCode() : 0)) * 31) + this.headerTitle.hashCode()) * 31) + this.excludedBankCodes.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountManualInputLayoutDto(type=" + this.type + ", key=" + this.key + ", onBack=" + this.onBack + ", clearPreviousLayouts=" + this.clearPreviousLayouts + ", navigationRightButton=" + this.navigationRightButton + ", logParam=" + this.logParam + ", headerTitle=" + this.headerTitle + ", excludedBankCodes=" + this.excludedBankCodes + ")";
        int i2 = onExtraCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 72 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 63;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.key);
        parcel.writeParcelable(this.onBack, i);
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            int i7 = onExtraCallback + 117;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            parcel.writeInt(0);
            i2 = onExtraCallback + 93;
            i3 = i2 % 128;
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
            i2 = onExtraCallback + 123;
            i3 = i2 % 128;
        }
        onExtraCallbackWithResult = i3;
        int i9 = i2 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeString(this.headerTitle);
        List<Integer> list = this.excludedBankCodes;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
    }

    public isFbSigningCertificateValid(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.type = str;
        this.key = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.headerTitle = str3;
        this.excludedBankCodes = list;
    }

    public String asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 77;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 93;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 17;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public RCTCodelessLoggingEventListener onTransact() {
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            rCTCodelessLoggingEventListener = this.onBack;
            int i4 = 15 / 0;
        } else {
            rCTCodelessLoggingEventListener = this.onBack;
        }
        int i5 = i3 + 123;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return rCTCodelessLoggingEventListener;
    }

    public Boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.clearPreviousLayouts;
        int i4 = i3 + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    public DynamicLoader asBinder() {
        DynamicLoader dynamicLoader;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            dynamicLoader = this.navigationRightButton;
            int i4 = 93 / 0;
        } else {
            dynamicLoader = this.navigationRightButton;
        }
        int i5 = i3 + 53;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return dynamicLoader;
        }
        throw null;
    }

    public Map<String, Object> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<String, Object> map = this.logParam;
        int i4 = i3 + 87;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 9;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.headerTitle;
        int i5 = i2 + 15;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final List<Integer> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 69;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        List<Integer> list = this.excludedBankCodes;
        int i5 = i2 + 125;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
        return list;
    }
}
