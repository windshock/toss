package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getResultMsg extends ViewModel {
    private final MutableLiveData<Boolean> onExtraCallbackWithResult = new MutableLiveData<>(Boolean.FALSE);
    private final Rmipmap<Boolean> onNavigationEvent = new Rmipmap<>();
    private final GeckoHubImp1<getObjectAt> onWarmupCompleted = onLoadStarted.onWarmupCompleted(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), null, null, new onExtraCallback(null), 3, null);

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super getObjectAt>, Object> {
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallback(access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super getObjectAt> access13800Var) {
            return ((onExtraCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            Object objOnExtraCallback2 = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                getObjects getobjects = getObjects.onWarmupCompleted;
                this.label = 1;
                objOnExtraCallback = getobjects.onExtraCallback(this);
                if (objOnExtraCallback == objOnExtraCallback2) {
                    return objOnExtraCallback2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = ((Result) obj).onNavigationEvent();
            }
            if (Result.onExtraCallback(objOnExtraCallback)) {
                return null;
            }
            return objOnExtraCallback;
        }
    }

    public final void onExtraCallback(boolean z) {
        this.onExtraCallbackWithResult.setValue(Boolean.valueOf(z));
    }
}
