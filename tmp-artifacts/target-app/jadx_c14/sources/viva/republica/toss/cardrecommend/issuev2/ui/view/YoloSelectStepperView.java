package viva.republica.toss.cardrecommend.issuev2.ui.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.matches;
import o.readIntokhttp;
import o.setHeadersokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class YoloSelectStepperView extends ConstraintLayout {
    private final TdsImageView IAuthTabCallback;
    private final BaseTextView IAuthTabCallbackDefault;
    private final TdsImageView asInterface;
    private final BaseTextView onExtraCallback;
    private final TdsImageView onExtraCallbackWithResult;
    private final View onNavigationEvent;
    private final BaseTextView onTransact;
    private final View onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YoloSelectStepperView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YoloSelectStepperView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public YoloSelectStepperView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        View.inflate(context, R.layout.view_yolo_select_stepper, this);
        BaseTextView baseTextViewFindViewById = findViewById(R.id.step1Text);
        Intrinsics.checkNotNullExpressionValue(baseTextViewFindViewById, "");
        this.onExtraCallback = baseTextViewFindViewById;
        TdsImageView tdsImageViewFindViewById = findViewById(R.id.step1Checkbox);
        Intrinsics.checkNotNullExpressionValue(tdsImageViewFindViewById, "");
        this.onExtraCallbackWithResult = tdsImageViewFindViewById;
        View viewFindViewById = findViewById(R.id.step1Line);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.onWarmupCompleted = viewFindViewById;
        BaseTextView baseTextViewFindViewById2 = findViewById(R.id.step2Text);
        Intrinsics.checkNotNullExpressionValue(baseTextViewFindViewById2, "");
        this.onTransact = baseTextViewFindViewById2;
        TdsImageView tdsImageViewFindViewById2 = findViewById(R.id.step2Checkbox);
        Intrinsics.checkNotNullExpressionValue(tdsImageViewFindViewById2, "");
        this.IAuthTabCallback = tdsImageViewFindViewById2;
        View viewFindViewById2 = findViewById(R.id.step2Line);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.onNavigationEvent = viewFindViewById2;
        BaseTextView baseTextViewFindViewById3 = findViewById(R.id.step3Text);
        Intrinsics.checkNotNullExpressionValue(baseTextViewFindViewById3, "");
        this.IAuthTabCallbackDefault = baseTextViewFindViewById3;
        TdsImageView tdsImageViewFindViewById3 = findViewById(R.id.step3Checkbox);
        Intrinsics.checkNotNullExpressionValue(tdsImageViewFindViewById3, "");
        this.asInterface = tdsImageViewFindViewById3;
        onExtraCallbackWithResult();
    }

    public /* synthetic */ YoloSelectStepperView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
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
        final /* synthetic */ Configuration IAuthTabCallback;

        public onExtraCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
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

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public onNavigationEvent(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public final void onExtraCallbackWithResult() {
        this.onExtraCallback.setBackgroundResource(R.drawable.shape_circle_blue_500_solid);
        this.onExtraCallback.setVisibility(0);
        this.onExtraCallbackWithResult.setVisibility(8);
        this.onWarmupCompleted.setBackgroundColor(IAuthTabCallback());
        BaseTextView baseTextView = this.onTransact;
        int i = R.drawable.shape_circle_adaptive_grey_300;
        baseTextView.setBackgroundResource(i);
        this.onTransact.setVisibility(0);
        this.IAuthTabCallback.setVisibility(8);
        this.onNavigationEvent.setBackgroundColor(IAuthTabCallback());
        this.IAuthTabCallbackDefault.setBackgroundResource(i);
        this.IAuthTabCallbackDefault.setVisibility(0);
        this.asInterface.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNavigationEvent() {
        BaseTextView baseTextView = this.onExtraCallback;
        int i = R.drawable.shape_circle_adaptive_grey_300;
        baseTextView.setBackgroundResource(i);
        this.onExtraCallback.setVisibility(8);
        this.onExtraCallbackWithResult.setVisibility(0);
        View view = this.onWarmupCompleted;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        view.setBackgroundColor(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new onExtraCallback(configuration)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
        this.onTransact.setBackgroundResource(R.drawable.shape_circle_blue_500_solid);
        this.onTransact.setVisibility(0);
        this.IAuthTabCallback.setVisibility(8);
        this.onNavigationEvent.setBackgroundColor(IAuthTabCallback());
        this.IAuthTabCallbackDefault.setBackgroundResource(i);
        this.IAuthTabCallbackDefault.setVisibility(0);
        this.asInterface.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWarmupCompleted() {
        this.onExtraCallback.setBackgroundResource(R.drawable.shape_circle_adaptive_grey_300);
        this.onExtraCallback.setVisibility(8);
        this.onExtraCallbackWithResult.setVisibility(0);
        View view = this.onWarmupCompleted;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        view.setBackgroundColor(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new IAuthTabCallback(configuration)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
        BaseTextView baseTextView = this.onTransact;
        int i = R.drawable.shape_circle_blue_500_solid;
        baseTextView.setBackgroundResource(i);
        this.onTransact.setVisibility(8);
        this.IAuthTabCallback.setVisibility(0);
        View view2 = this.onNavigationEvent;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        view2.setBackgroundColor(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new onNavigationEvent(configuration2)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
        this.IAuthTabCallbackDefault.setBackgroundResource(i);
        this.IAuthTabCallbackDefault.setVisibility(0);
        this.asInterface.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int IAuthTabCallback() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        getUrlokhttp geturlokhttp = new getUrlokhttp(new onExtraCallbackWithResult(configuration));
        return geturlokhttp.ITrustedWebActivityCallbackDefault() == getSpecialFeatureOptInStatus.Dark ? geturlokhttp.getInterfaceDescriptor().onMessageChannelReady() : geturlokhttp.requestPostMessageChannel().onActivityResized();
    }
}
