package im.toss.securities.widget.calendar.ui.model;

import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import im.toss.securities.widget.calendar.ui.model.CalendarWidgetState;
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
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.r2ExternalSyntheticLambda3;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class CalendarWidgetState$UiEvent$$serializer implements aeu2<CalendarWidgetState.UiEvent> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    public static final CalendarWidgetState$UiEvent$$serializer INSTANCE;
    private static int asInterface;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        return serialDescriptor;
    }

    static {
        onWarmupCompleted();
        CalendarWidgetState$UiEvent$$serializer calendarWidgetState$UiEvent$$serializer = new CalendarWidgetState$UiEvent$$serializer();
        INSTANCE = calendarWidgetState$UiEvent$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("UiEvent", calendarWidgetState$UiEvent$$serializer, 4);
        Object[] objArr = new Object[1];
        a(new char[]{37824, 45299, 16079, 30377, 12974, 28500}, 5 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a(new char[]{22456, 9161, 36296, 59051}, 3 - TextUtils.lastIndexOf("", '0', 0), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("baseDate", false);
        setanimationsloop.onWarmupCompleted("time", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 47;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 37 / 0;
        }
    }

    private CalendarWidgetState$UiEvent$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = CalendarWidgetState.UiEvent.onWarmupCompleted();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, lazyArrOnWarmupCompleted[1].getValue(), getwrigglelayout, getwrigglelayout};
        int i4 = IAuthTabCallbackDefault + 109;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0061 A[PHI: r0 r2 r3
      0x0061: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0061: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0061: PHI (r3v11 kotlin.Lazy[]) = (r3v2 kotlin.Lazy[]), (r3v13 kotlin.Lazy[]) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040 A[PHI: r0 r2 r3
      0x0040: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r3v3 kotlin.Lazy[]) = (r3v2 kotlin.Lazy[]), (r3v13 kotlin.Lazy[]) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CalendarWidgetState.UiEvent deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnWarmupCompleted;
        int i;
        String strAsInterface;
        r2ExternalSyntheticLambda3 r2externalsyntheticlambda3;
        String str;
        String str2;
        int i2;
        int i3 = 2 % 2;
        int i4 = asInterface + 69;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = 0;
        String strAsInterface2 = null;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnWarmupCompleted = CalendarWidgetState.UiEvent.onWarmupCompleted();
            int i6 = 53 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                r2ExternalSyntheticLambda3 r2externalsyntheticlambda32 = (r2ExternalSyntheticLambda3) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), (Object) null);
                String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                i = 15;
                strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                r2externalsyntheticlambda3 = r2externalsyntheticlambda32;
                str = strAsInterface3;
                str2 = strAsInterface4;
            } else {
                int i7 = 0;
                strAsInterface = null;
                r2ExternalSyntheticLambda3 r2externalsyntheticlambda33 = null;
                String strAsInterface5 = null;
                int i8 = 1;
                while (i8 == 1) {
                    int i9 = IAuthTabCallbackDefault + 69;
                    asInterface = i9 % 128;
                    int i10 = i9 % 2;
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        i8 = i5;
                    } else if (iOnNavigationEvent != 0) {
                        int i11 = asInterface;
                        int i12 = i11 + 77;
                        IAuthTabCallbackDefault = i12 % 128;
                        if (i12 % 2 != 0 ? iOnNavigationEvent == 1 : iOnNavigationEvent == 1) {
                            r2externalsyntheticlambda33 = (r2ExternalSyntheticLambda3) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), r2externalsyntheticlambda33);
                            i7 |= 2;
                            i2 = IAuthTabCallbackDefault + 119;
                        } else {
                            int i13 = i11 + 115;
                            IAuthTabCallbackDefault = i13 % 128;
                            if (i13 % 2 != 0 ? iOnNavigationEvent == 2 : iOnNavigationEvent == 4) {
                                strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                                i7 |= 4;
                                i2 = IAuthTabCallbackDefault + 25;
                            } else {
                                if (iOnNavigationEvent != 3) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                                i7 |= 8;
                                i5 = 0;
                            }
                        }
                        asInterface = i2 % 128;
                        int i14 = i2 % 2;
                        i5 = 0;
                    } else {
                        strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i5);
                        i7 |= 1;
                    }
                }
                str2 = strAsInterface2;
                r2externalsyntheticlambda3 = r2externalsyntheticlambda33;
                i = i7;
                str = strAsInterface5;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnWarmupCompleted = CalendarWidgetState.UiEvent.onWarmupCompleted();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CalendarWidgetState.UiEvent(i, str, r2externalsyntheticlambda3, str2, strAsInterface, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m35deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        CalendarWidgetState.UiEvent uiEventDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallbackDefault + 123;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return uiEventDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CalendarWidgetState.UiEvent uiEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(uiEvent, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CalendarWidgetState.UiEvent.onExtraCallbackWithResult(uiEvent, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(uiEvent, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CalendarWidgetState.UiEvent.onExtraCallbackWithResult(uiEvent, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallbackDefault + 39;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CalendarWidgetState.UiEvent) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 115;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asInterface + 53;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $11 + 37;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent >> 1];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            int i6 = 58224;
            while (i2 < 16) {
                int i7 = $10 + 117;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i9 = (c2 + i6) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "");
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 10;
                        int i11 = 12434 - (TypedValue.complexToFraction(i4, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i4, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, pressedStateDuration, i11, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), KeyEvent.getDeadChar(0, 0) + 10, TextUtils.lastIndexOf("", '0', 0, 0) + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - Color.green(0)), TextUtils.lastIndexOf("", '0') + 15, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i12 = $10 + 107;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 4 % 5;
            }
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = (char) 26986;
        onExtraCallback = (char) 52731;
        IAuthTabCallback = (char) 5964;
        onNavigationEvent = (char) 54177;
    }
}
