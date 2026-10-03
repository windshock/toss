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
public final class BufferedDiskCacheExternalSyntheticLambda3 implements Parcelable {
    public static final Parcelable.Creator<BufferedDiskCacheExternalSyntheticLambda3> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String lowerText;
    private final List<String> upperTexts;

    public static final class onNavigationEvent implements Parcelable.Creator<BufferedDiskCacheExternalSyntheticLambda3> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BufferedDiskCacheExternalSyntheticLambda3 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            BufferedDiskCacheExternalSyntheticLambda3 bufferedDiskCacheExternalSyntheticLambda3OnWarmupCompleted = onWarmupCompleted(parcel);
            int i4 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return bufferedDiskCacheExternalSyntheticLambda3OnWarmupCompleted;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BufferedDiskCacheExternalSyntheticLambda3[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 59;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            BufferedDiskCacheExternalSyntheticLambda3[] bufferedDiskCacheExternalSyntheticLambda3ArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return bufferedDiskCacheExternalSyntheticLambda3ArrOnWarmupCompleted;
        }

        public final BufferedDiskCacheExternalSyntheticLambda3 onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            BufferedDiskCacheExternalSyntheticLambda3 bufferedDiskCacheExternalSyntheticLambda3 = new BufferedDiskCacheExternalSyntheticLambda3(parcel.createStringArrayList(), parcel.readString());
            int i2 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return bufferedDiskCacheExternalSyntheticLambda3;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final BufferedDiskCacheExternalSyntheticLambda3[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 71;
            onExtraCallbackWithResult = i3 % 128;
            BufferedDiskCacheExternalSyntheticLambda3[] bufferedDiskCacheExternalSyntheticLambda3Arr = new BufferedDiskCacheExternalSyntheticLambda3[i];
            if (i3 % 2 != 0) {
                int i4 = 51 / 0;
            }
            return bufferedDiskCacheExternalSyntheticLambda3Arr;
        }
    }

    static {
        int i = IAuthTabCallback + 57;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 84 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BufferedDiskCacheExternalSyntheticLambda3() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BufferedDiskCacheExternalSyntheticLambda3)) {
            return false;
        }
        BufferedDiskCacheExternalSyntheticLambda3 bufferedDiskCacheExternalSyntheticLambda3 = (BufferedDiskCacheExternalSyntheticLambda3) obj;
        if (!Intrinsics.areEqual(this.upperTexts, bufferedDiskCacheExternalSyntheticLambda3.upperTexts)) {
            int i2 = onWarmupCompleted + 99;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.lowerText, bufferedDiskCacheExternalSyntheticLambda3.lowerText)) {
            return true;
        }
        int i4 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.upperTexts.hashCode();
        String str = this.lowerText;
        if (str == null) {
            int i4 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i6 = (iHashCode2 * 31) + iHashCode;
        int i7 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AutomobileBannerInfo(upperTexts=" + this.upperTexts + ", lowerText=" + this.lowerText + ")";
        int i2 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 79 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.upperTexts);
        parcel.writeString(this.lowerText);
        int i5 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public BufferedDiskCacheExternalSyntheticLambda3(@NotNull List<String> list, @Nullable String str) {
        Intrinsics.checkNotNullParameter(list, "");
        this.upperTexts = list;
        this.lowerText = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BufferedDiskCacheExternalSyntheticLambda3(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            list = CollectionsKt.emptyList();
            int i4 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i7 = onWarmupCompleted + 63;
            int i8 = i7 % 128;
            onExtraCallbackWithResult = i8;
            if (i7 % 2 != 0) {
                throw null;
            }
            int i9 = i8 + 105;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            str = null;
        }
        this(list, str);
    }

    public final List<String> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 15;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.upperTexts;
        int i5 = i2 + 105;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.lowerText;
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return str;
    }

    public final List<String> onWarmupCompleted() {
        int i = 2 % 2;
        List<String> list = this.upperTexts;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i2 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i2 % 128;
            arrayList.add(PixelCopyCompatPixelCopyStubExternalSyntheticLambda0.IAuthTabCallback((String) (i2 % 2 != 0 ? it.next() : it.next()), 0).toString());
        }
        int i3 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 30 / 0;
        }
        return arrayList;
    }
}
