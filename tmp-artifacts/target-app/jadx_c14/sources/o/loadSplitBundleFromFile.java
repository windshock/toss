package o;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class loadSplitBundleFromFile {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ loadSplitBundleFromFile[] $VALUES;
    public static final loadSplitBundleFromFile CERTIFY_CARD_ARS;
    private static int IAuthTabCallback;
    public static final loadSplitBundleFromFile UNAVAILABLE;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {86, 117, -27, 75};
    private static final int $$b = 84;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, byte r8) {
        /*
            int r8 = r8 * 2
            int r8 = 105 - r8
            byte[] r0 = o.loadSplitBundleFromFile.$$a
            int r7 = r7 * 3
            int r1 = r7 + 1
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.loadSplitBundleFromFile.$$c(short, short, byte):java.lang.String");
    }

    private static final /* synthetic */ loadSplitBundleFromFile[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return new loadSplitBundleFromFile[]{CERTIFY_CARD_ARS, UNAVAILABLE};
        }
        loadSplitBundleFromFile loadsplitbundlefromfile = CERTIFY_CARD_ARS;
        loadSplitBundleFromFile loadsplitbundlefromfile2 = UNAVAILABLE;
        loadSplitBundleFromFile[] loadsplitbundlefromfileArr = new loadSplitBundleFromFile[2];
        loadsplitbundlefromfileArr[0] = loadsplitbundlefromfile;
        loadsplitbundlefromfileArr[0] = loadsplitbundlefromfile2;
        return loadsplitbundlefromfileArr;
    }

    public static EnumEntries<loadSplitBundleFromFile> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 95;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<loadSplitBundleFromFile> enumEntries = $ENTRIES;
        int i5 = i2 + 71;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static loadSplitBundleFromFile valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        loadSplitBundleFromFile loadsplitbundlefromfile = (loadSplitBundleFromFile) Enum.valueOf(loadSplitBundleFromFile.class, str);
        int i4 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return loadsplitbundlefromfile;
    }

    public static loadSplitBundleFromFile[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        loadSplitBundleFromFile[] loadsplitbundlefromfileArr = $VALUES;
        if (i3 != 0) {
            return (loadSplitBundleFromFile[]) loadsplitbundlefromfileArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private loadSplitBundleFromFile(String str, int i) {
    }

    static {
        IAuthTabCallback = 0;
        onWarmupCompleted();
        CERTIFY_CARD_ARS = new loadSplitBundleFromFile("CERTIFY_CARD_ARS", 0);
        Object[] objArr = new Object[1];
        a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, (Process.myTid() >> 22) + 8, new char[]{'\r', 65528, 0, 3, 65528, 65529, 3, 65532, '\f', 5, 65528}, false, 176 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        UNAVAILABLE = new loadSplitBundleFromFile(((String) objArr[0]).intern(), 1);
        loadSplitBundleFromFile[] loadsplitbundlefromfileArr$values = $values();
        $VALUES = loadsplitbundlefromfileArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(loadsplitbundlefromfileArr$values);
        int i = onExtraCallback + 83;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r23, int r24, char[] r25, boolean r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.loadSplitBundleFromFile.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = 478308942;
    }
}
