package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getProcessSpecificName extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<getProcessSpecificName> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Boolean clearPreviousLayouts;
    private final String ctaTitleAfterCall;
    private final String ctaTitleBeforeCall;
    private final String ctaTopDescription;
    private final String description;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final createRewardedVideoAd paymentAccount;
    private final String title;
    private final String type;

    public static final class IAuthTabCallback implements Parcelable.Creator<getProcessSpecificName> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final getProcessSpecificName[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 39;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            getProcessSpecificName[] getprocessspecificnameArr = new getProcessSpecificName[i];
            int i6 = i3 + 53;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return getprocessspecificnameArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getProcessSpecificName createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getProcessSpecificName getprocessspecificnameOnNavigationEvent = onNavigationEvent(parcel);
            int i4 = onExtraCallbackWithResult + 115;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return getprocessspecificnameOnNavigationEvent;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getProcessSpecificName[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 65;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            getProcessSpecificName[] getprocessspecificnameArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onExtraCallbackWithResult + 41;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return getprocessspecificnameArrIAuthTabCallback;
        }

        public final getProcessSpecificName onNavigationEvent(Parcel parcel) {
            Boolean boolValueOf;
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            DynamicLoader dynamicLoaderCreateFromParcel = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                parcel.readString();
                parcel.readString();
                parcel.readInt();
                dynamicLoaderCreateFromParcel.hashCode();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolean z = false;
                if (parcel.readInt() != 0) {
                    int i4 = onExtraCallback + 115;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        z = true;
                    }
                }
                boolValueOf = Boolean.valueOf(z);
            }
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(getProcessSpecificName.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int i5 = onExtraCallback + 91;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
            }
            return new getProcessSpecificName(string, string2, boolValueOf, rCTCodelessLoggingEventListener, dynamicLoaderCreateFromParcel, Preconditions.INSTANCE.onNavigationEvent(parcel), createRewardedVideoAd.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    static {
        int i = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 113;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 101;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeString(this.key);
            parcel.writeString(this.type);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        parcel.writeString(this.key);
        parcel.writeString(this.type);
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.onBack, i);
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            int i5 = IAuthTabCallback + 103;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        this.paymentAccount.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.ctaTopDescription);
        parcel.writeString(this.ctaTitleBeforeCall);
        parcel.writeString(this.ctaTitleAfterCall);
    }

    public getProcessSpecificName(@NotNull String str, @NotNull String str2, @Nullable Boolean bool, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull createRewardedVideoAd createrewardedvideoad, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(createrewardedvideoad, "");
        this.key = str;
        this.type = str2;
        this.clearPreviousLayouts = bool;
        this.onBack = rCTCodelessLoggingEventListener;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.paymentAccount = createrewardedvideoad;
        this.title = str3;
        this.description = str4;
        this.ctaTopDescription = str5;
        this.ctaTitleBeforeCall = str6;
        this.ctaTitleAfterCall = str7;
    }

    public String asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.key;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String access100() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 39;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 85;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public Boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        Boolean bool = this.clearPreviousLayouts;
        int i4 = i3 + 69;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return bool;
        }
        obj.hashCode();
        throw null;
    }

    public RCTCodelessLoggingEventListener IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i3 + 59;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 45 / 0;
        }
        return rCTCodelessLoggingEventListener;
    }

    public DynamicLoader onTransact() {
        DynamicLoader dynamicLoader;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            dynamicLoader = this.navigationRightButton;
            int i4 = 86 / 0;
        } else {
            dynamicLoader = this.navigationRightButton;
        }
        int i5 = i3 + 121;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return dynamicLoader;
    }

    public Map<String, Object> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.logParam;
        int i5 = i3 + 15;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return map;
    }

    public final createRewardedVideoAd asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 57;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        createRewardedVideoAd createrewardedvideoad = this.paymentAccount;
        int i5 = i2 + 103;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return createrewardedvideoad;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 105;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallback() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            str = this.description;
            int i4 = 93 / 0;
        } else {
            str = this.description;
        }
        int i5 = i3 + 51;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.ctaTopDescription;
        int i5 = i3 + 101;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 37;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.ctaTitleBeforeCall;
        int i4 = i2 + 79;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ctaTitleAfterCall;
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        return str;
    }
}
