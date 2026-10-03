package viva.republica.toss.network.model.loan;

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
import o.vyl;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class LoanRefinancingBottomSheetInfo$$serializer implements aeu2<LoanRefinancingBottomSheetInfo> {
    private static int IAuthTabCallback = 0;
    public static final LoanRefinancingBottomSheetInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 123;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 1;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        LoanRefinancingBottomSheetInfo$$serializer loanRefinancingBottomSheetInfo$$serializer = new LoanRefinancingBottomSheetInfo$$serializer();
        INSTANCE = loanRefinancingBottomSheetInfo$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo", loanRefinancingBottomSheetInfo$$serializer, 2);
        setanimationsloop.onWarmupCompleted("header", true);
        setanimationsloop.onWarmupCompleted("body", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 83;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private LoanRefinancingBottomSheetInfo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        IAuthTabCallback = i2 % 128;
        KSerializer<?>[] kSerializerArr = new KSerializer[2];
        if (i2 % 2 != 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            kSerializerArr[1] = getwrigglelayout;
            kSerializerArr[1] = getwrigglelayout;
        } else {
            getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
            kSerializerArr[0] = getwrigglelayout2;
            kSerializerArr[1] = getwrigglelayout2;
        }
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        LoanRefinancingBottomSheetInfo loanRefinancingBottomSheetInfoM54deserialize = m54deserialize(decoder);
        int i4 = onNavigationEvent + 77;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return loanRefinancingBottomSheetInfoM54deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo m54deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r13) throws kotlinx.serialization.UnknownFieldException {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo$$serializer.onNavigationEvent
            int r1 = r1 + 65
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo$$serializer.IAuthTabCallback = r2
            int r1 = r1 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo$$serializer.descriptor
            o.yw r13 = r13.onWarmupCompleted(r1)
            boolean r2 = r13.extraCallbackWithResult()
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L2a
            java.lang.String r0 = r13.asInterface(r1, r4)
            java.lang.String r2 = r13.asInterface(r1, r5)
            r4 = 3
            goto L79
        L2a:
            r2 = r3
            r6 = r2
            r7 = r4
            r8 = r5
        L2e:
            if (r8 == 0) goto L76
            int r9 = r13.onNavigationEvent(r1)
            r10 = -1
            if (r9 == r10) goto L6b
            int r10 = viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo$$serializer.onNavigationEvent
            int r10 = r10 + 55
            int r11 = r10 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo$$serializer.IAuthTabCallback = r11
            int r10 = r10 % r0
            if (r10 == 0) goto L47
            r10 = 3
            int r10 = r10 / r4
            if (r9 == 0) goto L64
            goto L49
        L47:
            if (r9 == 0) goto L64
        L49:
            if (r9 != r5) goto L5e
            int r11 = r11 + 3
            int r6 = r11 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo$$serializer.onNavigationEvent = r6
            int r11 = r11 % r0
            java.lang.String r6 = r13.asInterface(r1, r5)
            if (r11 != 0) goto L5b
            r7 = r7 | 5
            goto L2e
        L5b:
            r7 = r7 | 2
            goto L2e
        L5e:
            kotlinx.serialization.UnknownFieldException r13 = new kotlinx.serialization.UnknownFieldException
            r13.<init>(r9)
            throw r13
        L64:
            java.lang.String r2 = r13.asInterface(r1, r4)
            r7 = r7 | 1
            goto L2e
        L6b:
            int r8 = viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo$$serializer.IAuthTabCallback
            int r8 = r8 + 79
            int r9 = r8 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo$$serializer.onNavigationEvent = r9
            int r8 = r8 % r0
            r8 = r4
            goto L2e
        L76:
            r0 = r2
            r2 = r6
            r4 = r7
        L79:
            r13.onExtraCallbackWithResult(r1)
            viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo r13 = new viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo
            r13.<init>(r4, r0, r2, r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo$$serializer.m54deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.loan.LoanRefinancingBottomSheetInfo");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LoanRefinancingBottomSheetInfo) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LoanRefinancingBottomSheetInfo loanRefinancingBottomSheetInfo) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(loanRefinancingBottomSheetInfo, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            LoanRefinancingBottomSheetInfo.onWarmupCompleted(loanRefinancingBottomSheetInfo, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(loanRefinancingBottomSheetInfo, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        LoanRefinancingBottomSheetInfo.onWarmupCompleted(loanRefinancingBottomSheetInfo, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 121;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
