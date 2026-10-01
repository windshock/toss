package im.toss.features.home.core.local.model.dst.element;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.element.HomeIntelligenceHeroV2Local;
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
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeIntelligenceHeroV2Local$$serializer implements aeu2<HomeIntelligenceHeroV2Local> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    public static final HomeIntelligenceHeroV2Local$$serializer INSTANCE;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 121;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 55;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
        }
        return serialDescriptor;
    }

    static {
        onWarmupCompleted();
        HomeIntelligenceHeroV2Local$$serializer homeIntelligenceHeroV2Local$$serializer = new HomeIntelligenceHeroV2Local$$serializer();
        INSTANCE = homeIntelligenceHeroV2Local$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.HomeIntelligenceHeroV2Local", homeIntelligenceHeroV2Local$$serializer, 5);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("closeHandler", false);
        setanimationsloop.onWarmupCompleted("image", false);
        Object[] objArr = new Object[1];
        a(new char[]{47346, 61579, 16395, 32128, 40268, 48442}, (ViewConfiguration.getPressedStateDuration() >> 16) + 5, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a(new char[]{28040, 60519, 11563, 6007, 6788, 12214}, 6 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onTransact + 75;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 12 / 0;
        }
    }

    private HomeIntelligenceHeroV2Local$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(setappxversioninworker), sp.IAuthTabCallback(setappxversioninworker), HomeIntelligenceHeroV2Local$Image$$serializer.INSTANCE, HomeIntelligenceHeroV2Local$Title$$serializer.INSTANCE, HomeIntelligenceHeroV2Local$Button$$serializer.INSTANCE};
        int i4 = asBinder + 101;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeIntelligenceHeroV2Local deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        HomeIntelligenceHeroV2Local.Title title;
        HomeIntelligenceHeroV2Local.Button button;
        HomeIntelligenceHeroV2Local.Image image;
        HandlerLocal handlerLocal;
        HandlerLocal handlerLocal2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        boolean z = false;
        int i3 = 1;
        HomeIntelligenceHeroV2Local.Title title2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
            HandlerLocal handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, setappxversioninworker, (Object) null);
            HandlerLocal handlerLocal4 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setappxversioninworker, (Object) null);
            HomeIntelligenceHeroV2Local.Image image2 = (HomeIntelligenceHeroV2Local.Image) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, HomeIntelligenceHeroV2Local$Image$$serializer.INSTANCE, (Object) null);
            HomeIntelligenceHeroV2Local.Title title3 = (HomeIntelligenceHeroV2Local.Title) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, HomeIntelligenceHeroV2Local$Title$$serializer.INSTANCE, (Object) null);
            image = image2;
            handlerLocal = handlerLocal4;
            button = (HomeIntelligenceHeroV2Local.Button) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, HomeIntelligenceHeroV2Local$Button$$serializer.INSTANCE, (Object) null);
            title = title3;
            handlerLocal2 = handlerLocal3;
            i = 31;
        } else {
            int i4 = 0;
            boolean z2 = true;
            HomeIntelligenceHeroV2Local.Button button2 = null;
            HomeIntelligenceHeroV2Local.Image image3 = null;
            HandlerLocal handlerLocal5 = null;
            HandlerLocal handlerLocal6 = null;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z2 = z;
                } else if (iOnNavigationEvent == 0) {
                    handlerLocal6 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, setAppxVersionInWorker.onExtraCallback, handlerLocal6);
                    i4 |= 1;
                    int i5 = asInterface + 47;
                    asBinder = i5 % 128;
                    int i6 = i5 % 2;
                    z = false;
                } else if (iOnNavigationEvent != i3) {
                    int i7 = asInterface;
                    int i8 = i7 + 95;
                    asBinder = i8 % 128;
                    int i9 = i8 % 2;
                    if (iOnNavigationEvent != 2) {
                        int i10 = i7 + 67;
                        asBinder = i10 % 128;
                        if (i10 % 2 == 0 ? iOnNavigationEvent == 3 : iOnNavigationEvent == 3) {
                            title2 = (HomeIntelligenceHeroV2Local.Title) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, HomeIntelligenceHeroV2Local$Title$$serializer.INSTANCE, title2);
                            i4 |= 8;
                        } else {
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            button2 = (HomeIntelligenceHeroV2Local.Button) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, HomeIntelligenceHeroV2Local$Button$$serializer.INSTANCE, button2);
                            i4 |= 16;
                        }
                    } else {
                        image3 = (HomeIntelligenceHeroV2Local.Image) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, HomeIntelligenceHeroV2Local$Image$$serializer.INSTANCE, image3);
                        i4 |= 4;
                    }
                    z = false;
                    i3 = 1;
                } else {
                    i3 = 1;
                    handlerLocal5 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, setAppxVersionInWorker.onExtraCallback, handlerLocal5);
                    i4 |= 2;
                    z = false;
                }
            }
            i = i4;
            title = title2;
            button = button2;
            image = image3;
            handlerLocal = handlerLocal5;
            handlerLocal2 = handlerLocal6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeIntelligenceHeroV2Local(i, handlerLocal2, handlerLocal, image, title, button, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m381deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        HomeIntelligenceHeroV2Local homeIntelligenceHeroV2LocalDeserialize = deserialize(decoder);
        int i4 = asInterface + 43;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return homeIntelligenceHeroV2LocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeIntelligenceHeroV2Local homeIntelligenceHeroV2Local) {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(homeIntelligenceHeroV2Local, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HomeIntelligenceHeroV2Local.onWarmupCompleted(homeIntelligenceHeroV2Local, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeIntelligenceHeroV2Local, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HomeIntelligenceHeroV2Local.onWarmupCompleted(homeIntelligenceHeroV2Local, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = asInterface + 53;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeIntelligenceHeroV2Local) obj);
        int i4 = asBinder + 61;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = asInterface + 89;
        asBinder = i3 % 128;
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
            int i4 = $10 + 11;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 21;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallback);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int keyRepeatTimeout = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int edgeSlop = 12434 - (ViewConfiguration.getEdgeSlop() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(longPressTimeout, keyRepeatTimeout, edgeSlop, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 9 - TextUtils.lastIndexOf("", '0', 0), 12434 - (Process.myPid() >> 22), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 16014), 13 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = (char) 11661;
        onNavigationEvent = (char) 33904;
        onExtraCallbackWithResult = (char) 31405;
        onExtraCallback = (char) 10628;
    }
}
