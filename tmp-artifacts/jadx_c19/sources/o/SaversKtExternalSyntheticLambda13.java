package o;

import com.alibaba.griver.base.common.utils.HexStringUtil;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SaversKtExternalSyntheticLambda13 {
    static final Charset onExtraCallback = Charset.forName("US-ASCII");
    static final Charset onWarmupCompleted = Charset.forName(HexStringUtil.DEFAULT_CHARSET_NAME);

    static void onWarmupCompleted(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                onWarmupCompleted(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }

    static void onNavigationEvent(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
