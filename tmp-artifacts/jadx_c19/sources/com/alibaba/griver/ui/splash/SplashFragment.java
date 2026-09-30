package com.alibaba.griver.ui.splash;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.app.api.ui.StatusBarUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.api.ui.splash.GriverSplashFragmentExtension;
import com.alibaba.griver.api.ui.splash.SplashEntryInfo;
import com.alibaba.griver.base.R;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.ImageUtils;
import com.alibaba.griver.core.ui.activity.GriverBaseActivity;
import com.alibaba.griver.uimode.DayNightResUtil;
import com.alibaba.griver.uimode.GriverThemeManager;
import com.alibaba.griver.uimode.api.UiMode;
import com.alibaba.griver.uimode.callback.ConfigurationCallback;
import java.util.HashMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class SplashFragment extends GriverSplashFragmentExtension.AbstractSplashFragment {
    public static final String FRAGMENT_START_TOKEN = "StartToken";
    public static final String FRAGMENT_TAG = "SplashViewImpl";
    public View b;
    public ImageView c;
    public LoadingView d;
    public LinearLayout e;
    public ImageView f;
    public TextView g;
    public TextView h;

    /* renamed from: i, reason: collision with root package name */
    public Button f2i;
    public OnLoadingViewInitListener loadingViewInitListener;

    public interface OnLoadingViewInitListener {
        void onInited(LoadingView loadingView);
    }

    public final void a(Context context, Configuration configuration, UiMode uiMode) {
        if (context == null) {
            return;
        }
        View view = this.b;
        int i2 = R.color.griver_common_bg;
        view.setBackgroundColor(DayNightResUtil.getColor(context, i2, DayNightResUtil.getNightColor(new DayNightResUtil.NightColorCallback() { // from class: com.alibaba.griver.ui.splash.SplashFragment$$ExternalSyntheticLambda0
            public final int onNightColor() {
                return com.alibaba.griver.dark.resource.R.color.griver_common_bg_night;
            }
        })));
        this.c.setImageResource(DayNightResUtil.getDrawableId(R.drawable.griver_ui_ic_header_back, DayNightResUtil.getNightResId(new DayNightResUtil.NightResCallback() { // from class: com.alibaba.griver.ui.splash.SplashFragment$$ExternalSyntheticLambda1
            public final int onNightRes() {
                return com.alibaba.griver.dark.resource.R.drawable.griver_ui_ic_header_back_night;
            }
        })));
        this.f.setImageResource(DayNightResUtil.getDrawableId(R.drawable.griver_ui_splash_error_caution, DayNightResUtil.getNightResId(new DayNightResUtil.NightResCallback() { // from class: com.alibaba.griver.ui.splash.SplashFragment$$ExternalSyntheticLambda2
            public final int onNightRes() {
                return com.alibaba.griver.dark.resource.R.drawable.griver_ui_splash_error_caution_night;
            }
        })));
        this.g.setTextColor(DayNightResUtil.getColor(context, R.color.griver_splash_tips, DayNightResUtil.getNightColor(new DayNightResUtil.NightColorCallback() { // from class: com.alibaba.griver.ui.splash.SplashFragment$$ExternalSyntheticLambda3
            public final int onNightColor() {
                return com.alibaba.griver.dark.resource.R.color.griver_splash_tips_night;
            }
        })));
        this.h.setTextColor(DayNightResUtil.getColor(context, R.color.griver_web_loading_bottom_tip_text, DayNightResUtil.getNightColor(new DayNightResUtil.NightColorCallback() { // from class: com.alibaba.griver.ui.splash.SplashFragment$$ExternalSyntheticLambda4
            public final int onNightColor() {
                return com.alibaba.griver.dark.resource.R.color.griver_web_loading_bottom_tip_text_night;
            }
        })));
        ConfigurationCallback configurationCallback = this.d;
        if (configurationCallback instanceof ConfigurationCallback) {
            ConfigurationCallback configurationCallback2 = configurationCallback;
            if (configuration == null) {
                configuration = context.getResources().getConfiguration();
            }
            configurationCallback2.onConfigurationChanged(configuration, uiMode);
        }
        DayNightResUtil.setWindowAndNavBarColor(getActivity(), DayNightResUtil.getColor(context, i2, DayNightResUtil.getNightColor(new DayNightResUtil.NightColorCallback() { // from class: com.alibaba.griver.ui.splash.SplashFragment$$ExternalSyntheticLambda5
            public final int onNightColor() {
                return com.alibaba.griver.dark.resource.R.color.griver_common_bg_night;
            }
        })));
    }

    @Override // com.alibaba.griver.api.ui.splash.GriverSplashFragmentExtension.AbstractSplashFragment
    public void exit() {
    }

    @Override // com.alibaba.griver.api.ui.splash.GriverSplashFragmentExtension.AbstractSplashFragment
    public void onConfigurationChanged(Configuration configuration, UiMode uiMode) {
        a(getContext(), configuration, uiMode);
    }

    public void onCreate(@Nullable Bundle bundle) {
        RVLogger.d("SplashFragment", "SplashFragment.onCreate");
        super.onCreate(bundle);
        if (getArguments() != null) {
            getArguments().setClassLoader(SplashFragment.class.getClassLoader());
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        RVLogger.d("SplashFragment", "SplashFragment.onCreateLoadingView");
        View viewInflate = layoutInflater.inflate(R.layout.griver_ui_fragment_splash, viewGroup, false);
        this.b = viewInflate.findViewById(R.id.view_splash_root);
        this.d = (LoadingView) viewInflate.findViewById(R.id.view_splash_loading);
        this.e = (LinearLayout) viewInflate.findViewById(R.id.view_splash_error);
        this.f = (ImageView) viewInflate.findViewById(R.id.iv_error_icon);
        this.g = (TextView) viewInflate.findViewById(R.id.tv_error_text);
        this.d.setHostActivity(getActivity());
        OnLoadingViewInitListener onLoadingViewInitListener = this.loadingViewInitListener;
        if (onLoadingViewInitListener != null) {
            onLoadingViewInitListener.onInited(this.d);
        }
        this.c = (ImageView) viewInflate.findViewById(R.id.tv_back_button);
        if (getActivity() instanceof GriverBaseActivity) {
            this.c.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.griver.ui.splash.SplashFragment.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    FragmentActivity activity = SplashFragment.this.getActivity();
                    if (SplashFragment.this.d != null) {
                        SplashFragment.this.d.cancel();
                    }
                    if (activity != null) {
                        activity.finish();
                    }
                }
            });
        } else {
            this.c.setVisibility(4);
        }
        Button button = (Button) viewInflate.findViewById(R.id.btn_reload);
        this.f2i = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.griver.ui.splash.SplashFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SplashFragment.this.reload();
            }
        });
        this.h = (TextView) viewInflate.findViewById(R.id.tv_error);
        if (StatusBarUtils.isSupport() && StatusBarUtils.isConfigSupport()) {
            viewInflate.setPaddingRelative(0, StatusBarUtils.getStatusBarHeight(getActivity()), 0, 0);
        }
        a(getContext(), null, GriverThemeManager.getMode());
        return viewInflate;
    }

    public void onDestroy() {
        RVLogger.d("SplashFragment", "SplashFragment.onDestroy");
        LoadingView loadingView = this.d;
        if (loadingView != null) {
            loadingView.stop();
        }
        super.onDestroy();
    }

    public void onResume() {
        RVLogger.d("SplashFragment", "SplashFragment.onResume");
        super.onResume();
    }

    public void onStart() {
        LoadingView loadingView = this.d;
        if (loadingView != null) {
            loadingView.start();
        }
        super.onStart();
    }

    public void onStop() {
        RVLogger.d("SplashFragment", "SplashFragment.onStop");
        LoadingView loadingView = this.d;
        if (loadingView != null) {
            loadingView.stop();
        }
        super.onStop();
    }

    public void setBackButtonVisibility(int i2) {
        ImageView imageView = this.c;
        if (imageView == null) {
            return;
        }
        final Context context = imageView.getContext();
        if (i2 == 4 || i2 == 8) {
            this.c.setVisibility(i2);
        } else {
            this.c.setVisibility(0);
            this.c.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.griver.ui.splash.SplashFragment.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (SplashFragment.this.d != null) {
                        SplashFragment.this.d.cancel();
                    }
                    Context context2 = context;
                    if (context2 == null || !(context2 instanceof Activity)) {
                        return;
                    }
                    ((Activity) context2).finish();
                }
            });
        }
    }

    @Override // com.alibaba.griver.api.ui.splash.GriverSplashFragmentExtension.AbstractSplashFragment
    public void showError(String str, String str2) {
        LoadingView loadingView = this.d;
        if (loadingView != null) {
            loadingView.onStop();
            this.h.setText(String.format(getString(R.string.griver_prepare_app_failed_error_code), str));
            this.d.setVisibility(8);
            this.e.setVisibility(0);
            if ("10040".equals(str)) {
                this.g.setText(str2);
                this.f2i.setText(getString(R.string.griver_go_back));
                this.f2i.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.griver.ui.splash.SplashFragment$$ExternalSyntheticLambda7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f$0.a(view);
                    }
                });
            } else {
                this.f2i.setText(getString(R.string.griver_ui_loading_reload));
                this.g.setText(getString(R.string.griver_prepare_app_failed));
                this.f2i.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.griver.ui.splash.SplashFragment$$ExternalSyntheticLambda8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f$0.b(view);
                    }
                });
            }
        }
    }

    @Override // com.alibaba.griver.api.ui.splash.GriverSplashFragmentExtension.AbstractSplashFragment
    public void updateLoadingInfo(SplashEntryInfo splashEntryInfo) {
        LoadingView loadingView = this.d;
        if (loadingView == null || splashEntryInfo == null) {
            return;
        }
        loadingView.setProgressType(1);
        this.d.setVisibility(0);
        this.e.setVisibility(8);
        this.d.onStart();
        GriverLogger.d("SplashFragment", "update loading info: " + splashEntryInfo.toString());
        HashMap map = new HashMap();
        map.put(SplashLoadingView.DATA_UPDATE_APPEARANCE_LOADING_TEXT, !TextUtils.isEmpty(splashEntryInfo.appName) ? splashEntryInfo.appName : getString(R.string.griver_prepare_app_name_default));
        map.put(SplashLoadingView.DATA_UPDATE_APPEARANCE_LOADING_BOTTOM_TIP, splashEntryInfo.slogan);
        this.d.sendMessage(SplashLoadingView.MSG_UPDATE_APPEARANCE, map);
        if (TextUtils.isEmpty(splashEntryInfo.iconUrl) || this.d.getIconImageView() == null || getContext() == null) {
            return;
        }
        ImageUtils.loadImage(this.d.getIconImageView(), ContextCompat.getDrawable(getContext(), DayNightResUtil.getDrawableId(R.drawable.griver_ui_default_loading_icon, DayNightResUtil.getNightResId(new DayNightResUtil.NightResCallback() { // from class: com.alibaba.griver.ui.splash.SplashFragment$$ExternalSyntheticLambda6
            public final int onNightRes() {
                return com.alibaba.griver.dark.resource.R.drawable.griver_ui_default_loading_icon_night;
            }
        }))), splashEntryInfo.iconUrl);
    }

    @Override // com.alibaba.griver.api.ui.splash.GriverSplashFragmentExtension.AbstractSplashFragment
    public void updateProgress(SplashEntryInfo splashEntryInfo) {
        LoadingView loadingView = this.d;
        if (loadingView == null || splashEntryInfo == null) {
            return;
        }
        loadingView.setVisibility(0);
        this.e.setVisibility(8);
        GriverLogger.d("SplashFragment", "update loading info: " + splashEntryInfo);
        HashMap map = new HashMap();
        map.put(SplashLoadingView.DATA_UPDATE_APPEARANCE_LOADING_PROGRESS, Integer.valueOf(splashEntryInfo.progress));
        this.d.sendMessage(SplashLoadingView.MSG_UPDATE_APPEARANCE, map);
    }

    public final /* synthetic */ void b(View view) {
        reload();
    }

    public final /* synthetic */ void a(View view) {
        LoadingView loadingView = this.d;
        if (loadingView != null) {
            loadingView.cancel();
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
