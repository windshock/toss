package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RemainingTimeInfo implements Parcelable {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final long remainSeconds;
    private final String text;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<RemainingTimeInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RemainingTimeInfo> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final RemainingTimeInfo[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 7;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            RemainingTimeInfo[] remainingTimeInfoArr = new RemainingTimeInfo[i];
            if (i3 % 2 == 0) {
                throw null;
            }
            int i5 = i4 + 41;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return remainingTimeInfoArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RemainingTimeInfo createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onWarmupCompleted(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            RemainingTimeInfo remainingTimeInfoOnWarmupCompleted = onWarmupCompleted(parcel);
            int i3 = onExtraCallback + 55;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return remainingTimeInfoOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RemainingTimeInfo[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 49;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            RemainingTimeInfo[] remainingTimeInfoArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onNavigationEvent + 73;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return remainingTimeInfoArrIAuthTabCallback;
            }
            throw null;
        }

        public final RemainingTimeInfo onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RemainingTimeInfo remainingTimeInfo = new RemainingTimeInfo(parcel.readLong(), parcel.readString());
            int i2 = onExtraCallback + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return remainingTimeInfo;
        }
    }

    static {
        int i = IAuthTabCallback + 39;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r9 = 8 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if ((r9 instanceof viva.republica.toss.network.model.loan.RemainingTimeInfo) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r1 = r1 + 121;
        viva.republica.toss.network.model.loan.RemainingTimeInfo.onWarmupCompleted = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if ((r1 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        r9 = (viva.republica.toss.network.model.loan.RemainingTimeInfo) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (r8.remainSeconds == r9.remainSeconds) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        r3 = r3 + 107;
        viva.republica.toss.network.model.loan.RemainingTimeInfo.onExtraCallbackWithResult = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if ((r3 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.text, r9.text) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        r9 = viva.republica.toss.network.model.loan.RemainingTimeInfo.onExtraCallbackWithResult + 83;
        viva.republica.toss.network.model.loan.RemainingTimeInfo.onWarmupCompleted = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 33;
        viva.republica.toss.network.model.loan.RemainingTimeInfo.onWarmupCompleted = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r1 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.RemainingTimeInfo.onExtraCallbackWithResult
            int r2 = r1 + 13
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.RemainingTimeInfo.onWarmupCompleted = r3
            int r2 = r2 % r0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L16
            r2 = 34
            int r2 = r2 / r5
            if (r8 != r9) goto L25
            goto L18
        L16:
            if (r8 != r9) goto L25
        L18:
            int r1 = r1 + 33
            int r9 = r1 % 128
            viva.republica.toss.network.model.loan.RemainingTimeInfo.onWarmupCompleted = r9
            int r1 = r1 % r0
            if (r1 == 0) goto L24
            r9 = 8
            int r9 = r9 / r5
        L24:
            return r4
        L25:
            boolean r2 = r9 instanceof viva.republica.toss.network.model.loan.RemainingTimeInfo
            if (r2 != 0) goto L34
            int r1 = r1 + 121
            int r9 = r1 % 128
            viva.republica.toss.network.model.loan.RemainingTimeInfo.onWarmupCompleted = r9
            int r1 = r1 % r0
            if (r1 == 0) goto L33
            return r4
        L33:
            return r5
        L34:
            viva.republica.toss.network.model.loan.RemainingTimeInfo r9 = (viva.republica.toss.network.model.loan.RemainingTimeInfo) r9
            long r1 = r8.remainSeconds
            long r6 = r9.remainSeconds
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L49
            int r3 = r3 + 107
            int r9 = r3 % 128
            viva.republica.toss.network.model.loan.RemainingTimeInfo.onExtraCallbackWithResult = r9
            int r3 = r3 % r0
            if (r3 != 0) goto L48
            return r4
        L48:
            return r5
        L49:
            java.lang.String r1 = r8.text
            java.lang.String r9 = r9.text
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r9)
            if (r9 != 0) goto L5d
            int r9 = viva.republica.toss.network.model.loan.RemainingTimeInfo.onExtraCallbackWithResult
            int r9 = r9 + 83
            int r1 = r9 % 128
            viva.republica.toss.network.model.loan.RemainingTimeInfo.onWarmupCompleted = r1
            int r9 = r9 % r0
            return r5
        L5d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.RemainingTimeInfo.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Long.hashCode(this.remainSeconds) * 31) + this.text.hashCode();
        int i4 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemainingTimeInfo(remainSeconds=" + this.remainSeconds + ", text=" + this.text + ")";
        int i2 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeLong(this.remainSeconds);
            parcel.writeString(this.text);
        } else {
            parcel.writeLong(this.remainSeconds);
            parcel.writeString(this.text);
            throw null;
        }
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RemainingTimeInfo> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                RemainingTimeInfo$$serializer remainingTimeInfo$$serializer = RemainingTimeInfo$$serializer.INSTANCE;
                throw null;
            }
            RemainingTimeInfo$$serializer remainingTimeInfo$$serializer2 = RemainingTimeInfo$$serializer.INSTANCE;
            int i3 = onExtraCallback + 41;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 87 / 0;
            }
            return remainingTimeInfo$$serializer2;
        }
    }

    public /* synthetic */ RemainingTimeInfo(int i, long j, String str, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, RemainingTimeInfo$$serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 93;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.remainSeconds = j;
        this.text = str;
    }

    public RemainingTimeInfo(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.remainSeconds = j;
        this.text = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(RemainingTimeInfo remainingTimeInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, remainingTimeInfo.remainSeconds);
        vylVar.onExtraCallback(serialDescriptor, 1, remainingTimeInfo.text);
        int i4 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        long j = this.remainSeconds;
        if (i4 != 0) {
            int i5 = 28 / 0;
        }
        int i6 = i3 + 111;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.text;
        int i5 = i3 + 25;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
