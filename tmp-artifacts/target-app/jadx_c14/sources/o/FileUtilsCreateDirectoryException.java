package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class FileUtilsCreateDirectoryException extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<FileUtilsCreateDirectoryException> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final FbValidationUtils backgroundJob;
    private final Boolean clearPreviousLayouts;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final List<String> texts;
    private final String type;

    public static final class onWarmupCompleted implements Parcelable.Creator<FileUtilsCreateDirectoryException> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ FileUtilsCreateDirectoryException createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            FileUtilsCreateDirectoryException fileUtilsCreateDirectoryExceptionOnNavigationEvent = onNavigationEvent(parcel);
            int i4 = IAuthTabCallback + 67;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return fileUtilsCreateDirectoryExceptionOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ FileUtilsCreateDirectoryException[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 25;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            FileUtilsCreateDirectoryException[] fileUtilsCreateDirectoryExceptionArrOnExtraCallback = onExtraCallback(i);
            if (i4 != 0) {
                int i5 = 75 / 0;
            }
            return fileUtilsCreateDirectoryExceptionArrOnExtraCallback;
        }

        public final FileUtilsCreateDirectoryException[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 23;
            onExtraCallback = i3 % 128;
            FileUtilsCreateDirectoryException[] fileUtilsCreateDirectoryExceptionArr = new FileUtilsCreateDirectoryException[i];
            if (i3 % 2 == 0) {
                int i4 = 89 / 0;
            }
            return fileUtilsCreateDirectoryExceptionArr;
        }

        public final FileUtilsCreateDirectoryException onNavigationEvent(Parcel parcel) {
            Boolean boolValueOf;
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            DynamicLoader dynamicLoaderCreateFromParcel = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                parcel.readString();
                parcel.readString();
                parcel.readInt();
                dynamicLoaderCreateFromParcel.hashCode();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(FileUtilsCreateDirectoryException.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int i4 = onExtraCallback + 39;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                Parcelable.Creator<DynamicLoader> creator = DynamicLoader.CREATOR;
                if (i5 != 0) {
                    creator.createFromParcel(parcel);
                    throw null;
                }
                dynamicLoaderCreateFromParcel = creator.createFromParcel(parcel);
            }
            return new FileUtilsCreateDirectoryException(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoaderCreateFromParcel, Preconditions.INSTANCE.onNavigationEvent(parcel), (FbValidationUtils) parcel.readParcelable(FileUtilsCreateDirectoryException.class.getClassLoader()), parcel.createStringArrayList());
        }
    }

    static {
        int i = IAuthTabCallback + 69;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
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
            int i3 = onExtraCallback + 95;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
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
            parcel.writeInt(0);
            int i4 = onExtraCallbackWithResult + 55;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 4;
            }
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeParcelable(this.backgroundJob, i);
        parcel.writeStringList(this.texts);
        int i6 = onExtraCallbackWithResult + 3;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public FileUtilsCreateDirectoryException(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull FbValidationUtils fbValidationUtils, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(fbValidationUtils, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.type = str;
        this.key = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.backgroundJob = fbValidationUtils;
        this.texts = list;
    }

    public String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.type;
        }
        throw null;
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.key;
        int i4 = i3 + 117;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public RCTCodelessLoggingEventListener IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i3 + 29;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return rCTCodelessLoggingEventListener;
    }

    public Boolean onNavigationEvent() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            bool = this.clearPreviousLayouts;
            int i4 = 20 / 0;
        } else {
            bool = this.clearPreviousLayouts;
        }
        int i5 = i3 + 61;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public DynamicLoader onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i5 = i2 + 109;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 24 / 0;
        }
        return dynamicLoader;
    }

    public Map<String, Object> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 9;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.logParam;
        int i5 = i2 + 1;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final FbValidationUtils onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 97;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        FbValidationUtils fbValidationUtils = this.backgroundJob;
        int i5 = i2 + 73;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return fbValidationUtils;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<String> asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 95;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.texts;
        int i5 = i2 + 27;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 33 / 0;
        }
        return list;
    }
}
