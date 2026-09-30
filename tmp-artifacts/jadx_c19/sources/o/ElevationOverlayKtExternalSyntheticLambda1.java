package o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ElevationOverlayKtExternalSyntheticLambda1 {
    private static final Pattern onExtraCallback = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int IAuthTabCallback = -1;
    public int onWarmupCompleted = -1;

    public boolean onWarmupCompleted(HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0) {
        for (int i2 = 0; i2 < handwritingHandlerNodeExternalSyntheticLambda0.onExtraCallback(); i2++) {
            HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback IAuthTabCallback = handwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback(i2);
            if (IAuthTabCallback instanceof ModalBottomSheetKtExternalSyntheticLambda4) {
                ModalBottomSheetKtExternalSyntheticLambda4 modalBottomSheetKtExternalSyntheticLambda4 = (ModalBottomSheetKtExternalSyntheticLambda4) IAuthTabCallback;
                if ("iTunSMPB".equals(modalBottomSheetKtExternalSyntheticLambda4.IAuthTabCallback) && onExtraCallbackWithResult(modalBottomSheetKtExternalSyntheticLambda4.onExtraCallbackWithResult)) {
                    return true;
                }
            } else if (IAuthTabCallback instanceof ModalBottomSheetKtExternalSyntheticLambda7) {
                ModalBottomSheetKtExternalSyntheticLambda7 modalBottomSheetKtExternalSyntheticLambda7 = (ModalBottomSheetKtExternalSyntheticLambda7) IAuthTabCallback;
                if ("com.apple.iTunes".equals(modalBottomSheetKtExternalSyntheticLambda7.onExtraCallback) && "iTunSMPB".equals(modalBottomSheetKtExternalSyntheticLambda7.IAuthTabCallback) && onExtraCallbackWithResult(modalBottomSheetKtExternalSyntheticLambda7.onNavigationEvent)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private boolean onExtraCallbackWithResult(String str) throws NumberFormatException {
        Matcher matcher = onExtraCallback.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            Object[] objArr = {matcher.group(1)};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            Object objOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742);
            Object obj = objOnNavigationEvent;
            int i2 = Integer.parseInt((String) objOnNavigationEvent, 16);
            Object[] objArr2 = {matcher.group(2)};
            int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            Object objOnNavigationEvent2 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, objArr2, -1084655742);
            Object obj2 = objOnNavigationEvent2;
            int i3 = Integer.parseInt((String) objOnNavigationEvent2, 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.IAuthTabCallback = i2;
            this.onWarmupCompleted = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean onExtraCallback() {
        return (this.IAuthTabCallback == -1 || this.onWarmupCompleted == -1) ? false : true;
    }
}
