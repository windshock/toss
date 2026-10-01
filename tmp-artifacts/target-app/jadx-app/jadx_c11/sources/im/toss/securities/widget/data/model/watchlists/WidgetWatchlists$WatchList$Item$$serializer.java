package im.toss.securities.widget.data.model.watchlists;

import im.toss.securities.core.router.spec.TossSecRoute;
import im.toss.securities.widget.data.model.watchlists.WidgetWatchlists;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class WidgetWatchlists$WatchList$Item$$serializer implements aeu2<WidgetWatchlists.WatchList.Item> {
    public static final WidgetWatchlists$WatchList$Item$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 23;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 1;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        WidgetWatchlists$WatchList$Item$$serializer widgetWatchlists$WatchList$Item$$serializer = new WidgetWatchlists$WatchList$Item$$serializer();
        INSTANCE = widgetWatchlists$WatchList$Item$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.widget.data.model.watchlists.WidgetWatchlists.WatchList.Item", widgetWatchlists$WatchList$Item$$serializer, 5);
        setanimationsloop.onWarmupCompleted("itemType", true);
        setanimationsloop.onWarmupCompleted("assetType", true);
        setanimationsloop.onWarmupCompleted("id", true);
        setanimationsloop.onWarmupCompleted(TossSecRoute.EarningCallDetail.PARAM_PRODUCT_CODE, false);
        setanimationsloop.onWarmupCompleted("productName", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 81;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private WidgetWatchlists$WatchList$Item$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(oty1.onExtraCallback), kSerializer, sp.IAuthTabCallback(kSerializer)};
        int i4 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final WidgetWatchlists.WatchList.Item deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        Long l;
        String str;
        String str2;
        String str3;
        String str4;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        boolean z = false;
        int i3 = 1;
        Long l2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            Long l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, oty1.onExtraCallback, (Object) null);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            l = l3;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            str2 = strAsInterface;
            i = 31;
            str4 = str5;
            str3 = str6;
        } else {
            int i4 = 0;
            boolean z2 = true;
            String str7 = null;
            String strAsInterface2 = null;
            String str8 = null;
            String str9 = null;
            while (z2) {
                int i5 = onExtraCallbackWithResult + 55;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z2 = z;
                } else if (iOnNavigationEvent == 0) {
                    str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str9);
                    i4 |= 1;
                    int i7 = onExtraCallbackWithResult + 59;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    z = false;
                } else if (iOnNavigationEvent != i3) {
                    if (iOnNavigationEvent != 2) {
                        int i9 = onWarmupCompleted;
                        int i10 = i9 + 91;
                        onExtraCallbackWithResult = i10 % 128;
                        if (i10 % 2 != 0 ? iOnNavigationEvent == 3 : iOnNavigationEvent == 5) {
                            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                            i4 |= 8;
                        } else {
                            int i11 = i9 + 41;
                            onExtraCallbackWithResult = i11 % 128;
                            if (i11 % 2 == 0) {
                                if (iOnNavigationEvent != 5) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str7);
                                i4 |= 16;
                                int i12 = onWarmupCompleted + 1;
                                onExtraCallbackWithResult = i12 % 128;
                                int i13 = i12 % 2;
                            } else {
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str7);
                                i4 |= 16;
                                int i122 = onWarmupCompleted + 1;
                                onExtraCallbackWithResult = i122 % 128;
                                int i132 = i122 % 2;
                            }
                        }
                    } else {
                        l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, oty1.onExtraCallback, l2);
                        i4 |= 4;
                    }
                    z = false;
                    i3 = 1;
                } else {
                    i3 = 1;
                    str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str8);
                    i4 |= 2;
                    z = false;
                }
            }
            i = i4;
            l = l2;
            str = str7;
            str2 = strAsInterface2;
            str3 = str8;
            str4 = str9;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new WidgetWatchlists.WatchList.Item(i, str4, str3, l, str2, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m63deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        WidgetWatchlists.WatchList.Item itemDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return itemDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull WidgetWatchlists.WatchList.Item item) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(item, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            WidgetWatchlists.WatchList.Item.onExtraCallbackWithResult(item, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(item, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        WidgetWatchlists.WatchList.Item.onExtraCallbackWithResult(item, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (WidgetWatchlists.WatchList.Item) obj);
        int i4 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
