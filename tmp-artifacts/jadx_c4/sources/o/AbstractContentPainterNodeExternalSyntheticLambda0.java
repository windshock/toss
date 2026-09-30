package o;

import im.toss.components.sharedpreferences.ciphers.cryptor.keystore.RecoverableKeyStoreCryptorException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AbstractContentPainterNodeExternalSyntheticLambda0 extends RecoverableKeyStoreCryptorException {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final String messages;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractContentPainterNodeExternalSyntheticLambda0() {
        String str = null;
        this(str, 1, str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AbstractContentPainterNodeExternalSyntheticLambda0(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 27;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 95;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 4;
            } else {
                int i7 = 2 % 2;
            }
            str = "";
        }
        this(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractContentPainterNodeExternalSyntheticLambda0(@NotNull String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() > 0) {
            int i = onExtraCallback + 75;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
            str2 = str;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            int i4 = onExtraCallback + 59;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 27 / 0;
            }
            str2 = "AndroidKeyStore cryptor result is corrupted";
        }
        super(str2);
        this.messages = str;
    }
}
