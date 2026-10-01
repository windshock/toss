package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class PangleEncryptUtilsType4 {
    public static final <T> void onExtraCallback(@NotNull wie2 wie2Var, @NotNull py<? super T> pyVar, T t, @NotNull OutputStream outputStream) throws IOException {
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(pyVar, "");
        Intrinsics.checkNotNullParameter(outputStream, "");
        fbyycx2 fbyycx2Var = new fbyycx2(outputStream);
        try {
            fbydj.onNavigationEvent(wie2Var, fbyycx2Var, pyVar, t);
        } finally {
            fbyycx2Var.onExtraCallbackWithResult();
        }
    }

    public static final <T> T onExtraCallback(@NotNull wie2 wie2Var, @NotNull jp<? extends T> jpVar, @NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(jpVar, "");
        Intrinsics.checkNotNullParameter(inputStream, "");
        setPreStart setprestart = new setPreStart(inputStream);
        try {
            return (T) fbydj.onWarmupCompleted(wie2Var, jpVar, setprestart);
        } finally {
            setprestart.onNavigationEvent();
        }
    }
}
