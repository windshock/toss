package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.Synchronized;
import im.toss.features.edoc.register.AptPasswordActivity$;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeRedBoxSpec implements Parcelable, NativeKeyboardObserverSpec {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private String date;
    private int dateInt;
    private long expense;
    private long income;
    private boolean isOverspending;
    private int month;
    private String title;
    private List<formatToParts> transactions;
    private int year;
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<NativeRedBoxSpec> CREATOR = new IAuthTabCallback();
    private static final Calendar calendar = Calendar.getInstance();

    public static final class IAuthTabCallback implements Parcelable.Creator<NativeRedBoxSpec> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[PHI: r2
          0x002f: PHI (r2v7 java.lang.String) = (r2v4 java.lang.String), (r2v8 java.lang.String) binds: [B:8:0x0029, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[PHI: r2
          0x002b: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v8 java.lang.String) binds: [B:8:0x0029, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final o.NativeRedBoxSpec IAuthTabCallback(android.os.Parcel r17) {
            /*
                r16 = this;
                r0 = r17
                r1 = 2
                int r2 = r1 % r1
                int r2 = o.NativeRedBoxSpec.IAuthTabCallback.onExtraCallback
                int r2 = r2 + 89
                int r3 = r2 % 128
                o.NativeRedBoxSpec.IAuthTabCallback.onNavigationEvent = r3
                int r2 = r2 % r1
                r3 = 0
                java.lang.String r4 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
                if (r2 == 0) goto L21
                java.lang.String r2 = r17.readString()
                int r4 = r17.readInt()
                if (r4 == 0) goto L2f
                goto L2b
            L21:
                java.lang.String r2 = r17.readString()
                int r4 = r17.readInt()
                if (r4 == 0) goto L2f
            L2b:
                r4 = 1
                r5 = r2
                r6 = r4
                goto L31
            L2f:
                r5 = r2
                r6 = r3
            L31:
                long r7 = r17.readLong()
                long r9 = r17.readLong()
                int r2 = r17.readInt()
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>(r2)
                int r4 = o.NativeRedBoxSpec.IAuthTabCallback.onExtraCallback
                int r4 = r4 + 31
                int r12 = r4 % 128
                o.NativeRedBoxSpec.IAuthTabCallback.onNavigationEvent = r12
                int r4 = r4 % r1
            L4b:
                if (r3 == r2) goto L62
                int r4 = o.NativeRedBoxSpec.IAuthTabCallback.onNavigationEvent
                int r4 = r4 + 93
                int r12 = r4 % 128
                o.NativeRedBoxSpec.IAuthTabCallback.onExtraCallback = r12
                int r4 = r4 % r1
                android.os.Parcelable$Creator<o.formatToParts> r4 = o.formatToParts.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r0)
                r11.add(r4)
                int r3 = r3 + 1
                goto L4b
            L62:
                o.NativeRedBoxSpec r1 = new o.NativeRedBoxSpec
                int r12 = r17.readInt()
                int r13 = r17.readInt()
                int r14 = r17.readInt()
                java.lang.String r15 = r17.readString()
                r4 = r1
                r4.<init>(r5, r6, r7, r9, r11, r12, r13, r14, r15)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.NativeRedBoxSpec.IAuthTabCallback.IAuthTabCallback(android.os.Parcel):o.NativeRedBoxSpec");
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeRedBoxSpec createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            NativeRedBoxSpec nativeRedBoxSpecIAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = onNavigationEvent + 7;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return nativeRedBoxSpecIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeRedBoxSpec[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 83;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                onExtraCallbackWithResult(i);
                throw null;
            }
            NativeRedBoxSpec[] nativeRedBoxSpecArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i4 = onNavigationEvent + 89;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return nativeRedBoxSpecArrOnExtraCallbackWithResult;
        }

        public final NativeRedBoxSpec[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 77;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            NativeRedBoxSpec[] nativeRedBoxSpecArr = new NativeRedBoxSpec[i];
            int i6 = i4 + 79;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return nativeRedBoxSpecArr;
        }
    }

    public NativeRedBoxSpec() {
        this(null, false, 0L, 0L, null, 0, 0, 0, null, 511, null);
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = (~(i7 | i8 | i4)) | (~(i6 | i5 | i4));
        int i10 = ~i4;
        int i11 = (~(i8 | i6)) | (~(i8 | i10));
        int i12 = (~(i4 | i5)) | (~(i7 | i10));
        int i13 = i6 + i5 + i2 + ((-564018846) * i3) + (483938512 * i);
        int i14 = i13 * i13;
        int i15 = (1473915126 * i6) + 752877568 + ((-1516524009) * i5) + (996813045 * i9) + (1993626090 * i11) + ((-996813045) * i12) + (477102080 * i2) + (1390411776 * i3) + (452984832 * i) + ((-1135738880) * i14);
        int i16 = ((i6 * 1456092922) - 824780772) + (i5 * 1456095553) + (i9 * (-877)) + (i11 * (-1754)) + (i12 * 877) + (i2 * 1456093799) + (i3 * 578355822) + (i * 1098359728) + (i14 * 1868693504);
        if (i15 + (i16 * i16 * 2110914560) != 1) {
            return onExtraCallback(objArr);
        }
        NativeRedBoxSpec nativeRedBoxSpec = (NativeRedBoxSpec) objArr[0];
        int i17 = 2 % 2;
        int i18 = onExtraCallbackWithResult;
        int i19 = i18 + 3;
        onExtraCallback = i19 % 128;
        int i20 = i19 % 2;
        long j = nativeRedBoxSpec.expense;
        int i21 = i18 + 107;
        onExtraCallback = i21 % 128;
        int i22 = i21 % 2;
        return Long.valueOf(j);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String str = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        long jLongValue = ((Number) objArr[3]).longValue();
        long jLongValue2 = ((Number) objArr[4]).longValue();
        List list = (List) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        int iIntValue3 = ((Number) objArr[8]).intValue();
        String str2 = (String) objArr[9];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        NativeRedBoxSpec nativeRedBoxSpec = new NativeRedBoxSpec(str, zBooleanValue, jLongValue, jLongValue2, list, iIntValue, iIntValue2, iIntValue3, str2);
        int i2 = onExtraCallbackWithResult + 105;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return nativeRedBoxSpec;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ NativeRedBoxSpec onWarmupCompleted(NativeRedBoxSpec nativeRedBoxSpec, String str, boolean z, long j, long j2, List list, int i, int i2, int i3, String str2, int i4, Object obj) {
        boolean z2;
        long j3;
        String str3;
        int i5 = 2 % 2;
        int i6 = onExtraCallback;
        int i7 = i6 + 43;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        String str4 = (i4 & 1) != 0 ? nativeRedBoxSpec.date : str;
        if ((i4 & 2) != 0) {
            int i9 = i6 + 1;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            z2 = nativeRedBoxSpec.isOverspending;
        } else {
            z2 = z;
        }
        long j4 = (i4 & 4) != 0 ? nativeRedBoxSpec.income : j;
        if ((i4 & 8) != 0) {
            int i11 = i6 + 17;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            j3 = nativeRedBoxSpec.expense;
        } else {
            j3 = j2;
        }
        List list2 = (i4 & 16) != 0 ? nativeRedBoxSpec.transactions : list;
        int i13 = (i4 & 32) != 0 ? nativeRedBoxSpec.year : i;
        int i14 = (i4 & 64) != 0 ? nativeRedBoxSpec.month : i2;
        int i15 = (i4 & 128) != 0 ? nativeRedBoxSpec.dateInt : i3;
        if ((i4 & 256) != 0) {
            int i16 = i6 + 79;
            onExtraCallbackWithResult = i16 % 128;
            if (i16 % 2 != 0) {
                String str5 = nativeRedBoxSpec.title;
                throw null;
            }
            str3 = nativeRedBoxSpec.title;
        } else {
            str3 = str2;
        }
        return (NativeRedBoxSpec) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{nativeRedBoxSpec, str4, Boolean.valueOf(z2), Long.valueOf(j4), Long.valueOf(j3), list2, Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), str3}, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 388697768, -388697768);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 55;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 31;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 115;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof NativeRedBoxSpec)) {
            int i6 = onExtraCallbackWithResult + 75;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        NativeRedBoxSpec nativeRedBoxSpec = (NativeRedBoxSpec) obj;
        if (!Intrinsics.areEqual(this.date, nativeRedBoxSpec.date)) {
            int i8 = onExtraCallback + 103;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.isOverspending != nativeRedBoxSpec.isOverspending) {
            return false;
        }
        if (this.income != nativeRedBoxSpec.income) {
            int i10 = onExtraCallback + 67;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.expense != nativeRedBoxSpec.expense) {
            return false;
        }
        if (!Intrinsics.areEqual(this.transactions, nativeRedBoxSpec.transactions)) {
            int i12 = onExtraCallback + 97;
            onExtraCallbackWithResult = i12 % 128;
            return i12 % 2 != 0;
        }
        if (this.year != nativeRedBoxSpec.year) {
            return false;
        }
        if (this.month != nativeRedBoxSpec.month) {
            int i13 = onExtraCallbackWithResult + 13;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (this.dateInt != nativeRedBoxSpec.dateInt) {
            return false;
        }
        if (Intrinsics.areEqual(this.title, nativeRedBoxSpec.title)) {
            return true;
        }
        int i15 = onExtraCallbackWithResult + 15;
        onExtraCallback = i15 % 128;
        return i15 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((this.date.hashCode() * 31) + Boolean.hashCode(this.isOverspending)) * 31) + Long.hashCode(this.income)) * 31) + Long.hashCode(this.expense)) * 31) + this.transactions.hashCode()) * 31) + Integer.hashCode(this.year)) * 31) + Integer.hashCode(this.month)) * 31) + Integer.hashCode(this.dateInt)) * 31) + this.title.hashCode();
        int i4 = onExtraCallback + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DailyTransaction(date=" + this.date + ", isOverspending=" + this.isOverspending + ", income=" + this.income + ", expense=" + this.expense + ", transactions=" + this.transactions + ", year=" + this.year + ", month=" + this.month + ", dateInt=" + this.dateInt + ", title=" + this.title + ")";
        int i2 = onExtraCallbackWithResult + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 11;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.date);
        parcel.writeInt(this.isOverspending ? 1 : 0);
        parcel.writeLong(this.income);
        parcel.writeLong(this.expense);
        List<formatToParts> list = this.transactions;
        parcel.writeInt(list.size());
        Iterator<formatToParts> it = list.iterator();
        while (it.hasNext()) {
            int i5 = onExtraCallback + 69;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.year);
        parcel.writeInt(this.month);
        parcel.writeInt(this.dateInt);
        parcel.writeString(this.title);
        int i7 = onExtraCallback + 9;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
    }

    public NativeRedBoxSpec(@NotNull String str, boolean z, long j, long j2, @NotNull List<formatToParts> list, int i, int i2, int i3, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.date = str;
        this.isOverspending = z;
        this.income = j;
        this.expense = j2;
        this.transactions = list;
        this.year = i;
        this.month = i2;
        this.dateInt = i3;
        this.title = str2;
    }

    @Override // o.NativeKeyboardObserverSpec
    public /* bridge */ long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            super.IAuthTabCallback();
            throw null;
        }
        long jIAuthTabCallback = super.IAuthTabCallback();
        int i3 = onExtraCallbackWithResult + 123;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return jIAuthTabCallback;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeRedBoxSpec(String str, boolean z, long j, long j2, List list, int i, int i2, int i3, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        long j3;
        List listEmptyList;
        int i5;
        int i6;
        String str3 = "";
        String str4 = (i4 & 1) != 0 ? "" : str;
        boolean z2 = (i4 & 2) != 0 ? false : z;
        if ((i4 & 4) != 0) {
            int i7 = onExtraCallbackWithResult + 75;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            j3 = 0;
        } else {
            j3 = j;
        }
        long j4 = (i4 & 8) == 0 ? j2 : 0L;
        if ((i4 & 16) != 0) {
            int i9 = onExtraCallback + 45;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            listEmptyList = CollectionsKt.emptyList();
            int i11 = 2 % 2;
        } else {
            listEmptyList = list;
        }
        if ((i4 & 32) != 0) {
            int i12 = onExtraCallback + 83;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            i5 = 0;
        } else {
            i5 = i;
        }
        if ((i4 & 64) != 0) {
            int i14 = onExtraCallback + 61;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 2 % 2;
            i6 = 0;
        } else {
            i6 = i2;
        }
        int i17 = (i4 & 128) == 0 ? i3 : 0;
        if ((i4 & 256) != 0) {
            int i18 = 2 % 2;
        } else {
            str3 = str2;
        }
        this(str4, z2, j3, j4, listEmptyList, i5, i6, i17, str3);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.date;
        int i5 = i3 + 113;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        boolean z = this.isOverspending;
        int i5 = i3 + 117;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final long asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.income;
        int i4 = i3 + 67;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final List<formatToParts> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 125;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        List<formatToParts> list = this.transactions;
        int i4 = i2 + 75;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final int asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 95;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.year;
        int i5 = i2 + 111;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 37;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.month;
        int i5 = i2 + 37;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 85;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.dateInt;
        int i6 = i2 + 83;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 29;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 81;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void access000() {
        int i = 2 % 2;
        Iterator<T> it = this.transactions.iterator();
        int i2 = onExtraCallbackWithResult + 75;
        while (true) {
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!it.hasNext()) {
                Calendar calendar2 = calendar;
                calendar2.setTime(CommonModule_closeView.onWarmupCompleted.access000().parse(this.date));
                this.year = calendar2.get(1);
                this.month = calendar2.get(2) + 1;
                this.dateInt = calendar2.get(5);
                return;
            }
            int i4 = onExtraCallbackWithResult + 27;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                formatToParts.onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1450698653, new Object[]{(formatToParts) it.next()}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1450698645, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
                int i5 = 39 / 0;
            } else {
                formatToParts.onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1450698653, new Object[]{(formatToParts) it.next()}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1450698645, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
            }
            i2 = onExtraCallbackWithResult + 27;
        }
    }

    @Override // o.NativeKeyboardObserverSpec
    public String onWarmupCompleted() {
        int i = 2 % 2;
        String str = "DAILY:" + this.date;
        int i2 = onExtraCallbackWithResult + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    static {
        int i = onWarmupCompleted + 93;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public final NativeRedBoxSpec onWarmupCompleted(@NotNull String str, boolean z, long j, long j2, @NotNull List<formatToParts> list, int i, int i2, int i3, @NotNull String str2) {
        Object[] objArr = {this, str, Boolean.valueOf(z), Long.valueOf(j), Long.valueOf(j2), list, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (NativeRedBoxSpec) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, 388697768, -388697768);
    }

    public final long onExtraCallback() {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return ((Long) IAuthTabCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this}, iOnNavigationEvent3, iOnNavigationEvent, -409588292, 409588293)).longValue();
    }
}
