package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getProcessNameViaReflection implements Parcelable {
    public static final Parcelable.Creator<getProcessNameViaReflection> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String fileUrl;
    private boolean isChecked;
    private final String title;

    public static final class onWarmupCompleted implements Parcelable.Creator<getProcessNameViaReflection> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getProcessNameViaReflection createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getProcessNameViaReflection getprocessnameviareflectionOnNavigationEvent = onNavigationEvent(parcel);
            int i4 = IAuthTabCallback + 55;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return getprocessnameviareflectionOnNavigationEvent;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getProcessNameViaReflection[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 9;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            getProcessNameViaReflection[] getprocessnameviareflectionArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onExtraCallback + 63;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return getprocessnameviareflectionArrOnExtraCallbackWithResult;
        }

        public final getProcessNameViaReflection[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 29;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            getProcessNameViaReflection[] getprocessnameviareflectionArr = new getProcessNameViaReflection[i];
            int i6 = i4 + 87;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return getprocessnameviareflectionArr;
        }

        public final getProcessNameViaReflection onNavigationEvent(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z = false;
            if (parcel.readInt() != 0) {
                int i2 = onExtraCallback + 21;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    z = true;
                }
            } else {
                int i3 = onExtraCallback + 39;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            return new getProcessNameViaReflection(string, string2, z);
        }
    }

    static {
        int i = onNavigationEvent + 23;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 37;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof o.getProcessNameViaReflection) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (o.getProcessNameViaReflection) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.title, r6.title) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r6 = o.getProcessNameViaReflection.onExtraCallback + 73;
        o.getProcessNameViaReflection.IAuthTabCallback = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.fileUrl, r6.fileUrl) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        r6 = o.getProcessNameViaReflection.IAuthTabCallback + 39;
        o.getProcessNameViaReflection.onExtraCallback = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r5.isChecked == r6.isChecked) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        r6 = o.getProcessNameViaReflection.onExtraCallback + 55;
        o.getProcessNameViaReflection.IAuthTabCallback = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if ((r6 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        r6 = 19 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getProcessNameViaReflection.IAuthTabCallback
            int r1 = r1 + 5
            int r2 = r1 % 128
            o.getProcessNameViaReflection.onExtraCallback = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            r1 = 66
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r6 instanceof o.getProcessNameViaReflection
            if (r1 != 0) goto L1e
            return r3
        L1e:
            o.getProcessNameViaReflection r6 = (o.getProcessNameViaReflection) r6
            java.lang.String r1 = r5.title
            java.lang.String r4 = r6.title
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L34
            int r6 = o.getProcessNameViaReflection.onExtraCallback
            int r6 = r6 + 73
            int r1 = r6 % 128
            o.getProcessNameViaReflection.IAuthTabCallback = r1
            int r6 = r6 % r0
            return r3
        L34:
            java.lang.String r1 = r5.fileUrl
            java.lang.String r4 = r6.fileUrl
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L48
            int r6 = o.getProcessNameViaReflection.IAuthTabCallback
            int r6 = r6 + 39
            int r1 = r6 % 128
            o.getProcessNameViaReflection.onExtraCallback = r1
            int r6 = r6 % r0
            return r3
        L48:
            boolean r1 = r5.isChecked
            boolean r6 = r6.isChecked
            if (r1 == r6) goto L5d
            int r6 = o.getProcessNameViaReflection.onExtraCallback
            int r6 = r6 + 55
            int r1 = r6 % 128
            o.getProcessNameViaReflection.IAuthTabCallback = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L5c
            r6 = 19
            int r6 = r6 / r3
        L5c:
            return r3
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getProcessNameViaReflection.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.title.hashCode();
        return i3 != 0 ? (((iHashCode << 70) >>> this.fileUrl.hashCode()) * 117) / Boolean.hashCode(this.isChecked) : (((iHashCode * 31) + this.fileUrl.hashCode()) * 31) + Boolean.hashCode(this.isChecked);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardDescriptionFile(title=" + this.title + ", fileUrl=" + this.fileUrl + ", isChecked=" + this.isChecked + ")";
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 3;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeString(this.title);
            parcel.writeString(this.fileUrl);
            parcel.writeInt(this.isChecked ? 1 : 0);
            int i5 = 75 / 0;
        } else {
            parcel.writeString(this.title);
            parcel.writeString(this.fileUrl);
            parcel.writeInt(this.isChecked ? 1 : 0);
        }
        int i6 = onExtraCallback + 21;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public getProcessNameViaReflection(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.title = str;
        this.fileUrl = str2;
        this.isChecked = z;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 63;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.fileUrl;
        int i5 = i3 + 105;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.isChecked = z;
        if (i3 != 0) {
            throw null;
        }
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isChecked;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
