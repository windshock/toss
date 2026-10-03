package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RetainingDataSourceSupplierRetainingDataSource extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<RetainingDataSourceSupplierRetainingDataSource> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final Boolean clearPreviousLayouts;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String type;

    public static final class onNavigationEvent implements Parcelable.Creator<RetainingDataSourceSupplierRetainingDataSource> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RetainingDataSourceSupplierRetainingDataSource createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            RetainingDataSourceSupplierRetainingDataSource retainingDataSourceSupplierRetainingDataSourceOnExtraCallback = onExtraCallback(parcel);
            if (i3 == 0) {
                int i4 = 8 / 0;
            }
            int i5 = IAuthTabCallback + 69;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return retainingDataSourceSupplierRetainingDataSourceOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RetainingDataSourceSupplierRetainingDataSource[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 83;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                onExtraCallback(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            RetainingDataSourceSupplierRetainingDataSource[] retainingDataSourceSupplierRetainingDataSourceArrOnExtraCallback = onExtraCallback(i);
            int i4 = onWarmupCompleted + 81;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return retainingDataSourceSupplierRetainingDataSourceArrOnExtraCallback;
        }

        public final RetainingDataSourceSupplierRetainingDataSource onExtraCallback(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            DynamicLoader dynamicLoaderCreateFromParcel = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 == 0) {
                parcel.readString();
                parcel.readString();
                parcel.readInt();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(RetainingDataSourceSupplierRetainingDataSource.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    int i4 = IAuthTabCallback + 115;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() != 0) {
                int i6 = IAuthTabCallback + 105;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
            }
            return new RetainingDataSourceSupplierRetainingDataSource(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoaderCreateFromParcel, Preconditions.INSTANCE.onNavigationEvent(parcel));
        }

        public final RetainingDataSourceSupplierRetainingDataSource[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 121;
            onWarmupCompleted = i4 % 128;
            RetainingDataSourceSupplierRetainingDataSource[] retainingDataSourceSupplierRetainingDataSourceArr = new RetainingDataSourceSupplierRetainingDataSource[i];
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 63;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 0;
            }
            return retainingDataSourceSupplierRetainingDataSourceArr;
        }
    }

    static {
        int i = onExtraCallback + 71;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i3 % 128;
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
            parcel.writeInt(0);
            int i5 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
    }

    public RetainingDataSourceSupplierRetainingDataSource(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.key = str;
        this.type = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
    }

    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 91;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.type;
        }
        throw null;
    }

    public RCTCodelessLoggingEventListener onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i3 + 93;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return rCTCodelessLoggingEventListener;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 65;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.clearPreviousLayouts;
        int i5 = i2 + 85;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public DynamicLoader onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i5 = i3 + 65;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return dynamicLoader;
    }

    public Map<String, Object> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<String, Object> map = this.logParam;
        int i4 = i3 + 11;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }
}
