package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getDbValue extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<getDbValue> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final Boolean clearPreviousLayouts;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final int otp;
    private final createRewardedVideoAd paymentAccount;
    private final String title;
    private final String type;

    public static final class onWarmupCompleted implements Parcelable.Creator<getDbValue> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getDbValue createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                onWarmupCompleted(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getDbValue getdbvalueOnWarmupCompleted = onWarmupCompleted(parcel);
            int i3 = onExtraCallbackWithResult + 33;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 54 / 0;
            }
            return getdbvalueOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getDbValue[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 75;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            getDbValue[] getdbvalueArrOnExtraCallback = onExtraCallback(i);
            int i5 = onExtraCallback + 77;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 10 / 0;
            }
            return getdbvalueArrOnExtraCallback;
        }

        public final getDbValue[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 37;
            onExtraCallbackWithResult = i4 % 128;
            getDbValue[] getdbvalueArr = new getDbValue[i];
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = i3 + 89;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 90 / 0;
            }
            return getdbvalueArr;
        }

        public final getDbValue onWarmupCompleted(Parcel parcel) {
            boolean z;
            Boolean bool;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(getDbValue.class.getClassLoader());
            if (parcel.readInt() == 0) {
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 33;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 63;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                bool = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i7 = onExtraCallbackWithResult + 61;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    z = true;
                } else {
                    z = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                int i9 = onExtraCallback + 121;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                bool = boolValueOf;
            }
            return new getDbValue(string, string2, rCTCodelessLoggingEventListener, bool, parcel.readInt() != 0 ? DynamicLoader.CREATOR.createFromParcel(parcel) : null, Preconditions.INSTANCE.onNavigationEvent(parcel), createRewardedVideoAd.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt());
        }
    }

    static {
        int i = onExtraCallback + 79;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 57;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.type);
        parcel.writeParcelable(this.onBack, i);
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            int i5 = onWarmupCompleted + 71;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            int i7 = onNavigationEvent + 79;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        this.paymentAccount.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeInt(this.otp);
    }

    public getDbValue(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull createRewardedVideoAd createrewardedvideoad, @NotNull String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(createrewardedvideoad, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.key = str;
        this.type = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.paymentAccount = createrewardedvideoad;
        this.title = str3;
        this.otp = i;
    }

    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 69;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return str;
    }

    public String onTransact() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 11;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public RCTCodelessLoggingEventListener onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 3;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i4 = i2 + 53;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return rCTCodelessLoggingEventListener;
        }
        obj.hashCode();
        throw null;
    }

    public Boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 97;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.clearPreviousLayouts;
        int i5 = i2 + 63;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public DynamicLoader onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
        return dynamicLoader;
    }

    public Map<String, Object> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.logParam;
        int i5 = i3 + 5;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        throw null;
    }

    public final createRewardedVideoAd IAuthTabCallbackStub() {
        createRewardedVideoAd createrewardedvideoad;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 81;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            createrewardedvideoad = this.paymentAccount;
            int i4 = 31 / 0;
        } else {
            createrewardedvideoad = this.paymentAccount;
        }
        int i5 = i2 + 121;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return createrewardedvideoad;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.title;
        }
        throw null;
    }

    public final int IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = this.otp;
        int i6 = i3 + 41;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
