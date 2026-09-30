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
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.bank.MoneyCalendarScheduleWidgetResponse;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class MoneyCalendarScheduleWidgetResponse$ScheduleEvent$$serializer implements aeu2<MoneyCalendarScheduleWidgetResponse.ScheduleEvent> {
    private static int IAuthTabCallback = 1;
    public static final MoneyCalendarScheduleWidgetResponse$ScheduleEvent$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 65;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 111;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        MoneyCalendarScheduleWidgetResponse$ScheduleEvent$$serializer moneyCalendarScheduleWidgetResponse$ScheduleEvent$$serializer = new MoneyCalendarScheduleWidgetResponse$ScheduleEvent$$serializer();
        INSTANCE = moneyCalendarScheduleWidgetResponse$ScheduleEvent$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.bank.MoneyCalendarScheduleWidgetResponse.ScheduleEvent", moneyCalendarScheduleWidgetResponse$ScheduleEvent$$serializer, 3);
        setanimationsloop.onWarmupCompleted("date", false);
        setanimationsloop.onWarmupCompleted("contents", false);
        setanimationsloop.onWarmupCompleted("color", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 57;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private MoneyCalendarScheduleWidgetResponse$ScheduleEvent$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, MoneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer.INSTANCE};
        int i4 = IAuthTabCallback + 51;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            m28deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MoneyCalendarScheduleWidgetResponse.ScheduleEvent scheduleEventM28deserialize = m28deserialize(decoder);
        int i3 = onWarmupCompleted + 67;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return scheduleEventM28deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final MoneyCalendarScheduleWidgetResponse.ScheduleEvent m28deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        MoneyCalendarScheduleWidgetResponse.ScheduleEventColor scheduleEventColor;
        String str;
        String str2;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            scheduleEventColor = (MoneyCalendarScheduleWidgetResponse.ScheduleEventColor) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, MoneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer.INSTANCE, (Object) null);
            str = strAsInterface;
            str2 = strAsInterface2;
            i = 7;
        } else {
            int i3 = onWarmupCompleted + 121;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            boolean z = true;
            MoneyCalendarScheduleWidgetResponse.ScheduleEventColor scheduleEventColor2 = null;
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            while (z) {
                int i6 = IAuthTabCallback + 91;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i7 = IAuthTabCallback;
                    int i8 = i7 + 93;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    if (iOnNavigationEvent == 0) {
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i5 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i5 |= 2;
                        int i10 = onWarmupCompleted + 41;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i12 = i7 + 87;
                        onWarmupCompleted = i12 % 128;
                        int i13 = i12 % 2;
                        MoneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer moneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer = MoneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer.INSTANCE;
                        if (i13 != 0) {
                            scheduleEventColor2 = (MoneyCalendarScheduleWidgetResponse.ScheduleEventColor) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, moneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer, scheduleEventColor2);
                            i5 |= 5;
                        } else {
                            scheduleEventColor2 = (MoneyCalendarScheduleWidgetResponse.ScheduleEventColor) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, moneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer, scheduleEventColor2);
                            i5 |= 4;
                        }
                    }
                } else {
                    z = false;
                }
            }
            scheduleEventColor = scheduleEventColor2;
            str = strAsInterface3;
            str2 = strAsInterface4;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new MoneyCalendarScheduleWidgetResponse.ScheduleEvent(i, str, str2, scheduleEventColor, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (MoneyCalendarScheduleWidgetResponse.ScheduleEvent) obj);
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        int i5 = IAuthTabCallback + 23;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull MoneyCalendarScheduleWidgetResponse.ScheduleEvent scheduleEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(scheduleEvent, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            MoneyCalendarScheduleWidgetResponse.ScheduleEvent.onNavigationEvent(scheduleEvent, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 56 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(scheduleEvent, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            MoneyCalendarScheduleWidgetResponse.ScheduleEvent.onNavigationEvent(scheduleEvent, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = IAuthTabCallback + 121;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
