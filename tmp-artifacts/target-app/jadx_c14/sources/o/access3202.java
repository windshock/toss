package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode;
import o.access3202;
import o.parcelStartParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.databinding.RowConsumptionTransactionDividerBinding;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class access3202 {
    public static final int IAuthTabCallback = exitAllPages.onExtraCallbackWithResult;
    private final exitAllPages<NativeKeyboardObserverSpec> onNavigationEvent;

    public access3202(@NotNull exitAllPages<NativeKeyboardObserverSpec> exitallpages) {
        Intrinsics.checkNotNullParameter(exitallpages, "");
        this.onNavigationEvent = exitallpages;
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements getBacktraceNote<LayoutInflater, ViewGroup, Boolean, RowConsumptionTransactionDividerBinding> {
        public static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback();

        IAuthTabCallback() {
            super(3, RowConsumptionTransactionDividerBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lviva/republica/toss/databinding/RowConsumptionTransactionDividerBinding;", 0);
        }

        public final RowConsumptionTransactionDividerBinding IAuthTabCallback(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            return RowConsumptionTransactionDividerBinding.onNavigationEvent(layoutInflater, viewGroup, z);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return IAuthTabCallback((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    public final void onExtraCallback() {
        exitAllPages<NativeKeyboardObserverSpec> exitallpages = this.onNavigationEvent;
        parcelStartParams.onNavigationEvent onnavigationevent = new parcelStartParams.onNavigationEvent();
        onnavigationevent.onExtraCallback(IAuthTabCallback.IAuthTabCallback);
        onnavigationevent.onExtraCallback(new Function2() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionDividerDelegate$$ExternalSyntheticLambda0
            public final Object invoke(Object obj, Object obj2) {
                return access3202.IAuthTabCallback((AppNode) obj, (access3202.onWarmupCompleted) obj2);
            }
        });
        if (onnavigationevent.onNavigationEvent() == null && onnavigationevent.IAuthTabCallback() == null) {
            onnavigationevent.onExtraCallbackWithResult(onNavigationEvent.onNavigationEvent);
        }
        exitallpages.onExtraCallbackWithResult(onnavigationevent.onExtraCallback());
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(AppNode appNode, onWarmupCompleted onwarmupcompleted) {
        int iIsEngagementSignalsApiAvailable;
        Intrinsics.checkNotNullParameter(appNode, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        RowConsumptionTransactionDividerBinding rowConsumptionTransactionDividerBinding = (RowConsumptionTransactionDividerBinding) appNode.onExtraCallbackWithResult();
        View view = rowConsumptionTransactionDividerBinding.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = onwarmupcompleted.onTransact();
            marginLayoutParams.bottomMargin = onwarmupcompleted.onNavigationEvent();
            marginLayoutParams.leftMargin = onwarmupcompleted.IAuthTabCallbackDefault();
            marginLayoutParams.height = onwarmupcompleted.onExtraCallback();
            view.setLayoutParams(marginLayoutParams);
            View view2 = rowConsumptionTransactionDividerBinding.onNavigationEvent;
            Integer numOnExtraCallbackWithResult = onwarmupcompleted.onExtraCallbackWithResult();
            if (numOnExtraCallbackWithResult != null) {
                iIsEngagementSignalsApiAvailable = numOnExtraCallbackWithResult.intValue();
            } else {
                View view3 = ((RecyclerView.ViewHolder) appNode).onNavigationEvent;
                Intrinsics.checkNotNullExpressionValue(view3, "");
                Context context = view3.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Configuration configuration = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                iIsEngagementSignalsApiAvailable = new getUrlokhttp(new onExtraCallbackWithResult(configuration)).isEngagementSignalsApiAvailable();
            }
            view2.setBackgroundColor(iIsEngagementSignalsApiAvailable);
            return Unit.INSTANCE;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final class onWarmupCompleted implements NativeKeyboardObserverSpec {
        private final int IAuthTabCallback;
        private final int onExtraCallback;
        private final int onExtraCallbackWithResult;
        private final Integer onNavigationEvent;
        private final int onWarmupCompleted;

        public onWarmupCompleted() {
            this(0, 0, 0, 0, null, 31, null);
        }

        public onWarmupCompleted(int i, int i2, int i3, int i4, @Nullable Integer num) {
            this.IAuthTabCallback = i;
            this.onWarmupCompleted = i2;
            this.onExtraCallback = i3;
            this.onExtraCallbackWithResult = i4;
            this.onNavigationEvent = num;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onWarmupCompleted(int i, int i2, int i3, int i4, Integer num, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            int iOnNavigationEvent;
            int iOnNavigationEvent2;
            int i6 = (i5 & 1) != 0 ? 0 : i;
            int i7 = (i5 & 2) == 0 ? i2 : 0;
            if ((i5 & 4) != 0) {
                DisplayMetrics displayMetrics = ((Resources) followRedirects.IAuthTabCallback(1316113812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{followRedirects.onExtraCallbackWithResult}, -1316113811, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
            } else {
                iOnNavigationEvent = i3;
            }
            if ((i5 & 8) != 0) {
                DisplayMetrics displayMetrics2 = ((Resources) followRedirects.IAuthTabCallback(1316113812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{followRedirects.onExtraCallbackWithResult}, -1316113811, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                iOnNavigationEvent2 = varyMatches.onNavigationEvent(Double.valueOf(0.5d), displayMetrics2);
            } else {
                iOnNavigationEvent2 = i4;
            }
            this(i6, i7, iOnNavigationEvent, iOnNavigationEvent2, (i5 & 16) != 0 ? null : num);
        }

        @Override // o.NativeKeyboardObserverSpec
        public /* bridge */ long IAuthTabCallback() {
            return super.IAuthTabCallback();
        }

        public final int onTransact() {
            return this.IAuthTabCallback;
        }

        public final int onNavigationEvent() {
            return this.onWarmupCompleted;
        }

        public final int IAuthTabCallbackDefault() {
            return this.onExtraCallback;
        }

        public final int onExtraCallback() {
            return this.onExtraCallbackWithResult;
        }

        public final Integer onExtraCallbackWithResult() {
            return this.onNavigationEvent;
        }

        @Override // o.NativeKeyboardObserverSpec
        public String onWarmupCompleted() {
            return this.IAuthTabCallback + ":" + this.onWarmupCompleted + ":" + this.onExtraCallback;
        }
    }

    public static final class onNavigationEvent implements Function1<Object, Boolean> {
        public static final onNavigationEvent onNavigationEvent = new onNavigationEvent();

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof onWarmupCompleted);
        }
    }
}
