package com.tnkfactory.ad.rwd;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tnkfactory.ad.Logger;
import com.tnkfactory.ad.TnkAdConfig;
import com.tnkfactory.ad.e.i;
import com.tnkfactory.ad.rwd.data.constants.Gdpr;
import com.tnkfactory.framework.vo.ValueObject;
import j$.util.DesugarTimeZone;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class Settings {
    public static final String ADITEM_PREFIX = "__tnk_aditem_v4_";
    public static final String DEFAUL_ACTION_NAME_FOR_INSTALL = "__tnk_install_";
    public static final String DEFAUL_ACTION_NAME_FOR_START = "__tnk_start_";
    public static final String DEFAUL_ACTION_NAME_FOR_VIDEO = "__tnk_video_";
    public static final Settings INSTANCE;
    public static final TimeZone a;
    public static final String b;
    private static int onExtraCallback;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {69, -38, -90, 81};
    private static final int $$b = 40;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b2, int i2) {
        int i3;
        int i4 = (s * 3) + 105;
        int i5 = b2 + 4;
        int i6 = i2 * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i4 += -i7;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i3++;
            i5++;
            i7 = bArr[i5];
            i4 += -i7;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    static {
        onExtraCallback = 1;
        onWarmupCompleted();
        INSTANCE = new Settings();
        Object[] objArr = new Object[1];
        c((ViewConfiguration.getKeyRepeatDelay() >> 16) + 10, 10 - TextUtils.indexOf("", "", 0), new char[]{14, 23, 17, 7, 65525, 65489, 3, 11, 21, 65507}, true, (KeyEvent.getMaxKeyCode() >> 16) + 184, objArr);
        TimeZone timeZone = DesugarTimeZone.getTimeZone(((String) objArr[0]).intern());
        Intrinsics.checkNotNullExpressionValue(timeZone, "");
        a = timeZone;
        b = "__placement_id__";
        int i2 = onNavigationEvent + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void clearAdItem(@NotNull Context context, @NotNull String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        getPreference(context).edit().putString(ADITEM_PREFIX + str, null).apply();
        int i3 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void clearAll(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            getPreference(context).edit().clear().apply();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        getPreference(context).edit().clear().apply();
        int i4 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean getAdWallReload(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        boolean z = getPreference(context).getBoolean("__tnk_30006_", false);
        int i5 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final long getAdWallReloadTime(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
        } else {
            Intrinsics.checkNotNullParameter(context, "");
        }
        long j = getPreference(context).getLong("__tnk_30007_", 0L);
        int i4 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final int getAdWallStyle(@NotNull Context context, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        int i4 = getPreference(context).getInt("__tnk_30022_" + i2, 0);
        int i5 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final String getAdid(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            getPreference(context).getString("__tnk_40016_", "00000000000000000000000000000000");
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        String string = getPreference(context).getString("__tnk_40016_", "00000000000000000000000000000000");
        if (string != null) {
            return string;
        }
        int i4 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return "00000000000000000000000000000000";
    }

    public final long getAdwallStartTime(@NotNull Context context) {
        SharedPreferences preference;
        long j;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            preference = getPreference(context);
            j = 1;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            preference = getPreference(context);
            j = 0;
        }
        long j2 = preference.getLong("__tnk_2408_0001_", j);
        int i4 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return j2;
    }

    public final String getApplicationId(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        String string = getPreference(context).getString("__tnk_20001_", "");
        if (string != null) {
            return string;
        }
        int i5 = onExtraCallbackWithResult;
        int i6 = i5 + 99;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 83;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return "";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getCOPPA(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        int i5 = getPreference(context).getInt("__tnk_50005_", 0);
        int i6 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getCampaignTypeJsonString(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            getPreference(context).getString("__tnk_2306_0002_", "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        String string = getPreference(context).getString("__tnk_2306_0002_", "");
        if (string != null) {
            return string;
        }
        int i4 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return "";
    }

    public final String getCampaignTypeUrl(@NotNull Context context) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        String string = getPreference(context).getString("__tnk_2306_0001_", "");
        if (string != null) {
            return string;
        }
        int i3 = IAuthTabCallback;
        int i4 = i3 + 37;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 85;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 50 / 0;
        }
        return "";
    }

    public final long getEarnPoint(@NotNull Context context) {
        SharedPreferences preference;
        long j;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            preference = getPreference(context);
            j = 1;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            preference = getPreference(context);
            j = 0;
        }
        return preference.getLong("__tnk_2308_0001_", j);
    }

    public final long getEarnPointCPS(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        long j = getPreference(context).getLong("__tnk_2308_0002_", 0L);
        int i5 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getEventDisableTime(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
        } else {
            Intrinsics.checkNotNullParameter(context, "");
        }
        int i4 = getPreference(context).getInt("__tnk_2301_0003_", 0);
        int i5 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
        return i4;
    }

    public final long getFirstActionMillis(@NotNull Context context, @NotNull String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        long j = getPreference(context).getLong("__tnk_40009_" + str, 0L);
        int i3 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return j;
    }

    public final int getGDPR(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        int i5 = getPreference(context).getInt("__tnk_50006_", Gdpr.INSTANCE.getGDPR_CONSENT_UNKNOWN());
        int i6 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 9 / 0;
        }
        return i5;
    }

    public final boolean getHaveReferrer(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
        } else {
            Intrinsics.checkNotNullParameter(context, "");
        }
        boolean z = getPreference(context).getBoolean("__tnk_30015_", false);
        int i4 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final long getInstallPayAppId(@NotNull Context context, @NotNull String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        long j = getPreference(context).getLong("__tnk_pkg_" + str, 0L);
        int i3 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return j;
    }

    public final long getLastAttendTime(@NotNull Context context, long j) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        long j2 = getPreference(context).getLong("tnk_v2_atnd_" + j, 0L);
        int i3 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 38 / 0;
        }
        return j2;
    }

    public final long getLastImageCachePurgeMillis(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        long j = getPreference(context).getLong("__tnk_40018_", 0L);
        int i5 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long getLastTimeAppExecuted(@NotNull Context context) {
        SharedPreferences preference;
        long j;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            preference = getPreference(context);
            j = 1;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            preference = getPreference(context);
            j = 0;
        }
        return preference.getLong("__tnk_30001_", j);
    }

    public final String getPLACEMENT_ID() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 29;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        String str = b;
        int i6 = i3 + 71;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r1 = com.tnkfactory.ad.rwd.Settings.IAuthTabCallback + 121;
        com.tnkfactory.ad.rwd.Settings.onExtraCallbackWithResult = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        r4 = com.tnkfactory.ad.rwd.Settings.IAuthTabCallback + 67;
        com.tnkfactory.ad.rwd.Settings.onExtraCallbackWithResult = r4 % 128;
        r4 = r4 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getPlacementId(@NotNull Context context) {
        String string;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            string = getPreference(context).getString(b, "");
            int i4 = 8 / 0;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            string = getPreference(context).getString(b, "");
        }
    }

    public final SharedPreferences getPreference(@NotNull Context context) {
        int i2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            i2 = 1;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            i2 = 0;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("__tnk_ad__", i2);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        return sharedPreferences;
    }

    public final long getReceiveAppId(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        long j = getPreference(context).getLong("__tnk_2301_0002_", 0L);
        int i5 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getReferrer(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        int i5 = getPreference(context).getInt("__tnk_30013_", 0);
        int i6 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 91 / 0;
        }
        return i5;
    }

    public final long getReferrerClickTime(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        long j = getPreference(context).getLong("__tnk_30026_", 0L);
        int i5 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long getReferrerInstallTime(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        long j = getPreference(context).getLong("__tnk_30027_", 0L);
        int i5 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String getSnsIdReferrer(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        String string = getPreference(context).getString("__tnk_30016_", null);
        int i5 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final int getUserAge(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        int i5 = getPreference(context).getInt("__tnk_50002_", 0);
        int i6 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final String getUserCat(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        String string = getPreference(context).getString("__tnk_50003_", null);
        int i5 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 43 / 0;
        }
        return string;
    }

    public final String getUserCatExt(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            return getPreference(context).getString("__tnk_50004_", null);
        }
        Intrinsics.checkNotNullParameter(context, "");
        getPreference(context).getString("__tnk_50004_", null);
        obj.hashCode();
        throw null;
    }

    public final long getUserJoinedAppId(@NotNull Context context, @NotNull String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        long j = getPreference(context).getLong("tnk_v2_pkg_" + str, 0L);
        int i3 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long getUserJoinedMillis(@NotNull Context context, long j) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        long j2 = getPreference(context).getLong("tnk_v2_join_" + j, 0L);
        int i3 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return j2;
    }

    public final String getUserSex(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(context, "");
                return getPreference(context).getString("__tnk_50001_", "");
            }
            Intrinsics.checkNotNullParameter(context, "");
            getPreference(context).getString("__tnk_50001_", "");
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final int isMultiJoinMessage(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        int i5 = getPreference(context).getInt("__tnk_2301_0001_", 0);
        int i6 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final boolean isNewsTooltipEnable(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
        } else {
            Intrinsics.checkNotNullParameter(context, "");
        }
        return getPreference(context).getBoolean("__tnk_2304_0001_", true);
    }

    public final boolean isReferrerDone(@NotNull Context context) {
        SharedPreferences preference;
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            preference = getPreference(context);
            z = true;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            preference = getPreference(context);
            z = false;
        }
        boolean z2 = preference.getBoolean("__tnk_40010_", z);
        int i4 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return z2;
    }

    public final boolean isTutorial(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
        } else {
            Intrinsics.checkNotNullParameter(context, "");
        }
        return getPreference(context).getBoolean("__tnk_30028_", false);
    }

    public final void setAdItem(@NotNull Context context, @NotNull String str, @Nullable byte[] bArr) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        getPreference(context).edit().putString(ADITEM_PREFIX + str, Utils.toHexString(bArr)).apply();
        int i3 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setPlacementId(@NotNull Context context, @NotNull String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 25;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        getPreference(context).edit().putString(b, str).apply();
        int i5 = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
    }

    public final boolean isPayedApp(@NotNull Context context, @NotNull String str, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        boolean zAreEqual = Intrinsics.areEqual("_", getPreference(context).getString(i2 + "__tnk_payed_app_" + str, ""));
        int i4 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zAreEqual;
    }

    public final String getUserJoinedAppMarketInfo(@NotNull Context context, long j) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        String string = getPreference(context).getString("0__tnk_payed_app_" + j, "");
        Object obj = null;
        if (!Intrinsics.areEqual(string, "")) {
            int i3 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (!Intrinsics.areEqual(string, "_")) {
                int i5 = onExtraCallbackWithResult + 57;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return string;
                }
                obj.hashCode();
                throw null;
            }
        }
        return null;
    }

    public final boolean isAdRecommendPopupDisableToday(@NotNull Context context) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (Calendar.getInstance().get(6) != getPreference(context).getInt("__tnk_2507_0001_", 0)) {
            int i3 = onExtraCallbackWithResult + 43;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        int i5 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void saveCampaignTypeJsonString(@NotNull Context context, @NotNull String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        getPreference(context).edit().putString("__tnk_2306_0002_", str).apply();
        int i5 = IAuthTabCallback + 61;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void saveCampaignTypeUrl(@NotNull Context context, @NotNull String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            getPreference(context).edit().putString("__tnk_2306_0001_", str).apply();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        getPreference(context).edit().putString("__tnk_2306_0001_", str).apply();
        int i4 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void setLastTimeInterstitalShow(@NotNull Context context, @NotNull String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        getPreference(context).edit().putLong("__tnk_fadlast_" + str, System.currentTimeMillis()).apply();
        int i3 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setMediaUserName(@NotNull Context context, @NotNull String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        getPreference(context).edit().putString("__tnk_add_md_user_nm__", str).putString("__tnk_30017_", Utils.md5Hex(str + TnkCore.INSTANCE.getENCRYPT_KEY_STR())).apply();
        int i3 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    public final byte[] getAdItemBytes(@NotNull Context context, @NotNull String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        String string = getPreference(context).getString(ADITEM_PREFIX + str, null);
        if (Utils.isNull(string)) {
            int i3 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        byte[] hexBytes = Utils.toHexBytes(string);
        int i4 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return hexBytes;
    }

    public final boolean isAgreePrivacy(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            TnkAdConfig.INSTANCE.getUseTermsPopup();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        if (!TnkAdConfig.INSTANCE.getUseTermsPopup()) {
            return true;
        }
        boolean z = getPreference(context).getBoolean("__tnk_30019_", false);
        int i4 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final void setAdid(@NotNull Context context, @NotNull String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        SharedPreferences preference = getPreference(context);
        Object obj = null;
        if (Intrinsics.areEqual(str, preference.getString("__tnk_40016_", null))) {
            return;
        }
        int i5 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        preference.edit().putString("__tnk_40016_", str).apply();
        if (i6 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void setUserAge(@NotNull Context context, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        SharedPreferences preference = getPreference(context);
        if (i2 != preference.getInt("__tnk_50002_", 0)) {
            preference.edit().putInt("__tnk_50002_", i2).apply();
            int i4 = IAuthTabCallback + 37;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 4;
            }
        }
        int i6 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void setUserCat(@NotNull Context context, @NotNull String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        SharedPreferences preference = getPreference(context);
        if (!(!Intrinsics.areEqual(preference.getString("__tnk_50003_", ""), str))) {
            return;
        }
        int i3 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        preference.edit().putString("__tnk_50003_", str).apply();
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setUserCatExt(@NotNull Context context, @NotNull String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        SharedPreferences preference = getPreference(context);
        if (Intrinsics.areEqual(preference.getString("__tnk_50004_", ""), str)) {
            return;
        }
        int i3 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        preference.edit().putString("__tnk_50004_", str).apply();
        int i5 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void addPayedApp(@NotNull Context context, @NotNull String str, int i2, @NotNull String str2, @Nullable String str3) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        SharedPreferences.Editor editorPutString = getPreference(context).edit().putString(i2 + "__tnk_payed_app_" + str, "_");
        StringBuilder sb = new StringBuilder();
        sb.append("__tnk_pkg_");
        sb.append(str3);
        editorPutString.remove(sb.toString()).putLong("__tnk_40009_" + str2, System.currentTimeMillis()).apply();
        int i4 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setUserSex(@NotNull Context context, @NotNull String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.areEqual(str, "M");
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.areEqual(str, "M") || Intrinsics.areEqual(str, "F")) {
            SharedPreferences preference = getPreference(context);
            if (Intrinsics.areEqual(preference.getString("__tnk_50001_", ""), str)) {
                return;
            }
            int i4 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            preference.edit().putString("__tnk_50001_", str).apply();
        }
    }

    public final void addHiddenApp(@NotNull Context context, long j) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Set<Long> hiddenApps = getHiddenApps(context);
        hiddenApps.add(Long.valueOf(j));
        String string = hiddenApps.toString();
        SharedPreferences.Editor editorEdit = getPreference(context).edit();
        editorEdit.putString("__tnk_30008_", string);
        editorEdit.apply();
        int i5 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006c, code lost:
    
        r9 = com.tnkfactory.ad.rwd.Settings.IAuthTabCallback + 47;
        com.tnkfactory.ad.rwd.Settings.onExtraCallbackWithResult = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0076, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0038, code lost:
    
        if (r9.getLong("__tnk_40014_", 1) != r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005d, code lost:
    
        if (r9.getLong("__tnk_40014_", 0) != r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005f, code lost:
    
        r9.edit().putLong("__tnk_40014_", r1).apply();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean checkTraceCall(@NotNull Context context) {
        long j;
        SharedPreferences preference;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Calendar calendar = Calendar.getInstance();
            j = 100 & calendar.get(104) & calendar.get(112);
            preference = getPreference(context);
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            Calendar calendar2 = Calendar.getInstance();
            j = calendar2.get(11) + (calendar2.get(6) * 100);
            preference = getPreference(context);
        }
    }

    public final ArrayList<String> loadCpsSearchResultKeyword(@NotNull Context context) {
        int i2 = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(context, "");
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            String string = getPreference(context).getString("__tnk_2301_0005_", "");
            if (string == null) {
                int i3 = IAuthTabCallback + 29;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
            } else {
                str = string;
            }
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            int i5 = 0;
            while (i5 < length) {
                int i6 = IAuthTabCallback + 59;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    arrayList.add(jSONArray.getString(i5));
                    i5 += 84;
                } else {
                    arrayList.add(jSONArray.getString(i5));
                    i5++;
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public final void setIntervalInterstitalShow(@NotNull Context context, @NotNull String str, long j) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = "__tnk_fadnsec_" + str;
        long j2 = j * 1000;
        if (getPreference(context).getLong(str2, 0L) != j2) {
            int i3 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                getPreference(context).edit().putLong(str2, j2).apply();
                throw null;
            }
            getPreference(context).edit().putLong(str2, j2).apply();
            int i4 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final boolean checkMonthlyStartCall(@NotNull Context context) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        long j = getPreference(context).getLong("__tnk_2608_0001_", 0L);
        if (j <= 0) {
            int i3 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        TimeZone timeZone = a;
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j);
        int i5 = calendar.get(1);
        int i6 = calendar.get(2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar2.setTimeInMillis(jCurrentTimeMillis);
        if (i6 + 1 + (i5 * 100) != calendar2.get(2) + 1 + (calendar2.get(1) * 100)) {
            return true;
        }
        int i7 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 39 / 0;
        }
        return false;
    }

    public final String getMediaUserName(@NotNull Context context) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        String string = getPreference(context).getString("__tnk_add_md_user_nm__", null);
        String string2 = getPreference(context).getString("__tnk_30017_", null);
        String strMd5Hex = Utils.md5Hex(string + TnkCore.INSTANCE.getENCRYPT_KEY_STR());
        if (string2 != null) {
            if (!Intrinsics.areEqual(string2, strMd5Hex)) {
                return null;
            }
            return string;
        }
        int i3 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        getPreference(context).edit().putString("__tnk_30017_", strMd5Hex).apply();
        int i5 = onExtraCallbackWithResult + 53;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    public final void addRunCountInfo(@NotNull Context context, @NotNull ValueObject valueObject) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(valueObject, "");
        SharedPreferences preference = getPreference(context);
        int i5 = preference.getInt("__tnk_40001_", 0);
        int i6 = preference.getInt("__tnk_40002_", 0);
        int i7 = preference.getInt("__tnk_40003_", 0);
        int i8 = preference.getInt("__tnk_40006_", 0);
        int i9 = preference.getInt("__tnk_40007_", 0);
        valueObject.set("tot_runs", i5);
        valueObject.set("day_runs", i6);
        valueObject.set("run_days", i7);
        valueObject.set("rr_days", i8);
        valueObject.set("ret_days", i9);
        int i10 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
    }

    public final void printRunCount(@NotNull Context context) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        SharedPreferences preference = getPreference(context);
        int i3 = preference.getInt("__tnk_40001_", 0);
        int i4 = preference.getInt("__tnk_40002_", 0);
        int i5 = preference.getInt("__tnk_40003_", 0);
        int i6 = preference.getInt("__tnk_40007_", 0);
        Logger.d("* total runs  : " + i3 + "\n* today runs  : " + i4 + "\n* total days  : " + i5 + "\n* run runs    : " + preference.getInt("__tnk_40006_", 0) + "\n* days since  : " + i6 + "\n* inter hours : " + preference.getInt("__tnk_40005_", 0) + "\n");
        int i7 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void addReferrerInfo(@NotNull Context context, @NotNull ValueObject valueObject) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(valueObject, "");
        SharedPreferences preference = getPreference(context);
        valueObject.set("tnk_ref", preference.getInt("__tnk_30013_", 0));
        Object obj = null;
        String string = preference.getString("__tnk_30016_", null);
        if (string != null) {
            int i3 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                valueObject.set("tnk_sid", string);
                obj.hashCode();
                throw null;
            }
            valueObject.set("tnk_sid", string);
        }
        valueObject.set("ref_clck_dt", preference.getLong("__tnk_30026_", 0L));
        valueObject.set("ref_inst_dt", preference.getLong("__tnk_30027_", 0L));
        valueObject.set("have_ref", preference.getBoolean("__tnk_30015_", false));
        int i4 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void addRunCount(@NotNull Context context) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        SharedPreferences preference = getPreference(context);
        int i4 = preference.getInt("__tnk_40001_", 0);
        int i5 = preference.getInt("__tnk_40002_", 0);
        int i6 = preference.getInt("__tnk_40003_", 0);
        int i7 = preference.getInt("__tnk_40006_", 0);
        long j = preference.getLong("__tnk_40004_", 0L);
        long j2 = preference.getLong("__tnk_40008_", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        if (!(!Intrinsics.areEqual(simpleDateFormat.format(new Date()), simpleDateFormat.format(new Date(j))))) {
            i2 = i5 + 1;
        } else {
            i6++;
            if (jCurrentTimeMillis - j > 86400000) {
                int i8 = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                i2 = 1;
                i7 = 1;
            } else {
                i7++;
                i2 = 1;
            }
        }
        int i10 = j > 0 ? (int) ((jCurrentTimeMillis - j) / 3600000) : 0;
        SharedPreferences.Editor editorEdit = getPreference(context).edit();
        editorEdit.putInt("__tnk_40001_", i4 + 1);
        editorEdit.putInt("__tnk_40002_", i2);
        editorEdit.putInt("__tnk_40003_", i6);
        editorEdit.putInt("__tnk_40006_", i7);
        editorEdit.putInt("__tnk_40005_", i10);
        editorEdit.putLong("__tnk_40004_", jCurrentTimeMillis);
        if (j2 > 0) {
            int i11 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            editorEdit.putInt("__tnk_40007_", (int) ((jCurrentTimeMillis - j2) / 86400000));
        } else {
            editorEdit.putLong("__tnk_40008_", jCurrentTimeMillis);
            int i13 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i13 % 128;
            int i14 = i13 % 2;
        }
        editorEdit.apply();
    }

    public final void saveCpsSearchResultKeyword(@NotNull Context context, @NotNull List<String> list) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = list.iterator();
        int i3 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            jSONArray.put((String) it.next());
        }
        SharedPreferences.Editor editorEdit = getPreference(context).edit();
        editorEdit.putString("__tnk_2301_0005_", jSONArray.toString());
        editorEdit.apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i2, int i3, char[] cArr, boolean z, int i4, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            j = 0;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            int i6 = $10 + 27;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i4 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35124 - TextUtils.indexOf((CharSequence) "", '0')), 23 - Color.green(0), 10277 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12891 - AndroidCharacter.getMirror('0')), Color.argb(0, 0, 0, 0) + 55, (ViewConfiguration.getTouchSlop() >> 8) + 2167, 1298711993, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            int i9 = $10 + 83;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i11 = $11 + 103;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback3 == null) {
                    char cGreen = (char) (12843 - Color.green(0));
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 55;
                    int i13 = 2168 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1));
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cGreen, iResolveSizeAndState, i13, 1298711993, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                j = 0;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public final void setEarnPoint(@NotNull Context context, long j) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        i.a(context, "context", this, context).putLong("__tnk_2308_0001_", j).apply();
        int i5 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setEarnPointCPS(@NotNull Context context, long j) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            i.a(context, "context", this, context).putLong("__tnk_2308_0002_", j).apply();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        i.a(context, "context", this, context).putLong("__tnk_2308_0002_", j).apply();
        int i4 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setApplicationId(@NotNull Context context, @Nullable String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            i.a(context, "context", this, context).putString("__tnk_20001_", str).apply();
            int i4 = 72 / 0;
        } else {
            i.a(context, "context", this, context).putString("__tnk_20001_", str).apply();
        }
        int i5 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
    }

    public final void addUserJoinedAppMarketInfo(@NotNull Context context, long j, @Nullable String str, @Nullable String str2) {
        int i2 = 2 % 2;
        SharedPreferences.Editor editorA = i.a(context, "context", this, context);
        editorA.putString("0__tnk_payed_app_" + j, str);
        setUserJoined(context, j, str2);
        editorA.apply();
        int i3 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setLastAttendTime(@NotNull Context context, long j, long j2) {
        int i2 = 2 % 2;
        SharedPreferences.Editor editorA = i.a(context, "context", this, context);
        editorA.putLong("tnk_v2_atnd_" + j, j2);
        editorA.apply();
        int i3 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final void setUserJoined(@NotNull Context context, long j, @Nullable String str) {
        int i2 = 2 % 2;
        SharedPreferences.Editor editorA = i.a(context, "context", this, context);
        editorA.putLong("tnk_v2_join_" + j, System.currentTimeMillis());
        if (str != null) {
            editorA.putLong("tnk_v2_pkg_" + str, j);
            int i3 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
        editorA.apply();
    }

    public final Set<Long> getHiddenApps(@NotNull Context context) {
        String str = "";
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        HashSet hashSet = new HashSet();
        String string = getPreference(context).getString("__tnk_30008_", "");
        if (string != null) {
            int i3 = onExtraCallbackWithResult + 13;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 83;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            str = string;
        }
        if (str.length() > 2) {
            Iterator it = StringsKt.split$default(StringsKt.removeSurrounding(str, "[", "]"), new String[]{","}, false, 0, 6, (Object) null).iterator();
            int i8 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            while (it.hasNext()) {
                Long longOrNull = StringsKt.toLongOrNull(StringsKt.trim((String) it.next()).toString());
                if (longOrNull != null) {
                    hashSet.add(Long.valueOf(longOrNull.longValue()));
                }
            }
        }
        return hashSet;
    }

    public final void setCOPPA(@NotNull Context context, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            SharedPreferences.Editor editorA = i.a(context, "context", this, context);
            editorA.putInt("__tnk_50005_", i2);
            editorA.apply();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SharedPreferences.Editor editorA2 = i.a(context, "context", this, context);
        editorA2.putInt("__tnk_50005_", i2);
        editorA2.apply();
        int i5 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setGDPR(@NotNull Context context, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            SharedPreferences.Editor editorA = i.a(context, "context", this, context);
            editorA.putInt("__tnk_50006_", i2);
            editorA.apply();
            int i5 = 43 / 0;
        } else {
            SharedPreferences.Editor editorA2 = i.a(context, "context", this, context);
            editorA2.putInt("__tnk_50006_", i2);
            editorA2.apply();
        }
        int i6 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void setLastTimeAppExecuted(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            i.a(context, "context", this, context).putLong("__tnk_30001_", System.currentTimeMillis()).apply();
            obj.hashCode();
            throw null;
        }
        i.a(context, "context", this, context).putLong("__tnk_30001_", System.currentTimeMillis()).apply();
        int i4 = onExtraCallbackWithResult + 25;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void setAdWallStyle(@NotNull Context context, int i2, int i3) {
        int i4 = 2 % 2;
        SharedPreferences.Editor editorA = i.a(context, "context", this, context);
        editorA.putInt("__tnk_30022_" + i2, i3);
        editorA.apply();
        int i5 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setAdWallReload(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i3 % 128;
        (i3 % 2 == 0 ? i.a(context, "context", this, context) : i.a(context, "context", this, context)).putBoolean("__tnk_30006_", true).apply();
    }

    public final void setNewsTooltipVisible(@NotNull Context context, boolean z) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        i.a(context, "context", this, context).putBoolean("__tnk_2304_0001_", z).apply();
        int i5 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void resetAdWallReload(@NotNull Context context) {
        SharedPreferences.Editor editorA;
        long jCurrentTimeMillis;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            editorA = i.a(context, "context", this, context);
            editorA.putBoolean("__tnk_30006_", false);
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            editorA = i.a(context, "context", this, context);
            editorA.putBoolean("__tnk_30006_", false);
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        editorA.putLong("__tnk_30007_", jCurrentTimeMillis);
        editorA.apply();
    }

    public final void clearHiddenApp(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        SharedPreferences.Editor editorA = i.a(context, "context", this, context);
        editorA.putString("__tnk_30008_", "");
        editorA.apply();
        int i5 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setPopupAnimationResId(@NotNull Context context, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        SharedPreferences.Editor editorA = i.a(context, "context", this, context);
        editorA.putInt("__tnk_30010_", i2);
        editorA.apply();
        int i6 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void setReferrer(@NotNull Context context, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 61;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        SharedPreferences.Editor editorA = i.a(context, "context", this, context);
        editorA.putInt("__tnk_30013_", i2);
        editorA.putBoolean("__tnk_30018_", true);
        editorA.apply();
        int i6 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public final void setReferrerClickTime(@NotNull Context context, long j) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            SharedPreferences.Editor editorA = i.a(context, "context", this, context);
            editorA.putLong("__tnk_30026_", j);
            editorA.apply();
        } else {
            SharedPreferences.Editor editorA2 = i.a(context, "context", this, context);
            editorA2.putLong("__tnk_30026_", j);
            editorA2.apply();
            throw null;
        }
    }

    public final void setReferrerInstallTime(@NotNull Context context, long j) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            SharedPreferences.Editor editorA = i.a(context, "context", this, context);
            editorA.putLong("__tnk_30027_", j);
            editorA.apply();
            int i4 = 18 / 0;
        } else {
            SharedPreferences.Editor editorA2 = i.a(context, "context", this, context);
            editorA2.putLong("__tnk_30027_", j);
            editorA2.apply();
        }
        int i5 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setAgreePrivacy(@NotNull Context context, boolean z) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SharedPreferences.Editor editorA = i.a(context, "context", this, context);
        editorA.putBoolean("__tnk_30019_", z);
        editorA.apply();
        int i5 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setTutorial(@NotNull Context context, boolean z) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SharedPreferences.Editor editorA = i.a(context, "context", this, context);
        editorA.putBoolean("__tnk_30028_", z);
        editorA.apply();
        int i5 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setMultiJoinMessage(@NotNull Context context, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        SharedPreferences.Editor editorA = i.a(context, "context", this, context);
        editorA.putInt("__tnk_2301_0001_", i2);
        editorA.apply();
        int i6 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 64 / 0;
        }
    }

    public final void setEventDisableTime(@NotNull Context context, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        i.a(context, "context", this, context).putInt("__tnk_2301_0003_", i2).apply();
        int i6 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void setAdRecommendPopupDisableToday(@NotNull Context context, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        i.a(context, "context", this, context).putInt("__tnk_2507_0001_", i2).apply();
        int i6 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSnsIdReferrer(@NotNull Context context, @Nullable String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            SharedPreferences.Editor editorA = i.a(context, "context", this, context);
            editorA.putString("__tnk_30016_", str);
            editorA.apply();
        } else {
            SharedPreferences.Editor editorA2 = i.a(context, "context", this, context);
            editorA2.putString("__tnk_30016_", str);
            editorA2.apply();
            int i4 = 25 / 0;
        }
    }

    public final void setLastImageCachePurgeMillis(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            SharedPreferences.Editor editorA = i.a(context, "context", this, context);
            editorA.putLong("__tnk_40018_", System.currentTimeMillis());
            editorA.apply();
            throw null;
        }
        SharedPreferences.Editor editorA2 = i.a(context, "context", this, context);
        editorA2.putLong("__tnk_40018_", System.currentTimeMillis());
        editorA2.apply();
        int i4 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void setReceiveAppId(@NotNull Context context, long j) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            SharedPreferences.Editor editorA = i.a(context, "context", this, context);
            editorA.putLong("__tnk_2301_0002_", j);
            editorA.apply();
            throw null;
        }
        SharedPreferences.Editor editorA2 = i.a(context, "context", this, context);
        editorA2.putLong("__tnk_2301_0002_", j);
        editorA2.apply();
        int i4 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setMonthlyStartCall(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            i.a(context, "context", this, context).putLong("__tnk_2608_0001_", System.currentTimeMillis()).apply();
        } else {
            i.a(context, "context", this, context).putLong("__tnk_2608_0001_", System.currentTimeMillis()).apply();
            throw null;
        }
    }

    public final void setReferrerDone(@NotNull Context context) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i3 % 128;
        (i3 % 2 != 0 ? i.a(context, "context", this, context) : i.a(context, "context", this, context)).putBoolean("__tnk_40010_", true).apply();
        int i4 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setAdwallStartTime(@NotNull Context context, long j) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        i.a(context, "context", this, context).putLong("__tnk_2408_0001_", j).apply();
        int i5 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = 478308979;
    }
}
