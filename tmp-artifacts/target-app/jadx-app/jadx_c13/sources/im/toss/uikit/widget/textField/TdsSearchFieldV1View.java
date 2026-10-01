package im.toss.uikit.widget.textField;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.tds.compose.R;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.widget.TdsRecyclerView;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.widget.textField.TdsSearchFieldV1View$;
import kotlin.jvm.internal.Intrinsics;
import o.AFk1sSDK;
import o.M_;
import o.OkHttpClientCompanion;
import o.eExternalSyntheticLambda0;
import o.registerCrashCallback;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsSearchFieldV1View extends TextField {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final float IAuthTabCallback;
    private final float onNavigationEvent;

    public static /* synthetic */ boolean onNavigationEvent(TdsSearchFieldV1View tdsSearchFieldV1View, TextView textView, int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 73;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnExtraCallback = onExtraCallback(tdsSearchFieldV1View, textView, i, keyEvent);
        int i5 = onWarmupCompleted + 25;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return zOnExtraCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsSearchFieldV1View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.onNavigationEvent = 24.0f;
        this.IAuthTabCallback = 10.0f;
        readTypedObject();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsSearchFieldV1View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.onNavigationEvent = 24.0f;
        this.IAuthTabCallback = 10.0f;
        readTypedObject();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsSearchFieldV1View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onNavigationEvent = 24.0f;
        this.IAuthTabCallback = 10.0f;
        readTypedObject();
    }

    private static final boolean onExtraCallback(TdsSearchFieldV1View tdsSearchFieldV1View, TextView textView, int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 61;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if (i != 3) {
            return false;
        }
        int i6 = i4 + 91;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        Object[] objArr = {M_.onExtraCallback, tdsSearchFieldV1View.IAuthTabCallback()};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        M_.onNavigationEvent(1483765845, objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -1483765843, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
        return true;
    }

    public final void onWarmupCompleted(@NotNull RecyclerView recyclerView) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(recyclerView, "");
        recyclerView.setVerticalFadingEdgeEnabled(true);
        DisplayMetrics displayMetrics = recyclerView.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        recyclerView.setFadingEdgeLength(varyMatches.onNavigationEvent(Float.valueOf(16.0f), displayMetrics));
        if (!(!(recyclerView instanceof TdsRecyclerView))) {
            int i4 = onExtraCallback + 7;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            ((TdsRecyclerView) recyclerView).setFadingEdgeType(1);
        }
        int i6 = onWarmupCompleted + 73;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    private final void readTypedObject() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        TdsRoundLayout tdsRoundLayout = ((AFk1sSDK) TextField.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).onExtraCallback;
        tdsRoundLayout.setStrokeWidth(0.0f);
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout.getContext().getResources().getDisplayMetrics(), "");
        tdsRoundLayout.setRadius(varyMatches.onNavigationEvent(Float.valueOf(12.0f), r4));
        tdsRoundLayout.setBackgroundColor(OkHttpClientCompanion.onWarmupCompleted(tdsRoundLayout, eExternalSyntheticLambda0.SearchFieldFill));
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        ((AFk1sSDK) TextField.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -906317760, new Object[]{this}, 906317768, iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).access100.setBackground(null);
        asBinder().setVisibility(8);
        IAuthTabCallbackDefault().setVisibility(8);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(16.0f), displayMetrics);
        DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(Float.valueOf(14.0f), displayMetrics2);
        setPadding(iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent2);
        TextField.setIcon$default(this, R.drawable.icn_searchfield, 0, 2, (Object) null);
        float f = this.onNavigationEvent;
        DisplayMetrics displayMetrics3 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        int iOnNavigationEvent3 = varyMatches.onNavigationEvent(Float.valueOf(f), displayMetrics3);
        float f2 = this.onNavigationEvent;
        DisplayMetrics displayMetrics4 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        int iOnNavigationEvent4 = varyMatches.onNavigationEvent(Float.valueOf(f2), displayMetrics4);
        float f3 = this.IAuthTabCallback;
        DisplayMetrics displayMetrics5 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
        setIconSize(iOnNavigationEvent3, iOnNavigationEvent4, varyMatches.onNavigationEvent(Float.valueOf(f3), displayMetrics5), 0);
        setClearable(true);
        TdsImageView tdsImageViewOnExtraCallbackWithResult = onExtraCallbackWithResult();
        ViewGroup.LayoutParams layoutParams = tdsImageViewOnExtraCallbackWithResult.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = (ConstraintLayout.onExtraCallbackWithResult) layoutParams;
        DisplayMetrics displayMetrics6 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
        int iOnNavigationEvent5 = varyMatches.onNavigationEvent(Float.valueOf(2.0f), displayMetrics6);
        onextracallbackwithresult.setMarginEnd(iOnNavigationEvent5);
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).rightMargin = iOnNavigationEvent5;
        tdsImageViewOnExtraCallbackWithResult.setLayoutParams(onextracallbackwithresult);
        setImeOptions(3);
        DisplayMetrics displayMetrics7 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics7, "");
        int iOnNavigationEvent6 = varyMatches.onNavigationEvent(Float.valueOf(8.0f), displayMetrics7);
        registerCrashCallback registercrashcallbackIAuthTabCallback = IAuthTabCallback();
        DisplayMetrics displayMetrics8 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics8, "");
        registercrashcallbackIAuthTabCallback.setMinimumHeight(varyMatches.onNavigationEvent(Float.valueOf(44.0f), displayMetrics8));
        IAuthTabCallback().setPadding(iOnNavigationEvent6, IAuthTabCallback().getPaddingTop(), iOnNavigationEvent6, IAuthTabCallback().getPaddingBottom());
        IAuthTabCallback().setOnEditorActionListener(new TdsSearchFieldV1View$.ExternalSyntheticLambda0(this));
        int i4 = onWarmupCompleted + 37;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
