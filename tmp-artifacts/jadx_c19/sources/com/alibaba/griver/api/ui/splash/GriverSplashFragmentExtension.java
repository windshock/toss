package com.alibaba.griver.api.ui.splash;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.griver.api.common.GriverExtension;
import com.alibaba.griver.api.ui.GVSplashView;
import com.alibaba.griver.uimode.api.UiMode;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface GriverSplashFragmentExtension extends GriverExtension {

    public static abstract class AbstractSplashFragment extends Fragment {
        public GVSplashView.OnReloadListener a;

        public abstract void exit();

        public void onConfigurationChanged(Configuration configuration, UiMode uiMode) {
        }

        public void onViewCreated(View view, @Nullable Bundle bundle) {
            super.onViewCreated(view, bundle);
            boolean z = BundleUtils.getBoolean(getArguments(), "showError", false);
            String string = BundleUtils.getString(getArguments(), "errorCode", "");
            String string2 = BundleUtils.getString(getArguments(), "errorMessage", "");
            SplashEntryInfo splashEntryInfo = (SplashEntryInfo) BundleUtils.getParcelable(getArguments(), "entryInfo");
            if (z) {
                showError(string, string2);
            } else if (splashEntryInfo != null) {
                updateLoadingInfo(splashEntryInfo);
                updateProgress(splashEntryInfo);
            }
        }

        public void reload() {
            GVSplashView.OnReloadListener onReloadListener = this.a;
            if (onReloadListener != null) {
                onReloadListener.onReload();
            }
        }

        public void setReloadListener(GVSplashView.OnReloadListener onReloadListener) {
            this.a = onReloadListener;
        }

        public abstract void showError(String str, String str2);

        public abstract void updateLoadingInfo(SplashEntryInfo splashEntryInfo);

        public void updateProgress(SplashEntryInfo splashEntryInfo) {
        }
    }

    AbstractSplashFragment createSplashFragment();
}
