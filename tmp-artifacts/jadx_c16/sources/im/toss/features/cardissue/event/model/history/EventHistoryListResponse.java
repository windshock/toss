package im.toss.features.cardissue.event.model.history;

import im.toss.features.cardissue.event.model.history.EventHistoryItemResponse$;
import im.toss.features.cardissue.event.model.history.EventHistoryListResponse$;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access8100;
import o.checkCanOpenLandingPage;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class EventHistoryListResponse {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final Map<String, List<EventHistoryItemResponse>> entrypointsByYearMonth;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new EventHistoryListResponse$.ExternalSyntheticLambda0())};

    /* JADX WARN: Illegal instructions before constructor call */
    public EventHistoryListResponse() {
        Map map = null;
        this(map, 1, (DefaultConstructorMarker) map);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, new checkCanOpenLandingPage(EventHistoryItemResponse$.serializer.INSTANCE));
        int i2 = IAuthTabCallback + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return getmutilbackgrounddrawable;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 121;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof EventHistoryListResponse)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.entrypointsByYearMonth, ((EventHistoryListResponse) obj).entrypointsByYearMonth))) {
            return true;
        }
        int i3 = onExtraCallback + 101;
        IAuthTabCallback = i3 % 128;
        return i3 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.entrypointsByYearMonth.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.entrypointsByYearMonth.hashCode();
        int i3 = onExtraCallback + 19;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 66 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EventHistoryListResponse(entrypointsByYearMonth=" + this.entrypointsByYearMonth + ")";
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static {
        int i = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ EventHistoryListResponse(int i, Map map, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.entrypointsByYearMonth = access8100.onNavigationEvent();
            int i2 = onExtraCallback + 85;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.entrypointsByYearMonth = map;
        int i4 = IAuthTabCallback + 67;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventHistoryListResponse(@NotNull Map<String, ? extends List<EventHistoryItemResponse>> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.entrypointsByYearMonth = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r1
      0x0021: PHI (r1v9 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(EventHistoryListResponse eventHistoryListResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i3 = IAuthTabCallback + 125;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (Intrinsics.areEqual(eventHistoryListResponse.entrypointsByYearMonth, access8100.onNavigationEvent())) {
                    return;
                }
            }
        } else {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            }
        }
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), eventHistoryListResponse.entrypointsByYearMonth);
        int i5 = onExtraCallback + 57;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 93;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EventHistoryListResponse(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 97;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            map = access8100.onNavigationEvent();
            int i4 = IAuthTabCallback + 83;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this(map);
    }

    public final Map<String, List<EventHistoryItemResponse>> onWarmupCompleted() {
        Map<String, List<EventHistoryItemResponse>> map;
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            map = this.entrypointsByYearMonth;
            int i4 = 56 / 0;
        } else {
            map = this.entrypointsByYearMonth;
        }
        int i5 = i3 + 99;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }
}
