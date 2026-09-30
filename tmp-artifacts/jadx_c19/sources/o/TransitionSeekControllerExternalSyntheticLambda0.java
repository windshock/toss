package o;

import android.icu.util.Calendar;
import com.krc.pl_card.KRCPlasticCardService;
import com.krc.pl_card.enums.ResponseCode;
import com.krc.pl_card.exceptions.EpTagException;
import com.krc.pl_card.model.dto.result.ChargeResult;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TransitionSeekControllerExternalSyntheticLambda0 extends TransitionTransitionNotificationExternalSyntheticLambda2<ThreePaneScaffoldNavigatorKtExternalSyntheticLambda0, ChargeResult> {
    private final int IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final String asBinder;
    private final String asInterface;
    private final ThreePaneScaffoldNavigatorKtExternalSyntheticLambda0 onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionSeekControllerExternalSyntheticLambda0(@NotNull ThreePaneScaffoldNavigatorKtExternalSyntheticLambda0 threePaneScaffoldNavigatorKtExternalSyntheticLambda0, int i2, @NotNull String str, @Nullable String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        super(threePaneScaffoldNavigatorKtExternalSyntheticLambda0);
        Intrinsics.checkNotNullParameter(threePaneScaffoldNavigatorKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.onExtraCallback = threePaneScaffoldNavigatorKtExternalSyntheticLambda0;
        this.IAuthTabCallback = i2;
        this.onExtraCallbackWithResult = str;
        this.onWarmupCompleted = str2;
        this.onNavigationEvent = str3;
        this.IAuthTabCallbackStub = str4;
        this.asBinder = str5;
        this.asInterface = str6;
        this.IAuthTabCallbackDefault = str7;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.TransitionTransitionNotificationExternalSyntheticLambda2
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ChargeResult onWarmupCompleted() throws EpTagException, NumberFormatException {
        Integer numValueOf;
        String strIAuthTabCallback;
        Integer numValueOf2;
        Exception exc;
        Integer num;
        Integer numValueOf3;
        String str;
        String str2;
        Integer num2;
        int i2;
        Exception exc2;
        getTargetIds gettargetidsIAuthTabCallback;
        Exception exc3;
        String str3;
        String str4;
        playTransition playtransition;
        RememberUtilsKtExternalSyntheticLambda3<getStartDelay> rememberUtilsKtExternalSyntheticLambda3;
        String strOnWarmupCompleted;
        getPropagation getpropagationOnWarmupCompleted;
        int i3;
        Integer num3 = null;
        try {
            if (this.IAuthTabCallback % 10 != 0) {
                throw new EpTagException(ResponseCode.VALIDATION_ERROR, "1원 단위 충전은 불가능합니다, PRE-STEP 1", null, 4, null);
            }
            try {
                try {
                    strIAuthTabCallback = this.onExtraCallback.onExtraCallbackWithResult().IAuthTabCallback();
                    try {
                        String str5 = this.onWarmupCompleted;
                        if (str5 != null) {
                            try {
                                if (!Intrinsics.areEqual(strIAuthTabCallback, str5)) {
                                    throw new EpTagException(ResponseCode.VALIDATION_ERROR, "카드번호가 일치하지 않습니다, PRE-STEP 4", null, 4, null);
                                }
                            } catch (Exception e) {
                                exc = e;
                                num2 = null;
                                num = null;
                                numValueOf3 = null;
                                str = null;
                                str2 = strIAuthTabCallback;
                                ApmHelper11.IAuthTabCallback("Exception Charge Failed, finally failed return", new Object[0]);
                                return new ChargeResult(false, true, exc, str2, num2, num, numValueOf3, this.IAuthTabCallback, str);
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        numValueOf = null;
                        numValueOf2 = null;
                    }
                    try {
                        int iOnNavigationEvent = this.onExtraCallback.onNavigationEvent();
                        numValueOf = Integer.valueOf(iOnNavigationEvent);
                        try {
                            i2 = this.IAuthTabCallback;
                        } catch (Exception e3) {
                            e = e3;
                            numValueOf2 = null;
                        }
                        try {
                            if (i2 + iOnNavigationEvent > 500000) {
                                throw new EpTagException(ResponseCode.CHARGE_OVER_MAX, "충전 후 잔액이 500,000원을 초과할 수 없습니다, PRE-STEP 4", null, 4, null);
                            }
                            try {
                                gettargetidsIAuthTabCallback = this.onExtraCallback.IAuthTabCallback(i2);
                                numValueOf2 = Integer.valueOf(Integer.parseInt(gettargetidsIAuthTabCallback.IAuthTabCallback(), CharsKt.IAuthTabCallback(16)));
                            } catch (Exception e4) {
                                exc2 = e4;
                                numValueOf2 = null;
                            }
                            try {
                                String str6 = "07" + gettargetidsIAuthTabCallback.onWarmupCompleted() + gettargetidsIAuthTabCallback.onWarmupCompleted() + ' ';
                                ApmHelper11.IAuthTabCallback("initializeEp> cardType " + this.onNavigationEvent + ", franchiseDivCode " + str6 + "  " + gettargetidsIAuthTabCallback, new Object[0]);
                                try {
                                    KRCPlasticCardService kRCPlasticCardService = KRCPlasticCardService.INSTANCE;
                                    if (Intrinsics.areEqual(kRCPlasticCardService.getDualCheckNtep(), "")) {
                                        kRCPlasticCardService.setDualCheckNtep(gettargetidsIAuthTabCallback.IAuthTabCallback());
                                    }
                                    kRCPlasticCardService.setNowTimeMili(Calendar.getInstance().getTimeInMillis());
                                    if (Intrinsics.areEqual(kRCPlasticCardService.getDualCheckNtep(), gettargetidsIAuthTabCallback.IAuthTabCallback()) && kRCPlasticCardService.getNowTimeMili() - kRCPlasticCardService.getOldTimeMili() <= 500) {
                                        ApmHelper11.IAuthTabCallback("Duplication Charge Request error, NT_EP(" + kRCPlasticCardService.getDualCheckNtep() + ')', new Object[0]);
                                        kRCPlasticCardService.setOldTimeMili(kRCPlasticCardService.getNowTimeMili());
                                        throw new EpTagException(ResponseCode.CHARGE_DUPLICATE_CODE, "Duplication Charge Request error.", null, 4, null);
                                    }
                                    kRCPlasticCardService.setOldTimeMili(kRCPlasticCardService.getNowTimeMili());
                                    kRCPlasticCardService.setDualCheckNtep(gettargetidsIAuthTabCallback.IAuthTabCallback());
                                    try {
                                        playtransition = playTransition.onExtraCallbackWithResult;
                                        String strOnNavigationEvent = reportCustomError.onNavigationEvent(this.IAuthTabCallback);
                                        Intrinsics.checkNotNullExpressionValue(strOnNavigationEvent, "");
                                        Object objOnExtraCallback = TransitionTransitionNotificationExternalSyntheticLambda3.onExtraCallback(new clearEndAddress(playtransition.onExtraCallbackWithResult(gettargetidsIAuthTabCallback, strOnNavigationEvent, "00" + this.onNavigationEvent, str6, this.IAuthTabCallbackStub, this.asBinder, this.asInterface), this.onExtraCallbackWithResult), null, 1, null).onWarmupCompleted(5000L).onExtraCallback();
                                        Intrinsics.checkNotNull(objOnExtraCallback);
                                        rememberUtilsKtExternalSyntheticLambda3 = (RememberUtilsKtExternalSyntheticLambda3) objOnExtraCallback;
                                        strOnWarmupCompleted = rememberUtilsKtExternalSyntheticLambda3.onNavigationEvent().onWarmupCompleted();
                                    } catch (Exception e5) {
                                        exc3 = e5;
                                        str3 = null;
                                    }
                                    try {
                                        ApmHelper11.IAuthTabCallback("card_ST_CODE " + rememberUtilsKtExternalSyntheticLambda3.onNavigationEvent().IAuthTabCallback() + "  resp_CODE " + rememberUtilsKtExternalSyntheticLambda3.onNavigationEvent().IAuthTabCallbackStub() + "  NT_LSAM " + rememberUtilsKtExternalSyntheticLambda3.onNavigationEvent().onNavigationEvent() + " req_UUID " + rememberUtilsKtExternalSyntheticLambda3.onNavigationEvent().onWarmupCompleted(), new Object[0]);
                                        if (rememberUtilsKtExternalSyntheticLambda3.onNavigationEvent().IAuthTabCallbackStub().equals("00")) {
                                            try {
                                                ApmHelper11.IAuthTabCallback("Step3, completeCredit start, card_ST_CODE " + rememberUtilsKtExternalSyntheticLambda3.onNavigationEvent().IAuthTabCallback() + ", resp_CODE " + rememberUtilsKtExternalSyntheticLambda3.onNavigationEvent().IAuthTabCallback() + '}', new Object[0]);
                                                getpropagationOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(rememberUtilsKtExternalSyntheticLambda3);
                                                ApmHelper11.IAuthTabCallback("Step3, completeCredit processed", new Object[0]);
                                                i3 = Integer.parseInt(getpropagationOnWarmupCompleted.onWarmupCompleted(), CharsKt.IAuthTabCallback(16));
                                                numValueOf3 = Integer.valueOf(i3);
                                            } catch (Exception unused) {
                                            }
                                            try {
                                                ApmHelper11.IAuthTabCallback("completeCredit => beforeBalance " + numValueOf + ", afterbalance " + numValueOf3, new Object[0]);
                                                if (i3 != this.IAuthTabCallback + iOnNavigationEvent) {
                                                    ApmHelper11.onWarmupCompleted("After balance is not matched as expected value (" + numValueOf3 + " / " + (iOnNavigationEvent + this.IAuthTabCallback));
                                                    throw new EpTagException(ResponseCode.ERROR_CHARGE_FAIL, "충전 후 잔액이 일치하지 않습니다, STEP3", null, 4, null);
                                                }
                                                try {
                                                    try {
                                                        ApmHelper11.IAuthTabCallback("Step4, Confirm LSAM start", new Object[0]);
                                                        RememberUtilsKtMapEntrySaver21 rememberUtilsKtMapEntrySaver21OnWarmupCompleted = TransitionTransitionNotificationExternalSyntheticLambda3.onExtraCallback(new clearLoadBias(playtransition.onExtraCallbackWithResult(gettargetidsIAuthTabCallback, rememberUtilsKtExternalSyntheticLambda3.onNavigationEvent(), getpropagationOnWarmupCompleted.onNavigationEvent()), "  "), null, 1, null).onWarmupCompleted(5000L);
                                                        boolean zEquals$default = StringsKt.equals$default((String) rememberUtilsKtMapEntrySaver21OnWarmupCompleted.onExtraCallback(), "0000", false, 2, (Object) null);
                                                        ApmHelper11.IAuthTabCallback("Step4, Confirm LSAM Processed, result (" + ((String) rememberUtilsKtMapEntrySaver21OnWarmupCompleted.onExtraCallback()) + ')', new Object[0]);
                                                        return new ChargeResult(zEquals$default, true, null, strIAuthTabCallback, numValueOf2, numValueOf, numValueOf3, this.IAuthTabCallback, strOnWarmupCompleted);
                                                    } catch (Exception unused2) {
                                                        throw new EpTagException(ResponseCode.CHARGE_CONFIRM_CODE, "Confirm LSAM error.", null, 4, null);
                                                    }
                                                } catch (Exception e6) {
                                                    e = e6;
                                                    str4 = strOnWarmupCompleted;
                                                    exc = e;
                                                    num = numValueOf;
                                                    str = str4;
                                                    str2 = strIAuthTabCallback;
                                                    num2 = numValueOf2;
                                                    ApmHelper11.IAuthTabCallback("Exception Charge Failed, finally failed return", new Object[0]);
                                                    return new ChargeResult(false, true, exc, str2, num2, num, numValueOf3, this.IAuthTabCallback, str);
                                                }
                                            } catch (Exception unused3) {
                                                num3 = numValueOf3;
                                                try {
                                                    ApmHelper11.IAuthTabCallback("Step3, completeCredit error", new Object[0]);
                                                    throw new EpTagException(ResponseCode.CHARGE_COMPLETE_CODE, "Card CompleteCredit error.", null, 4, null);
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    numValueOf3 = num3;
                                                    str4 = strOnWarmupCompleted;
                                                    exc = e;
                                                    num = numValueOf;
                                                    str = str4;
                                                    str2 = strIAuthTabCallback;
                                                    num2 = numValueOf2;
                                                    ApmHelper11.IAuthTabCallback("Exception Charge Failed, finally failed return", new Object[0]);
                                                    return new ChargeResult(false, true, exc, str2, num2, num, numValueOf3, this.IAuthTabCallback, str);
                                                }
                                            }
                                        }
                                        String strIAuthTabCallbackStub = rememberUtilsKtExternalSyntheticLambda3.onNavigationEvent().IAuthTabCallbackStub();
                                        int iHashCode = strIAuthTabCallbackStub.hashCode();
                                        if (iHashCode != 1537) {
                                            if (iHashCode != 1599) {
                                                if (iHashCode != 1793) {
                                                    if (iHashCode != 1567) {
                                                        if (iHashCode != 1568) {
                                                            if (iHashCode != 1823) {
                                                                if (iHashCode == 1824 && strIAuthTabCallbackStub.equals("99")) {
                                                                    StringBuilder sb = new StringBuilder();
                                                                    sb.append("resp_CODE ");
                                                                    ResponseCode responseCode = ResponseCode.CHARGE_SYSTEM_ERROR_CODE;
                                                                    sb.append(responseCode);
                                                                    sb.append(" Charge LSAM System error");
                                                                    ApmHelper11.IAuthTabCallback(sb.toString(), new Object[0]);
                                                                    throw new EpTagException(responseCode, "Debit LSAM error " + rememberUtilsKtExternalSyntheticLambda3.onNavigationEvent().IAuthTabCallbackStub(), null, 4, null);
                                                                }
                                                            } else if (strIAuthTabCallbackStub.equals("98")) {
                                                                StringBuilder sb2 = new StringBuilder();
                                                                sb2.append("resp_CODE ");
                                                                ResponseCode responseCode2 = ResponseCode.CHARGE_EXCEPT_CARDNUM_CODE;
                                                                sb2.append(responseCode2);
                                                                sb2.append(" Charge Exception Card number error");
                                                                ApmHelper11.IAuthTabCallback(sb2.toString(), new Object[0]);
                                                                throw new EpTagException(responseCode2, "Debit LSAM error " + rememberUtilsKtExternalSyntheticLambda3.onNavigationEvent().IAuthTabCallbackStub(), null, 4, null);
                                                            }
                                                        } else if (strIAuthTabCallbackStub.equals("11")) {
                                                            StringBuilder sb3 = new StringBuilder();
                                                            sb3.append("resp_CODE ");
                                                            ResponseCode responseCode3 = ResponseCode.CHARGE_BALANCE_MIN_MAX_CODE;
                                                            sb3.append(responseCode3);
                                                            sb3.append(" Charge Mlda MIN/MAX error");
                                                            ApmHelper11.IAuthTabCallback(sb3.toString(), new Object[0]);
                                                            throw new EpTagException(responseCode3, "Debit LSAM error " + rememberUtilsKtExternalSyntheticLambda3.onNavigationEvent().IAuthTabCallbackStub(), null, 4, null);
                                                        }
                                                    } else if (strIAuthTabCallbackStub.equals("10")) {
                                                        StringBuilder sb4 = new StringBuilder();
                                                        sb4.append("resp_CODE ");
                                                        ResponseCode responseCode4 = ResponseCode.CHARGE_TRANSACTION_DATE_CODE;
                                                        sb4.append(responseCode4);
                                                        sb4.append(" Charge transaction date error");
                                                        ApmHelper11.IAuthTabCallback(sb4.toString(), new Object[0]);
                                                        throw new EpTagException(responseCode4, "Debit LSAM error " + rememberUtilsKtExternalSyntheticLambda3.onNavigationEvent().IAuthTabCallbackStub(), null, 4, null);
                                                    }
                                                } else if (strIAuthTabCallbackStub.equals("89")) {
                                                    StringBuilder sb5 = new StringBuilder();
                                                    sb5.append("resp_CODE ");
                                                    ResponseCode responseCode5 = ResponseCode.CHARGE_CARD_CERTI_CODE;
                                                    sb5.append(responseCode5);
                                                    sb5.append(" Charge Card Certification error");
                                                    ApmHelper11.IAuthTabCallback(sb5.toString(), new Object[0]);
                                                    throw new EpTagException(responseCode5, "Debit LSAM error " + rememberUtilsKtExternalSyntheticLambda3.onNavigationEvent().IAuthTabCallbackStub(), null, 4, null);
                                                }
                                            } else if (strIAuthTabCallbackStub.equals("21")) {
                                                StringBuilder sb6 = new StringBuilder();
                                                sb6.append("resp_CODE ");
                                                ResponseCode responseCode6 = ResponseCode.CHARGE_CARDNUM_ERROR_CODE;
                                                sb6.append(responseCode6);
                                                sb6.append(" Charge Card number error");
                                                ApmHelper11.IAuthTabCallback(sb6.toString(), new Object[0]);
                                                throw new EpTagException(responseCode6, "Debit LSAM error " + rememberUtilsKtExternalSyntheticLambda3.onNavigationEvent().IAuthTabCallbackStub(), null, 4, null);
                                            }
                                        } else if (strIAuthTabCallbackStub.equals("01")) {
                                            StringBuilder sb7 = new StringBuilder();
                                            sb7.append("resp_CODE ");
                                            ResponseCode responseCode7 = ResponseCode.CHARGE_LSAM_INSUFFICIENT;
                                            sb7.append(responseCode7);
                                            sb7.append(" 충전 오류 (LSAM 잔액 부족)");
                                            ApmHelper11.IAuthTabCallback(sb7.toString(), new Object[0]);
                                            throw new EpTagException(responseCode7, "Debit LSAM error " + rememberUtilsKtExternalSyntheticLambda3.onNavigationEvent().IAuthTabCallbackStub(), null, 4, null);
                                        }
                                        StringBuilder sb8 = new StringBuilder();
                                        sb8.append("resp_CODE ");
                                        ResponseCode responseCode8 = ResponseCode.CHARGE_DEBIT_CODE;
                                        sb8.append(responseCode8);
                                        sb8.append(" Debit LSAM error");
                                        ApmHelper11.IAuthTabCallback(sb8.toString(), new Object[0]);
                                        throw new EpTagException(responseCode8, "Debit LSAM error " + rememberUtilsKtExternalSyntheticLambda3.onNavigationEvent().IAuthTabCallbackStub(), null, 4, null);
                                    } catch (Exception e8) {
                                        exc3 = e8;
                                        str3 = strOnWarmupCompleted;
                                        try {
                                            return new ChargeResult(false, true, exc3, strIAuthTabCallback, numValueOf2, numValueOf, null, this.IAuthTabCallback, str3);
                                        } catch (Exception e9) {
                                            e = e9;
                                            numValueOf3 = null;
                                            str4 = str3;
                                            exc = e;
                                            num = numValueOf;
                                            str = str4;
                                            str2 = strIAuthTabCallback;
                                            num2 = numValueOf2;
                                            ApmHelper11.IAuthTabCallback("Exception Charge Failed, finally failed return", new Object[0]);
                                            return new ChargeResult(false, true, exc, str2, num2, num, numValueOf3, this.IAuthTabCallback, str);
                                        }
                                    }
                                } catch (Exception unused4) {
                                    throw new EpTagException(ResponseCode.CHARGE_DUPLICATE_CODE, "Duplication Charge Request error.", null, 4, null);
                                }
                            } catch (Exception e10) {
                                exc2 = e10;
                                ApmHelper11.onNavigationEvent("Met exception while initializeEp", exc2);
                                return new ChargeResult(false, true, exc2, strIAuthTabCallback, numValueOf2, numValueOf, null, this.IAuthTabCallback, null);
                            }
                        } catch (Exception e11) {
                            e = e11;
                            exc = e;
                            num = numValueOf;
                            numValueOf3 = null;
                            str = null;
                            str2 = strIAuthTabCallback;
                            num2 = numValueOf2;
                            ApmHelper11.IAuthTabCallback("Exception Charge Failed, finally failed return", new Object[0]);
                            return new ChargeResult(false, true, exc, str2, num2, num, numValueOf3, this.IAuthTabCallback, str);
                        }
                    } catch (Exception e12) {
                        ApmHelper11.onNavigationEvent("통신 중 카드가 분리되었습니다.", e12);
                        throw new EpTagException(ResponseCode.ERROR_TAG_LOST, "통신 중 카드가 분리되었습니다.", null, 4, null);
                    }
                } catch (Exception e13) {
                    ApmHelper11.onNavigationEvent("통신 중 카드가 분리되었습니다.", e13);
                    throw new EpTagException(ResponseCode.ERROR_TAG_LOST, "통신 중 카드가 분리되었습니다.", null, 4, null);
                }
            } catch (EpTagException e14) {
                ApmHelper11.onNavigationEvent("인식된 카드가 레일플러스 카드가 아닙니다.", e14);
                throw e14;
            }
        } catch (Exception e15) {
            e = e15;
            numValueOf = null;
            strIAuthTabCallback = null;
            numValueOf2 = null;
        }
    }
}
