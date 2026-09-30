package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.property.MarginLocal;
import im.toss.features.home.core.local.model.dst.property.MarginLocal$$serializer;
import im.toss.features.home.core.local.model.dst.widget.TextContentLocal;
import im.toss.features.home.core.local.model.dst.widget.TextContentLocal$;
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
import o.getBgColor;
import o.okycx;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class PersonalActivityRowLocal$$serializer implements aeu2<PersonalActivityRowLocal> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    public static final PersonalActivityRowLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        onNavigationEvent();
        PersonalActivityRowLocal$$serializer personalActivityRowLocal$$serializer = new PersonalActivityRowLocal$$serializer();
        INSTANCE = personalActivityRowLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.PersonalActivityRowLocal", personalActivityRowLocal$$serializer, 8);
        setanimationsloop.onWarmupCompleted("subtitlePrefix", true);
        Object[] objArr = new Object[1];
        a(new char[]{1, 7, 6, 4, 13844}, (byte) (View.resolveSizeAndState(0, 0, 0) + 21), 5 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a(new char[]{'\b', 0, 1, 6, 7, 1, 4, 3}, (byte) (Color.argb(0, 0, 0, 0) + 26), 8 - TextUtils.getOffsetAfter("", 0), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("isOverdue", true);
        setanimationsloop.onWarmupCompleted("profile", false);
        setanimationsloop.onWarmupCompleted("closeHandler", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("margin", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 73;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 98 / 0;
        }
    }

    private PersonalActivityRowLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(serializerVar);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(serializerVar);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(serializerVar);
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(PersonalActivityProfileContentLocal$$serializer.INSTANCE);
        setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, getBgColor.IAuthTabCallback, kSerializerIAuthTabCallback4, sp.IAuthTabCallback(setappxversioninworker), sp.IAuthTabCallback(setappxversioninworker), sp.IAuthTabCallback(MarginLocal$$serializer.INSTANCE)};
        int i4 = onTransact + 67;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final PersonalActivityRowLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        TextContentLocal textContentLocal;
        PersonalActivityProfileContentLocal personalActivityProfileContentLocal;
        int i;
        MarginLocal marginLocal;
        HandlerLocal handlerLocal;
        HandlerLocal handlerLocal2;
        TextContentLocal textContentLocal2;
        TextContentLocal textContentLocal3;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 7;
        int i4 = 6;
        TextContentLocal textContentLocal4 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onTransact + 63;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            boolean z = true;
            PersonalActivityProfileContentLocal personalActivityProfileContentLocal2 = null;
            MarginLocal marginLocal2 = null;
            HandlerLocal handlerLocal3 = null;
            HandlerLocal handlerLocal4 = null;
            TextContentLocal textContentLocal5 = null;
            TextContentLocal textContentLocal6 = null;
            int i7 = 0;
            zOnExtraCallbackWithResult = false;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i4 = 6;
                    case 0:
                        textContentLocal6 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, TextContentLocal$.serializer.INSTANCE, textContentLocal6);
                        i7 |= 1;
                        i3 = 7;
                        i4 = 6;
                    case 1:
                        textContentLocal5 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, TextContentLocal$.serializer.INSTANCE, textContentLocal5);
                        i7 |= 2;
                        i3 = 7;
                    case 2:
                        textContentLocal4 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TextContentLocal$.serializer.INSTANCE, textContentLocal4);
                        i7 |= 4;
                        i3 = 7;
                    case 3:
                        zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
                        i7 |= 8;
                        i3 = 7;
                    case 4:
                        personalActivityProfileContentLocal2 = (PersonalActivityProfileContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, PersonalActivityProfileContentLocal$$serializer.INSTANCE, personalActivityProfileContentLocal2);
                        i7 |= 16;
                        i3 = 7;
                    case 5:
                        handlerLocal4 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, setAppxVersionInWorker.onExtraCallback, handlerLocal4);
                        i7 |= 32;
                        i3 = 7;
                    case 6:
                        handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, setAppxVersionInWorker.onExtraCallback, handlerLocal3);
                        i7 |= 64;
                        int i8 = onTransact + 119;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        i3 = 7;
                    case 7:
                        marginLocal2 = (MarginLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, MarginLocal$$serializer.INSTANCE, marginLocal2);
                        i7 |= 128;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            personalActivityProfileContentLocal = personalActivityProfileContentLocal2;
            textContentLocal3 = textContentLocal6;
            i = i7;
            textContentLocal = textContentLocal4;
            marginLocal = marginLocal2;
            handlerLocal = handlerLocal3;
            handlerLocal2 = handlerLocal4;
            textContentLocal2 = textContentLocal5;
        } else {
            TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
            TextContentLocal textContentLocal7 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, serializerVar, (Object) null);
            TextContentLocal textContentLocal8 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, serializerVar, (Object) null);
            TextContentLocal textContentLocal9 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, serializerVar, (Object) null);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
            PersonalActivityProfileContentLocal personalActivityProfileContentLocal3 = (PersonalActivityProfileContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, PersonalActivityProfileContentLocal$$serializer.INSTANCE, (Object) null);
            setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
            HandlerLocal handlerLocal5 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, setappxversioninworker, (Object) null);
            HandlerLocal handlerLocal6 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, setappxversioninworker, (Object) null);
            MarginLocal marginLocal3 = (MarginLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, MarginLocal$$serializer.INSTANCE, (Object) null);
            int i10 = onTransact + 73;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            textContentLocal = textContentLocal9;
            personalActivityProfileContentLocal = personalActivityProfileContentLocal3;
            i = 255;
            marginLocal = marginLocal3;
            handlerLocal = handlerLocal6;
            handlerLocal2 = handlerLocal5;
            textContentLocal2 = textContentLocal8;
            textContentLocal3 = textContentLocal7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new PersonalActivityRowLocal(i, textContentLocal3, textContentLocal2, textContentLocal, zOnExtraCallbackWithResult, personalActivityProfileContentLocal, handlerLocal2, handlerLocal, marginLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m405deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        PersonalActivityRowLocal personalActivityRowLocalDeserialize = deserialize(decoder);
        int i4 = onTransact + 31;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return personalActivityRowLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PersonalActivityRowLocal personalActivityRowLocal) {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(personalActivityRowLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        PersonalActivityRowLocal.IAuthTabCallback(personalActivityRowLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onTransact + 47;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PersonalActivityRowLocal) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallbackWithResult;
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $11;
            int i5 = i4 + 25;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = i4 + 51;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            for (int i9 = 0; i9 < length; i9++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 25 - TextUtils.indexOf((CharSequence) "", '0', 0), Drawable.resolveOpacity(0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 23139 - Color.green(0), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i10 = $10 + 63;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                i2 = i + 96;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i11 = $11 + 61;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 24824), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 73, 8088 - (ViewConfiguration.getEdgeSlop() >> 16), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), 30 - View.resolveSizeAndState(0, 0, 0), 19488 - TextUtils.getTrimmedLength(""), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                        } else {
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i16];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                int i18 = $11 + 59;
                $10 = i18 % 128;
                int i19 = i18 % 2;
                obj2 = obj;
            }
        }
        int i20 = 0;
        while (i20 < i) {
            int i21 = $11 + 45;
            $10 = i21 % 128;
            if (i21 % 2 != 0) {
                cArr4[i20] = (char) (cArr4[i20] ^ 26944);
                i20 += 50;
            } else {
                cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                i20++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = new char[]{64977, 64979, 64966, 64991, 64986, 64982, 64960, 64967, 64976};
        IAuthTabCallback = (char) 51242;
    }
}
