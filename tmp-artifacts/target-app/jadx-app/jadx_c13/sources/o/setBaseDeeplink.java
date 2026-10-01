package o;

import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setBaseDeeplink {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static final boolean IAuthTabCallback(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            return textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED);
        }
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED);
        throw null;
    }

    public static final boolean onWarmupCompleted(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        boolean zIsAtLeast = textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED);
        int i4 = onWarmupCompleted + 97;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return zIsAtLeast;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        r4 = o.setBaseDeeplink.IAuthTabCallback + 107;
        o.setBaseDeeplink.onWarmupCompleted = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r4.getLifecycle().IAuthTabCallback() == o.TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.DESTROYED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r4.getLifecycle().IAuthTabCallback() == o.TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.DESTROYED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        r4 = o.setBaseDeeplink.onWarmupCompleted + 69;
        o.setBaseDeeplink.IAuthTabCallback = r4 % 128;
        r4 = r4 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean onExtraCallbackWithResult(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            int i3 = 70 / 0;
        } else {
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        }
    }

    public static /* synthetic */ getPackageType onNavigationEvent(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback, Function2 function2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 41;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                onextracallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED;
                int i7 = 97 / 0;
            } else {
                onextracallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED;
            }
        }
        return onExtraCallback(textFieldScrollKtExternalSyntheticLambda0, onextracallback, function2);
    }

    public static final getPackageType onExtraCallback(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @NotNull TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback, @NotNull Function2<? super findResAndMsg, ? super access13800<? super Unit>, ? extends Object> function2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(function2, "");
        getPackageType getpackagetypeOnExtraCallback = onLoadStarted.onExtraCallback(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0), null, null, new onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0, onextracallback, function2, null), 3, null);
        int i2 = IAuthTabCallback + 25;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 97 / 0;
        }
        return getpackagetypeOnExtraCallback;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function2<findResAndMsg, access13800<? super Unit>, Object> $block;
        final /* synthetic */ TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback $state;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 $this_repeatOnState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onNavigationEvent(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback, Function2<? super findResAndMsg, ? super access13800<? super Unit>, ? extends Object> function2, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$this_repeatOnState = textFieldScrollKtExternalSyntheticLambda0;
            this.$state = onextracallback;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$this_repeatOnState, this.$state, this.$block, access13800Var);
            int i2 = onWarmupCompleted + 115;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 79 / 0;
            }
            return onnavigationevent;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i4 = onWarmupCompleted + 29;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return onnavigationevent.invokeSuspend(unit);
            }
            onnavigationevent.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                TextFieldKeyInputExternalSyntheticLambda9 lifecycle = this.$this_repeatOnState.getLifecycle();
                TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback = this.$state;
                Function2<findResAndMsg, access13800<? super Unit>, Object> function2 = this.$block;
                this.label = 1;
                if (RepeatOnLifecycleKt.onWarmupCompleted(lifecycle, onextracallback, function2, this) == objOnExtraCallback) {
                    int i3 = IAuthTabCallback + 125;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnExtraCallback;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = IAuthTabCallback + 57;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
