package im.toss.base;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.OnBackPressedCallback;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import im.toss.base.BaseLauncherWrapperActivity$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.RepeatableSpec;
import o.SetDetectableSize;
import o.TimelineExternalSyntheticLambda1;
import o.TimeoutCompanionNONE1;
import o.clearFaultAdjacentMetadata;
import o.getLoadingView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class BaseLauncherWrapperActivity extends BaseActivity {
    public static final onExtraCallback Companion;
    private static final AtomicInteger IAuthTabCallbackDefault;
    private static long IAuthTabCallbackStub;
    private static int access000;
    private static char[] asBinder;
    private static final Set<String> onTransact;
    private final IAuthTabCallback asInterface = new IAuthTabCallback();
    private static final byte[] $$a = {64, -61, 76, -90};
    private static final int $$b = 205;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access100 = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, int i) {
        int i2;
        int i3 = (s * 4) + 4;
        int i4 = i * 3;
        byte[] bArr = $$a;
        int i5 = 97 - (b * 4);
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i3;
            int i8 = i6;
            int i9 = 0;
            int i10 = i3 + i8;
            int i11 = i7 + 1;
            i2 = i9;
            i5 = i10;
            i3 = i11;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            int i12 = i5;
            i7 = i3;
            i3 = bArr[i3];
            i9 = i2 + 1;
            i8 = i12;
            int i102 = i3 + i8;
            int i112 = i7 + 1;
            i2 = i9;
            i5 = i102;
            i3 = i112;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        }
    }

    public static /* synthetic */ WindowInsetsCompat onNavigationEvent(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            windowInsetsCompat2 = (WindowInsetsCompat) onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{view, windowInsetsCompat}, -410774637, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 410774637, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted());
            int i3 = 4 / 0;
        } else {
            windowInsetsCompat2 = (WindowInsetsCompat) onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{view, windowInsetsCompat}, -410774637, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 410774637, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted());
        }
        int i4 = IAuthTabCallbackStubProxy + 125;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return windowInsetsCompat2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = i5 | i2 | i;
        int i8 = (~((~i) | i2)) | i5;
        int i9 = ~((~i5) | i2);
        int i10 = i5 + i2 + i3 + (1132004924 * i4) + ((-2047965933) * i6);
        int i11 = i10 * i10;
        int i12 = ((1650805025 * i5) - 289800192) + ((-1513965855) * i2) + ((-565098208) * i7) + (i8 * 565098208) + (565098208 * i9) + ((-2079064064) * i3) + (1823473664 * i4) + (830210048 * i6) + ((-1143341056) * i11);
        int i13 = ((i5 * (-767560105)) - 1188649921) + (i2 * (-767559017)) + (i7 * (-544)) + (i8 * 544) + (i9 * 544) + (i3 * (-767559561)) + (i4 * 1544553956) + (i6 * (-1468578859)) + (i11 * (-2108293120));
        if (i12 + (i13 * i13 * (-2075787264)) != 1) {
            return onExtraCallback(objArr);
        }
        BaseLauncherWrapperActivity baseLauncherWrapperActivity = (BaseLauncherWrapperActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i14 = 2 % 2;
        int i15 = IAuthTabCallback_Parcel + 3;
        IAuthTabCallbackStubProxy = i15 % 128;
        int i16 = i15 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(baseLauncherWrapperActivity, setDetectableSize);
        int i17 = IAuthTabCallback_Parcel + 3;
        IAuthTabCallbackStubProxy = i17 % 128;
        int i18 = i17 % 2;
        return unitOnWarmupCompleted;
    }

    public abstract String IAuthTabCallback();

    public static final /* synthetic */ void IAuthTabCallback(BaseLauncherWrapperActivity baseLauncherWrapperActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        baseLauncherWrapperActivity.ICustomTabsServiceDefault();
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
    }

    public static final /* synthetic */ Set onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Set<String> set = onTransact;
        int i4 = i3 + 9;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return set;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean onExtraCallback(BaseLauncherWrapperActivity baseLauncherWrapperActivity, FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return baseLauncherWrapperActivity.onNavigationEvent(flowMeasureLazyPolicyExternalSyntheticLambda3);
        }
        baseLauncherWrapperActivity.onNavigationEvent(flowMeasureLazyPolicyExternalSyntheticLambda3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(BaseLauncherWrapperActivity baseLauncherWrapperActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        baseLauncherWrapperActivity.updateVisuals();
        int i4 = IAuthTabCallback_Parcel + 53;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class IAuthTabCallback extends OnBackPressedCallback {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        IAuthTabCallback() {
            super(true);
        }

        public void handleOnBackPressed() throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            BaseLauncherWrapperActivity baseLauncherWrapperActivity = BaseLauncherWrapperActivity.this;
            FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager = baseLauncherWrapperActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            if (BaseLauncherWrapperActivity.onExtraCallback(baseLauncherWrapperActivity, supportFragmentManager)) {
                return;
            }
            BaseLauncherWrapperActivity.onNavigationEvent(BaseLauncherWrapperActivity.this);
            BaseLauncherWrapperActivity.IAuthTabCallback(BaseLauncherWrapperActivity.this);
            int i4 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        IAuthTabCallbackDefault.incrementAndGet();
        getOnBackPressedDispatcher().onExtraCallbackWithResult(this, this.asInterface);
        Companion.onNavigationEvent(getIntent());
        int i4 = IAuthTabCallbackStubProxy + 91;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
    }

    @Override // im.toss.base.BaseActivity
    public void onNewIntent(@NotNull Intent intent) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(intent, "");
            super.onNewIntent(intent);
            Companion.onNavigationEvent(intent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        Companion.onNavigationEvent(intent);
        int i3 = IAuthTabCallback_Parcel + 5;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault.decrementAndGet();
        super.onDestroy();
        int i4 = IAuthTabCallback_Parcel + 119;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onExtraCallbackWithResult(@NotNull View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        RepeatableSpec.onExtraCallbackWithResult(getWindow(), false);
        ViewCompat.onWarmupCompleted(view, new BaseLauncherWrapperActivity$.ExternalSyntheticLambda0());
        int i2 = IAuthTabCallbackStubProxy + 39;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 2 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        View view = (View) objArr[0];
        WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 81;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        WindowInsetsCompat windowInsetsCompatOnExtraCallback = getLoadingView.IAuthTabCallback.onExtraCallback(view, windowInsetsCompat);
        int i4 = IAuthTabCallback_Parcel + 83;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return windowInsetsCompatOnExtraCallback;
        }
        throw null;
    }

    public final void onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            updateVisuals();
            ICustomTabsServiceDefault();
            int i3 = 86 / 0;
        } else {
            updateVisuals();
            ICustomTabsServiceDefault();
        }
        int i4 = IAuthTabCallback_Parcel + 43;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(asBinder[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 59696), 17 - ((Process.getThreadPriority(0) + 20) >> 6), 10972 - TextUtils.lastIndexOf("", '0', 0, 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(IAuthTabCallbackStub), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getEdgeSlop() >> 16)), 31 - View.getDefaultSize(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20221, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 49123), 44 - Drawable.resolveOpacity(0, 0), 1495 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i5 = $10 + 105;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 5 % 2;
                }
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
        int i7 = $11 + 125;
        while (true) {
            $10 = i7 % 128;
            int i8 = i7 % 2;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49122), 44 - View.getDefaultSize(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i7 = $11 + 91;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateVisuals() throws Throwable {
        int i = 2 % 2;
        if (!isFinishing()) {
            int i2 = IAuthTabCallback_Parcel + 25;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            if (!isTaskRoot()) {
                int i4 = IAuthTabCallback_Parcel + 73;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 == 0 ? IAuthTabCallbackDefault.get() <= 1 : IAuthTabCallbackDefault.get() <= 1) {
                    ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 5201652L, false, null, null, new Function1() { // from class: im.toss.base.BaseLauncherWrapperActivity$$ExternalSyntheticLambda1
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj) {
                            Unit unit;
                            int i5 = 2 % 2;
                            int i6 = onWarmupCompleted + 45;
                            onExtraCallbackWithResult = i6 % 128;
                            if (i6 % 2 == 0) {
                                unit = (Unit) BaseLauncherWrapperActivity.onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{this.f$0, (SetDetectableSize) obj}, 59167465, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -59167464, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted());
                                int i7 = 24 / 0;
                            } else {
                                unit = (Unit) BaseLauncherWrapperActivity.onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{this.f$0, (SetDetectableSize) obj}, 59167465, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -59167464, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted());
                            }
                            int i8 = onWarmupCompleted + 83;
                            onExtraCallbackWithResult = i8 % 128;
                            int i9 = i8 % 2;
                            return unit;
                        }
                    }, 14, null);
                }
            }
        }
        int i5 = IAuthTabCallback_Parcel + 91;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(BaseLauncherWrapperActivity baseLauncherWrapperActivity, SetDetectableSize setDetectableSize) throws Throwable {
        String queryParameter;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("service_type", baseLauncherWrapperActivity.IAuthTabCallback());
        Intent intent = baseLauncherWrapperActivity.getIntent();
        String str = null;
        if (intent != null) {
            int i2 = IAuthTabCallback_Parcel + 69;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                intent.getData();
                str.hashCode();
                throw null;
            }
            Uri data = intent.getData();
            if (data != null) {
                int i3 = IAuthTabCallbackStubProxy + 37;
                IAuthTabCallback_Parcel = i3 % 128;
                if (i3 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    a(AndroidCharacter.getMirror((char) 3) + 31, 17 >> ((byte) KeyEvent.getModifierMetaStateMask()), (char) Color.argb(0, 0, 1, 0), objArr);
                    queryParameter = data.getQueryParameter(((String) objArr[0]).intern());
                } else {
                    Object[] objArr2 = new Object[1];
                    a(AndroidCharacter.getMirror('0') - '0', 7 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) Color.argb(0, 0, 0, 0), objArr2);
                    queryParameter = data.getQueryParameter(((String) objArr2[0]).intern());
                }
                str = queryParameter;
            }
        }
        Object[] objArr3 = new Object[1];
        a(TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 8, (char) (ImageFormat.getBitsPerPixel(0) + 1), objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), str);
        return Unit.INSTANCE;
    }

    private final void ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface.setEnabled(false);
        try {
            getOnBackPressedDispatcher().onExtraCallbackWithResult();
            this.asInterface.setEnabled(true);
            int i4 = IAuthTabCallback_Parcel + 43;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            this.asInterface.setEnabled(true);
            throw th;
        }
    }

    private final boolean onNavigationEvent(FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3) {
        BaseFragment baseFragment;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            List listOnActivityLayout = flowMeasureLazyPolicyExternalSyntheticLambda3.onActivityLayout();
            Intrinsics.checkNotNullExpressionValue(listOnActivityLayout, "");
            boolean z = listOnActivityLayout instanceof Collection;
            throw null;
        }
        List listOnActivityLayout2 = flowMeasureLazyPolicyExternalSyntheticLambda3.onActivityLayout();
        Intrinsics.checkNotNullExpressionValue(listOnActivityLayout2, "");
        List<BaseFragment> list = listOnActivityLayout2;
        if ((list instanceof Collection) && list.isEmpty()) {
            int i3 = IAuthTabCallback_Parcel + 55;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        for (BaseFragment baseFragment2 : list) {
            int i5 = IAuthTabCallbackStubProxy + 5;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            if (baseFragment2 instanceof BaseFragment) {
                int i7 = IAuthTabCallback_Parcel + 69;
                IAuthTabCallbackStubProxy = i7 % 128;
                int i8 = i7 % 2;
                baseFragment = baseFragment2;
            } else {
                baseFragment = null;
            }
            if (baseFragment == null || !baseFragment.onBackPressed()) {
                FlowMeasureLazyPolicyExternalSyntheticLambda3 childFragmentManager = baseFragment2.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                if (!onNavigationEvent(childFragmentManager)) {
                }
            }
            return true;
        }
        int i9 = IAuthTabCallback_Parcel + 105;
        IAuthTabCallbackStubProxy = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onNavigationEvent(@Nullable Intent intent) {
            int i = 2 % 2;
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    int i2 = onWarmupCompleted + 91;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        data.isHierarchical();
                        throw null;
                    }
                    if (data.isHierarchical()) {
                        Set setOnExtraCallback = BaseLauncherWrapperActivity.onExtraCallback();
                        if (setOnExtraCallback instanceof Collection) {
                            int i3 = onExtraCallback + 69;
                            onWarmupCompleted = i3 % 128;
                            int i4 = i3 % 2;
                            if (!setOnExtraCallback.isEmpty()) {
                                Iterator it = setOnExtraCallback.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    if (data.getQueryParameter((String) it.next()) != null) {
                                        Uri.Builder builderClearQuery = data.buildUpon().clearQuery();
                                        Set<String> queryParameterNames = data.getQueryParameterNames();
                                        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "");
                                        ArrayList<String> arrayList = new ArrayList();
                                        for (Object obj : queryParameterNames) {
                                            if (!BaseLauncherWrapperActivity.onExtraCallback().contains((String) obj)) {
                                                int i5 = onExtraCallback + 79;
                                                onWarmupCompleted = i5 % 128;
                                                if (i5 % 2 != 0) {
                                                    arrayList.add(obj);
                                                    int i6 = 8 / 0;
                                                } else {
                                                    arrayList.add(obj);
                                                }
                                            }
                                        }
                                        int i7 = onWarmupCompleted + 113;
                                        onExtraCallback = i7 % 128;
                                        int i8 = i7 % 2;
                                        for (String str : arrayList) {
                                            List<String> queryParameters = data.getQueryParameters(str);
                                            Intrinsics.checkNotNullExpressionValue(queryParameters, "");
                                            Iterator<T> it2 = queryParameters.iterator();
                                            while (it2.hasNext()) {
                                                builderClearQuery.appendQueryParameter(str, (String) it2.next());
                                                int i9 = onExtraCallback + 125;
                                                onWarmupCompleted = i9 % 128;
                                                int i10 = i9 % 2;
                                            }
                                        }
                                        intent.setData(builderClearQuery.build());
                                    }
                                }
                            }
                        }
                    }
                }
                Iterator it3 = BaseLauncherWrapperActivity.onExtraCallback().iterator();
                while (it3.hasNext()) {
                    intent.removeExtra((String) it3.next());
                }
            }
        }
    }

    static {
        access000 = 0;
        setEngagementSignalsCallback();
        Companion = new onExtraCallback(null);
        IAuthTabCallbackDefault = new AtomicInteger(0);
        onTransact = clearFaultAdjacentMetadata.onExtraCallback(new String[]{"from_home_launcher", "launcher_service_type"});
        int i = access100 + 107;
        access000 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(BaseLauncherWrapperActivity baseLauncherWrapperActivity, SetDetectableSize setDetectableSize) {
        return (Unit) onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{baseLauncherWrapperActivity, setDetectableSize}, 59167465, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -59167464, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted());
    }

    private static final WindowInsetsCompat onExtraCallbackWithResult(View view, WindowInsetsCompat windowInsetsCompat) {
        return (WindowInsetsCompat) onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{view, windowInsetsCompat}, -410774637, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 410774637, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted());
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = IAuthTabCallback_Parcel + 107;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 59;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 69;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 125;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void setEngagementSignalsCallback() {
        asBinder = new char[]{60838, 24167, 35358, 63027, 8958, 28296, 55989, 1916};
        IAuthTabCallbackStub = 7381914832424361474L;
    }
}
