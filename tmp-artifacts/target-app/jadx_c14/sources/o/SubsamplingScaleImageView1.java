package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode;
import o.SubsamplingScaleImageView1;
import o.parcelStartParams;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.databinding.RowTransactionBannerBinding;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SubsamplingScaleImageView1 {
    public static final int onExtraCallbackWithResult = exitAllPages.onExtraCallbackWithResult;
    private final onNavigationEvent IAuthTabCallback;
    private final exitAllPages<NativeKeyboardObserverSpec> onExtraCallback;

    public interface onNavigationEvent {
        void onExtraCallbackWithResult(@NotNull NativeVibrationSpec nativeVibrationSpec, @NotNull formatToParts formattoparts);

        void onNavigationEvent(@NotNull NativeVibrationSpec nativeVibrationSpec, @NotNull formatToParts formattoparts);
    }

    public SubsamplingScaleImageView1(@NotNull exitAllPages<NativeKeyboardObserverSpec> exitallpages, @NotNull onNavigationEvent onnavigationevent) {
        Intrinsics.checkNotNullParameter(exitallpages, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        this.onExtraCallback = exitallpages;
        this.IAuthTabCallback = onnavigationevent;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements getBacktraceNote<LayoutInflater, ViewGroup, Boolean, RowTransactionBannerBinding> {
        public static final onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(3, RowTransactionBannerBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lviva/republica/toss/databinding/RowTransactionBannerBinding;", 0);
        }

        public final RowTransactionBannerBinding IAuthTabCallback(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            return RowTransactionBannerBinding.onExtraCallback(layoutInflater, viewGroup, z);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return IAuthTabCallback((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    public final void onNavigationEvent() {
        exitAllPages<NativeKeyboardObserverSpec> exitallpages = this.onExtraCallback;
        parcelStartParams.onNavigationEvent onnavigationevent = new parcelStartParams.onNavigationEvent();
        onnavigationevent.onExtraCallback(onExtraCallbackWithResult.onExtraCallback);
        onnavigationevent.onWarmupCompleted(new Function1() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionBannerDelegate$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return SubsamplingScaleImageView1.onExtraCallbackWithResult((AppNode) obj);
            }
        });
        onnavigationevent.onExtraCallback(new Function2() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionBannerDelegate$$ExternalSyntheticLambda1
            public final Object invoke(Object obj, Object obj2) {
                return SubsamplingScaleImageView1.onNavigationEvent(this.f$0, (AppNode) obj, (SubsamplingScaleImageView1.onExtraCallback) obj2);
            }
        });
        if (onnavigationevent.onNavigationEvent() == null && onnavigationevent.IAuthTabCallback() == null) {
            onnavigationevent.onExtraCallbackWithResult(IAuthTabCallback.onExtraCallback);
        }
        exitallpages.onExtraCallbackWithResult(onnavigationevent.onExtraCallback());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(AppNode appNode) {
        Intrinsics.checkNotNullParameter(appNode, "");
        ((RowTransactionBannerBinding) appNode.onExtraCallbackWithResult()).IAuthTabCallback.setRoundType(14);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(final SubsamplingScaleImageView1 subsamplingScaleImageView1, AppNode appNode, final onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(appNode, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        RowTransactionBannerBinding rowTransactionBannerBinding = (RowTransactionBannerBinding) appNode.onExtraCallbackWithResult();
        subsamplingScaleImageView1.IAuthTabCallback.onExtraCallbackWithResult(onextracallback.onExtraCallback(), onextracallback.onNavigationEvent());
        rowTransactionBannerBinding.onExtraCallbackWithResult.setText(onextracallback.onExtraCallback().IAuthTabCallbackDefault());
        rowTransactionBannerBinding.onNavigationEvent.setText(onextracallback.onExtraCallback().onTransact());
        rowTransactionBannerBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionBannerDelegate$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubsamplingScaleImageView1.onExtraCallbackWithResult(this.f$0, onextracallback, view);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(SubsamplingScaleImageView1 subsamplingScaleImageView1, onExtraCallback onextracallback, View view) {
        subsamplingScaleImageView1.IAuthTabCallback.onNavigationEvent(onextracallback.onExtraCallback(), onextracallback.onNavigationEvent());
    }

    public static final class onExtraCallback implements NativeKeyboardObserverSpec {
        private final NativeVibrationSpec IAuthTabCallback;
        private final formatToParts onExtraCallbackWithResult;

        public onExtraCallback(@NotNull formatToParts formattoparts, @NotNull NativeVibrationSpec nativeVibrationSpec) {
            Intrinsics.checkNotNullParameter(formattoparts, "");
            Intrinsics.checkNotNullParameter(nativeVibrationSpec, "");
            this.onExtraCallbackWithResult = formattoparts;
            this.IAuthTabCallback = nativeVibrationSpec;
        }

        @Override // o.NativeKeyboardObserverSpec
        public /* bridge */ long IAuthTabCallback() {
            return super.IAuthTabCallback();
        }

        public final formatToParts onNavigationEvent() {
            return this.onExtraCallbackWithResult;
        }

        public final NativeVibrationSpec onExtraCallback() {
            return this.IAuthTabCallback;
        }

        @Override // o.NativeKeyboardObserverSpec
        public String onWarmupCompleted() {
            return this.onExtraCallbackWithResult + ":" + this.IAuthTabCallback.hashCode();
        }
    }

    public static final class IAuthTabCallback implements Function1<Object, Boolean> {
        public static final IAuthTabCallback onExtraCallback = new IAuthTabCallback();

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof onExtraCallback);
        }
    }
}
