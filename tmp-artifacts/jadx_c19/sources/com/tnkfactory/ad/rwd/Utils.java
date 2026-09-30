package com.tnkfactory.ad.rwd;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.BulletSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;
import com.tnkfactory.ad.Logger;
import com.tnkfactory.ad.misc.MD5Hash;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.api.ConstantsUtil;
import com.tnkfactory.ad.rwd.data.SessionInfo;
import com.tnkfactory.ad.rwd.data.constants.Constants;
import com.tnkfactory.ad.rwd.data.constants.RpcConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class Utils {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final long[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0, 0, 0, 10, 11, 12, 13, 14, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 11, 12, 13, 14, 15};

    public static String checkCNDevice(Context context) {
        return isPackageInstalled(context, "org.gemini.google_settings") ? "Y" : "N";
    }

    public static String checkRooted(Context context) {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return "Y";
        }
        File[] fileArr = {new File("/system/bin/su"), new File("/system/xbin/su"), new File("/sbin/su"), new File("/system/su"), new File("/system/bin/.ext/.su"), new File("/system/usr/we-need-root/su-backup"), new File("/system/xbin/mu"), new File("/system/app/SuperUser.apk"), new File("/system/app/Superuser.apk"), new File("data/data/com.noshufou.android.su")};
        for (int i2 = 0; i2 < 10; i2++) {
            File file = fileArr[i2];
            if (file.exists() && file.isFile()) {
                return "Y";
            }
        }
        String[] strArr = {"com.noshufou.android.su", "com.speedsoftware.rootexplorer", "com.tegrak.lagfix", "com.devadvance.rootcloakplus", "com.devadvance.rootcloak", "eu.chainfire.supersu", "com.thirdparty.superuser", "com.koushikdutta.superuser", "com.zachspong.temprootremovejb", "com.ramdroid.appquarantine", "com.cyanogenmod.filemanager"};
        for (int i3 = 0; i3 < 11; i3++) {
            if (isPackageInstalled(context, strArr[i3])) {
                return "Y";
            }
        }
        return "N";
    }

    public static boolean checkTargeting(Context context, AdListVo adListVo) {
        return checkTargeting(context, adListVo.getInst_apps_not(), adListVo.getInst_apps_or1(), adListVo.getInst_apps_or2(), adListVo.getInst_apps_and(), adListVo.getIa_or1_cnt(), adListVo.getIa_or2_cnt());
    }

    public static String checkVM(Context context, String str) throws ClassNotFoundException {
        String property = System.getProperty("os.version");
        String property2 = System.getProperty("os.arch");
        String str2 = Build.FINGERPRINT;
        String str3 = Build.MODEL;
        Constants constants = Constants.INSTANCE;
        if (str3.toLowerCase().contains("app runtime")) {
            return "C";
        }
        if (property != null && property.contains("bst+")) {
            return "B";
        }
        if (str2 != null && str2.contains("generic")) {
            return "E";
        }
        if (isPackageInstalled(context, "com.androVM.vmconfig")) {
            return "G";
        }
        if (isPackageInstalled(context, "com.bluestacks.setup") || isPackageInstalled(context, "com.bluestacks.bstfolder") || isPackageInstalled(context, "com.bluestacks.BstCommandProcessor") || ((property2.contains("x86") && isPackageInstalled(context, "com.uncube.account")) || (property2.contains("x86") && isPackageInstalled(context, "com.svox.pico")))) {
            return "B";
        }
        File[] fileArr = {new File("/system/app/BstCommandProcessor.apk"), new File("/system/app/BstFolder.apk"), new File("/system/priv-app/BstCommandProcessor.apk"), new File("/system/priv-app/BstFolder.apk")};
        for (int i2 = 0; i2 < 4; i2++) {
            File file = fileArr[i2];
            if (file.exists() && file.isFile()) {
                return "B";
            }
        }
        if (isPackageInstalled(context, "org.greatfruit.andy") || isPackageInstalled(context, "org.greatfruit.andy.ime") || isPackageInstalled(context, "org.greatfruit.andy.appmonitor")) {
            return "A";
        }
        File[] fileArr2 = {new File("/system/app/ime.apk"), new File("/system/app/appmonitor.apk"), new File("/system/app/1clicksync.apk")};
        for (int i3 = 0; i3 < 3; i3++) {
            File file2 = fileArr2[i3];
            if (file2.exists() && file2.isFile()) {
                return "A";
            }
        }
        if (isPackageInstalled(context, "com.bignox.app.noxservice")) {
            return "O";
        }
        File file3 = new File[]{new File("/system/app/NoxService.apk")}[0];
        if (file3.exists() && file3.isFile()) {
            return "O";
        }
        if (property2.equals("i686") && str2 != null && str2.contains("dream2ltexx")) {
            return "O";
        }
        if (isPackageInstalled(context, "com.google.android.launcher.layouts.genymotion") || isPackageInstalled(context, "com.genymotion.systempatcher") || isPackageInstalled(context, "com.genymotion.tasklocker") || isPackageInstalled(context, "com.genymotion.genyd") || isPackageInstalled(context, "com.genymotion.superuser")) {
            return "E";
        }
        File file4 = new File("fstab.vbox86");
        if (file4.exists() && file4.isFile()) {
            return "E";
        }
        if (property != null && property.contains("genymotion")) {
            return "E";
        }
        if (isPackageInstalled(context, "com.microvirt.installer") || isPackageInstalled(context, "com.microvirt.guide") || isPackageInstalled(context, "com.microvirt.tools") || isPackageInstalled(context, "com.microvirt.memuime") || isPackageInstalled(context, "com.microvirt.launcher2") || isPackageInstalled(context, "com.microvirt.download")) {
            return "M";
        }
        if (isPackageInstalled(context, "com.pk.peak.launcher3")) {
            return "P";
        }
        if (str != null) {
            if (str.length() < 14) {
                return "L";
            }
            ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
            RpcConfig rpcConfig = RpcConfig.INSTANCE;
            if (new File(constantsUtil.def(rpcConfig.getVMCHECK_XPOSED_JAR())).exists()) {
                return "X";
            }
            String property3 = System.getProperty("java.class.path");
            if (property3 != null && property3.toLowerCase().contains("xposed")) {
                return "X";
            }
            if (isPackageInstalled(context, constantsUtil.def(rpcConfig.getVMCHECK_IMEI_APK0())) || isPackageInstalled(context, constantsUtil.def(rpcConfig.getVMCHECK_IMEI_APK1())) || isPackageInstalled(context, constantsUtil.def(rpcConfig.getVMCHECK_IMEI_APK2())) || isPackageInstalled(context, constantsUtil.def(rpcConfig.getVMCHECK_IMEI_APK3())) || isPackageInstalled(context, constantsUtil.def(rpcConfig.getVMCHECK_IMEI_APK4())) || isPackageInstalled(context, constantsUtil.def(rpcConfig.getVMCHECK_IMEI_APK5())) || isPackageInstalled(context, constantsUtil.def(rpcConfig.getVMCHECK_IMEI_APK6())) || isPackageInstalled(context, constantsUtil.def(rpcConfig.getVMCHECK_IMEI_APK7()))) {
                return "I";
            }
            try {
                ClassLoader.getSystemClassLoader().loadClass(constantsUtil.def(rpcConfig.getVMCHECK_XPOSED_CP()));
                return "X";
            } catch (ClassNotFoundException unused) {
            }
        }
        return ((property2.equals("i686") || property2.equals("x86")) && isPackageInstalled(context, "com.cyanogenmod.filemanager")) ? "Y" : "N";
    }

    public static String defString(String str) {
        return ConstantsUtil.INSTANCE.def(str);
    }

    public static int dip(int i2) {
        return (int) TypedValue.applyDimension(1, i2, android.content.res.Resources.getSystem().getDisplayMetrics());
    }

    public static Activity getActivity(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static Bundle getActivityExtras(Context context) {
        Intent intent;
        Activity activity = getActivity(context);
        if (activity == null || (intent = activity.getIntent()) == null) {
            return null;
        }
        return intent.getExtras();
    }

    public static int[] getActivitySize(Activity activity) {
        return getActivitySize(activity, false);
    }

    public static String getAdid(Context context) {
        return TnkCore.INSTANCE.getSessionInfo().getAdid();
    }

    public static String getAppid(Context context) {
        return TnkCore.INSTANCE.getSessionInfo().getApplicationId();
    }

    public static ColorStateList getColorList(int i2, int i3) {
        return getColorList(i2, i3, false);
    }

    public static int getDominantColor(Bitmap bitmap, int i2, int i3) {
        int i4;
        int i5;
        if (bitmap == null) {
            return 0;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i2 != 0) {
            if (i2 == 1) {
                i4 = height - i3;
                height = i3;
                i3 = width;
                i5 = 0;
            } else if (i2 != 2) {
                i5 = width - i3;
                i4 = 0;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i5, i4, i3, height);
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, 1, 1, true);
            int pixel = bitmapCreateScaledBitmap.getPixel(0, 0);
            bitmapCreateScaledBitmap.recycle();
            bitmapCreateBitmap.recycle();
            return pixel;
        }
        height = i3;
        i3 = width;
        i4 = 0;
        i5 = 0;
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap, i5, i4, i3, height);
        Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapCreateBitmap2, 1, 1, true);
        int pixel2 = bitmapCreateScaledBitmap2.getPixel(0, 0);
        bitmapCreateScaledBitmap2.recycle();
        bitmapCreateBitmap2.recycle();
        return pixel2;
    }

    public static String getHelpdeskUrl(Context context) {
        SessionInfo sessionInfo = TnkCore.INSTANCE.getSessionInfo();
        StringBuilder sb = new StringBuilder();
        sb.append(ConstantsUtil.INSTANCE.def(RpcConfig.HELP_URL));
        sb.append("?appid=");
        sb.append(sessionInfo.getApplicationId());
        if (sessionInfo.getUdid() != null) {
            sb.append("&uid=");
            sb.append(sessionInfo.getUdid());
        }
        String adid = sessionInfo.getAdid();
        if (adid == null) {
            adid = Settings.INSTANCE.getAdid(context);
        }
        if (adid != null) {
            sb.append("&adid=");
            sb.append(sessionInfo.getAdid());
        } else if (sessionInfo.getUdid() == null && sessionInfo.getId1() != null) {
            sb.append("&u=");
            sb.append(sessionInfo.getId1());
        }
        sb.append("&lang=");
        sb.append(sessionInfo.getDeviceLanguage());
        String mediaUserName = Settings.INSTANCE.getMediaUserName(context);
        if (mediaUserName != null && mediaUserName.length() > 0) {
            try {
                sb.append("&md_user_nm=");
                sb.append(toHexString(mediaUserName.getBytes("utf-8")));
            } catch (Exception unused) {
            }
        }
        sb.append("&app_ver=");
        sb.append(sessionInfo.getAppVersion());
        sb.append("&sdk_ver=8.09.29&ph_os=");
        Constants constants = Constants.INSTANCE;
        sb.append(sessionInfo.getDeviceOsVersion());
        try {
            sb.append("&ph_mdl=");
            sb.append(toHexString(sessionInfo.getDeviceModel().getBytes("utf-8")));
        } catch (Exception unused2) {
        }
        String string = sb.toString();
        Logger.d(string);
        return string;
    }

    public static boolean[] getKoreanStoreAvailability(Context context) {
        return new boolean[]{isTStoreAvailable(context), isOllehMarketAvailable(context), isOzStoreAvailable(context)};
    }

    public static Intent getLaunchIntent(Context context, String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            launchIntentForPackage.addFlags(268435456);
            return launchIntentForPackage;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getMdUserId(Context context) {
        return TnkCore.INSTANCE.getSessionInfo().getMediaUserName();
    }

    public static int getOrientation(Context context) {
        return getScreenSize(context)[2];
    }

    public static long getPackageFirstInstallTime(Context context, String str) {
        if (str == null || str.length() == 0) {
            return 0L;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 128).firstInstallTime;
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Deprecated
    public static int[] getScreenSize(Context context) {
        return getScreenSize(context, true);
    }

    public static double getStandardDeviation(Bitmap bitmap, int i2, int i3) {
        int i4;
        int i5;
        double d = 0.0d;
        if (bitmap == null) {
            return 0.0d;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i2 == 0) {
            height = i3;
            i3 = width;
            i4 = 0;
            i5 = 0;
        } else if (i2 == 1) {
            i4 = height - i3;
            height = i3;
            i3 = width;
            i5 = 0;
        } else if (i2 != 2) {
            i5 = width - i3;
            i4 = 0;
        } else {
            width = i3;
            i3 = height;
            height = i3;
            i3 = width;
            i4 = 0;
            i5 = 0;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i5, i4, i3, height);
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < i3; i6++) {
            for (int i7 = 0; i7 < height; i7++) {
                arrayList.add(Integer.valueOf(bitmapCreateBitmap.getPixel(i6, i7)));
            }
        }
        if (arrayList.size() < 2) {
            return Double.NaN;
        }
        double dIntValue = 0.0d;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            dIntValue += ((Integer) arrayList.get(i8)).intValue();
        }
        double size = dIntValue / arrayList.size();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            double dIntValue2 = ((Integer) arrayList.get(i9)).intValue() - size;
            d += dIntValue2 * dIntValue2;
        }
        return Math.sqrt(d / (arrayList.size() - 1));
    }

    public static int getStatusBarHeight(Context context, boolean z) {
        if (!z) {
            if (context == null || !(context instanceof Activity)) {
                return 0;
            }
            Rect rect = new Rect();
            ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            return rect.top;
        }
        if (context == null) {
            return 0;
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        if (!(context instanceof Activity)) {
            return 0;
        }
        Rect rect2 = new Rect();
        ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
        return rect2.top;
    }

    public static String getVersionNumber() {
        Constants constants = Constants.INSTANCE;
        return Constants.VERSION_NUMBER;
    }

    public static int[] getWatermarkSize(int i2, int i3) {
        float f;
        float f2;
        if (i2 > i3) {
            f = i2;
            f2 = 0.0516f;
        } else {
            f = i2;
            f2 = 0.0833f;
        }
        int i4 = (int) (f * f2 * 0.45f);
        return new int[]{i4, i4};
    }

    public static String getWebQueryParam(Context context) {
        SessionInfo sessionInfo = TnkCore.INSTANCE.getSessionInfo();
        StringBuilder sb = new StringBuilder("appid=");
        sb.append(sessionInfo.getApplicationId());
        if (sessionInfo.getUdid() != null) {
            sb.append("&uid=");
            sb.append(sessionInfo.getUdid());
        }
        String adid = sessionInfo.getAdid();
        if (adid == null) {
            adid = Settings.INSTANCE.getAdid(context);
        }
        if (adid != null) {
            sb.append("&adid=");
            sb.append(sessionInfo.getAdid());
        } else if (sessionInfo.getUdid() == null && sessionInfo.getId1() != null) {
            sb.append("&u=");
            sb.append(sessionInfo.getId1());
        }
        sb.append("&lang=");
        sb.append(sessionInfo.getDeviceLanguage());
        String mediaUserName = Settings.INSTANCE.getMediaUserName(context);
        if (mediaUserName != null && mediaUserName.length() > 0) {
            try {
                sb.append("&md_user_nm=");
                sb.append(toHexString(mediaUserName.getBytes("utf-8")));
            } catch (Exception unused) {
            }
        }
        sb.append("&app_ver=");
        sb.append(sessionInfo.getAppVersion());
        sb.append("&sdk_ver=8.09.29&ph_os=");
        Constants constants = Constants.INSTANCE;
        sb.append(sessionInfo.getDeviceOsVersion());
        try {
            sb.append("&ph_mdl=");
            sb.append(toHexString(sessionInfo.getDeviceModel().getBytes("utf-8")));
        } catch (Exception unused2) {
        }
        String string = sb.toString();
        Logger.d(string);
        return string;
    }

    public static String goAndroidMarket(Context context, String str, boolean z) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("market://details?id=" + str));
            setFlagForMarket(intent, z);
            context.startActivity(intent);
            return "G" + str;
        } catch (Exception e) {
            if (!z) {
                return goAndroidMarket(context, str, true);
            }
            Logger.e("goAndroidMarket error : " + e.toString());
            Toast.makeText(context, Resources.getResources().error_no_google, 1).show();
            return null;
        }
    }

    public static String goCustomeUrl(Context context, String str, boolean z) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            setFlagForMarket(intent, z);
            context.startActivity(intent);
            return "W" + str;
        } catch (Exception e) {
            if (!z) {
                return goCustomeUrl(context, str, true);
            }
            Logger.e("goCustomeUrl error : " + e.toString());
            Toast.makeText(context, Resources.getResources().error_no_market, 1).show();
            return null;
        }
    }

    public static String goMarket(Context context, String str, ViewGroup viewGroup) {
        if (str == null || str.length() <= 1) {
            return null;
        }
        if (str.startsWith("V")) {
            return goWebPage(context, str.substring(1), false);
        }
        if (str.startsWith("W")) {
            return goWebPage(context, str.substring(1), false);
        }
        if (str.startsWith("T")) {
            return goTStore(context, str.substring(1), false);
        }
        if (str.startsWith("G")) {
            return goAndroidMarket(context, str.substring(1), false);
        }
        showAlert(context, Resources.getResources().error_no_market);
        return null;
    }

    public static String goTStore(Context context, String str, boolean z) {
        try {
            if (!isTStoreAvailable(context)) {
                Toast.makeText(context, Resources.getResources().error_no_tstore, 1).show();
                return null;
            }
            Intent intent = new Intent();
            intent.addFlags(536870912);
            intent.setClassName("com.skt.skaf.A000Z00040", "com.skt.skaf.A000Z00040.A000Z00040");
            intent.setAction("COLLAB_ACTION");
            intent.putExtra("com.skt.skaf.COL.URI", ("PRODUCT_VIEW/" + str).getBytes());
            intent.putExtra("com.skt.skaf.COL.REQUESTER", "A000Z00040");
            setFlagForMarket(intent, z);
            context.startActivity(intent);
            return "T" + str;
        } catch (Exception e) {
            if (!z) {
                return goTStore(context, str, true);
            }
            Logger.e("goTStore error : " + e.toString());
            Toast.makeText(context, Resources.getResources().error_no_tstore, 1).show();
            return null;
        }
    }

    public static String goWebPage(Context context, String str, boolean z) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            Constants constants = Constants.INSTANCE;
            intent.putExtra("com.android.browser.application_id", Constants.SDK_PACKAGE);
            setFlagForMarket(intent, z);
            context.startActivity(intent);
            return "W" + str;
        } catch (Exception e) {
            if (!z) {
                return goWebPage(context, str, true);
            }
            Logger.e("goWebPage error : " + e.toString());
            Toast.makeText(context, Resources.getResources().error_no_browser, 1).show();
            return null;
        }
    }

    public static String goWebPageToMarket(Context context, String str, boolean z) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            Constants constants = Constants.INSTANCE;
            intent.putExtra("com.android.browser.application_id", Constants.SDK_PACKAGE);
            if (str.startsWith("market://")) {
                intent.setPackage("com.android.vending");
            }
            if (z || !(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return str;
        } catch (Exception e) {
            if (!z) {
                return goWebPage(context, str, true);
            }
            Logger.e("goWebPage error : " + e.toString());
            Toast.makeText(context, Resources.getResources().error_no_browser, 1).show();
            return null;
        }
    }

    public static boolean isFullScreenMode(Context context) {
        if (context == null || !(context instanceof Activity)) {
            return false;
        }
        try {
            Activity activity = (Activity) context;
            int i2 = activity.getWindow().getAttributes().flags;
            if ((i2 & 1024) != 0) {
                return true;
            }
            int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
            int i3 = systemUiVisibility & 4;
            if ((i3 != 0 && (systemUiVisibility & 4096) != 0) || i3 != 0) {
                return true;
            }
            int i4 = systemUiVisibility & 1024;
            if (i4 == 0 || i3 == 0 || (systemUiVisibility & 4096) == 0) {
                return ((67108864 & i2) == 0 || i4 == 0) ? false : true;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isNull(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean isOllehMarketAvailable(Context context) {
        return isPackageInstalled(context, "com.kt.olleh.storefront") || isPackageInstalled(context, "com.kt.olleh.istore");
    }

    public static boolean isOzStoreAvailable(Context context) {
        return isPackageInstalled(context, "android.lgt.appstore") || isPackageInstalled(context, "com.lguplus.appstore");
    }

    public static boolean isPackageInstalled(Context context, String str) throws PackageManager.NameNotFoundException {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 128);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isTStoreAvailable(Context context) {
        return isPackageInstalled(context, "com.skt.skaf.A000Z00040");
    }

    public static boolean isTablet(Context context) {
        float f;
        float f2;
        int i2 = context.getResources().getConfiguration().screenLayout;
        Constants constants = Constants.INSTANCE;
        if ((i2 & 15) < 3) {
            return false;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f = displayMetrics.widthPixels / displayMetrics.xdpi;
            f2 = displayMetrics.heightPixels / displayMetrics.ydpi;
        } catch (Throwable unused) {
        }
        return Math.sqrt((double) ((f2 * f2) + (f * f))) >= 6.0d;
    }

    public static CharSequence makeBulletSpannable(int i2, String[] strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i3 = 0; i3 < strArr.length; i3++) {
            SpannableString spannableString = i3 < strArr.length - 1 ? new SpannableString(strArr[i3] + "\n\n") : new SpannableString(strArr[i3]);
            spannableString.setSpan(new BulletSpan(i2), 0, spannableString.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        return spannableStringBuilder;
    }

    public static String md5Hex(String str) {
        MD5Hash mD5Hash = new MD5Hash();
        mD5Hash.update(str.getBytes());
        return toHexString(mD5Hash.getHash());
    }

    public static String md5HexWithEncryptKey(String str) {
        return md5Hex(str + TnkCore.INSTANCE.getENCRYPT_KEY_STR());
    }

    public static byte[] readBytes(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[32768];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    public static void setBackground(View view, Drawable drawable) {
        if (view != null) {
            view.setBackground(drawable);
        }
    }

    public static void setFlagForMarket(Intent intent, boolean z) {
        if (intent != null) {
            intent.addFlags(262144);
            if (z) {
                intent.addFlags(268435456);
            }
        }
    }

    public static String setNumDecimal(Object obj) {
        try {
            return new DecimalFormat().format(obj);
        } catch (IllegalArgumentException unused) {
            return String.valueOf(obj);
        }
    }

    public static void showAlert(Context context, String str) {
        showAlert(context, "", str, null);
    }

    public static void showTnkSite(Context context) {
        goWebPage(context, ConstantsUtil.INSTANCE.def(RpcConfig.LOGO_URL) + TnkCore.INSTANCE.serviceTask(context).getSessionInfo().getDeviceLanguage(), false);
    }

    public static byte[] toHexBytes(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            long[] jArr = b;
            bArr[i3] = (byte) ((jArr[str.charAt(i2 + 1) - '0'] & 15) | ((int) ((jArr[str.charAt(i2) - '0'] << 4) & 240)));
            i3++;
            i2 += 2;
        }
        return bArr;
    }

    public static String toHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            char[] cArr = a;
            sb.append(cArr[(b2 >> 4) & 15]);
            sb.append(cArr[b2 & 15]);
        }
        return sb.toString();
    }

    public static Spanned fromHtml(String str) {
        return Html.fromHtml(str, 0);
    }

    public static int[] getActivitySize(Activity activity, boolean z) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i2 = rect.right - rect.left;
        int i3 = z ? rect.bottom : rect.bottom - rect.top;
        return new int[]{i2, i3, i2 > i3 ? 2 : 1};
    }

    public static ColorStateList getColorList(int i2, int i3, boolean z) {
        if (!z) {
            return new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[0]}, new int[]{i3, i2});
        }
        return new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[]{R.attr.state_pressed}, new int[0]}, new int[]{i3, i3, i2});
    }

    @Deprecated
    public static int[] getScreenSize(Context context, boolean z) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        Constants constants = Constants.INSTANCE;
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        if (z) {
            int i2 = displayMetrics.densityDpi;
            height -= i2 != 120 ? i2 != 160 ? i2 != 240 ? i2 != 320 ? 76 : 50 : 38 : 25 : 19;
        }
        return new int[]{width, height, width > height ? 2 : 1};
    }

    public static CharSequence makeBulletSpannableV2(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(str, 63));
        for (BulletSpan bulletSpan : (BulletSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), BulletSpan.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(bulletSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(bulletSpan);
            spannableStringBuilder.removeSpan(bulletSpan);
            spannableStringBuilder.setSpan(new ImprovedBulletSpan(dip(2), dip(8), 0), spanStart, spanEnd, 17);
        }
        return spannableStringBuilder.subSequence(0, spannableStringBuilder.length() - 1);
    }

    public static void showAlert(Context context, String str, String str2, String str3) {
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, R.style.Theme.Holo.Light.Dialog.NoActionBar));
            builder.setTitle(str);
            builder.setMessage(str2);
            if (isNull(str3)) {
                str3 = Resources.getResources().confirm;
            }
            builder.setPositiveButton(str3, new s());
            builder.show();
        } catch (Throwable unused) {
            Toast.makeText(context, str2, 1).show();
        }
    }

    public static void writeBytes(byte[] bArr, File file) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (Exception e2) {
                e = e2;
                fileOutputStream2 = fileOutputStream;
                Logger.e("fad : error writing to file " + e.toString());
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
            } catch (Throwable th2) {
                th = th2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
        }
    }

    public static boolean checkTargeting(Context context, String str, String str2, String str3, String str4, int i2, int i3) {
        boolean z;
        boolean z2 = true;
        if (isNull(str)) {
            z = true;
        } else {
            for (String str5 : str.split(",")) {
                String strTrim = str5.trim();
                if (strTrim.length() < 2) {
                    return false;
                }
                if (isPackageInstalled(context, strTrim)) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        if (z && !isNull(str2) && i2 > 0) {
            String[] strArrSplit = str2.split(",");
            int length = strArrSplit.length;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i4 >= length) {
                    z = false;
                    break;
                }
                String strTrim2 = strArrSplit[i4].trim();
                if (strTrim2.length() < 2) {
                    return false;
                }
                if (isPackageInstalled(context, strTrim2) && (i5 = i5 + 1) >= i2) {
                    z = true;
                    break;
                }
                i4++;
            }
        }
        if (z && !isNull(str3) && i3 > 0) {
            String[] strArrSplit2 = str3.split(",");
            int length2 = strArrSplit2.length;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                if (i6 >= length2) {
                    z2 = false;
                    break;
                }
                String strTrim3 = strArrSplit2[i6].trim();
                if (strTrim3.length() < 2) {
                    return false;
                }
                if (isPackageInstalled(context, strTrim3) && (i7 = i7 + 1) >= i3) {
                    break;
                }
                i6++;
            }
        } else {
            z2 = z;
        }
        if (z2 && !isNull(str4)) {
            for (String str6 : str4.split(",")) {
                String strTrim4 = str6.trim();
                if (strTrim4.length() < 2 || !isPackageInstalled(context, strTrim4)) {
                    return false;
                }
            }
        }
        return z2;
    }

    public static void showAlert(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener) {
        showAlert(context, str, str2, str3, onClickListener, true);
    }

    public static void showAlert(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, boolean z) {
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, R.style.Theme.Holo.Light.Dialog.NoActionBar));
            builder.setTitle(str);
            builder.setMessage(str2);
            if (isNull(str3)) {
                str3 = Resources.getResources().confirm;
            }
            builder.setPositiveButton(str3, onClickListener);
            builder.setCancelable(z);
            builder.show();
        } catch (Throwable unused) {
            Toast.makeText(context, str2, 1).show();
            onClickListener.onClick(null, 0);
        }
    }

    public static void showAlert(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        showAlert(context, str, str2, str3, onClickListener, str4, onClickListener2, true);
    }

    public static void showAlert(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, boolean z) {
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, R.style.Theme.Holo.Light.Dialog.NoActionBar));
            builder.setTitle(str);
            builder.setMessage(str2);
            if (isNull(str3)) {
                str3 = Resources.getResources().confirm;
            }
            if (isNull(str4)) {
                str4 = Resources.getResources().cancel;
            }
            builder.setPositiveButton(str3, onClickListener);
            builder.setNegativeButton(str4, onClickListener2);
            builder.setCancelable(z);
            builder.show();
        } catch (Throwable unused) {
            Toast.makeText(context, str2, 1).show();
            onClickListener.onClick(null, 0);
        }
    }
}
