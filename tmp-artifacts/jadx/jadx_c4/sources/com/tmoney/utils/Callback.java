package com.tmoney.utils;

import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.TmoneyCallback;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class Callback {
    public static TmoneyCallback.ResultType success() {
        return TmoneyCallback.ResultType.SUCCESS.setError(ResultError.SUCCESS);
    }

    public static TmoneyCallback.ResultType success(Object... objArr) {
        return success().setData(objArr);
    }

    public static TmoneyCallback.ResultType todo(ResultError resultError, ResultDetailCode resultDetailCode) {
        return todo(resultError, resultDetailCode.getCodeString(), resultDetailCode.getMessage());
    }

    public static TmoneyCallback.ResultType todo(ResultError resultError, String str, String str2) {
        return TmoneyCallback.ResultType.TODO.setError(resultError).setDetailCode(str).setMessage(str2);
    }

    public static TmoneyCallback.ResultType warning(ResultError resultError, ResultDetailCode resultDetailCode) {
        return warning(resultError, resultDetailCode.getCodeString(), resultDetailCode.getMessage());
    }

    public static TmoneyCallback.ResultType warning(ResultError resultError, ResultDetailCode resultDetailCode, String str, Exception exc) {
        return warning(resultError, resultDetailCode).setLog(str).setException(exc);
    }

    public static TmoneyCallback.ResultType warning(ResultError resultError, String str, String str2) {
        return TmoneyCallback.ResultType.WARNING.setError(resultError).setDetailCode(str).setMessage(str2);
    }

    public static TmoneyCallback.ResultType warning(ResultError resultError, String str, String str2, String str3) {
        return warning(resultError, str, str2).setLog(str3);
    }

    public static TmoneyCallback.ResultType warning(ResultError resultError, String str, String str2, String str3, Exception exc) {
        return warning(resultError, str, str2).setLog(str3).setException(exc);
    }
}
