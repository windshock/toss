package viva.republica.toss.network.model.transfer;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.TransferResultPage;
import viva.republica.toss.network.model.transfer.TransferResultPage$Redirect$$serializer;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class TransferResultPage$MessageCardInfo$Manual$$serializer implements aeu2<TransferResultPage.MessageCardInfo.Manual> {
    public static final int $stable;
    private static int IAuthTabCallback;
    public static final TransferResultPage$MessageCardInfo$Manual$$serializer INSTANCE;
    private static int asInterface;
    private static final SerialDescriptor descriptor;
    private static short[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static byte[] onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {104, -2, 24, -74};
    private static final int $$b = 19;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r7, int r8, byte r9) {
        /*
            byte[] r0 = viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$Manual$$serializer.$$a
            int r8 = r8 * 3
            int r8 = 115 - r8
            int r7 = r7 + 4
            int r9 = r9 * 2
            int r9 = r9 + 1
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r5 = r2
            r8 = r7
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L2a:
            int r7 = r7 + r3
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$Manual$$serializer.$$c(byte, int, byte):java.lang.String");
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 19;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 97;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 43 / 0;
        }
        return serialDescriptor;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 43424), 42 - Color.argb(0, 0, 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 != 0) {
                byte[] bArr = onNavigationEvent;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char cGreen = (char) (12843 - Color.green(0));
                            int iResolveOpacity = 55 - Drawable.resolveOpacity(0, 0);
                            int i7 = 2168 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            byte b2 = (byte) ($$a[1] + 1);
                            byte b3 = (byte) (b2 + 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cGreen, iResolveOpacity, i7, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i6] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 41, 22439 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onExtraCallback[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i8 = $11 + 15;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))) + i5;
                try {
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), TextUtils.getTrimmedLength("") + 86, 9567 - (ViewConfiguration.getScrollBarSize() >> 8), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onNavigationEvent;
                    if (bArr4 != null) {
                        int i10 = $11 + 21;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i12 = 0;
                        while (i12 < length2) {
                            int i13 = $11 + 93;
                            $10 = i13 % 128;
                            if (i13 % 2 != 0) {
                                bArr5[i12] = (byte) (bArr4[i12] / (-4629411779493505016L));
                                i12 <<= 1;
                            } else {
                                bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                                i12++;
                            }
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i14 = $11 + 119;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i16 = $10 + 57;
                        $11 = i16 % 128;
                        if (i16 % 2 == 0) {
                            throw null;
                        }
                        if (z) {
                            byte[] bArr6 = onNavigationEvent;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static {
        asInterface = 1;
        onNavigationEvent();
        TransferResultPage$MessageCardInfo$Manual$$serializer transferResultPage$MessageCardInfo$Manual$$serializer = new TransferResultPage$MessageCardInfo$Manual$$serializer();
        INSTANCE = transferResultPage$MessageCardInfo$Manual$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("EMOJI", transferResultPage$MessageCardInfo$Manual$$serializer, 2);
        setanimationsloop.onWarmupCompleted("emoji", true);
        setanimationsloop.onWarmupCompleted("logName", true);
        Object[] objArr = new Object[1];
        a((short) (6 - TextUtils.getOffsetAfter("", 0)), (byte) (104 - TextUtils.lastIndexOf("", '0')), 1726610771 + TextUtils.lastIndexOf("", '0'), 353160607 - KeyEvent.keyCodeFromString(""), -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
        setanimationsloop.onWarmupCompleted(new TransferResultPage$Redirect$$serializer.onNavigationEvent(((String) objArr[0]).intern()));
        descriptor = setanimationsloop;
        int i = asBinder + 49;
        asInterface = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private TransferResultPage$MessageCardInfo$Manual$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout};
        int i4 = IAuthTabCallbackStub + 83;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        TransferResultPage.MessageCardInfo.Manual manualM115deserialize = m115deserialize(decoder);
        int i4 = IAuthTabCallbackDefault + 93;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return manualM115deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f A[PHI: r1 r12
      0x003f: PHI (r1v10 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v11 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r12v5 o.yw) = (r12v1 o.yw), (r12v7 o.yw) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[PHI: r1 r12
      0x0035: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v11 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r12v2 o.yw) = (r12v1 o.yw), (r12v7 o.yw) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.Manual m115deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r12) throws kotlinx.serialization.UnknownFieldException {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$Manual$$serializer.IAuthTabCallbackDefault
            int r1 = r1 + 45
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$Manual$$serializer.IAuthTabCallbackStub = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 0
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$Manual$$serializer.descriptor
            o.yw r12 = r12.onWarmupCompleted(r1)
            boolean r2 = r12.extraCallbackWithResult()
            r6 = 32
            int r6 = r6 / r5
            if (r2 == 0) goto L3f
            goto L35
        L26:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$Manual$$serializer.descriptor
            o.yw r12 = r12.onWarmupCompleted(r1)
            boolean r2 = r12.extraCallbackWithResult()
            if (r2 == 0) goto L3f
        L35:
            java.lang.String r2 = r12.asInterface(r1, r5)
            java.lang.String r4 = r12.asInterface(r1, r4)
            r5 = 3
            goto L8c
        L3f:
            r2 = r3
            r6 = r2
            r8 = r4
            r7 = r5
        L43:
            if (r8 == 0) goto L8a
            int r9 = viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$Manual$$serializer.IAuthTabCallbackDefault
            int r9 = r9 + 5
            int r10 = r9 % 128
            viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$Manual$$serializer.IAuthTabCallbackStub = r10
            int r9 = r9 % 2
            if (r9 == 0) goto L83
            int r9 = r12.onNavigationEvent(r1)
            r10 = -1
            if (r9 == r10) goto L81
            if (r9 == 0) goto L7a
            int r6 = viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$Manual$$serializer.IAuthTabCallbackStub
            int r6 = r6 + 107
            int r10 = r6 % 128
            viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$Manual$$serializer.IAuthTabCallbackDefault = r10
            int r6 = r6 % r0
            if (r9 != r4) goto L74
            int r10 = r10 + 75
            int r6 = r10 % 128
            viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$Manual$$serializer.IAuthTabCallbackStub = r6
            int r10 = r10 % 2
            java.lang.String r6 = r12.asInterface(r1, r4)
            r7 = r7 | 2
            goto L43
        L74:
            kotlinx.serialization.UnknownFieldException r12 = new kotlinx.serialization.UnknownFieldException
            r12.<init>(r9)
            throw r12
        L7a:
            java.lang.String r2 = r12.asInterface(r1, r5)
            r7 = r7 | 1
            goto L43
        L81:
            r8 = r5
            goto L43
        L83:
            r12.onNavigationEvent(r1)
            r3.hashCode()
            throw r3
        L8a:
            r4 = r6
            r5 = r7
        L8c:
            r12.onExtraCallbackWithResult(r1)
            viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$Manual r12 = new viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$Manual
            r12.<init>(r5, r2, r4, r3)
            int r1 = viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$Manual$$serializer.IAuthTabCallbackDefault
            int r1 = r1 + 91
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$Manual$$serializer.IAuthTabCallbackStub = r2
            int r1 = r1 % r0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$Manual$$serializer.m115deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$Manual");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferResultPage.MessageCardInfo.Manual) obj);
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        int i5 = IAuthTabCallbackStub + 91;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferResultPage.MessageCardInfo.Manual manual) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(manual, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TransferResultPage.MessageCardInfo.Manual.IAuthTabCallback(manual, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackDefault + 13;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = 1028774566;
        onWarmupCompleted = -1538795507;
        IAuthTabCallback = 1320479453;
        onNavigationEvent = new byte[]{-98, -112, 110, 8};
    }
}
