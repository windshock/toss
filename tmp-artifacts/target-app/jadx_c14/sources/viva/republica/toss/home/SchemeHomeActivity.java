package viva.republica.toss.home;

import android.content.Context;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CommonModule_closeView;
import o.SessionTrackerb;
import o.filterCreatePageParams;
import o.zzaj;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SchemeHomeActivity extends Hilt_SchemeHomeActivity {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int IAuthTabCallbackDefault = 8;

    @Inject
    public SessionTrackerb tossRouter;

    public long getScreenId() {
        return -1L;
    }

    public final SessionTrackerb onNavigationEvent() {
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0102  */
    @Override // viva.republica.toss.home.Hilt_SchemeHomeActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.home.SchemeHomeActivity.onCreate(android.os.Bundle):void");
    }

    public static final class onExtraCallbackWithResult {
        private static final byte[] $$a = {96, -37, -4, -26};
        private static final int $$b = 51;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onWarmupCompleted = 0;
        private static int onNavigationEvent = 1;
        private static char[] onExtraCallbackWithResult = {1688, 18500, 39727, 59904, 15857, 36061, 57240, 8558, 28744, 50043, 4672, 26010, 46247, 1936, 18794, 38984, 60199, 15096, 36305, 56480, 12252, 29053, 49206, 4895, 25254, 46549, 1213, 22132, 39261, 59434, 15110, 35566, 56799, 11416, 32368, 49483, 4220, 25357, 45782, 1449, 21662, 42556};
        private static long IAuthTabCallback = 5929127494489383694L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r6, byte r7, int r8) {
            /*
                int r7 = r7 * 3
                int r7 = 4 - r7
                int r6 = r6 * 2
                int r6 = 97 - r6
                byte[] r0 = viva.republica.toss.home.SchemeHomeActivity.onExtraCallbackWithResult.$$a
                int r8 = r8 * 4
                int r1 = 1 - r8
                byte[] r1 = new byte[r1]
                r2 = 0
                int r8 = 0 - r8
                if (r0 != 0) goto L18
                r3 = r7
                r4 = r2
                goto L2f
            L18:
                r3 = r2
                r5 = r7
                r7 = r6
                r6 = r5
            L1c:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L27:
                int r3 = r3 + 1
                r4 = r0[r6]
                r5 = r3
                r3 = r6
                r6 = r4
                r4 = r5
            L2f:
                int r6 = -r6
                int r7 = r7 + r6
                int r6 = r3 + 1
                r3 = r4
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.home.SchemeHomeActivity.onExtraCallbackWithResult.$$c(byte, byte, int):java.lang.String");
        }

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x01a7  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x01a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r29, int r30, char r31, java.lang.Object[] r32) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 543
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.home.SchemeHomeActivity.onExtraCallbackWithResult.a(int, int, char, java.lang.Object[]):void");
        }

        private onExtraCallbackWithResult() {
        }

        public final String onExtraCallback() throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallbackWithResult = onExtraCallbackWithResult(zzaj.onWarmupCompleted().asBinder());
            int i4 = onNavigationEvent + 81;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return strOnExtraCallbackWithResult;
        }

        public final String onWarmupCompleted(@Nullable Boolean bool) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Uri uri = Uri.parse(onExtraCallback());
                if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                    Intrinsics.checkNotNull(uri);
                    return filterCreatePageParams.onNavigationEvent(uri, new Pair[]{new Pair("isTransferLanding", "true"), new Pair("refresh", "true")});
                }
                String string = uri.toString();
                Intrinsics.checkNotNull(string);
                int i3 = onWarmupCompleted + 41;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    return string;
                }
                obj.hashCode();
                throw null;
            }
            Uri.parse(onExtraCallback());
            Intrinsics.areEqual(bool, Boolean.TRUE);
            obj.hashCode();
            throw null;
        }

        private final String onExtraCallbackWithResult(Date date) throws Throwable {
            int i = 2 % 2;
            String str = CommonModule_closeView.onWarmupCompleted.extraCallbackWithResult().format(date);
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a((Process.getThreadPriority(0) + 20) >> 6, 41 - TextUtils.lastIndexOf("", '0', 0), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 60223), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            String string = sb.toString();
            int i2 = onWarmupCompleted + 43;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return string;
            }
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // viva.republica.toss.home.Hilt_SchemeHomeActivity
    public void onStart() {
        super.onStart();
    }

    @Override // viva.republica.toss.home.Hilt_SchemeHomeActivity
    public void onResume() {
        super.onResume();
    }

    @Override // viva.republica.toss.home.Hilt_SchemeHomeActivity
    public void onPause() {
        super.onPause();
    }

    @Override // viva.republica.toss.home.Hilt_SchemeHomeActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
