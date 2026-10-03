package viva.republica.toss.ads;

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
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RedirectionLogRecord {
    public static final int $stable = 0;
    private final long createdAt;
    private final String id;
    private final Map<String, String> params;
    private final int retryCount;
    private final long userNo;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.ads.RedirectionLogRecord$$ExternalSyntheticLambda0
        public final Object invoke() {
            return RedirectionLogRecord.asBinder();
        }
    }), null, null};

    public static /* synthetic */ RedirectionLogRecord IAuthTabCallback(RedirectionLogRecord redirectionLogRecord, String str, long j, Map map, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = redirectionLogRecord.id;
        }
        if ((i2 & 2) != 0) {
            j = redirectionLogRecord.userNo;
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            map = redirectionLogRecord.params;
        }
        Map map2 = map;
        if ((i2 & 8) != 0) {
            j2 = redirectionLogRecord.createdAt;
        }
        long j4 = j2;
        if ((i2 & 16) != 0) {
            i = redirectionLogRecord.retryCount;
        }
        return redirectionLogRecord.onNavigationEvent(str, j3, map2, j4, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer asBinder() {
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        return new getMutilBackgroundDrawable(getwrigglelayout, getwrigglelayout);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RedirectionLogRecord)) {
            return false;
        }
        RedirectionLogRecord redirectionLogRecord = (RedirectionLogRecord) obj;
        return Intrinsics.areEqual(this.id, redirectionLogRecord.id) && this.userNo == redirectionLogRecord.userNo && Intrinsics.areEqual(this.params, redirectionLogRecord.params) && this.createdAt == redirectionLogRecord.createdAt && this.retryCount == redirectionLogRecord.retryCount;
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + Long.hashCode(this.userNo)) * 31) + this.params.hashCode()) * 31) + Long.hashCode(this.createdAt)) * 31) + Integer.hashCode(this.retryCount);
    }

    public final RedirectionLogRecord onNavigationEvent(@NotNull String str, long j, @NotNull Map<String, String> map, long j2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new RedirectionLogRecord(str, j, map, j2, i);
    }

    public String toString() {
        return "RedirectionLogRecord(id=" + this.id + ", userNo=" + this.userNo + ", params=" + this.params + ", createdAt=" + this.createdAt + ", retryCount=" + this.retryCount + ")";
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RedirectionLogRecord> serializer() {
            return RedirectionLogRecord$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RedirectionLogRecord(int i, String str, long j, Map map, long j2, int i2, okycx okycxVar) {
        if (15 != (i & 15)) {
            htf31.onExtraCallbackWithResult(i, 15, RedirectionLogRecord$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.userNo = j;
        this.params = map;
        this.createdAt = j2;
        if ((i & 16) == 0) {
            this.retryCount = 0;
        } else {
            this.retryCount = i2;
        }
    }

    public RedirectionLogRecord(@NotNull String str, long j, @NotNull Map<String, String> map, long j2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.id = str;
        this.userNo = j;
        this.params = map;
        this.createdAt = j2;
        this.retryCount = i;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(RedirectionLogRecord redirectionLogRecord, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, redirectionLogRecord.id);
        vylVar.onExtraCallback(serialDescriptor, 1, redirectionLogRecord.userNo);
        vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), redirectionLogRecord.params);
        vylVar.onExtraCallback(serialDescriptor, 3, redirectionLogRecord.createdAt);
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || redirectionLogRecord.retryCount != 0) {
            vylVar.onExtraCallback(serialDescriptor, 4, redirectionLogRecord.retryCount);
        }
    }

    public /* synthetic */ RedirectionLogRecord(String str, long j, Map map, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, map, j2, (i2 & 16) != 0 ? 0 : i);
    }

    public final String onExtraCallbackWithResult() {
        return this.id;
    }

    public final long IAuthTabCallbackDefault() {
        return this.userNo;
    }

    public final Map<String, String> IAuthTabCallback() {
        return this.params;
    }

    public final long onNavigationEvent() {
        return this.createdAt;
    }

    public final int asInterface() {
        return this.retryCount;
    }
}
