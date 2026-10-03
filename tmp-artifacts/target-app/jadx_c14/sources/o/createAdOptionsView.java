package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createAdOptionsView implements Parcelable {
    public static final Parcelable.Creator<createAdOptionsView> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final DynamicLoader cta;
    private final createAdSettingsApi resource;
    private final String title;

    public static final class IAuthTabCallback implements Parcelable.Creator<createAdOptionsView> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createAdOptionsView createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(parcel);
                obj.hashCode();
                throw null;
            }
            createAdOptionsView createadoptionsviewOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i3 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return createadoptionsviewOnExtraCallbackWithResult;
            }
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createAdOptionsView[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                onNavigationEvent(i);
                throw null;
            }
            createAdOptionsView[] createadoptionsviewArrOnNavigationEvent = onNavigationEvent(i);
            int i4 = IAuthTabCallback + 105;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return createadoptionsviewArrOnNavigationEvent;
        }

        public final createAdOptionsView onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            createAdOptionsView createadoptionsview = new createAdOptionsView(createAdSettingsApi.CREATOR.createFromParcel(parcel), parcel.readString(), DynamicLoader.CREATOR.createFromParcel(parcel));
            int i2 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return createadoptionsview;
            }
            throw null;
        }

        public final createAdOptionsView[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i3 % 128;
            createAdOptionsView[] createadoptionsviewArr = new createAdOptionsView[i];
            if (i3 % 2 == 0) {
                int i4 = 9 / 0;
            }
            return createadoptionsviewArr;
        }
    }

    static {
        int i = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        IAuthTabCallback = i2 % 128;
        return 1 ^ (i2 % 2 != 0 ? 0 : 1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 29;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 == 0) {
            this.resource.writeToParcel(parcel, i);
            parcel.writeString(this.title);
            this.cta.writeToParcel(parcel, i);
            int i5 = 34 / 0;
        } else {
            this.resource.writeToParcel(parcel, i);
            parcel.writeString(this.title);
            this.cta.writeToParcel(parcel, i);
        }
        int i6 = IAuthTabCallback + 123;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    public createAdOptionsView(@NotNull createAdSettingsApi createadsettingsapi, @NotNull String str, @NotNull DynamicLoader dynamicLoader) {
        Intrinsics.checkNotNullParameter(createadsettingsapi, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dynamicLoader, "");
        this.resource = createadsettingsapi;
        this.title = str;
        this.cta = dynamicLoader;
    }

    public final createAdSettingsApi onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 37;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        createAdSettingsApi createadsettingsapi = this.resource;
        int i5 = i2 + 109;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return createadsettingsapi;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 107;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.title;
        int i4 = i2 + 121;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final DynamicLoader IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DynamicLoader dynamicLoader = this.cta;
        int i4 = i3 + 113;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return dynamicLoader;
    }
}
