package im.toss.securities.widget.data.model.calendar;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.r2ExternalSyntheticLambda3;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class Event {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String baseDate;
    private final String dateTime;
    private final String title;
    private final r2ExternalSyntheticLambda3 type;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.data.model.calendar.Event$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnWarmupCompleted = Event.onWarmupCompleted();
            int i4 = onExtraCallbackWithResult + 73;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnWarmupCompleted;
        }
    }), null, null};

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.securities.widget.data.model.calendar.EventType", r2ExternalSyntheticLambda3.values());
        int i4 = onExtraCallbackWithResult + 21;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            asInterface();
            throw null;
        }
        KSerializer kSerializerAsInterface = asInterface();
        int i3 = onExtraCallback + 119;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerAsInterface;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        if (!Intrinsics.areEqual(this.title, event.title)) {
            int i2 = onExtraCallbackWithResult + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.type != event.type) {
            int i4 = onExtraCallbackWithResult + 83;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.baseDate, event.baseDate)) {
            int i6 = onExtraCallback + 45;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.dateTime, event.dateTime)) {
            return true;
        }
        int i8 = onExtraCallbackWithResult + 71;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 39;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.title.hashCode();
        int iHashCode2 = this.type.hashCode();
        int iHashCode3 = this.baseDate.hashCode();
        String str = this.dateTime;
        if (str == null) {
            int i5 = onExtraCallbackWithResult + 37;
            onExtraCallback = i5 % 128;
            i = i5 % 2 == 0 ? 1 : 0;
        } else {
            int iHashCode4 = str.hashCode();
            int i6 = onExtraCallbackWithResult + 65;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 2;
            }
            i = iHashCode4;
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Event(title=" + this.title + ", type=" + this.type + ", baseDate=" + this.baseDate + ", dateTime=" + this.dateTime + ")";
        int i2 = onExtraCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Event> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Event$$serializer event$$serializer = Event$$serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return event$$serializer;
        }
    }

    static {
        int i = onWarmupCompleted + 31;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Event(int i, String str, r2ExternalSyntheticLambda3 r2externalsyntheticlambda3, String str2, String str3, okycx okycxVar) {
        if (13 != (i & 13)) {
            htf31.onExtraCallbackWithResult(i, 13, Event$$serializer.INSTANCE.getDescriptor());
            int i2 = 2 % 2;
        }
        this.title = str;
        if ((i & 2) == 0) {
            this.type = r2ExternalSyntheticLambda3.UNKNOWN;
            int i3 = onExtraCallbackWithResult + 51;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 / 5;
            } else {
                int i5 = 2 % 2;
            }
        } else {
            this.type = r2externalsyntheticlambda3;
            int i6 = onExtraCallback + 13;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
            }
        }
        this.baseDate = str2;
        this.dateTime = str3;
        int i7 = onExtraCallbackWithResult + 87;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(Event event, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, event.title);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i2 = onExtraCallback + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (event.type != r2ExternalSyntheticLambda3.UNKNOWN) {
                vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), event.type);
                int i4 = onExtraCallbackWithResult + 117;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 2, event.baseDate);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, event.dateTime);
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 47;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
        return lazyArr;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.title;
        int i4 = i3 + 95;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final r2ExternalSyntheticLambda3 onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.type;
        }
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.baseDate;
        int i5 = i3 + 55;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 87;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.dateTime;
        int i5 = i2 + 75;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
