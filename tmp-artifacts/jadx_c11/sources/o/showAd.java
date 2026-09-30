package o;

import android.view.View;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.showAd;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class showAd {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    public static final showAd onNavigationEvent = new showAd();
    private static int onWarmupCompleted = 1;

    static {
        int i = IAuthTabCallback + 41;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function0);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 91;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private showAd() {
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function0<Boolean> $isHostCreated;
        final /* synthetic */ Function0<Boolean> $isHostStartInProgress;
        final /* synthetic */ Function0<Unit> $onHostNotReady;
        final /* synthetic */ Function0<Unit> $preStart;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Function0<Boolean> function0, Function0<Boolean> function02, Function0<Unit> function03, Function0<Unit> function04, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$isHostCreated = function0;
            this.$isHostStartInProgress = function02;
            this.$onHostNotReady = function03;
            this.$preStart = function04;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$isHostCreated, this.$isHostStartInProgress, this.$onHostNotReady, this.$preStart, access13800Var);
            int i2 = onWarmupCompleted + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 47;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 103;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 49;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i6 == 0) {
                ((Boolean) this.$isHostCreated.invoke()).booleanValue();
                throw null;
            }
            if (((Boolean) this.$isHostCreated.invoke()).booleanValue() || ((Boolean) this.$isHostStartInProgress.invoke()).booleanValue()) {
                this.$preStart.invoke();
                return Unit.INSTANCE;
            }
            this.$onHostNotReady.invoke();
            Unit unit = Unit.INSTANCE;
            int i7 = onWarmupCompleted + 41;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    private static final void IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
    }

    public final getPackageType onWarmupCompleted(@NotNull View view, @NotNull findResAndMsg findresandmsg, @NotNull Function0<Boolean> function0, @NotNull Function0<Boolean> function02, @NotNull final Function0<Unit> function03, @NotNull Function0<Unit> function04, @NotNull Function0<Unit> function05) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        Intrinsics.checkNotNullParameter(function04, "");
        Intrinsics.checkNotNullParameter(function05, "");
        view.post(new Runnable() { // from class: im.toss.rn.toss.core.ShoppingTabInternalReactHostPreStartScheduler$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 115;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                showAd.onExtraCallbackWithResult(function03);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(function0, function02, function04, function05, null), 3, (Object) null);
        int i2 = onExtraCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return getpackagetypeOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
