package im.toss.facepay.validation.model.init.config.service;

import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class SystemConfig$$serializer implements aeu2<SystemConfig> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    public static final SystemConfig$$serializer INSTANCE;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static char[] onWarmupCompleted;

    private SystemConfig$$serializer() {
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallback();
        SystemConfig$$serializer systemConfig$$serializer = new SystemConfig$$serializer();
        INSTANCE = systemConfig$$serializer;
        Object[] objArr = new Object[1];
        a(new char[]{'\r', 19, 4, 6, 24, 21, 21, 0, 14, 23, 22, 6, 14, 21, 6, 0, 19, 22, 24, 19, 4, 22, 14, 19, 20, 18, 3, 16, 22, 3, '\t', 17, 4, 11, 19, '\n', 6, 4, 22, 24, 18, '\n', '\f', 24, 0, 21, '\f', 17, 19, '\f', 22, 6, 2, 4, '\n', 0, 5, '\b', 15, 3, 20, 18, 14, '\n', 13823}, (byte) (2 - View.resolveSize(0, 0)), Color.green(0) + 65, objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), systemConfig$$serializer, 1);
        Object[] objArr2 = new Object[1];
        a(new char[]{21, 22, 2, '\t', 3, 7, 17, '\t', 1, 7, 5, 22, 14, 4, 14, 7, 19, 11, 17, '\b'}, (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 50), 20 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 53;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 72 / 0;
        }
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = asInterface + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArr = new KSerializer[0];
            kSerializerArr[1] = getWriggleLayout.onNavigationEvent;
        } else {
            kSerializerArr = new KSerializer[]{getWriggleLayout.onNavigationEvent};
        }
        int i3 = onExtraCallback + 19;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final SystemConfig deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Object obj = null;
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = asInterface + 79;
            onExtraCallback = i3 % 128;
            strAsInterface = i3 % 2 != 0 ? ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1) : ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
        } else {
            strAsInterface = null;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i5 = asInterface + 55;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i4 = 1;
                }
            }
            i2 = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        SystemConfig systemConfig = new SystemConfig(i2, strAsInterface, (okycx) null);
        int i7 = asInterface + 89;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return systemConfig;
        }
        obj.hashCode();
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m337deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SystemConfig systemConfig) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(systemConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        SystemConfig.onExtraCallback(systemConfig, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 9;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SystemConfig) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onWarmupCompleted;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 26 - Gravity.getAbsoluteGravity(0, 0), MotionEvent.axisFromString("") + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        try {
            Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), TextUtils.indexOf("", "") + 26, 23139 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                int i5 = $10 + 73;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 74 - (ViewConfiguration.getTouchSlop() >> 8), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i7 = $10 + 3;
                            $11 = i7 % 128;
                            int i8 = i7 % 2;
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 30, 19488 - TextUtils.getOffsetBefore("", 0), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                            } else {
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            for (int i14 = 0; i14 < i; i14++) {
                cArr4[i14] = (char) (cArr4[i14] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onExtraCallback() {
        onWarmupCompleted = new char[]{65008, 64925, 64983, 64992, 64987, 64970, 64993, 64982, 64966, 64967, 65011, 64963, 64961, 64981, 64986, 64989, 64999, 64965, 64990, 64991, 64960, 64976, 64980, 64988, 64978};
        IAuthTabCallback = (char) 51244;
    }
}
