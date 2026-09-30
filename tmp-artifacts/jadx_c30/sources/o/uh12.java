package o;

import java.util.Objects;
import java.util.Optional;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class uh12 extends uh16 {
    private final String context;
    private final Optional<sya8> contextMark;
    private final String problem;
    private final Optional<sya8> problemMark;

    protected uh12(String str, Optional<sya8> optional, String str2, Optional<sya8> optional2, Throwable th) {
        super(str + "; " + str2 + "; " + optional2, th);
        Objects.requireNonNull(optional, "contextMark must be provided");
        Objects.requireNonNull(optional2, "problemMark must be provided");
        this.context = str;
        this.contextMark = optional;
        this.problem = str2;
        this.problemMark = optional2;
    }

    protected uh12(String str, Optional<sya8> optional, String str2, Optional<sya8> optional2) {
        this(str, optional, str2, optional2, null);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.context;
        if (str != null) {
            sb.append(str);
            sb.append("\n");
        }
        if (this.contextMark.isPresent() && (this.problem == null || !this.problemMark.isPresent() || this.contextMark.get().onExtraCallbackWithResult().equals(this.problemMark.get().onExtraCallbackWithResult()) || this.contextMark.get().IAuthTabCallback() != this.problemMark.get().IAuthTabCallback() || this.contextMark.get().onNavigationEvent() != this.problemMark.get().onNavigationEvent())) {
            sb.append(this.contextMark.get());
            sb.append("\n");
        }
        String str2 = this.problem;
        if (str2 != null) {
            sb.append(str2);
            sb.append("\n");
        }
        if (this.problemMark.isPresent()) {
            sb.append(this.problemMark.get());
            sb.append("\n");
        }
        return sb.toString();
    }
}
