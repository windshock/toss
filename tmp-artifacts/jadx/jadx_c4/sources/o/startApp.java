package o;

import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import im.toss.core.webkit.TossBridgeWebView;
import im.toss.core.webkit.TossCoreWebView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface startApp {
    ViewGroup getCaWebViewContainer();

    String getSwipeRefreshCallback();

    TossCoreWebView getWebView();

    default boolean handleCaWebViewBackPress(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        return false;
    }

    boolean isSwipeRefreshEnabled();

    void onHistoryCleared();

    default void onPageReady() {
        int i = 2 % 2;
    }

    void onUpdateWebHistoryState();

    void setSwipeRefreshCallback(@Nullable String str);

    void setSwipeRefreshEnabled(boolean z);

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ String $callback;
        final /* synthetic */ SwipeRefreshLayout $swipeRefreshLayout;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(String str, SwipeRefreshLayout swipeRefreshLayout, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$callback = str;
            this.$swipeRefreshLayout = swipeRefreshLayout;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = startApp.this.new onExtraCallback(this.$callback, this.$swipeRefreshLayout, access13800Var);
            int i2 = onNavigationEvent + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 119;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 1 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            TossCoreWebView webView;
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            Object obj2 = null;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                TossCoreWebView webView2 = startApp.this.getWebView();
                if (webView2 == null) {
                    str = null;
                    if (str == null && Intrinsics.areEqual(StringsKt.toBooleanStrictOrNull(str), access14000.onNavigationEvent(false))) {
                        SwipeRefreshLayout swipeRefreshLayout = this.$swipeRefreshLayout;
                        if (swipeRefreshLayout != null) {
                            swipeRefreshLayout.setRefreshing(false);
                        }
                    } else {
                        startApp.this.setSwipeRefreshCallback(null);
                        webView = startApp.this.getWebView();
                        if (webView != null) {
                            int i5 = onNavigationEvent + 1;
                            onExtraCallback = i5 % 128;
                            if (i5 % 2 != 0) {
                                webView.reload();
                                obj2.hashCode();
                                throw null;
                            }
                            webView.reload();
                        }
                    }
                    return Unit.INSTANCE;
                }
                int i6 = onNavigationEvent + 19;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                String str2 = this.$callback;
                this.label = 1;
                obj = TossBridgeWebView.IAuthTabCallback(webView2, str2, null, this, 2, null);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = onExtraCallback + 125;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            str = (String) obj;
            if (str == null) {
                startApp.this.setSwipeRefreshCallback(null);
                webView = startApp.this.getWebView();
                if (webView != null) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    default void onSwipeToRefresh(@Nullable SwipeRefreshLayout swipeRefreshLayout) {
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult;
        int i = 2 % 2;
        String swipeRefreshCallback = getSwipeRefreshCallback();
        if (swipeRefreshCallback != null) {
            if (swipeRefreshLayout == null || (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(swipeRefreshLayout)) == null) {
                TossCoreWebView webView = getWebView();
                textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = webView != null ? AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(webView) : null;
                if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult == null) {
                    return;
                }
            }
            if (maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(swipeRefreshCallback, swipeRefreshLayout, null), 3, (Object) null) != null) {
                return;
            }
        }
        TossCoreWebView webView2 = getWebView();
        if (webView2 != null) {
            webView2.reload();
            Unit unit = Unit.INSTANCE;
        }
    }
}
