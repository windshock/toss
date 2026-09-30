package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda8_kfmHbROf7Yv_VB29JQcaCjh4 implements Parcelable {
    public static final Parcelable.Creator<r8lambda8_kfmHbROf7Yv_VB29JQcaCjh4> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    public static final int onNavigationEvent = 0;
    private final long onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final List<r8lambda20pDhUQTphn51LRdi087HaV6uds> onWarmupCompleted;

    public static final class onExtraCallback implements Parcelable.Creator<r8lambda8_kfmHbROf7Yv_VB29JQcaCjh4> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final r8lambda8_kfmHbROf7Yv_VB29JQcaCjh4[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 61;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            r8lambda8_kfmHbROf7Yv_VB29JQcaCjh4[] r8lambda8_kfmhbrof7yv_vb29jqcacjh4Arr = new r8lambda8_kfmHbROf7Yv_VB29JQcaCjh4[i];
            int i6 = i3 + 57;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return r8lambda8_kfmhbrof7yv_vb29jqcacjh4Arr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ r8lambda8_kfmHbROf7Yv_VB29JQcaCjh4 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            r8lambda8_kfmHbROf7Yv_VB29JQcaCjh4 r8lambda8_kfmhbrof7yv_vb29jqcacjh4OnExtraCallback = onExtraCallback(parcel);
            int i4 = onExtraCallback + 113;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 7 / 0;
            }
            return r8lambda8_kfmhbrof7yv_vb29jqcacjh4OnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ r8lambda8_kfmHbROf7Yv_VB29JQcaCjh4[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 93;
            onExtraCallbackWithResult = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                IAuthTabCallback(i);
                obj.hashCode();
                throw null;
            }
            r8lambda8_kfmHbROf7Yv_VB29JQcaCjh4[] r8lambda8_kfmhbrof7yv_vb29jqcacjh4ArrIAuthTabCallback = IAuthTabCallback(i);
            int i4 = onExtraCallback + 115;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return r8lambda8_kfmhbrof7yv_vb29jqcacjh4ArrIAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }

        public final r8lambda8_kfmHbROf7Yv_VB29JQcaCjh4 onExtraCallback(Parcel parcel) {
            boolean z;
            ArrayList arrayList;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            if (parcel.readInt() != 0) {
                int i4 = onExtraCallbackWithResult + 65;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                int i6 = onExtraCallback + 97;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i8 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList2.add(r8lambda20pDhUQTphn51LRdi087HaV6uds.CREATOR.createFromParcel(parcel));
                }
                int i10 = onExtraCallback + 101;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                arrayList = arrayList2;
            }
            return new r8lambda8_kfmHbROf7Yv_VB29JQcaCjh4(j, z, arrayList);
        }
    }

    static {
        int i = IAuthTabCallback + 69;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 94 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2 == 0 ? 1 : 0;
        int i5 = i3 + 103;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambda8_kfmHbROf7Yv_VB29JQcaCjh4)) {
            int i2 = IAuthTabCallbackStub + 9;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        r8lambda8_kfmHbROf7Yv_VB29JQcaCjh4 r8lambda8_kfmhbrof7yv_vb29jqcacjh4 = (r8lambda8_kfmHbROf7Yv_VB29JQcaCjh4) obj;
        if (this.onExtraCallback != r8lambda8_kfmhbrof7yv_vb29jqcacjh4.onExtraCallback) {
            int i4 = IAuthTabCallbackStub + 79;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.onExtraCallbackWithResult != r8lambda8_kfmhbrof7yv_vb29jqcacjh4.onExtraCallbackWithResult) {
            int i6 = IAuthTabCallbackStub + 65;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onWarmupCompleted, r8lambda8_kfmhbrof7yv_vb29jqcacjh4.onWarmupCompleted)) {
            return true;
        }
        int i8 = IAuthTabCallbackStub + 33;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 61;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = Long.hashCode(this.onExtraCallback);
        int iHashCode2 = Boolean.hashCode(this.onExtraCallbackWithResult);
        List<r8lambda20pDhUQTphn51LRdi087HaV6uds> list = this.onWarmupCompleted;
        if (list == null) {
            i = 0;
        } else {
            int iHashCode3 = list.hashCode();
            int i5 = IAuthTabCallbackStub + 15;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode3;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StandardTermsV2TermsAgreedState(termsId=" + this.onExtraCallback + ", agreed=" + this.onExtraCallbackWithResult + ", handlingItem=" + this.onWarmupCompleted + ")";
        int i2 = IAuthTabCallbackStub + 9;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 57 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.onExtraCallback);
        parcel.writeInt(this.onExtraCallbackWithResult ? 1 : 0);
        List<r8lambda20pDhUQTphn51LRdi087HaV6uds> list = this.onWarmupCompleted;
        if (list == null) {
            parcel.writeInt(0);
            int i3 = asBinder + 13;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<r8lambda20pDhUQTphn51LRdi087HaV6uds> it = list.iterator();
        while (it.hasNext()) {
            int i4 = IAuthTabCallbackStub + 77;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            it.next().writeToParcel(parcel, i);
        }
    }

    public r8lambda8_kfmHbROf7Yv_VB29JQcaCjh4(long j, boolean z, @Nullable List<r8lambda20pDhUQTphn51LRdi087HaV6uds> list) {
        this.onExtraCallback = j;
        this.onExtraCallbackWithResult = z;
        this.onWarmupCompleted = list;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        int i3 = 23 / 0;
        return this.onExtraCallback;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 105;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.onExtraCallbackWithResult;
        int i4 = i2 + 1;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return z;
    }

    public final List<r8lambda20pDhUQTphn51LRdi087HaV6uds> onExtraCallback() {
        List<r8lambda20pDhUQTphn51LRdi087HaV6uds> list;
        int i = 2 % 2;
        int i2 = asBinder + 17;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            list = this.onWarmupCompleted;
            int i4 = 90 / 0;
        } else {
            list = this.onWarmupCompleted;
        }
        int i5 = i3 + 123;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return list;
    }
}
