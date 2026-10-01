package com.tnkfactory.ad.rwd.api;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.log.ApiLog;
import com.tnkfactory.ad.Logger;
import com.tnkfactory.ad.ServiceCallback;
import com.tnkfactory.ad.TnkAdConfig;
import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.TnkSession;
import com.tnkfactory.ad.f.a;
import com.tnkfactory.ad.f.b;
import com.tnkfactory.ad.f.c;
import com.tnkfactory.ad.f.d;
import com.tnkfactory.ad.f.f;
import com.tnkfactory.ad.rwd.AdidManager;
import com.tnkfactory.ad.rwd.PacketService;
import com.tnkfactory.ad.rwd.ReferrerUtil;
import com.tnkfactory.ad.rwd.Settings;
import com.tnkfactory.ad.rwd.TnkCore;
import com.tnkfactory.ad.rwd.Utils;
import com.tnkfactory.ad.rwd.api.ServiceTask$;
import com.tnkfactory.ad.rwd.data.ResultState;
import com.tnkfactory.ad.rwd.data.SessionInfo;
import com.tnkfactory.ad.rwd.data.constants.RpcConfig;
import com.tnkfactory.framework.vo.ValueObject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ServiceTask extends PacketService {
    public final Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceTask(@NotNull Context context, @NotNull SessionInfo sessionInfo, boolean z) {
        super(sessionInfo, z);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(sessionInfo, "");
        this.d = context;
    }

    public static final void a(ServiceTask serviceTask, Context context, String str, int i2) {
        new d(serviceTask, context, str).start();
    }

    public static final void b(ServiceCallback serviceCallback, Context context, ResultState resultState) {
        if (serviceCallback != null) {
            serviceCallback.onError(context, ((ResultState.Error) resultState).getE());
        }
    }

    public static /* synthetic */ ResultState getActionInfoV3$default(ServiceTask serviceTask, long j, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        return serviceTask.getActionInfoV3(j, i2, z);
    }

    public static /* synthetic */ ResultState getAdList$default(ServiceTask serviceTask, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 2;
        }
        return serviceTask.getAdList(i2);
    }

    public static /* synthetic */ ResultState getCPSAdList$default(ServiceTask serviceTask, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 2;
        }
        return serviceTask.getCPSAdList(i2);
    }

    public static /* synthetic */ ResultState getMultiCampaignJoinList$default(ServiceTask serviceTask, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 2;
        }
        return serviceTask.getMultiCampaignJoinList(i2);
    }

    public final void addServiceUrl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.c.put(str, str2);
    }

    public final void addTraceForBuyOnThread(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (getSessionInfo().getDoTracking()) {
            new f(this, context, str).start();
        }
    }

    public final void deleteTestLog(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        invokeAsync(context, constantsUtil.def(rpcConfig.getSERVICE_TRANSACTION()), constantsUtil.def(rpcConfig.getMETHOD_DEL_TEST_LOG()), new Object[0], null);
    }

    public final ResultState<ValueObject> getActionInfoApi(@NotNull Context context, long j, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo());
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        return PacketService.invoke$default(this, constantsUtil.def(rpcConfig.getSERVICE_PUB_V3()), constantsUtil.def(rpcConfig.getMETHOD_GET_ACTION_INFO_API()), new Object[]{Long.valueOf(j), Integer.valueOf(i2), TnkCore.INSTANCE.getSessionVO(context, getSessionInfo())}, null, 8, null);
    }

    public final ResultState<ValueObject> getActionInfoV3(long j, int i2, boolean z) {
        AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo());
        ValueObject sessionVO = TnkCore.INSTANCE.getSessionVO(this.d, getSessionInfo());
        if (z) {
            sessionVO.set("ad_type", 4);
        }
        TnkAdConfig tnkAdConfig = TnkAdConfig.INSTANCE;
        int detailViewImageType = tnkAdConfig.getDetailViewImageType();
        if (detailViewImageType > 0 && detailViewImageType < 4) {
            sessionVO.set("img_type", tnkAdConfig.getDetailViewImageType());
        }
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        return PacketService.invoke$default(this, constantsUtil.def(rpcConfig.getSERVICE_PUB_V3()), constantsUtil.def(rpcConfig.getMETHOD_GET_ACTION_INFO_V3()), new Object[]{sessionVO, Long.valueOf(j), Integer.valueOf(i2)}, null, 8, null);
    }

    public final ResultState<ValueObject> getAdList(int i2) {
        try {
            String placementId = Settings.INSTANCE.getPlacementId(this.d);
            if (Utils.isNull(AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo()))) {
                throw new NullPointerException("no adid");
            }
            ValueObject sessionVO = TnkCore.INSTANCE.getSessionVO(this.d, getSessionInfo());
            sessionVO.set("img_type", i2);
            sessionVO.set("ad_type", 1);
            return PacketService.invoke$default(this, ConstantsUtil.INSTANCE.def(RpcConfig.INSTANCE.getSERVICE_PUB_V3()), TextUtils.isEmpty(placementId) ? ConstantsUtil.INSTANCE.def(RpcConfig.INSTANCE.getMETHOD_GET_OFFER_LIST_V3()) : "getPlacementAdListV2", TextUtils.isEmpty(placementId) ? new Object[]{sessionVO} : new Object[]{sessionVO, placementId}, null, 8, null);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = ApiLog.API_LOG_STATE_ERROR;
            }
            return new ResultState.Error(new TnkError(99, message, e));
        }
    }

    public final ResultState<ValueObject> getAdListApi(@NotNull Context context, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        if (Utils.isNull(AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo()))) {
            throw new NullPointerException("no adid");
        }
        ValueObject sessionVO = TnkCore.INSTANCE.getSessionVO(context, getSessionInfo());
        sessionVO.set("ic_type", 0);
        sessionVO.set("img_type", i2);
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        return PacketService.invoke$default(this, constantsUtil.def(rpcConfig.getSERVICE_PUB_V3()), constantsUtil.def(rpcConfig.getMETHOD_GET_OFFER_LIST_API()), new Object[]{sessionVO}, null, 8, null);
    }

    public final void getAdvertiserCount(@NotNull Context context, @Nullable ServiceCallback serviceCallback) {
        Intrinsics.checkNotNullParameter(context, "");
        new Thread((Runnable) new ServiceTask$.ExternalSyntheticLambda1(this, context, serviceCallback)).start();
    }

    public final Context getApplicationContext() {
        return this.d;
    }

    public final ResultState<ValueObject> getCPSAdList(int i2) {
        try {
            if (Utils.isNull(AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo()))) {
                throw new NullPointerException("no adid");
            }
            ValueObject sessionVO = TnkCore.INSTANCE.getSessionVO(this.d, getSessionInfo());
            sessionVO.set("img_type", i2);
            sessionVO.set("ad_type", 4);
            ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
            RpcConfig rpcConfig = RpcConfig.INSTANCE;
            return PacketService.invoke$default(this, constantsUtil.def(rpcConfig.getSERVICE_PUB_V3()), constantsUtil.def(rpcConfig.getMETHOD_GET_OFFER_LIST_V3()), new Object[]{sessionVO}, null, 8, null);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = ApiLog.API_LOG_STATE_ERROR;
            }
            return new ResultState.Error(new TnkError(99, message, e));
        }
    }

    public final ResultState<ValueObject> getCpcAdList(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (Utils.isNull(AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo()))) {
            throw new NullPointerException("no adid");
        }
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        return PacketService.invoke$default(this, constantsUtil.def(rpcConfig.getSERVICE_PROMOTION()), constantsUtil.def(rpcConfig.getMETHOD_GET_CPC_ADLIST()), new Object[]{TnkCore.INSTANCE.getSessionVO(context, getSessionInfo()), Boolean.FALSE}, null, 8, null);
    }

    public final ResultState<ValueObject> getCpcUrlFeatured(@NotNull Context context, long j, int i2, int i3, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo());
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        return PacketService.invoke$default(this, constantsUtil.def(rpcConfig.getSERVICE_PROMOTION()), constantsUtil.def(rpcConfig.getMETHOD_GET_CPC_URL()), new Object[]{TnkCore.INSTANCE.getSessionVO(context, getSessionInfo()), Long.valueOf(j), Integer.valueOf(i2), Integer.valueOf(i3), str}, null, 8, null);
    }

    public final ResultState<ValueObject> getCpcUrlInfo(@NotNull Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "");
        AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo());
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        return PacketService.invoke$default(this, constantsUtil.def(rpcConfig.getSERVICE_PROMOTION()), constantsUtil.def(rpcConfig.getMETHOD_GET_CPC_URL()), new Object[]{TnkCore.INSTANCE.getSessionVO(context, getSessionInfo()), Long.valueOf(j), 0}, null, 8, null);
    }

    public final ResultState<ValueObject> getEventUrl(long j, @NotNull ValueObject valueObject) {
        Intrinsics.checkNotNullParameter(valueObject, "");
        return PacketService.invoke$default(this, "ppi.p", "pubRequestJoin", new Object[]{valueObject, Long.valueOf(j)}, null, 8, null);
    }

    public final ResultState<ValueObject> getFavoriteKeywordList(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (Utils.isNull(AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo()))) {
            throw new NullPointerException("no adid");
        }
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        return PacketService.invoke$default(this, constantsUtil.def(rpcConfig.getSERVICE_PRODUCT_AD()), constantsUtil.def(rpcConfig.getMETHOD_GET_FAVORITE_KEYWORD_LIST()), new Object[]{TnkCore.INSTANCE.getSessionVO(context, getSessionInfo())}, null, 8, null);
    }

    public final ResultState<ValueObject> getImageAdList(@NotNull Context context, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (Utils.isNull(AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo()))) {
            throw new NullPointerException("no adid");
        }
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        return PacketService.invoke$default(this, constantsUtil.def(rpcConfig.getSERVICE_INTERSTITIAL()), constantsUtil.def(rpcConfig.getMETHOD_GET_IMAGE_ADLIST()), new Object[]{TnkCore.INSTANCE.getSessionVO(context, getSessionInfo()), Integer.valueOf(i2), str}, null, 8, null);
    }

    public final ResultState<Object> getLogoImage(long j) {
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        return PacketService.invoke$default(this, constantsUtil.def(rpcConfig.getSERVICE_PUBLISHER()), constantsUtil.def(rpcConfig.getMETHOD_GET_ICON_IMAGE()), new Object[]{Long.valueOf(j)}, null, 8, null);
    }

    public final ResultState<ValueObject> getMultiCampaignJoinList(int i2) {
        if (Utils.isNull(AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo()))) {
            return new ResultState.Error(new TnkError(99, "this device adid is null", null, 4, null));
        }
        ValueObject sessionVO = TnkCore.INSTANCE.getSessionVO(this.d, getSessionInfo());
        sessionVO.set("img_type", i2);
        sessionVO.set("ad_type", 1);
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        return PacketService.invoke$default(this, constantsUtil.def(rpcConfig.getSERVICE_PUB_V3()), constantsUtil.def(rpcConfig.getMETHOD_GET_MULTI_CAMPAIGN_JOIN_LIST()), new Object[]{sessionVO}, null, 8, null);
    }

    public final ResultState<ValueObject> getNewsList() {
        if (Utils.isNull(AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo()))) {
            throw new NullPointerException("no adid");
        }
        return PacketService.invoke$default(this, ConstantsUtil.INSTANCE.def(RpcConfig.INSTANCE.getSERVICES_CONTENTS()), "getContentList", new Object[]{TnkCore.INSTANCE.getSessionVO(this.d, getSessionInfo())}, null, 8, null);
    }

    public final ResultState<ValueObject> getPlacementAdList(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo());
        return PacketService.invoke$default(this, ConstantsUtil.INSTANCE.def(RpcConfig.INSTANCE.getSERVICE_PUB_V3()), "getPlacementAdList", new Object[]{TnkCore.INSTANCE.getSessionVO(this.d, getSessionInfo()), str}, null, 8, null);
    }

    public final ResultState<ValueObject> getProductTotalPoint(@NotNull ValueObject valueObject) {
        Intrinsics.checkNotNullParameter(valueObject, "");
        return PacketService.invoke$default(this, ConstantsUtil.INSTANCE.def(RpcConfig.INSTANCE.getSERVICE_PRODUCT_AD()), "getProductTotalPoint", new Object[]{valueObject}, null, 8, null);
    }

    public final ResultState<ValueObject> getRecommandList() {
        AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo());
        return PacketService.invoke$default(this, ConstantsUtil.INSTANCE.def(RpcConfig.INSTANCE.getSERVICE_PUB_V3()), "getRecommandList", new Object[]{TnkCore.INSTANCE.getSessionVO(this.d, getSessionInfo())}, null, 8, null);
    }

    public final ResultState<ValueObject> getRewardListApi(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (Utils.isNull(AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo()))) {
            throw new NullPointerException("no adid");
        }
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        return PacketService.invoke$default(this, constantsUtil.def(rpcConfig.getSERVICE_PUB_V3()), constantsUtil.def(rpcConfig.getMETHOD_GET_REWARD_LIST_API()), new Object[]{TnkCore.INSTANCE.getSessionVO(context, getSessionInfo())}, null, 8, null);
    }

    public final ValueObject getRunVO(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ValueObject sessionVO = TnkCore.INSTANCE.getSessionVO(context, getSessionInfo());
        Settings settings = Settings.INSTANCE;
        settings.addRunCountInfo(context, sessionVO);
        settings.addReferrerInfo(context, sessionVO);
        return sessionVO;
    }

    public final ValueObject getSessionRunVO(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ValueObject sessionVO = TnkCore.INSTANCE.getSessionVO(context, getSessionInfo());
        Settings settings = Settings.INSTANCE;
        settings.addRunCountInfo(context, sessionVO);
        settings.addReferrerInfo(context, sessionVO);
        return sessionVO;
    }

    public final void getUserInfo(@NotNull Context context, @Nullable ServiceCallback serviceCallback) {
        Intrinsics.checkNotNullParameter(context, "");
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        invokeAsync(context, constantsUtil.def(rpcConfig.getSERVICE_USER()), constantsUtil.def(rpcConfig.getMETHOD_GET_USER_INFO()), new Object[0], serviceCallback);
    }

    public final void invokeAsync(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull Object[] objArr, @Nullable ServiceCallback serviceCallback) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        new Thread((Runnable) new ServiceTask$.ExternalSyntheticLambda2(this, str, str2, objArr, serviceCallback, context)).start();
    }

    public final ResultState<ValueObject> likeProduct(long j, boolean z) {
        AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo());
        return PacketService.invoke$default(this, ConstantsUtil.INSTANCE.def(RpcConfig.INSTANCE.getSERVICE_PRODUCT_AD()), z ? "likeProduct" : "cancelProduct", new Object[]{TnkCore.INSTANCE.getSessionVO(this.d, getSessionInfo()), Long.valueOf(j)}, null, 8, null);
    }

    public final void payForActionOnThread(@NotNull Context context, @NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        new a(this, context, str, str2).start();
    }

    public final int[] payForAllInstalls(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo());
        try {
            ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
            RpcConfig rpcConfig = RpcConfig.INSTANCE;
            Object objPostProcess = new b(this).postProcess(context, (ValueObject) PacketService.invoke$default(this, constantsUtil.def(rpcConfig.getSERVICE_PUBLISHER()), constantsUtil.def(rpcConfig.getMETHOD_GET_OFFER_LIST_V3()), new Object[]{TnkCore.INSTANCE.getSessionVO(context, getSessionInfo())}, null, 8, null));
            Intrinsics.checkNotNull(objPostProcess, "");
            return (int[]) objPostProcess;
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    public final void payForStartMonthlyOnThread(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        new c(this, context).start();
    }

    public final void payForStartOnThread(@NotNull final Context context, @Nullable final String str) {
        Intrinsics.checkNotNullParameter(context, "");
        ReferrerUtil.startReferrer(context, new ReferrerUtil.OnResultListener() { // from class: com.tnkfactory.ad.rwd.api.ServiceTask$$ExternalSyntheticLambda0
            @Override // com.tnkfactory.ad.rwd.ReferrerUtil.OnResultListener
            public final void onResult(int i2) {
                ServiceTask.a(this.f$0, context, str, i2);
            }
        });
    }

    public final void payForVideoView(@NotNull Context context, long j, @Nullable ServiceCallback serviceCallback) {
        Intrinsics.checkNotNullParameter(context, "");
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        invokeAsync(context, constantsUtil.def(rpcConfig.getSERVICE_PUBLISHER()), constantsUtil.def(rpcConfig.getMETHOD_REQ_PAY_FOR_VIDEO_VIEW()), new Object[]{TnkCore.INSTANCE.getSessionVO(context, getSessionInfo()), Long.valueOf(j)}, serviceCallback);
    }

    public final long[] purchaseItem(@NotNull Context context, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo());
        long[] jArr = {0, -1};
        try {
            ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
            RpcConfig rpcConfig = RpcConfig.INSTANCE;
            String strDef = constantsUtil.def(rpcConfig.getSERVICE_TRANSACTION());
            String strDef2 = constantsUtil.def(rpcConfig.getMETHOD_PURCHASE_ITEM());
            String mediaUserName = getSessionInfo().getMediaUserName();
            Intrinsics.checkNotNull(mediaUserName);
            Object objInvoke$default = PacketService.invoke$default(this, strDef, strDef2, new Object[]{Integer.valueOf(i2), str, mediaUserName}, null, 8, null);
            Intrinsics.checkNotNull(objInvoke$default, "");
            return (long[]) objInvoke$default;
        } catch (Throwable unused) {
            return jArr;
        }
    }

    public final void queryAdvertiseState(@NotNull Context context, @Nullable ServiceCallback serviceCallback) {
        Intrinsics.checkNotNullParameter(context, "");
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        invokeAsync(context, constantsUtil.def(rpcConfig.getSERVICE_ADVERTISER()), constantsUtil.def(rpcConfig.getMETHOD_GET_ADVERTISER_STATE()), new Object[0], serviceCallback);
    }

    public final int queryPoint(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo());
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        ResultState resultStateInvoke$default = PacketService.invoke$default(this, constantsUtil.def(rpcConfig.getSERVICE_TRANSACTION()), constantsUtil.def(rpcConfig.getMETHOD_GET_USER_POINT()), new Object[0], null, 8, null);
        if (!(resultStateInvoke$default instanceof ResultState.Success)) {
            return -1;
        }
        try {
            Object value = ((ResultState.Success) resultStateInvoke$default).getValue();
            Intrinsics.checkNotNull(value, "");
            return ((Integer) value).intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    public final void queryPublishState(@NotNull Context context, @Nullable ServiceCallback serviceCallback) {
        Intrinsics.checkNotNullParameter(context, "");
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        invokeAsync(context, constantsUtil.def(rpcConfig.getSERVICE_PUBLISHER()), constantsUtil.def(rpcConfig.getMETHOD_GET_PUBLISHER_STATE()), new Object[0], serviceCallback);
    }

    public final ResultState<ValueObject> reqeustPayForClick(long j, long j2, int i2) {
        AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo());
        return PacketService.invoke$default(this, ConstantsUtil.INSTANCE.def(RpcConfig.INSTANCE.getSERVICE_PUB_V3()), "requestPayForClick", new Object[]{TnkCore.INSTANCE.getSessionVO(this.d, getSessionInfo()), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i2)}, null, 8, null);
    }

    public final ResultState<ValueObject> requestJoinForEvent(long j, @NotNull ValueObject valueObject) {
        Intrinsics.checkNotNullParameter(valueObject, "");
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        return PacketService.invoke$default(this, rpcConfig.getSERVICES_EVENT(), rpcConfig.getOPERATION_REQUEST_JOIN_FOR_EVENT(), new Object[]{valueObject, Long.valueOf(j)}, null, 8, null);
    }

    public final ResultState<ValueObject> requestJoinV3(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo());
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        return PacketService.invoke$default(this, constantsUtil.def(rpcConfig.getSERVICE_PUB_V3()), constantsUtil.def(rpcConfig.getMETHOD_REQUEST_JOIN_V3()), objArr, null, 8, null);
    }

    public final ResultState<ValueObject> requestJoinV3WithBanner(long j, int i2, int i3, int i4, int i5) {
        return requestJoinV3(new Object[]{TnkCore.INSTANCE.getSessionVO(this.d, getSessionInfo()), Long.valueOf(j), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    public final ResultState<ValueObject> requestPayForAttend(long j, long j2, int i2, long j3, long j4) {
        AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo());
        ValueObject sessionVO = TnkCore.INSTANCE.getSessionVO(this.d, getSessionInfo());
        sessionVO.set("inst_dt", j3);
        sessionVO.set("attnd_dt", j4);
        return PacketService.invoke$default(this, ConstantsUtil.INSTANCE.def(RpcConfig.INSTANCE.getSERVICE_PUB_V3()), "requestPayForAttend", new Object[]{sessionVO, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i2)}, null, 8, null);
    }

    public final ResultState<ValueObject> requestPayForEvent(long j, @NotNull ValueObject valueObject) {
        Intrinsics.checkNotNullParameter(valueObject, "");
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        return PacketService.invoke$default(this, rpcConfig.getSERVICES_EVENT(), rpcConfig.getOPERATION_REQUEST_JOIN_FOR_EVENT(), new Object[]{valueObject, Long.valueOf(j)}, null, 8, null);
    }

    public final ResultState<ValueObject> requestPayForInstallV3(long j, long j2) {
        AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo());
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        return PacketService.invoke$default(this, constantsUtil.def(rpcConfig.getSERVICE_PUB_V3()), constantsUtil.def(rpcConfig.getMETHOD_REQ_PAY_FOR_INSTALL()), new Object[]{TnkCore.INSTANCE.getSessionVO(this.d, getSessionInfo()), Long.valueOf(j), Long.valueOf(j2)}, null, 8, null);
    }

    public final ResultState<ValueObject> requestPayForVideoView(@NotNull Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "");
        AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo());
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        return PacketService.invoke$default(this, constantsUtil.def(rpcConfig.getSERVICE_PUBLISHER()), constantsUtil.def(rpcConfig.getMETHOD_REQ_PAY_FOR_VIDEO_VIEW()), new Object[]{TnkCore.INSTANCE.getSessionVO(context, getSessionInfo()), Long.valueOf(j)}, null, 8, null);
    }

    public final void sendBannerImpression(@NotNull Context context, long j, int i2, int i3, int i4, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo());
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        PacketService.invoke$default(this, constantsUtil.def(rpcConfig.getSERVICE_IMPRESSION()), constantsUtil.def(rpcConfig.getMETHOD_PROCESS_BANNER_SHOW()), new Object[]{Long.valueOf(j), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str}, null, 8, null);
    }

    public final void sendCpcImpression(@NotNull Context context, long j, int i2, int i3, int i4, @NotNull String str, @NotNull String str2, int i5) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo());
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        PacketService.invoke$default(this, constantsUtil.def(rpcConfig.getSERVICE_IMPRESSION()), constantsUtil.def(rpcConfig.getMETHOD_REQ_INTERSTITIAL_SHOW()), new Object[]{Long.valueOf(j), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str, str2, Integer.valueOf(i5)}, null, 8, null);
    }

    public final void sendCpcVideoCompletion(@NotNull Context context, long j, int i2, int i3, int i4, @NotNull String str, int i5) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo());
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        PacketService.invoke$default(this, constantsUtil.def(rpcConfig.getSERVICE_IMPRESSION()), constantsUtil.def(rpcConfig.getMETHOD_PROCESS_VIDEO_COMPLETION()), new Object[]{Long.valueOf(j), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str, Integer.valueOf(i5)}, null, 8, null);
    }

    public final void sendCpcVideoStart(@NotNull Context context, long j, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(context, "");
        AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo());
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        PacketService.invoke$default(this, constantsUtil.def(rpcConfig.getSERVICE_IMPRESSION()), constantsUtil.def(rpcConfig.getMETHOD_PROCESS_VIDEO_SHOW()), new Object[]{Long.valueOf(j), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, null, 8, null);
    }

    public final void sendPpiImpression(@NotNull Context context, long j, int i2, int i3, int i4, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo());
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        PacketService.invoke$default(this, constantsUtil.def(rpcConfig.getSERVICE_INTERSTITIAL()), constantsUtil.def(rpcConfig.getMETHOD_REQ_PPI_INTERSTITIAL_SHOW()), new Object[]{Long.valueOf(j), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str}, null, 8, null);
    }

    public final void setCOPPA(int i2) {
        getSessionInfo().setCoppa(i2);
    }

    public final void setGDPR(int i2) {
        getSessionInfo().setGdpr(i2);
    }

    public final void setUserAge(int i2) {
        getSessionInfo().setUserAge(i2);
    }

    public final void setUserCat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getSessionInfo().setUserCat(str);
    }

    public final void setUserCatExt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getSessionInfo().setUserCatExt(str);
    }

    public final void setUserGender(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getSessionInfo().setUserSex(str);
    }

    public final void setUserInfo(@NotNull Context context, @NotNull String str, int i2, @NotNull String str2, @NotNull String str3, @Nullable ServiceCallback serviceCallback) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        invokeAsync(context, constantsUtil.def(rpcConfig.getSERVICE_USER()), constantsUtil.def(rpcConfig.getMETHOD_SET_USER_INFO()), new Object[]{str, Integer.valueOf(i2), str2, str3, TnkCore.INSTANCE.getSessionVO(context, getSessionInfo())}, serviceCallback);
    }

    public final void setUserName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getSessionInfo().setMediaUserName(str);
    }

    public final int withdrawPoints(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo());
        try {
            ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
            RpcConfig rpcConfig = RpcConfig.INSTANCE;
            String strDef = constantsUtil.def(rpcConfig.getSERVICE_TRANSACTION());
            String strDef2 = constantsUtil.def(rpcConfig.getMETHOD_WITHDRAW_POINTS());
            String mediaUserName = getSessionInfo().getMediaUserName();
            Intrinsics.checkNotNull(mediaUserName);
            Object objInvoke$default = PacketService.invoke$default(this, strDef, strDef2, new Object[]{str, mediaUserName}, null, 8, null);
            Intrinsics.checkNotNull(objInvoke$default, "");
            return ((Integer) objInvoke$default).intValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public final ResultState<ValueObject> requestJoinV3(long j, int i2, int i3, int i4) {
        return requestJoinV3(new Object[]{TnkCore.INSTANCE.getSessionVO(this.d, getSessionInfo()), Long.valueOf(j), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
    }

    public final void a(Context context) {
        AdidManager.INSTANCE.getAdvertisingIdThread(getSessionInfo());
        try {
            ValueObject runVO = getRunVO(context);
            ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
            RpcConfig rpcConfig = RpcConfig.INSTANCE;
            PacketService.invoke$default(this, constantsUtil.def(rpcConfig.getSERVICE_TRACER()), constantsUtil.def(rpcConfig.getMETHOD_ADD_TRACE_REVISIT()), new Object[]{runVO}, null, 8, null);
        } catch (Exception e) {
            Logger.e("RTR " + e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(ServiceTask serviceTask, Context context, ServiceCallback serviceCallback) throws NoWhenBranchMatchedException {
        Ref.LongRef longRef = new Ref.LongRef();
        ResultState<ValueObject> productTotalPoint = serviceTask.getProductTotalPoint(TnkCore.INSTANCE.getSessionVO(context, serviceTask.getSessionInfo()));
        if (productTotalPoint instanceof ResultState.Success) {
            longRef.element = ((ValueObject) ((ResultState.Success) productTotalPoint).getValue()).getInt("pnt_amt");
        } else if (productTotalPoint instanceof ResultState.Error) {
            TnkSession.INSTANCE.runOnMainThread(new ServiceTask$.ExternalSyntheticLambda4(serviceCallback, context, productTotalPoint));
            return;
        } else if (!(productTotalPoint instanceof ResultState.Pass)) {
            throw new NoWhenBranchMatchedException();
        }
        ResultState adList$default = getAdList$default(serviceTask, 0, 1, null);
        if (adList$default instanceof ResultState.Success) {
            TnkSession.INSTANCE.runOnMainThread(new ServiceTask$.ExternalSyntheticLambda5(serviceCallback, context, (ValueObject) ((ResultState.Success) adList$default).getValue(), longRef));
        } else if (adList$default instanceof ResultState.Error) {
            TnkSession.INSTANCE.runOnMainThread(new ServiceTask$.ExternalSyntheticLambda6(serviceCallback, context, adList$default));
        } else {
            TnkSession.INSTANCE.runOnMainThread(new ServiceTask$.ExternalSyntheticLambda7(serviceCallback, context));
        }
    }

    public final void queryPoint(@NotNull Context context, @Nullable ServiceCallback serviceCallback) {
        Intrinsics.checkNotNullParameter(context, "");
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        invokeAsync(context, constantsUtil.def(rpcConfig.getSERVICE_TRANSACTION()), constantsUtil.def(rpcConfig.getMETHOD_GET_USER_POINT()), new Object[0], serviceCallback);
    }

    public final void withdrawPoints(@NotNull Context context, @NotNull String str, @Nullable ServiceCallback serviceCallback) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        invokeAsync(context, constantsUtil.def(rpcConfig.getSERVICE_TRANSACTION()), constantsUtil.def(rpcConfig.getMETHOD_WITHDRAW_POINTS()), new Object[]{str, getSessionInfo().getMediaUserName()}, serviceCallback);
    }

    public final void purchaseItem(@NotNull Context context, int i2, @NotNull String str, @Nullable ServiceCallback serviceCallback) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        String strDef = constantsUtil.def(rpcConfig.getSERVICE_TRANSACTION());
        String strDef2 = constantsUtil.def(rpcConfig.getMETHOD_PURCHASE_ITEM());
        String mediaUserName = getSessionInfo().getMediaUserName();
        Intrinsics.checkNotNull(mediaUserName);
        invokeAsync(context, strDef, strDef2, new Object[]{Integer.valueOf(i2), str, mediaUserName}, serviceCallback);
    }

    public static final void a(ServiceCallback serviceCallback, Context context, ResultState resultState) {
        if (serviceCallback != null) {
            serviceCallback.onError(context, ((ResultState.Error) resultState).getE());
        }
    }

    public static final void a(ServiceCallback serviceCallback, Context context, ValueObject valueObject, Ref.LongRef longRef) {
        if (serviceCallback != null) {
            Object obj = valueObject.get("ad_list");
            Intrinsics.checkNotNull(obj, "");
            serviceCallback.onReturn(context, new int[]{((ValueObject) obj).size(), (int) longRef.element});
        }
    }

    public static final void a(ServiceCallback serviceCallback, Context context) {
        if (serviceCallback != null) {
            serviceCallback.onError(context, new Exception("call duplicate"));
        }
    }

    public static final void a(ServiceTask serviceTask, String str, String str2, Object[] objArr, ServiceCallback serviceCallback, Context context) {
        TnkSession.INSTANCE.runOnMainThread(new ServiceTask$.ExternalSyntheticLambda3(PacketService.invoke$default(serviceTask, str, str2, objArr, null, 8, null), serviceCallback, context));
    }

    public static final void a(ResultState resultState, ServiceCallback serviceCallback, Context context) {
        if (!(resultState instanceof ResultState.Success)) {
            if (!(resultState instanceof ResultState.Error) || serviceCallback == null) {
                return;
            }
            serviceCallback.onError(context, ((ResultState.Error) resultState).getE());
            return;
        }
        if (serviceCallback != null) {
            try {
                serviceCallback.onReturn(context, ((ResultState.Success) resultState).getValue());
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                serviceCallback.onError(context, e);
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }
}
