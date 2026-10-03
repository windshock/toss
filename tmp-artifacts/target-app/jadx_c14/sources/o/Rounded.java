package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class Rounded extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<Rounded> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final Boolean clearPreviousLayouts;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String type;

    public static final class onWarmupCompleted implements Parcelable.Creator<Rounded> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Rounded createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Rounded roundedOnWarmupCompleted = onWarmupCompleted(parcel);
            int i4 = onExtraCallback + 95;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 15 / 0;
            }
            return roundedOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Rounded[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 33;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Rounded[] roundedArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onExtraCallback + 3;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 73 / 0;
            }
            return roundedArrOnWarmupCompleted;
        }

        public final Rounded onWarmupCompleted(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            DynamicLoader dynamicLoaderCreateFromParcel = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 == 0) {
                parcel.readString();
                parcel.readString();
                parcel.readInt();
                dynamicLoaderCreateFromParcel.hashCode();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(Rounded.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i4 = onExtraCallback + 77;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() != 0) {
                int i6 = onExtraCallback + 69;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
            }
            return new Rounded(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoaderCreateFromParcel, Preconditions.INSTANCE.onNavigationEvent(parcel));
        }

        public final Rounded[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 107;
            IAuthTabCallback = i3 % 128;
            Rounded[] roundedArr = new Rounded[i];
            if (i3 % 2 == 0) {
                return roundedArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 117;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.type);
        parcel.writeParcelable(this.onBack, i);
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            int i3 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
            int i4 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            int i6 = onWarmupCompleted + 45;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
            int i8 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
    }

    public Rounded(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map) {
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
        int i2 = onWarmupCompleted;
        int i3 = i2 + 47;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 17;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 55;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RCTCodelessLoggingEventListener onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 105;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i2 + 43;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return rCTCodelessLoggingEventListener;
    }

    public Boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.clearPreviousLayouts;
        int i4 = i3 + 47;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    public DynamicLoader onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i4 = i3 + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return dynamicLoader;
        }
        throw null;
    }

    public Map<String, Object> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.logParam;
        int i5 = i3 + 85;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }
}
