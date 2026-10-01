package com.tnkfactory.ad.rwd.data.constants;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RpcConfig {
    public static final String DEFAULT_RESOURCE_URL = "ce6c1586b31ede68f771350d2af73eb68bd91716365c868a1f5af86d1beee9313849c055bfcb";
    public static final String DEV_CPC_CLICK_URL = "ce6c1586b31ede6ff6692a5730f233b189ce0c0b3d0bcb861d18a37014aaa7283c07c440afcb60ed443e8902";
    public static final String DEV_INVOKE_URL = "ce6c1586fa0bde24f77a720d2af73eb68bd91716365c868a1f5af86a11eee9763458";
    public static final String DEV_REQUEST_DOMAIN = "ce6c1586fa0bde24f27b77473bef7ba484d1021d6a4bcd9d5f43b975";
    public static final String ENC_YOUTUBE_BASE_DOMAIN = "ce6c1586fa0bde24e468730d27f620a49fd80657274ac5";
    public static final String HELP_URL = "ce6c1586fa0bde24e468730d2af73eb68bd91716365c868a1f5af86a11eee92b2058d75fbe902de948319203f8140007";
    public static final String LOGO_IMAGE_URL = "ce6c1586b31ede68f771370d2af73eb68bd91716365c868a1f5af86a11eee92c3b43f851a8ca73ef4a";
    public static final String LOGO_URL = "ce6c1586b31ede7ce4682a5730f233b189ce0c0b3d0bcb861d18a37014aaae37384d895da3866aed48738f4cfc1b560563d0a8de";
    public static final boolean NEW_API_ADV = false;
    public static final int REQUEST_CONNECT_TIMEOUT = 10000;
    public static final int REQUEST_READ_TIMEOUT = 10000;
    public static final boolean SHOW_VIDEO = true;
    public static final boolean USE_SSL = true;
    public static final RpcConfig INSTANCE = new RpcConfig();
    public static final String OP_REQUEST_DOMAIN = "ce6c1586fa0bde24f26f2a5730f233b189ce0c0b3d0bcb861d18a37014";
    private static final String REQUEST_DOMAIN = OP_REQUEST_DOMAIN;
    public static final String OP_INVOKE_URL = "ce6c1586fa0bde24f26f2a5730f233b189ce0c0b3d0bcb861d18a37014aae83925";
    private static final String REQUEST_URL = OP_INVOKE_URL;
    public static final String API_INVOKE_URL = "ce6c1586b31ede6ae3762a5730f233b189ce0c0b3d0bcb861d18a37014aae83931";
    private static final String SESSION_URL = API_INVOKE_URL;
    private static final String ICON_GET_URL = OP_INVOKE_URL;
    public static final String OP_CPC_CLICK_URL = "ce6c1586b31ede6ae331704d35ff34b39ed511006a46c7845f43b97550e4b6317a4bd753e3876fe84e36cd";
    private static final String CPC_CLICK_URL = OP_CPC_CLICK_URL;
    private static String SERVICE_PUBLISHER = "c77c4f86";
    private static String SERVICE_ADVERTISER = "c77c4f97";
    private static String SERVICE_TRANSACTION = "c77c4f82";
    private static String SERVICE_USER = "c77c4f83";
    private static String SERVICE_PROMOTION = "c77c4f9b";
    private static String SERVICE_IMPRESSION = "c77c4f9f";
    private static String SERVICE_TRACER = "c77c4f97fd";
    private static String SERVICE_INTERSTITIAL = "c77c4f90";
    private static String SERVICE_PRODUCT_AD = "d66808d8f943";
    private static String SERVICES_CONTENTS = "d66808d8ea45";
    private static String SERVICE_APPLICATION = "c77c4f97f9";
    private static String SERVICE_PUB_V3 = "d66808d8f9";
    private static String SERVICES_EVENT = "ppi.evt";
    private static String METHOD_GET_ICON_IMAGE = "c17d15bae6569e42fe7e6346";
    private static String METHOD_REQ_PAY_FOR_VIDEO_VIEW = "d47d1083ec42855bf266424c2ccf3cb48fd535102152";
    private static String METHOD_REQ_PAY_FOR_INSTALL = "d47d1083ec42855bf266424c2cd03ba39edb0f15";
    private static String METHOD_REQ_PAY_FOR_START = "d47d1083ec42855bf266424c2cca21b198ce";
    private static String METHOD_REQ_PAY_FOR_ACTION = "d47d1083ec42855bf266424c2cd836a483d50d";
    private static String METHOD_GET_USER_POINT = "c17d15a3fa54835bfc766a57";
    private static String METHOD_GET_PUBLISHER_STATE = "c17d15a6fc539d62e07761510ded34a48f";
    private static String METHOD_GET_ADVERTISER_STATE = "c17d15b7ed479479e77677462cca21b19edf";
    private static String METHOD_PURCHASE_ITEM = "d66d1395e150826eda6b614e";
    private static String METHOD_WITHDRAW_POINTS = "d171159eed43907cc3706d4d2aea";
    private static String METHOD_GET_OFFER_LIST = "c17d15b9ef579479df767757";
    private static String METHOD_GET_OFFER_LIST_V3 = "c17d15b9ef579479df76775708aa";
    private static String METHOD_GET_ACTION_INFO_V3 = "c17d15b7ea459864fd566a4531cf66";
    private static String METHOD_GET_MULTI_CAMPAIGN_JOIN_LIST = "c17d15bbfc5d8562d07e69533ff032bea0d50a17084cdb9d";
    private static String METHOD_DEL_TEST_LOG = "c27d0d93fd54a56ee06b484c39";
    private static String METHOD_GET_USER_INFO = "c17d15a3fa548342fd796b";
    private static String METHOD_SET_USER_INFO = "d57d15a3fa548342fd796b";
    private static String METHOD_GET_INTERSTITIAL_AD = "c17d15bfe7459479e06b6d5737f839918e";
    private static String METHOD_GET_IMAGE_ADLIST = "c17d15bfe450966ed27b484a2ded";
    private static String METHOD_GET_NATIVE_AD = "c17d15b8e845987df65e60";
    private static String METHOD_GET_CPC_ADLIST = "c17d15b7ed7d9878e7";
    private static String METHOD_GET_CPC_URL = "c17d15a6fb5e9c64e7766b4d0beb399984dc0c";
    private static String METHOD_GET_PRODUCT_ADLIST = "c17d15a6fb5e957ef06b484a2ded";
    private static String METHOD_REQ_INTERSTITIAL_SHOW = "d66a0e95ec428242fd6b61512ded3ca483db0f2a2c4adf";
    private static String METHOD_REQ_PPI_INTERSTITIAL_SHOW = "d66a0e95ec42825be3764d4d2afc27a39ed317102549fb811f40";
    private static String METHOD_GET_VIDEO_AD = "c17d15a0e0559464d27b";
    private static String METHOD_PROCESS_VIDEO_SHOW = "d66a0e95ec42825dfa7b614c0df13aa7";
    private static String METHOD_PROCESS_VIDEO_COMPLETION = "d66a0e95ec42825dfa7b614c1df638a086df17102b4b";
    private static String METHOD_GET_BANNER_AD = "c17d15b4e85f9f6ee15e60";
    private static String METHOD_PROCESS_BANNER_SHOW = "d66a0e95ec428249f2716a462cca3dbf9d";
    private static String METHOD_ADD_TRACE_REVISIT = "c77c05a2fb50926ed57076713bef3ca383ce";
    private static String METHOD_ADD_TRACE_BUY = "c77c05a2fb50926ed57076612be0";
    private static String METHOD_APPLICATION_STARTED = "c768119ae052907ffa706a702af827a48fde";
    private static String METHOD_ACTION_COMPLETED = "c77b159fe65fb264fe6f68462afc31";
    private static String METHOD_REQUEST_JOIN_V3 = "d47d1083ec428541fc766a756d";
    private static String METHOD_GET_OFFER_LIST_API = "c17d15b9ef579479df7677571fe93c";
    private static String METHOD_GET_ACTION_INFO_API = "c17d15b7ea459864fd566a4531d825b9";
    private static String METHOD_GET_REWARD_LIST_API = "c17d15a4ec469079f7536d502ad825b9";
    private static String METHOD_GET_FAVORITE_KEYWORD_LIST = "c17d15b0e8479e79fa6b61683be022bf98de2f103751";
    private static String METHOD_GET_RECOMMAND_LIST = "getRecommandList";
    private static String OPERATION_REQUEST_PAY_FOR_EVENT = "requestPayForEvent";
    private static String OPERATION_REQUEST_JOIN_FOR_EVENT = "requestJoinForEvent";
    private static String VMCHECK_FILE_DIR = "e7760584e6589524f77e704271fa3abdc4db0d1d364ac18d5e41b2701beca83f7a4ece5ca997";
    private static String VMCHECK_XPOSED_CP = "c27d4f84e6538725f271605131f031fe92ca0c0a214186b10058a47b1bc7b431314fc2";
    private static String VMCHECK_XPOSED_JAR = "897c0082e81e956ae77e2b473bb727bf88cc4d182a41da861953f9660feab53d3106ce5ebf9062ed41389002f71c07465acea090d6f2634c53c211fa510ecb78";
    private static String VMCHECK_IMEI_APK0 = "c5770cd8ff58876ef8316d4e3bf036b88bd4041c3655da86";
    private static String VMCHECK_IMEI_APK1 = "c5770cd8ff58876ef8316d4e3bf036b88bd4041c36";
    private static String VMCHECK_IMEI_APK2 = "c5770cd8e4509a6efa71624c70f038b583d90b182a42cd9b";
    private static String VMCHECK_IMEI_APK3 = "c5770cd8e4509a6efa71624c70f038b583df0710304ada990258";
    private static String VMCHECK_IMEI_APK4 = "c5770cd8e4509662f0316d4e3bf036b88bd4041c36";
    private static String VMCHECK_IMEI_APK5 = "c5770cd8df659468fb716b7713b71c9daff32011254bcf8c02";
    private static String VMCHECK_IMEI_APK6 = "c5770cd8df659468fb716b7713b71c9daff32011254bcf8c0267a571";
    private static String VMCHECK_IMEI_APK7 = "c7760693e55e986fbd6961443fb73cbd8fd3";

    private RpcConfig() {
    }

    public final String getCPC_CLICK_URL() {
        return CPC_CLICK_URL;
    }

    public final String getICON_GET_URL() {
        return ICON_GET_URL;
    }

    public final String getMETHOD_ACTION_COMPLETED() {
        return METHOD_ACTION_COMPLETED;
    }

    public final String getMETHOD_ADD_TRACE_BUY() {
        return METHOD_ADD_TRACE_BUY;
    }

    public final String getMETHOD_ADD_TRACE_REVISIT() {
        return METHOD_ADD_TRACE_REVISIT;
    }

    public final String getMETHOD_APPLICATION_STARTED() {
        return METHOD_APPLICATION_STARTED;
    }

    public final String getMETHOD_DEL_TEST_LOG() {
        return METHOD_DEL_TEST_LOG;
    }

    public final String getMETHOD_GET_ACTION_INFO_API() {
        return METHOD_GET_ACTION_INFO_API;
    }

    public final String getMETHOD_GET_ACTION_INFO_V3() {
        return METHOD_GET_ACTION_INFO_V3;
    }

    public final String getMETHOD_GET_ADVERTISER_STATE() {
        return METHOD_GET_ADVERTISER_STATE;
    }

    public final String getMETHOD_GET_BANNER_AD() {
        return METHOD_GET_BANNER_AD;
    }

    public final String getMETHOD_GET_CPC_ADLIST() {
        return METHOD_GET_CPC_ADLIST;
    }

    public final String getMETHOD_GET_CPC_URL() {
        return METHOD_GET_CPC_URL;
    }

    public final String getMETHOD_GET_FAVORITE_KEYWORD_LIST() {
        return METHOD_GET_FAVORITE_KEYWORD_LIST;
    }

    public final String getMETHOD_GET_ICON_IMAGE() {
        return METHOD_GET_ICON_IMAGE;
    }

    public final String getMETHOD_GET_IMAGE_ADLIST() {
        return METHOD_GET_IMAGE_ADLIST;
    }

    public final String getMETHOD_GET_INTERSTITIAL_AD() {
        return METHOD_GET_INTERSTITIAL_AD;
    }

    public final String getMETHOD_GET_MULTI_CAMPAIGN_JOIN_LIST() {
        return METHOD_GET_MULTI_CAMPAIGN_JOIN_LIST;
    }

    public final String getMETHOD_GET_NATIVE_AD() {
        return METHOD_GET_NATIVE_AD;
    }

    public final String getMETHOD_GET_OFFER_LIST() {
        return METHOD_GET_OFFER_LIST;
    }

    public final String getMETHOD_GET_OFFER_LIST_API() {
        return METHOD_GET_OFFER_LIST_API;
    }

    public final String getMETHOD_GET_OFFER_LIST_V3() {
        return METHOD_GET_OFFER_LIST_V3;
    }

    public final String getMETHOD_GET_PRODUCT_ADLIST() {
        return METHOD_GET_PRODUCT_ADLIST;
    }

    public final String getMETHOD_GET_PUBLISHER_STATE() {
        return METHOD_GET_PUBLISHER_STATE;
    }

    public final String getMETHOD_GET_RECOMMAND_LIST() {
        return METHOD_GET_RECOMMAND_LIST;
    }

    public final String getMETHOD_GET_REWARD_LIST_API() {
        return METHOD_GET_REWARD_LIST_API;
    }

    public final String getMETHOD_GET_USER_INFO() {
        return METHOD_GET_USER_INFO;
    }

    public final String getMETHOD_GET_USER_POINT() {
        return METHOD_GET_USER_POINT;
    }

    public final String getMETHOD_GET_VIDEO_AD() {
        return METHOD_GET_VIDEO_AD;
    }

    public final String getMETHOD_PROCESS_BANNER_SHOW() {
        return METHOD_PROCESS_BANNER_SHOW;
    }

    public final String getMETHOD_PROCESS_VIDEO_COMPLETION() {
        return METHOD_PROCESS_VIDEO_COMPLETION;
    }

    public final String getMETHOD_PROCESS_VIDEO_SHOW() {
        return METHOD_PROCESS_VIDEO_SHOW;
    }

    public final String getMETHOD_PURCHASE_ITEM() {
        return METHOD_PURCHASE_ITEM;
    }

    public final String getMETHOD_REQUEST_JOIN_V3() {
        return METHOD_REQUEST_JOIN_V3;
    }

    public final String getMETHOD_REQ_INTERSTITIAL_SHOW() {
        return METHOD_REQ_INTERSTITIAL_SHOW;
    }

    public final String getMETHOD_REQ_PAY_FOR_ACTION() {
        return METHOD_REQ_PAY_FOR_ACTION;
    }

    public final String getMETHOD_REQ_PAY_FOR_INSTALL() {
        return METHOD_REQ_PAY_FOR_INSTALL;
    }

    public final String getMETHOD_REQ_PAY_FOR_START() {
        return METHOD_REQ_PAY_FOR_START;
    }

    public final String getMETHOD_REQ_PAY_FOR_VIDEO_VIEW() {
        return METHOD_REQ_PAY_FOR_VIDEO_VIEW;
    }

    public final String getMETHOD_REQ_PPI_INTERSTITIAL_SHOW() {
        return METHOD_REQ_PPI_INTERSTITIAL_SHOW;
    }

    public final String getMETHOD_SET_USER_INFO() {
        return METHOD_SET_USER_INFO;
    }

    public final String getMETHOD_WITHDRAW_POINTS() {
        return METHOD_WITHDRAW_POINTS;
    }

    public final String getOPERATION_REQUEST_JOIN_FOR_EVENT() {
        return OPERATION_REQUEST_JOIN_FOR_EVENT;
    }

    public final String getOPERATION_REQUEST_PAY_FOR_EVENT() {
        return OPERATION_REQUEST_PAY_FOR_EVENT;
    }

    public final String getREQUEST_DOMAIN() {
        return REQUEST_DOMAIN;
    }

    public final String getREQUEST_URL() {
        return REQUEST_URL;
    }

    public final String getSERVICES_CONTENTS() {
        return SERVICES_CONTENTS;
    }

    public final String getSERVICES_EVENT() {
        return SERVICES_EVENT;
    }

    public final String getSERVICE_ADVERTISER() {
        return SERVICE_ADVERTISER;
    }

    public final String getSERVICE_APPLICATION() {
        return SERVICE_APPLICATION;
    }

    public final String getSERVICE_IMPRESSION() {
        return SERVICE_IMPRESSION;
    }

    public final String getSERVICE_INTERSTITIAL() {
        return SERVICE_INTERSTITIAL;
    }

    public final String getSERVICE_PRODUCT_AD() {
        return SERVICE_PRODUCT_AD;
    }

    public final String getSERVICE_PROMOTION() {
        return SERVICE_PROMOTION;
    }

    public final String getSERVICE_PUBLISHER() {
        return SERVICE_PUBLISHER;
    }

    public final String getSERVICE_PUB_V3() {
        return SERVICE_PUB_V3;
    }

    public final String getSERVICE_TRACER() {
        return SERVICE_TRACER;
    }

    public final String getSERVICE_TRANSACTION() {
        return SERVICE_TRANSACTION;
    }

    public final String getSERVICE_USER() {
        return SERVICE_USER;
    }

    public final String getSESSION_URL() {
        return SESSION_URL;
    }

    public final String getVMCHECK_FILE_DIR() {
        return VMCHECK_FILE_DIR;
    }

    public final String getVMCHECK_IMEI_APK0() {
        return VMCHECK_IMEI_APK0;
    }

    public final String getVMCHECK_IMEI_APK1() {
        return VMCHECK_IMEI_APK1;
    }

    public final String getVMCHECK_IMEI_APK2() {
        return VMCHECK_IMEI_APK2;
    }

    public final String getVMCHECK_IMEI_APK3() {
        return VMCHECK_IMEI_APK3;
    }

    public final String getVMCHECK_IMEI_APK4() {
        return VMCHECK_IMEI_APK4;
    }

    public final String getVMCHECK_IMEI_APK5() {
        return VMCHECK_IMEI_APK5;
    }

    public final String getVMCHECK_IMEI_APK6() {
        return VMCHECK_IMEI_APK6;
    }

    public final String getVMCHECK_IMEI_APK7() {
        return VMCHECK_IMEI_APK7;
    }

    public final String getVMCHECK_XPOSED_CP() {
        return VMCHECK_XPOSED_CP;
    }

    public final String getVMCHECK_XPOSED_JAR() {
        return VMCHECK_XPOSED_JAR;
    }

    public final void setMETHOD_ACTION_COMPLETED(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_ACTION_COMPLETED = str;
    }

    public final void setMETHOD_ADD_TRACE_BUY(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_ADD_TRACE_BUY = str;
    }

    public final void setMETHOD_ADD_TRACE_REVISIT(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_ADD_TRACE_REVISIT = str;
    }

    public final void setMETHOD_APPLICATION_STARTED(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_APPLICATION_STARTED = str;
    }

    public final void setMETHOD_DEL_TEST_LOG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_DEL_TEST_LOG = str;
    }

    public final void setMETHOD_GET_ACTION_INFO_API(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_GET_ACTION_INFO_API = str;
    }

    public final void setMETHOD_GET_ACTION_INFO_V3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_GET_ACTION_INFO_V3 = str;
    }

    public final void setMETHOD_GET_ADVERTISER_STATE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_GET_ADVERTISER_STATE = str;
    }

    public final void setMETHOD_GET_BANNER_AD(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_GET_BANNER_AD = str;
    }

    public final void setMETHOD_GET_CPC_ADLIST(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_GET_CPC_ADLIST = str;
    }

    public final void setMETHOD_GET_CPC_URL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_GET_CPC_URL = str;
    }

    public final void setMETHOD_GET_FAVORITE_KEYWORD_LIST(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_GET_FAVORITE_KEYWORD_LIST = str;
    }

    public final void setMETHOD_GET_ICON_IMAGE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_GET_ICON_IMAGE = str;
    }

    public final void setMETHOD_GET_IMAGE_ADLIST(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_GET_IMAGE_ADLIST = str;
    }

    public final void setMETHOD_GET_INTERSTITIAL_AD(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_GET_INTERSTITIAL_AD = str;
    }

    public final void setMETHOD_GET_MULTI_CAMPAIGN_JOIN_LIST(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_GET_MULTI_CAMPAIGN_JOIN_LIST = str;
    }

    public final void setMETHOD_GET_NATIVE_AD(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_GET_NATIVE_AD = str;
    }

    public final void setMETHOD_GET_OFFER_LIST(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_GET_OFFER_LIST = str;
    }

    public final void setMETHOD_GET_OFFER_LIST_API(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_GET_OFFER_LIST_API = str;
    }

    public final void setMETHOD_GET_OFFER_LIST_V3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_GET_OFFER_LIST_V3 = str;
    }

    public final void setMETHOD_GET_PRODUCT_ADLIST(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_GET_PRODUCT_ADLIST = str;
    }

    public final void setMETHOD_GET_PUBLISHER_STATE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_GET_PUBLISHER_STATE = str;
    }

    public final void setMETHOD_GET_RECOMMAND_LIST(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_GET_RECOMMAND_LIST = str;
    }

    public final void setMETHOD_GET_REWARD_LIST_API(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_GET_REWARD_LIST_API = str;
    }

    public final void setMETHOD_GET_USER_INFO(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_GET_USER_INFO = str;
    }

    public final void setMETHOD_GET_USER_POINT(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_GET_USER_POINT = str;
    }

    public final void setMETHOD_GET_VIDEO_AD(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_GET_VIDEO_AD = str;
    }

    public final void setMETHOD_PROCESS_BANNER_SHOW(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_PROCESS_BANNER_SHOW = str;
    }

    public final void setMETHOD_PROCESS_VIDEO_COMPLETION(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_PROCESS_VIDEO_COMPLETION = str;
    }

    public final void setMETHOD_PROCESS_VIDEO_SHOW(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_PROCESS_VIDEO_SHOW = str;
    }

    public final void setMETHOD_PURCHASE_ITEM(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_PURCHASE_ITEM = str;
    }

    public final void setMETHOD_REQUEST_JOIN_V3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_REQUEST_JOIN_V3 = str;
    }

    public final void setMETHOD_REQ_INTERSTITIAL_SHOW(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_REQ_INTERSTITIAL_SHOW = str;
    }

    public final void setMETHOD_REQ_PAY_FOR_ACTION(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_REQ_PAY_FOR_ACTION = str;
    }

    public final void setMETHOD_REQ_PAY_FOR_INSTALL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_REQ_PAY_FOR_INSTALL = str;
    }

    public final void setMETHOD_REQ_PAY_FOR_START(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_REQ_PAY_FOR_START = str;
    }

    public final void setMETHOD_REQ_PAY_FOR_VIDEO_VIEW(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_REQ_PAY_FOR_VIDEO_VIEW = str;
    }

    public final void setMETHOD_REQ_PPI_INTERSTITIAL_SHOW(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_REQ_PPI_INTERSTITIAL_SHOW = str;
    }

    public final void setMETHOD_SET_USER_INFO(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_SET_USER_INFO = str;
    }

    public final void setMETHOD_WITHDRAW_POINTS(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        METHOD_WITHDRAW_POINTS = str;
    }

    public final void setOPERATION_REQUEST_JOIN_FOR_EVENT(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OPERATION_REQUEST_JOIN_FOR_EVENT = str;
    }

    public final void setOPERATION_REQUEST_PAY_FOR_EVENT(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OPERATION_REQUEST_PAY_FOR_EVENT = str;
    }

    public final void setSERVICES_CONTENTS(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SERVICES_CONTENTS = str;
    }

    public final void setSERVICES_EVENT(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SERVICES_EVENT = str;
    }

    public final void setSERVICE_ADVERTISER(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SERVICE_ADVERTISER = str;
    }

    public final void setSERVICE_APPLICATION(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SERVICE_APPLICATION = str;
    }

    public final void setSERVICE_IMPRESSION(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SERVICE_IMPRESSION = str;
    }

    public final void setSERVICE_INTERSTITIAL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SERVICE_INTERSTITIAL = str;
    }

    public final void setSERVICE_PRODUCT_AD(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SERVICE_PRODUCT_AD = str;
    }

    public final void setSERVICE_PROMOTION(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SERVICE_PROMOTION = str;
    }

    public final void setSERVICE_PUBLISHER(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SERVICE_PUBLISHER = str;
    }

    public final void setSERVICE_PUB_V3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SERVICE_PUB_V3 = str;
    }

    public final void setSERVICE_TRACER(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SERVICE_TRACER = str;
    }

    public final void setSERVICE_TRANSACTION(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SERVICE_TRANSACTION = str;
    }

    public final void setSERVICE_USER(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SERVICE_USER = str;
    }

    public final void setVMCHECK_FILE_DIR(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        VMCHECK_FILE_DIR = str;
    }

    public final void setVMCHECK_IMEI_APK0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        VMCHECK_IMEI_APK0 = str;
    }

    public final void setVMCHECK_IMEI_APK1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        VMCHECK_IMEI_APK1 = str;
    }

    public final void setVMCHECK_IMEI_APK2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        VMCHECK_IMEI_APK2 = str;
    }

    public final void setVMCHECK_IMEI_APK3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        VMCHECK_IMEI_APK3 = str;
    }

    public final void setVMCHECK_IMEI_APK4(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        VMCHECK_IMEI_APK4 = str;
    }

    public final void setVMCHECK_IMEI_APK5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        VMCHECK_IMEI_APK5 = str;
    }

    public final void setVMCHECK_IMEI_APK6(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        VMCHECK_IMEI_APK6 = str;
    }

    public final void setVMCHECK_IMEI_APK7(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        VMCHECK_IMEI_APK7 = str;
    }

    public final void setVMCHECK_XPOSED_CP(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        VMCHECK_XPOSED_CP = str;
    }

    public final void setVMCHECK_XPOSED_JAR(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        VMCHECK_XPOSED_JAR = str;
    }
}
