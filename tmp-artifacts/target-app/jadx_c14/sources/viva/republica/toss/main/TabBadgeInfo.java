package viva.republica.toss.main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.SkiaPooledImageRegionDecoder1CpuFilter;
import o.liq;
import org.jetbrains.annotations.NotNull;

@liq(onNavigationEvent = SkiaPooledImageRegionDecoder1CpuFilter.class)
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TabBadgeInfo extends HashMap<String, Boolean> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TabBadgeInfo> serializer() {
            return SkiaPooledImageRegionDecoder1CpuFilter.onWarmupCompleted;
        }
    }

    public Collection<Boolean> IAuthTabCallback() {
        return super.values();
    }

    public boolean IAuthTabCallback(String str) {
        return super.containsKey(str);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return IAuthTabCallback((String) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj instanceof Boolean) {
            return onWarmupCompleted((Boolean) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<String, Boolean>> entrySet() {
        return onExtraCallback();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj instanceof String) {
            return onNavigationEvent((String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof String) ? obj2 : onNavigationEvent((String) obj, (Boolean) obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<String> keySet() {
        return onWarmupCompleted();
    }

    public Set<Map.Entry<String, Boolean>> onExtraCallback() {
        return super.entrySet();
    }

    public int onExtraCallbackWithResult() {
        return super.size();
    }

    public Boolean onExtraCallbackWithResult(String str) {
        return (Boolean) super.remove(str);
    }

    public boolean onExtraCallbackWithResult(String str, Boolean bool) {
        return super.remove(str, bool);
    }

    public Boolean onNavigationEvent(String str) {
        return (Boolean) super.get(str);
    }

    public Boolean onNavigationEvent(String str, Boolean bool) {
        return (Boolean) super.getOrDefault(str, bool);
    }

    public Set<String> onWarmupCompleted() {
        return super.keySet();
    }

    public boolean onWarmupCompleted(Boolean bool) {
        return super.containsValue(bool);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        if (obj instanceof String) {
            return onExtraCallbackWithResult((String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof Boolean)) {
            return onExtraCallbackWithResult((String) obj, (Boolean) obj2);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        return onExtraCallbackWithResult();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Collection<Boolean> values() {
        return IAuthTabCallback();
    }

    public TabBadgeInfo() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabBadgeInfo(@NotNull Map<String, Boolean> map) {
        super(map);
        Intrinsics.checkNotNullParameter(map, "");
    }
}
