package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda23 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda23[] $VALUES;
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda23 CARD_LOAN;
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda23 CREDIT_LOAN;
    public static final IAuthTabCallback Companion;
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda23 DSR;
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda23 FIND_MY_HOME;
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda23 INTEREST;
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda23 JEONSE_LOAN;
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda23 JEONSE_REFINANCING;
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda23 LIVING_FUND;
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda23 MGMT;
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda23 MORTGAGE_LOAN;
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda23 MORTGAGE_REFINANCING;
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda23 REFINANCING_LOAN;
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda23 TOSS_BANK;
    public static final ImagePipelineExperimentsBuilderExternalSyntheticLambda23 UNKNOWN;
    private static int onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static long onWarmupCompleted;
    private final String logName;
    private final Long menuEntryId;
    private static final byte[] $$a = {126, 1, 26, -71};
    private static final int $$b = 160;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, byte r8) {
        /*
            byte[] r0 = o.ImagePipelineExperimentsBuilderExternalSyntheticLambda23.$$a
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r8 = r8 * 3
            int r8 = 97 - r8
            int r7 = r7 * 2
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ImagePipelineExperimentsBuilderExternalSyntheticLambda23.$$c(int, byte, byte):java.lang.String");
    }

    private static final /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda23[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda23[] imagePipelineExperimentsBuilderExternalSyntheticLambda23Arr = {CREDIT_LOAN, MORTGAGE_LOAN, CARD_LOAN, JEONSE_LOAN, REFINANCING_LOAN, MORTGAGE_REFINANCING, JEONSE_REFINANCING, MGMT, INTEREST, DSR, FIND_MY_HOME, TOSS_BANK, LIVING_FUND, UNKNOWN};
        int i5 = i2 + 17;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return imagePipelineExperimentsBuilderExternalSyntheticLambda23Arr;
    }

    public static EnumEntries<ImagePipelineExperimentsBuilderExternalSyntheticLambda23> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 25;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<ImagePipelineExperimentsBuilderExternalSyntheticLambda23> enumEntries = $ENTRIES;
        int i5 = i2 + 83;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static ImagePipelineExperimentsBuilderExternalSyntheticLambda23 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda23 imagePipelineExperimentsBuilderExternalSyntheticLambda23 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda23) Enum.valueOf(ImagePipelineExperimentsBuilderExternalSyntheticLambda23.class, str);
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        int i5 = IAuthTabCallback + 59;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return imagePipelineExperimentsBuilderExternalSyntheticLambda23;
    }

    public static ImagePipelineExperimentsBuilderExternalSyntheticLambda23[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ImagePipelineExperimentsBuilderExternalSyntheticLambda23[] imagePipelineExperimentsBuilderExternalSyntheticLambda23Arr = (ImagePipelineExperimentsBuilderExternalSyntheticLambda23[]) $VALUES.clone();
        int i4 = onExtraCallback + 117;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return imagePipelineExperimentsBuilderExternalSyntheticLambda23Arr;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $11 + 9;
        $10 = i4 % 128;
        while (true) {
            int i5 = i4 % 2;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - Gravity.getAbsoluteGravity(0, 0)), TextUtils.lastIndexOf("", '0') + 18, ImageFormat.getBitsPerPixel(0) + 10974, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getTouchSlop() >> 8)), ((Process.getThreadPriority(0) + 20) >> 6) + 31, (ViewConfiguration.getPressedStateDuration() >> 16) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            char gidForName = (char) (Process.getGidForName("") + 49124);
                            int i7 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43;
                            int absoluteGravity = 1494 - Gravity.getAbsoluteGravity(0, 0);
                            byte b = (byte) ($$a[1] - 1);
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(gidForName, i7, absoluteGravity, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        i4 = $10 + 101;
                        $11 = i4 % 128;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) ($$a[1] - 1);
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1495 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr);
        int i8 = $10 + 115;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private ImagePipelineExperimentsBuilderExternalSyntheticLambda23(String str, int i, String str2, Long l) {
        this.logName = str2;
        this.menuEntryId = l;
    }

    public final String getLogName() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 87;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.logName;
        int i5 = i2 + 119;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Long getMenuEntryId() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 117;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Long l = this.menuEntryId;
        int i4 = i2 + 121;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return l;
    }

    static {
        onExtraCallbackWithResult = 0;
        onExtraCallbackWithResult();
        CREDIT_LOAN = new ImagePipelineExperimentsBuilderExternalSyntheticLambda23("CREDIT_LOAN", 0, "CREDIT", 1000129L);
        MORTGAGE_LOAN = new ImagePipelineExperimentsBuilderExternalSyntheticLambda23("MORTGAGE_LOAN", 1, "HOUSE", 1000605L);
        CARD_LOAN = new ImagePipelineExperimentsBuilderExternalSyntheticLambda23("CARD_LOAN", 2, "CARD", 1001276L);
        JEONSE_LOAN = new ImagePipelineExperimentsBuilderExternalSyntheticLambda23("JEONSE_LOAN", 3, "JEONSE", 11002385L);
        REFINANCING_LOAN = new ImagePipelineExperimentsBuilderExternalSyntheticLambda23("REFINANCING_LOAN", 4, "REFINANCING", 11001420L);
        MORTGAGE_REFINANCING = new ImagePipelineExperimentsBuilderExternalSyntheticLambda23("MORTGAGE_REFINANCING", 5, "MORTGAGE_REFINANCING", 11001923L);
        JEONSE_REFINANCING = new ImagePipelineExperimentsBuilderExternalSyntheticLambda23("JEONSE_REFINANCING", 6, "JEONSE_REFINANCING", 11001939L);
        MGMT = new ImagePipelineExperimentsBuilderExternalSyntheticLambda23("MGMT", 7, "mgmt", 1001347L);
        INTEREST = new ImagePipelineExperimentsBuilderExternalSyntheticLambda23("INTEREST", 8, "interest", 1000302L);
        DSR = new ImagePipelineExperimentsBuilderExternalSyntheticLambda23("DSR", 9, "dsr", 1000944L);
        FIND_MY_HOME = new ImagePipelineExperimentsBuilderExternalSyntheticLambda23("FIND_MY_HOME", 10, "find_my_home", 11002203L);
        TOSS_BANK = new ImagePipelineExperimentsBuilderExternalSyntheticLambda23("TOSS_BANK", 11, "", 11001737L);
        LIVING_FUND = new ImagePipelineExperimentsBuilderExternalSyntheticLambda23("LIVING_FUND", 12, "LIVING", 1000605L);
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf("", "", 0), 7 - ExpandableListView.getPackedPositionType(0L), (char) Color.blue(0), objArr);
        DefaultConstructorMarker defaultConstructorMarker = null;
        UNKNOWN = new ImagePipelineExperimentsBuilderExternalSyntheticLambda23(((String) objArr[0]).intern(), 13, null, null);
        ImagePipelineExperimentsBuilderExternalSyntheticLambda23[] imagePipelineExperimentsBuilderExternalSyntheticLambda23Arr$values = $values();
        $VALUES = imagePipelineExperimentsBuilderExternalSyntheticLambda23Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(imagePipelineExperimentsBuilderExternalSyntheticLambda23Arr$values);
        Companion = new IAuthTabCallback(defaultConstructorMarker);
        int i = onTransact + 79;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final ImagePipelineExperimentsBuilderExternalSyntheticLambda23 IAuthTabCallback(@Nullable String str) {
            Object obj;
            Object next;
            int i = 2 % 2;
            Iterator it = ImagePipelineExperimentsBuilderExternalSyntheticLambda23.getEntries().iterator();
            int i2 = onExtraCallback + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (StringsKt.equals(((ImagePipelineExperimentsBuilderExternalSyntheticLambda23) next).name(), str, true)) {
                    int i4 = onWarmupCompleted + 13;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    break;
                }
            }
            ImagePipelineExperimentsBuilderExternalSyntheticLambda23 imagePipelineExperimentsBuilderExternalSyntheticLambda23 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda23) next;
            if (imagePipelineExperimentsBuilderExternalSyntheticLambda23 != null) {
                return imagePipelineExperimentsBuilderExternalSyntheticLambda23;
            }
            int i6 = onExtraCallback + 1;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return ImagePipelineExperimentsBuilderExternalSyntheticLambda23.UNKNOWN;
            }
            ImagePipelineExperimentsBuilderExternalSyntheticLambda23 imagePipelineExperimentsBuilderExternalSyntheticLambda232 = ImagePipelineExperimentsBuilderExternalSyntheticLambda23.UNKNOWN;
            obj.hashCode();
            throw null;
        }
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = new char[]{60801, 20300, 43059, 1304, 26307, 50093, 15518};
        onWarmupCompleted = 6297618963417419522L;
    }
}
