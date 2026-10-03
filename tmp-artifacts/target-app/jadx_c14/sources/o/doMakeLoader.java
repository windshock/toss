package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class doMakeLoader implements Parcelable {
    public static final Parcelable.Creator<doMakeLoader> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final onExtraCallback style;
    private final String text;

    public static final class IAuthTabCallback implements Parcelable.Creator<doMakeLoader> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final doMakeLoader[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 37;
            onExtraCallback = i4 % 128;
            doMakeLoader[] domakeloaderArr = new doMakeLoader[i];
            if (i4 % 2 != 0) {
                int i5 = 27 / 0;
            }
            int i6 = i3 + 47;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return domakeloaderArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ doMakeLoader createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallback(parcel);
            }
            onExtraCallback(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ doMakeLoader[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 39;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                IAuthTabCallback(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            doMakeLoader[] domakeloaderArrIAuthTabCallback = IAuthTabCallback(i);
            int i4 = onExtraCallbackWithResult + 35;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return domakeloaderArrIAuthTabCallback;
        }

        public final doMakeLoader onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            doMakeLoader domakeloader = new doMakeLoader(parcel.readString(), onExtraCallback.valueOf(parcel.readString()));
            int i2 = onExtraCallbackWithResult + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return domakeloader;
        }
    }

    static {
        int i = onWarmupCompleted + 57;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 45;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 53;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 77;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doMakeLoader)) {
            int i4 = i2 + 17;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        doMakeLoader domakeloader = (doMakeLoader) obj;
        if (!Intrinsics.areEqual(this.text, domakeloader.text)) {
            return false;
        }
        if (this.style == domakeloader.style) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.text.hashCode();
        return i3 != 0 ? (iHashCode >>> 45) >> this.style.hashCode() : (iHashCode * 31) + this.style.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FaqContentTitleModel(text=" + this.text + ", style=" + this.style + ")";
        int i2 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 25;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.text);
        parcel.writeString(this.style.name());
        int i5 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public doMakeLoader(@NotNull String str, @NotNull onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.text = str;
        this.style = onextracallback;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.text;
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        return str;
    }

    public final onExtraCallback onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 55;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback onextracallback = this.style;
        int i5 = i2 + 81;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return onextracallback;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        public static final onExtraCallback REGULAR = new onExtraCallback("REGULAR", 0);
        public static final onExtraCallback BOLD = new onExtraCallback("BOLD", 1);

        private static final /* synthetic */ onExtraCallback[] $values() {
            onExtraCallback[] onextracallbackArr;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 != 0) {
                onExtraCallback onextracallback = REGULAR;
                onExtraCallback onextracallback2 = BOLD;
                onextracallbackArr = new onExtraCallback[5];
                onextracallbackArr[1] = onextracallback;
                onextracallbackArr[1] = onextracallback2;
            } else {
                onextracallbackArr = new onExtraCallback[]{REGULAR, BOLD};
            }
            int i4 = i3 + 33;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 37;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i5 = i2 + 111;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            if (i3 == 0) {
                return onextracallback;
            }
            throw null;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = $VALUES;
            if (i3 != 0) {
                return (onExtraCallback[]) onextracallbackArr.clone();
            }
            int i4 = 86 / 0;
            return (onExtraCallback[]) onextracallbackArr.clone();
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onExtraCallback + 29;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }
    }
}
