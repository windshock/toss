package o;

import android.app.Dialog;
import android.content.DialogInterface;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RequestProgress {

    static final class onWarmupCompleted implements DialogInterface.OnDismissListener {
        final /* synthetic */ maybeRemoveAttachStateListener<Unit> onWarmupCompleted;

        onWarmupCompleted(maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener) {
            this.onWarmupCompleted = mayberemoveattachstatelistener;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            maybeRemoveAttachStateListener<Unit> mayberemoveattachstatelistener = this.onWarmupCompleted;
            Result.Companion companion = Result.Companion;
            mayberemoveattachstatelistener.resumeWith(Result.constructor-impl(Unit.INSTANCE));
        }
    }

    static final class onExtraCallbackWithResult implements Function1<Throwable, Unit> {
        final /* synthetic */ Dialog IAuthTabCallback;

        onExtraCallbackWithResult(Dialog dialog) {
            this.IAuthTabCallback = dialog;
        }

        public /* synthetic */ Object invoke(Object obj) {
            onWarmupCompleted((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(Throwable th) {
            this.IAuthTabCallback.setOnDismissListener(null);
        }
    }

    public static final Object onExtraCallback(@NotNull Dialog dialog, @NotNull access13800<? super Unit> access13800Var) {
        setResourceInternal setresourceinternal = new setResourceInternal(access14300.onWarmupCompleted(access13800Var), 1);
        setresourceinternal.onTransact();
        dialog.setOnDismissListener(new onWarmupCompleted(setresourceinternal));
        setresourceinternal.IAuthTabCallback(new onExtraCallbackWithResult(dialog));
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14300.onWarmupCompleted()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objIAuthTabCallbackDefault == access14300.onWarmupCompleted() ? objIAuthTabCallbackDefault : Unit.INSTANCE;
    }
}
