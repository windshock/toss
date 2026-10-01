package com.alibaba.ariver.kernel.common.log;

import android.text.TextUtils;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class BaseAppLog {
    private String mBizType = AppLogger.getBizType();
    private String mGroupId;
    private LogType mLogType;
    private String mParentId;
    private String mState;

    String getBizType() {
        return this.mBizType;
    }

    LogType getLogType() {
        return this.mLogType;
    }

    String getParentId() {
        return this.mParentId;
    }

    String getGroupId() {
        return this.mGroupId;
    }

    String getState() {
        return this.mState;
    }

    BaseAppLog(Builder builder) {
        this.mLogType = Builder.access$000(builder);
        this.mParentId = Builder.access$100(builder);
        this.mGroupId = Builder.access$200(builder);
        this.mState = Builder.access$300(builder);
    }

    protected String baseInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mBizType);
        sb.append(", ");
        sb.append(this.mLogType.getTypeSting());
        sb.append(", ");
        sb.append(this.mParentId);
        sb.append(", ");
        sb.append(this.mGroupId);
        sb.append(",");
        if (!TextUtils.isEmpty(this.mState)) {
            sb.append(" ");
            sb.append(this.mState);
        }
        return sb.toString();
    }

    public String toString() {
        return baseInfo();
    }
}
