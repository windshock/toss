package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class onNewResultImpl extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<onNewResultImpl> CREATOR = new onNavigationEvent();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final Boolean clearPreviousLayouts;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String type;

    public static final class onNavigationEvent implements Parcelable.Creator<onNewResultImpl> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final onNewResultImpl[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 85;
            onWarmupCompleted = i4 % 128;
            onNewResultImpl[] onnewresultimplArr = new onNewResultImpl[i];
            if (i4 % 2 == 0) {
                int i5 = 91 / 0;
            }
            int i6 = i3 + 11;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return onnewresultimplArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ onNewResultImpl createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNewResultImpl onnewresultimplOnNavigationEvent = onNavigationEvent(parcel);
            int i4 = onExtraCallback + 15;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return onnewresultimplOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ onNewResultImpl[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 3;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onNewResultImpl[] onnewresultimplArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onWarmupCompleted + 11;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return onnewresultimplArrIAuthTabCallback;
            }
            throw null;
        }

        public final onNewResultImpl onNavigationEvent(Parcel parcel) {
            Boolean boolValueOf;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(onNewResultImpl.class.getClassLoader());
            DynamicLoader dynamicLoaderCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                int i4 = onExtraCallback;
                int i5 = i4 + 107;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    dynamicLoaderCreateFromParcel.hashCode();
                    throw null;
                }
                int i6 = i4 + 59;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int i8 = onWarmupCompleted + 91;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
            }
            return new onNewResultImpl(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoaderCreateFromParcel, Preconditions.INSTANCE.onNavigationEvent(parcel));
        }
    }

    static {
        int i = onExtraCallback + 117;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 17;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.type);
        parcel.writeParcelable(this.onBack, i);
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            int i5 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i5 % 128;
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
            int i6 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
    }

    public onNewResultImpl(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map) {
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
        int i2 = onExtraCallbackWithResult + 97;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 77;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 27;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 83;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public RCTCodelessLoggingEventListener onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i3 + 7;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
        return rCTCodelessLoggingEventListener;
    }

    public Boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Boolean bool = this.clearPreviousLayouts;
        int i4 = i3 + 115;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    public DynamicLoader IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i5 = i3 + 25;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return dynamicLoader;
    }

    public Map<String, Object> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.logParam;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
