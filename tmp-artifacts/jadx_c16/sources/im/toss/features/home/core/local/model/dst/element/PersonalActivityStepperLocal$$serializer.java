package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.property.MarginLocal;
import im.toss.features.home.core.local.model.dst.property.MarginLocal$$serializer;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
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
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.aeu2;
import o.okycx;
import o.removeNextStartHandler;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class PersonalActivityStepperLocal$$serializer implements aeu2<PersonalActivityStepperLocal> {
    public static final PersonalActivityStepperLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static final byte[] $$a = {15, -112, -70, -94};
    private static final int $$b = 74;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, byte b2) {
        int i;
        int i2;
        ?? r5 = 4 - (s * 4);
        byte[] bArr = $$a;
        int i3 = (b * 3) + 105;
        int i4 = b2 * 3;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        if (bArr == null) {
            byte b3 = r5;
            int i6 = 0;
            int i7 = r5;
            i3 += b3;
            i = i6;
            i2 = i7 + 1;
            bArr2[i] = (byte) i3;
            i6 = i + 1;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            b3 = bArr[i2];
            i7 = i2;
            i3 += b3;
            i = i6;
            i2 = i7 + 1;
            bArr2[i] = (byte) i3;
            i6 = i + 1;
            if (i == i5) {
            }
        } else {
            i = 0;
            i2 = r5;
            bArr2[i] = (byte) i3;
            i6 = i + 1;
            if (i == i5) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        return serialDescriptor;
    }

    static {
        onNavigationEvent = 1;
        onExtraCallback();
        PersonalActivityStepperLocal$$serializer personalActivityStepperLocal$$serializer = new PersonalActivityStepperLocal$$serializer();
        INSTANCE = personalActivityStepperLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.PersonalActivityStepperLocal", personalActivityStepperLocal$$serializer, 7);
        setanimationsloop.onWarmupCompleted("image", false);
        Object[] objArr = new Object[1];
        a(5 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 3, new char[]{7, 65535, 65528, 7, 65532}, false, KeyEvent.normalizeMetaState(0) + 264, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a(KeyEvent.keyCodeFromString("") + 8, 3 - TextUtils.lastIndexOf("", '0', 0, 0), new char[]{7, 65525, '\b', 6, 65528, 65535, 7, 65532}, true, 264 - Color.red(0), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("steps", false);
        setanimationsloop.onWarmupCompleted("closeHandler", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("margin", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 79;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private PersonalActivityStepperLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(removeNextStartHandler.onWarmupCompleted);
        TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(serializerVar);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(serializerVar);
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(PersonalActivityStepsLocal$$serializer.INSTANCE);
        setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, kSerializerIAuthTabCallback4, sp.IAuthTabCallback(setappxversioninworker), sp.IAuthTabCallback(setappxversioninworker), sp.IAuthTabCallback(MarginLocal$$serializer.INSTANCE)};
        int i4 = onWarmupCompleted + 121;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final PersonalActivityStepperLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        TextContentLocal textContentLocal;
        HandlerLocal handlerLocal;
        TextContentLocal textContentLocal2;
        ImageSourceLocal imageSourceLocal;
        HandlerLocal handlerLocal2;
        PersonalActivityStepsLocal personalActivityStepsLocal;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 6;
        MarginLocal marginLocal = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            ImageSourceLocal imageSourceLocal2 = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, (Object) null);
            TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
            TextContentLocal textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, serializerVar, (Object) null);
            TextContentLocal textContentLocal4 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, serializerVar, (Object) null);
            PersonalActivityStepsLocal personalActivityStepsLocal2 = (PersonalActivityStepsLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, PersonalActivityStepsLocal$$serializer.INSTANCE, (Object) null);
            setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
            HandlerLocal handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setappxversioninworker, (Object) null);
            HandlerLocal handlerLocal4 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, setappxversioninworker, (Object) null);
            MarginLocal marginLocal2 = (MarginLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, MarginLocal$$serializer.INSTANCE, (Object) null);
            int i4 = IAuthTabCallback + 29;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            marginLocal = marginLocal2;
            imageSourceLocal = imageSourceLocal2;
            i = 127;
            handlerLocal2 = handlerLocal4;
            textContentLocal = textContentLocal3;
            personalActivityStepsLocal = personalActivityStepsLocal2;
            textContentLocal2 = textContentLocal4;
            handlerLocal = handlerLocal3;
        } else {
            int i6 = IAuthTabCallback + 57;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
            boolean z = true;
            TextContentLocal textContentLocal5 = null;
            HandlerLocal handlerLocal5 = null;
            TextContentLocal textContentLocal6 = null;
            ImageSourceLocal imageSourceLocal3 = null;
            HandlerLocal handlerLocal6 = null;
            PersonalActivityStepsLocal personalActivityStepsLocal3 = null;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        int i8 = IAuthTabCallback + 15;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        i3 = 6;
                        z = false;
                        continue;
                    case 0:
                        imageSourceLocal3 = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, removeNextStartHandler.onWarmupCompleted, imageSourceLocal3);
                        i |= 1;
                        break;
                    case 1:
                        textContentLocal5 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, TextContentLocal$.serializer.INSTANCE, textContentLocal5);
                        i |= 2;
                        break;
                    case 2:
                        textContentLocal6 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TextContentLocal$.serializer.INSTANCE, textContentLocal6);
                        i |= 4;
                        break;
                    case 3:
                        personalActivityStepsLocal3 = (PersonalActivityStepsLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, PersonalActivityStepsLocal$$serializer.INSTANCE, personalActivityStepsLocal3);
                        i |= 8;
                        continue;
                    case 4:
                        handlerLocal5 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, handlerLocal5);
                        i |= 16;
                        continue;
                    case 5:
                        handlerLocal6 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, setAppxVersionInWorker.onExtraCallback, handlerLocal6);
                        i |= 32;
                        continue;
                    case 6:
                        marginLocal = (MarginLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, MarginLocal$$serializer.INSTANCE, marginLocal);
                        i |= 64;
                        continue;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
                i3 = 6;
            }
            textContentLocal = textContentLocal5;
            handlerLocal = handlerLocal5;
            textContentLocal2 = textContentLocal6;
            imageSourceLocal = imageSourceLocal3;
            handlerLocal2 = handlerLocal6;
            personalActivityStepsLocal = personalActivityStepsLocal3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new PersonalActivityStepperLocal(i, imageSourceLocal, textContentLocal, textContentLocal2, personalActivityStepsLocal, handlerLocal, handlerLocal2, marginLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m406deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        PersonalActivityStepperLocal personalActivityStepperLocalDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        int i5 = onWarmupCompleted + 51;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return personalActivityStepperLocalDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PersonalActivityStepperLocal personalActivityStepperLocal) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(personalActivityStepperLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        PersonalActivityStepperLocal.onNavigationEvent(personalActivityStepperLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 123;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PersonalActivityStepperLocal) obj);
        int i4 = IAuthTabCallback + 3;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - TextUtils.getOffsetBefore("", 0)), 23 - (ViewConfiguration.getTouchSlop() >> 8), (Process.myPid() >> 22) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 56 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i7 = $11 + 95;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 4 % 5;
                }
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i9 = $11 + 119;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            int i11 = $11 + 91;
            $10 = i11 % 128;
            int i12 = i11 % 2;
        }
        if (z) {
            int i13 = $11 + 37;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i15 = $10 + 67;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 12843), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 55, View.MeasureSpec.getSize(0) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = 478309042;
    }
}
