package viva.republica.toss.main.pullupweb;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import im.toss.features.tosscert.ui.R;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AdExperienceType;
import o.AdSDKNotificationListener;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.RepeatableSpec;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.getAdService;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getSpecialFeatureOptInStatus;
import o.readIntokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.pullupweb.PullUpWebActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PullUpWebActivity extends Hilt_PullUpWebActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static int[] IAuthTabCallbackDefault = null;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private static int onTransact;

    static {
        onNavigationEvent();
        Companion = new onExtraCallbackWithResult(null);
        int i = IAuthTabCallbackStub + 53;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PullUpWebActivity pullUpWebActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(pullUpWebActivity);
        int i4 = onTransact + 21;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PullUpWebActivity pullUpWebActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(pullUpWebActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(pullUpWebActivity);
        int i3 = onTransact + 29;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return -1L;
        }
        int i3 = 62 / 0;
        return -1L;
    }

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public onNavigationEvent(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean newSessionWithExtras() throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        Object[] objArr = new Object[1];
        a(new int[]{1607179140, 1327801968, -738016999, 144600256, 72248195, -360014227, 467995108, 1783112815}, ((Process.getThreadPriority(0) + 20) >> 6) + 14, objArr);
        boolean booleanExtra = intent.getBooleanExtra(((String) objArr[0]).intern(), false);
        int i4 = onTransact + 35;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return booleanExtra;
    }

    private static final Unit onNavigationEvent(PullUpWebActivity pullUpWebActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        pullUpWebActivity.finish();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(PullUpWebActivity pullUpWebActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        pullUpWebActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 67;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.main.pullupweb.Hilt_PullUpWebActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        setRequestedOrientation(1);
        RepeatableSpec.onExtraCallbackWithResult(getWindow(), false);
        Window window = getWindow();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        window.setStatusBarColor(((Integer) getDEFAULT_CONNECTION_SPECSokhttp.onExtraCallbackWithResult(1656360527, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{new getDEFAULT_CONNECTION_SPECSokhttp(new onNavigationEvent(configuration))}, R.drawable.IAuthTabCallback(), -1656360525)).intValue());
        if (Build.VERSION.SDK_INT >= 29) {
            int i2 = asBinder + 13;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            getWindow().setStatusBarContrastEnforced(false);
            int i4 = asBinder + 75;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        if (bundle != null) {
            Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag("pull_up_web_host");
            AdExperienceType adExperienceType = fragmentFindFragmentByTag instanceof AdExperienceType ? (AdExperienceType) fragmentFindFragmentByTag : null;
            if (adExperienceType != null) {
                adExperienceType.onWarmupCompleted((Function0<Unit>) new PullUpWebActivity$.ExternalSyntheticLambda1(this));
                return;
            }
            return;
        }
        AdExperienceType adExperienceType2 = new AdExperienceType();
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        adExperienceType2.setArguments(extras);
        adExperienceType2.onWarmupCompleted((Function0<Unit>) new PullUpWebActivity$.ExternalSyntheticLambda0(this));
        getSupportFragmentManager().onExtraCallbackWithResult().IAuthTabCallback(android.R.id.content, adExperienceType2, "pull_up_web_host").onExtraCallbackWithResult();
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, @NotNull Bundle bundle, @NotNull AdSDKNotificationListener adSDKNotificationListener) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(bundle, "");
            Intrinsics.checkNotNullParameter(adSDKNotificationListener, "");
            Intent intent = new Intent(context, (Class<?>) PullUpWebActivity.class);
            intent.putExtras(bundle);
            intent.putExtra("_pullUpTarget", adSDKNotificationListener.name());
            return intent;
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallbackDefault;
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
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Color.alpha(0) + 72, 8848 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    int i7 = $10 + 7;
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
        int[] iArr5 = IAuthTabCallbackDefault;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                int i10 = $11 + 75;
                $10 = i10 % 128;
                if (i10 % i2 != 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i5] = Integer.valueOf(iArr5[i9]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), 72 - TextUtils.getOffsetBefore("", i5), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i9 >>= 1;
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i9])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 72, 8848 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i9++;
                }
                i2 = 2;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        int i11 = i5;
        System.arraycopy(iArr5, i11, iArr4, i11, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i11;
        int i12 = $11 + 121;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 22253), Color.argb(0, 0, 0, 0) + 39, 10300 - TextUtils.indexOf((CharSequence) "", '0', 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i14++;
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4033), (ViewConfiguration.getJumpTapTimeout() >> 16) + 78, View.MeasureSpec.getSize(0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // viva.republica.toss.main.pullupweb.Hilt_PullUpWebActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
        int i4 = asBinder + 111;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.main.pullupweb.Hilt_PullUpWebActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            throw null;
        }
        int i4 = asBinder + 51;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.main.pullupweb.Hilt_PullUpWebActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        int i5 = onTransact + 25;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // viva.republica.toss.main.pullupweb.Hilt_PullUpWebActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        int i5 = onTransact + 101;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    static void onNavigationEvent() {
        IAuthTabCallbackDefault = new int[]{-1641119708, -1541638859, 1671007649, -1669276711, -565743397, 633837535, 413230192, -489054816, 577172271, -162765139, 996015948, 474821871, 35046448, -1532310762, -1748104345, -1380849218, -1515845294, 470372108};
    }
}
