package viva.republica.toss.network.model.transfer;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.view.KeyEvent;
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
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.DepositTarget;
import viva.republica.toss.network.model.transfer.DepositTarget$Account$$serializer;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class DepositTarget$Reserve$$serializer implements aeu2<DepositTarget.Reserve> {
    public static final int $stable;
    private static short[] IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    public static final DepositTarget$Reserve$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static byte[] onWarmupCompleted;
    private static final byte[] $$a = {32, 13, -54, -47};
    private static final int $$b = 1;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, short r8) {
        /*
            int r6 = r6 * 4
            int r0 = 1 - r6
            byte[] r1 = viva.republica.toss.network.model.transfer.DepositTarget$Reserve$$serializer.$$a
            int r7 = r7 * 3
            int r7 = r7 + 115
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            r3 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.DepositTarget$Reserve$$serializer.$$c(short, short, short):java.lang.String");
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 17;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 10 / 0;
        }
        return serialDescriptor;
    }

    static {
        IAuthTabCallbackStub = 1;
        IAuthTabCallback();
        DepositTarget$Reserve$$serializer depositTarget$Reserve$$serializer = new DepositTarget$Reserve$$serializer();
        INSTANCE = depositTarget$Reserve$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("RESERVE", depositTarget$Reserve$$serializer, 1);
        setanimationsloop.onWarmupCompleted("reserveKey", false);
        Object[] objArr = new Object[1];
        a((short) ((KeyEvent.getMaxKeyCode() >> 16) + 101), (byte) ((-37) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Color.green(0) - 634113018, 201223468 - (ViewConfiguration.getWindowTouchSlop() >> 8), ImageFormat.getBitsPerPixel(0) - 100, objArr);
        setanimationsloop.onWarmupCompleted(new DepositTarget$Account$$serializer.IAuthTabCallback(((String) objArr[0]).intern()));
        descriptor = setanimationsloop;
        int i = asInterface + 17;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    private DepositTarget$Reserve$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent};
        int i4 = IAuthTabCallbackDefault + 85;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        DepositTarget.Reserve reserveM81deserialize = m81deserialize(decoder);
        int i4 = IAuthTabCallbackDefault + 55;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return reserveM81deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final DepositTarget.Reserve m81deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        int i = 2 % 2;
        int i2 = onTransact + 51;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 1;
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            int i5 = IAuthTabCallbackDefault + 115;
            onTransact = i5 % 128;
            strAsInterface = i5 % 2 != 0 ? ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1) : ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
        } else {
            boolean z = true;
            String strAsInterface2 = null;
            int i6 = 0;
            while (z) {
                int i7 = IAuthTabCallbackDefault + 25;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    int i9 = IAuthTabCallbackDefault + 61;
                    onTransact = i9 % 128;
                    int i10 = i9 % 2;
                    i6 = 1;
                }
            }
            strAsInterface = strAsInterface2;
            i4 = i6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DepositTarget.Reserve(i4, strAsInterface, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DepositTarget.Reserve) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DepositTarget.Reserve reserve) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(reserve, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        DepositTarget.Reserve.IAuthTabCallback(reserve, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackDefault + 103;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 24 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = IAuthTabCallbackDefault + 89;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a9 A[PHI: r0
      0x01a9: PHI (r0v9 int) = (r0v8 int), (r0v38 int) binds: [B:44:0x01a7, B:41:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ab A[PHI: r0
      0x01ab: PHI (r0v35 int) = (r0v8 int), (r0v38 int) binds: [B:44:0x01a7, B:41:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r25, byte r26, int r27, int r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.DepositTarget$Reserve$$serializer.a(short, byte, int, int, int, java.lang.Object[]):void");
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = -2121526286;
        onNavigationEvent = -1538795423;
        onExtraCallback = 1346784064;
        onWarmupCompleted = new byte[]{-62, -64, 114, 8};
    }
}
