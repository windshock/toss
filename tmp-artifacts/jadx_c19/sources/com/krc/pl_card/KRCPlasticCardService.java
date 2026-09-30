package com.krc.pl_card;

import android.content.Intent;
import android.icu.util.Calendar;
import com.krc.pl_card.model.KRCEpCardResponse;
import com.krc.pl_card.model.KorailTradeLog;
import com.krc.pl_card.model.dto.info.KorailCardInfo;
import com.krc.pl_card.model.dto.result.CardTypeChangeResult;
import com.krc.pl_card.model.dto.result.ChargeResult;
import com.krc.pl_card.model.dto.result.RefundResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ThreePaneScaffoldNavigatorKtExternalSyntheticLambda0;
import o.TransitionSeekControllerExternalSyntheticLambda0;
import o.onAnimationEnd;
import o.setInterpolator;
import o.setPathMotion;
import o.setPropagation;
import o.setStartDelay;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class KRCPlasticCardService {
    private static long nowTimeMili;
    private static long oldTimeMili;
    public static final KRCPlasticCardService INSTANCE = new KRCPlasticCardService();
    private static String API_USER_NAME = "";
    private static String API_USER_PWD = "";
    private static String dualCheckNtep = "";

    static {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        nowTimeMili = timeInMillis;
        oldTimeMili = timeInMillis;
    }

    private KRCPlasticCardService() {
    }

    public final String getAPI_USER_NAME() {
        return API_USER_NAME;
    }

    public final String getAPI_USER_PWD() {
        return API_USER_PWD;
    }

    public final void getAllTradeLog(@NotNull Intent intent, @NotNull Function1<? super KRCEpCardResponse<List<KorailTradeLog>>, Unit> function1) {
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(function1, "");
        new setPropagation(new ThreePaneScaffoldNavigatorKtExternalSyntheticLambda0(intent)).onNavigationEvent(function1);
    }

    public final void getBalance(@NotNull Intent intent, @NotNull Function1<? super KRCEpCardResponse<KorailCardInfo>, Unit> function1) {
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(function1, "");
        new setStartDelay(new ThreePaneScaffoldNavigatorKtExternalSyntheticLambda0(intent)).onNavigationEvent(function1);
    }

    public final String getDualCheckNtep() {
        return dualCheckNtep;
    }

    public final long getNowTimeMili() {
        return nowTimeMili;
    }

    public final long getOldTimeMili() {
        return oldTimeMili;
    }

    public final void initialize(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        API_USER_NAME = str;
        API_USER_PWD = str2;
    }

    public final void requestCardTypeChangeService(@NotNull Intent intent, @Nullable String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Function1<? super KRCEpCardResponse<CardTypeChangeResult>, Unit> function1) {
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (str3.length() != 2) {
            throw new IllegalArgumentException("cardType은 반드시 2자리여야 합니다.");
        }
        if (str5.length() != 20) {
            throw new IllegalArgumentException("TradeUid는 반드시 20자리여야 합니다.");
        }
        new setInterpolator(new ThreePaneScaffoldNavigatorKtExternalSyntheticLambda0(intent), str2, str3, str4, str5, str).onNavigationEvent(function1);
    }

    public final void requestCharge(@NotNull Intent intent, @Nullable String str, int i2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull Function1<? super KRCEpCardResponse<ChargeResult>, Unit> function1) {
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (str2.length() != 2) {
            throw new IllegalArgumentException("cardType은 반드시 2자리여야 합니다.");
        }
        if (str7.length() != 20) {
            throw new IllegalArgumentException("TradeUid는 반드시 20자리여야 합니다.");
        }
        new TransitionSeekControllerExternalSyntheticLambda0(new ThreePaneScaffoldNavigatorKtExternalSyntheticLambda0(intent), i2, str7, str, str2, str3, str4, str5, str6).onNavigationEvent(function1);
    }

    public final void requestChargeMoPP(@NotNull Intent intent, @NotNull String str, @Nullable String str2, int i2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull Function1<? super KRCEpCardResponse<ChargeResult>, Unit> function1) {
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (str3.length() != 2) {
            throw new IllegalArgumentException("cardType은 반드시 2자리여야 합니다.");
        }
        if (str8.length() != 20) {
            throw new IllegalArgumentException("TradeUid는 반드시 20자리여야 합니다.");
        }
        new onAnimationEnd(new ThreePaneScaffoldNavigatorKtExternalSyntheticLambda0(intent), i2, str8, str, str2, str3, str4, str5, str6, str7).onNavigationEvent(function1);
    }

    public final void requestRefund(@NotNull Intent intent, @Nullable String str, int i2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Function1<? super KRCEpCardResponse<RefundResult>, Unit> function1) {
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (str4.length() != 20) {
            throw new IllegalArgumentException("TradeUid는 반드시 20자리여야 합니다.");
        }
        new setPathMotion(new ThreePaneScaffoldNavigatorKtExternalSyntheticLambda0(intent), i2, str2, str3, str4, str).onNavigationEvent(function1);
    }

    public final void setAPI_USER_NAME(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        API_USER_NAME = str;
    }

    public final void setAPI_USER_PWD(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        API_USER_PWD = str;
    }

    public final void setDualCheckNtep(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        dualCheckNtep = str;
    }

    public final void setNowTimeMili(long j) {
        nowTimeMili = j;
    }

    public final void setOldTimeMili(long j) {
        oldTimeMili = j;
    }
}
