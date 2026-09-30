package im.toss.features.home.core.local.model.dst.widget;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.property.LayoutLocal;
import im.toss.features.home.core.local.model.dst.property.LayoutLocal$$serializer;
import im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.RVMain;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.aeu2;
import o.getBgColor;
import o.okycx;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.setVideoListener;
import o.setupProxy;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeListRowAttributeLocal$$serializer implements aeu2<HomeListRowAttributeLocal> {
    private static int IAuthTabCallback;
    public static final HomeListRowAttributeLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static final byte[] $$a = {115, 102, 60, 8};
    private static final int $$b = 177;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, short s3) {
        int i;
        byte[] bArr = $$a;
        int i2 = s * 2;
        int i3 = (s2 * 2) + 105;
        int i4 = s3 + 4;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        if (bArr == null) {
            int i6 = i5;
            int i7 = i4;
            i = 0;
            int i8 = i4 + i6;
            i4 = i7;
            i3 = i8;
            bArr2[i] = (byte) i3;
            int i9 = i4 + 1;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            i++;
            i6 = bArr[i9];
            i4 = i3;
            i7 = i9;
            int i82 = i4 + i6;
            i4 = i7;
            i3 = i82;
            bArr2[i] = (byte) i3;
            int i92 = i4 + 1;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            int i922 = i4 + 1;
            if (i == i5) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 47;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onExtraCallback = 1;
        onExtraCallbackWithResult();
        HomeListRowAttributeLocal$$serializer homeListRowAttributeLocal$$serializer = new HomeListRowAttributeLocal$$serializer();
        INSTANCE = homeListRowAttributeLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal", homeListRowAttributeLocal$$serializer, 11);
        setanimationsloop.onWarmupCompleted("layout", false);
        setanimationsloop.onWarmupCompleted("left", false);
        setanimationsloop.onWarmupCompleted("leftSpace", false);
        setanimationsloop.onWarmupCompleted("center", false);
        setanimationsloop.onWarmupCompleted("rightSpace", false);
        setanimationsloop.onWarmupCompleted("right", false);
        setanimationsloop.onWarmupCompleted("arrowSpace", false);
        setanimationsloop.onWarmupCompleted("arrow", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("longPressHandler", false);
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getPressedStateDuration() >> 16) + 5, 4 - Drawable.resolveOpacity(0, 0), new char[]{1, '\t', 5, 65530, 65530}, true, (Process.myTid() >> 22) + 182, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 19;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private HomeListRowAttributeLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(setupProxy.onExtraCallbackWithResult);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(RVMain.onExtraCallback);
        setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(setappxversioninworker);
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(setappxversioninworker);
        setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {LayoutLocal$$serializer.INSTANCE, kSerializerIAuthTabCallback, setvideolistener, HomeListRowAttributeLocal$Center$$serializer.INSTANCE, setvideolistener, kSerializerIAuthTabCallback2, setvideolistener, getBgColor.IAuthTabCallback, kSerializerIAuthTabCallback3, kSerializerIAuthTabCallback4, setvideolistener};
        int i4 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeListRowAttributeLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        HomeListRowAttributeLocal.Center center;
        HomeListRowAttributeLocal.Right right;
        double d;
        HandlerLocal handlerLocal;
        double dIAuthTabCallback;
        double d2;
        double d3;
        int i;
        HomeListRowAttributeLocal.Left left;
        HandlerLocal handlerLocal2;
        boolean z;
        LayoutLocal layoutLocal;
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 10;
        int i5 = 9;
        int i6 = 7;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i7 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            LayoutLocal layoutLocal2 = (LayoutLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, LayoutLocal$$serializer.INSTANCE, (Object) null);
            HomeListRowAttributeLocal.Left left2 = (HomeListRowAttributeLocal.Left) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setupProxy.onExtraCallbackWithResult, (Object) null);
            double dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
            HomeListRowAttributeLocal.Center center2 = (HomeListRowAttributeLocal.Center) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, HomeListRowAttributeLocal$Center$$serializer.INSTANCE, (Object) null);
            double dIAuthTabCallback3 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 4);
            HomeListRowAttributeLocal.Right right2 = (HomeListRowAttributeLocal.Right) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, RVMain.onExtraCallback, (Object) null);
            double dIAuthTabCallback4 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 6);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7);
            setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
            HandlerLocal handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, setappxversioninworker, (Object) null);
            layoutLocal = layoutLocal2;
            i = 2047;
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, setappxversioninworker, (Object) null);
            z = zOnExtraCallbackWithResult;
            right = right2;
            handlerLocal2 = handlerLocal3;
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 10);
            d = dIAuthTabCallback4;
            d3 = dIAuthTabCallback3;
            center = center2;
            d2 = dIAuthTabCallback2;
            left = left2;
        } else {
            double dIAuthTabCallback5 = 0.0d;
            boolean z2 = true;
            int i9 = 0;
            HandlerLocal handlerLocal4 = null;
            HomeListRowAttributeLocal.Right right3 = null;
            HomeListRowAttributeLocal.Center center3 = null;
            HomeListRowAttributeLocal.Left left3 = null;
            LayoutLocal layoutLocal3 = null;
            double dIAuthTabCallback6 = 0.0d;
            double dIAuthTabCallback7 = 0.0d;
            double dIAuthTabCallback8 = 0.0d;
            HandlerLocal handlerLocal5 = null;
            boolean zOnExtraCallbackWithResult2 = false;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z2 = false;
                        i2 = 2;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                    case 0:
                        i9 |= 1;
                        layoutLocal3 = (LayoutLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, LayoutLocal$$serializer.INSTANCE, layoutLocal3);
                        i2 = 2;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                    case 1:
                        left3 = (HomeListRowAttributeLocal.Left) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setupProxy.onExtraCallbackWithResult, left3);
                        i9 |= 2;
                        int i10 = onNavigationEvent + 17;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % i2;
                        center3 = center3;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                    case 2:
                        dIAuthTabCallback6 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, i2);
                        i9 |= 4;
                        i4 = 10;
                        i5 = 9;
                    case 3:
                        center3 = (HomeListRowAttributeLocal.Center) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, HomeListRowAttributeLocal$Center$$serializer.INSTANCE, center3);
                        i9 |= 8;
                        i4 = 10;
                        i5 = 9;
                    case 4:
                        dIAuthTabCallback7 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 4);
                        i9 |= 16;
                        i4 = 10;
                    case 5:
                        right3 = (HomeListRowAttributeLocal.Right) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, RVMain.onExtraCallback, right3);
                        i9 |= 32;
                        i4 = 10;
                    case 6:
                        dIAuthTabCallback8 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 6);
                        i9 |= 64;
                        i4 = 10;
                    case 7:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6);
                        i9 |= 128;
                        int i12 = onNavigationEvent + 15;
                        onExtraCallbackWithResult = i12 % 128;
                        int i13 = i12 % i2;
                        i4 = 10;
                    case 8:
                        handlerLocal4 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, setAppxVersionInWorker.onExtraCallback, handlerLocal4);
                        i9 |= 256;
                    case 9:
                        handlerLocal5 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, setAppxVersionInWorker.onExtraCallback, handlerLocal5);
                        i9 |= 512;
                    case 10:
                        dIAuthTabCallback5 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, i4);
                        i9 |= 1024;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            HomeListRowAttributeLocal.Left left4 = left3;
            center = center3;
            right = right3;
            d = dIAuthTabCallback8;
            handlerLocal = handlerLocal5;
            dIAuthTabCallback = dIAuthTabCallback5;
            d2 = dIAuthTabCallback6;
            d3 = dIAuthTabCallback7;
            i = i9;
            left = left4;
            handlerLocal2 = handlerLocal4;
            z = zOnExtraCallbackWithResult2;
            layoutLocal = layoutLocal3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeListRowAttributeLocal(i, layoutLocal, left, d2, center, d3, right, d, z, handlerLocal2, handlerLocal, dIAuthTabCallback, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m490deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        HomeListRowAttributeLocal homeListRowAttributeLocalDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return homeListRowAttributeLocalDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeListRowAttributeLocal homeListRowAttributeLocal) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeListRowAttributeLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeListRowAttributeLocal.IAuthTabCallback(homeListRowAttributeLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeListRowAttributeLocal) obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cb  */
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
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35124 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23, 10277 - MotionEvent.axisFromString(""), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - View.resolveSize(0, 0)), 55 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.combineMeasuredStates(0, 0) + 2167, 1298711993, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
            int i7 = $10 + 57;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            int i9 = $11 + 87;
            $10 = i9 % 128;
            int i10 = i9 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i11 = $11 + 123;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i13 = $11 + 125;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i % simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) % 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Color.blue(0)), 56 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 2167 - KeyEvent.getDeadChar(0, 0), 1298711993, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - Process.getGidForName("")), 55 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 2167, 1298711993, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = 478308966;
    }
}
