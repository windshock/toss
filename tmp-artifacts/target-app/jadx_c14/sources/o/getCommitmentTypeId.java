package o;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.getCommitmentTypeId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getCommitmentTypeId {
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackStub;
    private final Function1<String, Unit> asBinder;
    private final boolean asInterface;
    private String onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final ViewTreeObserver.OnScrollChangedListener onNavigationEvent;
    private final View onTransact;
    private final ViewTreeObserver.OnGlobalLayoutListener onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public getCommitmentTypeId(@NotNull View view, boolean z, @Nullable String str, @NotNull String str2, @NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onTransact = view;
        this.asInterface = z;
        this.IAuthTabCallbackStub = str;
        this.IAuthTabCallback = str2;
        this.asBinder = function1;
        this.onNavigationEvent = new ViewTreeObserver.OnScrollChangedListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.ScrollToBottomCtaController$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                getCommitmentTypeId.IAuthTabCallback(this.f$0);
            }
        };
        this.onWarmupCompleted = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.ScrollToBottomCtaController$$ExternalSyntheticLambda1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                getCommitmentTypeId.onExtraCallback(this.f$0);
            }
        };
        this.onExtraCallbackWithResult = !z;
        this.onExtraCallback = (onNavigationEvent() || str == null) ? str2 : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(getCommitmentTypeId getcommitmenttypeid) {
        getcommitmenttypeid.asInterface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(getCommitmentTypeId getcommitmenttypeid) {
        if (CommitmentTypeQualifier.onWarmupCompleted(getcommitmenttypeid.onTransact)) {
            getcommitmenttypeid.onExtraCallback();
            getcommitmenttypeid.asInterface();
        }
    }

    public final boolean onNavigationEvent() {
        return !this.asInterface || this.onExtraCallbackWithResult;
    }

    public final String IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public final void onWarmupCompleted() {
        asBinder();
        if (this.asInterface) {
            this.onTransact.getViewTreeObserver().addOnGlobalLayoutListener(this.onWarmupCompleted);
            this.onTransact.getViewTreeObserver().addOnScrollChangedListener(this.onNavigationEvent);
        }
    }

    public final void onExtraCallbackWithResult(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        if (!onNavigationEvent()) {
            CommitmentTypeQualifier.onExtraCallbackWithResult(this.onTransact);
        } else {
            function0.invoke();
        }
    }

    public final void onExtraCallbackWithResult() {
        if (this.onTransact.getViewTreeObserver().isAlive()) {
            this.onTransact.getViewTreeObserver().removeOnScrollChangedListener(this.onNavigationEvent);
            this.onTransact.getViewTreeObserver().removeOnGlobalLayoutListener(this.onWarmupCompleted);
        }
    }

    private final void asInterface() {
        if (this.onExtraCallbackWithResult || !CommitmentTypeQualifier.onWarmupCompleted(this.onTransact) || this.onTransact.canScrollVertically(1)) {
            return;
        }
        this.onExtraCallbackWithResult = true;
        onExtraCallbackWithResult();
        asBinder();
    }

    private final void asBinder() {
        String str;
        if (onNavigationEvent() || (str = this.IAuthTabCallbackStub) == null) {
            str = this.IAuthTabCallback;
        }
        this.onExtraCallback = str;
        this.asBinder.invoke(str);
    }

    private final void onExtraCallback() {
        if (this.onTransact.getViewTreeObserver().isAlive()) {
            this.onTransact.getViewTreeObserver().removeOnGlobalLayoutListener(this.onWarmupCompleted);
        }
    }
}
