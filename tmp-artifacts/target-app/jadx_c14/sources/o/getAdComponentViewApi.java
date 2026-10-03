package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getAdComponentViewApi implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<getAdComponentViewApi> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("banks")
    private final List<AdComponentViewParentApi> banks;

    @SerializedName("reserved")
    private final boolean reserved;

    public static final class onExtraCallback implements Parcelable.Creator<getAdComponentViewApi> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getAdComponentViewApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getAdComponentViewApi getadcomponentviewapiOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 82 / 0;
            }
            return getadcomponentviewapiOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getAdComponentViewApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            getAdComponentViewApi[] getadcomponentviewapiArrOnExtraCallback = onExtraCallback(i);
            int i5 = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return getadcomponentviewapiArrOnExtraCallback;
        }

        public final getAdComponentViewApi[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 95;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            getAdComponentViewApi[] getadcomponentviewapiArr = new getAdComponentViewApi[i];
            int i6 = i3 + 9;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return getadcomponentviewapiArr;
            }
            throw null;
        }

        public final getAdComponentViewApi onExtraCallbackWithResult(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = false;
            if (parcel.readInt() == 0) {
                int i4 = onExtraCallbackWithResult + 39;
                int i5 = i4 % 128;
                IAuthTabCallback = i5;
                if (i4 % 2 != 0) {
                    int i6 = 86 / 0;
                }
                int i7 = i5 + 101;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                arrayList = null;
            } else {
                int i9 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    arrayList2.add(parcel.readParcelable(getAdComponentViewApi.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            if (parcel.readInt() != 0) {
                int i11 = IAuthTabCallback + 65;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                z = true;
            }
            return new getAdComponentViewApi(arrayList, z);
        }
    }

    static {
        int i = onWarmupCompleted + 41;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getAdComponentViewApi() {
        List list = null;
        this(list, false, 3, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 29;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 25;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if ((r7 instanceof o.getAdComponentViewApi) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r1 = r1 + 111;
        o.getAdComponentViewApi.onNavigationEvent = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r7 = (o.getAdComponentViewApi) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r6.banks, r7.banks)) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        r7 = o.getAdComponentViewApi.onExtraCallback + 95;
        o.getAdComponentViewApi.onNavigationEvent = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r6.reserved == r7.reserved) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        r7 = o.getAdComponentViewApi.onExtraCallback + 77;
        o.getAdComponentViewApi.onNavigationEvent = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r3 = r3 + 63;
        o.getAdComponentViewApi.onExtraCallback = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r3 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getAdComponentViewApi.onExtraCallback
            int r2 = r1 + 31
            int r3 = r2 % 128
            o.getAdComponentViewApi.onNavigationEvent = r3
            int r2 = r2 % r0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L16
            r2 = 73
            int r2 = r2 / r5
            if (r6 != r7) goto L23
            goto L18
        L16:
            if (r6 != r7) goto L23
        L18:
            int r3 = r3 + 63
            int r7 = r3 % 128
            o.getAdComponentViewApi.onExtraCallback = r7
            int r3 = r3 % r0
            if (r3 != 0) goto L22
            return r5
        L22:
            return r4
        L23:
            boolean r2 = r7 instanceof o.getAdComponentViewApi
            if (r2 != 0) goto L2f
            int r1 = r1 + 111
            int r7 = r1 % 128
            o.getAdComponentViewApi.onNavigationEvent = r7
            int r1 = r1 % r0
            return r5
        L2f:
            o.getAdComponentViewApi r7 = (o.getAdComponentViewApi) r7
            java.util.List<o.AdComponentViewParentApi> r1 = r6.banks
            java.util.List<o.AdComponentViewParentApi> r2 = r7.banks
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            r1 = r1 ^ r4
            if (r1 == 0) goto L46
            int r7 = o.getAdComponentViewApi.onExtraCallback
            int r7 = r7 + 95
            int r1 = r7 % 128
            o.getAdComponentViewApi.onNavigationEvent = r1
            int r7 = r7 % r0
            return r5
        L46:
            boolean r1 = r6.reserved
            boolean r7 = r7.reserved
            if (r1 == r7) goto L56
            int r7 = o.getAdComponentViewApi.onExtraCallback
            int r7 = r7 + 77
            int r1 = r7 % 128
            o.getAdComponentViewApi.onNavigationEvent = r1
            int r7 = r7 % r0
            return r5
        L56:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getAdComponentViewApi.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[PHI: r2
      0x0023: PHI (r2v4 java.util.List<o.AdComponentViewParentApi>) = (r2v2 java.util.List<o.AdComponentViewParentApi>), (r2v5 java.util.List<o.AdComponentViewParentApi>) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getAdComponentViewApi.onNavigationEvent
            int r2 = r1 + 13
            int r3 = r2 % 128
            o.getAdComponentViewApi.onExtraCallback = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L17
            java.util.List<o.AdComponentViewParentApi> r2 = r5.banks
            r4 = 52
            int r4 = r4 / r3
            if (r2 != 0) goto L23
            goto L1b
        L17:
            java.util.List<o.AdComponentViewParentApi> r2 = r5.banks
            if (r2 != 0) goto L23
        L1b:
            int r1 = r1 + 79
            int r2 = r1 % 128
            o.getAdComponentViewApi.onExtraCallback = r2
            int r1 = r1 % r0
            goto L27
        L23:
            int r3 = r2.hashCode()
        L27:
            int r3 = r3 * 31
            boolean r0 = r5.reserved
            int r0 = java.lang.Boolean.hashCode(r0)
            int r3 = r3 + r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getAdComponentViewApi.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountNotificationSubscriptionsResp(banks=" + this.banks + ", reserved=" + this.reserved + ")";
        int i2 = onExtraCallback + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        List<AdComponentViewParentApi> list = this.banks;
        if (list == null) {
            int i3 = onNavigationEvent + 35;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AdComponentViewParentApi> it = list.iterator();
            while (it.hasNext()) {
                int i4 = onNavigationEvent + 89;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                parcel.writeParcelable(it.next(), i);
            }
        }
        parcel.writeInt(this.reserved ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getAdComponentViewApi(@Nullable List<? extends AdComponentViewParentApi> list, boolean z) {
        this.banks = list;
        this.reserved = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getAdComponentViewApi(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 13;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = 2 % 2;
            list = null;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallback + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            z = false;
        }
        this(list, z);
    }

    public final List<AdComponentViewParentApi> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        List<AdComponentViewParentApi> list = this.banks;
        int i5 = i2 + 31;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.reserved;
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        return z;
    }
}
