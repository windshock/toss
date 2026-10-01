package com.alibaba.griver.ui.splash;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.ariver.app.api.ui.StatusBarUtils;
import com.alibaba.griver.base.R;
import com.alibaba.griver.base.utils.LanguageUtils;
import com.alibaba.griver.ui.splash.LoadingView;
import com.alibaba.griver.uimode.DayNightResUtil;
import com.alibaba.griver.uimode.GriverThemeManager;
import com.alibaba.griver.uimode.api.UiMode;
import com.alibaba.griver.uimode.callback.ConfigurationCallback;
import java.util.Locale;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class SplashLoadingView extends LoadingView implements ConfigurationCallback {
    public static final String ANIMATION_STOP_LOADING_PREPARE = "ANIMATION_STOP_LOADING_PREPARE";
    public static final String DATA_UPDATE_APPEARANCE_BG_COLOR = "UPDATE_APPEARANCE_BG_COLOR";
    public static final String DATA_UPDATE_APPEARANCE_LOADING_BOTTOM_TIP = "UPDATE_APPEARANCE_LOADING_BOTTOM_TIP";
    public static final String DATA_UPDATE_APPEARANCE_LOADING_ICON = "UPDATE_APPEARANCE_LOADING_ICON";
    public static final String DATA_UPDATE_APPEARANCE_LOADING_PROGRESS = "DATA_UPDATE_APPEARANCE_LOADING_PROGRESS";
    public static final String DATA_UPDATE_APPEARANCE_LOADING_TEXT = "UPDATE_APPEARANCE_LOADING_TEXT";
    public static final String DATA_UPDATE_APPEARANCE_LOADING_TEXT_COLOR = "UPDATE_APPEARANCE_LOADING_TEXT_COLOR";
    public static final String MSG_UPDATE_APPEARANCE = "UPDATE_APPEARANCE";
    public Context a;
    public Paint b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public Paint f3i;
    public Rect j;
    public int k;
    public int l;
    public int m;
    protected TextView mBottomTip;
    protected ImageView mLoadingBgIcon;
    protected ImageView mLoadingIcon;
    protected TextView mLoadingTitle;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public int f4o;
    public int p;
    public int q;
    public int r;
    public int s;
    public Paint t;
    public ValueAnimator u;

    public SplashLoadingView(Context context) {
        this(context, null);
    }

    private void a(Context context, UiMode uiMode) {
        this.mLoadingIcon.setImageResource(DayNightResUtil.getDrawableId(R.drawable.griver_ui_default_loading_icon, DayNightResUtil.getNightResId(new DayNightResUtil.NightResCallback() { // from class: com.alibaba.griver.ui.splash.SplashLoadingView$$ExternalSyntheticLambda0
            public final int onNightRes() {
                return com.alibaba.griver.dark.resource.R.drawable.griver_ui_default_loading_icon_night;
            }
        })));
        this.mLoadingBgIcon.setImageResource(DayNightResUtil.getDrawableId(R.drawable.griver_ui_icon_corner, DayNightResUtil.getNightResId(new DayNightResUtil.NightResCallback() { // from class: com.alibaba.griver.ui.splash.SplashLoadingView$$ExternalSyntheticLambda1
            public final int onNightRes() {
                return com.alibaba.griver.dark.resource.R.drawable.griver_ui_icon_corner_night;
            }
        })));
        this.mLoadingTitle.setTextColor(DayNightResUtil.getColor(context, R.color.griver_web_loading_text, DayNightResUtil.getNightColor(new DayNightResUtil.NightColorCallback() { // from class: com.alibaba.griver.ui.splash.SplashLoadingView$$ExternalSyntheticLambda2
            public final int onNightColor() {
                return com.alibaba.griver.dark.resource.R.color.griver_web_loading_text_night;
            }
        })));
        this.mBottomTip.setTextColor(DayNightResUtil.getColor(context, R.color.griver_web_loading_bottom_tip_text, DayNightResUtil.getNightColor(new DayNightResUtil.NightColorCallback() { // from class: com.alibaba.griver.ui.splash.SplashLoadingView$$ExternalSyntheticLambda3
            public final int onNightColor() {
                return com.alibaba.griver.dark.resource.R.color.griver_web_loading_bottom_tip_text_night;
            }
        })));
        this.f3i.setColor(DayNightResUtil.getColor(context, R.color.griver_splash_progress, DayNightResUtil.getNightColor(new DayNightResUtil.NightColorCallback() { // from class: com.alibaba.griver.ui.splash.SplashLoadingView$$ExternalSyntheticLambda4
            public final int onNightColor() {
                return com.alibaba.griver.dark.resource.R.color.griver_splash_progress_night;
            }
        })));
        setBackgroundColor(DayNightResUtil.getColor(context, R.color.griver_web_loading_default_bg, DayNightResUtil.getNightColor(new DayNightResUtil.NightColorCallback() { // from class: com.alibaba.griver.ui.splash.SplashLoadingView$$ExternalSyntheticLambda5
            public final int onNightColor() {
                return com.alibaba.griver.dark.resource.R.color.griver_web_loading_default_bg_night;
            }
        })));
    }

    public static void setStatusBarColor(Activity activity, int i2) {
        if (!StatusBarUtils.isSupport() || activity == null) {
            return;
        }
        Window window = activity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(67108864);
        window.setStatusBarColor(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.g = (getMeasuredWidth() - this.e) / 2;
        this.b.setColor(this.d);
        int i2 = this.g;
        float f = this.h;
        canvas.drawLine(i2, f, i2 + this.e, f, this.b);
        this.b.setColor(this.c);
        float f2 = this.l / 100.0f;
        if (LanguageUtils.isLTR()) {
            float f3 = this.g;
            float f4 = this.h;
            canvas.drawLine(f3, f4, f3 + (this.e * f2), f4, this.b);
        } else {
            int i3 = this.g;
            int i4 = this.e;
            float f5 = i3 + i4;
            float f6 = this.h;
            canvas.drawLine(f5, f6, f5 - (i4 * f2), f6, this.b);
        }
        String str = String.format(Locale.US, getResources().getString(R.string.griver_loading_progress_text), Integer.valueOf(this.l), "%");
        this.f3i.getTextBounds(str, 0, str.length(), this.j);
        Paint.FontMetricsInt fontMetricsInt = this.f3i.getFontMetricsInt();
        canvas.drawText(str, (getMeasuredWidth() / 2) - (this.j.width() / 2), (this.k + fontMetricsInt.bottom) - fontMetricsInt.top, this.f3i);
    }

    public final void g() {
        Activity activity = this.hostActivity;
        if (activity == null || !activity.getClass().getName().equals("com.alipay.mobile.core.loading.impl.LoadingPage")) {
            return;
        }
        setStatusBarColor(this.hostActivity, 855638016);
    }

    @Override // com.alibaba.griver.ui.splash.LoadingView
    public ImageView getIconImageView() {
        return this.mLoadingIcon;
    }

    public int getProgress() {
        return this.l;
    }

    public void initView() {
        ImageView imageView = new ImageView(this.a);
        this.mLoadingIcon = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        imageView.setScaleType(scaleType);
        this.mLoadingIcon.setImageResource(R.drawable.griver_ui_default_loading_icon);
        ImageView imageView2 = new ImageView(this.a);
        this.mLoadingBgIcon = imageView2;
        imageView2.setScaleType(scaleType);
        this.mLoadingBgIcon.setImageResource(R.drawable.griver_ui_icon_corner);
        TextView textView = new TextView(this.a);
        this.mLoadingTitle = textView;
        textView.setGravity(17);
        this.mLoadingTitle.setTextColor(this.a.getResources().getColor(R.color.griver_web_loading_text));
        this.mLoadingTitle.setTextSize(1, 17.0f);
        this.mLoadingTitle.setEllipsize(TextUtils.TruncateAt.END);
        this.mLoadingTitle.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        addView(this.mLoadingIcon);
        addView(this.mLoadingBgIcon);
        addView(this.mLoadingTitle);
        TextView textView2 = new TextView(this.a);
        this.mBottomTip = textView2;
        textView2.setTextColor(this.a.getResources().getColor(R.color.griver_web_loading_bottom_tip_text));
        this.mBottomTip.setTextSize(12.0f);
        this.mBottomTip.setGravity(17);
        this.mBottomTip.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        addView(this.mBottomTip);
        this.c = this.a.getResources().getColor(R.color.griver_web_loading_progress_light_new);
        this.d = this.a.getResources().getColor(R.color.griver_web_loading_progress_dark_new);
        this.e = a(R.dimen.griver_loading_progress_widget);
        this.f = a(R.dimen.griver_loading_progress_height);
        Paint paint = new Paint();
        this.b = paint;
        paint.setStrokeWidth(this.f);
        Paint paint2 = this.b;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.b.setStrokeCap(Paint.Cap.ROUND);
        this.b.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f3i = paint3;
        paint3.setTextSize(a(R.dimen.griver_web_loading_progress_text_size));
        this.f3i.setAntiAlias(true);
        this.j = new Rect();
        this.n = this.a.getResources().getColor(R.color.griver_web_loading_dot_dark_new);
        this.f4o = this.a.getResources().getColor(R.color.griver_web_loading_dot_light_new);
        this.s = a(R.dimen.griver_loading_dot_size);
        Paint paint4 = new Paint();
        this.t = paint4;
        paint4.setStyle(style);
        this.r = a(R.dimen.griver_loading_dot_margin);
        setBackgroundColor(this.a.getResources().getColor(R.color.griver_web_loading_default_bg));
        a(this.a, GriverThemeManager.getMode());
    }

    public void onConfigurationChanged(Configuration configuration, UiMode uiMode) {
        a(getContext(), uiMode);
    }

    @Override // com.alibaba.griver.ui.splash.LoadingView
    public void onHandleMessage(String str, Map<String, Object> map) {
        if (MSG_UPDATE_APPEARANCE.equals(str)) {
            String str2 = (String) map.get(DATA_UPDATE_APPEARANCE_BG_COLOR);
            if (!TextUtils.isEmpty(str2)) {
                setBackgroundColor(Color.parseColor(str2));
            }
            Drawable drawable = (Drawable) map.get(DATA_UPDATE_APPEARANCE_LOADING_ICON);
            if (drawable != null) {
                this.mLoadingIcon.setImageDrawable(drawable);
            }
            String str3 = (String) map.get(DATA_UPDATE_APPEARANCE_LOADING_TEXT);
            if (str3 != null) {
                this.mLoadingTitle.setText(str3);
            }
            String str4 = (String) map.get(DATA_UPDATE_APPEARANCE_LOADING_TEXT_COLOR);
            if (!TextUtils.isEmpty(str4)) {
                this.mLoadingTitle.setTextColor(Color.parseColor(str4));
            }
            String str5 = (String) map.get(DATA_UPDATE_APPEARANCE_LOADING_BOTTOM_TIP);
            if (str5 != null) {
                this.mBottomTip.setText(str5);
            }
            Integer num = (Integer) map.get(DATA_UPDATE_APPEARANCE_LOADING_PROGRESS);
            if (num != null) {
                if (this.m <= num.intValue()) {
                    this.m = num.intValue();
                    performAnimation();
                } else {
                    this.l = num.intValue();
                    postInvalidate();
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth = (getMeasuredWidth() - this.mLoadingIcon.getMeasuredWidth()) / 2;
        int iA = a(R.dimen.griver_loading_titlebar_height) + a(R.dimen.griver_loading_icon_margin_top);
        ImageView imageView = this.mLoadingIcon;
        imageView.layout(measuredWidth, iA, imageView.getMeasuredWidth() + measuredWidth, this.mLoadingIcon.getMeasuredHeight() + iA);
        this.mLoadingBgIcon.layout(measuredWidth, iA, this.mLoadingIcon.getMeasuredWidth() + measuredWidth, this.mLoadingIcon.getMeasuredHeight() + iA);
        int measuredWidth2 = (getMeasuredWidth() - this.mLoadingTitle.getMeasuredWidth()) / 2;
        int measuredHeight = iA + this.mLoadingIcon.getMeasuredHeight() + a(R.dimen.griver_loading_title_margin_top);
        TextView textView = this.mLoadingTitle;
        textView.layout(measuredWidth2, measuredHeight, textView.getMeasuredWidth() + measuredWidth2, this.mLoadingTitle.getMeasuredHeight() + measuredHeight);
        int measuredHeight2 = this.mLoadingTitle.getMeasuredHeight();
        int i6 = R.dimen.griver_loading_dot_margin_top;
        int iA2 = measuredHeight2 + measuredHeight + a(i6);
        this.h = iA2;
        this.k = iA2 + this.f + a(R.dimen.griver_loading_progress_text_margin_top);
        this.p = ((getMeasuredWidth() / 2) - this.s) - this.r;
        this.q = measuredHeight + this.mLoadingTitle.getMeasuredHeight() + a(i6);
        int measuredWidth3 = (getMeasuredWidth() - this.mBottomTip.getMeasuredWidth()) / 2;
        int measuredHeight3 = (getMeasuredHeight() - a(R.dimen.griver_loading_bottom_tip_margin_bottom)) - this.mBottomTip.getMeasuredHeight();
        TextView textView2 = this.mBottomTip;
        textView2.layout(measuredWidth3, measuredHeight3, textView2.getMeasuredWidth() + measuredWidth3, this.mBottomTip.getMeasuredHeight() + measuredHeight3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int iA = a(R.dimen.griver_loading_icon_size);
        this.mLoadingIcon.measure(b(iA), b(iA));
        this.mLoadingBgIcon.measure(b(iA), b(iA));
        int iA2 = a(R.dimen.griver_loading_title_height);
        this.mLoadingTitle.measure(View.MeasureSpec.makeMeasureSpec(a(R.dimen.griver_loading_title_width), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iA2, Integer.MIN_VALUE));
        this.mBottomTip.measure(b(a(R.dimen.griver_loading_bottom_tip_width)), View.MeasureSpec.makeMeasureSpec(a(R.dimen.griver_loading_bottom_tip_height), Integer.MIN_VALUE));
        setMeasuredDimension(i2, i3);
    }

    @Override // com.alibaba.griver.ui.splash.LoadingView
    public void onStart() {
        g();
    }

    @Override // com.alibaba.griver.ui.splash.LoadingView
    public void onStop() {
        ValueAnimator valueAnimator = this.u;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.u.cancel();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void performAnimation() {
        if (this.u == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.u = valueAnimator;
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alibaba.griver.ui.splash.SplashLoadingView.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    SplashLoadingView.this.l = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                    SplashLoadingView.this.postInvalidate();
                }
            });
        }
        if (this.u.isRunning()) {
            this.u.cancel();
        }
        this.u.setIntValues(this.l, this.m);
        this.u.setDuration(300L).start();
    }

    @Override // com.alibaba.griver.ui.splash.LoadingView
    public void setProgressType(@LoadingView.ProgressType int i2) {
        if (this.progressType == i2) {
            return;
        }
        super.setProgressType(i2);
        onStop();
        this.u = null;
    }

    public SplashLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final int b(int i2) {
        return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
    }

    public SplashLoadingView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.l = 0;
        this.m = 0;
        this.a = context;
        initView();
    }

    public final int a(int i2) {
        return this.a.getResources().getDimensionPixelSize(i2);
    }
}
