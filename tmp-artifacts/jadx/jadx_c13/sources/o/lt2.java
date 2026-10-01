package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lt2<Target, Type> extends jw2<Target, Type> {
    private final getGlobalEvent<Target> IAuthTabCallback;
    private final String onExtraCallback;
    private final Type onExtraCallbackWithResult;
    private final jw4<Target, Type> onWarmupCompleted;

    @Override // o.setLottieAnimListener
    public jw4<Target, Type> onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public /* synthetic */ lt2(jw4 jw4Var, String str, Object obj, getGlobalEvent getglobalevent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jw4Var, (i & 2) != 0 ? jw4Var.onWarmupCompleted() : str, (i & 4) != 0 ? null : obj, (i & 8) != 0 ? null : getglobalevent);
    }

    @Override // o.setLottieAnimListener
    public String IAuthTabCallback() {
        return this.onExtraCallback;
    }

    @Override // o.setLottieAnimListener
    public Type onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.setLottieAnimListener
    public getGlobalEvent<Target> onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lt2(@NotNull jw4<? super Target, Type> jw4Var, @NotNull String str, @Nullable Type type, @Nullable getGlobalEvent<? super Target> getglobalevent) {
        Intrinsics.checkNotNullParameter(jw4Var, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = jw4Var;
        this.onExtraCallback = str;
        this.onExtraCallbackWithResult = type;
        this.IAuthTabCallback = getglobalevent;
    }
}
