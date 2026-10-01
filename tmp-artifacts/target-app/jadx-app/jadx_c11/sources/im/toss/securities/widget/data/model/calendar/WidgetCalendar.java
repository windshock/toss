package im.toss.securities.widget.data.model.calendar;

import im.toss.securities.widget.data.model.calendar.WidgetCalendar$;
import java.util.List;
import java.util.Map;
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
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class WidgetCalendar {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final Map<String, List<Event>> events;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.data.model.calendar.WidgetCalendar$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallback = WidgetCalendar.onExtraCallback();
            int i4 = onNavigationEvent + 5;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 90 / 0;
            }
            return kSerializerOnExtraCallback;
        }
    })};

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        throw null;
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, new checkCanOpenLandingPage(Event$$serializer.INSTANCE));
        int i2 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return getmutilbackgrounddrawable;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof WidgetCalendar) || !Intrinsics.areEqual(this.events, ((WidgetCalendar) obj).events)) {
            return false;
        }
        int i4 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.events.hashCode();
        int i4 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "WidgetCalendar(events=" + this.events + ")";
        int i2 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 43 / 0;
        }
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

        public final KSerializer<WidgetCalendar> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            WidgetCalendar$.serializer serializerVar = WidgetCalendar$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 3;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ WidgetCalendar(int i, Map map, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, WidgetCalendar$.serializer.INSTANCE.getDescriptor());
            int i4 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 2;
            } else {
                int i6 = 2 % 2;
            }
        }
        this.events = map;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(WidgetCalendar widgetCalendar, vyl vylVar, SerialDescriptor serialDescriptor) {
        py pyVar;
        Map<String, List<Event>> map;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = 0;
        if (i2 % 2 == 0) {
            pyVar = (py) $childSerializers[0].getValue();
            map = widgetCalendar.events;
            i3 = 1;
        } else {
            pyVar = (py) $childSerializers[0].getValue();
            map = widgetCalendar.events;
        }
        vylVar.onNavigationEvent(serialDescriptor, i3, pyVar, map);
        int i4 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 35;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i2 + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return lazyArr;
    }

    public final Map<String, List<Event>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Map<String, List<Event>> map = this.events;
        int i5 = i3 + 79;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
