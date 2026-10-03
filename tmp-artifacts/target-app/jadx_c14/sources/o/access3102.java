package o;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.base.BaseActivity;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.utils.RxUtils;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.AppNode;
import o.access3102;
import o.parcelStartParams;
import o.setSignatureKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.databinding.RowConsumptionTransactionFilterBinding;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class access3102 {
    public static final int IAuthTabCallback = exitAllPages.onExtraCallbackWithResult;
    private final onExtraCallback onNavigationEvent;
    private final exitAllPages<NativeKeyboardObserverSpec> onWarmupCompleted;

    public interface onExtraCallback {
        void ICustomTabsServiceStubProxy();

        void validateRelationship();
    }

    public access3102(@NotNull exitAllPages<NativeKeyboardObserverSpec> exitallpages, @Nullable onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(exitallpages, "");
        this.onWarmupCompleted = exitallpages;
        this.onNavigationEvent = onextracallback;
    }

    public final void onExtraCallback() {
        exitAllPages<NativeKeyboardObserverSpec> exitallpages = this.onWarmupCompleted;
        parcelStartParams.onNavigationEvent onnavigationevent = new parcelStartParams.onNavigationEvent();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        onnavigationevent.onExtraCallback(onWarmupCompleted.onNavigationEvent);
        onnavigationevent.onExtraCallback(new Function2() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionFilterDelegate$$ExternalSyntheticLambda6
            public final Object invoke(Object obj, Object obj2) {
                return access3102.onWarmupCompleted(objectRef, this, (AppNode) obj, (access3102.onExtraCallbackWithResult) obj2);
            }
        });
        if (onnavigationevent.onNavigationEvent() == null && onnavigationevent.IAuthTabCallback() == null) {
            onnavigationevent.onExtraCallbackWithResult(onNavigationEvent.onExtraCallback);
        }
        exitallpages.onExtraCallbackWithResult(onnavigationevent.onExtraCallback());
    }

    static final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements getBacktraceNote<LayoutInflater, ViewGroup, Boolean, RowConsumptionTransactionFilterBinding> {
        public static final onWarmupCompleted onNavigationEvent = new onWarmupCompleted();

        onWarmupCompleted() {
            super(3, RowConsumptionTransactionFilterBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lviva/republica/toss/databinding/RowConsumptionTransactionFilterBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return onNavigationEvent((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        public final RowConsumptionTransactionFilterBinding onNavigationEvent(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            return RowConsumptionTransactionFilterBinding.onWarmupCompleted(layoutInflater, viewGroup, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(Ref.ObjectRef objectRef, final access3102 access3102Var, AppNode appNode, final onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(appNode, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        final RowConsumptionTransactionFilterBinding rowConsumptionTransactionFilterBinding = (RowConsumptionTransactionFilterBinding) appNode.onExtraCallbackWithResult();
        if (onextracallbackwithresult.onNavigationEvent().length() > 0) {
            Typography5 typography5 = rowConsumptionTransactionFilterBinding.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(typography5, "");
            typography5.setVisibility(0);
            rowConsumptionTransactionFilterBinding.IAuthTabCallback.setText(onextracallbackwithresult.onNavigationEvent());
            rowConsumptionTransactionFilterBinding.IAuthTabCallback.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionFilterDelegate$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    access3102.onExtraCallbackWithResult(this.f$0, view);
                }
            });
            ConstraintLayout root = rowConsumptionTransactionFilterBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            DisplayMetrics displayMetrics = ((RecyclerView.ViewHolder) appNode).onNavigationEvent.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            root.setPadding(root.getPaddingLeft(), root.getPaddingTop(), root.getPaddingRight(), varyMatches.onNavigationEvent(16, displayMetrics));
        } else {
            Typography5 typography52 = rowConsumptionTransactionFilterBinding.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(typography52, "");
            typography52.setVisibility(8);
            ConstraintLayout root2 = rowConsumptionTransactionFilterBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            root2.setPadding(root2.getPaddingLeft(), root2.getPaddingTop(), root2.getPaddingRight(), 0);
        }
        rowConsumptionTransactionFilterBinding.onWarmupCompleted.onExtraCallback.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionFilterDelegate$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                access3102.IAuthTabCallback(this.f$0, view);
            }
        });
        rowConsumptionTransactionFilterBinding.onWarmupCompleted.onNavigationEvent.setText(onextracallbackwithresult.onExtraCallbackWithResult());
        setSignatureKey setsignaturekeyOnExtraCallback = onextracallbackwithresult.onExtraCallback();
        if (setsignaturekeyOnExtraCallback == null) {
            FrameLayout root3 = rowConsumptionTransactionFilterBinding.onWarmupCompleted.getRoot();
            Intrinsics.checkNotNullExpressionValue(root3, "");
            root3.setVisibility(8);
        } else {
            FrameLayout root4 = rowConsumptionTransactionFilterBinding.onWarmupCompleted.getRoot();
            Intrinsics.checkNotNullExpressionValue(root4, "");
            root4.setVisibility(0);
            FrameLayout root5 = rowConsumptionTransactionFilterBinding.onWarmupCompleted.getRoot();
            Intrinsics.checkNotNullExpressionValue(root5, "");
            UST_PKCS12_MakePFX.onExtraCallback(root5, setsignaturekeyOnExtraCallback);
            deserializeUriNullableCollection deserializeurinullablecollection = (deserializeUriNullableCollection) objectRef.element;
            if (deserializeurinullablecollection != null) {
                zzbr.onWarmupCompleted(deserializeurinullablecollection);
            }
            if (setsignaturekeyOnExtraCallback.isSuccess() || (setsignaturekeyOnExtraCallback.isError() && onextracallbackwithresult.onExtraCallbackWithResult().length() > 0)) {
                writeRaw writerawIAuthTabCallback = writeRaw.onExtraCallback(setSignatureKey.NONE).IAuthTabCallback(1500L, TimeUnit.MILLISECONDS);
                Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
                writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
                Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
                final Function1 function1 = new Function1() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionFilterDelegate$$ExternalSyntheticLambda2
                    public final Object invoke(Object obj) {
                        return access3102.onNavigationEvent(onextracallbackwithresult, rowConsumptionTransactionFilterBinding, (setSignatureKey) obj);
                    }
                };
                deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionFilterDelegate$$ExternalSyntheticLambda3
                    public final void accept(Object obj) {
                        access3102.IAuthTabCallback(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionFilterDelegate$$ExternalSyntheticLambda4
                    public final Object invoke(Object obj) {
                        return access3102.onExtraCallback((Throwable) obj);
                    }
                };
                objectRef.element = writerawIAuthTabCallback2.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionFilterDelegate$$ExternalSyntheticLambda5
                    public final void accept(Object obj) {
                        access3102.onExtraCallback(function12, obj);
                    }
                });
                Context context = rowConsumptionTransactionFilterBinding.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                BaseActivity baseActivityOnWarmupCompleted = onJsBridgeReady.onWarmupCompleted(context);
                if (baseActivityOnWarmupCompleted != null) {
                    Object obj = objectRef.element;
                    Intrinsics.checkNotNull(obj);
                    baseActivityOnWarmupCompleted.addSubscription((deserializeUriNullableCollection) obj);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(access3102 access3102Var, View view) {
        onExtraCallback onextracallback = access3102Var.onNavigationEvent;
        if (onextracallback != null) {
            onextracallback.ICustomTabsServiceStubProxy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(access3102 access3102Var, View view) {
        onExtraCallback onextracallback = access3102Var.onNavigationEvent;
        if (onextracallback != null) {
            onextracallback.validateRelationship();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final class onNavigationEvent implements Function1<Object, Boolean> {
        public static final onNavigationEvent onExtraCallback = new onNavigationEvent();

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof onExtraCallbackWithResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult, RowConsumptionTransactionFilterBinding rowConsumptionTransactionFilterBinding, setSignatureKey setsignaturekey) {
        onextracallbackwithresult.IAuthTabCallback(setsignaturekey);
        FrameLayout root = rowConsumptionTransactionFilterBinding.onWarmupCompleted.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        Intrinsics.checkNotNull(setsignaturekey);
        UST_PKCS12_MakePFX.onExtraCallback(root, setsignaturekey);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final class onExtraCallbackWithResult implements NativeKeyboardObserverSpec {
        private String onExtraCallback;
        private setSignatureKey onExtraCallbackWithResult;
        private final String onWarmupCompleted;

        public onExtraCallbackWithResult() {
            this(null, null, null, 7, null);
        }

        public onExtraCallbackWithResult(@Nullable setSignatureKey setsignaturekey, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onExtraCallbackWithResult = setsignaturekey;
            this.onExtraCallback = str;
            this.onWarmupCompleted = str2;
        }

        @Override // o.NativeKeyboardObserverSpec
        public /* bridge */ long IAuthTabCallback() {
            return super.IAuthTabCallback();
        }

        public /* synthetic */ onExtraCallbackWithResult(setSignatureKey setsignaturekey, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? setSignatureKey.NONE : setsignaturekey, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
        }

        public final void IAuthTabCallback(@Nullable setSignatureKey setsignaturekey) {
            this.onExtraCallbackWithResult = setsignaturekey;
        }

        public final setSignatureKey onExtraCallback() {
            return this.onExtraCallbackWithResult;
        }

        public final String onExtraCallbackWithResult() {
            return this.onExtraCallback;
        }

        public final String onNavigationEvent() {
            return this.onWarmupCompleted;
        }

        @Override // o.NativeKeyboardObserverSpec
        public String onWarmupCompleted() {
            return "FILTER";
        }
    }
}
