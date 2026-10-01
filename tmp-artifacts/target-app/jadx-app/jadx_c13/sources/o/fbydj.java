package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.ReaderJsonLexer;
import kotlinx.serialization.json.internal.ReaderJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class fbydj {
    public static final <T> void onNavigationEvent(@NotNull wie2 wie2Var, @NotNull setPreProgressHundred setpreprogresshundred, @NotNull py<? super T> pyVar, T t) {
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(setpreprogresshundred, "");
        Intrinsics.checkNotNullParameter(pyVar, "");
        new syaycx4(setpreprogresshundred, wie2Var, cypher4Encrypt.OBJ, new skipVideo[cypher4Encrypt.getEntries().size()]).onExtraCallbackWithResult((py<? super py<? super T>>) pyVar, (py<? super T>) t);
    }

    public static final <T> T onWarmupCompleted(@NotNull wie2 wie2Var, @NotNull jp<? extends T> jpVar, @NotNull setOnShakeListener setonshakelistener) {
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(jpVar, "");
        Intrinsics.checkNotNullParameter(setonshakelistener, "");
        ReaderJsonLexer readerJsonLexerOnWarmupCompleted = ReaderJsonLexerKt.onWarmupCompleted(wie2Var, setonshakelistener, null, 4, null);
        try {
            T t = (T) new getColumnNames(wie2Var, cypher4Encrypt.OBJ, readerJsonLexerOnWarmupCompleted, jpVar.getDescriptor(), null).onWarmupCompleted(jpVar);
            readerJsonLexerOnWarmupCompleted.access100();
            return t;
        } finally {
            readerJsonLexerOnWarmupCompleted.writeTypedObject();
        }
    }
}
