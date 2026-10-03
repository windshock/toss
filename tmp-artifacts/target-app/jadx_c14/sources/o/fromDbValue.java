package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class fromDbValue extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<fromDbValue> CREATOR = new IAuthTabCallback();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Boolean clearPreviousLayouts;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String rrn;
    private final createNativeComponentTagApi terms;
    private final String type;

    public static final class IAuthTabCallback implements Parcelable.Creator<fromDbValue> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ fromDbValue createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            fromDbValue fromdbvalueOnWarmupCompleted = onWarmupCompleted(parcel);
            int i4 = onNavigationEvent + 71;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return fromdbvalueOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ fromDbValue[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 23;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return onExtraCallbackWithResult(i);
            }
            onExtraCallbackWithResult(i);
            throw null;
        }

        public final fromDbValue[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 89;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            fromDbValue[] fromdbvalueArr = new fromDbValue[i];
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 59;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return fromdbvalueArr;
        }

        public final fromDbValue onWarmupCompleted(Parcel parcel) {
            Boolean boolValueOf;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(fromDbValue.class.getClassLoader());
            DynamicLoader dynamicLoaderCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int i4 = IAuthTabCallback + 29;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
            }
            return new fromDbValue(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoaderCreateFromParcel, Preconditions.INSTANCE.onNavigationEvent(parcel), createNativeComponentTagApi.CREATOR.createFromParcel(parcel), parcel.readString());
        }
    }

    static {
        int i = onExtraCallback + 125;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 73;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 91;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.key);
        parcel.writeParcelable(this.onBack, i);
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            int i5 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            parcel.writeInt(0);
            i2 = onWarmupCompleted + 19;
            i3 = i2 % 128;
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
            i2 = onWarmupCompleted + 109;
            i3 = i2 % 128;
        }
        onExtraCallbackWithResult = i3;
        int i7 = i2 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        this.terms.writeToParcel(parcel, i);
        parcel.writeString(this.rrn);
    }

    public fromDbValue(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull createNativeComponentTagApi createnativecomponenttagapi, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(createnativecomponenttagapi, "");
        this.type = str;
        this.key = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.terms = createnativecomponenttagapi;
        this.rrn = str3;
    }

    public String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.type;
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        return str;
    }

    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.key;
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        return str;
    }

    public RCTCodelessLoggingEventListener IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 45;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i2 + 103;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return rCTCodelessLoggingEventListener;
    }

    public Boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.clearPreviousLayouts;
        int i4 = i3 + 119;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    public DynamicLoader onNavigationEvent() {
        DynamicLoader dynamicLoader;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            dynamicLoader = this.navigationRightButton;
            int i4 = 36 / 0;
        } else {
            dynamicLoader = this.navigationRightButton;
        }
        int i5 = i3 + 35;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return dynamicLoader;
    }

    public Map<String, Object> onWarmupCompleted() {
        Map<String, Object> map;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            map = this.logParam;
            int i4 = 83 / 0;
        } else {
            map = this.logParam;
        }
        int i5 = i3 + 103;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final createNativeComponentTagApi IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        createNativeComponentTagApi createnativecomponenttagapi = this.terms;
        int i5 = i3 + 115;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return createnativecomponenttagapi;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asBinder() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            str = this.rrn;
            int i4 = 4 / 0;
        } else {
            str = this.rrn;
        }
        int i5 = i3 + 97;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
