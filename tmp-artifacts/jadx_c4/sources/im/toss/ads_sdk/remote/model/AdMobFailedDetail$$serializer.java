package im.toss.ads_sdk.remote.model;

import java.util.List;
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
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class AdMobFailedDetail$$serializer implements aeu2<AdMobFailedDetail> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final AdMobFailedDetail$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 87;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 5;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        AdMobFailedDetail$$serializer adMobFailedDetail$$serializer = new AdMobFailedDetail$$serializer();
        INSTANCE = adMobFailedDetail$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.model.AdMobFailedDetail", adMobFailedDetail$$serializer, 3);
        setanimationsloop.onWarmupCompleted("filterReasons", true);
        setanimationsloop.onWarmupCompleted("loadedContent", true);
        setanimationsloop.onWarmupCompleted("error", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 1;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AdMobFailedDetail$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback((KSerializer) AdMobFailedDetail.onWarmupCompleted()[0].getValue()), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback(AdmobError$$serializer.INSTANCE)};
        int i4 = onExtraCallback + 33;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AdMobFailedDetail deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        AdmobError admobError;
        List list;
        int i;
        String str;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 111;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            AdMobFailedDetail.onWarmupCompleted();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = AdMobFailedDetail.onWarmupCompleted();
        if (!(!ywVarOnWarmupCompleted2.extraCallbackWithResult())) {
            List list2 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), (Object) null);
            String str2 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            admobError = (AdmobError) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2, AdmobError$$serializer.INSTANCE, (Object) null);
            list = list2;
            i = 7;
            str = str2;
        } else {
            AdmobError admobError2 = null;
            List list3 = null;
            String str3 = null;
            boolean z = true;
            int i4 = 0;
            while (z) {
                int i5 = IAuthTabCallback + 55;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i6 = onExtraCallback + 73;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnNavigationEvent == 1) {
                        str3 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str3);
                        i4 |= 2;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        admobError2 = (AdmobError) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2, AdmobError$$serializer.INSTANCE, admobError2);
                        i4 |= 4;
                        int i8 = onExtraCallback + 59;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                    }
                } else {
                    list3 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), list3);
                    i4 |= 1;
                }
            }
            int i10 = onExtraCallback + 9;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            admobError = admobError2;
            list = list3;
            i = i4;
            str = str3;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new AdMobFailedDetail(i, list, str, admobError, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AdMobFailedDetail adMobFailedDetailDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 19;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return adMobFailedDetailDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AdMobFailedDetail adMobFailedDetail) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(adMobFailedDetail, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AdMobFailedDetail.onExtraCallbackWithResult(adMobFailedDetail, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 93;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AdMobFailedDetail) obj);
        int i4 = onExtraCallback + 49;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallback + 31;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
