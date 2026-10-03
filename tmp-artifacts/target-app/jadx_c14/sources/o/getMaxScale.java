package o;

import android.app.Activity;
import android.content.DialogInterface;
import android.util.DisplayMetrics;
import im.toss.base.BaseActivity;
import im.toss.core.R;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import o.getMaxScale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.guest.underFourteen.PendingEnrollmentActivity;
import viva.republica.toss.util.RRNUtils;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getMaxScale {
    public static final getMaxScale IAuthTabCallback = new getMaxScale();

    private getMaxScale() {
    }

    public final boolean asInterface() {
        return addPolicy.onSessionEnded().onExtraCallback("under.fourteen", false);
    }

    public final void IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        addPolicy.onSessionEnded().onNavigationEvent("under.fourteen", true);
        addPolicy.onSessionEnded().onNavigationEvent("under.fourteen.phone.number", str);
        addPolicy.onSessionEnded().onNavigationEvent("under.fourteen.name", str2);
        addPolicy.onSessionEnded().onNavigationEvent("under.fourteen.birthday", str3);
        addPolicy.onSessionEnded().onNavigationEvent("under.fourteen.rrn.seventh", str4);
        addPolicy.onSessionEnded().onNavigationEvent("under.fourteen.carrier", str5);
    }

    public final Date onTransact() throws ParseException {
        Date date = new SimpleDateFormat("yyyyMMdd").parse(access000());
        if (date == null) {
            return new Date();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(1, 7);
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "");
        return time;
    }

    public final int IAuthTabCallbackDefault() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return (int) ((onTransact().getTime() - calendar.getTime().getTime()) / 86400000);
    }

    public final String IAuthTabCallback() {
        return addPolicy.onSessionEnded().onExtraCallbackWithResult("under.fourteen.phone.number", "");
    }

    public final String onWarmupCompleted() {
        return addPolicy.onSessionEnded().onExtraCallbackWithResult("under.fourteen.name", "");
    }

    public final String onNavigationEvent() {
        return addPolicy.onSessionEnded().onExtraCallbackWithResult("under.fourteen.birthday", "");
    }

    public final String asBinder() {
        return addPolicy.onSessionEnded().onExtraCallbackWithResult("under.fourteen.rrn.seventh", "");
    }

    public final String onExtraCallback() {
        return addPolicy.onSessionEnded().onExtraCallbackWithResult("under.fourteen.carrier", "");
    }

    private final String access000() {
        return RRNUtils.onExtraCallback.onNavigationEvent(onNavigationEvent(), asBinder());
    }

    public final void onExtraCallback(@NotNull Activity activity, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Calendar calendarOnWarmupCompleted = commonTestFlag.onExtraCallback.onWarmupCompleted("yyyyMMdd", access000());
        if (calendarOnWarmupCompleted == null) {
            return;
        }
        Object[] objArr = {TdsDialogV1.Companion.onExtraCallback(activity), Integer.valueOf(R.drawable.icn_customized_color)};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -963962278, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 963962280, objArr, iOnExtraCallback);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = activity.getString(viva.republica.toss.R.string.pending_enrollment_under_seven_dialog_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(calendarOnWarmupCompleted.get(1)), Integer.valueOf(calendarOnWarmupCompleted.get(2) + 1), Integer.valueOf(calendarOnWarmupCompleted.get(5))}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "");
        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted2 = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompleted.onNavigationEvent(str);
        String string2 = activity.getString(viva.republica.toss.R.string.pending_enrollment_under_seven_dialog_message);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TdsDialogV1 typedObject = ((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallback(TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompleted2.onExtraCallbackWithResult(string2), viva.republica.toss.R.string.pending_enrollment_under_seven_dialog_positive_button_title, new DialogInterface.OnClickListener() { // from class: viva.republica.toss.guest.underFourteen.PendingEnrollmentManager$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                getMaxScale.onNavigationEvent(function0, dialogInterface, i);
            }
        }, new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.PRIMARY, TdsButtonV1View.IAuthTabCallbackDefault.FILL, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 12, (DefaultConstructorMarker) null), false, 8, (Object) null), viva.republica.toss.R.string.pending_enrollment_under_seven_dialog_negative_button_title, new DialogInterface.OnClickListener() { // from class: viva.republica.toss.guest.underFourteen.PendingEnrollmentManager$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                getMaxScale.onExtraCallbackWithResult(function02, dialogInterface, i);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null).onNavigationEvent(false)).readTypedObject();
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        TdsImageView tdsImageView = (TdsImageView) TdsDialogV1.onWarmupCompleted(162690133, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{typedObject}, iOnNavigationEvent, iOnNavigationEvent2, -162690126);
        DisplayMetrics displayMetrics = typedObject.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        tdsImageView.setPadding(tdsImageView.getPaddingLeft(), varyMatches.onNavigationEvent(Float.valueOf(32.0f), displayMetrics), tdsImageView.getPaddingRight(), tdsImageView.getPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(Function0 function0, DialogInterface dialogInterface, int i) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(Function0 function0, DialogInterface dialogInterface, int i) {
        function0.invoke();
    }

    public final void onExtraCallbackWithResult() {
        addPolicy.onSessionEnded().onTransact("under.fourteen");
        addPolicy.onSessionEnded().onTransact("under.fourteen.phone.number");
        addPolicy.onSessionEnded().onTransact("under.fourteen.name");
        addPolicy.onSessionEnded().onTransact("under.fourteen.birthday");
        addPolicy.onSessionEnded().onTransact("under.fourteen.carrier");
    }

    public final boolean IAuthTabCallback(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return (th instanceof TossApiCallException.ApiError) && Intrinsics.areEqual(((TossApiCallException.ApiError) th).asBinder(), "TV3007");
    }

    public final boolean IAuthTabCallbackStub() {
        createPaints createpaints = createPaints.IAuthTabCallback;
        int iIAuthTabCallback = zzan.IAuthTabCallback(mergeParams.onExtraCallbackWithResult(createpaints.onNavigationEvent(), "yyMMdd"));
        return createpaints.asInterface() && 7 <= iIAuthTabCallback && iIAuthTabCallback < 14;
    }

    public final void onNavigationEvent(@NotNull final BaseActivity baseActivity, final long j, @Nullable final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(baseActivity, "");
        createPaints createpaints = createPaints.IAuthTabCallback;
        IAuthTabCallback(createpaints.IAuthTabCallback(), createpaints.asBinder(), createpaints.onNavigationEvent(), createpaints.onTransact(), createpaints.onExtraCallback().serverValue());
        onExtraCallback((Activity) baseActivity, new Function0() { // from class: viva.republica.toss.guest.underFourteen.PendingEnrollmentManager$$ExternalSyntheticLambda0
            public final Object invoke() {
                return getMaxScale.onNavigationEvent(baseActivity, j);
            }
        }, new Function0() { // from class: viva.republica.toss.guest.underFourteen.PendingEnrollmentManager$$ExternalSyntheticLambda1
            public final Object invoke() {
                return getMaxScale.onExtraCallback(function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(BaseActivity baseActivity, long j) {
        baseActivity.startActivity(PendingEnrollmentActivity.Companion.onExtraCallbackWithResult(baseActivity, j));
        baseActivity.finishAffinity();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
