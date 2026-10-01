package o;

import androidx.lifecycle.DefaultLifecycleObserver;
import im.toss.core.workerservice.WorkerService$Companion$;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.calculateMaxTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class calculateMaxTextSize$onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    final /* synthetic */ Class<? extends drawTextBox> $cls;
    final /* synthetic */ List<String> $handlerNames;
    final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 $lifecycleOwner;
    int label;
    final /* synthetic */ calculateMaxTextSize this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    calculateMaxTextSize$onWarmupCompleted(List<String> list, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, calculateMaxTextSize calculatemaxtextsize, Class<? extends drawTextBox> cls, access13800<? super calculateMaxTextSize$onWarmupCompleted> access13800Var) {
        super(2, access13800Var);
        this.$handlerNames = list;
        this.$lifecycleOwner = textFieldScrollKtExternalSyntheticLambda0;
        this.this$0 = calculatemaxtextsize;
        this.$cls = cls;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i2 = 2 % 2;
        calculateMaxTextSize$onWarmupCompleted calculatemaxtextsize_onwarmupcompleted = new calculateMaxTextSize$onWarmupCompleted(this.$handlerNames, this.$lifecycleOwner, this.this$0, this.$cls, access13800Var);
        int i3 = onWarmupCompleted + 17;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return calculatemaxtextsize_onwarmupcompleted;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws setWrite {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
        int i5 = onWarmupCompleted + 109;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return objOnExtraCallbackWithResult;
        }
        throw null;
    }

    public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws setWrite {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 121;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i5 = onWarmupCompleted + 67;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
    public final Object invokeSuspend(Object obj) throws setWrite {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = this.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(obj);
            List<String> list = this.$handlerNames;
            calculateMaxTextSize calculatemaxtextsize = this.this$0;
            Class<? extends drawTextBox> cls = this.$cls;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                int i6 = onWarmupCompleted + 59;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    Object[] objArr = {calculatemaxtextsize, (String) it.next(), cls};
                    int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
                    int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
                    calculateMaxTextSize.onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 2074815311, objArr, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -2074815310, iIAuthTabCallback2, iIAuthTabCallback);
                    int i7 = 36 / 0;
                } else {
                    Object[] objArr2 = {calculatemaxtextsize, (String) it.next(), cls};
                    int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
                    int iIAuthTabCallback4 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
                    calculateMaxTextSize.onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 2074815311, objArr2, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -2074815310, iIAuthTabCallback4, iIAuthTabCallback3);
                }
            }
            TextFieldKeyInputExternalSyntheticLambda9 lifecycle = this.$lifecycleOwner.getLifecycle();
            final List<String> list2 = this.$handlerNames;
            final calculateMaxTextSize calculatemaxtextsize2 = this.this$0;
            lifecycle.IAuthTabCallback(new DefaultLifecycleObserver() { // from class: im.toss.core.webkit.MessageHandlerPoolSet$registerLifecycleScopedHandler$1$2
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallbackWithResult + 93;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
                    if (i10 == 0) {
                        return;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                public /* bridge */ void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallbackWithResult + 11;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    Object obj2 = null;
                    super.onPause(textFieldScrollKtExternalSyntheticLambda0);
                    if (i10 != 0) {
                        obj2.hashCode();
                        throw null;
                    }
                    int i11 = onExtraCallback + 113;
                    onExtraCallbackWithResult = i11 % 128;
                    if (i11 % 2 != 0) {
                        return;
                    }
                    obj2.hashCode();
                    throw null;
                }

                public /* bridge */ void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallback + 105;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    super.onResume(textFieldScrollKtExternalSyntheticLambda0);
                    if (i10 == 0) {
                        throw null;
                    }
                    int i11 = onExtraCallbackWithResult + 63;
                    onExtraCallback = i11 % 128;
                    if (i11 % 2 != 0) {
                        throw null;
                    }
                }

                public /* bridge */ void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallbackWithResult + 59;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    super.onStart(textFieldScrollKtExternalSyntheticLambda0);
                    int i11 = onExtraCallbackWithResult + 71;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                }

                public /* bridge */ void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallbackWithResult + 115;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    super.onStop(textFieldScrollKtExternalSyntheticLambda0);
                    int i11 = onExtraCallbackWithResult + 91;
                    onExtraCallback = i11 % 128;
                    if (i11 % 2 != 0) {
                        throw null;
                    }
                }

                public void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                    int i8 = 2 % 2;
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    List<String> list3 = list2;
                    calculateMaxTextSize calculatemaxtextsize3 = calculatemaxtextsize2;
                    Iterator<T> it2 = list3.iterator();
                    int i9 = onExtraCallbackWithResult + 77;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    while (it2.hasNext()) {
                        calculateMaxTextSize.onExtraCallback(calculatemaxtextsize3, (String) it2.next());
                    }
                    int i11 = onExtraCallbackWithResult + 17;
                    onExtraCallback = i11 % 128;
                    if (i11 % 2 != 0) {
                        throw null;
                    }
                }
            });
            this.label = 1;
            if (formatMsgs.onExtraCallbackWithResult(this) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        }
        throw new setWrite();
    }
}
