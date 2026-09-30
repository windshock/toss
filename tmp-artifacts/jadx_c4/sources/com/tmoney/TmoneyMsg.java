package com.tmoney;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.utils.BinaryUtil;
import com.tmoney.utils.NumberUtil;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class TmoneyMsg {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 1;
    public static final String msg_err_already_issue = "이미 발급되었습니다.";
    public static final String msg_err_balnace_over = "티머니 잔액이 유효하지 않습니다. 동일한 현상이 지속되면 티머니 고객센터(1644-0088)로 문의해주세요.";
    public static final String msg_err_callback_unknown = "요청하신 작업 중 오류가 발생되었습니다.";
    public static final String msg_err_check_join = "제휴사 티머니에 가입된 경우만 확인 가능합니다. 가입상태를 확인할 수 없습니다.";
    public static final String msg_err_check_tmoney_enable = "티머니(USIM)를 조회하지 못했습니다.\n동일 현상이 지속적으로 발생하면 휴대폰을 재부팅 하신 후 다시 시도해 주세요.\n앱 재실행 시에도 발생되면 티머니 고객센터(1644-0088)로 연락해주세요.";
    public static final String msg_err_data_error = "요청하신 정보가 유효하지 않습니다. 요청내역을 확인하세요.";
    public static final String msg_err_enable_error = "티머니 주 교통카드 설정 중 오류가 발생했습니다. 앱 재실행 후 다시 시도해주시고 동일한 현상이 지속되면 티머니 고객센터(1644-0088)로 문의해주세요.";
    public static final String msg_err_issue = "티머니 발급 중 오류가 발생했습니다. 동일한 현상이 지속되면 티머니 고객센터(1644-0088)로 문의해주세요.";
    public static final String msg_err_joined = "이미 가입된 사용자입니다.";
    public static final String msg_err_kt_ufin_client_fail = "USIM 앱 서비스 설치 중 오류가 발생했습니다. 휴대폰을 종료하여 다시 켜신 후, 앱을 실행해주시기 바랍니다. 동일 문제 현상이 지속적으로 발생하는 경우, 통신사 고객센터로 문의해주세요.";
    public static final String msg_err_kt_ufin_client_install = "KT 금융유심관리 앱 설치 후 다시 시도해주세요.";
    public static final String msg_err_kt_ufin_client_success = "티머니 사용을 위한 USIM 앱 서비스 설치가 완료되었습니다. 휴대폰을 종료하여 다시 켜신 후 앱을 실행해 주세요.";
    public static final String msg_err_kt_ufin_client_update = "KT 금융유심관리 앱 업데이트 후 다시 시도해주세요.";
    public static final String msg_err_lgu_usim_agent = "LGU+ USIM Agent 앱 설치 또는 업데이트 후 다시 시도해주세요.";
    public static final String msg_err_lgu_usim_smsgw_smsc_unsupported = "티머니 사용을 위한 유심 등록이 필요합니다. 자세한 사항은 통신사 고객센터(114)로 문의하시기 바랍니다.";
    public static final String msg_err_live_check_time_limit = "호출 시간을 초과 하였습니다. 잠시후 다시 호출해 주세요";
    public static final String msg_err_membership_delete = "멤버십 삭제 중 오류가 발생했습니다. 동일한 현상이 지속되면 티머니 고객센터(1644-0088)로 문의해주세요.";
    public static final String msg_err_membership_issue = "멤버십 발급 중 오류가 발생했습니다. 동일한 현상이 지속되면 티머니 고객센터(1644-0088)로 문의해주세요.";
    public static final String msg_err_need_1th_issue = "티머니 1차 발급 후 다시 시도해주세요.";
    public static final String msg_err_need_2th_issue = "티머니 2차 발급 후 다시 시도해주세요.";
    public static final String msg_err_need_enable = "티머니를 주 교통카드로 설정한 후 다시 시도해주세요.";
    public static final String msg_err_need_init = "네트워크 상태 확인 후 다시 시도해주세요.";
    public static final String msg_err_need_init_partner_info = "회원 정보가 없습니다. 네트워크 상태 확인 후 다시 시도해주세요.";
    public static final String msg_err_need_join = "제휴사 티머니에 가입 후 다시 시도해주세요.";
    public static final String msg_err_need_nfc_connect = "티머니카드 조회 중 오류가 발생하였습니다. 다시 시도해주세요.";
    public static final String msg_err_need_read_phone_state_permision = "휴대폰 권한(READ_PHONE_STATE)이 필요합니다.";
    public static final String msg_err_need_reboot = "[AUS80]\\n휴대폰을 종료하여 다시 켜신 후 앱을 다시 실행해주세요.\\n\\n동일 문제 현상이 지속적으로 발생하는 경우, 티머니 고객센터(1644-0088)로 연락주세요.";
    public static final String msg_err_need_refund = "잔액 환불 후 후불형 서비스 등록 가능합니다. 환불 후 이용해주세요.";
    public static final String msg_err_need_tmoney_1th_issue = "티머니 애플릿 1차 발급 후 다시 시도해주세요.";
    public static final String msg_err_need_tmoney_2th_issue = "티머니 애플릿 2차 발급 후 다시 시도해주세요.";
    public static final String msg_err_need_tmoney_enable = "티머니를 주 교통카드로 설정 후 다시 시도해주세요.";
    public static final String msg_err_need_tmoney_product_issue = "티머니 애플릿의 상품 등록 후 다시 시도해주세요.";
    public static final String msg_err_need_update_seioagent = "[AUS85]\\n티머니 사용을 위한 SEIO Agent 업데이트가 필요하여 마켓으로 이동합니다.\\n\\n반드시 설치하셔야 티머니 사용이 가능하며\\n설치 완료 후 앱을 재 실행해주세요.";
    public static final String msg_err_nerwork_server_failure_retry = "인터넷 연결상태가 불안합니다.\n인터넷 연결상태를 확인해주시고, 앱을 다시 실행해주세요.\n지속적으로 발생되면 티머니 고객센터(1644-0088)로 연락해주세요.";
    public static final String msg_err_network_server_failure_callcenter = "서버에서 응답받은 데이터가 오류가 있습니다.\n앱 종료 후 다시 시도 해주세요.\n지속적으로 발생되면 티머니 고객센터(1644-0088)로 연락해주세요.";
    public static final String msg_err_network_service = "서비스 연결에 실패했습니다. 네트워크 상태를 확인해주세요.";
    public static final String msg_err_no_data = "회원 정보가 없습니다.";
    public static final String msg_err_noregist_creditcard = "충전 정보 등록 후 사용해주세요.";
    public static final String msg_err_not_support_card = "서비스 대상 카드가 아닙니다.";
    public static final String msg_err_not_support_device = "티머니를 이용할 수 없는 휴대폰입니다. 궁금하신 점은 티머니 고객센터(1644-0088)로 문의해주세요.";
    public static final String msg_err_not_supported_tmoney = "티머니를 이용할 수 없는 유심입니다.\n자세한 사항은 티머니 고객센터(1644-0088)로 문의해주세요.";
    public static final String msg_err_not_target_user = "한도 상향 대상자가 아닙니다.";
    public static final String msg_err_oma_auth_fail = "OMA_AUTH 권한요청중 오류가 발생하였습니다.";
    public static final String msg_err_oma_not_supported_carrier_card = "OMA API 가 지원되지 않는 카드입니다.";
    public static final String msg_err_oma_skt_or_mvno_user = "SKT 또는 제휴된 MVNO 가입자가 아닙니다.";
    public static final String msg_err_oma_unsupported_os = "Android OS가 10이하인 단말은 OMA API 미지원 OS입니다.";
    public static final String msg_err_oma_unsupported_phone = "OMA API 미지원 단말입니다.";
    public static final String msg_err_oma_unsupported_seioagent_version = "SEIOAgent가 2.8이하는 OMA API 미지원입니다.";
    public static final String msg_err_partner_join = "[%s] 해지 후 이용 가능합니다.";
    public static final String msg_err_permission = "휴대폰 접근 권한이 필요합니다. 권한을 허용해주세요.";
    public static final String msg_err_point_member = "티머니 포인트 사용이 불가능한 가입자입니다.";
    public static final String msg_err_regist_credit = "카드 등록 후 다시 시도해주세요.";
    public static final String msg_err_request_amount = "잔액과 요청금액 확인 후 다시 시도해주세요.";
    public static final String msg_err_seio_sem_2 = "다른 앱에서 USIM을 사용 중입니다. 잠시 후 다시 시도해주시고, 동일 현상이 지속되면 티머니 고객센터(1644-0088)로 문의해주세요.";
    public static final String msg_err_server_data_parsing = "데이터 오류입니다.\n다시 시도해주세요.";
    public static final String msg_err_server_exception = "요청한 정보 확인 중 알 수 없는 오류가 발생되었습니다.\n다시 시도해주세요.";
    public static final String msg_err_server_nodata = "요청한 정보를 확인할 수 없습니다.\n다시 시도해주세요.";
    public static final String msg_err_service = "서비스 연결에 실패했습니다.";
    public static final String msg_err_skt_seio_install = "SKT SEIOAgent 앱 설치 후 다시 시도해주세요.";
    public static final String msg_err_skt_seio_sem_81 = "티머니 미지원 단말입니다. 티머니 고객센터(1644-0088)로 문의해주세요.";
    public static final String msg_err_skt_seio_sem_82 = "OS 업데이트 후 사용 가능합니다. Android OS를 6.0.1 이상으로 업데이트 후, 앱을 재실행해주세요.";
    public static final String msg_err_skt_seio_sem_85 = "SKT SEIOAgent  앱 업데이트 후 다시 시도해주세요.";
    public static final String msg_err_skt_seio_sem_unknown = "휴대폰을 재부팅후 다시 시도해주세요";
    public static final String msg_err_skt_seio_update = "SKT SEIOAgent 앱 업데이트 후 다시 시도해주세요.";
    public static final String msg_err_skt_ucp_983 = "통신사에 개통/등록되지 않은 유심입니다. 개통 후 시도해주세요";
    public static final String msg_err_skt_ucp_994 = "통신사의 정책 상, 고객님의 USIM은 Android 10 이상에서 USIM 앱 서비스를 지원하지 않습니다. 자세한 사항은 통신사 고객센터로 문의해주세요.";
    public static final String msg_err_tmoney_enable_fail = "주 교통카드 설정요청이 실패되었습니다.";
    public static final String msg_err_tmoney_enable_info = "주 교통카드 설정요청 중 정보확인 오류가 발생되었습니다";
    public static final String msg_err_tmoney_need_join = "티머니 서비스 가입 후 다시 시도해주세요.";
    public static final String msg_err_unknown = "서비스 오류가 발생하였습니다. 종료후 다시 시도 해주세요.";
    public static final String msg_err_unknown_device_info = "전화번호 정보가 확인되지 않습니다. 동일한 현상이 지속되면 티머니 고객센터(1644-0088)로 문의해주세요.";
    public static final String msg_err_unregist_creditcard = "후불 등록된 신용카드 해지 후 다시 시도해주세요.";
    public static final String msg_err_unsupport_os_device = "[AUS82]\\n티머니 서비스 사용을 위해 단말의 OS 업데이트(Android 6.0.1 이상)가 필요합니다.\\nOS 업데이트가 가능할경우 OS 업데이트 후 앱을 재실행해주세요.\\n\\nAndroid 6.0.1 이상으로 업데이트 후에도 동일한 오류가 발생되면 티머니 고객센터(1644-0088)로 연락 주시기 바랍니다.";
    public static final String msg_err_user_postpaid_longtime_nouse_disable = "장기미접속자로 사용제한된 티머니카드입니다. 장기미사용 해제 후 사용할 수 있습니다.";
    public static final String msg_err_user_use_lost_disable = "분실신고된 티머니카드입니다. 분실해제 후 사용할 수 있습니다.";
    public static final String msg_err_usim_agent_default = "USIM 앱 서비스 확인 중 오류가 발생했습니다. 자세한 사항은 통신사 고객센터로 문의하시기 바랍니다.";
    public static final String msg_err_usim_amount = "한도복원 금액이 유효하지 않습니다. 티머니 고객센터(1644-0088)로 문의해주세요.";
    public static final String msg_err_usim_changed = "USIM 정보가 변경되었습니다. 앱을 재실행해주세요.";
    public static final String msg_err_usim_channel = "유심 채널 오류가 발생하였습니다.\n휴대폰을 재부팅 하신 후 다시 시도해 주세요.\n앱 재실행 시에도 발생되면 티머니 고객센터(1644-0088)로 연락해주세요.";
    public static final String msg_err_usim_create = "유심 모듈 연결중 오류가 발생하였습니다. 네트워크 상태 확인 및 유심 Agent 확인하여 다시 시도해주세요.\n동일 현상이 지속적으로 발생하면 티머니 고객센터(1644-0088)로 연락해주세요.";
    public static final String msg_err_usim_default = "티머니 유심 오류(%s)가 발생했습니다.\n지속적으로 발생되면, 티머니 고객센터(1644-0088)로 연락해주세요.";
    public static final String msg_err_usim_kt_3xxx = "애플릿  등록정보  확인이 필요합니다.\nMoCa TSM 운영센터에  문의해주세요.";
    public static final String msg_err_usim_kt_7004 = "KT 금융유심관리 앱의 업그레이드 후 다시 시도해주세요.";
    public static final String msg_err_usim_kt_7012 = "통신사의 정책 상, 본 단말기/USIM은 USIM 앱 서비스를 지원하지 않습니다. 자세한 사항은 통신사 고객센터로 문의해주세요.";
    public static final String msg_err_usim_lgu_common_key;
    public static final String msg_err_usim_lgu_common_key_over;
    public static final String msg_err_usim_lgu_common_not_support = "통신사 권한 획득 실패.";
    public static final String msg_err_usim_lgu_reboot = "티머니 사용을 위한 USIM 앱 서비스 설치가 완료되었습니다. 휴대폰을 종료하여 다시 켜신 후 앱을 실행해 주시기 바랍니다.";
    public static final String msg_err_usim_lgu_unspport = "티머니 사용을 위한 등록이 필요합니다. 1~4주 소요될 수 있으며 자세한 사항은 통신사 고객센터로 문의하시기 바랍니다.";
    public static final String msg_err_usim_lgu_unusable = "모바일티머니 서비스 이용을 위해서는, 통신사의 정책에 따라 USIM 교체가 필요합니다. 자세한 사항은 통신사 고객센터(114)로 문의해주세요.";
    public static final String msg_err_usim_lgu_unusable_from_server = "통신사 서버로부터 USIM 앱 서비스 설치 진행 중 사용불가 응답을 받았습니다. 자세한 사항은 통신사 고객센터로 문의하시기 바랍니다.";
    public static final String msg_err_usim_lgu_update_agent = "USIM 앱 서비스 설치 및 업데이트가 필요하여 마켓으로 이동합니다. 설치, 업데이트 완료 후 앱을 재 실행해주세요.";
    public static final String msg_err_usim_not_recognized = "티머니(USIM)를 조회하지 못했습니다.\n휴대폰을 재부팅 하신 후 다시 시도해 주세요.\n지속적으로 발생되면 티머니 고객센터(1644-0088)로 연락해주세요.";
    public static final String msg_err_usim_ota_kscc = "티머니 애플릿 2차 발급 실패하였습니다. \n동일 현상이 지속적으로 발생하면 티머니 고객센터(1644-0088)로 연락 바랍니다.";
    public static final String msg_err_usim_progress = "티머니 사용을 위한 USIM 앱 서비스가 설치되고 있습니다. 잠시만 기다려주세요. (최대 2분 소요)";
    public static final String msg_err_usim_unknow_sw = "티머니(USIM)를 조회 중 오류가 발생하였습니다.\n휴대폰을 재부팅 하신 후 다시 시도해 주세요.\n지속적으로 발생되면 티머니 고객센터(1644-0088)로 연락해주세요.";
    public static final String msg_errskt_seio_sem_setting = "USIM 앱 서비스를 위한 설정 진행 중 오류가 발생했습니다. 휴대폰을 종료하여 다시 켜신 후 앱을 재실행해주세요. 동일 문제 현상이 지속적으로 발생하는 경우, 티머니 고객센터(1644-0088)로 문의해주세요";
    public static final String msg_livecheck_limit = "라이브체크시간오류";
    public static final String msg_need_livecheck = "라이브체크가 필요합니다.";
    public static final String msg_nfc_error_sel = "중간에 카드를 떼면 인식이 안될 수 있습니다. 티머니 카드를 다시 대주세요.";
    public static final String msg_not_support_paymethod = "유효한 결제 정보가 아닙니다. ";
    public static final String msg_not_support_tel = "티머니를 이용할 수 없는 통신사입니다. 궁금하신 점은 티머니 고객센터(1644-0088)로 문의해주세요.";
    public static final String msg_not_support_usim = "티머니를 이용할 수 없는 USIM입니다. 궁금하신 점은 티머니 고객센터(1644-0088)로 문의해주세요.";
    public static final String msg_tpo_lilmit = "인터넷 연결상태가 불안합니다. 인터넷 연결상태를 확인해주시고, 다시 실행해주세요";
    public static final String msg_tpo_no_send_data = "전송할 티머니 거래 정보가 없습니다.";
    public static final String msg_user_use_change_phone = "전화번호가 변경 되었습니다.";
    public static final String msg_user_use_limit = "이용이 제한된 사용자입니다.";
    public static final String msg_user_use_limit2 = "이용이 제한된 사용자입니다. 고객센터(1644-0088)로 연락 바랍니다.";
    public static final String msg_user_use_poor_usim = "사용할 수 없는 유심입니다.";
    public static final String msg_usim_error_con = "USIM모듈 연결 중 오류가 발생했습니다. 앱 재실행 후 다시 시도해주시고, 동일 현상이 지속되면 티머니 고객센터(1644-0088)로 문의해주세요.";
    public static final String msg_usim_error_sel = "USIM정보 조회 중 오류가 발생했습니다. 앱 재실행 후 다시 시도해주시고, 동일 현상이 지속되면 티머니 고객센터(1644-0088)로 문의해주세요.";
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;
    private byte[] a;
    private byte[] b;
    private boolean c;

    public TmoneyMsg() {
    }

    public TmoneyMsg(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        this.a = bArr2;
        byte[] bArr3 = new byte[2];
        this.b = bArr3;
        this.c = false;
        if (bArr != null) {
            if (bArr.length == 2) {
                System.arraycopy(bArr, 0, bArr3, 0, 2);
                return;
            }
            if (bArr.length == 6) {
                int i = onWarmupCompleted + 115;
                IAuthTabCallbackStub = i % 128;
                int i2 = i % 2;
                System.arraycopy(bArr, 0, bArr2, 0, 4);
                System.arraycopy(bArr, 4, this.b, 0, 2);
                byte[] bArr4 = this.b;
                if (bArr4[0] == -112 && bArr4[1] == 0) {
                    int i3 = onWarmupCompleted + 19;
                    IAuthTabCallbackStub = i3 % 128;
                    int i4 = i3 % 2;
                    this.c = true;
                    int i5 = 2 % 2;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getKtMessage(String str) {
        int i;
        int i2;
        int i3 = 2 % 2;
        String str2 = "[K" + str + "]";
        switch (str.hashCode()) {
            case 48625:
                if (str.equals("100")) {
                    int i4 = IAuthTabCallbackStub;
                    int i5 = i4 + 71;
                    onWarmupCompleted = i5 % 128;
                    c = i5 % 2 == 0 ? (char) 0 : (char) 1;
                    i = i4 + 59;
                    i2 = i % 128;
                    onWarmupCompleted = i2;
                    int i6 = i % 2;
                    break;
                }
                c = 65535;
                break;
            case 49586:
                if (str.equals("200")) {
                    i = IAuthTabCallbackStub + 27;
                    i2 = i % 128;
                    onWarmupCompleted = i2;
                    int i62 = i % 2;
                    break;
                }
                c = 65535;
                break;
            case 50547:
                if (!str.equals("300")) {
                    c = 65535;
                    break;
                } else {
                    c = 2;
                    break;
                }
            case 1686169:
                if (str.equals("7000")) {
                    int i7 = IAuthTabCallbackStub + 107;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    c = 3;
                    break;
                }
                break;
            case 1686173:
                if (str.equals("7004")) {
                    int i9 = onWarmupCompleted + 1;
                    IAuthTabCallbackStub = i9 % 128;
                    int i10 = i9 % 2;
                    c = 4;
                    break;
                }
                break;
            case 1686202:
                if (str.equals("7012")) {
                    c = 5;
                    break;
                }
                break;
            case 1692898:
                if (str.equals("7702")) {
                    int i11 = onWarmupCompleted + 83;
                    IAuthTabCallbackStub = i11 % 128;
                    if (i11 % 2 != 0) {
                        c = 6;
                        break;
                    } else {
                        c = 'O';
                        break;
                    }
                }
                break;
        }
        switch (c) {
            case 0:
                return str2 + msg_err_usim_progress;
            case 1:
                return str2 + msg_err_kt_ufin_client_success;
            case 2:
                return str2 + msg_err_kt_ufin_client_fail;
            case 3:
            case 4:
                return str2 + msg_err_usim_kt_7004;
            case 5:
                String str3 = str2 + msg_err_usim_kt_7012;
                int i12 = IAuthTabCallbackStub + 103;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                return str3;
            case 6:
                return str2 + msg_err_usim_progress;
            default:
                return str2 + msg_err_usim_create;
        }
    }

    public static String getLguMessage(int i) {
        int i2 = 2 % 2;
        String str = "[U" + i + "]";
        if (i == 1000) {
            return str + msg_err_usim_lgu_update_agent;
        }
        if (i == 2006) {
            return str + msg_err_usim_lgu_unspport;
        }
        int i3 = onWarmupCompleted + 93;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0 ? i != 7806 : i != 20790) {
            if (i == 3001) {
                return str + msg_err_usim_lgu_unusable;
            }
            if (i == 3002) {
                return str + msg_err_usim_lgu_reboot;
            }
            switch (i) {
                case 1002:
                    return str + msg_err_usim_lgu_update_agent;
                case 1003:
                    return str + msg_err_usim_lgu_update_agent;
                case 1004:
                    String str2 = str + msg_err_usim_lgu_update_agent;
                    int i4 = IAuthTabCallbackStub + 21;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return str2;
                default:
                    switch (i) {
                        case 2001:
                            break;
                        case 2002:
                            String str3 = str + msg_err_usim_progress;
                            int i6 = IAuthTabCallbackStub + 39;
                            onWarmupCompleted = i6 % 128;
                            int i7 = i6 % 2;
                            return str3;
                        case 2003:
                            return str + msg_err_usim_lgu_reboot;
                        case 2004:
                            return str + msg_err_usim_lgu_unusable_from_server;
                        default:
                            return str + String.format(msg_err_usim_agent_default, Integer.valueOf(i));
                    }
            }
        }
        return str + msg_err_usim_lgu_unusable;
    }

    public static String getLguMessage(String str) throws Throwable {
        int i = 2 % 2;
        String upperCase = str.toUpperCase();
        String str2 = "[U" + upperCase + "]";
        if (TextUtils.equals(upperCase, "EX20")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            Object[] objArr = new Object[1];
            d(new char[]{13419, 669, 52207, 55676, 3052, 24135, 29243, 6754, 44909, 45134, 52350, 35756, 39251, 64163, 11704, 12710}, KeyEvent.keyCodeFromString("") + 15, objArr);
            sb.append(((String) objArr[0]).intern());
            return sb.toString();
        }
        if (TextUtils.equals(upperCase, "EX21")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            Object[] objArr2 = new Object[1];
            d(new char[]{44909, 45134, 62397, 21143, 23508, 3609, 27089, 26158, 10026, 60999, 39251, 64163, 11704, 12710}, MotionEvent.axisFromString("") + 14, objArr2);
            sb2.append(((String) objArr2[0]).intern());
            String string = sb2.toString();
            int i2 = onWarmupCompleted + 85;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }
        if (TextUtils.equals(upperCase, "EX22")) {
            return str2 + msg_err_usim_lgu_common_not_support;
        }
        if (!TextUtils.equals(upperCase, "EX23")) {
            return String.format(msg_err_usim_agent_default, new Object[0]);
        }
        String str3 = str2 + msg_err_usim_lgu_reboot;
        int i4 = IAuthTabCallbackStub + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str3;
    }

    public static String getMsg(int i) {
        int i2 = 2 % 2;
        String str = "[SDK" + i + "] " + getTmoneyMsg(i);
        int i3 = onWarmupCompleted + 11;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String getSktMsg(int i) {
        int i2 = 2 % 2;
        String str = "[S" + i + "] ";
        if (i != -40) {
            if (i == -30) {
                return str + "SEIO AGENT 서비스 바인드 실패로 사용 불가능 상태";
            }
            if (i == -20) {
                return str + "권한이 없어 사용 불가능 상태";
            }
            int i3 = IAuthTabCallbackStub + 67;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            if (i3 % 2 == 0 ? i == -10 : i == 106) {
                return str + "패키지 권한 획득 실패로 사용 불가능 상태";
            }
            if (i != -2) {
                if (i == 0) {
                    String str2 = str + "컴포넌트 초기 상태";
                    int i5 = onWarmupCompleted + 81;
                    IAuthTabCallbackStub = i5 % 128;
                    if (i5 % 2 != 0) {
                        return str2;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i6 = i4 + 109;
                int i7 = i6 % 128;
                IAuthTabCallbackStub = i7;
                int i8 = i6 % 2;
                if (i == 50) {
                    return str + "사용 가능 상태";
                }
                if (i == 80) {
                    return str + ResultDetailCode.SKT_SEIO_SEM_80.getMessage();
                }
                if (i == 983) {
                    return str + ResultDetailCode.SKT_UCP_983.getMessage();
                }
                if (i == 994) {
                    return str + ResultDetailCode.SKT_UCP_994.getMessage();
                }
                int i9 = i7 + 7;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                switch (i) {
                    case -86:
                        return str + ResultDetailCode.SKT_SEIO_SEM_86.getMessage();
                    case -85:
                        return str + ResultDetailCode.SKT_SEIO_SEM_85.getMessage();
                    case -84:
                        return str + ResultDetailCode.SKT_SEIO_SEM_84.getMessage();
                    case -83:
                        String str3 = str + ResultDetailCode.SKT_SEIO_SEM_83.getMessage();
                        int i11 = onWarmupCompleted + 13;
                        IAuthTabCallbackStub = i11 % 128;
                        int i12 = i11 % 2;
                        return str3;
                    case -82:
                        return str + ResultDetailCode.SKT_SEIO_SEM_82.getMessage();
                    case -81:
                        return str + ResultDetailCode.SKT_SEIO_SEM_81.getMessage();
                    default:
                        return str + String.format(msg_err_usim_agent_default, Integer.valueOf(i));
                }
            }
        }
        return str + ResultDetailCode.SKT_SEIO_SEM_2.getMessage();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getTmoneyMsg(int i) {
        int i2 = 2 % 2;
        if (i == 10) {
            return msg_err_usim_not_recognized;
        }
        int i3 = onWarmupCompleted + 89;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        if (i3 % 2 == 0) {
            if (i == 81) {
                return msg_err_usim_ota_kscc;
            }
        } else if (i == 11) {
            return msg_err_usim_ota_kscc;
        }
        if (i == 79) {
            return msg_err_need_read_phone_state_permision;
        }
        if (i == 85) {
            return msg_err_not_target_user;
        }
        int i5 = i4 + 77;
        int i6 = i5 % 128;
        onWarmupCompleted = i6;
        int i7 = i5 % 2;
        switch (i) {
            case 20:
            case 21:
                return msg_err_usim_not_recognized;
            case 22:
            case 23:
            case 24:
                return msg_err_usim_create;
            case 25:
                return msg_err_usim_unknow_sw;
            default:
                Object obj = null;
                switch (i) {
                    case 28:
                        break;
                    case 29:
                        return msg_err_usim_kt_3xxx;
                    case 30:
                        return msg_err_not_supported_tmoney;
                    case 31:
                        return msg_err_usim_create;
                    case 32:
                        int i8 = i4 + 27;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        return msg_err_usim_channel;
                    case 33:
                        int i10 = i6 + 3;
                        IAuthTabCallbackStub = i10 % 128;
                        int i11 = i10 % 2;
                        return msg_err_usim_kt_7004;
                    case 34:
                        return msg_err_need_tmoney_1th_issue;
                    case 35:
                        return msg_err_need_tmoney_2th_issue;
                    case 36:
                        return msg_err_need_tmoney_product_issue;
                    case 37:
                        int i12 = i4 + 19;
                        onWarmupCompleted = i12 % 128;
                        if (i12 % 2 == 0) {
                            return msg_err_need_tmoney_enable;
                        }
                        obj.hashCode();
                        throw null;
                    case 38:
                        return msg_err_check_tmoney_enable;
                    case 39:
                        return msg_err_tmoney_enable_info;
                    case 40:
                        return msg_err_tmoney_enable_fail;
                    case 41:
                        return msg_err_check_join;
                    case 42:
                        return msg_err_need_join;
                    case 43:
                        return msg_err_regist_credit;
                    case 44:
                        return msg_err_request_amount;
                    case 45:
                        return msg_err_live_check_time_limit;
                    default:
                        switch (i) {
                            case 50:
                                return msg_tpo_lilmit;
                            case 51:
                                return msg_err_network_server_failure_callcenter;
                            case 52:
                            case 53:
                                return msg_err_nerwork_server_failure_retry;
                            case 54:
                                return msg_err_server_nodata;
                            case 55:
                                int i13 = i6 + 71;
                                IAuthTabCallbackStub = i13 % 128;
                                if (i13 % 2 != 0) {
                                    return msg_err_server_data_parsing;
                                }
                                throw null;
                            case 56:
                                return msg_err_server_exception;
                            case 57:
                                return msg_err_point_member;
                            case 58:
                                return msg_tpo_no_send_data;
                            default:
                                return msg_err_unknown;
                        }
                }
        }
    }

    public static String makeMessage(String str, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 7;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i == -1) {
            return "[" + str + "] " + getTmoneyMsg(i2);
        }
        String str2 = "[" + str + i + "] " + getTmoneyMsg(i2);
        int i5 = onWarmupCompleted + 59;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
        return str2;
    }

    public static String makeMessage(String str, int i, String str2) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 73;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i == -1) {
            return "[" + str + "] " + str2;
        }
        String str3 = "[" + str + i + "] " + str2;
        int i4 = IAuthTabCallbackStub + 17;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return str3;
    }

    public static String makeMessage(String str, String str2, int i) {
        int i2 = 2 % 2;
        String str3 = "[" + str + str2 + "] " + getTmoneyMsg(i);
        int i3 = IAuthTabCallbackStub + 83;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return str3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String makeMessage(String str, String str2, String str3) {
        int i = 2 % 2;
        String str4 = "[" + str + str2 + "] " + str3;
        int i2 = onWarmupCompleted + 107;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return str4;
    }

    public static String makeUsimMessage(String str, String str2, String str3) {
        int i = 2 % 2;
        String str4 = String.format(msg_err_usim_default, str + str2 + "_" + str3);
        int i2 = IAuthTabCallbackStub + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str4;
    }

    public int getBalance() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int i4 = -1;
        try {
            if (this.c) {
                i4 = NumberUtil.parseInt(this.a);
            }
        } catch (Exception unused) {
        }
        int i5 = IAuthTabCallbackStub + 19;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public String getSW() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 85;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = this.b;
        if (bArr != null) {
            int i5 = i2 + 33;
            int i6 = i5 % 128;
            onWarmupCompleted = i6;
            int i7 = i5 % 2;
            if (bArr.length == 2) {
                int i8 = i6 + 113;
                IAuthTabCallbackStub = i8 % 128;
                int i9 = i8 % 2;
                String binaryStringtoUp = BinaryUtil.toBinaryStringtoUp(bArr);
                if (i9 == 0) {
                    int i10 = 27 / 0;
                }
                return binaryStringtoUp;
            }
        }
        int i11 = i2 + 105;
        onWarmupCompleted = i11 % 128;
        if (i11 % 2 == 0) {
            return "NONE";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isbResData() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 69;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.c;
        int i5 = i2 + 53;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SUCCESS' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class TmoneyResult {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final TmoneyResult AJAX_FAIL_SEND;
        private static char IAuthTabCallback = 0;
        private static int IAuthTabCallbackDefault = 0;
        public static final TmoneyResult OTA_ERROR_KSCC;
        public static final TmoneyResult SUCCESS;
        public static final TmoneyResult TPO_NO_SEND_DATA;
        public static final TmoneyResult USIM_ERROR_CONNECT;
        public static final TmoneyResult USIM_ERROR_KT_CLIENT_FAIL;
        public static final TmoneyResult USIM_ERROR_KT_CLIENT_PROGRESS;
        public static final TmoneyResult USIM_ERROR_KT_CLIENT_WORKING;
        public static final TmoneyResult USIM_ERROR_KT_INSTALL_AGENT;
        public static final TmoneyResult USIM_ERROR_KT_UPDATE_AGENT;
        public static final TmoneyResult USIM_ERROR_LGU_UPDATE_AGENT;
        public static final TmoneyResult USIM_ERROR_LGU_WAITING;
        public static final TmoneyResult USIM_ERROR_LOCK;
        public static final TmoneyResult USIM_ERROR_NEED_REBOOT;
        public static final TmoneyResult USIM_ERROR_SEIOAGENT_UPDATE;
        public static final TmoneyResult USIM_ERROR_UNSUPPORT;
        private static int asBinder = 1;
        private static final /* synthetic */ TmoneyResult[] d;
        private static char onExtraCallback = 0;
        private static char onExtraCallbackWithResult = 0;
        private static char onNavigationEvent = 0;
        private static int onTransact = 1;
        private static int onWarmupCompleted;
        private String a;
        private String b;
        private String c;

        static {
            onNavigationEvent();
            Object[] objArr = new Object[1];
            e(new char[]{56320, 3210, 23137, 28601, 42875, 26258, 61295, 58092}, Color.alpha(0) + 7, objArr);
            TmoneyResult tmoneyResult = new TmoneyResult(((String) objArr[0]).intern(), 0, "", "", "");
            SUCCESS = tmoneyResult;
            TmoneyResult tmoneyResult2 = new TmoneyResult("USIM_ERROR_CONNECT", 1, 28, TmoneyMsg.msg_err_usim_create, "");
            USIM_ERROR_CONNECT = tmoneyResult2;
            TmoneyResult tmoneyResult3 = new TmoneyResult("USIM_ERROR_LOCK", 2, 37, TmoneyMsg.msg_err_need_tmoney_enable, "");
            USIM_ERROR_LOCK = tmoneyResult3;
            TmoneyResult tmoneyResult4 = new TmoneyResult("USIM_ERROR_NEED_REBOOT", 3, 80, TmoneyMsg.msg_err_need_reboot, "");
            USIM_ERROR_NEED_REBOOT = tmoneyResult4;
            TmoneyResult tmoneyResult5 = new TmoneyResult("USIM_ERROR_SEIOAGENT_UPDATE", 4, 81, TmoneyMsg.msg_err_need_update_seioagent, "");
            USIM_ERROR_SEIOAGENT_UPDATE = tmoneyResult5;
            TmoneyResult tmoneyResult6 = new TmoneyResult("USIM_ERROR_UNSUPPORT", 5, 82, TmoneyMsg.msg_err_unsupport_os_device, "");
            USIM_ERROR_UNSUPPORT = tmoneyResult6;
            TmoneyResult tmoneyResult7 = new TmoneyResult("USIM_ERROR_LGU_UPDATE_AGENT", 6, 1002, TmoneyMsg.msg_err_usim_lgu_update_agent, "");
            USIM_ERROR_LGU_UPDATE_AGENT = tmoneyResult7;
            TmoneyResult tmoneyResult8 = new TmoneyResult("USIM_ERROR_LGU_WAITING", 7, 2002, TmoneyMsg.msg_err_usim_progress, "");
            USIM_ERROR_LGU_WAITING = tmoneyResult8;
            ResultDetailCode resultDetailCode = ResultDetailCode.KT_UFIN_CLIENT_INSTALL;
            TmoneyResult tmoneyResult9 = new TmoneyResult("USIM_ERROR_KT_INSTALL_AGENT", 8, resultDetailCode.getCodeString(), resultDetailCode.getMessage(), "");
            USIM_ERROR_KT_INSTALL_AGENT = tmoneyResult9;
            ResultDetailCode resultDetailCode2 = ResultDetailCode.KT_UFIN_CLIENT_UPDATE;
            TmoneyResult tmoneyResult10 = new TmoneyResult("USIM_ERROR_KT_UPDATE_AGENT", 9, resultDetailCode2.getCodeString(), resultDetailCode2.getMessage(), "");
            USIM_ERROR_KT_UPDATE_AGENT = tmoneyResult10;
            ResultDetailCode resultDetailCode3 = ResultDetailCode.KT_UFIN_CLIENT_WORKING;
            TmoneyResult tmoneyResult11 = new TmoneyResult("USIM_ERROR_KT_CLIENT_WORKING", 10, resultDetailCode3.getCodeString(), resultDetailCode3.getMessage(), "");
            USIM_ERROR_KT_CLIENT_WORKING = tmoneyResult11;
            ResultDetailCode resultDetailCode4 = ResultDetailCode.KT_UFIN_CLIENT_PROGRESS;
            TmoneyResult tmoneyResult12 = new TmoneyResult("USIM_ERROR_KT_CLIENT_PROGRESS", 11, resultDetailCode4.getCodeString(), resultDetailCode4.getMessage(), "");
            USIM_ERROR_KT_CLIENT_PROGRESS = tmoneyResult12;
            ResultDetailCode resultDetailCode5 = ResultDetailCode.KT_UFIN_CLIENT_FAIL;
            TmoneyResult tmoneyResult13 = new TmoneyResult("USIM_ERROR_KT_CLIENT_FAIL", 12, resultDetailCode5.getCodeString(), resultDetailCode5.getMessage(), "");
            USIM_ERROR_KT_CLIENT_FAIL = tmoneyResult13;
            TmoneyResult tmoneyResult14 = new TmoneyResult("OTA_ERROR_KSCC", 13, 11, TmoneyMsg.msg_err_usim_ota_kscc, "");
            OTA_ERROR_KSCC = tmoneyResult14;
            TmoneyResult tmoneyResult15 = new TmoneyResult("TPO_NO_SEND_DATA", 14, 58, TmoneyMsg.msg_tpo_no_send_data, "");
            TPO_NO_SEND_DATA = tmoneyResult15;
            TmoneyResult tmoneyResult16 = new TmoneyResult("AJAX_FAIL_SEND", 15, 50, TmoneyMsg.msg_tpo_lilmit, "");
            AJAX_FAIL_SEND = tmoneyResult16;
            d = new TmoneyResult[]{tmoneyResult, tmoneyResult2, tmoneyResult3, tmoneyResult4, tmoneyResult5, tmoneyResult6, tmoneyResult7, tmoneyResult8, tmoneyResult9, tmoneyResult10, tmoneyResult11, tmoneyResult12, tmoneyResult13, tmoneyResult14, tmoneyResult15, tmoneyResult16};
            int i = asBinder + 81;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                int i2 = 46 / 0;
            }
        }

        private TmoneyResult(String str, int i, int i2, String str2, String str3) {
            this.a = String.valueOf(i2);
            this.b = str2;
            this.c = str3;
        }

        private TmoneyResult(String str, int i, String str2, String str3, String str4) {
            this.a = str2;
            this.b = str3;
            this.c = str4;
        }

        public static TmoneyResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onTransact + 13;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            TmoneyResult tmoneyResult = (TmoneyResult) Enum.valueOf(TmoneyResult.class, str);
            int i4 = onTransact + 93;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return tmoneyResult;
        }

        public static TmoneyResult[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 1;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            TmoneyResult[] tmoneyResultArr = (TmoneyResult[]) d.clone();
            int i4 = onTransact + 63;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                return tmoneyResultArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getCode() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 55;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            String str = this.a;
            int i5 = i2 + 121;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String getLog() {
            int i = 2 % 2;
            int i2 = onTransact + 11;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            String str = this.c;
            if (i3 != 0) {
                int i4 = 98 / 0;
            }
            return str;
        }

        public final String getMessage() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 31;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            String str = this.b;
            int i5 = i3 + 63;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final TmoneyResult setCode(int i, int i2) {
            int i3 = 2 % 2;
            int i4 = onTransact + 109;
            IAuthTabCallbackDefault = i4 % 128;
            Object obj = null;
            try {
                if (i4 % 2 != 0) {
                    this.a = String.valueOf(i);
                    obj.hashCode();
                    throw null;
                }
                this.a = String.valueOf(i);
                int i5 = onTransact + 9;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return this;
                }
                obj.hashCode();
                throw null;
            } catch (Exception unused) {
                this.a = String.valueOf(i2);
                return this;
            }
        }

        public final TmoneyResult setCode(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 105;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            this.a = str;
            if (i4 == 0) {
                int i5 = 55 / 0;
            }
            int i6 = i2 + 87;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final TmoneyResult setLog(String str) {
            int i = 2 % 2;
            int i2 = onTransact + 5;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            this.c = str;
            if (i4 != 0) {
                throw null;
            }
            int i5 = i3 + 23;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final TmoneyResult setMessage(String str) {
            int i = 2 % 2;
            int i2 = onTransact + 21;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            this.b = str;
            if (i3 == 0) {
                return this;
            }
            throw null;
        }

        private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i4 = $11 + 75;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                char c = 1;
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i6 = 58224;
                int i7 = i3;
                while (i7 < 16) {
                    char c2 = cArr3[c];
                    char c3 = cArr3[i3];
                    char[] cArr4 = cArr3;
                    int i8 = (c3 + i6) ^ ((c3 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                    int i9 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                        objArr2[2] = Integer.valueOf(i9);
                        objArr2[c] = Integer.valueOf(i8);
                        objArr2[0] = Integer.valueOf(c2);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                            int i10 = 12435 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            Class[] clsArr = new Class[4];
                            clsArr[0] = Integer.TYPE;
                            clsArr[c] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(keyRepeatTimeout, minimumFlingVelocity, i10, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr4[c] = cCharValue;
                        int i11 = i7;
                        Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (ViewConfiguration.getTouchSlop() >> 8) + 10, TextUtils.lastIndexOf("", '0', 0, 0) + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7 = i11 + 1;
                        int i12 = $11 + 109;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        cArr3 = cArr4;
                        i3 = 0;
                        c = 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr5 = cArr3;
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), MotionEvent.axisFromString("") + 15, View.MeasureSpec.getMode(0) + 19901, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        static void onNavigationEvent() {
            onNavigationEvent = (char) 38277;
            onExtraCallback = (char) 2606;
            IAuthTabCallback = (char) 21784;
            onExtraCallbackWithResult = (char) 61371;
        }
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $11 + 87;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(i3);
                        int bitsPerPixel = 9 - ImageFormat.getBitsPerPixel(i3);
                        int scrollBarSize = 12434 - (ViewConfiguration.getScrollBarSize() >> 8);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cNormalizeMetaState, bitsPerPixel, scrollBarSize, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 10 - KeyEvent.getDeadChar(0, 0), Color.rgb(0, 0, 0) + 16789650, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    int i10 = $10 + 111;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16014), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19900, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        d(new char[]{44909, 45134, 62397, 21143, 23508, 3609, 27089, 26158, 10026, 60999, 39251, 64163, 11704, 12710}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12, objArr);
        msg_err_usim_lgu_common_key_over = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        d(new char[]{13419, 669, 52207, 55676, 3052, 24135, 29243, 6754, 44909, 45134, 52350, 35756, 39251, 64163, 11704, 12710}, (ViewConfiguration.getPressedStateDuration() >> 16) + 15, objArr2);
        msg_err_usim_lgu_common_key = ((String) objArr2[0]).intern();
        int i = asInterface + 117;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    static void onWarmupCompleted() {
        onNavigationEvent = (char) 43145;
        onExtraCallback = (char) 51594;
        onExtraCallbackWithResult = (char) 18664;
        IAuthTabCallback = (char) 42607;
    }
}
