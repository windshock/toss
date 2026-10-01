package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.element.ConsumptionAmountTopLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal$$serializer;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal$Icon$$serializer;
import im.toss.features.home.core.local.model.dst.widget.TextAttributeLocal;
import im.toss.features.home.core.local.model.dst.widget.TextAttributeLocal$;
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
import o.InterceptRequestCaller;
import o.InterceptResponse;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.aeu2;
import o.hideBackButton;
import o.jp;
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
public final /* synthetic */ class ConsumptionAmountTopLocal$$serializer implements aeu2<ConsumptionAmountTopLocal> {
    private static int IAuthTabCallback;
    public static final ConsumptionAmountTopLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onNavigationEvent;
    private static final byte[] $$a = {46, -35, 45, 111};
    private static final int $$b = 11;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, byte b) {
        int i3;
        int i4;
        int i5 = (b * 3) + 4;
        int i6 = (i2 * 2) + 1;
        int i7 = (i * 3) + 105;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i6;
            i4 = 0;
            i5++;
            i7 += -i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i5];
            i5++;
            i7 += -i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 23;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onNavigationEvent = 1;
        onWarmupCompleted();
        ConsumptionAmountTopLocal$$serializer consumptionAmountTopLocal$$serializer = new ConsumptionAmountTopLocal$$serializer();
        INSTANCE = consumptionAmountTopLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ConsumptionAmountTopLocal", consumptionAmountTopLocal$$serializer, 11);
        Object[] objArr = new Object[1];
        a(8 - (Process.myTid() >> 22), 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{65528, 6, '\b', 65525, 7, 65532, 7, 65535}, false, 128 - Process.getGidForName(""), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("subtitleLeftHandler", false);
        setanimationsloop.onWarmupCompleted("subtitleRightHandler", false);
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4, (ViewConfiguration.getJumpTapTimeout() >> 16) + 4, new char[]{65532, 7, 65535, 65528, 7}, false, 128 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("titleRightIcon", false);
        setanimationsloop.onWarmupCompleted("titlePadding", false);
        Object[] objArr3 = new Object[1];
        a(Color.red(0) + 11, (ViewConfiguration.getTouchSlop() >> 8) + 1, new char[]{2, 65528, 65529, 7, 65527, 6, 65533, 4, '\b', 65533, 3}, false, ((byte) KeyEvent.getModifierMetaStateMask()) + 129, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("right", false);
        setanimationsloop.onWarmupCompleted("rightAlignment", false);
        setanimationsloop.onWarmupCompleted("paddingTop", false);
        setanimationsloop.onWarmupCompleted("paddingBottom", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 67;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private ConsumptionAmountTopLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallback = ConsumptionAmountTopLocal.IAuthTabCallback();
        TextAttributeLocal$.serializer serializerVar = TextAttributeLocal$.serializer.INSTANCE;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(serializerVar);
        setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(setappxversioninworker);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(setappxversioninworker);
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(InterceptRequestCaller.IAuthTabCallback);
        KSerializer<?> kSerializerIAuthTabCallback5 = sp.IAuthTabCallback(ImageSourceLocal$Icon$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback6 = sp.IAuthTabCallback(PaddingLocal$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback7 = sp.IAuthTabCallback(serializerVar);
        KSerializer<?> kSerializerIAuthTabCallback8 = sp.IAuthTabCallback(InterceptResponse.onExtraCallback);
        KSerializer<?> kSerializerIAuthTabCallback9 = sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[8].getValue());
        setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, kSerializerIAuthTabCallback4, kSerializerIAuthTabCallback5, kSerializerIAuthTabCallback6, kSerializerIAuthTabCallback7, kSerializerIAuthTabCallback8, kSerializerIAuthTabCallback9, setvideolistener, setvideolistener};
        int i4 = onWarmupCompleted + 79;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ConsumptionAmountTopLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        double dIAuthTabCallback;
        double dIAuthTabCallback2;
        ConsumptionAmountTopLocal.Title title;
        TextAttributeLocal textAttributeLocal;
        ImageSourceLocal.Icon icon;
        HandlerLocal handlerLocal;
        PaddingLocal paddingLocal;
        int i;
        ConsumptionAmountTopLocal.Right right;
        TextAttributeLocal textAttributeLocal2;
        HandlerLocal handlerLocal2;
        hideBackButton.onTransact ontransact;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = ConsumptionAmountTopLocal.IAuthTabCallback();
        int i3 = 10;
        int i4 = 9;
        int i5 = 7;
        int i6 = 8;
        PaddingLocal paddingLocal2 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            ConsumptionAmountTopLocal.Title title2 = null;
            ConsumptionAmountTopLocal.Right right2 = null;
            TextAttributeLocal textAttributeLocal3 = null;
            HandlerLocal handlerLocal3 = null;
            hideBackButton.onTransact ontransact2 = null;
            HandlerLocal handlerLocal4 = null;
            TextAttributeLocal textAttributeLocal4 = null;
            ImageSourceLocal.Icon icon2 = null;
            dIAuthTabCallback2 = 0.0d;
            dIAuthTabCallback = 0.0d;
            int i7 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        i4 = 9;
                        i6 = 8;
                        z = false;
                    case 0:
                        i7 |= 1;
                        textAttributeLocal4 = (TextAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal4);
                        handlerLocal4 = handlerLocal4;
                        icon2 = icon2;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                    case 1:
                        i7 |= 2;
                        handlerLocal4 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, handlerLocal4);
                        i3 = 10;
                        i4 = 9;
                        i6 = 8;
                    case 2:
                        handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setAppxVersionInWorker.onExtraCallback, handlerLocal3);
                        i7 |= 4;
                        i3 = 10;
                        i4 = 9;
                    case 3:
                        title2 = (ConsumptionAmountTopLocal.Title) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, InterceptRequestCaller.IAuthTabCallback, title2);
                        i7 |= 8;
                        i3 = 10;
                        i4 = 9;
                    case 4:
                        i7 |= 16;
                        icon2 = (ImageSourceLocal.Icon) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, ImageSourceLocal$Icon$$serializer.INSTANCE, icon2);
                        i3 = 10;
                        i4 = 9;
                    case 5:
                        paddingLocal2 = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, PaddingLocal$$serializer.INSTANCE, paddingLocal2);
                        i7 |= 32;
                        i3 = 10;
                    case 6:
                        textAttributeLocal3 = (TextAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal3);
                        i7 |= 64;
                        i3 = 10;
                    case 7:
                        right2 = (ConsumptionAmountTopLocal.Right) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, InterceptResponse.onExtraCallback, right2);
                        i7 |= 128;
                        int i8 = onWarmupCompleted + 93;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        i3 = 10;
                    case 8:
                        ontransact2 = (hideBackButton.onTransact) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, (jp) lazyArrIAuthTabCallback[i6].getValue(), ontransact2);
                        i7 |= 256;
                        i3 = 10;
                    case 9:
                        dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, i4);
                        i7 |= 512;
                        i3 = 10;
                    case 10:
                        dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, i3);
                        i7 |= 1024;
                        int i10 = onWarmupCompleted + 107;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        i3 = 10;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            title = title2;
            handlerLocal = handlerLocal4;
            icon = icon2;
            i = i7;
            right = right2;
            textAttributeLocal2 = textAttributeLocal3;
            handlerLocal2 = handlerLocal3;
            textAttributeLocal = textAttributeLocal4;
            ontransact = ontransact2;
            paddingLocal = paddingLocal2;
        } else {
            int i12 = onWarmupCompleted + 91;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            TextAttributeLocal$.serializer serializerVar = TextAttributeLocal$.serializer.INSTANCE;
            TextAttributeLocal textAttributeLocal5 = (TextAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, serializerVar, (Object) null);
            setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
            HandlerLocal handlerLocal5 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setappxversioninworker, (Object) null);
            HandlerLocal handlerLocal6 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, setappxversioninworker, (Object) null);
            ConsumptionAmountTopLocal.Title title3 = (ConsumptionAmountTopLocal.Title) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, InterceptRequestCaller.IAuthTabCallback, (Object) null);
            ImageSourceLocal.Icon icon3 = (ImageSourceLocal.Icon) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, ImageSourceLocal$Icon$$serializer.INSTANCE, (Object) null);
            PaddingLocal paddingLocal3 = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, PaddingLocal$$serializer.INSTANCE, (Object) null);
            TextAttributeLocal textAttributeLocal6 = (TextAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, serializerVar, (Object) null);
            ConsumptionAmountTopLocal.Right right3 = (ConsumptionAmountTopLocal.Right) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, InterceptResponse.onExtraCallback, (Object) null);
            hideBackButton.onTransact ontransact3 = (hideBackButton.onTransact) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, (jp) lazyArrIAuthTabCallback[8].getValue(), (Object) null);
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 9);
            dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 10);
            title = title3;
            textAttributeLocal = textAttributeLocal5;
            icon = icon3;
            handlerLocal = handlerLocal5;
            paddingLocal = paddingLocal3;
            i = 2047;
            right = right3;
            textAttributeLocal2 = textAttributeLocal6;
            handlerLocal2 = handlerLocal6;
            ontransact = ontransact3;
        }
        double d = dIAuthTabCallback;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ConsumptionAmountTopLocal(i, textAttributeLocal, handlerLocal, handlerLocal2, title, icon, paddingLocal, textAttributeLocal2, right, ontransact, d, dIAuthTabCallback2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m319deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ConsumptionAmountTopLocal consumptionAmountTopLocalDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return consumptionAmountTopLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ConsumptionAmountTopLocal consumptionAmountTopLocal) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(consumptionAmountTopLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ConsumptionAmountTopLocal.IAuthTabCallback(consumptionAmountTopLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 89;
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
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ConsumptionAmountTopLocal) obj);
        int i4 = onWarmupCompleted + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 115;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0168  */
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
            int i6 = $10 + 55;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getEdgeSlop() >> 16)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10277, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.getCapsMode("", 0, 0)), 55 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 2166 - ((byte) KeyEvent.getModifierMetaStateMask()), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i9 = $11 + 27;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i11 = $10 + 27;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 12843), 55 - View.MeasureSpec.getSize(0), 2166 - MotionEvent.axisFromString(""), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = 478308925;
    }
}
