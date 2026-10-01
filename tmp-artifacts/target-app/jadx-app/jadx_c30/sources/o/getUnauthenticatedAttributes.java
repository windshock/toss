package o;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.getUnauthenticatedAttributes;
import o.readTimeout;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getUnauthenticatedAttributes {
    public static final void onWarmupCompleted(@NotNull AnimateText animateText, @NotNull String str) {
        Intrinsics.checkNotNullParameter(animateText, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        animateText.setTypography(3);
        Context context = animateText.getContext();
        Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, BuildConfig.FLAVOR);
        animateText.setTextColor(new getUrlokhttp(new onNavigationEvent(configuration)).onRelationshipValidationResult());
        animateText.setFont(response.Bold);
        animateText.setTextAlignment(4);
        AnimateText.onExtraCallback(animateText, str, readTimeout.asInterface.onExtraCallback.onExtraCallbackWithResult, 0, AnimateText.onNavigationEvent.CENTER, false, false, (Function0) null, (Function0) null, (Function0) null, verifySignatureValue_NoAlgorithmInfo.RESULT_TOSS_CARD_AUTO_CHARGE_REMOVED, (Object) null);
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
        final /* synthetic */ Configuration IAuthTabCallback;

        public onNavigationEvent(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final void onExtraCallbackWithResult(@NotNull AnimateText animateText, @NotNull String str) {
        Intrinsics.checkNotNullParameter(animateText, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        animateText.setTypography(5);
        Context context = animateText.getContext();
        Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, BuildConfig.FLAVOR);
        getUrlokhttp geturlokhttp = new getUrlokhttp(new onExtraCallbackWithResult(configuration));
        animateText.setTextColor(geturlokhttp.ITrustedWebActivityCallbackDefault() == getSpecialFeatureOptInStatus.Dark ? geturlokhttp.getInterfaceDescriptor().ICustomTabsCallbackStubProxy() : geturlokhttp.requestPostMessageChannel().onMinimized());
        animateText.setFont(response.Medium);
        animateText.setTextAlignment(4);
        AnimateText.onExtraCallback(animateText, str, readTimeout.asInterface.onExtraCallback.onExtraCallbackWithResult, 0, AnimateText.onNavigationEvent.CENTER, false, false, (Function0) null, (Function0) null, (Function0) null, verifySignatureValue_NoAlgorithmInfo.RESULT_TOSS_CARD_AUTO_CHARGE_REMOVED, (Object) null);
    }

    public static final void onExtraCallbackWithResult(@NotNull TdsBottomCtaV1View tdsBottomCtaV1View, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(tdsBottomCtaV1View, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(function0, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(function02, BuildConfig.FLAVOR);
        int i = R.string.card_ocr_impl_intro_yes;
        Function1 function1 = new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardOcrUiExtKt$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return getUnauthenticatedAttributes.onWarmupCompleted(function0, (View) obj);
            }
        };
        TdsButtonV1View.IAuthTabCallbackStub iAuthTabCallbackStub = TdsButtonV1View.IAuthTabCallbackStub.PRIMARY;
        TdsButtonV1View.IAuthTabCallbackDefault iAuthTabCallbackDefault = TdsButtonV1View.IAuthTabCallbackDefault.WEAK;
        TdsButtonV1View.onWarmupCompleted onwarmupcompleted = TdsButtonV1View.onWarmupCompleted.XLARGE;
        TdsButtonV1View.IAuthTabCallback iAuthTabCallback = TdsButtonV1View.IAuthTabCallback.BLOCK;
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, i, function1, new TdsButtonV1View.asInterface(iAuthTabCallbackStub, iAuthTabCallbackDefault, onwarmupcompleted, iAuthTabCallback), false, 8, (Object) null);
        tdsBottomCtaV1View.setSecondary(R.string.card_ocr_impl_intro_no, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardOcrUiExtKt$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return getUnauthenticatedAttributes.onExtraCallbackWithResult(function02, (View) obj);
            }
        }, new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DANGER, iAuthTabCallbackDefault, onwarmupcompleted, iAuthTabCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(Function0 function0, View view) {
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(Function0 function0, View view) {
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        function0.invoke();
        return Unit.INSTANCE;
    }
}
