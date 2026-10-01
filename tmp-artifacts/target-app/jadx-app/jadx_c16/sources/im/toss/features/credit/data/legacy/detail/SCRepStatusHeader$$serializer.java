package im.toss.features.credit.data.legacy.detail;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
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
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SCRepStatusHeader$$serializer implements aeu2<SCRepStatusHeader> {
    private static short[] IAuthTabCallback;
    public static final SCRepStatusHeader$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static byte[] onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {57, 22, -21, -92};
    private static final int $$b = 53;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int asBinder = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, int i2) {
        int i3;
        int i4 = i * 3;
        byte[] bArr = $$a;
        int i5 = (i2 * 4) + 115;
        int i6 = 3 - (s * 2);
        byte[] bArr2 = new byte[1 - i4];
        int i7 = 0 - i4;
        if (bArr == null) {
            int i8 = i5;
            int i9 = 0;
            int i10 = i6;
            int i11 = (-i6) + i8;
            i3 = i9;
            int i12 = i10;
            i5 = i11;
            i6 = i12;
            bArr2[i3] = (byte) i5;
            int i13 = i6 + 1;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            int i14 = i5;
            i10 = i13;
            i6 = bArr[i13];
            i9 = i3 + 1;
            i8 = i14;
            int i112 = (-i6) + i8;
            i3 = i9;
            int i122 = i10;
            i5 = i112;
            i6 = i122;
            bArr2[i3] = (byte) i5;
            int i132 = i6 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            int i1322 = i6 + 1;
            if (i3 == i7) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        return serialDescriptor;
    }

    static {
        onTransact = 1;
        onExtraCallbackWithResult();
        SCRepStatusHeader$$serializer sCRepStatusHeader$$serializer = new SCRepStatusHeader$$serializer();
        INSTANCE = sCRepStatusHeader$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.legacy.detail.SCRepStatusHeader", sCRepStatusHeader$$serializer, 5);
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (62 - TextUtils.lastIndexOf("", '0')), TextUtils.indexOf((CharSequence) "", '0', 0) - 68798265, 295568031 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) - 70, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("desc", true);
        setanimationsloop.onWarmupCompleted("icon", true);
        setanimationsloop.onWarmupCompleted("status", true);
        setanimationsloop.onWarmupCompleted("maturityDate", true);
        descriptor = setanimationsloop;
        int i = asBinder + 35;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    private SCRepStatusHeader$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[3];
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        kSerializerArr[1] = getwrigglelayout2;
        kSerializerArr[1] = getwrigglelayout2;
        kSerializerArr[5] = getwrigglelayout2;
        kSerializerArr[5] = getwrigglelayout2;
        kSerializerArr[3] = getwrigglelayout2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057 A[PHI: r0 r2
      0x0057: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0035, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0057: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0035, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[PHI: r0 r2
      0x0037: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0035, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0035, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SCRepStatusHeader deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        int i;
        String strAsInterface;
        String str;
        String str2;
        String str3;
        String str4;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 3;
        asInterface = i3 % 128;
        int i4 = 0;
        int i5 = 1;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i6 = 48 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                i = 31;
                strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                str = strAsInterface4;
                str2 = strAsInterface5;
                str3 = strAsInterface2;
                str4 = strAsInterface3;
            } else {
                String strAsInterface6 = null;
                String strAsInterface7 = null;
                String strAsInterface8 = null;
                strAsInterface = null;
                String strAsInterface9 = null;
                int i7 = 0;
                int i8 = 1;
                while (i8 != 0) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        i8 = i4;
                        i5 = i5;
                        i4 = i8;
                    } else if (iOnNavigationEvent == 0) {
                        int i9 = i5;
                        int i10 = i4;
                        strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i10);
                        i7 |= 1;
                        i5 = i9;
                        i4 = i10;
                    } else if (iOnNavigationEvent != i5) {
                        int i11 = asInterface;
                        int i12 = i11 + 93;
                        IAuthTabCallbackStub = i12 % 128;
                        if (i12 % 2 == 0 ? iOnNavigationEvent == 2 : iOnNavigationEvent == 2) {
                            strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                            i7 |= 4;
                        } else {
                            int i13 = i11 + 59;
                            int i14 = i13 % 128;
                            IAuthTabCallbackStub = i14;
                            if (i13 % 2 == 0 ? iOnNavigationEvent == 3 : iOnNavigationEvent == 3) {
                                strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                                i7 |= 8;
                            } else {
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                int i15 = i14 + 17;
                                asInterface = i15 % 128;
                                int i16 = i15 % 2;
                                strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                                i7 |= 16;
                                int i17 = IAuthTabCallbackStub + 73;
                                asInterface = i17 % 128;
                                int i18 = i17 % 2;
                            }
                        }
                        i4 = 0;
                        i5 = 1;
                    } else {
                        strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i5);
                        i7 |= 2;
                        i4 = 0;
                    }
                }
                str = strAsInterface6;
                str2 = strAsInterface7;
                str3 = strAsInterface8;
                str4 = strAsInterface9;
                i = i7;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new SCRepStatusHeader(i, str3, str4, str, str2, strAsInterface, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m114deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SCRepStatusHeader sCRepStatusHeaderDeserialize = deserialize(decoder);
        int i3 = asInterface + 17;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return sCRepStatusHeaderDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SCRepStatusHeader sCRepStatusHeader) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(sCRepStatusHeader, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            SCRepStatusHeader.onNavigationEvent(sCRepStatusHeader, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(sCRepStatusHeader, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        SCRepStatusHeader.onNavigationEvent(sCRepStatusHeader, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SCRepStatusHeader) obj);
        int i4 = IAuthTabCallbackStub + 87;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asInterface + 85;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x019c A[PHI: r0
      0x019c: PHI (r0v9 int) = (r0v8 int), (r0v36 int) binds: [B:39:0x019a, B:36:0x0189] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019e A[PHI: r0
      0x019e: PHI (r0v33 int) = (r0v8 int), (r0v36 int) binds: [B:39:0x019a, B:36:0x0189] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 43424), 43 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 22439 - View.combineMeasuredStates(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr = onNavigationEvent;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 55 - (Process.myTid() >> 22), TextUtils.getCapsMode("", 0, 0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i9 = $11 + 23;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    byte[] bArr3 = onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 43425), KeyEvent.getDeadChar(0, 0) + 42, (ViewConfiguration.getLongPressTimeout() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i11 = $11 + 45;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    i4 = ((i - iIntValue) * 2) / ((int) (onWarmupCompleted - 4629411779493505016L));
                    i5 = z ? 1 : 0;
                } else {
                    i4 = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ (-4629411779493505016L)));
                    if (z) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                try {
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 85 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.getCapsMode("", 0, 0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onNavigationEvent;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i12 = 0;
                        while (i12 < length2) {
                            int i13 = $10 + 69;
                            $11 = i13 % 128;
                            if (i13 % 2 == 0) {
                                bArr5[i12] = (byte) (bArr4[i12] & (-4629411779493505016L));
                                i12 %= 0;
                            } else {
                                bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                                i12++;
                            }
                        }
                        bArr4 = bArr5;
                    }
                    boolean z2 = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z2) {
                            int i14 = $10 + 41;
                            $11 = i14 % 128;
                            if (i14 % 2 == 0) {
                                byte[] bArr6 = onNavigationEvent;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent;
                                i6 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback - (((byte) (((byte) (bArr6[r7] & (-4629411779493505016L))) + s)) ^ b);
                            } else {
                                byte[] bArr7 = onNavigationEvent;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                i6 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b);
                            }
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) i6;
                        } else {
                            short[] sArr = IAuthTabCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                        int i15 = $11 + 71;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
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

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = -1604444366;
        onExtraCallbackWithResult = -1538795443;
        onExtraCallback = 1244014046;
        onNavigationEvent = new byte[]{-56, -50, -49, 60, -62};
    }
}
