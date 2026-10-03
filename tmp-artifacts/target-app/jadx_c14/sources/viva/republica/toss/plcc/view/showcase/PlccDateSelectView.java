package viva.republica.toss.plcc.view.showcase;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BrickModuleImplExternalSyntheticLambda1;
import o.CommonModule_closeView;
import o.ConvertByteArrayToFloatArray;
import o.IdGeneratorExternalSyntheticLambda1;
import o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1;
import o.SetDetectableSize;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.readIntokhttp;
import o.setVisitUrl;
import o.then;
import o.transparentBackground;
import o.verifySignedData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;
import viva.republica.toss.plcc.view.showcase.PlccDateSelectView$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PlccDateSelectView extends LinearLayout {
    private String IAuthTabCallback;
    private Function1<? super String, Unit> asInterface;
    private final ArrayList<Pair<String, String>> onExtraCallback;
    private final verifySignedData onExtraCallbackWithResult;
    private String onNavigationEvent;
    private Pair<String, String> onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlccDateSelectView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlccDateSelectView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asBinder implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public asBinder(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallback implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onExtraCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
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

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public onNavigationEvent(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onTransact implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onTransact(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public onWarmupCompleted(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlccDateSelectView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = new ArrayList<>();
        this.onNavigationEvent = "";
        this.IAuthTabCallback = "";
        this.onWarmupCompleted = new Pair<>("", "");
        LayoutInflater.from(context).inflate(R.layout.view_plcc_date_select, (ViewGroup) this, true);
        verifySignedData verifysigneddataOnNavigationEvent = verifySignedData.onNavigationEvent(this);
        Intrinsics.checkNotNullExpressionValue(verifysigneddataOnNavigationEvent, "");
        this.onExtraCallbackWithResult = verifysigneddataOnNavigationEvent;
    }

    public /* synthetic */ PlccDateSelectView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void setDateList(@NotNull String str, @NotNull Date date, @NotNull String str2) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onExtraCallback.clear();
        Calendar calendar = Calendar.getInstance();
        Date date2 = new IdGeneratorExternalSyntheticLambda1("yyyy-MM").parse(str);
        if (date2 == null) {
            date2 = new Date();
        }
        calendar.setTime(date2);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        this.onNavigationEvent = String.valueOf(calendar2.get(1));
        String str3 = new SimpleDateFormat("yyyyMM").format(calendar2.getTime());
        Intrinsics.checkNotNullExpressionValue(str3, "");
        this.IAuthTabCallback = str3;
        while (!calendar.after(calendar2)) {
            this.onExtraCallback.add(new Pair<>(new SimpleDateFormat("yyyyMM").format(calendar.getTime()), new SimpleDateFormat("yyyy년 M월").format(calendar.getTime())));
            calendar.add(2, 1);
        }
        Iterator<T> it = this.onExtraCallback.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.areEqual(((Pair) next).getFirst(), str2)) {
                    break;
                }
            }
        }
        Pair<String, String> pair = (Pair) next;
        if (pair == null) {
            pair = new Pair<>("", "");
        }
        this.onWarmupCompleted = pair;
        onWarmupCompleted(pair);
        onExtraCallback(this.onWarmupCompleted);
        onExtraCallbackWithResult();
    }

    public final void setSelectDateListener(@NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.asInterface = function1;
    }

    private final void onExtraCallback(Pair<String, String> pair) {
        int iIndexOf = this.onExtraCallback.indexOf(pair);
        if (iIndexOf == -1) {
            return;
        }
        if (this.onExtraCallback.size() == 1) {
            TdsImageView tdsImageView = this.onExtraCallbackWithResult.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            transparentBackground.onExtraCallback(tdsImageView);
            TdsImageView tdsImageView2 = this.onExtraCallbackWithResult.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
            transparentBackground.onExtraCallback(tdsImageView2);
            TdsImageView tdsImageView3 = this.onExtraCallbackWithResult.onExtraCallback;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            Object[] objArr = {new getUrlokhttp(new onWarmupCompleted(configuration))};
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            tdsImageView3.setColorFilter(((Integer) getUrlokhttp.onNavigationEvent(objArr, 71998626, -71998625, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue());
            TdsImageView tdsImageView4 = this.onExtraCallbackWithResult.IAuthTabCallback;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            Object[] objArr2 = {new getUrlokhttp(new onExtraCallback(configuration2))};
            int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
            tdsImageView4.setColorFilter(((Integer) getUrlokhttp.onNavigationEvent(objArr2, 71998626, -71998625, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, setVisitUrl.onExtraCallbackWithResult())).intValue());
            return;
        }
        if (iIndexOf == this.onExtraCallback.size() - 1) {
            TdsImageView tdsImageView5 = this.onExtraCallbackWithResult.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView5, "");
            transparentBackground.onExtraCallback(tdsImageView5);
            TdsImageView tdsImageView6 = this.onExtraCallbackWithResult.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView6, "");
            transparentBackground.onWarmupCompleted(tdsImageView6);
            TdsImageView tdsImageView7 = this.onExtraCallbackWithResult.onExtraCallback;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration3 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            Object[] objArr3 = {new getUrlokhttp(new onNavigationEvent(configuration3))};
            int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
            tdsImageView7.setColorFilter(((Integer) getUrlokhttp.onNavigationEvent(objArr3, 71998626, -71998625, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, setVisitUrl.onExtraCallbackWithResult())).intValue());
            TdsImageView tdsImageView8 = this.onExtraCallbackWithResult.IAuthTabCallback;
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            Configuration configuration4 = context4.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration4, "");
            tdsImageView8.setColorFilter(new getUrlokhttp(new onExtraCallbackWithResult(configuration4)).onPostMessage());
            return;
        }
        if (iIndexOf == 0) {
            TdsImageView tdsImageView9 = this.onExtraCallbackWithResult.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView9, "");
            transparentBackground.onExtraCallback(tdsImageView9);
            TdsImageView tdsImageView10 = this.onExtraCallbackWithResult.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView10, "");
            transparentBackground.onWarmupCompleted(tdsImageView10);
            TdsImageView tdsImageView11 = this.onExtraCallbackWithResult.IAuthTabCallback;
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            Configuration configuration5 = context5.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration5, "");
            Object[] objArr4 = {new getUrlokhttp(new IAuthTabCallback(configuration5))};
            int iOnExtraCallbackWithResult4 = setVisitUrl.onExtraCallbackWithResult();
            tdsImageView11.setColorFilter(((Integer) getUrlokhttp.onNavigationEvent(objArr4, 71998626, -71998625, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, setVisitUrl.onExtraCallbackWithResult())).intValue());
            TdsImageView tdsImageView12 = this.onExtraCallbackWithResult.onExtraCallback;
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            Configuration configuration6 = context6.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration6, "");
            tdsImageView12.setColorFilter(new getUrlokhttp(new IAuthTabCallbackDefault(configuration6)).onPostMessage());
            return;
        }
        TdsImageView tdsImageView13 = this.onExtraCallbackWithResult.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView13, "");
        transparentBackground.onWarmupCompleted(tdsImageView13);
        TdsImageView tdsImageView14 = this.onExtraCallbackWithResult.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView14, "");
        transparentBackground.onWarmupCompleted(tdsImageView14);
        TdsImageView tdsImageView15 = this.onExtraCallbackWithResult.onExtraCallback;
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        Configuration configuration7 = context7.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration7, "");
        tdsImageView15.setColorFilter(new getUrlokhttp(new onTransact(configuration7)).onPostMessage());
        TdsImageView tdsImageView16 = this.onExtraCallbackWithResult.IAuthTabCallback;
        Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "");
        Configuration configuration8 = context8.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration8, "");
        tdsImageView16.setColorFilter(new getUrlokhttp(new asBinder(configuration8)).onPostMessage());
    }

    private final void onWarmupCompleted(Pair<String, String> pair) {
        String string;
        int iIndexOf = this.onExtraCallback.indexOf(pair);
        if (iIndexOf != -1) {
            CommonModule_closeView commonModule_closeView = CommonModule_closeView.onWarmupCompleted;
            Date date = commonModule_closeView.writeTypedObject().parse((String) pair.getFirst());
            if (date != null) {
                if (iIndexOf == this.onExtraCallback.size() - 1) {
                    string = getContext().getString(R.string.app_plcc_benefit_current_month_prefix);
                } else {
                    string = Intrinsics.areEqual(new SimpleDateFormat("yyyy").format(date), this.onNavigationEvent) ? getContext().getString(R.string.app_plcc_benefit_current_year_prefix) : getContext().getString(R.string.app_plcc_benefit_date_prefix);
                }
                Intrinsics.checkNotNull(string);
                Typography5 typography5 = this.onExtraCallbackWithResult.onExtraCallbackWithResult;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string);
                Date date2 = commonModule_closeView.writeTypedObject().parse((String) pair.getFirst());
                if (date2 == null) {
                    return;
                }
                typography5.setText(simpleDateFormat.format(date2));
            }
        }
    }

    private final void onExtraCallbackWithResult() {
        this.onExtraCallbackWithResult.IAuthTabCallback.setOnClickListener(new PlccDateSelectView$.ExternalSyntheticLambda1(this));
        this.onExtraCallbackWithResult.onExtraCallback.setOnClickListener(new PlccDateSelectView$.ExternalSyntheticLambda2(this));
        this.onExtraCallbackWithResult.onExtraCallbackWithResult.setOnClickListener(new PlccDateSelectView$.ExternalSyntheticLambda3(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(PlccDateSelectView plccDateSelectView, View view) {
        int iIndexOf = plccDateSelectView.onExtraCallback.indexOf(plccDateSelectView.onWarmupCompleted);
        if (iIndexOf > 0) {
            Pair<String, String> pair = plccDateSelectView.onExtraCallback.get(iIndexOf);
            Intrinsics.checkNotNullExpressionValue(pair, "");
            Pair<String, String> pair2 = pair;
            Pair<String, String> pair3 = plccDateSelectView.onExtraCallback.get(iIndexOf - 1);
            Intrinsics.checkNotNullExpressionValue(pair3, "");
            Pair<String, String> pair4 = pair3;
            plccDateSelectView.onWarmupCompleted = pair4;
            plccDateSelectView.onWarmupCompleted(pair4);
            plccDateSelectView.onExtraCallback(plccDateSelectView.onWarmupCompleted);
            JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted.IAuthTabCallback((String) pair2.getFirst(), "LEFT", Intrinsics.areEqual(pair2.getFirst(), plccDateSelectView.IAuthTabCallback));
            Function1<? super String, Unit> function1 = plccDateSelectView.asInterface;
            if (function1 != null) {
                function1.invoke(plccDateSelectView.onWarmupCompleted.getFirst());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(PlccDateSelectView plccDateSelectView, View view) {
        int iIndexOf = plccDateSelectView.onExtraCallback.indexOf(plccDateSelectView.onWarmupCompleted);
        if (iIndexOf < plccDateSelectView.onExtraCallback.size() - 1) {
            Pair<String, String> pair = plccDateSelectView.onExtraCallback.get(iIndexOf);
            Intrinsics.checkNotNullExpressionValue(pair, "");
            Pair<String, String> pair2 = pair;
            Pair<String, String> pair3 = plccDateSelectView.onExtraCallback.get(iIndexOf + 1);
            Intrinsics.checkNotNullExpressionValue(pair3, "");
            Pair<String, String> pair4 = pair3;
            plccDateSelectView.onWarmupCompleted = pair4;
            plccDateSelectView.onWarmupCompleted(pair4);
            plccDateSelectView.onExtraCallback(plccDateSelectView.onWarmupCompleted);
            JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted.IAuthTabCallback((String) pair2.getFirst(), "RIGHT", Intrinsics.areEqual(pair2.getFirst(), plccDateSelectView.IAuthTabCallback));
            Function1<? super String, Unit> function1 = plccDateSelectView.asInterface;
            if (function1 != null) {
                function1.invoke(plccDateSelectView.onWarmupCompleted.getFirst());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asInterface(PlccDateSelectView plccDateSelectView, View view) {
        plccDateSelectView.onNavigationEvent(plccDateSelectView.onWarmupCompleted);
    }

    private final void onNavigationEvent(Pair<String, String> pair) {
        int iIndexOf = CollectionsKt.asReversedMutable(this.onExtraCallback).indexOf(pair);
        String str = (String) ((Pair) CollectionsKt.asReversedMutable(this.onExtraCallback).get(iIndexOf)).getFirst();
        onWarmupCompleted(1333653L, (String) ((Pair) CollectionsKt.asReversedMutable(this.onExtraCallback).get(iIndexOf)).getFirst());
        JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted.IAuthTabCallback(str, then.DATE_YEAR_MONTH, Intrinsics.areEqual(str, this.IAuthTabCallback));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback iAuthTabCallback = new BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback(context);
        String string = getContext().getString(R.string.app_plcc_benefit_date_select_bottom_sheet_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback IAuthTabCallback2 = iAuthTabCallback.onExtraCallbackWithResult(string).onExtraCallback(false).onWarmupCompleted(false).IAuthTabCallback(iIndexOf);
        List listAsReversedMutable = CollectionsKt.asReversedMutable(this.onExtraCallback);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listAsReversedMutable, 10));
        Iterator it = listAsReversedMutable.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Pair) it.next()).getSecond());
        }
        Object[] objArr = {IAuthTabCallback2.onExtraCallbackWithResult(arrayList).onExtraCallback(new PlccDateSelectView$.ExternalSyntheticLambda0(this, str))};
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        ((BrickModuleImplExternalSyntheticLambda1) BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback.onExtraCallback(objArr, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, -846891035, 846891035, iOnNavigationEvent2)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(PlccDateSelectView plccDateSelectView, String str, int i) {
        Function1<? super String, Unit> function1;
        Pair<String, String> pair = plccDateSelectView.onExtraCallback.get((r0.size() - i) - 1);
        Intrinsics.checkNotNullExpressionValue(pair, "");
        Pair<String, String> pair2 = pair;
        plccDateSelectView.onWarmupCompleted = pair2;
        plccDateSelectView.onWarmupCompleted(1335003L, (String) pair2.getFirst());
        plccDateSelectView.onWarmupCompleted(plccDateSelectView.onWarmupCompleted);
        plccDateSelectView.onExtraCallback(plccDateSelectView.onWarmupCompleted);
        if (!Intrinsics.areEqual(str, plccDateSelectView.onWarmupCompleted.getFirst()) && (function1 = plccDateSelectView.asInterface) != null) {
            function1.invoke(plccDateSelectView.onWarmupCompleted.getFirst());
        }
        return Unit.INSTANCE;
    }

    private final void onWarmupCompleted(long j, String str) {
        ConvertByteArrayToFloatArray.onExtraCallback(j, false, (String) null, (Map) null, new PlccDateSelectView$.ExternalSyntheticLambda4(str), 14, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(String str, SetDetectableSize setDetectableSize) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("year_month", JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted.onNavigationEvent(str));
        return Unit.INSTANCE;
    }
}
