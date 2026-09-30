package im.toss.websocket.network.model;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class TossWebSocketMessageMetaDto$$serializer implements aeu2<TossWebSocketMessageMetaDto> {
    private static int IAuthTabCallback = 0;
    public static final TossWebSocketMessageMetaDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 1;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 111;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        TossWebSocketMessageMetaDto$$serializer tossWebSocketMessageMetaDto$$serializer = new TossWebSocketMessageMetaDto$$serializer();
        INSTANCE = tossWebSocketMessageMetaDto$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.websocket.network.model.TossWebSocketMessageMetaDto", tossWebSocketMessageMetaDto$$serializer, 3);
        setanimationsloop.onWarmupCompleted("X-Toss-Websocket-Connect-EventId", false);
        setanimationsloop.onWarmupCompleted("socketPushId", false);
        setanimationsloop.onWarmupCompleted("isTrace", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private TossWebSocketMessageMetaDto$$serializer() {
    }

    @Override // o.aeu2
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getBgColor.IAuthTabCallback)};
        int i4 = onExtraCallback + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078 A[SYNTHETIC] */
    @Override // o.jp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TossWebSocketMessageMetaDto deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        String str;
        int i;
        String str2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String str3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, null);
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, null);
            bool = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getBgColor.IAuthTabCallback, null);
            str = str5;
            str2 = str4;
            i = 7;
        } else {
            int i3 = 0;
            Boolean bool2 = null;
            String str6 = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = onExtraCallback + 5;
                    int i5 = i4 % 128;
                    onWarmupCompleted = i5;
                    int i6 = i4 % 2;
                    if (iOnNavigationEvent != 0) {
                        int i7 = i5 + 1;
                        onExtraCallback = i7 % 128;
                        if (i7 % 2 != 0) {
                            if (iOnNavigationEvent == 1) {
                                str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str3);
                                i3 |= 2;
                            } else {
                                if (iOnNavigationEvent == 2) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                int i8 = i5 + 43;
                                onExtraCallback = i8 % 128;
                                int i9 = i8 % 2;
                                Object objOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getBgColor.IAuthTabCallback, bool2);
                                if (i9 != 0) {
                                    bool2 = (Boolean) objOnExtraCallbackWithResult;
                                    i3 |= 3;
                                } else {
                                    bool2 = (Boolean) objOnExtraCallbackWithResult;
                                    i3 |= 4;
                                }
                            }
                        } else if (iOnNavigationEvent == 1) {
                            str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str3);
                            i3 |= 2;
                        } else if (iOnNavigationEvent == 2) {
                        }
                    } else {
                        str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str6);
                        i3 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            bool = bool2;
            str = str3;
            i = i3;
            str2 = str6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TossWebSocketMessageMetaDto(i, str2, str, bool, null);
    }

    @Override // o.jp
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TossWebSocketMessageMetaDto tossWebSocketMessageMetaDto) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tossWebSocketMessageMetaDto, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TossWebSocketMessageMetaDto.onExtraCallback(tossWebSocketMessageMetaDto, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 51;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.py
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TossWebSocketMessageMetaDto) obj);
        int i4 = onWarmupCompleted + 43;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.aeu2
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 115;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
