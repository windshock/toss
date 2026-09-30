package o;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class RememberLifecycleOwnerKtExternalSyntheticLambda1 implements Serializable {
    private static final long serialVersionUID = 1;
    protected final LifecycleEffectKtExternalSyntheticLambda4 _factory;

    public RememberLifecycleOwnerKtExternalSyntheticLambda1(LifecycleEffectKtExternalSyntheticLambda4 lifecycleEffectKtExternalSyntheticLambda4) {
        this._factory = lifecycleEffectKtExternalSyntheticLambda4;
    }

    public JavaType onExtraCallback(String str) throws IllegalArgumentException {
        if (str.length() > 64000) {
            throw new IllegalArgumentException(String.format("Failed to parse type %s: too long (%d characters), maximum length allowed: %d", onExtraCallbackWithResult(str), Integer.valueOf(str.length()), 64000));
        }
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(str.trim());
        JavaType javaTypeOnWarmupCompleted = onWarmupCompleted(onextracallbackwithresult, 1000);
        if (onextracallbackwithresult.hasMoreTokens()) {
            throw onNavigationEvent(onextracallbackwithresult, "Unexpected tokens after complete type");
        }
        return javaTypeOnWarmupCompleted;
    }

    protected JavaType onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult, int i2) throws IllegalArgumentException {
        if (!onextracallbackwithresult.hasMoreTokens()) {
            throw onNavigationEvent(onextracallbackwithresult, "Unexpected end-of-string");
        }
        Class<?> clsOnNavigationEvent = onNavigationEvent(onextracallbackwithresult.nextToken(), onextracallbackwithresult);
        if (onextracallbackwithresult.hasMoreTokens()) {
            String strNextToken = onextracallbackwithresult.nextToken();
            if ("<".equals(strNextToken)) {
                return this._factory.onExtraCallback((LifecycleEffectKtExternalSyntheticLambda2) null, clsOnNavigationEvent, LifecycleEffectKtExternalSyntheticLambda6.onExtraCallback(clsOnNavigationEvent, onExtraCallbackWithResult(onextracallbackwithresult, i2 - 1)));
            }
            onextracallbackwithresult.onExtraCallback(strNextToken);
        }
        return this._factory.onExtraCallback((LifecycleEffectKtExternalSyntheticLambda2) null, clsOnNavigationEvent, LifecycleEffectKtExternalSyntheticLambda6.IAuthTabCallback());
    }

    protected List<JavaType> onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, int i2) throws IllegalArgumentException {
        if (i2 < 0) {
            throw onNavigationEvent(onextracallbackwithresult, "too deeply nested; exceeds maximum of 1000 nesting levels");
        }
        ArrayList arrayList = new ArrayList();
        while (onextracallbackwithresult.hasMoreTokens()) {
            arrayList.add(onWarmupCompleted(onextracallbackwithresult, i2));
            if (!onextracallbackwithresult.hasMoreTokens()) {
                break;
            }
            String strNextToken = onextracallbackwithresult.nextToken();
            if (">".equals(strNextToken)) {
                return arrayList;
            }
            if (!",".equals(strNextToken)) {
                throw onNavigationEvent(onextracallbackwithresult, "Unexpected token '" + strNextToken + "', expected ',' or '>')");
            }
        }
        throw onNavigationEvent(onextracallbackwithresult, "Unexpected end-of-string");
    }

    protected Class<?> onNavigationEvent(String str, onExtraCallbackWithResult onextracallbackwithresult) {
        try {
            return this._factory.IAuthTabCallback(str);
        } catch (Exception e) {
            SavedStateHandleImplExternalSyntheticLambda0.IAuthTabCallbackDefault(e);
            throw onNavigationEvent(onextracallbackwithresult, "Cannot locate class '" + str + "', problem: " + e.getMessage());
        }
    }

    protected IllegalArgumentException onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult, String str) {
        return new IllegalArgumentException(String.format("Failed to parse type %s (remaining: %s): %s", onExtraCallbackWithResult(onextracallbackwithresult.IAuthTabCallback()), onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallback()), str));
    }

    private static String onExtraCallbackWithResult(String str) {
        if (str.length() <= 1000) {
            return "'" + str + "'";
        }
        return String.format("'%s...'[truncated %d charaters]", str.substring(0, 1000), Integer.valueOf(str.length() - 1000));
    }
}
