package o;

import java.io.File;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SaversKtExternalSyntheticLambda42 {
    SaversKtExternalSyntheticLambda42() {
    }

    public boolean onExtraCallback(File file) {
        return file.exists();
    }

    public long onNavigationEvent(File file) {
        return file.length();
    }

    public File onNavigationEvent(String str) {
        return new File(str);
    }
}
