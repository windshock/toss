package im.toss.securities.core.markettime.data.model;

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
import o.setAnimationsLoop;
import o.showCmp;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class TradingHourDto$$serializer<T> implements aeu2<TradingHourDto<T>> {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final SerialDescriptor descriptor;
    private final /* synthetic */ KSerializer<?> typeSerial0;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            serialDescriptor = this.descriptor;
            int i4 = 85 / 0;
        } else {
            serialDescriptor = this.descriptor;
        }
        int i5 = i3 + 75;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private TradingHourDto$$serializer() {
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.core.markettime.data.model.TradingHourDto", this, 4);
        setanimationsloop.onWarmupCompleted("expiredTime", true);
        setanimationsloop.onWarmupCompleted("prevBizDay", true);
        setanimationsloop.onWarmupCompleted("today", true);
        setanimationsloop.onWarmupCompleted("nextBizDay", true);
        this.descriptor = setanimationsloop;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TradingHourDto$$serializer(@NotNull KSerializer<T> kSerializer) {
        this();
        Intrinsics.checkNotNullParameter(kSerializer, "");
        this.typeSerial0 = kSerializer;
    }

    private final /* synthetic */ KSerializer getTypeSerial0() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 83;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        KSerializer<?> kSerializer = this.typeSerial0;
        int i5 = i2 + 13;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return kSerializer;
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback(this.typeSerial0), sp.IAuthTabCallback(this.typeSerial0), sp.IAuthTabCallback(this.typeSerial0)};
        int i4 = onNavigationEvent + 69;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final TradingHourDto<T> deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        showCmp showcmp;
        showCmp showcmp2;
        String str;
        showCmp showcmp3;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = this.descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        boolean z = false;
        showCmp showcmp4 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onWarmupCompleted + 93;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            showCmp showcmp5 = (showCmp) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, this.typeSerial0, (Object) null);
            showcmp = (showCmp) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, this.typeSerial0, (Object) null);
            str = str2;
            showcmp3 = (showCmp) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, this.typeSerial0, (Object) null);
            showcmp2 = showcmp5;
            i = 15;
        } else {
            int i5 = 0;
            boolean z2 = true;
            showCmp showcmp6 = null;
            String str3 = null;
            showCmp showcmp7 = null;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onWarmupCompleted;
                    int i7 = i6 + 55;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    if (iOnNavigationEvent != 0) {
                        if (iOnNavigationEvent != 1) {
                            int i9 = i6 + 33;
                            onNavigationEvent = i9 % 128;
                            int i10 = i9 % 2;
                            if (iOnNavigationEvent == 2) {
                                showcmp4 = (showCmp) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, this.typeSerial0, showcmp4);
                                i5 |= 4;
                            } else {
                                if (iOnNavigationEvent != 3) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                showcmp7 = (showCmp) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, this.typeSerial0, showcmp7);
                                i5 |= 8;
                            }
                        } else {
                            showcmp6 = (showCmp) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, this.typeSerial0, showcmp6);
                            i5 |= 2;
                        }
                        z = false;
                    } else {
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                        i5 |= 1;
                        z = false;
                    }
                } else {
                    z2 = z;
                }
            }
            int i11 = onNavigationEvent + 1;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            i = i5;
            showcmp = showcmp4;
            showcmp2 = showcmp6;
            str = str3;
            showcmp3 = showcmp7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TradingHourDto<>(i, str, showcmp2, showcmp, showcmp3, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m14deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TradingHourDto<T> tradingHourDtoDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 107;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return tradingHourDtoDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TradingHourDto<T> tradingHourDto) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tradingHourDto, "");
        SerialDescriptor serialDescriptor = this.descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TradingHourDto.onNavigationEvent(tradingHourDto, vylVarOnExtraCallback, serialDescriptor, this.typeSerial0);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 87;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TradingHourDto) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 55;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        KSerializer<?>[] kSerializerArr = {this.typeSerial0};
        int i5 = i2 + 45;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return kSerializerArr;
    }
}
