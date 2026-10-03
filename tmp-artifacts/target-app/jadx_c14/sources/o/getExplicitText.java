package o;

import kotlin.NoWhenBranchMatchedException;
import o.doMakeLoader;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getExplicitText {

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[doMakeLoader.onExtraCallback.values().length];
            try {
                iArr[doMakeLoader.onExtraCallback.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[doMakeLoader.onExtraCallback.BOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final response onNavigationEvent(doMakeLoader domakeloader) throws NoWhenBranchMatchedException {
        int i = onNavigationEvent.onNavigationEvent[domakeloader.onExtraCallbackWithResult().ordinal()];
        if (i == 1) {
            return response.Regular;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return response.Bold;
    }
}
