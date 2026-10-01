package im.toss.features.home.core.local.model.dst.element;

import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
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
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TextLocal$$serializer implements aeu2<TextLocal> {
    private static char IAuthTabCallback;
    public static final TextLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallback;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {120, -62, 63, 57};
    private static final int $$b = 10;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, byte b2) {
        int i2;
        int i3 = i + 109;
        int i4 = b * 3;
        int i5 = 4 - (b2 * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i6;
            i2 = 0;
            i3 += i7;
            i5++;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i2++;
            i7 = bArr[i5];
            i3 += i7;
            i5++;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        return serialDescriptor;
    }

    static {
        onNavigationEvent = 0;
        onWarmupCompleted();
        TextLocal$$serializer textLocal$$serializer = new TextLocal$$serializer();
        INSTANCE = textLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.TextLocal", textLocal$$serializer, 6);
        Object[] objArr = new Object[1];
        a((char) (54016 - View.getDefaultSize(0, 0)), TextUtils.lastIndexOf("", '0', 0, 0) + 1, new char[]{27149, 9942, 13523, 53980}, new char[]{2798, 17203, 22189, 38943}, new char[]{16433, 2844, ':', 42195}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("paddingTop", false);
        setanimationsloop.onWarmupCompleted("paddingLeft", false);
        setanimationsloop.onWarmupCompleted("paddingRight", false);
        setanimationsloop.onWarmupCompleted("paddingBottom", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 7;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 56 / 0;
        }
    }

    private TextLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback);
        setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {TextAttributeLocal$.serializer.INSTANCE, setvideolistener, setvideolistener, setvideolistener, setvideolistener, kSerializerIAuthTabCallback};
        int i4 = IAuthTabCallbackStub + 23;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final TextLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        HandlerLocal handlerLocal;
        int i;
        TextAttributeLocal textAttributeLocal;
        double d;
        double d2;
        double d3;
        double d4;
        int i2 = 2 % 2;
        int i3 = asBinder + 23;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 5;
        HandlerLocal handlerLocal2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            TextAttributeLocal textAttributeLocal2 = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TextAttributeLocal$.serializer.INSTANCE, (Object) null);
            double dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
            double dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
            double dIAuthTabCallback3 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 3);
            double dIAuthTabCallback4 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 4);
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, setAppxVersionInWorker.onExtraCallback, (Object) null);
            i = 63;
            d4 = dIAuthTabCallback4;
            d3 = dIAuthTabCallback3;
            d2 = dIAuthTabCallback2;
            textAttributeLocal = textAttributeLocal2;
            d = dIAuthTabCallback;
        } else {
            double dIAuthTabCallback5 = 0.0d;
            int i6 = 0;
            boolean z = true;
            TextAttributeLocal textAttributeLocal3 = null;
            double dIAuthTabCallback6 = 0.0d;
            double dIAuthTabCallback7 = 0.0d;
            double dIAuthTabCallback8 = 0.0d;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                    case 0:
                        textAttributeLocal3 = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal3);
                        i6 |= 1;
                        i5 = 5;
                    case 1:
                        dIAuthTabCallback6 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
                        i6 |= 2;
                        i5 = 5;
                    case 2:
                        dIAuthTabCallback7 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
                        i6 |= 4;
                        i5 = 5;
                    case 3:
                        dIAuthTabCallback8 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 3);
                        i6 |= 8;
                        int i7 = asBinder + 113;
                        IAuthTabCallbackStub = i7 % 128;
                        int i8 = i7 % 2;
                        i5 = 5;
                    case 4:
                        dIAuthTabCallback5 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 4);
                        i6 |= 16;
                    case 5:
                        handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                        i6 |= 32;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            handlerLocal = handlerLocal2;
            i = i6;
            double d5 = dIAuthTabCallback5;
            textAttributeLocal = textAttributeLocal3;
            d = dIAuthTabCallback6;
            d2 = dIAuthTabCallback7;
            d3 = dIAuthTabCallback8;
            d4 = d5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TextLocal(i, textAttributeLocal, d, d2, d3, d4, handlerLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m413deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        TextLocal textLocalDeserialize = deserialize(decoder);
        int i4 = asBinder + 91;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return textLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TextLocal textLocal) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(textLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TextLocal.onWarmupCompleted(textLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackStub + 29;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TextLocal) obj);
        int i4 = IAuthTabCallbackStub + 123;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asBinder + 49;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i6 = $10 + 81;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i8 = $11 + 75;
            $10 = i8 % 128;
            int i9 = i8 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 43;
                    int mirror = AndroidCharacter.getMirror('0') + 1403;
                    byte b = (byte) i5;
                    byte b2 = (byte) (b + 1);
                    String str$$c = $$c(b, b2, (byte) (b2 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(keyRepeatDelay, keyRepeatTimeout, mirror, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char defaultSize = (char) (49123 - View.getDefaultSize(i5, i5));
                        int threadPriority = 44 - ((Process.getThreadPriority(i5) + 20) >> 6);
                        int scrollDefaultDelay = 1494 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        byte b3 = (byte) i5;
                        byte b4 = b3;
                        String str$$c2 = $$c(b3, b4, b4);
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i5] = Object.class;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(defaultSize, threadPriority, scrollDefaultDelay, 1533236389, false, str$$c2, clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    int i10 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                    try {
                        Object[] objArr4 = new Object[3];
                        objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                        objArr4[1] = Integer.valueOf(i10);
                        objArr4[i5] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            char maximumFlingVelocity = (char) (23972 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                            int maximumFlingVelocity2 = 50 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int iAxisFromString = MotionEvent.axisFromString("") + 22940;
                            Class[] clsArr3 = new Class[3];
                            clsArr3[i5] = Object.class;
                            clsArr3[1] = Integer.TYPE;
                            clsArr3[2] = Integer.TYPE;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maximumFlingVelocity, maximumFlingVelocity2, iAxisFromString, 1872485556, false, "k", clsArr3);
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        int i11 = cArr4[iIntValue2] * 32718;
                        try {
                            Object[] objArr5 = new Object[2];
                            objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                            objArr5[i5] = Integer.valueOf(i11);
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                char c2 = (char) (45849 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                int scrollBarSize = 29 - (ViewConfiguration.getScrollBarSize() >> 8);
                                int windowTouchSlop = 12577 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                i2 = 2;
                                Class[] clsArr4 = new Class[2];
                                clsArr4[i5] = Integer.TYPE;
                                clsArr4[1] = Integer.TYPE;
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, scrollBarSize, windowTouchSlop, 1401536470, false, "l", clsArr4);
                            } else {
                                i2 = 2;
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onWarmupCompleted ^ 7798559133331975163L)) ^ ((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            i3 = i2;
                            i5 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void onWarmupCompleted() {
        onExtraCallback = -854176928975658731L;
        onWarmupCompleted = -1776194565;
        IAuthTabCallback = (char) 27643;
    }
}
