package im.toss.features.credit.data.remote.model;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CurrentUsageInfo$$serializer implements aeu2<CurrentUsageInfo> {
    private static int IAuthTabCallback = 1;
    public static final CurrentUsageInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 49;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return serialDescriptor;
    }

    static {
        CurrentUsageInfo$$serializer currentUsageInfo$$serializer = new CurrentUsageInfo$$serializer();
        INSTANCE = currentUsageInfo$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.remote.model.CurrentUsageInfo", currentUsageInfo$$serializer, 6);
        setanimationsloop.onWarmupCompleted("usagePercent", true);
        setanimationsloop.onWarmupCompleted("progressBarColor", true);
        setanimationsloop.onWarmupCompleted("usageLabel", true);
        setanimationsloop.onWarmupCompleted("usageValue", true);
        setanimationsloop.onWarmupCompleted("limitLabel", true);
        setanimationsloop.onWarmupCompleted("limitValue", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private CurrentUsageInfo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getDynamicHeight.onWarmupCompleted, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout};
        int i4 = onNavigationEvent + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CurrentUsageInfo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String strAsInterface;
        String str2;
        int i;
        String str3;
        int i2;
        String str4;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 53;
        onNavigationEvent = i5 % 128;
        String strAsInterface2 = null;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i6 = onExtraCallback + 75;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            int iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            str2 = strAsInterface4;
            i = iOnTransact;
            str3 = strAsInterface3;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            str4 = strAsInterface5;
            str = strAsInterface6;
            i2 = 63;
        } else {
            String strAsInterface7 = null;
            String strAsInterface8 = null;
            String strAsInterface9 = null;
            String strAsInterface10 = null;
            boolean z = true;
            int iOnTransact2 = 0;
            int i8 = 0;
            while (z) {
                int i9 = onExtraCallback + 21;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % i3;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        int i11 = onNavigationEvent + 61;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                        z = false;
                        i3 = 2;
                    case 0:
                        iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                        i8 |= 1;
                    case 1:
                        strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i8 |= 2;
                    case 2:
                        strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i3);
                        i8 |= 4;
                    case 3:
                        strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i8 |= 8;
                    case 4:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i8 |= 16;
                        int i13 = onExtraCallback + 93;
                        onNavigationEvent = i13 % 128;
                        int i14 = i13 % i3;
                    case 5:
                        strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i8 |= 32;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = strAsInterface2;
            strAsInterface = strAsInterface10;
            str2 = strAsInterface8;
            i = iOnTransact2;
            String str5 = strAsInterface9;
            str3 = strAsInterface7;
            i2 = i8;
            str4 = str5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CurrentUsageInfo(i2, i, str3, str2, str4, str, strAsInterface, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m117deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CurrentUsageInfo currentUsageInfoDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return currentUsageInfoDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CurrentUsageInfo currentUsageInfo) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(currentUsageInfo, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CurrentUsageInfo.onExtraCallbackWithResult(currentUsageInfo, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 22 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(currentUsageInfo, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            CurrentUsageInfo.onExtraCallbackWithResult(currentUsageInfo, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onExtraCallback + 79;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CurrentUsageInfo) obj);
        int i4 = onExtraCallback + 71;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
