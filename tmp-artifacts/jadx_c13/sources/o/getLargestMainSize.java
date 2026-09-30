package o;

import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getLargestMainSize {
    private static final djExternalSyntheticApiModelOutline0 onWarmupCompleted = new djExternalSyntheticApiModelOutline0("CLOSED");

    public static final <S extends ycx5<S>> Object onWarmupCompleted(@NotNull S s, long j, @NotNull Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            if (s.onExtraCallback >= j && !s.asInterface()) {
                return djExternalSyntheticApiModelOutline1.onExtraCallbackWithResult(s);
            }
            Object objIAuthTabCallbackDefault = s.IAuthTabCallbackDefault();
            if (objIAuthTabCallbackDefault == onWarmupCompleted) {
                return djExternalSyntheticApiModelOutline1.onExtraCallbackWithResult(onWarmupCompleted);
            }
            S sInvoke = (S) ((getJustifyContent) objIAuthTabCallbackDefault);
            if (sInvoke == null) {
                sInvoke = function2.invoke(Long.valueOf(s.onExtraCallback + 1), s);
                if (s.onNavigationEvent(sInvoke)) {
                    if (s.asInterface()) {
                        s.IAuthTabCallbackStub();
                    }
                }
            }
            s = sInvoke;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.getJustifyContent] */
    public static final <N extends getJustifyContent<N>> N IAuthTabCallback(@NotNull N n) {
        while (true) {
            Object objIAuthTabCallbackDefault = n.IAuthTabCallbackDefault();
            if (objIAuthTabCallbackDefault == onWarmupCompleted) {
                return n;
            }
            ?? r0 = (getJustifyContent) objIAuthTabCallbackDefault;
            if (r0 != 0) {
                n = r0;
            } else if (n.onTransact()) {
                return n;
            }
        }
    }
}
