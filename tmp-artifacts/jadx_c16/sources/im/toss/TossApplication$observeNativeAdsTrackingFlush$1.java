package im.toss;

import androidx.lifecycle.DefaultLifecycleObserver;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setRandomHost;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class TossApplication$observeNativeAdsTrackingFlush$1 implements DefaultLifecycleObserver {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    final /* synthetic */ TossApplication onExtraCallbackWithResult;

    TossApplication$observeNativeAdsTrackingFlush$1(TossApplication tossApplication) {
        this.onExtraCallbackWithResult = tossApplication;
    }

    public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy(textFieldScrollKtExternalSyntheticLambda0);
        int i4 = IAuthTabCallback + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause(textFieldScrollKtExternalSyntheticLambda0);
        int i4 = onNavigationEvent + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onResume(textFieldScrollKtExternalSyntheticLambda0);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new onNavigationEvent(this.onExtraCallbackWithResult, null), 2, (Object) null);
        int i2 = IAuthTabCallback + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        int label;
        final /* synthetic */ TossApplication this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(TossApplication tossApplication, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.this$0 = tossApplication;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.this$0, access13800Var);
            int i2 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 90 / 0;
            }
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 76 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onExtraCallbackWithResult + 125;
                int i6 = i5 % 128;
                IAuthTabCallback = i6;
                int i7 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i6 + 123;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                TossApplication tossApplication = this.this$0;
                this.label = 1;
                if (TossApplication.onExtraCallback(tossApplication, this) == objOnWarmupCompleted) {
                    int i9 = IAuthTabCallback + 85;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new onExtraCallback(this.onExtraCallbackWithResult, null), 2, (Object) null);
        int i2 = onNavigationEvent + 109;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        int label;
        final /* synthetic */ TossApplication this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(TossApplication tossApplication, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.this$0 = tossApplication;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.this$0, access13800Var);
            int i2 = onExtraCallback + 11;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 97;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 72 / 0;
            return onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onWarmupCompleted + 89;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0 ? i4 != 1 : i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                TossApplication tossApplication = this.this$0;
                this.label = 1;
                if (TossApplication.onExtraCallback(tossApplication, this) == objOnWarmupCompleted) {
                    int i6 = onExtraCallback + 83;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 80 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i8 = onWarmupCompleted + 95;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 53 / 0;
            }
            return unit;
        }
    }
}
