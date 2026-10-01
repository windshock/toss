package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RemoveImageTransformMetaDataProducerRemoveImageTransformMetaDataConsumer implements Parcelable {
    public static final Parcelable.Creator<RemoveImageTransformMetaDataProducerRemoveImageTransformMetaDataConsumer> CREATOR = new IAuthTabCallback();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    @SerializedName("categoryTitle")
    private final String categoryTitle;

    @SerializedName(verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_ID)
    private final long id;

    @SerializedName("leadToCheck")
    private final boolean leadToCheck;

    @SerializedName("optional")
    private final boolean optional;

    @SerializedName("ref")
    private final Long ref;

    @SerializedName("termsList")
    private final List<ResizeAndRotateProducerTransformingConsumer> termsList;

    public static final class IAuthTabCallback implements Parcelable.Creator<RemoveImageTransformMetaDataProducerRemoveImageTransformMetaDataConsumer> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RemoveImageTransformMetaDataProducerRemoveImageTransformMetaDataConsumer createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(parcel);
            }
            onExtraCallbackWithResult(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RemoveImageTransformMetaDataProducerRemoveImageTransformMetaDataConsumer[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            RemoveImageTransformMetaDataProducerRemoveImageTransformMetaDataConsumer[] removeImageTransformMetaDataProducerRemoveImageTransformMetaDataConsumerArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = IAuthTabCallback + 37;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 46 / 0;
            }
            return removeImageTransformMetaDataProducerRemoveImageTransformMetaDataConsumerArrOnWarmupCompleted;
        }

        public final RemoveImageTransformMetaDataProducerRemoveImageTransformMetaDataConsumer onExtraCallbackWithResult(Parcel parcel) {
            boolean z;
            boolean z2;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            long j = parcel.readLong();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                int i2 = IAuthTabCallback + 51;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                z = false;
            } else {
                z = true;
            }
            if (parcel.readInt() != 0) {
                int i4 = IAuthTabCallback + 3;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            int i6 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i6);
            for (int i7 = 0; i7 != i6; i7++) {
                arrayList.add(ResizeAndRotateProducerTransformingConsumer.CREATOR.createFromParcel(parcel));
            }
            return new RemoveImageTransformMetaDataProducerRemoveImageTransformMetaDataConsumer(j, lValueOf, string, z, z2, arrayList);
        }

        public final RemoveImageTransformMetaDataProducerRemoveImageTransformMetaDataConsumer[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i3 % 128;
            RemoveImageTransformMetaDataProducerRemoveImageTransformMetaDataConsumer[] removeImageTransformMetaDataProducerRemoveImageTransformMetaDataConsumerArr = new RemoveImageTransformMetaDataProducerRemoveImageTransformMetaDataConsumer[i];
            if (i3 % 2 == 0) {
                return removeImageTransformMetaDataProducerRemoveImageTransformMetaDataConsumerArr;
            }
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 37;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 91;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r9 instanceof o.RemoveImageTransformMetaDataProducerRemoveImageTransformMetaDataConsumer) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r9 = (o.RemoveImageTransformMetaDataProducerRemoveImageTransformMetaDataConsumer) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r8.id == r9.id) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.ref, r9.ref) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r9 = o.RemoveImageTransformMetaDataProducerRemoveImageTransformMetaDataConsumer.onWarmupCompleted + 67;
        r1 = r9 % 128;
        o.RemoveImageTransformMetaDataProducerRemoveImageTransformMetaDataConsumer.onExtraCallback = r1;
        r9 = r9 % 2;
        r1 = r1 + 45;
        o.RemoveImageTransformMetaDataProducerRemoveImageTransformMetaDataConsumer.onWarmupCompleted = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if ((r1 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.categoryTitle, r9.categoryTitle) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r8.optional == r9.optional) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r8.leadToCheck == r9.leadToCheck) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.termsList, r9.termsList) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
    
        r9 = o.RemoveImageTransformMetaDataProducerRemoveImageTransformMetaDataConsumer.onExtraCallback + 13;
        o.RemoveImageTransformMetaDataProducerRemoveImageTransformMetaDataConsumer.onWarmupCompleted = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
    
        if ((r9 % 2) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0078, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 59 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[PHI: r1 r3
      0x002f: PHI (r1v17 int) = (r1v4 int), (r1v18 int) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
      0x002f: PHI (r3v6 java.lang.Long) = (r3v1 java.lang.Long), (r3v7 java.lang.Long) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[PHI: r1
      0x0025: PHI (r1v5 int) = (r1v4 int), (r1v18 int) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        Long l;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = 0;
        long j = this.id;
        if (i3 == 0) {
            iHashCode = Long.hashCode(j);
            l = this.ref;
            int i4 = 95 / 0;
            if (l == null) {
                int i5 = onExtraCallback + 99;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            } else {
                iHashCode2 = l.hashCode();
            }
        } else {
            iHashCode = Long.hashCode(j);
            l = this.ref;
            if (l == null) {
            }
        }
        int iHashCode3 = (((((((((iHashCode * 31) + iHashCode2) * 31) + this.categoryTitle.hashCode()) * 31) + Boolean.hashCode(this.optional)) * 31) + Boolean.hashCode(this.leadToCheck)) * 31) + this.termsList.hashCode();
        int i7 = onExtraCallback + 67;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccTermGroup(id=" + this.id + ", ref=" + this.ref + ", categoryTitle=" + this.categoryTitle + ", optional=" + this.optional + ", leadToCheck=" + this.leadToCheck + ", termsList=" + this.termsList + ")";
        int i2 = onExtraCallback + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeLong(this.id);
        Long l = this.ref;
        if (l == null) {
            int i3 = onWarmupCompleted + 125;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.categoryTitle);
        parcel.writeInt(this.optional ? 1 : 0);
        parcel.writeInt(this.leadToCheck ? 1 : 0);
        List<ResizeAndRotateProducerTransformingConsumer> list = this.termsList;
        parcel.writeInt(list.size());
        Iterator<ResizeAndRotateProducerTransformingConsumer> it = list.iterator();
        int i5 = onExtraCallback + 121;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        while (!(!it.hasNext())) {
            it.next().writeToParcel(parcel, i);
        }
        int i7 = onWarmupCompleted + 81;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RemoveImageTransformMetaDataProducerRemoveImageTransformMetaDataConsumer(long j, @Nullable Long l, @NotNull String str, boolean z, boolean z2, @NotNull List<ResizeAndRotateProducerTransformingConsumer> list) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        this.id = j;
        this.ref = l;
        this.categoryTitle = str;
        this.optional = z;
        this.leadToCheck = z2;
        this.termsList = list;
    }
}
