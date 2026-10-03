package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda22;
import o.TombstoneProtosMemoryMappingBuilder;
import o.liq;
import o.okycx;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanRefinancingAvailableStatus$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanRefinancingAvailableStatus implements Parcelable {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final boolean available;
    private final ImagePipelineExperimentsBuilderExternalSyntheticLambda22 introStatus;
    private final String reason;
    private String scheduleMessage;
    private boolean scheduled;
    private final IntroErrorReason screenInfo;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LoanRefinancingAvailableStatus> CREATOR = new onExtraCallback();
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanRefinancingAvailableStatus$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                LoanRefinancingAvailableStatus.onNavigationEvent();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerOnNavigationEvent = LoanRefinancingAvailableStatus.onNavigationEvent();
            int i3 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerOnNavigationEvent;
        }
    }), null, null, null, null};

    public static final class onExtraCallback implements Parcelable.Creator<LoanRefinancingAvailableStatus> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final LoanRefinancingAvailableStatus[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 55;
            onExtraCallbackWithResult = i4 % 128;
            Object obj = null;
            LoanRefinancingAvailableStatus[] loanRefinancingAvailableStatusArr = new LoanRefinancingAvailableStatus[i];
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 53;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return loanRefinancingAvailableStatusArr;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanRefinancingAvailableStatus createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            LoanRefinancingAvailableStatus loanRefinancingAvailableStatusOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = onWarmupCompleted + 99;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 80 / 0;
            }
            return loanRefinancingAvailableStatusOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanRefinancingAvailableStatus[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            LoanRefinancingAvailableStatus[] loanRefinancingAvailableStatusArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onExtraCallbackWithResult + 9;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 34 / 0;
            }
            return loanRefinancingAvailableStatusArrIAuthTabCallback;
        }

        public final LoanRefinancingAvailableStatus onExtraCallbackWithResult(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() != 0) {
                int i4 = onWarmupCompleted;
                int i5 = i4 + 3;
                onExtraCallbackWithResult = i5 % 128;
                boolean z2 = i5 % 2 != 0;
                int i6 = i4 + 35;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 3 % 4;
                }
                z = z2;
            } else {
                z = false;
            }
            return new LoanRefinancingAvailableStatus(z, ImagePipelineExperimentsBuilderExternalSyntheticLambda22.valueOf(parcel.readString()), parcel.readString(), IntroErrorReason.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString());
        }
    }

    public LoanRefinancingAvailableStatus() {
        this(false, (ImagePipelineExperimentsBuilderExternalSyntheticLambda22) null, (String) null, (IntroErrorReason) null, false, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = ~i4;
        int i10 = (~(i7 | i8 | i9)) | (~(i | i4));
        int i11 = ~(i7 | i9);
        int i12 = i | i11;
        int i13 = (~(i4 | i3)) | i11 | (~(i8 | i3));
        int i14 = i3 + i + i2 + (296844165 * i5) + (1729652556 * i6);
        int i15 = i14 * i14;
        int i16 = ((i3 * 599922083) - 580124672) + (599922083 * i) + (2088888926 * i10) + ((-117189444) * i12) + ((-2088888926) * i13) + ((-1606156288) * i2) + ((-279707648) * i5) + ((-265289728) * i6) + (2117271552 * i15);
        int i17 = (i3 * (-1181628991)) + 1322814002 + (i * (-1181628991)) + (i10 * (-118)) + (i12 * (-236)) + (i13 * 118) + (i2 * (-1181629109)) + (i5 * (-698251017)) + (i6 * 1773125444) + (i15 * 938541056);
        return i16 + ((i17 * i17) * (-109772800)) != 1 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.loan.LoanIntroStatus", ImagePipelineExperimentsBuilderExternalSyntheticLambda22.values());
        int i4 = onExtraCallback + 43;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub();
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i3 = onExtraCallback + 7;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerIAuthTabCallbackStub;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 41;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 81;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 81;
        onExtraCallback = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanRefinancingAvailableStatus)) {
            return false;
        }
        LoanRefinancingAvailableStatus loanRefinancingAvailableStatus = (LoanRefinancingAvailableStatus) obj;
        if (this.available != loanRefinancingAvailableStatus.available) {
            int i4 = i2 + 123;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (this.introStatus != loanRefinancingAvailableStatus.introStatus) {
            return false;
        }
        if (!Intrinsics.areEqual(this.reason, loanRefinancingAvailableStatus.reason)) {
            int i5 = onExtraCallback + 63;
            int i6 = i5 % 128;
            onExtraCallbackWithResult = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 31;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.screenInfo, loanRefinancingAvailableStatus.screenInfo)) {
            int i10 = onExtraCallback + 31;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.scheduled != loanRefinancingAvailableStatus.scheduled || !Intrinsics.areEqual(this.scheduleMessage, loanRefinancingAvailableStatus.scheduleMessage)) {
            return false;
        }
        int i12 = onExtraCallbackWithResult + 97;
        onExtraCallback = i12 % 128;
        if (i12 % 2 == 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((Boolean.hashCode(this.available) * 31) + this.introStatus.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.screenInfo.hashCode()) * 31) + Boolean.hashCode(this.scheduled)) * 31) + this.scheduleMessage.hashCode();
        int i4 = onExtraCallbackWithResult + 101;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanRefinancingAvailableStatus(available=" + this.available + ", introStatus=" + this.introStatus + ", reason=" + this.reason + ", screenInfo=" + this.screenInfo + ", scheduled=" + this.scheduled + ", scheduleMessage=" + this.scheduleMessage + ")";
        int i2 = onExtraCallbackWithResult + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 97;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.available ? 1 : 0);
        parcel.writeString(this.introStatus.name());
        parcel.writeString(this.reason);
        this.screenInfo.writeToParcel(parcel, i);
        parcel.writeInt(this.scheduled ? 1 : 0);
        parcel.writeString(this.scheduleMessage);
        int i5 = onExtraCallback + 89;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanRefinancingAvailableStatus> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            LoanRefinancingAvailableStatus$.serializer serializerVar = LoanRefinancingAvailableStatus$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        int i = IAuthTabCallback + 17;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ LoanRefinancingAvailableStatus(int i, boolean z, ImagePipelineExperimentsBuilderExternalSyntheticLambda22 imagePipelineExperimentsBuilderExternalSyntheticLambda22, String str, IntroErrorReason introErrorReason, boolean z2, String str2, okycx okycxVar) {
        boolean z3;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda22 imagePipelineExperimentsBuilderExternalSyntheticLambda222;
        if ((i & 1) == 0) {
            int i2 = 2 % 2;
            z3 = true;
        } else {
            z3 = z;
        }
        this.available = z3;
        if ((i & 2) == 0) {
            int i3 = onExtraCallback + 33;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            imagePipelineExperimentsBuilderExternalSyntheticLambda222 = ImagePipelineExperimentsBuilderExternalSyntheticLambda22.AVAILABLE;
        } else {
            imagePipelineExperimentsBuilderExternalSyntheticLambda222 = imagePipelineExperimentsBuilderExternalSyntheticLambda22;
        }
        this.introStatus = imagePipelineExperimentsBuilderExternalSyntheticLambda222;
        if ((i & 4) == 0) {
            int i5 = onExtraCallbackWithResult + 1;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            this.reason = "";
            if (i6 != 0) {
                throw null;
            }
        } else {
            this.reason = str;
            int i7 = 2 % 2;
        }
        if ((i & 8) == 0) {
            this.screenInfo = new IntroErrorReason((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        } else {
            this.screenInfo = introErrorReason;
            int i8 = 2 % 2;
        }
        if ((i & 16) == 0) {
            this.scheduled = false;
        } else {
            this.scheduled = z2;
            int i9 = 2 % 2;
        }
        if ((i & 32) != 0) {
            this.scheduleMessage = str2;
            return;
        }
        int i10 = onExtraCallbackWithResult + 53;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        this.scheduleMessage = "";
    }

    public LoanRefinancingAvailableStatus(boolean z, @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda22 imagePipelineExperimentsBuilderExternalSyntheticLambda22, @NotNull String str, @NotNull IntroErrorReason introErrorReason, boolean z2, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(imagePipelineExperimentsBuilderExternalSyntheticLambda22, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(introErrorReason, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.available = z;
        this.introStatus = imagePipelineExperimentsBuilderExternalSyntheticLambda22;
        this.reason = str;
        this.screenInfo = introErrorReason;
        this.scheduled = z2;
        this.scheduleMessage = str2;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 61;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 61;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallbackWithResult(java.lang.Object[] r14) {
        /*
            r0 = 0
            r1 = r14[r0]
            viva.republica.toss.network.model.loan.LoanRefinancingAvailableStatus r1 = (viva.republica.toss.network.model.loan.LoanRefinancingAvailableStatus) r1
            r2 = 1
            r3 = r14[r2]
            o.vyl r3 = (o.vyl) r3
            r4 = 2
            r14 = r14[r4]
            kotlinx.serialization.descriptors.SerialDescriptor r14 = (kotlinx.serialization.descriptors.SerialDescriptor) r14
            int r5 = r4 % r4
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r5 = viva.republica.toss.network.model.loan.LoanRefinancingAvailableStatus.$childSerializers
            boolean r6 = r3.onWarmupCompleted(r14, r0)
            if (r6 != 0) goto L26
            int r6 = viva.republica.toss.network.model.loan.LoanRefinancingAvailableStatus.onExtraCallbackWithResult
            int r6 = r6 + 17
            int r7 = r6 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingAvailableStatus.onExtraCallback = r7
            int r6 = r6 % r4
            boolean r6 = r1.available
            if (r6 == r2) goto L2b
        L26:
            boolean r6 = r1.available
            r3.onNavigationEvent(r14, r0, r6)
        L2b:
            boolean r0 = r3.onWarmupCompleted(r14, r2)
            r0 = r0 ^ r2
            if (r0 == 0) goto L38
            o.ImagePipelineExperimentsBuilderExternalSyntheticLambda22 r0 = r1.introStatus
            o.ImagePipelineExperimentsBuilderExternalSyntheticLambda22 r6 = o.ImagePipelineExperimentsBuilderExternalSyntheticLambda22.AVAILABLE
            if (r0 == r6) goto L45
        L38:
            r0 = r5[r2]
            java.lang.Object r0 = r0.getValue()
            o.py r0 = (o.py) r0
            o.ImagePipelineExperimentsBuilderExternalSyntheticLambda22 r5 = r1.introStatus
            r3.onNavigationEvent(r14, r2, r0, r5)
        L45:
            boolean r0 = r3.onWarmupCompleted(r14, r4)
            java.lang.String r2 = ""
            if (r0 != 0) goto L55
            java.lang.String r0 = r1.reason
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 != 0) goto L5a
        L55:
            java.lang.String r0 = r1.reason
            r3.onExtraCallback(r14, r4, r0)
        L5a:
            r0 = 3
            boolean r5 = r3.onWarmupCompleted(r14, r0)
            if (r5 != 0) goto L76
            viva.republica.toss.network.model.loan.IntroErrorReason r5 = r1.screenInfo
            viva.republica.toss.network.model.loan.IntroErrorReason r13 = new viva.republica.toss.network.model.loan.IntroErrorReason
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 15
            r12 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r13)
            if (r5 != 0) goto L7d
        L76:
            viva.republica.toss.network.model.loan.IntroErrorReason$$serializer r5 = viva.republica.toss.network.model.loan.IntroErrorReason$$serializer.INSTANCE
            viva.republica.toss.network.model.loan.IntroErrorReason r6 = r1.screenInfo
            r3.onNavigationEvent(r14, r0, r5, r6)
        L7d:
            r0 = 4
            boolean r5 = r3.onWarmupCompleted(r14, r0)
            if (r5 != 0) goto L88
            boolean r5 = r1.scheduled
            if (r5 == 0) goto L8d
        L88:
            boolean r5 = r1.scheduled
            r3.onNavigationEvent(r14, r0, r5)
        L8d:
            r0 = 5
            boolean r5 = r3.onWarmupCompleted(r14, r0)
            r6 = 0
            if (r5 != 0) goto Lb2
            int r5 = viva.republica.toss.network.model.loan.LoanRefinancingAvailableStatus.onExtraCallback
            int r5 = r5 + 115
            int r7 = r5 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingAvailableStatus.onExtraCallbackWithResult = r7
            int r5 = r5 % r4
            if (r5 == 0) goto La9
            java.lang.String r5 = r1.scheduleMessage
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r2)
            if (r2 != 0) goto Lb7
            goto Lb2
        La9:
            java.lang.String r14 = r1.scheduleMessage
            kotlin.jvm.internal.Intrinsics.areEqual(r14, r2)
            r6.hashCode()
            throw r6
        Lb2:
            java.lang.String r1 = r1.scheduleMessage
            r3.onExtraCallback(r14, r0, r1)
        Lb7:
            int r14 = viva.republica.toss.network.model.loan.LoanRefinancingAvailableStatus.onExtraCallbackWithResult
            int r14 = r14 + 79
            int r0 = r14 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingAvailableStatus.onExtraCallback = r0
            int r14 = r14 % r4
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanRefinancingAvailableStatus.onExtraCallbackWithResult(java.lang.Object[]):java.lang.Object");
    }

    public /* synthetic */ LoanRefinancingAvailableStatus(boolean z, ImagePipelineExperimentsBuilderExternalSyntheticLambda22 imagePipelineExperimentsBuilderExternalSyntheticLambda22, String str, IntroErrorReason introErrorReason, boolean z2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ImagePipelineExperimentsBuilderExternalSyntheticLambda22 imagePipelineExperimentsBuilderExternalSyntheticLambda222;
        String str3;
        IntroErrorReason introErrorReason2;
        boolean z3 = (i & 1) != 0 ? true : z;
        if ((i & 2) != 0) {
            imagePipelineExperimentsBuilderExternalSyntheticLambda222 = ImagePipelineExperimentsBuilderExternalSyntheticLambda22.AVAILABLE;
            int i2 = onExtraCallbackWithResult + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            imagePipelineExperimentsBuilderExternalSyntheticLambda222 = imagePipelineExperimentsBuilderExternalSyntheticLambda22;
        }
        String str4 = "";
        if ((i & 4) != 0) {
            int i5 = onExtraCallback + 113;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            str3 = "";
        } else {
            str3 = str;
        }
        if ((i & 8) != 0) {
            introErrorReason2 = new IntroErrorReason((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
            int i7 = 2 % 2;
        } else {
            introErrorReason2 = introErrorReason;
        }
        boolean z4 = (i & 16) != 0 ? false : z2;
        if ((i & 32) != 0) {
            int i8 = 2 % 2;
        } else {
            str4 = str2;
        }
        this(z3, imagePipelineExperimentsBuilderExternalSyntheticLambda222, str3, introErrorReason2, z4, str4);
    }

    public final ImagePipelineExperimentsBuilderExternalSyntheticLambda22 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda22 imagePipelineExperimentsBuilderExternalSyntheticLambda22 = this.introStatus;
        int i5 = i3 + 73;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return imagePipelineExperimentsBuilderExternalSyntheticLambda22;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.reason;
        int i5 = i2 + 1;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final IntroErrorReason IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 57;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        IntroErrorReason introErrorReason = this.screenInfo;
        int i5 = i2 + 93;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 / 0;
        }
        return introErrorReason;
    }

    public final boolean asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.scheduled;
        int i5 = i3 + 33;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 107;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        this.scheduled = z;
        int i5 = i2 + 25;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LoanRefinancingAvailableStatus loanRefinancingAvailableStatus = (LoanRefinancingAvailableStatus) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = loanRefinancingAvailableStatus.scheduleMessage;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 19;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
        return str;
    }

    public final void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.scheduleMessage = str;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.scheduleMessage = str;
        int i3 = onExtraCallbackWithResult + 27;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(LoanRefinancingAvailableStatus loanRefinancingAvailableStatus, vyl vylVar, SerialDescriptor serialDescriptor) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        IAuthTabCallback(-1847232437, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1847232437, iOnExtraCallbackWithResult, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{loanRefinancingAvailableStatus, vylVar, serialDescriptor}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
    }

    public final String onExtraCallback() {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (String) IAuthTabCallback(-2044911965, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 2044911966, iOnExtraCallbackWithResult, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{this}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
    }
}
