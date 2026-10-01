package viva.republica.toss.network.model.bank;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class MoneyCalendarScheduleWidgetResponse$$serializer implements aeu2<MoneyCalendarScheduleWidgetResponse> {
    private static int IAuthTabCallback = 1;
    public static final MoneyCalendarScheduleWidgetResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 41;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return serialDescriptor;
    }

    static {
        MoneyCalendarScheduleWidgetResponse$$serializer moneyCalendarScheduleWidgetResponse$$serializer = new MoneyCalendarScheduleWidgetResponse$$serializer();
        INSTANCE = moneyCalendarScheduleWidgetResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.bank.MoneyCalendarScheduleWidgetResponse", moneyCalendarScheduleWidgetResponse$$serializer, 3);
        setanimationsloop.onWarmupCompleted("todayEvents", false);
        setanimationsloop.onWarmupCompleted("latestEvents", false);
        setanimationsloop.onWarmupCompleted("landingScheme", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 77;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private MoneyCalendarScheduleWidgetResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Lazy[] lazyArrIAuthTabCallback = MoneyCalendarScheduleWidgetResponse.IAuthTabCallback();
            ?? r5 = new KSerializer[5];
            r5[1] = lazyArrIAuthTabCallback[0].getValue();
            r5[1] = lazyArrIAuthTabCallback[0].getValue();
            r5[5] = getWriggleLayout.onNavigationEvent;
            kSerializerArr = r5;
        } else {
            Lazy[] lazyArrIAuthTabCallback2 = MoneyCalendarScheduleWidgetResponse.IAuthTabCallback();
            kSerializerArr = new KSerializer[]{lazyArrIAuthTabCallback2[0].getValue(), lazyArrIAuthTabCallback2[1].getValue(), getWriggleLayout.onNavigationEvent};
        }
        int i3 = onNavigationEvent + 1;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 41 / 0;
        }
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        MoneyCalendarScheduleWidgetResponse moneyCalendarScheduleWidgetResponseM26deserialize = m26deserialize(decoder);
        int i4 = IAuthTabCallback + 29;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return moneyCalendarScheduleWidgetResponseM26deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final MoneyCalendarScheduleWidgetResponse m26deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        List list;
        List list2;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 77;
        onNavigationEvent = i3 % 128;
        List list3 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            MoneyCalendarScheduleWidgetResponse.IAuthTabCallback();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            list3.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = MoneyCalendarScheduleWidgetResponse.IAuthTabCallback();
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            List list4 = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
            List list5 = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), (Object) null);
            String strAsInterface = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 2);
            int i4 = IAuthTabCallback + 23;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            list2 = list4;
            list = list5;
            str = strAsInterface;
            i = 7;
        } else {
            int i6 = 0;
            String strAsInterface2 = null;
            List list6 = null;
            boolean z = true;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    list6 = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), list6);
                    i6 |= 1;
                } else if (iOnNavigationEvent != 1) {
                    int i7 = IAuthTabCallback + 123;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    strAsInterface2 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 2);
                    i6 |= 4;
                } else {
                    list3 = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), list3);
                    i6 |= 2;
                    int i9 = IAuthTabCallback + 91;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
            str = strAsInterface2;
            list = list3;
            list2 = list6;
            i = i6;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        MoneyCalendarScheduleWidgetResponse moneyCalendarScheduleWidgetResponse = new MoneyCalendarScheduleWidgetResponse(i, list2, list, str, null);
        int i11 = onNavigationEvent + 71;
        IAuthTabCallback = i11 % 128;
        int i12 = i11 % 2;
        return moneyCalendarScheduleWidgetResponse;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (MoneyCalendarScheduleWidgetResponse) obj);
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull MoneyCalendarScheduleWidgetResponse moneyCalendarScheduleWidgetResponse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(moneyCalendarScheduleWidgetResponse, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        MoneyCalendarScheduleWidgetResponse.onNavigationEvent(moneyCalendarScheduleWidgetResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 113;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
