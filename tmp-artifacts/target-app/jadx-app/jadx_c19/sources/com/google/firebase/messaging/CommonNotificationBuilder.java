package com.google.firebase.messaging;

import android.R;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import java.util.concurrent.atomic.AtomicInteger;
import o.startIntentSenderForResult;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class CommonNotificationBuilder {
    private static final String ACTION_RECEIVER = "com.google.android.c2dm.intent.RECEIVE";
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL = "fcm_fallback_notification_channel";
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL = "fcm_fallback_notification_channel_label";
    private static final String FCM_FALLBACK_NOTIFICATION_CHANNEL_NAME_NO_RESOURCE = "Misc";
    private static final int ILLEGAL_RESOURCE_ID = 0;
    public static final String METADATA_DEFAULT_CHANNEL_ID = "com.google.firebase.messaging.default_notification_channel_id";
    public static final String METADATA_DEFAULT_COLOR = "com.google.firebase.messaging.default_notification_color";
    public static final String METADATA_DEFAULT_ICON = "com.google.firebase.messaging.default_notification_icon";
    private static final AtomicInteger requestCodeProvider = new AtomicInteger((int) SystemClock.elapsedRealtime());

    private static int getPendingIntentFlags(int i2) {
        return i2 | 67108864;
    }

    private CommonNotificationBuilder() {
    }

    static DisplayNotificationInfo createNotificationInfo(Context context, NotificationParams notificationParams) throws PackageManager.NameNotFoundException {
        Bundle manifestMetadata = getManifestMetadata(context.getPackageManager(), context.getPackageName());
        return createNotificationInfo(context, context, notificationParams, getOrCreateChannel(context, notificationParams.getNotificationChannelId(), manifestMetadata), manifestMetadata);
    }

    public static DisplayNotificationInfo createNotificationInfo(Context context, Context context2, NotificationParams notificationParams, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        NotificationCompat.access100 access100Var = new NotificationCompat.access100(context2, str);
        String possiblyLocalizedString = notificationParams.getPossiblyLocalizedString(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(possiblyLocalizedString)) {
            access100Var.onWarmupCompleted(possiblyLocalizedString);
        }
        String possiblyLocalizedString2 = notificationParams.getPossiblyLocalizedString(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(possiblyLocalizedString2)) {
            access100Var.IAuthTabCallback(possiblyLocalizedString2);
            access100Var.onExtraCallbackWithResult(new NotificationCompat.IAuthTabCallbackDefault().onNavigationEvent(possiblyLocalizedString2));
        }
        access100Var.asInterface(getSmallIcon(packageManager, resources, packageName, notificationParams.getString("gcm.n.icon"), bundle));
        Uri sound = getSound(packageName, notificationParams, resources);
        if (sound != null) {
            access100Var.onNavigationEvent(sound);
        }
        access100Var.onExtraCallback(createContentIntent(context, notificationParams, packageName, packageManager));
        PendingIntent pendingIntentCreateDeleteIntent = createDeleteIntent(context, context2, notificationParams);
        if (pendingIntentCreateDeleteIntent != null) {
            access100Var.onExtraCallbackWithResult(pendingIntentCreateDeleteIntent);
        }
        Integer color = getColor(context2, notificationParams.getString("gcm.n.color"), bundle);
        if (color != null) {
            access100Var.onExtraCallbackWithResult(color.intValue());
        }
        access100Var.onExtraCallback(!notificationParams.getBoolean("gcm.n.sticky"));
        access100Var.IAuthTabCallbackStub(notificationParams.getBoolean("gcm.n.local_only"));
        String string = notificationParams.getString("gcm.n.ticker");
        if (string != null) {
            access100Var.asBinder(string);
        }
        Integer notificationPriority = notificationParams.getNotificationPriority();
        if (notificationPriority != null) {
            access100Var.IAuthTabCallbackDefault(notificationPriority.intValue());
        }
        Integer visibility = notificationParams.getVisibility();
        if (visibility != null) {
            access100Var.onTransact(visibility.intValue());
        }
        Integer notificationCount = notificationParams.getNotificationCount();
        if (notificationCount != null) {
            access100Var.asBinder(notificationCount.intValue());
        }
        Long l = notificationParams.getLong("gcm.n.event_time");
        if (l != null) {
            access100Var.IAuthTabCallbackDefault(true);
            access100Var.onExtraCallback(l.longValue());
        }
        long[] vibrateTimings = notificationParams.getVibrateTimings();
        if (vibrateTimings != null) {
            access100Var.IAuthTabCallback(vibrateTimings);
        }
        int[] lightSettings = notificationParams.getLightSettings();
        if (lightSettings != null) {
            access100Var.IAuthTabCallback(lightSettings[0], lightSettings[1], lightSettings[2]);
        }
        access100Var.IAuthTabCallback(getConsolidatedDefaults(notificationParams));
        return new DisplayNotificationInfo(access100Var, getTag(notificationParams), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int getConsolidatedDefaults(NotificationParams notificationParams) {
        boolean z = notificationParams.getBoolean("gcm.n.default_sound");
        ?? r0 = z;
        if (notificationParams.getBoolean("gcm.n.default_vibrate_timings")) {
            r0 = (z ? 1 : 0) | 2;
        }
        return notificationParams.getBoolean("gcm.n.default_light_settings") ? r0 | 4 : r0;
    }

    private static boolean isValidIcon(Resources resources, int i2) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            return !CommonNotificationBuilder$$ExternalSyntheticApiModelOutline0.m(resources.getDrawable(i2, null));
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    private static int getSmallIcon(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && isValidIcon(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && isValidIcon(resources, identifier2)) {
                return identifier2;
            }
        }
        int i2 = bundle.getInt(METADATA_DEFAULT_ICON, 0);
        if (i2 == 0 || !isValidIcon(resources, i2)) {
            try {
                i2 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                e.toString();
            }
        }
        return (i2 == 0 || !isValidIcon(resources, i2)) ? R.drawable.sym_def_app_icon : i2;
    }

    private static Integer getColor(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
            }
        }
        int i2 = bundle.getInt(METADATA_DEFAULT_COLOR, 0);
        if (i2 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(ContextCompat.getColor(context, i2));
        } catch (Resources.NotFoundException unused2) {
            return null;
        }
    }

    private static Uri getSound(String str, NotificationParams notificationParams, Resources resources) {
        String soundResourceName = notificationParams.getSoundResourceName();
        if (TextUtils.isEmpty(soundResourceName)) {
            return null;
        }
        if (!"default".equals(soundResourceName) && resources.getIdentifier(soundResourceName, "raw", str) != 0) {
            return Uri.parse("android.resource://" + str + "/raw/" + soundResourceName);
        }
        return RingtoneManager.getDefaultUri(2);
    }

    private static PendingIntent createContentIntent(Context context, NotificationParams notificationParams, String str, PackageManager packageManager) {
        Intent intentCreateTargetIntent = createTargetIntent(str, notificationParams, packageManager);
        if (intentCreateTargetIntent == null) {
            return null;
        }
        intentCreateTargetIntent.addFlags(67108864);
        intentCreateTargetIntent.putExtras(notificationParams.paramsWithReservedKeysRemoved());
        if (shouldUploadMetrics(notificationParams)) {
            intentCreateTargetIntent.putExtra("gcm.n.analytics_data", notificationParams.paramsForAnalyticsIntent());
        }
        return PendingIntent.getActivity(context, generatePendingIntentRequestCode(), intentCreateTargetIntent, getPendingIntentFlags(1073741824));
    }

    private static Intent createTargetIntent(String str, NotificationParams notificationParams, PackageManager packageManager) {
        String string = notificationParams.getString("gcm.n.click_action");
        if (!TextUtils.isEmpty(string)) {
            Intent intent = new Intent(string);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri link = notificationParams.getLink();
        if (link != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(link);
            return intent2;
        }
        return packageManager.getLaunchIntentForPackage(str);
    }

    private static Bundle getManifestMetadata(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
        }
        return Bundle.EMPTY;
    }

    public static String getOrCreateChannel(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str) && notificationManager.getNotificationChannel(str) != null) {
                return str;
            }
            String string = bundle.getString(METADATA_DEFAULT_CHANNEL_ID);
            if (!TextUtils.isEmpty(string) && notificationManager.getNotificationChannel(string) != null) {
                return string;
            }
            if (notificationManager.getNotificationChannel(FCM_FALLBACK_NOTIFICATION_CHANNEL) == null) {
                notificationManager.createNotificationChannel(startIntentSenderForResult.dP_(FCM_FALLBACK_NOTIFICATION_CHANNEL, context.getString(2132021982), 3));
            }
            return FCM_FALLBACK_NOTIFICATION_CHANNEL;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int generatePendingIntentRequestCode() {
        return requestCodeProvider.incrementAndGet();
    }

    private static PendingIntent createDeleteIntent(Context context, Context context2, NotificationParams notificationParams) {
        if (shouldUploadMetrics(notificationParams)) {
            return createMessagingPendingIntent(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(notificationParams.paramsForAnalyticsIntent()));
        }
        return null;
    }

    private static PendingIntent createMessagingPendingIntent(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, generatePendingIntentRequestCode(), new Intent(ACTION_RECEIVER).setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), getPendingIntentFlags(1073741824));
    }

    static boolean shouldUploadMetrics(@NonNull NotificationParams notificationParams) {
        return notificationParams.getBoolean("google.c.a.e");
    }

    private static String getTag(NotificationParams notificationParams) {
        String string = notificationParams.getString("gcm.n.tag");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    public static class DisplayNotificationInfo {
        public final int id;
        public final NotificationCompat.access100 notificationBuilder;
        public final String tag;

        DisplayNotificationInfo(NotificationCompat.access100 access100Var, String str, int i2) {
            this.notificationBuilder = access100Var;
            this.tag = str;
            this.id = i2;
        }
    }
}
