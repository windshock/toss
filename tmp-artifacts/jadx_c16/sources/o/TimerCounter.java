package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import im.toss.core.webkit.bridge.accessarybutton.AccessoryButtonConfiguration;
import im.toss.core.webkit.bridge.accessarybutton.AccessoryButtonConfigurationHelper$;
import im.toss.core.webkit.bridge.accessarybutton.IconAccessoryButtonConfiguration;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.core.webkit.bridge.accessarybutton.TextAccessoryButtonConfiguration;
import im.toss.splittarget.impl.fsm.AppStateImpl$;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class TimerCounter {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 0;
    private static int asInterface = 0;
    private static boolean onExtraCallback = false;
    public static final TimerCounter onExtraCallbackWithResult;
    private static boolean onNavigationEvent = false;
    private static int onTransact = 1;
    private static int onWarmupCompleted;

    static {
        onExtraCallbackWithResult();
        onExtraCallbackWithResult = new TimerCounter();
        int i = asBinder + 43;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(boolean z, TimerCallBack timerCallBack, String str, String str2, String str3, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onWarmupCompleted(z, timerCallBack, str, str2, str3, onMenuItemClickListener);
        if (i3 != 0) {
            throw null;
        }
        int i4 = asInterface + 119;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean IAuthTabCallback(Function1 function1, AccessoryButtonConfiguration accessoryButtonConfiguration, MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(function1, accessoryButtonConfiguration, menuItem);
        int i4 = asInterface + 9;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(boolean z, TimerCallBack timerCallBack, String str, String str2, String str3, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {Boolean.valueOf(z), timerCallBack, str, str2, str3, onMenuItemClickListener};
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(1702887096, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1702887095, objArr);
        int i4 = IAuthTabCallbackDefault + 1;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(Function1 function1, MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(function1, menuItem);
        int i4 = IAuthTabCallbackDefault + 77;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return zOnExtraCallback;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(Function1 function1, AccessoryButtonConfiguration accessoryButtonConfiguration, MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(function1, accessoryButtonConfiguration, menuItem);
        int i4 = IAuthTabCallbackDefault + 69;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    public static /* synthetic */ void onNavigationEvent(TimerCallBack timerCallBack) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(timerCallBack);
        int i4 = asInterface + 107;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
    }

    public static /* synthetic */ void onNavigationEvent(TimerCallBack timerCallBack, String str, String str2, String str3, String str4, String str5, MenuItem.OnMenuItemClickListener onMenuItemClickListener, MenuItem.OnMenuItemClickListener onMenuItemClickListener2) {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(timerCallBack, str, str2, str3, str4, str5, onMenuItemClickListener, onMenuItemClickListener2);
        if (i3 == 0) {
            throw null;
        }
        int i4 = asInterface + 111;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onNavigationEvent(Function1 function1, MenuItem menuItem) {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            zBooleanValue = ((Boolean) onWarmupCompleted(-819816086, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted3, 819816086, new Object[]{function1, menuItem})).booleanValue();
            int i3 = 92 / 0;
        } else {
            int iOnWarmupCompleted4 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted5 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted6 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            zBooleanValue = ((Boolean) onWarmupCompleted(-819816086, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted5, iOnWarmupCompleted4, iOnWarmupCompleted6, 819816086, new Object[]{function1, menuItem})).booleanValue();
        }
        int i4 = IAuthTabCallbackDefault + 109;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return zBooleanValue;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = i6 | i7 | i8;
        int i10 = ~(i4 | i7);
        int i11 = (~(i7 | i8)) | (~i6);
        int i12 = i6 + i + i3 + ((-1537480081) * i5) + ((-1176924877) * i2);
        int i13 = i12 * i12;
        int i14 = (((-324914750) * i6) - 1179058176) + ((-1443770816) * i) + (1588055615 * i9) + (i10 * (-1588055615)) + ((-1588055615) * i11) + (1263140864 * i3) + (1226178560 * i5) + ((-1044512768) * i2) + (1201733632 * i13);
        int i15 = (i6 * 1018573086) + 1206756779 + (i * 1018572224) + (i9 * (-431)) + (i10 * 431) + (i11 * 431) + (i3 * 1018572655) + (i5 * (-758184159)) + (i2 * (-595421667)) + (i13 * (-1647378432));
        int i16 = i14 + (i15 * i15 * 1518272512);
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    private TimerCounter() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void onNavigationEvent(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull AccessoryButtonConfiguration accessoryButtonConfiguration, @NotNull Function1<? super String, Unit> function1) throws Throwable {
        FragmentActivity activity;
        FragmentActivity activity2;
        FragmentActivity activity3;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
            Intrinsics.checkNotNullParameter(accessoryButtonConfiguration, "");
            Intrinsics.checkNotNullParameter(function1, "");
            onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
            boolean z = accessoryButtonConfiguration instanceof IconDoubleAccessoryButtonConfiguration;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(accessoryButtonConfiguration, "");
        Intrinsics.checkNotNullParameter(function1, "");
        TimerCallBack timerCallBackOnNavigationEvent = onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        if (accessoryButtonConfiguration instanceof IconDoubleAccessoryButtonConfiguration) {
            IconDoubleAccessoryButtonConfiguration iconDoubleAccessoryButtonConfiguration = (IconDoubleAccessoryButtonConfiguration) accessoryButtonConfiguration;
            String str = (String) IconDoubleAccessoryButtonConfiguration.onExtraCallbackWithResult(new Object[]{iconDoubleAccessoryButtonConfiguration}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 533640707, -533640707, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
            String strAsBinder = iconDoubleAccessoryButtonConfiguration.asBinder();
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-122, -112, -113, -122, -114, -115, -125, -122, -124, -115, -117, -119, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, 127 - Color.argb(0, 0, 0, 0), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            sb.append(".png");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-122, -112, -113, -122, -114, -115, -125, -122, -124, -115, -117, -119, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
            sb2.append(((String) objArr2[0]).intern());
            sb2.append(strAsBinder);
            sb2.append(".png");
            String string2 = sb2.toString();
            String strIAuthTabCallbackDefault = iconDoubleAccessoryButtonConfiguration.IAuthTabCallbackDefault();
            String strOnTransact = iconDoubleAccessoryButtonConfiguration.onTransact();
            String strOnExtraCallback = iconDoubleAccessoryButtonConfiguration.onExtraCallback();
            AccessoryButtonConfigurationHelper$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new AccessoryButtonConfigurationHelper$.ExternalSyntheticLambda0(function1);
            AccessoryButtonConfigurationHelper$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new AccessoryButtonConfigurationHelper$.ExternalSyntheticLambda1(function1);
            if (timerCallBackOnNavigationEvent == null || (activity3 = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity()) == null) {
                return;
            }
            activity3.runOnUiThread(new AccessoryButtonConfigurationHelper$.ExternalSyntheticLambda2(timerCallBackOnNavigationEvent, string, string2, strIAuthTabCallbackDefault, strOnTransact, strOnExtraCallback, externalSyntheticLambda0, externalSyntheticLambda1));
            int i3 = asInterface + 83;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        if (accessoryButtonConfiguration instanceof TextAccessoryButtonConfiguration) {
            TextAccessoryButtonConfiguration textAccessoryButtonConfiguration = (TextAccessoryButtonConfiguration) accessoryButtonConfiguration;
            boolean zIAuthTabCallbackStub = textAccessoryButtonConfiguration.IAuthTabCallbackStub();
            String strOnExtraCallback2 = textAccessoryButtonConfiguration.onExtraCallback();
            String strIAuthTabCallbackDefault2 = textAccessoryButtonConfiguration.IAuthTabCallbackDefault();
            String strOnTransact2 = textAccessoryButtonConfiguration.onTransact();
            AccessoryButtonConfigurationHelper$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new AccessoryButtonConfigurationHelper$.ExternalSyntheticLambda3(function1, accessoryButtonConfiguration);
            if (timerCallBackOnNavigationEvent == null || (activity2 = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity()) == null) {
                return;
            }
            activity2.runOnUiThread(new AccessoryButtonConfigurationHelper$.ExternalSyntheticLambda4(zIAuthTabCallbackStub, timerCallBackOnNavigationEvent, strOnExtraCallback2, strOnTransact2, strIAuthTabCallbackDefault2, externalSyntheticLambda3));
            return;
        }
        if (!(accessoryButtonConfiguration instanceof IconAccessoryButtonConfiguration)) {
            throw new NoWhenBranchMatchedException();
        }
        IconAccessoryButtonConfiguration iconAccessoryButtonConfiguration = (IconAccessoryButtonConfiguration) accessoryButtonConfiguration;
        String strIAuthTabCallbackDefault3 = iconAccessoryButtonConfiguration.IAuthTabCallbackDefault();
        StringBuilder sb3 = new StringBuilder();
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-122, -112, -113, -122, -114, -115, -125, -122, -124, -115, -117, -119, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, 175 - AndroidCharacter.getMirror('0'), objArr3);
        sb3.append(((String) objArr3[0]).intern());
        sb3.append(strIAuthTabCallbackDefault3);
        sb3.append(".png");
        String string3 = sb3.toString();
        String strOnTransact3 = iconAccessoryButtonConfiguration.onTransact();
        boolean zAsBinder = iconAccessoryButtonConfiguration.asBinder();
        String strOnExtraCallback3 = iconAccessoryButtonConfiguration.onExtraCallback();
        AccessoryButtonConfigurationHelper$.ExternalSyntheticLambda5 externalSyntheticLambda5 = new AccessoryButtonConfigurationHelper$.ExternalSyntheticLambda5(function1, accessoryButtonConfiguration);
        if (timerCallBackOnNavigationEvent == null || (activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity()) == null) {
            return;
        }
        activity.runOnUiThread(new AccessoryButtonConfigurationHelper$.ExternalSyntheticLambda6(zAsBinder, timerCallBackOnNavigationEvent, string3, strOnExtraCallback3, strOnTransact3, externalSyntheticLambda5));
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        MenuItem menuItem = (MenuItem) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 33;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(menuItem, "");
        } else {
            Intrinsics.checkNotNullParameter(menuItem, "");
        }
        function1.invoke("left");
        return true;
    }

    private static final boolean onExtraCallback(Function1 function1, MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(menuItem, "");
        } else {
            Intrinsics.checkNotNullParameter(menuItem, "");
        }
        function1.invoke("right");
        return true;
    }

    private static final void onWarmupCompleted(TimerCallBack timerCallBack, String str, String str2, String str3, String str4, String str5, MenuItem.OnMenuItemClickListener onMenuItemClickListener, MenuItem.OnMenuItemClickListener onMenuItemClickListener2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        timerCallBack.onExtraCallback(str, str2, str3, str4, str5, onMenuItemClickListener, onMenuItemClickListener2);
        if (i3 != 0) {
            throw null;
        }
    }

    private static final boolean onWarmupCompleted(Function1 function1, AccessoryButtonConfiguration accessoryButtonConfiguration, MenuItem menuItem) {
        boolean z;
        int i = 2 % 2;
        int i2 = asInterface + 39;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(menuItem, "");
            function1.invoke(((TextAccessoryButtonConfiguration) accessoryButtonConfiguration).asBinder());
            z = false;
        } else {
            Intrinsics.checkNotNullParameter(menuItem, "");
            function1.invoke(((TextAccessoryButtonConfiguration) accessoryButtonConfiguration).asBinder());
            z = true;
        }
        int i3 = IAuthTabCallbackDefault + 51;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return z;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        TimerCallBack timerCallBack = (TimerCallBack) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        String str3 = (String) objArr[4];
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = (MenuItem.OnMenuItemClickListener) objArr[5];
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 33;
        IAuthTabCallbackDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (!zBooleanValue) {
            timerCallBack.onExtraCallback("", str, str2, str3, onMenuItemClickListener);
            return null;
        }
        int i4 = i2 + 25;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            timerCallBack.onExtraCallbackWithResult("", str, str2, str3, onMenuItemClickListener);
            return null;
        }
        timerCallBack.onExtraCallbackWithResult("", str, str2, str3, onMenuItemClickListener);
        int i5 = 10 / 0;
        return null;
    }

    private static final boolean onNavigationEvent(Function1 function1, AccessoryButtonConfiguration accessoryButtonConfiguration, MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(menuItem, "");
        function1.invoke(((IconAccessoryButtonConfiguration) accessoryButtonConfiguration).IAuthTabCallbackStub());
        int i4 = IAuthTabCallbackDefault + 55;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private static final void onWarmupCompleted(boolean z, TimerCallBack timerCallBack, String str, String str2, String str3, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!z) {
            timerCallBack.onExtraCallback(str, str2, "", str3, onMenuItemClickListener);
            return;
        }
        timerCallBack.onExtraCallbackWithResult(str, str2, "", str3, onMenuItemClickListener);
        int i3 = asInterface + 21;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TimerCounter timerCounter = (TimerCounter) objArr[0];
        r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq = (r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        TimerCallBack timerCallBackOnNavigationEvent = timerCounter.onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        if (timerCallBackOnNavigationEvent == null) {
            return null;
        }
        int i2 = IAuthTabCallbackDefault + 35;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        FragmentActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        if (i3 != 0) {
            int i4 = 40 / 0;
            if (activity == null) {
                return null;
            }
        } else if (activity == null) {
            return null;
        }
        activity.runOnUiThread(new AccessoryButtonConfigurationHelper$.ExternalSyntheticLambda7(timerCallBackOnNavigationEvent));
        int i5 = asInterface + 55;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static final void onWarmupCompleted(TimerCallBack timerCallBack) {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        timerCallBack.aS_();
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
    }

    public final TimerCallBack onNavigationEvent(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq) {
        TimerCallBack timerCallBack;
        TimerCallBack timerCallBack2;
        int i = 2 % 2;
        int i2 = asInterface + 13;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
            boolean z = r8lambdakrhaimf1bm5cgjbilhp45vln_xq instanceof TimerCallBack;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        if (!(r8lambdakrhaimf1bm5cgjbilhp45vln_xq instanceof TimerCallBack)) {
            timerCallBack = null;
        } else {
            timerCallBack = (TimerCallBack) r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
            int i3 = asInterface + 99;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
        }
        if (timerCallBack != null) {
            return timerCallBack;
        }
        TimerCallBack activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        if (activity instanceof TimerCallBack) {
            int i5 = IAuthTabCallbackDefault + 91;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                timerCallBack2 = activity;
                int i6 = 94 / 0;
            } else {
                timerCallBack2 = activity;
            }
        } else {
            timerCallBack2 = null;
        }
        if (timerCallBack2 != null) {
            int i7 = asInterface + 85;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 60 / 0;
            }
            return timerCallBack2;
        }
        int i9 = IAuthTabCallbackDefault + 73;
        asInterface = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 99 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Object obj;
        TimerCallBack timerCallBack;
        View view = (View) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        try {
            Result.Companion companion = Result.Companion;
            TimerCallBack timerCallBackOnExtraCallbackWithResult = PaddingKtExternalSyntheticLambda0.onExtraCallbackWithResult(view);
            if (timerCallBackOnExtraCallbackWithResult instanceof TimerCallBack) {
                timerCallBack = timerCallBackOnExtraCallbackWithResult;
            } else {
                int i2 = asInterface + 85;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                timerCallBack = null;
            }
            obj = Result.constructor-impl(timerCallBack);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i4 = IAuthTabCallbackDefault + 121;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            obj = null;
        }
        TimerCallBack timerCallBack2 = (TimerCallBack) obj;
        if (timerCallBack2 != null) {
            return timerCallBack2;
        }
        TimerCallBack timerCallBackOnNavigationEvent = LinkGenerator1.onNavigationEvent(view);
        TimerCallBack timerCallBack3 = timerCallBackOnNavigationEvent instanceof TimerCallBack ? timerCallBackOnNavigationEvent : null;
        if (timerCallBack3 == null) {
            return null;
        }
        int i6 = IAuthTabCallbackDefault + 83;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return timerCallBack3;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallback;
        float f = 0.0f;
        if (cArr2 != null) {
            int i3 = $11 + 23;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), Color.alpha(0) + 77, 20952 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 75, 16038 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i6 = 1052772399;
        if (!(!onExtraCallback)) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 63 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 12213 - ImageFormat.getBitsPerPixel(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onNavigationEvent) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i7 = $11 + 87;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >> i] * iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 63 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 12213 - ExpandableListView.getPackedPositionChild(0L), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), Process.getGidForName("") + 64, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                i6 = 1052772399;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static final boolean onWarmupCompleted(Function1 function1, MenuItem menuItem) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return ((Boolean) onWarmupCompleted(-819816086, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted3, 819816086, new Object[]{function1, menuItem})).booleanValue();
    }

    private static final void onNavigationEvent(boolean z, TimerCallBack timerCallBack, String str, String str2, String str3, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        Object[] objArr = {Boolean.valueOf(z), timerCallBack, str, str2, str3, onMenuItemClickListener};
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(1702887096, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1702887095, objArr);
    }

    public final TimerCallBack onWarmupCompleted(@NotNull View view) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (TimerCallBack) onWarmupCompleted(809095719, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted3, -809095716, new Object[]{this, view});
    }

    public final void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        onWarmupCompleted(-1446324263, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted3, 1446324265, new Object[]{this, r8lambdakrhaimf1bm5cgjbilhp45vln_xq});
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = new char[]{32604, 32584, 32596, 32585, 32514, 32533, 32603, 32595, 32601, 32534, 32597, 32599, 32598, 32605, 32520, 32588};
        onWarmupCompleted = -1184333884;
        onNavigationEvent = true;
        onExtraCallback = true;
    }
}
