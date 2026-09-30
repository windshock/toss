package com.tnkfactory.ad;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import com.tnkfactory.ad.TnkSession$;
import com.tnkfactory.ad.rwd.AdidManager;
import com.tnkfactory.ad.rwd.TnkApi;
import com.tnkfactory.ad.rwd.Utils;
import com.tnkfactory.ad.rwd.common.TAlertDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkSession {
    public static final int ANIMATION_ALPHA = 2;
    public static final int ANIMATION_BOTTOM = 3;
    public static final int ANIMATION_FLIP = 8;
    public static final int ANIMATION_GROW = 9;
    public static final int ANIMATION_LEFT = 5;
    public static final int ANIMATION_NONE = 1;
    public static final int ANIMATION_RANDOM = 0;
    public static final int ANIMATION_RIGHT = 6;
    public static final int ANIMATION_SHRINK = 10;
    public static final int ANIMATION_SPIN = 7;
    public static final int ANIMATION_TOP = 4;
    public static final int DEFAULT_SPAN_SIZE = 12;
    public static final int MAX_ANIMATIONS = 10;
    public static final String PPI = "__tnk_ppi__";
    private static final int STATE_NO = 0;
    private static int headerStickyHeight;
    private static int headerStickyHeightFoldedHeight;
    private static int windowSize;
    public static final TnkSession INSTANCE = new TnkSession();
    private static final int STATE_YES = 1;
    private static final int STATE_TEST = 2;
    private static final int STATE_CHECK = 3;
    private static final int STATE_PASSED = 4;
    private static final int STATE_STOP = 8;
    private static final int STATE_ERROR = 9;
    private static final int STATE_UNKNOWN = 99;

    private TnkSession() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isAdidLimit$lambda$5(Function1 function1, Context context) {
        try {
            if (!AdidManager.INSTANCE.getAdvertisingIdThread().isLimited()) {
                function1.invoke(Boolean.FALSE);
            } else {
                INSTANCE.runOnMainThread(new TnkSession$.ExternalSyntheticLambda0(context));
                function1.invoke(Boolean.TRUE);
            }
        } catch (Exception e) {
            INSTANCE.runOnMainThread(new TnkSession$.ExternalSyntheticLambda1(context, e, function1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isAdidLimit$lambda$5$lambda$2(Context context) {
        TAlertDialog.Companion.show(context, "광고ID 설정이 필요한 광고입니다.\n[설정] -> [개인정보 보호] -> [광고] -> [새 광고ID 받기]", "설정하기", "취소", new TnkSession$.ExternalSyntheticLambda2(context), new TnkSession$.ExternalSyntheticLambda3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit isAdidLimit$lambda$5$lambda$2$lambda$0(Context context) {
        context.startActivity(new Intent("android.settings.SETTINGS"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isAdidLimit$lambda$5$lambda$4(Context context, Exception exc, Function1 function1) {
        TAlertDialog.Companion.show(context, "광고아이디를 획득 할 수 없는 기기입니다.", new TnkSession$.ExternalSyntheticLambda4(), null);
        function1.invoke(Boolean.TRUE);
    }

    public final void actionCompleted(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            TnkApi.INSTANCE.actionCompleted(context, str);
        } catch (Exception unused) {
        }
    }

    public final void appStartedOnceAMonth(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            TnkApi.INSTANCE.appStartedOnceAMonth(context);
        } catch (Exception unused) {
        }
    }

    public final void applicationStarted(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            TnkApi.INSTANCE.applicationStarted(context);
        } catch (Exception unused) {
        }
    }

    public final void buyCompleted(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            TnkApi.INSTANCE.buyCompleted(context, str);
        } catch (Exception unused) {
        }
    }

    public final void deleteTestLog(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            TnkApi.INSTANCE.deleteTestLog(context);
        } catch (Exception unused) {
        }
    }

    public final void enableLogging(boolean z) {
        Logger.enableLogging(z);
    }

    public final boolean getAgreePrivacy(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        return TnkApi.INSTANCE.getAgreePrivacy(activity);
    }

    public final int getHeaderStickyHeight() {
        return headerStickyHeight;
    }

    public final int getHeaderStickyHeightFoldedHeight() {
        return headerStickyHeightFoldedHeight;
    }

    public final String getHelpdeskUrl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        String helpdeskUrl = Utils.getHelpdeskUrl(context);
        Intrinsics.checkNotNullExpressionValue(helpdeskUrl, "");
        return helpdeskUrl;
    }

    public final int getReferrer(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return TnkApi.INSTANCE.getReferrer(context);
    }

    public final int getSTATE_CHECK() {
        return STATE_CHECK;
    }

    public final int getSTATE_ERROR() {
        return STATE_ERROR;
    }

    public final int getSTATE_NO() {
        return STATE_NO;
    }

    public final int getSTATE_PASSED() {
        return STATE_PASSED;
    }

    public final int getSTATE_STOP() {
        return STATE_STOP;
    }

    public final int getSTATE_TEST() {
        return STATE_TEST;
    }

    public final int getSTATE_UNKNOWN() {
        return STATE_UNKNOWN;
    }

    public final int getSTATE_YES() {
        return STATE_YES;
    }

    public final String getUserName(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return TnkApi.INSTANCE.getUserName(context);
    }

    public final int getWindowSize() {
        return windowSize;
    }

    public final void isAdidLimit(@NotNull Context context, @NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        INSTANCE.runOnIoThread(new TnkSession$.ExternalSyntheticLambda5(function1, context));
    }

    public final void prohibitConcurrentInvoke(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        TnkApi.INSTANCE.prohibitConcurrentInvoke(str, str2);
    }

    public final long[] purchaseItem(@NotNull Context context, int i2, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "");
        return TnkApi.INSTANCE.purchaseItem(context, i2, str);
    }

    public final void queryAdvertiseCount(@NotNull Context context, @Nullable ServiceCallback serviceCallback) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            TnkApi.INSTANCE.queryAdvertiseCount(context, serviceCallback);
        } catch (Exception e) {
            if (serviceCallback != null) {
                serviceCallback.onReturn(context, 99);
            }
            if (serviceCallback != null) {
                serviceCallback.onError(context, e);
            }
        }
    }

    public final void queryAdvertiseState(@NotNull Context context, @Nullable ServiceCallback serviceCallback) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            TnkApi.INSTANCE.queryAdvertiseState(context, serviceCallback);
        } catch (Exception e) {
            if (serviceCallback != null) {
                serviceCallback.onReturn(context, 99);
            }
            if (serviceCallback != null) {
                serviceCallback.onError(context, e);
            }
        }
    }

    public final int queryPoint(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            return TnkApi.INSTANCE.queryPoint(context);
        } catch (Exception unused) {
            return 0;
        }
    }

    public final void queryPublishState(@NotNull Context context, @Nullable final ServiceCallback serviceCallback) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            TnkApi.INSTANCE.queryPublishState(context, new ServiceCallback() { // from class: com.tnkfactory.ad.TnkSession.queryPublishState.1
                @Override // com.tnkfactory.ad.ServiceCallback
                public void onError(Context context2, Throwable th) {
                    super.onError(context2, th);
                    ServiceCallback serviceCallback2 = serviceCallback;
                    if (serviceCallback2 != null) {
                        serviceCallback2.onReturn(context2, 99);
                    }
                }

                @Override // com.tnkfactory.ad.ServiceCallback
                public void onReturn(Context context2, Object obj) {
                    ServiceCallback serviceCallback2 = serviceCallback;
                    if (serviceCallback2 != null) {
                        serviceCallback2.onReturn(context2, obj);
                    }
                }
            });
        } catch (Exception e) {
            if (serviceCallback != null) {
                serviceCallback.onReturn(context, 99);
            }
            if (serviceCallback != null) {
                serviceCallback.onError(context, e);
            }
        }
    }

    public final void runOnIoThread(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "");
        new Thread(runnable).start();
    }

    public final void runOnMainThread(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public final void setAgreePrivacy(@NotNull Activity activity, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "");
        TnkApi.INSTANCE.setAgreePrivacy(activity, z);
    }

    public final void setDeviceIds(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        TnkApi.INSTANCE.setDeviceIds(context, str, str2);
    }

    public final void setHeaderStickyHeight(int i2) {
        headerStickyHeight = i2;
    }

    public final void setHeaderStickyHeightFoldedHeight(int i2) {
        headerStickyHeightFoldedHeight = i2;
    }

    public final void setUserName(@NotNull Context context, @Nullable String str) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "");
        TnkApi tnkApi = TnkApi.INSTANCE;
        Intrinsics.checkNotNull(str);
        tnkApi.setUserName(context, str);
    }

    public final void setWindowSize(int i2) {
        windowSize = i2;
    }

    public final void showAgreePrivacyPopup(@NotNull Activity activity, @Nullable AgreePrivacyPopupListener agreePrivacyPopupListener) {
        Intrinsics.checkNotNullParameter(activity, "");
        TnkApi.INSTANCE.showAgreePrivacyPopup(activity, agreePrivacyPopupListener);
    }

    public final int withdrawPoints(@NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "");
        return TnkApi.INSTANCE.withdrawPoints(context, str);
    }

    public final void purchaseItem(@NotNull Context context, int i2, @Nullable String str, @Nullable ServiceCallback serviceCallback) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            TnkApi.INSTANCE.purchaseItem(context, i2, str, serviceCallback);
        } catch (Exception e) {
            if (serviceCallback != null) {
                serviceCallback.onReturn(context, 99);
            }
            if (serviceCallback != null) {
                serviceCallback.onError(context, e);
            }
        }
    }

    public final void withdrawPoints(@NotNull Context context, @Nullable String str, @Nullable ServiceCallback serviceCallback) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            TnkApi.INSTANCE.withdrawPoints(context, str, serviceCallback);
        } catch (Exception e) {
            if (serviceCallback != null) {
                serviceCallback.onReturn(context, 99);
            }
            if (serviceCallback != null) {
                serviceCallback.onError(context, e);
            }
        }
    }

    public final void queryPoint(@NotNull Context context, @Nullable ServiceCallback serviceCallback) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            TnkApi.INSTANCE.queryPoint(context, serviceCallback);
        } catch (Exception e) {
            if (serviceCallback != null) {
                serviceCallback.onReturn(context, 99);
            }
            if (serviceCallback != null) {
                serviceCallback.onError(context, e);
            }
        }
    }
}
