package im.toss.features.launcher.data.model;

import im.toss.features.home.core.remote.request.hideamount.HideAmountRequest;
import im.toss.features.home.core.remote.request.hideamount.HideAmountRequest$$serializer;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LauncherHomeOverviewRequest$$serializer implements aeu2<LauncherHomeOverviewRequest> {
    public static final int $stable;
    public static final LauncherHomeOverviewRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        LauncherHomeOverviewRequest$$serializer launcherHomeOverviewRequest$$serializer = new LauncherHomeOverviewRequest$$serializer();
        INSTANCE = launcherHomeOverviewRequest$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.launcher.data.model.LauncherHomeOverviewRequest", launcherHomeOverviewRequest$$serializer, 7);
        setanimationsloop.onWarmupCompleted("schemeParams", true);
        setanimationsloop.onWarmupCompleted("hideAmount", false);
        setanimationsloop.onWarmupCompleted("isScreenReaderEnabled", false);
        setanimationsloop.onWarmupCompleted("timeZone", false);
        setanimationsloop.onWarmupCompleted("isDarkMode", false);
        setanimationsloop.onWarmupCompleted("initialState", true);
        setanimationsloop.onWarmupCompleted("currentState", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 105;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private LauncherHomeOverviewRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallback = LauncherHomeOverviewRequest.onExtraCallback();
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        KSerializer<?>[] kSerializerArr = {lazyArrOnExtraCallback[0].getValue(), HideAmountRequest$$serializer.INSTANCE, getbgcolor, getWriggleLayout.onNavigationEvent, getbgcolor, sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[5].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[6].getValue())};
        int i4 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final LauncherHomeOverviewRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Map map;
        boolean zOnExtraCallbackWithResult;
        boolean zOnExtraCallbackWithResult2;
        Map map2;
        Map map3;
        int i;
        String str;
        HideAmountRequest hideAmountRequest;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i3 % 128;
        HideAmountRequest hideAmountRequest2 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            LauncherHomeOverviewRequest.onExtraCallback();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = LauncherHomeOverviewRequest.onExtraCallback();
        if (!ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            String strAsInterface = null;
            map3 = null;
            map2 = null;
            map = null;
            boolean z = true;
            i = 0;
            zOnExtraCallbackWithResult2 = false;
            zOnExtraCallbackWithResult = false;
            while (z) {
                int i4 = onExtraCallbackWithResult + 35;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        map = (Map) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), map);
                        i |= 1;
                        break;
                    case 1:
                        hideAmountRequest2 = (HideAmountRequest) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 1, HideAmountRequest$$serializer.INSTANCE, hideAmountRequest2);
                        i |= 2;
                        break;
                    case 2:
                        zOnExtraCallbackWithResult = ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        strAsInterface = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        map2 = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrOnExtraCallback[5].getValue(), map2);
                        i |= 32;
                        break;
                    case 6:
                        map3 = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArrOnExtraCallback[6].getValue(), map3);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            hideAmountRequest = hideAmountRequest2;
            str = strAsInterface;
        } else {
            map = (Map) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), (Object) null);
            HideAmountRequest hideAmountRequest3 = (HideAmountRequest) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 1, HideAmountRequest$$serializer.INSTANCE, (Object) null);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2);
            String strAsInterface2 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 3);
            zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 4);
            map2 = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrOnExtraCallback[5].getValue(), (Object) null);
            map3 = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArrOnExtraCallback[6].getValue(), (Object) null);
            i = 127;
            str = strAsInterface2;
            hideAmountRequest = hideAmountRequest3;
        }
        Map map4 = map2;
        Map map5 = map;
        int i6 = i;
        boolean z2 = zOnExtraCallbackWithResult2;
        boolean z3 = zOnExtraCallbackWithResult;
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new LauncherHomeOverviewRequest(i6, map5, hideAmountRequest, z3, str, z2, map4, map3, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m640deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LauncherHomeOverviewRequest launcherHomeOverviewRequest) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(launcherHomeOverviewRequest, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            LauncherHomeOverviewRequest.onExtraCallback(launcherHomeOverviewRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(launcherHomeOverviewRequest, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        LauncherHomeOverviewRequest.onExtraCallback(launcherHomeOverviewRequest, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LauncherHomeOverviewRequest) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
