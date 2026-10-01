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
import o.jp;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class CalendarWidgetState$Success$$serializer implements aeu2<CalendarWidgetState.Success> {
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final CalendarWidgetState$Success$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 17;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        CalendarWidgetState$Success$$serializer calendarWidgetState$Success$$serializer = new CalendarWidgetState$Success$$serializer();
        INSTANCE = calendarWidgetState$Success$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("Success", calendarWidgetState$Success$$serializer, 3);
        setanimationsloop.onWarmupCompleted("todayEvents", false);
        setanimationsloop.onWarmupCompleted("nextEvents", false);
        setanimationsloop.onWarmupCompleted("days", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 91;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private CalendarWidgetState$Success$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = CalendarWidgetState.Success.onNavigationEvent();
        CalendarWidgetState$UiEvents$$serializer calendarWidgetState$UiEvents$$serializer = CalendarWidgetState$UiEvents$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(calendarWidgetState$UiEvents$$serializer), sp.IAuthTabCallback(calendarWidgetState$UiEvents$$serializer), sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[2].getValue())};
        int i4 = IAuthTabCallback + 55;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0067 A[PHI: r1 r2 r14
      0x0067: PHI (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003c, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0067: PHI (r2v10 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v15 kotlin.Lazy[]) binds: [B:8:0x003c, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0067: PHI (r14v5 o.yw) = (r14v1 o.yw), (r14v7 o.yw) binds: [B:8:0x003c, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e A[PHI: r1 r2 r14
      0x003e: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003c, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r2v3 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v15 kotlin.Lazy[]) binds: [B:8:0x003c, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r14v2 o.yw) = (r14v1 o.yw), (r14v7 o.yw) binds: [B:8:0x003c, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CalendarWidgetState.Success deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnNavigationEvent;
        CalendarWidgetState.UiEvents uiEvents;
        CalendarWidgetState.UiEvents uiEvents2;
        int i;
        List list;
        int iOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 101;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnNavigationEvent = CalendarWidgetState.Success.onNavigationEvent();
            int i4 = 48 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                int i5 = IAuthTabCallback + 91;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CalendarWidgetState$UiEvents$$serializer calendarWidgetState$UiEvents$$serializer = CalendarWidgetState$UiEvents$$serializer.INSTANCE;
                uiEvents = (CalendarWidgetState.UiEvents) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, calendarWidgetState$UiEvents$$serializer, (Object) null);
                uiEvents2 = (CalendarWidgetState.UiEvents) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, calendarWidgetState$UiEvents$$serializer, (Object) null);
                List list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnNavigationEvent[2].getValue(), (Object) null);
                i = 7;
                list = list2;
            } else {
                CalendarWidgetState.UiEvents uiEvents3 = null;
                List list3 = null;
                CalendarWidgetState.UiEvents uiEvents4 = null;
                boolean z = true;
                int i7 = 0;
                while (z) {
                    int i8 = onWarmupCompleted + 115;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        int i9 = 43 / 0;
                        if (iOnNavigationEvent == -1) {
                            z = false;
                        } else if (iOnNavigationEvent == 0) {
                            int i10 = onWarmupCompleted + 17;
                            IAuthTabCallback = i10 % 128;
                            if (i10 % 2 == 0) {
                                if (iOnNavigationEvent == 1) {
                                    uiEvents3 = (CalendarWidgetState.UiEvents) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, CalendarWidgetState$UiEvents$$serializer.INSTANCE, uiEvents3);
                                    i7 |= 2;
                                } else {
                                    if (iOnNavigationEvent == 2) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnNavigationEvent[2].getValue(), list3);
                                    i7 |= 4;
                                }
                            } else if (iOnNavigationEvent == 1) {
                                uiEvents3 = (CalendarWidgetState.UiEvents) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, CalendarWidgetState$UiEvents$$serializer.INSTANCE, uiEvents3);
                                i7 |= 2;
                            } else if (iOnNavigationEvent == 2) {
                            }
                        } else {
                            uiEvents4 = (CalendarWidgetState.UiEvents) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, CalendarWidgetState$UiEvents$$serializer.INSTANCE, uiEvents4);
                            i7 |= 1;
                        }
                    } else {
                        iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        if (iOnNavigationEvent == -1) {
                            z = false;
                        } else if (iOnNavigationEvent == 0) {
                        }
                    }
                }
                int i11 = IAuthTabCallback + 67;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                i = i7;
                uiEvents2 = uiEvents3;
                list = list3;
                uiEvents = uiEvents4;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnNavigationEvent = CalendarWidgetState.Success.onNavigationEvent();
            if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CalendarWidgetState.Success(i, uiEvents, uiEvents2, list, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m34deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CalendarWidgetState.Success successDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 101;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return successDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CalendarWidgetState.Success success) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(success, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CalendarWidgetState.Success.onExtraCallback(success, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CalendarWidgetState.Success) obj);
        int i4 = onWarmupCompleted + 99;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 37;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
