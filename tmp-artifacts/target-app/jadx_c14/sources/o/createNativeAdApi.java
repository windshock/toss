package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createNativeAdApi implements Parcelable {
    public static final Parcelable.Creator<createNativeAdApi> CREATOR = new IAuthTabCallback();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final List<createNativeAdRatingApi> additionalFields;
    private final createAdSizeApi confirmAction;

    public static final class IAuthTabCallback implements Parcelable.Creator<createNativeAdApi> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final createNativeAdApi IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            createAdSizeApi createadsizeapi = (createAdSizeApi) parcel.readParcelable(createNativeAdApi.class.getClassLoader());
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = onNavigationEvent + 117;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(parcel.readParcelable(createNativeAdApi.class.getClassLoader()));
                i3++;
                int i6 = IAuthTabCallback + 93;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
            return new createNativeAdApi(createadsizeapi, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeAdApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            createNativeAdApi createnativeadapiIAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = onNavigationEvent + 39;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return createnativeadapiIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeAdApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 95;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            createNativeAdApi[] createnativeadapiArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = IAuthTabCallback + 67;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return createnativeadapiArrOnExtraCallbackWithResult;
        }

        public final createNativeAdApi[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 83;
            onNavigationEvent = i3 % 128;
            createNativeAdApi[] createnativeadapiArr = new createNativeAdApi[i];
            if (i3 % 2 == 0) {
                return createnativeadapiArr;
            }
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 21;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public createNativeAdApi() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 19;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 33;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 89;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof createNativeAdApi)) {
            return false;
        }
        createNativeAdApi createnativeadapi = (createNativeAdApi) obj;
        if (!Intrinsics.areEqual(this.confirmAction, createnativeadapi.confirmAction)) {
            int i7 = onWarmupCompleted + 39;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.additionalFields, createnativeadapi.additionalFields)) {
            return true;
        }
        int i9 = onWarmupCompleted + 123;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        createAdSizeApi createadsizeapi = this.confirmAction;
        if (createadsizeapi == null) {
            int i2 = onExtraCallback + 29;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 55;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = createadsizeapi.hashCode();
        }
        return (iHashCode * 31) + this.additionalFields.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CheckboxOption(confirmAction=" + this.confirmAction + ", additionalFields=" + this.additionalFields + ")";
        int i2 = onWarmupCompleted + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 119;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 == 0) {
            parcel.writeParcelable(this.confirmAction, i);
            List<createNativeAdRatingApi> list = this.additionalFields;
            parcel.writeInt(list.size());
            list.iterator();
            throw null;
        }
        parcel.writeParcelable(this.confirmAction, i);
        List<createNativeAdRatingApi> list2 = this.additionalFields;
        parcel.writeInt(list2.size());
        Iterator<createNativeAdRatingApi> it = list2.iterator();
        while (it.hasNext()) {
            int i5 = onExtraCallback + 65;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                parcel.writeParcelable(it.next(), i);
                int i6 = 55 / 0;
            } else {
                parcel.writeParcelable(it.next(), i);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public createNativeAdApi(@Nullable createAdSizeApi createadsizeapi, @NotNull List<? extends createNativeAdRatingApi> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.confirmAction = createadsizeapi;
        this.additionalFields = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ createNativeAdApi(createAdSizeApi createadsizeapi, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 63;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 23 / 0;
            }
            createadsizeapi = null;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallback + 41;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            list = CollectionsKt.emptyList();
            int i6 = onWarmupCompleted + 59;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        }
        this(createadsizeapi, list);
    }

    public final createAdSizeApi onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 111;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        createAdSizeApi createadsizeapi = this.confirmAction;
        int i5 = i2 + 77;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return createadsizeapi;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<createNativeAdRatingApi> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        List<createNativeAdRatingApi> list = this.additionalFields;
        int i5 = i3 + 99;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
