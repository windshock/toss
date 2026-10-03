package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class WrappedParcelable extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<WrappedParcelable> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final Boolean clearPreviousLayouts;
    private final NativeAdImageApi fieldValidation;
    private final boolean isOfficeDepartmentRequired;
    private final boolean isOfficePhoneRequired;
    private final boolean isOfficeRequired;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String type;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<WrappedParcelable> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final WrappedParcelable IAuthTabCallback(Parcel parcel) {
            Boolean boolValueOf;
            DynamicLoader dynamicLoaderCreateFromParcel;
            boolean z;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(WrappedParcelable.class.getClassLoader());
            NativeAdImageApi nativeAdImageApiCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                int i2 = onWarmupCompleted + 123;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 13;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                dynamicLoaderCreateFromParcel = null;
            } else {
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
            }
            DynamicLoader dynamicLoader = dynamicLoaderCreateFromParcel;
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            if (parcel.readInt() != 0) {
                int i7 = onWarmupCompleted + 113;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                int i9 = onWarmupCompleted + 79;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 20 / 0;
                }
            } else {
                nativeAdImageApiCreateFromParcel = NativeAdImageApi.CREATOR.createFromParcel(parcel);
            }
            return new WrappedParcelable(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoader, mapOnNavigationEvent, z, z2, z3, nativeAdImageApiCreateFromParcel);
        }

        public final WrappedParcelable[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 111;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            WrappedParcelable[] wrappedParcelableArr = new WrappedParcelable[i];
            int i6 = i3 + 69;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 73 / 0;
            }
            return wrappedParcelableArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ WrappedParcelable createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            WrappedParcelable wrappedParcelableIAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = onWarmupCompleted + 67;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return wrappedParcelableIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ WrappedParcelable[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 7;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            WrappedParcelable[] wrappedParcelableArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onWarmupCompleted + 123;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return wrappedParcelableArrIAuthTabCallback;
        }
    }

    static {
        int i = onNavigationEvent + 81;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 119;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 21;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.type);
        parcel.writeParcelable(this.onBack, i);
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            int i5 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeInt(this.isOfficeRequired ? 1 : 0);
        parcel.writeInt(this.isOfficePhoneRequired ? 1 : 0);
        parcel.writeInt(this.isOfficeDepartmentRequired ? 1 : 0);
        NativeAdImageApi nativeAdImageApi = this.fieldValidation;
        if (nativeAdImageApi == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nativeAdImageApi.writeToParcel(parcel, i);
        }
    }

    public WrappedParcelable(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, boolean z, boolean z2, boolean z3, @Nullable NativeAdImageApi nativeAdImageApi) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.key = str;
        this.type = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.isOfficeRequired = z;
        this.isOfficePhoneRequired = z2;
        this.isOfficeDepartmentRequired = z3;
        this.fieldValidation = nativeAdImageApi;
    }

    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.key;
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        return str;
    }

    public String asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 59;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 24 / 0;
        }
        return str;
    }

    public RCTCodelessLoggingEventListener IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i3 + 97;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return rCTCodelessLoggingEventListener;
    }

    public Boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 113;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.clearPreviousLayouts;
        int i5 = i2 + 105;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return bool;
    }

    public DynamicLoader onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 79;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i5 = i2 + 13;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 61 / 0;
        }
        return dynamicLoader;
    }

    public Map<String, Object> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 97;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<String, Object> map = this.logParam;
        int i4 = i2 + 109;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    public final boolean asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 79;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.isOfficeRequired;
        int i4 = i2 + 27;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.isOfficePhoneRequired;
        }
        throw null;
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isOfficeDepartmentRequired;
        int i5 = i2 + 37;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final NativeAdImageApi onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        NativeAdImageApi nativeAdImageApi = this.fieldValidation;
        int i5 = i3 + 21;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return nativeAdImageApi;
    }
}
