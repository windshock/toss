package im.toss.features.mobile.id.model;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import im.toss.features.mobile.id.model.RegisteredDeviceResponse;
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
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RegisteredDeviceResponse$ConnectedDeviceInfo$$serializer implements aeu2<RegisteredDeviceResponse.ConnectedDeviceInfo> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    public static final RegisteredDeviceResponse$ConnectedDeviceInfo$$serializer INSTANCE;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 83;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return serialDescriptor;
    }

    static {
        onExtraCallbackWithResult();
        RegisteredDeviceResponse$ConnectedDeviceInfo$$serializer registeredDeviceResponse$ConnectedDeviceInfo$$serializer = new RegisteredDeviceResponse$ConnectedDeviceInfo$$serializer();
        INSTANCE = registeredDeviceResponse$ConnectedDeviceInfo$$serializer;
        Object[] objArr = new Object[1];
        a(new char[]{49318, 18001, 27018, 42007, 35425, 7798, 38093, 28482, 60686, 56663, 31538, 39412, 38440, 6190, 51833, 11352, 16883, 32028, 54527, 51868, 64260, 28454, 191, 63121, 46657, 63151, 16883, 32028, 1923, 65513, 14177, 6260, 883, 14814, 64405, 13146, 50041, 26026, 50356, 39899, 17921, 5356, 22915, 5081, 55221, 51691, 7859, 11902, 22038, 17071, 51833, 11352, 8120, 6496, 5785, 17907, 191, 63121, 6544, 21715, 1097, 1448, 21906, 64908, 50356, 39899, 22915, 5081, 55221, 51691, 7859, 11902, 8233, 56137, 11861, 53893, 61447, 41321}, 77 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), registeredDeviceResponse$ConnectedDeviceInfo$$serializer, 5);
        Object[] objArr2 = new Object[1];
        a(new char[]{20527, 35716, 7287, 32432, 2844, 9210, 62304, 39251}, TextUtils.getOffsetBefore("", 0) + 8, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        Object[] objArr3 = new Object[1];
        a(new char[]{2928, 46793, 17610, 46890, 55453, 3932, 12073, 20265, 62618, 53758, 46847, 61974, 63776, 40984}, 15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), false);
        Object[] objArr4 = new Object[1];
        a(new char[]{2928, 46793, 17610, 46890, 55453, 3932, 21008, 33246, 3382, 62017, 15427, 26892, 15436, 30837, 63367, 8189, 29068, 20675}, 16 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), false);
        Object[] objArr5 = new Object[1];
        a(new char[]{50041, 26026, 46668, 1689, 39130, 14140, 43374, 23417, 18731, 2744, 10411, 4416}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 12, objArr5);
        setanimationsloop.onWarmupCompleted(((String) objArr5[0]).intern(), true);
        Object[] objArr6 = new Object[1];
        a(new char[]{60964, 8009, 1097, 1448, 21906, 64908, 50356, 39899, 20070, 6636, 33874, 17763}, 11 - Gravity.getAbsoluteGravity(0, 0), objArr6);
        setanimationsloop.onWarmupCompleted(((String) objArr6[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 119;
        asInterface = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private RegisteredDeviceResponse$ConnectedDeviceInfo$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Lazy[] lazyArrIAuthTabCallback = RegisteredDeviceResponse.ConnectedDeviceInfo.IAuthTabCallback();
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{getwrigglelayout, getwrigglelayout, getwrigglelayout, lazyArrIAuthTabCallback[3].getValue(), lazyArrIAuthTabCallback[4].getValue()};
        }
        Lazy[] lazyArrIAuthTabCallback2 = RegisteredDeviceResponse.ConnectedDeviceInfo.IAuthTabCallback();
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        kSerializerArr[0] = getwrigglelayout2;
        kSerializerArr[0] = getwrigglelayout2;
        kSerializerArr[3] = getwrigglelayout2;
        kSerializerArr[4] = lazyArrIAuthTabCallback2[4].getValue();
        kSerializerArr[5] = lazyArrIAuthTabCallback2[2].getValue();
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0074 A[PHI: r0 r2 r4
      0x0074: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0074: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0074: PHI (r4v11 kotlin.Lazy[]) = (r4v2 kotlin.Lazy[]), (r4v14 kotlin.Lazy[]) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040 A[PHI: r0 r2 r4
      0x0040: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r4v3 kotlin.Lazy[]) = (r4v2 kotlin.Lazy[]), (r4v14 kotlin.Lazy[]) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RegisteredDeviceResponse.ConnectedDeviceInfo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrIAuthTabCallback;
        int i;
        List list;
        String str;
        String str2;
        List list2;
        String str3;
        int i2 = 2 % 2;
        int i3 = onTransact + 3;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = 1;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrIAuthTabCallback = RegisteredDeviceResponse.ConnectedDeviceInfo.IAuthTabCallback();
            int i5 = 38 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                List list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrIAuthTabCallback[3].getValue(), (Object) null);
                i = 31;
                list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrIAuthTabCallback[4].getValue(), (Object) null);
                str = strAsInterface2;
                str2 = strAsInterface3;
                list2 = list3;
                str3 = strAsInterface;
            } else {
                boolean z = true;
                String strAsInterface4 = null;
                list = null;
                List list4 = null;
                String strAsInterface5 = null;
                String strAsInterface6 = null;
                int i6 = 0;
                while (z) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent == 0) {
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i6 |= 1;
                    } else if (iOnNavigationEvent != i4) {
                        int i7 = onTransact + 15;
                        int i8 = i7 % 128;
                        IAuthTabCallbackDefault = i8;
                        if (i7 % 2 == 0 ? iOnNavigationEvent == 2 : iOnNavigationEvent == 2) {
                            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                            i6 |= 4;
                        } else {
                            int i9 = i8 + 3;
                            onTransact = i9 % 128;
                            int i10 = i9 % 2;
                            if (iOnNavigationEvent == 3) {
                                list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrIAuthTabCallback[3].getValue(), list4);
                                i6 |= 8;
                            } else {
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrIAuthTabCallback[4].getValue(), list);
                                i6 |= 16;
                            }
                        }
                        i4 = 1;
                    } else {
                        strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i4);
                        i6 |= 2;
                    }
                }
                int i11 = IAuthTabCallbackDefault + 101;
                onTransact = i11 % 128;
                int i12 = i11 % 2;
                i = i6;
                str2 = strAsInterface4;
                list2 = list4;
                str = strAsInterface5;
                str3 = strAsInterface6;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrIAuthTabCallback = RegisteredDeviceResponse.ConnectedDeviceInfo.IAuthTabCallback();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new RegisteredDeviceResponse.ConnectedDeviceInfo(i, str3, str, str2, list2, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m670deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        RegisteredDeviceResponse.ConnectedDeviceInfo connectedDeviceInfoDeserialize = deserialize(decoder);
        int i4 = onTransact + 27;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return connectedDeviceInfoDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull RegisteredDeviceResponse.ConnectedDeviceInfo connectedDeviceInfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(connectedDeviceInfo, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            RegisteredDeviceResponse.ConnectedDeviceInfo.onExtraCallbackWithResult(connectedDeviceInfo, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(connectedDeviceInfo, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        RegisteredDeviceResponse.ConnectedDeviceInfo.onExtraCallbackWithResult(connectedDeviceInfo, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 2 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (RegisteredDeviceResponse.ConnectedDeviceInfo) obj);
        int i4 = IAuthTabCallbackDefault + 93;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackDefault + 123;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $11 + 105;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i8 = (c3 + i4) ^ ((c3 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i9 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallback);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[c] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iArgb = Color.argb(0, 0, 0, 0) + 10;
                        int scrollDefaultDelay = 12434 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(longPressTimeout, iArgb, scrollDefaultDelay, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i10 = i5;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 9 - TextUtils.lastIndexOf("", '0', 0), 12433 - Process.getGidForName(""), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5 = i10 + 1;
                    cArr3 = cArr4;
                    i3 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - TextUtils.getOffsetAfter("", 0)), 14 - (ViewConfiguration.getFadingEdgeLength() >> 16), 19901 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i11 = $10 + 41;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = (char) 25397;
        onWarmupCompleted = (char) 11936;
        IAuthTabCallback = (char) 32848;
        onExtraCallback = (char) 25815;
    }
}
