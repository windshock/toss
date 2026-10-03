package o;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import im.toss.core.R;
import im.toss.splittarget.spec.fsm.AppState;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.splash.SplashSchemeActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getCRLNumber extends BroadcastReceiver {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static int[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 0;
    public static final int onNavigationEvent;
    private static int onWarmupCompleted = 1;

    static {
        onWarmupCompleted();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onNavigationEvent(defaultConstructorMarker);
        onNavigationEvent = 8;
        int i = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(intent, "");
            int i3 = 23 / 0;
            if (!Intrinsics.areEqual("action.SCHEDULED_NOTIFICATION", intent.getAction())) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(intent, "");
            if (!Intrinsics.areEqual("action.SCHEDULED_NOTIFICATION", intent.getAction())) {
                return;
            }
        }
        int i4 = asInterface + 73;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(context, intent);
    }

    private final void onWarmupCompleted(Context context, Intent intent) throws Throwable {
        String str;
        int i = 2 % 2;
        EncodedDataImplExternalSyntheticLambda0 encodedDataImplExternalSyntheticLambda0OnNavigationEvent = EncodedDataImplExternalSyntheticLambda0.onNavigationEvent(context);
        Intrinsics.checkNotNullExpressionValue(encodedDataImplExternalSyntheticLambda0OnNavigationEvent, "");
        NotificationCompat.access100 access100Var = new NotificationCompat.access100(context, EventServiceImplExternalSyntheticLambda0.GENERAL.getId());
        Object[] objArr = new Object[1];
        a(new int[]{663769610, 408890709}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3, objArr);
        Uri uri = (Uri) intent.getParcelableExtra(((String) objArr[0]).intern());
        if (uri != null) {
            Object[] objArr2 = new Object[1];
            a(new int[]{92369419, 423071063, -1073521322, -205199828}, 5 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            String stringExtra = intent.getStringExtra(((String) objArr2[0]).intern());
            if (stringExtra == null) {
                int i2 = IAuthTabCallback + 63;
                asInterface = i2 % 128;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                str = "";
            } else {
                str = stringExtra;
            }
            Object[] objArr3 = new Object[1];
            a(new int[]{-780339369, -2027908614, 2074203852, -1446658123}, TextUtils.getOffsetAfter("", 0) + 7, objArr3);
            String stringExtra2 = intent.getStringExtra(((String) objArr3[0]).intern());
            String str2 = stringExtra2 == null ? "" : stringExtra2;
            boolean booleanExtra = intent.getBooleanExtra("mute", false);
            int intExtra = intent.getIntExtra("requestCode", 10002);
            if (intExtra == 10003) {
                int i3 = asInterface + 39;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 72 / 0;
                    if (setAdUnitIds.Companion.onNavigationEvent().IAuthTabCallback()) {
                        return;
                    }
                } else if (setAdUnitIds.Companion.onNavigationEvent().IAuthTabCallback()) {
                    return;
                }
                if (AppState.Companion.onExtraCallbackWithResult().IAuthTabCallback()) {
                    return;
                } else {
                    ReactJsExceptionHandlerProcessedErrorImpl.onNavigationEvent.onWarmupCompleted(context, 1, false);
                }
            }
            String str3 = str2;
            Intent intentOnExtraCallbackWithResult = SplashSchemeActivity.onNavigationEvent.onExtraCallbackWithResult(SplashSchemeActivity.Companion, context, uri, true, (getJSQueueThread) null, 8, (Object) null);
            Object[] objArr4 = new Object[1];
            a(new int[]{-1683495617, 38580367}, 3 - ((Process.getThreadPriority(0) + 20) >> 6), objArr4);
            Intent intentPutExtra = intentOnExtraCallbackWithResult.putExtra(((String) objArr4[0]).intern(), uri.toString()).putExtra("msg", str + "\n" + str3);
            Object[] objArr5 = new Object[1];
            a(new int[]{-1947570986, 537698741, 697770371, -769810216}, 6 - TextUtils.indexOf("", "", 0, 0), objArr5);
            Intent intentPutExtra2 = intentPutExtra.putExtra(((String) objArr5[0]).intern(), "action.SCHEDULED_NOTIFICATION");
            Intrinsics.checkNotNullExpressionValue(intentPutExtra2, "");
            access100Var.asInterface(R.drawable.icon_toss_logo_mono).onExtraCallbackWithResult(ContextCompat.getColor(context, viva.republica.toss.R.color.app_icon_color)).onWarmupCompleted(str).IAuthTabCallback(str3).onExtraCallbackWithResult(new NotificationCompat.IAuthTabCallbackDefault().onNavigationEvent(str3)).onExtraCallback(true).IAuthTabCallbackDefault(2).onExtraCallback(PendingIntent.getActivity(context, 0, intentPutExtra2, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728));
            if (!booleanExtra) {
                int i5 = IAuthTabCallback + 51;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                access100Var.onNavigationEvent(RingtoneManager.getDefaultUri(2)).IAuthTabCallback(NativeCrashReporter.DEFAULT.getPattern());
                int i7 = IAuthTabCallback + 47;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
            }
            encodedDataImplExternalSyntheticLambda0OnNavigationEvent.onExtraCallback(String.valueOf(intExtra), 10001, access100Var.onWarmupCompleted());
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallback;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 71 - MotionEvent.axisFromString(""), TextUtils.indexOf((CharSequence) "", '0', 0) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    int i7 = $10 + 103;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallback;
        float f = 0.0f;
        if (iArr5 != null) {
            int i9 = $11 + 71;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $11 + 15;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                Object[] objArr3 = new Object[1];
                objArr3[i5] = Integer.valueOf(iArr5[i11]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(i5, f, f) > f ? 1 : (TypedValue.complexToFraction(i5, f, f) == f ? 0 : -1)), 72 - KeyEvent.keyCodeFromString(""), 8848 - View.MeasureSpec.makeMeasureSpec(i5, i5), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i11++;
                f = 0.0f;
                i5 = 0;
            }
            i2 = i5;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        int i14 = $10 + 121;
        $11 = i14 % 128;
        int i15 = i14 % 2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            for (int i16 = 0; i16 < 16; i16++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i16];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 22252), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 39, 10301 - ExpandableListView.getPackedPositionGroup(0L), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4033), 77 - ImageFormat.getBitsPerPixel(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7397, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onWarmupCompleted() {
        onExtraCallback = new int[]{-516817819, -754142462, 1236438878, -220626705, -1646056132, 2079839836, -1195277212, -900622602, -1774533340, 1462094031, -2021869817, -1652777695, -1063980827, -232507049, 1498966213, -1710393181, -1475745600, 742419133};
    }
}
