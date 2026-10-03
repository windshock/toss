package viva.republica.toss.cardrecommend.issuev2.ui.faq.content;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinSdkSettings;
import o.M_;
import o.NetscapeRevocationURL;
import o.decSignedAndEnvelopedData;
import o.deprecated_certificatePinner;
import o.deprecated_minFreshSeconds;
import o.getAdService;
import o.getCacheCodeDirLegacy;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getExplicitText;
import o.getSigPolicyQualifierId;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.head;
import o.isMuted;
import o.readIntokhttp;
import o.response;
import o.setMinWebSocketMessageToCompressokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueExpandView extends LinearLayout {
    private boolean IAuthTabCallback;
    private final head onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final decSignedAndEnvelopedData onNavigationEvent;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardIssueExpandView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardIssueExpandView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onExtraCallbackWithResult(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onNavigationEvent(View view, MotionEvent motionEvent) {
        return true;
    }

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
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardIssueExpandView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        LayoutInflater.from(context).inflate(R.layout.view_card_description_folder, (ViewGroup) this, true);
        decSignedAndEnvelopedData decsignedandenvelopeddataOnExtraCallbackWithResult = decSignedAndEnvelopedData.onExtraCallbackWithResult(this);
        Intrinsics.checkNotNullExpressionValue(decsignedandenvelopeddataOnExtraCallbackWithResult, "");
        this.onNavigationEvent = decsignedandenvelopeddataOnExtraCallbackWithResult;
        TdsListHeaderV3View tdsListHeaderV3View = decsignedandenvelopeddataOnExtraCallbackWithResult.IAuthTabCallback;
        Intrinsics.checkNotNull(tdsListHeaderV3View);
        TdsListHeaderV3View.setTitleType$default(tdsListHeaderV3View, TdsListHeaderV3View.onNavigationEvent.PARAGRAPH, (String) null, (Function0) null, 6, (Object) null);
        tdsListHeaderV3View.setSize(TdsListHeaderV3View.onExtraCallbackWithResult.MEDIUM);
        Context context2 = tdsListHeaderV3View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListHeaderV3View.setTitleTextColor(new getUrlokhttp(new onNavigationEvent(configuration)).onRelationshipValidationResult());
        View view = decsignedandenvelopeddataOnExtraCallbackWithResult.onWarmupCompleted;
        M_ m_ = M_.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        view.setBackground((deprecated_minFreshSeconds) M_.onNavigationEvent(-556734050, new Object[]{m_, context, Float.valueOf(varyMatches.onNavigationEvent(12, r2))}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 556734051, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent()));
        ConstraintLayout constraintLayout = decsignedandenvelopeddataOnExtraCallbackWithResult.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        this.onExtraCallback = new head(this, constraintLayout, false, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.faq.content.CardIssueExpandView$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return CardIssueExpandView.onExtraCallback(this.f$0, ((Boolean) obj).booleanValue());
            }
        }, 4, (DefaultConstructorMarker) null);
        setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.faq.content.CardIssueExpandView$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CardIssueExpandView.onExtraCallbackWithResult(this.f$0, view2);
            }
        });
        decsignedandenvelopeddataOnExtraCallbackWithResult.onExtraCallbackWithResult.setOnTouchListener(new View.OnTouchListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.faq.content.CardIssueExpandView$$ExternalSyntheticLambda3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return CardIssueExpandView.onExtraCallbackWithResult(view2, motionEvent);
            }
        });
        decsignedandenvelopeddataOnExtraCallbackWithResult.IAuthTabCallback.setOnTouchListener(new View.OnTouchListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.faq.content.CardIssueExpandView$$ExternalSyntheticLambda4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return CardIssueExpandView.onNavigationEvent(view2, motionEvent);
            }
        });
    }

    public /* synthetic */ CardIssueExpandView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppLovinSdkSettings onExtraCallback(CardIssueExpandView cardIssueExpandView, boolean z) {
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        return isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{z ? deprecated_certificatepinner.asInterface() : deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(cardIssueExpandView.onNavigationEvent.onNavigationEvent.getScaleX()), Float.valueOf(z ? 0.96f : 1.0f), (Function1) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(CardIssueExpandView cardIssueExpandView, View view) {
        if (cardIssueExpandView.IAuthTabCallback) {
            LinearLayout linearLayout = cardIssueExpandView.onNavigationEvent.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            NetscapeRevocationURL.onExtraCallback(linearLayout);
        } else {
            LinearLayout linearLayout2 = cardIssueExpandView.onNavigationEvent.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            NetscapeRevocationURL.IAuthTabCallback(linearLayout2);
        }
        TdsImageView tdsImageView = cardIssueExpandView.onNavigationEvent.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        NetscapeRevocationURL.onWarmupCompleted(tdsImageView, !cardIssueExpandView.IAuthTabCallback);
        cardIssueExpandView.IAuthTabCallback = !cardIssueExpandView.IAuthTabCallback;
    }

    public final void setFaqData(@NotNull final getCacheCodeDirLegacy getcachecodedirlegacy) {
        int iOnRelationshipValidationResult;
        Intrinsics.checkNotNullParameter(getcachecodedirlegacy, "");
        Typography5 typography5 = this.onNavigationEvent.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        typography5.setVisibility(0);
        this.onNavigationEvent.onExtraCallback.setText(getcachecodedirlegacy.onWarmupCompleted().IAuthTabCallback());
        this.onNavigationEvent.onExtraCallback.onNavigationEvent(getExplicitText.onNavigationEvent(getcachecodedirlegacy.onWarmupCompleted()));
        Typography5 typography52 = this.onNavigationEvent.onExtraCallback;
        if (getExplicitText.onNavigationEvent(getcachecodedirlegacy.onWarmupCompleted()) == response.Bold) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            iOnRelationshipValidationResult = new getUrlokhttp(new onExtraCallbackWithResult(configuration)).ICustomTabsCallbackStubProxy();
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            iOnRelationshipValidationResult = new getUrlokhttp(new onWarmupCompleted(configuration2)).onRelationshipValidationResult();
        }
        typography52.setTextColor(iOnRelationshipValidationResult);
        Typography5 typography53 = this.onNavigationEvent.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(typography53, "");
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(16, displayMetrics);
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(typography53, iOnNavigationEvent, varyMatches.onNavigationEvent(16, displayMetrics2));
        this.onNavigationEvent.onExtraCallbackWithResult.setBackgroundColor(onExtraCallbackWithResult(getcachecodedirlegacy.onNavigationEvent()));
        if (getcachecodedirlegacy.IAuthTabCallback()) {
            LinearLayout linearLayout = this.onNavigationEvent.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(0);
            onExtraCallbackWithResult(getcachecodedirlegacy);
            TdsImageView tdsImageView = this.onNavigationEvent.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            NetscapeRevocationURL.onWarmupCompleted(tdsImageView, !this.IAuthTabCallback);
            this.IAuthTabCallback = true;
        }
        setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.faq.content.CardIssueExpandView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardIssueExpandView.onExtraCallbackWithResult(this.f$0, getcachecodedirlegacy, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(CardIssueExpandView cardIssueExpandView, getCacheCodeDirLegacy getcachecodedirlegacy, View view) {
        if (!cardIssueExpandView.onExtraCallbackWithResult) {
            cardIssueExpandView.onExtraCallbackWithResult(getcachecodedirlegacy);
        }
        if (cardIssueExpandView.IAuthTabCallback) {
            LinearLayout linearLayout = cardIssueExpandView.onNavigationEvent.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            NetscapeRevocationURL.onExtraCallback(linearLayout);
        } else {
            LinearLayout linearLayout2 = cardIssueExpandView.onNavigationEvent.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            NetscapeRevocationURL.IAuthTabCallback(linearLayout2);
        }
        TdsImageView tdsImageView = cardIssueExpandView.onNavigationEvent.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        NetscapeRevocationURL.onWarmupCompleted(tdsImageView, !cardIssueExpandView.IAuthTabCallback);
        cardIssueExpandView.IAuthTabCallback = !cardIssueExpandView.IAuthTabCallback;
    }

    private final int onExtraCallbackWithResult(String str) {
        if (Intrinsics.areEqual(str, "adaptive-grey-background")) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            return new getDEFAULT_CONNECTION_SPECSokhttp(new IAuthTabCallback(configuration)).onExtraCallbackWithResult();
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Resources resources2 = context2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        Configuration configuration2 = resources2.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        return new getDEFAULT_CONNECTION_SPECSokhttp(new onExtraCallback(configuration2)).onWarmupCompleted();
    }

    private final void onExtraCallbackWithResult(getCacheCodeDirLegacy getcachecodedirlegacy) {
        this.onExtraCallbackWithResult = true;
        LinearLayout linearLayout = this.onNavigationEvent.onExtraCallbackWithResult;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        linearLayout.addView(getSigPolicyQualifierId.onNavigationEvent(context, getcachecodedirlegacy.onExtraCallback()));
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        this.onExtraCallback.onNavigationEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.onExtraCallback.onNavigationEvent(z);
    }
}
