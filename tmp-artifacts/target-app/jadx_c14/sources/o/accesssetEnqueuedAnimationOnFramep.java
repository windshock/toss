package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class accesssetEnqueuedAnimationOnFramep implements Parcelable {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    @SerializedName("amount")
    private final long amount;

    @SerializedName("imageUrl")
    private final String imageUrl;

    @SerializedName("lottieUrl")
    private final String lottieUrl;

    @SerializedName("title")
    private final String title;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final Parcelable.Creator<accesssetEnqueuedAnimationOnFramep> CREATOR = new onNavigationEvent();

    public static final class onNavigationEvent implements Parcelable.Creator<accesssetEnqueuedAnimationOnFramep> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final accesssetEnqueuedAnimationOnFramep IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            accesssetEnqueuedAnimationOnFramep accesssetenqueuedanimationonframep = new accesssetEnqueuedAnimationOnFramep(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
            int i2 = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 78 / 0;
            }
            return accesssetenqueuedanimationonframep;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ accesssetEnqueuedAnimationOnFramep createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            accesssetEnqueuedAnimationOnFramep accesssetenqueuedanimationonframepIAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return accesssetenqueuedanimationonframepIAuthTabCallback;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ accesssetEnqueuedAnimationOnFramep[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            accesssetEnqueuedAnimationOnFramep[] accesssetenqueuedanimationonframepArrOnExtraCallback = onExtraCallback(i);
            int i5 = onWarmupCompleted + 1;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return accesssetenqueuedanimationonframepArrOnExtraCallback;
        }

        public final accesssetEnqueuedAnimationOnFramep[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 87;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            accesssetEnqueuedAnimationOnFramep[] accesssetenqueuedanimationonframepArr = new accesssetEnqueuedAnimationOnFramep[i];
            int i6 = i4 + 103;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return accesssetenqueuedanimationonframepArr;
            }
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 57;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 65 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 21;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 7;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof accesssetEnqueuedAnimationOnFramep)) {
            return false;
        }
        accesssetEnqueuedAnimationOnFramep accesssetenqueuedanimationonframep = (accesssetEnqueuedAnimationOnFramep) obj;
        if (!Intrinsics.areEqual(this.imageUrl, accesssetenqueuedanimationonframep.imageUrl)) {
            int i4 = onNavigationEvent + 51;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.title, accesssetenqueuedanimationonframep.title)) {
            return false;
        }
        if (this.amount == accesssetenqueuedanimationonframep.amount) {
            return !(Intrinsics.areEqual(this.lottieUrl, accesssetenqueuedanimationonframep.lottieUrl) ^ true);
        }
        int i6 = onExtraCallback + 35;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.imageUrl;
        int iHashCode3 = 0;
        if (str == null) {
            int i2 = onNavigationEvent + 115;
            onExtraCallback = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.title;
        if (str2 == null) {
            int i3 = onExtraCallback + 3;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i5 = onNavigationEvent + 81;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        int iHashCode4 = Long.hashCode(this.amount);
        String str3 = this.lottieUrl;
        if (str3 != null) {
            iHashCode3 = str3.hashCode();
            int i7 = onExtraCallback + 81;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode4) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DutchPayPayment(imageUrl=" + this.imageUrl + ", title=" + this.title + ", amount=" + this.amount + ", lottieUrl=" + this.lottieUrl + ")";
        int i2 = onExtraCallback + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 90 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.title);
        parcel.writeLong(this.amount);
        parcel.writeString(this.lottieUrl);
        int i5 = onExtraCallback + 39;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public accesssetEnqueuedAnimationOnFramep(@Nullable String str, @Nullable String str2, long j, @Nullable String str3) {
        this.imageUrl = str;
        this.title = str2;
        this.amount = j;
        this.lottieUrl = str3;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.imageUrl;
        int i5 = i3 + 35;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.title;
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        return str;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 121;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = this.amount;
        int i4 = i2 + 39;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 65;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.lottieUrl;
        int i5 = i2 + 67;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final o.accesssetEnqueuedAnimationOnFramep IAuthTabCallback(@org.jetbrains.annotations.NotNull o.formatToParts r14) {
            /*
                r13 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = o.accesssetEnqueuedAnimationOnFramep.onExtraCallback.onExtraCallbackWithResult
                int r1 = r1 + 93
                int r2 = r1 % 128
                o.accesssetEnqueuedAnimationOnFramep.onExtraCallback.onExtraCallback = r2
                int r1 = r1 % r0
                java.lang.String r1 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
                o.toLocaleLowerCase r1 = r14.asBinder()
                r2 = 0
                if (r1 == 0) goto L1d
                java.lang.String r1 = r1.onWarmupCompleted()
                goto L1e
            L1d:
                r1 = r2
            L1e:
                r3 = 0
                if (r1 == 0) goto L3c
                int r4 = o.accesssetEnqueuedAnimationOnFramep.onExtraCallback.onExtraCallback
                int r4 = r4 + 33
                int r5 = r4 % 128
                o.accesssetEnqueuedAnimationOnFramep.onExtraCallback.onExtraCallbackWithResult = r5
                int r4 = r4 % r0
                if (r4 != 0) goto L36
                int r4 = r1.length()
                r5 = 49
                int r5 = r5 / r3
                if (r4 != 0) goto L40
                goto L3c
            L36:
                int r4 = r1.length()
                if (r4 != 0) goto L40
            L3c:
                java.lang.String r1 = r14.ICustomTabsService()
            L40:
                r4 = 1
                android.text.Spanned r1 = o.BrickModulesListExternalSyntheticLambda0.onNavigationEvent(r1, r3, r4, r2)
                java.lang.String r5 = r1.toString()
                java.lang.Object[] r8 = new java.lang.Object[]{r14}
                int r10 = im.toss.features.edoc.register.AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted()
                int r6 = im.toss.features.edoc.register.AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted()
                int r9 = im.toss.features.edoc.register.AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted()
                int r12 = im.toss.features.edoc.register.AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted()
                r7 = -1318563469(0xffffffffb1685173, float:-3.3806742E-9)
                r11 = 1318563469(0x4e97ae8d, float:1.2723995E9)
                java.lang.Object r1 = o.formatToParts.onWarmupCompleted(r6, r7, r8, r9, r10, r11, r12)
                r4 = r1
                java.lang.String r4 = (java.lang.String) r4
                double r6 = r14.onExtraCallbackWithResult()
                double r6 = java.lang.Math.abs(r6)
                long r6 = o.getBacktraceNoteBytes.onExtraCallbackWithResult(r6)
                java.lang.String r8 = r14.extraCallback()
                o.accesssetEnqueuedAnimationOnFramep r14 = new o.accesssetEnqueuedAnimationOnFramep
                r3 = r14
                r3.<init>(r4, r5, r6, r8)
                int r1 = o.accesssetEnqueuedAnimationOnFramep.onExtraCallback.onExtraCallbackWithResult
                int r1 = r1 + 25
                int r3 = r1 % 128
                o.accesssetEnqueuedAnimationOnFramep.onExtraCallback.onExtraCallback = r3
                int r1 = r1 % r0
                if (r1 != 0) goto L8c
                return r14
            L8c:
                r2.hashCode()
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.accesssetEnqueuedAnimationOnFramep.onExtraCallback.IAuthTabCallback(o.formatToParts):o.accesssetEnqueuedAnimationOnFramep");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onWarmupCompleted() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = r5.lottieUrl
            r2 = 1
            if (r1 == 0) goto L22
            int r3 = o.accesssetEnqueuedAnimationOnFramep.onNavigationEvent
            int r3 = r3 + 99
            int r4 = r3 % 128
            o.accesssetEnqueuedAnimationOnFramep.onExtraCallback = r4
            int r3 = r3 % r0
            int r1 = r1.length()
            if (r1 == 0) goto L22
            int r1 = o.accesssetEnqueuedAnimationOnFramep.onExtraCallback
            int r1 = r1 + 59
            int r3 = r1 % 128
            o.accesssetEnqueuedAnimationOnFramep.onNavigationEvent = r3
            int r1 = r1 % r0
            r1 = 0
            goto L23
        L22:
            r1 = r2
        L23:
            r1 = r1 ^ r2
            int r2 = o.accesssetEnqueuedAnimationOnFramep.onExtraCallback
            int r2 = r2 + 67
            int r3 = r2 % 128
            o.accesssetEnqueuedAnimationOnFramep.onNavigationEvent = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L30
            return r1
        L30:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accesssetEnqueuedAnimationOnFramep.onWarmupCompleted():boolean");
    }
}
