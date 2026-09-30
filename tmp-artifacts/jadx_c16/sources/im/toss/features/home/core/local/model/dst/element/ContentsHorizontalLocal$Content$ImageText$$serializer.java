package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.element.ContentsHorizontalLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal$$serializer;
import im.toss.features.home.core.local.model.dst.widget.ImageWithSizeLocal;
import im.toss.features.home.core.local.model.dst.widget.ImageWithSizeLocal$$serializer;
import im.toss.features.home.core.local.model.dst.widget.TextAttributeLocal;
import im.toss.features.home.core.local.model.dst.widget.TextAttributeLocal$;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.aeu2;
import o.dj3;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ContentsHorizontalLocal$Content$ImageText$$serializer implements aeu2<ContentsHorizontalLocal.Content.ImageText> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final ContentsHorizontalLocal$Content$ImageText$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 5;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 10 / 0;
        }
        return serialDescriptor;
    }

    static {
        onWarmupCompleted();
        ContentsHorizontalLocal$Content$ImageText$$serializer contentsHorizontalLocal$Content$ImageText$$serializer = new ContentsHorizontalLocal$Content$ImageText$$serializer();
        INSTANCE = contentsHorizontalLocal$Content$ImageText$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ContentsHorizontalLocal.Content.ImageText", contentsHorizontalLocal$Content$ImageText$$serializer, 6);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("imageWithSize", false);
        Object[] objArr = new Object[1];
        a(new char[]{42253, 30627, 127, 56624}, 53951 - TextUtils.indexOf("", ""), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("spaceBetween", false);
        setanimationsloop.onWarmupCompleted("padding", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 61;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private ContentsHorizontalLocal$Content$ImageText$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, ImageWithSizeLocal$$serializer.INSTANCE, sp.IAuthTabCallback(TextAttributeLocal$.serializer.INSTANCE), sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback), dj3.onWarmupCompleted, PaddingLocal$$serializer.INSTANCE};
        int i4 = onNavigationEvent + 87;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ContentsHorizontalLocal.Content.ImageText deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        float f;
        int i;
        TextAttributeLocal textAttributeLocal;
        String str;
        ImageWithSizeLocal imageWithSizeLocal;
        HandlerLocal handlerLocal;
        PaddingLocal paddingLocal;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 57;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onNavigationEvent + 33;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            ImageWithSizeLocal imageWithSizeLocal2 = (ImageWithSizeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, ImageWithSizeLocal$$serializer.INSTANCE, (Object) null);
            TextAttributeLocal textAttributeLocal2 = (TextAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TextAttributeLocal$.serializer.INSTANCE, (Object) null);
            HandlerLocal handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setAppxVersionInWorker.onExtraCallback, (Object) null);
            float fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 4);
            textAttributeLocal = textAttributeLocal2;
            str = strAsInterface;
            paddingLocal = (PaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, PaddingLocal$$serializer.INSTANCE, (Object) null);
            handlerLocal = handlerLocal2;
            f = fOnWarmupCompleted;
            imageWithSizeLocal = imageWithSizeLocal2;
            i = 63;
        } else {
            float fOnWarmupCompleted2 = 0.0f;
            boolean z = true;
            TextAttributeLocal textAttributeLocal3 = null;
            String strAsInterface2 = null;
            ImageWithSizeLocal imageWithSizeLocal3 = null;
            HandlerLocal handlerLocal3 = null;
            PaddingLocal paddingLocal2 = null;
            int i7 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i7 |= 1;
                        continue;
                    case 1:
                        imageWithSizeLocal3 = (ImageWithSizeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, ImageWithSizeLocal$$serializer.INSTANCE, imageWithSizeLocal3);
                        i7 |= 2;
                        break;
                    case 2:
                        textAttributeLocal3 = (TextAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal3);
                        i7 |= 4;
                        break;
                    case 3:
                        handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setAppxVersionInWorker.onExtraCallback, handlerLocal3);
                        i7 |= 8;
                        break;
                    case 4:
                        fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 4);
                        i7 |= 16;
                        break;
                    case 5:
                        paddingLocal2 = (PaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, PaddingLocal$$serializer.INSTANCE, paddingLocal2);
                        i7 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            f = fOnWarmupCompleted2;
            i = i7;
            textAttributeLocal = textAttributeLocal3;
            str = strAsInterface2;
            imageWithSizeLocal = imageWithSizeLocal3;
            handlerLocal = handlerLocal3;
            paddingLocal = paddingLocal2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ContentsHorizontalLocal.Content.ImageText(i, str, imageWithSizeLocal, textAttributeLocal, handlerLocal, f, paddingLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m326deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ContentsHorizontalLocal.Content.ImageText imageTextDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 5;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return imageTextDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ContentsHorizontalLocal.Content.ImageText imageText) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(imageText, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ContentsHorizontalLocal.Content.ImageText.IAuthTabCallback(imageText, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ContentsHorizontalLocal.Content.ImageText) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onNavigationEvent + 109;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 39;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 23 - MotionEvent.axisFromString(""), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() / (onExtraCallbackWithResult - 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), 59 - Color.alpha(0), 6382 - ((byte) KeyEvent.getModifierMetaStateMask()), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, (ViewConfiguration.getTouchSlop() >> 8) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 59 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.getOffsetBefore("", 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 51;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), ((Process.getThreadPriority(0) + 20) >> 6) + 59, View.getDefaultSize(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            int i8 = $10 + 5;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 4 / 2;
            }
        }
        objArr[0] = new String(cArr2);
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = 779087059664511054L;
    }
}
