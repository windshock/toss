package com.tmoney;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.Gson;
import com.tmoney.TmoneyConstants;
import com.tmoney.dto.CreditCardGroupDto;
import com.tmoney.dto.CreditCardInfoDto;
import com.tmoney.dto.CreditCardListDto;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.AppInfoHelper;
import com.tmoney.utils.ByteHelper;
import com.tmoney.utils.DeviceInfoHelper;
import com.tmoney.utils.LogHelper;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class TmoneyInfo {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static volatile TmoneyInfo b = null;
    private static int onTransact = 1;
    private final String a = "TmoneyInfo";
    private Context c;
    private static char[] onNavigationEvent = {32748, 32739};
    private static int onExtraCallback = -1184333859;
    private static boolean onExtraCallbackWithResult = true;
    private static boolean onWarmupCompleted = true;

    public TmoneyInfo(Context context) {
        this.c = context;
    }

    private List<CreditCardGroupDto> a() {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean z = true;
        if (isPrePaid()) {
            int i4 = IAuthTabCallback + 41;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        } else {
            if (!isPostPaid()) {
                return null;
            }
            z = false;
        }
        return a(z);
    }

    private List<CreditCardGroupDto> a(boolean z) {
        int i = 2 % 2;
        Gson gson = new Gson();
        String creditCardAll = TmoneyData.getInstance(getContext()).getCreditCardAll();
        ArrayList arrayList = new ArrayList();
        try {
            CreditCardListDto creditCardListDto = (CreditCardListDto) gson.fromJson(creditCardAll, CreditCardListDto.class);
            int i2 = 0;
            if (z) {
                int i3 = onTransact + 3;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                if (creditCardListDto.getAllianceCardList() != null) {
                    int i5 = onTransact + 33;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    for (int i7 = 0; i7 < creditCardListDto.getAllianceCardList().size(); i7++) {
                        CreditCardGroupDto creditCardGroupDto = creditCardListDto.getAllianceCardList().get(i7);
                        creditCardGroupDto.setAlliance(true);
                        arrayList.add(creditCardGroupDto);
                    }
                }
                if (creditCardListDto.getNonAllianceCardList() != null) {
                    int i8 = 0;
                    while (i8 < creditCardListDto.getNonAllianceCardList().size()) {
                        int i9 = IAuthTabCallback + 19;
                        onTransact = i9 % 128;
                        if (i9 % 2 == 0) {
                            CreditCardGroupDto creditCardGroupDto2 = creditCardListDto.getNonAllianceCardList().get(i8);
                            creditCardGroupDto2.setAlliance(true);
                            arrayList.add(creditCardGroupDto2);
                            i8 += 10;
                        } else {
                            CreditCardGroupDto creditCardGroupDto3 = creditCardListDto.getNonAllianceCardList().get(i8);
                            creditCardGroupDto3.setAlliance(false);
                            arrayList.add(creditCardGroupDto3);
                            i8++;
                        }
                        int i10 = onTransact + 25;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                    }
                }
            } else if (creditCardListDto.getDpcgAllianceCardList() != null) {
                while (i2 < creditCardListDto.getDpcgAllianceCardList().size()) {
                    int i12 = onTransact + 91;
                    IAuthTabCallback = i12 % 128;
                    if (i12 % 2 != 0) {
                        CreditCardGroupDto creditCardGroupDto4 = creditCardListDto.getDpcgAllianceCardList().get(i2);
                        creditCardGroupDto4.setAlliance(true);
                        arrayList.add(creditCardGroupDto4);
                        i2 += 30;
                    } else {
                        CreditCardGroupDto creditCardGroupDto5 = creditCardListDto.getDpcgAllianceCardList().get(i2);
                        creditCardGroupDto5.setAlliance(true);
                        arrayList.add(creditCardGroupDto5);
                        i2++;
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            LogHelper.exception("TmoneyInfo", e);
            return arrayList;
        }
    }

    public static TmoneyInfo getInstance() {
        TmoneyInfo tmoneyInfo;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            tmoneyInfo = b;
            int i3 = 81 / 0;
        } else {
            tmoneyInfo = b;
        }
        int i4 = IAuthTabCallback + 99;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return tmoneyInfo;
        }
        throw null;
    }

    public static TmoneyInfo getInstance(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (b == null) {
            b = new TmoneyInfo(context);
            int i3 = onTransact + 21;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        return b;
    }

    public void clear() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        b = null;
        int i4 = IAuthTabCallback + 33;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public int getAutoLoadInterval() {
        int i = 2 % 2;
        String setupInfo = TmoneyData.getInstance(getContext()).getSetupInfo(CodeConstants.AFLT_STUP_VAL_CD.LIVECHECK_CYCLE_POSTPAID.getCode());
        if (TextUtils.equals(TmoneyData.getInstance(getContext()).getPpyDpyDvsCd(), CodeConstants.EMBL_SVC_TYP_CD.PREPAID.getCode())) {
            int i2 = onTransact + 111;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                setupInfo = TmoneyData.getInstance(getContext()).getSetupInfo(CodeConstants.AFLT_STUP_VAL_CD.LIVECHECK_CYCLE_PREPAID.getCode());
                int i3 = 25 / 0;
            } else {
                setupInfo = TmoneyData.getInstance(getContext()).getSetupInfo(CodeConstants.AFLT_STUP_VAL_CD.LIVECHECK_CYCLE_PREPAID.getCode());
            }
            int i4 = IAuthTabCallback + 81;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        if (!(!TextUtils.isEmpty(setupInfo))) {
            int i6 = IAuthTabCallback + 85;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            setupInfo = "90";
        }
        return Integer.parseInt(setupInfo) * 60000;
    }

    public int getBalance() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TmoneyData tmoneyData = TmoneyData.getInstance(getContext());
        if (i3 != 0) {
            return tmoneyData.getLastBalance();
        }
        tmoneyData.getLastBalance();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.c;
        }
        throw null;
    }

    public int getLimiteAmountPostPaid(String str) {
        CreditCardInfoDto checkcard;
        int i = 2 % 2;
        try {
            int i2 = onTransact + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            for (CreditCardGroupDto creditCardGroupDto : a()) {
                int i4 = IAuthTabCallback + 87;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                CreditCardInfoDto creditcard = creditCardGroupDto.getCreditcard();
                if ((creditcard != null && !(true ^ creditcard.getCode().equals(str))) || ((checkcard = creditCardGroupDto.getCheckcard()) != null && checkcard.getCode().equals(str))) {
                    return creditcard.getLimit();
                }
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public String getLogoPathUrl() {
        int i = 2 % 2;
        String str = com.tmoney.d.a.getInstance().getLogoPathUrl(TmoneyData.getInstance(getContext()).getServerType()) + TmoneyData.getInstance(getContext()).getPartnerCD() + "/";
        int i2 = onTransact + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public boolean getPartnerApp() {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean partnerApp = TmoneyData.getInstance(getContext()).getPartnerApp();
        int i4 = IAuthTabCallback + 23;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return partnerApp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getPartnerAppIntro() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            TmoneyData.getInstance(getContext()).getPartnerAppIntro();
            throw null;
        }
        String partnerAppIntro = TmoneyData.getInstance(getContext()).getPartnerAppIntro();
        int i3 = IAuthTabCallback + 97;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return partnerAppIntro;
    }

    public String getPartnerAppName() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            TmoneyData.getInstance(getContext()).getPartnerAppName();
            obj.hashCode();
            throw null;
        }
        String partnerAppName = TmoneyData.getInstance(getContext()).getPartnerAppName();
        int i3 = onTransact + 91;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return partnerAppName;
        }
        throw null;
    }

    public String getPartnerAppPackage() {
        String partnerAppPackage;
        int i = 2 % 2;
        int i2 = onTransact + 9;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            partnerAppPackage = TmoneyData.getInstance(getContext()).getPartnerAppPackage();
            int i3 = 16 / 0;
        } else {
            partnerAppPackage = TmoneyData.getInstance(getContext()).getPartnerAppPackage();
        }
        int i4 = onTransact + 61;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return partnerAppPackage;
    }

    public String getPartnerAppWithdraw() {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            TmoneyData.getInstance(getContext()).getPartnerAppWithdraw();
            throw null;
        }
        String partnerAppWithdraw = TmoneyData.getInstance(getContext()).getPartnerAppWithdraw();
        int i3 = IAuthTabCallback + 13;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return partnerAppWithdraw;
    }

    public String getPartnerCd() {
        String afltCd;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            afltCd = TmoneyData.getInstance(getContext()).getAfltCd();
            int i3 = 21 / 0;
        } else {
            afltCd = TmoneyData.getInstance(getContext()).getAfltCd();
        }
        int i4 = onTransact + 41;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return afltCd;
    }

    public float getPhoneBillFeeRate() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String setupInfo = TmoneyData.getInstance(getContext()).getSetupInfo(CodeConstants.AFLT_STUP_VAL_CD.FEE_PHONEBILL.getCode());
        if (!TextUtils.isEmpty(setupInfo)) {
            return Float.parseFloat(setupInfo);
        }
        int i4 = IAuthTabCallback + 71;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return -1.0f;
    }

    public String getPhoneNumber() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Context context = getContext();
        if (i3 != 0) {
            return DeviceInfoHelper.getLine1NumberLocaleRemove(context);
        }
        DeviceInfoHelper.getLine1NumberLocaleRemove(context);
        throw null;
    }

    public String getPhonebillPaymentUrl(byte[] bArr, int i, int i2) {
        int i3 = 2 % 2;
        String str = "javascript:call_pay_form('" + ByteHelper.toHexString(bArr) + "', '" + getPhoneNumber() + "','" + TmoneyData.getInstance(this.c).getUserNo() + "', '" + DeviceInfoHelper.getModel() + "','" + getUicc() + "','" + AppInfoHelper.getAppVersion(this.c) + "','" + i + "','" + i2 + "','N','N')";
        int i4 = onTransact + 23;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getPhonebillUrl() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String str = String.format("%s%s/", com.tmoney.d.a.getInstance().getPhoneBillUrl(TmoneyData.getInstance(getContext()).getServerType()), TmoneyData.getInstance(getContext()).getAfltCd());
        int i4 = IAuthTabCallback + 65;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return str;
    }

    public String getPhonebillUrlLenCheck() {
        String phoneBillUrlLenCheck;
        int i = 2 % 2;
        int i2 = onTransact + 23;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            phoneBillUrlLenCheck = com.tmoney.d.a.getInstance().getPhoneBillUrlLenCheck();
            int i3 = 60 / 0;
        } else {
            phoneBillUrlLenCheck = com.tmoney.d.a.getInstance().getPhoneBillUrlLenCheck();
        }
        int i4 = IAuthTabCallback + 81;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return phoneBillUrlLenCheck;
    }

    public List<CreditCardGroupDto> getPostPaidCardList() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        List<CreditCardGroupDto> listA = a(false);
        int i4 = onTransact + 19;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return listA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public List<CreditCardGroupDto> getPrePaidCardList() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        List<CreditCardGroupDto> listA = a(true);
        int i4 = IAuthTabCallback + 37;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return listA;
    }

    public String getRegistedCardSuperCode() throws Throwable {
        CreditCardInfoDto checkcard;
        int i = 2 % 2;
        List<CreditCardGroupDto> listA = a();
        try {
            String crcmCd = TmoneyData.getInstance(this.c).getCrcmCd();
            String crdtChecDvsCd = TmoneyData.getInstance(this.c).getCrdtChecDvsCd();
            LogHelper.d("TmoneyInfo", "getRegistedCreditCardCode = " + crcmCd);
            Object[] objArr = new Object[1];
            Object obj = null;
            d(null, null, new byte[]{-127}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, objArr);
            if (TextUtils.equals(crdtChecDvsCd, ((String) objArr[0]).intern())) {
                Iterator<CreditCardGroupDto> it = listA.iterator();
                int i2 = onTransact + 39;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                while (it.hasNext()) {
                    checkcard = it.next().getCreditcard();
                    LogHelper.d("TmoneyInfo", "creditCardInfoDto = " + checkcard);
                    if (checkcard != null) {
                        int i4 = onTransact + 95;
                        IAuthTabCallback = i4 % 128;
                        if (i4 % 2 != 0) {
                            checkcard.getCode().equals(crcmCd);
                            obj.hashCode();
                            throw null;
                        }
                        if (checkcard.getCode().equals(crcmCd)) {
                        }
                    }
                }
                return "";
            }
            Object[] objArr2 = new Object[1];
            d(null, null, new byte[]{-126}, 127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
            if (!TextUtils.equals(crdtChecDvsCd, ((String) objArr2[0]).intern())) {
                return "";
            }
            int i5 = onTransact + 117;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                listA.iterator();
                throw null;
            }
            Iterator<CreditCardGroupDto> it2 = listA.iterator();
            while (it2.hasNext()) {
                checkcard = it2.next().getCheckcard();
                LogHelper.d("TmoneyInfo", "checkCardInfoDto = " + checkcard);
                if (checkcard != null) {
                    int i6 = onTransact + 19;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        checkcard.getCode().equals(crcmCd);
                        throw null;
                    }
                    if (checkcard.getCode().equals(crcmCd)) {
                    }
                }
            }
            return "";
            return checkcard.getSuperCode();
        } catch (Exception unused) {
            return "";
        }
    }

    public ECARD_TYPE getRegistedCardType() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String crdtChecDvsCd = TmoneyData.getInstance(getContext()).getCrdtChecDvsCd();
        Object[] objArr = new Object[1];
        d(null, null, new byte[]{-127}, 126 - TextUtils.lastIndexOf("", '0'), objArr);
        if (TextUtils.equals(crdtChecDvsCd, ((String) objArr[0]).intern())) {
            int i4 = onTransact + 73;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return ECARD_TYPE.CREDIT;
        }
        String crdtChecDvsCd2 = TmoneyData.getInstance(getContext()).getCrdtChecDvsCd();
        d(null, null, new byte[]{-126}, 126 - ((byte) KeyEvent.getModifierMetaStateMask()), new Object[1]);
        if (!(!TextUtils.equals(crdtChecDvsCd2, ((String) r6[0]).intern()))) {
            return ECARD_TYPE.CHECK;
        }
        if (TextUtils.equals(TmoneyData.getInstance(getContext()).getCrdtChecDvsCd(), CodeConstants.CARD_TYPE_POINT)) {
            return ECARD_TYPE.PAYCO;
        }
        ECARD_TYPE ecard_type = ECARD_TYPE.NONE;
        int i6 = IAuthTabCallback + 29;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            return ecard_type;
        }
        throw null;
    }

    public String getRegistedCreditCardCode() {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String crcmCd = TmoneyData.getInstance(this.c).getCrcmCd();
        int i4 = onTransact + 35;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return crcmCd;
    }

    public float getRegistedCreditCardFeeRate() throws Throwable {
        CreditCardInfoDto checkcard;
        Iterator<CreditCardGroupDto> it;
        int i = 2 % 2;
        List<CreditCardGroupDto> listA = a();
        try {
            String crcmCd = TmoneyData.getInstance(this.c).getCrcmCd();
            String crdtChecDvsCd = TmoneyData.getInstance(this.c).getCrdtChecDvsCd();
            LogHelper.d("TmoneyInfo", "getRegistedCreditCardCode = " + crcmCd);
            Object[] objArr = new Object[1];
            d(null, null, new byte[]{-127}, View.resolveSizeAndState(0, 0, 0) + 127, objArr);
            if (!TextUtils.equals(crdtChecDvsCd, ((String) objArr[0]).intern())) {
                Object[] objArr2 = new Object[1];
                d(null, null, new byte[]{-126}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, objArr2);
                if (!TextUtils.equals(crdtChecDvsCd, ((String) objArr2[0]).intern())) {
                    return 0.0f;
                }
                Iterator<CreditCardGroupDto> it2 = listA.iterator();
                while (it2.hasNext()) {
                    checkcard = it2.next().getCheckcard();
                    LogHelper.d("TmoneyInfo", "checkCardInfoDto = " + checkcard);
                    if (checkcard == null || !checkcard.getCode().equals(crcmCd)) {
                    }
                }
                return 0.0f;
            }
            int i2 = IAuthTabCallback + 57;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                it = listA.iterator();
                int i3 = 25 / 0;
            } else {
                it = listA.iterator();
            }
            while (it.hasNext()) {
                checkcard = it.next().getCreditcard();
                LogHelper.d("TmoneyInfo", "creditCardInfoDto = " + checkcard);
                if (checkcard != null) {
                    int i4 = onTransact + 81;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 99 / 0;
                        if (!checkcard.getCode().equals(crcmCd)) {
                        }
                    } else if (checkcard.getCode().equals(crcmCd)) {
                    }
                }
            }
            return 0.0f;
            return Float.parseFloat(checkcard.getFee());
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public String getRegistedCreditCardLogo() throws Throwable {
        Iterator<CreditCardGroupDto> it;
        CreditCardInfoDto checkcard;
        String logoPath = "";
        int i = 2 % 2;
        List<CreditCardGroupDto> listA = a();
        try {
            String crcmCd = TmoneyData.getInstance(this.c).getCrcmCd();
            String crdtChecDvsCd = TmoneyData.getInstance(this.c).getCrdtChecDvsCd();
            LogHelper.d("TmoneyInfo", "getRegistedCreditCardLogo code = " + crcmCd);
            if (!isPrePaid()) {
                for (CreditCardGroupDto next : listA) {
                    CreditCardInfoDto creditcard = next.getCreditcard();
                    if ((creditcard == null || !TextUtils.equals(crcmCd, creditcard.getCode())) && ((checkcard = next.getCheckcard()) == null || !TextUtils.equals(crcmCd, checkcard.getCode()))) {
                    }
                    logoPath = next.getLogoPath();
                    int i2 = onTransact + 79;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                }
            } else {
                Object[] objArr = new Object[1];
                d(null, null, new byte[]{-127}, TextUtils.lastIndexOf("", '0', 0) + 128, objArr);
                if (TextUtils.equals(crdtChecDvsCd, ((String) objArr[0]).intern())) {
                    for (CreditCardGroupDto next2 : listA) {
                        if (next2.getCreditcard() != null && !(!TextUtils.equals(crcmCd, r5.getCode()))) {
                            logoPath = next2.getLogoPath();
                            int i22 = onTransact + 79;
                            IAuthTabCallback = i22 % 128;
                            int i32 = i22 % 2;
                            break;
                        }
                    }
                } else {
                    Object[] objArr2 = new Object[1];
                    d(null, null, new byte[]{-126}, 127 - KeyEvent.normalizeMetaState(0), objArr2);
                    if (TextUtils.equals(crdtChecDvsCd, ((String) objArr2[0]).intern())) {
                        int i4 = IAuthTabCallback + 115;
                        onTransact = i4 % 128;
                        if (i4 % 2 == 0) {
                            it = listA.iterator();
                            int i5 = 99 / 0;
                        } else {
                            it = listA.iterator();
                        }
                        while (it.hasNext()) {
                            next2 = it.next();
                            CreditCardInfoDto checkcard2 = next2.getCheckcard();
                            if (checkcard2 != null && TextUtils.equals(crcmCd, checkcard2.getCode())) {
                                int i6 = onTransact + 59;
                                IAuthTabCallback = i6 % 128;
                                int i7 = i6 % 2;
                                logoPath = next2.getLogoPath();
                                int i222 = onTransact + 79;
                                IAuthTabCallback = i222 % 128;
                                int i322 = i222 % 2;
                                break;
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return logoPath;
    }

    public String getRegistedCreditCardLogoPathUrl() {
        int i = 2 % 2;
        String str = getLogoPathUrl() + getRegistedCreditCardLogo();
        int i2 = onTransact + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public String getRegistedCreditCardName() throws Throwable {
        StringBuilder sb;
        String str;
        int i = 2 % 2;
        List<CreditCardGroupDto> listA = a();
        try {
            String crcmCd = TmoneyData.getInstance(this.c).getCrcmCd();
            String crdtChecDvsCd = TmoneyData.getInstance(this.c).getCrdtChecDvsCd();
            LogHelper.d("TmoneyInfo", "getRegistedCreditCardName code = " + crcmCd);
            if (!isPrePaid()) {
                for (CreditCardGroupDto creditCardGroupDto : listA) {
                    int i2 = IAuthTabCallback + 111;
                    onTransact = i2 % 128;
                    int i3 = i2 % 2;
                    if (creditCardGroupDto.getCreditcard() == null || (!TextUtils.equals(crcmCd, r4.getCode()))) {
                        CreditCardInfoDto checkcard = creditCardGroupDto.getCheckcard();
                        if (checkcard != null) {
                            int i4 = IAuthTabCallback + 73;
                            onTransact = i4 % 128;
                            if (i4 % 2 == 0) {
                                TextUtils.equals(crcmCd, checkcard.getCode());
                                throw null;
                            }
                            if (TextUtils.equals(crcmCd, checkcard.getCode())) {
                                int i5 = onTransact + 125;
                                IAuthTabCallback = i5 % 128;
                                int i6 = i5 % 2;
                            }
                        }
                    }
                    return creditCardGroupDto.getCardName();
                }
                return "";
            }
            Object[] objArr = new Object[1];
            d(null, null, new byte[]{-127}, 127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
            if (TextUtils.equals(crdtChecDvsCd, ((String) objArr[0]).intern())) {
                for (CreditCardGroupDto creditCardGroupDto2 : listA) {
                    CreditCardInfoDto creditcard = creditCardGroupDto2.getCreditcard();
                    if (creditcard != null) {
                        int i7 = onTransact + 29;
                        IAuthTabCallback = i7 % 128;
                        if (i7 % 2 != 0) {
                            TextUtils.equals(crcmCd, creditcard.getCode());
                            throw null;
                        }
                        if (TextUtils.equals(crcmCd, creditcard.getCode())) {
                            sb = new StringBuilder();
                            sb.append(creditCardGroupDto2.getCardName());
                            str = "(신용)";
                        }
                    }
                }
                return "";
            }
            Object[] objArr2 = new Object[1];
            d(null, null, new byte[]{-126}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, objArr2);
            if (!TextUtils.equals(crdtChecDvsCd, ((String) objArr2[0]).intern())) {
                return "";
            }
            for (CreditCardGroupDto creditCardGroupDto3 : listA) {
                int i8 = onTransact + 17;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                CreditCardInfoDto checkcard2 = creditCardGroupDto3.getCheckcard();
                if (checkcard2 != null && TextUtils.equals(crcmCd, checkcard2.getCode())) {
                    sb = new StringBuilder();
                    sb.append(creditCardGroupDto3.getCardName());
                    str = "(체크)";
                }
            }
            return "";
            sb.append(str);
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public int getRegistedPostPaidLimitAmount() throws NumberFormatException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int registedLimiteAmountPostPaid = TmoneyData.getInstance(getContext()).getRegistedLimiteAmountPostPaid();
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        return registedLimiteAmountPostPaid;
    }

    public int getRegistedPostPaidOneDayLimitRemainCount() {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            TmoneyData.getInstance(getContext()).getOneDayLimitRemainCount();
            throw null;
        }
        int oneDayLimitRemainCount = TmoneyData.getInstance(getContext()).getOneDayLimitRemainCount();
        int i3 = IAuthTabCallback + 65;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return oneDayLimitRemainCount;
        }
        obj.hashCode();
        throw null;
    }

    public TmoneyConstants.TelecomType getTelecomType() throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TmoneyData tmoneyData = TmoneyData.getInstance(getContext());
        if (i3 == 0) {
            return tmoneyData.getTelecomType();
        }
        tmoneyData.getTelecomType();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getTmoneyCardNumber() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String cardNumber = TmoneyData.getInstance(getContext()).getCardNumber();
        int i4 = onTransact + 65;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return cardNumber;
    }

    public String getUicc() {
        String uicc;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            uicc = TmoneyData.getInstance(getContext()).getUicc();
            int i3 = 28 / 0;
        } else {
            uicc = TmoneyData.getInstance(getContext()).getUicc();
        }
        int i4 = IAuthTabCallback + 93;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return uicc;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getUserId() {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String userId = TmoneyData.getInstance(getContext()).getUserId();
        int i4 = onTransact + 83;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return userId;
    }

    public boolean isCreditPostPaid(String str) {
        int i = 2 % 2;
        try {
            Iterator<CreditCardGroupDto> it = a().iterator();
            while (it.hasNext()) {
                CreditCardInfoDto creditcard = it.next().getCreditcard();
                if (creditcard != null) {
                    int i2 = IAuthTabCallback + 37;
                    onTransact = i2 % 128;
                    if (i2 % 2 == 0) {
                        creditcard.getCode().equals(str);
                        throw null;
                    }
                    if (creditcard.getCode().equals(str)) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        int i3 = onTransact + 53;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 9 / 0;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if ((!r1) != true) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        r1 = com.tmoney.TmoneyInfo.IAuthTabCallback + 15;
        com.tmoney.TmoneyInfo.onTransact = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if ((!r1) != true) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isDiscountCard() {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String userCode = TmoneyData.getInstance(getContext()).getUserCode();
        if (!userCode.equals("02")) {
            int i4 = onTransact + 43;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            boolean zEquals = userCode.equals("04");
            if (i5 != 0) {
                int i6 = 54 / 0;
            }
        }
        int i7 = IAuthTabCallback + 1;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public boolean isJoinedService() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (isPostPaid() || isPrePaid()) {
            return true;
        }
        int i4 = onTransact + 95;
        IAuthTabCallback = i4 % 128;
        return i4 % 2 != 0;
    }

    public boolean isMobileTmoneyPlatform() {
        boolean zIsMobileTmoneyPlatform;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            zIsMobileTmoneyPlatform = TmoneyData.getInstance(getContext()).isMobileTmoneyPlatform();
            int i3 = 21 / 0;
        } else {
            zIsMobileTmoneyPlatform = TmoneyData.getInstance(getContext()).isMobileTmoneyPlatform();
        }
        int i4 = IAuthTabCallback + 5;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsMobileTmoneyPlatform;
        }
        throw null;
    }

    public boolean isMobileTmoneyPostPaidPlatform() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsMobileTmoneyPostPaidPlatform = TmoneyData.getInstance(getContext()).isMobileTmoneyPostPaidPlatform();
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return zIsMobileTmoneyPostPaidPlatform;
    }

    public boolean isPartnerJoin() {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean isPartnerJoin = TmoneyData.getInstance(getContext()).getIsPartnerJoin();
        int i4 = onTransact + 57;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return isPartnerJoin;
    }

    public boolean isPostPaid() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TmoneyData tmoneyData = TmoneyData.getInstance(getContext());
        if (i3 != 0) {
            return tmoneyData.isPostPaidPlatform();
        }
        tmoneyData.isPostPaidPlatform();
        throw null;
    }

    public boolean isPostPaidCreditCard(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!str.equals(TmoneyData.getInstance(this.c).getCrcmCd())) {
            return false;
        }
        int i4 = onTransact + 75;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public boolean isPrePaid() {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsPrePaidPlatform = TmoneyData.getInstance(getContext()).isPrePaidPlatform();
        int i4 = onTransact + 121;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zIsPrePaidPlatform;
        }
        throw null;
    }

    public boolean isRegistedPostPaidCreditCard() {
        int i = 2 % 2;
        if (!(!"Y".equals(TmoneyData.getInstance(getContext()).getPymStupYn()))) {
            int i2 = IAuthTabCallback + 35;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            if (TmoneyData.getInstance(getContext()).getPpyDpyDvsCd(CodeConstants.EMBL_SVC_TYP_CD.POSTPAID.getCode())) {
                int i4 = onTransact + 67;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        int i6 = onTransact + 65;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public boolean isRegistedPrePaidCreditCard() {
        int i = 2 % 2;
        if (!(!"Y".equals(TmoneyData.getInstance(getContext()).getPymStupYn())) && TmoneyData.getInstance(getContext()).getPpyDpyDvsCd(CodeConstants.EMBL_SVC_TYP_CD.PREPAID.getCode())) {
            int i2 = onTransact + 99;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = IAuthTabCallback + 121;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public boolean isSktTelecom() {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TmoneyData tmoneyData = TmoneyData.getInstance(getContext());
        if (i3 == 0) {
            return tmoneyData.isTelecomTypeSk();
        }
        tmoneyData.isTelecomTypeSk();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isTmoneyAvailability() {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean tmoneyYn = TmoneyData.getInstance(getContext()).getTmoneyYn();
        int i4 = onTransact + 1;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return tmoneyYn;
    }

    private static void d(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onNavigationEvent;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = $10 + 109;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1))), 77 - View.MeasureSpec.getMode(0), Color.alpha(0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 75, 16038 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i6 = 1052772399;
            try {
                if (onWarmupCompleted) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), TextUtils.indexOf("", "") + 63, (-16765002) - Color.rgb(0, 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        i6 = 1052772399;
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (!onExtraCallbackWithResult) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                    char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        int i7 = $11 + 33;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 63 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (Process.myPid() >> 22) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr6);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }
}
