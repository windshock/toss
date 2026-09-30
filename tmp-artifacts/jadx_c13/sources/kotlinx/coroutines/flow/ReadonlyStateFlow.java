package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.coroutines.CoroutineContext;
import o.CloseableUtils;
import o.IAnimation;
import o.access13800;
import o.getPackageType;
import o.rmf;
import o.setRipple;
import o.setRubIn;
import o.setShine;
import o.syalt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ReadonlyStateFlow<T> implements setRubIn<T>, rmf<T>, syalt<T> {
    private final getPackageType IAuthTabCallback;
    private final /* synthetic */ setRubIn<T> onNavigationEvent;

    @Override // o.setRubIn
    public T IAuthTabCallback() {
        return this.onNavigationEvent.IAuthTabCallback();
    }

    @Override // o.getTileModeX, o.IAnimation
    public Object collect(@NotNull setRipple<? super T> setripple, @NotNull access13800<?> access13800Var) {
        return this.onNavigationEvent.collect(setripple, access13800Var);
    }

    @Override // o.getTileModeX
    public List<T> onExtraCallback() {
        return this.onNavigationEvent.onExtraCallback();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReadonlyStateFlow(@NotNull setRubIn<? extends T> setrubin, @Nullable getPackageType getpackagetype) {
        this.onNavigationEvent = setrubin;
        this.IAuthTabCallback = getpackagetype;
    }

    @Override // o.syalt
    public IAnimation<T> onExtraCallback(@NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils) {
        return setShine.IAuthTabCallback(this, coroutineContext, i, closeableUtils);
    }
}
