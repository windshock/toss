package viva.republica.toss.network.model.loan;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.loan.AppliedLoan;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class AppliedLoan$LoanReviewButtonText$$serializer implements aeu2<AppliedLoan.LoanReviewButtonText> {
    private static int IAuthTabCallback;
    public static final AppliedLoan$LoanReviewButtonText$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static final byte[] $$a = {13, 38, -109, 117};
    private static final int $$b = 224;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private static int onExtraCallbackWithResult = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, int r7, int r8) {
        /*
            int r8 = r8 * 3
            int r8 = 105 - r8
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r0 = viva.republica.toss.network.model.loan.AppliedLoan$LoanReviewButtonText$$serializer.$$a
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            int r3 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.AppliedLoan$LoanReviewButtonText$$serializer.$$c(short, int, int):java.lang.String");
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 39;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onExtraCallback = 1;
        IAuthTabCallback();
        AppliedLoan$LoanReviewButtonText$$serializer appliedLoan$LoanReviewButtonText$$serializer = new AppliedLoan$LoanReviewButtonText$$serializer();
        INSTANCE = appliedLoan$LoanReviewButtonText$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.AppliedLoan.LoanReviewButtonText", appliedLoan$LoanReviewButtonText$$serializer, 2);
        Object[] objArr = new Object[1];
        a(4 - (ViewConfiguration.getEdgeSlop() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2, new char[]{65524, 7, 3, 3}, false, 196 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(7 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{65533, 11, 65531, 0, 65533, 5}, false, 186 - TextUtils.lastIndexOf("", '0'), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 39;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private AppliedLoan$LoanReviewButtonText$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{kSerializer, sp.IAuthTabCallback(kSerializer)};
        }
        KSerializer<?> kSerializer2 = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer2);
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        kSerializerArr[1] = kSerializer2;
        kSerializerArr[1] = kSerializerIAuthTabCallback;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AppliedLoan.LoanReviewButtonText loanReviewButtonTextM22deserialize = m22deserialize(decoder);
        int i4 = onNavigationEvent + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return loanReviewButtonTextM22deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f A[PHI: r1 r13
      0x007f: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0032, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x007f: PHI (r13v2 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x0032, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034 A[PHI: r1 r13
      0x0034: PHI (r1v7 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0032, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r13v5 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x0032, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.loan.AppliedLoan.LoanReviewButtonText m22deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r13) throws kotlinx.serialization.UnknownFieldException {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.AppliedLoan$LoanReviewButtonText$$serializer.onNavigationEvent
            int r1 = r1 + 109
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.AppliedLoan$LoanReviewButtonText$$serializer.onWarmupCompleted = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 0
            r4 = 0
            r5 = 1
            if (r1 != 0) goto L25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = viva.republica.toss.network.model.loan.AppliedLoan$LoanReviewButtonText$$serializer.descriptor
            o.yw r13 = r13.onWarmupCompleted(r1)
            boolean r2 = r13.extraCallbackWithResult()
            r6 = 6
            int r6 = r6 / r4
            if (r2 == 0) goto L34
            goto L7f
        L25:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = viva.republica.toss.network.model.loan.AppliedLoan$LoanReviewButtonText$$serializer.descriptor
            o.yw r13 = r13.onWarmupCompleted(r1)
            boolean r2 = r13.extraCallbackWithResult()
            if (r2 == r5) goto L7f
        L34:
            r6 = r3
            r8 = r6
            r7 = r4
            r2 = r5
        L38:
            if (r2 == 0) goto L8d
            int r9 = viva.republica.toss.network.model.loan.AppliedLoan$LoanReviewButtonText$$serializer.onNavigationEvent
            int r9 = r9 + 121
            int r10 = r9 % 128
            viva.republica.toss.network.model.loan.AppliedLoan$LoanReviewButtonText$$serializer.onWarmupCompleted = r10
            int r9 = r9 % r0
            int r9 = r13.onNavigationEvent(r1)
            r10 = -1
            if (r9 == r10) goto L74
            if (r9 == 0) goto L6d
            int r10 = viva.republica.toss.network.model.loan.AppliedLoan$LoanReviewButtonText$$serializer.onNavigationEvent
            int r10 = r10 + 93
            int r11 = r10 % 128
            viva.republica.toss.network.model.loan.AppliedLoan$LoanReviewButtonText$$serializer.onWarmupCompleted = r11
            int r10 = r10 % r0
            if (r10 != 0) goto L5a
            if (r9 != 0) goto L67
            goto L5c
        L5a:
            if (r9 != r5) goto L67
        L5c:
            o.getWriggleLayout r9 = o.getWriggleLayout.onNavigationEvent
            java.lang.Object r8 = r13.onExtraCallbackWithResult(r1, r5, r9, r8)
            java.lang.String r8 = (java.lang.String) r8
            r7 = r7 | 2
            goto L38
        L67:
            kotlinx.serialization.UnknownFieldException r13 = new kotlinx.serialization.UnknownFieldException
            r13.<init>(r9)
            throw r13
        L6d:
            java.lang.String r6 = r13.asInterface(r1, r4)
            r7 = r7 | 1
            goto L38
        L74:
            int r2 = viva.republica.toss.network.model.loan.AppliedLoan$LoanReviewButtonText$$serializer.onNavigationEvent
            int r2 = r2 + 51
            int r9 = r2 % 128
            viva.republica.toss.network.model.loan.AppliedLoan$LoanReviewButtonText$$serializer.onWarmupCompleted = r9
            int r2 = r2 % r0
            r2 = r4
            goto L38
        L7f:
            java.lang.String r6 = r13.asInterface(r1, r4)
            o.getWriggleLayout r0 = o.getWriggleLayout.onNavigationEvent
            java.lang.Object r0 = r13.onExtraCallbackWithResult(r1, r5, r0, r3)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            r7 = 3
        L8d:
            r13.onExtraCallbackWithResult(r1)
            viva.republica.toss.network.model.loan.AppliedLoan$LoanReviewButtonText r13 = new viva.republica.toss.network.model.loan.AppliedLoan$LoanReviewButtonText
            r13.<init>(r7, r6, r8, r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.AppliedLoan$LoanReviewButtonText$$serializer.m22deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.loan.AppliedLoan$LoanReviewButtonText");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AppliedLoan.LoanReviewButtonText) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AppliedLoan.LoanReviewButtonText loanReviewButtonText) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(loanReviewButtonText, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AppliedLoan.LoanReviewButtonText.IAuthTabCallback(loanReviewButtonText, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 23;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r21, int r22, char[] r23, boolean r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.AppliedLoan$LoanReviewButtonText$$serializer.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = 478308986;
    }
}
