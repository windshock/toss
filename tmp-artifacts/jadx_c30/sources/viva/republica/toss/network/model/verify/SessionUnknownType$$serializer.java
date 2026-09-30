package viva.republica.toss.network.model.verify;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class SessionUnknownType$$serializer implements aeu2<SessionUnknownType> {
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    public static final SessionUnknownType$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static short[] onNavigationEvent;
    private static byte[] onWarmupCompleted;
    private static final byte[] $$a = {125, ISO7816.INS_UNBLOCK_CHV, 8, -98};
    private static final int $$b = GF2Field.MASK;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, int i) {
        int i2;
        int i3;
        ?? r6 = 4 - (s * 4);
        int i4 = i * 4;
        int i5 = (b * 3) + 115;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            byte b2 = r6;
            i2 = 0;
            int i7 = r6;
            i5 += b2;
            i3 = i7 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            b2 = bArr[i3];
            i2++;
            i7 = i3;
            i5 += b2;
            i3 = i7 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i3 = r6;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 81;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        IAuthTabCallbackDefault = 1;
        onWarmupCompleted();
        SessionUnknownType$$serializer sessionUnknownType$$serializer = new SessionUnknownType$$serializer();
        INSTANCE = sessionUnknownType$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.verify.SessionUnknownType", sessionUnknownType$$serializer, 1);
        Object[] objArr = new Object[1];
        a((short) (18 - (ViewConfiguration.getPressedStateDuration() >> 16)), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1609509714 - Process.getGidForName(BuildConfig.FLAVOR), 1327925545 - (ViewConfiguration.getWindowTouchSlop() >> 8), (-62) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = asInterface + 111;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private SessionUnknownType$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent};
        int i4 = asBinder + 81;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return m115deserialize(decoder);
        }
        m115deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SessionUnknownType m115deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        boolean z;
        String strAsInterface;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        asBinder = i2 % 128;
        int i3 = 1;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                i3 = 0;
                strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            }
            String strAsInterface2 = null;
            z = true;
            int i4 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i5 = asBinder + 47;
                    IAuthTabCallbackStub = i5 % 128;
                    int i6 = i5 % 2;
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    int i7 = asBinder + 109;
                    IAuthTabCallbackStub = i7 % 128;
                    int i8 = i7 % 2;
                    i4 = 1;
                }
            }
            strAsInterface = strAsInterface2;
            i3 = i4;
        } else {
            Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            } else {
                String strAsInterface22 = null;
                z = true;
                int i42 = 0;
                while (z) {
                }
                strAsInterface = strAsInterface22;
                i3 = i42;
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new SessionUnknownType(i3, strAsInterface, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SessionUnknownType) obj);
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SessionUnknownType sessionUnknownType) {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(sessionUnknownType, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            SessionUnknownType.onExtraCallbackWithResult(sessionUnknownType, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(sessionUnknownType, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        SessionUnknownType.onExtraCallbackWithResult(sessionUnknownType, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asBinder + 113;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (ViewConfiguration.getScrollBarSize() >> 8) + 42, MotionEvent.axisFromString(BuildConfig.FLAVOR) + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                int i6 = $11 + 77;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
                byte[] bArr = onWarmupCompleted;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getTapTimeout() >> 16)), 55 - View.resolveSize(0, 0), 2167 - Color.alpha(0), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i8 = $10 + 31;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    byte[] bArr3 = onWarmupCompleted;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 41, 22439 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onNavigationEvent[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i10 = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)));
                if (z2) {
                    i4 = 1;
                } else {
                    int i11 = $10 + 13;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i10 + i4;
                try {
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), 86 - (ViewConfiguration.getTouchSlop() >> 8), 9567 - (ViewConfiguration.getTouchSlop() >> 8), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onWarmupCompleted;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i13 = 0; i13 < length2; i13++) {
                            bArr5[i13] = (byte) (bArr4[i13] ^ (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i14 = $11 + 27;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (!z) {
                            short[] sArr = onNavigationEvent;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            byte[] bArr6 = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = 72813733;
        IAuthTabCallback = -1538795446;
        onExtraCallback = 345943885;
        onWarmupCompleted = new byte[]{-18, -14, -23, 8};
    }
}
