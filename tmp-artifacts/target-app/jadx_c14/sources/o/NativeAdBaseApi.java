package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeAdBaseApi implements Parcelable {
    public static final Parcelable.Creator<NativeAdBaseApi> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final Integer indentLevel;
    private final String link;
    private final String title;

    public static final class onExtraCallback implements Parcelable.Creator<NativeAdBaseApi> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public final NativeAdBaseApi IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Integer numValueOf = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 == 0) {
                parcel.readString();
                parcel.readString();
                parcel.readInt();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = IAuthTabCallback + 47;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new NativeAdBaseApi(string, string2, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeAdBaseApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(parcel);
            }
            IAuthTabCallback(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeAdBaseApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            NativeAdBaseApi[] nativeAdBaseApiArrOnExtraCallback = onExtraCallback(i);
            if (i4 != 0) {
                int i5 = 77 / 0;
            }
            return nativeAdBaseApiArrOnExtraCallback;
        }

        public final NativeAdBaseApi[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 17;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            NativeAdBaseApi[] nativeAdBaseApiArr = new NativeAdBaseApi[i];
            int i6 = i3 + 83;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return nativeAdBaseApiArr;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 71;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof NativeAdBaseApi)) {
            return false;
        }
        NativeAdBaseApi nativeAdBaseApi = (NativeAdBaseApi) obj;
        if (!Intrinsics.areEqual(this.title, nativeAdBaseApi.title)) {
            int i4 = IAuthTabCallback + 21;
            onNavigationEvent = i4 % 128;
            return i4 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.link, nativeAdBaseApi.link)) {
            return Intrinsics.areEqual(this.indentLevel, nativeAdBaseApi.indentLevel);
        }
        int i5 = onNavigationEvent + 47;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026 A[PHI: r1 r3
      0x0026: PHI (r1v12 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
      0x0026: PHI (r3v3 java.lang.String) = (r3v0 java.lang.String), (r3v5 java.lang.String) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1
      0x0024: PHI (r1v6 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.NativeAdBaseApi.IAuthTabCallback
            int r1 = r1 + 39
            int r2 = r1 % 128
            o.NativeAdBaseApi.onNavigationEvent = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1a
            java.lang.String r1 = r7.title
            int r1 = r1.hashCode()
            java.lang.String r3 = r7.link
            if (r3 != 0) goto L26
            goto L24
        L1a:
            java.lang.String r1 = r7.title
            int r1 = r1.hashCode()
            java.lang.String r3 = r7.link
            if (r3 != 0) goto L26
        L24:
            r3 = r2
            goto L2a
        L26:
            int r3 = r3.hashCode()
        L2a:
            java.lang.Integer r4 = r7.indentLevel
            if (r4 == 0) goto L46
            int r5 = o.NativeAdBaseApi.IAuthTabCallback
            int r5 = r5 + 113
            int r6 = r5 % 128
            o.NativeAdBaseApi.onNavigationEvent = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L42
            int r0 = r4.hashCode()
            r4 = 34
            int r4 = r4 / r2
            r2 = r0
            goto L46
        L42:
            int r2 = r4.hashCode()
        L46:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.NativeAdBaseApi.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AgreementDescription(title=" + this.title + ", link=" + this.link + ", indentLevel=" + this.indentLevel + ")";
        int i2 = IAuthTabCallback + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 3;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.title);
            parcel.writeString(this.link);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.link);
        Integer num = this.indentLevel;
        if (num == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num.intValue());
        int i4 = IAuthTabCallback + 103;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public NativeAdBaseApi(@NotNull String str, @Nullable String str2, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
        this.link = str2;
        this.indentLevel = num;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 1;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.link;
        int i5 = i3 + 79;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Integer num = this.indentLevel;
        int i5 = i3 + 95;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }
}
