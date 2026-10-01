package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.q4ExternalSyntheticLambda2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaRbKaoSHYhlhce4ckketI4frIfDE {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static final q4ExternalSyntheticLambda12 onExtraCallbackWithResult = new q4ExternalSyntheticLambda12(null, null, null, null, null, 31, null);
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static final class onExtraCallback extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = r8lambdaRbKaoSHYhlhce4ckketI4frIfDE.onExtraCallback(null, null, null, this);
            int i4 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }
    }

    static {
        int i = onExtraCallback + 25;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI r8lambdavvxsp2uzrjb9nt4ewemuyygvi, q4ExternalSyntheticLambda3 q4externalsyntheticlambda3, q4ExternalSyntheticLambda12 q4externalsyntheticlambda12, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = IAuthTabCallback + 107;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            q4externalsyntheticlambda12 = onExtraCallbackWithResult;
            int i5 = i4 + 93;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        return onExtraCallback(r8lambdavvxsp2uzrjb9nt4ewemuyygvi, q4externalsyntheticlambda3, q4externalsyntheticlambda12, access13800Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onExtraCallback(@NotNull r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI r8lambdavvxsp2uzrjb9nt4ewemuyygvi, @NotNull q4ExternalSyntheticLambda3 q4externalsyntheticlambda3, @NotNull q4ExternalSyntheticLambda12 q4externalsyntheticlambda12, @NotNull access13800<? super q4ExternalSyntheticLambda2> access13800Var) throws NoWhenBranchMatchedException {
        onExtraCallback onextracallback;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i2 = onextracallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = IAuthTabCallback + 67;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    onextracallback.label = i2 * Integer.MIN_VALUE;
                } else {
                    onextracallback.label = i2 - 2147483648;
                }
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object obj = onextracallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = onextracallback.label;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q4ExternalSyntheticLambda2 q4externalsyntheticlambda2 = (q4ExternalSyntheticLambda2) onextracallback.L$3;
            ResultKt.onNavigationEvent(obj);
            return q4externalsyntheticlambda2;
        }
        ResultKt.onNavigationEvent(obj);
        q4ExternalSyntheticLambda2 q4externalsyntheticlambda2OnExtraCallback = q4externalsyntheticlambda12.onExtraCallback(q4externalsyntheticlambda3);
        if (!(q4externalsyntheticlambda2OnExtraCallback instanceof q4ExternalSyntheticLambda2.onExtraCallback)) {
            if (q4externalsyntheticlambda2OnExtraCallback instanceof q4ExternalSyntheticLambda2.onExtraCallbackWithResult) {
                return q4externalsyntheticlambda2OnExtraCallback;
            }
            throw new NoWhenBranchMatchedException();
        }
        r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks r8lambdan2uusxctu9sq10xffiic0tk0ksOnWarmupCompleted = ((q4ExternalSyntheticLambda2.onExtraCallback) q4externalsyntheticlambda2OnExtraCallback).onWarmupCompleted();
        onextracallback.L$0 = access15400.onNavigationEvent(r8lambdavvxsp2uzrjb9nt4ewemuyygvi);
        onextracallback.L$1 = access15400.onNavigationEvent(q4externalsyntheticlambda3);
        onextracallback.L$2 = access15400.onNavigationEvent(q4externalsyntheticlambda12);
        onextracallback.L$3 = q4externalsyntheticlambda2OnExtraCallback;
        onextracallback.label = 1;
        if (r8lambdavvxsp2uzrjb9nt4ewemuyygvi.onNavigationEvent(r8lambdan2uusxctu9sq10xffiic0tk0ksOnWarmupCompleted, onextracallback) != objOnWarmupCompleted) {
            return q4externalsyntheticlambda2OnExtraCallback;
        }
        int i5 = onNavigationEvent + 101;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return objOnWarmupCompleted;
    }
}
