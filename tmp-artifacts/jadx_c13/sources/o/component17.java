package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import javax.annotation.Nullable;
import o.TombstoneParserCompanion;
import o.component17;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class component17<V> {
    private final Function<TombstoneParserCompanion, V> IAuthTabCallbackDefault;
    private final Map<String, V> IAuthTabCallback = new ConcurrentHashMap();
    private final Map<String, Map<String, V>> onWarmupCompleted = new ConcurrentHashMap();
    private final Map<String, Map<String, V>> onExtraCallback = new ConcurrentHashMap();
    private final Map<String, Map<String, Map<String, V>>> onExtraCallbackWithResult = new ConcurrentHashMap();
    private final Object IAuthTabCallbackStub = new Object();
    private final Set<V> onNavigationEvent = Collections.newSetFromMap(new IdentityHashMap());

    public component17(Function<TombstoneParserCompanion, V> function) {
        this.IAuthTabCallbackDefault = function;
    }

    public V IAuthTabCallback(final String str, @Nullable final String str2, @Nullable String str3, final getScreenDensityDpi getscreendensitydpi) {
        if (str2 != null && str3 != null) {
            return this.onExtraCallbackWithResult.computeIfAbsent(str, new Function() { // from class: io.opentelemetry.sdk.internal.ComponentRegistry$$ExternalSyntheticLambda0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return component17.onExtraCallback((String) obj);
                }
            }).computeIfAbsent(str2, new Function() { // from class: io.opentelemetry.sdk.internal.ComponentRegistry$$ExternalSyntheticLambda1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return component17.onExtraCallbackWithResult((String) obj);
                }
            }).computeIfAbsent(str3, new Function() { // from class: io.opentelemetry.sdk.internal.ComponentRegistry$$ExternalSyntheticLambda2
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    component17 component17Var = this.f$0;
                    String str4 = str;
                    return component17Var.onWarmupCompleted(TombstoneParserCompanion.onExtraCallbackWithResult(str4).onWarmupCompleted(str2).onExtraCallbackWithResult((String) obj).onExtraCallback(getscreendensitydpi).onWarmupCompleted());
                }
            });
        }
        if (str2 != null) {
            return this.onWarmupCompleted.computeIfAbsent(str, new Function() { // from class: io.opentelemetry.sdk.internal.ComponentRegistry$$ExternalSyntheticLambda3
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return component17.onNavigationEvent((String) obj);
                }
            }).computeIfAbsent(str2, new Function() { // from class: io.opentelemetry.sdk.internal.ComponentRegistry$$ExternalSyntheticLambda4
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return this.f$0.onWarmupCompleted(TombstoneParserCompanion.onExtraCallbackWithResult(str).onWarmupCompleted((String) obj).onExtraCallback(getscreendensitydpi).onWarmupCompleted());
                }
            });
        }
        if (str3 != null) {
            return this.onExtraCallback.computeIfAbsent(str, new Function() { // from class: io.opentelemetry.sdk.internal.ComponentRegistry$$ExternalSyntheticLambda5
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return component17.onWarmupCompleted((String) obj);
                }
            }).computeIfAbsent(str3, new Function() { // from class: io.opentelemetry.sdk.internal.ComponentRegistry$$ExternalSyntheticLambda6
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return this.f$0.onWarmupCompleted(TombstoneParserCompanion.onExtraCallbackWithResult(str).onExtraCallbackWithResult((String) obj).onExtraCallback(getscreendensitydpi).onWarmupCompleted());
                }
            });
        }
        return this.IAuthTabCallback.computeIfAbsent(str, new Function() { // from class: io.opentelemetry.sdk.internal.ComponentRegistry$$ExternalSyntheticLambda7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.onWarmupCompleted(TombstoneParserCompanion.onExtraCallbackWithResult((String) obj).onExtraCallback(getscreendensitydpi).onWarmupCompleted());
            }
        });
    }

    public static /* synthetic */ Map onExtraCallback(String str) {
        return new ConcurrentHashMap();
    }

    public static /* synthetic */ Map onExtraCallbackWithResult(String str) {
        return new ConcurrentHashMap();
    }

    public static /* synthetic */ Map onNavigationEvent(String str) {
        return new ConcurrentHashMap();
    }

    public static /* synthetic */ Map onWarmupCompleted(String str) {
        return new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V onWarmupCompleted(TombstoneParserCompanion tombstoneParserCompanion) {
        V vApply = this.IAuthTabCallbackDefault.apply(tombstoneParserCompanion);
        synchronized (this.IAuthTabCallbackStub) {
            this.onNavigationEvent.add(vApply);
        }
        return vApply;
    }

    public Collection<V> onExtraCallback() {
        Collection<V> collectionUnmodifiableCollection;
        synchronized (this.IAuthTabCallbackStub) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(new ArrayList(this.onNavigationEvent));
        }
        return collectionUnmodifiableCollection;
    }
}
