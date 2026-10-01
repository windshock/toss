package im.toss.securities.widget.calendar.ui.model;

import im.toss.securities.widget.calendar.ui.model.CalendarWidgetState;
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
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class CalendarWidgetState$UiEvents$$serializer implements aeu2<CalendarWidgetState.UiEvents> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final CalendarWidgetState$UiEvents$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        return serialDescriptor;
    }

    static {
        CalendarWidgetState$UiEvents$$serializer calendarWidgetState$UiEvents$$serializer = new CalendarWidgetState$UiEvents$$serializer();
        INSTANCE = calendarWidgetState$UiEvents$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("UiEvents", calendarWidgetState$UiEvents$$serializer, 3);
        setanimationsloop.onWarmupCompleted("date", false);
        setanimationsloop.onWarmupCompleted("day", false);
        setanimationsloop.onWarmupCompleted("events", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 53;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 7 / 0;
        }
    }

    private CalendarWidgetState$UiEvents$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Lazy[] lazyArrOnWarmupCompleted = CalendarWidgetState.UiEvents.onWarmupCompleted();
            ?? r4 = new KSerializer[2];
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            r4[1] = getwrigglelayout;
            r4[1] = getwrigglelayout;
            r4[4] = lazyArrOnWarmupCompleted[3].getValue();
            kSerializerArr = r4;
        } else {
            Lazy[] lazyArrOnWarmupCompleted2 = CalendarWidgetState.UiEvents.onWarmupCompleted();
            getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{getwrigglelayout2, getwrigglelayout2, lazyArrOnWarmupCompleted2[2].getValue()};
        }
        int i3 = onNavigationEvent + 47;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CalendarWidgetState.UiEvents deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        List list;
        String str2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = CalendarWidgetState.UiEvents.onWarmupCompleted();
        String strAsInterface = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnWarmupCompleted[2].getValue(), (Object) null);
            i = 7;
            str2 = strAsInterface2;
            str = strAsInterface3;
        } else {
            int i3 = 0;
            List list2 = null;
            String strAsInterface4 = null;
            boolean z = true;
            while (z) {
                int i4 = IAuthTabCallback + 45;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i3 |= 1;
                } else if (iOnNavigationEvent != 1) {
                    int i6 = IAuthTabCallback + 27;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        if (iOnNavigationEvent != 4) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnWarmupCompleted[2].getValue(), list2);
                        i3 |= 4;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnWarmupCompleted[2].getValue(), list2);
                        i3 |= 4;
                    }
                } else {
                    strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                    i3 |= 2;
                    int i7 = IAuthTabCallback + 27;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
            i = i3;
            str = strAsInterface;
            list = list2;
            str2 = strAsInterface4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CalendarWidgetState.UiEvents(i, str2, str, list, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m36deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CalendarWidgetState.UiEvents uiEventsDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 87;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return uiEventsDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CalendarWidgetState.UiEvents uiEvents) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(uiEvents, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CalendarWidgetState.UiEvents.onExtraCallback(uiEvents, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(uiEvents, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CalendarWidgetState.UiEvents.onExtraCallback(uiEvents, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallback + 87;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CalendarWidgetState.UiEvents) obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 95;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 113;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
