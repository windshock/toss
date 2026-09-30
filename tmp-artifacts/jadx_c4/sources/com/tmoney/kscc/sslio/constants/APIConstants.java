package com.tmoney.kscc.sslio.constants;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.d.a;
import com.tmoney.utils.LogHelper;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class APIConstants {
    private static int $10 = 0;
    private static int $11 = 1;
    public static String ENCODING_TYPE = null;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackStub = 1;
    public static final String TAG = "APIConstants";
    private static final String[][] a;
    private static int asBinder = 1;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static int onTransact;
    private static boolean onWarmupCompleted;

    public enum EAPI_CONST {
        EAPI_CONST_000_SEVER_CERT,
        EAPI_CONST_001_MBR_0001,
        EAPI_CONST_001_MBR_0002,
        EAPI_CONST_001_MBR_0003,
        EAPI_CONST_001_MBR_0004,
        EAPI_CONST_001_MBR_0005,
        EAPI_CONST_001_MBR_0006,
        EAPI_CONST_001_MBR_0007,
        EAPI_CONST_001_MBR_0008,
        EAPI_CONST_001_MBR_0009,
        EAPI_CONST_001_MBR_0010,
        EAPI_CONST_001_MBR_0011,
        EAPI_CONST_001_MBR_0012,
        EAPI_CONST_001_MBR_0013,
        EAPI_CONST_001_MBR_0014,
        EAPI_CONST_001_MBR_0015,
        EAPI_CONST_001_MBR_0019,
        EAPI_CONST_001_MBR_0032,
        EAPI_CONST_002_PRCG_0001,
        EAPI_CONST_002_PRCG_0002,
        EAPI_CONST_002_PRCG_0003,
        EAPI_CONST_002_PRCG_0004,
        EAPI_CONST_002_PRCG_0005,
        EAPI_CONST_002_PRCG_0006,
        EAPI_CONST_002_PRCG_0008,
        EAPI_CONST_003_DPCG_0001,
        EAPI_CONST_003_DPCG_0002,
        EAPI_CONST_003_DPCG_0003,
        EAPI_CONST_003_DPCG_0004,
        EAPI_CONST_003_DPCG_0005,
        EAPI_CONST_003_DPCG_0006,
        EAPI_CONST_003_DPCG_0007,
        EAPI_CONST_003_DPCG_0008,
        EAPI_CONST_003_DPCG_0009,
        EAPI_CONST_003_DPCG_0014,
        EAPI_CONST_003_DPCG_0015,
        EAPI_CONST_003_DPCG_0016,
        EAPI_CONST_004_SIN_0001,
        EAPI_CONST_005_TM_0001,
        EAPI_CONST_005_TM_0002,
        EAPI_CONST_006_TRDR_0001,
        EAPI_CONST_006_TRDR_0002,
        EAPI_CONST_006_TRDR_0003,
        EAPI_CONST_006_TRDR_0004,
        EAPI_CONST_006_TRDR_0005,
        EAPI_CONST_006_TRDR_0006,
        EAPI_CONST_006_TRDR_0007,
        EAPI_CONST_006_TRDR_0008,
        EAPI_CONST_006_TRDR_0009,
        EAPI_CONST_006_TRDR_0010,
        EAPI_CONST_006_TRDR_0011,
        EAPI_CONST_006_TRDR_0012,
        EAPI_CONST_006_TRDR_0013,
        EAPI_CONST_006_TRDR_0015,
        EAPI_CONST_006_TRDR_0016,
        EAPI_CONST_006_TRDR_0017,
        EAPI_CONST_006_TRDR_0018,
        EAPI_CONST_007_DCRG_0001,
        EAPI_CONST_007_DCRG_0002,
        EAPI_CONST_007_DCRG_0003,
        EAPI_CONST_008_BLMV_0001,
        EAPI_CONST_008_BLMV_0002,
        EAPI_CONST_009_MSS_0001,
        EAPI_CONST_009_MSS_0002,
        EAPI_CONST_009_MSS_0003,
        EAPI_CONST_009_MSS_0004,
        EAPI_CONST_010_GIFT_0001,
        EAPI_CONST_010_GIFT_0002,
        EAPI_CONST_010_GIFT_0003,
        EAPI_CONST_010_GIFT_0004,
        EAPI_CONST_010_GIFT_0005,
        EAPI_CONST_010_GIFT_0006,
        EAPI_CONST_010_GIFT_0007,
        EAPI_CONST_011_ACRY_0001,
        EAPI_CONST_011_ACRY_0002,
        EAPI_CONST_011_ACRY_0003,
        EAPI_CONST_011_ACRY_0004,
        EAPI_CONST_012_PMM_0001,
        EAPI_CONST_012_PMM_0002,
        EAPI_CONST_012_PMM_0003,
        EAPI_CONST_012_PMM_0004,
        EAPI_CONST_012_PMM_0005,
        EAPI_CONST_012_PMM_0006,
        EAPI_CONST_012_PMM_0007,
        EAPI_CONST_012_PMM_0008,
        EAPI_CONST_012_PMM_0009,
        EAPI_CONST_012_PMM_0010,
        EAPI_CONST_012_PMM_0012,
        EAPI_CONST_012_PMM_0013,
        EAPI_CONST_012_PMM_0014,
        EAPI_CONST_012_PMM_0015,
        EAPI_CONST_012_PMM_0016,
        EAPI_CONST_013_CRAPI_0001,
        EAPI_CONST_013_CRAPI_0002,
        EAPI_CONST_013_CRAPI_0003,
        EAPI_CONST_013_CRAPI_0004,
        EAPI_CONST_013_CRAPI_0005,
        EAPI_CONST_013_CRAPI_0006,
        EAPI_CONST_014_STUP_0001,
        EAPI_CONST_014_STUP_0002,
        EAPI_CONST_014_STUP_0003,
        EAPI_CONST_014_STUP_0004,
        EAPI_CONST_015_UCAD_0001,
        EAPI_CONST_015_UCAD_0002,
        EAPI_CONST_016_TMCR_0009,
        EAPI_CONST_016_TMCR_0010,
        EAPI_CONST_016_TMCR_0011,
        EAPI_CONST_016_TMCR_0012,
        EAPI_CONST_018_AFLT_0001
    }

    public enum EAPI_CONST_TYPE {
        EAPI_CONST_TYPE_0_NAME,
        EAPI_CONST_TYPE_1_ID,
        EAPI_CONST_TYPE_2_CODE
    }

    static {
        onNavigationEvent();
        Object[] objArr = new Object[1];
        b(null, null, new byte[]{-124, -125, -126, -127}, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        Object[] objArr2 = new Object[1];
        b(null, null, new byte[]{-117, -118, -121, -124, -125, -121, -119, -120, -121, -122, -123}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, objArr2);
        Object[] objArr3 = new Object[1];
        b(null, null, new byte[]{-124, -125, -121, -119, -120}, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr3);
        String[] strArr = {((String) objArr3[0]).intern(), "앱x", ""};
        Object[] objArr4 = new Object[1];
        b(null, null, new byte[]{-124, -125, -121, -122, -116}, ((byte) KeyEvent.getModifierMetaStateMask()) + 128, objArr4);
        String[] strArr2 = {((String) objArr4[0]).intern(), "앱x", ""};
        Object[] objArr5 = new Object[1];
        b(null, null, new byte[]{-124, -125, -121, -122, -115}, TextUtils.indexOf((CharSequence) "", '0', 0) + 128, objArr5);
        String[] strArr3 = {((String) objArr5[0]).intern(), "앱x", ""};
        Object[] objArr6 = new Object[1];
        b(null, null, new byte[]{-124, -125, -121, -125, -114, -119, -120}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, objArr6);
        String[] strArr4 = {((String) objArr6[0]).intern(), "앱x", ""};
        Object[] objArr7 = new Object[1];
        b(null, null, new byte[]{-124, -125, -121, -125, -114, -122, -116}, ExpandableListView.getPackedPositionChild(0L) + 128, objArr7);
        String[] strArr5 = {((String) objArr7[0]).intern(), "앱x", ""};
        Object[] objArr8 = new Object[1];
        b(null, null, new byte[]{-124, -125, -121, -125, -114, -122, -115}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, objArr8);
        a = new String[][]{new String[]{((String) objArr[0]).intern(), "ServerCert", "api.mbgw.readServerCert"}, new String[]{"페이먼트회원가입", "MBR0001", "addUser"}, new String[]{"제휴서비스가입", "MBR0002", "addAllianceUser"}, new String[]{"가입상태조회(앱)", "MBR0003", "readUserStatusOnApp"}, new String[]{"가입상태조회(서버)", "앱x", ""}, new String[]{"선불자동충전설정", "MBR0005", "updatePrepayStatusSetting"}, new String[]{"제휴서비스해지", "MBR0006", "deleteAllianceUser"}, new String[]{"신용카드등록(후불)", "앱x", ""}, new String[]{"신용카드등록(선불)", "앱x", ""}, new String[]{"신용카드승인취소(후불)", "앱x", ""}, new String[]{"신용카드등록해지(후불)", "MBR0010", "mbr.usr.revokePostpayMethod"}, new String[]{"선후불전환", "MBR0011", "changePayMethod"}, new String[]{"결제수단 등록해지(선불)", "MBR0012", "deletePrepayStatusSetting"}, new String[]{"페이먼트회원 해지", "앱x", "mbr.usr.deleteUsr"}, new String[]{"도난분실 등록", "앱x", ""}, new String[]{"도난분실 해지", "MBR0015", "deleteLossCareServiceOnApp"}, new String[]{"암호화키 요청", "MBR0019", "requestCipherKey"}, new String[]{"ADID등록변경", "MBR0032", "registerAdid"}, new String[]{"충전요청(신용카드)", "PRCG0001", "topupWithCard"}, new String[]{"충전요청(마일리지)", "PRCG0002", "topupWithMileage"}, new String[]{"충전요청(포인트)", "PRCG0003", "topupWithPoint"}, new String[]{"충전결과통보(선불)", "PRCG0004", "respondTopupResult"}, new String[]{"신용카드등록(선불)", "PRCG0005", "registerPrepayMethod"}, new String[]{"선불충전요청(카드외)", "PRCG0006", "topup"}, new String[]{((String) objArr2[0]).intern(), "PRCG0008", "topupRemit"}, new String[]{"후불한도 부여", "DPCG0001", "authorizeLimit"}, new String[]{"후불한도부여 결과통보", "DPCG0002", "respondAuthorizeResult"}, new String[]{"후불한도복원", "DPCG0003", "restoreLimit"}, new String[]{"후불한도복원 결과통보", "DPCG0004", "respondRestoreResult"}, new String[]{"충전금회수", "DPCG0005", "refundPostpayLimit"}, new String[]{"회수결과통보", "DPCG0006", "respondPostpayRefundResult"}, new String[]{"신용카드등록(후불)", "DPCG0007", "registerPostpayMethod"}, new String[]{"후불 지불 취소", "DPCG0008", ""}, new String[]{"한도복원 가능횟수조회", "DPCG0009", "possibeCountRestoreLimit"}, new String[]{"후불 한도증액", "DPCG0014", "refundPostpayLimitForLmtMod"}, new String[]{"후불 한도증액", "DPCG0015", "respondPostpayRefundResultForLmtMod"}, new String[]{"후불 한도증액", "DPCG0016", "registerPostpayMethodForLmtMod"}, new String[]{"상태정보조회", "SIN0001", "checkPostpayAppStatus"}, new String[0], new String[0], new String[]{"청구내역 집계", "TRDR0001", "retrieveCardBilling"}, new String[]{"청구내역 상세", "TRDR0002", "retrieveCardDetailsBilling"}, new String[]{"최근교통내역20건", "TRDR0003", "retrieveRecentList"}, new String[]{"월사용내역 집계", "TRDR0004", "retrieveMonthlyList"}, new String[]{"월사용내역 상세", "TRDR0005", "retrieveMonthlyDetailsList"}, new String[]{"충전내역 집계", "TRDR0006", "retrieveCardBillingDay"}, new String[]{"충전내역 상세", "앱x", ""}, new String[]{"가입/설정 이력조회", "앱x", ""}, new String[]{"선물이력조회", "앱x", ""}, new String[]{"환불 거래내역", "앱x", ""}, new String[]{"충전 거래내역", "앱x", ""}, new String[]{"신용카드목록", "TRDR0012", "setupCardInfo"}, new String[]{"설정정보조회", "TRDR0013", "readAfltSetupInfo"}, new String[]{"앱로그서버저장", "TRDR0015", "saveAppLog"}, new String[]{"선불 건별 충전 결제 정보", "TRDR0016", "ppyPymInfo"}, new String[]{"환불내역 조회", "TRDR0017", "refundDetailsInquiry"}, new String[]{"제휴패키지목록조회", "TRDR0018", "readAfltPckgList"}, new String[]{"할인등록 요청", "DCRG0001", "registerDiretrieveGroup"}, new String[]{"할인등록 결과", "DCRG0002", "respondDisretrieveResult"}, new String[]{"티머니등록정보조회", "DCRG0003", "readRgtCardInfo"}, new String[]{"NFC잔액 환불 요청", "BLMV0001", "deductNfcBalance"}, new String[]{"NFC잔액 환불 결과", "BLMV0002", "topupWithNfcBalance"}, new String[0], new String[]{"분실잔액회수 요청", "MSS0002", "refundMissing"}, new String[]{"분실잔액회수 결과", "MSS0003", "respondMissingRefundResult"}, new String[]{"분실계좌 사전등록", "MSS0004", "registerMissingAccount"}, new String[]{"티머니 잔액 선물보내기", "GIFT0001", "sendGift"}, new String[0], new String[0], new String[0], new String[0], new String[0], new String[]{"티머니 선물보내기 결과통보", "GIFT0007", "respondSendGiftResult"}, new String[]{"계좌환불", "ACRY0001", "refundPrepaybalace"}, new String[]{"환불이용료조회", "ACRY0002", "readRefundFee"}, new String[]{"계좌환불확인", "ACRY0003", "respondRefundResult"}, new String[]{"환불계좌 음행사조회", "ACRY0004", "readAcntBnkInfo"}, new String[0], new String[0], new String[0], new String[0], new String[0], new String[0], new String[0], new String[0], new String[0], new String[0], new String[0], new String[0], new String[0], new String[0], new String[0], strArr, strArr2, strArr3, strArr4, strArr5, new String[]{((String) objArr8[0]).intern(), "앱x", ""}, new String[0], new String[0], new String[0], new String[0], new String[]{"미확인보정", "UCAD0001", "reviseUnconfirmedTrans"}, new String[]{"미확인 존재여부 확인", "UCAD0002", "readUnconfirmedTransCount"}, new String[]{"선불 충전 요청", "TMCR0009", "topupPlate"}, new String[]{"충전결과 통보 (선불)", "TMCR0010", "respondTopupResultPlate"}, new String[]{"Plate 카드 충전 간편송금 준비 (선불)", "TMCR0011", "topupRemitPlate"}, new String[]{"Plate 카드 충전가능여부 조회", "TMCR0012", "enableCheckTopupPlate"}, new String[]{"제휴멤버십 발급 상태 업데이트", "AFLT0001", "updateAfltMbrsOtaStatus"}, new String[]{"", ""}};
        ENCODING_TYPE = "utf-8";
        int i = asBinder + 123;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static String getAPIValue(EAPI_CONST eapi_const, EAPI_CONST_TYPE eapi_const_type) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String str = a[eapi_const.ordinal()][eapi_const_type.ordinal()];
        int i4 = onTransact + 103;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return str;
    }

    public static String getServerIP(int i, EAPI_CONST eapi_const) throws Throwable {
        int i2 = 2 % 2;
        String ksccIpBusinessUrl = a.getInstance().getKsccIpBusinessUrl(i);
        a aVar = a.getInstance();
        LogHelper.d(TAG, "getApi : " + eapi_const.toString());
        String str = ksccIpBusinessUrl + aVar.getKsccApiBusinessUrl(i);
        int i3 = IAuthTabCallbackStub + 125;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    private static void b(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onNavigationEvent;
        if (cArr2 != null) {
            int i3 = $11 + 93;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), TextUtils.getOffsetAfter("", 0) + 77, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
            Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            char c = '0';
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 75, AndroidCharacter.getMirror('0') + 15989, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (IAuthTabCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i6 = $11 + 57;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), Color.blue(0) + 63, View.MeasureSpec.getMode(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onWarmupCompleted) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    int i8 = $10 + 19;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
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
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 63 - (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.lastIndexOf("", c) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                c = '0';
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onNavigationEvent() {
        onNavigationEvent = new char[]{48800, 49976, 47116, 46631, 48804, 49724, 32676, 45651, 47032, 47400, 45911, 46660, 43500, 43503};
        onExtraCallbackWithResult = -1184333948;
        onWarmupCompleted = true;
        IAuthTabCallback = true;
    }
}
