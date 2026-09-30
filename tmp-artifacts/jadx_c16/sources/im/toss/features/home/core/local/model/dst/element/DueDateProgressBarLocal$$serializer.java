package im.toss.features.home.core.local.model.dst.element;

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
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DueDateProgressBarLocal$$serializer implements aeu2<DueDateProgressBarLocal> {
    public static final DueDateProgressBarLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 45;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        DueDateProgressBarLocal$$serializer dueDateProgressBarLocal$$serializer = new DueDateProgressBarLocal$$serializer();
        INSTANCE = dueDateProgressBarLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.DueDateProgressBarLocal", dueDateProgressBarLocal$$serializer, 7);
        setanimationsloop.onWarmupCompleted("expiredDate", false);
        setanimationsloop.onWarmupCompleted("openDate", false);
        setanimationsloop.onWarmupCompleted("openDateDisplayFormat", false);
        setanimationsloop.onWarmupCompleted("expiredDateDisplayFormat", false);
        setanimationsloop.onWarmupCompleted("isShowingTooltip", false);
        setanimationsloop.onWarmupCompleted("progressBarColor", false);
        setanimationsloop.onWarmupCompleted("progressBarBackgroundColor", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 71;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 96 / 0;
        }
    }

    private DueDateProgressBarLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializer, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(getBgColor.IAuthTabCallback), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer)};
        int i4 = onExtraCallbackWithResult + 15;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final DueDateProgressBarLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        Boolean bool;
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Boolean bool2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallback + 23;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            Boolean bool3 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getBgColor.IAuthTabCallback, (Object) null);
            String str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            str6 = str7;
            str4 = strAsInterface;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            str3 = str9;
            str5 = str8;
            bool = bool3;
            str2 = strAsInterface2;
            i = 127;
        } else {
            int i5 = 0;
            boolean z = true;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            while (z) {
                int i6 = onExtraCallback + 71;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                    case 0:
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i5 |= 1;
                    case 1:
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i5 |= 2;
                    case 2:
                        str13 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str13);
                        i5 |= 4;
                    case 3:
                        str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str12);
                        i5 |= 8;
                    case 4:
                        bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getBgColor.IAuthTabCallback, bool2);
                        i5 |= 16;
                        int i8 = onExtraCallback + 111;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                    case 5:
                        str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str10);
                        i5 |= 32;
                        int i10 = onExtraCallbackWithResult + 93;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                    case 6:
                        str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str11);
                        i5 |= 64;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = str11;
            str2 = strAsInterface3;
            bool = bool2;
            i = i5;
            String str14 = strAsInterface4;
            str3 = str10;
            str4 = str14;
            String str15 = str13;
            str5 = str12;
            str6 = str15;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DueDateProgressBarLocal(i, str4, str2, str6, str5, bool, str3, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m340deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        DueDateProgressBarLocal dueDateProgressBarLocalDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        int i5 = onExtraCallback + 71;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
        return dueDateProgressBarLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DueDateProgressBarLocal dueDateProgressBarLocal) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(dueDateProgressBarLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            DueDateProgressBarLocal.onExtraCallback(dueDateProgressBarLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dueDateProgressBarLocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        DueDateProgressBarLocal.onExtraCallback(dueDateProgressBarLocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallback + 43;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DueDateProgressBarLocal) obj);
        int i4 = onExtraCallback + 43;
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
        int i2 = onExtraCallbackWithResult + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 69;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
