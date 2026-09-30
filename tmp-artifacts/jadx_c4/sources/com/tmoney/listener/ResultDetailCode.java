package com.tmoney.listener;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.TmoneyMsg;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ResultDetailCode {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ ResultDetailCode[] $VALUES;
    public static final ResultDetailCode ALREADY_ISSUE;
    public static final ResultDetailCode BALANCE_OVER;
    public static final ResultDetailCode DATA;
    public static final ResultDetailCode DATA_ERROR;
    public static final ResultDetailCode ENABLE_ERROR;
    public static final ResultDetailCode EXCEPTION_ISSUE;
    public static final ResultDetailCode EXCEPTION_LIVECHECK;
    public static final ResultDetailCode EXCEPTION_SERVER;
    public static final ResultDetailCode EXCEPTION_TASK;
    private static int IAuthTabCallback = 1;
    public static final ResultDetailCode ISSUE_ERROR;
    public static final ResultDetailCode JOINED;
    public static final ResultDetailCode KT_CALL_MOCA_TSM;
    public static final ResultDetailCode KT_UFIN_CLIENT_FAIL;
    public static final ResultDetailCode KT_UFIN_CLIENT_INSTALL;
    public static final ResultDetailCode KT_UFIN_CLIENT_PROGRESS;
    public static final ResultDetailCode KT_UFIN_CLIENT_SUCCESS;
    public static final ResultDetailCode KT_UFIN_CLIENT_UPDATE;
    public static final ResultDetailCode KT_UFIN_CLIENT_WORKING;
    public static final ResultDetailCode KT_UFIN_CONN;
    public static final ResultDetailCode LGU_USIM_AGENT;
    public static final ResultDetailCode LGU_USIM_COMMONAPI;
    public static final ResultDetailCode LGU_USIM_ISSUE;
    public static final ResultDetailCode LGU_USIM_REBOOT;
    public static final ResultDetailCode LGU_USIM_SMSGW_SMSC_UNSUPPORTED;
    public static final ResultDetailCode LGU_USIM_STATE;
    public static final ResultDetailCode LGU_USIM_UNUSABLE;
    public static final ResultDetailCode LGU_USIM_UNUSABLE_FROM_SERVER;
    public static final ResultDetailCode LGU_USIM_WAITING;
    public static final ResultDetailCode LIVECHECK_LIMIT;
    public static final ResultDetailCode MEMBERSHIP_DELETE_ERROR;
    public static final ResultDetailCode MEMBERSHIP_ISSUE_ERROR;
    public static final ResultDetailCode NEED_1TH_ISSUE;
    public static final ResultDetailCode NEED_2TH_ISSUE;
    public static final ResultDetailCode NEED_ENABLE;
    public static final ResultDetailCode NEED_INIT;
    public static final ResultDetailCode NEED_INIT_PARTNERINFO;
    public static final ResultDetailCode NEED_JOIN;
    public static final ResultDetailCode NEED_LIVECHECK;
    public static final ResultDetailCode NEED_NFC_CONNECT;
    public static final ResultDetailCode NEED_REFUND;
    public static final ResultDetailCode NEED_SET_PHONE_NUMBER;
    public static final ResultDetailCode NETWORK;
    public static final ResultDetailCode NFC_TAG_ERROR;
    public static final ResultDetailCode NOREGIST_CREDITCARD;
    public static final ResultDetailCode NOT_SUPPORT_CARD;
    public static final ResultDetailCode NOT_SUPPORT_DEVICE;
    public static final ResultDetailCode NOT_SUPPORT_DEVICE_NOT_LIST;
    public static final ResultDetailCode NOT_SUPPORT_PAYMETHOD;
    public static final ResultDetailCode NOT_SUPPORT_TELECOM;
    public static final ResultDetailCode NOT_SUPPORT_TMONEY;
    public static final ResultDetailCode NOT_SUPPORT_USIM;
    public static final ResultDetailCode NOT_TARGET_USER;
    public static final ResultDetailCode NO_DATA;
    public static final ResultDetailCode OMA_AUTH_ERR_NOT_SKT_OR_MVNO_USER;
    public static final ResultDetailCode OMA_AUTH_ERR_NOT_SUPPORTED_CARRIER_API_CARD;
    public static final ResultDetailCode OMA_AUTH_ERR_OMA_API_UNSUPPORTED_OS;
    public static final ResultDetailCode OMA_AUTH_ERR_OMA_API_UNSUPPORTED_PHONE;
    public static final ResultDetailCode OMA_AUTH_ERR_OMA_API_UNSUPPORTED_SEIOAGENT_VERSION;
    public static final ResultDetailCode OMA_AUTH_FAIL;
    public static final ResultDetailCode PARSE;
    public static final ResultDetailCode PARTNER_JOIN;
    public static final ResultDetailCode PERMISSION;
    public static final ResultDetailCode SERVER;
    public static final ResultDetailCode SKT_SEIO_CONN;
    public static final ResultDetailCode SKT_SEIO_INSTALL;
    public static final ResultDetailCode SKT_SEIO_SEM_2;
    public static final ResultDetailCode SKT_SEIO_SEM_80;
    public static final ResultDetailCode SKT_SEIO_SEM_81;
    public static final ResultDetailCode SKT_SEIO_SEM_82;
    public static final ResultDetailCode SKT_SEIO_SEM_83;
    public static final ResultDetailCode SKT_SEIO_SEM_84;
    public static final ResultDetailCode SKT_SEIO_SEM_85;
    public static final ResultDetailCode SKT_SEIO_SEM_86;
    public static final ResultDetailCode SKT_SEIO_SEM_REBOOT;
    public static final ResultDetailCode SKT_SEIO_SEM_UNKNOWN;
    public static final ResultDetailCode SKT_SEIO_UPDATE;
    public static final ResultDetailCode SKT_UCP_983;
    public static final ResultDetailCode SKT_UCP_994;
    public static final ResultDetailCode TIMEOUT;
    public static final ResultDetailCode TPO_LIMIT;
    public static final ResultDetailCode TPO_NO_SEND_DATA;
    public static final ResultDetailCode UNKNOWN;
    public static final ResultDetailCode UNKNOWN_DEVICE_IFNO;
    public static final ResultDetailCode UNREGIST_CREDITCARD;
    public static final ResultDetailCode USER_USE_CHANGE_PHNOE;
    public static final ResultDetailCode USER_USE_LIMIT;
    public static final ResultDetailCode USER_USE_LIMIT2;
    public static final ResultDetailCode USER_USE_LOST_DISABLE;
    public static final ResultDetailCode USER_USE_POOR_USIM;
    public static final ResultDetailCode USER_USE_POSTPAID_LONGTIME_NOUSE_DISABLE;
    public static final ResultDetailCode USIM_AMOUNT_ERROR;
    public static final ResultDetailCode USIM_BALANCE;
    public static final ResultDetailCode USIM_CHANGED;
    public static final ResultDetailCode USIM_CHANNEL;
    public static final ResultDetailCode USIM_CREATE;
    public static final ResultDetailCode USIM_EXCEPTION;
    public static final ResultDetailCode USIM_INIT_LOAD;
    public static final ResultDetailCode USIM_INIT_PARAM;
    public static final ResultDetailCode USIM_INIT_PURCHASE;
    public static final ResultDetailCode USIM_INIT_REFUND;
    public static final ResultDetailCode USIM_INIT_UNLOAD;
    public static final ResultDetailCode USIM_LOAD;
    public static final ResultDetailCode USIM_PURCHASE;
    public static final ResultDetailCode USIM_PURSE;
    public static final ResultDetailCode USIM_SEL;
    public static final ResultDetailCode USIM_TIMEOUT;
    public static final ResultDetailCode USIM_UNLOAD;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int[] onWarmupCompleted;
    private int m_code;
    private String m_msg;

    private static /* synthetic */ ResultDetailCode[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        ResultDetailCode[] resultDetailCodeArr = {OMA_AUTH_FAIL, OMA_AUTH_ERR_NOT_SUPPORTED_CARRIER_API_CARD, OMA_AUTH_ERR_NOT_SKT_OR_MVNO_USER, OMA_AUTH_ERR_OMA_API_UNSUPPORTED_OS, OMA_AUTH_ERR_OMA_API_UNSUPPORTED_SEIOAGENT_VERSION, OMA_AUTH_ERR_OMA_API_UNSUPPORTED_PHONE, TIMEOUT, SERVER, NETWORK, PARSE, DATA, BALANCE_OVER, DATA_ERROR, ISSUE_ERROR, MEMBERSHIP_ISSUE_ERROR, MEMBERSHIP_DELETE_ERROR, ALREADY_ISSUE, JOINED, ENABLE_ERROR, KT_CALL_MOCA_TSM, KT_UFIN_CLIENT_INSTALL, KT_UFIN_CLIENT_UPDATE, KT_UFIN_CONN, KT_UFIN_CLIENT_PROGRESS, KT_UFIN_CLIENT_WORKING, KT_UFIN_CLIENT_SUCCESS, KT_UFIN_CLIENT_FAIL, LGU_USIM_AGENT, LGU_USIM_ISSUE, LGU_USIM_STATE, LGU_USIM_REBOOT, LGU_USIM_WAITING, LGU_USIM_COMMONAPI, LGU_USIM_UNUSABLE, LGU_USIM_UNUSABLE_FROM_SERVER, LGU_USIM_SMSGW_SMSC_UNSUPPORTED, LIVECHECK_LIMIT, NEED_1TH_ISSUE, NEED_2TH_ISSUE, NEED_INIT, NEED_INIT_PARTNERINFO, NEED_ENABLE, NEED_JOIN, NEED_SET_PHONE_NUMBER, NEED_LIVECHECK, NEED_REFUND, NEED_NFC_CONNECT, NOREGIST_CREDITCARD, NO_DATA, NOT_SUPPORT_DEVICE, NOT_SUPPORT_DEVICE_NOT_LIST, NOT_SUPPORT_PAYMETHOD, NOT_SUPPORT_TELECOM, NOT_SUPPORT_TMONEY, NOT_SUPPORT_USIM, NOT_TARGET_USER, PARTNER_JOIN, PERMISSION, NOT_SUPPORT_CARD, SKT_SEIO_CONN, SKT_SEIO_INSTALL, SKT_SEIO_UPDATE, SKT_SEIO_SEM_2, SKT_SEIO_SEM_80, SKT_SEIO_SEM_81, SKT_SEIO_SEM_82, SKT_SEIO_SEM_83, SKT_SEIO_SEM_84, SKT_SEIO_SEM_85, SKT_SEIO_SEM_86, SKT_SEIO_SEM_REBOOT, SKT_SEIO_SEM_UNKNOWN, SKT_UCP_983, SKT_UCP_994, TPO_NO_SEND_DATA, TPO_LIMIT, UNKNOWN_DEVICE_IFNO, UNREGIST_CREDITCARD, USER_USE_LOST_DISABLE, USER_USE_POSTPAID_LONGTIME_NOUSE_DISABLE, USER_USE_CHANGE_PHNOE, USER_USE_LIMIT, USER_USE_LIMIT2, USER_USE_POOR_USIM, USIM_AMOUNT_ERROR, USIM_BALANCE, USIM_CHANNEL, USIM_CREATE, USIM_INIT_LOAD, USIM_INIT_UNLOAD, USIM_INIT_PARAM, USIM_INIT_PURCHASE, USIM_INIT_REFUND, USIM_LOAD, USIM_UNLOAD, USIM_PURCHASE, USIM_SEL, USIM_PURSE, USIM_EXCEPTION, USIM_TIMEOUT, USIM_CHANGED, NFC_TAG_ERROR, EXCEPTION_ISSUE, EXCEPTION_LIVECHECK, EXCEPTION_TASK, EXCEPTION_SERVER, UNKNOWN};
        int i5 = i3 + 67;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return resultDetailCodeArr;
    }

    static {
        onExtraCallback();
        OMA_AUTH_FAIL = new ResultDetailCode("OMA_AUTH_FAIL", 0, 800, TmoneyMsg.msg_err_oma_auth_fail);
        OMA_AUTH_ERR_NOT_SUPPORTED_CARRIER_API_CARD = new ResultDetailCode("OMA_AUTH_ERR_NOT_SUPPORTED_CARRIER_API_CARD", 1, 802, TmoneyMsg.msg_err_oma_not_supported_carrier_card);
        OMA_AUTH_ERR_NOT_SKT_OR_MVNO_USER = new ResultDetailCode("OMA_AUTH_ERR_NOT_SKT_OR_MVNO_USER", 2, 803, TmoneyMsg.msg_err_oma_skt_or_mvno_user);
        OMA_AUTH_ERR_OMA_API_UNSUPPORTED_OS = new ResultDetailCode("OMA_AUTH_ERR_OMA_API_UNSUPPORTED_OS", 3, 804, TmoneyMsg.msg_err_oma_unsupported_os);
        OMA_AUTH_ERR_OMA_API_UNSUPPORTED_SEIOAGENT_VERSION = new ResultDetailCode("OMA_AUTH_ERR_OMA_API_UNSUPPORTED_SEIOAGENT_VERSION", 4, 805, TmoneyMsg.msg_err_oma_unsupported_seioagent_version);
        OMA_AUTH_ERR_OMA_API_UNSUPPORTED_PHONE = new ResultDetailCode("OMA_AUTH_ERR_OMA_API_UNSUPPORTED_PHONE", 5, 806, TmoneyMsg.msg_err_oma_unsupported_phone);
        TIMEOUT = new ResultDetailCode("TIMEOUT", 6, -2, TmoneyMsg.msg_err_service);
        SERVER = new ResultDetailCode("SERVER", 7, -3, TmoneyMsg.msg_err_service);
        NETWORK = new ResultDetailCode("NETWORK", 8, -4, TmoneyMsg.msg_err_network_service);
        PARSE = new ResultDetailCode("PARSE", 9, -5, TmoneyMsg.msg_err_service);
        DATA = new ResultDetailCode("DATA", 10, -6, TmoneyMsg.msg_err_service);
        BALANCE_OVER = new ResultDetailCode("BALANCE_OVER", 11, 610, TmoneyMsg.msg_err_balnace_over);
        DATA_ERROR = new ResultDetailCode("DATA_ERROR", 12, 400, TmoneyMsg.msg_err_data_error);
        ISSUE_ERROR = new ResultDetailCode("ISSUE_ERROR", 13, 990, TmoneyMsg.msg_err_issue);
        MEMBERSHIP_ISSUE_ERROR = new ResultDetailCode("MEMBERSHIP_ISSUE_ERROR", 14, 403, TmoneyMsg.msg_err_membership_issue);
        MEMBERSHIP_DELETE_ERROR = new ResultDetailCode("MEMBERSHIP_DELETE_ERROR", 15, 404, TmoneyMsg.msg_err_membership_delete);
        ALREADY_ISSUE = new ResultDetailCode("ALREADY_ISSUE", 16, 405, TmoneyMsg.msg_err_already_issue);
        JOINED = new ResultDetailCode("JOINED", 17, 401, TmoneyMsg.msg_err_joined);
        ENABLE_ERROR = new ResultDetailCode("ENABLE_ERROR", 18, 730, TmoneyMsg.msg_err_enable_error);
        KT_CALL_MOCA_TSM = new ResultDetailCode("KT_CALL_MOCA_TSM", 19, 510, TmoneyMsg.msg_usim_error_con);
        KT_UFIN_CLIENT_INSTALL = new ResultDetailCode("KT_UFIN_CLIENT_INSTALL", 20, 511, TmoneyMsg.msg_err_kt_ufin_client_install);
        KT_UFIN_CLIENT_UPDATE = new ResultDetailCode("KT_UFIN_CLIENT_UPDATE", 21, 512, TmoneyMsg.msg_err_kt_ufin_client_update);
        KT_UFIN_CONN = new ResultDetailCode("KT_UFIN_CONN", 22, 513, TmoneyMsg.msg_usim_error_con);
        KT_UFIN_CLIENT_PROGRESS = new ResultDetailCode("KT_UFIN_CLIENT_PROGRESS", 23, 537, TmoneyMsg.msg_err_usim_progress);
        KT_UFIN_CLIENT_WORKING = new ResultDetailCode("KT_UFIN_CLIENT_WORKING", 24, 538, TmoneyMsg.msg_err_usim_progress);
        KT_UFIN_CLIENT_SUCCESS = new ResultDetailCode("KT_UFIN_CLIENT_SUCCESS", 25, 539, TmoneyMsg.msg_err_kt_ufin_client_success);
        KT_UFIN_CLIENT_FAIL = new ResultDetailCode("KT_UFIN_CLIENT_FAIL", 26, 540, TmoneyMsg.msg_err_kt_ufin_client_fail);
        LGU_USIM_AGENT = new ResultDetailCode("LGU_USIM_AGENT", 27, 531, TmoneyMsg.msg_err_lgu_usim_agent);
        LGU_USIM_ISSUE = new ResultDetailCode("LGU_USIM_ISSUE", 28, 532, TmoneyMsg.msg_usim_error_con);
        LGU_USIM_STATE = new ResultDetailCode("LGU_USIM_STATE", 29, 533, TmoneyMsg.msg_usim_error_con);
        LGU_USIM_REBOOT = new ResultDetailCode("LGU_USIM_REBOOT", 30, 534, TmoneyMsg.msg_err_usim_lgu_reboot);
        LGU_USIM_WAITING = new ResultDetailCode("LGU_USIM_WAITING", 31, 535, TmoneyMsg.msg_err_usim_progress);
        LGU_USIM_COMMONAPI = new ResultDetailCode("LGU_USIM_COMMONAPI", 32, 536, TmoneyMsg.msg_usim_error_con);
        LGU_USIM_UNUSABLE = new ResultDetailCode("LGU_USIM_UNUSABLE", 33, 542, TmoneyMsg.msg_err_usim_lgu_unusable);
        LGU_USIM_UNUSABLE_FROM_SERVER = new ResultDetailCode("LGU_USIM_UNUSABLE_FROM_SERVER", 34, 544, TmoneyMsg.msg_err_usim_lgu_unusable_from_server);
        LGU_USIM_SMSGW_SMSC_UNSUPPORTED = new ResultDetailCode("LGU_USIM_SMSGW_SMSC_UNSUPPORTED", 35, 545, TmoneyMsg.msg_err_lgu_usim_smsgw_smsc_unsupported);
        LIVECHECK_LIMIT = new ResultDetailCode("LIVECHECK_LIMIT", 36, 410, TmoneyMsg.msg_livecheck_limit);
        NEED_1TH_ISSUE = new ResultDetailCode("NEED_1TH_ISSUE", 37, 412, TmoneyMsg.msg_err_need_1th_issue);
        NEED_2TH_ISSUE = new ResultDetailCode("NEED_2TH_ISSUE", 38, 413, TmoneyMsg.msg_err_need_2th_issue);
        NEED_INIT = new ResultDetailCode("NEED_INIT", 39, 414, TmoneyMsg.msg_err_need_init);
        NEED_INIT_PARTNERINFO = new ResultDetailCode("NEED_INIT_PARTNERINFO", 40, 417, TmoneyMsg.msg_err_need_init_partner_info);
        NEED_ENABLE = new ResultDetailCode("NEED_ENABLE", 41, 415, TmoneyMsg.msg_err_need_enable);
        NEED_JOIN = new ResultDetailCode("NEED_JOIN", 42, 416, TmoneyMsg.msg_err_tmoney_need_join);
        NEED_SET_PHONE_NUMBER = new ResultDetailCode("NEED_SET_PHONE_NUMBER", 43, 423, "전화번호 필요");
        NEED_LIVECHECK = new ResultDetailCode("NEED_LIVECHECK", 44, 499, TmoneyMsg.msg_need_livecheck);
        NEED_REFUND = new ResultDetailCode("NEED_REFUND", 45, 731, TmoneyMsg.msg_err_need_refund);
        NEED_NFC_CONNECT = new ResultDetailCode("NEED_NFC_CONNECT", 46, 422, TmoneyMsg.msg_err_need_nfc_connect);
        NOREGIST_CREDITCARD = new ResultDetailCode("NOREGIST_CREDITCARD", 47, 420, TmoneyMsg.msg_err_noregist_creditcard);
        NO_DATA = new ResultDetailCode("NO_DATA", 48, 421, TmoneyMsg.msg_err_no_data);
        NOT_SUPPORT_DEVICE = new ResultDetailCode("NOT_SUPPORT_DEVICE", 49, 430, TmoneyMsg.msg_err_not_support_device);
        NOT_SUPPORT_DEVICE_NOT_LIST = new ResultDetailCode("NOT_SUPPORT_DEVICE_NOT_LIST", 50, 431, TmoneyMsg.msg_err_not_support_device);
        NOT_SUPPORT_PAYMETHOD = new ResultDetailCode("NOT_SUPPORT_PAYMETHOD", 51, 433, TmoneyMsg.msg_not_support_paymethod);
        NOT_SUPPORT_TELECOM = new ResultDetailCode("NOT_SUPPORT_TELECOM", 52, 434, TmoneyMsg.msg_not_support_tel);
        NOT_SUPPORT_TMONEY = new ResultDetailCode("NOT_SUPPORT_TMONEY", 53, 435, TmoneyMsg.msg_not_support_usim);
        NOT_SUPPORT_USIM = new ResultDetailCode("NOT_SUPPORT_USIM", 54, 436, TmoneyMsg.msg_not_support_usim);
        NOT_TARGET_USER = new ResultDetailCode("NOT_TARGET_USER", 55, 437, TmoneyMsg.msg_err_not_target_user);
        PARTNER_JOIN = new ResultDetailCode("PARTNER_JOIN", 56, 438, TmoneyMsg.msg_err_partner_join);
        PERMISSION = new ResultDetailCode("PERMISSION", 57, 440, TmoneyMsg.msg_err_permission);
        NOT_SUPPORT_CARD = new ResultDetailCode("NOT_SUPPORT_CARD", 58, 441, TmoneyMsg.msg_err_not_support_card);
        SKT_SEIO_CONN = new ResultDetailCode("SKT_SEIO_CONN", 59, 521, TmoneyMsg.msg_usim_error_con);
        SKT_SEIO_INSTALL = new ResultDetailCode("SKT_SEIO_INSTALL", 60, 522, TmoneyMsg.msg_err_skt_seio_install);
        SKT_SEIO_UPDATE = new ResultDetailCode("SKT_SEIO_UPDATE", 61, 523, TmoneyMsg.msg_err_skt_seio_update);
        SKT_SEIO_SEM_2 = new ResultDetailCode("SKT_SEIO_SEM_2", 62, 524, TmoneyMsg.msg_err_seio_sem_2);
        SKT_SEIO_SEM_80 = new ResultDetailCode("SKT_SEIO_SEM_80", 63, 547, TmoneyMsg.msg_err_skt_seio_sem_unknown);
        SKT_SEIO_SEM_81 = new ResultDetailCode("SKT_SEIO_SEM_81", 64, 525, TmoneyMsg.msg_err_skt_seio_sem_81);
        SKT_SEIO_SEM_82 = new ResultDetailCode("SKT_SEIO_SEM_82", 65, 526, TmoneyMsg.msg_err_skt_seio_sem_82);
        SKT_SEIO_SEM_83 = new ResultDetailCode("SKT_SEIO_SEM_83", 66, 527, TmoneyMsg.msg_errskt_seio_sem_setting);
        SKT_SEIO_SEM_84 = new ResultDetailCode("SKT_SEIO_SEM_84", 67, 528, TmoneyMsg.msg_errskt_seio_sem_setting);
        SKT_SEIO_SEM_85 = new ResultDetailCode("SKT_SEIO_SEM_85", 68, 529, TmoneyMsg.msg_err_skt_seio_sem_85);
        SKT_SEIO_SEM_86 = new ResultDetailCode("SKT_SEIO_SEM_86", 69, 541, TmoneyMsg.msg_errskt_seio_sem_setting);
        SKT_SEIO_SEM_REBOOT = new ResultDetailCode("SKT_SEIO_SEM_REBOOT", 70, 530, TmoneyMsg.msg_err_skt_seio_sem_unknown);
        SKT_SEIO_SEM_UNKNOWN = new ResultDetailCode("SKT_SEIO_SEM_UNKNOWN", 71, 546, TmoneyMsg.msg_err_skt_seio_sem_unknown);
        SKT_UCP_983 = new ResultDetailCode("SKT_UCP_983", 72, 551, TmoneyMsg.msg_err_skt_ucp_983);
        SKT_UCP_994 = new ResultDetailCode("SKT_UCP_994", 73, 552, TmoneyMsg.msg_err_skt_ucp_994);
        TPO_NO_SEND_DATA = new ResultDetailCode("TPO_NO_SEND_DATA", 74, 450, TmoneyMsg.msg_tpo_no_send_data);
        TPO_LIMIT = new ResultDetailCode("TPO_LIMIT", 75, 451, TmoneyMsg.msg_tpo_lilmit);
        UNKNOWN_DEVICE_IFNO = new ResultDetailCode("UNKNOWN_DEVICE_IFNO", 76, 452, TmoneyMsg.msg_err_unknown_device_info);
        UNREGIST_CREDITCARD = new ResultDetailCode("UNREGIST_CREDITCARD", 77, 453, TmoneyMsg.msg_err_unregist_creditcard);
        USER_USE_LOST_DISABLE = new ResultDetailCode("USER_USE_LOST_DISABLE", 78, 454, TmoneyMsg.msg_err_user_use_lost_disable);
        USER_USE_POSTPAID_LONGTIME_NOUSE_DISABLE = new ResultDetailCode("USER_USE_POSTPAID_LONGTIME_NOUSE_DISABLE", 79, 455, TmoneyMsg.msg_err_user_postpaid_longtime_nouse_disable);
        USER_USE_CHANGE_PHNOE = new ResultDetailCode("USER_USE_CHANGE_PHNOE", 80, 456, TmoneyMsg.msg_user_use_change_phone);
        USER_USE_LIMIT = new ResultDetailCode("USER_USE_LIMIT", 81, 457, TmoneyMsg.msg_user_use_limit);
        USER_USE_LIMIT2 = new ResultDetailCode("USER_USE_LIMIT2", 82, 458, TmoneyMsg.msg_user_use_limit2);
        USER_USE_POOR_USIM = new ResultDetailCode("USER_USE_POOR_USIM", 83, 459, TmoneyMsg.msg_user_use_poor_usim);
        USIM_AMOUNT_ERROR = new ResultDetailCode("USIM_AMOUNT_ERROR", 84, 700, TmoneyMsg.msg_err_usim_amount);
        USIM_BALANCE = new ResultDetailCode("USIM_BALANCE", 85, 701, TmoneyMsg.msg_usim_error_sel);
        USIM_CHANNEL = new ResultDetailCode("USIM_CHANNEL", 86, 702, TmoneyMsg.msg_usim_error_sel);
        USIM_CREATE = new ResultDetailCode("USIM_CREATE", 87, 703, TmoneyMsg.msg_usim_error_con);
        USIM_INIT_LOAD = new ResultDetailCode("USIM_INIT_LOAD", 88, 704, TmoneyMsg.msg_usim_error_sel);
        USIM_INIT_UNLOAD = new ResultDetailCode("USIM_INIT_UNLOAD", 89, 705, TmoneyMsg.msg_usim_error_sel);
        USIM_INIT_PARAM = new ResultDetailCode("USIM_INIT_PARAM", 90, 706, TmoneyMsg.msg_usim_error_sel);
        USIM_INIT_PURCHASE = new ResultDetailCode("USIM_INIT_PURCHASE", 91, 707, TmoneyMsg.msg_usim_error_sel);
        USIM_INIT_REFUND = new ResultDetailCode("USIM_INIT_REFUND", 92, 708, TmoneyMsg.msg_usim_error_sel);
        USIM_LOAD = new ResultDetailCode("USIM_LOAD", 93, 709, TmoneyMsg.msg_usim_error_sel);
        USIM_UNLOAD = new ResultDetailCode("USIM_UNLOAD", 94, 710, TmoneyMsg.msg_usim_error_sel);
        USIM_PURCHASE = new ResultDetailCode("USIM_PURCHASE", 95, 715, TmoneyMsg.msg_usim_error_sel);
        USIM_SEL = new ResultDetailCode("USIM_SEL", 96, 711, TmoneyMsg.msg_usim_error_sel);
        USIM_PURSE = new ResultDetailCode("USIM_PURSE", 97, 716, TmoneyMsg.msg_usim_error_sel);
        USIM_EXCEPTION = new ResultDetailCode("USIM_EXCEPTION", 98, 712, "");
        USIM_TIMEOUT = new ResultDetailCode("USIM_TIMEOUT", 99, 713, "");
        USIM_CHANGED = new ResultDetailCode("USIM_CHANGED", 100, 714, TmoneyMsg.msg_err_usim_changed);
        NFC_TAG_ERROR = new ResultDetailCode("NFC_TAG_ERROR", 101, 777, TmoneyMsg.msg_nfc_error_sel);
        EXCEPTION_ISSUE = new ResultDetailCode("EXCEPTION_ISSUE", 102, 994, TmoneyMsg.msg_err_issue);
        EXCEPTION_LIVECHECK = new ResultDetailCode("EXCEPTION_LIVECHECK", 103, 991, TmoneyMsg.msg_err_callback_unknown);
        EXCEPTION_TASK = new ResultDetailCode("EXCEPTION_TASK", 104, 992, TmoneyMsg.msg_err_callback_unknown);
        EXCEPTION_SERVER = new ResultDetailCode("EXCEPTION_SERVER", 105, 993, TmoneyMsg.msg_err_callback_unknown);
        Object[] objArr = new Object[1];
        a(new int[]{-1001914036, 748866918, -1877568297, 960236649}, 6 - TextUtils.lastIndexOf("", '0', 0, 0), objArr);
        UNKNOWN = new ResultDetailCode(((String) objArr[0]).intern(), 106, -899, TmoneyMsg.msg_err_callback_unknown);
        $VALUES = $values();
        int i = IAuthTabCallback + 71;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 23 / 0;
        }
    }

    private ResultDetailCode(String str, int i, int i2, String str2) {
        this.m_code = i2;
        this.m_msg = str2;
    }

    public static ResultDetailCode getDetailCode(int i) {
        int i2 = 2 % 2;
        ResultDetailCode resultDetailCode = UNKNOWN;
        if (i == -40 || i == -2) {
            return SKT_SEIO_SEM_2;
        }
        int i3 = onNavigationEvent + 37;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        switch (i) {
            case -85:
                return SKT_SEIO_SEM_85;
            case -84:
                return SKT_SEIO_SEM_84;
            case -83:
                return SKT_SEIO_SEM_83;
            case -82:
                ResultDetailCode resultDetailCode2 = SKT_SEIO_SEM_82;
                int i6 = i4 + 109;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    return resultDetailCode2;
                }
                throw null;
            case -81:
                return SKT_SEIO_SEM_81;
            default:
                return resultDetailCode;
        }
    }

    public static ResultDetailCode valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ResultDetailCode resultDetailCode = (ResultDetailCode) Enum.valueOf(ResultDetailCode.class, str);
        if (i3 != 0) {
            return resultDetailCode;
        }
        throw null;
    }

    public static ResultDetailCode[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        ResultDetailCode[] resultDetailCodeArr = (ResultDetailCode[]) $VALUES.clone();
        int i3 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return resultDetailCodeArr;
    }

    public final int getCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = this.m_code;
        int i6 = i3 + 65;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getCodeString() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String strValueOf = String.valueOf(this.m_code);
        int i4 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return strValueOf;
    }

    public final String getMessage() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.m_msg;
        int i5 = i3 + 81;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onWarmupCompleted;
        int i4 = -1469660336;
        float f = 0.0f;
        int i5 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i6 = 0;
            while (i6 < length2) {
                int i7 = $11 + 37;
                $10 = i7 % 128;
                if (i7 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), 72 - KeyEvent.getDeadChar(0, 0), 8848 - Color.green(0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr4[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr3[i6])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 72, 8847 - TextUtils.indexOf((CharSequence) "", '0', 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i6] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i6++;
                }
                i2 = 2;
                f = 0.0f;
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = onWarmupCompleted;
        if (iArr6 != null) {
            int i8 = $10 + 75;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 61;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    Object[] objArr4 = new Object[1];
                    objArr4[i5] = Integer.valueOf(iArr6[i9]);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(i5, i5), View.MeasureSpec.makeMeasureSpec(i5, i5) + 72, 8848 - (TypedValue.complexToFraction(i5, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i5, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i9] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                } else {
                    Object[] objArr5 = {Integer.valueOf(iArr6[i9])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 71 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), Color.alpha(0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i9] = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    i9++;
                }
                i4 = -1469660336;
                i5 = 0;
            }
            iArr6 = iArr2;
        }
        int i11 = i5;
        System.arraycopy(iArr6, i11, iArr5, i11, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i11;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i11] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                int i14 = $11 + 93;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i12];
                    Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), View.resolveSize(0, 0) + 39, View.MeasureSpec.getMode(0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i12 += 88;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i12];
                    Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback6 == null) {
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - Drawable.resolveOpacity(0, 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 39, (ViewConfiguration.getTouchSlop() >> 8) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback6).invoke(null, objArr7)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i12++;
                }
            }
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr8 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback7 == null) {
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (ViewConfiguration.getPressedStateDuration() >> 16)), 78 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7397, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
            i11 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallback() {
        onWarmupCompleted = new int[]{1927729830, -560691573, -412657769, 834293087, -2057549317, 428145386, 1691169004, -960542912, -1811419243, -946490664, 1192130822, 1806682815, -1069093028, -670456033, 649032944, -2137894566, 178236086, -1278915556};
    }
}
