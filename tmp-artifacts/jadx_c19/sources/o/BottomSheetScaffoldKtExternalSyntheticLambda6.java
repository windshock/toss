package o;

import java.util.NoSuchElementException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface BottomSheetScaffoldKtExternalSyntheticLambda6 {
    public static final BottomSheetScaffoldKtExternalSyntheticLambda6 onNavigationEvent = new BottomSheetScaffoldKtExternalSyntheticLambda6() { // from class: o.BottomSheetScaffoldKtExternalSyntheticLambda6.4
        @Override // o.BottomSheetScaffoldKtExternalSyntheticLambda6
        public boolean IAuthTabCallbackDefault() {
            return false;
        }

        @Override // o.BottomSheetScaffoldKtExternalSyntheticLambda6
        public long onExtraCallback() {
            throw new NoSuchElementException();
        }

        @Override // o.BottomSheetScaffoldKtExternalSyntheticLambda6
        public long onExtraCallbackWithResult() {
            throw new NoSuchElementException();
        }
    };

    boolean IAuthTabCallbackDefault();

    long onExtraCallback();

    long onExtraCallbackWithResult();
}
