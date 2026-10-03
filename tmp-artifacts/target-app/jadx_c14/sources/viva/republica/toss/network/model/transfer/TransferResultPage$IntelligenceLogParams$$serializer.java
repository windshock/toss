package viva.republica.toss.network.model.transfer;

import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import im.toss.inventory_sdk.model.LogDto$;
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
import viva.republica.toss.network.model.transfer.TransferResultPage;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class TransferResultPage$IntelligenceLogParams$$serializer implements aeu2<TransferResultPage.IntelligenceLogParams> {
    public static final int $stable;
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    public static final TransferResultPage$IntelligenceLogParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static short[] onExtraCallbackWithResult;
    private static byte[] onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {23, -38, -83, 70};
    private static final int $$b = 133;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onTransact = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, short r8) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r0 = r8 + 1
            byte[] r1 = viva.republica.toss.network.model.transfer.TransferResultPage$IntelligenceLogParams$$serializer.$$a
            int r6 = r6 * 2
            int r6 = r6 + 115
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage$IntelligenceLogParams$$serializer.$$c(int, int, short):java.lang.String");
    }

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 115;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            serialDescriptor = descriptor;
            int i4 = 99 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i2 + 91;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0230 A[PHI: r0
      0x0230: PHI (r0v40 int) = (r0v8 int), (r0v43 int) binds: [B:55:0x022e, B:52:0x021c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0232 A[PHI: r0
      0x0232: PHI (r0v9 int) = (r0v8 int), (r0v43 int) binds: [B:55:0x022e, B:52:0x021c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r24, byte r25, int r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage$IntelligenceLogParams$$serializer.a(short, byte, int, int, int, java.lang.Object[]):void");
    }

    static {
        IAuthTabCallbackStub = 1;
        onWarmupCompleted();
        TransferResultPage$IntelligenceLogParams$$serializer transferResultPage$IntelligenceLogParams$$serializer = new TransferResultPage$IntelligenceLogParams$$serializer();
        INSTANCE = transferResultPage$IntelligenceLogParams$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.TransferResultPage.IntelligenceLogParams", transferResultPage$IntelligenceLogParams$$serializer, 3);
        Object[] objArr = new Object[1];
        a((short) ((Process.myTid() >> 22) + 98), (byte) (ViewConfiguration.getEdgeSlop() >> 16), 176024862 - (ViewConfiguration.getWindowTouchSlop() >> 8), (-1038381242) - (Process.myTid() >> 22), (-48) - TextUtils.indexOf("", ""), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("adId", true);
        setanimationsloop.onWarmupCompleted("log", true);
        descriptor = setanimationsloop;
        int i = onTransact + 15;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 42 / 0;
        }
    }

    private TransferResultPage$IntelligenceLogParams$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(LogDto$.serializer.INSTANCE)};
        int i4 = asBinder + 39;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        TransferResultPage.IntelligenceLogParams intelligenceLogParamsM110deserialize = m110deserialize(decoder);
        int i4 = asBinder + 107;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return intelligenceLogParamsM110deserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087 A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.transfer.TransferResultPage.IntelligenceLogParams m110deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r17) throws kotlinx.serialization.UnknownFieldException {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage$IntelligenceLogParams$$serializer.m110deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.transfer.TransferResultPage$IntelligenceLogParams");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferResultPage.IntelligenceLogParams) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferResultPage.IntelligenceLogParams intelligenceLogParams) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(intelligenceLogParams, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TransferResultPage.IntelligenceLogParams.onExtraCallback(intelligenceLogParams, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asBinder + 61;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = 1371917034;
        IAuthTabCallback = -1538795460;
        onExtraCallback = -1717327578;
        onNavigationEvent = new byte[]{-101, -99, -85, 8};
    }
}
