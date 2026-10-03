package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.cardsales.funnel.RetryPolicy;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class Core extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<Core> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final Boolean clearPreviousLayouts;
    private final String key;
    private final String loadingSubtitle;
    private final List<String> loadingTitles;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final RetryPolicy retryPolicy;
    private final String type;

    public static final class IAuthTabCallback implements Parcelable.Creator<Core> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Core createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                onWarmupCompleted(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Core coreOnWarmupCompleted = onWarmupCompleted(parcel);
            int i3 = onWarmupCompleted + 7;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return coreOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Core[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 7;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                onNavigationEvent(i);
                throw null;
            }
            Core[] coreArrOnNavigationEvent = onNavigationEvent(i);
            int i4 = onWarmupCompleted + 101;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return coreArrOnNavigationEvent;
        }

        public final Core[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 95;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            Core[] coreArr = new Core[i];
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = i4 + 67;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return coreArr;
        }

        public final Core onWarmupCompleted(Parcel parcel) {
            Boolean boolValueOf;
            DynamicLoader dynamicLoaderCreateFromParcel;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(Core.class.getClassLoader());
            RetryPolicy retryPolicyCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                int i2 = onWarmupCompleted + 105;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                dynamicLoaderCreateFromParcel = null;
            } else {
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
                int i3 = onWarmupCompleted + 27;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
            }
            DynamicLoader dynamicLoader = dynamicLoaderCreateFromParcel;
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i5 = onWarmupCompleted;
                int i6 = i5 + 47;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i5 + 91;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            } else {
                retryPolicyCreateFromParcel = RetryPolicy.CREATOR.createFromParcel(parcel);
            }
            return new Core(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoader, mapOnNavigationEvent, arrayListCreateStringArrayList, string3, retryPolicyCreateFromParcel);
        }
    }

    static {
        int i = onWarmupCompleted + 113;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 96 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 13;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 65;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 39;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.type);
        parcel.writeParcelable(this.onBack, i);
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            int i5 = onExtraCallback + 5;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
            int i6 = onExtraCallback + 21;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeStringList(this.loadingTitles);
        parcel.writeString(this.loadingSubtitle);
        RetryPolicy retryPolicy = this.retryPolicy;
        if (retryPolicy == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            retryPolicy.writeToParcel(parcel, i);
        }
    }

    public Core(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull List<String> list, @Nullable String str3, @Nullable RetryPolicy retryPolicy) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.key = str;
        this.type = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.loadingTitles = list;
        this.loadingSubtitle = str3;
        this.retryPolicy = retryPolicy;
    }

    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.key;
        }
        throw null;
    }

    public String asInterface() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 53;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.type;
            int i4 = 92 / 0;
        } else {
            str = this.type;
        }
        int i5 = i2 + 27;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public RCTCodelessLoggingEventListener IAuthTabCallbackDefault() {
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            rCTCodelessLoggingEventListener = this.onBack;
            int i4 = 68 / 0;
        } else {
            rCTCodelessLoggingEventListener = this.onBack;
        }
        int i5 = i3 + 99;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return rCTCodelessLoggingEventListener;
    }

    public Boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Boolean bool = this.clearPreviousLayouts;
        int i5 = i3 + 67;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public DynamicLoader asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i5 = i3 + 65;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return dynamicLoader;
    }

    public Map<String, Object> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 85;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.logParam;
        int i5 = i2 + 41;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final List<String> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        List<String> list = this.loadingTitles;
        int i5 = i3 + 121;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 117;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.loadingSubtitle;
        int i5 = i2 + 21;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final RetryPolicy IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        RetryPolicy retryPolicy = this.retryPolicy;
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return retryPolicy;
    }
}
