package viva.republica.toss.home.consumption.transaction;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CheckMask;
import o.CommonModule_closeView;
import o.ResetInputBGRLivenessChecker;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.isOneShot;
import o.noStore;
import o.readIntokhttp;
import o.setProtocolsokhttp;
import o.setVisitUrl;
import o.setX509Certificate;
import o.zzaj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.home.consumption.transaction.HomeYearMonthSelectLegacyView$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class HomeYearMonthSelectLegacyView extends FrameLayout {
    private String IAuthTabCallback;
    private final setX509Certificate onExtraCallbackWithResult;
    private onWarmupCompleted onNavigationEvent;
    private final Lazy onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HomeYearMonthSelectLegacyView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HomeYearMonthSelectLegacyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asInterface implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public asInterface(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallback implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onTransact implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onTransact(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeYearMonthSelectLegacyView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setX509Certificate setx509certificateOnExtraCallback = setX509Certificate.onExtraCallback(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(setx509certificateOnExtraCallback, "");
        this.onExtraCallbackWithResult = setx509certificateOnExtraCallback;
        this.IAuthTabCallback = "";
        setx509certificateOnExtraCallback.IAuthTabCallback.setOnClickListener(new HomeYearMonthSelectLegacyView$.ExternalSyntheticLambda0(this));
        setx509certificateOnExtraCallback.onNavigationEvent.setOnClickListener(new HomeYearMonthSelectLegacyView$.ExternalSyntheticLambda1(this));
        setx509certificateOnExtraCallback.onExtraCallback.setOnClickListener(new HomeYearMonthSelectLegacyView$.ExternalSyntheticLambda2(this));
        Typography5 typography5 = setx509certificateOnExtraCallback.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        SuspendAnimationKtExternalSyntheticLambda4.IAuthTabCallback iAuthTabCallback = SuspendAnimationKtExternalSyntheticLambda4.IAuthTabCallback.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(iAuthTabCallback, "");
        setProtocolsokhttp.IAuthTabCallback(typography5, iAuthTabCallback, ContextCompat.getString(context, R.string.app_change_year_month));
        this.onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new HomeYearMonthSelectLegacyView$.ExternalSyntheticLambda3(context));
    }

    public /* synthetic */ HomeYearMonthSelectLegacyView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(HomeYearMonthSelectLegacyView homeYearMonthSelectLegacyView, View view) {
        isOneShot.onExtraCallbackWithResult(homeYearMonthSelectLegacyView, noStore.Companion.asBinder());
        onWarmupCompleted onwarmupcompleted = homeYearMonthSelectLegacyView.onNavigationEvent;
        if (onwarmupcompleted != null) {
            onwarmupcompleted.onWarmupCompleted(homeYearMonthSelectLegacyView.IAuthTabCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(HomeYearMonthSelectLegacyView homeYearMonthSelectLegacyView, View view) {
        isOneShot.onExtraCallbackWithResult(homeYearMonthSelectLegacyView, noStore.Companion.asBinder());
        onWarmupCompleted onwarmupcompleted = homeYearMonthSelectLegacyView.onNavigationEvent;
        if (onwarmupcompleted != null) {
            onwarmupcompleted.onNavigationEvent(homeYearMonthSelectLegacyView.IAuthTabCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackStub(HomeYearMonthSelectLegacyView homeYearMonthSelectLegacyView, View view) {
        isOneShot.onExtraCallbackWithResult(homeYearMonthSelectLegacyView, noStore.Companion.asBinder());
        onWarmupCompleted onwarmupcompleted = homeYearMonthSelectLegacyView.onNavigationEvent;
        if (onwarmupcompleted != null) {
            onwarmupcompleted.onExtraCallbackWithResult(homeYearMonthSelectLegacyView.IAuthTabCallback);
        }
    }

    public final void setYearMonth(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.IAuthTabCallback = str;
        onWarmupCompleted(str, list);
        onNavigationEvent(str);
    }

    private final void onWarmupCompleted(String str, List<String> list) {
        setX509Certificate setx509certificate = this.onExtraCallbackWithResult;
        Iterator<String> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it.next(), str)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            setx509certificate.onNavigationEvent.setEnabled(false);
            TdsImageView tdsImageView = setx509certificate.onNavigationEvent;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsImageView.setColorFilter(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onExtraCallbackWithResult(configuration))}, 71998626, -71998625, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
            setx509certificate.IAuthTabCallback.setEnabled(false);
            TdsImageView tdsImageView2 = setx509certificate.IAuthTabCallback;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            tdsImageView2.setColorFilter(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onExtraCallback(configuration2))}, 71998626, -71998625, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
            return;
        }
        if (i == 0) {
            setx509certificate.onNavigationEvent.setEnabled(false);
            TdsImageView tdsImageView3 = setx509certificate.onNavigationEvent;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration3 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            tdsImageView3.setColorFilter(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onNavigationEvent(configuration3))}, 71998626, -71998625, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
            setx509certificate.IAuthTabCallback.setEnabled(true);
            TdsImageView tdsImageView4 = setx509certificate.IAuthTabCallback;
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            Configuration configuration4 = context4.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration4, "");
            tdsImageView4.setColorFilter(new getUrlokhttp(new IAuthTabCallback(configuration4)).onPostMessage());
            return;
        }
        if (i == list.size() - 1) {
            setx509certificate.onNavigationEvent.setEnabled(true);
            TdsImageView tdsImageView5 = setx509certificate.onNavigationEvent;
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            Configuration configuration5 = context5.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration5, "");
            tdsImageView5.setColorFilter(new getUrlokhttp(new onTransact(configuration5)).onPostMessage());
            setx509certificate.IAuthTabCallback.setEnabled(false);
            TdsImageView tdsImageView6 = setx509certificate.IAuthTabCallback;
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            Configuration configuration6 = context6.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration6, "");
            tdsImageView6.setColorFilter(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new IAuthTabCallbackDefault(configuration6))}, 71998626, -71998625, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
            return;
        }
        setx509certificate.onNavigationEvent.setEnabled(true);
        TdsImageView tdsImageView7 = setx509certificate.onNavigationEvent;
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        Configuration configuration7 = context7.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration7, "");
        tdsImageView7.setColorFilter(new getUrlokhttp(new IAuthTabCallbackStub(configuration7)).onPostMessage());
        setx509certificate.IAuthTabCallback.setEnabled(true);
        TdsImageView tdsImageView8 = setx509certificate.IAuthTabCallback;
        Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "");
        Configuration configuration8 = context8.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration8, "");
        tdsImageView8.setColorFilter(new getUrlokhttp(new asInterface(configuration8)).onPostMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat onNavigationEvent(Context context) {
        return new SimpleDateFormat(context.getString(R.string.app_home_year_month_select_legacy_month_format));
    }

    private final SimpleDateFormat onWarmupCompleted() {
        return (SimpleDateFormat) this.onWarmupCompleted.getValue();
    }

    private final void onNavigationEvent(String str) {
        Object obj;
        String strOnExtraCallback;
        Calendar calendarOnNavigationEvent = zzaj.onWarmupCompleted().onNavigationEvent();
        int i = calendarOnNavigationEvent.get(1);
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(CommonModule_closeView.onWarmupCompleted.extraCallbackWithResult().parse(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        Date dateAsBinder = (Date) obj;
        if (dateAsBinder == null) {
            dateAsBinder = zzaj.onWarmupCompleted().asBinder();
        }
        calendarOnNavigationEvent.setTime(dateAsBinder);
        if (i == calendarOnNavigationEvent.get(1)) {
            strOnExtraCallback = onWarmupCompleted().format(calendarOnNavigationEvent.getTime());
        } else {
            ResetInputBGRLivenessChecker resetInputBGRLivenessCheckerOnExtraCallbackWithResult = CheckMask.onWarmupCompleted.onExtraCallback.onExtraCallbackWithResult();
            Date time = calendarOnNavigationEvent.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "");
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            strOnExtraCallback = ResetInputBGRLivenessChecker.onExtraCallback(resetInputBGRLivenessCheckerOnExtraCallbackWithResult, time, context, (TimeZone) null, 4, (Object) null);
        }
        this.onExtraCallbackWithResult.onExtraCallback.setText(strOnExtraCallback);
    }

    public final void setOnYearMonthSelectListener(@NotNull onWarmupCompleted onwarmupcompleted) {
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.onNavigationEvent = onwarmupcompleted;
    }
}
