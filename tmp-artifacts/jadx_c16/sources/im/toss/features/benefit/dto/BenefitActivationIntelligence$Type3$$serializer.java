package im.toss.features.benefit.dto;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.benefit.dto.BenefitActivationIntelligence;
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
import o.getBgColor;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitActivationIntelligence$Type3$$serializer implements aeu2<BenefitActivationIntelligence.Type3> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static boolean IAuthTabCallback = false;
    public static final BenefitActivationIntelligence$Type3$$serializer INSTANCE;
    private static int asBinder = 1;
    private static int asInterface = 0;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 0;
    private static boolean onNavigationEvent = false;
    private static int onTransact = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 51;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 75;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onExtraCallback();
        BenefitActivationIntelligence$Type3$$serializer benefitActivationIntelligence$Type3$$serializer = new BenefitActivationIntelligence$Type3$$serializer();
        INSTANCE = benefitActivationIntelligence$Type3$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.benefit.dto.BenefitActivationIntelligence.Type3", benefitActivationIntelligence$Type3$$serializer, 7);
        setanimationsloop.onWarmupCompleted("id", true);
        setanimationsloop.onWarmupCompleted("logType", true);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-121, -122, -124, -123, -124, -125, -126, -127}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("titleLower", true);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-121, -122, -124, -123, -124}, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("row", true);
        setanimationsloop.onWarmupCompleted("showAd", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 23;
        asBinder = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private BenefitActivationIntelligence$Type3$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializer2 = getBgColor.IAuthTabCallback;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, sp.IAuthTabCallback(kSerializer2), kSerializer, BenefitActivationIntelligence$Row$$serializer.INSTANCE, kSerializer2};
        int i4 = onTransact + 81;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BenefitActivationIntelligence.Type3 deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        BenefitActivationIntelligence.Row row;
        String str;
        boolean z;
        int i;
        Boolean bool;
        String str2;
        String str3;
        String str4;
        int i2 = 2 % 2;
        int i3 = onTransact + 91;
        asInterface = i3 % 128;
        String str5 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 6;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            Boolean bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getBgColor.IAuthTabCallback, (Object) null);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            BenefitActivationIntelligence.Row row2 = (BenefitActivationIntelligence.Row) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, BenefitActivationIntelligence$Row$$serializer.INSTANCE, (Object) null);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6);
            int i5 = onTransact + 19;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            i = 127;
            str2 = str8;
            row = row2;
            z = zOnExtraCallbackWithResult;
            bool = bool2;
            str = strAsInterface;
            str3 = str7;
            str4 = str6;
        } else {
            BenefitActivationIntelligence.Row row3 = null;
            String strAsInterface2 = null;
            String str9 = null;
            String str10 = null;
            Boolean bool3 = null;
            boolean z2 = true;
            int i7 = 0;
            boolean zOnExtraCallbackWithResult2 = false;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z2 = false;
                    case 0:
                        str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str10);
                        i7 |= 1;
                        i4 = 6;
                    case 1:
                        str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str9);
                        i7 |= 2;
                        int i8 = asInterface + 47;
                        onTransact = i8 % 128;
                        int i9 = i8 % 2;
                        i4 = 6;
                    case 2:
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str5);
                        i7 |= 4;
                        i4 = 6;
                    case 3:
                        bool3 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getBgColor.IAuthTabCallback, bool3);
                        i7 |= 8;
                        i4 = 6;
                    case 4:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i7 |= 16;
                        i4 = 6;
                    case 5:
                        row3 = (BenefitActivationIntelligence.Row) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, BenefitActivationIntelligence$Row$$serializer.INSTANCE, row3);
                        i7 |= 32;
                        int i10 = onTransact + 25;
                        asInterface = i10 % 128;
                        int i11 = i10 % 2;
                        i4 = 6;
                    case 6:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4);
                        i7 |= 64;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            row = row3;
            str = strAsInterface2;
            z = zOnExtraCallbackWithResult2;
            i = i7;
            bool = bool3;
            str2 = str5;
            String str11 = str10;
            str3 = str9;
            str4 = str11;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BenefitActivationIntelligence.Type3(i, str4, str3, str2, bool, str, row, z, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m91deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        BenefitActivationIntelligence.Type3 type3Deserialize = deserialize(decoder);
        int i4 = onTransact + 85;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return type3Deserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BenefitActivationIntelligence.Type3 type3) {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(type3, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            BenefitActivationIntelligence.Type3.onExtraCallback(type3, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 92 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(type3, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            BenefitActivationIntelligence.Type3.onExtraCallback(type3, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onTransact + 37;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BenefitActivationIntelligence.Type3) obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onTransact + 25;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onTransact + 109;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallback;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                int i4 = $10 + 125;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.indexOf((CharSequence) "", '0') + 78, 20952 - TextUtils.indexOf("", "", 0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i3])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 76 - TextUtils.indexOf((CharSequence) "", '0'), 20952 - View.resolveSize(0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i3] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i3++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), KeyEvent.getDeadChar(0, 0) + 75, 16037 - View.resolveSizeAndState(0, 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), View.resolveSizeAndState(0, 0, 0) + 63, (Process.myPid() >> 22) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            String str = new String(cArr4);
            int i5 = $10 + 49;
            $11 = i5 % 128;
            if (i5 % 2 != 0) {
                objArr[0] = str;
                return;
            } else {
                obj.hashCode();
                throw null;
            }
        }
        if (onNavigationEvent) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 63 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 12214 - TextUtils.getCapsMode("", 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
        }
        String str2 = new String(cArr6);
        int i6 = $10 + 35;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str2;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    static void onExtraCallback() {
        onExtraCallback = new char[]{32439, 32437, 32384, 32438, 32441, 32446, 32389};
        onExtraCallbackWithResult = -1184334046;
        onNavigationEvent = true;
        IAuthTabCallback = true;
    }
}
