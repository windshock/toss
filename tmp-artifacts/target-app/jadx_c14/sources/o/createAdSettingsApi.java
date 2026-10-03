package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createAdSettingsApi implements Parcelable {
    public static final Parcelable.Creator<createAdSettingsApi> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final int height;
    private final String url;
    private final int width;

    public static final class IAuthTabCallback implements Parcelable.Creator<createAdSettingsApi> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createAdSettingsApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onNavigationEvent(parcel);
                throw null;
            }
            createAdSettingsApi createadsettingsapiOnNavigationEvent = onNavigationEvent(parcel);
            int i3 = IAuthTabCallback + 111;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return createadsettingsapiOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createAdSettingsApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 65;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            createAdSettingsApi[] createadsettingsapiArrOnNavigationEvent = onNavigationEvent(i);
            int i5 = onExtraCallback + 123;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return createadsettingsapiArrOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final createAdSettingsApi onNavigationEvent(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            createAdSettingsApi createadsettingsapi = new createAdSettingsApi(parcel.readString(), parcel.readInt(), parcel.readInt());
            int i2 = IAuthTabCallback + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return createadsettingsapi;
        }

        public final createAdSettingsApi[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            createAdSettingsApi[] createadsettingsapiArr = new createAdSettingsApi[i];
            int i6 = i3 + 25;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return createadsettingsapiArr;
        }
    }

    static {
        int i = onNavigationEvent + 123;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 53;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 115;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeString(this.url);
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        parcel.writeString(this.url);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        int i5 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public createAdSettingsApi(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
        this.width = i;
        this.height = i2;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.url;
        int i5 = i2 + 75;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 95 / 0;
        }
        return str;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 25;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.width;
        int i6 = i2 + 75;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.height;
        if (i3 != 0) {
            int i5 = 56 / 0;
        }
        return i4;
    }
}
