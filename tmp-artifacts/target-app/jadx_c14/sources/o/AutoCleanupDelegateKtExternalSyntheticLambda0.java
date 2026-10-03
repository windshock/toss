package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AutoCleanupDelegateKtExternalSyntheticLambda0 extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<AutoCleanupDelegateKtExternalSyntheticLambda0> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final Boolean clearPreviousLayouts;
    private final DynamicLoader cta;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final DynamicLoader secondary;
    private final String subTitle;
    private final String title;
    private final String type;

    public static final class IAuthTabCallback implements Parcelable.Creator<AutoCleanupDelegateKtExternalSyntheticLambda0> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AutoCleanupDelegateKtExternalSyntheticLambda0 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AutoCleanupDelegateKtExternalSyntheticLambda0 autoCleanupDelegateKtExternalSyntheticLambda0OnExtraCallback = onExtraCallback(parcel);
            int i4 = onExtraCallbackWithResult + 115;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return autoCleanupDelegateKtExternalSyntheticLambda0OnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AutoCleanupDelegateKtExternalSyntheticLambda0[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 9;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            AutoCleanupDelegateKtExternalSyntheticLambda0[] autoCleanupDelegateKtExternalSyntheticLambda0ArrOnExtraCallback = onExtraCallback(i);
            int i5 = onExtraCallbackWithResult + 99;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return autoCleanupDelegateKtExternalSyntheticLambda0ArrOnExtraCallback;
            }
            throw null;
        }

        public final AutoCleanupDelegateKtExternalSyntheticLambda0 onExtraCallback(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            DynamicLoader dynamicLoaderCreateFromParcel;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(AutoCleanupDelegateKtExternalSyntheticLambda0.class.getClassLoader());
            DynamicLoader dynamicLoaderCreateFromParcel2 = null;
            if (parcel.readInt() == 0) {
                int i2 = onExtraCallback + 31;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i4 = onExtraCallbackWithResult + 91;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                dynamicLoaderCreateFromParcel = null;
            } else {
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
                int i6 = onExtraCallbackWithResult + 125;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 3 % 4;
                }
            }
            DynamicLoader dynamicLoader = dynamicLoaderCreateFromParcel;
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Parcelable.Creator<DynamicLoader> creator = DynamicLoader.CREATOR;
            DynamicLoader dynamicLoaderCreateFromParcel3 = creator.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                int i8 = onExtraCallback + 61;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
            } else {
                dynamicLoaderCreateFromParcel2 = creator.createFromParcel(parcel);
            }
            return new AutoCleanupDelegateKtExternalSyntheticLambda0(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoader, mapOnNavigationEvent, string3, string4, dynamicLoaderCreateFromParcel3, dynamicLoaderCreateFromParcel2);
        }

        public final AutoCleanupDelegateKtExternalSyntheticLambda0[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 11;
            onExtraCallback = i4 % 128;
            AutoCleanupDelegateKtExternalSyntheticLambda0[] autoCleanupDelegateKtExternalSyntheticLambda0Arr = new AutoCleanupDelegateKtExternalSyntheticLambda0[i];
            if (i4 % 2 != 0) {
                int i5 = 53 / 0;
            }
            int i6 = i3 + 101;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return autoCleanupDelegateKtExternalSyntheticLambda0Arr;
        }
    }

    static {
        int i = onExtraCallback + 15;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 97;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCleanupDelegateKtExternalSyntheticLambda0)) {
            return false;
        }
        AutoCleanupDelegateKtExternalSyntheticLambda0 autoCleanupDelegateKtExternalSyntheticLambda0 = (AutoCleanupDelegateKtExternalSyntheticLambda0) obj;
        if (!Intrinsics.areEqual(this.key, autoCleanupDelegateKtExternalSyntheticLambda0.key) || !Intrinsics.areEqual(this.type, autoCleanupDelegateKtExternalSyntheticLambda0.type) || !Intrinsics.areEqual(this.onBack, autoCleanupDelegateKtExternalSyntheticLambda0.onBack)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.clearPreviousLayouts, autoCleanupDelegateKtExternalSyntheticLambda0.clearPreviousLayouts)) {
            int i4 = IAuthTabCallback + 71;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.navigationRightButton, autoCleanupDelegateKtExternalSyntheticLambda0.navigationRightButton) || !Intrinsics.areEqual(this.logParam, autoCleanupDelegateKtExternalSyntheticLambda0.logParam) || !Intrinsics.areEqual(this.title, autoCleanupDelegateKtExternalSyntheticLambda0.title)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.subTitle, autoCleanupDelegateKtExternalSyntheticLambda0.subTitle)) {
            int i6 = IAuthTabCallback + 31;
            onNavigationEvent = i6 % 128;
            return i6 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.cta, autoCleanupDelegateKtExternalSyntheticLambda0.cta)) {
            return Intrinsics.areEqual(this.secondary, autoCleanupDelegateKtExternalSyntheticLambda0.secondary);
        }
        int i7 = IAuthTabCallback + 41;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.key.hashCode();
        int iHashCode4 = this.type.hashCode();
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int iHashCode5 = 1;
        if (rCTCodelessLoggingEventListener == null) {
            int i2 = IAuthTabCallback + 35;
            onNavigationEvent = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = rCTCodelessLoggingEventListener.hashCode();
        }
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            int i3 = onNavigationEvent + 85;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = bool.hashCode();
            int i5 = onNavigationEvent + 69;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int iHashCode6 = dynamicLoader == null ? 0 : dynamicLoader.hashCode();
        Map<String, Object> map = this.logParam;
        if (map == null) {
            int i7 = onNavigationEvent + 5;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                iHashCode5 = 0;
            }
        } else {
            iHashCode5 = map.hashCode();
        }
        int iHashCode7 = this.title.hashCode();
        int iHashCode8 = this.subTitle.hashCode();
        int iHashCode9 = this.cta.hashCode();
        DynamicLoader dynamicLoader2 = this.secondary;
        return (((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode6) * 31) + iHashCode5) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (dynamicLoader2 != null ? dynamicLoader2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DialogLayoutDto(key=" + this.key + ", type=" + this.type + ", onBack=" + this.onBack + ", clearPreviousLayouts=" + this.clearPreviousLayouts + ", navigationRightButton=" + this.navigationRightButton + ", logParam=" + this.logParam + ", title=" + this.title + ", subTitle=" + this.subTitle + ", cta=" + this.cta + ", secondary=" + this.secondary + ")";
        int i2 = IAuthTabCallback + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 93;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.key);
            parcel.writeString(this.type);
            parcel.writeParcelable(this.onBack, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.type);
        parcel.writeParcelable(this.onBack, i);
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            int i4 = IAuthTabCallback + 61;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            int i6 = onNavigationEvent + 1;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        this.cta.writeToParcel(parcel, i);
        DynamicLoader dynamicLoader2 = this.secondary;
        if (dynamicLoader2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicLoader2.writeToParcel(parcel, i);
        }
    }

    public AutoCleanupDelegateKtExternalSyntheticLambda0(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @NotNull String str4, @NotNull DynamicLoader dynamicLoader2, @Nullable DynamicLoader dynamicLoader3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(dynamicLoader2, "");
        this.key = str;
        this.type = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.title = str3;
        this.subTitle = str4;
        this.cta = dynamicLoader2;
        this.secondary = dynamicLoader3;
    }

    public String onExtraCallbackWithResult() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            str = this.key;
            int i4 = 91 / 0;
        } else {
            str = this.key;
        }
        int i5 = i3 + 19;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 11;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 43;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public RCTCodelessLoggingEventListener IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 95;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i4 = i2 + 51;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return rCTCodelessLoggingEventListener;
        }
        obj.hashCode();
        throw null;
    }

    public Boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.clearPreviousLayouts;
        }
        throw null;
    }

    public DynamicLoader onExtraCallback() {
        DynamicLoader dynamicLoader;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            dynamicLoader = this.navigationRightButton;
            int i4 = 48 / 0;
        } else {
            dynamicLoader = this.navigationRightButton;
        }
        int i5 = i3 + 105;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return dynamicLoader;
        }
        throw null;
    }

    public Map<String, Object> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.logParam;
        int i5 = i3 + 35;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 81;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.subTitle;
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        return str;
    }

    public final DynamicLoader onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 53;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DynamicLoader dynamicLoader = this.cta;
        int i4 = i2 + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return dynamicLoader;
    }

    public final DynamicLoader asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DynamicLoader dynamicLoader = this.secondary;
        int i4 = i3 + 3;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return dynamicLoader;
    }
}
