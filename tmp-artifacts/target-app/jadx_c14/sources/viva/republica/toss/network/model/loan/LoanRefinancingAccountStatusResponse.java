package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.ImagePipelineExternalSyntheticLambda0;
import o.liq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanRefinancingAccountStatusResponse implements Parcelable {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final LoanRefinancingBottomSheetInfo bottomSheet;
    private final String errorMessage;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LoanRefinancingAccountStatusResponse> CREATOR = new onWarmupCompleted();

    public static final class onWarmupCompleted implements Parcelable.Creator<LoanRefinancingAccountStatusResponse> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final LoanRefinancingAccountStatusResponse IAuthTabCallback(Parcel parcel) {
            LoanRefinancingBottomSheetInfo loanRefinancingBottomSheetInfoCreateFromParcel;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i2 = onWarmupCompleted + 59;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                loanRefinancingBottomSheetInfoCreateFromParcel = null;
            } else {
                loanRefinancingBottomSheetInfoCreateFromParcel = LoanRefinancingBottomSheetInfo.CREATOR.createFromParcel(parcel);
                int i4 = onWarmupCompleted + 119;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
            return new LoanRefinancingAccountStatusResponse(string, string2, loanRefinancingBottomSheetInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanRefinancingAccountStatusResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            LoanRefinancingAccountStatusResponse loanRefinancingAccountStatusResponseIAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = onNavigationEvent + 21;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return loanRefinancingAccountStatusResponseIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanRefinancingAccountStatusResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 91;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return onExtraCallbackWithResult(i);
            }
            onExtraCallbackWithResult(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final LoanRefinancingAccountStatusResponse[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 47;
            onNavigationEvent = i3 % 128;
            LoanRefinancingAccountStatusResponse[] loanRefinancingAccountStatusResponseArr = new LoanRefinancingAccountStatusResponse[i];
            if (i3 % 2 == 0) {
                return loanRefinancingAccountStatusResponseArr;
            }
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public LoanRefinancingAccountStatusResponse() {
        this((String) null, (String) null, (LoanRefinancingBottomSheetInfo) null, 7, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 79;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 107;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanRefinancingAccountStatusResponse)) {
            return false;
        }
        LoanRefinancingAccountStatusResponse loanRefinancingAccountStatusResponse = (LoanRefinancingAccountStatusResponse) obj;
        if (!Intrinsics.areEqual(this.type, loanRefinancingAccountStatusResponse.type)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.errorMessage, loanRefinancingAccountStatusResponse.errorMessage)) {
            int i3 = onExtraCallback + 59;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.bottomSheet, loanRefinancingAccountStatusResponse.bottomSheet)) {
            return true;
        }
        int i5 = onExtraCallback + 101;
        onNavigationEvent = i5 % 128;
        return i5 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.type.hashCode();
        int iHashCode3 = this.errorMessage.hashCode();
        LoanRefinancingBottomSheetInfo loanRefinancingBottomSheetInfo = this.bottomSheet;
        if (loanRefinancingBottomSheetInfo == null) {
            int i4 = onExtraCallback + 77;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 2;
            }
            iHashCode = 0;
        } else {
            iHashCode = loanRefinancingBottomSheetInfo.hashCode();
        }
        int i6 = (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
        int i7 = onNavigationEvent + 83;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanRefinancingAccountStatusResponse(type=" + this.type + ", errorMessage=" + this.errorMessage + ", bottomSheet=" + this.bottomSheet + ")";
        int i2 = onNavigationEvent + 19;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 40 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.errorMessage);
        LoanRefinancingBottomSheetInfo loanRefinancingBottomSheetInfo = this.bottomSheet;
        if (loanRefinancingBottomSheetInfo != null) {
            parcel.writeInt(1);
            loanRefinancingBottomSheetInfo.writeToParcel(parcel, i);
            return;
        }
        int i3 = onExtraCallback + 5;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        parcel.writeInt(0);
        int i5 = onNavigationEvent + 107;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanRefinancingAccountStatusResponse> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            LoanRefinancingAccountStatusResponse$$serializer loanRefinancingAccountStatusResponse$$serializer = LoanRefinancingAccountStatusResponse$$serializer.INSTANCE;
            int i4 = IAuthTabCallback + 93;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return loanRefinancingAccountStatusResponse$$serializer;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ LoanRefinancingAccountStatusResponse(int r2, java.lang.String r3, java.lang.String r4, viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo r5, o.okycx r6) {
        /*
            r1 = this;
            r1.<init>()
            r6 = r2 & 1
            java.lang.String r0 = ""
            if (r6 != 0) goto Lc
            r1.type = r0
            goto Le
        Lc:
            r1.type = r3
        Le:
            r3 = r2 & 2
            r6 = 2
            if (r3 != 0) goto L20
            r1.errorMessage = r0
            int r3 = viva.republica.toss.network.model.loan.LoanRefinancingAccountStatusResponse.onNavigationEvent
            int r3 = r3 + 91
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingAccountStatusResponse.onExtraCallback = r4
            int r3 = r3 % r6
        L1e:
            int r6 = r6 % r6
            goto L2d
        L20:
            r1.errorMessage = r4
            int r3 = viva.republica.toss.network.model.loan.LoanRefinancingAccountStatusResponse.onExtraCallback
            int r3 = r3 + 125
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingAccountStatusResponse.onNavigationEvent = r4
            int r3 = r3 % r6
            if (r3 == 0) goto L1e
        L2d:
            r2 = r2 & 4
            if (r2 != 0) goto L35
            r2 = 0
            r1.bottomSheet = r2
            return
        L35:
            r1.bottomSheet = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanRefinancingAccountStatusResponse.<init>(int, java.lang.String, java.lang.String, viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo, o.okycx):void");
    }

    public LoanRefinancingAccountStatusResponse(@NotNull String str, @NotNull String str2, @Nullable LoanRefinancingBottomSheetInfo loanRefinancingBottomSheetInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.type = str;
        this.errorMessage = str2;
        this.bottomSheet = loanRefinancingBottomSheetInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.loan.LoanRefinancingAccountStatusResponse r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            java.lang.String r3 = ""
            if (r2 != 0) goto L2a
            int r2 = viva.republica.toss.network.model.loan.LoanRefinancingAccountStatusResponse.onNavigationEvent
            int r2 = r2 + 15
            int r4 = r2 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingAccountStatusResponse.onExtraCallback = r4
            int r2 = r2 % r0
            if (r2 == 0) goto L20
            java.lang.String r2 = r5.type
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L2f
            goto L2a
        L20:
            java.lang.String r5 = r5.type
            kotlin.jvm.internal.Intrinsics.areEqual(r5, r3)
            r5 = 0
            r5.hashCode()
            throw r5
        L2a:
            java.lang.String r2 = r5.type
            r6.onExtraCallback(r7, r1, r2)
        L2f:
            r1 = 1
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            if (r2 != 0) goto L47
            int r2 = viva.republica.toss.network.model.loan.LoanRefinancingAccountStatusResponse.onNavigationEvent
            int r2 = r2 + 123
            int r4 = r2 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingAccountStatusResponse.onExtraCallback = r4
            int r2 = r2 % r0
            java.lang.String r2 = r5.errorMessage
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L4c
        L47:
            java.lang.String r2 = r5.errorMessage
            r6.onExtraCallback(r7, r1, r2)
        L4c:
            boolean r1 = r6.onWarmupCompleted(r7, r0)
            if (r1 != 0) goto L56
            viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo r1 = r5.bottomSheet
            if (r1 == 0) goto L5d
        L56:
            viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo$$serializer r1 = viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo$$serializer.INSTANCE
            viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo r5 = r5.bottomSheet
            r6.onExtraCallbackWithResult(r7, r0, r1, r5)
        L5d:
            int r5 = viva.republica.toss.network.model.loan.LoanRefinancingAccountStatusResponse.onExtraCallback
            int r5 = r5 + 71
            int r6 = r5 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingAccountStatusResponse.onNavigationEvent = r6
            int r5 = r5 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanRefinancingAccountStatusResponse.onExtraCallbackWithResult(viva.republica.toss.network.model.loan.LoanRefinancingAccountStatusResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanRefinancingAccountStatusResponse(String str, String str2, LoanRefinancingBottomSheetInfo loanRefinancingBottomSheetInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 115;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = onNavigationEvent + 73;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            str2 = "";
        }
        this(str, str2, (i & 4) != 0 ? null : loanRefinancingBottomSheetInfo);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.errorMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LoanRefinancingBottomSheetInfo IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        LoanRefinancingBottomSheetInfo loanRefinancingBottomSheetInfo = this.bottomSheet;
        int i5 = i3 + 25;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return loanRefinancingBottomSheetInfo;
    }

    public final ImagePipelineExternalSyntheticLambda0 onWarmupCompleted() {
        Object obj;
        Object next;
        int i = 2 % 2;
        Iterator it = ImagePipelineExternalSyntheticLambda0.getEntries().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i2 = onNavigationEvent + 79;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.areEqual(((ImagePipelineExternalSyntheticLambda0) it.next()).name(), this.type);
                throw null;
            }
            next = it.next();
            if (Intrinsics.areEqual(((ImagePipelineExternalSyntheticLambda0) next).name(), this.type)) {
                break;
            }
        }
        ImagePipelineExternalSyntheticLambda0 imagePipelineExternalSyntheticLambda0 = (ImagePipelineExternalSyntheticLambda0) next;
        if (imagePipelineExternalSyntheticLambda0 == null) {
            int i3 = onExtraCallback + 101;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return ImagePipelineExternalSyntheticLambda0.AVAILABLE;
        }
        int i5 = onNavigationEvent + 5;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return imagePipelineExternalSyntheticLambda0;
        }
        obj.hashCode();
        throw null;
    }
}
