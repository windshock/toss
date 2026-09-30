package im.toss.features.loan.home;

import android.os.Bundle;
import android.view.View;
import im.toss.base.BaseFragment;
import im.toss.features.loan.home.extensive.LoanHomeExtensiveFragment;
import im.toss.features.loan.ui.R;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanHomeFragmentContainer extends BaseFragment {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 33;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 75;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return -1L;
        }
        throw null;
    }

    public LoanHomeFragmentContainer() {
        super(R.layout.activity_loan_empty);
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ View $view;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(View view, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$view = view;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = LoanHomeFragmentContainer.this.new onWarmupCompleted(this.$view, access13800Var);
            int i2 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object objOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
                int i3 = 88 / 0;
            } else {
                objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            int i4 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 36 / 0;
            return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            LoanHomeExtensiveFragment loanHomeExtensiveFragmentOnNavigationEvent = LoanHomeExtensiveFragment.IAuthTabCallback.onNavigationEvent(LoanHomeExtensiveFragment.Companion, (String) null, (String) null, (String) null, false, false, 31, (Object) null);
            loanHomeExtensiveFragmentOnNavigationEvent.setArguments(LoanHomeFragmentContainer.this.getArguments());
            LoanHomeFragmentContainer.this.getChildFragmentManager().onExtraCallbackWithResult().onWarmupCompleted(this.$view.getId(), loanHomeExtensiveFragmentOnNavigationEvent).onExtraCallbackWithResult();
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 20 / 0;
            }
            return unit;
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(view, null), 3, (Object) null);
        int i2 = onExtraCallback + 37;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
