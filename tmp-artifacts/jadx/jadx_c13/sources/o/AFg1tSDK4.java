package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tosssecurities.uikit.extension.FloatingTabBarAnimator$;
import im.toss.uikit.widget.TabBar;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFg1tSDK4;
import o.Cacheurls1;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFg1tSDK4 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final IAuthTabCallback Companion;
    private static char[] IAuthTabCallbackStub = null;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int getInterfaceDescriptor;
    public static final int onExtraCallback;
    private static char onTransact;
    private boolean IAuthTabCallback;
    private final onExtraCallback IAuthTabCallbackDefault;
    private Rally asBinder;
    private Runnable asInterface;
    private boolean onExtraCallbackWithResult;
    private final onWarmupCompleted onNavigationEvent;
    private final TabBar onWarmupCompleted;

    public interface onExtraCallback {
        default void onExtraCallback() {
            int i = 2 % 2;
        }

        void onExtraCallbackWithResult();

        void onWarmupCompleted();
    }

    public interface onWarmupCompleted {
        void IAuthTabCallback(@NotNull String str, @NotNull Map<String, ? extends Object> map);

        default void onNavigationEvent(@NotNull String str, @NotNull Map<String, ? extends Object> map) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
        }
    }

    static {
        onWarmupCompleted();
        Companion = new IAuthTabCallback(null);
        onExtraCallback = 8;
        int i = IAuthTabCallback_Parcel + 41;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = ~i5;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i2 | i5);
        int i12 = (~(i5 | i2)) | (~(i7 | i9)) | i8;
        int i13 = i2 + i4 + i6 + ((-1422066268) * i) + ((-2108786386) * i3);
        int i14 = i13 * i13;
        int i15 = (i2 * 793895740) + 1353643607 + (i4 * 793896262) + (i10 * (-261)) + (i11 * (-261)) + (i12 * 261) + (793896001 * i6) + (692483748 * i) + ((-1016611666) * i3) + (i14 * 166461440);
        int i16 = ((-1583913924) * i2) + 967573504 + (322476998 * i4) + (i10 * 1194288187) + (1194288187 * i11) + ((-1194288187) * i12) + (1516765184 * i6) + ((-1298137088) * i) + (1722810368 * i3) + (518782976 * i14) + (i15 * i15 * 1997799424);
        boolean z = false;
        if (i16 == 1) {
            AFg1tSDK4 aFg1tSDK4 = (AFg1tSDK4) objArr[0];
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
            int i17 = 2 % 2;
            boolean z2 = aFg1tSDK4.IAuthTabCallback;
            aFg1tSDK4.IAuthTabCallback = zBooleanValue;
            Rally rally = aFg1tSDK4.asBinder;
            if (rally != null) {
                int i18 = access000 + 79;
                getInterfaceDescriptor = i18 % 128;
                int i19 = i18 % 2;
                rally.ICustomTabsServiceStub();
            }
            Object[] objArr2 = new Object[1];
            a(new char[]{'\f', 3, '\f', 4, 2, 3, 13925}, (byte) (102 - View.resolveSize(0, 0)), 7 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), Boolean.valueOf(zBooleanValue));
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("wasVisible", Boolean.valueOf(z2));
            Object[] objArr3 = new Object[1];
            a(new char[]{15, 14, 1, 0, 15, 6, '\n', 14}, (byte) (5 - View.getDefaultSize(0, 0)), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0') + 9, objArr3);
            Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), Boolean.valueOf(zBooleanValue2));
            Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("barVisibility", Integer.valueOf(aFg1tSDK4.onWarmupCompleted.getVisibility()));
            Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("translationY", Float.valueOf(aFg1tSDK4.onWarmupCompleted.getTranslationY()));
            Object[] objArr4 = {aFg1tSDK4.onWarmupCompleted};
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            aFg1tSDK4.IAuthTabCallback("apply", access8000.IAuthTabCallbackStub(pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, getWrite.IAuthTabCallback("floating", Boolean.valueOf(((Boolean) TabBar.onWarmupCompleted(-579701279, nSetPosition.onExtraCallbackWithResult(), 579701301, objArr4, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult)).booleanValue()))));
            int i20 = zBooleanValue2 ? 200 : 1;
            if (!zBooleanValue) {
                aFg1tSDK4.onExtraCallbackWithResult(i20);
                return null;
            }
            int i21 = access000 + Imgproc.COLOR_YUV2RGBA_YVYU;
            getInterfaceDescriptor = i21 % 128;
            int i22 = i21 % 2;
            aFg1tSDK4.onWarmupCompleted(i20);
            return null;
        }
        if (i16 == 2) {
            return IAuthTabCallback(objArr);
        }
        if (i16 == 3) {
            AFg1tSDK4 aFg1tSDK42 = (AFg1tSDK4) objArr[0];
            boolean zBooleanValue3 = ((Boolean) objArr[1]).booleanValue();
            boolean zBooleanValue4 = ((Boolean) objArr[2]).booleanValue();
            int iIntValue = ((Number) objArr[3]).intValue();
            Object obj = objArr[4];
            int i23 = 2 % 2;
            int i24 = getInterfaceDescriptor + 85;
            access000 = i24 % 128;
            if (i24 % 2 != 0 ? (iIntValue & 2) == 0 : (iIntValue & 2) == 0) {
                z = zBooleanValue4;
            }
            IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 2045702474, new Object[]{aFg1tSDK42, Boolean.valueOf(zBooleanValue3), Boolean.valueOf(z)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -2045702473, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
            int i25 = access000 + 49;
            getInterfaceDescriptor = i25 % 128;
            int i26 = i25 % 2;
            return null;
        }
        if (i16 == 4) {
            return onExtraCallbackWithResult(objArr);
        }
        AFg1tSDK4 aFg1tSDK43 = (AFg1tSDK4) objArr[0];
        boolean zBooleanValue5 = ((Boolean) objArr[1]).booleanValue();
        int i27 = 2 % 2;
        int i28 = access000 + 51;
        getInterfaceDescriptor = i28 % 128;
        if (i28 % 2 != 0) {
            aFg1tSDK43.onWarmupCompleted.setVisibility(0);
            if (zBooleanValue5) {
                aFg1tSDK43.onWarmupCompleted.setShadow(new Cacheurls1.onExtraCallback(200, 40, 639180584, -436207616), null);
                aFg1tSDK43.onWarmupCompleted.setShadow2(new Cacheurls1.onExtraCallback(20, 20, 169418536, 855638016), null);
            } else {
                TabBar tabBar = aFg1tSDK43.onWarmupCompleted;
                Cacheurls1 cacheurls1 = Cacheurls1.IAuthTabCallback.onWarmupCompleted;
                tabBar.setShadow(cacheurls1, null);
                aFg1tSDK43.onWarmupCompleted.setShadow2(cacheurls1, null);
                int i29 = getInterfaceDescriptor + 9;
                access000 = i29 % 128;
                int i30 = i29 % 2;
            }
        } else {
            aFg1tSDK43.onWarmupCompleted.setVisibility(0);
            if (zBooleanValue5) {
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000 + 49;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = getInterfaceDescriptor + 75;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AFg1tSDK4 aFg1tSDK4) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 13;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(aFg1tSDK4);
        int i4 = getInterfaceDescriptor + 31;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AFg1tSDK4 aFg1tSDK4) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(aFg1tSDK4);
        int i4 = getInterfaceDescriptor + 49;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AFg1tSDK4 aFg1tSDK4, boolean z) {
        Unit unit;
        int i = 2 % 2;
        int i2 = access000 + 5;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            unit = (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1923614371, new Object[]{aFg1tSDK4, Boolean.valueOf(z)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1923614371, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
            int i3 = 14 / 0;
        } else {
            unit = (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1923614371, new Object[]{aFg1tSDK4, Boolean.valueOf(z)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1923614371, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        }
        int i4 = getInterfaceDescriptor + 9;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(AFg1tSDK4 aFg1tSDK4, int i, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = access000 + 9;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(aFg1tSDK4, i, i2);
        if (i5 != 0) {
            int i6 = 43 / 0;
        }
    }

    public AFg1tSDK4(@NotNull TabBar tabBar, @NotNull onExtraCallback onextracallback, @Nullable onWarmupCompleted onwarmupcompleted) {
        Intrinsics.checkNotNullParameter(tabBar, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.onWarmupCompleted = tabBar;
        this.IAuthTabCallbackDefault = onextracallback;
        this.onNavigationEvent = onwarmupcompleted;
        this.IAuthTabCallback = true;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(AFg1tSDK4 aFg1tSDK4, int i, int i2, long j, int i3, Object obj) throws Throwable {
        int i4 = 2 % 2;
        int i5 = access000 + 1;
        int i6 = i5 % 128;
        getInterfaceDescriptor = i6;
        int i7 = i5 % 2;
        if ((i3 & 4) != 0) {
            int i8 = i6 + 41;
            access000 = i8 % 128;
            int i9 = i8 % 2;
            j = 0;
        }
        IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -2094686585, new Object[]{aFg1tSDK4, Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 2094686589, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        int i10 = access000 + 79;
        getInterfaceDescriptor = i10 % 128;
        int i11 = i10 % 2;
    }

    private static final void onNavigationEvent(AFg1tSDK4 aFg1tSDK4, int i, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = access000 + 1;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        if (!aFg1tSDK4.onWarmupCompleted.isAttachedToWindow()) {
            int i6 = getInterfaceDescriptor + 67;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{'\n', 5, '\f', '\n', '\t', 15}, (byte) (69 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 6 - Drawable.resolveOpacity(0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new char[]{14, '\n', 6, 15, 5, 6, '\n', 14}, (byte) (40 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0)), 8 - ExpandableListView.getPackedPositionType(0L), objArr2);
            aFg1tSDK4.onWarmupCompleted("post_show_dropped", access8200.IAuthTabCallback(getWrite.IAuthTabCallback(strIntern, ((String) objArr2[0]).intern())));
            return;
        }
        int interfaceDescriptor = aFg1tSDK4.onWarmupCompleted.getInterfaceDescriptor();
        if (interfaceDescriptor != -1) {
            int i8 = getInterfaceDescriptor + 55;
            access000 = i8 % 128;
            int i9 = i8 % 2;
            if (interfaceDescriptor != i) {
                Object[] objArr3 = new Object[1];
                a(new char[]{'\n', 5, '\f', '\n', '\t', 15}, (byte) (View.combineMeasuredStates(0, 0) + 69), ExpandableListView.getPackedPositionGroup(0L) + 6, objArr3);
                aFg1tSDK4.onWarmupCompleted("post_show_dropped", access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), "tab_changed"), getWrite.IAuthTabCallback("currentBottomTabId", Integer.valueOf(interfaceDescriptor))));
                return;
            }
        }
        Object[] objArr4 = new Object[1];
        a(new char[]{'\f', 3, '\f', 4, 2, 3, 13925}, (byte) (ExpandableListView.getPackedPositionGroup(0L) + 102), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 6, objArr4);
        aFg1tSDK4.IAuthTabCallback("post_show_run", access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), Boolean.valueOf(aFg1tSDK4.IAuthTabCallback)), getWrite.IAuthTabCallback("translationY", Float.valueOf(aFg1tSDK4.onWarmupCompleted.getTranslationY()))));
        if (aFg1tSDK4.IAuthTabCallback) {
            aFg1tSDK4.onWarmupCompleted.IAuthTabCallback(i, i2);
            int i10 = access000 + 13;
            getInterfaceDescriptor = i10 % 128;
            int i11 = i10 % 2;
            return;
        }
        int i12 = access000 + 65;
        getInterfaceDescriptor = i12 % 128;
        if (i12 % 2 == 0) {
            aFg1tSDK4.IAuthTabCallback(i, i2);
            return;
        }
        aFg1tSDK4.IAuthTabCallback(i, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        final AFg1tSDK4 aFg1tSDK4 = (AFg1tSDK4) objArr[0];
        final int iIntValue = ((Number) objArr[1]).intValue();
        final int iIntValue2 = ((Number) objArr[2]).intValue();
        long jLongValue = ((Number) objArr[3]).longValue();
        int i = 2 % 2;
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -717676270, new Object[]{aFg1tSDK4}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 717676272, iOnNavigationEvent, iOnNavigationEvent2);
        Runnable runnable = new Runnable() { // from class: im.toss.tosssecurities.uikit.extension.FloatingTabBarAnimator$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 37;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                AFg1tSDK4 aFg1tSDK42 = this.f$0;
                if (i4 != 0) {
                    AFg1tSDK4.onWarmupCompleted(aFg1tSDK42, iIntValue, iIntValue2);
                } else {
                    AFg1tSDK4.onWarmupCompleted(aFg1tSDK42, iIntValue, iIntValue2);
                    throw null;
                }
            }
        };
        aFg1tSDK4.asInterface = runnable;
        if (jLongValue > 0) {
            int i2 = access000 + 99;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                aFg1tSDK4.onWarmupCompleted.postDelayed(runnable, jLongValue);
                return null;
            }
            aFg1tSDK4.onWarmupCompleted.postDelayed(runnable, jLongValue);
            int i3 = 42 / 0;
            return null;
        }
        aFg1tSDK4.onWarmupCompleted.post(runnable);
        int i4 = access000 + 45;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void onExtraCallback(int i, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = access000 + 79;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -717676270, new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 717676272, iOnNavigationEvent, iOnNavigationEvent2);
        this.onWarmupCompleted.IAuthTabCallback_Parcel();
        Rally rally = this.asBinder;
        Object obj = null;
        if (rally != null) {
            int i6 = getInterfaceDescriptor + 39;
            access000 = i6 % 128;
            if (i6 % 2 == 0) {
                rally.ICustomTabsServiceStub();
                obj.hashCode();
                throw null;
            }
            rally.ICustomTabsServiceStub();
        }
        this.asBinder = null;
        IAuthTabCallback(i, i2);
        Object[] objArr = new Object[1];
        a(new char[]{'\f', 3, '\f', 4, 2, 3, 13925}, (byte) (102 - TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 7, objArr);
        IAuthTabCallback("show_instantly", access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), Boolean.valueOf(this.IAuthTabCallback)), getWrite.IAuthTabCallback("translationY", Float.valueOf(this.onWarmupCompleted.getTranslationY()))));
    }

    private final void IAuthTabCallback(int i, int i2) {
        int i3 = 2 % 2;
        this.onWarmupCompleted.onExtraCallback(i, i2);
        if (this.IAuthTabCallback) {
            return;
        }
        int i4 = access000 + 37;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        this.onWarmupCompleted.setVisibility(4);
        int i6 = getInterfaceDescriptor + 81;
        access000 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 3 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean onExtraCallback(AFg1tSDK4 aFg1tSDK4, Integer num, Function0 function0, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = access000;
        int i4 = i3 + 13;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            int i5 = i3 + 89;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 3;
            }
            num = null;
        }
        if ((i & 2) != 0) {
            function0 = new FloatingTabBarAnimator$.ExternalSyntheticLambda3();
        }
        return aFg1tSDK4.onNavigationEvent(num, function0);
    }

    private static final Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 85;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
        return unit;
    }

    public final boolean onNavigationEvent(@Nullable Integer num, @NotNull Function0<Unit> function0) {
        boolean zOnWarmupCompleted;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        boolean z = this.IAuthTabCallback;
        Object[] objArr = {this.onWarmupCompleted};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) TabBar.onWarmupCompleted(-579701279, nSetPosition.onExtraCallbackWithResult(), 579701301, objArr, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).booleanValue();
        this.IAuthTabCallback = true;
        Object obj = null;
        if (num != null) {
            int i2 = access000 + 71;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr2 = {this.onWarmupCompleted, Integer.valueOf(num.intValue()), function0};
                int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
                ((Boolean) TabBar.onWarmupCompleted(658606498, nSetPosition.onExtraCallbackWithResult(), -658606497, objArr2, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3)).booleanValue();
                obj.hashCode();
                throw null;
            }
            Object[] objArr3 = {this.onWarmupCompleted, Integer.valueOf(num.intValue()), function0};
            int iOnExtraCallbackWithResult5 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = nSetPosition.onExtraCallbackWithResult();
            zOnWarmupCompleted = ((Boolean) TabBar.onWarmupCompleted(658606498, nSetPosition.onExtraCallbackWithResult(), -658606497, objArr3, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult6, iOnExtraCallbackWithResult5)).booleanValue();
        } else {
            zOnWarmupCompleted = TabBar.onWarmupCompleted(this.onWarmupCompleted, 0, function0, 1, null);
        }
        IAuthTabCallback("revert", access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("wasVisible", Boolean.valueOf(z)), getWrite.IAuthTabCallback("floating", Boolean.valueOf(zBooleanValue)), getWrite.IAuthTabCallback("reverted", Boolean.valueOf(zOnWarmupCompleted))));
        int i3 = getInterfaceDescriptor + 77;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return zOnWarmupCompleted;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AFg1tSDK4 aFg1tSDK4 = (AFg1tSDK4) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 61;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Runnable runnable = aFg1tSDK4.asInterface;
        if (runnable != null) {
            aFg1tSDK4.onWarmupCompleted.removeCallbacks(runnable);
        }
        aFg1tSDK4.asInterface = null;
        int i4 = access000 + Imgproc.COLOR_YUV2RGBA_YVYU;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final void onWarmupCompleted(int i) {
        int iAccess000;
        int i2 = 2 % 2;
        this.IAuthTabCallbackDefault.onExtraCallbackWithResult();
        Object[] objArr = {this.onWarmupCompleted};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        final boolean zBooleanValue = ((Boolean) TabBar.onWarmupCompleted(-579701279, nSetPosition.onExtraCallbackWithResult(), 579701301, objArr, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).booleanValue();
        if (zBooleanValue) {
            Object[] objArr2 = {this.onWarmupCompleted};
            int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
            iAccess000 = ((Integer) TabBar.onWarmupCompleted(-1022135893, nSetPosition.onExtraCallbackWithResult(), 1022135895, objArr2, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3)).intValue();
            int i3 = getInterfaceDescriptor + 79;
            access000 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            iAccess000 = this.onWarmupCompleted.access000();
        }
        this.asBinder = isFireOS.onExtraCallbackWithResult(Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{this.onWarmupCompleted, isMuted.onExtraCallback(RallysKt.onExtraCallback(Address.onNavigationEvent.asBinder(), i), (Integer) null, Integer.valueOf(iAccess000), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Object) null, new Function0() { // from class: im.toss.tosssecurities.uikit.extension.FloatingTabBarAnimator$$ExternalSyntheticLambda4
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = 2 % 2;
                int i6 = onNavigationEvent + 15;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                Unit unitOnWarmupCompleted = AFg1tSDK4.onWarmupCompleted(this.f$0, zBooleanValue);
                int i8 = onExtraCallback + 23;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                return unitOnWarmupCompleted;
            }
        }, 1, (Object) null), false, 1, (Object) null);
        int i5 = getInterfaceDescriptor + 3;
        access000 = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        this.onWarmupCompleted.IAuthTabCallback_Parcel();
        this.IAuthTabCallbackDefault.onWarmupCompleted();
        this.onExtraCallbackWithResult = false;
        TabBar tabBar = this.onWarmupCompleted;
        Object[] objArr = {RallysKt.onExtraCallback(Address.onNavigationEvent.asBinder(), i), null, Float.valueOf(1.0f), null, 5, null};
        Object[] objArr2 = {Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{tabBar, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, objArr, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Object) null, new Function0() { // from class: im.toss.tosssecurities.uikit.extension.FloatingTabBarAnimator$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 7;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    AFg1tSDK4.onExtraCallbackWithResult(this.f$0);
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = AFg1tSDK4.onExtraCallbackWithResult(this.f$0);
                int i5 = onNavigationEvent + 25;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, 1, (Object) null), null, new Function0() { // from class: im.toss.tosssecurities.uikit.extension.FloatingTabBarAnimator$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnWarmupCompleted = AFg1tSDK4.onWarmupCompleted(this.f$0);
                int i6 = onNavigationEvent + 75;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return unitOnWarmupCompleted;
            }
        }, 1, null};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        this.asBinder = isFireOS.onExtraCallbackWithResult((Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, iOnExtraCallback, objArr2, 2128644226), false, 1, (Object) null);
        int i3 = getInterfaceDescriptor + 99;
        access000 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = IAuthTabCallbackStub;
        Object obj2 = null;
        if (cArr3 != null) {
            int i4 = $10 + 3;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), Color.alpha(0) + 26, ((Process.getThreadPriority(0) + 20) >> 6) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(onTransact)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 27, 23140 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i6 = $10 + 51;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                i2 = i + 113;
                cArr4[i2] = (char) (cArr[i2] >>> b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i7 = $11 + 97;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        int i8 = $11 + 107;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 24824), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 74, KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), 30 - (ViewConfiguration.getWindowTouchSlop() >> 8), 19489 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i10];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i11];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i12];
                            } else {
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i13];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i14];
                            }
                        }
                    }
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i15 = 0; i15 < i; i15++) {
            cArr4[i15] = (char) (cArr4[i15] ^ 13722);
        }
        String str = new String(cArr4);
        int i16 = $10 + 1;
        $11 = i16 % 128;
        if (i16 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i17 = 42 / 0;
            objArr[0] = str;
        }
    }

    private static final Unit IAuthTabCallback(AFg1tSDK4 aFg1tSDK4) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 81;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        TabBar tabBar = aFg1tSDK4.onWarmupCompleted;
        Cacheurls1 cacheurls1 = Cacheurls1.IAuthTabCallback.onWarmupCompleted;
        tabBar.setShadow(cacheurls1, null);
        aFg1tSDK4.onWarmupCompleted.setShadow2(cacheurls1, null);
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 15;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(AFg1tSDK4 aFg1tSDK4) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 29;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        aFg1tSDK4.onWarmupCompleted.setVisibility(4);
        aFg1tSDK4.onExtraCallbackWithResult = true;
        IAuthTabCallback(aFg1tSDK4, "hide_end", (Map) null, 2, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 21;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[PHI: r1
      0x0029: PHI (r1v5 o.AFg1tSDK4$onWarmupCompleted) = (r1v4 o.AFg1tSDK4$onWarmupCompleted), (r1v6 o.AFg1tSDK4$onWarmupCompleted) binds: [B:8:0x0027, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@NotNull String str, @NotNull Map<String, ? extends Object> map) {
        onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        int i2 = access000 + 37;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            onwarmupcompleted = this.onNavigationEvent;
            int i3 = 23 / 0;
            if (onwarmupcompleted != null) {
                onwarmupcompleted.IAuthTabCallback(str, map);
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            onwarmupcompleted = this.onNavigationEvent;
            if (onwarmupcompleted != null) {
            }
        }
        int i4 = getInterfaceDescriptor + 103;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void IAuthTabCallback(AFg1tSDK4 aFg1tSDK4, String str, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 81;
        access000 = i3 % 128;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 5) != 0) {
            map = access8000.IAuthTabCallback();
            int i4 = getInterfaceDescriptor + 7;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        }
        aFg1tSDK4.IAuthTabCallback(str, (Map<String, ? extends Object>) map);
    }

    private final void IAuthTabCallback(String str, Map<String, ? extends Object> map) {
        int i = 2 % 2;
        onWarmupCompleted onwarmupcompleted = this.onNavigationEvent;
        if (onwarmupcompleted != null) {
            onwarmupcompleted.onNavigationEvent(str, map);
            int i2 = access000 + 41;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = access000 + 103;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 53;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -717676270, new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 717676272, iOnNavigationEvent, iOnNavigationEvent2);
            this.IAuthTabCallbackDefault.onExtraCallback();
            Rally rally = this.asBinder;
            if (rally != null) {
                rally.ICustomTabsServiceStub();
                int i3 = getInterfaceDescriptor + 97;
                access000 = i3 % 128;
                int i4 = i3 % 2;
            }
            this.asBinder = null;
            int i5 = getInterfaceDescriptor + 51;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -717676270, new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 717676272, iOnNavigationEvent3, iOnNavigationEvent4);
        this.IAuthTabCallbackDefault.onExtraCallback();
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    private static final Unit onExtraCallbackWithResult(AFg1tSDK4 aFg1tSDK4, boolean z) {
        return (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1923614371, new Object[]{aFg1tSDK4, Boolean.valueOf(z)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1923614371, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public final void IAuthTabCallback() throws Throwable {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -717676270, new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 717676272, iOnNavigationEvent, iOnNavigationEvent2);
    }

    public final void IAuthTabCallback(int i, int i2, long j) throws Throwable {
        IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -2094686585, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 2094686589, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public final void onWarmupCompleted(boolean z, boolean z2) throws Throwable {
        IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 2045702474, new Object[]{this, Boolean.valueOf(z), Boolean.valueOf(z2)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -2045702473, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    static void onWarmupCompleted() {
        IAuthTabCallbackStub = new char[]{64986, 64977, 64991, 64990, 64976, 64987, 64982, 64967, 64960, 64961, 64983, 64988, 64979, 64989, 64978, 64965};
        onTransact = (char) 51245;
    }
}
