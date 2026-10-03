package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class checkIsTrue extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<checkIsTrue> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final Map<String, createAdSizeApi> actionMap;
    private final Boolean allowPullToRefresh;
    private final Boolean clearPreviousLayouts;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String type;
    private final String url;

    public static final class onNavigationEvent implements Parcelable.Creator<checkIsTrue> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ checkIsTrue createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onNavigationEvent(parcel);
            }
            onNavigationEvent(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ checkIsTrue[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 99;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return onExtraCallback(i);
            }
            onExtraCallback(i);
            throw null;
        }

        public final checkIsTrue[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i3 % 128;
            checkIsTrue[] checkistrueArr = new checkIsTrue[i];
            if (i3 % 2 != 0) {
                return checkistrueArr;
            }
            throw null;
        }

        public final checkIsTrue onNavigationEvent(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            DynamicLoader dynamicLoaderCreateFromParcel;
            LinkedHashMap linkedHashMap;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(checkIsTrue.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i2 = onExtraCallbackWithResult + 49;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                int i4 = IAuthTabCallback + 3;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                dynamicLoaderCreateFromParcel = null;
            } else {
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
            }
            DynamicLoader dynamicLoader = dynamicLoaderCreateFromParcel;
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                int i6 = onExtraCallbackWithResult + 19;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                linkedHashMap = null;
            } else {
                int i8 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(checkIsTrue.class.getClassLoader()));
                }
                int i10 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
            }
            checkIsTrue checkistrue = new checkIsTrue(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoader, mapOnNavigationEvent, string3, boolValueOf2, linkedHashMap);
            int i12 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 != 0) {
                return checkistrue;
            }
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 26 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 55;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.type);
            parcel.writeString(this.key);
            parcel.writeParcelable(this.onBack, i);
            throw null;
        }
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.key);
        parcel.writeParcelable(this.onBack, i);
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            int i4 = onExtraCallback + 1;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
            int i5 = onNavigationEvent + 101;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
            int i7 = onNavigationEvent + 69;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeString(this.url);
        Boolean bool2 = this.allowPullToRefresh;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Map<String, createAdSizeApi> map = this.actionMap;
        if (map == null) {
            int i9 = onNavigationEvent + 37;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                parcel.writeInt(1);
                return;
            } else {
                parcel.writeInt(0);
                return;
            }
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        int i10 = onExtraCallback + 113;
        onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
        for (Map.Entry<String, createAdSizeApi> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeParcelable(entry.getValue(), i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public checkIsTrue(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @Nullable Boolean bool2, @Nullable Map<String, ? extends createAdSizeApi> map2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.type = str;
        this.key = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.url = str3;
        this.allowPullToRefresh = bool2;
        this.actionMap = map2;
    }

    public String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 91;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
        return str;
    }

    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 71;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 73;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public RCTCodelessLoggingEventListener IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onBack;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.clearPreviousLayouts;
        int i4 = i3 + 113;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        obj.hashCode();
        throw null;
    }

    public DynamicLoader asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i5 = i2 + 115;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return dynamicLoader;
    }

    public Map<String, Object> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 111;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.logParam;
        int i5 = i2 + 47;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.url;
        }
        throw null;
    }

    public final Boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.allowPullToRefresh;
        }
        int i3 = 2 / 0;
        return this.allowPullToRefresh;
    }

    public final Map<String, createAdSizeApi> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<String, createAdSizeApi> map = this.actionMap;
        int i4 = i3 + 31;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }
}
