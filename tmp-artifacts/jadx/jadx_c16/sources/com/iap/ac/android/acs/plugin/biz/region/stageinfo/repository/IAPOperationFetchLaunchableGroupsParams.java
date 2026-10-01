package com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class IAPOperationFetchLaunchableGroupsParams {
    private List<String> codes;
    private String queryScope;
    private boolean useCache;

    public boolean isUseCache() {
        return this.useCache;
    }

    public void setUseCache(boolean z) {
        this.useCache = z;
    }

    public List<String> getCodes() {
        return this.codes;
    }

    public void setCodes(List<String> list) {
        this.codes = list;
    }

    public String getQueryScope() {
        return this.queryScope;
    }

    public void setQueryScope(String str) {
        this.queryScope = str;
    }
}
