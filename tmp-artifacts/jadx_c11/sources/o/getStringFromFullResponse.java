package o;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.core.tracker.entry.TrackEvent;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getStringFromFullResponse implements AppLovinAdServiceImplc {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] IAuthTabCallback = {-1470946991, 184356139, -937048046, -115145830, -1048466028, 536164949, 505458335, 1561958813, -161878187, -1606435673, 452632290, 280791711, -941610371, -144815515, 1497964943, -1799340294, 1681387995, -1029456255};
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult;
    private final access600 onNavigationEvent;

    @Inject
    public getStringFromFullResponse(@NotNull access600 access600Var, @NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1) {
        Intrinsics.checkNotNullParameter(access600Var, "");
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        this.onNavigationEvent = access600Var;
        this.onExtraCallbackWithResult = textRoundCornerProgressBarSavedState1;
    }

    @Override // o.AppLovinAdServiceImplc
    public void onExtraCallback(@Nullable Activity activity, @NotNull String str, @Nullable Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            ConvertByteArrayToFloatArray.onWarmupCompleted(str, map, (Function1) null, 2, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            ConvertByteArrayToFloatArray.onWarmupCompleted(str, map, (Function1) null, 4, (Object) null);
        }
        this.onNavigationEvent.onExtraCallback(activity, str);
        int i3 = onExtraCallback + 7;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // o.AppLovinAdServiceImplc
    public void IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        TrackEvent.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = new TrackEvent.IAuthTabCallback(str).onNavigationEvent("category", "account").onNavigationEvent("view", str2);
        Object[] objArr = new Object[1];
        a(new int[]{528327531, -1442543552, -1377461998, -909457584}, ExpandableListView.getPackedPositionType(0L) + 6, objArr);
        Object[] objArr2 = {iAuthTabCallbackOnNavigationEvent.onNavigationEvent(((String) objArr[0]).intern(), str3).onWarmupCompleted()};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, objArr2, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
        int i2 = onWarmupCompleted + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // o.AppLovinAdServiceImplc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
            if (!this.onExtraCallbackWithResult.onNavigationEvent("credit_inquiry")) {
                this.onExtraCallbackWithResult.onNavigationEvent("credit_inquiry", true);
                ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "credit_inquiry", clearFaultAdjacentMetadata.onExtraCallback(new r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc[]{r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.APPSFLYER, r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.FACEBOOK}), false, (String) null, (Map) null, (Function1) null, 60, (Object) null);
            }
        } else if (!this.onExtraCallbackWithResult.onNavigationEvent("credit_inquiry")) {
        }
        int i4 = onExtraCallback + 41;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // o.AppLovinAdServiceImplc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IAuthTabCallback(int i, @NotNull String str, @NotNull String str2) throws Throwable {
        String str3;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 53;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if (i == 1) {
                str3 = "deposit";
            } else if (i == 2) {
                str3 = "withdrawal";
            } else if (i != 3) {
                int i4 = onWarmupCompleted + 39;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                str3 = "all";
            } else {
                str3 = "debit";
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if (i != 1) {
            }
        }
        TrackEvent.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = new TrackEvent.IAuthTabCallback(sendBroadcastSyncWithPendingBroadcasts.IAuthTabCallback.onExtraCallback()).onNavigationEvent("category", "account").onNavigationEvent("view", str2);
        Object[] objArr = new Object[1];
        a(new int[]{1822436915, 976946279, -1050600805, 385706105}, 6 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
        Object[] objArr2 = {iAuthTabCallbackOnNavigationEvent.onNavigationEvent(((String) objArr[0]).intern(), "select_detail_option").onNavigationEvent("option", str3).onNavigationEvent("bank_code", str).onNavigationEvent("version", 4).onWarmupCompleted()};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, objArr2, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
        int i5 = onWarmupCompleted + 69;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallback;
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
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 72 - Color.red(0), 8848 - (ViewConfiguration.getTouchSlop() >> 8), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
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
        int[] iArr5 = IAuthTabCallback;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                int i8 = $10 + 103;
                $11 = i8 % 128;
                int i9 = i8 % i2;
                Object[] objArr3 = new Object[1];
                objArr3[i5] = Integer.valueOf(iArr5[i7]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), AndroidCharacter.getMirror('0') + 24, ExpandableListView.getPackedPositionGroup(0L) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i7++;
                i2 = 2;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        int i10 = i5;
        System.arraycopy(iArr5, i10, iArr4, i10, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i10;
        int i11 = $11 + 5;
        $10 = i11 % 128;
        int i12 = i11 % 2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i13 = $11 + 59;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            for (int i15 = 0; i15 < 16; i15++) {
                int i16 = $10 + 27;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 22252), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 38, ExpandableListView.getPackedPositionChild(0L) + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 4034), 78 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 7398 - (ViewConfiguration.getPressedStateDuration() >> 16), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // o.AppLovinAdServiceImplc
    public void onWarmupCompleted(@NotNull String str, @NotNull String str2, int i) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        TrackEvent.IAuthTabCallback iAuthTabCallback = new TrackEvent.IAuthTabCallback("push_onClick");
        Object[] objArr = new Object[1];
        a(new int[]{-1721467712, -677148613}, 4 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        TrackEvent.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = iAuthTabCallback.onNavigationEvent("category", ((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a(new int[]{193655239, -323112762}, TextUtils.indexOf((CharSequence) "", '0', 0) + 4, objArr2);
        TrackEvent.IAuthTabCallback iAuthTabCallbackOnNavigationEvent2 = iAuthTabCallbackOnNavigationEvent.onNavigationEvent(((String) objArr2[0]).intern(), str).onNavigationEvent("msg", str2);
        Object[] objArr3 = new Object[1];
        a(new int[]{-1428683248, -1764725034}, 4 - ExpandableListView.getPackedPositionGroup(0L), objArr3);
        Object[] objArr4 = {iAuthTabCallbackOnNavigationEvent2.onNavigationEvent(((String) objArr3[0]).intern(), Integer.valueOf(i)).onNavigationEvent("category", "msg").onWarmupCompleted()};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, objArr4, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
        int i3 = onWarmupCompleted + 61;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 87 / 0;
        }
    }

    @Override // o.AppLovinAdServiceImplc
    public void onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        if (Intrinsics.areEqual(str2, "request")) {
            TrackEvent.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = new TrackEvent.IAuthTabCallback(sendBroadcastSyncWithPendingBroadcasts.IAuthTabCallback.IAuthTabCallback()).onNavigationEvent("category", "transaction").onNavigationEvent("view", str);
            Object[] objArr = new Object[1];
            a(new int[]{-1428683248, -1764725034}, 4 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            Object[] objArr2 = {iAuthTabCallbackOnNavigationEvent.onNavigationEvent(((String) objArr[0]).intern(), str2).onNavigationEvent("source", str5).onNavigationEvent("source_event", str6).onWarmupCompleted()};
            int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, objArr2, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
            return;
        }
        Object[] objArr3 = new Object[1];
        a(new int[]{-71012904, 742130437, -1050600805, 385706105}, 6 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr3);
        if (Intrinsics.areEqual(str2, ((String) objArr3[0]).intern())) {
            TrackEvent.IAuthTabCallback iAuthTabCallbackOnNavigationEvent2 = new TrackEvent.IAuthTabCallback(sendBroadcastSyncWithPendingBroadcasts.IAuthTabCallback.IAuthTabCallback()).onNavigationEvent("category", "transaction").onNavigationEvent("view", str);
            Object[] objArr4 = new Object[1];
            a(new int[]{-1428683248, -1764725034}, 4 - TextUtils.getCapsMode("", 0, 0), objArr4);
            Object[] objArr5 = {iAuthTabCallbackOnNavigationEvent2.onNavigationEvent(((String) objArr4[0]).intern(), str2).onNavigationEvent("method", str3).onNavigationEvent("option", str4).onNavigationEvent("source", str5).onNavigationEvent("source_event", str6).onWarmupCompleted()};
            int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent2, -870178991, objArr5, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
        }
        int i4 = onWarmupCompleted + 19;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.AppLovinAdServiceImplc
    public void onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        HashMap map = new HashMap();
        map.put("category", str3);
        onWarmupCompleted(str, str2, map);
        int i2 = onExtraCallback + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.AppLovinAdServiceImplc
    public void onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, Object> map) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        map.put("category", str3);
        onWarmupCompleted(str, str2, (Map<String, ? extends Object>) map);
        int i4 = onExtraCallback + 17;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
    }

    public void onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull Map<String, ? extends Object> map) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        TrackEvent.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = new TrackEvent.IAuthTabCallback("click_button").onNavigationEvent("view", str);
        Object[] objArr = new Object[1];
        a(new int[]{1822436915, 976946279, -1050600805, 385706105}, ExpandableListView.getPackedPositionType(0L) + 6, objArr);
        Object[] objArr2 = {iAuthTabCallbackOnNavigationEvent.onNavigationEvent(((String) objArr[0]).intern(), str2).IAuthTabCallback(map).onWarmupCompleted()};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, objArr2, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
        int i2 = onWarmupCompleted + 23;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 38 / 0;
        }
    }

    @Override // o.AppLovinAdServiceImplc
    public void onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, ? extends Object> map) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        TrackEvent.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = new TrackEvent.IAuthTabCallback("click_conversion").onNavigationEvent("view", str);
        Object[] objArr = new Object[1];
        a(new int[]{-71012904, 742130437, -1050600805, 385706105}, 7 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        Object[] objArr2 = {iAuthTabCallbackOnNavigationEvent.onNavigationEvent(((String) objArr[0]).intern(), str2).onNavigationEvent("category", str3).IAuthTabCallback(map).onWarmupCompleted()};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, objArr2, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
        int i2 = onWarmupCompleted + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.AppLovinAdServiceImplc
    public void IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Object[] objArr = {new TrackEvent.IAuthTabCallback("click_share").onNavigationEvent("view", str).onNavigationEvent("category", str2).onNavigationEvent("method", str3).onNavigationEvent("from", str4).onWarmupCompleted()};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, objArr, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
        int i2 = onWarmupCompleted + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // o.AppLovinAdServiceImplc
    public void onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, ? extends Object> map) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        TrackEvent.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = new TrackEvent.IAuthTabCallback("act_conversion").onNavigationEvent("view", str).onNavigationEvent("category", str2).onNavigationEvent("act", str3);
        Object[] objArr = new Object[1];
        a(new int[]{-71012904, 742130437, -1050600805, 385706105}, KeyEvent.normalizeMetaState(0) + 6, objArr);
        Object[] objArr2 = {iAuthTabCallbackOnNavigationEvent.onNavigationEvent(((String) objArr[0]).intern(), str3).IAuthTabCallback(map).onWarmupCompleted()};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, objArr2, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
        int i2 = onWarmupCompleted + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.AppLovinAdServiceImplc
    public void onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @Nullable Map<String, Object> map) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (map == null) {
            map = new LinkedHashMap<>();
            int i4 = onWarmupCompleted + 57;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        onExtraCallback(str, str2, "exchange_keb", map);
    }

    @Override // o.AppLovinAdServiceImplc
    public void onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = {new TrackEvent.IAuthTabCallback(str).onNavigationEvent("view", str2).onNavigationEvent("category", "exchange_keb").IAuthTabCallback(map).onWarmupCompleted()};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, objArr, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
        int i2 = onWarmupCompleted + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // o.AppLovinAdServiceImplc
    public void onExtraCallback(@NotNull String str, @Nullable Map<String, String> map) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        TrackEvent.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = new TrackEvent.IAuthTabCallback("click_button").onNavigationEvent("view", str).onNavigationEvent("category", "dashboard").onNavigationEvent("service", "dashboard");
        Object[] objArr = new Object[1];
        a(new int[]{1822436915, 976946279, -1050600805, 385706105}, 6 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        Object[] objArr2 = {iAuthTabCallbackOnNavigationEvent.onNavigationEvent(((String) objArr[0]).intern(), "button_transfer").onNavigationEvent("option", "transfer").onNavigationEvent("TOSSB", "N").onNavigationEvent("version", 4).IAuthTabCallback(map).onWarmupCompleted()};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, objArr2, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
        int i2 = onExtraCallback + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // o.AppLovinAdServiceImplc
    public void IAuthTabCallback(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Bundle bundle = new Bundle();
        bundle.putString("view", str);
        bundle.putString("label", "credit_detail_recommend");
        Object[] objArr = new Object[1];
        a(new int[]{253462418, -208649634, 1347965888, -661364306}, 4 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
        bundle.putString(((String) objArr[0]).intern(), "loan");
        bundle.putString("service_id", "29");
        bundle.putString("category", "credit_detail");
        TrackEvent.IAuthTabCallback iAuthTabCallback = new TrackEvent.IAuthTabCallback("service_banner_click");
        Object[] objArr2 = {ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted, bundle};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        Object[] objArr3 = {iAuthTabCallback.IAuthTabCallback((Map) ReactNativeFeatureFlagsCxxInterop.IAuthTabCallback(objArr2, -1950666116, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted, 1950666117, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted())).onWarmupCompleted()};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, objArr3, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
        int i2 = onExtraCallback + 57;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 12 / 0;
        }
    }
}
