package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.coroutines.CoroutineContext;
import o.CloseableUtils;
import o.IAnimation;
import o.access13800;
import o.getPackageType;
import o.getShine;
import o.getTileModeX;
import o.rmf;
import o.setRipple;
import o.syalt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ReadonlySharedFlow<T> implements getTileModeX<T>, rmf<T>, syalt<T> {
    private final /* synthetic */ getTileModeX<T> onExtraCallback;
    private final getPackageType onNavigationEvent;

    @Override // o.getTileModeX, o.IAnimation
    public Object collect(@NotNull setRipple<? super T> setripple, @NotNull access13800<?> access13800Var) {
        return this.onExtraCallback.collect(setripple, access13800Var);
    }

    @Override // o.getTileModeX
    public List<T> onExtraCallback() {
        return this.onExtraCallback.onExtraCallback();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReadonlySharedFlow(@NotNull getTileModeX<? extends T> gettilemodex, @Nullable getPackageType getpackagetype) {
        this.onExtraCallback = gettilemodex;
        this.onNavigationEvent = getpackagetype;
    }

    @Override // o.syalt
    public IAnimation<T> onExtraCallback(@NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils) {
        return getShine.onWarmupCompleted(this, coroutineContext, i, closeableUtils);
    }
}
