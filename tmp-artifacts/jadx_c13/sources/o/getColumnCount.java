package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import o.HookTool;
import o.sz3;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getColumnCount extends isLast {
    private final List<Integer> algCodes;

    private getColumnCount(int i) {
        super(i);
        if (i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException("Invalid option code, must be one of DAU, DHU, N3U");
        }
        this.algCodes = new ArrayList();
    }

    public getColumnCount(int i, int... iArr) {
        this(i);
        if (iArr != null) {
            for (int i2 : iArr) {
                this.algCodes.add(Integer.valueOf(i2));
            }
        }
    }

    @Override // o.isLast
    void onWarmupCompleted(getBlob getblob) throws IOException {
        this.algCodes.clear();
        while (getblob.IAuthTabCallbackDefault() > 0) {
            this.algCodes.add(Integer.valueOf(getblob.asInterface()));
        }
    }

    @Override // o.isLast
    void onNavigationEvent(final deactivate deactivateVar) {
        List<Integer> list = this.algCodes;
        Objects.requireNonNull(deactivateVar);
        list.forEach(new Consumer() { // from class: org.xbill.DNS.DnssecAlgorithmOption$$ExternalSyntheticLambda3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                deactivateVar.onNavigationEvent(((Integer) obj).intValue());
            }
        });
    }

    @Override // o.isLast
    String onWarmupCompleted() {
        Function function;
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (iOnExtraCallbackWithResult == 5) {
            function = new Function() { // from class: org.xbill.DNS.DnssecAlgorithmOption$$ExternalSyntheticLambda0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return HookTool.onExtraCallback.IAuthTabCallback(((Integer) obj).intValue());
                }
            };
        } else if (iOnExtraCallbackWithResult == 6) {
            function = new Function() { // from class: org.xbill.DNS.DnssecAlgorithmOption$$ExternalSyntheticLambda1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return HookTool.IAuthTabCallback.onNavigationEvent(((Integer) obj).intValue());
                }
            };
        } else if (iOnExtraCallbackWithResult == 7) {
            function = new Function() { // from class: org.xbill.DNS.DnssecAlgorithmOption$$ExternalSyntheticLambda2
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return sz3.onExtraCallbackWithResult.IAuthTabCallback(((Integer) obj).intValue());
                }
            };
        } else {
            throw new IllegalStateException("Unknown option code");
        }
        return "[" + ((String) this.algCodes.stream().map(function).collect(Collectors.joining(", "))) + "]";
    }
}
