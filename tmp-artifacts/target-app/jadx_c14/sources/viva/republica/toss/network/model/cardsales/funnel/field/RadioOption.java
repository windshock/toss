package viva.republica.toss.network.model.cardsales.funnel.field;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.createAdSizeApi;
import o.createNativeAdRatingApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RadioOption implements Parcelable {
    public static final Parcelable.Creator<RadioOption> CREATOR = new Creator();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<createNativeAdRatingApi> additionalFields;
    private final createAdSizeApi confirmAction;
    private final String title;
    private final String value;

    public static final class Creator implements Parcelable.Creator<RadioOption> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final RadioOption IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            createAdSizeApi createadsizeapi = (createAdSizeApi) parcel.readParcelable(RadioOption.class.getClassLoader());
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                arrayList.add(parcel.readParcelable(RadioOption.class.getClassLoader()));
                i3++;
                int i4 = IAuthTabCallback + 99;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
            RadioOption radioOption = new RadioOption(string, string2, createadsizeapi, arrayList);
            int i6 = onNavigationEvent + 79;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return radioOption;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RadioOption createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                IAuthTabCallback(parcel);
                throw null;
            }
            RadioOption radioOptionIAuthTabCallback = IAuthTabCallback(parcel);
            int i3 = onNavigationEvent + 125;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return radioOptionIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RadioOption[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 9;
            onNavigationEvent = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                onWarmupCompleted(i);
                throw null;
            }
            RadioOption[] radioOptionArrOnWarmupCompleted = onWarmupCompleted(i);
            int i4 = IAuthTabCallback + 33;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return radioOptionArrOnWarmupCompleted;
            }
            obj.hashCode();
            throw null;
        }

        public final RadioOption[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 103;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            Object obj = null;
            RadioOption[] radioOptionArr = new RadioOption[i];
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 89;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return radioOptionArr;
            }
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 31;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 113;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 1;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof RadioOption)) {
            return false;
        }
        RadioOption radioOption = (RadioOption) obj;
        if (!Intrinsics.areEqual(this.title, radioOption.title) || !Intrinsics.areEqual(this.value, radioOption.value)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.confirmAction, radioOption.confirmAction)) {
            int i4 = onExtraCallbackWithResult + 79;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.additionalFields, radioOption.additionalFields)) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.title.hashCode();
        int iHashCode2 = this.value.hashCode();
        createAdSizeApi createadsizeapi = this.confirmAction;
        if (createadsizeapi == null) {
            int i3 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i3 % 128;
            i = i3 % 2 != 0 ? 1 : 0;
        } else {
            int iHashCode3 = createadsizeapi.hashCode();
            int i4 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            i = iHashCode3;
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + i) * 31) + this.additionalFields.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RadioOption(title=" + this.title + ", value=" + this.value + ", confirmAction=" + this.confirmAction + ", additionalFields=" + this.additionalFields + ")";
        int i2 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i2 % 128;
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
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.value);
        parcel.writeParcelable(this.confirmAction, i);
        List<createNativeAdRatingApi> list = this.additionalFields;
        parcel.writeInt(list.size());
        Iterator<createNativeAdRatingApi> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
            int i3 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RadioOption(@NotNull String str, @NotNull String str2, @Nullable createAdSizeApi createadsizeapi, @NotNull List<? extends createNativeAdRatingApi> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.title = str;
        this.value = str2;
        this.confirmAction = createadsizeapi;
        this.additionalFields = list;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.title;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 111;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final createAdSizeApi onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.confirmAction;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<createNativeAdRatingApi> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.additionalFields;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
