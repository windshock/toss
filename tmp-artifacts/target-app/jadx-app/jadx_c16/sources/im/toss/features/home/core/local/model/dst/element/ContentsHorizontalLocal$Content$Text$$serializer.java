package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.element.ContentsHorizontalLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal$$serializer;
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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ContentsHorizontalLocal$Content$Text$$serializer implements aeu2<ContentsHorizontalLocal.Content.Text> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 0;
    public static final ContentsHorizontalLocal$Content$Text$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            serialDescriptor = descriptor;
            int i4 = 31 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 103;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
        return serialDescriptor;
    }

    static {
        onWarmupCompleted();
        ContentsHorizontalLocal$Content$Text$$serializer contentsHorizontalLocal$Content$Text$$serializer = new ContentsHorizontalLocal$Content$Text$$serializer();
        INSTANCE = contentsHorizontalLocal$Content$Text$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ContentsHorizontalLocal.Content.Text", contentsHorizontalLocal$Content$Text$$serializer, 5);
        setanimationsloop.onWarmupCompleted("id", true);
        Object[] objArr = new Object[1];
        a(new char[]{24469, 56543, 22843, 54664, 21208}, Color.green(0) + 33623, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a(new char[]{24453, 23743, 23012, 22067, 21375, 20399, 19699, 18696, 18000, 17053, 32705}, 827 - View.resolveSize(0, 0), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("spaceBetween", false);
        setanimationsloop.onWarmupCompleted("padding", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 57 / 0;
        }
    }

    private ContentsHorizontalLocal$Content$Text$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            TextAttributeLocal$.serializer serializerVar = TextAttributeLocal$.serializer.INSTANCE;
            return new KSerializer[]{sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), serializerVar, serializerVar, dj3.onWarmupCompleted, PaddingLocal$$serializer.INSTANCE};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[4];
        kSerializerArr[0] = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
        TextAttributeLocal$.serializer serializerVar2 = TextAttributeLocal$.serializer.INSTANCE;
        kSerializerArr[0] = serializerVar2;
        kSerializerArr[5] = serializerVar2;
        kSerializerArr[4] = dj3.onWarmupCompleted;
        kSerializerArr[4] = PaddingLocal$$serializer.INSTANCE;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ContentsHorizontalLocal.Content.Text deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        TextAttributeLocal textAttributeLocal;
        TextAttributeLocal textAttributeLocal2;
        String str;
        PaddingLocal paddingLocal;
        float f;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        boolean z = false;
        TextAttributeLocal textAttributeLocal3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            TextAttributeLocal$.serializer serializerVar = TextAttributeLocal$.serializer.INSTANCE;
            TextAttributeLocal textAttributeLocal4 = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, serializerVar, (Object) null);
            TextAttributeLocal textAttributeLocal5 = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, serializerVar, (Object) null);
            float fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 3);
            PaddingLocal paddingLocal2 = (PaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, PaddingLocal$$serializer.INSTANCE, (Object) null);
            int i3 = onExtraCallback + 31;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 % 2;
            }
            str = str2;
            textAttributeLocal2 = textAttributeLocal5;
            paddingLocal = paddingLocal2;
            textAttributeLocal = textAttributeLocal4;
            f = fOnWarmupCompleted;
            i = 31;
        } else {
            float fOnWarmupCompleted2 = 0.0f;
            int i5 = 0;
            boolean z2 = true;
            TextAttributeLocal textAttributeLocal6 = null;
            String str3 = null;
            PaddingLocal paddingLocal3 = null;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z2 = z;
                } else if (iOnNavigationEvent != 0) {
                    if (iOnNavigationEvent == 1) {
                        textAttributeLocal6 = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal6);
                        i5 |= 2;
                    } else if (iOnNavigationEvent != 2) {
                        int i6 = onExtraCallback + 123;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 == 0 ? iOnNavigationEvent == 3 : iOnNavigationEvent == 2) {
                            fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 3);
                            i5 |= 8;
                            int i7 = onExtraCallback + 95;
                            onNavigationEvent = i7 % 128;
                            if (i7 % 2 != 0) {
                                int i8 = 4 % 3;
                            }
                        } else {
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            paddingLocal3 = (PaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, PaddingLocal$$serializer.INSTANCE, paddingLocal3);
                            i5 |= 16;
                        }
                    } else {
                        textAttributeLocal3 = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal3);
                        i5 |= 4;
                    }
                    z = false;
                } else {
                    str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                    i5 |= 1;
                    z = false;
                }
            }
            textAttributeLocal = textAttributeLocal6;
            textAttributeLocal2 = textAttributeLocal3;
            str = str3;
            paddingLocal = paddingLocal3;
            f = fOnWarmupCompleted2;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ContentsHorizontalLocal.Content.Text(i, str, textAttributeLocal, textAttributeLocal2, f, paddingLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m329deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        ContentsHorizontalLocal.Content.Text textDeserialize = deserialize(decoder);
        int i3 = onNavigationEvent + 39;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return textDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ContentsHorizontalLocal.Content.Text text) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(text, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ContentsHorizontalLocal.Content.Text.onExtraCallbackWithResult(text, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 38 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(text, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            ContentsHorizontalLocal.Content.Text.onExtraCallbackWithResult(text, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onNavigationEvent + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ContentsHorizontalLocal.Content.Text) obj);
        int i4 = onNavigationEvent + 25;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 45;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), KeyEvent.keyCodeFromString("") + 24, Drawable.resolveOpacity(0, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), 59 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getTapTimeout() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 111;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 59 - Drawable.resolveOpacity(0, 0), 6383 - KeyEvent.normalizeMetaState(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = 6392979709932460758L;
    }
}
