package im.toss.features.benefit.dto;

import im.toss.features.benefit.dto.MissionRewardResult;
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
import o.getBgColor;
import o.getDynamicHeight;
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
public final /* synthetic */ class MissionRewardResult$$serializer implements aeu2<MissionRewardResult> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final MissionRewardResult$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 83;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        MissionRewardResult$$serializer missionRewardResult$$serializer = new MissionRewardResult$$serializer();
        INSTANCE = missionRewardResult$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.benefit.dto.MissionRewardResult", missionRewardResult$$serializer, 5);
        setanimationsloop.onWarmupCompleted("isRewarded", true);
        setanimationsloop.onWarmupCompleted("rewardAmount", true);
        setanimationsloop.onWarmupCompleted("rewardUiType", true);
        setanimationsloop.onWarmupCompleted("rewardLandingUrl", true);
        setanimationsloop.onWarmupCompleted("rewardInfo", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 67;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 60 / 0;
        }
    }

    private MissionRewardResult$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = MissionRewardResult.onWarmupCompleted();
        KSerializer<?>[] kSerializerArr = {getBgColor.IAuthTabCallback, getDynamicHeight.onWarmupCompleted, sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[2].getValue()), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), lazyArrOnWarmupCompleted[4].getValue()};
        int i4 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final MissionRewardResult deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        List list;
        boolean z;
        String str;
        int i2;
        MissionRewardResult.onNavigationEvent onnavigationevent;
        char c;
        char c2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = MissionRewardResult.onWarmupCompleted();
        char c3 = 4;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
            int iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
            MissionRewardResult.onNavigationEvent onnavigationevent2 = (MissionRewardResult.onNavigationEvent) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnWarmupCompleted[2].getValue(), (Object) null);
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, (Object) null);
            List list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrOnWarmupCompleted[4].getValue(), (Object) null);
            int i4 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            i = 31;
            list = list2;
            z = zOnExtraCallbackWithResult;
            str = str2;
            i2 = iOnTransact;
            onnavigationevent = onnavigationevent2;
        } else {
            boolean z2 = true;
            int i6 = 0;
            boolean zOnExtraCallbackWithResult2 = false;
            int iOnTransact2 = 0;
            List list3 = null;
            String str3 = null;
            MissionRewardResult.onNavigationEvent onnavigationevent3 = null;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i7 = onExtraCallbackWithResult;
                    int i8 = i7 + 87;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        if (iOnNavigationEvent == 1) {
                            c2 = 4;
                            iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
                            i6 |= 2;
                        } else if (iOnNavigationEvent != 2) {
                            int i9 = i7 + 111;
                            onWarmupCompleted = i9 % 128;
                            int i10 = i9 % 2;
                            if (iOnNavigationEvent != 3) {
                                c2 = 4;
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrOnWarmupCompleted[4].getValue(), list3);
                                i6 |= 16;
                            } else {
                                c2 = 4;
                                str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str3);
                                i6 |= 8;
                            }
                        } else {
                            c2 = 4;
                            onnavigationevent3 = (MissionRewardResult.onNavigationEvent) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnWarmupCompleted[2].getValue(), onnavigationevent3);
                            i6 |= 4;
                        }
                        c3 = c2;
                    } else {
                        c = 4;
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                        i6 |= 1;
                    }
                } else {
                    c = c3;
                    z2 = false;
                }
                c3 = c;
            }
            int i11 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 5 / 3;
            }
            i = i6;
            list = list3;
            z = zOnExtraCallbackWithResult2;
            str = str3;
            i2 = iOnTransact2;
            onnavigationevent = onnavigationevent3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new MissionRewardResult(i, z, i2, onnavigationevent, str, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m98deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        MissionRewardResult missionRewardResultDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return missionRewardResultDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull MissionRewardResult missionRewardResult) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(missionRewardResult, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            MissionRewardResult.onWarmupCompleted(missionRewardResult, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(missionRewardResult, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        MissionRewardResult.onWarmupCompleted(missionRewardResult, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (MissionRewardResult) obj);
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        int i5 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
