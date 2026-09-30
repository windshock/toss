package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal$;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal$Image$;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.aeu2;
import o.getBgColor;
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
public final /* synthetic */ class TdsListFooterLocal$$serializer implements aeu2<TdsListFooterLocal> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    public static final TdsListFooterLocal$$serializer INSTANCE;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        return serialDescriptor;
    }

    static {
        onNavigationEvent();
        TdsListFooterLocal$$serializer tdsListFooterLocal$$serializer = new TdsListFooterLocal$$serializer();
        INSTANCE = tdsListFooterLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.TdsListFooterLocal", tdsListFooterLocal$$serializer, 5);
        Object[] objArr = new Object[1];
        a(new char[]{49903, 20456, 24356, 65307, 55801, 14012}, (ViewConfiguration.getEdgeSlop() >> 16) + 5, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("titleColor", false);
        setanimationsloop.onWarmupCompleted("image", false);
        setanimationsloop.onWarmupCompleted("hasTopBorder", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        descriptor = setanimationsloop;
        int i = asInterface + 13;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private TdsListFooterLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(ColorAttributeLocal$.serializer.INSTANCE), sp.IAuthTabCallback(ImageSourceLocal$Image$.serializer.INSTANCE), getBgColor.IAuthTabCallback, sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback)};
        int i4 = asBinder + 21;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final TdsListFooterLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        ColorAttributeLocal colorAttributeLocal;
        boolean zOnExtraCallbackWithResult;
        HandlerLocal handlerLocal;
        int i;
        ImageSourceLocal.Image image;
        String str;
        int i2 = 2 % 2;
        int i3 = asBinder + 103;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        boolean z = false;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            ColorAttributeLocal colorAttributeLocal2 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ColorAttributeLocal$.serializer.INSTANCE, (Object) null);
            image = (ImageSourceLocal.Image) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ImageSourceLocal$Image$.serializer.INSTANCE, (Object) null);
            str = strAsInterface;
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, (Object) null);
            colorAttributeLocal = colorAttributeLocal2;
            i = 31;
        } else {
            boolean z2 = true;
            boolean zOnExtraCallbackWithResult2 = false;
            int i5 = 0;
            ImageSourceLocal.Image image2 = null;
            String strAsInterface2 = null;
            HandlerLocal handlerLocal2 = null;
            colorAttributeLocal = null;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onTransact;
                    int i7 = i6 + 17;
                    asBinder = i7 % 128;
                    if (i7 % 2 != 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        if (iOnNavigationEvent != 1) {
                            int i8 = i6 + 69;
                            asBinder = i8 % 128;
                            int i9 = i8 % 2;
                            if (iOnNavigationEvent == 2) {
                                image2 = (ImageSourceLocal.Image) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ImageSourceLocal$Image$.serializer.INSTANCE, image2);
                                i5 |= 4;
                            } else if (iOnNavigationEvent == 3) {
                                zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
                                i5 |= 8;
                            } else {
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                int i10 = i6 + 43;
                                asBinder = i10 % 128;
                                int i11 = i10 % 2;
                                handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                                i5 = i11 != 0 ? i5 | 48 : i5 | 16;
                            }
                        } else {
                            colorAttributeLocal = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal);
                            i5 |= 2;
                        }
                        z = false;
                    } else {
                        z = false;
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i5 |= 1;
                    }
                } else {
                    z2 = z;
                }
            }
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            handlerLocal = handlerLocal2;
            i = i5;
            image = image2;
            str = strAsInterface2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TdsListFooterLocal(i, str, colorAttributeLocal, image, zOnExtraCallbackWithResult, handlerLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m412deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TdsListFooterLocal tdsListFooterLocalDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
        int i5 = asBinder + 65;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return tdsListFooterLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TdsListFooterLocal tdsListFooterLocal) {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tdsListFooterLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TdsListFooterLocal.onExtraCallbackWithResult(tdsListFooterLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asBinder + 71;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TdsListFooterLocal) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onTransact + 35;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 109;
            $11 = i4 % 128;
            int i5 = 58224;
            char c = 1;
            if (i4 % 2 == 0) {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            } else {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i6 = i3;
            while (i6 < 16) {
                int i7 = $11 + 35;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i9 = (c3 + i5) ^ ((c3 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[c] = Integer.valueOf(i9);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int size = 10 - View.MeasureSpec.getSize(0);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMyPid, size, iMakeMeasureSpec, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 9 - Process.getGidForName(""), TextUtils.indexOf("", "") + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    int i11 = $10 + 63;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                    c = 1;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16015 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 14 - (Process.myTid() >> 22), Color.alpha(0) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = (char) 40105;
        onWarmupCompleted = (char) 8120;
        onNavigationEvent = (char) 38994;
        IAuthTabCallback = (char) 7509;
    }
}
