package o;

import java.nio.file.Path;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getAdChoicesView {
    private static String onExtraCallback(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf < 0 ? str : str.substring(0, iLastIndexOf);
    }

    public static String tD_(Path path) {
        Path fileName;
        if (path == null || (fileName = path.getFileName()) == null) {
            return null;
        }
        return onExtraCallback(fileName.toString());
    }
}
