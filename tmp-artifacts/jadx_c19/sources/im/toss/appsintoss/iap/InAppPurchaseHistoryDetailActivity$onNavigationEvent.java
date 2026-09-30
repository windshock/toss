package im.toss.appsintoss.iap;

import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.access13800;
import o.access14300;
import o.findResAndMsg;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class InAppPurchaseHistoryDetailActivity$onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    int label;
    final /* synthetic */ InAppPurchaseHistoryDetailActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppPurchaseHistoryDetailActivity$onNavigationEvent(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, access13800<? super InAppPurchaseHistoryDetailActivity$onNavigationEvent> access13800Var) {
        super(2, access13800Var);
        this.this$0 = inAppPurchaseHistoryDetailActivity;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i2 = 2 % 2;
        InAppPurchaseHistoryDetailActivity$onNavigationEvent inAppPurchaseHistoryDetailActivity$onNavigationEvent = new InAppPurchaseHistoryDetailActivity$onNavigationEvent(this.this$0, access13800Var);
        int i3 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 36 / 0;
        }
        return inAppPurchaseHistoryDetailActivity$onNavigationEvent;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i3 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i3 % 2 == 0) {
            return onExtraCallbackWithResult(findresandmsg, access13800Var);
        }
        onExtraCallbackWithResult(findresandmsg, access13800Var);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        InAppPurchaseHistoryDetailActivity$onNavigationEvent inAppPurchaseHistoryDetailActivity$onNavigationEventCreate = create(findresandmsg, access13800Var);
        if (i4 != 0) {
            return inAppPurchaseHistoryDetailActivity$onNavigationEventCreate.invokeSuspend(Unit.INSTANCE);
        }
        inAppPurchaseHistoryDetailActivity$onNavigationEventCreate.invokeSuspend(Unit.INSTANCE);
        throw null;
    }

    /* renamed from: im.toss.appsintoss.iap.InAppPurchaseHistoryDetailActivity$onNavigationEvent$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        int label;

        AnonymousClass3(access13800<? super AnonymousClass3> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(access13800Var);
            int i3 = onWarmupCompleted + 85;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return anonymousClass3;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 61;
            IAuthTabCallback = i3 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i3 % 2 == 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                obj3.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i4 = onWarmupCompleted + 73;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 107;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            AnonymousClass3 anonymousClass3Create = create(findresandmsg, access13800Var);
            if (i4 == 0) {
                anonymousClass3Create.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = anonymousClass3Create.invokeSuspend(Unit.INSTANCE);
            int i5 = onWarmupCompleted + 21;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 97;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = i3 + 31;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            ResultKt.onNavigationEvent(obj);
            Unit unit = Unit.INSTANCE;
            int i8 = IAuthTabCallback + 103;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i2 = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.label;
        if (i3 != 0) {
            int i4 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0 ? i3 != 1 : i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            int i5 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        } else {
            ResultKt.onNavigationEvent(obj);
            InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity = this.this$0;
            TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(null);
            this.label = 1;
            if (RepeatOnLifecycleKt.onExtraCallback(inAppPurchaseHistoryDetailActivity, onextracallback, anonymousClass3, this) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        return Unit.INSTANCE;
    }
}
