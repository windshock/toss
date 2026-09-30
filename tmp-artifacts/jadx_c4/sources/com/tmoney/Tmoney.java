package com.tmoney;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.nfc.tech.IsoDep;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.skt.usp.UCPApiConstants;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.TmoneyConstants;
import com.tmoney.TmoneyInfo;
import com.tmoney.c.c;
import com.tmoney.dto.AcntBnkInfoResultDto;
import com.tmoney.dto.BalanceDto;
import com.tmoney.dto.CardInfoDto;
import com.tmoney.dto.CardListDto;
import com.tmoney.dto.CreditCardGroupDto;
import com.tmoney.dto.DiscountCardDto;
import com.tmoney.dto.DiscountNDeductionInfoDto;
import com.tmoney.dto.GiftDto;
import com.tmoney.dto.MembershipDto;
import com.tmoney.dto.MonthlyHistoryDto;
import com.tmoney.dto.MonthlySumDto;
import com.tmoney.dto.OtcDto;
import com.tmoney.dto.PartnerDto;
import com.tmoney.dto.PayMethodInfoDto;
import com.tmoney.dto.PostpaidBillingDayDto;
import com.tmoney.dto.PostpaidBillingInfoDto;
import com.tmoney.dto.PrepaidMethodInfoListDto;
import com.tmoney.dto.PurseHistoryDto;
import com.tmoney.dto.RefundDataDto;
import com.tmoney.dto.TopupRemitDto;
import com.tmoney.dto.TpoResultData;
import com.tmoney.dto.TransHistoryDto;
import com.tmoney.g.d;
import com.tmoney.kscc.sslio.a.ag;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.logger.TmoneyLogger;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.Callback;
import com.tmoney.utils.CryptoByKeyStore;
import com.tmoney.utils.LogHelper;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class Tmoney {
    private static int IAuthTabCallback = 0;
    public static final String TAG = "Tmoney";
    private static Tmoney a = null;
    private static int asBinder = 0;
    private static Context b = null;
    private static a c = null;
    private static TmoneyLogger d = null;
    private static String e = "";
    private static String f = "";
    private static String g = "";
    private static String h = "";
    private static boolean i = false;
    private static String j = "";
    private static String k = "";
    private static String l = "";
    private static String m = "";
    private static String n = "";

    /* renamed from: o, reason: collision with root package name */
    private static String f2o = "";
    private static byte[] onExtraCallback = null;
    private static short[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 0;
    private static String p = "";
    private static String q = "";
    private static TmoneyConstants.TmoneyServerType r;
    private static TmoneyConstants.TmoneySdkDebugType s;
    private static boolean t;
    private static long u;
    private static boolean v;
    private static final byte[] $$a = {19, 50, -9, 119};
    private static final int $$b = 214;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onTransact = 1;

    /* renamed from: com.tmoney.Tmoney$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ApiName.values().length];
            a = iArr;
            try {
                iArr[ApiName.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ApiName.PAY_METHOD_LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ApiName.PREPAID_METHOD_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ApiName.LIVE_CHECK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ApiName.LONG_TIME_NO_USE_DISABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ApiName.LOST_DISABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ApiName.TPO_INFO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ApiName.OTC_KEY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ApiName.USE_PLACE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ApiName.DISCOUNT_CARD_REGIST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ApiName.DISCOUNT_N_DEDUCTION_INFO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ApiName.USABLE_TMONEY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[ApiName.USABLE_OMA_AUTH.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[ApiName.CARD_INFO.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[ApiName.WITHDRAW_RESTORATION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[ApiName.POSTPAID_CREDIT_CARD_REGIST.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[ApiName.PREPAID_CREDIT_CARD_REGIST.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[ApiName.PREPAID_CREDIT_CARD_UNREGIST.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[ApiName.PREPAID_CREDIT_CARD_CHANGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[ApiName.POSTPAID_ONEDAY_LIMIT_REMAIN_COUNT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[ApiName.ONETIME_LIMIT_RESTORE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[ApiName.CREDIT_CARD_LIST.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[ApiName.MONTHLY_HISTORY.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[ApiName.ACNT_BNK_INFO.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[ApiName.REFUND.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[ApiName.REFUND_FEE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[ApiName.SERVICE_JOIN_PREPAID.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                a[ApiName.SERVICE_JOIN_POSTPAID.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                a[ApiName.SERVICE_TERMINATE.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                a[ApiName.SERVICE_CONVERSION.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                a[ApiName.PREPAID_LOST_ACCOUNT_REGIST.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                a[ApiName.PURSE_HISTORY.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                a[ApiName.TRANS_HISTORY.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                a[ApiName.SEL_CHIP.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                a[ApiName.PREPAID_PHONE_BILL_LOAD.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                a[ApiName.POSTPAID_BILLING_DAY.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                a[ApiName.POSTPAID_BILLING_INFO.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                a[ApiName.PREPAID_CREDIT_CARD_LOAD.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                a[ApiName.ENABLE_TMONEY.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                a[ApiName.TMONEY_1TH_ISSUE.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                a[ApiName.TMONEY_2TH_ISSUE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                a[ApiName.TMILEAGE.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                a[ApiName.PARTNER_INFO.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                a[ApiName.INCREASE_LIMIT.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                a[ApiName.MEMBERSHIP_ISSUE.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                a[ApiName.MEMBERSHIP_INFO.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                a[ApiName.MEMBERSHIP_DELETE.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                a[ApiName.SEND_GIFT.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                a[ApiName.NFC_PAY_METHOD_LOAD.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                a[ApiName.NFC_CREDIT_CARD_LOAD.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                a[ApiName.NFC_ENABLE_CHECK.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                a[ApiName.NFC_PHONE_BILL_LOAD.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                a[ApiName.NFC_SEL_CHIP.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                a[ApiName.NFC_ACK.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                a[ApiName.NFC_CARD_INFO.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                a[ApiName.NFC_PURSE_HISTORY.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                a[ApiName.NFC_TRANS_HISTORY.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                a[ApiName.TOPUP_READY.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                a[ApiName.NFC_TOPUP_READY.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                a[ApiName.REFUND_HISTORY.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                a[ApiName.MONTHLY_SUM.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                a[ApiName.NFC_TRANSFER_MILEAGE.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
        }
    }

    public static class Api {
        private TmoneyCallback a;
        private ApiName b;
        private ResultListener c = new ResultListener() { // from class: com.tmoney.Tmoney.Api.3
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) {
                String str;
                String str2;
                String str3;
                if (TmoneyData.getInstance().isNotUseUsimPartner()) {
                    resultType.setMessage(Api.a(Api.this, resultType.getMessage()));
                }
                Object cardInfoDto = null;
                String str4 = "";
                if (resultType == TmoneyCallback.ResultType.SUCCESS) {
                    switch (AnonymousClass3.a[Api.this.b.ordinal()]) {
                        case 1:
                        case 14:
                        case 55:
                            cardInfoDto = new CardInfoDto((String) resultType.getData()[0], ((Integer) resultType.getData()[1]).intValue());
                            break;
                        case 2:
                        case 25:
                        case 35:
                        case 38:
                        case 49:
                        case 50:
                        case 52:
                            cardInfoDto = new BalanceDto((String) resultType.getData()[0], ((Integer) resultType.getData()[1]).intValue(), ((Integer) resultType.getData()[2]).intValue());
                            break;
                        case 3:
                            cardInfoDto = resultType.getData()[0];
                            break;
                        case 7:
                        case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                        case 11:
                        case 20:
                        case 22:
                        case 23:
                        case 24:
                        case 26:
                        case 32:
                        case 33:
                        case 34:
                        case 36:
                        case 37:
                        case 42:
                        case 45:
                        case 46:
                        case 53:
                        case 56:
                        case 57:
                        case 58:
                        case 60:
                        case 61:
                            cardInfoDto = resultType.getData()[0];
                            break;
                        case 8:
                            cardInfoDto = new OtcDto((String) resultType.getData()[0], (String) resultType.getData()[1]);
                            break;
                        case 10:
                            cardInfoDto = new DiscountCardDto((String) resultType.getData()[0], (String) resultType.getData()[1]);
                            break;
                        case 43:
                            cardInfoDto = new PartnerDto((String) resultType.getData()[0], (String) resultType.getData()[1], (String) resultType.getData()[2]);
                            break;
                        case 48:
                            cardInfoDto = new GiftDto((String) resultType.getData()[0], ((Integer) resultType.getData()[1]).intValue(), ((Integer) resultType.getData()[2]).intValue());
                            break;
                        case 51:
                            cardInfoDto = new BalanceDto((String) resultType.getData()[0], ((Integer) resultType.getData()[1]).intValue(), ((Integer) resultType.getData()[2]).intValue());
                            break;
                        case 59:
                            cardInfoDto = resultType.getData()[0];
                            break;
                        case 62:
                            cardInfoDto = new BalanceDto((String) resultType.getData()[0], ((Integer) resultType.getData()[1]).intValue(), ((Integer) resultType.getData()[2]).intValue());
                            break;
                    }
                } else {
                    if (resultType.getError() == ResultError.EXCEPTION) {
                        LogHelper.exception(Tmoney.TAG, resultType.getException());
                    }
                    if (resultType.getDetailCode().equals("PO79")) {
                        TmoneyData.getInstance(Tmoney.a()).setSaveCardInfo("");
                        new c(Tmoney.a(), null).requestOnlyDate();
                    }
                    if (TextUtils.isEmpty(resultType.getMessage())) {
                        resultType.setMessage(ResultDetailCode.EXCEPTION_SERVER.getMessage());
                    }
                    if (resultType.getDetailCode().equals(ResultDetailCode.USIM_CHANGED.getCodeString())) {
                        Tmoney.g();
                        Tmoney.h();
                    }
                }
                if (resultType.getError() != ResultError.SUCCESS && Tmoney.f().isTagException()) {
                    resultType.setMessage(ResultDetailCode.NFC_TAG_ERROR.getMessage());
                }
                a.getInstance().clearTagException();
                StringBuilder sb = new StringBuilder("onResult ResultType.");
                sb.append(resultType.name());
                if (resultType.getError() != null) {
                    str = " / ResultError : " + resultType.getError();
                } else {
                    str = "";
                }
                sb.append(str);
                if (resultType.getDetailCode() != null) {
                    str2 = " / " + resultType.getDetailCode();
                } else {
                    str2 = "";
                }
                sb.append(str2);
                if (resultType.getMessage() != null) {
                    str3 = " / " + resultType.getMessage();
                } else {
                    str3 = "";
                }
                sb.append(str3);
                if (resultType.getLog() != null) {
                    str4 = " / " + resultType.getLog();
                }
                sb.append(str4);
                LogHelper.dw(Tmoney.TAG, sb.toString());
                Api api = Api.this;
                Api.a(api, api.b, resultType, cardInfoDto);
            }
        };

        public Api(ApiName apiName, TmoneyCallback tmoneyCallback) {
            this.b = apiName;
            this.a = tmoneyCallback;
        }

        static /* synthetic */ String a(Api api, String str) {
            return str.replace("네트워크 상태 확인 및 유심 Agent 확인하여 다시 시도해주세요.", "").replace("USIM정보", "티머니카드").replace("USIM모듈", "티머니카드").replace("티머니(USIM)", "티머니카드").replace("티머니 유심", "티머니카드").replace("유심 모듈", "티머니카드").replace("USIM 앱", "티머니카드").replace("USIM", "티머니카드").replace("유심", "티머니카드");
        }

        static /* synthetic */ void a(Api api, final ApiName apiName, final TmoneyCallback.ResultType resultType, final Object obj) {
            if (api.a != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tmoney.Tmoney.Api.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        Api.this.a.onResult(apiName, resultType, obj);
                    }
                });
            }
        }

        static /* synthetic */ void a(final ApiName apiName, final TmoneyCallback tmoneyCallback, final Object[] objArr) {
            ApiName apiName2 = ApiName.INIT;
            if (apiName == apiName2 || !Tmoney.c()) {
                c(apiName, tmoneyCallback, objArr);
            } else {
                LogHelper.d(Tmoney.TAG, "call_INIT()");
                new Api(apiName2, new TmoneyCallback() { // from class: com.tmoney.Tmoney.Api.1
                    @Override // com.tmoney.listener.TmoneyCallback, com.tmoney.listener.a
                    public final void onResult(ApiName apiName3, TmoneyCallback.ResultType resultType, Object obj) {
                        Api.c(apiName, tmoneyCallback, objArr);
                    }
                }).a(new Object[0]);
            }
            Tmoney.b(false);
        }

        private void a(Object... objArr) {
            LogHelper.d("API", this.b.name());
            switch (AnonymousClass3.a[this.b.ordinal()]) {
                case 1:
                    Tmoney.f().init(this.c);
                    break;
                case 2:
                    Tmoney.f().payMethodLoad((String) objArr[0], (String) objArr[1], ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue(), ((Integer) objArr[4]).intValue(), this.c);
                    break;
                case 3:
                    Tmoney.f().prepaidMethodInfo((String) objArr[0], this.c);
                    break;
                case 4:
                    Tmoney.f().liveCheck(this.c);
                    break;
                case 5:
                    Tmoney.f().longTimeNoUseDisable(this.c);
                    break;
                case 6:
                    Tmoney.f().lostDisable(this.c);
                    break;
                case 7:
                    Tmoney.f().tpoInfo(this.c);
                    break;
                case 8:
                    Tmoney.f().otcKey(this.c);
                    break;
                case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                    Tmoney.f().usePlaceInfo(this.c);
                    break;
                case 10:
                    Tmoney.f().discountCardRegist(((Boolean) objArr[0]).booleanValue(), (String) objArr[1], this.c);
                    break;
                case 11:
                    Tmoney.f().discountNDeductionInfo(this.c);
                    break;
                case LiveCheckConstants.SVC_U1 /* 12 */:
                    Tmoney.f().usableTmoney(this.c);
                    break;
                case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                    Tmoney.f().usableOmaAuth(this.c);
                    break;
                case 14:
                    Tmoney.f().cardInfo(this.c);
                    break;
                case 15:
                    Tmoney.f().withdrawRestoration(this.c);
                    break;
                case 16:
                    Tmoney.f().postpaidCreditCardRegist((PayMethodInfoDto) objArr[0], this.c);
                    break;
                case 17:
                    Tmoney.f().prepaidCreditCardRegist((PayMethodInfoDto) objArr[0], this.c);
                    break;
                case UCPApiConstants.MULTI_UICC_MIN_SEIOAGENT_VERSION_CODE /* 18 */:
                    Tmoney.f().prepaidCreditCardUnRegist(this.c);
                    break;
                case 19:
                    Tmoney.f().prepaidCreditCardChange((PayMethodInfoDto) objArr[0], this.c);
                    break;
                case 20:
                    Tmoney.f().getPostPaidOneDayLimitRemainCount(this.c);
                    break;
                case 21:
                    Tmoney.f().onetimeLimitRestore(-999, -999, this.c);
                    break;
                case 22:
                    Tmoney.f().creditCardList(this.c);
                    break;
                case 23:
                    Tmoney.f().monthlyHistory((TmoneyConstants.MonthlyHistoryType) objArr[0], (String) objArr[1], ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue(), this.c);
                    break;
                case 24:
                    Tmoney.f().acntBnkInfo(this.c);
                    break;
                case 25:
                    Tmoney.f().refund(((Boolean) objArr[0]).booleanValue(), (String) objArr[1], (String) objArr[2], (String) objArr[3], ((Integer) objArr[4]).intValue(), ((Integer) objArr[5]).intValue(), true, this.c);
                    break;
                case 26:
                    Tmoney.f().refundFee(((Integer) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue(), this.c);
                    break;
                case 27:
                    Tmoney.f().serviceJoinPrePaid((String) objArr[0], (String) objArr[1], (String) objArr[2], this.c);
                    break;
                case 28:
                    Tmoney.f().serviceJoinPostPaid((String) objArr[0], (String) objArr[1], (String) objArr[2], this.c);
                    break;
                case 29:
                    Tmoney.f().serviceTerminate(this.c);
                    break;
                case 30:
                    Tmoney.f().serviceConversion(this.c);
                    break;
                case 31:
                    Tmoney.f().prepaidLostAccountRegist((String) objArr[0], (String) objArr[1], (String) objArr[2], this.c);
                    break;
                case 32:
                    Tmoney.f().purseHistory(this.c);
                    break;
                case 33:
                    Tmoney.f().transHistory(this.c);
                    break;
                case 34:
                    Tmoney.f().selChip(this.c);
                    break;
                case 35:
                    Tmoney.f().prepaidPhoneBillLoad((String) objArr[0], ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue(), (String) objArr[3], this.c);
                    break;
                case 36:
                    Tmoney.f().postpaidBillingDay((String) objArr[0], this.c);
                    break;
                case 37:
                    Tmoney.f().postpaidBillingInfo((String) objArr[0], (String) objArr[1], this.c);
                    break;
                case 38:
                    Tmoney.f().prepaidCreditCardLoad(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), this.c);
                    break;
                case 39:
                    Tmoney.f().enableTmoney(this.c);
                    break;
                case 40:
                    Tmoney.f().tmoney1thIssue(this.c);
                    break;
                case 41:
                    Tmoney.f().tmoney2thIssue(this.c);
                    break;
                case 42:
                    Tmoney.f().tMileage(this.c);
                    break;
                case 43:
                    Tmoney.f().partnerInfo(this.c);
                    break;
                case 44:
                    Tmoney.f().increaseLimit(this.c);
                    break;
                case 45:
                    Tmoney.f().membershipIssue((String) objArr[0], this.c);
                    break;
                case 46:
                    Tmoney.f().membershipList(this.c);
                    break;
                case 47:
                    Tmoney.f().membershipDelete((String) objArr[0], this.c);
                    break;
                case 48:
                    Tmoney.f().sendGift((String) objArr[0], (String) objArr[1], ((Integer) objArr[2]).intValue(), this.c);
                    break;
                case 49:
                    Tmoney.f().nfcPayMethodLoad((IsoDep) objArr[0], (String) objArr[1], (String) objArr[2], ((Integer) objArr[3]).intValue(), ((Integer) objArr[4]).intValue(), ((Integer) objArr[5]).intValue(), ((Boolean) objArr[6]).booleanValue(), this.c);
                    break;
                case 50:
                    Tmoney.f().nfcCreditCardLoad((IsoDep) objArr[0], ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue(), this.c);
                    break;
                case 51:
                    Tmoney.f().nfcEnableCheck((IsoDep) objArr[0], (String) objArr[1], this.c);
                    break;
                case 52:
                    Tmoney.f().nfcPhoneBillLoad((IsoDep) objArr[0], (String) objArr[1], ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue(), (String) objArr[4], this.c);
                    break;
                case 53:
                    Tmoney.f().nfcSelChip((IsoDep) objArr[0], this.c);
                    break;
                case 54:
                    Tmoney.f().nfcAck((IsoDep) objArr[0], this.c);
                    break;
                case 55:
                    Tmoney.f().nfcCardInfo((IsoDep) objArr[0], this.c);
                    break;
                case 56:
                    Tmoney.f().nfcPurseHistory((IsoDep) objArr[0], this.c);
                    break;
                case 57:
                    Tmoney.f().nfcTransHistory((IsoDep) objArr[0], this.c);
                    break;
                case 58:
                    Tmoney.f().topupReady((String) objArr[0], ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue(), (String) objArr[4], this.c);
                    break;
                case 59:
                    Tmoney.f().nfcTopupReady((String) objArr[0], ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue(), (String) objArr[4], (String) objArr[5], this.c);
                    break;
                case 60:
                    Tmoney.f().refundHistory((String) objArr[0], (String) objArr[1], this.c);
                    break;
                case 61:
                    Tmoney.f().monthlySum((String) objArr[0], (String) objArr[1], this.c);
                    break;
                case 62:
                    Tmoney.f().nfcTransferMileage((IsoDep) objArr[0], this.c);
                    break;
            }
        }

        public static Api acntBnkInfo(TmoneyCallback<AcntBnkInfoResultDto> tmoneyCallback) {
            return c(ApiName.ACNT_BNK_INFO, tmoneyCallback, new Object[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Api c(ApiName apiName, TmoneyCallback tmoneyCallback, Object... objArr) {
            ResultError resultError;
            ResultDetailCode resultDetailCode;
            Api api = new Api(apiName, tmoneyCallback);
            if (!Tmoney.checkReadPhoneNumber()) {
                resultError = ResultError.NEED_READ_PHONE_STATE_PERMISSION;
                resultDetailCode = ResultDetailCode.PERMISSION;
            } else {
                if (!Tmoney.d()) {
                    api.a(objArr);
                    return api;
                }
                if (!Tmoney.e()) {
                    Tmoney.b(apiName, tmoneyCallback, objArr);
                    return api;
                }
                resultError = ResultError.NEED_INIT;
                resultDetailCode = ResultDetailCode.NEED_INIT;
            }
            tmoneyCallback.onResult(apiName, Callback.warning(resultError, resultDetailCode), null);
            return api;
        }

        public static Api cardInfo(TmoneyCallback<CardInfoDto> tmoneyCallback) {
            return c(ApiName.CARD_INFO, tmoneyCallback, new Object[0]);
        }

        public static Api creditCardList(TmoneyCallback<CardListDto> tmoneyCallback) {
            return c(ApiName.CREDIT_CARD_LIST, tmoneyCallback, new Object[0]);
        }

        public static Api discountCardRegist(boolean z, String str, TmoneyCallback<DiscountCardDto> tmoneyCallback) {
            return c(ApiName.DISCOUNT_CARD_REGIST, tmoneyCallback, Boolean.valueOf(z), str);
        }

        public static Api discountNDeductionInfo(TmoneyCallback<DiscountNDeductionInfoDto> tmoneyCallback) {
            return c(ApiName.DISCOUNT_N_DEDUCTION_INFO, tmoneyCallback, new Object[0]);
        }

        public static Api enableTmoney(TmoneyCallback<Void> tmoneyCallback) {
            return c(ApiName.ENABLE_TMONEY, tmoneyCallback, new Object[0]);
        }

        public static Api getPostPaidOneDayLimitRemainCount(TmoneyCallback<Integer> tmoneyCallback) {
            return c(ApiName.POSTPAID_ONEDAY_LIMIT_REMAIN_COUNT, tmoneyCallback, new Object[0]);
        }

        public static Api increaseLimit(TmoneyCallback<Void> tmoneyCallback) {
            return c(ApiName.INCREASE_LIMIT, tmoneyCallback, new Object[0]);
        }

        public static Api init(TmoneyCallback<CardInfoDto> tmoneyCallback) {
            return c(ApiName.INIT, tmoneyCallback, new Object[0]);
        }

        public static Api liveCheck(TmoneyCallback<Void> tmoneyCallback) {
            return c(ApiName.LIVE_CHECK, tmoneyCallback, new Object[0]);
        }

        public static Api longTimeNoUseDisable(TmoneyCallback<Void> tmoneyCallback) {
            return c(ApiName.LONG_TIME_NO_USE_DISABLE, tmoneyCallback, new Object[0]);
        }

        public static Api lostDisable(TmoneyCallback<Void> tmoneyCallback) {
            return c(ApiName.LOST_DISABLE, tmoneyCallback, new Object[0]);
        }

        public static Api membershipDelete(String str, TmoneyCallback<Void> tmoneyCallback) {
            return c(ApiName.MEMBERSHIP_DELETE, tmoneyCallback, str);
        }

        public static Api membershipInfo(TmoneyCallback<List<MembershipDto>> tmoneyCallback) {
            return c(ApiName.MEMBERSHIP_INFO, tmoneyCallback, new Object[0]);
        }

        public static Api membershipIssue(String str, TmoneyCallback<MembershipDto> tmoneyCallback) {
            return c(ApiName.MEMBERSHIP_ISSUE, tmoneyCallback, str);
        }

        public static Api monthlyHistory(TmoneyConstants.MonthlyHistoryType monthlyHistoryType, String str, int i, int i2, TmoneyCallback<ArrayList<MonthlyHistoryDto>> tmoneyCallback) {
            return c(ApiName.MONTHLY_HISTORY, tmoneyCallback, monthlyHistoryType, str, Integer.valueOf(i), Integer.valueOf(i2));
        }

        public static Api monthlySum(String str, String str2, TmoneyCallback<ArrayList<MonthlySumDto>> tmoneyCallback) {
            return c(ApiName.MONTHLY_SUM, tmoneyCallback, str, str2);
        }

        public static Api nfcAck(IsoDep isoDep, TmoneyCallback<Void> tmoneyCallback) {
            return c(ApiName.NFC_ACK, tmoneyCallback, isoDep);
        }

        public static Api nfcCardInfo(IsoDep isoDep, TmoneyCallback<CardInfoDto> tmoneyCallback) {
            return c(ApiName.NFC_CARD_INFO, tmoneyCallback, isoDep);
        }

        public static Api nfcCreditCardLoad(IsoDep isoDep, int i, int i2, TmoneyCallback<BalanceDto> tmoneyCallback) {
            return c(ApiName.NFC_CREDIT_CARD_LOAD, tmoneyCallback, isoDep, Integer.valueOf(i), Integer.valueOf(i2));
        }

        public static Api nfcEnableCheck(IsoDep isoDep, String str, TmoneyCallback<BalanceDto> tmoneyCallback) {
            return c(ApiName.NFC_ENABLE_CHECK, tmoneyCallback, isoDep, str);
        }

        public static Api nfcPayMethodLoad(IsoDep isoDep, String str, String str2, int i, int i2, int i3, boolean z, TmoneyCallback<BalanceDto> tmoneyCallback) {
            return c(ApiName.NFC_PAY_METHOD_LOAD, tmoneyCallback, isoDep, str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z));
        }

        public static Api nfcPhoneBillLoad(IsoDep isoDep, String str, int i, int i2, String str2, TmoneyCallback<BalanceDto> tmoneyCallback) {
            return c(ApiName.NFC_PHONE_BILL_LOAD, tmoneyCallback, isoDep, str, Integer.valueOf(i), Integer.valueOf(i2), str2);
        }

        public static Api nfcPurseHistory(IsoDep isoDep, TmoneyCallback<ArrayList<PurseHistoryDto>> tmoneyCallback) {
            return c(ApiName.NFC_PURSE_HISTORY, tmoneyCallback, isoDep);
        }

        public static Api nfcSelchip(IsoDep isoDep, TmoneyCallback<byte[]> tmoneyCallback) {
            return c(ApiName.NFC_SEL_CHIP, tmoneyCallback, isoDep);
        }

        public static Api nfcTopupReady(String str, int i, int i2, int i3, String str2, String str3, TmoneyCallback<TopupRemitDto> tmoneyCallback) {
            return c(ApiName.NFC_TOPUP_READY, tmoneyCallback, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2, str3);
        }

        public static Api nfcTransHistory(IsoDep isoDep, TmoneyCallback<ArrayList<TransHistoryDto>> tmoneyCallback) {
            return c(ApiName.NFC_TRANS_HISTORY, tmoneyCallback, isoDep);
        }

        public static Api nfcTransferMileage(IsoDep isoDep, TmoneyCallback<BalanceDto> tmoneyCallback) {
            return c(ApiName.NFC_TRANSFER_MILEAGE, tmoneyCallback, isoDep);
        }

        public static Api onetimeLimitRestore(TmoneyCallback<Void> tmoneyCallback) {
            return c(ApiName.ONETIME_LIMIT_RESTORE, tmoneyCallback, new Object[0]);
        }

        public static Api otcKey(TmoneyCallback<OtcDto> tmoneyCallback) {
            return c(ApiName.OTC_KEY, tmoneyCallback, new Object[0]);
        }

        public static Api partnerInfo(TmoneyCallback<PartnerDto> tmoneyCallback) {
            return c(ApiName.PARTNER_INFO, tmoneyCallback, new Object[0]);
        }

        public static Api payMethodLoad(String str, String str2, int i, int i2, int i3, TmoneyCallback<BalanceDto> tmoneyCallback) {
            return c(ApiName.PAY_METHOD_LOAD, tmoneyCallback, str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }

        public static Api postpaidBillingDay(String str, TmoneyCallback<ArrayList<PostpaidBillingDayDto>> tmoneyCallback) {
            return c(ApiName.POSTPAID_BILLING_DAY, tmoneyCallback, str);
        }

        public static Api postpaidBillingInfo(String str, String str2, TmoneyCallback<PostpaidBillingInfoDto> tmoneyCallback) {
            return c(ApiName.POSTPAID_BILLING_INFO, tmoneyCallback, str, str2);
        }

        public static Api postpaidCreditCardRegist(PayMethodInfoDto payMethodInfoDto, TmoneyCallback<Void> tmoneyCallback) {
            return c(ApiName.POSTPAID_CREDIT_CARD_REGIST, tmoneyCallback, payMethodInfoDto);
        }

        public static Api prepaidCreditCardChange(PayMethodInfoDto payMethodInfoDto, TmoneyCallback<Void> tmoneyCallback) {
            return c(ApiName.PREPAID_CREDIT_CARD_CHANGE, tmoneyCallback, payMethodInfoDto);
        }

        public static Api prepaidCreditCardLoad(int i, int i2, TmoneyCallback<BalanceDto> tmoneyCallback) {
            return c(ApiName.PREPAID_CREDIT_CARD_LOAD, tmoneyCallback, Integer.valueOf(i), Integer.valueOf(i2));
        }

        public static Api prepaidCreditCardRegist(PayMethodInfoDto payMethodInfoDto, TmoneyCallback<Void> tmoneyCallback) {
            return c(ApiName.PREPAID_CREDIT_CARD_REGIST, tmoneyCallback, payMethodInfoDto);
        }

        public static Api prepaidCreditCardUnRegist(TmoneyCallback<Void> tmoneyCallback) {
            return c(ApiName.PREPAID_CREDIT_CARD_UNREGIST, tmoneyCallback, new Object[0]);
        }

        public static Api prepaidLostAccountRegist(String str, String str2, String str3, TmoneyCallback<Void> tmoneyCallback) {
            return c(ApiName.PREPAID_LOST_ACCOUNT_REGIST, tmoneyCallback, str, str2, str3);
        }

        public static Api prepaidMethodInfo(String str, TmoneyCallback<PrepaidMethodInfoListDto> tmoneyCallback) {
            return c(ApiName.PREPAID_METHOD_INFO, tmoneyCallback, str);
        }

        public static Api prepaidPhoneBillLoad(String str, int i, int i2, String str2, TmoneyCallback<BalanceDto> tmoneyCallback) {
            return c(ApiName.PREPAID_PHONE_BILL_LOAD, tmoneyCallback, str, Integer.valueOf(i), Integer.valueOf(i2), str2);
        }

        public static Api purseHistory(TmoneyCallback<ArrayList<PurseHistoryDto>> tmoneyCallback) {
            return c(ApiName.PURSE_HISTORY, tmoneyCallback, new Object[0]);
        }

        public static Api refund(String str, String str2, String str3, int i, int i2, TmoneyCallback<BalanceDto> tmoneyCallback) {
            return c(ApiName.REFUND, tmoneyCallback, Boolean.FALSE, str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2));
        }

        public static Api refundFee(int i, TmoneyCallback<Integer> tmoneyCallback) {
            return c(ApiName.REFUND_FEE, tmoneyCallback, Integer.valueOf(i), Boolean.FALSE);
        }

        public static Api refundHistory(String str, String str2, TmoneyCallback<ArrayList<RefundDataDto>> tmoneyCallback) {
            return c(ApiName.REFUND_HISTORY, tmoneyCallback, str, str2);
        }

        public static Api selChip(TmoneyCallback<byte[]> tmoneyCallback) {
            return c(ApiName.SEL_CHIP, tmoneyCallback, new Object[0]);
        }

        public static Api sendGift(String str, int i, String str2, TmoneyCallback<GiftDto> tmoneyCallback) {
            return c(ApiName.SEND_GIFT, tmoneyCallback, str, str2, Integer.valueOf(i));
        }

        public static Api serviceConversion(TmoneyCallback<Void> tmoneyCallback) {
            return c(ApiName.SERVICE_CONVERSION, tmoneyCallback, new Object[0]);
        }

        public static Api serviceJoinPostPaid(String str, String str2, String str3, TmoneyCallback<Void> tmoneyCallback) {
            return c(ApiName.SERVICE_JOIN_POSTPAID, tmoneyCallback, str, str2, str3);
        }

        public static Api serviceJoinPrePaid(String str, String str2, String str3, TmoneyCallback<Void> tmoneyCallback) {
            return c(ApiName.SERVICE_JOIN_PREPAID, tmoneyCallback, str, str2, str3);
        }

        public static Api serviceTerminate(TmoneyCallback<Void> tmoneyCallback) {
            return c(ApiName.SERVICE_TERMINATE, tmoneyCallback, new Object[0]);
        }

        public static Api tMileage(TmoneyCallback<Integer> tmoneyCallback) {
            return c(ApiName.TMILEAGE, tmoneyCallback, new Object[0]);
        }

        public static Api tmoney1thIssue(TmoneyCallback<Void> tmoneyCallback) {
            return c(ApiName.TMONEY_1TH_ISSUE, tmoneyCallback, new Object[0]);
        }

        public static Api tmoney2thIssue(TmoneyCallback<Void> tmoneyCallback) {
            return c(ApiName.TMONEY_2TH_ISSUE, tmoneyCallback, new Object[0]);
        }

        public static Api topupReady(String str, int i, int i2, int i3, String str2, TmoneyCallback<TopupRemitDto> tmoneyCallback) {
            return c(ApiName.TOPUP_READY, tmoneyCallback, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2);
        }

        public static Api tpoInfo(TmoneyCallback<TpoResultData> tmoneyCallback) {
            return c(ApiName.TPO_INFO, tmoneyCallback, new Object[0]);
        }

        public static Api transHistory(TmoneyCallback<ArrayList<TransHistoryDto>> tmoneyCallback) {
            return c(ApiName.TRANS_HISTORY, tmoneyCallback, new Object[0]);
        }

        public static Api usableOmaAuth(TmoneyCallback<Void> tmoneyCallback) {
            return c(ApiName.USABLE_OMA_AUTH, tmoneyCallback, new Object[0]);
        }

        public static Api usableTmoney(TmoneyCallback<Void> tmoneyCallback) {
            return c(ApiName.USABLE_TMONEY, tmoneyCallback, new Object[0]);
        }

        public static Api usePlaceInfo(TmoneyCallback<String> tmoneyCallback) {
            return c(ApiName.USE_PLACE, tmoneyCallback, new Object[0]);
        }

        public static Api withdrawRestoration(TmoneyCallback<Void> tmoneyCallback) {
            return c(ApiName.WITHDRAW_RESTORATION, tmoneyCallback, new Object[0]);
        }
    }

    public enum ApiName {
        INIT,
        PAY_METHOD_LOAD,
        PREPAID_METHOD_INFO,
        LIVE_CHECK,
        LONG_TIME_NO_USE_DISABLE,
        LOST_DISABLE,
        TPO_INFO,
        OTC_KEY,
        USE_PLACE,
        DISCOUNT_CARD_REGIST,
        DISCOUNT_N_DEDUCTION_INFO,
        USABLE_TMONEY,
        USABLE_OMA_AUTH,
        CARD_INFO,
        WITHDRAW_RESTORATION,
        POSTPAID_CREDIT_CARD_REGIST,
        PREPAID_CREDIT_CARD_REGIST,
        PREPAID_CREDIT_CARD_UNREGIST,
        PREPAID_CREDIT_CARD_CHANGE,
        POSTPAID_ONEDAY_LIMIT_REMAIN_COUNT,
        ONETIME_LIMIT_RESTORE,
        CREDIT_CARD_LIST,
        MONTHLY_HISTORY,
        ACNT_BNK_INFO,
        REFUND,
        REFUND_FEE,
        SERVICE_JOIN_PREPAID,
        SERVICE_JOIN_POSTPAID,
        SERVICE_TERMINATE,
        SERVICE_CONVERSION,
        PREPAID_LOST_ACCOUNT_REGIST,
        PURSE_HISTORY,
        TRANS_HISTORY,
        SEL_CHIP,
        PREPAID_PHONE_BILL_LOAD,
        POSTPAID_BILLING_DAY,
        POSTPAID_BILLING_INFO,
        PREPAID_CREDIT_CARD_LOAD,
        ENABLE_TMONEY,
        TMONEY_1TH_ISSUE,
        TMONEY_2TH_ISSUE,
        TMILEAGE,
        PARTNER_INFO,
        INCREASE_LIMIT,
        MEMBERSHIP_INFO,
        MEMBERSHIP_ISSUE,
        MEMBERSHIP_DELETE,
        SEND_GIFT,
        NFC_CREDIT_CARD_LOAD,
        NFC_PAY_METHOD_LOAD,
        NFC_PHONE_BILL_LOAD,
        NFC_SEL_CHIP,
        NFC_ACK,
        NFC_CARD_INFO,
        NFC_PURSE_HISTORY,
        NFC_TRANS_HISTORY,
        TOPUP_READY,
        NFC_TOPUP_READY,
        NFC_ENABLE_CHECK,
        REFUND_HISTORY,
        MONTHLY_SUM,
        NFC_TRANSFER_MILEAGE
    }

    public static class Info {
        public static int getBalance() {
            return TmoneyInfo.getInstance(Tmoney.a()).getBalance();
        }

        public static int getLimiteAmountPostPaid(String str) {
            return TmoneyInfo.getInstance(Tmoney.a()).getLimiteAmountPostPaid(str);
        }

        public static String getLogoPathUrl() {
            return TmoneyInfo.getInstance(Tmoney.a()).getLogoPathUrl();
        }

        public static boolean getPartnerApp() {
            return TmoneyInfo.getInstance(Tmoney.a()).getPartnerApp();
        }

        public static String getPartnerAppIntro() {
            return TmoneyInfo.getInstance(Tmoney.a()).getPartnerAppIntro();
        }

        public static String getPartnerAppName() {
            return TmoneyInfo.getInstance(Tmoney.a()).getPartnerAppName();
        }

        public static String getPartnerAppPackage() {
            return TmoneyInfo.getInstance(Tmoney.a()).getPartnerAppPackage();
        }

        public static String getPartnerAppWithdraw() {
            return TmoneyInfo.getInstance(Tmoney.a()).getPartnerAppWithdraw();
        }

        public static String getPartnerCd() {
            return TmoneyInfo.getInstance(Tmoney.a()).getPartnerCd();
        }

        public static float getPhoneBillFeeRate() {
            return TmoneyInfo.getInstance(Tmoney.a()).getPhoneBillFeeRate();
        }

        public static String getPhoneNumber() {
            return TmoneyInfo.getInstance(Tmoney.a()).getPhoneNumber();
        }

        public static String getPhonebillPaymentUrl(byte[] bArr, int i, int i2) {
            return TmoneyInfo.getInstance(Tmoney.a()).getPhonebillPaymentUrl(bArr, i, i2);
        }

        public static String getPhonebillUrl() {
            return TmoneyInfo.getInstance(Tmoney.a()).getPhonebillUrl();
        }

        public static String getPhonebillUrlLenCheck() {
            return TmoneyInfo.getInstance(Tmoney.a()).getPhonebillUrlLenCheck();
        }

        public static List<CreditCardGroupDto> getPostPaidCardList() {
            return TmoneyInfo.getInstance(Tmoney.a()).getPostPaidCardList();
        }

        public static List<CreditCardGroupDto> getPrePaidCardList() {
            return TmoneyInfo.getInstance(Tmoney.a()).getPrePaidCardList();
        }

        public static String getRegistedCardSuperCode() {
            return TmoneyInfo.getInstance(Tmoney.a()).getRegistedCardSuperCode();
        }

        public static TmoneyInfo.ECARD_TYPE getRegistedCardType() {
            return TmoneyInfo.getInstance(Tmoney.a()).getRegistedCardType();
        }

        public static String getRegistedCreditCardCode() {
            return TmoneyInfo.getInstance(Tmoney.a()).getRegistedCreditCardCode();
        }

        public static float getRegistedCreditCardFeeRate() {
            return TmoneyInfo.getInstance(Tmoney.a()).getRegistedCreditCardFeeRate();
        }

        public static String getRegistedCreditCardLogo() {
            return TmoneyInfo.getInstance(Tmoney.a()).getRegistedCreditCardLogo();
        }

        public static String getRegistedCreditCardLogoPathUrl() {
            return TmoneyInfo.getInstance(Tmoney.a()).getRegistedCreditCardLogoPathUrl();
        }

        public static String getRegistedCreditCardName() {
            return TmoneyInfo.getInstance(Tmoney.a()).getRegistedCreditCardName();
        }

        public static int getRegistedPostPaidLimitAmount() {
            return TmoneyInfo.getInstance(Tmoney.a()).getRegistedPostPaidLimitAmount();
        }

        public static int getRegistedPostPaidOneDayLimitRemainCount() {
            return TmoneyInfo.getInstance(Tmoney.a()).getRegistedPostPaidOneDayLimitRemainCount();
        }

        public static TmoneyConstants.TmoneyServerType getServerType() {
            int serverType = TmoneyData.getInstance().getServerType();
            return serverType == 1 ? TmoneyConstants.TmoneyServerType.Beta : serverType == 2 ? TmoneyConstants.TmoneyServerType.Release : TmoneyConstants.TmoneyServerType.Alpha;
        }

        public static TmoneyConstants.TelecomType getTelecomType() {
            return TmoneyInfo.getInstance(Tmoney.a()).getTelecomType();
        }

        public static String getTmoneyCardNumber() {
            return TmoneyInfo.getInstance(Tmoney.a()).getTmoneyCardNumber();
        }

        public static String getUicc() {
            return TmoneyInfo.getInstance(Tmoney.a()).getUicc();
        }

        public static String getUserId() {
            return TmoneyInfo.getInstance(Tmoney.a()).getUserId();
        }

        public static boolean isCreditPostPaid(String str) {
            return TmoneyInfo.getInstance(Tmoney.a()).isCreditPostPaid(str);
        }

        public static boolean isDiscountCard() {
            return TmoneyInfo.getInstance(Tmoney.a()).isDiscountCard();
        }

        public static boolean isJoinedService() {
            return TmoneyInfo.getInstance(Tmoney.a()).isJoinedService();
        }

        public static boolean isLmtModTgtYn() {
            return TmoneyData.getInstance().isLmtModTgtYn();
        }

        public static boolean isMobileTmoneyPlatform() {
            return TmoneyInfo.getInstance(Tmoney.a()).isMobileTmoneyPlatform();
        }

        public static boolean isMobileTmoneyPostPaidPlatform() {
            return TmoneyInfo.getInstance(Tmoney.a()).isMobileTmoneyPostPaidPlatform();
        }

        public static boolean isPartnerJoin() {
            return TmoneyInfo.getInstance(Tmoney.a()).isPartnerJoin();
        }

        public static boolean isPostPaid() {
            return TmoneyInfo.getInstance(Tmoney.a()).isPostPaid();
        }

        public static boolean isPostPaidCreditCard(String str) {
            return TmoneyInfo.getInstance(Tmoney.a()).isPostPaidCreditCard(str);
        }

        public static boolean isPrePaid() {
            return TmoneyInfo.getInstance(Tmoney.a()).isPrePaid();
        }

        public static boolean isRegistedPostPaidCreditCard() {
            return TmoneyInfo.getInstance(Tmoney.a()).isRegistedPostPaidCreditCard();
        }

        public static boolean isRegistedPrePaidCreditCard() {
            return TmoneyInfo.getInstance(Tmoney.a()).isRegistedPrePaidCreditCard();
        }

        public static boolean isSktTelecom() {
            return TmoneyInfo.getInstance(Tmoney.a()).isSktTelecom();
        }

        public static boolean isTmoneyAvailability() {
            return TmoneyInfo.getInstance(Tmoney.a()).isTmoneyAvailability();
        }

        public static void setAdvertisingId(String str) {
            TmoneyData.getInstance().setAdvertisingId(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = (i2 * 3) + 4;
        int i8 = i4 * 2;
        byte[] bArr = $$a;
        int i9 = 115 - (i3 * 3);
        byte[] bArr2 = new byte[1 - i8];
        int i10 = 0 - i8;
        if (bArr == null) {
            i6 = i7;
            int i11 = i10;
            i5 = 0;
            i7 += -i11;
            i6++;
            bArr2[i5] = (byte) i7;
            if (i5 == i10) {
                return new String(bArr2, 0);
            }
            i5++;
            i11 = bArr[i6];
            i7 += -i11;
            i6++;
            bArr2[i5] = (byte) i7;
            if (i5 == i10) {
            }
        } else {
            i5 = 0;
            i6 = i7;
            i7 = i9;
            bArr2[i5] = (byte) i7;
            if (i5 == i10) {
            }
        }
    }

    static {
        asBinder = 0;
        onNavigationEvent();
        r = TmoneyConstants.TmoneyServerType.Alpha;
        s = TmoneyConstants.TmoneySdkDebugType.Debug;
        t = false;
        u = 0L;
        v = false;
        int i2 = onTransact + 41;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ long a(long j2) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 19;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        u = 0L;
        int i6 = i3 + 93;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 51 / 0;
        }
        return 0L;
    }

    static /* synthetic */ Context a() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 113;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Context context = b;
        if (i4 != 0) {
            int i5 = 13 / 0;
        }
        return context;
    }

    static /* synthetic */ void a(ApiName apiName, TmoneyCallback tmoneyCallback, Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 101;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        c(apiName, tmoneyCallback, objArr);
        int i5 = IAuthTabCallbackDefault + 73;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ boolean a(boolean z) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 37;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        t = false;
        boolean z2 = i5 == 0;
        int i6 = i4 + 119;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    static /* synthetic */ void b() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 21;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        k();
        int i5 = IAuthTabCallbackStub + 121;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
    }

    static /* synthetic */ void b(final ApiName apiName, final TmoneyCallback tmoneyCallback, final Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 119;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        LogHelper.d(TAG, "#[API] cardList()");
        u = System.currentTimeMillis();
        if (!TextUtils.equals(k, CodeConstants.EPARTNER_CODE.NEW_TPAY.getCode()) && !TextUtils.equals(k, CodeConstants.EPARTNER_CODE.SK_TPAY.getCode())) {
            c.creditCardList(new ResultListener() { // from class: com.tmoney.Tmoney.1
                @Override // com.tmoney.listener.ResultListener
                public final void onResult(final TmoneyCallback.ResultType resultType) {
                    if (resultType == TmoneyCallback.ResultType.SUCCESS) {
                        Tmoney.a(apiName, tmoneyCallback, objArr);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tmoney.Tmoney.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                Tmoney.a(0L);
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                tmoneyCallback.onResult(apiName, resultType, null);
                            }
                        });
                    }
                }
            });
            return;
        }
        c(apiName, tmoneyCallback, objArr);
        int i5 = IAuthTabCallbackDefault + 69;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ boolean b(boolean z) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 39;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        v = false;
        int i6 = i4 + 79;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void c(ApiName apiName, TmoneyCallback tmoneyCallback, Object... objArr) {
        int i2 = 2 % 2;
        LogHelper.d(TAG, "#[API] trdr0013()");
        new ag(b, new 2(apiName, tmoneyCallback, objArr)).execute();
        int i3 = IAuthTabCallbackStub + 61;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ boolean c() {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 63;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            z = v;
            int i5 = 71 / 0;
        } else {
            z = v;
        }
        int i6 = i3 + 35;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public static boolean checkReadPhoneNumber() throws Throwable {
        StringBuilder sb;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 101;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            com.tmoney.g.a.isGetTelecomUiccOS();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (com.tmoney.g.a.isGetTelecomUiccOS() && b.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
            int i4 = IAuthTabCallbackStub + 97;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        try {
            ((TelephonyManager) b.getSystemService("phone")).getLine1Number();
            return true;
        } catch (SecurityException e2) {
            e = e2;
            Object[] objArr = new Object[1];
            w((short) TextUtils.indexOf("", ""), (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) - 51), Color.green(0) - 1467852361, 61047 - AndroidCharacter.getMirror('0'), (-93) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
            sb = new StringBuilder(((String) objArr[0]).intern());
            sb.append(e.getMessage());
            LogHelper.d(TAG, sb.toString());
            return false;
        } catch (Exception e3) {
            e = e3;
            sb = new StringBuilder("checkReadPhoneNumber()>>Exception>>");
            sb.append(e.getMessage());
            LogHelper.d(TAG, sb.toString());
            return false;
        }
    }

    static /* synthetic */ boolean d() {
        int i2 = 2 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis() - TmoneyData.getInstance().getReadAfltSetupTime();
        int needAfltSetupUpdateTime = TmoneyData.getInstance().getNeedAfltSetupUpdateTime() + 10000;
        LogHelper.d(TAG, "#[API] needUpdateSetupInfo() " + needAfltSetupUpdateTime + " > " + jCurrentTimeMillis);
        if (needAfltSetupUpdateTime > jCurrentTimeMillis) {
            int i3 = IAuthTabCallbackDefault + 105;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            k();
            return false;
        }
        int i5 = IAuthTabCallbackDefault + 41;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ boolean e() {
        int i2 = 2 % 2;
        if (5000 > System.currentTimeMillis() - u) {
            int i3 = IAuthTabCallbackDefault + 45;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        int i5 = IAuthTabCallbackDefault + 7;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }

    static /* synthetic */ a f() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 85;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        a aVar = c;
        int i6 = i4 + 3;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return aVar;
    }

    static /* synthetic */ void g() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 107;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        LogHelper.d(TAG, "#[API] clearData()");
        TmoneyData.getInstance().clear();
        d.clearInstance();
        v = true;
        int i5 = IAuthTabCallbackStub + 65;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public static String getAffiliateCd() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 5;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return k;
        }
        throw null;
    }

    public static String getAffiliateKey() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 117;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String str = j;
        if (i4 == 0) {
            int i5 = 50 / 0;
        }
        return str;
    }

    public static TmoneyLogger getSdkLogger() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 33;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (a == null) {
            return null;
        }
        TmoneyLogger tmoneyLogger = d;
        int i5 = i4 + 73;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return tmoneyLogger;
    }

    static /* synthetic */ void h() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 13;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        i();
        if (i4 == 0) {
            throw null;
        }
        int i5 = IAuthTabCallbackDefault + 117;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 35 / 0;
        }
    }

    private static void i() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 89;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        LogHelper.d(TAG, "#[API] initData()");
        a aVarInit = a.init(b);
        c = aVarInit;
        aVarInit.setTmoneyServer(r, s);
        TmoneyData.getInstance().setBluetooth(Boolean.FALSE);
        TmoneyInfo.getInstance(b);
        d.clearInstance();
        TmoneyData.getInstance().setVer("22220260209");
        t = false;
        int i5 = IAuthTabCallbackDefault + 35;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static Tmoney j() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 33;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (a == null) {
            a = new Tmoney();
        }
        Tmoney tmoney = a;
        int i5 = IAuthTabCallbackStub + 61;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return tmoney;
    }

    private static void k() {
        a aVar;
        String str;
        int i2 = 2 % 2;
        LogHelper.d(TAG, "#[API] settingInitData()");
        com.tmoney.d.a aVar2 = com.tmoney.d.a.getInstance();
        String strDecrypt = CryptoByKeyStore.decrypt(TmoneyData.getInstance().getKey());
        String strSubstring = (strDecrypt + "00000000000000000000000000000000").substring(0, 32);
        aVar2.setCryptoHelperKey(strSubstring);
        aVar2.setIvByteKey(strSubstring.substring(0, 16));
        aVar2.setLogKey(strDecrypt);
        aVar2.setMktpAppToken(CryptoByKeyStore.decrypt(TmoneyData.getInstance().getMktpToken()));
        aVar2.setKtAppKey(CryptoByKeyStore.decrypt(TmoneyData.getInstance().getKtAppKey()));
        c.setVariousKey(l, m, n, f2o, p, q);
        c.setApiKey(j, k);
        c.setUserID(g);
        c.setCI(h);
        if (TmoneyData.getInstance().isNotUseUsimPartner()) {
            aVar = c;
            str = g + "ffff";
        } else {
            aVar = c;
            str = f;
            int i3 = IAuthTabCallbackDefault + 85;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
        }
        aVar.setUICC(str);
        int i5 = IAuthTabCallbackStub + 85;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        c.setPhoneNumber(e);
        t = true;
    }

    public static Tmoney setApiKey(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 33;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        LogHelper.d(TAG, "#[API] setApiKey()");
        j = str;
        k = str2;
        if (i4 == 0) {
            return j();
        }
        j();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Tmoney setCI(String str) {
        int i2 = 2 % 2;
        LogHelper.d(TAG, "#[API] setCI() " + h);
        h = str;
        if (!(!t)) {
            int i3 = IAuthTabCallbackStub + 69;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            c.setCI(str);
        }
        Tmoney tmoneyJ = j();
        int i5 = IAuthTabCallbackStub + 43;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return tmoneyJ;
    }

    public static Tmoney setLogger(TmoneyLogger tmoneyLogger) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 125;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        LogHelper.d(TAG, "#[API] setLogger()");
        d = tmoneyLogger;
        Tmoney tmoneyJ = j();
        int i5 = IAuthTabCallbackDefault + 43;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return tmoneyJ;
        }
        throw null;
    }

    public static Tmoney setPhoneNumber(String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 39;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            TmoneyData.getInstance().isOrangeOrToss();
            obj.hashCode();
            throw null;
        }
        if (!TmoneyData.getInstance().isOrangeOrToss()) {
            Tmoney tmoneyJ = j();
            int i4 = IAuthTabCallbackStub + 73;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                return tmoneyJ;
            }
            obj.hashCode();
            throw null;
        }
        LogHelper.d(TAG, "#[API] setPhoneNumber() " + t);
        String str2 = "01" + str;
        e = str2;
        if (t) {
            c.setPhoneNumber(str2);
        }
        return j();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Tmoney setTmoneyServer(TmoneyConstants.TmoneyServerType tmoneyServerType) {
        TmoneyConstants.TmoneySdkDebugType tmoneySdkDebugType;
        int i2 = 2 % 2;
        if (tmoneyServerType != TmoneyConstants.TmoneyServerType.Alpha) {
            int i3 = IAuthTabCallbackStub + 123;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                TmoneyConstants.TmoneyServerType tmoneyServerType2 = TmoneyConstants.TmoneyServerType.Beta;
                throw null;
            }
            tmoneySdkDebugType = tmoneyServerType != TmoneyConstants.TmoneyServerType.Beta ? TmoneyConstants.TmoneySdkDebugType.None : TmoneyConstants.TmoneySdkDebugType.Debug;
        }
        Tmoney tmoneyServer = setTmoneyServer(tmoneyServerType, tmoneySdkDebugType);
        int i4 = IAuthTabCallbackDefault + 77;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return tmoneyServer;
    }

    public static Tmoney setTmoneyServer(TmoneyConstants.TmoneyServerType tmoneyServerType, TmoneyConstants.TmoneySdkDebugType tmoneySdkDebugType) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 31;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        LogHelper.d(TAG, "#[API] setTmoneyServer()");
        r = tmoneyServerType;
        if (i4 == 0) {
            s = tmoneySdkDebugType;
            return j();
        }
        s = tmoneySdkDebugType;
        j();
        throw null;
    }

    public static Tmoney setUICC(String str) {
        int i2 = 2 % 2;
        LogHelper.d(TAG, "#[API] setUICC() " + t);
        f = str;
        if (t) {
            int i3 = IAuthTabCallbackDefault + 55;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                c.setUICC(str);
                throw null;
            }
            c.setUICC(str);
        }
        Tmoney tmoneyJ = j();
        int i4 = IAuthTabCallbackDefault + 87;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return tmoneyJ;
    }

    public static Tmoney setUserId(String str) {
        int i2 = 2 % 2;
        LogHelper.d(TAG, "#[API] setUserId() " + t);
        g = str;
        if (!(!t)) {
            int i3 = IAuthTabCallbackStub + 51;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            c.setUserID(str);
            if (TmoneyData.getInstance().isNotUseUsimPartner()) {
                String str2 = g + "ffff";
                f = str2;
                c.setUICC(str2);
                int i5 = IAuthTabCallbackDefault + 89;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        return j();
    }

    public static Tmoney setVariousKey(String str, String str2, String str3, String str4, String str5) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 91;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        LogHelper.d(TAG, "#[API] setVariousKey()");
        l = str;
        if (i4 == 0) {
            m = str2;
            n = str3;
            f2o = str4;
            p = str5;
            return j();
        }
        m = str2;
        n = str3;
        f2o = str4;
        p = str5;
        int i5 = 55 / 0;
        return j();
    }

    public void init(Context context) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 15;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        LogHelper.d(TAG, "init");
        b = context;
        String ver = TmoneyData.getInstance(context).getVer();
        if (TmoneyData.getInstance().getServerType() != r.ordinal() || !TextUtils.equals(ver, "22220260209")) {
            TmoneyData.getInstance(context).clear();
        }
        i();
        int i5 = IAuthTabCallbackDefault + 23;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082 A[PHI: r4
      0x0082: PHI (r4v9 byte[] A[IMMUTABLE_TYPE]) = (r4v8 byte[]), (r4v20 byte[]) binds: [B:19:0x0080, B:16:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b0 A[PHI: r0
      0x01b0: PHI (r0v10 int) = (r0v9 int), (r0v36 int) binds: [B:49:0x01ae, B:46:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b2 A[PHI: r0
      0x01b2: PHI (r0v33 int) = (r0v9 int), (r0v36 int) binds: [B:49:0x01ae, B:46:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void w(short s2, byte b2, int i2, int i3, int i4, Object[] objArr) throws Throwable {
        int i5;
        int i6;
        byte[] bArr;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 43425), (-16777174) - Color.rgb(0, 0, 0), 22439 - Gravity.getAbsoluteGravity(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                int i8 = $10 + 37;
                $11 = i8 % 128;
                long j2 = 0;
                if (i8 % 2 == 0) {
                    bArr = onExtraCallback;
                    int i9 = 5 / 0;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i10 = 0;
                        while (i10 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - ExpandableListView.getPackedPositionChild(j2)), 55 - (Process.myPid() >> 22), (ViewConfiguration.getTouchSlop() >> 8) + 2167, -299036574, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            bArr2[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i10++;
                            j2 = 0;
                        }
                        bArr = bArr2;
                    }
                    if (bArr == null) {
                        byte[] bArr3 = onExtraCallback;
                        try {
                            Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 43424), 43 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 22439 - KeyEvent.keyCodeFromString(""), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        iIntValue = (short) (((short) (onExtraCallbackWithResult[i2 + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    }
                } else {
                    bArr = onExtraCallback;
                    if (bArr != null) {
                    }
                    if (bArr == null) {
                    }
                }
            }
            if (iIntValue > 0) {
                int i11 = $10 + 73;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    i5 = ((i2 >> iIntValue) % 5) / ((int) (onWarmupCompleted ^ (-4629411779493505016L)));
                    i6 = z ? 1 : 0;
                } else {
                    i5 = ((i2 + iIntValue) - 2) + ((int) (onWarmupCompleted ^ (-4629411779493505016L)));
                    if (z) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i5 + i6;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 86, TextUtils.lastIndexOf("", '0') + 9568, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (!(!z2)) {
                        byte[] bArr6 = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s2)) ^ b2));
                    } else {
                        short[] sArr = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s2)) ^ b2));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            String string = sb.toString();
            int i13 = $11 + 57;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            objArr[0] = string;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onNavigationEvent() {
        onWarmupCompleted = -214270399;
        onNavigationEvent = -1538795437;
        IAuthTabCallback = 1936443924;
        onExtraCallback = new byte[]{-40, -59, 21, 58, -61, 48, -63, -50, -57, 46, -10, 9, -64, -50, 50, 56, -41, 59, -41, -48, -59, -48, -60, 115, -56, -58, 48, 61, -30, 44, 50, 58, -62, -35, 41, -58, 57, -42, 34, -51, 59, 56, -64};
    }
}
