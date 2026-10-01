package im.toss.features.applock.impl.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.horcrux.svg.SvgPackage;
import im.toss.features.applock.impl.R;
import im.toss.features.applock.impl.view.WarningChangeLowSecurityLevelDialogFragment$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.widget.TdsScrollView;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Constant;
import o.FlowLineMeasurePolicyExternalSyntheticLambda0;
import o.ParamUtils;
import o.RVRemoteUtils;
import o.RotationProvider1;
import o.TimelineExternalSyntheticLambda0;
import o.access15300;
import o.getAdService;
import o.getInternalMemorySize;
import o.getSpecialFeatureOptInStatus;
import o.getTypedExportedConstants;
import o.getUrlokhttp;
import o.getWrite;
import o.initMiniApp;
import o.isNotificationsEnabled;
import o.isWifiEnabled;
import o.logAndOpenStore;
import o.matches;
import o.mergeParams;
import o.readIntokhttp;
import o.setHeadersokhttp;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProxySelectorokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class WarningChangeLowSecurityLevelDialogFragment extends getInternalMemorySize {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    public static final String IAuthTabCallback;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    private static int asInterface;
    public static final int onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    @Inject
    public Constant appLockLogManager;

    @Inject
    public RVRemoteUtils disableForceAppLockByUserUseCase;
    private isNotificationsEnabled onNavigationEvent;

    @Inject
    public isWifiEnabled securityLevelUseCase;

    static {
        onTransact();
        Object[] objArr = new Object[1];
        a(new char[]{61467, 37835, 61516, 29908, 36490, 31790, 43950, 16488, 20066, 15921, 59819, 597, 35923, 63502, 12178, 50241, 51790, 47667, 28035, 34369, 2056, 29802, 41983, 18483, 17977, 13942, 57848, 2607, 33847, 61514, 10186, 52227, 49671, 45691, 26053, 36375, 247, 29600, 47931, 12736, 24313, 3518, 63787, 62459, 40158, 53121, 16136, 46472, 56057, 35258, 32061, 30691, 6302, 19420, 45896, 14745, 22144, 1498, 61781}, (Process.getThreadPriority(0) + 20) >> 6, objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        Companion = new onExtraCallback((DefaultConstructorMarker) null);
        onExtraCallback = 8;
        int i = IAuthTabCallbackStub + 27;
        asInterface = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        int i7 = (~(i4 | i2)) | i6;
        int i8 = ~i4;
        int i9 = ~((~i6) | i8 | i2);
        int i10 = (~(i2 | i6)) | (~(i8 | (~i2)));
        int i11 = i4 + i6 + i3 + (1616745821 * i5) + (2077170981 * i);
        int i12 = i11 * i11;
        int i13 = ((-162656556) * i4) + 1587019776 + (806482222 * i6) + ((-484569389) * i7) + (i9 * 484569389) + (484569389 * i10) + (321912832 * i3) + ((-395313152) * i5) + (904921088 * i) + (345505792 * i12);
        int i14 = (i4 * (-1558553916)) + 318941677 + (i6 * (-1558553002)) + (i7 * (-457)) + (i9 * 457) + (i10 * 457) + (i3 * (-1558553459)) + (i5 * 397062201) + (i * 609114465) + (i12 * (-138936320));
        if (i13 + (i14 * i14 * 1630011392) != 1) {
            return onWarmupCompleted(objArr);
        }
        WarningChangeLowSecurityLevelDialogFragment warningChangeLowSecurityLevelDialogFragment = (WarningChangeLowSecurityLevelDialogFragment) objArr[0];
        String str = (String) objArr[1];
        getTypedExportedConstants gettypedexportedconstants = (getTypedExportedConstants) objArr[2];
        View view = (View) objArr[3];
        int i15 = 2 % 2;
        int i16 = onWarmupCompleted + 73;
        asBinder = i16 % 128;
        int i17 = i16 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(warningChangeLowSecurityLevelDialogFragment, str, gettypedexportedconstants, view);
        int i18 = asBinder + 75;
        onWarmupCompleted = i18 % 128;
        int i19 = i18 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(View view) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {view};
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = MaxNativeAdListener.onExtraCallbackWithResult();
        if (i3 == 0) {
            unit = (Unit) onExtraCallback(iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 337228123, objArr, iOnExtraCallbackWithResult3, -337228123);
            int i4 = 52 / 0;
        } else {
            unit = (Unit) onExtraCallback(iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 337228123, objArr, iOnExtraCallbackWithResult3, -337228123);
        }
        int i5 = asBinder + 107;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(WarningChangeLowSecurityLevelDialogFragment warningChangeLowSecurityLevelDialogFragment, String str, getTypedExportedConstants gettypedexportedconstants, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(warningChangeLowSecurityLevelDialogFragment, str, gettypedexportedconstants, view);
        int i4 = asBinder + 101;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static final class onExtraCallbackWithResult implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        public static final onExtraCallbackWithResult onNavigationEvent = new onExtraCallbackWithResult();
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 45;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onNavigationEvent(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            int i4 = onExtraCallbackWithResult + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((initMiniApp.onWarmupCompleted) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 89;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public final RVRemoteUtils IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 77;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        RVRemoteUtils rVRemoteUtils = this.disableForceAppLockByUserUseCase;
        if (rVRemoteUtils != null) {
            int i5 = i2 + 19;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return rVRemoteUtils;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = onWarmupCompleted + 123;
        asBinder = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final isWifiEnabled IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 21;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        isWifiEnabled iswifienabled = this.securityLevelUseCase;
        if (iswifienabled == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 63;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return iswifienabled;
        }
        obj.hashCode();
        throw null;
    }

    public final Constant onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Constant constant = this.appLockLogManager;
        if (constant == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 47;
        int i6 = i5 % 128;
        onWarmupCompleted = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 101;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
        return constant;
    }

    private final String asInterface() {
        String string;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            string = getString(R.string.applock_impl_change_security_level_warning_title);
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i3 = 30 / 0;
        } else {
            string = getString(R.string.applock_impl_change_security_level_warning_title);
            Intrinsics.checkNotNullExpressionValue(string, "");
        }
        int i4 = onWarmupCompleted + 105;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final void onNavigationEvent(@Nullable isNotificationsEnabled isnotificationsenabled) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 93;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent = isnotificationsenabled;
        int i5 = i2 + 87;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 81;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 45812), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 84, 21232 - TextUtils.lastIndexOf("", '0', 0, 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14184 - TextUtils.lastIndexOf("", '0', 0, 0)), (KeyEvent.getMaxKeyCode() >> 16) + 19, 8808 - Drawable.resolveOpacity(0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 7;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onWarmupCompleted + 121;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i4 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i5 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        View view = (View) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 35;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(WarningChangeLowSecurityLevelDialogFragment warningChangeLowSecurityLevelDialogFragment, String str, getTypedExportedConstants gettypedexportedconstants, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Object[] objArr = {warningChangeLowSecurityLevelDialogFragment.onNavigationEvent(), warningChangeLowSecurityLevelDialogFragment.onNavigationEvent, str};
        Constant.IAuthTabCallback(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), objArr, -1595247747, 1595247750);
        warningChangeLowSecurityLevelDialogFragment.IAuthTabCallback().onExtraCallback();
        Pair[] pairArr = {getWrite.IAuthTabCallback("CHANGE_SECURITY_LEVEL", onNavigationEvent.CHANGE_SECURITY_LEVEL)};
        Object[] objArr2 = new Object[1];
        a(new char[]{61467, 37835, 61516, 29908, 36490, 31790, 43950, 16488, 20066, 15921, 59819, 597, 35923, 63502, 12178, 50241, 51790, 47667, 28035, 34369, 2056, 29802, 41983, 18483, 17977, 13942, 57848, 2607, 33847, 61514, 10186, 52227, 49671, 45691, 26053, 36375, 247, 29600, 47931, 12736, 24313, 3518, 63787, 62459, 40158, 53121, 16136, 46472, 56057, 35258, 32061, 30691, 6302, 19420, 45896, 14745, 22144, 1498, 61781}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
        FlowLineMeasurePolicyExternalSyntheticLambda0.onNavigationEvent(warningChangeLowSecurityLevelDialogFragment, ((String) objArr2[0]).intern(), RotationProvider1.onNavigationEvent(pairArr));
        gettypedexportedconstants.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 123;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(WarningChangeLowSecurityLevelDialogFragment warningChangeLowSecurityLevelDialogFragment, String str, getTypedExportedConstants gettypedexportedconstants, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Object[] objArr = {warningChangeLowSecurityLevelDialogFragment.onNavigationEvent(), warningChangeLowSecurityLevelDialogFragment.onNavigationEvent, str};
        Constant.IAuthTabCallback(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), objArr, -1595247747, 1595247750);
        Pair[] pairArr = {getWrite.IAuthTabCallback("CHANGE_SECURITY_LEVEL", onNavigationEvent.CLOSE)};
        Object[] objArr2 = new Object[1];
        a(new char[]{61467, 37835, 61516, 29908, 36490, 31790, 43950, 16488, 20066, 15921, 59819, 597, 35923, 63502, 12178, 50241, 51790, 47667, 28035, 34369, 2056, 29802, 41983, 18483, 17977, 13942, 57848, 2607, 33847, 61514, 10186, 52227, 49671, 45691, 26053, 36375, 247, 29600, 47931, 12736, 24313, 3518, 63787, 62459, 40158, 53121, 16136, 46472, 56057, 35258, 32061, 30691, 6302, 19420, 45896, 14745, 22144, 1498, 61781}, 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
        FlowLineMeasurePolicyExternalSyntheticLambda0.onNavigationEvent(warningChangeLowSecurityLevelDialogFragment, ((String) objArr2[0]).intern(), RotationProvider1.onNavigationEvent(pairArr));
        gettypedexportedconstants.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 93;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public void onCancel(@NotNull DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        Pair[] pairArr = {getWrite.IAuthTabCallback("CHANGE_SECURITY_LEVEL", onNavigationEvent.CANCEL)};
        Object[] objArr = new Object[1];
        a(new char[]{61467, 37835, 61516, 29908, 36490, 31790, 43950, 16488, 20066, 15921, 59819, 597, 35923, 63502, 12178, 50241, 51790, 47667, 28035, 34369, 2056, 29802, 41983, 18483, 17977, 13942, 57848, 2607, 33847, 61514, 10186, 52227, 49671, 45691, 26053, 36375, 247, 29600, 47931, 12736, 24313, 3518, 63787, 62459, 40158, 53121, 16136, 46472, 56057, 35258, 32061, 30691, 6302, 19420, 45896, 14745, 22144, 1498, 61781}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, objArr);
        FlowLineMeasurePolicyExternalSyntheticLambda0.onNavigationEvent(this, ((String) objArr[0]).intern(), RotationProvider1.onNavigationEvent(pairArr));
        super/*androidx.fragment.app.DialogFragment*/.onCancel(dialogInterface);
        int i4 = asBinder + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        public static final onNavigationEvent CANCEL = new onNavigationEvent("CANCEL", 0);
        public static final onNavigationEvent CHANGE_SECURITY_LEVEL = new onNavigationEvent("CHANGE_SECURITY_LEVEL", 1);
        public static final onNavigationEvent CLOSE = new onNavigationEvent("CLOSE", 2);
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = CANCEL;
            if (i3 == 0) {
                return new onNavigationEvent[]{onnavigationevent, CHANGE_SECURITY_LEVEL, CLOSE};
            }
            onNavigationEvent onnavigationevent2 = CHANGE_SECURITY_LEVEL;
            onNavigationEvent onnavigationevent3 = CLOSE;
            onNavigationEvent[] onnavigationeventArr = new onNavigationEvent[5];
            onnavigationeventArr[1] = onnavigationevent;
            onnavigationeventArr[0] = onnavigationevent2;
            onnavigationeventArr[3] = onnavigationevent3;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i4 = i3 + 81;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return enumEntries;
            }
            obj.hashCode();
            throw null;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = onWarmupCompleted + 119;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = $VALUES;
            if (i3 == 0) {
                return (onNavigationEvent[]) onnavigationeventArr.clone();
            }
            throw null;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onNavigationEvent + 69;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }
    }

    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        int i = 2 % 2;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult.onNavigationEvent;
        logAndOpenStore.IAuthTabCallback(contextRequireContext, (Long) null);
        getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(contextRequireContext, 0, false, false, -1L, onextracallbackwithresult, 14, (DefaultConstructorMarker) null);
        onNavigationEvent().IAuthTabCallback(this.onNavigationEvent, asInterface());
        Context context = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        TdsScrollView tdsScrollView = new TdsScrollView(context2, (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.height = 0;
        layoutParams2.weight = 1.0f;
        tdsScrollView.setLayoutParams(layoutParams);
        Context context3 = tdsScrollView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        LinearLayout linearLayout2 = new LinearLayout(context3);
        linearLayout2.setOrientation(1);
        Context context4 = linearLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context4, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setTitle(asInterface());
        bottomSheetHeader.setShowCloseIcon(false);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, bottomSheetHeader);
        BaseTextView baseTextView = (BaseTextView) Typography5.class.getDeclaredConstructor(Context.class).newInstance(linearLayout2.getContext());
        Intrinsics.checkNotNull(baseTextView);
        String string = getString(R.string.applock_impl_n_step, new Object[]{Integer.valueOf(IAuthTabCallbackStub().IAuthTabCallbackDefault())});
        Intrinsics.checkNotNullExpressionValue(string, "");
        Context context5 = baseTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        Configuration configuration = context5.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        String string2 = getString(R.string.applock_impl_change_security_level_warning_description, new Object[]{mergeParams.onExtraCallbackWithResult(string, ((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new onWarmupCompleted(configuration)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue())});
        Intrinsics.checkNotNullExpressionValue(string2, "");
        baseTextView.setText(mergeParams.IAuthTabCallback(string2, false, 1, (Object) null));
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(baseTextView, varyMatches.IAuthTabCallback(baseTextView, 24), varyMatches.IAuthTabCallback(baseTextView, 0), varyMatches.IAuthTabCallback(baseTextView, 24), varyMatches.IAuthTabCallback(baseTextView, 0));
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsScrollView, linearLayout2);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsScrollView);
        Context context6 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context6);
        String string3 = getString(R.string.applock_impl_change);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = getString(R.string.applock_impl_close);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        WarningChangeLowSecurityLevelDialogFragment$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new WarningChangeLowSecurityLevelDialogFragment$.ExternalSyntheticLambda0();
        TdsButtonV1View.IAuthTabCallbackStub iAuthTabCallbackStub = TdsButtonV1View.IAuthTabCallbackStub.DANGER;
        TdsButtonV1View.IAuthTabCallbackDefault iAuthTabCallbackDefault = TdsButtonV1View.IAuthTabCallbackDefault.FILL;
        TdsButtonV1View.onWarmupCompleted onwarmupcompleted = TdsButtonV1View.onWarmupCompleted.XLARGE;
        TdsButtonV1View.IAuthTabCallback iAuthTabCallback = TdsButtonV1View.IAuthTabCallback.INLINE;
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string3, externalSyntheticLambda0, new TdsButtonV1View.asInterface(iAuthTabCallbackStub, iAuthTabCallbackDefault, onwarmupcompleted, iAuthTabCallback), false, 8, (Object) null);
        Object[] objArr = {tdsBottomCtaV1View.asInterface(), ParamUtils.NORMAL, new WarningChangeLowSecurityLevelDialogFragment$.ExternalSyntheticLambda1(this, string3, gettypedexportedconstants)};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        tdsBottomCtaV1View.setSecondary(string4, new WarningChangeLowSecurityLevelDialogFragment$.ExternalSyntheticLambda2(this, string4, gettypedexportedconstants), new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DARK, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, onwarmupcompleted, iAuthTabCallback));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        gettypedexportedconstants.setContentView(linearLayout);
        int i2 = onWarmupCompleted + 79;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 73 / 0;
        }
        return gettypedexportedconstants;
    }

    public static /* synthetic */ Unit onWarmupCompleted(WarningChangeLowSecurityLevelDialogFragment warningChangeLowSecurityLevelDialogFragment, String str, getTypedExportedConstants gettypedexportedconstants, View view) {
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MaxNativeAdListener.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(MaxNativeAdListener.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, -436605307, new Object[]{warningChangeLowSecurityLevelDialogFragment, str, gettypedexportedconstants, view}, iOnExtraCallbackWithResult3, 436605308);
    }

    private static final Unit onExtraCallback(View view) {
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MaxNativeAdListener.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(MaxNativeAdListener.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 337228123, new Object[]{view}, iOnExtraCallbackWithResult3, -337228123);
    }

    static void onTransact() {
        onExtraCallbackWithResult = 6158561876715017352L;
    }
}
