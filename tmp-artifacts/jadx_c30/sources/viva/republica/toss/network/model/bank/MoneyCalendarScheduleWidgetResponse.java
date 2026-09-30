package viva.republica.toss.network.model.bank;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class MoneyCalendarScheduleWidgetResponse {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String landingScheme;
    private final List<ScheduleEvent> latestEvents;
    private final List<ScheduleEvent> todayEvents;

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(MoneyCalendarScheduleWidgetResponse$ScheduleEvent$$serializer.INSTANCE);
        int i2 = onWarmupCompleted + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
        return checkcanopenlandingpage;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(MoneyCalendarScheduleWidgetResponse$ScheduleEvent$$serializer.INSTANCE);
        int i2 = onNavigationEvent + 119;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            asInterface();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerAsInterface = asInterface();
        int i3 = onNavigationEvent + 73;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerAsInterface;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStub();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i3 = onNavigationEvent + 75;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerIAuthTabCallbackStub;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 53;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyCalendarScheduleWidgetResponse)) {
            int i5 = i2 + 95;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        MoneyCalendarScheduleWidgetResponse moneyCalendarScheduleWidgetResponse = (MoneyCalendarScheduleWidgetResponse) obj;
        if (!Intrinsics.areEqual(this.todayEvents, moneyCalendarScheduleWidgetResponse.todayEvents)) {
            int i7 = onWarmupCompleted + 15;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.latestEvents, moneyCalendarScheduleWidgetResponse.latestEvents)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.landingScheme, moneyCalendarScheduleWidgetResponse.landingScheme))) {
            return true;
        }
        int i9 = onNavigationEvent + 45;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onWarmupCompleted = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((this.todayEvents.hashCode() * 41) >>> this.latestEvents.hashCode()) + 91) >>> this.landingScheme.hashCode() : (((this.todayEvents.hashCode() * 31) + this.latestEvents.hashCode()) * 31) + this.landingScheme.hashCode();
        int i3 = onNavigationEvent + 75;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MoneyCalendarScheduleWidgetResponse(todayEvents=" + this.todayEvents + ", latestEvents=" + this.latestEvents + ", landingScheme=" + this.landingScheme + ")";
        int i2 = onWarmupCompleted + 123;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MoneyCalendarScheduleWidgetResponse> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            MoneyCalendarScheduleWidgetResponse$$serializer moneyCalendarScheduleWidgetResponse$$serializer = MoneyCalendarScheduleWidgetResponse$$serializer.INSTANCE;
            if (i3 == 0) {
                return moneyCalendarScheduleWidgetResponse$$serializer;
            }
            throw null;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.bank.MoneyCalendarScheduleWidgetResponse$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 53;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return MoneyCalendarScheduleWidgetResponse.onExtraCallback();
                }
                MoneyCalendarScheduleWidgetResponse.onExtraCallback();
                throw null;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.bank.MoneyCalendarScheduleWidgetResponse$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 125;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return MoneyCalendarScheduleWidgetResponse.onExtraCallbackWithResult();
                }
                MoneyCalendarScheduleWidgetResponse.onExtraCallbackWithResult();
                throw null;
            }
        }), null};
        int i = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ MoneyCalendarScheduleWidgetResponse(int i, List list, List list2, String str, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 7;
        if (7 != (i & 7)) {
            int i3 = onWarmupCompleted + 97;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = MoneyCalendarScheduleWidgetResponse$$serializer.INSTANCE.getDescriptor();
                i2 = 113;
            } else {
                descriptor = MoneyCalendarScheduleWidgetResponse$$serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.todayEvents = list;
        this.latestEvents = list2;
        this.landingScheme = str;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 83;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i2 + 89;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(MoneyCalendarScheduleWidgetResponse moneyCalendarScheduleWidgetResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), moneyCalendarScheduleWidgetResponse.todayEvents);
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), moneyCalendarScheduleWidgetResponse.latestEvents);
        vylVar.onExtraCallback(serialDescriptor, 2, moneyCalendarScheduleWidgetResponse.landingScheme);
        int i4 = onWarmupCompleted + 71;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public final List<ScheduleEvent> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 91;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        List<ScheduleEvent> list = this.todayEvents;
        int i5 = i2 + 5;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<ScheduleEvent> onNavigationEvent() {
        List<ScheduleEvent> list;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 87;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            list = this.latestEvents;
            int i4 = 42 / 0;
        } else {
            list = this.latestEvents;
        }
        int i5 = i2 + 111;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    @liq
    public static final class ScheduleEvent {
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final ScheduleEventColor color;
        private final String contents;
        private final String date;

        static {
            int i = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                int i4 = i3 + 37;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            if (!(obj instanceof ScheduleEvent)) {
                return false;
            }
            ScheduleEvent scheduleEvent = (ScheduleEvent) obj;
            if (!Intrinsics.areEqual(this.date, scheduleEvent.date)) {
                int i6 = onNavigationEvent + 29;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.contents, scheduleEvent.contents))) {
                return Intrinsics.areEqual(this.color, scheduleEvent.color);
            }
            int i8 = onExtraCallback + 21;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.date.hashCode();
            return i3 == 0 ? (((iHashCode / 23) * this.contents.hashCode()) >>> 85) >> this.color.hashCode() : (((iHashCode * 31) + this.contents.hashCode()) * 31) + this.color.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ScheduleEvent(date=" + this.date + ", contents=" + this.contents + ", color=" + this.color + ")";
            int i2 = onNavigationEvent + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ScheduleEvent> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 37;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                MoneyCalendarScheduleWidgetResponse$ScheduleEvent$$serializer moneyCalendarScheduleWidgetResponse$ScheduleEvent$$serializer = MoneyCalendarScheduleWidgetResponse$ScheduleEvent$$serializer.INSTANCE;
                if (i3 == 0) {
                    return moneyCalendarScheduleWidgetResponse$ScheduleEvent$$serializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public /* synthetic */ ScheduleEvent(int i, String str, String str2, ScheduleEventColor scheduleEventColor, okycx okycxVar) {
            if (7 != (i & 7)) {
                int i2 = onExtraCallback + 11;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 7, MoneyCalendarScheduleWidgetResponse$ScheduleEvent$$serializer.INSTANCE.getDescriptor());
                int i4 = onNavigationEvent + 91;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 % 2;
                } else {
                    int i6 = 2 % 2;
                }
            }
            this.date = str;
            this.contents = str2;
            this.color = scheduleEventColor;
        }

        @JvmStatic
        public static final /* synthetic */ void onNavigationEvent(ScheduleEvent scheduleEvent, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                vylVar.onExtraCallback(serialDescriptor, 1, scheduleEvent.date);
                vylVar.onExtraCallback(serialDescriptor, 0, scheduleEvent.contents);
                vylVar.onNavigationEvent(serialDescriptor, 4, MoneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer.INSTANCE, scheduleEvent.color);
            } else {
                vylVar.onExtraCallback(serialDescriptor, 0, scheduleEvent.date);
                vylVar.onExtraCallback(serialDescriptor, 1, scheduleEvent.contents);
                vylVar.onNavigationEvent(serialDescriptor, 2, MoneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer.INSTANCE, scheduleEvent.color);
            }
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.date;
            int i5 = i3 + 1;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.contents;
            int i5 = i3 + 125;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final ScheduleEventColor onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 37;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ScheduleEventColor scheduleEventColor = this.color;
            int i4 = i2 + 11;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 32 / 0;
            }
            return scheduleEventColor;
        }
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            str = this.landingScheme;
            int i4 = 76 / 0;
        } else {
            str = this.landingScheme;
        }
        int i5 = i3 + 89;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @liq
    public static final class ScheduleEventColor {
        public static final Companion Companion = new Companion(null);
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final ScheduleColorVariant background;
        private final ScheduleColorVariant line;
        private final ScheduleColorVariant text;

        static {
            int i = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                int i2 = 23 / 0;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScheduleEventColor)) {
                return false;
            }
            ScheduleEventColor scheduleEventColor = (ScheduleEventColor) obj;
            if (!Intrinsics.areEqual(this.background, scheduleEventColor.background)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.line, scheduleEventColor.line)) {
                int i2 = onExtraCallback + 35;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.text, scheduleEventColor.text)) {
                return true;
            }
            int i4 = onNavigationEvent + 87;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 71;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            ScheduleColorVariant scheduleColorVariant = this.background;
            if (scheduleColorVariant == null) {
                i = 0;
            } else {
                int iHashCode = scheduleColorVariant.hashCode();
                int i5 = onNavigationEvent + 39;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                i = iHashCode;
            }
            return (((i * 31) + this.line.hashCode()) * 31) + this.text.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ScheduleEventColor(background=" + this.background + ", line=" + this.line + ", text=" + this.text + ")";
            int i2 = onNavigationEvent + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ScheduleEventColor> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 59;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    MoneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer moneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer = MoneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer.INSTANCE;
                    throw null;
                }
                MoneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer moneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer2 = MoneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer.INSTANCE;
                int i3 = onWarmupCompleted + 9;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 20 / 0;
                }
                return moneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ ScheduleEventColor(int i, ScheduleColorVariant scheduleColorVariant, ScheduleColorVariant scheduleColorVariant2, ScheduleColorVariant scheduleColorVariant3, okycx okycxVar) {
            int i2;
            if (6 != (i & 6)) {
                htf31.onExtraCallbackWithResult(i, 6, MoneyCalendarScheduleWidgetResponse$ScheduleEventColor$$serializer.INSTANCE.getDescriptor());
                int i3 = onNavigationEvent + 3;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            }
            if ((i & 1) == 0) {
                this.background = null;
                int i6 = onExtraCallback + 107;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                }
                this.line = scheduleColorVariant2;
                this.text = scheduleColorVariant3;
                i2 = onNavigationEvent + 41;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i7 = 55 / 0;
                    return;
                }
                return;
            }
            this.background = scheduleColorVariant;
            int i8 = 2 % 2;
            this.line = scheduleColorVariant2;
            this.text = scheduleColorVariant3;
            i2 = onNavigationEvent + 41;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onWarmupCompleted(ScheduleEventColor scheduleEventColor, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            if (!(!vylVar.onWarmupCompleted(serialDescriptor, 0))) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, MoneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer.INSTANCE, scheduleEventColor.background);
                int i2 = onExtraCallback + 57;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 4 % 5;
                }
            } else {
                int i4 = onExtraCallback + 101;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    ScheduleColorVariant scheduleColorVariant = scheduleEventColor.background;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (scheduleEventColor.background != null) {
                }
            }
            MoneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer moneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer = MoneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer.INSTANCE;
            vylVar.onNavigationEvent(serialDescriptor, 1, moneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer, scheduleEventColor.line);
            vylVar.onNavigationEvent(serialDescriptor, 2, moneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer, scheduleEventColor.text);
        }

        public final ScheduleColorVariant onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return this.background;
            }
            throw null;
        }

        public final ScheduleColorVariant onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 51;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            ScheduleColorVariant scheduleColorVariant = this.line;
            int i5 = i2 + 93;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return scheduleColorVariant;
        }

        public final ScheduleColorVariant IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 45;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            ScheduleColorVariant scheduleColorVariant = this.text;
            int i5 = i2 + 51;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return scheduleColorVariant;
        }
    }

    @liq
    public static final class ScheduleColorVariant {
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final String dark;
        private final String light;

        static {
            int i = IAuthTabCallback + 111;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ScheduleColorVariant() {
            String str = null;
            this(str, str, 3, (DefaultConstructorMarker) str);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScheduleColorVariant)) {
                int i2 = onWarmupCompleted + 107;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            ScheduleColorVariant scheduleColorVariant = (ScheduleColorVariant) obj;
            if (!Intrinsics.areEqual(this.dark, scheduleColorVariant.dark)) {
                int i4 = onWarmupCompleted + 61;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.light, scheduleColorVariant.light)) {
                return true;
            }
            int i6 = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            String str = this.dark;
            int iHashCode2 = 0;
            if (str == null) {
                int i2 = onWarmupCompleted + 23;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            String str2 = this.light;
            if (str2 != null) {
                int i4 = onWarmupCompleted + 85;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int iHashCode3 = str2.hashCode();
                    int i5 = 61 / 0;
                    iHashCode2 = iHashCode3;
                } else {
                    iHashCode2 = str2.hashCode();
                }
            }
            return (iHashCode * 31) + iHashCode2;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ScheduleColorVariant(dark=" + this.dark + ", light=" + this.light + ")";
            int i2 = onExtraCallbackWithResult + 125;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ScheduleColorVariant> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 3;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                MoneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer moneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer = MoneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer.INSTANCE;
                int i4 = onExtraCallback + 109;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return moneyCalendarScheduleWidgetResponse$ScheduleColorVariant$$serializer;
                }
                throw null;
            }
        }

        public /* synthetic */ ScheduleColorVariant(int i, String str, String str2, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.dark = null;
                int i2 = onExtraCallbackWithResult + 49;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } else {
                this.dark = str;
            }
            if ((i & 2) != 0) {
                this.light = str2;
                return;
            }
            int i4 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            this.light = null;
        }

        public ScheduleColorVariant(@Nullable String str, @Nullable String str2) {
            this.dark = str;
            this.light = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void IAuthTabCallback(ScheduleColorVariant scheduleColorVariant, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, scheduleColorVariant.dark);
            } else {
                int i3 = onWarmupCompleted + 103;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (scheduleColorVariant.dark != null) {
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || scheduleColorVariant.light != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, scheduleColorVariant.light);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ScheduleColorVariant(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onWarmupCompleted + 27;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                str = null;
            }
            if ((i & 2) != 0) {
                int i4 = onWarmupCompleted + 13;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
                str2 = null;
            }
            this(str, str2);
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            String str = this.dark;
            if (i3 != 0) {
                int i4 = 68 / 0;
            }
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 83;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.light;
            int i5 = i2 + 91;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }
}
