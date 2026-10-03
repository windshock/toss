package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExternalSyntheticLambda2 implements Parcelable {
    public static final Parcelable.Creator<ImagePipelineExternalSyntheticLambda2> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("loanProductIds")
    private final List<String> loanProductIds;

    @SerializedName("optionalReferences")
    private final List<then> optionalReferences;

    public static final class onWarmupCompleted implements Parcelable.Creator<ImagePipelineExternalSyntheticLambda2> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ImagePipelineExternalSyntheticLambda2 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ImagePipelineExternalSyntheticLambda2 imagePipelineExternalSyntheticLambda2OnExtraCallback = onExtraCallback(parcel);
            if (i3 == 0) {
                int i4 = 97 / 0;
            }
            return imagePipelineExternalSyntheticLambda2OnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ImagePipelineExternalSyntheticLambda2[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return onExtraCallbackWithResult(i);
            }
            onExtraCallbackWithResult(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ImagePipelineExternalSyntheticLambda2 onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 != i2) {
                arrayList.add(then.CREATOR.createFromParcel(parcel));
                i5++;
                int i6 = onWarmupCompleted + 119;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 3 % 5;
                }
            }
            return new ImagePipelineExternalSyntheticLambda2(arrayListCreateStringArrayList, arrayList);
        }

        public final ImagePipelineExternalSyntheticLambda2[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 75;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            ImagePipelineExternalSyntheticLambda2[] imagePipelineExternalSyntheticLambda2Arr = new ImagePipelineExternalSyntheticLambda2[i];
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 109;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return imagePipelineExternalSyntheticLambda2Arr;
        }
    }

    static {
        int i = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 63 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ImagePipelineExternalSyntheticLambda2() {
        List list = null;
        this(list, list, 3, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 33;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 9;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ImagePipelineExternalSyntheticLambda2)) {
            int i4 = onWarmupCompleted + 9;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        ImagePipelineExternalSyntheticLambda2 imagePipelineExternalSyntheticLambda2 = (ImagePipelineExternalSyntheticLambda2) obj;
        if (!Intrinsics.areEqual(this.loanProductIds, imagePipelineExternalSyntheticLambda2.loanProductIds)) {
            int i6 = onNavigationEvent + 9;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.optionalReferences, imagePipelineExternalSyntheticLambda2.optionalReferences)) {
            return false;
        }
        int i8 = onNavigationEvent + 101;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.loanProductIds.hashCode() * 31) + this.optionalReferences.hashCode();
        int i4 = onNavigationEvent + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonAdditionalInfo(loanProductIds=" + this.loanProductIds + ", optionalReferences=" + this.optionalReferences + ")";
        int i2 = onNavigationEvent + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 11;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.loanProductIds);
        List<then> list = this.optionalReferences;
        parcel.writeInt(list.size());
        Iterator<then> it = list.iterator();
        int i5 = onWarmupCompleted + 13;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public ImagePipelineExternalSyntheticLambda2(@NotNull List<String> list, @NotNull List<then> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.loanProductIds = list;
        this.optionalReferences = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImagePipelineExternalSyntheticLambda2(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 107;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                list = CollectionsKt.emptyList();
                int i3 = 2 % 2;
            } else {
                CollectionsKt.emptyList();
                throw null;
            }
        }
        if ((i & 2) != 0) {
            int i4 = onWarmupCompleted + 5;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            list2 = CollectionsKt.emptyList();
            int i6 = 2 % 2;
        }
        this(list, list2);
    }

    public final List<then> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        List<then> list = this.optionalReferences;
        int i5 = i3 + 39;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }
}
