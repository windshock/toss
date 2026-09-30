package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PAGAdWrapperListener {

    public static class onExtraCallbackWithResult {
        private final String onExtraCallback;
        private byte[] onExtraCallbackWithResult;

        public String onExtraCallbackWithResult() {
            return this.onExtraCallback;
        }

        public String toString() {
            return this.onExtraCallback;
        }
    }

    public static class onExtraCallback {
        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int onWarmupCompleted(getNetworkExtrasBundle getnetworkextrasbundle) {
            return getnetworkextrasbundle.b.length;
        }

        public static /* synthetic */ int onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult) {
            return onextracallbackwithresult.onExtraCallbackWithResult.length;
        }
    }
}
