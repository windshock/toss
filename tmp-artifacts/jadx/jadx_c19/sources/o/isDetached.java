package o;

import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class isDetached implements Serializable {
    private static isDetached onExtraCallback = new isDetached(1000, -1, 1000, 20000000, 50000);
    private static final long serialVersionUID = 1;
    protected final long _maxDocLen;
    protected final int _maxNameLen;
    protected final int _maxNestingDepth;
    protected final int _maxNumLen;
    protected final int _maxStringLen;
    protected final long _maxTokenCount;

    @Deprecated
    protected isDetached(int i2, long j, int i3, int i4, int i5) {
        this(i2, j, i3, i4, i5, -1L);
    }

    protected isDetached(int i2, long j, int i3, int i4, int i5, long j2) {
        this._maxNestingDepth = i2;
        this._maxDocLen = j;
        this._maxNumLen = i3;
        this._maxStringLen = i4;
        this._maxNameLen = i5;
        this._maxTokenCount = j2;
    }

    public static isDetached IAuthTabCallback() {
        return onExtraCallback;
    }

    public boolean onWarmupCompleted() {
        return this._maxTokenCount > 0;
    }

    public void IAuthTabCallback(int i2) throws StreamConstraintsException {
        int i3 = this._maxNestingDepth;
        if (i2 <= i3) {
            return;
        }
        throw IAuthTabCallback("Document nesting depth (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i2), Integer.valueOf(i3), onWarmupCompleted("getMaxNestingDepth"));
    }

    public void onWarmupCompleted(long j) throws StreamConstraintsException {
        long j2 = this._maxDocLen;
        if (j <= j2 || j2 <= 0) {
            return;
        }
        throw IAuthTabCallback("Document length (%d) exceeds the maximum allowed (%d, from %s)", Long.valueOf(j), Long.valueOf(j2), onWarmupCompleted("getMaxDocumentLength"));
    }

    public void IAuthTabCallback(long j) throws StreamConstraintsException {
        long j2 = this._maxTokenCount;
        if (j <= j2) {
            return;
        }
        throw IAuthTabCallback("Token count (%d) exceeds the maximum allowed (%d, from %s)", Long.valueOf(j), Long.valueOf(j2), onWarmupCompleted("getMaxTokenCount"));
    }

    public void onWarmupCompleted(int i2) throws StreamConstraintsException {
        int i3 = this._maxNumLen;
        if (i2 <= i3) {
            return;
        }
        throw IAuthTabCallback("Number value length (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i2), Integer.valueOf(i3), onWarmupCompleted("getMaxNumberLength"));
    }

    public void onNavigationEvent(int i2) throws StreamConstraintsException {
        int i3 = this._maxNumLen;
        if (i2 <= i3) {
            return;
        }
        throw IAuthTabCallback("Number value length (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i2), Integer.valueOf(i3), onWarmupCompleted("getMaxNumberLength"));
    }

    public void asBinder(int i2) throws StreamConstraintsException {
        int i3 = this._maxStringLen;
        if (i2 <= i3) {
            return;
        }
        throw IAuthTabCallback("String value length (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i2), Integer.valueOf(i3), onWarmupCompleted("getMaxStringLength"));
    }

    public void onExtraCallbackWithResult(int i2) throws StreamConstraintsException {
        int i3 = this._maxNameLen;
        if (i2 <= i3) {
            return;
        }
        throw IAuthTabCallback("Name length (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i2), Integer.valueOf(i3), onWarmupCompleted("getMaxNameLength"));
    }

    public void onExtraCallback(int i2) throws StreamConstraintsException {
        if (Math.abs(i2) > 100000) {
            throw IAuthTabCallback("BigDecimal scale (%d) magnitude exceeds the maximum allowed (%d)", Integer.valueOf(i2), 100000);
        }
    }

    protected StreamConstraintsException IAuthTabCallback(String str, Object... objArr) throws StreamConstraintsException {
        throw new StreamConstraintsException(String.format(str, objArr));
    }

    protected String onWarmupCompleted(String str) {
        return "`StreamReadConstraints." + str + "()`";
    }
}
