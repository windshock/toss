package com.iap.ac.android.acs.plugin.biz.region.stageinfo;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.core.Griver;
import com.alibaba.griver.core.adapter.GriverContainerAdapter;
import com.alibaba.griver.core.spi.GriverSPIManager;
import com.iap.ac.android.acs.operation.biz.region.bean.ExceptionWrap;
import com.iap.ac.android.acs.operation.biz.region.config.RegionRPCConfigCenter;
import com.iap.ac.android.acs.operation.utils.MonitorUtil;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.CategoryInfo;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.FetchStageInfoRepository;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.FetchStageInfosResult;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.IAPOperationFetchLaunchableGroupsParams;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.StageAppInfo;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.StageContentInfo;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.StageInfo;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.outter.CDPLaunchableItem;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.outter.LaunchableCategory;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.outter.LaunchableGroup;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.outter.LaunchableItem;
import com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.outter.MiniProgramLaunchableItem;
import com.iap.ac.android.common.container.IContainer;
import com.iap.ac.android.common.container.callback.Callback;
import com.iap.ac.android.common.container.model.AppInfoData;
import com.iap.ac.android.common.container.model.AppInfoListData;
import com.iap.ac.android.common.container.model.CategoryInfoData;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import com.iap.ac.android.common.utils.MiscUtils;
import com.iap.ac.android.rpccommon.model.domain.result.BaseRpcResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class LaunchableGroupManager {
    private static final String ERROR_CODE_API_BANED = "10100";
    private static final String ERROR_CODE_ARGS_ERROR = "10102";
    private static final String ERROR_CODE_FETCH_APPINFO = "20101";
    private static final String ERROR_CODE_FETCH_STAGE = "20100";
    private static final String TAG = "LaunchableGroupManager";
    private static LaunchableGroupManager stageInfoManager;
    private final int CODE_NETWORK_ERROR = 10104;
    private final int CODE_SERVER_ERROR = 10105;
    private final String TAG_RED_DOT = "RED_DOT";
    private final String TAG_HOT = "HOT";
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    public int getExceptionCode(int i) {
        return (i == 4001 || i == 5000) ? 10104 : 10105;
    }

    private LaunchableGroupManager() {
    }

    public static LaunchableGroupManager getInstance() {
        if (stageInfoManager == null) {
            synchronized (LaunchableGroupManager.class) {
                if (stageInfoManager == null) {
                    stageInfoManager = new LaunchableGroupManager();
                }
            }
        }
        return stageInfoManager;
    }

    public void fetchLaunchableGroupsWithParams(final IAPOperationFetchLaunchableGroupsParams iAPOperationFetchLaunchableGroupsParams, final FetchLaunchableGroupsCallback<Map<String, LaunchableGroup>> fetchLaunchableGroupsCallback) {
        if (fetchLaunchableGroupsCallback == null) {
            RVLogger.e(TAG, "callback is null");
            return;
        }
        if (iAPOperationFetchLaunchableGroupsParams == null) {
            RVLogger.e(TAG, "params should not be null");
            postResultFailed(ERROR_CODE_ARGS_ERROR, "Parameter is invalid", fetchLaunchableGroupsCallback);
            return;
        }
        final List<String> codes = iAPOperationFetchLaunchableGroupsParams.getCodes();
        if (codes == null || codes.isEmpty()) {
            RVLogger.e(TAG, "stageCodes size should be greater than zero");
            postResultFailed(ERROR_CODE_ARGS_ERROR, "Parameter is invalid", fetchLaunchableGroupsCallback);
        } else if (!RegionRPCConfigCenter.INSTANCE.fetchStageInfoEnabled()) {
            postResultFailed(ERROR_CODE_API_BANED, "API is banned ", fetchLaunchableGroupsCallback);
        } else {
            IAPAsyncTask.asyncTask(new Runnable() { // from class: com.iap.ac.android.acs.plugin.biz.region.stageinfo.LaunchableGroupManager.1
                @Override // java.lang.Runnable
                public void run() {
                    FetchStageInfosResult fetchStageInfosResultFetchStageInfo;
                    String str;
                    boolean z;
                    ExceptionWrap exceptionWrap = new ExceptionWrap(10105);
                    boolean zIsUseCache = iAPOperationFetchLaunchableGroupsParams.isUseCache();
                    if (zIsUseCache) {
                        String launchGroupCacheKey = LaunchableGroupManager.this.getLaunchGroupCacheKey(codes, iAPOperationFetchLaunchableGroupsParams.getQueryScope());
                        fetchStageInfosResultFetchStageInfo = LaunchableGroupManager.this.getLaunchGroupCache(launchGroupCacheKey);
                        str = launchGroupCacheKey;
                    } else {
                        fetchStageInfosResultFetchStageInfo = null;
                        str = null;
                    }
                    RVLogger.d(LaunchableGroupManager.TAG, "get result is use cache function = " + iAPOperationFetchLaunchableGroupsParams.isUseCache());
                    if (fetchStageInfosResultFetchStageInfo == null) {
                        fetchStageInfosResultFetchStageInfo = new FetchStageInfoRepository(exceptionWrap).fetchStageInfo(iAPOperationFetchLaunchableGroupsParams);
                        RVLogger.d(LaunchableGroupManager.TAG, "get result from net");
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetchStageInfosResultFetchStageInfo == null) {
                        int exceptionCode = LaunchableGroupManager.this.getExceptionCode(exceptionWrap.exceptionCode);
                        String str2 = exceptionWrap.exceptionMsg;
                        LaunchableGroupManager.this.postResultFailed(String.valueOf(exceptionCode), str2, fetchLaunchableGroupsCallback);
                        MonitorUtil.monitorRPCError("fetch_stage_info_error", String.valueOf(exceptionCode), str2);
                        return;
                    }
                    if (((BaseRpcResult) fetchStageInfosResultFetchStageInfo).success) {
                        LaunchableGroupManager.this.convertResultToLaunchGroup(fetchStageInfosResultFetchStageInfo, fetchLaunchableGroupsCallback);
                        if (zIsUseCache && str != null && z) {
                            GriverContainerAdapter.getInstance().setObject("batchQueryByStageCode", str, JsonUtils.toJson(fetchStageInfosResultFetchStageInfo), 1000 * fetchStageInfosResultFetchStageInfo.clientCacheExpireTime * 60);
                            return;
                        }
                        return;
                    }
                    String str3 = "BatchQueryByStageCode error: " + ((BaseRpcResult) fetchStageInfosResultFetchStageInfo).errorMessage;
                    MonitorUtil.monitorRPCError("fetch_stage_info_error", LaunchableGroupManager.ERROR_CODE_FETCH_STAGE, str3);
                    LaunchableGroupManager.this.postResultFailed(LaunchableGroupManager.ERROR_CODE_FETCH_STAGE, str3, fetchLaunchableGroupsCallback);
                }
            });
        }
    }

    public String getLaunchGroupCacheKey(List<String> list, String str) {
        String openId = GriverSPIManager.getInstance().getOpenId();
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next() + ",");
        }
        if (openId == null) {
            openId = "";
        }
        if (!TextUtils.isEmpty(str) && !"ALL".equals(str)) {
            sb.append(str + ",");
        }
        return MiscUtils.md5(sb.substring(0, sb.length() - 1) + "-" + openId + "-" + Griver.getAppLanguage());
    }

    public FetchStageInfosResult getLaunchGroupCache(String str) {
        int stageCacheVersion = RegionRPCConfigCenter.INSTANCE.getStageCacheVersion();
        String strObjectForKey = GriverContainerAdapter.getInstance().objectForKey("stageCacheVersion", "stageCacheVersion");
        String str2 = TAG;
        RVLogger.d(str2, "get result use cache function amcs version = " + stageCacheVersion + " localVersion = " + strObjectForKey);
        if (TextUtils.isEmpty(strObjectForKey) || Integer.valueOf(strObjectForKey).intValue() < stageCacheVersion) {
            GriverContainerAdapter.getInstance().removeAllObjects("batchQueryByStageCode");
            IContainer griverContainerAdapter = GriverContainerAdapter.getInstance();
            StringBuilder sb = new StringBuilder();
            sb.append(stageCacheVersion);
            griverContainerAdapter.setObject("stageCacheVersion", "stageCacheVersion", sb.toString(), -1L);
            RVLogger.d(str2, "local version small then cloud version , clear all cache");
        }
        String strObjectForKey2 = GriverContainerAdapter.getInstance().objectForKey("batchQueryByStageCode", str);
        try {
            if (TextUtils.isEmpty(strObjectForKey2)) {
                return null;
            }
            RVLogger.d(str2, "get result from cache");
            return (FetchStageInfosResult) JsonUtils.fromJson(strObjectForKey2, FetchStageInfosResult.class);
        } catch (Exception unused) {
            RVLogger.e(TAG, "parse cache to FetchStageInfosResult failed ");
            return null;
        }
    }

    public void convertResultToLaunchGroup(FetchStageInfosResult fetchStageInfosResult, FetchLaunchableGroupsCallback<Map<String, LaunchableGroup>> fetchLaunchableGroupsCallback) {
        HashMap map = new HashMap();
        for (Map.Entry entry : fetchStageInfosResult.stageInfo.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                String str = (String) entry.getKey();
                StageInfo stageInfo = (StageInfo) entry.getValue();
                LaunchableGroup launchableGroup = new LaunchableGroup();
                map.put(str, launchableGroup);
                convertStageInfoInner(launchableGroup, stageInfo);
            }
        }
        excludeInvalidAppInfo(map);
        posetResultSuccess(map, fetchLaunchableGroupsCallback);
    }

    private void convertStageInfoInner(LaunchableGroup launchableGroup, StageInfo stageInfo) {
        launchableGroup.code = stageInfo.stageCode;
        launchableGroup.displayName = stageInfo.displayName;
        launchableGroup.viewAllStatus = stageInfo.viewAllStatus;
        Map map = stageInfo.layoutConfig;
        if (map != null && map.size() > 0) {
            launchableGroup.setLayoutConfig(stageInfo.layoutConfig);
        }
        if (stageInfo.contentInfoList != null) {
            ArrayList arrayList = new ArrayList();
            launchableGroup.launchableItems = arrayList;
            Iterator it = stageInfo.contentInfoList.iterator();
            while (it.hasNext()) {
                StageContentInfo stageContentInfo = (StageContentInfo) it.next();
                if (stageContentInfo == null) {
                    it.remove();
                } else {
                    LaunchableItem launchableItemConvertAppInfo = convertAppInfo(stageContentInfo);
                    if (launchableItemConvertAppInfo != null) {
                        arrayList.add(launchableItemConvertAppInfo);
                    }
                }
            }
            if (arrayList.size() == 0) {
                launchableGroup.launchableItems = null;
            }
        }
        List<StageInfo> list = stageInfo.subStageList;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (StageInfo stageInfo2 : list) {
                LaunchableGroup launchableGroup2 = new LaunchableGroup();
                convertStageInfoInner(launchableGroup2, stageInfo2);
                arrayList2.add(launchableGroup2);
            }
            if (arrayList2.size() > 0) {
                launchableGroup.launchableGroups = arrayList2;
            }
        }
    }

    private LaunchableItem convertAppInfo(StageContentInfo stageContentInfo) {
        StageAppInfo stageAppInfo = stageContentInfo.appInfo;
        String str = stageContentInfo.contentType;
        if (str.equals("CDP")) {
            if (stageContentInfo.spaceCode == null) {
                return null;
            }
            CDPLaunchableItem cDPLaunchableItem = new CDPLaunchableItem();
            ((LaunchableItem) cDPLaunchableItem).type = stageContentInfo.contentType;
            cDPLaunchableItem.spaceCode = stageContentInfo.spaceCode;
            return cDPLaunchableItem;
        }
        if (!str.equals("MINI_PROGRAM")) {
            return null;
        }
        if (stageAppInfo != null && stageAppInfo.identifier == null) {
            return null;
        }
        MiniProgramLaunchableItem miniProgramLaunchableItem = new MiniProgramLaunchableItem();
        ((LaunchableItem) miniProgramLaunchableItem).type = stageContentInfo.contentType;
        miniProgramLaunchableItem.identifier = stageAppInfo.identifier;
        miniProgramLaunchableItem.introduction = stageAppInfo.introduction;
        miniProgramLaunchableItem.name = stageAppInfo.name;
        miniProgramLaunchableItem.slogan = stageAppInfo.slogan;
        miniProgramLaunchableItem.releaseVersion = stageAppInfo.releaseVersion;
        miniProgramLaunchableItem.iconURL = stageAppInfo.iconURL;
        miniProgramLaunchableItem.isFavorite = stageAppInfo.isFavorite;
        miniProgramLaunchableItem.lastUsedTimestamp = stageAppInfo.lastUsedTimestamp;
        miniProgramLaunchableItem.isUsed = stageAppInfo.isUsed;
        ArrayList arrayList = new ArrayList();
        List<CategoryInfo> list = stageAppInfo.categories;
        if (list != null) {
            for (CategoryInfo categoryInfo : list) {
                if (categoryInfo != null) {
                    LaunchableCategory launchableCategory = new LaunchableCategory();
                    launchableCategory.identifier = categoryInfo.identifier;
                    launchableCategory.name = categoryInfo.name;
                    launchableCategory.setCategory2(categoryInfo.getCategory2());
                    launchableCategory.setCategory3(categoryInfo.getCategory3());
                    launchableCategory.setCategoryCode2(categoryInfo.getCategoryCode2());
                    launchableCategory.setCategoryCode3(categoryInfo.getCategoryCode3());
                    arrayList.add(launchableCategory);
                }
            }
            miniProgramLaunchableItem.categories = arrayList;
        }
        miniProgramLaunchableItem.spaceCode = stageContentInfo.spaceCode;
        return miniProgramLaunchableItem;
    }

    public void fetchAppInfoListByIds(final FetchStageInfosResult fetchStageInfosResult, final FetchLaunchableGroupsCallback<Map<String, LaunchableGroup>> fetchLaunchableGroupsCallback) {
        final HashMap map = new HashMap();
        GriverContainerAdapter.getInstance().fetchAppInfoListByIds(getAppIds(fetchStageInfosResult), new Callback<AppInfoListData>() { // from class: com.iap.ac.android.acs.plugin.biz.region.stageinfo.LaunchableGroupManager.2
            @Override // com.iap.ac.android.common.container.callback.Callback
            public void onResultSuccess(AppInfoListData appInfoListData) {
                if (appInfoListData == null || appInfoListData.getAppInfoList() == null || appInfoListData.getAppInfoList().isEmpty()) {
                    LaunchableGroupManager.this.posetResultSuccess(map, fetchLaunchableGroupsCallback);
                    return;
                }
                LaunchableGroupManager.this.reassignStageInfo(appInfoListData, fetchStageInfosResult, map);
                LaunchableGroupManager.this.excludeInvalidAppInfo(map);
                LaunchableGroupManager.this.posetResultSuccess(map, fetchLaunchableGroupsCallback);
            }

            @Override // com.iap.ac.android.common.container.callback.Callback
            public void onResultFailed(int i, String str) {
                String strValueOf;
                if (i != 10104) {
                    strValueOf = LaunchableGroupManager.ERROR_CODE_FETCH_APPINFO;
                } else {
                    strValueOf = String.valueOf(i);
                }
                String str2 = "FetchAppInfosByIds error: " + str;
                LaunchableGroupManager.this.postResultFailed(strValueOf, str2, fetchLaunchableGroupsCallback);
                MonitorUtil.monitorRPCError("fetch_stage_info_error", strValueOf, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reassignStageInfo(AppInfoListData appInfoListData, FetchStageInfosResult fetchStageInfosResult, Map<String, LaunchableGroup> map) {
        Map map2 = fetchStageInfosResult.stageInfo;
        if (map == null) {
            map = new HashMap<>();
        }
        for (Map.Entry entry : map2.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                String str = (String) entry.getKey();
                StageInfo stageInfo = (StageInfo) entry.getValue();
                LaunchableGroup launchableGroup = new LaunchableGroup();
                map.put(str, launchableGroup);
                reassignStageInfoInner(launchableGroup, stageInfo, appInfoListData.getAppInfoList());
            }
        }
    }

    private void reassignStageInfoInner(LaunchableGroup launchableGroup, StageInfo stageInfo, List<AppInfoData> list) {
        StageAppInfo stageAppInfo;
        launchableGroup.code = stageInfo.stageCode;
        launchableGroup.displayName = stageInfo.displayName;
        launchableGroup.viewAllStatus = stageInfo.viewAllStatus;
        Map map = stageInfo.layoutConfig;
        if (map != null && !map.isEmpty()) {
            launchableGroup.setLayoutConfig(stageInfo.layoutConfig);
        }
        if (stageInfo.contentInfoList != null) {
            ArrayList arrayList = new ArrayList();
            launchableGroup.launchableItems = arrayList;
            Iterator it = stageInfo.contentInfoList.iterator();
            while (it.hasNext()) {
                StageContentInfo stageContentInfo = (StageContentInfo) it.next();
                if (stageContentInfo == null || (stageAppInfo = stageContentInfo.appInfo) == null || stageAppInfo.appId == null) {
                    it.remove();
                } else {
                    MiniProgramLaunchableItem miniProgramLaunchableItem = new MiniProgramLaunchableItem();
                    reassignAppInfo(miniProgramLaunchableItem, stageContentInfo, list);
                    if (miniProgramLaunchableItem.identifier != null) {
                        arrayList.add(miniProgramLaunchableItem);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                launchableGroup.launchableItems = null;
            }
        }
        List<StageInfo> list2 = stageInfo.subStageList;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (StageInfo stageInfo2 : list2) {
                LaunchableGroup launchableGroup2 = new LaunchableGroup();
                reassignStageInfoInner(launchableGroup2, stageInfo2, list);
                arrayList2.add(launchableGroup2);
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            launchableGroup.launchableGroups = arrayList2;
        }
    }

    private void reassignAppInfo(MiniProgramLaunchableItem miniProgramLaunchableItem, StageContentInfo stageContentInfo, List<AppInfoData> list) {
        StageAppInfo stageAppInfo = stageContentInfo.appInfo;
        for (AppInfoData appInfoData : list) {
            if (appInfoData != null && appInfoData.getAppId() != null && stageAppInfo.appId.equals(appInfoData.getAppId())) {
                miniProgramLaunchableItem.introduction = appInfoData.getAppDesc();
                miniProgramLaunchableItem.name = appInfoData.getAppName();
                miniProgramLaunchableItem.slogan = appInfoData.getAppSlogan();
                miniProgramLaunchableItem.releaseVersion = appInfoData.getDeployVersion();
                miniProgramLaunchableItem.iconURL = appInfoData.getIconUrl();
                miniProgramLaunchableItem.identifier = appInfoData.getAppId();
                miniProgramLaunchableItem.isFavorite = stageAppInfo.isFavorite;
                miniProgramLaunchableItem.lastUsedTimestamp = stageAppInfo.lastUsedTimestamp;
                miniProgramLaunchableItem.isUsed = stageAppInfo.isUsed;
                List<CategoryInfoData> categoryInfos = appInfoData.getCategoryInfos();
                ArrayList arrayList = new ArrayList();
                if (categoryInfos != null && !categoryInfos.isEmpty()) {
                    for (CategoryInfoData categoryInfoData : categoryInfos) {
                        if (categoryInfoData != null) {
                            LaunchableCategory launchableCategory = new LaunchableCategory();
                            launchableCategory.name = categoryInfoData.getCategory();
                            launchableCategory.identifier = categoryInfoData.getCategoryId();
                            arrayList.add(launchableCategory);
                        }
                    }
                    miniProgramLaunchableItem.categories = arrayList;
                }
                miniProgramLaunchableItem.spaceCode = stageContentInfo.spaceCode;
                return;
            }
        }
    }

    private List<String> getAppIds(FetchStageInfosResult fetchStageInfosResult) {
        ArrayList arrayList = new ArrayList();
        Map map = fetchStageInfosResult.stageInfo;
        if (map == null || map.isEmpty()) {
            return arrayList;
        }
        map.values();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            getAppIdsInner((StageInfo) it.next(), arrayList);
        }
        return new ArrayList(new LinkedHashSet(arrayList));
    }

    public void getAppIdsInner(StageInfo stageInfo, List<String> list) {
        StageAppInfo stageAppInfo;
        if (stageInfo != null) {
            if (stageInfo.contentInfoList == null && stageInfo.subStageList == null) {
                return;
            }
            List list2 = stageInfo.subStageList;
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    getAppIdsInner((StageInfo) it.next(), list);
                }
            }
            List<StageContentInfo> list3 = stageInfo.contentInfoList;
            if (list3 != null) {
                for (StageContentInfo stageContentInfo : list3) {
                    if (stageContentInfo != null && (stageAppInfo = stageContentInfo.appInfo) != null) {
                        list.add(stageAppInfo.appId);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void excludeInvalidAppInfo(Map<String, LaunchableGroup> map) {
        List<LaunchableItem> list;
        for (LaunchableGroup launchableGroup : map.values()) {
            if (launchableGroup != null && (list = launchableGroup.launchableItems) != null && list.size() != 0) {
                Iterator<LaunchableItem> it = launchableGroup.launchableItems.iterator();
                while (it.hasNext()) {
                    MiniProgramLaunchableItem miniProgramLaunchableItem = (LaunchableItem) it.next();
                    if (miniProgramLaunchableItem != null) {
                        if ("MINI_PROGRAM".equals(((LaunchableItem) miniProgramLaunchableItem).type) && miniProgramLaunchableItem.identifier == null) {
                            it.remove();
                        }
                        if ("CDP".equals(((LaunchableItem) miniProgramLaunchableItem).type) && ((CDPLaunchableItem) miniProgramLaunchableItem).spaceCode == null) {
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void posetResultSuccess(final Map<String, LaunchableGroup> map, final FetchLaunchableGroupsCallback<Map<String, LaunchableGroup>> fetchLaunchableGroupsCallback) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            fetchLaunchableGroupsCallback.onResponse(map);
        } else {
            this.handler.post(new Runnable() { // from class: com.iap.ac.android.acs.plugin.biz.region.stageinfo.LaunchableGroupManager.3
                @Override // java.lang.Runnable
                public void run() {
                    fetchLaunchableGroupsCallback.onResponse(map);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postResultFailed(final String str, final String str2, final FetchLaunchableGroupsCallback<Map<String, LaunchableGroup>> fetchLaunchableGroupsCallback) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            fetchLaunchableGroupsCallback.onFailure(str, str2);
        } else {
            this.handler.post(new Runnable() { // from class: com.iap.ac.android.acs.plugin.biz.region.stageinfo.LaunchableGroupManager.4
                @Override // java.lang.Runnable
                public void run() {
                    fetchLaunchableGroupsCallback.onFailure(str, str2);
                }
            });
        }
    }
}
