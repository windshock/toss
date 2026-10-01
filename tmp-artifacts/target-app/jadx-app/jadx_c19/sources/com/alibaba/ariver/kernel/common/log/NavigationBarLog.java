package com.alibaba.ariver.kernel.common.log;

import com.alibaba.ariver.kernel.common.log.BaseAppLog;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class NavigationBarLog extends BaseAppLog {
    public static final String ACTION_CREATE = "action/create";
    public static final String ACTION_CREATE_POP_MENU = "action/create_pop_menu";
    public static final String PHASE_ATTACH_PAGE_BEGIN = "phase/attach_page_begin";
    public static final String PHASE_ATTACH_PAGE_END = "phase/attach_page_end";
    public static final String PHASE_INIT_BEGIN = "phase/init_begin";
    public static final String PHASE_INIT_END = "phase/init_end";
    private String mAppId;
    private String mNavigationBarClassName;
    private String mOperatorReused;
    private String mPopMenuClassName;
    private String mStyle;
    private String mUnifiedNavigationBarEnabled;

    private NavigationBarLog(Builder builder) {
        super(builder);
        this.mNavigationBarClassName = builder.mNavigationBarClassName;
        this.mAppId = builder.mAppId;
        this.mPopMenuClassName = builder.mPopMenuClassName;
        this.mStyle = builder.mStyle;
        this.mUnifiedNavigationBarEnabled = builder.mUnifiedNavigationBarEnabled;
        this.mOperatorReused = builder.mOperatorReused;
    }

    @Override // com.alibaba.ariver.kernel.common.log.BaseAppLog
    public String toString() {
        String strBaseInfo = baseInfo();
        String state = getState();
        switch (state.hashCode()) {
            case -2117391535:
                if (!state.equals(PHASE_ATTACH_PAGE_END)) {
                    return strBaseInfo;
                }
                return strBaseInfo + " style/" + this.mStyle + " unifiedNavigationBarEnabled/" + this.mUnifiedNavigationBarEnabled;
            case -745348969:
                if (!state.equals(ACTION_CREATE_POP_MENU)) {
                    return strBaseInfo;
                }
                return strBaseInfo + " popMenuClassName/" + this.mPopMenuClassName;
            case 752740160:
                state.equals(PHASE_INIT_END);
                return strBaseInfo;
            case 998200735:
                state.equals(PHASE_ATTACH_PAGE_BEGIN);
                return strBaseInfo;
            case 1429256949:
                if (!state.equals(ACTION_CREATE)) {
                    return strBaseInfo;
                }
                return strBaseInfo + " appId/" + this.mAppId + " navigationBarClassName/" + this.mNavigationBarClassName;
            case 1825755598:
                if (!state.equals(PHASE_INIT_BEGIN)) {
                    return strBaseInfo;
                }
                return strBaseInfo + " operatorReused/" + this.mOperatorReused;
            default:
                return strBaseInfo;
        }
    }

    public static class Builder extends BaseAppLog.Builder<Builder> {
        private String mAppId;
        private String mNavigationBarClassName;
        private String mOperatorReused;
        private String mPopMenuClassName;
        private String mStyle;
        private String mUnifiedNavigationBarEnabled;

        /* JADX INFO: Access modifiers changed from: protected */
        public Builder getThis() {
            return this;
        }

        public Builder() {
            super(LogType.NAVIGATION_BAR);
        }

        public Builder setNavigationBarClassName(String str) {
            this.mNavigationBarClassName = str;
            return getThis();
        }

        public Builder setAppId(String str) {
            this.mAppId = str;
            return getThis();
        }

        public Builder setPopMenuClassName(String str) {
            this.mPopMenuClassName = str;
            return getThis();
        }

        public Builder setStyle(String str) {
            this.mStyle = str;
            return getThis();
        }

        public Builder setUnifiedNavigationBarEnabled(String str) {
            this.mUnifiedNavigationBarEnabled = str;
            return getThis();
        }

        public Builder setOperatorReused(String str) {
            this.mOperatorReused = str;
            return getThis();
        }

        public BaseAppLog build() {
            return new NavigationBarLog(this);
        }
    }
}
