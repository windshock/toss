package viva.republica.toss.network.model.transfer;

import im.toss.features.transfer.share.library.data.TransferShareResultResponse$;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.TransferResultPage;
import viva.republica.toss.network.model.transfer.TransferResultPage$Redirect$$serializer;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class TransferResultPage$ShareTransfer$$serializer implements aeu2<TransferResultPage.ShareTransfer> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final TransferResultPage$ShareTransfer$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 59;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        TransferResultPage$ShareTransfer$$serializer transferResultPage$ShareTransfer$$serializer = new TransferResultPage$ShareTransfer$$serializer();
        INSTANCE = transferResultPage$ShareTransfer$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("SHARE_TRANSFER_RESULT", transferResultPage$ShareTransfer$$serializer, 3);
        setanimationsloop.onWarmupCompleted("shareTransferInfo", false);
        setanimationsloop.onWarmupCompleted("clearStack", true);
        setanimationsloop.onWarmupCompleted("logStatus", true);
        setanimationsloop.onWarmupCompleted(new TransferResultPage$Redirect$$serializer.onNavigationEvent("behavior"));
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 1;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private TransferResultPage$ShareTransfer$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
            kSerializerArr = new KSerializer[2];
            kSerializerArr[0] = TransferShareResultResponse$.serializer.INSTANCE;
            kSerializerArr[1] = getBgColor.IAuthTabCallback;
            kSerializerArr[4] = kSerializerIAuthTabCallback;
        } else {
            kSerializerArr = new KSerializer[]{TransferShareResultResponse$.serializer.INSTANCE, getBgColor.IAuthTabCallback, sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)};
        }
        int i3 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 72 / 0;
        }
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            m122deserialize(decoder);
            throw null;
        }
        TransferResultPage.ShareTransfer shareTransferM122deserialize = m122deserialize(decoder);
        int i3 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return shareTransferM122deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.transfer.TransferResultPage.ShareTransfer m122deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r17) throws kotlinx.serialization.UnknownFieldException {
        /*
            r16 = this;
            r0 = r17
            r1 = 2
            int r2 = r1 % r1
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            kotlinx.serialization.descriptors.SerialDescriptor r2 = viva.republica.toss.network.model.transfer.TransferResultPage$ShareTransfer$$serializer.descriptor
            o.yw r0 = r0.onWarmupCompleted(r2)
            boolean r3 = r0.extraCallbackWithResult()
            r4 = 0
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L3d
            int r3 = viva.republica.toss.network.model.transfer.TransferResultPage$ShareTransfer$$serializer.onExtraCallbackWithResult
            int r3 = r3 + 37
            int r7 = r3 % 128
            viva.republica.toss.network.model.transfer.TransferResultPage$ShareTransfer$$serializer.IAuthTabCallback = r7
            int r3 = r3 % r1
            im.toss.features.transfer.share.library.data.TransferShareResultResponse$$serializer r3 = im.toss.features.transfer.share.library.data.TransferShareResultResponse$.serializer.INSTANCE
            java.lang.Object r3 = r0.onNavigationEvent(r2, r5, r3, r4)
            im.toss.features.transfer.share.library.data.TransferShareResultResponse r3 = (im.toss.features.transfer.share.library.data.TransferShareResultResponse) r3
            boolean r5 = r0.onExtraCallbackWithResult(r2, r6)
            o.getWriggleLayout r6 = o.getWriggleLayout.onNavigationEvent
            java.lang.Object r1 = r0.onExtraCallbackWithResult(r2, r1, r6, r4)
            java.lang.String r1 = (java.lang.String) r1
            r4 = 7
            r14 = r1
            r12 = r3
            r11 = r4
            r13 = r5
            goto L9a
        L3d:
            r3 = r4
            r7 = r3
            r4 = r5
            r8 = r4
            r9 = r6
        L42:
            if (r9 == 0) goto L96
            int r10 = r0.onNavigationEvent(r2)
            r11 = -1
            if (r10 == r11) goto L94
            if (r10 == 0) goto L89
            int r11 = viva.republica.toss.network.model.transfer.TransferResultPage$ShareTransfer$$serializer.onExtraCallbackWithResult
            int r12 = r11 + 107
            int r13 = r12 % 128
            viva.republica.toss.network.model.transfer.TransferResultPage$ShareTransfer$$serializer.IAuthTabCallback = r13
            int r12 = r12 % r1
            if (r12 != 0) goto L5b
            if (r10 == r6) goto L82
            goto L5d
        L5b:
            if (r10 == r6) goto L82
        L5d:
            if (r10 != r1) goto L7c
            int r11 = r11 + 45
            int r10 = r11 % 128
            viva.republica.toss.network.model.transfer.TransferResultPage$ShareTransfer$$serializer.IAuthTabCallback = r10
            int r11 = r11 % 2
            if (r11 != 0) goto L71
            r10 = 5
            o.getWriggleLayout r11 = o.getWriggleLayout.onNavigationEvent
            java.lang.Object r3 = r0.onExtraCallbackWithResult(r2, r10, r11, r3)
            goto L77
        L71:
            o.getWriggleLayout r10 = o.getWriggleLayout.onNavigationEvent
            java.lang.Object r3 = r0.onExtraCallbackWithResult(r2, r1, r10, r3)
        L77:
            java.lang.String r3 = (java.lang.String) r3
            r4 = r4 | 4
            goto L42
        L7c:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r10)
            throw r0
        L82:
            boolean r8 = r0.onExtraCallbackWithResult(r2, r6)
            r4 = r4 | 2
            goto L42
        L89:
            im.toss.features.transfer.share.library.data.TransferShareResultResponse$$serializer r10 = im.toss.features.transfer.share.library.data.TransferShareResultResponse$.serializer.INSTANCE
            java.lang.Object r7 = r0.onNavigationEvent(r2, r5, r10, r7)
            im.toss.features.transfer.share.library.data.TransferShareResultResponse r7 = (im.toss.features.transfer.share.library.data.TransferShareResultResponse) r7
            r4 = r4 | 1
            goto L42
        L94:
            r9 = r5
            goto L42
        L96:
            r14 = r3
            r11 = r4
            r12 = r7
            r13 = r8
        L9a:
            r0.onExtraCallbackWithResult(r2)
            viva.republica.toss.network.model.transfer.TransferResultPage$ShareTransfer r0 = new viva.republica.toss.network.model.transfer.TransferResultPage$ShareTransfer
            r15 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage$ShareTransfer$$serializer.m122deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.transfer.TransferResultPage$ShareTransfer");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferResultPage.ShareTransfer) obj);
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferResultPage.ShareTransfer shareTransfer) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(shareTransfer, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TransferResultPage.ShareTransfer.onExtraCallbackWithResult(shareTransfer, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
