package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ResourceReleaser extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<ResourceReleaser> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final Boolean clearPreviousLayouts;
    private final String englishFirstName;
    private final String englishLastName;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String type;

    public static final class onWarmupCompleted implements Parcelable.Creator<ResourceReleaser> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ResourceReleaser createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ResourceReleaser resourceReleaserOnNavigationEvent = onNavigationEvent(parcel);
            int i4 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return resourceReleaserOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ResourceReleaser[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                onExtraCallbackWithResult(i);
                throw null;
            }
            ResourceReleaser[] resourceReleaserArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i4 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return resourceReleaserArrOnExtraCallbackWithResult;
        }

        public final ResourceReleaser[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 61;
            onExtraCallbackWithResult = i4 % 128;
            ResourceReleaser[] resourceReleaserArr = new ResourceReleaser[i];
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = i3 + 35;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 61 / 0;
            }
            return resourceReleaserArr;
        }

        public final ResourceReleaser onNavigationEvent(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(ResourceReleaser.class.getClassLoader());
            DynamicLoader dynamicLoaderCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i2 = IAuthTabCallback + 51;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() != 0) {
                int i4 = IAuthTabCallback + 39;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
                int i6 = IAuthTabCallback + 117;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            }
            return new ResourceReleaser(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoaderCreateFromParcel, Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.readString(), parcel.readString());
        }
    }

    static {
        int i = onExtraCallback + 111;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 64 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 99;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 0;
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
            int i3 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            int i5 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
            int i6 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeString(this.englishFirstName);
        parcel.writeString(this.englishLastName);
    }

    public ResourceReleaser(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.key = str;
        this.type = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.englishFirstName = str3;
        this.englishLastName = str4;
    }

    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.key;
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return str;
    }

    public String asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 35;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RCTCodelessLoggingEventListener onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 9;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i2 + 93;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return rCTCodelessLoggingEventListener;
    }

    public Boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.clearPreviousLayouts;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public DynamicLoader IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return dynamicLoader;
    }

    public Map<String, Object> onExtraCallbackWithResult() {
        Map<String, Object> map;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 5;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            map = this.logParam;
            int i4 = 37 / 0;
        } else {
            map = this.logParam;
        }
        int i5 = i2 + 105;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.englishFirstName;
        int i5 = i3 + 111;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.englishLastName;
        int i4 = i3 + 11;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return str;
    }
}
