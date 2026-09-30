package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.TTAppOpenAdTransActivity;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface PushObserver {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();

    boolean onData(int i, @NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity, int i2, boolean z) throws IOException;

    boolean onHeaders(int i, @NotNull List<Header> list, boolean z);

    boolean onRequest(int i, @NotNull List<Header> list);

    void onReset(int i, @NotNull ErrorCode errorCode);

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static final class PushObserverCancel implements PushObserver {
            @Override // okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int i, @NotNull List<Header> list, boolean z) {
                Intrinsics.checkNotNullParameter(list, "");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onRequest(int i, @NotNull List<Header> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public void onReset(int i, @NotNull ErrorCode errorCode) {
                Intrinsics.checkNotNullParameter(errorCode, "");
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onData(int i, @NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity, int i2, boolean z) throws IOException {
                Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
                tTAppOpenAdTransActivity.IAuthTabCallbackDefault(i2);
                return true;
            }
        }
    }
}
