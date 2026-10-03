package viva.republica.toss.home.consumption.transaction.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinSdkSettings;
import o.M_;
import o.deprecated_certificatePinner;
import o.deprecated_minFreshSeconds;
import o.head;
import o.isMuted;
import o.varyMatches;
import o.verifySignedDataWithContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.home.consumption.transaction.view.HomeTransactionDutchView$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class HomeTransactionDutchView extends ConstraintLayout {
    private final verifySignedDataWithContent IAuthTabCallback;
    private final head onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HomeTransactionDutchView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HomeTransactionDutchView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HomeTransactionDutchView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        verifySignedDataWithContent verifysigneddatawithcontentOnExtraCallbackWithResult = verifySignedDataWithContent.onExtraCallbackWithResult(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(verifysigneddatawithcontentOnExtraCallbackWithResult, "");
        this.IAuthTabCallback = verifysigneddatawithcontentOnExtraCallbackWithResult;
        this.onWarmupCompleted = new head(this, (View) null, false, new HomeTransactionDutchView$.ExternalSyntheticLambda0(this), 6, (DefaultConstructorMarker) null);
        M_ m_ = M_.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        setForeground((deprecated_minFreshSeconds) M_.onNavigationEvent(-556734050, new Object[]{m_, context, Float.valueOf(varyMatches.onNavigationEvent(12, r11))}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 556734051, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent()));
        setElevation(0.0f);
        setTranslationZ(0.0f);
        setStateListAnimator(null);
    }

    public /* synthetic */ HomeTransactionDutchView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final AppLovinSdkSettings onExtraCallback(HomeTransactionDutchView homeTransactionDutchView, boolean z) {
        Float fValueOf = Float.valueOf(0.5f);
        if (z && !homeTransactionDutchView.isEnabled()) {
            return null;
        }
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        return isMuted.asBinder(isMuted.access000(isMuted.asInterface((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{z ? deprecated_certificatepinner.asInterface() : deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null), (Float) null, fValueOf, (Function1) null, 5, (Object) null), Float.valueOf(homeTransactionDutchView.getScaleX()), Float.valueOf(z ? 0.96f : 1.0f), (Function1) null, 4, (Object) null);
    }

    public final TdsImageView onNavigationEvent() {
        TdsImageView tdsImageView = this.IAuthTabCallback.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        return tdsImageView;
    }

    public final TdsListRowV1View IAuthTabCallback() {
        TdsListRowV1View tdsListRowV1View = this.IAuthTabCallback.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        return tdsListRowV1View;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        this.onWarmupCompleted.onNavigationEvent(motionEvent);
        return super/*android.view.View*/.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPressed(boolean z) {
        super/*android.view.View*/.setPressed(z);
        this.onWarmupCompleted.onNavigationEvent(z);
    }
}
