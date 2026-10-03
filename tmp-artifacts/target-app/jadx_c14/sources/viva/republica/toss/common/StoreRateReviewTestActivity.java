package viva.republica.toss.common;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import im.toss.base.BaseActivity;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ReactNativeFeatureFlagsCxxInterop;
import o.TimelineExternalSyntheticLambda1;
import o.getTypedExportedConstants;
import o.initMiniApp;
import o.logAndOpenStore;
import o.setProxySelectorokhttp;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.common.StoreRateReviewTestActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class StoreRateReviewTestActivity extends BaseActivity {
    public static final onExtraCallbackWithResult Companion;
    private static char[] IAuthTabCallbackDefault;
    private static final String IAuthTabCallbackStub;
    private static int access100;
    private static long asInterface;
    private static final byte[] $$a = {46, -35, 45, 111};
    private static final int $$b = 113;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access000 = 0;
    private static int asBinder = 0;
    private static int onTransact = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, byte r8) {
        /*
            int r8 = r8 * 4
            int r0 = 1 - r8
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r1 = viva.republica.toss.common.StoreRateReviewTestActivity.$$a
            int r7 = r7 * 3
            int r7 = r7 + 97
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2b
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            r3 = r1[r6]
            r5 = r3
            r3 = r7
            r7 = r5
        L2b:
            int r7 = -r7
            int r7 = r7 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.StoreRateReviewTestActivity.$$c(int, byte, byte):java.lang.String");
    }

    static {
        access100 = 1;
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(View.getDefaultSize(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 64, (char) ((-16769340) - Color.rgb(0, 0, 0)), objArr);
        IAuthTabCallbackStub = ((String) objArr[0]).intern();
        Companion = new onExtraCallbackWithResult(null);
        int i = access000 + 119;
        access100 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(gettypedexportedconstants, view);
        int i4 = asBinder + 63;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void IAuthTabCallback(StoreRateReviewTestActivity storeRateReviewTestActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(storeRateReviewTestActivity, dialogInterface);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(StoreRateReviewTestActivity storeRateReviewTestActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(storeRateReviewTestActivity, view);
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        int i5 = onTransact + 33;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        int i3 = i2 % 128;
        asBinder = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 47;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return -1L;
        }
        throw null;
    }

    public static final class onWarmupCompleted implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        public static final onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted();

        public final void IAuthTabCallback(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        }

        public /* synthetic */ Object invoke(Object obj) {
            IAuthTabCallback((initMiniApp.onWarmupCompleted) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onNavigationEvent(StoreRateReviewTestActivity storeRateReviewTestActivity, View view) throws Throwable {
        ReactNativeFeatureFlagsCxxInterop reactNativeFeatureFlagsCxxInterop;
        Object obj;
        int i = 2 % 2;
        int i2 = asBinder + 31;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            reactNativeFeatureFlagsCxxInterop = ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted;
            Object[] objArr = new Object[1];
            a(KeyEvent.getDeadChar(0, 1), 2 << ExpandableListView.getPackedPositionGroup(0L), (char) ((ViewConfiguration.getKeyRepeatTimeout() << 116) + 16943), objArr);
            obj = objArr[0];
        } else {
            reactNativeFeatureFlagsCxxInterop = ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted;
            Object[] objArr2 = new Object[1];
            a(KeyEvent.getDeadChar(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 64, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 7876), objArr2);
            obj = objArr2[0];
        }
        reactNativeFeatureFlagsCxxInterop.onNavigationEvent(storeRateReviewTestActivity, ((String) obj).intern());
        int i3 = onTransact + 73;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        gettypedexportedconstants.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 27;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onExtraCallback(StoreRateReviewTestActivity storeRateReviewTestActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onTransact + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        storeRateReviewTestActivity.finish();
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        onWarmupCompleted onwarmupcompleted = onWarmupCompleted.onExtraCallbackWithResult;
        logAndOpenStore.IAuthTabCallback(this, (Long) null);
        getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(this, 0, false, false, -1L, onwarmupcompleted, 14, (DefaultConstructorMarker) null);
        Context context = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setTitle(getString(R.string.app_store_rate_test_title));
        bottomSheetHeader.setDescription(getString(R.string.app_store_rate_test_description));
        bottomSheetHeader.setShowCloseIcon(false);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context3, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1A);
        tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.ROW1A);
        tdsListRowV1View.setRightArrow(true);
        tdsListRowV1View.setCenterText1(getString(R.string.app_store_rate_test_guide));
        tdsListRowV1View.setOnClickListener(new StoreRateReviewTestActivity$.ExternalSyntheticLambda0(this));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View);
        Context context4 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context4);
        String string = getString(R.string.app_confirm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new StoreRateReviewTestActivity$.ExternalSyntheticLambda1(gettypedexportedconstants), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.setOnDismissListener(new StoreRateReviewTestActivity$.ExternalSyntheticLambda2(this));
        gettypedexportedconstants.show();
        int i2 = asBinder + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        Object obj;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            obj = null;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallbackDefault[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getScrollBarSize() >> 8)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 17, (ViewConfiguration.getTapTimeout() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(asInterface), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - ((Process.getThreadPriority(0) + 20) >> 6)), (ViewConfiguration.getPressedStateDuration() >> 16) + 31, 20220 - (ViewConfiguration.getTapTimeout() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 49123), (Process.myTid() >> 22) + 44, (Process.myTid() >> 22) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
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
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Color.argb(0, 0, 0, 0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43, 1494 - View.MeasureSpec.makeMeasureSpec(0, 0), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i5 = $10 + 59;
                $11 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArr);
        int i7 = $11 + 49;
        $10 = i7 % 128;
        if (i7 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = onTransact + 91;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onResume();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = asBinder + 49;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        int i5 = asBinder + 35;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
    }

    static void IAuthTabCallback() {
        IAuthTabCallbackDefault = new char[]{62328, 49158, 38304, 26950, 16107, 62400, 51059, 38033, 26724, 15623, 62130, 50755, 39908, 26757, 15420, 61899, 50498, 39612, 28565, 9016, 61660, 50280, 39187, 28343, 8772, 63404, 50311, 38953, 28101, 8485, 62987, 52155, 40761, 27862, 8305, 62809, 51880, 40534, 21501, 8327, 62499, 51661, 40310, 20995, 10215, 64323, 51426, 40387, 20753, 9890, 64068, 53179, 40074, 20543, 9674, 63863, 52741, 33717, 22299, 9454, 63876, 52599, 33479, 22113};
        asInterface = -2752575740451823946L;
    }
}
