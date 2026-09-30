package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal$;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal$$serializer;
import im.toss.features.home.core.local.model.dst.widget.ButtonLocal;
import im.toss.features.home.core.local.model.dst.widget.ButtonLocal$;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal;
import im.toss.features.home.core.local.model.dst.widget.ImageSourceLocal$Icon$$serializer;
import im.toss.features.home.core.local.model.dst.widget.TextAttributeLocal;
import im.toss.features.home.core.local.model.dst.widget.TextAttributeLocal$;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.aeu2;
import o.getBgColor;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BannerLocal$$serializer implements aeu2<BannerLocal> {
    public static final BannerLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static int onNavigationEvent;
    private static final byte[] $$a = {77, -64, 102, Byte.MIN_VALUE};
    private static final int $$b = 155;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, short s) {
        int i;
        int i2;
        int i3 = b + 4;
        int i4 = 105 - (s * 3);
        byte[] bArr = $$a;
        int i5 = b2 * 3;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i3;
            int i8 = 0;
            i3 += -i4;
            i2 = i7;
            i = i8;
            bArr2[i] = (byte) i3;
            int i9 = i2 + 1;
            if (i == i6) {
                return new String(bArr2, 0);
            }
            int i10 = i + 1;
            i7 = i9;
            i4 = bArr[i9];
            i8 = i10;
            i3 += -i4;
            i2 = i7;
            i = i8;
            bArr2[i] = (byte) i3;
            int i92 = i2 + 1;
            if (i == i6) {
            }
        } else {
            i = 0;
            i2 = i3;
            i3 = i4;
            bArr2[i] = (byte) i3;
            int i922 = i2 + 1;
            if (i == i6) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 23;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 111;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return serialDescriptor;
    }

    static {
        onNavigationEvent = 0;
        onExtraCallbackWithResult();
        BannerLocal$$serializer bannerLocal$$serializer = new BannerLocal$$serializer();
        INSTANCE = bannerLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.BannerLocal", bannerLocal$$serializer, 11);
        Object[] objArr = new Object[1];
        a(4 - TextUtils.lastIndexOf("", '0', 0), 2 - View.resolveSize(0, 0), new char[]{65532, 7, 65528, 65535, 7}, true, AndroidCharacter.getMirror('0') + 163, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a(5 - Color.alpha(0), Color.green(0) + 4, new char[]{65525, 0, '\t', 65529, '\n'}, false, (Process.myPid() >> 22) + 210, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("arrow", false);
        setanimationsloop.onWarmupCompleted("titleLeftIcon", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("corner", false);
        setanimationsloop.onWarmupCompleted("padding", false);
        setanimationsloop.onWarmupCompleted("backgroundColor", false);
        setanimationsloop.onWarmupCompleted("innerPadding", false);
        Object[] objArr3 = new Object[1];
        a(6 - (ViewConfiguration.getPressedStateDuration() >> 16), 3 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{5, 5, 0, 65535, 65523, 6}, false, View.combineMeasuredStates(0, 0) + 213, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("arrowColor", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 73;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private BannerLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = BannerLocal.onNavigationEvent();
        TextAttributeLocal$.serializer serializerVar = TextAttributeLocal$.serializer.INSTANCE;
        PaddingLocal$$serializer paddingLocal$$serializer = PaddingLocal$$serializer.INSTANCE;
        ColorAttributeLocal$.serializer serializerVar2 = ColorAttributeLocal$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {serializerVar, sp.IAuthTabCallback(serializerVar), getBgColor.IAuthTabCallback, sp.IAuthTabCallback(ImageSourceLocal$Icon$$serializer.INSTANCE), setAppxVersionInWorker.onExtraCallback, lazyArrOnNavigationEvent[5].getValue(), paddingLocal$$serializer, sp.IAuthTabCallback(serializerVar2), sp.IAuthTabCallback(paddingLocal$$serializer), sp.IAuthTabCallback(ButtonLocal$.serializer.INSTANCE), sp.IAuthTabCallback(serializerVar2)};
        int i4 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BannerLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        PaddingLocal paddingLocal;
        ColorAttributeLocal colorAttributeLocal;
        ColorAttributeLocal colorAttributeLocal2;
        ButtonLocal buttonLocal;
        PaddingLocal paddingLocal2;
        int i;
        TextAttributeLocal textAttributeLocal;
        boolean z;
        List list;
        ImageSourceLocal.Icon icon;
        TextAttributeLocal textAttributeLocal2;
        HandlerLocal handlerLocal;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = BannerLocal.onNavigationEvent();
        int i6 = 10;
        int i7 = 9;
        int i8 = 8;
        boolean z2 = true;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            TextAttributeLocal$.serializer serializerVar = TextAttributeLocal$.serializer.INSTANCE;
            TextAttributeLocal textAttributeLocal3 = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, serializerVar, (Object) null);
            TextAttributeLocal textAttributeLocal4 = (TextAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, serializerVar, (Object) null);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
            ImageSourceLocal.Icon icon2 = (ImageSourceLocal.Icon) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ImageSourceLocal$Icon$$serializer.INSTANCE, (Object) null);
            HandlerLocal handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, (Object) null);
            List list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnNavigationEvent[5].getValue(), (Object) null);
            PaddingLocal$$serializer paddingLocal$$serializer = PaddingLocal$$serializer.INSTANCE;
            PaddingLocal paddingLocal3 = (PaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, paddingLocal$$serializer, (Object) null);
            ColorAttributeLocal$.serializer serializerVar2 = ColorAttributeLocal$.serializer.INSTANCE;
            ColorAttributeLocal colorAttributeLocal3 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, serializerVar2, (Object) null);
            PaddingLocal paddingLocal4 = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, paddingLocal$$serializer, (Object) null);
            ButtonLocal buttonLocal2 = (ButtonLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, ButtonLocal$.serializer.INSTANCE, (Object) null);
            list = list2;
            colorAttributeLocal2 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, serializerVar2, (Object) null);
            buttonLocal = buttonLocal2;
            colorAttributeLocal = colorAttributeLocal3;
            paddingLocal2 = paddingLocal3;
            paddingLocal = paddingLocal4;
            handlerLocal = handlerLocal2;
            textAttributeLocal2 = textAttributeLocal3;
            textAttributeLocal = textAttributeLocal4;
            icon = icon2;
            i = 2047;
            z = zOnExtraCallbackWithResult;
        } else {
            boolean zOnExtraCallbackWithResult2 = false;
            boolean z3 = true;
            PaddingLocal paddingLocal5 = null;
            ColorAttributeLocal colorAttributeLocal4 = null;
            ColorAttributeLocal colorAttributeLocal5 = null;
            ButtonLocal buttonLocal3 = null;
            ImageSourceLocal.Icon icon3 = null;
            TextAttributeLocal textAttributeLocal5 = null;
            HandlerLocal handlerLocal3 = null;
            List list3 = null;
            TextAttributeLocal textAttributeLocal6 = null;
            PaddingLocal paddingLocal6 = null;
            int i9 = 0;
            while ((!z3) != z2) {
                int i10 = IAuthTabCallback + 15;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % i2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z3 = false;
                        i2 = 2;
                        i7 = 9;
                        i8 = 8;
                        textAttributeLocal6 = textAttributeLocal6;
                        z2 = true;
                    case 0:
                        i9 |= 1;
                        list3 = list3;
                        handlerLocal3 = handlerLocal3;
                        icon3 = icon3;
                        textAttributeLocal5 = textAttributeLocal5;
                        i2 = 2;
                        i7 = 9;
                        i8 = 8;
                        z2 = true;
                        textAttributeLocal6 = (TextAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal6);
                        i6 = 10;
                    case 1:
                        z2 = true;
                        i9 |= 2;
                        textAttributeLocal5 = (TextAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal5);
                        i2 = 2;
                        i6 = 10;
                        i7 = 9;
                        i8 = 8;
                    case 2:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2);
                        i9 |= 4;
                        i6 = 10;
                        i7 = 9;
                        i8 = 8;
                        z2 = true;
                    case 3:
                        icon3 = (ImageSourceLocal.Icon) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ImageSourceLocal$Icon$$serializer.INSTANCE, icon3);
                        i9 |= 8;
                        list3 = list3;
                        handlerLocal3 = handlerLocal3;
                        i6 = 10;
                        i7 = 9;
                        i8 = 8;
                        z2 = true;
                    case 4:
                        handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, handlerLocal3);
                        i9 |= 16;
                        i6 = 10;
                        i7 = 9;
                        i8 = 8;
                        z2 = true;
                    case 5:
                        list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnNavigationEvent[5].getValue(), list3);
                        i9 |= 32;
                        i6 = 10;
                        i7 = 9;
                        z2 = true;
                    case 6:
                        paddingLocal6 = (PaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, PaddingLocal$$serializer.INSTANCE, paddingLocal6);
                        i9 |= 64;
                        i6 = 10;
                        z2 = true;
                    case 7:
                        colorAttributeLocal4 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal4);
                        i9 |= 128;
                        z2 = true;
                    case 8:
                        paddingLocal5 = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i8, PaddingLocal$$serializer.INSTANCE, paddingLocal5);
                        i9 |= 256;
                        z2 = true;
                    case 9:
                        buttonLocal3 = (ButtonLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i7, ButtonLocal$.serializer.INSTANCE, buttonLocal3);
                        i9 |= 512;
                        z2 = true;
                    case 10:
                        colorAttributeLocal5 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal5);
                        i9 |= 1024;
                        z2 = true;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            ImageSourceLocal.Icon icon4 = icon3;
            TextAttributeLocal textAttributeLocal7 = textAttributeLocal6;
            TextAttributeLocal textAttributeLocal8 = textAttributeLocal5;
            paddingLocal = paddingLocal5;
            colorAttributeLocal = colorAttributeLocal4;
            colorAttributeLocal2 = colorAttributeLocal5;
            buttonLocal = buttonLocal3;
            paddingLocal2 = paddingLocal6;
            i = i9;
            textAttributeLocal = textAttributeLocal8;
            z = zOnExtraCallbackWithResult2;
            list = list3;
            icon = icon4;
            textAttributeLocal2 = textAttributeLocal7;
            handlerLocal = handlerLocal3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BannerLocal(i, textAttributeLocal2, textAttributeLocal, z, icon, handlerLocal, list, paddingLocal2, colorAttributeLocal, paddingLocal, buttonLocal, colorAttributeLocal2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m283deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        BannerLocal bannerLocalDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return bannerLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BannerLocal bannerLocal) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bannerLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        BannerLocal.onExtraCallbackWithResult(bannerLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BannerLocal) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            j = 0;
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), Color.green(0) + 23, Process.getGidForName("") + 10279, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12843), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 54, (Process.myTid() >> 22) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i7 = $11 + 93;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 4;
            }
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    char cLastIndexOf = (char) (12842 - TextUtils.lastIndexOf("", '0'));
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 55;
                    int i9 = 2168 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1));
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cLastIndexOf, maxKeyCode, i9, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                j = 0;
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i10 = $11 + 47;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = 478308943;
    }
}
