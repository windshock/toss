package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgc;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.UST_API_SetCryptoKCMVPMode;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.tossbank.TossBankSsenStoneHandler$;
import viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneNfcTagHelper;
import viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneOtacClient;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_API_InitAPI implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    public static final String IAuthTabCallback;
    private static int[] IAuthTabCallbackDefault = null;
    public static final String IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy = 1;
    private static char IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 1;
    private static int access000;
    private static char access100;
    public static final String asBinder;
    private static final String asInterface;
    private static int extraCallback;
    private static char getInterfaceDescriptor;
    public static final String onExtraCallback;
    public static final String onExtraCallbackWithResult;
    public static final String onNavigationEvent;
    private static char onTransact;
    public static final String onWarmupCompleted;

    static {
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new int[]{1298153987, 1135484193, -1007495899, 450842975, 1940488320, 1144769492, -1693426841, 32880991, 1402257048, -109950495, -1912586296, 891682751}, 23 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        asInterface = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new int[]{414484586, -944599218, -1007495899, 450842975, -643188060, -1648945465, -717373319, -1394546187, -1693426841, 32880991, -1382024436, -1948757242}, TextUtils.getCapsMode("", 0, 0) + 24, objArr2);
        asBinder = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b(new char[]{1157, 63734, 12498, 11426, 33990, 31882, 30304, 13890, 56993, 61446, 57351, 19248, 58812, 55562, 17587, 11286, 25571, 30710, 13645, 51015, 30340, 65067, 39597, 5165}, Color.blue(0) + 24, objArr3);
        IAuthTabCallbackStub = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(new int[]{414484586, -944599218, -1007495899, 450842975, 375157493, 28291624, -717373319, -1394546187, -1693426841, 32880991, -991977877, 725153213, 1431677997, -1987671309, -1725379322, -694398476, 1510577868, -1822936289, 537172387, -549721190}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 38, objArr4);
        onExtraCallback = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(new int[]{414484586, -944599218, -1007495899, 450842975, 375157493, 28291624, -717373319, -1394546187, -1693426841, 32880991, -991977877, 725153213}, 24 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr5);
        onExtraCallbackWithResult = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        b(new char[]{1157, 63734, 12498, 11426, 33990, 31882, 30304, 13890, 25412, 9433, 30299, 2112, 25077, 12148, 12927, 62811, 1157, 63734, 39938, 31288, 28432, 15285, 52553, 38594, 45938, 28214, 16064, 43228}, TextUtils.lastIndexOf("", '0', 0, 0) + 29, objArr6);
        onNavigationEvent = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        b(new char[]{1157, 63734, 12498, 11426, 33990, 31882, 30304, 13890, 25412, 9433, 30299, 2112, 25077, 12148, 12927, 62811, 1157, 63734, 39938, 31288, 28432, 15285, 44508, 1749}, 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr7);
        onWarmupCompleted = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a(new int[]{414484586, -944599218, -1007495899, 450842975, 1506432982, 1376810201, 3370461, -1369206797, -1037080758, 1919931830, 1510317577, 1072812164, -618688825, -543960792}, (ViewConfiguration.getEdgeSlop() >> 16) + 26, objArr8);
        IAuthTabCallback = ((String) objArr8[0]).intern();
        Companion = new IAuthTabCallback(null);
        int i = extraCallback + 35;
        ICustomTabsCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ boolean IAuthTabCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = access000 + 71;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(str, str2);
        }
        onWarmupCompleted(str, str2);
        throw null;
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 41;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 41;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 79;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i6 = $10 + 81;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                int i10 = $11 + 33;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (access100 ^ 1094535280733222934L)));
                int i13 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getInterfaceDescriptor);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i3) + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionType, scrollDefaultDelay, iIndexOf, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onTransact ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback_Parcel)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getTapTimeout() >> 16)), 15 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = access000 + 59;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = IAuthTabCallbackStubProxy + 69;
        access000 = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access000 + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStubProxy + 23;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallbackWithResult;
        }
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onWarmupCompleted(str);
            throw null;
        }
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i3 = access000 + 89;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new TossBankSsenStoneHandler$.ExternalSyntheticLambda0());
        int i2 = access000 + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    private static final boolean onWarmupCompleted(String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 81;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zOnTransact = filterCreatePageParams.onTransact(Uri.parse(str));
        int i4 = IAuthTabCallbackStubProxy + 11;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final UST_CERT_ChangePrikeyPassword IAuthTabCallback(setText settext) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{1980787648, 1805971541, 1514701882, 378305792, 500907171, 1073069628}, ImageFormat.getBitsPerPixel(0) + 12, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        if (strOnNavigationEvent.length() == 0) {
            int i4 = access000 + 95;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 79 / 0;
            }
            strOnNavigationEvent = null;
        }
        return UST_CERT_ChangePrikeyPassword.Companion.onExtraCallback(strOnNavigationEvent, PlayerErrorCode.onActivityLayout());
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallbackDefault;
        int i3 = -1469660336;
        long j = 0;
        int i4 = 16;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i5 = $10 + 1;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> i4), (-16777144) - Color.rgb(0, 0, 0), 8849 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    j = 0;
                    i4 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i8 = $10 + 19;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallbackDefault;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i10])};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 72 - Color.blue(0), 8848 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i10++;
                int i11 = $11 + 101;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                i3 = -1469660336;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i13 = $10 + 45;
        $11 = i13 % 128;
        int i14 = i13 % 2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - Color.red(0)), ExpandableListView.getPackedPositionGroup(0L) + 39, 10300 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i15++;
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
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 4033), 78 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 7398 - (Process.myTid() >> 22), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r22, @org.jetbrains.annotations.NotNull java.lang.String r23, @org.jetbrains.annotations.NotNull com.google.gson.JsonObject r24, @org.jetbrains.annotations.NotNull o.setOnOutOfMemeryErrorCallback r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_API_InitAPI.onExtraCallbackWithResult(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, java.lang.String, com.google.gson.JsonObject, o.setOnOutOfMemeryErrorCallback):void");
    }

    public void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) throws Throwable {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i != 12001) {
            int i4 = IAuthTabCallbackStubProxy + 107;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                if (i != 17793) {
                    return;
                }
            } else if (i != 12002) {
                return;
            }
        }
        if (i2 == -1) {
            IAuthTabCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, jsonObject, setonoutofmemeryerrorcallback, i, intent != null ? intent.getExtras() : null);
            return;
        }
        switch (i2) {
            case 9910:
                onExtraCallback(setonoutofmemeryerrorcallback, UST_CERT_GetAuthorityInformationAccess.NFC_NOT_SUPPORTED);
                return;
            case 9911:
                onExtraCallback(setonoutofmemeryerrorcallback, UST_CERT_GetAuthorityInformationAccess.NFC_DISABLED);
                return;
            case 9912:
            case 9913:
                onExtraCallback(setonoutofmemeryerrorcallback, UST_CERT_GetAuthorityInformationAccess.MALFORMED_NFC_DATA);
                int i5 = IAuthTabCallbackStubProxy + 97;
                access000 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                bundle.hashCode();
                throw null;
            case 9914:
                onExtraCallback(setonoutofmemeryerrorcallback, UST_CERT_GetAuthorityInformationAccess.FAILED_TO_READ_UID);
                return;
            case 9915:
                onExtraCallback(setonoutofmemeryerrorcallback, UST_CERT_GetAuthorityInformationAccess.FAILED_TO_GET_ENCRYPTED_DATA);
                return;
            default:
                onExtraCallback(setonoutofmemeryerrorcallback, UST_CERT_GetAuthorityInformationAccess.USER_CANCELED);
                int i6 = IAuthTabCallbackStubProxy + 21;
                access000 = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                bundle.hashCode();
                throw null;
        }
    }

    private final void IAuthTabCallback(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, JsonObject jsonObject, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, Bundle bundle) throws Throwable {
        String string;
        String string2;
        String string3;
        String string4;
        String asString;
        String asString2;
        String asString3;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 47;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        if (bundle != null) {
            Object[] objArr = new Object[1];
            a(new int[]{460426340, 1617236396, -1983686802, 352877500, -2021602755, -551392577}, 11 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
            string = bundle.getString(((String) objArr[0]).intern());
        } else {
            string = null;
        }
        if (i == 12001 && string == null) {
            onExtraCallback(setonoutofmemeryerrorcallback, UST_CERT_GetAuthorityInformationAccess.FAILED_TO_READ_UID);
            return;
        }
        if (bundle != null) {
            Object[] objArr2 = new Object[1];
            b(new char[]{32956, 47500, 25350, 43124, 38913, 41007, 55676, 61155, 31692, 63324}, View.MeasureSpec.getSize(0) + 10, objArr2);
            string2 = bundle.getString(((String) objArr2[0]).intern());
        } else {
            string2 = null;
        }
        if (bundle != null) {
            Object[] objArr3 = new Object[1];
            b(new char[]{32956, 47500, 25350, 43124, 38913, 41007, 55676, 61155, 18211, 18584, 18681, 1668, 25718, 53913, 58530, 39574, 51554, 27040, 24445, 45197, 32640, 50495}, Gravity.getAbsoluteGravity(0, 0) + 22, objArr3);
            string3 = bundle.getString(((String) objArr3[0]).intern());
        } else {
            string3 = null;
        }
        if (i == 12002 && (string2 == null || string3 == null)) {
            onExtraCallback(setonoutofmemeryerrorcallback, UST_CERT_GetAuthorityInformationAccess.FAILED_TO_GET_ENCRYPTED_DATA);
            return;
        }
        if (bundle != null) {
            Object[] objArr4 = new Object[1];
            b(new char[]{32956, 47500, 25350, 43124, 38913, 41007, 55676, 61155, 24445, 45197, 32640, 50495}, Process.getGidForName("") + 13, objArr4);
            string4 = bundle.getString(((String) objArr4[0]).intern());
        } else {
            string4 = null;
        }
        JsonObject jsonObjectOnExtraCallbackWithResult = onExtraCallbackWithResult(string4);
        if (!SsenStoneNfcTagHelper.Companion.onWarmupCompleted(jsonObjectOnExtraCallbackWithResult)) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr5 = new Object[1];
            a(new int[]{1298153987, 1135484193, -1007495899, 450842975, 1940488320, 1144769492, -1693426841, 32880991, 1402257048, -109950495, -1912586296, 891682751}, ExpandableListView.getPackedPositionType(0L) + 24, objArr5);
            String strIntern = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            a(new int[]{2117352397, -1491633485, 1896349112, -32062264, 1959030714, 1775666275, -1475822845, 453454266, -1523064581, -2015502594}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18, objArr6);
            String strIntern2 = ((String) objArr6[0]).intern();
            Object[] objArr7 = new Object[1];
            b(new char[]{359, 63475, 7071, 33648, 46393, 51143, 34539, 11731, 64479, 17917}, (ViewConfiguration.getTapTimeout() >> 16) + 10, objArr7);
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, strIntern, strIntern2, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr7[0]).intern(), string4)), (String) null, false, (String) null, 56, (Object) null);
            onExtraCallback(setonoutofmemeryerrorcallback, UST_CERT_GetAuthorityInformationAccess.MALFORMED_NFC_DATA);
            return;
        }
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context == null) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr8 = new Object[1];
            a(new int[]{1298153987, 1135484193, -1007495899, 450842975, 1940488320, 1144769492, -1693426841, 32880991, 1402257048, -109950495, -1912586296, 891682751}, 24 - ((Process.getThreadPriority(0) + 20) >> 6), objArr8);
            String strIntern3 = ((String) objArr8[0]).intern();
            Object[] objArr9 = new Object[1];
            b(new char[]{60359, 37404, 40310, 64697, 47585, 13071, 27557, 46259, 56054, 54485, 24024, 56583, 19316, 40101, 11579, 63043, 52365, 24875, 32486, 43770, 56770, 25812, 5946, 10595, 8297, 59396, 46393, 51143, 57489, 36001, 1629, 8715, 16064, 43228, 51441, 12306}, 35 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr9);
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray2, strIntern3, ((String) objArr9[0]).intern(), null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            onExtraCallback(setonoutofmemeryerrorcallback, UST_CERT_GetAuthorityInformationAccess.UNKNOWN_ERROR);
            return;
        }
        setText settext = new setText(jsonObject);
        UST_CERT_ChangePrikeyPassword uST_CERT_ChangePrikeyPasswordIAuthTabCallback = IAuthTabCallback(settext);
        Object[] objArr10 = new Object[1];
        b(new char[]{48738, 50511, 62294, 57507, 61662, 58712, 50867, 55924}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7, objArr10);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr10[0]).intern(), "");
        String str = string3;
        Object[] objArr11 = new Object[1];
        a(new int[]{-479637273, 811900915, 1562781451, -207516472, -257628722, -78938117, -984667466, 484139229}, 15 - TextUtils.getOffsetAfter("", 0), objArr11);
        String str2 = string2;
        Pair<Boolean, JsonObject> pairOnNavigationEvent = onNavigationEvent(context, uST_CERT_ChangePrikeyPasswordIAuthTabCallback, strOnNavigationEvent, jsonObjectOnExtraCallbackWithResult, settext.onNavigationEvent(((String) objArr11[0]).intern(), ""));
        boolean zBooleanValue = ((Boolean) pairOnNavigationEvent.onExtraCallbackWithResult()).booleanValue();
        JsonObject jsonObject2 = (JsonObject) pairOnNavigationEvent.IAuthTabCallback();
        if (zBooleanValue) {
            int i5 = access000 + 31;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr12 = new Object[1];
            a(new int[]{-539927007, -648993377}, 4 - TextUtils.indexOf("", "", 0, 0), objArr12);
            jsonObject2.add(((String) objArr12[0]).intern(), jsonObjectOnExtraCallbackWithResult);
            Object[] objArr13 = new Object[1];
            b(new char[]{31569, 40747}, 2 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr13);
            String strIntern4 = ((String) objArr13[0]).intern();
            Object[] objArr14 = new Object[1];
            a(new int[]{1298199578, -1988019739}, (ViewConfiguration.getTapTimeout() >> 16) + 1, objArr14);
            jsonObject2.addProperty(strIntern4, getEmbedViewManager.onExtraCallbackWithResult(jsonObjectOnExtraCallbackWithResult, ((String) objArr14[0]).intern()));
            if (i == 12001) {
                Object[] objArr15 = new Object[1];
                b(new char[]{31416, 15070, 13387, 5928}, 3 - Color.red(0), objArr15);
                jsonObject2.addProperty(((String) objArr15[0]).intern(), string);
            } else if (i == 12002) {
                Object[] objArr16 = new Object[1];
                b(new char[]{44772, 64979}, View.MeasureSpec.makeMeasureSpec(0, 0) + 2, objArr16);
                jsonObject2.addProperty(((String) objArr16[0]).intern(), str2);
                Object[] objArr17 = new Object[1];
                a(new int[]{2000088789, -542769775, -425393532, 487401922, 1522284856, 1127887645, 210129665, -558129486}, (ViewConfiguration.getPressedStateDuration() >> 16) + 13, objArr17);
                jsonObject2.addProperty(((String) objArr17[0]).intern(), str);
            }
            ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, jsonObject2);
            return;
        }
        Object[] objArr18 = new Object[1];
        b(new char[]{2152, 290, 12498, 11426, 3667, 4425, 50867, 55924}, 7 - ExpandableListView.getPackedPositionType(0L), objArr18);
        JsonElement jsonElement = jsonObject2.get(((String) objArr18[0]).intern());
        if (jsonElement != null) {
            int i7 = IAuthTabCallbackStubProxy + 41;
            access000 = i7 % 128;
            int i8 = i7 % 2;
            asString = jsonElement.getAsString();
        } else {
            asString = null;
        }
        Object[] objArr19 = new Object[1];
        a(new int[]{2009942535, -1884700548}, 4 - (Process.myPid() >> 22), objArr19);
        JsonElement jsonElement2 = jsonObject2.get(((String) objArr19[0]).intern());
        if (jsonElement2 != null) {
            int i9 = IAuthTabCallbackStubProxy + 5;
            access000 = i9 % 128;
            int i10 = i9 % 2;
            asString2 = jsonElement2.getAsString();
        } else {
            asString2 = null;
        }
        Map mapOnExtraCallback = access8100.onExtraCallback();
        Object[] objArr20 = new Object[1];
        a(new int[]{-547059331, 249370444, 733439284, 607847835, -1053450851, 887668129}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 9, objArr20);
        JsonElement jsonElement3 = jsonObject2.get(((String) objArr20[0]).intern());
        if (jsonElement3 != null && (asString3 = jsonElement3.getAsString()) != null) {
            int i11 = access000 + 99;
            IAuthTabCallbackStubProxy = i11 % 128;
            if (i11 % 2 == 0) {
                Object[] objArr21 = new Object[1];
                a(new int[]{-547059331, 249370444, 733439284, 607847835, -1053450851, 887668129}, 74 % (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr21);
                mapOnExtraCallback.put(((String) objArr21[0]).intern(), asString3);
            } else {
                Object[] objArr22 = new Object[1];
                a(new int[]{-547059331, 249370444, 733439284, 607847835, -1053450851, 887668129}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 8, objArr22);
                mapOnExtraCallback.put(((String) objArr22[0]).intern(), asString3);
            }
        }
        Unit unit = Unit.INSTANCE;
        setonoutofmemeryerrorcallback.onExtraCallbackWithResult(asString, asString2, access8100.onExtraCallbackWithResult(mapOnExtraCallback));
        int i12 = IAuthTabCallbackStubProxy + 105;
        access000 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Pair<Boolean, JsonObject> onNavigationEvent(Context context, UST_CERT_ChangePrikeyPassword uST_CERT_ChangePrikeyPassword, String str, JsonObject jsonObject, String str2) throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        b(new char[]{21019, 33755, 57351, 19248}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3, objArr);
        if (!Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
            int i2 = access000 + 19;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr2 = new Object[1];
            b(new char[]{21019, 33755, 52689, 64261, 51716, 20555, 359, 63475, 24993, 52566, 13645, 51015}, 12 - TextUtils.getCapsMode("", 0, 0), objArr2);
            if (!Intrinsics.areEqual(str, ((String) objArr2[0]).intern())) {
                UST_API_SetCryptoKCMVPMode uST_API_SetCryptoKCMVPModeOnWarmupCompleted = SsenStoneOtacClient.onWarmupCompleted.onWarmupCompleted(context, uST_CERT_ChangePrikeyPassword, jsonObject, str2);
                if (!(uST_API_SetCryptoKCMVPModeOnWarmupCompleted instanceof UST_API_SetCryptoKCMVPMode.IAuthTabCallback)) {
                    if (uST_API_SetCryptoKCMVPModeOnWarmupCompleted instanceof UST_API_SetCryptoKCMVPMode.onExtraCallback) {
                        return getWrite.IAuthTabCallback(Boolean.FALSE, onExtraCallback((UST_API_SetCryptoKCMVPMode.onExtraCallback) uST_API_SetCryptoKCMVPModeOnWarmupCompleted));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                Boolean bool = Boolean.TRUE;
                JsonObject jsonObject2 = new JsonObject();
                Object[] objArr3 = new Object[1];
                b(new char[]{16937, 26630, 62829, 26790}, View.combineMeasuredStates(0, 0) + 4, objArr3);
                jsonObject2.addProperty(((String) objArr3[0]).intern(), ((UST_API_SetCryptoKCMVPMode.IAuthTabCallback) uST_API_SetCryptoKCMVPModeOnWarmupCompleted).onWarmupCompleted());
                Object[] objArr4 = new Object[1];
                a(new int[]{-479637273, 811900915, 1562781451, -207516472, -257628722, -78938117, -984667466, 484139229}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16, objArr4);
                jsonObject2.addProperty(((String) objArr4[0]).intern(), str2);
                Pair<Boolean, JsonObject> pairIAuthTabCallback = getWrite.IAuthTabCallback(bool, jsonObject2);
                int i4 = access000 + 55;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 67 / 0;
                }
                return pairIAuthTabCallback;
            }
        }
        UST_API_SetCryptoKCMVPMode uST_API_SetCryptoKCMVPModeIAuthTabCallback = SsenStoneOtacClient.onWarmupCompleted.IAuthTabCallback(context);
        if (!(uST_API_SetCryptoKCMVPModeIAuthTabCallback instanceof UST_API_SetCryptoKCMVPMode.IAuthTabCallback)) {
            if (!(uST_API_SetCryptoKCMVPModeIAuthTabCallback instanceof UST_API_SetCryptoKCMVPMode.onExtraCallback)) {
                throw new NoWhenBranchMatchedException();
            }
            int i6 = IAuthTabCallbackStubProxy + 15;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            return getWrite.IAuthTabCallback(Boolean.FALSE, onExtraCallback((UST_API_SetCryptoKCMVPMode.onExtraCallback) uST_API_SetCryptoKCMVPModeIAuthTabCallback));
        }
        Boolean bool2 = Boolean.TRUE;
        JsonObject jsonObject3 = new JsonObject();
        Object[] objArr5 = new Object[1];
        b(new char[]{48738, 50511, 4542, 18725, 6584, 16402, 36989, 50460, 55791, 47656}, 10 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr5);
        jsonObject3.addProperty(((String) objArr5[0]).intern(), ((UST_API_SetCryptoKCMVPMode.IAuthTabCallback) uST_API_SetCryptoKCMVPModeIAuthTabCallback).onWarmupCompleted());
        return getWrite.IAuthTabCallback(bool2, jsonObject3);
    }

    private final void onExtraCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, UST_CERT_GetAuthorityInformationAccess uST_CERT_GetAuthorityInformationAccess) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, uST_CERT_GetAuthorityInformationAccess.getCode(), uST_CERT_GetAuthorityInformationAccess.getCode(), (Map) null, 2, (Object) null);
        } else {
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, uST_CERT_GetAuthorityInformationAccess.getCode(), uST_CERT_GetAuthorityInformationAccess.getCode(), (Map) null, 4, (Object) null);
        }
    }

    private final JsonObject onExtraCallbackWithResult(String str) {
        Object obj;
        int i = 2 % 2;
        int i2 = access000 + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (i2 % 2 != 0) {
            Result.Companion companion2 = Result.Companion;
            Gson gsonOnExtraCallback = ALCEyeBlink.onExtraCallback();
            if (str == null) {
                int i3 = IAuthTabCallbackStubProxy + 121;
                access000 = i3 % 128;
                int i4 = i3 % 2;
                str = "";
            }
            obj = Result.constructor-impl((JsonObject) gsonOnExtraCallback.fromJson(str, JsonObject.class));
            JsonObject jsonObject = new JsonObject();
            if (Result.onExtraCallback(obj)) {
                obj = jsonObject;
            }
            return (JsonObject) obj;
        }
        Result.Companion companion3 = Result.Companion;
        ALCEyeBlink.onExtraCallback();
        throw null;
    }

    private final JsonObject onExtraCallback(UST_API_SetCryptoKCMVPMode.onExtraCallback onextracallback) throws Throwable {
        int i = 2 % 2;
        JsonObject jsonObject = new JsonObject();
        Object[] objArr = new Object[1];
        a(new int[]{2009942535, -1884700548}, 4 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        jsonObject.addProperty(((String) objArr[0]).intern(), onextracallback.IAuthTabCallback().getCode());
        String strOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult != null) {
            Object[] objArr2 = new Object[1];
            b(new char[]{2152, 290, 12498, 11426, 3667, 4425, 50867, 55924}, Color.green(0) + 7, objArr2);
            jsonObject.addProperty(((String) objArr2[0]).intern(), strOnExtraCallbackWithResult);
        }
        String strOnExtraCallback = onextracallback.onExtraCallback();
        if (strOnExtraCallback != null) {
            int i2 = IAuthTabCallbackStubProxy + 23;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr3 = new Object[1];
            a(new int[]{-547059331, 249370444, 733439284, 607847835, -1053450851, 887668129}, Color.argb(0, 0, 0, 0) + 9, objArr3);
            jsonObject.addProperty(((String) objArr3[0]).intern(), strOnExtraCallback);
        }
        int i4 = IAuthTabCallbackStubProxy + 91;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return jsonObject;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    static void onWarmupCompleted() {
        IAuthTabCallbackDefault = new int[]{1882554964, 79776085, 248901609, 496171463, 1604790560, 744697231, 1316362875, -444013387, -822843552, -1598812243, -1072772312, 954395885, 210681962, -693464581, -569556983, 436383107, -2053047806, 37046534};
        onTransact = (char) 22730;
        IAuthTabCallback_Parcel = (char) 52470;
        access100 = (char) 61284;
        getInterfaceDescriptor = (char) 54525;
    }
}
