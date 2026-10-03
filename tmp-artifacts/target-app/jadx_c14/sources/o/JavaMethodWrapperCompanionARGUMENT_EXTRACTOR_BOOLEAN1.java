package o;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.AmountTop;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppMsgReceiver2;
import o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_BOOLEAN1;
import o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1;
import o.access502;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_BOOLEAN1 extends exitAllPages<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1> {
    public static final int IAuthTabCallback = exitAllPages.onExtraCallbackWithResult;

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallback implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
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
        final /* synthetic */ Configuration onWarmupCompleted;

        public onNavigationEvent(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallbackDefault implements Function1<Object, Boolean> {
        public static final IAuthTabCallbackDefault onWarmupCompleted = new IAuthTabCallbackDefault();

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.onTransact);
        }
    }

    public static final class IAuthTabCallbackStub implements Function1<Object, Boolean> {
        public static final IAuthTabCallbackStub IAuthTabCallback = new IAuthTabCallbackStub();

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.onNavigationEvent);
        }
    }

    public static final class IAuthTabCallback_Parcel implements Function1<Object, Boolean> {
        public static final IAuthTabCallback_Parcel IAuthTabCallback = new IAuthTabCallback_Parcel();

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.asBinder);
        }
    }

    public static final class access000 implements Function1<Object, Boolean> {
        public static final access000 onExtraCallbackWithResult = new access000();

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.onExtraCallbackWithResult);
        }
    }

    public static final class access100 implements Function1<Object, Boolean> {
        public static final access100 onNavigationEvent = new access100();

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.onExtraCallback);
        }
    }

    public static final class asBinder implements Function1<Object, Boolean> {
        public static final asBinder IAuthTabCallback = new asBinder();

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.onWarmupCompleted);
        }
    }

    public static final class asInterface implements Function1<Object, Boolean> {
        public static final asInterface onWarmupCompleted = new asInterface();

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault);
        }
    }

    public static final class onTransact implements Function1<Object, Boolean> {
        public static final onTransact onWarmupCompleted = new onTransact();

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallback);
        }
    }

    public JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_BOOLEAN1() {
        access502.onExtraCallbackWithResult onextracallbackwithresult = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult.onWarmupCompleted(R.layout.item_plcc_expected_bill_amount_header);
        onextracallbackwithresult.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.plcc.adapter.PlccBillAmountListAdapter$$ExternalSyntheticLambda4
            public final Object invoke(Object obj, Object obj2) {
                return JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_BOOLEAN1.onExtraCallback((AppMsgReceiver2) obj, (JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault) obj2);
            }
        });
        if (onextracallbackwithresult.onWarmupCompleted() == null && onextracallbackwithresult.onNavigationEvent() == null) {
            onextracallbackwithresult.onExtraCallback(asInterface.onWarmupCompleted);
        }
        onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult());
        access502.onExtraCallbackWithResult onextracallbackwithresult2 = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult2.onWarmupCompleted(R.layout.row_plcc_card_transaction_detail_header);
        onextracallbackwithresult2.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.plcc.adapter.PlccBillAmountListAdapter$$ExternalSyntheticLambda5
            public final Object invoke(Object obj, Object obj2) {
                return JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_BOOLEAN1.onNavigationEvent((AppMsgReceiver2) obj, (JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.onNavigationEvent) obj2);
            }
        });
        if (onextracallbackwithresult2.onWarmupCompleted() == null && onextracallbackwithresult2.onNavigationEvent() == null) {
            onextracallbackwithresult2.onExtraCallback(IAuthTabCallbackStub.IAuthTabCallback);
        }
        onExtraCallbackWithResult(onextracallbackwithresult2.onExtraCallbackWithResult());
        access502.onExtraCallbackWithResult onextracallbackwithresult3 = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult3.onWarmupCompleted(R.layout.item_tds_list_header_v2);
        onextracallbackwithresult3.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.plcc.adapter.PlccBillAmountListAdapter$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_BOOLEAN1.onExtraCallbackWithResult((RecyclerView.ViewHolder) obj);
            }
        });
        onextracallbackwithresult3.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.plcc.adapter.PlccBillAmountListAdapter$$ExternalSyntheticLambda7
            public final Object invoke(Object obj, Object obj2) {
                return JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_BOOLEAN1.onExtraCallbackWithResult((AppMsgReceiver2) obj, (JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.onWarmupCompleted) obj2);
            }
        });
        if (onextracallbackwithresult3.onWarmupCompleted() == null && onextracallbackwithresult3.onNavigationEvent() == null) {
            onextracallbackwithresult3.onExtraCallback(asBinder.IAuthTabCallback);
        }
        onExtraCallbackWithResult(onextracallbackwithresult3.onExtraCallbackWithResult());
        access502.onExtraCallbackWithResult onextracallbackwithresult4 = new access502.onExtraCallbackWithResult();
        int i = R.layout.item_tds_list_row_v1;
        onextracallbackwithresult4.onWarmupCompleted(i);
        onextracallbackwithresult4.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.plcc.adapter.PlccBillAmountListAdapter$$ExternalSyntheticLambda8
            public final Object invoke(Object obj, Object obj2) {
                return JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_BOOLEAN1.IAuthTabCallback((AppMsgReceiver2) obj, (JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallback) obj2);
            }
        });
        if (onextracallbackwithresult4.onWarmupCompleted() == null && onextracallbackwithresult4.onNavigationEvent() == null) {
            onextracallbackwithresult4.onExtraCallback(onTransact.onWarmupCompleted);
        }
        onExtraCallbackWithResult(onextracallbackwithresult4.onExtraCallbackWithResult());
        access502.onExtraCallbackWithResult onextracallbackwithresult5 = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult5.onWarmupCompleted(i);
        onextracallbackwithresult5.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.plcc.adapter.PlccBillAmountListAdapter$$ExternalSyntheticLambda9
            public final Object invoke(Object obj, Object obj2) {
                return JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_BOOLEAN1.onNavigationEvent((AppMsgReceiver2) obj, (JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.onTransact) obj2);
            }
        });
        if (onextracallbackwithresult5.onWarmupCompleted() == null && onextracallbackwithresult5.onNavigationEvent() == null) {
            onextracallbackwithresult5.onExtraCallback(IAuthTabCallbackDefault.onWarmupCompleted);
        }
        onExtraCallbackWithResult(onextracallbackwithresult5.onExtraCallbackWithResult());
        access502.onExtraCallbackWithResult onextracallbackwithresult6 = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult6.onWarmupCompleted(R.layout.item_plcc_bill_disclaimer);
        onextracallbackwithresult6.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.plcc.adapter.PlccBillAmountListAdapter$$ExternalSyntheticLambda10
            public final Object invoke(Object obj, Object obj2) {
                return JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_BOOLEAN1.IAuthTabCallback((AppMsgReceiver2) obj, (JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.onExtraCallbackWithResult) obj2);
            }
        });
        if (onextracallbackwithresult6.onWarmupCompleted() == null && onextracallbackwithresult6.onNavigationEvent() == null) {
            onextracallbackwithresult6.onExtraCallback(access000.onExtraCallbackWithResult);
        }
        onExtraCallbackWithResult(onextracallbackwithresult6.onExtraCallbackWithResult());
        access502.onExtraCallbackWithResult onextracallbackwithresult7 = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult7.onWarmupCompleted(R.layout.item_plcc_bill_border);
        if (onextracallbackwithresult7.onWarmupCompleted() == null && onextracallbackwithresult7.onNavigationEvent() == null) {
            onextracallbackwithresult7.onExtraCallback(access100.onNavigationEvent);
        }
        onExtraCallbackWithResult(onextracallbackwithresult7.onExtraCallbackWithResult());
        access502.onExtraCallbackWithResult onextracallbackwithresult8 = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult8.onWarmupCompleted(R.layout.item_plcc_bill_space);
        if (onextracallbackwithresult8.onWarmupCompleted() == null && onextracallbackwithresult8.onNavigationEvent() == null) {
            onextracallbackwithresult8.onExtraCallback(IAuthTabCallback_Parcel.IAuthTabCallback);
        }
        onExtraCallbackWithResult(onextracallbackwithresult8.onExtraCallbackWithResult());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Unit onExtraCallback(o.AppMsgReceiver2 r35, final o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault r36) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_BOOLEAN1.onExtraCallback(o.AppMsgReceiver2, o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1$IAuthTabCallbackDefault):kotlin.Unit");
    }

    public static void onNavigationEvent(JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault iAuthTabCallbackDefault, View view) {
        iAuthTabCallbackDefault.onExtraCallbackWithResult().invoke(iAuthTabCallbackDefault);
    }

    public static Unit IAuthTabCallback(JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault iAuthTabCallbackDefault, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        iAuthTabCallbackDefault.asBinder().invoke(iAuthTabCallbackDefault);
        return Unit.INSTANCE;
    }

    public static Unit onNavigationEvent(AppMsgReceiver2 appMsgReceiver2, JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.onNavigationEvent onnavigationevent) {
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        AmountTop amountTopFindViewById = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(R.id.amountTop);
        if (amountTopFindViewById != null) {
            amountTopFindViewById.setTitle(onnavigationevent.onWarmupCompleted());
            amountTopFindViewById.setSubtitle("토스신용카드");
        }
        return Unit.INSTANCE;
    }

    public static Unit onExtraCallbackWithResult(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        TdsListHeaderV2View tdsListHeaderV2View = viewHolder.onNavigationEvent;
        TdsListHeaderV2View tdsListHeaderV2View2 = tdsListHeaderV2View instanceof TdsListHeaderV2View ? tdsListHeaderV2View : null;
        if (tdsListHeaderV2View2 != null) {
            tdsListHeaderV2View2.setHeaderType(TdsListHeaderV2View.onExtraCallback.ROW1B);
            Context context = tdsListHeaderV2View2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsListHeaderV2View2.setTitleColor(new getUrlokhttp(new IAuthTabCallback(configuration)).onPostMessage());
            Context context2 = tdsListHeaderV2View2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            tdsListHeaderV2View2.setValueColor(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onExtraCallbackWithResult(configuration2))}, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
            tdsListHeaderV2View2.setBorder(true);
            tdsListHeaderV2View2.setBorderType(ProtocolCompanion.LEFT24);
        }
        return Unit.INSTANCE;
    }

    public static Unit onExtraCallbackWithResult(AppMsgReceiver2 appMsgReceiver2, JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.onWarmupCompleted onwarmupcompleted) {
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        TdsListHeaderV2View tdsListHeaderV2View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        TdsListHeaderV2View tdsListHeaderV2View2 = tdsListHeaderV2View instanceof TdsListHeaderV2View ? tdsListHeaderV2View : null;
        if (tdsListHeaderV2View2 != null) {
            tdsListHeaderV2View2.setTitle(onwarmupcompleted.onExtraCallback());
            String strOnNavigationEvent = onwarmupcompleted.onNavigationEvent();
            if (strOnNavigationEvent == null) {
                strOnNavigationEvent = "";
            }
            tdsListHeaderV2View2.setValue(strOnNavigationEvent);
            ViewGroup.LayoutParams layoutParams = tdsListHeaderV2View2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            DisplayMetrics displayMetrics = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            marginLayoutParams.topMargin = varyMatches.onNavigationEvent(8, displayMetrics);
            tdsListHeaderV2View2.setLayoutParams(marginLayoutParams);
        }
        return Unit.INSTANCE;
    }

    public static Unit IAuthTabCallback(AppMsgReceiver2 appMsgReceiver2, final JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View instanceof TdsListRowV1View ? tdsListRowV1View : null;
        if (tdsListRowV1View2 != null) {
            tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1B);
            tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.ROW1B);
            tdsListRowV1View2.setCenterText1(iAuthTabCallback.IAuthTabCallback());
            tdsListRowV1View2.setRightText1(getLongName.IAuthTabCallback(iAuthTabCallback.onNavigationEvent(), "") + " " + iAuthTabCallback.IAuthTabCallbackStub());
            if (iAuthTabCallback.onNavigationEvent() == 0) {
                Context context = tdsListRowV1View2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Configuration configuration = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                tdsListRowV1View2.setRightText1Color(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onNavigationEvent(configuration))}, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
            } else {
                Context context2 = tdsListRowV1View2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                Configuration configuration2 = context2.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                tdsListRowV1View2.setRightText1Color(new getUrlokhttp(new onWarmupCompleted(configuration2)).onRelationshipValidationResult());
            }
            if (!iAuthTabCallback.onExtraCallbackWithResult() || iAuthTabCallback.onExtraCallback().isEmpty()) {
                tdsListRowV1View2.setRightArrow(false);
            } else {
                tdsListRowV1View2.setRightArrow(true);
                tdsListRowV1View2.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.plcc.adapter.PlccBillAmountListAdapter$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_BOOLEAN1.onExtraCallback(iAuthTabCallback, view);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    public static void onExtraCallback(JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallback iAuthTabCallback, View view) {
        iAuthTabCallback.onWarmupCompleted().invoke(iAuthTabCallback);
    }

    public static void onNavigationEvent(JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.onTransact ontransact, View view) {
        Function1<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.onTransact, Unit> function1IAuthTabCallback = ontransact.IAuthTabCallback();
        if (function1IAuthTabCallback != null) {
            function1IAuthTabCallback.invoke(ontransact);
        }
    }

    public static Unit onNavigationEvent(AppMsgReceiver2 appMsgReceiver2, final JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.onTransact ontransact) {
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(ontransact, "");
        TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View instanceof TdsListRowV1View ? tdsListRowV1View : null;
        if (tdsListRowV1View2 != null) {
            tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2E);
            tdsListRowV1View2.setCenterText1(ontransact.onNavigationEvent());
            tdsListRowV1View2.setCenterText2(ontransact.onExtraCallback());
            if (!ontransact.onWarmupCompleted().isEmpty()) {
                tdsListRowV1View2.setRightArrow(true);
                tdsListRowV1View2.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.plcc.adapter.PlccBillAmountListAdapter$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_BOOLEAN1.onNavigationEvent(ontransact, view);
                    }
                });
            }
            ViewGroup.LayoutParams layoutParams = tdsListRowV1View2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            DisplayMetrics displayMetrics = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            marginLayoutParams.topMargin = varyMatches.onNavigationEvent(16, displayMetrics);
            DisplayMetrics displayMetrics2 = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            marginLayoutParams.bottomMargin = varyMatches.onNavigationEvent(16, displayMetrics2);
            tdsListRowV1View2.setLayoutParams(marginLayoutParams);
        }
        return Unit.INSTANCE;
    }

    public static Unit IAuthTabCallback(AppMsgReceiver2 appMsgReceiver2, JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        int i = R.id.rowCreditCardNoticeTitleRow;
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) appMsgReceiver2.onWarmupCompleted().get(i);
        if (tdsListRowV1View == null) {
            tdsListRowV1View = (TdsListRowV1View) ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i);
            if (tdsListRowV1View != null) {
                appMsgReceiver2.onWarmupCompleted().put(i, tdsListRowV1View);
            } else {
                appMsgReceiver2.onWarmupCompleted().remove(i);
            }
        }
        if (tdsListRowV1View != null) {
            tdsListRowV1View.setCenterText1(onextracallbackwithresult.onWarmupCompleted());
        }
        int i2 = R.id.rowCreditCardNoticeContent;
        Typography7 typography7FindViewById = (Typography7) appMsgReceiver2.onWarmupCompleted().get(i2);
        if (typography7FindViewById == null) {
            typography7FindViewById = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i2);
            if (typography7FindViewById != null) {
                appMsgReceiver2.onWarmupCompleted().put(i2, typography7FindViewById);
            } else {
                appMsgReceiver2.onWarmupCompleted().remove(i2);
            }
        }
        if (typography7FindViewById != null && !onextracallbackwithresult.onNavigationEvent().isEmpty()) {
            Iterator<T> it = onextracallbackwithresult.onNavigationEvent().iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = ((String) next) + "\n" + ((String) it.next());
            }
            typography7FindViewById.setText((CharSequence) next);
        }
        return Unit.INSTANCE;
    }
}
