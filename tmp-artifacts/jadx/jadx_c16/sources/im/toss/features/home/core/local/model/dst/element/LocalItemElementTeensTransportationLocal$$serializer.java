package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.BaseListRowLocal;
import im.toss.features.home.core.local.model.dst.element.LocalItemElementTeensTransportationLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
import im.toss.features.home.core.local.model.dst.widget.TextContentLocal;
import im.toss.features.home.core.local.model.dst.widget.TextContentLocal$;
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
import o.TimelineExternalSyntheticLambda1;
import o.aeu2;
import o.jp;
import o.okycx;
import o.removeNextStartHandler;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.setSuccessCallback;
import o.setSuccessParams;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LocalItemElementTeensTransportationLocal$$serializer implements aeu2<LocalItemElementTeensTransportationLocal> {
    public static final LocalItemElementTeensTransportationLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {4, -66, -36, 8};
    private static final int $$b = 162;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallback = 1;

    private static String $$c(short s, byte b, int i) {
        int i2 = 3 - (s * 4);
        byte[] bArr = $$a;
        int i3 = (i * 4) + 97;
        int i4 = b * 2;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i3 = (-i2) + i3;
            i2 = i2;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            int i8 = i2 + 1;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i6 = i7;
            i3 = (-bArr[i8]) + i3;
            i2 = i8;
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 61;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onWarmupCompleted = 0;
        IAuthTabCallback();
        LocalItemElementTeensTransportationLocal$$serializer localItemElementTeensTransportationLocal$$serializer = new LocalItemElementTeensTransportationLocal$$serializer();
        INSTANCE = localItemElementTeensTransportationLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.LocalItemElementTeensTransportationLocal", localItemElementTeensTransportationLocal$$serializer, 10);
        setanimationsloop.onWarmupCompleted("left", false);
        setanimationsloop.onWarmupCompleted("content", false);
        setanimationsloop.onWarmupCompleted("right", false);
        setanimationsloop.onWarmupCompleted("registerHandler", false);
        setanimationsloop.onWarmupCompleted("refreshHandler", false);
        setanimationsloop.onWarmupCompleted("uiVariant", false);
        Object[] objArr = new Object[1];
        a(ExpandableListView.getPackedPositionType(0L), 5 - TextUtils.getOffsetAfter("", 0), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 1380), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("cardImage", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("chargeHandler", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 123;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 22 / 0;
        }
    }

    private LocalItemElementTeensTransportationLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = LocalItemElementTeensTransportationLocal.onWarmupCompleted();
        setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(setSuccessCallback.onExtraCallback), BaseListRowLocal$Content$$serializer.INSTANCE, sp.IAuthTabCallback(setSuccessParams.IAuthTabCallback), sp.IAuthTabCallback(setappxversioninworker), sp.IAuthTabCallback(setappxversioninworker), lazyArrOnWarmupCompleted[5].getValue(), TextContentLocal$.serializer.INSTANCE, sp.IAuthTabCallback(removeNextStartHandler.onWarmupCompleted), setappxversioninworker, setappxversioninworker};
        int i4 = onNavigationEvent + 7;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final LocalItemElementTeensTransportationLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        HandlerLocal handlerLocal;
        BaseListRowLocal.Right right;
        HandlerLocal handlerLocal2;
        HandlerLocal handlerLocal3;
        TextContentLocal textContentLocal;
        LocalItemElementTeensTransportationLocal.onExtraCallbackWithResult onextracallbackwithresult;
        int i;
        HandlerLocal handlerLocal4;
        BaseListRowLocal.Content content;
        ImageSourceLocal imageSourceLocal;
        BaseListRowLocal.Left left;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 113;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = LocalItemElementTeensTransportationLocal.onWarmupCompleted();
        int i5 = 9;
        int i6 = 7;
        int i7 = 8;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            HandlerLocal handlerLocal5 = null;
            TextContentLocal textContentLocal2 = null;
            LocalItemElementTeensTransportationLocal.onExtraCallbackWithResult onextracallbackwithresult2 = null;
            int i8 = 0;
            HandlerLocal handlerLocal6 = null;
            BaseListRowLocal.Content content2 = null;
            ImageSourceLocal imageSourceLocal2 = null;
            HandlerLocal handlerLocal7 = null;
            HandlerLocal handlerLocal8 = null;
            BaseListRowLocal.Right right2 = null;
            BaseListRowLocal.Left left2 = null;
            while (z) {
                int i9 = IAuthTabCallbackStub + 37;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        int i10 = IAuthTabCallbackStub + 69;
                        onNavigationEvent = i10 % 128;
                        int i11 = i10 % 2;
                        handlerLocal8 = handlerLocal8;
                        left2 = left2;
                        handlerLocal7 = handlerLocal7;
                        right2 = right2;
                        z = false;
                        i5 = 9;
                        i6 = 7;
                        i7 = 8;
                    case 0:
                        i8 |= 1;
                        z = z;
                        i5 = 9;
                        i6 = 7;
                        i7 = 8;
                        left2 = (BaseListRowLocal.Left) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, setSuccessCallback.onExtraCallback, left2);
                    case 1:
                        content2 = (BaseListRowLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseListRowLocal$Content$$serializer.INSTANCE, content2);
                        i8 |= 2;
                        handlerLocal8 = handlerLocal8;
                        handlerLocal7 = handlerLocal7;
                        right2 = right2;
                        i5 = 9;
                        i6 = 7;
                        i7 = 8;
                    case 2:
                        i8 |= 4;
                        right2 = (BaseListRowLocal.Right) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setSuccessParams.IAuthTabCallback, right2);
                        i5 = 9;
                        i6 = 7;
                        i7 = 8;
                    case 3:
                        i8 |= 8;
                        handlerLocal8 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setAppxVersionInWorker.onExtraCallback, handlerLocal8);
                        i5 = 9;
                        i7 = 8;
                    case 4:
                        i8 |= 16;
                        handlerLocal7 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, handlerLocal7);
                        i5 = 9;
                    case 5:
                        onextracallbackwithresult2 = (LocalItemElementTeensTransportationLocal.onExtraCallbackWithResult) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnWarmupCompleted[5].getValue(), onextracallbackwithresult2);
                        i8 |= 32;
                    case 6:
                        textContentLocal2 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, TextContentLocal$.serializer.INSTANCE, textContentLocal2);
                        i8 |= 64;
                        int i12 = IAuthTabCallbackStub + 117;
                        onNavigationEvent = i12 % 128;
                        int i13 = i12 % 2;
                    case 7:
                        imageSourceLocal2 = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, removeNextStartHandler.onWarmupCompleted, imageSourceLocal2);
                        i8 |= 128;
                    case 8:
                        handlerLocal5 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i7, setAppxVersionInWorker.onExtraCallback, handlerLocal5);
                        i8 |= 256;
                    case 9:
                        handlerLocal6 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i5, setAppxVersionInWorker.onExtraCallback, handlerLocal6);
                        i8 |= 512;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            handlerLocal = handlerLocal5;
            handlerLocal2 = handlerLocal8;
            left = left2;
            handlerLocal3 = handlerLocal7;
            textContentLocal = textContentLocal2;
            right = right2;
            onextracallbackwithresult = onextracallbackwithresult2;
            i = i8;
            handlerLocal4 = handlerLocal6;
            content = content2;
            imageSourceLocal = imageSourceLocal2;
        } else {
            BaseListRowLocal.Left left3 = (BaseListRowLocal.Left) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, setSuccessCallback.onExtraCallback, (Object) null);
            BaseListRowLocal.Content content3 = (BaseListRowLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseListRowLocal$Content$$serializer.INSTANCE, (Object) null);
            BaseListRowLocal.Right right3 = (BaseListRowLocal.Right) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setSuccessParams.IAuthTabCallback, (Object) null);
            setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
            HandlerLocal handlerLocal9 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setappxversioninworker, (Object) null);
            HandlerLocal handlerLocal10 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setappxversioninworker, (Object) null);
            LocalItemElementTeensTransportationLocal.onExtraCallbackWithResult onextracallbackwithresult3 = (LocalItemElementTeensTransportationLocal.onExtraCallbackWithResult) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnWarmupCompleted[5].getValue(), (Object) null);
            TextContentLocal textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, TextContentLocal$.serializer.INSTANCE, (Object) null);
            ImageSourceLocal imageSourceLocal3 = (ImageSourceLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, removeNextStartHandler.onWarmupCompleted, (Object) null);
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 8, setappxversioninworker, (Object) null);
            right = right3;
            handlerLocal2 = handlerLocal9;
            handlerLocal3 = handlerLocal10;
            textContentLocal = textContentLocal3;
            onextracallbackwithresult = onextracallbackwithresult3;
            i = 1023;
            handlerLocal4 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 9, setappxversioninworker, (Object) null);
            content = content3;
            imageSourceLocal = imageSourceLocal3;
            left = left3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new LocalItemElementTeensTransportationLocal(i, left, content, right, handlerLocal2, handlerLocal3, onextracallbackwithresult, textContentLocal, imageSourceLocal, handlerLocal, handlerLocal4, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m400deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LocalItemElementTeensTransportationLocal localItemElementTeensTransportationLocal) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(localItemElementTeensTransportationLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        LocalItemElementTeensTransportationLocal.onExtraCallbackWithResult(localItemElementTeensTransportationLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackStub + 29;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LocalItemElementTeensTransportationLocal) obj);
        int i4 = onNavigationEvent + 119;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $10 + 63;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallback[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59698 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.indexOf("", "", 0, 0) + 17, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10974, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 46133), 31 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49124), 44 - View.combineMeasuredStates(0, 0), 1495 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i7 = $10 + 77;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 3 % 2;
        }
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (KeyEvent.getMaxKeyCode() >> 16)), 44 - Color.alpha(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i9 = $10 + 69;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    static void IAuthTabCallback() {
        onExtraCallback = new char[]{59588, 30743, 51544, 23222, 44013};
        onExtraCallbackWithResult = 8406461411322199322L;
    }
}
