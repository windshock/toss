package im.toss.features.home.core.remote.model;

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
public final /* synthetic */ class DstAccountDetailRequest$$serializer implements aeu2<DstAccountDetailRequest> {
    public static final DstAccountDetailRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        DstAccountDetailRequest$$serializer dstAccountDetailRequest$$serializer = new DstAccountDetailRequest$$serializer();
        INSTANCE = dstAccountDetailRequest$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.DstAccountDetailRequest", dstAccountDetailRequest$$serializer, 5);
        setanimationsloop.onWarmupCompleted("transactionFilterKey", true);
        setanimationsloop.onWarmupCompleted("paginationId", true);
        setanimationsloop.onWarmupCompleted("initialState", true);
        setanimationsloop.onWarmupCompleted("currentState", true);
        setanimationsloop.onWarmupCompleted("schemeParams", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private DstAccountDetailRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallback = DstAccountDetailRequest.IAuthTabCallback();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[2].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[3].getValue()), lazyArrIAuthTabCallback[4].getValue()};
        int i4 = onExtraCallback + 125;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DstAccountDetailRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        Map map;
        Map map2;
        String str;
        Map map3;
        String str2;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = DstAccountDetailRequest.IAuthTabCallback();
        int i4 = 1;
        Map map4 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            Map map5 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrIAuthTabCallback[2].getValue(), (Object) null);
            Map map6 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, (jp) lazyArrIAuthTabCallback[3].getValue(), (Object) null);
            map3 = map5;
            map = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrIAuthTabCallback[4].getValue(), (Object) null);
            str = str4;
            str2 = str3;
            i = 31;
            map2 = map6;
        } else {
            int i5 = 0;
            int i6 = 1;
            Map map7 = null;
            String str5 = null;
            Map map8 = null;
            String str6 = null;
            while (i6 == i4) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i7 = onNavigationEvent + 19;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    i6 = 0;
                } else if (iOnNavigationEvent == 0) {
                    str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str6);
                    i5 |= 1;
                } else if (iOnNavigationEvent != i4) {
                    int i9 = onNavigationEvent + 21;
                    int i10 = i9 % 128;
                    onExtraCallback = i10;
                    int i11 = i9 % 2;
                    if (iOnNavigationEvent == 2) {
                        map8 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrIAuthTabCallback[2].getValue(), map8);
                        i5 |= 4;
                    } else if (iOnNavigationEvent != 3) {
                        int i12 = i10 + 83;
                        int i13 = i12 % 128;
                        onNavigationEvent = i13;
                        if (i12 % 2 != 0) {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            i2 = i13 + 67;
                            onExtraCallback = i2 % 128;
                            if (i2 % 2 != 0) {
                                map4 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrIAuthTabCallback[2].getValue(), map4);
                                i5 |= 44;
                            } else {
                                map4 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrIAuthTabCallback[4].getValue(), map4);
                                i5 |= 16;
                            }
                        } else {
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            i2 = i13 + 67;
                            onExtraCallback = i2 % 128;
                            if (i2 % 2 != 0) {
                            }
                        }
                    } else {
                        map7 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, (jp) lazyArrIAuthTabCallback[3].getValue(), map7);
                        i5 |= 8;
                    }
                    i4 = 1;
                } else {
                    i4 = 1;
                    str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str5);
                    i5 |= 2;
                }
            }
            i = i5;
            map = map4;
            map2 = map7;
            str = str5;
            map3 = map8;
            str2 = str6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DstAccountDetailRequest(i, str2, str, map3, map2, map, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m530deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        DstAccountDetailRequest dstAccountDetailRequestDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 115;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return dstAccountDetailRequestDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DstAccountDetailRequest dstAccountDetailRequest) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(dstAccountDetailRequest, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            DstAccountDetailRequest.onExtraCallbackWithResult(dstAccountDetailRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dstAccountDetailRequest, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        DstAccountDetailRequest.onExtraCallbackWithResult(dstAccountDetailRequest, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 15;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DstAccountDetailRequest) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
