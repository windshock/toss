package viva.republica.toss.network.model.bank;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.bank.MoneyCalendarScheduleWidgetResponse;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class MoneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer implements aeu2<MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant> {
    private static int IAuthTabCallback = 1;
    public static final MoneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return serialDescriptor;
    }

    static {
        MoneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer moneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer = new MoneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer();
        INSTANCE = moneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.bank.MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant", moneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer, 2);
        setanimationsloop.onWarmupCompleted("dark", true);
        setanimationsloop.onWarmupCompleted("light", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 49;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 47 / 0;
        }
    }

    private MoneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getwrigglelayout);
            KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getwrigglelayout);
            kSerializerArr = new KSerializer[3];
            kSerializerArr[0] = kSerializerIAuthTabCallback;
            kSerializerArr[1] = kSerializerIAuthTabCallback2;
        } else {
            getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback(getwrigglelayout2), sp.IAuthTabCallback(getwrigglelayout2)};
        }
        int i3 = onNavigationEvent + 87;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant scheduleColorVariantM27deserialize = m27deserialize(decoder);
        int i4 = IAuthTabCallback + 15;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return scheduleColorVariantM27deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant m27deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onNavigationEvent + 125;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            if (i4 == 0) {
                str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
                i = 4;
            } else {
                str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
                i = 3;
            }
        } else {
            int i5 = 0;
            String str3 = null;
            String str4 = null;
            boolean z = true;
            while (z) {
                int i6 = IAuthTabCallback + 63;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str4);
                    i5 |= 1;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str3);
                    i5 |= 2;
                    int i8 = IAuthTabCallback + 13;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
            str = str3;
            str2 = str4;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant(i, str2, str, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 85;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant scheduleColorVariant) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(scheduleColorVariant, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant.IAuthTabCallback(scheduleColorVariant, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(scheduleColorVariant, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        MoneyCalendarScheduleWidgetResponse.ScheduleColorVariant.IAuthTabCallback(scheduleColorVariant, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallback + 15;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallback + 117;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        obj.hashCode();
        throw null;
    }
}
