package o;

import o.wbt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class vb {
    public static void IAuthTabCallback(wnd wndVar, qq qqVar) {
        oas.onExtraCallback(wndVar);
        oas.onExtraCallback(qqVar);
        qq qqVarOnExtraCallbackWithResult = qqVar;
        int i = 0;
        while (qqVarOnExtraCallbackWithResult != null) {
            qq qqVarRequestPostMessageChannelWithExtras = qqVarOnExtraCallbackWithResult.requestPostMessageChannelWithExtras();
            wndVar.onNavigationEvent(qqVarOnExtraCallbackWithResult, i);
            if (qqVarRequestPostMessageChannelWithExtras != null && !qqVarOnExtraCallbackWithResult.prefetch()) {
                qqVarOnExtraCallbackWithResult = qqVarRequestPostMessageChannelWithExtras.onExtraCallbackWithResult(qqVarOnExtraCallbackWithResult.validateRelationship());
            }
            if (qqVarOnExtraCallbackWithResult.cz_() > 0) {
                qqVarOnExtraCallbackWithResult = qqVarOnExtraCallbackWithResult.onExtraCallbackWithResult(0);
                i++;
            } else {
                while (qqVarOnExtraCallbackWithResult.receiveFile() == null && i > 0) {
                    wndVar.onExtraCallbackWithResult(qqVarOnExtraCallbackWithResult, i);
                    qqVarOnExtraCallbackWithResult = qqVarOnExtraCallbackWithResult.requestPostMessageChannelWithExtras();
                    i--;
                }
                wndVar.onExtraCallbackWithResult(qqVarOnExtraCallbackWithResult, i);
                if (qqVarOnExtraCallbackWithResult == qqVar) {
                    return;
                } else {
                    qqVarOnExtraCallbackWithResult = qqVarOnExtraCallbackWithResult.receiveFile();
                }
            }
        }
    }

    public static wbt.onExtraCallback onNavigationEvent(wbt wbtVar, qq qqVar) {
        qq qqVarOnExtraCallbackWithResult = qqVar;
        int i = 0;
        while (qqVarOnExtraCallbackWithResult != null) {
            wbt.onExtraCallback onExtraCallback = wbtVar.onExtraCallback(qqVarOnExtraCallbackWithResult, i);
            if (onExtraCallback == wbt.onExtraCallback.STOP) {
                return onExtraCallback;
            }
            if (onExtraCallback == wbt.onExtraCallback.CONTINUE && qqVarOnExtraCallbackWithResult.cz_() > 0) {
                qqVarOnExtraCallbackWithResult = qqVarOnExtraCallbackWithResult.onExtraCallbackWithResult(0);
                i++;
            } else {
                while (qqVarOnExtraCallbackWithResult.receiveFile() == null && i > 0) {
                    wbt.onExtraCallback onextracallback = wbt.onExtraCallback.CONTINUE;
                    if ((onExtraCallback == onextracallback || onExtraCallback == wbt.onExtraCallback.SKIP_CHILDREN) && (onExtraCallback = wbtVar.onExtraCallbackWithResult(qqVarOnExtraCallbackWithResult, i)) == wbt.onExtraCallback.STOP) {
                        return onExtraCallback;
                    }
                    qq qqVarRequestPostMessageChannelWithExtras = qqVarOnExtraCallbackWithResult.requestPostMessageChannelWithExtras();
                    i--;
                    if (onExtraCallback == wbt.onExtraCallback.REMOVE) {
                        qqVarOnExtraCallbackWithResult.prefetchWithMultipleUrls();
                    }
                    onExtraCallback = onextracallback;
                    qqVarOnExtraCallbackWithResult = qqVarRequestPostMessageChannelWithExtras;
                }
                if ((onExtraCallback == wbt.onExtraCallback.CONTINUE || onExtraCallback == wbt.onExtraCallback.SKIP_CHILDREN) && (onExtraCallback = wbtVar.onExtraCallbackWithResult(qqVarOnExtraCallbackWithResult, i)) == wbt.onExtraCallback.STOP) {
                    return onExtraCallback;
                }
                if (qqVarOnExtraCallbackWithResult == qqVar) {
                    return onExtraCallback;
                }
                qq qqVarReceiveFile = qqVarOnExtraCallbackWithResult.receiveFile();
                if (onExtraCallback == wbt.onExtraCallback.REMOVE) {
                    qqVarOnExtraCallbackWithResult.prefetchWithMultipleUrls();
                }
                qqVarOnExtraCallbackWithResult = qqVarReceiveFile;
            }
        }
        return wbt.onExtraCallback.CONTINUE;
    }
}
