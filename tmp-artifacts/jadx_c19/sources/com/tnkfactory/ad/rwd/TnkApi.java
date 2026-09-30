package com.tnkfactory.ad.rwd;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import com.tnkfactory.ad.AgreePrivacyPopupListener;
import com.tnkfactory.ad.Logger;
import com.tnkfactory.ad.ServiceCallback;
import com.tnkfactory.ad.rwd.api.ServiceTask;
import com.tnkfactory.ad.rwd.data.constants.Gdpr;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkApi {
    public static final TnkApi INSTANCE = new TnkApi();
    public static final String PPI = "__tnk_ppi__";

    public final void actionCompleted(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        getServiceTask(context).payForActionOnThread(context, str, null);
    }

    public final void appStartedOnceAMonth(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        getServiceTask(context).payForStartMonthlyOnThread(context);
    }

    public final void applicationStarted(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        getServiceTask(context).payForStartOnThread(context, null);
    }

    public final void buyCompleted(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        getServiceTask(context).addTraceForBuyOnThread(context, str);
    }

    public final void deleteTestLog(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        getServiceTask(context).deleteTestLog(context);
    }

    public final boolean getAgreePrivacy(@Nullable Activity activity) {
        Settings settings = Settings.INSTANCE;
        Intrinsics.checkNotNull(activity);
        return settings.isAgreePrivacy(activity);
    }

    public final int getReferrer(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return Settings.INSTANCE.getReferrer(context);
    }

    public final ServiceTask getServiceTask(@NotNull Context context) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "");
        TnkCore tnkCore = TnkCore.INSTANCE;
        if (!tnkCore.isInitialized()) {
            tnkCore.init(context);
        }
        return tnkCore.serviceTask(context);
    }

    public final String getUserName(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return Settings.INSTANCE.getMediaUserName(context);
    }

    public final void prohibitConcurrentInvoke(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ConcurrentInvokeControl.INSTANCE.prohibitConcurrentInvoke(str, str2);
    }

    public final long[] purchaseItem(@NotNull Context context, int i2, @Nullable String str) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "");
        ServiceTask serviceTask = getServiceTask(context);
        Intrinsics.checkNotNull(str);
        return serviceTask.purchaseItem(context, i2, str);
    }

    public final void queryAdvertiseCount(@NotNull Context context, @Nullable ServiceCallback serviceCallback) {
        Intrinsics.checkNotNullParameter(context, "");
        getServiceTask(context).getAdvertiserCount(context, serviceCallback);
    }

    public final void queryAdvertiseState(@NotNull Context context, @Nullable ServiceCallback serviceCallback) {
        Intrinsics.checkNotNullParameter(context, "");
        getServiceTask(context).queryAdvertiseState(context, serviceCallback);
    }

    public final int queryPoint(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return getServiceTask(context).queryPoint(context);
    }

    public final void queryPublishState(@NotNull Context context, @Nullable ServiceCallback serviceCallback) {
        Intrinsics.checkNotNullParameter(context, "");
        getServiceTask(context).queryPublishState(context, serviceCallback);
    }

    public final void setAdWallReload(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Settings.INSTANCE.setAdWallReload(context);
    }

    public final void setAdWallStyle(@NotNull Context context, int i2, int i3) {
        Intrinsics.checkNotNullParameter(context, "");
        Settings.INSTANCE.setAdWallStyle(context, i3, i2);
    }

    public final void setAgreePrivacy(@Nullable Activity activity, boolean z) {
        Settings settings = Settings.INSTANCE;
        Intrinsics.checkNotNull(activity);
        settings.setAgreePrivacy(activity, z);
    }

    public final void setCOPPA(@NotNull Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        getServiceTask(context).setCOPPA(z ? 1 : 0);
        Settings.INSTANCE.setCOPPA(context, z ? 1 : 0);
    }

    public final void setDeviceIds(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        TnkCore.INSTANCE.setDeviceIds(str, str2);
    }

    public final void setGdprConsent(@NotNull Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        int gdpr_consent_true = z ? Gdpr.INSTANCE.getGDPR_CONSENT_TRUE() : Gdpr.INSTANCE.getGDPR_CONSENT_FALSE();
        getServiceTask(context).setGDPR(gdpr_consent_true);
        Settings.INSTANCE.setGDPR(context, gdpr_consent_true);
    }

    public final void setUserAge(@NotNull Context context, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        getServiceTask(context).setUserAge(i2);
        Settings.INSTANCE.setUserAge(context, i2);
    }

    public final void setUserCat(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        getServiceTask(context).setUserCat(str);
        Settings.INSTANCE.setUserCat(context, str);
    }

    public final void setUserCatExt(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        getServiceTask(context).setUserCatExt(str);
        Settings.INSTANCE.setUserCatExt(context, str);
    }

    public final void setUserGender(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        getServiceTask(context).setUserGender(str);
        Settings.INSTANCE.setUserSex(context, str);
    }

    public final void setUserName(@NotNull Context context, @NotNull String str) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (!Utils.isNull(str)) {
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            if (bytes.length > 256) {
                Logger.e("setUserName : " + Resources.getResources().error_user_name_exceeded_256_bytes);
                return;
            }
        }
        ServiceTask serviceTask = getServiceTask(context);
        Settings settings = Settings.INSTANCE;
        if (!Intrinsics.areEqual(settings.getMediaUserName(context), str)) {
            settings.setAgreePrivacy(context, false);
        }
        serviceTask.setUserName(str);
        settings.setMediaUserName(context, str);
    }

    public final void showAgreePrivacyPopup(@Nullable Activity activity, @Nullable AgreePrivacyPopupListener agreePrivacyPopupListener) {
        Settings settings = Settings.INSTANCE;
        Intrinsics.checkNotNull(activity);
        settings.setAgreePrivacy(activity, false);
        AgreePrivacyPopupDialog agreePrivacyPopupDialog = new AgreePrivacyPopupDialog(activity);
        agreePrivacyPopupDialog.setAgreePrivacyPopupListener(agreePrivacyPopupListener);
        agreePrivacyPopupDialog.show();
    }

    public final int withdrawPoints(@NotNull Context context, @Nullable String str) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "");
        ServiceTask serviceTask = getServiceTask(context);
        Intrinsics.checkNotNull(str);
        return serviceTask.withdrawPoints(context, str);
    }

    public final void purchaseItem(@NotNull Context context, int i2, @Nullable String str, @Nullable ServiceCallback serviceCallback) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "");
        ServiceTask serviceTask = getServiceTask(context);
        Intrinsics.checkNotNull(str);
        serviceTask.purchaseItem(context, i2, str, serviceCallback);
    }

    public final void queryPoint(@NotNull Context context, @Nullable ServiceCallback serviceCallback) {
        Intrinsics.checkNotNullParameter(context, "");
        getServiceTask(context).queryPoint(context, serviceCallback);
    }

    public final void withdrawPoints(@NotNull Context context, @Nullable String str, @Nullable ServiceCallback serviceCallback) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "");
        ServiceTask serviceTask = getServiceTask(context);
        Intrinsics.checkNotNull(str);
        serviceTask.withdrawPoints(context, str, serviceCallback);
    }
}
