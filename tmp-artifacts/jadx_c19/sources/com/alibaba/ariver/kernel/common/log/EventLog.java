package com.alibaba.ariver.kernel.common.log;

import com.alibaba.ariver.kernel.common.log.BaseAppLog;
import com.alibaba.ariver.kernel.common.utils.StringUtils;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class EventLog extends BaseAppLog {
    private String mData;
    private String mEventName;

    private EventLog(Builder builder) {
        super(builder);
        this.mData = builder.data;
        this.mEventName = builder.eventName;
    }

    @Override // com.alibaba.ariver.kernel.common.log.BaseAppLog
    public String toString() {
        String strBaseInfo = baseInfo();
        if (StringUtils.isEmpty(this.mEventName)) {
            return strBaseInfo + this.mData;
        }
        return strBaseInfo + " " + this.mEventName + " " + this.mData;
    }

    public static class Builder extends BaseAppLog.Builder<Builder> {
        private String data;
        private String eventName;

        /* JADX INFO: Access modifiers changed from: protected */
        public Builder getThis() {
            return this;
        }

        public Builder() {
            super(LogType.EVENT);
            this.data = "";
        }

        public Builder setData(String str) {
            this.data = str;
            return getThis();
        }

        public Builder setEventName(String str) {
            this.eventName = str;
            return getThis();
        }

        public BaseAppLog build() {
            return new EventLog(this);
        }
    }
}
