package im.toss.feature.credit.overview.network.response;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.dj3;
import o.getDynamicHeight;
import o.liq;
import o.okycx;
import o.oty1;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Difference {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final Long cardDiffBaseMonth;
    private final Long cardUsedAmount;
    private final Integer grade;
    private final Long guaranteeAmount;
    private final Long loanRemainAmount;
    private final Long overdueRemainAmount;
    private final Integer score;
    private final Float topPercentInPeers;

    static {
        int i = onExtraCallback + 65;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public Difference() {
        this((Integer) null, (Integer) null, (Float) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, 255, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Difference)) {
            return false;
        }
        Difference difference = (Difference) obj;
        if (!Intrinsics.areEqual(this.score, difference.score)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.grade, difference.grade)) {
            int i4 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.topPercentInPeers, difference.topPercentInPeers)) {
            int i6 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.cardUsedAmount, difference.cardUsedAmount)) {
            int i8 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.cardDiffBaseMonth, difference.cardDiffBaseMonth)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.loanRemainAmount, difference.loanRemainAmount)) {
            int i10 = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.overdueRemainAmount, difference.overdueRemainAmount)) {
            int i12 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.guaranteeAmount, difference.guaranteeAmount)) {
            int i14 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i14 % 128;
            int i15 = i14 % 2;
            return true;
        }
        int i16 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i16 % 128;
        if (i16 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        Integer num = this.score;
        int iHashCode3 = 1;
        int iHashCode4 = 0;
        if (num == null) {
            int i2 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = num.hashCode();
        }
        Integer num2 = this.grade;
        if (num2 == null) {
            int i3 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                iHashCode3 = 0;
            }
        } else {
            iHashCode3 = num2.hashCode();
        }
        Float f = this.topPercentInPeers;
        if (f == null) {
            int i4 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = f.hashCode();
        }
        Long l = this.cardUsedAmount;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        Long l2 = this.cardDiffBaseMonth;
        int iHashCode6 = l2 == null ? 0 : l2.hashCode();
        Long l3 = this.loanRemainAmount;
        int iHashCode7 = l3 == null ? 0 : l3.hashCode();
        Long l4 = this.overdueRemainAmount;
        int iHashCode8 = l4 == null ? 0 : l4.hashCode();
        Long l5 = this.guaranteeAmount;
        if (l5 != null) {
            int i6 = IAuthTabCallback + 57;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            iHashCode4 = l5.hashCode();
        }
        return (((((((((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Difference(score=" + this.score + ", grade=" + this.grade + ", topPercentInPeers=" + this.topPercentInPeers + ", cardUsedAmount=" + this.cardUsedAmount + ", cardDiffBaseMonth=" + this.cardDiffBaseMonth + ", loanRemainAmount=" + this.loanRemainAmount + ", overdueRemainAmount=" + this.overdueRemainAmount + ", guaranteeAmount=" + this.guaranteeAmount + ")";
        int i2 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Difference> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Difference$$serializer difference$$serializer = Difference$$serializer.INSTANCE;
            int i4 = IAuthTabCallback + 45;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return difference$$serializer;
        }
    }

    public /* synthetic */ Difference(int i, Integer num, Integer num2, Float f, Long l, Long l2, Long l3, Long l4, Long l5, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.score = null;
        } else {
            this.score = num;
        }
        if ((i & 2) == 0) {
            int i2 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.grade = null;
        } else {
            this.grade = num2;
        }
        if ((i & 4) == 0) {
            this.topPercentInPeers = null;
        } else {
            this.topPercentInPeers = f;
        }
        if ((i & 8) == 0) {
            this.cardUsedAmount = null;
            int i4 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } else {
            this.cardUsedAmount = l;
        }
        if ((i & 16) == 0) {
            int i7 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            this.cardDiffBaseMonth = null;
            if (i8 == 0) {
                int i9 = 52 / 0;
            }
        } else {
            this.cardDiffBaseMonth = l2;
            int i10 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 % 2;
            }
        }
        if ((i & 32) == 0) {
            this.loanRemainAmount = null;
            int i12 = 2 % 2;
        } else {
            this.loanRemainAmount = l3;
        }
        if ((i & 64) == 0) {
            int i13 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i13 % 128;
            int i14 = i13 % 2;
            this.overdueRemainAmount = null;
        } else {
            this.overdueRemainAmount = l4;
        }
        if ((i & 128) == 0) {
            this.guaranteeAmount = null;
            return;
        }
        this.guaranteeAmount = l5;
        int i15 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i15 % 128;
        int i16 = i15 % 2;
    }

    public Difference(@Nullable Integer num, @Nullable Integer num2, @Nullable Float f, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @Nullable Long l5) {
        this.score = num;
        this.grade = num2;
        this.topPercentInPeers = f;
        this.cardUsedAmount = l;
        this.cardDiffBaseMonth = l2;
        this.loanRemainAmount = l3;
        this.overdueRemainAmount = l4;
        this.guaranteeAmount = l5;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(Difference difference, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || difference.score != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getDynamicHeight.onWarmupCompleted, difference.score);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = onExtraCallbackWithResult + 19;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (difference.grade != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getDynamicHeight.onWarmupCompleted, difference.grade);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i6 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            if (difference.topPercentInPeers != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, dj3.onWarmupCompleted, difference.topPercentInPeers);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || difference.cardUsedAmount != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, oty1.onExtraCallback, difference.cardUsedAmount);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || difference.cardDiffBaseMonth != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, oty1.onExtraCallback, difference.cardDiffBaseMonth);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || difference.loanRemainAmount != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, oty1.onExtraCallback, difference.loanRemainAmount);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || difference.overdueRemainAmount != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, oty1.onExtraCallback, difference.overdueRemainAmount);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 7)) {
            int i8 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                Long l = difference.guaranteeAmount;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (difference.guaranteeAmount != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 7, oty1.onExtraCallback, difference.guaranteeAmount);
            }
        }
        int i9 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Difference(Integer num, Integer num2, Float f, Long l, Long l2, Long l3, Long l4, Long l5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num3;
        Float f2;
        Long l6;
        Long l7;
        Long l8;
        Long l9;
        Long l10 = null;
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            num3 = null;
        } else {
            num3 = num;
        }
        Integer num4 = (i & 2) != 0 ? null : num2;
        if ((i & 4) != 0) {
            int i4 = onExtraCallbackWithResult + 117;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            f2 = null;
        } else {
            f2 = f;
        }
        if ((i & 8) != 0) {
            int i6 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            l6 = null;
        } else {
            l6 = l;
        }
        if ((i & 16) != 0) {
            int i8 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            l7 = null;
        } else {
            l7 = l2;
        }
        if ((i & 32) != 0) {
            int i10 = IAuthTabCallback + 81;
            int i11 = i10 % 128;
            onExtraCallbackWithResult = i11;
            int i12 = i10 % 2;
            int i13 = i11 + 85;
            IAuthTabCallback = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 2 % 2;
            }
            l8 = null;
        } else {
            l8 = l3;
        }
        if ((i & 64) != 0) {
            int i15 = onExtraCallbackWithResult;
            int i16 = i15 + 35;
            IAuthTabCallback = i16 % 128;
            if (i16 % 2 != 0) {
                throw null;
            }
            int i17 = i15 + 53;
            IAuthTabCallback = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 2 % 2;
            }
            l9 = null;
        } else {
            l9 = l4;
        }
        if ((i & 128) != 0) {
            int i19 = 2 % 2;
        } else {
            l10 = l5;
        }
        this(num3, num4, f2, l6, l7, l8, l9, l10);
    }

    public final Integer IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 51;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Integer num = this.score;
        int i4 = i2 + 101;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Integer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 85;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.grade;
        int i5 = i2 + 19;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Float asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Float f = this.topPercentInPeers;
        int i5 = i3 + 61;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        throw null;
    }

    public final Long onWarmupCompleted() {
        Long l;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 41;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            l = this.cardUsedAmount;
            int i4 = 7 / 0;
        } else {
            l = this.cardUsedAmount;
        }
        int i5 = i2 + 27;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return l;
    }

    public final Long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Long l = this.cardDiffBaseMonth;
        int i5 = i3 + 105;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return l;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 65;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Long l = this.loanRemainAmount;
        int i5 = i2 + 7;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    public final Long onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 53;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Long l = this.overdueRemainAmount;
        int i5 = i2 + 109;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return l;
        }
        throw null;
    }

    public final Long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Long l = this.guaranteeAmount;
        int i4 = i3 + 121;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return l;
    }
}
