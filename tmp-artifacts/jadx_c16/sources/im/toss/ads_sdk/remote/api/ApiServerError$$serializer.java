package im.toss.ads_sdk.remote.api;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.lguplus.usimlib.TsmResponse;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.aeu2;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ApiServerError$$serializer implements aeu2<ApiServerError> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final ApiServerError$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 11;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onWarmupCompleted();
        ApiServerError$$serializer apiServerError$$serializer = new ApiServerError$$serializer();
        INSTANCE = apiServerError$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.api.ApiServerError", apiServerError$$serializer, 5);
        setanimationsloop.onWarmupCompleted("errorType", true);
        setanimationsloop.onWarmupCompleted(TsmResponse.errorCode, true);
        Object[] objArr = new Object[1];
        a(new int[]{239095082, 157353774, 733779976, -1012664475}, View.MeasureSpec.makeMeasureSpec(0, 0) + 6, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(new int[]{-957786571, 871025385, -1300802280, 215945594}, 5 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(new int[]{1309141040, -550214265}, 4 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 89;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private ApiServerError$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallback = ApiServerError.IAuthTabCallback();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getDynamicHeight.onWarmupCompleted, getwrigglelayout, getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout), lazyArrIAuthTabCallback[4].getValue()};
        int i4 = IAuthTabCallback + 7;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006c A[PHI: r0 r2 r3
      0x006c: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x003f, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x006c: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003f, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x006c: PHI (r3v11 kotlin.Lazy[]) = (r3v2 kotlin.Lazy[]), (r3v13 kotlin.Lazy[]) binds: [B:8:0x003f, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041 A[PHI: r0 r2 r3
      0x0041: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x003f, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0041: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003f, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0041: PHI (r3v3 kotlin.Lazy[]) = (r3v2 kotlin.Lazy[]), (r3v13 kotlin.Lazy[]) binds: [B:8:0x003f, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ApiServerError deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrIAuthTabCallback;
        int i;
        Map map;
        String str;
        String str2;
        int i2;
        String str3;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 55;
        IAuthTabCallback = i4 % 128;
        int i5 = 1;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrIAuthTabCallback = ApiServerError.IAuthTabCallback();
            int i6 = 24 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                int iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, (Object) null);
                i = 31;
                map = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrIAuthTabCallback[4].getValue(), (Object) null);
                str = str4;
                str2 = strAsInterface;
                i2 = iOnTransact;
                str3 = strAsInterface2;
            } else {
                boolean z = true;
                String strAsInterface3 = null;
                str = null;
                Map map2 = null;
                String strAsInterface4 = null;
                int i7 = 0;
                int iOnTransact2 = 0;
                while (z) {
                    int i8 = onNavigationEvent + 45;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent == 0) {
                        iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                        i7 |= 1;
                    } else if (iOnNavigationEvent != i5) {
                        if (iOnNavigationEvent != 2) {
                            int i10 = onNavigationEvent + 121;
                            int i11 = i10 % 128;
                            IAuthTabCallback = i11;
                            int i12 = i10 % 2;
                            if (iOnNavigationEvent != 3) {
                                int i13 = i11 + 29;
                                onNavigationEvent = i13 % 128;
                                int i14 = i13 % 2;
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                map2 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrIAuthTabCallback[4].getValue(), map2);
                                i7 |= 16;
                            } else {
                                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str);
                                i7 |= 8;
                            }
                        } else {
                            strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                            i7 |= 4;
                        }
                        i5 = 1;
                    } else {
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i5);
                        i7 |= 2;
                    }
                }
                i = i7;
                str3 = strAsInterface3;
                map = map2;
                str2 = strAsInterface4;
                i2 = iOnTransact2;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrIAuthTabCallback = ApiServerError.IAuthTabCallback();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ApiServerError(i, i2, str2, str3, str, map, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m35deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ApiServerError apiServerErrorDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 121;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return apiServerErrorDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ApiServerError apiServerError) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(apiServerError, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ApiServerError.onExtraCallback(apiServerError, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(apiServerError, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ApiServerError.onExtraCallback(apiServerError, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 103;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ApiServerError) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 34 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = IAuthTabCallback + 45;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallbackWithResult;
        int i4 = -1469660336;
        char c = 0;
        if (iArr2 != null) {
            int i5 = $10 + 93;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 72 - (ViewConfiguration.getScrollBarSize() >> 8), 8848 - KeyEvent.keyCodeFromString(""), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallbackWithResult;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[c] = Integer.valueOf(iArr5[i8]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 72, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i8++;
                int i9 = $11 + 85;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                c = 0;
            }
            int i11 = $11 + 5;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            iArr5 = iArr6;
            i2 = 0;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        int i13 = $10 + 21;
        $11 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 4 % 2;
        }
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i15 = $11 + 101;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i17 = 0;
            for (int i18 = 16; i17 < i18; i18 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i17];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - TextUtils.indexOf("", "")), 39 - Color.red(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10300, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i17++;
            }
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i19;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - KeyEvent.keyCodeFromString("")), 78 - (ViewConfiguration.getJumpTapTimeout() >> 16), 7399 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = new int[]{-223055158, 1880161133, 791435285, -2052127148, 2000572846, 1680849199, -442995893, 1960208285, -61465475, 568644549, 1271394645, 1296705843, -47491565, 1623409116, -558669666, 405250123, 1230630963, -650246897};
    }
}
