package viva.republica.toss.network.model.electronicdocument.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DocumentWalletPollCheckMeta implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("delayMs")
    private final long delayMs;

    @SerializedName("maxRetry")
    private final long maxRetry;

    @SerializedName("totalTimeOutMs")
    private final long totalTimeOutMs;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DocumentWalletPollCheckMeta> CREATOR = new onExtraCallbackWithResult();

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<DocumentWalletPollCheckMeta> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DocumentWalletPollCheckMeta createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            DocumentWalletPollCheckMeta documentWalletPollCheckMetaOnWarmupCompleted = onWarmupCompleted(parcel);
            int i4 = onExtraCallbackWithResult + 67;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 91 / 0;
            }
            return documentWalletPollCheckMetaOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DocumentWalletPollCheckMeta[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 101;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            DocumentWalletPollCheckMeta[] documentWalletPollCheckMetaArrOnWarmupCompleted = onWarmupCompleted(i);
            if (i4 == 0) {
                int i5 = 90 / 0;
            }
            return documentWalletPollCheckMetaArrOnWarmupCompleted;
        }

        public final DocumentWalletPollCheckMeta onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            DocumentWalletPollCheckMeta documentWalletPollCheckMeta = new DocumentWalletPollCheckMeta(parcel.readLong(), parcel.readLong(), parcel.readLong());
            int i2 = onExtraCallbackWithResult + 117;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return documentWalletPollCheckMeta;
            }
            throw null;
        }

        public final DocumentWalletPollCheckMeta[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 97;
            onExtraCallbackWithResult = i3 % 128;
            DocumentWalletPollCheckMeta[] documentWalletPollCheckMetaArr = new DocumentWalletPollCheckMeta[i];
            if (i3 % 2 != 0) {
                int i4 = 60 / 0;
            }
            return documentWalletPollCheckMetaArr;
        }
    }

    static {
        int i = onWarmupCompleted + 75;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 11 / 0;
        }
    }

    public DocumentWalletPollCheckMeta() {
        this(0L, 0L, 0L, 7, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 15;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof DocumentWalletPollCheckMeta)) {
            return false;
        }
        DocumentWalletPollCheckMeta documentWalletPollCheckMeta = (DocumentWalletPollCheckMeta) obj;
        if (this.delayMs != documentWalletPollCheckMeta.delayMs) {
            int i4 = IAuthTabCallback + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.maxRetry != documentWalletPollCheckMeta.maxRetry) {
            int i6 = onExtraCallback + 73;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.totalTimeOutMs == documentWalletPollCheckMeta.totalTimeOutMs) {
            return true;
        }
        int i8 = onExtraCallback + 113;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Long.hashCode(this.delayMs) * 31) + Long.hashCode(this.maxRetry)) * 31) + Long.hashCode(this.totalTimeOutMs);
        int i4 = onExtraCallback + 37;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DocumentWalletPollCheckMeta(delayMs=" + this.delayMs + ", maxRetry=" + this.maxRetry + ", totalTimeOutMs=" + this.totalTimeOutMs + ")";
        int i2 = IAuthTabCallback + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 123;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.delayMs);
        parcel.writeLong(this.maxRetry);
        parcel.writeLong(this.totalTimeOutMs);
        int i5 = IAuthTabCallback + 15;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DocumentWalletPollCheckMeta> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            DocumentWalletPollCheckMeta$$serializer documentWalletPollCheckMeta$$serializer = DocumentWalletPollCheckMeta$$serializer.INSTANCE;
            int i4 = onWarmupCompleted + 85;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return documentWalletPollCheckMeta$$serializer;
        }
    }

    public /* synthetic */ DocumentWalletPollCheckMeta(int i, long j, long j2, long j3, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.delayMs = 0L;
        } else {
            this.delayMs = j;
            int i2 = onExtraCallback + 39;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 % 2;
            } else {
                int i4 = 2 % 2;
            }
        }
        if ((i & 2) == 0) {
            int i5 = IAuthTabCallback + 85;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                this.maxRetry = 1L;
            } else {
                this.maxRetry = 0L;
            }
        } else {
            this.maxRetry = j2;
            int i6 = 2 % 2;
        }
        if ((i & 4) == 0) {
            int i7 = onExtraCallback + 39;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            this.totalTimeOutMs = 0L;
            return;
        }
        this.totalTimeOutMs = j3;
        int i9 = onExtraCallback + 83;
        IAuthTabCallback = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    public DocumentWalletPollCheckMeta(long j, long j2, long j3) {
        this.delayMs = j;
        this.maxRetry = j2;
        this.totalTimeOutMs = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPollCheckMeta r8, o.vyl r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPollCheckMeta.IAuthTabCallback
            int r1 = r1 + 117
            int r2 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPollCheckMeta.onExtraCallback = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            r5 = 1
            if (r1 != 0) goto L19
            boolean r1 = r9.onWarmupCompleted(r10, r5)
            if (r1 != 0) goto L2e
            goto L1f
        L19:
            boolean r1 = r9.onWarmupCompleted(r10, r2)
            if (r1 != 0) goto L2e
        L1f:
            int r1 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPollCheckMeta.IAuthTabCallback
            int r1 = r1 + 93
            int r6 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPollCheckMeta.onExtraCallback = r6
            int r1 = r1 % r0
            long r6 = r8.delayMs
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 == 0) goto L33
        L2e:
            long r6 = r8.delayMs
            r9.onExtraCallback(r10, r2, r6)
        L33:
            boolean r1 = r9.onWarmupCompleted(r10, r5)
            r1 = r1 ^ r5
            if (r1 == 0) goto L52
            int r1 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPollCheckMeta.IAuthTabCallback
            int r1 = r1 + 53
            int r2 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPollCheckMeta.onExtraCallback = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L4c
            long r1 = r8.maxRetry
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L60
            goto L52
        L4c:
            long r1 = r8.maxRetry
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L60
        L52:
            long r1 = r8.maxRetry
            r9.onExtraCallback(r10, r5, r1)
            int r1 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPollCheckMeta.IAuthTabCallback
            int r1 = r1 + 49
            int r2 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPollCheckMeta.onExtraCallback = r2
            int r1 = r1 % r0
        L60:
            boolean r1 = r9.onWarmupCompleted(r10, r0)
            if (r1 != 0) goto L6c
            long r1 = r8.totalTimeOutMs
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L71
        L6c:
            long r1 = r8.totalTimeOutMs
            r9.onExtraCallback(r10, r0, r1)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPollCheckMeta.onExtraCallback(viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPollCheckMeta, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DocumentWalletPollCheckMeta(long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j4;
        long j5;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            j4 = 0;
        } else {
            j4 = j;
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallback + 39;
            IAuthTabCallback = i5 % 128;
            j2 = i5 % 2 != 0 ? 1L : 0L;
            int i6 = 2 % 2;
        }
        long j6 = j2;
        if ((i & 4) != 0) {
            int i7 = onExtraCallback + 125;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            j5 = 0;
        } else {
            j5 = j3;
        }
        this(j4, j6, j5);
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 55;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j = this.delayMs;
        int i4 = i2 + 5;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        long j = this.maxRetry;
        int i5 = i3 + 75;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.totalTimeOutMs;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
