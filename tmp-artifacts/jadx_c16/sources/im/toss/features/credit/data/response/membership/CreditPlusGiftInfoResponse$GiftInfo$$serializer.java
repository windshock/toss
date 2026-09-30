package im.toss.features.credit.data.response.membership;

import com.google.android.gms.internal.ads.zzaq;
import im.toss.features.credit.data.response.membership.CreditPlusGiftInfoResponse;
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
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftInfoResponse$GiftInfo$$serializer implements aeu2<CreditPlusGiftInfoResponse.GiftInfo> {
    private static int IAuthTabCallback = 0;
    public static final CreditPlusGiftInfoResponse$GiftInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 69;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 67;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        CreditPlusGiftInfoResponse$GiftInfo$$serializer creditPlusGiftInfoResponse$GiftInfo$$serializer = new CreditPlusGiftInfoResponse$GiftInfo$$serializer();
        INSTANCE = creditPlusGiftInfoResponse$GiftInfo$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.membership.CreditPlusGiftInfoResponse.GiftInfo", creditPlusGiftInfoResponse$GiftInfo$$serializer, 5);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("senderName", true);
        setanimationsloop.onWarmupCompleted("postcardType", true);
        setanimationsloop.onWarmupCompleted("postcardMessage", true);
        setanimationsloop.onWarmupCompleted("itemName", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 81;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private CreditPlusGiftInfoResponse$GiftInfo$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallback = CreditPlusGiftInfoResponse.GiftInfo.IAuthTabCallback();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {oty1.onExtraCallback, getwrigglelayout, lazyArrIAuthTabCallback[2].getValue(), getwrigglelayout, getwrigglelayout};
        int i4 = IAuthTabCallback + 35;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditPlusGiftInfoResponse.GiftInfo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String strAsInterface;
        PostcardType postcardType;
        String strAsInterface2;
        String str;
        long j;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = CreditPlusGiftInfoResponse.GiftInfo.IAuthTabCallback();
        String strAsInterface3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            postcardType = (PostcardType) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrIAuthTabCallback[2].getValue(), (Object) null);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            str = strAsInterface4;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            i = 31;
            j = jIAuthTabCallbackDefault;
        } else {
            int i3 = 0;
            boolean z = true;
            String strAsInterface5 = null;
            long jIAuthTabCallbackDefault2 = 0;
            PostcardType postcardType2 = null;
            String strAsInterface6 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = IAuthTabCallback + 61;
                    int i5 = i4 % 128;
                    onWarmupCompleted = i5;
                    int i6 = i4 % 2;
                    if (iOnNavigationEvent != 0) {
                        int i7 = i5 + 13;
                        int i8 = i7 % 128;
                        IAuthTabCallback = i8;
                        int i9 = i7 % 2;
                        if (iOnNavigationEvent == 1) {
                            strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                            i3 |= 2;
                        } else if (iOnNavigationEvent != 2) {
                            int i10 = i8 + 17;
                            onWarmupCompleted = i10 % 128;
                            int i11 = i10 % 2;
                            if (iOnNavigationEvent == 3) {
                                strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                                i3 |= 8;
                            } else {
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                                i3 |= 16;
                            }
                        } else {
                            postcardType2 = (PostcardType) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrIAuthTabCallback[2].getValue(), postcardType2);
                            i3 |= 4;
                        }
                    } else {
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i3 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            int i12 = IAuthTabCallback + 37;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            i = i3;
            strAsInterface = strAsInterface3;
            postcardType = postcardType2;
            strAsInterface2 = strAsInterface6;
            str = strAsInterface5;
            j = jIAuthTabCallbackDefault2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditPlusGiftInfoResponse.GiftInfo(i, j, str, postcardType, strAsInterface2, strAsInterface, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m207deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CreditPlusGiftInfoResponse.GiftInfo giftInfoDeserialize = deserialize(decoder);
        int i3 = IAuthTabCallback + 97;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return giftInfoDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditPlusGiftInfoResponse.GiftInfo giftInfo) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(giftInfo, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            int iOnNavigationEvent = zzaq.onNavigationEvent();
            int iOnNavigationEvent2 = zzaq.onNavigationEvent();
            int iOnNavigationEvent3 = zzaq.onNavigationEvent();
            CreditPlusGiftInfoResponse.GiftInfo.onNavigationEvent(iOnNavigationEvent2, -832089625, zzaq.onNavigationEvent(), iOnNavigationEvent3, new Object[]{giftInfo, vylVarOnExtraCallback, serialDescriptor}, 832089626, iOnNavigationEvent);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(giftInfo, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        int iOnNavigationEvent4 = zzaq.onNavigationEvent();
        int iOnNavigationEvent5 = zzaq.onNavigationEvent();
        int iOnNavigationEvent6 = zzaq.onNavigationEvent();
        CreditPlusGiftInfoResponse.GiftInfo.onNavigationEvent(iOnNavigationEvent5, -832089625, zzaq.onNavigationEvent(), iOnNavigationEvent6, new Object[]{giftInfo, vylVarOnExtraCallback2, serialDescriptor2}, 832089626, iOnNavigationEvent4);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallback + 87;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (CreditPlusGiftInfoResponse.GiftInfo) obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 47;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
