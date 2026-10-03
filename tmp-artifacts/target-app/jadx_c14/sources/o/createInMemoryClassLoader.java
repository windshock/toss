package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createInMemoryClassLoader implements Parcelable {
    public static final Parcelable.Creator<createInMemoryClassLoader> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String company;
    private final String contentsUrl;
    private final Long ref;
    private final long termsId;
    private final String title;

    public static final class onExtraCallback implements Parcelable.Creator<createInMemoryClassLoader> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createInMemoryClassLoader createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            createInMemoryClassLoader createinmemoryclassloaderOnWarmupCompleted = onWarmupCompleted(parcel);
            int i4 = onNavigationEvent + 57;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return createinmemoryclassloaderOnWarmupCompleted;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createInMemoryClassLoader[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 103;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            createInMemoryClassLoader[] createinmemoryclassloaderArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onWarmupCompleted + 3;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 99 / 0;
            }
            return createinmemoryclassloaderArrOnWarmupCompleted;
        }

        public final createInMemoryClassLoader onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            createInMemoryClassLoader createinmemoryclassloader = new createInMemoryClassLoader(parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString());
            int i4 = onWarmupCompleted + 67;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return createinmemoryclassloader;
        }

        public final createInMemoryClassLoader[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 107;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            createInMemoryClassLoader[] createinmemoryclassloaderArr = new createInMemoryClassLoader[i];
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 25;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return createinmemoryclassloaderArr;
        }
    }

    static {
        int i = onWarmupCompleted + 53;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 83;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 51;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[PHI: r0
      0x0032: PHI (r0v12 java.lang.Long) = (r0v4 java.lang.Long), (r0v14 java.lang.Long) binds: [B:8:0x0023, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel r5, int r6) {
        /*
            r4 = this;
            r6 = 2
            int r0 = r6 % r6
            int r0 = o.createInMemoryClassLoader.onExtraCallback
            int r0 = r0 + 59
            int r1 = r0 % 128
            o.createInMemoryClassLoader.IAuthTabCallback = r1
            int r0 = r0 % r6
            r1 = 0
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            long r2 = r4.termsId
            r5.writeLong(r2)
            if (r0 != 0) goto L21
            java.lang.Long r0 = r4.ref
            r2 = 84
            int r2 = r2 / r1
            if (r0 != 0) goto L32
            goto L25
        L21:
            java.lang.Long r0 = r4.ref
            if (r0 != 0) goto L32
        L25:
            int r0 = o.createInMemoryClassLoader.IAuthTabCallback
            int r0 = r0 + 75
            int r2 = r0 % 128
            o.createInMemoryClassLoader.onExtraCallback = r2
            int r0 = r0 % r6
            r5.writeInt(r1)
            goto L3d
        L32:
            r1 = 1
            r5.writeInt(r1)
            long r0 = r0.longValue()
            r5.writeLong(r0)
        L3d:
            java.lang.String r0 = r4.title
            r5.writeString(r0)
            java.lang.String r0 = r4.contentsUrl
            r5.writeString(r0)
            java.lang.String r0 = r4.company
            r5.writeString(r0)
            int r5 = o.createInMemoryClassLoader.onExtraCallback
            int r5 = r5 + 47
            int r0 = r5 % 128
            o.createInMemoryClassLoader.IAuthTabCallback = r0
            int r5 = r5 % r6
            if (r5 == 0) goto L58
            return
        L58:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.createInMemoryClassLoader.writeToParcel(android.os.Parcel, int):void");
    }

    public createInMemoryClassLoader(long j, @Nullable Long l, @NotNull String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.termsId = j;
        this.ref = l;
        this.title = str;
        this.contentsUrl = str2;
        this.company = str3;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.title;
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 41;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.contentsUrl;
        int i5 = i2 + 117;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
