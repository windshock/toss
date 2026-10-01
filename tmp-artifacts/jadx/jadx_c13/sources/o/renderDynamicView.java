package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class renderDynamicView<T> implements getShakeView<T> {
    private final Function1<KClass<?>, KSerializer<T>> onExtraCallback;
    private final getTimedown<getLogoUnionHeight<T>> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public renderDynamicView(@NotNull Function1<? super KClass<?>, ? extends KSerializer<T>> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onExtraCallback = function1;
        this.onNavigationEvent = new getTimedown<>();
    }

    public final Function1<KClass<?>, KSerializer<T>> onNavigationEvent() {
        return this.onExtraCallback;
    }

    @Override // o.getShakeView
    public KSerializer<T> onWarmupCompleted(@NotNull KClass<Object> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "");
        getLogoUnionHeight<T> getlogounionheight = this.onNavigationEvent.get(clearRegisters.onNavigationEvent(kClass));
        Intrinsics.checkNotNullExpressionValue(getlogounionheight, "");
        setDiffuseWidth setdiffusewidth = (setDiffuseWidth) getlogounionheight;
        T t = setdiffusewidth.onNavigationEvent.get();
        if (t == null) {
            t = (T) setdiffusewidth.onExtraCallbackWithResult(new onExtraCallback(kClass));
        }
        return t.onExtraCallbackWithResult;
    }

    public static final class onExtraCallback implements Function0<T> {
        final /* synthetic */ KClass onExtraCallbackWithResult;

        public onExtraCallback(KClass kClass) {
            this.onExtraCallbackWithResult = kClass;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) new getLogoUnionHeight(renderDynamicView.this.onNavigationEvent().invoke(this.onExtraCallbackWithResult));
        }
    }
}
