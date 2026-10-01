package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.ResultLocal;
import im.toss.features.home.core.local.model.dst.property.BezierLocal;
import im.toss.features.home.core.local.model.dst.property.BezierLocal$$serializer;
import im.toss.features.home.core.local.model.dst.property.MarginLocal;
import im.toss.features.home.core.local.model.dst.property.MarginLocal$$serializer;
import im.toss.features.home.core.local.model.dst.widget.ButtonLocal;
import im.toss.features.home.core.local.model.dst.widget.ButtonLocal$;
import im.toss.features.home.core.local.model.dst.widget.ImageWithSizeLocal;
import im.toss.features.home.core.local.model.dst.widget.ImageWithSizeLocal$$serializer;
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
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ResultLocal$$serializer implements aeu2<ResultLocal> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] IAuthTabCallback = null;
    public static final ResultLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallback();
        ResultLocal$$serializer resultLocal$$serializer = new ResultLocal$$serializer();
        INSTANCE = resultLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ResultLocal", resultLocal$$serializer, 17);
        setanimationsloop.onWarmupCompleted("imageSizeMode", false);
        setanimationsloop.onWarmupCompleted("image", false);
        Object[] objArr = new Object[1];
        a(new int[]{-1004064274, 1086149282, 1732372218, -1969820245}, 5 - Color.blue(0), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("titleAlt", false);
        setanimationsloop.onWarmupCompleted("logTitleAlt", false);
        Object[] objArr2 = new Object[1];
        a(new int[]{-753396137, 828805106, 1390084115, 268382902, -1269384786, 1432486698}, 11 - View.MeasureSpec.getMode(0), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("descriptionAlt", false);
        setanimationsloop.onWarmupCompleted("logDescriptionAlt", false);
        Object[] objArr3 = new Object[1];
        a(new int[]{-476090313, 1726335540, 286821622, 720486164}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 5, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("paddingTop", false);
        setanimationsloop.onWarmupCompleted("paddingBottom", false);
        setanimationsloop.onWarmupCompleted("paddingLeft", false);
        setanimationsloop.onWarmupCompleted("paddingRight", false);
        setanimationsloop.onWarmupCompleted("margin", false);
        setanimationsloop.onWarmupCompleted("bezier", false);
        setanimationsloop.onWarmupCompleted("backgroundColor", false);
        Object[] objArr4 = new Object[1];
        a(new int[]{-1231048610, -587110918, -1800869766, 1454391360, 724014858, 777492850}, 10 - TextUtils.getOffsetBefore("", 0), objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private ResultLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {ResultLocal.onNavigationEvent()[0].getValue(), sp.IAuthTabCallback(ImageWithSizeLocal$$serializer.INSTANCE), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(ButtonLocal$.serializer.INSTANCE), setvideolistener, setvideolistener, setvideolistener, setvideolistener, sp.IAuthTabCallback(MarginLocal$$serializer.INSTANCE), sp.IAuthTabCallback(BezierLocal$$serializer.INSTANCE), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(TextAttributeLocal$.serializer.INSTANCE)};
        int i4 = onNavigationEvent + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00fa A[PHI: r0 r2 r13
      0x00fa: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v8 o.yw) binds: [B:8:0x0049, B:5:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0049, B:5:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r13v10 kotlin.Lazy[]) = (r13v1 kotlin.Lazy[]), (r13v11 kotlin.Lazy[]) binds: [B:8:0x0049, B:5:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b A[PHI: r0 r2 r13
      0x004b: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v8 o.yw) binds: [B:8:0x0049, B:5:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0049, B:5:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r13v2 kotlin.Lazy[]) = (r13v1 kotlin.Lazy[]), (r13v11 kotlin.Lazy[]) binds: [B:8:0x0049, B:5:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ResultLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnNavigationEvent;
        String str;
        String str2;
        TextAttributeLocal textAttributeLocal;
        String str3;
        int i;
        String str4;
        double d;
        String str5;
        String str6;
        ButtonLocal buttonLocal;
        ImageWithSizeLocal imageWithSizeLocal;
        ResultLocal.ImageSizeMode imageSizeMode;
        String str7;
        double d2;
        BezierLocal bezierLocal;
        MarginLocal marginLocal;
        double d3;
        double d4;
        int i2;
        String str8;
        BezierLocal bezierLocal2;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 77;
        onNavigationEvent = i5 % 128;
        int i6 = 10;
        int i7 = 9;
        TextAttributeLocal textAttributeLocal2 = null;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnNavigationEvent = ResultLocal.onNavigationEvent();
            int i8 = 36 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                ResultLocal.ImageSizeMode imageSizeMode2 = (ResultLocal.ImageSizeMode) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), (Object) null);
                ImageWithSizeLocal imageWithSizeLocal2 = (ImageWithSizeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ImageWithSizeLocal$$serializer.INSTANCE, (Object) null);
                getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
                String str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
                String str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
                String str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
                String str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
                String str13 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, (Object) null);
                ButtonLocal buttonLocal2 = (ButtonLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, ButtonLocal$.serializer.INSTANCE, (Object) null);
                double dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 9);
                double dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 10);
                double dIAuthTabCallback3 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 11);
                double dIAuthTabCallback4 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 12);
                MarginLocal marginLocal2 = (MarginLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, MarginLocal$$serializer.INSTANCE, (Object) null);
                BezierLocal bezierLocal3 = (BezierLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, BezierLocal$$serializer.INSTANCE, (Object) null);
                String str14 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, getwrigglelayout, (Object) null);
                str2 = str9;
                textAttributeLocal = (TextAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, TextAttributeLocal$.serializer.INSTANCE, (Object) null);
                str3 = str11;
                i = 131071;
                str4 = str10;
                d = dIAuthTabCallback2;
                str5 = str13;
                str6 = str12;
                buttonLocal = buttonLocal2;
                imageWithSizeLocal = imageWithSizeLocal2;
                imageSizeMode = imageSizeMode2;
                str7 = str14;
                d2 = dIAuthTabCallback;
                bezierLocal = bezierLocal3;
                marginLocal = marginLocal2;
                d3 = dIAuthTabCallback4;
                d4 = dIAuthTabCallback3;
            } else {
                boolean z = true;
                i = 0;
                BezierLocal bezierLocal4 = null;
                str2 = null;
                MarginLocal marginLocal3 = null;
                String str15 = null;
                String str16 = null;
                ButtonLocal buttonLocal3 = null;
                String str17 = null;
                ImageWithSizeLocal imageWithSizeLocal3 = null;
                ResultLocal.ImageSizeMode imageSizeMode3 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                double dIAuthTabCallback5 = 0.0d;
                double dIAuthTabCallback6 = 0.0d;
                double dIAuthTabCallback7 = 0.0d;
                double dIAuthTabCallback8 = 0.0d;
                while (z) {
                    int i9 = onExtraCallback + 61;
                    onNavigationEvent = i9 % 128;
                    if (i9 % i3 != 0) {
                        ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    switch (iOnNavigationEvent) {
                        case -1:
                            str8 = str20;
                            z = false;
                            bezierLocal4 = bezierLocal4;
                            i6 = 10;
                            i7 = 9;
                            str20 = str8;
                        case 0:
                            str8 = str20;
                            bezierLocal2 = bezierLocal4;
                            imageSizeMode3 = (ResultLocal.ImageSizeMode) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), imageSizeMode3);
                            i |= 1;
                            str18 = str18;
                            str19 = str19;
                            str17 = str17;
                            imageWithSizeLocal3 = imageWithSizeLocal3;
                            bezierLocal4 = bezierLocal2;
                            i3 = 2;
                            i6 = 10;
                            i7 = 9;
                            str20 = str8;
                        case 1:
                            String str21 = str20;
                            bezierLocal2 = bezierLocal4;
                            str8 = str21;
                            imageWithSizeLocal3 = (ImageWithSizeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ImageWithSizeLocal$$serializer.INSTANCE, imageWithSizeLocal3);
                            i |= 2;
                            bezierLocal4 = bezierLocal2;
                            i3 = 2;
                            i6 = 10;
                            i7 = 9;
                            str20 = str8;
                        case 2:
                            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str2);
                            i |= 4;
                            i6 = 10;
                            i7 = 9;
                            str20 = str20;
                            i3 = 2;
                            bezierLocal4 = bezierLocal4;
                        case 3:
                            i |= 8;
                            i6 = 10;
                            i7 = 9;
                            bezierLocal4 = bezierLocal4;
                            str20 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str20);
                            i3 = 2;
                        case 4:
                            str17 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str17);
                            i |= 16;
                            i3 = 2;
                            i6 = 10;
                            i7 = 9;
                        case 5:
                            str19 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str19);
                            i |= 32;
                            i6 = 10;
                            i7 = 9;
                        case 6:
                            str18 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str18);
                            i |= 64;
                            i6 = 10;
                            i7 = 9;
                        case 7:
                            str16 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, str16);
                            i |= 128;
                            i6 = 10;
                            i7 = 9;
                        case 8:
                            buttonLocal3 = (ButtonLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, ButtonLocal$.serializer.INSTANCE, buttonLocal3);
                            i |= 256;
                            i6 = 10;
                            i7 = 9;
                        case 9:
                            dIAuthTabCallback7 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, i7);
                            i |= 512;
                            int i10 = onNavigationEvent + 103;
                            onExtraCallback = i10 % 128;
                            if (i10 % i3 == 0) {
                                int i11 = 4 % 3;
                            }
                            i6 = 10;
                            i7 = 9;
                        case 10:
                            dIAuthTabCallback5 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, i6);
                            i |= 1024;
                        case 11:
                            dIAuthTabCallback8 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 11);
                            i |= 2048;
                        case 12:
                            dIAuthTabCallback6 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 12);
                            i |= 4096;
                        case 13:
                            marginLocal3 = (MarginLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13, MarginLocal$$serializer.INSTANCE, marginLocal3);
                            i |= 8192;
                        case 14:
                            bezierLocal4 = (BezierLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, BezierLocal$$serializer.INSTANCE, bezierLocal4);
                            i |= 16384;
                        case 15:
                            str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 15, getWriggleLayout.onNavigationEvent, str15);
                            i2 = 32768;
                            i |= i2;
                        case 16:
                            textAttributeLocal2 = (TextAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 16, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal2);
                            i2 = 65536;
                            i |= i2;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
                imageWithSizeLocal = imageWithSizeLocal3;
                str5 = str18;
                String str22 = str20;
                BezierLocal bezierLocal5 = bezierLocal4;
                imageSizeMode = imageSizeMode3;
                textAttributeLocal = textAttributeLocal2;
                marginLocal = marginLocal3;
                str7 = str15;
                str = str16;
                buttonLocal = buttonLocal3;
                str6 = str19;
                str3 = str17;
                str4 = str22;
                d = dIAuthTabCallback5;
                bezierLocal = bezierLocal5;
                d3 = dIAuthTabCallback6;
                d2 = dIAuthTabCallback7;
                d4 = dIAuthTabCallback8;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnNavigationEvent = ResultLocal.onNavigationEvent();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ResultLocal(i, imageSizeMode, imageWithSizeLocal, str2, str4, str3, str6, str5, str, buttonLocal, d2, d, d4, d3, marginLocal, bezierLocal, str7, textAttributeLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m409deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ResultLocal resultLocalDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 21;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return resultLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ResultLocal resultLocal) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(resultLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ResultLocal.onExtraCallback(resultLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 35;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ResultLocal) obj);
        int i4 = onNavigationEvent + 87;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallback;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 121;
                $11 = i8 % 128;
                if (i8 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 72, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i7 >>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.getOffsetAfter("", 0) + 72, 8848 - View.resolveSize(0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i7++;
                }
                i3 = 2;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallback;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                int i10 = $10 + 111;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    try {
                        Object[] objArr4 = new Object[1];
                        objArr4[i6] = Integer.valueOf(iArr5[i9]);
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(i6, i6), 72 - KeyEvent.getDeadChar(i6, i6), 8847 - TextUtils.lastIndexOf("", '0', i6), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i9] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    Object[] objArr5 = {Integer.valueOf(iArr5[i9])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 71, 8848 - Color.blue(0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                }
                i9++;
                i5 = -1469660336;
                i6 = 0;
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i11 = $10 + 125;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 22252), View.resolveSizeAndState(0, 0, 0) + 39, 10302 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i13++;
            }
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 4033), 78 - (ViewConfiguration.getFadingEdgeLength() >> 16), 7398 - ExpandableListView.getPackedPositionGroup(0L), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallback() {
        IAuthTabCallback = new int[]{1640940494, -543289055, 1737226984, 1380241239, -847782136, -965295160, -342019374, -932118880, 507416167, -1001467167, 1140492533, -1554981395, 398160823, -1966846787, 508024830, 1280884348, 73526730, 1422485061};
    }
}
