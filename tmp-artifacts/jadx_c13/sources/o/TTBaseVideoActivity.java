package o;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTBaseVideoActivity {
    private final boolean IAuthTabCallback;
    private final TTFullScreenVideoActivity3 IAuthTabCallbackStub;
    private final Long asInterface;
    private final boolean onExtraCallback;
    private final Map<KClass<?>, Object> onExtraCallbackWithResult;
    private final Long onNavigationEvent;
    private final Long onTransact;
    private final Long onWarmupCompleted;

    public TTBaseVideoActivity() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }

    public TTBaseVideoActivity(boolean z, boolean z2, @Nullable TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @NotNull Map<KClass<?>, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.IAuthTabCallback = z;
        this.onExtraCallback = z2;
        this.IAuthTabCallbackStub = tTFullScreenVideoActivity3;
        this.onTransact = l;
        this.onNavigationEvent = l2;
        this.asInterface = l3;
        this.onWarmupCompleted = l4;
        this.onExtraCallbackWithResult = access8000.getInterfaceDescriptor(map);
    }

    public final boolean onNavigationEvent() {
        return this.onExtraCallback;
    }

    public final TTFullScreenVideoActivity3 onExtraCallbackWithResult() {
        return this.IAuthTabCallbackStub;
    }

    public final Long onExtraCallback() {
        return this.onTransact;
    }

    public final Long IAuthTabCallback() {
        return this.asInterface;
    }

    public /* synthetic */ TTBaseVideoActivity(boolean z, boolean z2, TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, Long l, Long l2, Long l3, Long l4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? null : tTFullScreenVideoActivity3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : l3, (i & 64) == 0 ? l4 : null, (i & 128) != 0 ? access8000.IAuthTabCallback() : map);
    }

    public final TTBaseVideoActivity onExtraCallbackWithResult(boolean z, boolean z2, @Nullable TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @NotNull Map<KClass<?>, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return new TTBaseVideoActivity(z, z2, tTFullScreenVideoActivity3, l, l2, l3, l4, map);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.IAuthTabCallback) {
            arrayList.add("isRegularFile");
        }
        if (this.onExtraCallback) {
            arrayList.add("isDirectory");
        }
        if (this.onTransact != null) {
            arrayList.add("byteCount=" + this.onTransact.longValue());
        }
        if (this.onNavigationEvent != null) {
            arrayList.add("createdAt=" + this.onNavigationEvent.longValue());
        }
        if (this.asInterface != null) {
            arrayList.add("lastModifiedAt=" + this.asInterface.longValue());
        }
        if (this.onWarmupCompleted != null) {
            arrayList.add("lastAccessedAt=" + this.onWarmupCompleted.longValue());
        }
        if (!this.onExtraCallbackWithResult.isEmpty()) {
            arrayList.add("extras=" + this.onExtraCallbackWithResult);
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }
}
