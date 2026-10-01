package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ltlt<Target> extends jw2<Target, Integer> {
    private final Integer IAuthTabCallback;
    private final String IAuthTabCallbackStub;
    private final int onExtraCallback;
    private final jw4<Target, Integer> onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final getGlobalEvent<Target> onTransact;
    private final int onWarmupCompleted;

    @Override // o.setLottieAnimListener
    public jw4<Target, Integer> onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    public final int IAuthTabCallbackDefault() {
        return this.onExtraCallback;
    }

    public final int onTransact() {
        return this.onWarmupCompleted;
    }

    public /* synthetic */ ltlt(jw4 jw4Var, int i, int i2, String str, Integer num, getGlobalEvent getglobalevent, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(jw4Var, i, i2, (i3 & 8) != 0 ? jw4Var.onWarmupCompleted() : str, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : getglobalevent);
    }

    @Override // o.setLottieAnimListener
    public String IAuthTabCallback() {
        return this.IAuthTabCallbackStub;
    }

    @Override // o.setLottieAnimListener
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public Integer onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    @Override // o.setLottieAnimListener
    public getGlobalEvent<Target> onWarmupCompleted() {
        return this.onTransact;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ltlt(@NotNull jw4<? super Target, Integer> jw4Var, int i, int i2, @NotNull String str, @Nullable Integer num, @Nullable getGlobalEvent<? super Target> getglobalevent) {
        int i3;
        Intrinsics.checkNotNullParameter(jw4Var, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallbackWithResult = jw4Var;
        this.onExtraCallback = i;
        this.onWarmupCompleted = i2;
        this.IAuthTabCallbackStub = str;
        this.IAuthTabCallback = num;
        this.onTransact = getglobalevent;
        if (i2 < 10) {
            i3 = 1;
        } else if (i2 < 100) {
            i3 = 2;
        } else {
            if (i2 >= 1000) {
                throw new IllegalArgumentException("Max value " + i2 + " is too large");
            }
            i3 = 3;
        }
        this.onNavigationEvent = i3;
    }

    public final int IAuthTabCallbackStub() {
        return this.onNavigationEvent;
    }
}
