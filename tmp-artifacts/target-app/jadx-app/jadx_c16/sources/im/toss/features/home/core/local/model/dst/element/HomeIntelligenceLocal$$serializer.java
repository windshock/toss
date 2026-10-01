package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.HomeIntelligenceLocal;
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
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.ExecutorBinder;
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
public final /* synthetic */ class HomeIntelligenceLocal$$serializer implements aeu2<HomeIntelligenceLocal> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 0;
    public static final HomeIntelligenceLocal$$serializer INSTANCE;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallback();
        HomeIntelligenceLocal$$serializer homeIntelligenceLocal$$serializer = new HomeIntelligenceLocal$$serializer();
        INSTANCE = homeIntelligenceLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.HomeIntelligenceLocal", homeIntelligenceLocal$$serializer, 13);
        Object[] objArr = new Object[1];
        a(new char[]{40247, 19357, 25970, 50575, 30488, 32592}, 4 - ExpandableListView.getPackedPositionChild(0L), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("titleAlt", false);
        setanimationsloop.onWarmupCompleted("logTitleAlt", false);
        Object[] objArr2 = new Object[1];
        a(new char[]{52455, 42073, 60977, 6196, 8638, 8735, 10048, 28267, 53183, 32777, 16368, 41833}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("descriptionAlt", false);
        setanimationsloop.onWarmupCompleted("logDescriptionAlt", false);
        setanimationsloop.onWarmupCompleted("brandName", false);
        setanimationsloop.onWarmupCompleted("brandNameAlt", false);
        setanimationsloop.onWarmupCompleted("logBrandNameAlt", false);
        setanimationsloop.onWarmupCompleted("image", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("closeHandler", false);
        setanimationsloop.onWarmupCompleted("arrow", false);
        descriptor = setanimationsloop;
        int i = asInterface + 59;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private HomeIntelligenceLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback5 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback6 = sp.IAuthTabCallback(ExecutorBinder.IAuthTabCallback);
        KSerializer<?> kSerializer2 = setAppxVersionInWorker.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializer, kSerializerIAuthTabCallback, kSerializer, kSerializer, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, kSerializerIAuthTabCallback4, kSerializerIAuthTabCallback5, kSerializerIAuthTabCallback6, kSerializer2, sp.IAuthTabCallback(kSerializer2), getBgColor.IAuthTabCallback};
        int i4 = onTransact + 121;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeIntelligenceLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        HandlerLocal handlerLocal;
        HomeIntelligenceLocal.Image image;
        HandlerLocal handlerLocal2;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean zOnExtraCallbackWithResult;
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 10;
        int i5 = 9;
        boolean z = true;
        String str10 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i6 = onTransact + 117;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            String str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            String str13 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            String str14 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, (Object) null);
            String str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getwrigglelayout, (Object) null);
            HomeIntelligenceLocal.Image image2 = (HomeIntelligenceLocal.Image) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, ExecutorBinder.IAuthTabCallback, (Object) null);
            setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
            HandlerLocal handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 10, setappxversioninworker, (Object) null);
            str7 = str11;
            str9 = strAsInterface;
            handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, setappxversioninworker, (Object) null);
            str8 = strAsInterface2;
            handlerLocal = handlerLocal3;
            image = image2;
            str2 = str14;
            str4 = str13;
            str3 = str12;
            str5 = strAsInterface3;
            str = str15;
            str6 = strAsInterface4;
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12);
            i = 8191;
        } else {
            String str16 = null;
            String str17 = null;
            String str18 = null;
            HandlerLocal handlerLocal4 = null;
            HomeIntelligenceLocal.Image image3 = null;
            String strAsInterface5 = null;
            String strAsInterface6 = null;
            String str19 = null;
            String strAsInterface7 = null;
            String strAsInterface8 = null;
            int i8 = 0;
            boolean zOnExtraCallbackWithResult2 = false;
            boolean z2 = true;
            HandlerLocal handlerLocal5 = null;
            while (z2 == z) {
                int i9 = onTransact + 83;
                IAuthTabCallbackStub = i9 % 128;
                int i10 = i9 % i2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z2 = false;
                        i2 = 2;
                        i5 = 9;
                        z = true;
                    case 0:
                        strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i8 |= 1;
                        z = true;
                        str19 = str19;
                        i2 = 2;
                        i4 = 10;
                        i5 = 9;
                    case 1:
                        strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i8 |= 2;
                        z = true;
                        i4 = 10;
                        i5 = 9;
                    case 2:
                        str19 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, getWriggleLayout.onNavigationEvent, str19);
                        i8 |= 4;
                        i4 = 10;
                        i5 = 9;
                        z = true;
                    case 3:
                        strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i8 |= 8;
                        i4 = 10;
                        i5 = 9;
                        z = true;
                    case 4:
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i8 |= 16;
                        i4 = 10;
                        i5 = 9;
                        z = true;
                    case 5:
                        str17 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str17);
                        i8 |= 32;
                        i4 = 10;
                        i5 = 9;
                        z = true;
                    case 6:
                        str18 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str18);
                        i8 |= 64;
                        i4 = 10;
                        i5 = 9;
                        z = true;
                    case 7:
                        str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, str10);
                        i8 |= 128;
                        i4 = 10;
                        z = true;
                    case 8:
                        str16 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, str16);
                        i8 |= 256;
                        int i11 = onTransact + 51;
                        IAuthTabCallbackStub = i11 % 128;
                        int i12 = i11 % i2;
                        i4 = 10;
                        z = true;
                    case 9:
                        image3 = (HomeIntelligenceLocal.Image) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, ExecutorBinder.IAuthTabCallback, image3);
                        i8 |= 512;
                        z = true;
                    case 10:
                        handlerLocal4 = (HandlerLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i4, setAppxVersionInWorker.onExtraCallback, handlerLocal4);
                        i8 |= 1024;
                        z = true;
                    case 11:
                        handlerLocal5 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, setAppxVersionInWorker.onExtraCallback, handlerLocal5);
                        i8 |= 2048;
                        z = true;
                    case 12:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12);
                        i8 |= 4096;
                        z = true;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = str16;
            str2 = str10;
            str3 = str17;
            i = i8;
            str4 = str18;
            handlerLocal = handlerLocal4;
            image = image3;
            handlerLocal2 = handlerLocal5;
            str5 = strAsInterface5;
            str6 = strAsInterface6;
            str7 = str19;
            str8 = strAsInterface7;
            str9 = strAsInterface8;
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeIntelligenceLocal(i, str9, str8, str7, str5, str6, str3, str4, str2, str, image, handlerLocal, handlerLocal2, zOnExtraCallbackWithResult, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m385deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeIntelligenceLocal homeIntelligenceLocal) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeIntelligenceLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeIntelligenceLocal.onExtraCallback(homeIntelligenceLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onTransact + 35;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeIntelligenceLocal) obj);
        int i4 = onTransact + 105;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallbackStub + 85;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 21;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", i3, i3);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 10;
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, packedPositionGroup, fadingEdgeLength, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), View.MeasureSpec.getSize(0) + 10, Color.rgb(0, 0, 0) + 16789650, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i10 = $11 + 81;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16015 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 14 - KeyEvent.getDeadChar(0, 0), 19901 - Color.argb(0, 0, 0, 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i12 = $11 + 19;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        objArr[0] = str;
    }

    static void IAuthTabCallback() {
        onNavigationEvent = (char) 3597;
        IAuthTabCallback = (char) 27257;
        onWarmupCompleted = (char) 13061;
        onExtraCallbackWithResult = (char) 64515;
    }
}
