package o;

import org.bson.json.RelaxedExtendedJsonDateTimeConverter;
import org.bson.json.RelaxedExtendedJsonDoubleConverter;
import org.bson.json.RelaxedExtendedJsonInt64Converter;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ltycx1 extends ok21 {
    private final dvycx<wiezb> ICustomTabsServiceDefault;
    private final dvycx<ObjectId> ICustomTabsServiceStub;
    private final dvycx<String> ICustomTabsServiceStubProxy;
    private final dvycx<p_> ICustomTabsService_Parcel;
    private final dvycx<String> IEngagementSignalsCallback;
    private final dvycx<jc4> IEngagementSignalsCallbackStub;
    private final dvycx<ea41> access200;
    private final dvycx<initOneSlotMultipleAdsLayoutLandscape> extraCommand;
    private final dvycx<Long> newAuthTabSession;
    private final boolean newSession;
    private final dvycx<Double> newSessionWithExtras;
    private final dvycx<Boolean> postMessage;
    private final dvycx<Decimal128> prefetch;
    private final dvycx<Long> prefetchWithMultipleUrls;
    private final String receiveFile;
    private final dvycx<Integer> requestPostMessageChannel;
    private final dvycx<String> requestPostMessageChannelWithExtras;
    private final dvycx<wie6> setEngagementSignalsCallback;
    private final dvycx<wiezb1> updateVisuals;
    private final int validateRelationship;
    private final String warmup;
    private final setShowAdInteractionView writeTypedList;
    private static final setVideoTrackListener writeTypedObject = new setVideoTrackListener();
    private static final getVideoAdListener ICustomTabsCallback = new getVideoAdListener();
    private static final hf2 IAuthTabCallback_Parcel = new hf2();
    private static final setLandingPageListener access100 = new setLandingPageListener();
    private static final sya23 onNavigationEvent = new sya23();
    private static final RelaxedExtendedJsonDoubleConverter onPostMessage = new RelaxedExtendedJsonDoubleConverter();
    private static final setRewardControlListener IAuthTabCallbackStubProxy = new setRewardControlListener();
    private static final sya22 onExtraCallbackWithResult = new sya22();
    private static final setShouldNotifyAdVisibility readTypedObject = new setShouldNotifyAdVisibility();
    private static final setNeedCheckingShow IAuthTabCallbackStub = new setNeedCheckingShow();
    private static final getClickCreativeListener onRelationshipValidationResult = new getClickCreativeListener();
    private static final setAdType asBinder = new setAdType();
    private static final ry24 ICustomTabsCallbackDefault = new ry24();
    private static final setHeartBeatListener getInterfaceDescriptor = new setHeartBeatListener();
    private static final getClickListener ICustomTabsService = new getClickListener();
    private static final htf11 extraCallbackWithResult = new htf11();
    private static final ycx22 onWarmupCompleted = new ycx22();
    private static final RelaxedExtendedJsonDateTimeConverter onActivityResized = new RelaxedExtendedJsonDateTimeConverter();
    private static final ry22 ICustomTabsCallbackStub = new ry22();
    private static final onFinishTemporaryDetach IAuthTabCallback = new onFinishTemporaryDetach();
    private static final getVideoController extraCallback = new getVideoController();
    private static final ry41 onActivityLayout = new ry41();
    private static final setRefClickViews IAuthTabCallbackDefault = new setRefClickViews();
    private static final RelaxedExtendedJsonInt64Converter onMinimized = new RelaxedExtendedJsonInt64Converter();
    private static final ry23 ICustomTabsCallbackStubProxy = new ry23();
    private static final ycx23 onExtraCallback = new ycx23();
    private static final getAdShowTime onUnminimized = new getAdShowTime();
    private static final setRefCreativeViews onTransact = new setRefCreativeViews();
    private static final getExpectExpressHeight ICustomTabsCallback_Parcel = new getExpectExpressHeight();
    private static final setDislikeClickListener access000 = new setDislikeClickListener();
    private static final getBrandBannerController mayLaunchUrl = new getBrandBannerController();
    private static final onStartTemporaryDetach asInterface = new onStartTemporaryDetach();
    private static final ry21 onMessageChannelReady = new ry21();
    private static final getClosedListenerKey isEngagementSignalsApiAvailable = new getClosedListenerKey();

    public static IAuthTabCallback IAuthTabCallback() {
        return new IAuthTabCallback();
    }

    @Deprecated
    public ltycx1() {
        this(IAuthTabCallback().onWarmupCompleted(setShowAdInteractionView.STRICT));
    }

    private ltycx1(IAuthTabCallback iAuthTabCallback) {
        this.newSession = iAuthTabCallback.onTransact;
        this.warmup = iAuthTabCallback.access000 != null ? iAuthTabCallback.access000 : System.getProperty("line.separator");
        this.receiveFile = iAuthTabCallback.asInterface;
        setShowAdInteractionView setshowadinteractionview = iAuthTabCallback.ICustomTabsCallback;
        this.writeTypedList = setshowadinteractionview;
        this.validateRelationship = iAuthTabCallback.getInterfaceDescriptor;
        if (iAuthTabCallback.access100 == null) {
            this.ICustomTabsServiceDefault = writeTypedObject;
        } else {
            this.ICustomTabsServiceDefault = iAuthTabCallback.access100;
        }
        if (iAuthTabCallback.extraCallbackWithResult == null) {
            this.ICustomTabsServiceStubProxy = ICustomTabsCallback;
        } else {
            this.ICustomTabsServiceStubProxy = iAuthTabCallback.extraCallbackWithResult;
        }
        if (iAuthTabCallback.IAuthTabCallback == null) {
            this.postMessage = IAuthTabCallback_Parcel;
        } else {
            this.postMessage = iAuthTabCallback.IAuthTabCallback;
        }
        if (iAuthTabCallback.onNavigationEvent == null) {
            if (setshowadinteractionview == setShowAdInteractionView.EXTENDED) {
                this.newSessionWithExtras = onNavigationEvent;
            } else if (setshowadinteractionview == setShowAdInteractionView.RELAXED) {
                this.newSessionWithExtras = onPostMessage;
            } else {
                this.newSessionWithExtras = access100;
            }
        } else {
            this.newSessionWithExtras = iAuthTabCallback.onNavigationEvent;
        }
        if (iAuthTabCallback.IAuthTabCallbackDefault == null) {
            if (setshowadinteractionview == setShowAdInteractionView.EXTENDED) {
                this.requestPostMessageChannel = onExtraCallbackWithResult;
            } else {
                this.requestPostMessageChannel = IAuthTabCallbackStubProxy;
            }
        } else {
            this.requestPostMessageChannel = iAuthTabCallback.IAuthTabCallbackDefault;
        }
        if (iAuthTabCallback.extraCallback == null) {
            this.IEngagementSignalsCallback = readTypedObject;
        } else {
            this.IEngagementSignalsCallback = iAuthTabCallback.extraCallback;
        }
        if (iAuthTabCallback.asBinder == null) {
            this.requestPostMessageChannelWithExtras = new getExpressVideoView();
        } else {
            this.requestPostMessageChannelWithExtras = iAuthTabCallback.asBinder;
        }
        if (iAuthTabCallback.IAuthTabCallbackStubProxy == null) {
            if (setshowadinteractionview == setShowAdInteractionView.STRICT || setshowadinteractionview == setShowAdInteractionView.EXTENDED || setshowadinteractionview == setShowAdInteractionView.RELAXED) {
                this.updateVisuals = IAuthTabCallbackStub;
            } else {
                this.updateVisuals = onRelationshipValidationResult;
            }
        } else {
            this.updateVisuals = iAuthTabCallback.IAuthTabCallbackStubProxy;
        }
        if (iAuthTabCallback.IAuthTabCallback_Parcel == null) {
            if (setshowadinteractionview == setShowAdInteractionView.STRICT || setshowadinteractionview == setShowAdInteractionView.EXTENDED || setshowadinteractionview == setShowAdInteractionView.RELAXED) {
                this.setEngagementSignalsCallback = asBinder;
            } else {
                this.setEngagementSignalsCallback = ICustomTabsCallbackDefault;
            }
        } else {
            this.setEngagementSignalsCallback = iAuthTabCallback.IAuthTabCallback_Parcel;
        }
        if (iAuthTabCallback.onMinimized == null) {
            if (setshowadinteractionview == setShowAdInteractionView.STRICT || setshowadinteractionview == setShowAdInteractionView.EXTENDED || setshowadinteractionview == setShowAdInteractionView.RELAXED) {
                this.IEngagementSignalsCallbackStub = getInterfaceDescriptor;
            } else {
                this.IEngagementSignalsCallbackStub = ICustomTabsService;
            }
        } else {
            this.IEngagementSignalsCallbackStub = iAuthTabCallback.onMinimized;
        }
        if (iAuthTabCallback.onWarmupCompleted == null) {
            if (setshowadinteractionview == setShowAdInteractionView.STRICT) {
                this.newAuthTabSession = extraCallbackWithResult;
            } else if (setshowadinteractionview == setShowAdInteractionView.EXTENDED) {
                this.newAuthTabSession = onWarmupCompleted;
            } else if (setshowadinteractionview == setShowAdInteractionView.RELAXED) {
                this.newAuthTabSession = onActivityResized;
            } else {
                this.newAuthTabSession = ICustomTabsCallbackStub;
            }
        } else {
            this.newAuthTabSession = iAuthTabCallback.onWarmupCompleted;
        }
        if (iAuthTabCallback.onExtraCallback == null) {
            if (setshowadinteractionview == setShowAdInteractionView.STRICT) {
                this.extraCommand = extraCallback;
            } else if (setshowadinteractionview == setShowAdInteractionView.EXTENDED || setshowadinteractionview == setShowAdInteractionView.RELAXED) {
                this.extraCommand = IAuthTabCallback;
            } else {
                this.extraCommand = onActivityLayout;
            }
        } else {
            this.extraCommand = iAuthTabCallback.onExtraCallback;
        }
        if (iAuthTabCallback.IAuthTabCallbackStub == null) {
            if (setshowadinteractionview == setShowAdInteractionView.STRICT || setshowadinteractionview == setShowAdInteractionView.EXTENDED) {
                this.prefetchWithMultipleUrls = IAuthTabCallbackDefault;
            } else if (setshowadinteractionview == setShowAdInteractionView.RELAXED) {
                this.prefetchWithMultipleUrls = onMinimized;
            } else {
                this.prefetchWithMultipleUrls = ICustomTabsCallbackStubProxy;
            }
        } else {
            this.prefetchWithMultipleUrls = iAuthTabCallback.IAuthTabCallbackStub;
        }
        if (iAuthTabCallback.onExtraCallbackWithResult == null) {
            if (setshowadinteractionview == setShowAdInteractionView.STRICT || setshowadinteractionview == setShowAdInteractionView.EXTENDED || setshowadinteractionview == setShowAdInteractionView.RELAXED) {
                this.prefetch = onExtraCallback;
            } else {
                this.prefetch = onUnminimized;
            }
        } else {
            this.prefetch = iAuthTabCallback.onExtraCallbackWithResult;
        }
        if (iAuthTabCallback.writeTypedObject == null) {
            if (setshowadinteractionview == setShowAdInteractionView.STRICT || setshowadinteractionview == setShowAdInteractionView.EXTENDED || setshowadinteractionview == setShowAdInteractionView.RELAXED) {
                this.ICustomTabsServiceStub = onTransact;
            } else {
                this.ICustomTabsServiceStub = ICustomTabsCallback_Parcel;
            }
        } else {
            this.ICustomTabsServiceStub = iAuthTabCallback.writeTypedObject;
        }
        if (iAuthTabCallback.onMessageChannelReady == null) {
            if (setshowadinteractionview == setShowAdInteractionView.STRICT || setshowadinteractionview == setShowAdInteractionView.EXTENDED || setshowadinteractionview == setShowAdInteractionView.RELAXED) {
                this.ICustomTabsService_Parcel = access000;
            } else {
                this.ICustomTabsService_Parcel = mayLaunchUrl;
            }
        } else {
            this.ICustomTabsService_Parcel = iAuthTabCallback.onMessageChannelReady;
        }
        if (iAuthTabCallback.readTypedObject == null) {
            if (setshowadinteractionview == setShowAdInteractionView.EXTENDED || setshowadinteractionview == setShowAdInteractionView.RELAXED) {
                this.access200 = asInterface;
                return;
            } else if (setshowadinteractionview == setShowAdInteractionView.STRICT) {
                this.access200 = onMessageChannelReady;
                return;
            } else {
                this.access200 = isEngagementSignalsApiAvailable;
                return;
            }
        }
        this.access200 = iAuthTabCallback.readTypedObject;
    }

    public boolean onPostMessage() {
        return this.newSession;
    }

    public String access100() {
        return this.warmup;
    }

    public String IAuthTabCallbackStub() {
        return this.receiveFile;
    }

    public setShowAdInteractionView extraCallbackWithResult() {
        return this.writeTypedList;
    }

    public int getInterfaceDescriptor() {
        return this.validateRelationship;
    }

    public dvycx<wiezb> writeTypedObject() {
        return this.ICustomTabsServiceDefault;
    }

    public dvycx<String> extraCallback() {
        return this.ICustomTabsServiceStubProxy;
    }

    public dvycx<initOneSlotMultipleAdsLayoutLandscape> onNavigationEvent() {
        return this.extraCommand;
    }

    public dvycx<Boolean> onExtraCallbackWithResult() {
        return this.postMessage;
    }

    public dvycx<Long> onWarmupCompleted() {
        return this.newAuthTabSession;
    }

    public dvycx<Double> onTransact() {
        return this.newSessionWithExtras;
    }

    public dvycx<Integer> asBinder() {
        return this.requestPostMessageChannel;
    }

    public dvycx<Long> IAuthTabCallbackDefault() {
        return this.prefetchWithMultipleUrls;
    }

    public dvycx<Decimal128> asInterface() {
        return this.prefetch;
    }

    public dvycx<ObjectId> ICustomTabsCallback() {
        return this.ICustomTabsServiceStub;
    }

    public dvycx<ea41> readTypedObject() {
        return this.access200;
    }

    public dvycx<p_> onMinimized() {
        return this.ICustomTabsService_Parcel;
    }

    public dvycx<String> onActivityLayout() {
        return this.IEngagementSignalsCallback;
    }

    public dvycx<wiezb1> access000() {
        return this.updateVisuals;
    }

    public dvycx<wie6> IAuthTabCallback_Parcel() {
        return this.setEngagementSignalsCallback;
    }

    public dvycx<jc4> onMessageChannelReady() {
        return this.IEngagementSignalsCallbackStub;
    }

    public dvycx<String> IAuthTabCallbackStubProxy() {
        return this.requestPostMessageChannelWithExtras;
    }

    public static final class IAuthTabCallback {
        private dvycx<Boolean> IAuthTabCallback;
        private dvycx<Integer> IAuthTabCallbackDefault;
        private dvycx<Long> IAuthTabCallbackStub;
        private dvycx<wiezb1> IAuthTabCallbackStubProxy;
        private dvycx<wie6> IAuthTabCallback_Parcel;
        private setShowAdInteractionView ICustomTabsCallback;
        private String access000;
        private dvycx<wiezb> access100;
        private dvycx<String> asBinder;
        private String asInterface;
        private dvycx<String> extraCallback;
        private dvycx<String> extraCallbackWithResult;
        private int getInterfaceDescriptor;
        private dvycx<initOneSlotMultipleAdsLayoutLandscape> onExtraCallback;
        private dvycx<Decimal128> onExtraCallbackWithResult;
        private dvycx<p_> onMessageChannelReady;
        private dvycx<jc4> onMinimized;
        private dvycx<Double> onNavigationEvent;
        private boolean onTransact;
        private dvycx<Long> onWarmupCompleted;
        private dvycx<ea41> readTypedObject;
        private dvycx<ObjectId> writeTypedObject;

        public IAuthTabCallback onWarmupCompleted(setShowAdInteractionView setshowadinteractionview) {
            pmi10.onExtraCallbackWithResult("outputMode", setshowadinteractionview);
            this.ICustomTabsCallback = setshowadinteractionview;
            return this;
        }

        private IAuthTabCallback() {
            this.access000 = System.getProperty("line.separator");
            this.asInterface = "  ";
            this.ICustomTabsCallback = setShowAdInteractionView.RELAXED;
        }
    }
}
