package com.alibaba.ariver.kernel.common.log;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AppLog extends BaseAppLog {
    public static final String APP_LOG_APPEARANCE_FINISH = "appearance finish";
    public static final String APP_LOG_APPEARANCE_START = "appearance start";
    public static final String APP_LOG_ASYNC_UPDATE_FAIL = "async update fail";
    public static final String APP_LOG_ASYNC_UPDATE_FINISH = "async update finish";
    public static final String APP_LOG_ASYNC_UPDATE_START = "async update start";
    public static final String APP_LOG_CONTAINER_AWAKE = "container awake";
    public static final String APP_LOG_CONTAINER_FINISH = "container finish";
    public static final String APP_LOG_CONTAINER_START = "container start";
    public static final String APP_LOG_DECIDE_FAIL = "decide fail";
    public static final String APP_LOG_DECIDE_FINISH = "decide finish";
    public static final String APP_LOG_DECIDE_START = "decide start";
    public static final String APP_LOG_DOWNGRADE = "prepare downgrade";
    public static final String APP_LOG_PREPARE = "prepare ";
    public static final String APP_LOG_PREPARE_FAIL = "prepare fail";
    public static final String APP_LOG_PREPARE_FINISH = "prepare finish";
    public static final String APP_LOG_RUNTIME_INFO = "runtime info";
    public static final String APP_LOG_TEM_INFO = "template info";
    private String mAppId;
    private String mDesc;

    private AppLog(Builder builder) {
        super(builder);
        this.mAppId = Builder.access$000(builder);
        this.mDesc = Builder.access$100(builder);
    }

    @Override // com.alibaba.ariver.kernel.common.log.BaseAppLog
    public String toString() {
        return baseInfo() + " " + this.mAppId + ", " + this.mDesc;
    }
}
