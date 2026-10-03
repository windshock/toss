package viva.republica.toss.main.more;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import im.toss.base.BaseActivity;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BrickModuleImplExternalSyntheticLambda1;
import o.CERT_GetPathLength;
import o.ConvertByteArrayToFloatArray;
import o.IPostMessageServiceStubProxy;
import o.SetDetectableSize;
import o.TombstoneProtosMemoryMappingBuilder;
import o.disableImageViewPreallocationAndroid;
import o.followRedirects;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.maxAge;
import o.minFresh;
import o.noStore;
import o.readIntokhttp;
import o.setProtocolsokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;
import viva.republica.toss.main.more.HapticSettingActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class HapticSettingActivity extends BaseActivity {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int asBinder = 8;
    private maxAge asInterface = onNavigationEvent();
    private final Lazy IAuthTabCallbackStub = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onExtraCallback(this));

    public long getScreenId() {
        return 1230635L;
    }

    public static final class onExtraCallback implements Function0<CERT_GetPathLength> {
        final /* synthetic */ Activity onExtraCallbackWithResult;

        public onExtraCallback(Activity activity) {
            this.onExtraCallbackWithResult = activity;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final CERT_GetPathLength invoke() {
            LayoutInflater layoutInflater = this.onExtraCallbackWithResult.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_GetPathLength.onNavigationEvent(layoutInflater);
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public onWarmupCompleted(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    private final CERT_GetPathLength setEngagementSignalsCallback() {
        Object value = this.IAuthTabCallbackStub.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (CERT_GetPathLength) value;
    }

    private final TdsListRowV1View access200() {
        TdsListRowV1View tdsListRowV1View = setEngagementSignalsCallback().IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        return tdsListRowV1View;
    }

    private final TdsListRowV1View ICustomTabsServiceStub() {
        TdsListRowV1View tdsListRowV1View = setEngagementSignalsCallback().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        return tdsListRowV1View;
    }

    private final TdsListRowV1View ICustomTabsServiceDefault() {
        TdsListRowV1View tdsListRowV1View = setEngagementSignalsCallback().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        return tdsListRowV1View;
    }

    private final View validateRelationship() {
        View view = setEngagementSignalsCallback().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(view, "");
        return view;
    }

    private final TdsListRowV1View updateVisuals() {
        TdsListRowV1View tdsListRowV1View = setEngagementSignalsCallback().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        return tdsListRowV1View;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        setContentView(setEngagementSignalsCallback().getRoot());
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
        }
        LinearLayout root = setEngagementSignalsCallback().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(root, setEngagementSignalsCallback().onWarmupCompleted, (View) null, (View) null, false, 14, (Object) null);
        TdsTopV2View tdsTopV2View = setEngagementSignalsCallback().IAuthTabCallbackDefault;
        tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        String string = getString(R.string.setting_haptic);
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsTopV2View.setTitleText(string);
        tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        Intrinsics.checkNotNull(tdsTopV2View);
        Context context = tdsTopV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsTopV2View.setTitleTextColor(new getUrlokhttp(new onWarmupCompleted(configuration)).onUnminimized());
        TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = access200().prefetchWithMultipleUrls();
        if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
            tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setClickable(false);
            setProtocolsokhttp.onExtraCallbackWithResult(tdsCheckBoxV2ViewPrefetchWithMultipleUrls, false);
        }
        TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls2 = ICustomTabsServiceStub().prefetchWithMultipleUrls();
        if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls2 != null) {
            tdsCheckBoxV2ViewPrefetchWithMultipleUrls2.setClickable(false);
            setProtocolsokhttp.onExtraCallbackWithResult(tdsCheckBoxV2ViewPrefetchWithMultipleUrls2, false);
        }
        TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls3 = ICustomTabsServiceDefault().prefetchWithMultipleUrls();
        if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls3 != null) {
            tdsCheckBoxV2ViewPrefetchWithMultipleUrls3.setClickable(false);
            setProtocolsokhttp.onExtraCallbackWithResult(tdsCheckBoxV2ViewPrefetchWithMultipleUrls3, false);
        }
        access200().setOnClickListener(new HapticSettingActivity$.ExternalSyntheticLambda0(this));
        ICustomTabsServiceStub().setOnClickListener(new HapticSettingActivity$.ExternalSyntheticLambda1(this));
        ICustomTabsServiceDefault().setOnClickListener(new HapticSettingActivity$.ExternalSyntheticLambda2(this));
        String[] stringArray = getResources().getStringArray(R.array.haptic_setting_intensity);
        Intrinsics.checkNotNullExpressionValue(stringArray, "");
        List list = ArraysKt.toList(stringArray);
        updateVisuals().setRightText1((CharSequence) list.get(IAuthTabCallback()));
        updateVisuals().setOnClickListener(new HapticSettingActivity$.ExternalSyntheticLambda3(this, list));
        ICustomTabsService_Parcel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(HapticSettingActivity hapticSettingActivity, View view) {
        hapticSettingActivity.IAuthTabCallback(maxAge.On);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(HapticSettingActivity hapticSettingActivity, View view) {
        hapticSettingActivity.IAuthTabCallback(maxAge.Off);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackStub(HapticSettingActivity hapticSettingActivity, View view) {
        hapticSettingActivity.IAuthTabCallback(maxAge.System);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onExtraCallback(HapticSettingActivity hapticSettingActivity, List list, View view) {
        BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback iAuthTabCallback = new BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback(hapticSettingActivity);
        String string = hapticSettingActivity.getString(R.string.haptic_setting_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {iAuthTabCallback.onExtraCallbackWithResult(string).onWarmupCompleted(false).onExtraCallbackWithResult(list).IAuthTabCallback(hapticSettingActivity.IAuthTabCallback()).onExtraCallback(new HapticSettingActivity$.ExternalSyntheticLambda4(hapticSettingActivity, list))};
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        ((BrickModuleImplExternalSyntheticLambda1) BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback.onExtraCallback(objArr, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, -846891035, 846891035, iOnNavigationEvent2)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onWarmupCompleted(HapticSettingActivity hapticSettingActivity, List list, int i) {
        hapticSettingActivity.onNavigationEvent(i);
        hapticSettingActivity.updateVisuals().setRightText1((CharSequence) list.get(i));
        minFresh.onNavigationEvent(hapticSettingActivity, noStore.Companion.asBinder());
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallback(maxAge maxage) {
        if (this.asInterface != maxage) {
            this.asInterface = maxage;
            onExtraCallbackWithResult(maxage);
            ICustomTabsService_Parcel();
        }
    }

    private final void ICustomTabsService_Parcel() {
        TdsListRowV1View tdsListRowV1ViewAccess200 = access200();
        boolean z = this.asInterface == maxAge.On;
        tdsListRowV1ViewAccess200.setRightCheckBoxChecked(z);
        TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = tdsListRowV1ViewAccess200.prefetchWithMultipleUrls();
        if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
            setProtocolsokhttp.onExtraCallbackWithResult(tdsCheckBoxV2ViewPrefetchWithMultipleUrls, z);
        }
        TdsListRowV1View tdsListRowV1ViewICustomTabsServiceStub = ICustomTabsServiceStub();
        maxAge maxage = this.asInterface;
        maxAge maxage2 = maxAge.Off;
        boolean z2 = maxage == maxage2;
        tdsListRowV1ViewICustomTabsServiceStub.setRightCheckBoxChecked(z2);
        TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls2 = tdsListRowV1ViewICustomTabsServiceStub.prefetchWithMultipleUrls();
        if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls2 != null) {
            setProtocolsokhttp.onExtraCallbackWithResult(tdsCheckBoxV2ViewPrefetchWithMultipleUrls2, z2);
        }
        TdsListRowV1View tdsListRowV1ViewICustomTabsServiceDefault = ICustomTabsServiceDefault();
        boolean z3 = this.asInterface == maxAge.System;
        tdsListRowV1ViewICustomTabsServiceDefault.setRightCheckBoxChecked(z3);
        TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls3 = tdsListRowV1ViewICustomTabsServiceDefault.prefetchWithMultipleUrls();
        if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls3 != null) {
            setProtocolsokhttp.onExtraCallbackWithResult(tdsCheckBoxV2ViewPrefetchWithMultipleUrls3, z3);
        }
        validateRelationship().setVisibility(this.asInterface == maxage2 ? 8 : 0);
        updateVisuals().setVisibility(this.asInterface == maxage2 ? 8 : 0);
    }

    public final maxAge onNavigationEvent() {
        return followRedirects.onExtraCallbackWithResult.IAuthTabCallback();
    }

    public final void onExtraCallbackWithResult(@NotNull maxAge maxage) {
        Intrinsics.checkNotNullParameter(maxage, "");
        followRedirects.onExtraCallbackWithResult.IAuthTabCallback(maxage);
    }

    public final int IAuthTabCallback() {
        return (int) ((followRedirects.onExtraCallbackWithResult.onWarmupCompleted() - 0.5f) * 4.0f);
    }

    public final void onNavigationEvent(int i) {
        followRedirects.onExtraCallbackWithResult.onWarmupCompleted((i * 0.25f) + 0.5f);
    }

    public void onDestroy() {
        ConvertByteArrayToFloatArray.onExtraCallback(1230637L, false, (String) null, (Map) null, new HapticSettingActivity$.ExternalSyntheticLambda5(this), 14, (Object) null);
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit onExtraCallback(HapticSettingActivity hapticSettingActivity, SetDetectableSize setDetectableSize) throws NoWhenBranchMatchedException {
        String str;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int i = onNavigationEvent.IAuthTabCallback[hapticSettingActivity.onNavigationEvent().ordinal()];
        if (i == 1) {
            str = "on";
        } else if (i == 2) {
            str = "off";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "system";
        }
        setDetectableSize.onExtraCallback("haptic", str);
        setDetectableSize.onExtraCallback("strength", Integer.valueOf(hapticSettingActivity.IAuthTabCallback()));
        return Unit.INSTANCE;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final Intent IAuthTabCallback(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new Intent(context, (Class<?>) HapticSettingActivity.class);
        }
    }

    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
