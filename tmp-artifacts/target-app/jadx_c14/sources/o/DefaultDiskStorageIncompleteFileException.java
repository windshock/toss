package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DefaultDiskStorageIncompleteFileException extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<DefaultDiskStorageIncompleteFileException> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final Boolean clearPreviousLayouts;
    private final DynamicLoader cta;
    private final setCTATextColor image;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String subTitle;
    private final String title;
    private final String type;

    public static final class onWarmupCompleted implements Parcelable.Creator<DefaultDiskStorageIncompleteFileException> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DefaultDiskStorageIncompleteFileException createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            DefaultDiskStorageIncompleteFileException defaultDiskStorageIncompleteFileExceptionOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            if (i3 == 0) {
                int i4 = 22 / 0;
            }
            return defaultDiskStorageIncompleteFileExceptionOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DefaultDiskStorageIncompleteFileException[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 41;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            DefaultDiskStorageIncompleteFileException[] defaultDiskStorageIncompleteFileExceptionArrOnExtraCallback = onExtraCallback(i);
            int i5 = onExtraCallback + 25;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return defaultDiskStorageIncompleteFileExceptionArrOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final DefaultDiskStorageIncompleteFileException[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 103;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            DefaultDiskStorageIncompleteFileException[] defaultDiskStorageIncompleteFileExceptionArr = new DefaultDiskStorageIncompleteFileException[i];
            int i6 = i4 + 55;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return defaultDiskStorageIncompleteFileExceptionArr;
            }
            throw null;
        }

        public final DefaultDiskStorageIncompleteFileException onExtraCallbackWithResult(Parcel parcel) {
            Boolean boolValueOf;
            DynamicLoader dynamicLoaderCreateFromParcel;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(DefaultDiskStorageIncompleteFileException.class.getClassLoader());
            if (parcel.readInt() == 0) {
                int i2 = onExtraCallback + 107;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    setctatextcolor.hashCode();
                    throw null;
                }
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                int i3 = onExtraCallback + 55;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 92 / 0;
                }
                dynamicLoaderCreateFromParcel = null;
            } else {
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
                int i5 = IAuthTabCallback + 35;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            return new DefaultDiskStorageIncompleteFileException(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoaderCreateFromParcel, Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.readString(), parcel.readString(), DynamicLoader.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? setCTATextColor.CREATOR.createFromParcel(parcel) : null);
        }
    }

    static {
        int i = onNavigationEvent + 81;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
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
            int i3 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            int i5 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
            int i6 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        this.cta.writeToParcel(parcel, i);
        setCTATextColor setctatextcolor = this.image;
        if (setctatextcolor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            setctatextcolor.writeToParcel(parcel, i);
        }
    }

    public DefaultDiskStorageIncompleteFileException(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @NotNull String str4, @NotNull DynamicLoader dynamicLoader2, @Nullable setCTATextColor setctatextcolor) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(dynamicLoader2, "");
        this.type = str;
        this.key = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.title = str3;
        this.subTitle = str4;
        this.cta = dynamicLoader2;
        this.image = setctatextcolor;
    }

    public String onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.type;
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return str;
    }

    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 7;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 115;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RCTCodelessLoggingEventListener asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i3 + 45;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return rCTCodelessLoggingEventListener;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = this.clearPreviousLayouts;
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
        return bool;
    }

    public DynamicLoader IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 55;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i4 = i2 + 105;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return dynamicLoader;
        }
        throw null;
    }

    public Map<String, Object> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.logParam;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 83;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.title;
        int i4 = i2 + 57;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return str;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.subTitle;
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return str;
    }

    public final DynamicLoader IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        DynamicLoader dynamicLoader = this.cta;
        int i5 = i3 + 11;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return dynamicLoader;
    }

    public final setCTATextColor onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 53;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        setCTATextColor setctatextcolor = this.image;
        int i5 = i2 + 79;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return setctatextcolor;
    }
}
