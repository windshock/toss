package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.cardsales.funnel.RetryPolicy;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RestrictiveDataManager extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<RestrictiveDataManager> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
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

    public static final class onWarmupCompleted implements Parcelable.Creator<RestrictiveDataManager> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final RestrictiveDataManager IAuthTabCallback(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            DynamicLoader dynamicLoaderCreateFromParcel;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(RestrictiveDataManager.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i4 = onWarmupCompleted + 15;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                int i6 = onWarmupCompleted + 89;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 93 / 0;
                }
                dynamicLoaderCreateFromParcel = null;
            } else {
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
            }
            return new RestrictiveDataManager(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoaderCreateFromParcel, Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? RetryPolicy.CREATOR.createFromParcel(parcel) : null, (createAdSizeApi) parcel.readParcelable(RestrictiveDataManager.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RestrictiveDataManager createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            RestrictiveDataManager restrictiveDataManagerIAuthTabCallback = IAuthTabCallback(parcel);
            if (i3 != 0) {
                int i4 = 44 / 0;
            }
            return restrictiveDataManagerIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RestrictiveDataManager[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 61;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            RestrictiveDataManager[] restrictiveDataManagerArrOnNavigationEvent = onNavigationEvent(i);
            int i5 = onWarmupCompleted + 115;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return restrictiveDataManagerArrOnNavigationEvent;
        }

        public final RestrictiveDataManager[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 29;
            onExtraCallback = i3 % 128;
            RestrictiveDataManager[] restrictiveDataManagerArr = new RestrictiveDataManager[i];
            if (i3 % 2 != 0) {
                int i4 = 4 / 0;
            }
            return restrictiveDataManagerArr;
        }
    }

    static {
        int i = onWarmupCompleted + 87;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 93;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeString(this.key);
            parcel.writeString(this.type);
            parcel.writeParcelable(this.onBack, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
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
            int i5 = IAuthTabCallback + 61;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
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

    public RestrictiveDataManager(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @Nullable String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6, @Nullable RetryPolicy retryPolicy, @Nullable createAdSizeApi createadsizeapi) {
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

    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.key;
        }
        throw null;
    }

    public String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.type;
        int i4 = i3 + 87;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public RCTCodelessLoggingEventListener asBinder() {
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 49;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            rCTCodelessLoggingEventListener = this.onBack;
            int i4 = 85 / 0;
        } else {
            rCTCodelessLoggingEventListener = this.onBack;
        }
        int i5 = i2 + 47;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return rCTCodelessLoggingEventListener;
    }

    public Boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.clearPreviousLayouts;
        }
        throw null;
    }

    public DynamicLoader IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i5 = i3 + 37;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return dynamicLoader;
    }

    public Map<String, Object> onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.logParam;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 19;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.certType;
        int i5 = i2 + 113;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.purpose;
        int i5 = i2 + 109;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.title;
        int i4 = i3 + 97;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 117;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.description;
        int i5 = i2 + 55;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
        return str;
    }

    public final RetryPolicy asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 125;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        RetryPolicy retryPolicy = this.retryPolicy;
        int i4 = i2 + 9;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return retryPolicy;
    }

    public final createAdSizeApi IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.fallbackLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
