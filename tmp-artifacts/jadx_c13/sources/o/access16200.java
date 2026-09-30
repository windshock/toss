package o;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access16200 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String onNavigationEvent(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
