package im.toss.ads_sdk.remote.model;

import android.graphics.Color;
import android.text.TextUtils;
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
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class SdkTemplateQuestionnaire$$serializer implements aeu2<SdkTemplateQuestionnaire> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 0;
    public static final SdkTemplateQuestionnaire$$serializer INSTANCE;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static boolean onExtraCallback = false;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static boolean onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 9;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return serialDescriptor;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), Color.argb(0, 0, 0, 0) + 77, TextUtils.getTrimmedLength("") + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 75 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 16037 - TextUtils.indexOf("", ""), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i4 = 1052772399;
        if (onWarmupCompleted) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.lastIndexOf("", '0', 0) + 64, 12214 - (KeyEvent.getMaxKeyCode() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 1052772399;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onExtraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i5 = $11 + 81;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i7 = $11 + 55;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 63 - Color.blue(0), 12214 - (ViewConfiguration.getFadingEdgeLength() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    static {
        IAuthTabCallback();
        SdkTemplateQuestionnaire$$serializer sdkTemplateQuestionnaire$$serializer = new SdkTemplateQuestionnaire$$serializer();
        INSTANCE = sdkTemplateQuestionnaire$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.model.SdkTemplateQuestionnaire", sdkTemplateQuestionnaire$$serializer, 5);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-127, -125, -126, -127}, Color.argb(0, 0, 0, 0) + 127, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("choiceType", true);
        setanimationsloop.onWarmupCompleted("isRequired", true);
        setanimationsloop.onWarmupCompleted("placeholder", true);
        setanimationsloop.onWarmupCompleted("choices", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 19;
        onTransact = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private SdkTemplateQuestionnaire$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Lazy[] lazyArrOnNavigationEvent = SdkTemplateQuestionnaire.onNavigationEvent();
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{getwrigglelayout, getwrigglelayout, getBgColor.IAuthTabCallback, getwrigglelayout, lazyArrOnNavigationEvent[4].getValue()};
        }
        Lazy[] lazyArrOnNavigationEvent2 = SdkTemplateQuestionnaire.onNavigationEvent();
        KSerializer<?>[] kSerializerArr = new KSerializer[2];
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        kSerializerArr[1] = getwrigglelayout2;
        kSerializerArr[1] = getwrigglelayout2;
        kSerializerArr[4] = getBgColor.IAuthTabCallback;
        kSerializerArr[5] = getwrigglelayout2;
        kSerializerArr[5] = lazyArrOnNavigationEvent2[2].getValue();
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final SdkTemplateQuestionnaire deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String strAsInterface2;
        boolean zOnExtraCallbackWithResult;
        List list;
        int i;
        String str;
        int i2 = 2 % 2;
        int i3 = asInterface + 123;
        IAuthTabCallbackDefault = i3 % 128;
        String strAsInterface3 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            SdkTemplateQuestionnaire.onNavigationEvent();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            strAsInterface3.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = SdkTemplateQuestionnaire.onNavigationEvent();
        if (!ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            list = null;
            strAsInterface2 = null;
            strAsInterface = null;
            int i4 = 1;
            i = 0;
            zOnExtraCallbackWithResult = false;
            for (int i5 = 1; (i4 ^ 1) != i5; i5 = 1) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    i4 = 0;
                } else if (iOnNavigationEvent == 0) {
                    strAsInterface = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 0);
                    i |= 1;
                } else if (iOnNavigationEvent == i5) {
                    strAsInterface2 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, i5);
                    i |= 2;
                } else if (iOnNavigationEvent == 2) {
                    zOnExtraCallbackWithResult = ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2);
                    i |= 4;
                } else if (iOnNavigationEvent != 3) {
                    int i6 = asInterface + 103;
                    IAuthTabCallbackDefault = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnNavigationEvent != 4) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    list = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrOnNavigationEvent[4].getValue(), list);
                    i |= 16;
                } else {
                    strAsInterface3 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 3);
                    i |= 8;
                }
            }
            str = strAsInterface3;
        } else {
            strAsInterface = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 0);
            strAsInterface2 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 1);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2);
            String strAsInterface4 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 3);
            list = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrOnNavigationEvent[4].getValue(), (Object) null);
            i = 31;
            str = strAsInterface4;
        }
        String str2 = strAsInterface2;
        String str3 = strAsInterface;
        int i8 = i;
        boolean z = zOnExtraCallbackWithResult;
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new SdkTemplateQuestionnaire(i8, str3, str2, z, str, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m59deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SdkTemplateQuestionnaire sdkTemplateQuestionnaire) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(sdkTemplateQuestionnaire, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        SdkTemplateQuestionnaire.onExtraCallback(sdkTemplateQuestionnaire, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackDefault + 31;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 31;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SdkTemplateQuestionnaire) obj);
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 93;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asInterface + 67;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = new char[]{32495, 32510, 32483};
        onExtraCallbackWithResult = -1184334181;
        onExtraCallback = true;
        onWarmupCompleted = true;
    }
}
