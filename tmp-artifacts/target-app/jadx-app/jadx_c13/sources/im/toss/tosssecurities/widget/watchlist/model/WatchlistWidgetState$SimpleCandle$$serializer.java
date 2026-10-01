package im.toss.tosssecurities.widget.watchlist.model;

import im.toss.tosssecurities.core.base.model.SessionType;
import im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
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
import org.opencv.imgproc.Imgproc;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class WatchlistWidgetState$SimpleCandle$$serializer implements aeu2<WatchlistWidgetState.SimpleCandle> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final WatchlistWidgetState$SimpleCandle$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 5;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 65;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        WatchlistWidgetState$SimpleCandle$$serializer watchlistWidgetState$SimpleCandle$$serializer = new WatchlistWidgetState$SimpleCandle$$serializer();
        INSTANCE = watchlistWidgetState$SimpleCandle$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState.SimpleCandle", watchlistWidgetState$SimpleCandle$$serializer, 4);
        setanimationsloop.onWarmupCompleted("startDate", false);
        setanimationsloop.onWarmupCompleted("endDate", false);
        setanimationsloop.onWarmupCompleted("price", false);
        setanimationsloop.onWarmupCompleted("sessionType", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 15;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 19 / 0;
        }
    }

    private WatchlistWidgetState$SimpleCandle$$serializer() {
    }

    @Override // o.aeu2
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback((KSerializer) WatchlistWidgetState.SimpleCandle.IAuthTabCallback()[3].getValue());
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, setVideoListener.onWarmupCompleted, kSerializerIAuthTabCallback};
        int i4 = onNavigationEvent + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    @Override // o.jp
    public final WatchlistWidgetState.SimpleCandle deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        SessionType sessionType;
        String str2;
        double d;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = WatchlistWidgetState.SimpleCandle.IAuthTabCallback();
        int i3 = 0;
        String strAsInterface = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            double dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
            sessionType = (SessionType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, (jp) lazyArrIAuthTabCallback[3].getValue(), null);
            i = 15;
            str2 = strAsInterface2;
            str = strAsInterface3;
            d = dIAuthTabCallback;
        } else {
            int i4 = 0;
            int i5 = 1;
            double dIAuthTabCallback2 = 0.0d;
            SessionType sessionType2 = null;
            String strAsInterface4 = null;
            while (i5 != 0) {
                int i6 = onNavigationEvent + 49;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    i5 = i3;
                } else if (iOnNavigationEvent != 0) {
                    int i8 = onExtraCallback + 123;
                    int i9 = i8 % 128;
                    onNavigationEvent = i9;
                    if (i8 % 2 != 0 ? iOnNavigationEvent == 1 : iOnNavigationEvent == 0) {
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i4 |= 2;
                    } else {
                        int i10 = i9 + 59;
                        onExtraCallback = i10 % 128;
                        if (i10 % 2 == 0 ? iOnNavigationEvent == 2 : iOnNavigationEvent == 3) {
                            dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
                            i4 |= 4;
                            int i11 = onNavigationEvent + 11;
                            onExtraCallback = i11 % 128;
                            int i12 = i11 % 2;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            sessionType2 = (SessionType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, (jp) lazyArrIAuthTabCallback[3].getValue(), sessionType2);
                            i4 |= 8;
                        }
                    }
                    i3 = 0;
                } else {
                    strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i3);
                    i4 |= 1;
                }
            }
            i = i4;
            str = strAsInterface;
            sessionType = sessionType2;
            str2 = strAsInterface4;
            d = dIAuthTabCallback2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new WatchlistWidgetState.SimpleCandle(i, str2, str, d, sessionType, (okycx) null);
    }

    @Override // o.jp
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        WatchlistWidgetState.SimpleCandle simpleCandleDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return simpleCandleDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull WatchlistWidgetState.SimpleCandle simpleCandle) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(simpleCandle, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        WatchlistWidgetState.SimpleCandle.onWarmupCompleted(simpleCandle, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 37;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.py
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (WatchlistWidgetState.SimpleCandle) obj);
        int i4 = onExtraCallback + 53;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.aeu2
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 67;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
