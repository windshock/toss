package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import o.getArbitrageLoadingView;
import o.setOnShakeListener;
import o.wie2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ReaderJsonLexerKt {
    public static /* synthetic */ ReaderJsonLexer onWarmupCompleted(wie2 wie2Var, setOnShakeListener setonshakelistener, char[] cArr, int i, Object obj) {
        if ((i & 4) != 0) {
            cArr = getArbitrageLoadingView.IAuthTabCallback.onNavigationEvent();
        }
        return onExtraCallback(wie2Var, setonshakelistener, cArr);
    }

    public static final ReaderJsonLexer onExtraCallback(@NotNull wie2 wie2Var, @NotNull setOnShakeListener setonshakelistener, @NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(setonshakelistener, "");
        Intrinsics.checkNotNullParameter(cArr, "");
        return !wie2Var.IAuthTabCallback().IAuthTabCallback() ? new ReaderJsonLexer(setonshakelistener, cArr) : new ReaderJsonLexerWithComments(setonshakelistener, cArr);
    }
}
