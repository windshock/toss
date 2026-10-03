package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.loan.LoanFunnelType;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda31 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    @SerializedName("groupId")
    private final long groupId;

    @SerializedName("preScreenData")
    private final ImagePipelineExperimentsBuilderExternalSyntheticLambda12 preScreenData;

    @SerializedName("preScreenType")
    private final LoanFunnelType preScreenType;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r10 instanceof o.ImagePipelineExperimentsBuilderExternalSyntheticLambda31) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r10 = (o.ImagePipelineExperimentsBuilderExternalSyntheticLambda31) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r9.groupId == r10.groupId) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        r1 = r1 + 73;
        o.ImagePipelineExperimentsBuilderExternalSyntheticLambda31.onExtraCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if ((r1 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9.preScreenData, r10.preScreenData) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        if (r9.preScreenType == r10.preScreenType) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        r10 = o.ImagePipelineExperimentsBuilderExternalSyntheticLambda31.IAuthTabCallback + 15;
        o.ImagePipelineExperimentsBuilderExternalSyntheticLambda31.onExtraCallback = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if ((r10 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r9 == r10) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r9 == r10) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.ImagePipelineExperimentsBuilderExternalSyntheticLambda31.IAuthTabCallback
            int r2 = r1 + 67
            int r3 = r2 % 128
            o.ImagePipelineExperimentsBuilderExternalSyntheticLambda31.onExtraCallback = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            r2 = 8
            int r2 = r2 / r4
            if (r9 != r10) goto L19
            goto L18
        L16:
            if (r9 != r10) goto L19
        L18:
            return r3
        L19:
            boolean r2 = r10 instanceof o.ImagePipelineExperimentsBuilderExternalSyntheticLambda31
            if (r2 != 0) goto L1e
            return r4
        L1e:
            o.ImagePipelineExperimentsBuilderExternalSyntheticLambda31 r10 = (o.ImagePipelineExperimentsBuilderExternalSyntheticLambda31) r10
            long r5 = r9.groupId
            long r7 = r10.groupId
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L34
            int r1 = r1 + 73
            int r10 = r1 % 128
            o.ImagePipelineExperimentsBuilderExternalSyntheticLambda31.onExtraCallback = r10
            int r1 = r1 % r0
            if (r1 == 0) goto L32
            return r4
        L32:
            r10 = 0
            throw r10
        L34:
            o.ImagePipelineExperimentsBuilderExternalSyntheticLambda12 r1 = r9.preScreenData
            o.ImagePipelineExperimentsBuilderExternalSyntheticLambda12 r2 = r10.preScreenData
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L3f
            return r4
        L3f:
            viva.republica.toss.network.model.loan.LoanFunnelType r1 = r9.preScreenType
            viva.republica.toss.network.model.loan.LoanFunnelType r10 = r10.preScreenType
            if (r1 == r10) goto L52
            int r10 = o.ImagePipelineExperimentsBuilderExternalSyntheticLambda31.IAuthTabCallback
            int r10 = r10 + 15
            int r1 = r10 % 128
            o.ImagePipelineExperimentsBuilderExternalSyntheticLambda31.onExtraCallback = r1
            int r10 = r10 % r0
            if (r10 != 0) goto L51
            return r3
        L51:
            return r4
        L52:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ImagePipelineExperimentsBuilderExternalSyntheticLambda31.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallback = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((Long.hashCode(this.groupId) - 50) - this.preScreenData.hashCode()) + 48) >>> this.preScreenType.hashCode() : (((Long.hashCode(this.groupId) * 31) + this.preScreenData.hashCode()) * 31) + this.preScreenType.hashCode();
        int i3 = IAuthTabCallback + 85;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanRefinancingPreScreenRequest(groupId=" + this.groupId + ", preScreenData=" + this.preScreenData + ", preScreenType=" + this.preScreenType + ")";
        int i2 = IAuthTabCallback + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ImagePipelineExperimentsBuilderExternalSyntheticLambda31(long j, @NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12, @NotNull LoanFunnelType loanFunnelType) {
        Intrinsics.checkNotNullParameter(imagePipelineExperimentsBuilderExternalSyntheticLambda12, "");
        Intrinsics.checkNotNullParameter(loanFunnelType, "");
        this.groupId = j;
        this.preScreenData = imagePipelineExperimentsBuilderExternalSyntheticLambda12;
        this.preScreenType = loanFunnelType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda31(long j, ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12, LoanFunnelType loanFunnelType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        j = (i & 1) != 0 ? 0L : j;
        if ((i & 4) != 0) {
            int i2 = IAuthTabCallback + 49;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                loanFunnelType = LoanFunnelType.MANUAL;
                int i3 = onExtraCallback + 59;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } else {
                LoanFunnelType loanFunnelType2 = LoanFunnelType.MANUAL;
                throw null;
            }
        }
        this(j, imagePipelineExperimentsBuilderExternalSyntheticLambda12, loanFunnelType);
    }
}
