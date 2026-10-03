package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class now extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<now> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Boolean clearPreviousLayouts;
    private final isDebuggerOn defaultFormValue;
    private final boolean editMode;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String type;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<now> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ now createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                onWarmupCompleted(parcel);
                obj.hashCode();
                throw null;
            }
            now nowVarOnWarmupCompleted = onWarmupCompleted(parcel);
            int i3 = onWarmupCompleted + 27;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return nowVarOnWarmupCompleted;
            }
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ now[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 101;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            now[] nowVarArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onNavigationEvent + 117;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return nowVarArrOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final now[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 31;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            now[] nowVarArr = new now[i];
            int i6 = i3 + 73;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return nowVarArr;
        }

        public final now onWarmupCompleted(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(now.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i2 = onNavigationEvent + 41;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            DynamicLoader dynamicLoaderCreateFromParcel = parcel.readInt() != 0 ? DynamicLoader.CREATOR.createFromParcel(parcel) : null;
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            isDebuggerOn isdebuggeronCreateFromParcel = isDebuggerOn.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i4 = onWarmupCompleted + 57;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            return new now(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoaderCreateFromParcel, mapOnNavigationEvent, isdebuggeronCreateFromParcel, z2);
        }
    }

    static {
        int i = onWarmupCompleted + 57;
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
        int i2 = onNavigationEvent + 97;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 77;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2;
        int i3 = 2 % 2;
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
            int i4 = onNavigationEvent + 93;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            int i6 = onNavigationEvent + 57;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            parcel.writeInt(0);
            i2 = IAuthTabCallback + 81;
            onNavigationEvent = i2 % 128;
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
            i2 = onNavigationEvent + 7;
            IAuthTabCallback = i2 % 128;
        }
        int i8 = i2 % 2;
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        this.defaultFormValue.writeToParcel(parcel, i);
        parcel.writeInt(this.editMode ? 1 : 0);
    }

    public now(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull isDebuggerOn isdebuggeron, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(isdebuggeron, "");
        this.type = str;
        this.key = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.defaultFormValue = isdebuggeron;
        this.editMode = z;
    }

    public String asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 119;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 69;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public RCTCodelessLoggingEventListener onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 35;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i2 + 35;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return rCTCodelessLoggingEventListener;
    }

    public Boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 41;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.clearPreviousLayouts;
        int i5 = i2 + 7;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public DynamicLoader IAuthTabCallbackStub() {
        DynamicLoader dynamicLoader;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 65;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            dynamicLoader = this.navigationRightButton;
            int i4 = 96 / 0;
        } else {
            dynamicLoader = this.navigationRightButton;
        }
        int i5 = i2 + 17;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return dynamicLoader;
        }
        throw null;
    }

    public Map<String, Object> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.logParam;
        int i5 = i3 + 121;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final isDebuggerOn onExtraCallbackWithResult() {
        isDebuggerOn isdebuggeron;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 63;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            isdebuggeron = this.defaultFormValue;
            int i4 = 99 / 0;
        } else {
            isdebuggeron = this.defaultFormValue;
        }
        int i5 = i2 + 57;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return isdebuggeron;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 21;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.editMode;
        int i5 = i2 + 123;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
