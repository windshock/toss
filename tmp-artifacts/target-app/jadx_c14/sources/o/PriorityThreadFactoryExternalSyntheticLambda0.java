package o;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.google.gson.annotations.SerializedName;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanProductStatus;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PriorityThreadFactoryExternalSyntheticLambda0 implements Parcelable {
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private Throwable error;

    @SerializedName("loanStatuses")
    private final List<onWarmupCompleted> loanStatuses;

    @SerializedName("mandatoryGuideline")
    private final String mandatoryGuideline;

    @SerializedName("totalAppliedLoanCount")
    private final int totalAppliedLoanCount;
    public static final Parcelable.Creator<PriorityThreadFactoryExternalSyntheticLambda0> CREATOR = new onNavigationEvent();
    private static final PriorityThreadFactoryExternalSyntheticLambda0 EMPTY = new PriorityThreadFactoryExternalSyntheticLambda0(0, null, null, 7, null);

    public static final class onNavigationEvent implements Parcelable.Creator<PriorityThreadFactoryExternalSyntheticLambda0> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final PriorityThreadFactoryExternalSyntheticLambda0 IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            String string = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            int i4 = onNavigationEvent + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            for (int i6 = 0; i6 != i3; i6++) {
                int i7 = onNavigationEvent + 31;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                arrayList.add(onWarmupCompleted.CREATOR.createFromParcel(parcel));
            }
            return new PriorityThreadFactoryExternalSyntheticLambda0(i2, string, arrayList);
        }

        public final PriorityThreadFactoryExternalSyntheticLambda0[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 45;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            PriorityThreadFactoryExternalSyntheticLambda0[] priorityThreadFactoryExternalSyntheticLambda0Arr = new PriorityThreadFactoryExternalSyntheticLambda0[i];
            int i6 = i3 + 75;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return priorityThreadFactoryExternalSyntheticLambda0Arr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ PriorityThreadFactoryExternalSyntheticLambda0 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            PriorityThreadFactoryExternalSyntheticLambda0 priorityThreadFactoryExternalSyntheticLambda0IAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = onWarmupCompleted + 1;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return priorityThreadFactoryExternalSyntheticLambda0IAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ PriorityThreadFactoryExternalSyntheticLambda0[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 57;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            PriorityThreadFactoryExternalSyntheticLambda0[] priorityThreadFactoryExternalSyntheticLambda0ArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onWarmupCompleted + 111;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 78 / 0;
            }
            return priorityThreadFactoryExternalSyntheticLambda0ArrIAuthTabCallback;
        }
    }

    public PriorityThreadFactoryExternalSyntheticLambda0() {
        this(0, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 61;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 99;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriorityThreadFactoryExternalSyntheticLambda0)) {
            int i2 = onWarmupCompleted + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        PriorityThreadFactoryExternalSyntheticLambda0 priorityThreadFactoryExternalSyntheticLambda0 = (PriorityThreadFactoryExternalSyntheticLambda0) obj;
        if (this.totalAppliedLoanCount != priorityThreadFactoryExternalSyntheticLambda0.totalAppliedLoanCount) {
            return false;
        }
        if (!Intrinsics.areEqual(this.mandatoryGuideline, priorityThreadFactoryExternalSyntheticLambda0.mandatoryGuideline)) {
            int i4 = onWarmupCompleted + 95;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.loanStatuses, priorityThreadFactoryExternalSyntheticLambda0.loanStatuses)) {
            int i6 = onWarmupCompleted + 117;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = onWarmupCompleted + 25;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.totalAppliedLoanCount);
        return i3 == 0 ? (((iHashCode << 126) >> this.mandatoryGuideline.hashCode()) >>> 97) >>> this.loanStatuses.hashCode() : (((iHashCode * 31) + this.mandatoryGuideline.hashCode()) * 31) + this.loanStatuses.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanStatusGroup(totalAppliedLoanCount=" + this.totalAppliedLoanCount + ", mandatoryGuideline=" + this.mandatoryGuideline + ", loanStatuses=" + this.loanStatuses + ")";
        int i2 = onWarmupCompleted + 13;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.totalAppliedLoanCount);
        parcel.writeString(this.mandatoryGuideline);
        List<onWarmupCompleted> list = this.loanStatuses;
        parcel.writeInt(list.size());
        Iterator<onWarmupCompleted> it = list.iterator();
        int i3 = onWarmupCompleted + 39;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = onWarmupCompleted + 89;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class onWarmupCompleted implements Parcelable {
        public static final Parcelable.Creator<onWarmupCompleted> CREATOR;
        private static int IAuthTabCallback;
        private static int asInterface;
        private static byte[] onExtraCallback;
        private static short[] onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        @SerializedName("appliedLoanCount")
        private final int appliedLoanCount;

        @SerializedName("maxAmount")
        private final long maxAmount;

        @SerializedName("maxAmountProduct")
        private final onExtraCallback maxAmountProduct;

        @SerializedName("minInterestProduct")
        private final onExtraCallback minInterestProduct;

        @SerializedName("minInterestRate")
        private final float minInterestRate;

        @SerializedName("prescreenCompletedCompanyCount")
        private final int prescreenCompletedCompanyCount;

        @SerializedName("prescreenRemainSeconds")
        private final long prescreenRemainSeconds;

        @SerializedName("prescreenResultCtaWords")
        private final String prescreenResultCtaWords;

        @SerializedName("loanStatus")
        private LoanProductStatus status;

        @SerializedName("displayStatusName")
        private final String statusDisplayName;

        @SerializedName("loanType")
        private final ImagePipelineExperimentsBuilderExternalSyntheticLambda17 type;

        @SerializedName("loanTypeName")
        private final String typeDisplayName;
        private static final byte[] $$a = {63, 67, 46, -88};
        private static final int $$b = 168;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onTransact = 0;
        private static int asBinder = 1;
        private static int IAuthTabCallbackStub = 0;

        public static final class onExtraCallbackWithResult implements Parcelable.Creator<onWarmupCompleted> {
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onWarmupCompleted createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 3;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
                if (i3 == 0) {
                    int i4 = 68 / 0;
                }
                return onwarmupcompletedOnExtraCallbackWithResult;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onWarmupCompleted[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 111;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                onWarmupCompleted[] onwarmupcompletedArrOnExtraCallback = onExtraCallback(i);
                int i5 = onWarmupCompleted + 89;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return onwarmupcompletedArrOnExtraCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onWarmupCompleted[] onExtraCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 87;
                int i4 = i3 % 128;
                onNavigationEvent = i4;
                onWarmupCompleted[] onwarmupcompletedArr = new onWarmupCompleted[i];
                if (i3 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i4 + 73;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 94 / 0;
                }
                return onwarmupcompletedArr;
            }

            public final onWarmupCompleted onExtraCallbackWithResult(Parcel parcel) {
                onExtraCallback onextracallbackCreateFromParcel;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                ImagePipelineExperimentsBuilderExternalSyntheticLambda17 imagePipelineExperimentsBuilderExternalSyntheticLambda17CreateFromParcel = ImagePipelineExperimentsBuilderExternalSyntheticLambda17.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                LoanProductStatus loanProductStatusCreateFromParcel = LoanProductStatus.CREATOR.createFromParcel(parcel);
                String string2 = parcel.readString();
                float f = parcel.readFloat();
                long j = parcel.readLong();
                int i2 = parcel.readInt();
                onExtraCallback onextracallbackCreateFromParcel2 = parcel.readInt() == 0 ? null : onExtraCallback.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    onextracallbackCreateFromParcel = null;
                } else {
                    onextracallbackCreateFromParcel = onExtraCallback.CREATOR.createFromParcel(parcel);
                    int i3 = onNavigationEvent + 21;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                }
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(imagePipelineExperimentsBuilderExternalSyntheticLambda17CreateFromParcel, string, loanProductStatusCreateFromParcel, string2, f, j, i2, onextracallbackCreateFromParcel2, onextracallbackCreateFromParcel, parcel.readLong(), parcel.readString(), parcel.readInt());
                int i5 = onNavigationEvent + 63;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return onwarmupcompleted;
                }
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r6, byte r7, int r8) {
            /*
                byte[] r0 = o.PriorityThreadFactoryExternalSyntheticLambda0.onWarmupCompleted.$$a
                int r6 = r6 * 2
                int r6 = r6 + 1
                int r7 = r7 * 4
                int r7 = r7 + 115
                int r8 = r8 * 3
                int r8 = 3 - r8
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r8
                r4 = r2
                goto L2d
            L16:
                r3 = r2
            L17:
                int r8 = r8 + 1
                byte r4 = (byte) r7
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L26:
                r4 = r0[r8]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2d:
                int r7 = r7 + r8
                r8 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.PriorityThreadFactoryExternalSyntheticLambda0.onWarmupCompleted.$$c(int, byte, int):java.lang.String");
        }

        static {
            asInterface = 1;
            onTransact();
            CREATOR = new onExtraCallbackWithResult();
            int i = IAuthTabCallbackStub + 81;
            asInterface = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onWarmupCompleted() {
            this(null, null, null, null, 0.0f, 0L, 0, null, null, 0L, null, 0, 4095, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 101;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 91;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asBinder + 69;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (this.type != onwarmupcompleted.type) {
                int i5 = i3 + 39;
                asBinder = i5 % 128;
                return i5 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.typeDisplayName, onwarmupcompleted.typeDisplayName) || this.status != onwarmupcompleted.status) {
                return false;
            }
            if (!Intrinsics.areEqual(this.statusDisplayName, onwarmupcompleted.statusDisplayName)) {
                int i6 = onTransact + 59;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (Float.compare(this.minInterestRate, onwarmupcompleted.minInterestRate) != 0 || this.maxAmount != onwarmupcompleted.maxAmount || this.appliedLoanCount != onwarmupcompleted.appliedLoanCount || !Intrinsics.areEqual(this.minInterestProduct, onwarmupcompleted.minInterestProduct) || !Intrinsics.areEqual(this.maxAmountProduct, onwarmupcompleted.maxAmountProduct)) {
                return false;
            }
            if (this.prescreenRemainSeconds == onwarmupcompleted.prescreenRemainSeconds) {
                return Intrinsics.areEqual(this.prescreenResultCtaWords, onwarmupcompleted.prescreenResultCtaWords) && this.prescreenCompletedCompanyCount == onwarmupcompleted.prescreenCompletedCompanyCount;
            }
            int i8 = onTransact + 27;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = asBinder + 83;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.type.hashCode();
            int iHashCode3 = this.typeDisplayName.hashCode();
            int iHashCode4 = this.status.hashCode();
            int iHashCode5 = this.statusDisplayName.hashCode();
            int iHashCode6 = Float.hashCode(this.minInterestRate);
            int iHashCode7 = Long.hashCode(this.maxAmount);
            int iHashCode8 = Integer.hashCode(this.appliedLoanCount);
            onExtraCallback onextracallback = this.minInterestProduct;
            int iHashCode9 = 0;
            if (onextracallback == null) {
                int i4 = asBinder + 39;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = onextracallback.hashCode();
            }
            onExtraCallback onextracallback2 = this.maxAmountProduct;
            if (onextracallback2 != null) {
                iHashCode9 = onextracallback2.hashCode();
                int i6 = onTransact + 43;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
            }
            return (((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode9) * 31) + Long.hashCode(this.prescreenRemainSeconds)) * 31) + this.prescreenResultCtaWords.hashCode()) * 31) + Integer.hashCode(this.prescreenCompletedCompanyCount);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "LoanStatus(type=" + this.type + ", typeDisplayName=" + this.typeDisplayName + ", status=" + this.status + ", statusDisplayName=" + this.statusDisplayName + ", minInterestRate=" + this.minInterestRate + ", maxAmount=" + this.maxAmount + ", appliedLoanCount=" + this.appliedLoanCount + ", minInterestProduct=" + this.minInterestProduct + ", maxAmountProduct=" + this.maxAmountProduct + ", prescreenRemainSeconds=" + this.prescreenRemainSeconds + ", prescreenResultCtaWords=" + this.prescreenResultCtaWords + ", prescreenCompletedCompanyCount=" + this.prescreenCompletedCompanyCount + ")";
            int i2 = asBinder + 9;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = asBinder + 65;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.typeDisplayName);
            this.status.writeToParcel(parcel, i);
            parcel.writeString(this.statusDisplayName);
            parcel.writeFloat(this.minInterestRate);
            parcel.writeLong(this.maxAmount);
            parcel.writeInt(this.appliedLoanCount);
            onExtraCallback onextracallback = this.minInterestProduct;
            if (onextracallback == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                onextracallback.writeToParcel(parcel, i);
            }
            onExtraCallback onextracallback2 = this.maxAmountProduct;
            if (onextracallback2 == null) {
                parcel.writeInt(0);
                int i5 = asBinder + 7;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
            } else {
                parcel.writeInt(1);
                onextracallback2.writeToParcel(parcel, i);
            }
            parcel.writeLong(this.prescreenRemainSeconds);
            parcel.writeString(this.prescreenResultCtaWords);
            parcel.writeInt(this.prescreenCompletedCompanyCount);
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x0198 A[PHI: r0
          0x0198: PHI (r0v9 int) = (r0v8 int), (r0v43 int) binds: [B:40:0x0196, B:37:0x0184] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x019a A[PHI: r0
          0x019a: PHI (r0v40 int) = (r0v8 int), (r0v43 int) binds: [B:40:0x0196, B:37:0x0184] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(short r25, byte r26, int r27, int r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 667
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.PriorityThreadFactoryExternalSyntheticLambda0.onWarmupCompleted.a(short, byte, int, int, int, java.lang.Object[]):void");
        }

        public onWarmupCompleted(@NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda17 imagePipelineExperimentsBuilderExternalSyntheticLambda17, @NotNull String str, @NotNull LoanProductStatus loanProductStatus, @NotNull String str2, float f, long j, int i, @Nullable onExtraCallback onextracallback, @Nullable onExtraCallback onextracallback2, long j2, @NotNull String str3, int i2) {
            Intrinsics.checkNotNullParameter(imagePipelineExperimentsBuilderExternalSyntheticLambda17, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(loanProductStatus, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.type = imagePipelineExperimentsBuilderExternalSyntheticLambda17;
            this.typeDisplayName = str;
            this.status = loanProductStatus;
            this.statusDisplayName = str2;
            this.minInterestRate = f;
            this.maxAmount = j;
            this.appliedLoanCount = i;
            this.minInterestProduct = onextracallback;
            this.maxAmountProduct = onextracallback2;
            this.prescreenRemainSeconds = j2;
            this.prescreenResultCtaWords = str3;
            this.prescreenCompletedCompanyCount = i2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onWarmupCompleted(ImagePipelineExperimentsBuilderExternalSyntheticLambda17 imagePipelineExperimentsBuilderExternalSyntheticLambda17, String str, LoanProductStatus loanProductStatus, String str2, float f, long j, int i, onExtraCallback onextracallback, onExtraCallback onextracallback2, long j2, String str3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
            ImagePipelineExperimentsBuilderExternalSyntheticLambda17 imagePipelineExperimentsBuilderExternalSyntheticLambda172;
            long j3;
            onExtraCallback onextracallback3;
            long j4;
            String strIntern;
            if ((i3 & 1) != 0) {
                int i4 = asBinder + 57;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                imagePipelineExperimentsBuilderExternalSyntheticLambda172 = ImagePipelineExperimentsBuilderExternalSyntheticLambda17.CREDIT;
                int i6 = 2 % 2;
            } else {
                imagePipelineExperimentsBuilderExternalSyntheticLambda172 = imagePipelineExperimentsBuilderExternalSyntheticLambda17;
            }
            String str4 = (i3 & 2) != 0 ? "" : str;
            LoanProductStatus loanProductStatus2 = (i3 & 4) != 0 ? LoanProductStatus.INIT : loanProductStatus;
            String str5 = (i3 & 8) == 0 ? str2 : "";
            float f2 = (i3 & 16) != 0 ? 0.0f : f;
            if ((i3 & 32) != 0) {
                int i7 = 2 % 2;
                j3 = 0;
            } else {
                j3 = j;
            }
            int i8 = 0;
            int i9 = (i3 & 64) != 0 ? 0 : i;
            if ((i3 & 128) != 0) {
                int i10 = onTransact + 107;
                asBinder = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                int i11 = 2 % 2;
                onextracallback3 = null;
            } else {
                onextracallback3 = onextracallback;
            }
            onExtraCallback onextracallback4 = (i3 & 256) == 0 ? onextracallback2 : null;
            if ((i3 & 512) != 0) {
                int i12 = onTransact + 65;
                asBinder = i12 % 128;
                int i13 = i12 % 2;
                int i14 = 2 % 2;
                j4 = 0;
            } else {
                j4 = j2;
            }
            if ((i3 & 1024) != 0) {
                int i15 = onTransact + 35;
                asBinder = i15 % 128;
                int i16 = i15 % 2;
                Object[] objArr = new Object[1];
                a((short) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) - 24), (-202843629) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1345688027 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.rgb(0, 0, 0) + 16747711, objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                strIntern = str3;
            }
            if ((i3 & 2048) != 0) {
                int i17 = asBinder + 35;
                onTransact = i17 % 128;
                int i18 = i17 % 2;
            } else {
                i8 = i2;
            }
            this(imagePipelineExperimentsBuilderExternalSyntheticLambda172, str4, loanProductStatus2, str5, f2, j3, i9, onextracallback3, onextracallback4, j4, strIntern, i8);
        }

        public final ImagePipelineExperimentsBuilderExternalSyntheticLambda17 IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onTransact + 69;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            ImagePipelineExperimentsBuilderExternalSyntheticLambda17 imagePipelineExperimentsBuilderExternalSyntheticLambda17 = this.type;
            int i5 = i3 + 87;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return imagePipelineExperimentsBuilderExternalSyntheticLambda17;
        }

        public final LoanProductStatus asInterface() {
            int i = 2 % 2;
            int i2 = asBinder + 117;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            LoanProductStatus loanProductStatus = this.status;
            if (i3 != 0) {
                int i4 = 83 / 0;
            }
            return loanProductStatus;
        }

        public final float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 99;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            float f = this.minInterestRate;
            int i5 = i2 + 95;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 75 / 0;
            }
            return f;
        }

        public final long onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onTransact + 11;
            int i3 = i2 % 128;
            asBinder = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            long j = this.maxAmount;
            int i4 = i3 + 23;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                return j;
            }
            throw null;
        }

        public final int onExtraCallback() {
            int i = 2 % 2;
            int i2 = asBinder + 109;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return this.appliedLoanCount;
            }
            throw null;
        }

        public final int IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 87;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.prescreenCompletedCompanyCount;
            int i6 = i2 + 27;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            String str = new DecimalFormat("#.####", DecimalFormatSymbols.getInstance(Locale.ENGLISH)).format(Float.valueOf(this.minInterestRate)) + "%";
            int i2 = onTransact + 17;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class onExtraCallback implements Parcelable {
            public static final Parcelable.Creator<onExtraCallback> CREATOR = new C0003onExtraCallback();
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @SerializedName("amount")
            private final long amount;

            @SerializedName("companyLogoUrl")
            private final String companyLogoUrl;

            @SerializedName("companyName")
            private final String companyName;

            @SerializedName("interestRate")
            private final double interestRate;

            @SerializedName("productId")
            private final long productId;

            /* renamed from: o.PriorityThreadFactoryExternalSyntheticLambda0$onWarmupCompleted$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
            public static final class C0003onExtraCallback implements Parcelable.Creator<onExtraCallback> {
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ onExtraCallback createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 43;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        onWarmupCompleted(parcel);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    onExtraCallback onextracallbackOnWarmupCompleted = onWarmupCompleted(parcel);
                    int i3 = IAuthTabCallback + 13;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return onextracallbackOnWarmupCompleted;
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ onExtraCallback[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 49;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        onExtraCallbackWithResult(i);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    onExtraCallback[] onextracallbackArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
                    int i4 = IAuthTabCallback + 37;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return onextracallbackArrOnExtraCallbackWithResult;
                }

                public final onExtraCallback[] onExtraCallbackWithResult(int i) {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 107;
                    int i4 = i3 % 128;
                    IAuthTabCallback = i4;
                    int i5 = i3 % 2;
                    onExtraCallback[] onextracallbackArr = new onExtraCallback[i];
                    int i6 = i4 + 3;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    return onextracallbackArr;
                }

                public final onExtraCallback onWarmupCompleted(Parcel parcel) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    onExtraCallback onextracallback = new onExtraCallback(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readLong());
                    int i2 = IAuthTabCallback + 61;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return onextracallback;
                }
            }

            static {
                int i = onExtraCallback + 115;
                IAuthTabCallback = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public onExtraCallback() {
                this(0L, null, null, 0.0d, 0L, 31, null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 23;
                onExtraCallbackWithResult = i2 % 128;
                return i2 % 2 == 0 ? 1 : 0;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onExtraCallback)) {
                    int i2 = onNavigationEvent + 13;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                onExtraCallback onextracallback = (onExtraCallback) obj;
                if (this.amount != onextracallback.amount) {
                    int i4 = onNavigationEvent + 21;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.companyLogoUrl, onextracallback.companyLogoUrl) || !Intrinsics.areEqual(this.companyName, onextracallback.companyName) || Double.compare(this.interestRate, onextracallback.interestRate) != 0) {
                    return false;
                }
                if (this.productId == onextracallback.productId) {
                    return true;
                }
                int i6 = onExtraCallbackWithResult + 101;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 40 / 0;
                }
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 57;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = (((((((Long.hashCode(this.amount) * 31) + this.companyLogoUrl.hashCode()) * 31) + this.companyName.hashCode()) * 31) + Double.hashCode(this.interestRate)) * 31) + Long.hashCode(this.productId);
                int i4 = onNavigationEvent + 31;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return iHashCode;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "ProductStatus(amount=" + this.amount + ", companyLogoUrl=" + this.companyLogoUrl + ", companyName=" + this.companyName + ", interestRate=" + this.interestRate + ", productId=" + this.productId + ")";
                int i2 = onNavigationEvent + 105;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 97;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Object obj = null;
                Intrinsics.checkNotNullParameter(parcel, "");
                if (i4 != 0) {
                    parcel.writeLong(this.amount);
                    parcel.writeString(this.companyLogoUrl);
                    parcel.writeString(this.companyName);
                    parcel.writeDouble(this.interestRate);
                    parcel.writeLong(this.productId);
                    obj.hashCode();
                    throw null;
                }
                parcel.writeLong(this.amount);
                parcel.writeString(this.companyLogoUrl);
                parcel.writeString(this.companyName);
                parcel.writeDouble(this.interestRate);
                parcel.writeLong(this.productId);
                int i5 = onNavigationEvent + 115;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            public onExtraCallback(long j, @NotNull String str, @NotNull String str2, double d, long j2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.amount = j;
                this.companyLogoUrl = str;
                this.companyName = str2;
                this.interestRate = d;
                this.productId = j2;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ onExtraCallback(long j, String str, String str2, double d, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                long j3;
                String str3;
                double d2;
                if ((i & 1) != 0) {
                    int i2 = onExtraCallbackWithResult + 79;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 2 % 2;
                    }
                    j3 = 0;
                } else {
                    j3 = j;
                }
                String str4 = "";
                if ((i & 2) != 0) {
                    int i4 = 2 % 2;
                    str3 = "";
                } else {
                    str3 = str;
                }
                if ((i & 4) != 0) {
                    int i5 = onNavigationEvent;
                    int i6 = i5 + 45;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        throw null;
                    }
                    int i7 = i5 + 69;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = 2 % 2;
                } else {
                    str4 = str2;
                }
                if ((i & 8) != 0) {
                    int i10 = 2 % 2;
                    d2 = 0.0d;
                } else {
                    d2 = d;
                }
                this(j3, str3, str4, d2, (i & 16) == 0 ? j2 : 0L);
            }
        }

        static void onTransact() {
            onNavigationEvent = -1471087131;
            onWarmupCompleted = -1538806965;
            IAuthTabCallback = 193764466;
            onExtraCallbackWithResult = new short[]{-10557, -10232};
        }
    }

    public PriorityThreadFactoryExternalSyntheticLambda0(int i, @NotNull String str, @NotNull List<onWarmupCompleted> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.totalAppliedLoanCount = i;
        this.mandatoryGuideline = str;
        this.loanStatuses = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PriorityThreadFactoryExternalSyntheticLambda0(int i, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = IAuthTabCallback + 97;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            i = i3 % 2 == 0 ? 1 : 0;
            int i5 = i4 + 121;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 2;
            } else {
                int i7 = 2 % 2;
            }
        }
        if ((i2 & 2) != 0) {
            int i8 = onWarmupCompleted + 87;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 5 % 2;
            } else {
                int i10 = 2 % 2;
            }
            str = "";
        }
        this(i, str, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        int i = onExtraCallback + 11;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(@Nullable Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 25;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.error = th;
        if (i4 == 0) {
            int i5 = 76 / 0;
        }
        int i6 = i2 + 99;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public final Throwable onNavigationEvent() {
        Throwable th;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            th = this.error;
            int i4 = 68 / 0;
        } else {
            th = this.error;
        }
        int i5 = i3 + 39;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return th;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        return (o.PriorityThreadFactoryExternalSyntheticLambda0.onWarmupCompleted) r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.PriorityThreadFactoryExternalSyntheticLambda0.onWarmupCompleted IAuthTabCallback(@org.jetbrains.annotations.NotNull o.ImagePipelineExperimentsBuilderExternalSyntheticLambda17 r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.PriorityThreadFactoryExternalSyntheticLambda0.onWarmupCompleted
            int r1 = r1 + 97
            int r2 = r1 % 128
            o.PriorityThreadFactoryExternalSyntheticLambda0.IAuthTabCallback = r2
            int r1 = r1 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.util.List<o.PriorityThreadFactoryExternalSyntheticLambda0$onWarmupCompleted> r1 = r5.loanStatuses
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            r4 = r2
            o.PriorityThreadFactoryExternalSyntheticLambda0$onWarmupCompleted r4 = (o.PriorityThreadFactoryExternalSyntheticLambda0.onWarmupCompleted) r4
            o.ImagePipelineExperimentsBuilderExternalSyntheticLambda17 r4 = r4.IAuthTabCallbackDefault()
            if (r4 != r6) goto L19
            int r6 = o.PriorityThreadFactoryExternalSyntheticLambda0.IAuthTabCallback
            int r6 = r6 + 105
            int r1 = r6 % 128
            o.PriorityThreadFactoryExternalSyntheticLambda0.onWarmupCompleted = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L3a
            r3 = r2
            goto L3e
        L3a:
            r3.hashCode()
            throw r3
        L3e:
            o.PriorityThreadFactoryExternalSyntheticLambda0$onWarmupCompleted r3 = (o.PriorityThreadFactoryExternalSyntheticLambda0.onWarmupCompleted) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.PriorityThreadFactoryExternalSyntheticLambda0.IAuthTabCallback(o.ImagePipelineExperimentsBuilderExternalSyntheticLambda17):o.PriorityThreadFactoryExternalSyntheticLambda0$onWarmupCompleted");
    }
}
