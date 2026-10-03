package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.CheckMask;
import o.parcelStartParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.wait.delegate.HistoryFooterDelegate$;
import viva.republica.toss.databinding.RowScrapingAccountHistoryFooterBinding;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DERInputStream {
    public static final int onExtraCallbackWithResult = exitAllPages.onExtraCallbackWithResult;
    private final onNavigationEvent IAuthTabCallback;
    private final exitAllPages<Object> onExtraCallback;

    public interface onNavigationEvent {
    }

    public static /* synthetic */ void onExtraCallbackWithResult(DERInputStream dERInputStream, View view) {
    }

    public DERInputStream(@NotNull exitAllPages<Object> exitallpages, @NotNull onNavigationEvent onnavigationevent) {
        Intrinsics.checkNotNullParameter(exitallpages, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        this.onExtraCallback = exitallpages;
        this.IAuthTabCallback = onnavigationevent;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements getBacktraceNote<LayoutInflater, ViewGroup, Boolean, RowScrapingAccountHistoryFooterBinding> {
        public static final onExtraCallback onNavigationEvent = new onExtraCallback();

        onExtraCallback() {
            super(3, RowScrapingAccountHistoryFooterBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lviva/republica/toss/databinding/RowScrapingAccountHistoryFooterBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return onExtraCallback((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        public final RowScrapingAccountHistoryFooterBinding onExtraCallback(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            return RowScrapingAccountHistoryFooterBinding.onExtraCallbackWithResult(layoutInflater, viewGroup, z);
        }
    }

    public final void onExtraCallbackWithResult() {
        exitAllPages<Object> exitallpages = this.onExtraCallback;
        parcelStartParams.onNavigationEvent onnavigationevent = new parcelStartParams.onNavigationEvent();
        onnavigationevent.onExtraCallback(onExtraCallback.onNavigationEvent);
        onnavigationevent.onExtraCallback(new HistoryFooterDelegate$.ExternalSyntheticLambda1(this));
        if (onnavigationevent.onNavigationEvent() == null && onnavigationevent.IAuthTabCallback() == null) {
            onnavigationevent.onExtraCallbackWithResult(onWarmupCompleted.onWarmupCompleted);
        }
        exitallpages.onExtraCallbackWithResult(onnavigationevent.onExtraCallback());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(DERInputStream dERInputStream, AppNode appNode, IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(appNode, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        RowScrapingAccountHistoryFooterBinding rowScrapingAccountHistoryFooterBindingOnExtraCallbackWithResult = appNode.onExtraCallbackWithResult();
        int iOnExtraCallback = iAuthTabCallback.onExtraCallback();
        if (iOnExtraCallback == 1) {
            LinearLayout linearLayout = rowScrapingAccountHistoryFooterBindingOnExtraCallbackWithResult.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
            LinearLayout linearLayout2 = rowScrapingAccountHistoryFooterBindingOnExtraCallbackWithResult.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(0);
            LinearLayout linearLayout3 = rowScrapingAccountHistoryFooterBindingOnExtraCallbackWithResult.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
            linearLayout3.setVisibility(8);
        } else if (iOnExtraCallback == 2) {
            if (iAuthTabCallback.onWarmupCompleted()) {
                LinearLayout linearLayout4 = rowScrapingAccountHistoryFooterBindingOnExtraCallbackWithResult.IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
                linearLayout4.setVisibility(8);
                LinearLayout linearLayout5 = rowScrapingAccountHistoryFooterBindingOnExtraCallbackWithResult.onNavigationEvent;
                Intrinsics.checkNotNullExpressionValue(linearLayout5, "");
                linearLayout5.setVisibility(8);
                LinearLayout linearLayout6 = rowScrapingAccountHistoryFooterBindingOnExtraCallbackWithResult.IAuthTabCallbackDefault;
                Intrinsics.checkNotNullExpressionValue(linearLayout6, "");
                linearLayout6.setVisibility(0);
                openSettings opensettingsOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult();
                if (opensettingsOnExtraCallbackWithResult != null) {
                    rowScrapingAccountHistoryFooterBindingOnExtraCallbackWithResult.asInterface.setText(mergeParams.onExtraCallbackWithResult(opensettingsOnExtraCallbackWithResult.onNavigationEvent(), true));
                    TdsImageView tdsImageView = rowScrapingAccountHistoryFooterBindingOnExtraCallbackWithResult.onExtraCallbackWithResult;
                    Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                    TdsImageView.setImage$default(tdsImageView, opensettingsOnExtraCallbackWithResult.onExtraCallback().onWarmupCompleted(rowScrapingAccountHistoryFooterBindingOnExtraCallbackWithResult.onExtraCallback().getContext()), (Function1) null, (Function1) null, 6, (Object) null);
                }
            } else {
                onNavigationEvent onnavigationevent = dERInputStream.IAuthTabCallback;
                LinearLayout linearLayout7 = rowScrapingAccountHistoryFooterBindingOnExtraCallbackWithResult.IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(linearLayout7, "");
                linearLayout7.setVisibility(0);
                LinearLayout linearLayout8 = rowScrapingAccountHistoryFooterBindingOnExtraCallbackWithResult.onNavigationEvent;
                Intrinsics.checkNotNullExpressionValue(linearLayout8, "");
                linearLayout8.setVisibility(8);
                LinearLayout linearLayout9 = rowScrapingAccountHistoryFooterBindingOnExtraCallbackWithResult.IAuthTabCallbackDefault;
                Intrinsics.checkNotNullExpressionValue(linearLayout9, "");
                linearLayout9.setVisibility(8);
                rowScrapingAccountHistoryFooterBindingOnExtraCallbackWithResult.onWarmupCompleted.setText(iAuthTabCallback.onNavigationEvent());
                rowScrapingAccountHistoryFooterBindingOnExtraCallbackWithResult.onExtraCallback.setOnClickListener(new HistoryFooterDelegate$.ExternalSyntheticLambda0(dERInputStream));
            }
        } else {
            LinearLayout linearLayout10 = rowScrapingAccountHistoryFooterBindingOnExtraCallbackWithResult.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(linearLayout10, "");
            linearLayout10.setVisibility(8);
            LinearLayout linearLayout11 = rowScrapingAccountHistoryFooterBindingOnExtraCallbackWithResult.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(linearLayout11, "");
            linearLayout11.setVisibility(8);
            LinearLayout linearLayout12 = rowScrapingAccountHistoryFooterBindingOnExtraCallbackWithResult.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(linearLayout12, "");
            linearLayout12.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public static final class onWarmupCompleted implements Function1<Object, Boolean> {
        public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof IAuthTabCallback);
        }
    }

    public static final class IAuthTabCallback {
        public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
        public static final int onExtraCallbackWithResult = 8;
        private final long IAuthTabCallback;
        private Date onExtraCallback;
        private final Date onNavigationEvent;
        private int onTransact;
        private final openSettings onWarmupCompleted;

        public IAuthTabCallback(int i, @Nullable Date date, @Nullable Date date2, @Nullable openSettings opensettings) {
            this.onTransact = i;
            this.onExtraCallback = date;
            this.onNavigationEvent = date2;
            this.onWarmupCompleted = opensettings;
            this.IAuthTabCallback = 2079435163L;
        }

        public /* synthetic */ IAuthTabCallback(int i, Date date, Date date2, openSettings opensettings, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, date, (i2 & 4) != 0 ? null : date2, (i2 & 8) != 0 ? null : opensettings);
        }

        public final int onExtraCallback() {
            return this.onTransact;
        }

        public final void onNavigationEvent(int i) {
            this.onTransact = i;
        }

        public final openSettings onExtraCallbackWithResult() {
            return this.onWarmupCompleted;
        }

        public final long IAuthTabCallback() {
            return this.IAuthTabCallback;
        }

        public final String onNavigationEvent() {
            Date date = this.onExtraCallback;
            if (date != null) {
                UserChoiceBillingListener userChoiceBillingListener = UserChoiceBillingListener.onExtraCallback;
                String string = userChoiceBillingListener.onExtraCallback().getString(R.string.app_sync_status_loaded, ResetInputBGRLivenessChecker.onExtraCallback(CheckMask.onWarmupCompleted.onExtraCallback.onExtraCallbackWithResult(), date, userChoiceBillingListener.onExtraCallback(), (TimeZone) null, 4, (Object) null));
                if (string != null) {
                    return string;
                }
            }
            String string2 = UserChoiceBillingListener.onExtraCallback.onExtraCallback().getString(R.string.app_sync_status_empty);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }

        public final boolean onWarmupCompleted() {
            if (this.onExtraCallback == null || this.onNavigationEvent == null || this.onWarmupCompleted == null) {
                return false;
            }
            zzag zzagVarOnWarmupCompleted = zzaj.onWarmupCompleted();
            IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = CommonModule_closeView.onNavigationEvent;
            Date date = this.onExtraCallback;
            Intrinsics.checkNotNull(date);
            String str = idGeneratorExternalSyntheticLambda1.format(date);
            Intrinsics.checkNotNullExpressionValue(str, "");
            Date date2 = idGeneratorExternalSyntheticLambda1.parse(str);
            Intrinsics.checkNotNull(date2);
            Calendar calendarOnWarmupCompleted = zzagVarOnWarmupCompleted.onWarmupCompleted(date2);
            calendarOnWarmupCompleted.set(5, 1);
            Calendar calendarOnWarmupCompleted2 = zzaj.onWarmupCompleted().onWarmupCompleted(this.onNavigationEvent);
            calendarOnWarmupCompleted2.set(5, 1);
            return calendarOnWarmupCompleted.compareTo(calendarOnWarmupCompleted2) <= 0;
        }

        public static final class onWarmupCompleted {
            public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onWarmupCompleted() {
            }
        }
    }
}
