package o;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DigestInfo {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DigestInfo[] $VALUES;
    private static char[] IAuthTabCallback;
    public static final DigestInfo KEY_0;
    public static final DigestInfo KEY_1;
    public static final DigestInfo KEY_2;
    public static final DigestInfo KEY_3;
    public static final DigestInfo KEY_4;
    public static final DigestInfo KEY_5;
    public static final DigestInfo KEY_6;
    public static final DigestInfo KEY_7;
    public static final DigestInfo KEY_8;
    public static final DigestInfo KEY_9;
    public static final DigestInfo KEY_DELETE;
    public static final DigestInfo KEY_RESET;
    private static int asBinder;
    private static long onExtraCallbackWithResult;
    private final String title;
    private static final byte[] $$a = {4, -80, 45, 109};
    private static final int $$b = 172;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, int r6, byte r7) {
        /*
            int r7 = r7 * 4
            int r7 = 97 - r7
            int r5 = r5 * 4
            int r5 = 3 - r5
            int r6 = r6 * 4
            int r0 = r6 + 1
            byte[] r1 = o.DigestInfo.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r5 = r5 + 1
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r1[r5]
        L28:
            int r7 = r7 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DigestInfo.$$c(short, int, byte):java.lang.String");
    }

    private static final /* synthetic */ DigestInfo[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 55;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        DigestInfo[] digestInfoArr = {KEY_DELETE, KEY_RESET, KEY_0, KEY_1, KEY_2, KEY_3, KEY_4, KEY_5, KEY_6, KEY_7, KEY_8, KEY_9};
        int i5 = i2 + 71;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return digestInfoArr;
    }

    public static EnumEntries<DigestInfo> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 67;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        EnumEntries<DigestInfo> enumEntries = $ENTRIES;
        int i4 = i2 + 29;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static DigestInfo valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        DigestInfo digestInfo = (DigestInfo) Enum.valueOf(DigestInfo.class, str);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
        return digestInfo;
    }

    public static DigestInfo[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        DigestInfo[] digestInfoArr = (DigestInfo[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return digestInfoArr;
        }
        throw null;
    }

    private DigestInfo(String str, int i, String str2) {
        this.title = str2;
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 23;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        asBinder = 1;
        onWarmupCompleted();
        KEY_DELETE = new DigestInfo("KEY_DELETE", 0, "DELETE");
        KEY_RESET = new DigestInfo("KEY_RESET", 1, "RESET");
        Object[] objArr = new Object[1];
        a(Gravity.getAbsoluteGravity(0, 0), -TextUtils.indexOf((CharSequence) "", '0', 0), (char) (14420 - Process.getGidForName("")), objArr);
        KEY_0 = new DigestInfo("KEY_0", 2, ((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a(Color.argb(0, 0, 0, 0) + 1, ExpandableListView.getPackedPositionType(0L) + 1, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
        KEY_1 = new DigestInfo("KEY_1", 3, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(2 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), objArr3);
        KEY_2 = new DigestInfo("KEY_2", 4, ((String) objArr3[0]).intern());
        KEY_3 = new DigestInfo("KEY_3", 5, "3");
        KEY_4 = new DigestInfo("KEY_4", 6, "4");
        KEY_5 = new DigestInfo("KEY_5", 7, "5");
        KEY_6 = new DigestInfo("KEY_6", 8, "6");
        KEY_7 = new DigestInfo("KEY_7", 9, "7");
        KEY_8 = new DigestInfo("KEY_8", 10, "8");
        KEY_9 = new DigestInfo("KEY_9", 11, "9");
        DigestInfo[] digestInfoArr$values = $values();
        $VALUES = digestInfoArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(digestInfoArr$values);
        int i = onNavigationEvent + 81;
        asBinder = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r29, int r30, char r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DigestInfo.a(int, int, char, java.lang.Object[]):void");
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = new char[]{54705, 60901, 60902};
        onExtraCallbackWithResult = -7218174460689342249L;
    }
}
