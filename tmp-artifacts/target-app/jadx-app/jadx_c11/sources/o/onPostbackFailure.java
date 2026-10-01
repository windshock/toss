package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.onPostbackFailure;
import o.pin;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onPostbackFailure {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ float onExtraCallback(pin pinVar) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = onNavigationEvent(pinVar);
        int i4 = onWarmupCompleted + 31;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    public static /* synthetic */ r8lambda9HStmjrtoDHLHwHNekzuov8q0sI onExtraCallback(Function1 function1, float f, getDelegateokhttp getdelegateokhttp, getDelegateokhttp getdelegateokhttp2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.compose.component.atom.text.style.TdsWordBreakStrategyResolverKt$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2) throws NoWhenBranchMatchedException {
                    int i3 = 2 % 2;
                    int i4 = onExtraCallback + 85;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    float fOnExtraCallback = onPostbackFailure.onExtraCallback((pin) obj2);
                    if (i5 == 0) {
                        return Float.valueOf(fOnExtraCallback);
                    }
                    Float.valueOf(fOnExtraCallback);
                    throw null;
                }
            };
        }
        if ((i & 2) != 0) {
            int i3 = onWarmupCompleted + 71;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            f = VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback();
            int i5 = onWarmupCompleted + 69;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 4) != 0) {
            int i7 = onWarmupCompleted + 1;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            getdelegateokhttp = getDelegateokhttp.Companion.onExtraCallback();
        }
        if ((i & 8) != 0) {
            int i9 = onExtraCallback + 103;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            getdelegateokhttp2 = getDelegateokhttp.Companion.onNavigationEvent();
        }
        return onNavigationEvent(function1, f, getdelegateokhttp, getdelegateokhttp2);
    }

    private static final float onNavigationEvent(pin pinVar) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(pinVar, "");
            CipherSuiteCompanionORDER_BY_NAME1.onNavigationEvent(pinVar);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(pinVar, "");
        float fOnNavigationEvent = CipherSuiteCompanionORDER_BY_NAME1.onNavigationEvent(pinVar);
        int i3 = onWarmupCompleted + 41;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return fOnNavigationEvent;
    }

    public static final r8lambda9HStmjrtoDHLHwHNekzuov8q0sI onNavigationEvent(@NotNull Function1<? super pin, Float> function1, float f, @NotNull getDelegateokhttp getdelegateokhttp, @NotNull getDelegateokhttp getdelegateokhttp2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(getdelegateokhttp, "");
        Intrinsics.checkNotNullParameter(getdelegateokhttp2, "");
        onNavigationEvent onnavigationevent = new onNavigationEvent(function1, f, getdelegateokhttp2, getdelegateokhttp);
        int i2 = onWarmupCompleted + 1;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onnavigationevent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onNavigationEvent implements r8lambda9HStmjrtoDHLHwHNekzuov8q0sI {
        private static int IAuthTabCallback = 0;
        private static int asInterface = 1;
        final /* synthetic */ Function1<pin, Float> onExtraCallback;
        final /* synthetic */ getDelegateokhttp onExtraCallbackWithResult;
        final /* synthetic */ float onNavigationEvent;
        final /* synthetic */ getDelegateokhttp onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        onNavigationEvent(Function1<? super pin, Float> function1, float f, getDelegateokhttp getdelegateokhttp, getDelegateokhttp getdelegateokhttp2) {
            this.onExtraCallback = function1;
            this.onNavigationEvent = f;
            this.onWarmupCompleted = getdelegateokhttp;
            this.onExtraCallbackWithResult = getdelegateokhttp2;
        }

        @Override // o.r8lambda9HStmjrtoDHLHwHNekzuov8q0sI
        public final getDelegateokhttp onWarmupCompleted(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, pin pinVar, long j) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
            Intrinsics.checkNotNullParameter(pinVar, "");
            if (r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent() >= ((Number) this.onExtraCallback.invoke(pinVar)).floatValue() || ((!Float.isNaN(this.onNavigationEvent)) && VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4.e_(j), this.onNavigationEvent) > 0)) {
                getDelegateokhttp getdelegateokhttp = this.onWarmupCompleted;
                int i2 = asInterface + 123;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return getdelegateokhttp;
            }
            getDelegateokhttp getdelegateokhttp2 = this.onExtraCallbackWithResult;
            int i4 = IAuthTabCallback + 49;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return getdelegateokhttp2;
        }
    }
}
