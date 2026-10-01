package im.toss.core.webkit;

import android.content.Intent;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.startApp;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface WebViewContentOwner extends r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, startApp {
    default boolean closeWebView(@Nullable String str, boolean z) {
        int i = 2 % 2;
        return false;
    }

    @Override // o.startApp
    default ViewGroup getCaWebViewContainer() {
        int i = 2 % 2;
        return null;
    }

    default Boolean getShouldWebViewPauseOnInvisible() {
        int i = 2 % 2;
        return null;
    }

    @Override // o.startApp
    default String getSwipeRefreshCallback() {
        int i = 2 % 2;
        return null;
    }

    @Override // o.startApp
    TossCoreWebView getWebView();

    @Override // o.startApp
    default boolean isSwipeRefreshEnabled() {
        int i = 2 % 2;
        return false;
    }

    @Override // o.startApp
    default void onHistoryCleared() {
        int i = 2 % 2;
    }

    @Override // o.startApp
    default void onPageReady() {
        int i = 2 % 2;
    }

    default void setFullScreenEnabled(boolean z) {
        int i = 2 % 2;
    }

    default void setShouldWebViewPauseOnInvisible(@Nullable Boolean bool) {
        int i = 2 % 2;
    }

    @Override // o.startApp
    default void setSwipeRefreshCallback(@Nullable String str) {
        int i = 2 % 2;
    }

    @Override // o.startApp
    default void onUpdateWebHistoryState() {
        String title;
        int i = 2 % 2;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            TossCoreWebView webView = getWebView();
            if (webView == null || (title = webView.getTitle()) == null) {
                title = "";
            }
            activity.setTitle(title);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NotImplementedError */
    @Override // o.startApp
    default void setSwipeRefreshEnabled(boolean z) throws NotImplementedError {
        int i = 2 % 2;
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    default Intent getSourceIntent() {
        int i = 2 % 2;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity.getIntent();
        }
        return null;
    }
}
