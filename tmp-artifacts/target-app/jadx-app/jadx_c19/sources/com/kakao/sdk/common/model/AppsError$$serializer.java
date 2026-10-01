package com.kakao.sdk.common.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
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
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AppsError$$serializer implements aeu2<AppsError> {
    private static short[] IAuthTabCallback;
    public static final AppsError$$serializer INSTANCE;
    private static int asBinder;
    private static final /* synthetic */ setAnimationsLoop descriptor;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static byte[] onWarmupCompleted;
    private static final byte[] $$a = {4, -66, -36, 8};
    private static final int $$b = 159;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallbackDefault = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, byte b) {
        int i2;
        int i3;
        int i4 = 4 - (s2 * 4);
        byte[] bArr = $$a;
        ?? r8 = 115 - (b * 4);
        int i5 = s * 3;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            byte b2 = r8;
            int i7 = 0;
            i3 = i4;
            i4 += b2;
            i3++;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            b2 = bArr[i3];
            i4 += b2;
            i3++;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i4;
            i4 = r8;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    static {
        asBinder = 1;
        IAuthTabCallback();
        AppsError$$serializer appsError$$serializer = new AppsError$$serializer();
        INSTANCE = appsError$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("com.kakao.sdk.common.model.AppsError", appsError$$serializer, 4);
        setanimationsloop.onWarmupCompleted("msg", false);
        setanimationsloop.onWarmupCompleted("status_code", false);
        Object[] objArr = new Object[1];
        a((short) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) - 96), (byte) ((-49) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Color.alpha(0) - 565540753, ((byte) KeyEvent.getModifierMetaStateMask()) - 1223414378, (-108) - TextUtils.indexOf("", ""), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("response", false);
        descriptor = setanimationsloop;
        int i2 = IAuthTabCallbackDefault + 93;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 38 / 0;
        }
    }

    private AppsError$$serializer() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public AppsError IAuthTabCallback(@NotNull Decoder decoder) throws UnknownFieldException {
        Object objOnNavigationEvent;
        Object objOnNavigationEvent2;
        String str;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = asInterface + 73;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor descriptor2 = getDescriptor();
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor2);
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i7 = IAuthTabCallbackStub + 55;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(descriptor2, 0);
            int iOnTransact = ywVarOnWarmupCompleted.onTransact(descriptor2, 1);
            objOnNavigationEvent2 = ywVarOnWarmupCompleted.onNavigationEvent(descriptor2, 2, AppsErrorCauseSerializer.INSTANCE, (Object) null);
            objOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(descriptor2, 3, AppsErrorResponse$$serializer.INSTANCE, (Object) null);
            i3 = 15;
            i2 = iOnTransact;
            str = strAsInterface;
        } else {
            int iOnTransact2 = 0;
            int i9 = 0;
            boolean z = true;
            Object objOnNavigationEvent3 = null;
            String strAsInterface2 = null;
            objOnNavigationEvent = null;
            while (z) {
                int i10 = asInterface + 37;
                IAuthTabCallbackStub = i10 % 128;
                if (i10 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(descriptor2);
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(descriptor2);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(descriptor2, 0);
                    i9 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    iOnTransact2 = ywVarOnWarmupCompleted.onTransact(descriptor2, 1);
                    i9 |= 2;
                } else if (iOnNavigationEvent == 2) {
                    objOnNavigationEvent3 = ywVarOnWarmupCompleted.onNavigationEvent(descriptor2, 2, AppsErrorCauseSerializer.INSTANCE, objOnNavigationEvent3);
                    i9 |= 4;
                } else {
                    if (iOnNavigationEvent != 3) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    objOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(descriptor2, 3, AppsErrorResponse$$serializer.INSTANCE, objOnNavigationEvent);
                    i9 |= 8;
                }
            }
            objOnNavigationEvent2 = objOnNavigationEvent3;
            str = strAsInterface2;
            i2 = iOnTransact2;
            i3 = i9;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor2);
        return new AppsError(i3, str, i2, (AppsErrorCause) objOnNavigationEvent2, (AppsErrorResponse) objOnNavigationEvent, null);
    }

    public KSerializer<?>[] childSerializers() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 95;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return new KSerializer[]{getWriggleLayout.onNavigationEvent, getDynamicHeight.onWarmupCompleted, AppsErrorCauseSerializer.INSTANCE, AppsErrorResponse$$serializer.INSTANCE};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        kSerializerArr[0] = getWriggleLayout.onNavigationEvent;
        kSerializerArr[1] = getDynamicHeight.onWarmupCompleted;
        kSerializerArr[2] = AppsErrorCauseSerializer.INSTANCE;
        kSerializerArr[5] = AppsErrorResponse$$serializer.INSTANCE;
        return kSerializerArr;
    }

    public /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 51;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        AppsError appsErrorIAuthTabCallback = IAuthTabCallback(decoder);
        if (i4 != 0) {
            int i5 = 53 / 0;
        }
        return appsErrorIAuthTabCallback;
    }

    public SerialDescriptor getDescriptor() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 47;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        setAnimationsLoop setanimationsloop = descriptor;
        int i6 = i4 + 47;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return setanimationsloop;
    }

    public void onWarmupCompleted(@NotNull Encoder encoder, @NotNull AppsError appsError) {
        int i2 = 2 % 2;
        int i3 = asInterface + 87;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(appsError, "");
            SerialDescriptor descriptor2 = getDescriptor();
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(descriptor2);
            AppsError.onExtraCallback(appsError, vylVarOnExtraCallback, descriptor2);
            vylVarOnExtraCallback.onNavigationEvent(descriptor2);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(appsError, "");
        SerialDescriptor descriptor3 = getDescriptor();
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(descriptor3);
        AppsError.onExtraCallback(appsError, vylVarOnExtraCallback2, descriptor3);
        vylVarOnExtraCallback2.onNavigationEvent(descriptor3);
        int i4 = asInterface + 101;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i2 = 2 % 2;
        int i3 = asInterface + 61;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted(encoder, (AppsError) obj);
        if (i4 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 7;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        KSerializer<?>[] kSerializerArrOnWarmupCompleted = aeu2.onWarmupCompleted.onWarmupCompleted(this);
        int i5 = IAuthTabCallbackStub + 79;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return kSerializerArrOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(short s, byte b, int i2, int i3, int i4, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i5;
        int length;
        byte[] bArr;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 43424), (ViewConfiguration.getLongPressTimeout() >> 16) + 42, AndroidCharacter.getMirror('0') + 22391, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $11 + 105;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr2 = onWarmupCompleted;
                if (bArr2 != null) {
                    int i9 = $10 + 13;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    for (int i10 = 0; i10 < length; i10++) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i10])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12843), 55 - TextUtils.getOffsetAfter("", 0), (KeyEvent.getMaxKeyCode() >> 16) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = onWarmupCompleted;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - TextUtils.lastIndexOf("", '0', 0)), 42 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 22439 - Gravity.getAbsoluteGravity(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (IAuthTabCallback[i2 + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i11 = ((i2 + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ j));
                if (z) {
                    int i12 = $11 + 33;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i11 + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onExtraCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), ImageFormat.getBitsPerPixel(0) + 87, 9567 - (ViewConfiguration.getScrollBarSize() >> 8), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onWarmupCompleted;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i14 = 0;
                    while (i14 < length2) {
                        int i15 = $11 + 11;
                        $10 = i15 % 128;
                        if (i15 % 2 != 0) {
                            bArr5[i14] = (byte) (bArr4[i14] / (-4629411779493505016L));
                        } else {
                            bArr5[i14] = (byte) (bArr4[i14] ^ (-4629411779493505016L));
                            i14++;
                        }
                    }
                    int i16 = $11 + 35;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
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

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = -2047692903;
        onNavigationEvent = -1538795398;
        onExtraCallback = -324269355;
        onWarmupCompleted = new byte[]{-103, -102, 52, -102, -107, 8};
    }
}
