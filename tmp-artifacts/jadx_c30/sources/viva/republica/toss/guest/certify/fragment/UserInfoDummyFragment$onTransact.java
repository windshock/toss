package viva.republica.toss.guest.certify.fragment;

import im.toss.splittarget.impl.fsm.AppStateImpl$;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.AUPop;
import o.DERSet;
import o.access13800;
import o.access14300;
import o.access15400;
import o.createPaints;
import o.findResAndMsg;
import o.isImageLoaded;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import o.startScroll;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class UserInfoDummyFragment$onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    final /* synthetic */ startScroll $carrier;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ UserInfoDummyFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserInfoDummyFragment$onTransact(UserInfoDummyFragment userInfoDummyFragment, startScroll startscroll, access13800<? super UserInfoDummyFragment$onTransact> access13800Var) {
        super(2, access13800Var);
        this.this$0 = userInfoDummyFragment;
        this.$carrier = startscroll;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        UserInfoDummyFragment$onTransact userInfoDummyFragment$onTransact = new UserInfoDummyFragment$onTransact(this.this$0, this.$carrier, access13800Var);
        userInfoDummyFragment$onTransact.L$0 = obj;
        return userInfoDummyFragment$onTransact;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Function0 function0;
        final findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i = this.label;
        if (i == 0) {
            ResultKt.onNavigationEvent(obj);
            long jAccess100 = this.this$0.onUnminimized().access100();
            startScroll startscroll = this.$carrier;
            createPaints createpaints = createPaints.IAuthTabCallback;
            final AUPop aUPopOnNavigationEvent = isImageLoaded.onNavigationEvent("TS-USI", jAccess100, startscroll, createpaints, CollectionsKt.listOf(new String[]{"5", "6", "7", "8"}).contains(createpaints.onTransact()));
            if (createpaints.writeTypedObject().length() <= 0 || !DERSet.onExtraCallback.getViewModelStore()) {
                function0 = null;
            } else {
                final UserInfoDummyFragment userInfoDummyFragment = this.this$0;
                function0 = new Function0() { // from class: viva.republica.toss.guest.certify.fragment.UserInfoDummyFragment$sendSms$2$$ExternalSyntheticLambda0
                    public final Object invoke() {
                        return UserInfoDummyFragment$onTransact.onExtraCallbackWithResult(findresandmsg, userInfoDummyFragment, aUPopOnNavigationEvent);
                    }
                };
            }
            UserInfoDummyFragment userInfoDummyFragment2 = this.this$0;
            this.L$0 = access15400.onNavigationEvent(findresandmsg);
            this.L$1 = access15400.onNavigationEvent(aUPopOnNavigationEvent);
            this.L$2 = access15400.onNavigationEvent(function0);
            this.label = 1;
            if (UserInfoDummyFragment.onExtraCallback(userInfoDummyFragment2, aUPopOnNavigationEvent, function0, this) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        }
        return Unit.INSTANCE;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ AUPop $sendSmsInfo;
        int label;
        final /* synthetic */ UserInfoDummyFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(UserInfoDummyFragment userInfoDummyFragment, AUPop aUPop, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.this$0 = userInfoDummyFragment;
            this.$sendSmsInfo = aUPop;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onNavigationEvent(this.this$0, this.$sendSmsInfo, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                UserInfoDummyFragment userInfoDummyFragment = this.this$0;
                AUPop aUPopOnWarmupCompleted = AUPop.onWarmupCompleted(this.$sendSmsInfo, (String) null, 0L, createPaints.IAuthTabCallback.writeTypedObject(), (String) null, 0, (startScroll) null, (String) null, 123, (Object) null);
                this.label = 1;
                if (UserInfoDummyFragment.onNavigationEvent(new Object[]{userInfoDummyFragment, aUPopOnWarmupCompleted, null, this, 2, null}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -2122948877, 2122948881) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(findResAndMsg findresandmsg, UserInfoDummyFragment userInfoDummyFragment, AUPop aUPop) {
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(userInfoDummyFragment, aUPop, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
