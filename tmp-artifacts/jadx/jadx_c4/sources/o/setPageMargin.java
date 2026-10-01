package o;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.webkit.WebView;
import androidx.core.content.ContextCompat;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import kotlin.ranges.RangesKt;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setPageMargin {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Context context = (Context) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            access000(context);
            throw null;
        }
        String strAccess000 = access000(context);
        int i3 = onNavigationEvent + 73;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return strAccess000;
    }

    public static final /* synthetic */ String IAuthTabCallback(Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(context);
        int i4 = onNavigationEvent + 9;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback_Parcel;
    }

    public static final /* synthetic */ Boolean asBinder(Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolAccess100 = access100(context);
        int i4 = onNavigationEvent + 45;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return boolAccess100;
    }

    public static final /* synthetic */ float onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        float fFloatValue = ((Float) onWarmupCompleted(GriverCommonAbilityProxyImpl.onWarmupCompleted(), -727048421, iOnWarmupCompleted2, iOnWarmupCompleted3, 727048422, iOnWarmupCompleted, new Object[]{context})).floatValue();
        int i4 = onWarmupCompleted + 99;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    public static final /* synthetic */ String onNavigationEvent(Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            asInterface(context);
            obj.hashCode();
            throw null;
        }
        String strAsInterface = asInterface(context);
        int i3 = onNavigationEvent + 47;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return strAsInterface;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Integer onWarmupCompleted(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Integer numIAuthTabCallbackStub = IAuthTabCallbackStub(context);
        int i4 = onNavigationEvent + 1;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return numIAuthTabCallbackStub;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~(i2 | i6);
        int i8 = (~i5) | (~i6);
        int i9 = (~i8) | i2;
        int i10 = (~(i6 | i5)) | (~((~i2) | i5)) | (~(i8 | i2));
        int i11 = i5 + i2 + i3 + ((-101282902) * i4) + ((-829309908) * i);
        int i12 = i11 * i11;
        int i13 = ((i5 * 42798203) - 224002048) + (42798203 * i2) + ((-1233194106) * i7) + (1828579084 * i9) + (1233194106 * i10) + ((-1190395904) * i3) + (1710751744 * i4) + ((-1643118592) * i) + ((-1134166016) * i12);
        int i14 = (i5 * 1745018779) + 1790267665 + (i2 * 1745018779) + (i7 * (-58)) + (i9 * (-116)) + (i10 * 58) + (i3 * 1745018721) + (i4 * (-1587019414)) + (i * (-1871011668)) + (i12 * 1017511936);
        return i13 + ((i14 * i14) * (-1139146752)) != 1 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
    }

    private static final Intent onTransact(Context context) {
        int i = 2 % 2;
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i2 = onNavigationEvent + 25;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 37 / 0;
        }
        return intentRegisterReceiver;
    }

    private static final Integer IAuthTabCallbackStub(Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intent intentOnTransact = onTransact(context);
        if (intentOnTransact != null) {
            int intExtra = intentOnTransact.getIntExtra("level", -1);
            int intExtra2 = intentOnTransact.getIntExtra("scale", -1);
            if (intExtra >= 0) {
                int i4 = onNavigationEvent;
                int i5 = i4 + 77;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                if (intExtra2 > 0) {
                    int i6 = i4 + 113;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    return Integer.valueOf(RangesKt.coerceIn((int) ((intExtra / intExtra2) * 100.0f), 0, 100));
                }
            }
            return null;
        }
        int i8 = onNavigationEvent + 57;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    private static final Boolean access100(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intent intentOnTransact = onTransact(context);
        if (intentOnTransact == null) {
            int i4 = onWarmupCompleted + 111;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        int intExtra = intentOnTransact.getIntExtra("status", -1);
        if (intExtra != 2) {
            if (intExtra == 3 || intExtra == 4) {
                return Boolean.FALSE;
            }
            if (intExtra != 5) {
                int i6 = onWarmupCompleted + 109;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 34 / 0;
                }
                return null;
            }
        }
        return Boolean.TRUE;
    }

    private static final String asInterface(Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AudioManager audioManager = (AudioManager) ContextCompat.getSystemService(context, AudioManager.class);
        Integer numValueOf = audioManager != null ? Integer.valueOf(audioManager.getRingerMode()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return "SOUND";
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return "VIBRATE";
        }
        if (numValueOf == null || numValueOf.intValue() != 0) {
            return "";
        }
        int i4 = onNavigationEvent + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return "SILENT";
    }

    private static final String IAuthTabCallback_Parcel(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return "DARK";
        }
        int i4 = onWarmupCompleted + 111;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return "LIGHT";
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Context context = (Context) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        float f = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        int i4 = onNavigationEvent + 117;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return Float.valueOf(f);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final String access000(Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0 ? Build.VERSION.SDK_INT >= 26 : Build.VERSION.SDK_INT >= 54) {
            PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage != null) {
                int i3 = onWarmupCompleted + 35;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return currentWebViewPackage.versionName;
            }
        }
        int i5 = onNavigationEvent + 85;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return null;
    }

    public static final /* synthetic */ String onExtraCallback(Context context) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (String) onWarmupCompleted(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1345362779, iOnWarmupCompleted2, iOnWarmupCompleted3, -1345362779, iOnWarmupCompleted, new Object[]{context});
    }

    private static final float IAuthTabCallbackDefault(Context context) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return ((Float) onWarmupCompleted(GriverCommonAbilityProxyImpl.onWarmupCompleted(), -727048421, iOnWarmupCompleted2, iOnWarmupCompleted3, 727048422, iOnWarmupCompleted, new Object[]{context})).floatValue();
    }
}
