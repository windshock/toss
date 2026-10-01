package o;

import java.util.Arrays;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ea41 extends jc2 {
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;

    public ea41(String str, String str2) {
        this.onExtraCallbackWithResult = (String) pmi10.onExtraCallbackWithResult("pattern", str);
        this.onNavigationEvent = str2 == null ? BuildConfig.FLAVOR : IAuthTabCallback(str2);
    }

    @Override // o.jc2
    public t_ IAuthTabCallback() {
        return t_.REGULAR_EXPRESSION;
    }

    public String onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public String onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ea41.class != obj.getClass()) {
            return false;
        }
        ea41 ea41Var = (ea41) obj;
        return this.onNavigationEvent.equals(ea41Var.onNavigationEvent) && this.onExtraCallbackWithResult.equals(ea41Var.onExtraCallbackWithResult);
    }

    public int hashCode() {
        return (this.onExtraCallbackWithResult.hashCode() * 31) + this.onNavigationEvent.hashCode();
    }

    public String toString() {
        return "BsonRegularExpression{pattern='" + this.onExtraCallbackWithResult + "', options='" + this.onNavigationEvent + "'}";
    }

    private String IAuthTabCallback(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
