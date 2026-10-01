package im.toss.features.cardissue.event.model.issuance;

import im.toss.features.cardissue.event.model.issuance.EventIssuanceItemResponse$;
import im.toss.features.cardissue.event.model.issuance.EventIssuanceListResponse$;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class EventIssuanceListResponse {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final List<EventIssuanceItemResponse> entrypoints;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new EventIssuanceListResponse$.ExternalSyntheticLambda0())};

    /* JADX WARN: Illegal instructions before constructor call */
    public EventIssuanceListResponse() {
        List list = null;
        this(list, 1, (DefaultConstructorMarker) list);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i4 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnWarmupCompleted;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(EventIssuanceItemResponse$.serializer.INSTANCE);
        int i2 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventIssuanceListResponse)) {
            int i2 = onExtraCallbackWithResult + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.entrypoints, ((EventIssuanceListResponse) obj).entrypoints)) {
            int i4 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            this.entrypoints.hashCode();
            throw null;
        }
        int iHashCode = this.entrypoints.hashCode();
        int i3 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EventIssuanceListResponse(entrypoints=" + this.entrypoints + ")";
        int i2 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = onExtraCallback + 73;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ EventIssuanceListResponse(int i, List list, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.entrypoints = CollectionsKt.emptyList();
            int i2 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.entrypoints = list;
        int i4 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public EventIssuanceListResponse(@NotNull List<EventIssuanceItemResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.entrypoints = list;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(EventIssuanceListResponse eventIssuanceListResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            List<EventIssuanceItemResponse> list = eventIssuanceListResponse.entrypoints;
            if (i5 != 0) {
                int i6 = 64 / 0;
                if (Intrinsics.areEqual(list, CollectionsKt.emptyList())) {
                    return;
                }
            } else if (Intrinsics.areEqual(list, CollectionsKt.emptyList())) {
                return;
            }
        }
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), eventIssuanceListResponse.entrypoints);
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EventIssuanceListResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                list = CollectionsKt.emptyList();
                int i3 = 2 % 2;
            } else {
                CollectionsKt.emptyList();
                throw null;
            }
        }
        this(list);
    }

    public final List<EventIssuanceItemResponse> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 67;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        List<EventIssuanceItemResponse> list = this.entrypoints;
        int i5 = i2 + 27;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }
}
