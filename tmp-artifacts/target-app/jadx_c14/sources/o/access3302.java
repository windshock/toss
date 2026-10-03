package o;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.edoc.register.AptPasswordActivity$;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode;
import o.NativeKeyboardObserverSpec;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import o.access3302;
import o.formatToParts;
import o.parcelStartParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.databinding.RowConsumptionTransactionDutchBinding;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class access3302 {
    public static final int onNavigationEvent = exitAllPages.onExtraCallbackWithResult;
    private final IAuthTabCallback IAuthTabCallback;
    private final String onExtraCallback;
    private final exitAllPages<NativeKeyboardObserverSpec> onExtraCallbackWithResult;

    public access3302(@NotNull exitAllPages<NativeKeyboardObserverSpec> exitallpages, @NotNull IAuthTabCallback iAuthTabCallback, @Nullable String str) {
        Intrinsics.checkNotNullParameter(exitallpages, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.onExtraCallbackWithResult = exitallpages;
        this.IAuthTabCallback = iAuthTabCallback;
        this.onExtraCallback = str;
    }

    public final void IAuthTabCallback() {
        exitAllPages<NativeKeyboardObserverSpec> exitallpages = this.onExtraCallbackWithResult;
        parcelStartParams.onNavigationEvent onnavigationevent = new parcelStartParams.onNavigationEvent();
        onnavigationevent.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionDutchDelegate$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(access3302.onExtraCallbackWithResult((NativeKeyboardObserverSpec) obj));
            }
        });
        onnavigationevent.onExtraCallback(onExtraCallbackWithResult.onExtraCallback);
        onnavigationevent.onWarmupCompleted(new Function1() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionDutchDelegate$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return access3302.onNavigationEvent((AppNode) obj);
            }
        });
        onnavigationevent.onExtraCallback(new Function2() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionDutchDelegate$$ExternalSyntheticLambda3
            public final Object invoke(Object obj, Object obj2) {
                return access3302.onExtraCallback(this.f$0, (AppNode) obj, (formatToParts) obj2);
            }
        });
        if (onnavigationevent.onNavigationEvent() == null && onnavigationevent.IAuthTabCallback() == null) {
            onnavigationevent.onExtraCallbackWithResult(onNavigationEvent.onExtraCallback);
        }
        exitallpages.onExtraCallbackWithResult(onnavigationevent.onExtraCallback());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onExtraCallbackWithResult(NativeKeyboardObserverSpec nativeKeyboardObserverSpec) {
        Intrinsics.checkNotNullParameter(nativeKeyboardObserverSpec, "");
        return (nativeKeyboardObserverSpec instanceof formatToParts) && ((formatToParts) nativeKeyboardObserverSpec).newAuthTabSession();
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements getBacktraceNote<LayoutInflater, ViewGroup, Boolean, RowConsumptionTransactionDutchBinding> {
        public static final onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(3, RowConsumptionTransactionDutchBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lviva/republica/toss/databinding/RowConsumptionTransactionDutchBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return onWarmupCompleted((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        public final RowConsumptionTransactionDutchBinding onWarmupCompleted(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            return RowConsumptionTransactionDutchBinding.onExtraCallback(layoutInflater, viewGroup, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(AppNode appNode) {
        Intrinsics.checkNotNullParameter(appNode, "");
        RowConsumptionTransactionDutchBinding rowConsumptionTransactionDutchBinding = (RowConsumptionTransactionDutchBinding) appNode.onExtraCallbackWithResult();
        rowConsumptionTransactionDutchBinding.onWarmupCompleted.IAuthTabCallback().setClickable(false);
        BaseTextView baseTextViewICustomTabsCallbackStubProxy = rowConsumptionTransactionDutchBinding.onWarmupCompleted.IAuthTabCallback().ICustomTabsCallbackStubProxy();
        if (baseTextViewICustomTabsCallbackStubProxy != null) {
            baseTextViewICustomTabsCallbackStubProxy.onNavigationEvent(response.Bold);
        }
        rowConsumptionTransactionDutchBinding.onWarmupCompleted.IAuthTabCallback().setRightArrow(true);
        ConstraintLayout root = rowConsumptionTransactionDutchBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        SuspendAnimationKtExternalSyntheticLambda4.IAuthTabCallback iAuthTabCallback = SuspendAnimationKtExternalSyntheticLambda4.IAuthTabCallback.extraCallback;
        Intrinsics.checkNotNullExpressionValue(iAuthTabCallback, "");
        setProtocolsokhttp.IAuthTabCallback(root, iAuthTabCallback, rowConsumptionTransactionDutchBinding.getRoot().getContext().getString(R.string.home_transaction_more_options));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(final access3302 access3302Var, AppNode appNode, final formatToParts formattoparts) {
        Spanned spannedOnNavigationEvent;
        Spanned spannedOnNavigationEvent2;
        Intrinsics.checkNotNullParameter(appNode, "");
        Intrinsics.checkNotNullParameter(formattoparts, "");
        final RowConsumptionTransactionDutchBinding rowConsumptionTransactionDutchBinding = (RowConsumptionTransactionDutchBinding) appNode.onExtraCallbackWithResult();
        TdsImageView.setImage$default(rowConsumptionTransactionDutchBinding.onWarmupCompleted.onNavigationEvent(), (String) formatToParts.onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1318563469, new Object[]{formattoparts}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1318563469, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted()), (Function1) null, (Function1) null, 6, (Object) null);
        BaseTextView baseTextViewICustomTabsCallbackDefault = rowConsumptionTransactionDutchBinding.onWarmupCompleted.IAuthTabCallback().ICustomTabsCallbackDefault();
        if (baseTextViewICustomTabsCallbackDefault != null) {
            if (formattoparts.asBinder() != null) {
                String strOnNavigationEvent = formattoparts.asBinder().onNavigationEvent();
                spannedOnNavigationEvent2 = strOnNavigationEvent != null ? BrickModulesListExternalSyntheticLambda0.onNavigationEvent(strOnNavigationEvent, false, 1, (Object) null) : null;
            } else {
                spannedOnNavigationEvent2 = BrickModulesListExternalSyntheticLambda0.onNavigationEvent(formattoparts.ICustomTabsService(), false, 1, (Object) null);
            }
            baseTextViewICustomTabsCallbackDefault.setText(spannedOnNavigationEvent2);
        }
        BaseTextView baseTextViewICustomTabsCallbackStubProxy = rowConsumptionTransactionDutchBinding.onWarmupCompleted.IAuthTabCallback().ICustomTabsCallbackStubProxy();
        if (baseTextViewICustomTabsCallbackStubProxy != null) {
            baseTextViewICustomTabsCallbackStubProxy.setText(formattoparts.isEngagementSignalsApiAvailable());
        }
        BaseTextView baseTextViewOnUnminimized = rowConsumptionTransactionDutchBinding.onWarmupCompleted.IAuthTabCallback().onUnminimized();
        if (baseTextViewOnUnminimized != null) {
            if (formattoparts.asBinder() != null) {
                String strOnExtraCallback = formattoparts.asBinder().onExtraCallback();
                spannedOnNavigationEvent = strOnExtraCallback != null ? BrickModulesListExternalSyntheticLambda0.onNavigationEvent(strOnExtraCallback, false, 1, (Object) null) : null;
            } else {
                spannedOnNavigationEvent = BrickModulesListExternalSyntheticLambda0.onNavigationEvent((String) formatToParts.onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1286342047, new Object[]{formattoparts}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1286342049, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted()), false, 1, (Object) null);
            }
            baseTextViewOnUnminimized.setText(spannedOnNavigationEvent);
        }
        if (formattoparts.newSession()) {
            rowConsumptionTransactionDutchBinding.getRoot().setEnabled(true);
            rowConsumptionTransactionDutchBinding.getRoot().setClickable(true);
            rowConsumptionTransactionDutchBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionDutchDelegate$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    access3302.onWarmupCompleted(this.f$0, rowConsumptionTransactionDutchBinding, formattoparts, view);
                }
            });
        } else {
            rowConsumptionTransactionDutchBinding.getRoot().setEnabled(false);
            rowConsumptionTransactionDutchBinding.getRoot().setClickable(false);
            rowConsumptionTransactionDutchBinding.getRoot().setOnClickListener(null);
            rowConsumptionTransactionDutchBinding.getRoot().setOnLongClickListener(null);
        }
        return Unit.INSTANCE;
    }

    public static final class onNavigationEvent implements Function1<Object, Boolean> {
        public static final onNavigationEvent onExtraCallback = new onNavigationEvent();

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof formatToParts);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(access3302 access3302Var, RowConsumptionTransactionDutchBinding rowConsumptionTransactionDutchBinding, formatToParts formattoparts, View view) {
        IAuthTabCallback iAuthTabCallback = access3302Var.IAuthTabCallback;
        Context context = rowConsumptionTransactionDutchBinding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        iAuthTabCallback.IAuthTabCallback(context, formattoparts, access3302Var.onExtraCallback);
    }

    public interface IAuthTabCallback {
        default void IAuthTabCallback(@NotNull Context context, @NotNull formatToParts formattoparts, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(formattoparts, "");
            context.startActivity(dynamicValue.onNavigationEvent.onWarmupCompleted().onExtraCallbackWithResult(context, formattoparts.onWarmupCompleted(), false, str));
        }
    }
}
