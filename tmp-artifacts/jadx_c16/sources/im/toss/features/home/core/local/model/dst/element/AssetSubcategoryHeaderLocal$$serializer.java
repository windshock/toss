package im.toss.features.home.core.local.model.dst.element;

import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
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
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.aeu2;
import o.dj3;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetSubcategoryHeaderLocal$$serializer implements aeu2<AssetSubcategoryHeaderLocal> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    public static final AssetSubcategoryHeaderLocal$$serializer INSTANCE;
    private static int asBinder = 1;
    private static int asInterface;
    private static final SerialDescriptor descriptor;
    private static boolean onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    private static boolean onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 103;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 103;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onExtraCallbackWithResult();
        AssetSubcategoryHeaderLocal$$serializer assetSubcategoryHeaderLocal$$serializer = new AssetSubcategoryHeaderLocal$$serializer();
        INSTANCE = assetSubcategoryHeaderLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.AssetSubcategoryHeaderLocal", assetSubcategoryHeaderLocal$$serializer, 4);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-124, -125, -127, -126, -127}, TextUtils.lastIndexOf("", '0') + 128, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("titleAlt", false);
        setanimationsloop.onWarmupCompleted("logTitleAlt", false);
        setanimationsloop.onWarmupCompleted("topMargin", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 75;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 24 / 0;
        }
    }

    private AssetSubcategoryHeaderLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializer, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(dj3.onWarmupCompleted)};
        int i4 = asBinder + 69;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AssetSubcategoryHeaderLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        String str2;
        String str3;
        Float f;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String str4 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = asInterface + 85;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, (Object) null);
            str3 = strAsInterface;
            f = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, dj3.onWarmupCompleted, (Object) null);
            str2 = strAsInterface2;
            i = 15;
        } else {
            int i5 = 0;
            boolean z = true;
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            Float f2 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i5 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                    i5 |= 2;
                } else if (iOnNavigationEvent != 2) {
                    int i6 = asBinder + 113;
                    asInterface = i6 % 128;
                    if (i6 % 2 != 0) {
                        if (iOnNavigationEvent != 5) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        f2 = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, dj3.onWarmupCompleted, f2);
                        i5 |= 8;
                        int i7 = asBinder + 55;
                        asInterface = i7 % 128;
                        int i8 = i7 % 2;
                    } else {
                        if (iOnNavigationEvent != 3) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        f2 = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, dj3.onWarmupCompleted, f2);
                        i5 |= 8;
                        int i72 = asBinder + 55;
                        asInterface = i72 % 128;
                        int i82 = i72 % 2;
                    }
                } else {
                    str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str4);
                    i5 |= 4;
                }
            }
            i = i5;
            str = str4;
            str2 = strAsInterface3;
            str3 = strAsInterface4;
            f = f2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AssetSubcategoryHeaderLocal(i, str3, str2, str, f, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m277deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        AssetSubcategoryHeaderLocal assetSubcategoryHeaderLocalDeserialize = deserialize(decoder);
        int i4 = asInterface + 33;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return assetSubcategoryHeaderLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AssetSubcategoryHeaderLocal assetSubcategoryHeaderLocal) {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(assetSubcategoryHeaderLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AssetSubcategoryHeaderLocal.IAuthTabCallback(assetSubcategoryHeaderLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asBinder + 35;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AssetSubcategoryHeaderLocal) obj);
        int i4 = asBinder + 41;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asBinder + 57;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onExtraCallbackWithResult;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = $10 + 19;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 77 - (ViewConfiguration.getEdgeSlop() >> 16), 20952 - ((Process.getThreadPriority(0) + 20) >> 6), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 75, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        char c = '0';
        if (onExtraCallback) {
            int i7 = $10 + 73;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $10 + 119;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] / i] + iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf("", c, 0, 0)), 63 - (Process.myPid() >> 22), 12214 - View.MeasureSpec.getMode(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 63 - (KeyEvent.getMaxKeyCode() >> 16), 12214 - (Process.myTid() >> 22), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                c = '0';
            }
            objArr[0] = new String(cArr2);
            return;
        }
        if (!onNavigationEvent) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i9 = $10 + 105;
        $11 = i9 % 128;
        if (i9 % 2 == 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            i2 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            i2 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
        }
        char[] cArr6 = new char[i2];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i10 = $10 + 67;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] / iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), TextUtils.getCapsMode("", 0, 0) + 63, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr7 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 63, 12262 - AndroidCharacter.getMirror('0'), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
            int i11 = $10 + 93;
            $11 = i11 % 128;
            int i12 = i11 % 2;
        }
        objArr[0] = new String(cArr6);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = new char[]{32595, 32550, 32603, 32546};
        onWarmupCompleted = -1184333873;
        onNavigationEvent = true;
        onExtraCallback = true;
    }
}
