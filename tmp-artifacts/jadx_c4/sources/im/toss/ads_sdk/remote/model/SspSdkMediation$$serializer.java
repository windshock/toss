package im.toss.ads_sdk.remote.model;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
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
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class SspSdkMediation$$serializer implements aeu2<SspSdkMediation> {
    public static final int $stable;
    private static int IAuthTabCallback;
    public static final SspSdkMediation$$serializer INSTANCE;
    private static int asBinder;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static short[] onExtraCallbackWithResult;
    private static byte[] onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {99, 53, 44, 107};
    private static final int $$b = 97;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    private static int IAuthTabCallbackStub = 1;

    private static String $$c(int i, byte b, byte b2) {
        int i2 = (i * 2) + 115;
        int i3 = b * 4;
        byte[] bArr = $$a;
        int i4 = 4 - (b2 * 2);
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 += i4;
            i4++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            int i7 = i4;
            i2 = bArr[i4] + i2;
            i4 = i7 + 1;
            i5 = i6;
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        asBinder = 0;
        onExtraCallback();
        SspSdkMediation$$serializer sspSdkMediation$$serializer = new SspSdkMediation$$serializer();
        INSTANCE = sspSdkMediation$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.model.SspSdkMediation", sspSdkMediation$$serializer, 6);
        setanimationsloop.onWarmupCompleted("mediationId", true);
        Object[] objArr = new Object[1];
        a((short) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33), (byte) (ViewConfiguration.getEdgeSlop() >> 16), (-460425601) + TextUtils.lastIndexOf("", '0', 0), 832361336 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (-8) - (Process.myPid() >> 22), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("admob", true);
        setanimationsloop.onWarmupCompleted("endpoint", true);
        setanimationsloop.onWarmupCompleted("ruleSet", true);
        setanimationsloop.onWarmupCompleted("bannedKeywords", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackStub + 67;
        asBinder = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private SspSdkMediation$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = SspSdkMediation.onNavigationEvent();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, sp.IAuthTabCallback(SspSdkMediationAdmob$$serializer.INSTANCE), sp.IAuthTabCallback(SspSdkMediationEndpoint$$serializer.INSTANCE), lazyArrOnNavigationEvent[4].getValue(), lazyArrOnNavigationEvent[5].getValue()};
        int i4 = onTransact + 117;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final SspSdkMediation deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String strAsInterface2;
        SspSdkMediationAdmob sspSdkMediationAdmob;
        List list;
        List list2;
        int i;
        SspSdkMediationEndpoint sspSdkMediationEndpoint;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = SspSdkMediation.onNavigationEvent();
        int i3 = 3;
        SspSdkMediationEndpoint sspSdkMediationEndpoint2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            SspSdkMediationAdmob sspSdkMediationAdmob2 = (SspSdkMediationAdmob) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, SspSdkMediationAdmob$$serializer.INSTANCE, (Object) null);
            SspSdkMediationEndpoint sspSdkMediationEndpoint3 = (SspSdkMediationEndpoint) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, SspSdkMediationEndpoint$$serializer.INSTANCE, (Object) null);
            List list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrOnNavigationEvent[4].getValue(), (Object) null);
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnNavigationEvent[5].getValue(), (Object) null);
            strAsInterface = strAsInterface3;
            sspSdkMediationEndpoint = sspSdkMediationEndpoint3;
            strAsInterface2 = strAsInterface4;
            list2 = list3;
            sspSdkMediationAdmob = sspSdkMediationAdmob2;
            i = 63;
        } else {
            boolean z = true;
            int i4 = 0;
            List list4 = null;
            strAsInterface = null;
            strAsInterface2 = null;
            sspSdkMediationAdmob = null;
            List list5 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        int i5 = onTransact + 41;
                        IAuthTabCallbackDefault = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 5 % 2;
                        }
                        i3 = 3;
                        z = false;
                        continue;
                    case 0:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i4 |= 1;
                        break;
                    case 1:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        sspSdkMediationAdmob = (SspSdkMediationAdmob) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, SspSdkMediationAdmob$$serializer.INSTANCE, sspSdkMediationAdmob);
                        i4 |= 4;
                        break;
                    case 3:
                        sspSdkMediationEndpoint2 = (SspSdkMediationEndpoint) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, SspSdkMediationEndpoint$$serializer.INSTANCE, sspSdkMediationEndpoint2);
                        i4 |= 8;
                        break;
                    case 4:
                        list5 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrOnNavigationEvent[4].getValue(), list5);
                        i4 |= 16;
                        break;
                    case 5:
                        list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnNavigationEvent[5].getValue(), list4);
                        i4 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            list = list4;
            list2 = list5;
            i = i4;
            sspSdkMediationEndpoint = sspSdkMediationEndpoint2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        SspSdkMediation sspSdkMediation = new SspSdkMediation(i, strAsInterface, strAsInterface2, sspSdkMediationAdmob, sspSdkMediationEndpoint, list2, list, (okycx) null);
        int i7 = onTransact + 51;
        IAuthTabCallbackDefault = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 52 / 0;
        }
        return sspSdkMediation;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m65deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        SspSdkMediation sspSdkMediationDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        int i5 = onTransact + 81;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return sspSdkMediationDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SspSdkMediation sspSdkMediation) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(sspSdkMediation, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        SspSdkMediation.onExtraCallbackWithResult(sspSdkMediation, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackDefault + 27;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SspSdkMediation) obj);
        int i4 = onTransact + 125;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackDefault + 1;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        int length;
        byte[] bArr;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 42 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr2 = onNavigationEvent;
                if (bArr2 != null) {
                    int i6 = $10 + 81;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    for (int i7 = 0; i7 < length; i7++) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i7])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 12843), 55 - KeyEvent.getDeadChar(0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - Color.argb(0, 0, 0, 0)), 42 - Drawable.resolveOpacity(0, 0), 22439 - View.getDefaultSize(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i8 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j));
                if (z) {
                    int i9 = $10 + 87;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i8 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 85 - TextUtils.lastIndexOf("", '0'), 9567 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onNavigationEvent;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i11 = $11 + 113;
                    $10 = i11 % 128;
                    int i12 = 2;
                    int i13 = i11 % 2;
                    int i14 = 0;
                    while (i14 < length2) {
                        int i15 = $11 + 21;
                        $10 = i15 % 128;
                        if (i15 % i12 != 0) {
                            bArr5[i14] = (byte) (bArr4[i14] - (-4629411779493505016L));
                            i14--;
                        } else {
                            bArr5[i14] = (byte) (bArr4[i14] ^ (-4629411779493505016L));
                            i14++;
                        }
                        i12 = 2;
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                int i16 = $11 + 101;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void onExtraCallback() {
        IAuthTabCallback = -1086959222;
        onExtraCallback = -1538795496;
        onWarmupCompleted = 1780806897;
        onNavigationEvent = new byte[]{-20, -30, -34, -22, -19, -34, -23, 8};
    }
}
