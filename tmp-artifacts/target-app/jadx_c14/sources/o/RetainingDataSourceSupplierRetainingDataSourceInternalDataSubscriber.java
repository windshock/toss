package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RetainingDataSourceSupplierRetainingDataSourceInternalDataSubscriber extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<RetainingDataSourceSupplierRetainingDataSourceInternalDataSubscriber> CREATOR = new onExtraCallbackWithResult();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final Boolean clearPreviousLayouts;
    private final String key;
    private final String linkUri;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String type;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<RetainingDataSourceSupplierRetainingDataSourceInternalDataSubscriber> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RetainingDataSourceSupplierRetainingDataSourceInternalDataSubscriber createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            RetainingDataSourceSupplierRetainingDataSourceInternalDataSubscriber retainingDataSourceSupplierRetainingDataSourceInternalDataSubscriberOnExtraCallback = onExtraCallback(parcel);
            int i4 = onNavigationEvent + 17;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 0;
            }
            return retainingDataSourceSupplierRetainingDataSourceInternalDataSubscriberOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RetainingDataSourceSupplierRetainingDataSourceInternalDataSubscriber[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 63;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            RetainingDataSourceSupplierRetainingDataSourceInternalDataSubscriber[] retainingDataSourceSupplierRetainingDataSourceInternalDataSubscriberArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onExtraCallback + 115;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return retainingDataSourceSupplierRetainingDataSourceInternalDataSubscriberArrOnWarmupCompleted;
        }

        public final RetainingDataSourceSupplierRetainingDataSourceInternalDataSubscriber onExtraCallback(Parcel parcel) {
            Boolean bool;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(RetainingDataSourceSupplierRetainingDataSourceInternalDataSubscriber.class.getClassLoader());
            if (parcel.readInt() == 0) {
                int i4 = onExtraCallback + 51;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    dynamicLoader.hashCode();
                    throw null;
                }
                bool = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i5 = onExtraCallback + 13;
                    int i6 = i5 % 128;
                    onNavigationEvent = i6;
                    z = i5 % 2 == 0;
                    int i7 = i6 + 99;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    int i9 = onExtraCallback + 57;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                int i11 = onNavigationEvent + 69;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                bool = boolValueOf;
            }
            return new RetainingDataSourceSupplierRetainingDataSourceInternalDataSubscriber(string, string2, rCTCodelessLoggingEventListener, bool, parcel.readInt() != 0 ? DynamicLoader.CREATOR.createFromParcel(parcel) : null, Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.readString());
        }

        public final RetainingDataSourceSupplierRetainingDataSourceInternalDataSubscriber[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 89;
            onExtraCallback = i3 % 128;
            RetainingDataSourceSupplierRetainingDataSourceInternalDataSubscriber[] retainingDataSourceSupplierRetainingDataSourceInternalDataSubscriberArr = new RetainingDataSourceSupplierRetainingDataSourceInternalDataSubscriber[i];
            if (i3 % 2 == 0) {
                int i4 = 85 / 0;
            }
            return retainingDataSourceSupplierRetainingDataSourceInternalDataSubscriberArr;
        }
    }

    static {
        int i = onExtraCallback + 11;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 57;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2 != 0 ? 1 : 0;
        int i5 = i2 + 27;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 55 / 0;
        }
        return i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.key);
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
            int i3 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
            int i5 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 / 4;
            }
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeString(this.linkUri);
    }

    public RetainingDataSourceSupplierRetainingDataSourceInternalDataSubscriber(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.type = str;
        this.key = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.linkUri = str3;
    }

    public String asInterface() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.type;
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        return str;
    }

    public String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            str = this.key;
            int i4 = 50 / 0;
        } else {
            str = this.key;
        }
        int i5 = i3 + 27;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
        return str;
    }

    public RCTCodelessLoggingEventListener asBinder() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i3 + 91;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return rCTCodelessLoggingEventListener;
    }

    public Boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Boolean bool = this.clearPreviousLayouts;
        int i5 = i3 + 71;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public DynamicLoader onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        return dynamicLoader;
    }

    public Map<String, Object> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.logParam;
        int i5 = i3 + 121;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 75;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.linkUri;
        int i5 = i2 + 69;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
