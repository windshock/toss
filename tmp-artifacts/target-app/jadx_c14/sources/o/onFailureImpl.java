package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class onFailureImpl extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<onFailureImpl> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final Boolean clearPreviousLayouts;
    private final String key;
    private final Map<String, Object> logParam;
    private final String message;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String tdsIconName;
    private final String type;

    public static final class IAuthTabCallback implements Parcelable.Creator<onFailureImpl> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ onFailureImpl createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                onExtraCallback(parcel);
                throw null;
            }
            onFailureImpl onfailureimplOnExtraCallback = onExtraCallback(parcel);
            int i3 = IAuthTabCallback + 101;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return onfailureimplOnExtraCallback;
            }
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ onFailureImpl[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 21;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            onFailureImpl[] onfailureimplArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onNavigationEvent + 111;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return onfailureimplArrOnExtraCallbackWithResult;
        }

        public final onFailureImpl onExtraCallback(Parcel parcel) {
            Boolean boolValueOf;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(onFailureImpl.class.getClassLoader());
            if (parcel.readInt() == 0) {
                int i4 = IAuthTabCallback + 59;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new onFailureImpl(string, string2, rCTCodelessLoggingEventListener, boolValueOf, parcel.readInt() != 0 ? DynamicLoader.CREATOR.createFromParcel(parcel) : null, Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.readString(), parcel.readString());
        }

        public final onFailureImpl[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 123;
            IAuthTabCallback = i3 % 128;
            onFailureImpl[] onfailureimplArr = new onFailureImpl[i];
            if (i3 % 2 == 0) {
                return onfailureimplArr;
            }
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 79;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 95;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onFailureImpl)) {
            int i2 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 68 / 0;
            }
            return false;
        }
        onFailureImpl onfailureimpl = (onFailureImpl) obj;
        if (!Intrinsics.areEqual(this.type, onfailureimpl.type)) {
            int i4 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.key, onfailureimpl.key)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onBack, onfailureimpl.onBack)) {
            int i6 = IAuthTabCallback + 5;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.clearPreviousLayouts, onfailureimpl.clearPreviousLayouts) || !Intrinsics.areEqual(this.navigationRightButton, onfailureimpl.navigationRightButton) || !Intrinsics.areEqual(this.logParam, onfailureimpl.logParam)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.tdsIconName, onfailureimpl.tdsIconName)) {
            int i8 = onExtraCallbackWithResult + 5;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.message, onfailureimpl.message))) {
            return true;
        }
        int i10 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.type.hashCode();
        int iHashCode3 = this.key.hashCode();
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int iHashCode4 = 0;
        int iHashCode5 = rCTCodelessLoggingEventListener == null ? 0 : rCTCodelessLoggingEventListener.hashCode();
        Boolean bool = this.clearPreviousLayouts;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            iHashCode = 0;
        } else {
            iHashCode = dynamicLoader.hashCode();
            int i4 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 % 2;
            }
        }
        Map<String, Object> map = this.logParam;
        if (map != null) {
            iHashCode4 = map.hashCode();
            int i6 = onExtraCallbackWithResult + 5;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        int iHashCode7 = (((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode4) * 31) + this.tdsIconName.hashCode()) * 31) + this.message.hashCode();
        int i8 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            return iHashCode7;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ToastLayoutDto(type=" + this.type + ", key=" + this.key + ", onBack=" + this.onBack + ", clearPreviousLayouts=" + this.clearPreviousLayouts + ", navigationRightButton=" + this.navigationRightButton + ", logParam=" + this.logParam + ", tdsIconName=" + this.tdsIconName + ", message=" + this.message + ")";
        int i2 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.key);
        parcel.writeParcelable(this.onBack, i);
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            int i5 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
            int i6 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            int i8 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeString(this.tdsIconName);
        parcel.writeString(this.message);
    }

    public onFailureImpl(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.type = str;
        this.key = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.tdsIconName = str3;
        this.message = str4;
    }

    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 73;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 25;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 47;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public RCTCodelessLoggingEventListener IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i3 + 11;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return rCTCodelessLoggingEventListener;
    }

    public Boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 33;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.clearPreviousLayouts;
        int i5 = i2 + 71;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    public DynamicLoader onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i4 = i3 + 75;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return dynamicLoader;
        }
        throw null;
    }

    public Map<String, Object> onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.logParam;
        int i5 = i3 + 109;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.tdsIconName;
        int i5 = i3 + 19;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 113;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.message;
        int i5 = i2 + 43;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
