package viva.republica.toss.network.model.loan;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda16;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf31;
import o.liq;
import o.okycx;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanComparisonIntroTypeSelectionResponse {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String key;
    private final boolean logRequired;
    private final String scheme;
    private final ImagePipelineExperimentsBuilderExternalSyntheticLambda16 type;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionResponse$$ExternalSyntheticLambda0
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallback = LoanComparisonIntroTypeSelectionResponse.IAuthTabCallback();
            int i4 = onNavigationEvent + 13;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 61 / 0;
            }
            return kSerializerIAuthTabCallback;
        }
    }), null, null, null};
    private static final LoanComparisonIntroTypeSelectionResponse FALLBACK = new LoanComparisonIntroTypeSelectionResponse(ImagePipelineExperimentsBuilderExternalSyntheticLambda16.NATIVE, (String) null, (String) null, false, 14, (DefaultConstructorMarker) null);

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        KSerializer kSerializerIAuthTabCallbackDefault;
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            int i3 = 96 / 0;
        } else {
            kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        }
        int i4 = onNavigationEvent + 31;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return kSerializerIAuthTabCallbackDefault;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.loan.LoanComparisonIntroType", ImagePipelineExperimentsBuilderExternalSyntheticLambda16.values());
        }
        updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.loan.LoanComparisonIntroType", ImagePipelineExperimentsBuilderExternalSyntheticLambda16.values());
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof LoanComparisonIntroTypeSelectionResponse)) {
            int i4 = onNavigationEvent + 35;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        LoanComparisonIntroTypeSelectionResponse loanComparisonIntroTypeSelectionResponse = (LoanComparisonIntroTypeSelectionResponse) obj;
        if (this.type != loanComparisonIntroTypeSelectionResponse.type) {
            int i6 = onExtraCallback + 47;
            onNavigationEvent = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.scheme, loanComparisonIntroTypeSelectionResponse.scheme)) {
            int i7 = onExtraCallback + 87;
            onNavigationEvent = i7 % 128;
            return i7 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.key, loanComparisonIntroTypeSelectionResponse.key)) {
            return this.logRequired == loanComparisonIntroTypeSelectionResponse.logRequired;
        }
        int i8 = onNavigationEvent + 57;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[PHI: r1 r3
      0x002f: PHI (r1v14 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
      0x002f: PHI (r3v6 java.lang.String) = (r3v0 java.lang.String), (r3v8 java.lang.String) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1
      0x0024: PHI (r1v6 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionResponse.onExtraCallback
            int r1 = r1 + 101
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionResponse.onNavigationEvent = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1a
            o.ImagePipelineExperimentsBuilderExternalSyntheticLambda16 r1 = r6.type
            int r1 = r1.hashCode()
            java.lang.String r3 = r6.scheme
            if (r3 != 0) goto L2f
            goto L24
        L1a:
            o.ImagePipelineExperimentsBuilderExternalSyntheticLambda16 r1 = r6.type
            int r1 = r1.hashCode()
            java.lang.String r3 = r6.scheme
            if (r3 != 0) goto L2f
        L24:
            int r3 = viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionResponse.onExtraCallback
            int r3 = r3 + 7
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionResponse.onNavigationEvent = r4
            int r3 = r3 % r0
            r3 = r2
            goto L33
        L2f:
            int r3 = r3.hashCode()
        L33:
            java.lang.String r4 = r6.key
            if (r4 == 0) goto L44
            int r2 = viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionResponse.onExtraCallback
            int r2 = r2 + 51
            int r5 = r2 % 128
            viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionResponse.onNavigationEvent = r5
            int r2 = r2 % r0
            int r2 = r4.hashCode()
        L44:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            boolean r0 = r6.logRequired
            int r0 = java.lang.Boolean.hashCode(r0)
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionResponse.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonIntroTypeSelectionResponse(type=" + this.type + ", scheme=" + this.scheme + ", key=" + this.key + ", logRequired=" + this.logRequired + ")";
        int i2 = onExtraCallback + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ LoanComparisonIntroTypeSelectionResponse(int i, ImagePipelineExperimentsBuilderExternalSyntheticLambda16 imagePipelineExperimentsBuilderExternalSyntheticLambda16, String str, String str2, boolean z, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onNavigationEvent + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, LoanComparisonIntroTypeSelectionResponse$.serializer.INSTANCE.getDescriptor());
        }
        this.type = imagePipelineExperimentsBuilderExternalSyntheticLambda16;
        if ((i & 2) == 0) {
            this.scheme = null;
        } else {
            this.scheme = str;
            int i4 = onNavigationEvent + 109;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = 2 % 2;
        if ((i & 4) == 0) {
            int i7 = onNavigationEvent + 17;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            this.key = null;
        } else {
            this.key = str2;
            int i9 = 2 % 2;
        }
        if ((i & 8) == 0) {
            this.logRequired = true;
        } else {
            this.logRequired = z;
        }
    }

    public LoanComparisonIntroTypeSelectionResponse(@NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda16 imagePipelineExperimentsBuilderExternalSyntheticLambda16, @Nullable String str, @Nullable String str2, boolean z) {
        Intrinsics.checkNotNullParameter(imagePipelineExperimentsBuilderExternalSyntheticLambda16, "");
        this.type = imagePipelineExperimentsBuilderExternalSyntheticLambda16;
        this.scheme = str;
        this.key = str2;
        this.logRequired = z;
    }

    public static final /* synthetic */ LoanComparisonIntroTypeSelectionResponse onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 73;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        LoanComparisonIntroTypeSelectionResponse loanComparisonIntroTypeSelectionResponse = FALLBACK;
        int i5 = i2 + 105;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
        return loanComparisonIntroTypeSelectionResponse;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionResponse r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionResponse.onExtraCallback
            int r1 = r1 + 23
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionResponse.onNavigationEvent = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L26
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionResponse.$childSerializers
            r1 = r1[r3]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            o.ImagePipelineExperimentsBuilderExternalSyntheticLambda16 r4 = r5.type
            r6.onNavigationEvent(r7, r3, r1, r4)
            boolean r1 = r6.onWarmupCompleted(r7, r2)
            if (r1 != 0) goto L3f
            goto L3b
        L26:
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionResponse.$childSerializers
            r1 = r1[r3]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            o.ImagePipelineExperimentsBuilderExternalSyntheticLambda16 r4 = r5.type
            r6.onNavigationEvent(r7, r3, r1, r4)
            boolean r1 = r6.onWarmupCompleted(r7, r2)
            if (r1 != 0) goto L3f
        L3b:
            java.lang.String r1 = r5.scheme
            if (r1 == 0) goto L46
        L3f:
            o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r5.scheme
            r6.onExtraCallbackWithResult(r7, r2, r1, r3)
        L46:
            boolean r1 = r6.onWarmupCompleted(r7, r0)
            if (r1 != 0) goto L50
            java.lang.String r1 = r5.key
            if (r1 == 0) goto L57
        L50:
            o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r5.key
            r6.onExtraCallbackWithResult(r7, r0, r1, r3)
        L57:
            r1 = 3
            boolean r3 = r6.onWarmupCompleted(r7, r1)
            if (r3 != 0) goto L6b
            int r3 = viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionResponse.onExtraCallback
            int r3 = r3 + 107
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionResponse.onNavigationEvent = r4
            int r3 = r3 % r0
            boolean r3 = r5.logRequired
            if (r3 == r2) goto L79
        L6b:
            boolean r5 = r5.logRequired
            r6.onNavigationEvent(r7, r1, r5)
            int r5 = viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionResponse.onNavigationEvent
            int r5 = r5 + 121
            int r6 = r5 % 128
            viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionResponse.onExtraCallback = r6
            int r5 = r5 % r0
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionResponse.onNavigationEvent(viva.republica.toss.network.model.loan.LoanComparisonIntroTypeSelectionResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 29;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanComparisonIntroTypeSelectionResponse(ImagePipelineExperimentsBuilderExternalSyntheticLambda16 imagePipelineExperimentsBuilderExternalSyntheticLambda16, String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 2) != 0 ? null : str;
        if ((i & 4) != 0) {
            int i2 = onNavigationEvent + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            str2 = null;
        }
        if ((i & 8) != 0) {
            int i4 = onExtraCallback + 103;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            z = true;
        }
        this(imagePipelineExperimentsBuilderExternalSyntheticLambda16, str, str2, z);
    }

    public final ImagePipelineExperimentsBuilderExternalSyntheticLambda16 asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 103;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda16 imagePipelineExperimentsBuilderExternalSyntheticLambda16 = this.type;
        int i5 = i2 + 59;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return imagePipelineExperimentsBuilderExternalSyntheticLambda16;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.scheme;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 113;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.logRequired;
        int i5 = i3 + 115;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanComparisonIntroTypeSelectionResponse> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            LoanComparisonIntroTypeSelectionResponse$.serializer serializerVar = LoanComparisonIntroTypeSelectionResponse$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            throw null;
        }

        public final LoanComparisonIntroTypeSelectionResponse onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                LoanComparisonIntroTypeSelectionResponse.onExtraCallbackWithResult();
                throw null;
            }
            LoanComparisonIntroTypeSelectionResponse loanComparisonIntroTypeSelectionResponseOnExtraCallbackWithResult = LoanComparisonIntroTypeSelectionResponse.onExtraCallbackWithResult();
            int i3 = IAuthTabCallback + 111;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return loanComparisonIntroTypeSelectionResponseOnExtraCallbackWithResult;
        }
    }

    static {
        int i = onWarmupCompleted + 3;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
