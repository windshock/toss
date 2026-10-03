package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.cardsales.funnel.RetryPolicy;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RetainingDataSourceSupplier extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<RetainingDataSourceSupplier> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String certType;
    private final Boolean clearPreviousLayouts;
    private final String description;
    private final createAdSizeApi fallbackLayout;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String purpose;
    private final RetryPolicy retryPolicy;
    private final String title;
    private final String type;

    public static final class onNavigationEvent implements Parcelable.Creator<RetainingDataSourceSupplier> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RetainingDataSourceSupplier createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(parcel);
                throw null;
            }
            RetainingDataSourceSupplier retainingDataSourceSupplierOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i3 = IAuthTabCallback + 79;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return retainingDataSourceSupplierOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RetainingDataSourceSupplier[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 101;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return onExtraCallback(i);
            }
            onExtraCallback(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final RetainingDataSourceSupplier[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 103;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            RetainingDataSourceSupplier[] retainingDataSourceSupplierArr = new RetainingDataSourceSupplier[i];
            int i6 = i3 + 79;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return retainingDataSourceSupplierArr;
        }

        public final RetainingDataSourceSupplier onExtraCallbackWithResult(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            DynamicLoader dynamicLoaderCreateFromParcel;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(RetainingDataSourceSupplier.class.getClassLoader());
            RetryPolicy retryPolicyCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                int i2 = onNavigationEvent + 87;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i3 = IAuthTabCallback + 73;
                    int i4 = i3 % 128;
                    onNavigationEvent = i4;
                    int i5 = i3 % 2;
                    int i6 = i4 + 107;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    z = true;
                } else {
                    int i8 = IAuthTabCallback + 53;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 5 / 3;
                    }
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                int i10 = onNavigationEvent + 25;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 41 / 0;
                }
                dynamicLoaderCreateFromParcel = null;
            } else {
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
            }
            DynamicLoader dynamicLoader = dynamicLoaderCreateFromParcel;
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i12 = onNavigationEvent + 63;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                Parcelable.Creator<RetryPolicy> creator = RetryPolicy.CREATOR;
                if (i13 != 0) {
                    creator.createFromParcel(parcel);
                    retryPolicyCreateFromParcel.hashCode();
                    throw null;
                }
                retryPolicyCreateFromParcel = creator.createFromParcel(parcel);
            }
            return new RetainingDataSourceSupplier(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoader, mapOnNavigationEvent, string3, string4, string5, string6, retryPolicyCreateFromParcel, (createAdSizeApi) parcel.readParcelable(RetainingDataSourceSupplier.class.getClassLoader()));
        }
    }

    static {
        int i = onNavigationEvent + 77;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 49;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.type);
        parcel.writeParcelable(this.onBack, i);
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            int i5 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            int i6 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeString(this.certType);
        parcel.writeString(this.purpose);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        RetryPolicy retryPolicy = this.retryPolicy;
        if (retryPolicy == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            retryPolicy.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.fallbackLayout, i);
    }

    public RetainingDataSourceSupplier(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @Nullable String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6, @Nullable RetryPolicy retryPolicy, @Nullable createAdSizeApi createadsizeapi) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.key = str;
        this.type = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.certType = str3;
        this.purpose = str4;
        this.title = str5;
        this.description = str6;
        this.retryPolicy = retryPolicy;
        this.fallbackLayout = createadsizeapi;
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 89;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 101;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 77;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.type;
        int i4 = i2 + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public RCTCodelessLoggingEventListener IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 111;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i2 + 63;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return rCTCodelessLoggingEventListener;
    }

    public Boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 21;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.clearPreviousLayouts;
        int i5 = i2 + 7;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    public DynamicLoader asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 39;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i5 = i2 + 37;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return dynamicLoader;
    }

    public Map<String, Object> asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> map = this.logParam;
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        return map;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.certType;
        int i4 = i3 + 1;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.purpose;
        int i5 = i3 + 39;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 9;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 9;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 19;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.description;
        int i5 = i2 + 61;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final RetryPolicy IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        RetryPolicy retryPolicy = this.retryPolicy;
        int i5 = i3 + 11;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return retryPolicy;
    }

    public final createAdSizeApi onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        createAdSizeApi createadsizeapi = this.fallbackLayout;
        int i5 = i3 + 33;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return createadsizeapi;
        }
        throw null;
    }
}
