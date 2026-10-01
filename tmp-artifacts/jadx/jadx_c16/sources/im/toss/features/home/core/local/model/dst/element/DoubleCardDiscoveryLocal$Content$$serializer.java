package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.element.DoubleCardDiscoveryLocal;
import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal;
import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal$;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.aeu2;
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
public final /* synthetic */ class DoubleCardDiscoveryLocal$Content$$serializer implements aeu2<DoubleCardDiscoveryLocal.Content> {
    private static long IAuthTabCallback;
    public static final DoubleCardDiscoveryLocal$Content$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static final byte[] $$a = {112, 44, -46, -27};
    private static final int $$b = 220;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int asInterface = 1;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, short s3) {
        int i;
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = (s * 4) + 1;
        int i5 = s3 + 4;
        int i6 = 97 - (s2 * 3);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i4;
            i2 = i5;
            i3 = 0;
            i5 += i7;
            i = i3;
            i3 = i + 1;
            bArr2[i] = (byte) i5;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            i2++;
            i7 = bArr[i2];
            i5 += i7;
            i = i3;
            i3 = i + 1;
            bArr2[i] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i = 0;
            i5 = i6;
            i2 = i5;
            i3 = i + 1;
            bArr2[i] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            serialDescriptor = descriptor;
            int i4 = 90 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 19;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return serialDescriptor;
    }

    static {
        onExtraCallbackWithResult = 0;
        onWarmupCompleted();
        DoubleCardDiscoveryLocal$Content$$serializer doubleCardDiscoveryLocal$Content$$serializer = new DoubleCardDiscoveryLocal$Content$$serializer();
        INSTANCE = doubleCardDiscoveryLocal$Content$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.DoubleCardDiscoveryLocal.Content", doubleCardDiscoveryLocal$Content$$serializer, 5);
        setanimationsloop.onWarmupCompleted("id", false);
        Object[] objArr = new Object[1];
        a(Process.myTid() >> 22, 5 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (Color.rgb(0, 0, 0) + 16777216), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("image", false);
        setanimationsloop.onWarmupCompleted("impressionEventLog", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private DoubleCardDiscoveryLocal$Content$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(ImpressionEventLogLocal$.serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, DoubleCardDiscoveryLocal$Content$Image$$serializer.INSTANCE, kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2};
        int i4 = onExtraCallback + 77;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final DoubleCardDiscoveryLocal.Content deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        ImpressionEventLogLocal impressionEventLogLocal;
        HandlerLocal handlerLocal;
        String str2;
        DoubleCardDiscoveryLocal.Content.Image image;
        int i;
        int i2 = 2 % 2;
        int i3 = asInterface + 107;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 0;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            DoubleCardDiscoveryLocal.Content.Image image2 = (DoubleCardDiscoveryLocal.Content.Image) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, DoubleCardDiscoveryLocal$Content$Image$$serializer.INSTANCE, (Object) null);
            str = strAsInterface;
            impressionEventLogLocal = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ImpressionEventLogLocal$.serializer.INSTANCE, (Object) null);
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, (Object) null);
            str2 = strAsInterface2;
            image = image2;
            i = 31;
        } else {
            int i6 = 0;
            int i7 = 1;
            String strAsInterface3 = null;
            ImpressionEventLogLocal impressionEventLogLocal2 = null;
            HandlerLocal handlerLocal2 = null;
            String strAsInterface4 = null;
            DoubleCardDiscoveryLocal.Content.Image image3 = null;
            while (i7 != 0) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    i7 = i5;
                } else if (iOnNavigationEvent != 0) {
                    if (iOnNavigationEvent == 1) {
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i6 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                        image3 = (DoubleCardDiscoveryLocal.Content.Image) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, DoubleCardDiscoveryLocal$Content$Image$$serializer.INSTANCE, image3);
                        i6 |= 4;
                    } else if (iOnNavigationEvent != 3) {
                        int i8 = onExtraCallback + 7;
                        asInterface = i8 % 128;
                        if (i8 % 2 == 0) {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                            i6 |= 16;
                        } else {
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                            i6 |= 16;
                        }
                    } else {
                        impressionEventLogLocal2 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ImpressionEventLogLocal$.serializer.INSTANCE, impressionEventLogLocal2);
                        i6 |= 8;
                    }
                    i5 = 0;
                } else {
                    strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i5);
                    i6 |= 1;
                }
            }
            str = strAsInterface3;
            impressionEventLogLocal = impressionEventLogLocal2;
            handlerLocal = handlerLocal2;
            str2 = strAsInterface4;
            image = image3;
            i = i6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        DoubleCardDiscoveryLocal.Content content = new DoubleCardDiscoveryLocal.Content(i, str, str2, image, impressionEventLogLocal, handlerLocal, (okycx) null);
        int i9 = onExtraCallback + 15;
        asInterface = i9 % 128;
        if (i9 % 2 != 0) {
            return content;
        }
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m336deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        DoubleCardDiscoveryLocal.Content contentDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 51;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return contentDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DoubleCardDiscoveryLocal.Content content) {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(content, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            DoubleCardDiscoveryLocal.Content.onWarmupCompleted(content, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(content, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        DoubleCardDiscoveryLocal.Content.onWarmupCompleted(content, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = asInterface + 31;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DoubleCardDiscoveryLocal.Content) obj);
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallback + 47;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 1 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - View.MeasureSpec.getMode(0)), 18 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 46134), 31 - View.combineMeasuredStates(0, 0), 20220 - TextUtils.indexOf("", "", 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1494, -1657859959, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i5 = $10 + 105;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 49123), TextUtils.indexOf("", "", 0) + 44, 1494 - View.resolveSize(0, 0), -1657859959, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr);
        int i7 = $11 + 3;
        $10 = i7 % 128;
        if (i7 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i8 = 3 / 0;
            objArr[0] = str;
        }
    }

    static void onWarmupCompleted() {
        onNavigationEvent = new char[]{60832, 26370, 63690, 19897};
        IAuthTabCallback = 1912645240004765543L;
    }
}
