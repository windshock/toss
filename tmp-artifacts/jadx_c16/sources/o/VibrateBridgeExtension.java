package o;

import android.content.Context;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.common.collect.Synchronized;
import im.toss.features.cardissue.event.view.EventInfoUtilKt$;
import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class VibrateBridgeExtension {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int[] onNavigationEvent = {1517714956, -145658947, -1334479778, 1294343087, -1298549745, -644695672, 1871842121, 2119455026, -1966312132, 1316127378, 939129228, -155684295, 1629395088, 1611390673, 506346036, -2073943325, 547508026, -1669435086};

    public static /* synthetic */ Unit onExtraCallback(String str, SystemSettingFieldGroup3 systemSettingFieldGroup3, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(str, systemSettingFieldGroup3, setDetectableSize);
        }
        onNavigationEvent(str, systemSettingFieldGroup3, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(SystemSettingFieldGroup3 systemSettingFieldGroup3, String str, long j, Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(systemSettingFieldGroup3, str, j, function0, view);
        if (i3 == 0) {
            throw null;
        }
    }

    private static final void onWarmupCompleted(SystemSettingFieldGroup3 systemSettingFieldGroup3, String str, long j, Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(systemSettingFieldGroup3, str, j);
            function0.invoke();
        } else {
            IAuthTabCallback(systemSettingFieldGroup3, str, j);
            function0.invoke();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final void IAuthTabCallback(SystemSettingFieldGroup3 systemSettingFieldGroup3, String str, long j) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(j, false, (String) null, (Map) null, new EventInfoUtilKt$.ExternalSyntheticLambda0(str, systemSettingFieldGroup3), 14, (Object) null);
        int i2 = onExtraCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 94 / 0;
        }
    }

    private static final Unit onNavigationEvent(String str, SystemSettingFieldGroup3 systemSettingFieldGroup3, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new int[]{1172260980, -465024148, 365919160, 647288681}, 8 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        setDetectableSize.onExtraCallback("year_month", systemSettingFieldGroup3.onExtraCallback());
        setDetectableSize.onExtraCallback("item_title", systemSettingFieldGroup3.IAuthTabCallbackDefault());
        setDetectableSize.onExtraCallback("event_id", Integer.valueOf(systemSettingFieldGroup3.onNavigationEvent()));
        SystemSettingFieldGroup1 systemSettingFieldGroup1OnTransact = systemSettingFieldGroup3.onTransact();
        String providerName = null;
        if (systemSettingFieldGroup1OnTransact != null) {
            int i4 = onExtraCallback + 43;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                systemSettingFieldGroup1OnTransact.getProviderName();
                throw null;
            }
            providerName = systemSettingFieldGroup1OnTransact.getProviderName();
        }
        setDetectableSize.onExtraCallback("company_name", providerName);
        setDetectableSize.onExtraCallback("company", systemSettingFieldGroup3.asInterface());
        String lowerCase = systemSettingFieldGroup3.IAuthTabCallback().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        setDetectableSize.onExtraCallback("card_type", lowerCase);
        return Unit.INSTANCE;
    }

    public static final View onNavigationEvent(@NotNull ViewGroup viewGroup, @Nullable String str, @NotNull SystemSettingFieldGroup3 systemSettingFieldGroup3, long j, @NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(systemSettingFieldGroup3, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        if (systemSettingFieldGroup3.IAuthTabCallback() != enableTabBar.ALL) {
            tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.CUSTOM);
            int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            LinearLayout linearLayout = (LinearLayout) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View}, 1391718, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1391704, iOnNavigationEvent, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
            if (linearLayout != null) {
                TdsBadgeV1View.onExtraCallbackWithResult onextracallbackwithresult = new TdsBadgeV1View.onExtraCallbackWithResult((TdsBadgeV1View.onWarmupCompleted) null, (TdsBadgeV1View.onExtraCallback) null, (TdsBadgeV1View.IAuthTabCallback) null, 7, (DefaultConstructorMarker) null);
                Context context2 = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                TdsBadgeV1View tdsBadgeV1View = new TdsBadgeV1View(context2);
                tdsBadgeV1View.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                tdsBadgeV1View.setTheme(onextracallbackwithresult);
                tdsBadgeV1View.setTheme(new TdsBadgeV1View.onExtraCallbackWithResult(systemSettingFieldGroup3.onWarmupCompleted(), TdsBadgeV1View.onExtraCallback.WEAK_ROUND, TdsBadgeV1View.IAuthTabCallback.SMALL));
                Context context3 = tdsBadgeV1View.getContext();
                Integer numOnExtraCallbackWithResult = systemSettingFieldGroup3.onExtraCallbackWithResult();
                if (numOnExtraCallbackWithResult != null) {
                    tdsBadgeV1View.setText(context3.getString(numOnExtraCallbackWithResult.intValue()));
                }
                setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBadgeV1View);
                int i2 = onExtraCallback + 107;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
            }
        }
        tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1A);
        tdsListRowV1View.setCenterText1(systemSettingFieldGroup3.IAuthTabCallbackDefault());
        tdsListRowV1View.setRightArrow(true);
        tdsListRowV1View.setOnClickListener(new EventInfoUtilKt$.ExternalSyntheticLambda1(systemSettingFieldGroup3, str, j, function0));
        setProxySelectorokhttp.onExtraCallbackWithResult(viewGroup, tdsListRowV1View);
        int i4 = onExtraCallbackWithResult + 113;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return tdsListRowV1View;
        }
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onNavigationEvent;
        int i4 = -1469660336;
        float f = 0.0f;
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
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 72, 8848 - View.MeasureSpec.makeMeasureSpec(0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = -1469660336;
                    f = 0.0f;
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
        int[] iArr5 = onNavigationEvent;
        if (iArr5 != null) {
            int i7 = $11 + 19;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i5] = Integer.valueOf(iArr5[i9]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", i5), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 71, 8847 - Process.getGidForName(""), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i9++;
                i5 = 0;
            }
            i2 = i5;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            for (int i10 = 0; i10 < 16; i10++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i10];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 22253), (ViewConfiguration.getTapTimeout() >> 16) + 39, 10301 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i11 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i11;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i12 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 4033), 78 - TextUtils.indexOf("", "", 0), 7397 - TextUtils.lastIndexOf("", '0'), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr2, 0, i);
        int i14 = $11 + 35;
        $10 = i14 % 128;
        if (i14 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        objArr[0] = str;
    }
}
