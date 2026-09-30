package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class PAGBannerAdWrapperListener extends getCurrentOrientationInlineAdaptiveBannerAdSize {

    public static class onExtraCallbackWithResult {
        private final ISDKTypeFactory[] IAuthTabCallback;
        private int asBinder;
        private int[] onExtraCallback;
        private final int onExtraCallbackWithResult;
        private final ISDKTypeFactory onNavigationEvent;
        private final IAuthTabCallback[] onWarmupCompleted;

        public onExtraCallbackWithResult(int i, ISDKTypeFactory iSDKTypeFactory, ISDKTypeFactory[] iSDKTypeFactoryArr, IAuthTabCallback[] iAuthTabCallbackArr) {
            this.onExtraCallbackWithResult = i;
            this.onNavigationEvent = iSDKTypeFactory;
            this.IAuthTabCallback = iSDKTypeFactoryArr;
            this.onWarmupCompleted = iAuthTabCallbackArr;
        }

        public int onNavigationEvent() {
            int iOnWarmupCompleted = 4;
            for (int i = 0; i < this.onExtraCallbackWithResult; i++) {
                iOnWarmupCompleted = iOnWarmupCompleted + 2 + this.onWarmupCompleted[i].onWarmupCompleted();
            }
            return iOnWarmupCompleted;
        }

        public void onWarmupCompleted(createRewardAdLoader createrewardadloader) {
            this.onNavigationEvent.onExtraCallback(createrewardadloader);
            this.asBinder = createrewardadloader.IAuthTabCallback(this.onNavigationEvent);
            this.onExtraCallback = new int[this.onExtraCallbackWithResult];
            int i = 0;
            while (true) {
                ISDKTypeFactory[] iSDKTypeFactoryArr = this.IAuthTabCallback;
                if (i >= iSDKTypeFactoryArr.length) {
                    return;
                }
                iSDKTypeFactoryArr[i].onExtraCallback(createrewardadloader);
                this.onExtraCallback[i] = createrewardadloader.IAuthTabCallback(this.IAuthTabCallback[i]);
                this.onWarmupCompleted[i].onExtraCallback(createrewardadloader);
                i++;
            }
        }
    }

    public static class IAuthTabCallback {
        private int onExtraCallback = -1;
        private final Object onExtraCallbackWithResult;
        private final int onWarmupCompleted;

        public IAuthTabCallback(int i, Object obj) {
            this.onWarmupCompleted = i;
            this.onExtraCallbackWithResult = obj;
        }

        public int onWarmupCompleted() {
            int i = this.onWarmupCompleted;
            if (i == 64) {
                return ((onExtraCallbackWithResult) this.onExtraCallbackWithResult).onNavigationEvent() + 1;
            }
            int iOnWarmupCompleted = 3;
            if (i != 70 && i != 83 && i != 99) {
                if (i == 101) {
                    return 5;
                }
                if (i != 115 && i != 73 && i != 74 && i != 90) {
                    if (i == 91) {
                        for (IAuthTabCallback iAuthTabCallback : (IAuthTabCallback[]) this.onExtraCallbackWithResult) {
                            iOnWarmupCompleted += iAuthTabCallback.onWarmupCompleted();
                        }
                        return iOnWarmupCompleted;
                    }
                    switch (i) {
                        case 66:
                        case 67:
                        case 68:
                            break;
                        default:
                            return 0;
                    }
                }
            }
            return 3;
        }

        public void onExtraCallback(createRewardAdLoader createrewardadloader) {
            Object obj = this.onExtraCallbackWithResult;
            if (obj instanceof setBannerSize) {
                ((setBannerSize) obj).onExtraCallback(createrewardadloader);
                this.onExtraCallback = createrewardadloader.IAuthTabCallback((setBannerSize) this.onExtraCallbackWithResult);
                return;
            }
            if (obj instanceof PAGBiddingRequest) {
                ((PAGBiddingRequest) obj).onExtraCallback(createrewardadloader);
                this.onExtraCallback = createrewardadloader.IAuthTabCallback((PAGBiddingRequest) this.onExtraCallbackWithResult);
                return;
            }
            if (obj instanceof ISDKTypeFactory) {
                ((ISDKTypeFactory) obj).onExtraCallback(createrewardadloader);
                this.onExtraCallback = createrewardadloader.IAuthTabCallback((ISDKTypeFactory) this.onExtraCallbackWithResult);
                return;
            }
            if (obj instanceof IADTypeLoaderFactory) {
                ((IADTypeLoaderFactory) obj).onExtraCallback(createrewardadloader);
                return;
            }
            if (obj instanceof onExtraCallbackWithResult) {
                ((onExtraCallbackWithResult) obj).onWarmupCompleted(createrewardadloader);
                return;
            }
            if (obj instanceof IAuthTabCallback[]) {
                for (IAuthTabCallback iAuthTabCallback : (IAuthTabCallback[]) obj) {
                    iAuthTabCallback.onExtraCallback(createrewardadloader);
                }
            }
        }
    }
}
