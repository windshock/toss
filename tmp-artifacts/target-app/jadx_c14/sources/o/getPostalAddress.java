package o;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.view.component.atom.post.ListItemSmall;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.SubTypography10;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getPostalAddress extends isSignaturePolicyImplied {
    private final createNativeAdScrollViewApi onExtraCallback;
    private final Context onExtraCallbackWithResult;

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallback implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public getPostalAddress(@NotNull Context context, @NotNull createNativeAdScrollViewApi createnativeadscrollviewapi) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(createnativeadscrollviewapi, "");
        this.onExtraCallbackWithResult = context;
        this.onExtraCallback = createnativeadscrollviewapi;
    }

    @Override // o.isSignaturePolicyImplied
    public View onWarmupCompleted() {
        LinearLayout linearLayout = new LinearLayout(this.onExtraCallbackWithResult);
        linearLayout.setOrientation(1);
        for (String str : this.onExtraCallback.onNavigationEvent()) {
            if (!this.onExtraCallback.onExtraCallback()) {
                if (this.onExtraCallback.onExtraCallbackWithResult()) {
                    if (this.onExtraCallback.onExtraCallbackWithResult()) {
                        Context context = linearLayout.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        ListItemSmall listItemSmall = new ListItemSmall(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                        if (this.onExtraCallback.onWarmupCompleted()) {
                            DisplayMetrics displayMetrics = listItemSmall.getResources().getDisplayMetrics();
                            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                            setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, new Object[]{listItemSmall, Integer.valueOf(varyMatches.onNavigationEvent(36, displayMetrics))}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
                        } else {
                            DisplayMetrics displayMetrics2 = listItemSmall.getResources().getDisplayMetrics();
                            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                            setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, new Object[]{listItemSmall, Integer.valueOf(varyMatches.onNavigationEvent(24, displayMetrics2))}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
                        }
                        DisplayMetrics displayMetrics3 = listItemSmall.getResources().getDisplayMetrics();
                        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
                        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(listItemSmall, varyMatches.onNavigationEvent(24, displayMetrics3));
                        listItemSmall.setText(BrickModulesListExternalSyntheticLambda0.onNavigationEvent(str, false, 1, (Object) null));
                        DisplayMetrics displayMetrics4 = listItemSmall.getResources().getDisplayMetrics();
                        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
                        listItemSmall.setPadding(0, 0, 0, varyMatches.onNavigationEvent(8, displayMetrics4));
                        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, listItemSmall);
                    }
                } else {
                    BaseTextView baseTextView = (BaseTextView) SubTypography10.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
                    Intrinsics.checkNotNull(baseTextView);
                    DisplayMetrics displayMetrics5 = baseTextView.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
                    setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, new Object[]{baseTextView, Integer.valueOf(varyMatches.onNavigationEvent(24, displayMetrics5))}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
                    DisplayMetrics displayMetrics6 = baseTextView.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
                    setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(baseTextView, varyMatches.onNavigationEvent(24, displayMetrics6));
                    baseTextView.setText(BrickModulesListExternalSyntheticLambda0.onNavigationEvent(str, false, 1, (Object) null));
                    if (this.onExtraCallback.IAuthTabCallback()) {
                        baseTextView.onNavigationEvent(response.Bold);
                    }
                    Intrinsics.checkNotNull(baseTextView);
                    setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
                }
            } else {
                Context context2 = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                TdsRoundLayout tdsRoundLayout = new TdsRoundLayout(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                DisplayMetrics displayMetrics7 = tdsRoundLayout.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics7, "");
                setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, new Object[]{tdsRoundLayout, Integer.valueOf(varyMatches.onNavigationEvent(24, displayMetrics7))}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
                DisplayMetrics displayMetrics8 = tdsRoundLayout.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics8, "");
                setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(tdsRoundLayout, varyMatches.onNavigationEvent(24, displayMetrics8));
                Intrinsics.checkNotNullExpressionValue(tdsRoundLayout.getResources().getDisplayMetrics(), "");
                tdsRoundLayout.setRadius(varyMatches.onNavigationEvent(12, r11));
                Context context3 = tdsRoundLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                Configuration configuration = context3.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                tdsRoundLayout.setStrokeColor(new getUrlokhttp(new onExtraCallbackWithResult(configuration)).mayLaunchUrl());
                tdsRoundLayout.setStrokeWidth(1.0f);
                Context context4 = tdsRoundLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                Configuration configuration2 = context4.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                tdsRoundLayout.setBackgroundColor(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new IAuthTabCallback(configuration2))}, -880609169, 880609173, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
                BaseTextView baseTextView2 = (BaseTextView) Typography5.class.getDeclaredConstructor(Context.class).newInstance(tdsRoundLayout.getContext());
                Intrinsics.checkNotNull(baseTextView2);
                baseTextView2.setText(BrickModulesListExternalSyntheticLambda0.onNavigationEvent(str, false, 1, (Object) null));
                Context context5 = baseTextView2.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                Configuration configuration3 = context5.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration3, "");
                getUrlokhttp geturlokhttp = new getUrlokhttp(new onExtraCallback(configuration3));
                baseTextView2.setTextColor(geturlokhttp.ITrustedWebActivityCallbackDefault() == getSpecialFeatureOptInStatus.Dark ? geturlokhttp.getInterfaceDescriptor().onMinimized() : geturlokhttp.requestPostMessageChannel().onActivityLayout());
                baseTextView2.setGravity(1);
                DisplayMetrics displayMetrics9 = baseTextView2.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics9, "");
                int iOnNavigationEvent = varyMatches.onNavigationEvent(16, displayMetrics9);
                DisplayMetrics displayMetrics10 = baseTextView2.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics10, "");
                int iOnNavigationEvent2 = varyMatches.onNavigationEvent(16, displayMetrics10);
                DisplayMetrics displayMetrics11 = baseTextView2.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics11, "");
                int iOnNavigationEvent3 = varyMatches.onNavigationEvent(16, displayMetrics11);
                DisplayMetrics displayMetrics12 = baseTextView2.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics12, "");
                baseTextView2.setPadding(iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent3, varyMatches.onNavigationEvent(16, displayMetrics12));
                Intrinsics.checkNotNull(baseTextView2);
                setProxySelectorokhttp.onExtraCallbackWithResult(tdsRoundLayout, baseTextView2);
                setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsRoundLayout);
            }
        }
        return linearLayout;
    }
}
