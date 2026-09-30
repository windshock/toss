package o;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.CellSignalStrength;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import androidx.core.content.ContextCompat;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxNativeAdLoaderImplb {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public static final MaxNativeAdLoaderImplb onNavigationEvent = new MaxNativeAdLoaderImplb();
    private static int onWarmupCompleted;

    public static final /* synthetic */ class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[alignTextProgressInsideProgress.values().length];
            try {
                iArr[alignTextProgressInsideProgress.WIFI.ordinal()] = 1;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[alignTextProgressInsideProgress.MOBILE.ordinal()] = 2;
                int i2 = onExtraCallbackWithResult + 103;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[alignTextProgressInsideProgress.UNKNOWN.ordinal()] = 3;
                int i5 = IAuthTabCallback + 89;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            onWarmupCompleted = iArr;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private MaxNativeAdLoaderImplb() {
    }

    public final boolean onExtraCallback(@Nullable Throwable th) {
        int i = 2 % 2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (th != null) {
            int i2 = onWarmupCompleted + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!linkedHashSet.add(th)) {
                return false;
            }
            int i4 = onWarmupCompleted + 71;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (onExtraCallbackWithResult(th)) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public final Map<String, Object> onWarmupCompleted(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        onTextViewSizeChanged ontextviewsizechanged = onTextViewSizeChanged.onExtraCallbackWithResult;
        String strOnWarmupCompleted = ontextviewsizechanged.onWarmupCompleted(context);
        try {
            int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
            int i2 = onWarmupCompleted.onWarmupCompleted[((alignTextProgressInsideProgress) onTextViewSizeChanged.IAuthTabCallback(iOnExtraCallback, 1136607599, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, new Object[]{ontextviewsizechanged, context}, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1136607596)).ordinal()];
            if (i2 == 1) {
                Map<String, Object> mapOnExtraCallbackWithResult = onExtraCallbackWithResult(context);
                int i3 = onExtraCallback + 13;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 50 / 0;
                }
                return mapOnExtraCallbackWithResult;
            }
            if (i2 == 2) {
                return IAuthTabCallback(context, strOnWarmupCompleted);
            }
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Map<String, Object> mapOnNavigationEvent = access8100.onNavigationEvent(getWrite.IAuthTabCallback("networkType", "OFFLINE"));
            int i5 = onExtraCallback + 13;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return mapOnNavigationEvent;
        } catch (Throwable unused) {
            return access8100.onNavigationEvent(getWrite.IAuthTabCallback("networkType", strOnWarmupCompleted));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r4 = o.access8100.onNavigationEvent();
        r5 = o.MaxNativeAdLoaderImplb.onWarmupCompleted + 117;
        o.MaxNativeAdLoaderImplb.onExtraCallback = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (onExtraCallback(r5) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if ((!onExtraCallback(r5)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r4 = onWarmupCompleted(r4);
        r5 = o.MaxNativeAdLoaderImplb.onExtraCallback + 17;
        o.MaxNativeAdLoaderImplb.onWarmupCompleted = r5 % 128;
        r5 = r5 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, Object> onNavigationEvent(@NotNull Context context, @Nullable Throwable th) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            int i3 = 14 / 0;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
        }
    }

    private final Map<String, Object> onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        WifiManager wifiManager = (WifiManager) ContextCompat.getSystemService(applicationContext, WifiManager.class);
        if (wifiManager != null) {
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            int rssi = connectionInfo.getRssi();
            return access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("networkType", "WIFI"), getWrite.IAuthTabCallback("wifiRssi", Integer.valueOf(rssi)), getWrite.IAuthTabCallback("wifiLinkSpeed", Integer.valueOf(connectionInfo.getLinkSpeed())), getWrite.IAuthTabCallback("wifiSignalLevel", Integer.valueOf(WifiManager.calculateSignalLevel(rssi, 5)))});
        }
        int i4 = onExtraCallback + 1;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return access8100.onNavigationEvent(getWrite.IAuthTabCallback("networkType", "WIFI"));
    }

    private final Map<String, Object> IAuthTabCallback(Context context, String str) {
        Integer numValueOf;
        Integer numValueOf2;
        int i = 2 % 2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28) {
            int i3 = onExtraCallback + 95;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return access8100.onNavigationEvent(getWrite.IAuthTabCallback("networkType", str));
        }
        TelephonyManager telephonyManager = (TelephonyManager) ContextCompat.getSystemService(context, TelephonyManager.class);
        if (telephonyManager == null) {
            return access8100.onNavigationEvent(getWrite.IAuthTabCallback("networkType", str));
        }
        SignalStrength signalStrength = telephonyManager.getSignalStrength();
        if (signalStrength == null) {
            int i5 = onExtraCallback + 83;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return access8100.onNavigationEvent(getWrite.IAuthTabCallback("networkType", str));
            }
            access8100.onNavigationEvent(getWrite.IAuthTabCallback("networkType", str));
            throw null;
        }
        if (i2 >= 29) {
            List<CellSignalStrength> cellSignalStrengths = signalStrength.getCellSignalStrengths();
            Intrinsics.checkNotNullExpressionValue(cellSignalStrengths, "");
            CellSignalStrength cellSignalStrength = (CellSignalStrength) CollectionsKt.firstOrNull(cellSignalStrengths);
            if (cellSignalStrength != null) {
                int i6 = onExtraCallback + 79;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                numValueOf2 = Integer.valueOf(cellSignalStrength.getDbm());
                int i8 = onWarmupCompleted + 27;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
            } else {
                numValueOf2 = null;
            }
            numValueOf = cellSignalStrength != null ? Integer.valueOf(cellSignalStrength.getAsuLevel()) : null;
            num = numValueOf2;
        } else {
            numValueOf = null;
        }
        return access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("networkType", str), getWrite.IAuthTabCallback("cellSignalLevel", Integer.valueOf(signalStrength.getLevel())), getWrite.IAuthTabCallback("cellDbm", num), getWrite.IAuthTabCallback("cellAsuLevel", numValueOf)});
    }

    private final boolean onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        if (!(th instanceof UnknownHostException) && !(th instanceof SocketTimeoutException) && !(th instanceof ConnectException)) {
            if (th instanceof SocketException) {
                int i2 = onExtraCallback + 41;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (th instanceof SSLHandshakeException) {
                int i4 = onWarmupCompleted + 99;
                onExtraCallback = i4 % 128;
                return i4 % 2 != 0;
            }
            if (!(th instanceof SSLException)) {
                if (!(th instanceof IOException)) {
                    return false;
                }
                String message = th.getMessage();
                String str = "";
                if (message != null) {
                    String lowerCase = message.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (lowerCase != null) {
                        str = lowerCase;
                    }
                }
                if (StringsKt.contains$default(str, "connection reset", false, 2, (Object) null) || StringsKt.contains$default(str, "broken pipe", false, 2, (Object) null) || StringsKt.contains$default(str, "network is unreachable", false, 2, (Object) null) || StringsKt.contains$default(str, "connection refused", false, 2, (Object) null)) {
                    return true;
                }
                int i5 = onExtraCallback + 19;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
        }
        return true;
    }
}
