package im.toss.rn.toss.core.common.webview;

import android.view.ViewGroup;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.rn.toss.core.common.wrapper.TossReactContentOwner;
import java.lang.ref.WeakReference;
import java.util.List;
import o.startApp;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface TossReactWebViewContentOwner extends TossReactContentOwner, WebViewContentOwner {
    List<WeakReference<startApp>> IPostMessageService_Parcel();

    startApp access200();

    default TossCoreWebView getWebView() {
        int i = 2 % 2;
        startApp startappAccess200 = access200();
        if (startappAccess200 != null) {
            return startappAccess200.getWebView();
        }
        return null;
    }

    default ViewGroup getCaWebViewContainer() {
        int i = 2 % 2;
        startApp startappAccess200 = access200();
        if (startappAccess200 != null) {
            return startappAccess200.getCaWebViewContainer();
        }
        return null;
    }

    default void onUpdateWebHistoryState() {
        int i = 2 % 2;
        super.onUpdateWebHistoryState();
        startApp startappAccess200 = access200();
        if (startappAccess200 != null) {
            startappAccess200.onUpdateWebHistoryState();
        }
    }

    default void onHistoryCleared() {
        int i = 2 % 2;
        startApp startappAccess200 = access200();
        if (startappAccess200 != null) {
            startappAccess200.onHistoryCleared();
        }
    }

    default void setSwipeRefreshEnabled(boolean z) {
        int i = 2 % 2;
        startApp startappAccess200 = access200();
        if (startappAccess200 != null) {
            startappAccess200.setSwipeRefreshEnabled(z);
        }
    }

    default boolean isSwipeRefreshEnabled() {
        int i = 2 % 2;
        startApp startappAccess200 = access200();
        if (startappAccess200 != null) {
            return startappAccess200.isSwipeRefreshEnabled();
        }
        return false;
    }

    default void onPageReady() {
        int i = 2 % 2;
        startApp startappAccess200 = access200();
        if (startappAccess200 != null) {
            startappAccess200.onPageReady();
        }
    }
}
