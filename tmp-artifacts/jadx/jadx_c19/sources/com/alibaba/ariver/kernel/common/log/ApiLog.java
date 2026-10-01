package com.alibaba.ariver.kernel.common.log;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.log.BaseAppLog;
import com.alibaba.ariver.kernel.common.utils.StringUtils;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ApiLog extends BaseAppLog {
    public static final String API_LOG_STATE_ERROR = "error";
    public static final String API_LOG_STATE_START = "start";
    public static final String API_LOG_STATE_SUCCESS = "success";
    private String mApiName;
    private String mCallMode;
    private String mData;
    private Integer mErrorCode;
    private String mErrorMsg;

    private ApiLog(Builder builder) {
        super(builder);
        this.mData = builder.data;
        this.mApiName = builder.apiName;
        this.mErrorCode = builder.errorCode;
        this.mCallMode = builder.callMode;
        this.mErrorMsg = builder.errorMsg;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    @Override // com.alibaba.ariver.kernel.common.log.BaseAppLog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        char c;
        String str;
        String strBaseInfo = baseInfo();
        if (TextUtils.isEmpty(getState())) {
            return super.toString();
        }
        String state = getState();
        int iHashCode = state.hashCode();
        if (iHashCode != -1867169789) {
            if (iHashCode != 96784904) {
                c = (iHashCode == 109757538 && state.equals("start")) ? (char) 2 : (char) 65535;
            } else if (state.equals(API_LOG_STATE_ERROR)) {
                c = 1;
            }
        } else if (state.equals(API_LOG_STATE_SUCCESS)) {
            c = 0;
        }
        String str2 = "";
        if (c != 0) {
            if (c == 1) {
                if (this.mErrorCode != null) {
                    str = "(" + this.mErrorCode.toString() + ") ";
                } else {
                    str = "";
                }
                if (!StringUtils.isEmpty(this.mErrorMsg)) {
                    str = "(" + this.mErrorMsg + ") ";
                }
                if (!TextUtils.isEmpty(this.mApiName)) {
                    str = str + this.mApiName + " ";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(strBaseInfo);
                sb.append(" ");
                sb.append(str);
                if (!TextUtils.isEmpty(this.mCallMode)) {
                    str2 = this.mCallMode + " ";
                }
                sb.append(str2);
                sb.append(this.mData);
                return sb.toString();
            }
            if (c != 2) {
                return super.toString();
            }
        }
        if (TextUtils.isEmpty(this.mApiName)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strBaseInfo);
            sb2.append(" ");
            if (!TextUtils.isEmpty(this.mCallMode)) {
                str2 = this.mCallMode + " ";
            }
            sb2.append(str2);
            sb2.append(this.mData);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(strBaseInfo);
        sb3.append(" ");
        sb3.append(this.mApiName);
        sb3.append(" ");
        if (!TextUtils.isEmpty(this.mCallMode)) {
            str2 = this.mCallMode + " ";
        }
        sb3.append(str2);
        sb3.append(this.mData);
        return sb3.toString();
    }

    public String getData() {
        return this.mData;
    }

    public static class Builder extends BaseAppLog.Builder<Builder> {
        private String apiName;
        private String callMode;
        private String data;
        private Integer errorCode;
        private String errorMsg;

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: getThis, reason: merged with bridge method [inline-methods] */
        public Builder m2getThis() {
            return this;
        }

        public Builder() {
            super(LogType.API);
        }

        public Builder setApiName(String str) {
            this.apiName = str;
            return m2getThis();
        }

        public Builder setData(String str) {
            this.data = str;
            return m2getThis();
        }

        public Builder setErrCode(int i2) {
            this.errorCode = Integer.valueOf(i2);
            return m2getThis();
        }

        public Builder setErrMsg(String str) {
            this.errorMsg = str;
            return m2getThis();
        }

        public Builder setCallMode(String str) {
            this.callMode = str;
            return m2getThis();
        }

        public BaseAppLog build() {
            return new ApiLog(this);
        }
    }
}
