package im.toss.features.home.core.remote.request;

import im.toss.features.home.core.remote.request.HomeOverviewReq;
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
public final /* synthetic */ class HomeOverviewReq$$serializer implements aeu2<HomeOverviewReq> {
    private static int IAuthTabCallback = 1;
    public static final HomeOverviewReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 97;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        HomeOverviewReq$$serializer homeOverviewReq$$serializer = new HomeOverviewReq$$serializer();
        INSTANCE = homeOverviewReq$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.request.HomeOverviewReq", homeOverviewReq$$serializer, 10);
        setanimationsloop.onWarmupCompleted("schemeParams", false);
        setanimationsloop.onWarmupCompleted("hideAmount", false);
        setanimationsloop.onWarmupCompleted("timeZone", false);
        setanimationsloop.onWarmupCompleted("paginationId", true);
        setanimationsloop.onWarmupCompleted("initialState", true);
        setanimationsloop.onWarmupCompleted("currentState", true);
        setanimationsloop.onWarmupCompleted("advertisement", false);
        setanimationsloop.onWarmupCompleted("isScreenReaderEnabled", false);
        setanimationsloop.onWarmupCompleted("isDarkMode", false);
        setanimationsloop.onWarmupCompleted("isFinanceHome", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 9;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private HomeOverviewReq$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallback = HomeOverviewReq.IAuthTabCallback();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        KSerializer<?>[] kSerializerArr = {lazyArrIAuthTabCallback[0].getValue(), HideAmountRequest$$serializer.INSTANCE, getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[4].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[5].getValue()), HomeOverviewReq$TossstreamAdvertiseRequest$$serializer.INSTANCE, getbgcolor, getbgcolor, getbgcolor};
        int i4 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00a9 A[PHI: r0 r2 r6
      0x00a9: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v8 o.yw) binds: [B:8:0x0044, B:5:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0044, B:5:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r6v10 kotlin.Lazy[]) = (r6v1 kotlin.Lazy[]), (r6v12 kotlin.Lazy[]) binds: [B:8:0x0044, B:5:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046 A[PHI: r0 r2 r6
      0x0046: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v8 o.yw) binds: [B:8:0x0044, B:5:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0046: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0044, B:5:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0046: PHI (r6v2 kotlin.Lazy[]) = (r6v1 kotlin.Lazy[]), (r6v12 kotlin.Lazy[]) binds: [B:8:0x0044, B:5:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HomeOverviewReq deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrIAuthTabCallback;
        int i;
        HideAmountRequest hideAmountRequest;
        boolean zOnExtraCallbackWithResult;
        Map map;
        boolean z;
        Map map2;
        String str;
        String str2;
        boolean zOnExtraCallbackWithResult2;
        Map map3;
        char c;
        char c2;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i4 % 128;
        int i5 = 9;
        int i6 = 6;
        int i7 = 8;
        int i8 = 7;
        HomeOverviewReq.TossstreamAdvertiseRequest tossstreamAdvertiseRequest = null;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrIAuthTabCallback = HomeOverviewReq.IAuthTabCallback();
            if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
                Map map4 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
                HideAmountRequest hideAmountRequest2 = (HideAmountRequest) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, HideAmountRequest$$serializer.INSTANCE, (Object) null);
                String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, (Object) null);
                Map map5 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArrIAuthTabCallback[4].getValue(), (Object) null);
                Map map6 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrIAuthTabCallback[5].getValue(), (Object) null);
                HomeOverviewReq.TossstreamAdvertiseRequest tossstreamAdvertiseRequest2 = (HomeOverviewReq.TossstreamAdvertiseRequest) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, HomeOverviewReq$TossstreamAdvertiseRequest$$serializer.INSTANCE, (Object) null);
                boolean zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7);
                i = 1023;
                tossstreamAdvertiseRequest = tossstreamAdvertiseRequest2;
                hideAmountRequest = hideAmountRequest2;
                zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8);
                map = map5;
                z = zOnExtraCallbackWithResult3;
                map2 = map6;
                str = str3;
                str2 = strAsInterface;
                zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9);
                map3 = map4;
            } else {
                boolean z2 = true;
                int i9 = 0;
                boolean zOnExtraCallbackWithResult4 = false;
                boolean zOnExtraCallbackWithResult5 = false;
                boolean zOnExtraCallbackWithResult6 = false;
                Map map7 = null;
                String str4 = null;
                String strAsInterface2 = null;
                Map map8 = null;
                HideAmountRequest hideAmountRequest3 = null;
                Map map9 = null;
                while (z2) {
                    int i10 = onExtraCallbackWithResult + 7;
                    onNavigationEvent = i10 % 128;
                    if (i10 % i2 == 0) {
                        ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    switch (iOnNavigationEvent) {
                        case -1:
                            c = 4;
                            c2 = 5;
                            z2 = false;
                            i2 = 2;
                            i5 = 9;
                            i6 = 6;
                            i8 = 7;
                        case 0:
                            c = 4;
                            c2 = 5;
                            map9 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), map9);
                            i9 |= 1;
                            i2 = 2;
                            i5 = 9;
                            i6 = 6;
                            i7 = 8;
                            i8 = 7;
                        case 1:
                            c = 4;
                            c2 = 5;
                            hideAmountRequest3 = (HideAmountRequest) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, HideAmountRequest$$serializer.INSTANCE, hideAmountRequest3);
                            i9 |= 2;
                            i2 = 2;
                            i5 = 9;
                            i6 = 6;
                            i7 = 8;
                        case 2:
                            c = 4;
                            c2 = 5;
                            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i2);
                            i9 |= 4;
                            i5 = 9;
                            i6 = 6;
                            i7 = 8;
                        case 3:
                            c = 4;
                            c2 = 5;
                            str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str4);
                            i9 |= 8;
                            i5 = 9;
                            i6 = 6;
                            i7 = 8;
                        case 4:
                            c = 4;
                            c2 = 5;
                            map8 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArrIAuthTabCallback[4].getValue(), map8);
                            i9 |= 16;
                            i5 = 9;
                            i6 = 6;
                        case 5:
                            map7 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrIAuthTabCallback[5].getValue(), map7);
                            i9 |= 32;
                        case 6:
                            tossstreamAdvertiseRequest = (HomeOverviewReq.TossstreamAdvertiseRequest) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i6, HomeOverviewReq$TossstreamAdvertiseRequest$$serializer.INSTANCE, tossstreamAdvertiseRequest);
                            i9 |= 64;
                        case 7:
                            zOnExtraCallbackWithResult6 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i8);
                            i9 |= 128;
                        case 8:
                            zOnExtraCallbackWithResult5 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i7);
                            i9 |= 256;
                        case 9:
                            zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5);
                            i9 |= 512;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
                map = map8;
                i = i9;
                map3 = map9;
                map2 = map7;
                str = str4;
                str2 = strAsInterface2;
                zOnExtraCallbackWithResult2 = zOnExtraCallbackWithResult4;
                zOnExtraCallbackWithResult = zOnExtraCallbackWithResult5;
                z = zOnExtraCallbackWithResult6;
                hideAmountRequest = hideAmountRequest3;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrIAuthTabCallback = HomeOverviewReq.IAuthTabCallback();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeOverviewReq(i, map3, hideAmountRequest, str2, str, map, map2, tossstreamAdvertiseRequest, z, zOnExtraCallbackWithResult, zOnExtraCallbackWithResult2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m607deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        HomeOverviewReq homeOverviewReqDeserialize = deserialize(decoder);
        int i3 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return homeOverviewReqDeserialize;
        }
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeOverviewReq homeOverviewReq) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeOverviewReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeOverviewReq.onNavigationEvent(homeOverviewReq, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeOverviewReq) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
