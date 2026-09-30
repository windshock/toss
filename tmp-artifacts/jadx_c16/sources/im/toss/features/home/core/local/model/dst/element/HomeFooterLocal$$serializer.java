package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.HomeFooterLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal$;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal$$serializer;
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
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
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
public final /* synthetic */ class HomeFooterLocal$$serializer implements aeu2<HomeFooterLocal> {
    public static final HomeFooterLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char onWarmupCompleted;
    private static final byte[] $$a = {57, 126, 65, 8};
    private static final int $$b = 116;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, short s2) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = s2 + 109;
        int i4 = 1 - (s * 2);
        int i5 = b + 4;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i3 = i4;
            i3 += i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            i5++;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i5];
            i3 += i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            i5++;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            i5++;
            if (i2 == i4) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        return serialDescriptor;
    }

    static {
        onNavigationEvent = 0;
        onExtraCallbackWithResult();
        HomeFooterLocal$$serializer homeFooterLocal$$serializer = new HomeFooterLocal$$serializer();
        INSTANCE = homeFooterLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.HomeFooterLocal", homeFooterLocal$$serializer, 12);
        Object[] objArr = new Object[1];
        a((char) (TextUtils.lastIndexOf("", '0') + 12054), 1597215304 - Color.alpha(0), new char[]{12709, 29251, 37790, 38567, 22547}, new char[]{512, 43907, 12753, 47064}, new char[]{18646, 13202, 5471, 53807}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-2131678192) + ExpandableListView.getPackedPositionGroup(0L), new char[]{48819, 33910, 18747, 30116, 40775, 19518, 7127, 49439, 4170}, new char[]{512, 43907, 12753, 47064}, new char[]{4143, 61740, 6272, 20671}, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("titleImage", false);
        setanimationsloop.onWarmupCompleted("titleBackgroundColor", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("subTitle", false);
        setanimationsloop.onWarmupCompleted("subTitleText", false);
        setanimationsloop.onWarmupCompleted("subTitleImage", false);
        setanimationsloop.onWarmupCompleted("subTitleBackgroundColor", false);
        setanimationsloop.onWarmupCompleted("subHandler", false);
        setanimationsloop.onWarmupCompleted("padding", false);
        setanimationsloop.onWarmupCompleted("horizontalFillType", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 89;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private HomeFooterLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = HomeFooterLocal.onWarmupCompleted();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        TextAttributeLocal$.serializer serializerVar = TextAttributeLocal$.serializer.INSTANCE;
        ImageWithSizeLocal$$serializer imageWithSizeLocal$$serializer = ImageWithSizeLocal$$serializer.INSTANCE;
        ColorAttributeLocal$.serializer serializerVar2 = ColorAttributeLocal$.serializer.INSTANCE;
        setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, sp.IAuthTabCallback(serializerVar), sp.IAuthTabCallback(imageWithSizeLocal$$serializer), sp.IAuthTabCallback(serializerVar2), setappxversioninworker, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(serializerVar), sp.IAuthTabCallback(imageWithSizeLocal$$serializer), sp.IAuthTabCallback(serializerVar2), sp.IAuthTabCallback(setappxversioninworker), sp.IAuthTabCallback(PaddingLocal$$serializer.INSTANCE), lazyArrOnWarmupCompleted[11].getValue()};
        int i4 = onTransact + 65;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeFooterLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        HomeFooterLocal.IAuthTabCallback iAuthTabCallback;
        TextAttributeLocal textAttributeLocal;
        String str;
        HandlerLocal handlerLocal;
        int i;
        PaddingLocal paddingLocal;
        HandlerLocal handlerLocal2;
        ImageWithSizeLocal imageWithSizeLocal;
        ColorAttributeLocal colorAttributeLocal;
        ColorAttributeLocal colorAttributeLocal2;
        ImageWithSizeLocal imageWithSizeLocal2;
        String str2;
        TextAttributeLocal textAttributeLocal2;
        boolean z;
        int i2 = 2 % 2;
        int i3 = onTransact + 23;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = HomeFooterLocal.onWarmupCompleted();
        boolean z2 = true;
        ColorAttributeLocal colorAttributeLocal3 = null;
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            int i5 = onTransact + 89;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            TextAttributeLocal$.serializer serializerVar = TextAttributeLocal$.serializer.INSTANCE;
            TextAttributeLocal textAttributeLocal3 = (TextAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, serializerVar, (Object) null);
            ImageWithSizeLocal$$serializer imageWithSizeLocal$$serializer = ImageWithSizeLocal$$serializer.INSTANCE;
            ImageWithSizeLocal imageWithSizeLocal3 = (ImageWithSizeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, imageWithSizeLocal$$serializer, (Object) null);
            ColorAttributeLocal$.serializer serializerVar2 = ColorAttributeLocal$.serializer.INSTANCE;
            ColorAttributeLocal colorAttributeLocal4 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, serializerVar2, (Object) null);
            setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
            HandlerLocal handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, setappxversioninworker, (Object) null);
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, (Object) null);
            TextAttributeLocal textAttributeLocal4 = (TextAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, serializerVar, (Object) null);
            ImageWithSizeLocal imageWithSizeLocal4 = (ImageWithSizeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, imageWithSizeLocal$$serializer, (Object) null);
            ColorAttributeLocal colorAttributeLocal5 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, serializerVar2, (Object) null);
            HandlerLocal handlerLocal4 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, setappxversioninworker, (Object) null);
            PaddingLocal paddingLocal2 = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, PaddingLocal$$serializer.INSTANCE, (Object) null);
            imageWithSizeLocal2 = imageWithSizeLocal3;
            iAuthTabCallback = (HomeFooterLocal.IAuthTabCallback) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 11, (jp) lazyArrOnWarmupCompleted[11].getValue(), (Object) null);
            str2 = strAsInterface;
            textAttributeLocal2 = textAttributeLocal3;
            textAttributeLocal = textAttributeLocal4;
            colorAttributeLocal = colorAttributeLocal5;
            str = str3;
            imageWithSizeLocal = imageWithSizeLocal4;
            handlerLocal2 = handlerLocal4;
            colorAttributeLocal2 = colorAttributeLocal4;
            paddingLocal = paddingLocal2;
            handlerLocal = handlerLocal3;
            i = 4095;
        } else {
            boolean z3 = true;
            HomeFooterLocal.IAuthTabCallback iAuthTabCallback2 = null;
            TextAttributeLocal textAttributeLocal5 = null;
            String str4 = null;
            HandlerLocal handlerLocal5 = null;
            PaddingLocal paddingLocal3 = null;
            HandlerLocal handlerLocal6 = null;
            ImageWithSizeLocal imageWithSizeLocal5 = null;
            ColorAttributeLocal colorAttributeLocal6 = null;
            String strAsInterface2 = null;
            TextAttributeLocal textAttributeLocal6 = null;
            int i7 = 0;
            ImageWithSizeLocal imageWithSizeLocal6 = null;
            while (z3 == z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        textAttributeLocal6 = textAttributeLocal6;
                        z3 = false;
                        z2 = true;
                    case 0:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i7 |= 1;
                        z2 = true;
                        iAuthTabCallback2 = iAuthTabCallback2;
                        textAttributeLocal6 = textAttributeLocal6;
                        z3 = z3;
                    case 1:
                        i7 |= 2;
                        z3 = z3;
                        z2 = true;
                        iAuthTabCallback2 = iAuthTabCallback2;
                        textAttributeLocal6 = (TextAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal6);
                    case 2:
                        z = z3;
                        imageWithSizeLocal6 = (ImageWithSizeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ImageWithSizeLocal$$serializer.INSTANCE, imageWithSizeLocal6);
                        i7 |= 4;
                        z3 = z;
                        z2 = true;
                    case 3:
                        z = z3;
                        colorAttributeLocal3 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal3);
                        i7 |= 8;
                        z3 = z;
                        z2 = true;
                    case 4:
                        z = z3;
                        handlerLocal5 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, handlerLocal5);
                        i7 |= 16;
                        z3 = z;
                        z2 = true;
                    case 5:
                        z = z3;
                        str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str4);
                        i7 |= 32;
                        z3 = z;
                        z2 = true;
                    case 6:
                        z = z3;
                        textAttributeLocal5 = (TextAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal5);
                        i7 |= 64;
                        z3 = z;
                        z2 = true;
                    case 7:
                        z = z3;
                        imageWithSizeLocal5 = (ImageWithSizeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, ImageWithSizeLocal$$serializer.INSTANCE, imageWithSizeLocal5);
                        i7 |= 128;
                        z3 = z;
                        z2 = true;
                    case 8:
                        z = z3;
                        colorAttributeLocal6 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal6);
                        i7 |= 256;
                        z3 = z;
                        z2 = true;
                    case 9:
                        z = z3;
                        handlerLocal6 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, setAppxVersionInWorker.onExtraCallback, handlerLocal6);
                        i7 |= 512;
                        int i8 = IAuthTabCallbackDefault + 95;
                        onTransact = i8 % 128;
                        int i9 = i8 % 2;
                        z3 = z;
                        z2 = true;
                    case 10:
                        z = z3;
                        paddingLocal3 = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, PaddingLocal$$serializer.INSTANCE, paddingLocal3);
                        i7 |= 1024;
                        z3 = z;
                        z2 = true;
                    case 11:
                        z = z3;
                        iAuthTabCallback2 = (HomeFooterLocal.IAuthTabCallback) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 11, (jp) lazyArrOnWarmupCompleted[11].getValue(), iAuthTabCallback2);
                        i7 |= 2048;
                        z3 = z;
                        z2 = true;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            iAuthTabCallback = iAuthTabCallback2;
            textAttributeLocal = textAttributeLocal5;
            str = str4;
            handlerLocal = handlerLocal5;
            i = i7;
            paddingLocal = paddingLocal3;
            handlerLocal2 = handlerLocal6;
            imageWithSizeLocal = imageWithSizeLocal5;
            colorAttributeLocal = colorAttributeLocal6;
            colorAttributeLocal2 = colorAttributeLocal3;
            imageWithSizeLocal2 = imageWithSizeLocal6;
            str2 = strAsInterface2;
            textAttributeLocal2 = textAttributeLocal6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeFooterLocal(i, str2, textAttributeLocal2, imageWithSizeLocal2, colorAttributeLocal2, handlerLocal, str, textAttributeLocal, imageWithSizeLocal, colorAttributeLocal, handlerLocal2, paddingLocal, iAuthTabCallback, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m377deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        HomeFooterLocal homeFooterLocalDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 62 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 121;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return homeFooterLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeFooterLocal homeFooterLocal) {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeFooterLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeFooterLocal.onExtraCallback(homeFooterLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackDefault + 71;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeFooterLocal) obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 105;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackDefault + 37;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (true) {
            obj = null;
            if (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult >= length3) {
                break;
            }
            int i4 = $11 + 31;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), (Process.myPid() >> 22) + 43, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49122), 43 - ((byte) KeyEvent.getModifierMetaStateMask()), View.MeasureSpec.getSize(0) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 23972), 51 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 22939 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 29, 12577 - ExpandableListView.getPackedPositionType(0L), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            i2 = 2;
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
        String str = new String(cArr6);
        int i6 = $11 + 19;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = -2602449571285931525L;
        onExtraCallbackWithResult = -1776194565;
        onWarmupCompleted = (char) 27643;
    }
}
