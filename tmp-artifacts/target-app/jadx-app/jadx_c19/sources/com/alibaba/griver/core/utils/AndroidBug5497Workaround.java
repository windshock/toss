package com.alibaba.griver.core.utils;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.config.GriverInnerConfig;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.core.ui.activity.GriverBaseActivity;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class AndroidBug5497Workaround {
    private static short[] onExtraCallbackWithResult;
    public boolean b;
    public View c;
    public int d;
    public FrameLayout.LayoutParams e;
    public int f;
    public NavigationBarUtil g;

    /* renamed from: i, reason: collision with root package name */
    public RelativeLayout f1i;
    private static final byte[] $$a = {4, -66, -36, 8};
    private static final int $$b = 7;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asBinder = 1;
    private static int onNavigationEvent = -745359694;
    private static int IAuthTabCallback = -1538795446;
    private static int onWarmupCompleted = 60150980;
    private static byte[] onExtraCallback = {-27, 27, -11, 8};
    public boolean a = false;
    public final Rect h = new Rect();

    private static String $$c(short s, int i2, int i3) {
        byte[] bArr = $$a;
        int i4 = 3 - (i3 * 4);
        int i5 = 115 - (i2 * 4);
        int i6 = s * 4;
        byte[] bArr2 = new byte[i6 + 1];
        int i7 = -1;
        if (bArr == null) {
            i5 += i4;
            i4 = i4;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            int i9 = i4 + 1;
            bArr2[i8] = (byte) i5;
            if (i8 == i6) {
                return new String(bArr2, 0);
            }
            i5 += bArr[i9];
            i4 = i9;
            i7 = i8;
        }
    }

    public AndroidBug5497Workaround(final Activity activity, final boolean z) {
        this.b = false;
        this.g = new NavigationBarUtil(activity);
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.content);
        final Handler handler = new Handler(activity.getMainLooper());
        this.c = frameLayout.getChildAt(0);
        try {
            this.f = H5StatusBarUtils.getStatusBarHeight(activity);
            if (activity instanceof GriverBaseActivity) {
                this.f1i = (RelativeLayout) frameLayout.findViewById(com.alibaba.griver.base.R.id.tab_container);
                int i2 = asBinder + 97;
                onTransact = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 5 % 4;
                } else {
                    int i4 = 2 % 2;
                }
            }
        } catch (Throwable th) {
            GriverLogger.e("H5AndroidBug5497Workaround", "construct AndroidBug5497Workaround failed", th);
        }
        this.c.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.alibaba.griver.core.utils.AndroidBug5497Workaround.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    handler.postDelayed(new Runnable() { // from class: com.alibaba.griver.core.utils.AndroidBug5497Workaround.1.1
                        @Override // java.lang.Runnable
                        public void run() throws Throwable {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            AndroidBug5497Workaround.access$000(AndroidBug5497Workaround.this, z, activity);
                        }
                    }, 16L);
                } catch (Throwable th2) {
                    GriverLogger.e("H5AndroidBug5497Workaround", "get view tree observer failed", th2);
                }
            }
        });
        this.e = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        this.b = GriverInnerConfig.getConfigBoolean("android_enable_send_keyboard_event", false);
        int i5 = onTransact + 81;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void access$000(AndroidBug5497Workaround androidBug5497Workaround, boolean z, Activity activity) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 91;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        androidBug5497Workaround.a(z, activity);
        int i5 = asBinder + 41;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void assistActivity(Activity activity, boolean z) {
        int i2 = 2 % 2;
        try {
            new AndroidBug5497Workaround(activity, z);
            int i3 = onTransact + 93;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            GriverLogger.e("H5AndroidBug5497Workaround", "assistActivity failed", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z, Activity activity) throws Throwable {
        int height;
        int height2;
        FrameLayout.LayoutParams layoutParams;
        int height3;
        int i2 = 2 % 2;
        int iA = a();
        if (iA == this.d || (height2 = (height = this.c.getRootView().getHeight()) - iA) < 0) {
            return;
        }
        GriverLogger.d("H5AndroidBug5497Workaround", "heightDifference " + height2 + " usableHeightSansKeyboard " + height + " statusBarHeight:" + this.f + " hasNavigationBar " + this.g.hasNavigationBar() + " NavigationBarHeight " + this.g.getNavigationBarHeight());
        if (height2 > height / 4) {
            int i3 = asBinder + 51;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                H5StatusBarUtils.isSupport();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (H5StatusBarUtils.isSupport() && H5StatusBarUtils.isConfigSupport() && (!z)) {
                this.e.height = (height - height2) + this.f;
            } else {
                this.e.height = height - height2;
                if (H5StatusBarUtils.isSupport()) {
                    this.e.topMargin = this.f;
                }
            }
            RelativeLayout relativeLayout = this.f1i;
            if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
                int i4 = onTransact + 101;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    layoutParams = this.e;
                    height3 = layoutParams.height >>> this.f1i.getHeight();
                } else {
                    layoutParams = this.e;
                    height3 = layoutParams.height + this.f1i.getHeight();
                }
                layoutParams.height = height3;
            }
        } else if (H5StatusBarUtils.isSupport()) {
            int i5 = onTransact + 115;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            if (H5StatusBarUtils.isConfigSupport() && (!z)) {
                FrameLayout.LayoutParams layoutParams2 = this.e;
                layoutParams2.height = height;
                layoutParams2.height = height - this.g.getBottomInsect();
                int i7 = onTransact + 41;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
            } else {
                this.e.height = height - this.f;
                if (H5StatusBarUtils.isSupport()) {
                    this.e.topMargin = this.f;
                }
            }
        }
        if (this.g.hasNavigationBar() && Build.VERSION.SDK_INT >= 35) {
            int i9 = onTransact + 1;
            asBinder = i9 % 128;
            if (i9 % 2 != 0 ? activity.getResources().getConfiguration().orientation != 2 : activity.getResources().getConfiguration().orientation != 3) {
                FrameLayout.LayoutParams layoutParams3 = this.e;
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            } else {
                this.e.leftMargin = this.g.getLeftInsect();
                this.e.rightMargin = this.g.getRightInsect();
            }
        }
        if (!(!this.b)) {
            a(activity, (height - this.e.height) - this.g.getBottomInsect());
        }
        this.c.setLayoutParams(this.e);
        this.c.requestLayout();
        this.d = iA;
    }

    public final int a() {
        int i2 = 2 % 2;
        int i3 = asBinder + 21;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        this.c.getWindowVisibleDisplayFrame(this.h);
        Rect rect = this.h;
        int i5 = rect.bottom - rect.top;
        int i6 = asBinder + 119;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 26 / 0;
        }
        return i5;
    }

    public final void a(Activity activity, int i2) throws Throwable {
        App currentApp;
        Page activePage;
        int i3 = 2 % 2;
        int i4 = onTransact + 79;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        if (!(activity instanceof GriverBaseActivity) || (currentApp = ((GriverBaseActivity) activity).getCurrentApp()) == null) {
            return;
        }
        int i6 = onTransact + 43;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            activePage = currentApp.getActivePage();
            int i7 = 85 / 0;
            if (activePage == null) {
                return;
            }
        } else {
            activePage = currentApp.getActivePage();
            if (activePage == null) {
                return;
            }
        }
        GriverLogger.d("H5AndroidBug5497Workaround", "keyboardHeight " + i2);
        if (i2 > 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("height", Integer.valueOf(i2));
            JSONObject jSONObject2 = new JSONObject();
            Object[] objArr = new Object[1];
            j((short) (ViewConfiguration.getTapTimeout() >> 16), (byte) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (-2010476218) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1479406488 - Color.argb(0, 0, 0, 0), (-62) - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
            jSONObject2.put(((String) objArr[0]).intern(), jSONObject);
            EngineUtils.sendToRender(activePage.getRender(), "keyboardDidShow", jSONObject2, (SendToRenderCallback) null);
            this.a = true;
            return;
        }
        if (this.a) {
            EngineUtils.sendToRender(activePage.getRender(), "keyboardDidHide", (JSONObject) null, (SendToRenderCallback) null);
            this.a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01f3 A[PHI: r0
      0x01f3: PHI (r0v34 int) = (r0v8 int), (r0v37 int) binds: [B:49:0x01f1, B:46:0x01df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f5 A[PHI: r0
      0x01f5: PHI (r0v9 int) = (r0v8 int), (r0v37 int) binds: [B:49:0x01f1, B:46:0x01df] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void j(short s, byte b, int i2, int i3, int i4, Object[] objArr) throws Throwable {
        int i5;
        int i6;
        boolean z;
        int i7 = 2;
        int i8 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43425 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (!(!z2)) {
                byte[] bArr = onExtraCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = $11 + 113;
                        $10 = i10 % 128;
                        if (i10 % i7 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 12843), View.MeasureSpec.getSize(0) + 55, 2167 - Color.blue(0), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i9])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 12844), (ViewConfiguration.getJumpTapTimeout() >> 16) + 55, 2167 - ExpandableListView.getPackedPositionType(0L), -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                            i9++;
                        }
                        i7 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallback;
                    Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16820640), 42 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 22439 - Color.green(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onExtraCallbackWithResult[i2 + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i11 = $10 + 125;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    i5 = ((i2 + iIntValue) >> 3) >>> ((int) (onNavigationEvent - 4629411779493505016L));
                    i6 = z2 ? 1 : 0;
                } else {
                    i5 = ((i2 + iIntValue) - 2) + ((int) (onNavigationEvent ^ (-4629411779493505016L)));
                    if (!z2) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i5 + i6;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), Color.green(0) + 86, 9567 - Gravity.getAbsoluteGravity(0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i13 = $10 + 21;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        int i15 = $11 + 29;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                    } else {
                        short[] sArr = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
