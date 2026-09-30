package com.alibaba.ariver.kernel.common.log;

import com.alibaba.ariver.kernel.common.log.BaseAppLog;
import com.alibaba.ariver.kernel.common.utils.StringUtils;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TracePairLog extends BaseAppLog {
    private String mMessage;
    private String mPairType;

    private TracePairLog(Builder builder) {
        super(builder);
        this.mPairType = builder.pairType;
        this.mMessage = builder.message;
    }

    @Override // com.alibaba.ariver.kernel.common.log.BaseAppLog
    public String toString() {
        String strBaseInfo = baseInfo();
        if (StringUtils.isEmpty(this.mMessage)) {
            return strBaseInfo + " type: " + this.mPairType;
        }
        return strBaseInfo + " type: " + this.mPairType + ", " + this.mMessage;
    }

    public static class Builder extends BaseAppLog.Builder<Builder> {
        private String message;
        private String pairType;

        /* JADX INFO: Access modifiers changed from: protected */
        public Builder getThis() {
            return this;
        }

        public Builder() {
            super(LogType.TRACEPAIR);
            this.pairType = "";
        }

        public Builder setPairType(String str) {
            this.pairType = str;
            return getThis();
        }

        public Builder setMessage(String str) {
            this.message = str;
            return getThis();
        }

        public BaseAppLog build() {
            return new TracePairLog(this);
        }
    }
}
