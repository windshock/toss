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
final class InAppPurchaseHistoryDetailActivity$IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    int label;
    final /* synthetic */ InAppPurchaseHistoryDetailActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppPurchaseHistoryDetailActivity$IAuthTabCallback(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, access13800<? super InAppPurchaseHistoryDetailActivity$IAuthTabCallback> access13800Var) {
        super(2, access13800Var);
        this.this$0 = inAppPurchaseHistoryDetailActivity;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i2 = 2 % 2;
        InAppPurchaseHistoryDetailActivity$IAuthTabCallback inAppPurchaseHistoryDetailActivity$IAuthTabCallback = new InAppPurchaseHistoryDetailActivity$IAuthTabCallback(this.this$0, access13800Var);
        int i3 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return inAppPurchaseHistoryDetailActivity$IAuthTabCallback;
        }
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i3 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i3 % 2 == 0) {
            return onExtraCallback(findresandmsg, access13800Var);
        }
        onExtraCallback(findresandmsg, access13800Var);
        throw null;
    }

    public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        InAppPurchaseHistoryDetailActivity$IAuthTabCallback inAppPurchaseHistoryDetailActivity$IAuthTabCallbackCreate = create(findresandmsg, access13800Var);
        Unit unit = Unit.INSTANCE;
        if (i4 != 0) {
            return inAppPurchaseHistoryDetailActivity$IAuthTabCallbackCreate.invokeSuspend(unit);
        }
        inAppPurchaseHistoryDetailActivity$IAuthTabCallbackCreate.invokeSuspend(unit);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: im.toss.appsintoss.iap.InAppPurchaseHistoryDetailActivity$IAuthTabCallback$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int label;

        AnonymousClass1(access13800<? super AnonymousClass1> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 93;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i5 = onExtraCallback + 19;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(access13800Var);
            int i3 = onExtraCallback + 61;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return anonymousClass1;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 41;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i5 = onExtraCallback + 87;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 31;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = i4 + 39;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i7 != 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i2 = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.label;
        Object obj2 = null;
        if (i3 != 0) {
            int i4 = onExtraCallbackWithResult + 23;
            int i5 = i4 % 128;
            onWarmupCompleted = i5;
            int i6 = i4 % 2;
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = i5 + 97;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                ResultKt.onNavigationEvent(obj);
                obj2.hashCode();
                throw null;
            }
            ResultKt.onNavigationEvent(obj);
            int i8 = onExtraCallbackWithResult + 115;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        } else {
            ResultKt.onNavigationEvent(obj);
            InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity = this.this$0;
            TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (RepeatOnLifecycleKt.onExtraCallback(inAppPurchaseHistoryDetailActivity, onextracallback, anonymousClass1, this) == objOnWarmupCompleted) {
                int i10 = onWarmupCompleted + 9;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                return objOnWarmupCompleted;
            }
        }
        return Unit.INSTANCE;
    }
}
