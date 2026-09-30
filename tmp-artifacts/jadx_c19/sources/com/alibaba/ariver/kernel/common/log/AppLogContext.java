package com.alibaba.ariver.kernel.common.log;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class AppLogContext {
    private boolean alreadyRecordTagLog;
    private boolean hasJSAPIError;
    private boolean hasJSError;
    private boolean hasResourceError;
    private boolean hasScreenShot;
    private boolean hasWhiteScreen;
    private String mPageLogToken;
    private final PageSource mPageSource = new PageSource();

    public String getPageLogToken() {
        return this.mPageLogToken;
    }

    public PageSource getPageSource() {
        return this.mPageSource;
    }

    public void setPageLogToken(String str) {
        this.mPageLogToken = str;
    }

    public boolean hasResourceError() {
        return this.hasResourceError;
    }

    public void setHasResourceError(boolean z) {
        this.hasResourceError = z;
    }

    public boolean hasJSAPIError() {
        return this.hasJSAPIError;
    }

    public void setHasJSAPIError(boolean z) {
        this.hasJSAPIError = z;
    }

    public boolean hasJSError() {
        return this.hasJSError;
    }

    public void setHasJSError(boolean z) {
        this.hasJSError = z;
    }

    public boolean hasWhiteScreen() {
        return this.hasWhiteScreen;
    }

    public void setHasWhiteScreen(boolean z) {
        this.hasWhiteScreen = z;
    }

    public boolean hasScreenShot() {
        return this.hasScreenShot;
    }

    public void setHasScreenShot(boolean z) {
        this.hasScreenShot = z;
    }

    public boolean isAlreadyRecordTagLog() {
        return this.alreadyRecordTagLog;
    }

    public void setAlreadyRecordTagLog(boolean z) {
        this.alreadyRecordTagLog = z;
    }
}
