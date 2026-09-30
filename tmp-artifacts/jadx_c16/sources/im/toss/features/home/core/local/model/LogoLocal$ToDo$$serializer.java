package im.toss.features.home.core.local.model;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.LogoLocal;
import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal;
import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal$;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal$;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
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
import o.removeNextStartHandler;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LogoLocal$ToDo$$serializer implements aeu2<LogoLocal.ToDo> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    public static final LogoLocal$ToDo$$serializer INSTANCE;
    private static int asInterface;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    private static boolean onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onNavigationEvent();
        LogoLocal$ToDo$$serializer logoLocal$ToDo$$serializer = new LogoLocal$ToDo$$serializer();
        INSTANCE = logoLocal$ToDo$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.LogoLocal.ToDo", logoLocal$ToDo$$serializer, 7);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("impressionEventLog", false);
        setanimationsloop.onWarmupCompleted("image", false);
        Object[] objArr = new Object[1];
        Object obj = null;
        a(null, null, new byte[]{-127, -125, -126, -127}, 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("pulse", false);
        setanimationsloop.onWarmupCompleted("primaryColor", false);
        setanimationsloop.onWarmupCompleted("secondaryColor", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackDefault + 53;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private LogoLocal$ToDo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(ImpressionEventLogLocal$.serializer.INSTANCE);
        ColorAttributeLocal$.serializer serializerVar = ColorAttributeLocal$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, removeNextStartHandler.onWarmupCompleted, getWriggleLayout.onNavigationEvent, getBgColor.IAuthTabCallback, serializerVar, serializerVar};
        int i4 = asInterface + 93;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final LogoLocal.ToDo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        ColorAttributeLocal colorAttributeLocal;
        ColorAttributeLocal colorAttributeLocal2;
        int i;
        String str;
        HandlerLocal handlerLocal;
        ImpressionEventLogLocal impressionEventLogLocal;
        ImageSourceLocal imageSourceLocal;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = asInterface + 41;
        IAuthTabCallbackStub = i4 % 128;
        ImageSourceLocal imageSourceLocal2 = null;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = IAuthTabCallbackStub + 23;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            HandlerLocal handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, setAppxVersionInWorker.onExtraCallback, (Object) null);
            ImpressionEventLogLocal impressionEventLogLocal2 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ImpressionEventLogLocal$.serializer.INSTANCE, (Object) null);
            ImageSourceLocal imageSourceLocal3 = (ImageSourceLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, removeNextStartHandler.onWarmupCompleted, (Object) null);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            boolean zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
            ColorAttributeLocal$.serializer serializerVar = ColorAttributeLocal$.serializer.INSTANCE;
            ColorAttributeLocal colorAttributeLocal3 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, serializerVar, (Object) null);
            ColorAttributeLocal colorAttributeLocal4 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, serializerVar, (Object) null);
            int i7 = asInterface + 113;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            i = 127;
            handlerLocal = handlerLocal2;
            colorAttributeLocal = colorAttributeLocal4;
            colorAttributeLocal2 = colorAttributeLocal3;
            str = strAsInterface;
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            impressionEventLogLocal = impressionEventLogLocal2;
            imageSourceLocal = imageSourceLocal3;
        } else {
            ColorAttributeLocal colorAttributeLocal5 = null;
            String strAsInterface2 = null;
            HandlerLocal handlerLocal3 = null;
            ImpressionEventLogLocal impressionEventLogLocal3 = null;
            ColorAttributeLocal colorAttributeLocal6 = null;
            boolean z = true;
            int i9 = 0;
            zOnExtraCallbackWithResult = false;
            while (z) {
                int i10 = asInterface + 9;
                IAuthTabCallbackStub = i10 % 128;
                int i11 = i10 % i2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i2 = 2;
                    case 0:
                        handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, setAppxVersionInWorker.onExtraCallback, handlerLocal3);
                        i9 |= 1;
                        i2 = 2;
                    case 1:
                        impressionEventLogLocal3 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ImpressionEventLogLocal$.serializer.INSTANCE, impressionEventLogLocal3);
                        i9 |= 2;
                    case 2:
                        imageSourceLocal2 = (ImageSourceLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i2, removeNextStartHandler.onWarmupCompleted, imageSourceLocal2);
                        i9 |= 4;
                    case 3:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i9 |= 8;
                    case 4:
                        zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
                        i9 |= 16;
                        int i12 = asInterface + 81;
                        IAuthTabCallbackStub = i12 % 128;
                        int i13 = i12 % i2;
                    case 5:
                        colorAttributeLocal6 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal6);
                        i9 |= 32;
                    case 6:
                        colorAttributeLocal5 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal5);
                        i9 |= 64;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            colorAttributeLocal = colorAttributeLocal5;
            colorAttributeLocal2 = colorAttributeLocal6;
            i = i9;
            str = strAsInterface2;
            handlerLocal = handlerLocal3;
            impressionEventLogLocal = impressionEventLogLocal3;
            imageSourceLocal = imageSourceLocal2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new LogoLocal.ToDo(i, handlerLocal, impressionEventLogLocal, imageSourceLocal, str, zOnExtraCallbackWithResult, colorAttributeLocal2, colorAttributeLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m254deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        LogoLocal.ToDo toDoDeserialize = deserialize(decoder);
        int i3 = IAuthTabCallbackStub + 97;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return toDoDeserialize;
        }
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LogoLocal.ToDo toDo) {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(toDo, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            LogoLocal.ToDo.onWarmupCompleted(toDo, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(toDo, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        LogoLocal.ToDo.onWarmupCompleted(toDo, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LogoLocal.ToDo) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackStub + 55;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallback;
        char c = '0';
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.lastIndexOf("", c, 0, 0) + 78, ExpandableListView.getPackedPositionChild(j) + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    c = '0';
                    j = 0;
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
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 74 - ExpandableListView.getPackedPositionChild(0L), 16037 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (onExtraCallbackWithResult) {
            int i4 = $11 + 87;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 62 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (onNavigationEvent) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 63 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 12214 - View.MeasureSpec.getSize(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i6 = $11 + 29;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i8 = $10 + 109;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
        }
        String str = new String(cArr6);
        int i10 = $11 + 33;
        $10 = i10 % 128;
        if (i10 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i11 = 30 / 0;
            objArr[0] = str;
        }
    }

    static void onNavigationEvent() {
        IAuthTabCallback = new char[]{32495, 32510, 32483};
        onExtraCallback = -1184334181;
        onNavigationEvent = true;
        onExtraCallbackWithResult = true;
    }
}
