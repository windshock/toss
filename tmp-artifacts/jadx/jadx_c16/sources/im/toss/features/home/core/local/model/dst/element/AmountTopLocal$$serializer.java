package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.AmountTopLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal$$serializer;
import im.toss.features.home.core.local.model.dst.widget.ImageAttributeLocal;
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
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.aeu2;
import o.getServiceBeans;
import o.getSystemInfoExtension;
import o.isWaitpageReady4Dispatch;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.sp;
import o.startPage;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AmountTopLocal$$serializer implements aeu2<AmountTopLocal> {
    private static int IAuthTabCallback;
    public static final AmountTopLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static char onWarmupCompleted;
    private static final byte[] $$a = {9, 8, 112, 107};
    private static final int $$b = 72;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private static int onNavigationEvent = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, byte b) {
        int i2;
        int i3 = (s * 2) + 4;
        int i4 = i * 3;
        byte[] bArr = $$a;
        int i5 = b + 109;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            i5 = i6;
            i5 += i7;
            i3++;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i3];
            i5 += i7;
            i3++;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 45;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return serialDescriptor;
    }

    static {
        IAuthTabCallback = 1;
        onNavigationEvent();
        AmountTopLocal$$serializer amountTopLocal$$serializer = new AmountTopLocal$$serializer();
        INSTANCE = amountTopLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.AmountTopLocal", amountTopLocal$$serializer, 12);
        Object[] objArr = new Object[1];
        a((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), MotionEvent.axisFromString("") + 1, new char[]{35172, 47916, 56463, 30158, 65161, 11206, 33666, 16782}, new char[]{0, 0, 0, 0}, new char[]{5232, 42678, 64462, 62774}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a((char) (5914 - View.MeasureSpec.getMode(0)), Color.rgb(0, 0, 0) - 1260545854, new char[]{25909, 'r', 17915, 39740, 49552}, new char[]{0, 0, 0, 0}, new char[]{49717, 56728, 6835, 48407}, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        Object[] objArr3 = new Object[1];
        a((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 411535661 - (ViewConfiguration.getTapTimeout() >> 16), new char[]{44961, 52956, 58627, 36761, 61478, 32352, 5653, 36553, 60272, 17234, 44792}, new char[]{0, 0, 0, 0}, new char[]{11743, 34697, 19480, 548}, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("right", false);
        setanimationsloop.onWarmupCompleted("titleRightIcon", false);
        setanimationsloop.onWarmupCompleted("paddingTop", false);
        setanimationsloop.onWarmupCompleted("paddingBottom", false);
        setanimationsloop.onWarmupCompleted("titlePadding", false);
        setanimationsloop.onWarmupCompleted("rightAlignment", false);
        setanimationsloop.onWarmupCompleted("subtitleRightIcon", false);
        setanimationsloop.onWarmupCompleted("subtitleLeftImage", false);
        setanimationsloop.onWarmupCompleted("fullTooltip", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 85;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 16 / 0;
        }
    }

    private AmountTopLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = AmountTopLocal.onNavigationEvent();
        TextAttributeLocal$.serializer serializerVar = TextAttributeLocal$.serializer.INSTANCE;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(serializerVar);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getSystemInfoExtension.IAuthTabCallback);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(serializerVar);
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(isWaitpageReady4Dispatch.onExtraCallback);
        ImageSourceLocal$Icon$$serializer imageSourceLocal$Icon$$serializer = ImageSourceLocal$Icon$$serializer.INSTANCE;
        KSerializer<?> kSerializerIAuthTabCallback5 = sp.IAuthTabCallback(imageSourceLocal$Icon$$serializer);
        KSerializer<?> kSerializerIAuthTabCallback6 = sp.IAuthTabCallback(PaddingLocal$$serializer.INSTANCE);
        KSerializer<?> kSerializerIAuthTabCallback7 = sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[8].getValue());
        KSerializer<?> kSerializerIAuthTabCallback8 = sp.IAuthTabCallback(imageSourceLocal$Icon$$serializer);
        KSerializer<?> kSerializerIAuthTabCallback9 = sp.IAuthTabCallback(startPage.onWarmupCompleted);
        KSerializer<?> kSerializerIAuthTabCallback10 = sp.IAuthTabCallback(AmountTopLocal$FullTooltipWithTarget$$serializer.INSTANCE);
        setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, kSerializerIAuthTabCallback4, kSerializerIAuthTabCallback5, setvideolistener, setvideolistener, kSerializerIAuthTabCallback6, kSerializerIAuthTabCallback7, kSerializerIAuthTabCallback8, kSerializerIAuthTabCallback9, kSerializerIAuthTabCallback10};
        int i4 = onTransact + 105;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AmountTopLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        PaddingLocal paddingLocal;
        ImageSourceLocal.Icon icon;
        ImageSourceLocal.Icon icon2;
        getServiceBeans.onTransact ontransact;
        AmountTopLocal.Right right;
        double d;
        double dIAuthTabCallback;
        ImageAttributeLocal imageAttributeLocal;
        AmountTopLocal.Title title;
        int i;
        AmountTopLocal.FullTooltipWithTarget fullTooltipWithTarget;
        TextAttributeLocal textAttributeLocal;
        TextAttributeLocal textAttributeLocal2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = AmountTopLocal.onNavigationEvent();
        int i3 = 9;
        int i4 = 7;
        int i5 = 8;
        boolean z = true;
        ImageSourceLocal.Icon icon3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i6 = IAuthTabCallbackStub + 97;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            TextAttributeLocal$.serializer serializerVar = TextAttributeLocal$.serializer.INSTANCE;
            TextAttributeLocal textAttributeLocal3 = (TextAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, serializerVar, (Object) null);
            title = (AmountTopLocal.Title) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getSystemInfoExtension.IAuthTabCallback, (Object) null);
            TextAttributeLocal textAttributeLocal4 = (TextAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, serializerVar, (Object) null);
            AmountTopLocal.Right right2 = (AmountTopLocal.Right) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, isWaitpageReady4Dispatch.onExtraCallback, (Object) null);
            ImageSourceLocal$Icon$$serializer imageSourceLocal$Icon$$serializer = ImageSourceLocal$Icon$$serializer.INSTANCE;
            ImageSourceLocal.Icon icon4 = (ImageSourceLocal.Icon) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, imageSourceLocal$Icon$$serializer, (Object) null);
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 5);
            double dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 6);
            PaddingLocal paddingLocal2 = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, PaddingLocal$$serializer.INSTANCE, (Object) null);
            getServiceBeans.onTransact ontransact2 = (getServiceBeans.onTransact) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, (jp) lazyArrOnNavigationEvent[8].getValue(), (Object) null);
            ImageSourceLocal.Icon icon5 = (ImageSourceLocal.Icon) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, imageSourceLocal$Icon$$serializer, (Object) null);
            ImageAttributeLocal imageAttributeLocal2 = (ImageAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, startPage.onWarmupCompleted, (Object) null);
            ontransact = ontransact2;
            right = right2;
            fullTooltipWithTarget = (AmountTopLocal.FullTooltipWithTarget) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, AmountTopLocal$FullTooltipWithTarget$$serializer.INSTANCE, (Object) null);
            icon = icon5;
            paddingLocal = paddingLocal2;
            d = dIAuthTabCallback2;
            icon2 = icon4;
            imageAttributeLocal = imageAttributeLocal2;
            i = 4095;
            textAttributeLocal2 = textAttributeLocal4;
            textAttributeLocal = textAttributeLocal3;
        } else {
            int i8 = IAuthTabCallbackStub + 111;
            onTransact = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 3 % 2;
            }
            ImageAttributeLocal imageAttributeLocal3 = null;
            PaddingLocal paddingLocal3 = null;
            ImageSourceLocal.Icon icon6 = null;
            getServiceBeans.onTransact ontransact3 = null;
            AmountTopLocal.FullTooltipWithTarget fullTooltipWithTarget2 = null;
            TextAttributeLocal textAttributeLocal5 = null;
            TextAttributeLocal textAttributeLocal6 = null;
            AmountTopLocal.Title title2 = null;
            int i10 = 0;
            boolean z2 = true;
            double dIAuthTabCallback3 = 0.0d;
            double dIAuthTabCallback4 = 0.0d;
            AmountTopLocal.Right right3 = null;
            while ((!z2) != z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        int i11 = IAuthTabCallbackStub + 91;
                        onTransact = i11 % 128;
                        int i12 = i11 % 2;
                        title2 = title2;
                        textAttributeLocal5 = textAttributeLocal5;
                        textAttributeLocal6 = textAttributeLocal6;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        z = true;
                        z2 = false;
                    case 0:
                        textAttributeLocal6 = (TextAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal6);
                        i10 |= 1;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        z = true;
                    case 1:
                        title2 = (AmountTopLocal.Title) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getSystemInfoExtension.IAuthTabCallback, title2);
                        i10 |= 2;
                        z = true;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                    case 2:
                        textAttributeLocal5 = (TextAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TextAttributeLocal$.serializer.INSTANCE, textAttributeLocal5);
                        i10 |= 4;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        z = true;
                    case 3:
                        right3 = (AmountTopLocal.Right) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, isWaitpageReady4Dispatch.onExtraCallback, right3);
                        i10 |= 8;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        z = true;
                    case 4:
                        icon6 = (ImageSourceLocal.Icon) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, ImageSourceLocal$Icon$$serializer.INSTANCE, icon6);
                        i10 |= 16;
                        int i13 = onTransact + 79;
                        IAuthTabCallbackStub = i13 % 128;
                        int i14 = i13 % 2;
                        i3 = 9;
                        i4 = 7;
                        z = true;
                    case 5:
                        dIAuthTabCallback4 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 5);
                        i10 |= 32;
                        i3 = 9;
                        z = true;
                    case 6:
                        dIAuthTabCallback3 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 6);
                        i10 |= 64;
                        z = true;
                    case 7:
                        paddingLocal3 = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, PaddingLocal$$serializer.INSTANCE, paddingLocal3);
                        i10 |= 128;
                        z = true;
                    case 8:
                        ontransact3 = (getServiceBeans.onTransact) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, (jp) lazyArrOnNavigationEvent[i5].getValue(), ontransact3);
                        i10 |= 256;
                        z = true;
                    case 9:
                        icon3 = (ImageSourceLocal.Icon) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, ImageSourceLocal$Icon$$serializer.INSTANCE, icon3);
                        i10 |= 512;
                        z = true;
                    case 10:
                        imageAttributeLocal3 = (ImageAttributeLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, startPage.onWarmupCompleted, imageAttributeLocal3);
                        i10 |= 1024;
                        z = true;
                    case 11:
                        fullTooltipWithTarget2 = (AmountTopLocal.FullTooltipWithTarget) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, AmountTopLocal$FullTooltipWithTarget$$serializer.INSTANCE, fullTooltipWithTarget2);
                        i10 |= 2048;
                        z = true;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            TextAttributeLocal textAttributeLocal7 = textAttributeLocal5;
            TextAttributeLocal textAttributeLocal8 = textAttributeLocal6;
            AmountTopLocal.Title title3 = title2;
            paddingLocal = paddingLocal3;
            icon = icon3;
            icon2 = icon6;
            ontransact = ontransact3;
            right = right3;
            d = dIAuthTabCallback3;
            dIAuthTabCallback = dIAuthTabCallback4;
            imageAttributeLocal = imageAttributeLocal3;
            title = title3;
            i = i10;
            fullTooltipWithTarget = fullTooltipWithTarget2;
            textAttributeLocal = textAttributeLocal8;
            textAttributeLocal2 = textAttributeLocal7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AmountTopLocal(i, textAttributeLocal, title, textAttributeLocal2, right, icon2, dIAuthTabCallback, d, paddingLocal, ontransact, icon, imageAttributeLocal, fullTooltipWithTarget, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m267deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            obj.hashCode();
            throw null;
        }
        AmountTopLocal amountTopLocalDeserialize = deserialize(decoder);
        int i3 = IAuthTabCallbackStub + 15;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return amountTopLocalDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AmountTopLocal amountTopLocal) {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(amountTopLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AmountTopLocal.onExtraCallback(amountTopLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onTransact + 103;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AmountTopLocal) obj);
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        int i5 = IAuthTabCallbackStub + 83;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $11 + 71;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                    int defaultSize = 43 - View.getDefaultSize(i4, i4);
                    int iResolveOpacity = 1451 - Drawable.resolveOpacity(i4, i4);
                    byte b = (byte) i4;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, (byte) (b2 + 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, defaultSize, iResolveOpacity, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) i4;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 49123), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 44, (ViewConfiguration.getEdgeSlop() >> 16) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), TextUtils.indexOf("", "", 0) + 50, TextUtils.indexOf((CharSequence) "", '0', 0) + 22940, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - View.MeasureSpec.getMode(0)), 29 - ExpandableListView.getPackedPositionGroup(0L), View.MeasureSpec.getSize(0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            i2 = 2;
                            i4 = 0;
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
        int i7 = $11 + 17;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = 7798559133331975163L;
        onExtraCallback = 1662250680;
        onWarmupCompleted = (char) 27643;
    }
}
