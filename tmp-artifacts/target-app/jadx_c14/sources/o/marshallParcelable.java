package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class marshallParcelable extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<marshallParcelable> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final createAdSizeApi action;
    private final Boolean clearPreviousLayouts;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String type;

    public static final class onWarmupCompleted implements Parcelable.Creator<marshallParcelable> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ marshallParcelable createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            marshallParcelable marshallparcelableOnWarmupCompleted = onWarmupCompleted(parcel);
            if (i3 != 0) {
                int i4 = 76 / 0;
            }
            int i5 = IAuthTabCallback + 111;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return marshallparcelableOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ marshallParcelable[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 107;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            marshallParcelable[] marshallparcelableArrOnExtraCallback = onExtraCallback(i);
            int i5 = IAuthTabCallback + 33;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return marshallparcelableArrOnExtraCallback;
        }

        public final marshallParcelable[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 45;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            marshallParcelable[] marshallparcelableArr = new marshallParcelable[i];
            int i6 = i4 + 63;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return marshallparcelableArr;
        }

        public final marshallParcelable onWarmupCompleted(Parcel parcel) {
            Boolean bool;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(marshallParcelable.class.getClassLoader());
            DynamicLoader dynamicLoaderCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                int i2 = IAuthTabCallback + 57;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    dynamicLoaderCreateFromParcel.hashCode();
                    throw null;
                }
                bool = null;
            } else {
                Boolean boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                int i3 = onNavigationEvent + 3;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                bool = boolValueOf;
            }
            if (parcel.readInt() != 0) {
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
                int i5 = IAuthTabCallback + 37;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
            return new marshallParcelable(string, string2, rCTCodelessLoggingEventListener, bool, dynamicLoaderCreateFromParcel, Preconditions.INSTANCE.onNavigationEvent(parcel), (createAdSizeApi) parcel.readParcelable(marshallParcelable.class.getClassLoader()));
        }
    }

    static {
        int i = onWarmupCompleted + 85;
        onNavigationEvent = i % 128;
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
        int i2 = IAuthTabCallback + 117;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2 != 0 ? 1 : 0;
        int i5 = i3 + 83;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 45;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeString(this.type);
            parcel.writeString(this.key);
            parcel.writeParcelable(this.onBack, i);
            throw null;
        }
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
            int i5 = onExtraCallback + 53;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
            int i6 = IAuthTabCallback + 13;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeParcelable(this.action, i);
    }

    public marshallParcelable(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull createAdSizeApi createadsizeapi) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(createadsizeapi, "");
        this.type = str;
        this.key = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.action = createadsizeapi;
    }

    public String IAuthTabCallbackDefault() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 121;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.type;
            int i4 = 80 / 0;
        } else {
            str = this.type;
        }
        int i5 = i2 + 51;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.key;
        int i4 = i3 + 65;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public RCTCodelessLoggingEventListener IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i3 + 19;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return rCTCodelessLoggingEventListener;
    }

    public Boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.clearPreviousLayouts;
        int i4 = i3 + 111;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return bool;
        }
        obj.hashCode();
        throw null;
    }

    public DynamicLoader onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i5 = i3 + 71;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return dynamicLoader;
    }

    public Map<String, Object> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 103;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<String, Object> map = this.logParam;
        int i4 = i2 + 31;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    public final createAdSizeApi onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 59;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        createAdSizeApi createadsizeapi = this.action;
        int i5 = i2 + 9;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return createadsizeapi;
    }
}
