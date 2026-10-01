package okhttp3.sse.internal;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TTAppOpenAdTransActivity;
import o.TTBaseActivity;
import o.TTBaseLandingPageActivity;
import o.TTFullScreenVideoActivity1;
import okhttp3.internal._UtilCommonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ServerSentEventReader {
    private static final TTBaseLandingPageActivity CRLF;
    public static final Companion Companion = new Companion(null);
    private static final TTFullScreenVideoActivity1 options;
    private final Callback callback;
    private String lastId;
    private final TTAppOpenAdTransActivity source;

    public interface Callback {
        void onEvent(@Nullable String str, @Nullable String str2, @NotNull String str3);

        void onRetryChange(long j);
    }

    public ServerSentEventReader(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        Intrinsics.checkNotNullParameter(callback, "");
        this.source = tTAppOpenAdTransActivity;
        this.callback = callback;
    }

    public final boolean processNextEvent() throws IOException {
        String strOnUnminimized = this.lastId;
        TTBaseActivity tTBaseActivity = new TTBaseActivity();
        while (true) {
            String strOnUnminimized2 = null;
            while (true) {
                TTAppOpenAdTransActivity tTAppOpenAdTransActivity = this.source;
                TTFullScreenVideoActivity1 tTFullScreenVideoActivity1 = options;
                int iIAuthTabCallback = tTAppOpenAdTransActivity.IAuthTabCallback(tTFullScreenVideoActivity1);
                if (iIAuthTabCallback >= 0 && iIAuthTabCallback < 3) {
                    completeEvent(strOnUnminimized, strOnUnminimized2, tTBaseActivity);
                    return true;
                }
                if (3 <= iIAuthTabCallback && iIAuthTabCallback < 5) {
                    Companion.readData(this.source, tTBaseActivity);
                } else if (5 <= iIAuthTabCallback && iIAuthTabCallback < 8) {
                    tTBaseActivity.onExtraCallbackWithResult(10);
                } else if (8 <= iIAuthTabCallback && iIAuthTabCallback < 10) {
                    strOnUnminimized = this.source.onUnminimized();
                    if (strOnUnminimized.length() <= 0) {
                        strOnUnminimized = null;
                    }
                } else if (10 <= iIAuthTabCallback && iIAuthTabCallback < 13) {
                    strOnUnminimized = null;
                } else if (13 <= iIAuthTabCallback && iIAuthTabCallback < 15) {
                    strOnUnminimized2 = this.source.onUnminimized();
                    if (strOnUnminimized2.length() > 0) {
                    }
                } else if (15 > iIAuthTabCallback || iIAuthTabCallback >= 18) {
                    if (18 <= iIAuthTabCallback && iIAuthTabCallback < 20) {
                        long retryMs = Companion.readRetryMs(this.source);
                        if (retryMs != -1) {
                            this.callback.onRetryChange(retryMs);
                        }
                    } else if (iIAuthTabCallback == -1) {
                        long jOnExtraCallbackWithResult = this.source.onExtraCallbackWithResult(CRLF);
                        if (jOnExtraCallbackWithResult == -1) {
                            return false;
                        }
                        this.source.IAuthTabCallbackDefault(jOnExtraCallbackWithResult);
                        this.source.IAuthTabCallback(tTFullScreenVideoActivity1);
                    } else {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    private final void completeEvent(String str, String str2, TTBaseActivity tTBaseActivity) throws IOException {
        if (tTBaseActivity.ICustomTabsCallbackDefault() != 0) {
            this.lastId = str;
            tTBaseActivity.IAuthTabCallbackDefault(1L);
            this.callback.onEvent(str, str2, tTBaseActivity.onRelationshipValidationResult());
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TTFullScreenVideoActivity1 getOptions() {
            return ServerSentEventReader.options;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void readData(TTAppOpenAdTransActivity tTAppOpenAdTransActivity, TTBaseActivity tTBaseActivity) throws IOException {
            tTBaseActivity.onExtraCallbackWithResult(10);
            tTAppOpenAdTransActivity.IAuthTabCallback(tTBaseActivity, tTAppOpenAdTransActivity.onExtraCallbackWithResult(ServerSentEventReader.CRLF));
            tTAppOpenAdTransActivity.IAuthTabCallback(getOptions());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long readRetryMs(TTAppOpenAdTransActivity tTAppOpenAdTransActivity) throws IOException {
            return _UtilCommonKt.toLongOrDefault(tTAppOpenAdTransActivity.onUnminimized(), -1L);
        }
    }

    static {
        TTFullScreenVideoActivity1.onExtraCallback onextracallback = TTFullScreenVideoActivity1.Companion;
        TTBaseLandingPageActivity.IAuthTabCallback iAuthTabCallback = TTBaseLandingPageActivity.Companion;
        options = onextracallback.onWarmupCompleted(iAuthTabCallback.IAuthTabCallback("\r\n"), iAuthTabCallback.IAuthTabCallback("\r"), iAuthTabCallback.IAuthTabCallback("\n"), iAuthTabCallback.IAuthTabCallback("data: "), iAuthTabCallback.IAuthTabCallback("data:"), iAuthTabCallback.IAuthTabCallback("data\r\n"), iAuthTabCallback.IAuthTabCallback("data\r"), iAuthTabCallback.IAuthTabCallback("data\n"), iAuthTabCallback.IAuthTabCallback("id: "), iAuthTabCallback.IAuthTabCallback("id:"), iAuthTabCallback.IAuthTabCallback("id\r\n"), iAuthTabCallback.IAuthTabCallback("id\r"), iAuthTabCallback.IAuthTabCallback("id\n"), iAuthTabCallback.IAuthTabCallback("event: "), iAuthTabCallback.IAuthTabCallback("event:"), iAuthTabCallback.IAuthTabCallback("event\r\n"), iAuthTabCallback.IAuthTabCallback("event\r"), iAuthTabCallback.IAuthTabCallback("event\n"), iAuthTabCallback.IAuthTabCallback("retry: "), iAuthTabCallback.IAuthTabCallback("retry:"));
        CRLF = iAuthTabCallback.IAuthTabCallback("\r\n");
    }
}
