package com.alibaba.ariver.kernel.common.log;

import com.alibaba.ariver.kernel.common.log.BaseAppLog;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class CaprLog extends BaseAppLog {
    private String mAppId;
    private String mDesc;

    private CaprLog(Builder builder) {
        super(builder);
        this.mAppId = builder.appId;
        this.mDesc = builder.desc;
    }

    @Override // com.alibaba.ariver.kernel.common.log.BaseAppLog
    public String toString() {
        return baseInfo() + " " + this.mAppId + ", " + this.mDesc;
    }

    public static class Builder extends BaseAppLog.Builder<Builder> {
        private String appId;
        private String desc;

        /* JADX INFO: Access modifiers changed from: protected */
        public Builder getThis() {
            return this;
        }

        public Builder() {
            super(LogType.Caprimulgus);
            this.desc = "";
            this.appId = "";
        }

        public Builder setDesc(String str) {
            this.desc = str;
            return getThis();
        }

        public Builder setAppId(String str) {
            this.appId = str;
            return getThis();
        }

        public BaseAppLog build() {
            return new CaprLog(this);
        }
    }
}
