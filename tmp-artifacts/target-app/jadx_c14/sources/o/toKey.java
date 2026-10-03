package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class toKey extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<toKey> CREATOR = new IAuthTabCallback();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final createAdOptionsView banner;
    private final Boolean clearPreviousLayouts;
    private final DynamicLoader failureReasonButton;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String subtitle;
    private final String title;
    private final String type;

    public static final class IAuthTabCallback implements Parcelable.Creator<toKey> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ toKey createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            toKey tokeyOnNavigationEvent = onNavigationEvent(parcel);
            int i4 = IAuthTabCallback + 59;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 6 / 0;
            }
            return tokeyOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ toKey[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 115;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                onExtraCallbackWithResult(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            toKey[] tokeyArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i4 = onWarmupCompleted + 123;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return tokeyArrOnExtraCallbackWithResult;
        }

        public final toKey[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 71;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            toKey[] tokeyArr = new toKey[i];
            if (i3 % 2 == 0) {
                int i5 = 4 / 0;
            }
            int i6 = i4 + 67;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return tokeyArr;
        }

        public final toKey onNavigationEvent(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                parcel.readString();
                parcel.readString();
                parcel.readInt();
                dynamicLoader.hashCode();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(toKey.class.getClassLoader());
            if (parcel.readInt() == 0) {
                int i4 = IAuthTabCallback + 59;
                int i5 = i4 % 128;
                onWarmupCompleted = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 79;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 4 / 2;
                }
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    int i9 = onWarmupCompleted + 47;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new toKey(string, string2, rCTCodelessLoggingEventListener, boolValueOf, parcel.readInt() == 0 ? null : DynamicLoader.CREATOR.createFromParcel(parcel), Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? DynamicLoader.CREATOR.createFromParcel(parcel) : null, createAdOptionsView.CREATOR.createFromParcel(parcel));
        }
    }

    static {
        int i = onNavigationEvent + 43;
        onExtraCallback = i % 128;
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
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 71;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 49;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
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
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
            int i3 = onWarmupCompleted + 95;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        DynamicLoader dynamicLoader2 = this.failureReasonButton;
        if (dynamicLoader2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicLoader2.writeToParcel(parcel, i);
        }
        this.banner.writeToParcel(parcel, i);
        int i5 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public toKey(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @Nullable String str4, @Nullable DynamicLoader dynamicLoader2, @NotNull createAdOptionsView createadoptionsview) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(createadoptionsview, "");
        this.type = str;
        this.key = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.title = str3;
        this.subtitle = str4;
        this.failureReasonButton = dynamicLoader2;
        this.banner = createadoptionsview;
    }

    public String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 37;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            str = this.key;
            int i4 = 94 / 0;
        } else {
            str = this.key;
        }
        int i5 = i3 + 63;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public RCTCodelessLoggingEventListener IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 71;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i2 + 99;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return rCTCodelessLoggingEventListener;
    }

    public Boolean onNavigationEvent() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            bool = this.clearPreviousLayouts;
            int i4 = 55 / 0;
        } else {
            bool = this.clearPreviousLayouts;
        }
        int i5 = i3 + 7;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public DynamicLoader asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 11;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i5 = i2 + 15;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return dynamicLoader;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Map<String, Object> onExtraCallbackWithResult() {
        Map<String, Object> map;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 25;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            map = this.logParam;
            int i4 = 17 / 0;
        } else {
            map = this.logParam;
        }
        int i5 = i2 + 89;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.title;
        int i4 = i3 + 45;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.subtitle;
        }
        throw null;
    }

    public final DynamicLoader onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        DynamicLoader dynamicLoader = this.failureReasonButton;
        int i5 = i3 + 51;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return dynamicLoader;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final createAdOptionsView onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        createAdOptionsView createadoptionsview = this.banner;
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        return createadoptionsview;
    }
}
