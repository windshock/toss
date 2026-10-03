package o;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.File;
import java.util.Comparator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.password.log.PasswordLog;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class asBooleanlambda1 extends ComputeLandmarkConfidence<PasswordLog> {
    private static short[] onExtraCallback;
    private static final byte[] $$a = {96, -37, -4, -26};
    private static final int $$b = 113;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = -1328830447;
    private static int onWarmupCompleted = -1538795436;
    private static int onExtraCallbackWithResult = -133823176;
    private static byte[] onNavigationEvent = {-72, -6, 14, 9, -2, 24, 9, 14, -14, -10, -8, 7};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r7 = 115 - r7
            int r8 = r8 * 2
            int r0 = r8 + 1
            int r6 = r6 * 3
            int r6 = 3 - r6
            byte[] r1 = o.asBooleanlambda1.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r6 = r6 + 1
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r4 = -r4
            int r6 = r6 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.asBooleanlambda1.$$c(byte, byte, byte):java.lang.String");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public asBooleanlambda1(@NotNull Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        Object[] objArr = new Object[1];
        a((short) (Color.red(0) - 2), (byte) (',' - AndroidCharacter.getMirror('0')), Process.getGidForName("") - 344748056, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 1547820223, (-93) - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        super(context, ((String) objArr[0]).intern(), 100, (Comparator) null, (File) null, (ExtractFeature) null, 56, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r25, byte r26, int r27, int r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.asBooleanlambda1.a(short, byte, int, int, int, java.lang.Object[]):void");
    }
}
