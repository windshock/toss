package im.toss.securities.widget.overview.ui.small.model;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.aeu2;
import o.dj3;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class OverviewSmallWidgetState$Error$$serializer implements aeu2<OverviewSmallWidgetState.Error> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final OverviewSmallWidgetState$Error$$serializer INSTANCE;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static char[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 25;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onNavigationEvent();
        OverviewSmallWidgetState$Error$$serializer overviewSmallWidgetState$Error$$serializer = new OverviewSmallWidgetState$Error$$serializer();
        INSTANCE = overviewSmallWidgetState$Error$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("Error", overviewSmallWidgetState$Error$$serializer, 3);
        setanimationsloop.onWarmupCompleted("displaySetting", true);
        Object[] objArr = new Object[1];
        a(new char[]{6, '\b', 0, 6, 13869}, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 51), Gravity.getAbsoluteGravity(0, 0) + 5, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(new char[]{'\b', 5, 13825, 13825, 6, 2, 13847}, (byte) (TextUtils.indexOf("", "", 0) + 24), (ViewConfiguration.getWindowTouchSlop() >> 8) + 7, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 3;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private OverviewSmallWidgetState$Error$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return new KSerializer[]{OverviewSmallWidgetState.Error.IAuthTabCallback()[0].getValue(), dj3.onWarmupCompleted, sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[2];
        kSerializerArr[1] = OverviewSmallWidgetState.Error.IAuthTabCallback()[1].getValue();
        kSerializerArr[0] = dj3.onWarmupCompleted;
        kSerializerArr[4] = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final OverviewSmallWidgetState.Error deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        DisplaySetting displaySetting;
        float f;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = OverviewSmallWidgetState.Error.IAuthTabCallback();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            DisplaySetting displaySetting2 = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
            float fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, (Object) null);
            displaySetting = displaySetting2;
            f = fOnWarmupCompleted;
            i = 7;
        } else {
            float fOnWarmupCompleted2 = 0.0f;
            String str2 = null;
            DisplaySetting displaySetting3 = null;
            boolean z = true;
            int i3 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = asInterface + 119;
                    int i5 = i4 % 128;
                    onNavigationEvent = i5;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        displaySetting3 = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), displaySetting3);
                        i3 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
                        i3 |= 2;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i6 = i5 + 55;
                        asInterface = i6 % 128;
                        int i7 = i6 % 2;
                        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
                        if (i7 == 0) {
                            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, str2);
                            i3 |= 3;
                        } else {
                            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, str2);
                            i3 |= 4;
                        }
                        int i8 = onNavigationEvent + 51;
                        asInterface = i8 % 128;
                        int i9 = i8 % 2;
                    }
                } else {
                    z = false;
                }
            }
            str = str2;
            displaySetting = displaySetting3;
            f = fOnWarmupCompleted2;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new OverviewSmallWidgetState.Error(i, displaySetting, f, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m76deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        OverviewSmallWidgetState.Error errorDeserialize = deserialize(decoder);
        int i3 = onNavigationEvent + 121;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return errorDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OverviewSmallWidgetState.Error error) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(error, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            OverviewSmallWidgetState.Error.onExtraCallback(error, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(error, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        OverviewSmallWidgetState.Error.onExtraCallback(error, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 21;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OverviewSmallWidgetState.Error) obj);
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = asInterface + 123;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = onExtraCallbackWithResult;
        Object obj2 = null;
        if (cArr3 != null) {
            int i5 = $11 + 31;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 59;
                $11 = i7 % 128;
                if (i7 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 26 - TextUtils.indexOf("", ""), 23139 - (Process.myPid() >> 22), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i6])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), 26 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6++;
                }
                i3 = 2;
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 27, 23139 - KeyEvent.keyCodeFromString(""), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i8 = $11 + 91;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 24824), ImageFormat.getBitsPerPixel(0) + 75, TextUtils.indexOf((CharSequence) "", '0') + 8089, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback5 == null) {
                                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 30 - Drawable.resolveOpacity(0, 0), 19488 - (ViewConfiguration.getScrollBarSize() >> 8), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i10];
                            int i11 = $10 + 115;
                            $11 = i11 % 128;
                            int i12 = i11 % 2;
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i13];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i14];
                            } else {
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i15];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i16];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            int i17 = 0;
            while (i17 < i) {
                int i18 = $11 + 31;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    cArr4[i17] = (char) (cArr4[i17] ^ 8901);
                    i17 += 112;
                } else {
                    cArr4[i17] = (char) (cArr4[i17] ^ 13722);
                    i17++;
                }
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

    static void onNavigationEvent() {
        onExtraCallbackWithResult = new char[]{64980, 64960, 64982, 64987, 64983, 64990, 64963, 64991, 64978};
        onWarmupCompleted = (char) 51242;
    }
}
