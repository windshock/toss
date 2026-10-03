package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createNativeAdViewAttributesApi implements Parcelable {
    public static final Parcelable.Creator<createNativeAdViewAttributesApi> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final List<createNativeAdRatingApi> additionalFields;
    private final createAdSizeApi confirmAction;
    private final String title;
    private final String value;

    public static final class onWarmupCompleted implements Parcelable.Creator<createNativeAdViewAttributesApi> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final createNativeAdViewAttributesApi IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            createAdSizeApi createadsizeapi = (createAdSizeApi) parcel.readParcelable(createNativeAdViewAttributesApi.class.getClassLoader());
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = IAuthTabCallback + 87;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 != i2) {
                arrayList.add(parcel.readParcelable(createNativeAdViewAttributesApi.class.getClassLoader()));
                i5++;
                int i6 = IAuthTabCallback + 71;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
            return new createNativeAdViewAttributesApi(string, string2, createadsizeapi, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeAdViewAttributesApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                IAuthTabCallback(parcel);
                throw null;
            }
            createNativeAdViewAttributesApi createnativeadviewattributesapiIAuthTabCallback = IAuthTabCallback(parcel);
            int i3 = IAuthTabCallback + 105;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 54 / 0;
            }
            return createnativeadviewattributesapiIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeAdViewAttributesApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 1;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            createNativeAdViewAttributesApi[] createnativeadviewattributesapiArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onNavigationEvent + 115;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return createnativeadviewattributesapiArrOnExtraCallbackWithResult;
        }

        public final createNativeAdViewAttributesApi[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 79;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            createNativeAdViewAttributesApi[] createnativeadviewattributesapiArr = new createNativeAdViewAttributesApi[i];
            int i6 = i3 + 57;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return createnativeadviewattributesapiArr;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 91;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 72 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 25;
        IAuthTabCallback = i3 % 128;
        int i4 = (i3 % 2 == 0 ? 0 : 1) ^ 1;
        int i5 = i2 + 79;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 77;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof createNativeAdViewAttributesApi)) {
            return false;
        }
        createNativeAdViewAttributesApi createnativeadviewattributesapi = (createNativeAdViewAttributesApi) obj;
        if (!Intrinsics.areEqual(this.title, createnativeadviewattributesapi.title)) {
            int i3 = IAuthTabCallback + 117;
            onExtraCallback = i3 % 128;
            return i3 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.value, createnativeadviewattributesapi.value) || !Intrinsics.areEqual(this.confirmAction, createnativeadviewattributesapi.confirmAction)) {
            return false;
        }
        if (Intrinsics.areEqual(this.additionalFields, createnativeadviewattributesapi.additionalFields)) {
            return true;
        }
        int i4 = onExtraCallback + 47;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.title.hashCode();
        return i3 == 0 ? (((((iHashCode >>> 26) % this.value.hashCode()) >>> 99) * this.confirmAction.hashCode()) / 62) / this.additionalFields.hashCode() : (((((iHashCode * 31) + this.value.hashCode()) * 31) + this.confirmAction.hashCode()) * 31) + this.additionalFields.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TabPane(title=" + this.title + ", value=" + this.value + ", confirmAction=" + this.confirmAction + ", additionalFields=" + this.additionalFields + ")";
        int i2 = IAuthTabCallback + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
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
        int i3 = IAuthTabCallback + 21;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = IAuthTabCallback + 115;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            parcel.writeParcelable(it.next(), i);
        }
        int i7 = IAuthTabCallback + 85;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public createNativeAdViewAttributesApi(@NotNull String str, @NotNull String str2, @NotNull createAdSizeApi createadsizeapi, @NotNull List<? extends createNativeAdRatingApi> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(createadsizeapi, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.title = str;
        this.value = str2;
        this.confirmAction = createadsizeapi;
        this.additionalFields = list;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 67;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.value;
        int i4 = i3 + 101;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final createAdSizeApi onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.confirmAction;
        }
        throw null;
    }

    public final List<createNativeAdRatingApi> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.additionalFields;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
