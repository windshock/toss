package im.toss.securities.widget.calendar.ui.model;

import im.toss.securities.widget.calendar.ui.model.CalendarWidgetState;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.htf1;
import o.htf31;
import o.kt;
import o.liq;
import o.nc;
import o.okycx;
import o.py;
import o.r2ExternalSyntheticLambda3;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface CalendarWidgetState {
    public static final Companion Companion = Companion.IAuthTabCallback;

    public static final class Companion {
        static final /* synthetic */ Companion IAuthTabCallback = new Companion();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 93;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        private Companion() {
        }

        public final KSerializer<CalendarWidgetState> serializer() {
            int i = 2 % 2;
            kt ktVar = new kt("im.toss.securities.widget.calendar.ui.model.CalendarWidgetState", Reflection.getOrCreateKotlinClass(CalendarWidgetState.class), new KClass[]{Reflection.getOrCreateKotlinClass(Error.class), Reflection.getOrCreateKotlinClass(GuestUser.class), Reflection.getOrCreateKotlinClass(Loading.class), Reflection.getOrCreateKotlinClass(Maintenance.class), Reflection.getOrCreateKotlinClass(NetworkError.class), Reflection.getOrCreateKotlinClass(Success.class), Reflection.getOrCreateKotlinClass(UndefinedUser.class)}, new KSerializer[]{CalendarWidgetState$Error$$serializer.INSTANCE, CalendarWidgetState$GuestUser$$serializer.INSTANCE, new htf1("Loading", Loading.INSTANCE, new Annotation[0]), new htf1("im.toss.securities.widget.calendar.ui.model.CalendarWidgetState.Maintenance", Maintenance.INSTANCE, new Annotation[0]), CalendarWidgetState$NetworkError$$serializer.INSTANCE, CalendarWidgetState$Success$$serializer.INSTANCE, CalendarWidgetState$UndefinedUser$$serializer.INSTANCE}, new Annotation[0]);
            int i2 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return ktVar;
            }
            throw null;
        }
    }

    @nc(IAuthTabCallback = "Success")
    @liq
    public static final class Success implements CalendarWidgetState {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final List<UiEvents> days;
        private final UiEvents nextEvents;
        private final UiEvents todayEvents;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.calendar.ui.model.CalendarWidgetState$Success$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 125;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = CalendarWidgetState.Success.IAuthTabCallback();
                int i4 = IAuthTabCallback + 11;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerIAuthTabCallback;
                }
                throw null;
            }
        })};

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return asBinder();
            }
            asBinder();
            throw null;
        }

        private static final /* synthetic */ KSerializer asBinder() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(CalendarWidgetState$UiEvents$$serializer.INSTANCE);
            int i2 = IAuthTabCallback + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return checkcanopenlandingpage;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 63;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            if (!Intrinsics.areEqual(this.todayEvents, success.todayEvents)) {
                int i4 = onExtraCallback + 9;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.nextEvents, success.nextEvents)) {
                return false;
            }
            if (Intrinsics.areEqual(this.days, success.days)) {
                return true;
            }
            int i6 = IAuthTabCallback + 7;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001b A[PHI: r1 r2
          0x001b: PHI (r1v11 im.toss.securities.widget.calendar.ui.model.CalendarWidgetState$UiEvents) = 
          (r1v4 im.toss.securities.widget.calendar.ui.model.CalendarWidgetState$UiEvents)
          (r1v13 im.toss.securities.widget.calendar.ui.model.CalendarWidgetState$UiEvents)
         binds: [B:8:0x0017, B:5:0x0011] A[DONT_GENERATE, DONT_INLINE]
          0x001b: PHI (r2v6 int) = (r2v1 int), (r2v0 int) binds: [B:8:0x0017, B:5:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0019 A[PHI: r2
          0x0019: PHI (r2v2 int) = (r2v1 int), (r2v0 int) binds: [B:8:0x0017, B:5:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int hashCode() {
            UiEvents uiEvents;
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = 1;
            int i2 = onExtraCallback + 1;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                uiEvents = this.todayEvents;
                if (uiEvents == null) {
                    iHashCode = 0;
                } else {
                    iHashCode = uiEvents.hashCode();
                    int i3 = onExtraCallback + 91;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                }
            } else {
                uiEvents = this.todayEvents;
                iHashCode2 = 0;
                if (uiEvents == null) {
                }
            }
            UiEvents uiEvents2 = this.nextEvents;
            int iHashCode3 = uiEvents2 != null ? uiEvents2.hashCode() : 0;
            List<UiEvents> list = this.days;
            if (list != null) {
                iHashCode2 = list.hashCode();
            }
            return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Success(todayEvents=" + this.todayEvents + ", nextEvents=" + this.nextEvents + ", days=" + this.days + ")";
            int i2 = IAuthTabCallback + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Success> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 83;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                CalendarWidgetState$Success$$serializer calendarWidgetState$Success$$serializer = CalendarWidgetState$Success$$serializer.INSTANCE;
                int i4 = onExtraCallback + 21;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return calendarWidgetState$Success$$serializer;
            }
        }

        static {
            int i = onExtraCallbackWithResult + 105;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ Success(int i, UiEvents uiEvents, UiEvents uiEvents2, List list, okycx okycxVar) {
            if (3 != (i & 3)) {
                int i2 = IAuthTabCallback + 53;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    htf31.onExtraCallbackWithResult(i, 5, CalendarWidgetState$Success$$serializer.INSTANCE.getDescriptor());
                } else {
                    htf31.onExtraCallbackWithResult(i, 3, CalendarWidgetState$Success$$serializer.INSTANCE.getDescriptor());
                }
                int i3 = 2 % 2;
            }
            this.todayEvents = uiEvents;
            this.nextEvents = uiEvents2;
            Object obj = null;
            if ((i & 4) == 0) {
                this.days = null;
                int i4 = IAuthTabCallback + 9;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            this.days = list;
            int i6 = onExtraCallback + 5;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public Success(@Nullable UiEvents uiEvents, @Nullable UiEvents uiEvents2, @Nullable List<UiEvents> list) {
            this.todayEvents = uiEvents;
            this.nextEvents = uiEvents2;
            this.days = list;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[PHI: r1
          0x0051: PHI (r1v6 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x0038, B:12:0x0047, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[PHI: r1
          0x003a: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x0038, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallback(Success success, vyl vylVar, SerialDescriptor serialDescriptor) {
            Lazy<KSerializer<Object>>[] lazyArr;
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                lazyArr = $childSerializers;
                CalendarWidgetState$UiEvents$$serializer calendarWidgetState$UiEvents$$serializer = CalendarWidgetState$UiEvents$$serializer.INSTANCE;
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, calendarWidgetState$UiEvents$$serializer, success.todayEvents);
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, calendarWidgetState$UiEvents$$serializer, success.nextEvents);
                if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
                    int i3 = onExtraCallback + 31;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        List<UiEvents> list = success.days;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (success.days != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, (py) lazyArr[2].getValue(), success.days);
                    }
                }
            } else {
                lazyArr = $childSerializers;
                CalendarWidgetState$UiEvents$$serializer calendarWidgetState$UiEvents$$serializer2 = CalendarWidgetState$UiEvents$$serializer.INSTANCE;
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, calendarWidgetState$UiEvents$$serializer2, success.todayEvents);
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, calendarWidgetState$UiEvents$$serializer2, success.nextEvents);
                if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                }
            }
            int i4 = onExtraCallback + 123;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public static final /* synthetic */ Lazy[] onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 13;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i4 = i2 + 13;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return lazyArr;
        }

        public final UiEvents onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            UiEvents uiEvents = this.todayEvents;
            int i5 = i3 + 125;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return uiEvents;
        }

        public final UiEvents onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            UiEvents uiEvents = this.nextEvents;
            int i5 = i3 + 39;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return uiEvents;
        }

        public final List<UiEvents> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.days;
            }
            throw null;
        }
    }

    @nc(IAuthTabCallback = "UiEvents")
    @liq
    public static final class UiEvents {
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.calendar.ui.model.CalendarWidgetState$UiEvents$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 125;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = CalendarWidgetState.UiEvents.IAuthTabCallback();
                int i4 = onExtraCallbackWithResult + 117;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializerIAuthTabCallback;
                }
                throw null;
            }
        })};
        public static final int $stable = 0;
        public static final Companion Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final String date;
        private final String day;
        private final List<UiEvent> events;

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
            if (i3 == 0) {
                int i4 = 21 / 0;
            }
            return kSerializerIAuthTabCallbackStub;
        }

        private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(CalendarWidgetState$UiEvent$$serializer.INSTANCE);
            int i2 = onExtraCallback + 55;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 34 / 0;
            }
            return checkcanopenlandingpage;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiEvents onExtraCallback(UiEvents uiEvents, String str, String str2, List list, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = onExtraCallback;
                int i4 = i3 + 71;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                String str3 = uiEvents.date;
                int i6 = i3 + 33;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                str = str3;
            }
            if ((i & 2) != 0) {
                str2 = uiEvents.day;
            }
            if ((i & 4) != 0) {
                list = uiEvents.events;
            }
            return uiEvents.onWarmupCompleted(str, str2, list);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                int i5 = i3 + 67;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(obj instanceof UiEvents)) {
                return false;
            }
            UiEvents uiEvents = (UiEvents) obj;
            if (!(!Intrinsics.areEqual(this.date, uiEvents.date))) {
                return Intrinsics.areEqual(this.day, uiEvents.day) && Intrinsics.areEqual(this.events, uiEvents.events);
            }
            int i7 = onExtraCallback + 19;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 16 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((this.date.hashCode() * 31) + this.day.hashCode()) * 31) + this.events.hashCode();
            int i4 = onWarmupCompleted + 107;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 96 / 0;
            }
            return iHashCode;
        }

        public final UiEvents onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull List<UiEvent> list) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            UiEvents uiEvents = new UiEvents(str, str2, list);
            int i2 = onExtraCallback + 13;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return uiEvents;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "UiEvents(date=" + this.date + ", day=" + this.day + ", events=" + this.events + ")";
            int i2 = onWarmupCompleted + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<UiEvents> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 61;
                onExtraCallbackWithResult = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    CalendarWidgetState$UiEvents$$serializer calendarWidgetState$UiEvents$$serializer = CalendarWidgetState$UiEvents$$serializer.INSTANCE;
                    obj.hashCode();
                    throw null;
                }
                CalendarWidgetState$UiEvents$$serializer calendarWidgetState$UiEvents$$serializer2 = CalendarWidgetState$UiEvents$$serializer.INSTANCE;
                int i3 = onExtraCallbackWithResult + 91;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    return calendarWidgetState$UiEvents$$serializer2;
                }
                obj.hashCode();
                throw null;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public /* synthetic */ UiEvents(int i, String str, String str2, List list, okycx okycxVar) {
            SerialDescriptor descriptor;
            int i2 = 7;
            if (7 != (i & 7)) {
                int i3 = onExtraCallback + 101;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    descriptor = CalendarWidgetState$UiEvents$$serializer.INSTANCE.getDescriptor();
                    i2 = 9;
                } else {
                    descriptor = CalendarWidgetState$UiEvents$$serializer.INSTANCE.getDescriptor();
                }
                htf31.onExtraCallbackWithResult(i, i2, descriptor);
                int i4 = onExtraCallback + 55;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            }
            this.date = str;
            this.day = str2;
            this.events = list;
        }

        public UiEvents(@NotNull String str, @NotNull String str2, @NotNull List<UiEvent> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.date = str;
            this.day = str2;
            this.events = list;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallback(UiEvents uiEvents, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, uiEvents.date);
            vylVar.onExtraCallback(serialDescriptor, 1, uiEvents.day);
            vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), uiEvents.events);
            int i4 = onExtraCallback + 95;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        public static final /* synthetic */ Lazy[] onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (i3 != 0) {
                int i4 = 25 / 0;
            }
            return lazyArr;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.date;
            int i5 = i3 + 107;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 19;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.day;
            int i5 = i2 + 109;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 51 / 0;
            }
            return str;
        }

        public final List<UiEvent> onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 51;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            List<UiEvent> list = this.events;
            int i5 = i2 + 87;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 62 / 0;
            }
            return list;
        }
    }

    @nc(IAuthTabCallback = "UiEvent")
    @liq
    public static final class UiEvent {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        private final String baseDate;
        private final String time;
        private final String title;
        private final r2ExternalSyntheticLambda3 type;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.calendar.ui.model.CalendarWidgetState$UiEvent$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 121;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = CalendarWidgetState.UiEvent.onExtraCallback();
                int i4 = onWarmupCompleted + 31;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        }), null, null};

        private static final /* synthetic */ KSerializer asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 55;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.securities.widget.data.model.calendar.EventType", r2ExternalSyntheticLambda3.values());
            int i4 = onNavigationEvent + 87;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 97 / 0;
            }
            return kSerializerOnExtraCallbackWithResult;
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerAsInterface = asInterface();
            int i4 = IAuthTabCallback + 89;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerAsInterface;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiEvent)) {
                return false;
            }
            UiEvent uiEvent = (UiEvent) obj;
            if (!Intrinsics.areEqual(this.title, uiEvent.title)) {
                int i4 = IAuthTabCallback + 77;
                onNavigationEvent = i4 % 128;
                return i4 % 2 == 0;
            }
            if (this.type != uiEvent.type) {
                int i5 = IAuthTabCallback + 15;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.baseDate, uiEvent.baseDate)) {
                return Intrinsics.areEqual(this.time, uiEvent.time);
            }
            int i7 = IAuthTabCallback + 87;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((this.title.hashCode() * 31) + this.type.hashCode()) * 31) + this.baseDate.hashCode()) * 31) + this.time.hashCode();
            int i4 = onNavigationEvent + 21;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "UiEvent(title=" + this.title + ", type=" + this.type + ", baseDate=" + this.baseDate + ", time=" + this.time + ")";
            int i2 = onNavigationEvent + 35;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<UiEvent> serializer() {
                CalendarWidgetState$UiEvent$$serializer calendarWidgetState$UiEvent$$serializer;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 3;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    calendarWidgetState$UiEvent$$serializer = CalendarWidgetState$UiEvent$$serializer.INSTANCE;
                    int i3 = 68 / 0;
                } else {
                    calendarWidgetState$UiEvent$$serializer = CalendarWidgetState$UiEvent$$serializer.INSTANCE;
                }
                int i4 = onExtraCallbackWithResult + 55;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return calendarWidgetState$UiEvent$$serializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            int i = onExtraCallback + 15;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ UiEvent(int i, String str, r2ExternalSyntheticLambda3 r2externalsyntheticlambda3, String str2, String str3, okycx okycxVar) {
            if (15 != (i & 15)) {
                int i2 = IAuthTabCallback + 11;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 15, CalendarWidgetState$UiEvent$$serializer.INSTANCE.getDescriptor());
                int i4 = onNavigationEvent + 1;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 % 2;
                } else {
                    int i6 = 2 % 2;
                }
            }
            this.title = str;
            this.type = r2externalsyntheticlambda3;
            this.baseDate = str2;
            this.time = str3;
        }

        public UiEvent(@NotNull String str, @NotNull r2ExternalSyntheticLambda3 r2externalsyntheticlambda3, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(r2externalsyntheticlambda3, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.title = str;
            this.type = r2externalsyntheticlambda3;
            this.baseDate = str2;
            this.time = str3;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallbackWithResult(UiEvent uiEvent, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, uiEvent.title);
            vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), uiEvent.type);
            vylVar.onExtraCallback(serialDescriptor, 2, uiEvent.baseDate);
            vylVar.onExtraCallback(serialDescriptor, 3, uiEvent.time);
            int i4 = onNavigationEvent + 81;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ Lazy[] onWarmupCompleted() {
            Lazy<KSerializer<Object>>[] lazyArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 93;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                lazyArr = $childSerializers;
                int i4 = 57 / 0;
            } else {
                lazyArr = $childSerializers;
            }
            int i5 = i2 + 81;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 / 0;
            }
            return lazyArr;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.title;
            int i4 = i3 + 3;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        public final r2ExternalSyntheticLambda3 onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 87;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            r2ExternalSyntheticLambda3 r2externalsyntheticlambda3 = this.type;
            int i5 = i2 + 9;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return r2externalsyntheticlambda3;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onExtraCallbackWithResult() {
            String str;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 37;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                str = this.time;
                int i4 = 13 / 0;
            } else {
                str = this.time;
            }
            int i5 = i2 + 37;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @nc(IAuthTabCallback = "NetworkError")
    @liq
    public static final class NetworkError extends Exception implements CalendarWidgetState {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        static {
            int i = onNavigationEvent + 7;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallback(NetworkError networkError, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NetworkError> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 115;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                CalendarWidgetState$NetworkError$$serializer calendarWidgetState$NetworkError$$serializer = CalendarWidgetState$NetworkError$$serializer.INSTANCE;
                int i4 = IAuthTabCallback + 117;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return calendarWidgetState$NetworkError$$serializer;
            }
        }

        public NetworkError() {
            super("네트워크 오류가 발생했습니다.");
        }

        public /* synthetic */ NetworkError(int i, okycx okycxVar) {
        }
    }

    @nc(IAuthTabCallback = "GuestUser")
    @liq
    public static final class GuestUser extends Exception implements CalendarWidgetState {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        static {
            int i = onWarmupCompleted + 9;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallbackWithResult(GuestUser guestUser, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 60 / 0;
            }
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<GuestUser> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 13;
                onWarmupCompleted = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    CalendarWidgetState$GuestUser$$serializer calendarWidgetState$GuestUser$$serializer = CalendarWidgetState$GuestUser$$serializer.INSTANCE;
                    obj.hashCode();
                    throw null;
                }
                CalendarWidgetState$GuestUser$$serializer calendarWidgetState$GuestUser$$serializer2 = CalendarWidgetState$GuestUser$$serializer.INSTANCE;
                int i3 = onWarmupCompleted + 7;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return calendarWidgetState$GuestUser$$serializer2;
                }
                obj.hashCode();
                throw null;
            }
        }

        public GuestUser() {
            super("준회원은 사용할 수 없습니다.");
        }

        public /* synthetic */ GuestUser(int i, okycx okycxVar) {
        }
    }

    @nc(IAuthTabCallback = "UndefinedUser")
    @liq
    public static final class UndefinedUser extends Exception implements CalendarWidgetState {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        static {
            int i = IAuthTabCallback + 73;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 45 / 0;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallback(UndefinedUser undefinedUser, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<UndefinedUser> serializer() {
                CalendarWidgetState$UndefinedUser$$serializer calendarWidgetState$UndefinedUser$$serializer;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 113;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    calendarWidgetState$UndefinedUser$$serializer = CalendarWidgetState$UndefinedUser$$serializer.INSTANCE;
                    int i3 = 41 / 0;
                } else {
                    calendarWidgetState$UndefinedUser$$serializer = CalendarWidgetState$UndefinedUser$$serializer.INSTANCE;
                }
                int i4 = onNavigationEvent + 79;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 34 / 0;
                }
                return calendarWidgetState$UndefinedUser$$serializer;
            }
        }

        public UndefinedUser() {
            super("비회원은 사용할 수 없습니다.");
        }

        public /* synthetic */ UndefinedUser(int i, okycx okycxVar) {
        }
    }

    @nc(IAuthTabCallback = "Error")
    @liq
    public static final class Error extends Exception implements CalendarWidgetState {
        public static final int $stable = 8;
        public static final Companion Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final String message;

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = onNavigationEvent + 33;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Error() {
            String str = null;
            this(str, 1, (DefaultConstructorMarker) str);
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Error> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 93;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                CalendarWidgetState$Error$$serializer calendarWidgetState$Error$$serializer = CalendarWidgetState$Error$$serializer.INSTANCE;
                int i4 = IAuthTabCallback + 79;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return calendarWidgetState$Error$$serializer;
            }
        }

        public /* synthetic */ Error(int i, String str, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.message = null;
                int i2 = onWarmupCompleted + 115;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            this.message = str;
            int i4 = onWarmupCompleted + 67;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public Error(@Nullable String str) {
            super(str);
            this.message = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(Error error, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i4 = IAuthTabCallback + 33;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                if (error.getMessage() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, error.getMessage());
                }
            }
            int i6 = IAuthTabCallback + 123;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Error(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 111;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 47;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
                str = null;
            }
            this(str);
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 11;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.message;
            int i5 = i2 + 37;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @nc(IAuthTabCallback = "Loading")
    @liq
    public static final class Loading implements CalendarWidgetState {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        public static final Loading INSTANCE = new Loading();
        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.calendar.ui.model.CalendarWidgetState$Loading$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 37;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = CalendarWidgetState.Loading.onExtraCallback();
                int i4 = onNavigationEvent + 59;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        });

        public static /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onExtraCallbackWithResult + 5;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 99 / 0;
            }
            return kSerializerOnExtraCallbackWithResult;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this != obj) {
                if (obj instanceof Loading) {
                    return true;
                }
                int i2 = onExtraCallback + 71;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = onExtraCallback;
            int i5 = i4 + 69;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 123;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                int i4 = 15 / 0;
            }
            int i5 = i3 + 43;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return -30360629;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 41;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 13;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return "Loading";
        }

        static {
            int i = IAuthTabCallback + 11;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        private Loading() {
        }

        private final /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) $cachedSerializer$delegate.getValue();
            int i4 = onExtraCallback + 59;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializer;
        }

        private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
            int i = 2 % 2;
            htf1 htf1Var = new htf1("Loading", INSTANCE, new Annotation[0]);
            int i2 = onExtraCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return htf1Var;
        }

        public final KSerializer<Loading> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<Loading> kSerializerIAuthTabCallback = IAuthTabCallback();
            int i4 = onExtraCallbackWithResult + 87;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @liq
    public static final class Maintenance implements CalendarWidgetState {
        public static final int $stable = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final Maintenance INSTANCE = new Maintenance();
        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.calendar.ui.model.CalendarWidgetState$Maintenance$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 27;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = CalendarWidgetState.Maintenance.IAuthTabCallback();
                int i4 = IAuthTabCallback + 25;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 96 / 0;
                }
                return kSerializerIAuthTabCallback;
            }
        });

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnNavigationEvent = onNavigationEvent();
            int i4 = onNavigationEvent + 111;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnNavigationEvent;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 71;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this != obj) {
                return obj instanceof Maintenance;
            }
            int i5 = i2 + 99;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 101;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 17;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return -579801566;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 69;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return "Maintenance";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        private Maintenance() {
        }

        private final /* synthetic */ KSerializer onExtraCallback() {
            KSerializer kSerializer;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                kSerializer = (KSerializer) $cachedSerializer$delegate.getValue();
                int i3 = 46 / 0;
            } else {
                kSerializer = (KSerializer) $cachedSerializer$delegate.getValue();
            }
            int i4 = onExtraCallback + 111;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final /* synthetic */ KSerializer onNavigationEvent() {
            int i = 2 % 2;
            htf1 htf1Var = new htf1("im.toss.securities.widget.calendar.ui.model.CalendarWidgetState.Maintenance", INSTANCE, new Annotation[0]);
            int i2 = onNavigationEvent + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return htf1Var;
        }

        public final KSerializer<Maintenance> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<Maintenance> kSerializerOnExtraCallback = onExtraCallback();
            if (i3 == 0) {
                int i4 = 91 / 0;
            }
            return kSerializerOnExtraCallback;
        }
    }
}
