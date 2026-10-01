package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RoundedCornersDrawable implements Parcelable {
    public static final String CHARGE_TYPE_NORMAL = "10";
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private long amount;
    private long basisAmount;
    private long chargeAccountId;
    private String chargeAccountType;
    private boolean enable;
    private long id;
    private setImageRequest statusChangeReason;
    private long userNo;
    public static final int $stable = 8;
    public static final Parcelable.Creator<RoundedCornersDrawable> CREATOR = new onExtraCallback();

    public static final class onExtraCallback implements Parcelable.Creator<RoundedCornersDrawable> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RoundedCornersDrawable createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                onNavigationEvent(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            RoundedCornersDrawable roundedCornersDrawableOnNavigationEvent = onNavigationEvent(parcel);
            int i3 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return roundedCornersDrawableOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RoundedCornersDrawable[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 25;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            RoundedCornersDrawable[] roundedCornersDrawableArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return roundedCornersDrawableArrOnWarmupCompleted;
            }
            throw null;
        }

        public final RoundedCornersDrawable onNavigationEvent(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i4 = onExtraCallbackWithResult + 45;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                int i6 = onExtraCallbackWithResult + 5;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            }
            return new RoundedCornersDrawable(j, j2, string, z, parcel.readLong(), parcel.readLong(), parcel.readLong(), (setImageRequest) parcel.readParcelable(RoundedCornersDrawable.class.getClassLoader()));
        }

        public final RoundedCornersDrawable[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 105;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            RoundedCornersDrawable[] roundedCornersDrawableArr = new RoundedCornersDrawable[i];
            int i6 = i3 + 31;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return roundedCornersDrawableArr;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        int i = onNavigationEvent + 61;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public RoundedCornersDrawable() {
        this(0L, 0L, null, false, 0L, 0L, 0L, null, GF2Field.MASK, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 43;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 117;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 103;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeLong(this.amount);
        parcel.writeLong(this.chargeAccountId);
        parcel.writeString(this.chargeAccountType);
        parcel.writeInt(this.enable ? 1 : 0);
        parcel.writeLong(this.id);
        parcel.writeLong(this.userNo);
        parcel.writeLong(this.basisAmount);
        parcel.writeParcelable(this.statusChangeReason, i);
        int i5 = onExtraCallback + 61;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RoundedCornersDrawable(long j, long j2, @NotNull String str, boolean z, long j3, long j4, long j5, @Nullable setImageRequest setimagerequest) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.amount = j;
        this.chargeAccountId = j2;
        this.chargeAccountType = str;
        this.enable = z;
        this.id = j3;
        this.userNo = j4;
        this.basisAmount = j5;
        this.statusChangeReason = setimagerequest;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RoundedCornersDrawable(long j, long j2, String str, boolean z, long j3, long j4, long j5, setImageRequest setimagerequest, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j6;
        String str2;
        boolean z2;
        setImageRequest setimagerequest2;
        long j7 = (i & 1) != 0 ? -1L : j;
        if ((i & 2) != 0) {
            int i2 = onExtraCallbackWithResult + 41;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            j6 = -1;
        } else {
            j6 = j2;
        }
        if ((i & 4) != 0) {
            int i4 = onExtraCallback;
            int i5 = i4 + 75;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 35;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str2 = BuildConfig.FLAVOR;
        } else {
            str2 = str;
        }
        if ((i & 8) != 0) {
            int i10 = onExtraCallback + 21;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        long j8 = (i & 16) != 0 ? -1L : j3;
        long j9 = (i & 32) != 0 ? -1L : j4;
        long j10 = (i & 64) == 0 ? j5 : -1L;
        if ((i & 128) != 0) {
            int i12 = 2 % 2;
            setimagerequest2 = null;
        } else {
            setimagerequest2 = setimagerequest;
        }
        this(j7, j6, str2, z2, j8, j9, j10, setimagerequest2);
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }
}
