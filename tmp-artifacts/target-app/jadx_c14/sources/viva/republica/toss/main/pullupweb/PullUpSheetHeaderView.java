package viva.republica.toss.main.pullupweb;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.deprecated_followSslRedirects;
import o.getAdService;
import o.getBacktraceNoteBytes;
import o.getContentView;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.readIntokhttp;
import o.response;
import o.setVisitUrl;
import o.transparentBackground;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PullUpSheetHeaderView extends FrameLayout {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int onExtraCallback = 8;
    private final float IAuthTabCallback;
    private final View IAuthTabCallbackDefault;
    private final float IAuthTabCallbackStub;
    private final float asBinder;
    private Function0<Unit> asInterface;
    private final Typography5 getInterfaceDescriptor;
    private final TdsImageView onExtraCallbackWithResult;
    private final float onNavigationEvent;
    private final View onTransact;
    private final float onWarmupCompleted;

    /* JADX WARN: Illegal instructions before constructor call */
    public PullUpSheetHeaderView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public static final class asInterface implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public asInterface(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
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

    public static final class onExtraCallback implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullUpSheetHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.asInterface = new Function0() { // from class: viva.republica.toss.main.pullupweb.PullUpSheetHeaderView$$ExternalSyntheticLambda0
            public final Object invoke() {
                return PullUpSheetHeaderView.IAuthTabCallback();
            }
        };
        float f = getResources().getDisplayMetrics().density;
        this.onNavigationEvent = f;
        float f2 = getResources().getConfiguration().fontScale;
        this.IAuthTabCallback = f2;
        float fMin = Math.min(13.0f * f2, 20.0f) * f;
        this.asBinder = fMin;
        float fMin2 = Math.min(f2 * 17.0f, 24.0f) * f;
        this.onWarmupCompleted = fMin2;
        this.IAuthTabCallbackStub = fMin / fMin2;
        View view = new View(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(2.0f * f);
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        Object[] objArr = {new getUrlokhttp(new onNavigationEvent(configuration))};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        gradientDrawable.setColor(((Integer) getUrlokhttp.onNavigationEvent(objArr, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue());
        view.setBackground(gradientDrawable);
        this.IAuthTabCallbackDefault = view;
        Typography5 typography5 = new Typography5(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        typography5.setTextSize(0, fMin2);
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration2 = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        typography5.setTextColor(new getDEFAULT_CONNECTION_SPECSokhttp(new asInterface(configuration2)).getInterfaceDescriptor());
        typography5.onNavigationEvent(response.SemiBold);
        typography5.setMaxLines(1);
        typography5.setEllipsize(TextUtils.TruncateAt.END);
        typography5.setGravity(17);
        this.getInterfaceDescriptor = typography5;
        TdsImageView tdsImageView = new TdsImageView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsImageView.setImage(deprecated_followSslRedirects.onWarmupCompleted(R.drawable.icn_pull_up_web_close));
        Resources resources2 = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        Configuration configuration3 = resources2.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        tdsImageView.setColorFilter(new getDEFAULT_CONNECTION_SPECSokhttp(new onWarmupCompleted(configuration3)).IAuthTabCallbackStub());
        tdsImageView.setScaleType(ImageView.ScaleType.CENTER);
        tdsImageView.setContentDescription("닫기");
        Configuration configuration4 = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration4, "");
        Object[] objArr2 = {new getUrlokhttp(new onExtraCallback(configuration4))};
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        int iIntValue = ((Integer) getUrlokhttp.onNavigationEvent(objArr2, 2109422447, -2109422438, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, setVisitUrl.onExtraCallbackWithResult())).intValue();
        transparentBackground.onWarmupCompleted(tdsImageView, true, Integer.valueOf(iIntValue), getBacktraceNoteBytes.onExtraCallback(14.0f * f), (View) null, (List) null, 0.0f, 1.0f, (Function2) null, false, 0L, (String) null, (getContentView) null, new Function1() { // from class: viva.republica.toss.main.pullupweb.PullUpSheetHeaderView$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return PullUpSheetHeaderView.onNavigationEvent(this.f$0, (MotionEvent) obj);
            }
        }, 4024, (Object) null);
        this.onExtraCallbackWithResult = tdsImageView;
        View view2 = new View(context);
        Resources resources3 = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "");
        Configuration configuration5 = resources3.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration5, "");
        view2.setBackgroundColor(((Integer) getDEFAULT_CONNECTION_SPECSokhttp.onExtraCallbackWithResult(-750216482, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{new getDEFAULT_CONNECTION_SPECSokhttp(new onExtraCallbackWithResult(configuration5))}, R.drawable.IAuthTabCallback(), 750216482)).intValue());
        this.onTransact = view2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(getBacktraceNoteBytes.onExtraCallback(48.0f * f), getBacktraceNoteBytes.onExtraCallback(4.0f * f), 49);
        float f3 = 12.0f * f;
        layoutParams.topMargin = getBacktraceNoteBytes.onExtraCallback(f3);
        Unit unit = Unit.INSTANCE;
        addView(view, layoutParams);
        int iOnExtraCallback = getBacktraceNoteBytes.onExtraCallback(44.0f * f);
        int iOnExtraCallback2 = getBacktraceNoteBytes.onExtraCallback(f3);
        int i = iOnExtraCallback + iOnExtraCallback2;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2, 17);
        layoutParams2.setMarginStart(i);
        layoutParams2.setMarginEnd(i);
        addView((View) typography5, (ViewGroup.LayoutParams) layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iOnExtraCallback, iOnExtraCallback, 8388629);
        layoutParams3.setMarginEnd(iOnExtraCallback2);
        addView((View) tdsImageView, (ViewGroup.LayoutParams) layoutParams3);
        addView(view2, new FrameLayout.LayoutParams(-1, Math.max(1, getBacktraceNoteBytes.onExtraCallback(f)), 80));
        setChromeProgress(0.0f);
    }

    public /* synthetic */ PullUpSheetHeaderView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback() {
        return Unit.INSTANCE;
    }

    public final void setOnClose(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.asInterface = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(PullUpSheetHeaderView pullUpSheetHeaderView, MotionEvent motionEvent) {
        pullUpSheetHeaderView.asInterface.invoke();
        return Unit.INSTANCE;
    }

    public final void setTitle(@Nullable CharSequence charSequence) {
        this.getInterfaceDescriptor.setText(charSequence);
    }

    public final void setChromeProgress(float f) {
        float fCoerceIn = RangesKt.coerceIn(f, 0.0f, 1.0f);
        float f2 = this.IAuthTabCallbackStub;
        float f3 = f2 + ((1.0f - f2) * fCoerceIn);
        this.getInterfaceDescriptor.setScaleX(f3);
        this.getInterfaceDescriptor.setScaleY(f3);
        float f4 = 1.0f - fCoerceIn;
        this.getInterfaceDescriptor.setTranslationY(this.onNavigationEvent * 6.5f * f4);
        this.IAuthTabCallbackDefault.setAlpha(f4);
        this.IAuthTabCallbackDefault.setVisibility(fCoerceIn < 1.0f ? 0 : 8);
        float f5 = (0.39999998f * fCoerceIn) + 0.6f;
        this.onExtraCallbackWithResult.setAlpha(fCoerceIn);
        this.onExtraCallbackWithResult.setScaleX(f5);
        this.onExtraCallbackWithResult.setScaleY(f5);
        this.onExtraCallbackWithResult.setVisibility(fCoerceIn <= 0.0f ? 8 : 0);
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }
}
