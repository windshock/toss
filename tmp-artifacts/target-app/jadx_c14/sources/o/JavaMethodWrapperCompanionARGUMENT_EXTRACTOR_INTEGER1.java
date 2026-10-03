package o;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.common.collect.Synchronized;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.view.compat.component.compound.post.TdsPostV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.tds.view.component.widget.TdsScrollView;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1;
import o.hasProvider;
import o.initMiniApp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.network.model.plcc.benefit.PlccBenefitGroupItem;
import viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp;
import viva.republica.toss.plcc.view.showcase.PlccBenefitViewUtil$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1 {
    public static final JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1 onExtraCallback = new JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1();

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
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
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
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
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

    public static final class onWarmupCompleted implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asBinder implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        public static final asBinder IAuthTabCallback = new asBinder();

        public final void IAuthTabCallback(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        }

        public /* synthetic */ Object invoke(Object obj) {
            IAuthTabCallback((initMiniApp.onWarmupCompleted) obj);
            return Unit.INSTANCE;
        }
    }

    private JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(TdsRoundLayout tdsRoundLayout, boolean z) {
        if (!z) {
            return Unit.INSTANCE;
        }
        JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 = JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted;
        String string = tdsRoundLayout.getContext().getString(R.string.app_plcc_benefit_previous_month_guide_banner_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onExtraCallbackWithResult(1333663L, string, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(TdsRoundLayout tdsRoundLayout, ViewGroup viewGroup, View view) {
        JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1 = JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted;
        String string = tdsRoundLayout.getContext().getString(R.string.app_plcc_benefit_previous_month_guide_banner_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        javaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onExtraCallbackWithResult(1333665L, string, false);
        JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1 = onExtraCallback;
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        javaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1.onNavigationEvent(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(String str, String str2, String str3, long j, PlccBenefitGroupItem plccBenefitGroupItem, boolean z) {
        if (!z) {
            return Unit.INSTANCE;
        }
        JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_MAP1.onWarmupCompleted.onExtraCallback(str, str2, str3, j, plccBenefitGroupItem);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(TdsListRowV1View tdsListRowV1View, View view) {
        onExtraCallback.onNavigationEvent(tdsListRowV1View.getContext());
    }

    public final void onNavigationEvent(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1333655L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        asBinder asbinder = asBinder.IAuthTabCallback;
        logAndOpenStore.IAuthTabCallback(context, (Long) null);
        final getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(context, 0, false, false, -1L, asbinder, 14, (DefaultConstructorMarker) null);
        gettypedexportedconstants.IAuthTabCallback(true);
        Context context2 = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsScrollView tdsScrollView = new TdsScrollView(context3, (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        int i = 0;
        layoutParams2.height = 0;
        layoutParams2.weight = 1.0f;
        tdsScrollView.setLayoutParams(layoutParams);
        Context context4 = tdsScrollView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        LinearLayout linearLayout2 = new LinearLayout(context4);
        linearLayout2.setOrientation(1);
        Context context5 = linearLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context5, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setTitle("실적은 아래와 같이 계산돼요");
        bottomSheetHeader.setDescription("만약 이용금액이 실적에 반영되지 않았다면, 아래 내용을 참고해 주세요.");
        bottomSheetHeader.setShowCloseIcon(false);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, bottomSheetHeader);
        for (final JavaModuleWrapper javaModuleWrapper : JavaModuleWrapper.Companion.onWarmupCompleted(context)) {
            interceptors.onExtraCallback(linearLayout2, new Function1() { // from class: viva.republica.toss.plcc.view.showcase.PlccBenefitViewUtil$$ExternalSyntheticLambda2
                public final Object invoke(Object obj) {
                    return JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1.onExtraCallback(javaModuleWrapper, (TdsPostV2View) obj);
                }
            });
            final int i2 = i;
            for (Object obj : javaModuleWrapper.onNavigationEvent()) {
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final String str = (String) obj;
                interceptors.onExtraCallback(linearLayout2, new Function1() { // from class: viva.republica.toss.plcc.view.showcase.PlccBenefitViewUtil$$ExternalSyntheticLambda3
                    public final Object invoke(Object obj2) {
                        return JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1.onExtraCallbackWithResult(str, i2, javaModuleWrapper, (TdsPostV2View) obj2);
                    }
                });
                i2++;
            }
            View view = new View(linearLayout2.getContext());
            ViewGroup.LayoutParams layoutParams3 = (ViewGroup.LayoutParams) ViewGroup.MarginLayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
            Intrinsics.checkNotNull(layoutParams3);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams.width = -1;
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            marginLayoutParams.height = varyMatches.onNavigationEvent(24, displayMetrics);
            view.setLayoutParams(layoutParams3);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, view);
            i = 0;
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsScrollView, linearLayout2);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsScrollView);
        Context context6 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context6);
        String string = context.getString(R.string.app_plcc_benefit_hero_cta);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new Function1() { // from class: viva.republica.toss.plcc.view.showcase.PlccBenefitViewUtil$$ExternalSyntheticLambda4
            public final Object invoke(Object obj2) {
                return JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1.onNavigationEvent(gettypedexportedconstants, (View) obj2);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(JavaModuleWrapper javaModuleWrapper, TdsPostV2View tdsPostV2View) {
        Intrinsics.checkNotNullParameter(tdsPostV2View, "");
        tdsPostV2View.setPostStyle(TdsPostV2View.onExtraCallback.IAuthTabCallbackStub.onExtraCallbackWithResult);
        hasProvider.IAuthTabCallback iAuthTabCallback = new hasProvider.IAuthTabCallback(0, 1, (DefaultConstructorMarker) null);
        int iOnNavigationEvent = iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(0L, 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65531, (DefaultConstructorMarker) null));
        try {
            iAuthTabCallback.IAuthTabCallback(javaModuleWrapper.onExtraCallbackWithResult());
            Unit unit = Unit.INSTANCE;
            iAuthTabCallback.onNavigationEvent(iOnNavigationEvent);
            tdsPostV2View.setText(iAuthTabCallback.onExtraCallbackWithResult());
            tdsPostV2View.setLowerMargin(14.0f);
            return unit;
        } catch (Throwable th) {
            iAuthTabCallback.onNavigationEvent(iOnNavigationEvent);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(String str, int i, JavaModuleWrapper javaModuleWrapper, TdsPostV2View tdsPostV2View) {
        Intrinsics.checkNotNullParameter(tdsPostV2View, "");
        tdsPostV2View.setPostStyle(new TdsPostV2View.onExtraCallback.IAuthTabCallback_Parcel(0));
        tdsPostV2View.setText(str);
        if (i + 1 < javaModuleWrapper.onNavigationEvent().size()) {
            tdsPostV2View.setLowerMargin(4.0f);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(getTypedExportedConstants gettypedexportedconstants, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1333671L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        gettypedexportedconstants.dismiss();
        return Unit.INSTANCE;
    }

    public final View onNavigationEvent(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        View view = new View(viewGroup.getContext());
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        layoutParams2.height = varyMatches.onNavigationEvent(Integer.valueOf(i), displayMetrics);
        view.setLayoutParams(layoutParams);
        setProxySelectorokhttp.onExtraCallbackWithResult(viewGroup, view);
        return view;
    }

    public final View onExtraCallbackWithResult(@NotNull final ViewGroup viewGroup, @NotNull enableCustomFocusSearchOnClippedElementsAndroid enablecustomfocussearchonclippedelementsandroid) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(enablecustomfocussearchonclippedelementsandroid, "");
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final TdsRoundLayout tdsRoundLayout = new TdsRoundLayout(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        DisplayMetrics displayMetrics = tdsRoundLayout.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
        DisplayMetrics displayMetrics2 = tdsRoundLayout.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(tdsRoundLayout, iOnNavigationEvent, 0, varyMatches.onNavigationEvent(24, displayMetrics2), 0);
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout.getResources().getDisplayMetrics(), "");
        tdsRoundLayout.setRadius(varyMatches.onNavigationEvent(16, r5));
        Context context2 = tdsRoundLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsRoundLayout.setBackgroundColor(new getUrlokhttp(new onNavigationEvent(configuration)).extraCallback());
        Context context3 = tdsRoundLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        LinearLayout linearLayout = new LinearLayout(context3);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setGravity(17);
        Context context4 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        TdsImageView tdsImageView = new TdsImageView(context4, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        DisplayMetrics displayMetrics3 = tdsImageView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        layoutParams2.width = varyMatches.onNavigationEvent(18, displayMetrics3);
        DisplayMetrics displayMetrics4 = tdsImageView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        layoutParams2.height = varyMatches.onNavigationEvent(18, displayMetrics4);
        tdsImageView.setLayoutParams(layoutParams);
        DisplayMetrics displayMetrics5 = tdsImageView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, new Object[]{tdsImageView, Integer.valueOf(varyMatches.onNavigationEvent(16, displayMetrics5))}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
        DisplayMetrics displayMetrics6 = tdsImageView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(tdsImageView, varyMatches.onNavigationEvent(10, displayMetrics6));
        tdsImageView.setImage(deprecated_authenticator.onWarmupCompleted("icon-info-circle-mono"));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsImageView);
        BaseTextView baseTextView = (BaseTextView) Typography6.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
        Intrinsics.checkNotNull(baseTextView);
        ViewGroup.LayoutParams layoutParams3 = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.width = 0;
        layoutParams4.height = -2;
        layoutParams4.weight = 1.0f;
        baseTextView.setLayoutParams(layoutParams3);
        DisplayMetrics displayMetrics7 = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics7, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(17, displayMetrics7);
        DisplayMetrics displayMetrics8 = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics8, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(baseTextView, iOnNavigationEvent2, varyMatches.onNavigationEvent(17, displayMetrics8));
        Context context5 = baseTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        Configuration configuration2 = context5.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        baseTextView.setTextColor(new getUrlokhttp(new IAuthTabCallback(configuration2)).onPostMessage());
        baseTextView.setText(baseTextView.getContext().getString(R.string.app_plcc_benefit_previous_month_guide_banner_title));
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
        Context context6 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        TdsImageView tdsImageView2 = new TdsImageView(context6, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        ViewGroup.LayoutParams layoutParams5 = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams5);
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
        DisplayMetrics displayMetrics9 = tdsImageView2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics9, "");
        layoutParams6.width = varyMatches.onNavigationEvent(24, displayMetrics9);
        DisplayMetrics displayMetrics10 = tdsImageView2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics10, "");
        layoutParams6.height = varyMatches.onNavigationEvent(24, displayMetrics10);
        tdsImageView2.setLayoutParams(layoutParams5);
        DisplayMetrics displayMetrics11 = tdsImageView2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics11, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(tdsImageView2, varyMatches.onNavigationEvent(16, displayMetrics11));
        DisplayMetrics displayMetrics12 = tdsImageView2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics12, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, new Object[]{tdsImageView2, Integer.valueOf(varyMatches.onNavigationEvent(10, displayMetrics12))}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
        tdsImageView2.setImage(deprecated_authenticator.onWarmupCompleted("icon-arrow-right-mono"));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsImageView2);
        M_ m_ = M_.onExtraCallback;
        Context context7 = tdsRoundLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout.getContext().getResources().getDisplayMetrics(), "");
        linearLayout.setBackground((deprecated_minFreshSeconds) M_.onNavigationEvent(-556734050, new Object[]{m_, context7, Float.valueOf(varyMatches.onNavigationEvent(16, r6))}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 556734051, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent()));
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsRoundLayout, linearLayout);
        enablecustomfocussearchonclippedelementsandroid.onExtraCallbackWithResult(tdsRoundLayout, new Function1() { // from class: viva.republica.toss.plcc.view.showcase.PlccBenefitViewUtil$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1.onWarmupCompleted(tdsRoundLayout, ((Boolean) obj).booleanValue());
            }
        });
        patch.IAuthTabCallback(tdsRoundLayout, 0.0f, 1, (Object) null);
        tdsRoundLayout.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.plcc.view.showcase.PlccBenefitViewUtil$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1.onExtraCallback(tdsRoundLayout, viewGroup, view);
            }
        });
        setProxySelectorokhttp.onExtraCallbackWithResult(viewGroup, tdsRoundLayout);
        return tdsRoundLayout;
    }

    public final View onExtraCallback(@NotNull ViewGroup viewGroup, @NotNull enableCustomFocusSearchOnClippedElementsAndroid enablecustomfocussearchonclippedelementsandroid, @NotNull PlccBenefitGroupItem plccBenefitGroupItem, @NotNull String str, long j, @NotNull String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(enablecustomfocussearchonclippedelementsandroid, "");
        Intrinsics.checkNotNullParameter(plccBenefitGroupItem, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
        DisplayMetrics displayMetrics = tdsListRowV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
        DisplayMetrics displayMetrics2 = tdsListRowV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        tdsListRowV1View.setLeftImageSize(iOnNavigationEvent, varyMatches.onNavigationEvent(24, displayMetrics2));
        tdsListRowV1View.setLeftImage(plccBenefitGroupItem.onWarmupCompleted());
        tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2A);
        Context context2 = tdsListRowV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListRowV1View.setCenterText1Color(new getUrlokhttp(new onWarmupCompleted(configuration)).ICustomTabsCallbackStubProxy());
        Context context3 = tdsListRowV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration2 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        tdsListRowV1View.setCenterText2Color(new getUrlokhttp(new onExtraCallbackWithResult(configuration2)).onPostMessage());
        tdsListRowV1View.setCenterText1(plccBenefitGroupItem.onExtraCallback());
        tdsListRowV1View.setCenterText2(plccBenefitGroupItem.onNavigationEvent());
        tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.ROW1B);
        tdsListRowV1View.setRightText1(plccBenefitGroupItem.onExtraCallbackWithResult());
        Context context4 = tdsListRowV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        Configuration configuration3 = context4.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        tdsListRowV1View.setRightText1Color(new getUrlokhttp(new onExtraCallback(configuration3)).asBinder());
        enablecustomfocussearchonclippedelementsandroid.onExtraCallbackWithResult(tdsListRowV1View, new PlccBenefitViewUtil$.ExternalSyntheticLambda5(str3, str, str2, j, plccBenefitGroupItem));
        setProxySelectorokhttp.onExtraCallbackWithResult(viewGroup, tdsListRowV1View);
        return tdsListRowV1View;
    }

    public final View onNavigationEvent(@NotNull ViewGroup viewGroup, @NotNull PlccBenefitInfoResp.PlccSpentTxItem plccSpentTxItem) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(plccSpentTxItem, "");
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.TEXT);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.E");
        Date dateOnWarmupCompleted = mergeParams.onWarmupCompleted(plccSpentTxItem.onExtraCallbackWithResult(), CommonModule_closeView.onWarmupCompleted.onTransact());
        if (dateOnWarmupCompleted == null) {
            dateOnWarmupCompleted = new Date();
        }
        tdsListRowV1View.setLeftText(simpleDateFormat.format(dateOnWarmupCompleted));
        tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2C);
        tdsListRowV1View.setCenterText1(plccSpentTxItem.onExtraCallback());
        tdsListRowV1View.setCenterText2(getLongName.onNavigationEvent(plccSpentTxItem.IAuthTabCallback(), (ParamImpl) null, 1, (Object) null));
        if (!plccSpentTxItem.onWarmupCompleted()) {
            tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.ROW1A);
            tdsListRowV1View.setRightText1(plccSpentTxItem.onNavigationEvent());
        } else {
            Context context2 = tdsListRowV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            Object[] objArr = {new getUrlokhttp(new onTransact(configuration))};
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            tdsListRowV1View.setCenterText1Color(((Integer) getUrlokhttp.onNavigationEvent(objArr, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue());
            BaseTextView baseTextViewICustomTabsCallbackDefault = tdsListRowV1View.ICustomTabsCallbackDefault();
            if (baseTextViewICustomTabsCallbackDefault != null) {
                transparentBackground.onNavigationEvent(baseTextViewICustomTabsCallbackDefault, true);
            }
            Context context3 = tdsListRowV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration2 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            Object[] objArr2 = {new getUrlokhttp(new IAuthTabCallbackDefault(configuration2))};
            int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
            tdsListRowV1View.setCenterText2Color(((Integer) getUrlokhttp.onNavigationEvent(objArr2, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, setVisitUrl.onExtraCallbackWithResult())).intValue());
            BaseTextView baseTextViewICustomTabsCallbackStubProxy = tdsListRowV1View.ICustomTabsCallbackStubProxy();
            if (baseTextViewICustomTabsCallbackStubProxy != null) {
                transparentBackground.onNavigationEvent(baseTextViewICustomTabsCallbackStubProxy, true);
            }
            tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.ROW1C);
            tdsListRowV1View.setRightText1(tdsListRowV1View.getContext().getString(R.string.app_plcc_benefit_view_reason_cancel_payment));
            Context context4 = tdsListRowV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            Configuration configuration3 = context4.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            tdsListRowV1View.setRightText1Color(new getUrlokhttp(new IAuthTabCallbackStub(configuration3)).onPostMessage());
            int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            BaseTextView baseTextView = (BaseTextView) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View}, -1111713185, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1111713194, iOnNavigationEvent, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
            if (baseTextView != null) {
                baseTextView.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.plcc.view.showcase.PlccBenefitViewUtil$$ExternalSyntheticLambda6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_INTEGER1.IAuthTabCallback(tdsListRowV1View, view);
                    }
                });
            }
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(viewGroup, tdsListRowV1View);
        return tdsListRowV1View;
    }
}
