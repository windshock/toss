package o;

import im.toss.observability.instrumentation.memory.PssReader$;
import im.toss.tds.view.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class y2 {
    private static int MediaSessionCompatToken = 1;
    private static int RatingCompatStyle;
    private final long AudioAttributesCompatParcelizer;
    private final long AudioAttributesImplApi21Parcelizer;
    private final long AudioAttributesImplApi26Parcelizer;
    private final long AudioAttributesImplBaseParcelizer;
    private final long IAuthTabCallback;
    private final long IAuthTabCallbackDefault;
    private final long IAuthTabCallbackStub;
    private r8lambdaBh8wf1u761UxGMlBMuxJ2edovsM IAuthTabCallbackStubProxy;
    private setViewableMRC100Requests IAuthTabCallback_Parcel;
    private AppLovinNativeAdImplExternalSyntheticLambda11 ICustomTabsCallback;
    private setClickTrackingRequests ICustomTabsCallbackDefault;
    private r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI ICustomTabsCallbackStub;
    private AppLovinNativeAdImplExternalSyntheticLambda11 ICustomTabsCallbackStubProxy;
    private v0a ICustomTabsCallback_Parcel;
    private AppLovinVastMediaViewb ICustomTabsService;
    private final long ICustomTabsServiceDefault;
    private final long ICustomTabsServiceStub;
    private final long ICustomTabsServiceStubProxy;
    private final long ICustomTabsService_Parcel;
    private final long IEngagementSignalsCallback;
    private final long IEngagementSignalsCallbackDefault;
    private final long IEngagementSignalsCallbackStub;
    private final long IEngagementSignalsCallbackStubProxy;
    private final long IEngagementSignalsCallback_Parcel;
    private final long IPostMessageService;
    private final long IPostMessageServiceDefault;
    private final long IPostMessageServiceStub;
    private final long IPostMessageServiceStubProxy;
    private final long IPostMessageService_Parcel;
    private final long ITrustedWebActivityCallback;
    private final long ITrustedWebActivityCallbackDefault;
    private final long ITrustedWebActivityCallbackStub;
    private final long ITrustedWebActivityCallbackStubProxy;
    private final long ITrustedWebActivityCallback_Parcel;
    private final long ITrustedWebActivityService;
    private final long ITrustedWebActivityServiceDefault;
    private final long ITrustedWebActivityServiceStub;
    private final long ITrustedWebActivityServiceStubProxy;
    private final addFixedPosition ITrustedWebActivityService_Parcel;
    private final long IconCompatParcelizer;
    private final long MediaBrowserCompatMediaItem;
    private final long MediaDescriptionCompat;
    private final long MediaMetadataCompat;
    private final long MediaSessionCompatQueueItem;
    private final long RatingCompat;
    private final long RatingCompat1;
    private final long RatingCompatApi19Impl;
    private final long RatingCompatStarStyle;
    private final long RemoteActionCompatParcelizer;
    private setViewableMRC100Requests access000;
    private AppLovinNativeAdImplExternalSyntheticLambda11 access100;
    private final long access200;
    private final long areNotificationsEnabled;
    private final long asBinder;
    private final NestfgetadViewWrapper asInterface;
    private final long cancelNotification;
    private setClickDestinationBackupUri extraCallback;
    private AppLovinNativeAdImplExternalSyntheticLambda11 extraCallbackWithResult;
    private AppLovinNativeAdImplExternalSyntheticLambda11 extraCommand;
    private final long getActiveNotifications;
    private setClickTrackingRequests getInterfaceDescriptor;
    private final long getSmallIconBitmap;
    private final long getSmallIconId;
    private x2ExternalSyntheticLambda33 isEngagementSignalsApiAvailable;
    private showMediaImageView mayLaunchUrl;
    private setClickDestinationBackupUri newAuthTabSession;
    private AppLovinNativeAdImplExternalSyntheticLambda11 newSession;
    private setClickDestinationBackupUri newSessionWithExtras;
    private final long notifyNotificationWithChannel;
    private setClickDestinationBackupUri onActivityLayout;
    private setClickDestinationBackupUri onActivityResized;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onGreatestScrollPercentageIncreased;
    private setViewableMRC100Requests onMessageChannelReady;
    private AppLovinNativeAdImplExternalSyntheticLambda11 onMinimized;
    private final long onNavigationEvent;
    private v0a onPostMessage;
    private r8lambdaCPfbr3F4RI0PHZL8V6jqNiItG7U onRelationshipValidationResult;
    private final long onSessionEnded;
    private final long onTransact;
    private AppLovinNativeAdImplExternalSyntheticLambda11 onUnminimized;
    private final long onVerticalScrollEvent;
    private final long onWarmupCompleted;
    private AppLovinNativeAdImplExternalSyntheticLambda11 postMessage;
    private setClickDestinationBackupUri prefetch;
    private v0a prefetchWithMultipleUrls;
    private final long read;
    private setClickDestinationBackupUri readTypedObject;
    private setClickDestinationBackupUri receiveFile;
    private AppLovinNativeAdImplExternalSyntheticLambda11 requestPostMessageChannel;
    private AppLovinNativeAdImplExternalSyntheticLambda11 requestPostMessageChannelWithExtras;
    private AppLovinNativeAdImplExternalSyntheticLambda11 setEngagementSignalsCallback;
    private final long updateVisuals;
    private final long validateRelationship;
    private final long warmup;
    private final long write;
    private final long writeTypedList;
    private v0a writeTypedObject;

    public /* synthetic */ y2(addFixedPosition addfixedposition, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61, long j62, NestfgetadViewWrapper nestfgetadViewWrapper, DefaultConstructorMarker defaultConstructorMarker) {
        this(addfixedposition, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, j50, j51, j52, j53, j54, j55, j56, j57, j58, j59, j60, j61, j62, nestfgetadViewWrapper);
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~i3;
        int i11 = i9 | (~(i8 | i10));
        int i12 = ~(i3 | i2 | i5);
        int i13 = i11 | i12;
        int i14 = i10 | i2;
        int i15 = i2 + i5 + i4 + (112060874 * i) + ((-1891258303) * i6);
        int i16 = i15 * i15;
        int i17 = (i2 * 1286644997) + 1783103488 + (1286644997 * i5) + (i13 * (-1821943044)) + ((-651081208) * i12) + ((-1821943044) * i14) + ((-535298048) * i4) + ((-1427111936) * i) + (1712848896 * i6) + (159514624 * i16);
        int i18 = ((i2 * (-1669307009)) - 1771304782) + (i5 * (-1669307009)) + (i13 * 564) + (i12 * (-1128)) + (i14 * 564) + (i4 * (-1669306445)) + (i * (-1582645698)) + (i6 * (-198941581)) + (i16 * (-203030528));
        switch (i17 + (i18 * i18 * (-2008154112))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return asBinder(objArr);
            case 10:
                y2 y2Var = (y2) objArr[0];
                int i19 = 2 % 2;
                int i20 = MediaSessionCompatToken + 3;
                int i21 = i20 % 128;
                RatingCompatStyle = i21;
                int i22 = i20 % 2;
                long j = y2Var.access200;
                int i23 = i21 + 13;
                MediaSessionCompatToken = i23 % 128;
                int i24 = i23 % 2;
                return Long.valueOf(j);
            case 11:
                return IAuthTabCallbackStub(objArr);
            case 12:
                return getInterfaceDescriptor(objArr);
            case 13:
                return access000(objArr);
            case 14:
                return access100(objArr);
            case 15:
                return IAuthTabCallbackStubProxy(objArr);
            case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                return IAuthTabCallback_Parcel(objArr);
            case R.styleable.TdsListRowV1View_centerType /* 17 */:
                return readTypedObject(objArr);
            case R.styleable.TdsListRowV1View_disabledType /* 18 */:
                return extraCallbackWithResult(objArr);
            case R.styleable.TdsListRowV1View_leftDate /* 19 */:
                return ICustomTabsCallback(objArr);
            case R.styleable.TdsListRowV1View_leftImage /* 20 */:
                return extraCallback(objArr);
            case R.styleable.TdsListRowV1View_leftImageColor /* 21 */:
                return writeTypedObject(objArr);
            case R.styleable.TdsListRowV1View_leftImageHeight /* 22 */:
                return onMessageChannelReady(objArr);
            case R.styleable.TdsListRowV1View_leftImageType /* 23 */:
                return onActivityLayout(objArr);
            case R.styleable.TdsListRowV1View_leftImageUrl /* 24 */:
                return onActivityResized(objArr);
            case R.styleable.TdsListRowV1View_leftImageWidth /* 25 */:
                y2 y2Var2 = (y2) objArr[0];
                int i25 = 2 % 2;
                int i26 = MediaSessionCompatToken;
                int i27 = i26 + 9;
                RatingCompatStyle = i27 % 128;
                int i28 = i27 % 2;
                AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11 = y2Var2.ICustomTabsCallback;
                int i29 = i26 + 13;
                RatingCompatStyle = i29 % 128;
                int i30 = i29 % 2;
                return appLovinNativeAdImplExternalSyntheticLambda11;
            default:
                y2 y2Var3 = (y2) objArr[0];
                int i31 = 2 % 2;
                int i32 = RatingCompatStyle;
                int i33 = i32 + 41;
                MediaSessionCompatToken = i33 % 128;
                int i34 = i33 % 2;
                setClickDestinationBackupUri setclickdestinationbackupuri = y2Var3.prefetch;
                int i35 = i32 + 57;
                MediaSessionCompatToken = i35 % 128;
                int i36 = i35 % 2;
                return setclickdestinationbackupuri;
        }
    }

    private y2(addFixedPosition addfixedposition, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61, long j62, NestfgetadViewWrapper nestfgetadViewWrapper) {
        Intrinsics.checkNotNullParameter(addfixedposition, "");
        Intrinsics.checkNotNullParameter(nestfgetadViewWrapper, "");
        this.ITrustedWebActivityService_Parcel = addfixedposition;
        this.IAuthTabCallbackDefault = j;
        this.onExtraCallback = j2;
        this.IAuthTabCallback = j3;
        this.onNavigationEvent = j4;
        this.onExtraCallbackWithResult = j5;
        this.onWarmupCompleted = j6;
        this.getSmallIconId = j7;
        this.ITrustedWebActivityCallbackStub = j8;
        this.getActiveNotifications = j9;
        this.areNotificationsEnabled = j10;
        this.notifyNotificationWithChannel = j11;
        this.ITrustedWebActivityServiceDefault = j12;
        this.ITrustedWebActivityCallback_Parcel = j13;
        this.IPostMessageService_Parcel = j14;
        this.ITrustedWebActivityCallbackStubProxy = j15;
        this.cancelNotification = j16;
        this.ITrustedWebActivityService = j17;
        this.getSmallIconBitmap = j18;
        this.AudioAttributesImplBaseParcelizer = j19;
        this.AudioAttributesImplApi21Parcelizer = j20;
        this.RatingCompat1 = j21;
        this.RatingCompatApi19Impl = j22;
        this.IconCompatParcelizer = j23;
        this.MediaMetadataCompat = j24;
        this.MediaSessionCompatQueueItem = j25;
        this.write = j26;
        this.MediaBrowserCompatMediaItem = j27;
        this.RatingCompatStarStyle = j28;
        this.MediaDescriptionCompat = j29;
        this.RatingCompat = j30;
        this.validateRelationship = j31;
        this.warmup = j32;
        this.IPostMessageService = j33;
        this.IPostMessageServiceStub = j34;
        this.ITrustedWebActivityCallback = j35;
        this.IPostMessageServiceStubProxy = j36;
        this.ICustomTabsService_Parcel = j37;
        this.writeTypedList = j38;
        this.onSessionEnded = j39;
        this.IEngagementSignalsCallbackStub = j40;
        this.onVerticalScrollEvent = j41;
        this.IEngagementSignalsCallbackDefault = j42;
        this.IEngagementSignalsCallback_Parcel = j43;
        this.ICustomTabsServiceStub = j44;
        this.updateVisuals = j45;
        this.ICustomTabsServiceDefault = j46;
        this.IEngagementSignalsCallbackStubProxy = j47;
        this.access200 = j48;
        this.IEngagementSignalsCallback = j49;
        this.ICustomTabsServiceStubProxy = j50;
        this.onGreatestScrollPercentageIncreased = j51;
        this.IPostMessageServiceDefault = j52;
        this.ITrustedWebActivityCallbackDefault = j53;
        this.asBinder = j54;
        this.onTransact = j55;
        this.IAuthTabCallbackStub = j56;
        this.AudioAttributesImplApi26Parcelizer = j57;
        this.ITrustedWebActivityServiceStub = j58;
        this.AudioAttributesCompatParcelizer = j59;
        this.RemoteActionCompatParcelizer = j60;
        this.ITrustedWebActivityServiceStubProxy = j61;
        this.read = j62;
        this.asInterface = nestfgetadViewWrapper;
    }

    public final addFixedPosition ITrustedWebActivityServiceStubProxy() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 39;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        addFixedPosition addfixedposition = this.ITrustedWebActivityService_Parcel;
        int i5 = i3 + 9;
        RatingCompatStyle = i5 % 128;
        if (i5 % 2 == 0) {
            return addfixedposition;
        }
        throw null;
    }

    public final long onTransact() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 67;
        MediaSessionCompatToken = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.IAuthTabCallbackDefault;
        int i4 = i2 + 17;
        MediaSessionCompatToken = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return j;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 111;
        int i3 = i2 % 128;
        RatingCompatStyle = i3;
        int i4 = i2 % 2;
        long j = this.onExtraCallback;
        int i5 = i3 + 3;
        MediaSessionCompatToken = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 25;
        RatingCompatStyle = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 9;
        int i3 = i2 % 128;
        RatingCompatStyle = i3;
        int i4 = i2 % 2;
        long j = this.onNavigationEvent;
        int i5 = i3 + 51;
        MediaSessionCompatToken = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 35;
        RatingCompatStyle = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onExtraCallbackWithResult;
        int i5 = i2 + 75;
        RatingCompatStyle = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 45;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        long j = this.onWarmupCompleted;
        if (i4 == 0) {
            int i5 = 21 / 0;
        }
        int i6 = i3 + 21;
        RatingCompatStyle = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    public final long ITrustedWebActivityServiceDefault() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 83;
        RatingCompatStyle = i3 % 128;
        int i4 = i3 % 2;
        long j = this.getSmallIconId;
        int i5 = i2 + 61;
        RatingCompatStyle = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long ITrustedWebActivityCallbackDefault() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 27;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        long j = this.ITrustedWebActivityCallbackStub;
        int i4 = i3 + 49;
        RatingCompatStyle = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long getSmallIconId() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 31;
        RatingCompatStyle = i3 % 128;
        int i4 = i3 % 2;
        long j = this.getActiveNotifications;
        int i5 = i2 + 119;
        RatingCompatStyle = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return j;
    }

    public final long cancelNotification() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 71;
        MediaSessionCompatToken = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        long j = this.areNotificationsEnabled;
        int i4 = i2 + 77;
        MediaSessionCompatToken = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        y2 y2Var = (y2) objArr[0];
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 89;
        int i3 = i2 % 128;
        RatingCompatStyle = i3;
        int i4 = i2 % 2;
        long j = y2Var.notifyNotificationWithChannel;
        if (i4 != 0) {
            int i5 = 54 / 0;
        }
        int i6 = i3 + 15;
        MediaSessionCompatToken = i6 % 128;
        int i7 = i6 % 2;
        return Long.valueOf(j);
    }

    public final long getSmallIconBitmap() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 69;
        RatingCompatStyle = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ITrustedWebActivityServiceDefault;
        }
        int i3 = 66 / 0;
        return this.ITrustedWebActivityServiceDefault;
    }

    public final long areNotificationsEnabled() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 39;
        int i3 = i2 % 128;
        RatingCompatStyle = i3;
        int i4 = i2 % 2;
        long j = this.ITrustedWebActivityCallback_Parcel;
        int i5 = i3 + 3;
        MediaSessionCompatToken = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long ITrustedWebActivityCallbackStub() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 17;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        long j = this.IPostMessageService_Parcel;
        int i5 = i3 + 79;
        RatingCompatStyle = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        long j;
        y2 y2Var = (y2) objArr[0];
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 121;
        RatingCompatStyle = i2 % 128;
        if (i2 % 2 != 0) {
            j = y2Var.ITrustedWebActivityCallbackStubProxy;
            int i3 = 0 / 0;
        } else {
            j = y2Var.ITrustedWebActivityCallbackStubProxy;
        }
        return Long.valueOf(j);
    }

    public final long ITrustedWebActivityService() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 81;
        MediaSessionCompatToken = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.cancelNotification;
        int i4 = i2 + 55;
        MediaSessionCompatToken = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long ITrustedWebActivityCallback_Parcel() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 51;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        long j = this.ITrustedWebActivityService;
        int i4 = i3 + 37;
        RatingCompatStyle = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        y2 y2Var = (y2) objArr[0];
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 17;
        RatingCompatStyle = i2 % 128;
        if (i2 % 2 == 0) {
            return Long.valueOf(y2Var.getSmallIconBitmap);
        }
        long j = y2Var.getSmallIconBitmap;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 43;
        int i3 = i2 % 128;
        RatingCompatStyle = i3;
        int i4 = i2 % 2;
        long j = this.AudioAttributesImplBaseParcelizer;
        int i5 = i3 + 9;
        MediaSessionCompatToken = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 125;
        RatingCompatStyle = i3 % 128;
        int i4 = i3 % 2;
        long j = this.AudioAttributesImplApi21Parcelizer;
        int i5 = i2 + 45;
        RatingCompatStyle = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long RatingCompatApi19Impl() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 101;
        RatingCompatStyle = i3 % 128;
        int i4 = i3 % 2;
        long j = this.RatingCompat1;
        int i5 = i2 + 93;
        RatingCompatStyle = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return j;
    }

    public final long MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 97;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        long j = this.RatingCompatApi19Impl;
        int i5 = i3 + 3;
        RatingCompatStyle = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        y2 y2Var = (y2) objArr[0];
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 107;
        int i3 = i2 % 128;
        RatingCompatStyle = i3;
        int i4 = i2 % 2;
        long j = y2Var.IconCompatParcelizer;
        int i5 = i3 + 51;
        MediaSessionCompatToken = i5 % 128;
        if (i5 % 2 != 0) {
            return Long.valueOf(j);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long RatingCompat() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 105;
        MediaSessionCompatToken = i3 % 128;
        int i4 = i3 % 2;
        long j = this.MediaMetadataCompat;
        int i5 = i2 + 5;
        MediaSessionCompatToken = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long RatingCompatStarStyle() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 1;
        RatingCompatStyle = i2 % 128;
        if (i2 % 2 == 0) {
            return this.MediaSessionCompatQueueItem;
        }
        int i3 = 0 / 0;
        return this.MediaSessionCompatQueueItem;
    }

    public final long write() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 7;
        MediaSessionCompatToken = i3 % 128;
        int i4 = i3 % 2;
        long j = this.write;
        int i5 = i2 + 115;
        MediaSessionCompatToken = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 53;
        MediaSessionCompatToken = i3 % 128;
        int i4 = i3 % 2;
        long j = this.MediaBrowserCompatMediaItem;
        int i5 = i2 + 27;
        MediaSessionCompatToken = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long RatingCompat1() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 11;
        MediaSessionCompatToken = i3 % 128;
        int i4 = i3 % 2;
        long j = this.RatingCompatStarStyle;
        int i5 = i2 + 17;
        MediaSessionCompatToken = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
        return j;
    }

    public final long MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 69;
        int i3 = i2 % 128;
        RatingCompatStyle = i3;
        int i4 = i2 % 2;
        long j = this.MediaDescriptionCompat;
        int i5 = i3 + 25;
        MediaSessionCompatToken = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 56 / 0;
        }
        return j;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        y2 y2Var = (y2) objArr[0];
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 11;
        RatingCompatStyle = i3 % 128;
        int i4 = i3 % 2;
        long j = y2Var.RatingCompat;
        int i5 = i2 + 111;
        RatingCompatStyle = i5 % 128;
        if (i5 % 2 == 0) {
            return Long.valueOf(j);
        }
        int i6 = 26 / 0;
        return Long.valueOf(j);
    }

    public final long warmup() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 15;
        RatingCompatStyle = i3 % 128;
        int i4 = i3 % 2;
        long j = this.validateRelationship;
        int i5 = i2 + 75;
        RatingCompatStyle = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        y2 y2Var = (y2) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 77;
        MediaSessionCompatToken = i3 % 128;
        int i4 = i3 % 2;
        long j = y2Var.warmup;
        int i5 = i2 + 75;
        MediaSessionCompatToken = i5 % 128;
        int i6 = i5 % 2;
        return Long.valueOf(j);
    }

    public final long IPostMessageService() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 19;
        int i3 = i2 % 128;
        RatingCompatStyle = i3;
        int i4 = i2 % 2;
        long j = this.IPostMessageService;
        if (i4 != 0) {
            int i5 = 62 / 0;
        }
        int i6 = i3 + 71;
        MediaSessionCompatToken = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 32 / 0;
        }
        return j;
    }

    public final long IEngagementSignalsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 81;
        int i3 = i2 % 128;
        RatingCompatStyle = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.IPostMessageServiceStub;
        int i4 = i3 + 47;
        MediaSessionCompatToken = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long ITrustedWebActivityCallback() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 93;
        MediaSessionCompatToken = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ITrustedWebActivityCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long IPostMessageServiceStubProxy() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 99;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        long j = this.IPostMessageServiceStubProxy;
        int i5 = i3 + 79;
        RatingCompatStyle = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 49;
        RatingCompatStyle = i3 % 128;
        int i4 = i3 % 2;
        long j = this.ICustomTabsService_Parcel;
        int i5 = i2 + 59;
        RatingCompatStyle = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long writeTypedList() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 101;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        long j = this.writeTypedList;
        if (i4 == 0) {
            int i5 = 28 / 0;
        }
        int i6 = i3 + 75;
        RatingCompatStyle = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 49 / 0;
        }
        return j;
    }

    public final long IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 51;
        RatingCompatStyle = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onSessionEnded;
        int i5 = i2 + 53;
        RatingCompatStyle = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long onSessionEnded() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 69;
        RatingCompatStyle = i3 % 128;
        int i4 = i3 % 2;
        long j = this.IEngagementSignalsCallbackStub;
        int i5 = i2 + 17;
        RatingCompatStyle = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return j;
    }

    public final long IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 61;
        MediaSessionCompatToken = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onVerticalScrollEvent;
        }
        int i3 = 70 / 0;
        return this.onVerticalScrollEvent;
    }

    public final long onVerticalScrollEvent() {
        long j;
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 13;
        MediaSessionCompatToken = i3 % 128;
        if (i3 % 2 == 0) {
            j = this.IEngagementSignalsCallbackDefault;
            int i4 = 36 / 0;
        } else {
            j = this.IEngagementSignalsCallbackDefault;
        }
        int i5 = i2 + 85;
        MediaSessionCompatToken = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IPostMessageServiceStub() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 75;
        int i3 = i2 % 128;
        RatingCompatStyle = i3;
        int i4 = i2 % 2;
        long j = this.IEngagementSignalsCallback_Parcel;
        int i5 = i3 + 83;
        MediaSessionCompatToken = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long updateVisuals() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 107;
        MediaSessionCompatToken = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ICustomTabsServiceStub;
        }
        throw null;
    }

    public final long ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 93;
        RatingCompatStyle = i2 % 128;
        if (i2 % 2 == 0) {
            return this.updateVisuals;
        }
        throw null;
    }

    public final long ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 83;
        RatingCompatStyle = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ICustomTabsServiceDefault;
        }
        int i3 = 42 / 0;
        return this.ICustomTabsServiceDefault;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        long j;
        y2 y2Var = (y2) objArr[0];
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 31;
        RatingCompatStyle = i3 % 128;
        if (i3 % 2 != 0) {
            j = y2Var.IEngagementSignalsCallbackStubProxy;
            int i4 = 52 / 0;
        } else {
            j = y2Var.IEngagementSignalsCallbackStubProxy;
        }
        int i5 = i2 + 81;
        RatingCompatStyle = i5 % 128;
        int i6 = i5 % 2;
        return Long.valueOf(j);
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        y2 y2Var = (y2) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 75;
        MediaSessionCompatToken = i3 % 128;
        int i4 = i3 % 2;
        long j = y2Var.IEngagementSignalsCallback;
        int i5 = i2 + 99;
        MediaSessionCompatToken = i5 % 128;
        int i6 = i5 % 2;
        return Long.valueOf(j);
    }

    public final long access200() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 33;
        RatingCompatStyle = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ICustomTabsServiceStubProxy;
        }
        int i3 = 69 / 0;
        return this.ICustomTabsServiceStubProxy;
    }

    public final long onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 125;
        MediaSessionCompatToken = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onGreatestScrollPercentageIncreased;
        }
        throw null;
    }

    public final long IEngagementSignalsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 101;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        long j = this.IPostMessageServiceDefault;
        int i5 = i3 + 125;
        RatingCompatStyle = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        y2 y2Var = (y2) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 23;
        MediaSessionCompatToken = i3 % 128;
        int i4 = i3 % 2;
        long j = y2Var.ITrustedWebActivityCallbackDefault;
        int i5 = i2 + 7;
        MediaSessionCompatToken = i5 % 128;
        int i6 = i5 % 2;
        return Long.valueOf(j);
    }

    public final long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 43;
        MediaSessionCompatToken = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j = this.asBinder;
        int i4 = i2 + 123;
        MediaSessionCompatToken = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return j;
    }

    public final long asBinder() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 23;
        int i3 = i2 % 128;
        RatingCompatStyle = i3;
        int i4 = i2 % 2;
        long j = this.onTransact;
        int i5 = i3 + 5;
        MediaSessionCompatToken = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long asInterface() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 31;
        RatingCompatStyle = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackStub;
        }
        throw null;
    }

    public final long AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 45;
        MediaSessionCompatToken = i2 % 128;
        if (i2 % 2 != 0) {
            return this.AudioAttributesImplApi26Parcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        long j;
        y2 y2Var = (y2) objArr[0];
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 77;
        RatingCompatStyle = i3 % 128;
        if (i3 % 2 != 0) {
            j = y2Var.ITrustedWebActivityServiceStub;
            int i4 = 47 / 0;
        } else {
            j = y2Var.ITrustedWebActivityServiceStub;
        }
        int i5 = i2 + 107;
        RatingCompatStyle = i5 % 128;
        if (i5 % 2 == 0) {
            return Long.valueOf(j);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        y2 y2Var = (y2) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 39;
        MediaSessionCompatToken = i2 % 128;
        if (i2 % 2 != 0) {
            return Long.valueOf(y2Var.AudioAttributesCompatParcelizer);
        }
        long j = y2Var.AudioAttributesCompatParcelizer;
        throw null;
    }

    public final long RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 65;
        RatingCompatStyle = i2 % 128;
        if (i2 % 2 == 0) {
            return this.RemoteActionCompatParcelizer;
        }
        int i3 = 39 / 0;
        return this.RemoteActionCompatParcelizer;
    }

    public final long read() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 67;
        MediaSessionCompatToken = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ITrustedWebActivityServiceStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long ITrustedWebActivityService_Parcel() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 39;
        MediaSessionCompatToken = i3 % 128;
        int i4 = i3 % 2;
        long j = this.read;
        int i5 = i2 + 23;
        MediaSessionCompatToken = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final NestfgetadViewWrapper IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 85;
        RatingCompatStyle = i2 % 128;
        if (i2 % 2 == 0) {
            return this.asInterface;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TdsColorScheme(backgroundUpper=" + setByteOrder.IAuthTabCallbackDefault(this.IAuthTabCallbackDefault) + ", backgroundDefault=" + setByteOrder.IAuthTabCallbackDefault(this.onExtraCallback) + ", backgroundFloated100=" + setByteOrder.IAuthTabCallbackDefault(this.IAuthTabCallback) + ", backgroundLower=" + setByteOrder.IAuthTabCallbackDefault(this.onNavigationEvent) + ", backgroundDim=" + setByteOrder.IAuthTabCallbackDefault(this.onExtraCallbackWithResult) + ", backgroundFloated200=" + setByteOrder.IAuthTabCallbackDefault(this.onWarmupCompleted) + ", iconWarning=" + setByteOrder.IAuthTabCallbackDefault(this.getSmallIconId) + ", iconDanger=" + setByteOrder.IAuthTabCallbackDefault(this.ITrustedWebActivityCallbackStub) + ", iconSuccess=" + setByteOrder.IAuthTabCallbackDefault(this.getActiveNotifications) + ", iconPrimary=" + setByteOrder.IAuthTabCallbackDefault(this.areNotificationsEnabled) + ", iconSecondary=" + setByteOrder.IAuthTabCallbackDefault(this.notifyNotificationWithChannel) + ", iconTertiary=" + setByteOrder.IAuthTabCallbackDefault(this.ITrustedWebActivityServiceDefault) + ", iconQuaternary=" + setByteOrder.IAuthTabCallbackDefault(this.ITrustedWebActivityCallback_Parcel) + ", iconBrand=" + setByteOrder.IAuthTabCallbackDefault(this.IPostMessageService_Parcel) + ", iconOnFill=" + setByteOrder.IAuthTabCallbackDefault(this.ITrustedWebActivityCallbackStubProxy) + ", iconOnFillBrand=" + setByteOrder.IAuthTabCallbackDefault(this.cancelNotification) + ", iconOnFillWarning=" + setByteOrder.IAuthTabCallbackDefault(this.ITrustedWebActivityService) + ", iconUnselected=" + setByteOrder.IAuthTabCallbackDefault(this.getSmallIconBitmap) + ", textOnFillWarning=" + setByteOrder.IAuthTabCallbackDefault(this.AudioAttributesImplBaseParcelizer) + ", textOnFill=" + setByteOrder.IAuthTabCallbackDefault(this.AudioAttributesImplApi21Parcelizer) + ", textWarning=" + setByteOrder.IAuthTabCallbackDefault(this.RatingCompat1) + ", textSuccess=" + setByteOrder.IAuthTabCallbackDefault(this.RatingCompatApi19Impl) + ", textBrand=" + setByteOrder.IAuthTabCallbackDefault(this.IconCompatParcelizer) + ", textSecondary=" + setByteOrder.IAuthTabCallbackDefault(this.MediaMetadataCompat) + ", textStrong=" + setByteOrder.IAuthTabCallbackDefault(this.MediaSessionCompatQueueItem) + ", textDanger=" + setByteOrder.IAuthTabCallbackDefault(this.write) + ", textPrimary=" + setByteOrder.IAuthTabCallbackDefault(this.MediaBrowserCompatMediaItem) + ", textTertiary=" + setByteOrder.IAuthTabCallbackDefault(this.RatingCompatStarStyle) + ", textQuaternary=" + setByteOrder.IAuthTabCallbackDefault(this.MediaDescriptionCompat) + ", textOnFillBrand=" + setByteOrder.IAuthTabCallbackDefault(this.RatingCompat) + ", fillBrand=" + setByteOrder.IAuthTabCallbackDefault(this.validateRelationship) + ", fillBrandWeak=" + setByteOrder.IAuthTabCallbackDefault(this.warmup) + ", fillSuccess=" + setByteOrder.IAuthTabCallbackDefault(this.IPostMessageService) + ", fillSuccessWeak=" + setByteOrder.IAuthTabCallbackDefault(this.IPostMessageServiceStub) + ", fillWarning=" + setByteOrder.IAuthTabCallbackDefault(this.ITrustedWebActivityCallback) + ", fillWarningWeak=" + setByteOrder.IAuthTabCallbackDefault(this.IPostMessageServiceStubProxy) + ", fillDanger=" + setByteOrder.IAuthTabCallbackDefault(this.ICustomTabsService_Parcel) + ", fillDangerWeak=" + setByteOrder.IAuthTabCallbackDefault(this.writeTypedList) + ", fillNeutralWeak=" + setByteOrder.IAuthTabCallbackDefault(this.onSessionEnded) + ", fillNeutral=" + setByteOrder.IAuthTabCallbackDefault(this.IEngagementSignalsCallbackStub) + ", fillInverse=" + setByteOrder.IAuthTabCallbackDefault(this.onVerticalScrollEvent) + ", fillInverseWeak=" + setByteOrder.IAuthTabCallbackDefault(this.IEngagementSignalsCallbackDefault) + ", fillPressed=" + setByteOrder.IAuthTabCallbackDefault(this.IEngagementSignalsCallback_Parcel) + ", fillBrandHover=" + setByteOrder.IAuthTabCallbackDefault(this.ICustomTabsServiceStub) + ", fillBrandWeakHover=" + setByteOrder.IAuthTabCallbackDefault(this.updateVisuals) + ", fillBrandClearHover=" + setByteOrder.IAuthTabCallbackDefault(this.ICustomTabsServiceDefault) + ", fillNeutralWeakHover=" + setByteOrder.IAuthTabCallbackDefault(this.IEngagementSignalsCallbackStubProxy) + ", fillDangerHover=" + setByteOrder.IAuthTabCallbackDefault(this.access200) + ", fillDangerWeakHover=" + setByteOrder.IAuthTabCallbackDefault(this.IEngagementSignalsCallback) + ", fillDangerClearHover=" + setByteOrder.IAuthTabCallbackDefault(this.ICustomTabsServiceStubProxy) + ", fillHover=" + setByteOrder.IAuthTabCallbackDefault(this.onGreatestScrollPercentageIncreased) + ", fillSuccessHover=" + setByteOrder.IAuthTabCallbackDefault(this.IPostMessageServiceDefault) + ", fillWarningHover=" + setByteOrder.IAuthTabCallbackDefault(this.ITrustedWebActivityCallbackDefault) + ", borderDefault=" + setByteOrder.IAuthTabCallbackDefault(this.asBinder) + ", borderFocusRingInner=" + setByteOrder.IAuthTabCallbackDefault(this.onTransact) + ", borderFocusRingOuter=" + setByteOrder.IAuthTabCallbackDefault(this.IAuthTabCallbackStub) + ", shadowWeak=" + setByteOrder.IAuthTabCallbackDefault(this.AudioAttributesImplApi26Parcelizer) + ", shadowMedium=" + setByteOrder.IAuthTabCallbackDefault(this.ITrustedWebActivityServiceStub) + ", shadowTiny=" + setByteOrder.IAuthTabCallbackDefault(this.AudioAttributesCompatParcelizer) + ", newShadowMedium=" + setByteOrder.IAuthTabCallbackDefault(this.RemoteActionCompatParcelizer) + ", newShadowStrong=" + setByteOrder.IAuthTabCallbackDefault(this.ITrustedWebActivityServiceStubProxy) + ", newShadowWeak=" + setByteOrder.IAuthTabCallbackDefault(this.read) + ", component=" + this.asInterface + ")";
        int i2 = MediaSessionCompatToken + 7;
        RatingCompatStyle = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final AppLovinNativeAdImplExternalSyntheticLambda11 IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 5;
        int i3 = i2 % 128;
        RatingCompatStyle = i3;
        int i4 = i2 % 2;
        AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11 = this.access100;
        int i5 = i3 + 73;
        MediaSessionCompatToken = i5 % 128;
        int i6 = i5 % 2;
        return appLovinNativeAdImplExternalSyntheticLambda11;
    }

    public final void onExtraCallbackWithResult(@Nullable AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11) {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 27;
        MediaSessionCompatToken = i2 % 128;
        int i3 = i2 % 2;
        this.access100 = appLovinNativeAdImplExternalSyntheticLambda11;
        if (i3 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        y2 y2Var = (y2) objArr[0];
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 9;
        int i3 = i2 % 128;
        RatingCompatStyle = i3;
        int i4 = i2 % 2;
        AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11 = y2Var.extraCommand;
        if (i4 != 0) {
            int i5 = 49 / 0;
        }
        int i6 = i3 + 73;
        MediaSessionCompatToken = i6 % 128;
        int i7 = i6 % 2;
        return appLovinNativeAdImplExternalSyntheticLambda11;
    }

    public final void asBinder(@Nullable AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11) {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 47;
        MediaSessionCompatToken = i2 % 128;
        int i3 = i2 % 2;
        this.extraCommand = appLovinNativeAdImplExternalSyntheticLambda11;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        y2 y2Var = (y2) objArr[0];
        AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11 = (AppLovinNativeAdImplExternalSyntheticLambda11) objArr[1];
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 79;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        y2Var.ICustomTabsCallback = appLovinNativeAdImplExternalSyntheticLambda11;
        if (i4 == 0) {
            int i5 = 87 / 0;
        }
        int i6 = i3 + 121;
        RatingCompatStyle = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallbackStub(@Nullable AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11) {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 13;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        this.postMessage = appLovinNativeAdImplExternalSyntheticLambda11;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 99;
        RatingCompatStyle = i5 % 128;
        int i6 = i5 % 2;
    }

    public final AppLovinNativeAdImplExternalSyntheticLambda11 prefetch() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 97;
        RatingCompatStyle = i3 % 128;
        int i4 = i3 % 2;
        AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11 = this.postMessage;
        int i5 = i2 + 109;
        RatingCompatStyle = i5 % 128;
        if (i5 % 2 == 0) {
            return appLovinNativeAdImplExternalSyntheticLambda11;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallbackDefault(@Nullable AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 5;
        RatingCompatStyle = i2 % 128;
        int i3 = i2 % 2;
        this.ICustomTabsCallbackStubProxy = appLovinNativeAdImplExternalSyntheticLambda11;
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
    }

    public final AppLovinNativeAdImplExternalSyntheticLambda11 onUnminimized() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 115;
        RatingCompatStyle = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11 = this.ICustomTabsCallbackStubProxy;
        int i4 = i2 + 87;
        RatingCompatStyle = i4 % 128;
        int i5 = i4 % 2;
        return appLovinNativeAdImplExternalSyntheticLambda11;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        y2 y2Var = (y2) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 87;
        MediaSessionCompatToken = i3 % 128;
        int i4 = i3 % 2;
        AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11 = y2Var.setEngagementSignalsCallback;
        int i5 = i2 + 107;
        MediaSessionCompatToken = i5 % 128;
        if (i5 % 2 != 0) {
            return appLovinNativeAdImplExternalSyntheticLambda11;
        }
        throw null;
    }

    public final void IAuthTabCallbackStubProxy(@Nullable AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11) {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 59;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        this.setEngagementSignalsCallback = appLovinNativeAdImplExternalSyntheticLambda11;
        int i5 = i3 + 119;
        RatingCompatStyle = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@Nullable AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 29;
        int i3 = i2 % 128;
        RatingCompatStyle = i3;
        int i4 = i2 % 2;
        this.onMinimized = appLovinNativeAdImplExternalSyntheticLambda11;
        int i5 = i3 + 125;
        MediaSessionCompatToken = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AppLovinNativeAdImplExternalSyntheticLambda11 onActivityLayout() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 53;
        RatingCompatStyle = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11 = this.onMinimized;
        int i4 = i2 + 37;
        RatingCompatStyle = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return appLovinNativeAdImplExternalSyntheticLambda11;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        y2 y2Var = (y2) objArr[0];
        AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11 = (AppLovinNativeAdImplExternalSyntheticLambda11) objArr[1];
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 89;
        RatingCompatStyle = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        y2Var.requestPostMessageChannelWithExtras = appLovinNativeAdImplExternalSyntheticLambda11;
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        y2 y2Var = (y2) objArr[0];
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 21;
        RatingCompatStyle = i2 % 128;
        int i3 = i2 % 2;
        AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11 = y2Var.requestPostMessageChannelWithExtras;
        if (i3 == 0) {
            return appLovinNativeAdImplExternalSyntheticLambda11;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(@Nullable AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11) {
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 9;
        MediaSessionCompatToken = i3 % 128;
        int i4 = i3 % 2;
        this.extraCallbackWithResult = appLovinNativeAdImplExternalSyntheticLambda11;
        int i5 = i2 + 111;
        MediaSessionCompatToken = i5 % 128;
        int i6 = i5 % 2;
    }

    public final AppLovinNativeAdImplExternalSyntheticLambda11 writeTypedObject() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 67;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11 = this.extraCallbackWithResult;
        int i5 = i3 + 21;
        RatingCompatStyle = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 43 / 0;
        }
        return appLovinNativeAdImplExternalSyntheticLambda11;
    }

    public final AppLovinNativeAdImplExternalSyntheticLambda11 newAuthTabSession() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 113;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11 = this.newSession;
        int i5 = i3 + 97;
        RatingCompatStyle = i5 % 128;
        if (i5 % 2 == 0) {
            return appLovinNativeAdImplExternalSyntheticLambda11;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onTransact(@Nullable AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11) {
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 39;
        MediaSessionCompatToken = i3 % 128;
        int i4 = i3 % 2;
        this.newSession = appLovinNativeAdImplExternalSyntheticLambda11;
        int i5 = i2 + 65;
        MediaSessionCompatToken = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final AppLovinNativeAdImplExternalSyntheticLambda11 ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 107;
        MediaSessionCompatToken = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11 = this.onUnminimized;
        int i4 = i2 + 23;
        MediaSessionCompatToken = i4 % 128;
        int i5 = i4 % 2;
        return appLovinNativeAdImplExternalSyntheticLambda11;
    }

    public final void onWarmupCompleted(@Nullable AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11) {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 101;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        this.onUnminimized = appLovinNativeAdImplExternalSyntheticLambda11;
        int i5 = i3 + 37;
        RatingCompatStyle = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void access100(@Nullable AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11) {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 119;
        MediaSessionCompatToken = i2 % 128;
        int i3 = i2 % 2;
        this.requestPostMessageChannel = appLovinNativeAdImplExternalSyntheticLambda11;
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
    }

    public final AppLovinNativeAdImplExternalSyntheticLambda11 requestPostMessageChannel() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 21;
        RatingCompatStyle = i3 % 128;
        int i4 = i3 % 2;
        AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11 = this.requestPostMessageChannel;
        int i5 = i2 + 107;
        RatingCompatStyle = i5 % 128;
        int i6 = i5 % 2;
        return appLovinNativeAdImplExternalSyntheticLambda11;
    }

    public final void IAuthTabCallback(@Nullable setClickTrackingRequests setclicktrackingrequests) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 67;
        RatingCompatStyle = i3 % 128;
        int i4 = i3 % 2;
        this.ICustomTabsCallbackDefault = setclicktrackingrequests;
        if (i4 != 0) {
            int i5 = 87 / 0;
        }
        int i6 = i2 + 25;
        RatingCompatStyle = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final setClickTrackingRequests onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 101;
        RatingCompatStyle = i2 % 128;
        int i3 = i2 % 2;
        setClickTrackingRequests setclicktrackingrequests = this.ICustomTabsCallbackDefault;
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        return setclicktrackingrequests;
    }

    public final setClickTrackingRequests access000() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 43;
        RatingCompatStyle = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        setClickTrackingRequests setclicktrackingrequests = this.getInterfaceDescriptor;
        int i4 = i2 + 105;
        RatingCompatStyle = i4 % 128;
        int i5 = i4 % 2;
        return setclicktrackingrequests;
    }

    public final void onExtraCallbackWithResult(@Nullable setClickTrackingRequests setclicktrackingrequests) {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 87;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        this.getInterfaceDescriptor = setclicktrackingrequests;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 27;
        RatingCompatStyle = i5 % 128;
        int i6 = i5 % 2;
    }

    public final setViewableMRC100Requests getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 55;
        MediaSessionCompatToken = i3 % 128;
        int i4 = i3 % 2;
        setViewableMRC100Requests setviewablemrc100requests = this.IAuthTabCallback_Parcel;
        int i5 = i2 + 125;
        MediaSessionCompatToken = i5 % 128;
        if (i5 % 2 != 0) {
            return setviewablemrc100requests;
        }
        throw null;
    }

    public final void onWarmupCompleted(@Nullable setViewableMRC100Requests setviewablemrc100requests) {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 31;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallback_Parcel = setviewablemrc100requests;
        int i5 = i3 + 7;
        RatingCompatStyle = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        y2 y2Var = (y2) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 31;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        setViewableMRC100Requests setviewablemrc100requests = y2Var.onMessageChannelReady;
        if (i4 == 0) {
            int i5 = 3 / 0;
        }
        int i6 = i3 + 47;
        RatingCompatStyle = i6 % 128;
        int i7 = i6 % 2;
        return setviewablemrc100requests;
    }

    public final void onExtraCallbackWithResult(@Nullable setViewableMRC100Requests setviewablemrc100requests) {
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 105;
        MediaSessionCompatToken = i3 % 128;
        int i4 = i3 % 2;
        this.onMessageChannelReady = setviewablemrc100requests;
        int i5 = i2 + 9;
        MediaSessionCompatToken = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void IAuthTabCallback(@Nullable setViewableMRC100Requests setviewablemrc100requests) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 101;
        int i3 = i2 % 128;
        RatingCompatStyle = i3;
        int i4 = i2 % 2;
        this.access000 = setviewablemrc100requests;
        int i5 = i3 + 75;
        MediaSessionCompatToken = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
    }

    public final setViewableMRC100Requests access100() {
        setViewableMRC100Requests setviewablemrc100requests;
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 89;
        MediaSessionCompatToken = i3 % 128;
        if (i3 % 2 == 0) {
            setviewablemrc100requests = this.access000;
            int i4 = 59 / 0;
        } else {
            setviewablemrc100requests = this.access000;
        }
        int i5 = i2 + 123;
        MediaSessionCompatToken = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
        return setviewablemrc100requests;
    }

    public final v0a extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 105;
        int i3 = i2 % 128;
        RatingCompatStyle = i3;
        int i4 = i2 % 2;
        v0a v0aVar = this.writeTypedObject;
        int i5 = i3 + 123;
        MediaSessionCompatToken = i5 % 128;
        int i6 = i5 % 2;
        return v0aVar;
    }

    public final void onNavigationEvent(@Nullable v0a v0aVar) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 53;
        int i3 = i2 % 128;
        RatingCompatStyle = i3;
        int i4 = i2 % 2;
        this.writeTypedObject = v0aVar;
        int i5 = i3 + 89;
        MediaSessionCompatToken = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        y2 y2Var = (y2) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 41;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        v0a v0aVar = y2Var.ICustomTabsCallback_Parcel;
        int i5 = i3 + 91;
        RatingCompatStyle = i5 % 128;
        int i6 = i5 % 2;
        return v0aVar;
    }

    public final void onExtraCallback(@Nullable v0a v0aVar) {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 3;
        MediaSessionCompatToken = i2 % 128;
        int i3 = i2 % 2;
        this.ICustomTabsCallback_Parcel = v0aVar;
        if (i3 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        y2 y2Var = (y2) objArr[0];
        v0a v0aVar = (v0a) objArr[1];
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 73;
        RatingCompatStyle = i2 % 128;
        int i3 = i2 % 2;
        y2Var.onPostMessage = v0aVar;
        if (i3 == 0) {
            return null;
        }
        int i4 = 16 / 0;
        return null;
    }

    public final v0a onMinimized() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 87;
        RatingCompatStyle = i3 % 128;
        int i4 = i3 % 2;
        v0a v0aVar = this.onPostMessage;
        int i5 = i2 + 61;
        RatingCompatStyle = i5 % 128;
        if (i5 % 2 == 0) {
            return v0aVar;
        }
        throw null;
    }

    public final void IAuthTabCallback(@Nullable v0a v0aVar) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 47;
        RatingCompatStyle = i2 % 128;
        int i3 = i2 % 2;
        this.prefetchWithMultipleUrls = v0aVar;
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
    }

    public final v0a receiveFile() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 19;
        RatingCompatStyle = i3 % 128;
        int i4 = i3 % 2;
        v0a v0aVar = this.prefetchWithMultipleUrls;
        int i5 = i2 + 65;
        RatingCompatStyle = i5 % 128;
        if (i5 % 2 == 0) {
            return v0aVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        y2 y2Var = (y2) objArr[0];
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 13;
        int i3 = i2 % 128;
        RatingCompatStyle = i3;
        int i4 = i2 % 2;
        Object obj = null;
        showMediaImageView showmediaimageview = y2Var.mayLaunchUrl;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 45;
        MediaSessionCompatToken = i5 % 128;
        if (i5 % 2 != 0) {
            return showmediaimageview;
        }
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(@Nullable showMediaImageView showmediaimageview) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 77;
        int i3 = i2 % 128;
        RatingCompatStyle = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.mayLaunchUrl = showmediaimageview;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 107;
        MediaSessionCompatToken = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final x2ExternalSyntheticLambda33 ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 45;
        MediaSessionCompatToken = i3 % 128;
        int i4 = i3 % 2;
        x2ExternalSyntheticLambda33 x2externalsyntheticlambda33 = this.isEngagementSignalsApiAvailable;
        int i5 = i2 + 55;
        MediaSessionCompatToken = i5 % 128;
        int i6 = i5 % 2;
        return x2externalsyntheticlambda33;
    }

    public final void onNavigationEvent(@Nullable x2ExternalSyntheticLambda33 x2externalsyntheticlambda33) {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 71;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        this.isEngagementSignalsApiAvailable = x2externalsyntheticlambda33;
        int i5 = i3 + 57;
        RatingCompatStyle = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        y2 y2Var = (y2) objArr[0];
        AppLovinVastMediaViewb appLovinVastMediaViewb = (AppLovinVastMediaViewb) objArr[1];
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 107;
        RatingCompatStyle = i3 % 128;
        int i4 = i3 % 2;
        y2Var.ICustomTabsService = appLovinVastMediaViewb;
        int i5 = i2 + 11;
        RatingCompatStyle = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final AppLovinVastMediaViewb ICustomTabsService() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 67;
        RatingCompatStyle = i2 % 128;
        int i3 = i2 % 2;
        AppLovinVastMediaViewb appLovinVastMediaViewb = this.ICustomTabsService;
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return appLovinVastMediaViewb;
    }

    public final r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 43;
        MediaSessionCompatToken = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ICustomTabsCallbackStub;
        }
        throw null;
    }

    public final void onWarmupCompleted(@Nullable r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI r8lambdacvbgljs0ksxut8zctwblscbeixi) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 19;
        int i3 = i2 % 128;
        RatingCompatStyle = i3;
        int i4 = i2 % 2;
        this.ICustomTabsCallbackStub = r8lambdacvbgljs0ksxut8zctwblscbeixi;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 125;
        MediaSessionCompatToken = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        y2 y2Var = (y2) objArr[0];
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 71;
        RatingCompatStyle = i3 % 128;
        int i4 = i3 % 2;
        r8lambdaBh8wf1u761UxGMlBMuxJ2edovsM r8lambdabh8wf1u761uxgmlbmuxj2edovsm = y2Var.IAuthTabCallbackStubProxy;
        if (i4 != 0) {
            int i5 = 57 / 0;
        }
        int i6 = i2 + 125;
        RatingCompatStyle = i6 % 128;
        int i7 = i6 % 2;
        return r8lambdabh8wf1u761uxgmlbmuxj2edovsm;
    }

    public final void onExtraCallback(@Nullable r8lambdaBh8wf1u761UxGMlBMuxJ2edovsM r8lambdabh8wf1u761uxgmlbmuxj2edovsm) {
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 101;
        MediaSessionCompatToken = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackStubProxy = r8lambdabh8wf1u761uxgmlbmuxj2edovsm;
        int i5 = i2 + 121;
        MediaSessionCompatToken = i5 % 128;
        int i6 = i5 % 2;
    }

    public final r8lambdaCPfbr3F4RI0PHZL8V6jqNiItG7U ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 85;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        r8lambdaCPfbr3F4RI0PHZL8V6jqNiItG7U r8lambdacpfbr3f4ri0phzl8v6jqniitg7u = this.onRelationshipValidationResult;
        int i5 = i3 + 73;
        RatingCompatStyle = i5 % 128;
        int i6 = i5 % 2;
        return r8lambdacpfbr3f4ri0phzl8v6jqniitg7u;
    }

    public final void onExtraCallbackWithResult(@Nullable r8lambdaCPfbr3F4RI0PHZL8V6jqNiItG7U r8lambdacpfbr3f4ri0phzl8v6jqniitg7u) {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 57;
        MediaSessionCompatToken = i2 % 128;
        int i3 = i2 % 2;
        this.onRelationshipValidationResult = r8lambdacpfbr3f4ri0phzl8v6jqniitg7u;
        if (i3 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        y2 y2Var = (y2) objArr[0];
        setClickDestinationBackupUri setclickdestinationbackupuri = (setClickDestinationBackupUri) objArr[1];
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 97;
        int i3 = i2 % 128;
        RatingCompatStyle = i3;
        int i4 = i2 % 2;
        y2Var.onActivityLayout = setclickdestinationbackupuri;
        int i5 = i3 + 87;
        MediaSessionCompatToken = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
        return null;
    }

    public final setClickDestinationBackupUri onActivityResized() {
        setClickDestinationBackupUri setclickdestinationbackupuri;
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 85;
        int i3 = i2 % 128;
        RatingCompatStyle = i3;
        if (i2 % 2 != 0) {
            setclickdestinationbackupuri = this.onActivityLayout;
            int i4 = 4 / 0;
        } else {
            setclickdestinationbackupuri = this.onActivityLayout;
        }
        int i5 = i3 + 39;
        MediaSessionCompatToken = i5 % 128;
        if (i5 % 2 != 0) {
            return setclickdestinationbackupuri;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void asInterface(@Nullable setClickDestinationBackupUri setclickdestinationbackupuri) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 7;
        RatingCompatStyle = i2 % 128;
        int i3 = i2 % 2;
        this.receiveFile = setclickdestinationbackupuri;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final setClickDestinationBackupUri prefetchWithMultipleUrls() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 43;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        setClickDestinationBackupUri setclickdestinationbackupuri = this.receiveFile;
        int i5 = i3 + 1;
        RatingCompatStyle = i5 % 128;
        int i6 = i5 % 2;
        return setclickdestinationbackupuri;
    }

    public final setClickDestinationBackupUri extraCallback() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 41;
        RatingCompatStyle = i3 % 128;
        int i4 = i3 % 2;
        setClickDestinationBackupUri setclickdestinationbackupuri = this.readTypedObject;
        int i5 = i2 + 75;
        RatingCompatStyle = i5 % 128;
        int i6 = i5 % 2;
        return setclickdestinationbackupuri;
    }

    public final void onExtraCallback(@Nullable setClickDestinationBackupUri setclickdestinationbackupuri) {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 35;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        this.readTypedObject = setclickdestinationbackupuri;
        int i5 = i3 + 15;
        RatingCompatStyle = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@Nullable setClickDestinationBackupUri setclickdestinationbackupuri) {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 93;
        MediaSessionCompatToken = i2 % 128;
        int i3 = i2 % 2;
        this.newSessionWithExtras = setclickdestinationbackupuri;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final setClickDestinationBackupUri postMessage() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 67;
        MediaSessionCompatToken = i3 % 128;
        int i4 = i3 % 2;
        setClickDestinationBackupUri setclickdestinationbackupuri = this.newSessionWithExtras;
        int i5 = i2 + 77;
        MediaSessionCompatToken = i5 % 128;
        int i6 = i5 % 2;
        return setclickdestinationbackupuri;
    }

    public final void onNavigationEvent(@Nullable setClickDestinationBackupUri setclickdestinationbackupuri) {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 47;
        MediaSessionCompatToken = i2 % 128;
        int i3 = i2 % 2;
        this.extraCallback = setclickdestinationbackupuri;
        if (i3 == 0) {
            throw null;
        }
    }

    public final setClickDestinationBackupUri readTypedObject() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle;
        int i3 = i2 + 11;
        MediaSessionCompatToken = i3 % 128;
        int i4 = i3 % 2;
        setClickDestinationBackupUri setclickdestinationbackupuri = this.extraCallback;
        int i5 = i2 + 113;
        MediaSessionCompatToken = i5 % 128;
        int i6 = i5 % 2;
        return setclickdestinationbackupuri;
    }

    public final void IAuthTabCallbackStub(@Nullable setClickDestinationBackupUri setclickdestinationbackupuri) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 37;
        RatingCompatStyle = i3 % 128;
        int i4 = i3 % 2;
        this.prefetch = setclickdestinationbackupuri;
        int i5 = i2 + 35;
        RatingCompatStyle = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
    }

    public final void onExtraCallbackWithResult(@Nullable setClickDestinationBackupUri setclickdestinationbackupuri) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 89;
        RatingCompatStyle = i3 % 128;
        int i4 = i3 % 2;
        this.onActivityResized = setclickdestinationbackupuri;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 29;
        RatingCompatStyle = i5 % 128;
        int i6 = i5 % 2;
    }

    public final setClickDestinationBackupUri onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 71;
        MediaSessionCompatToken = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onActivityResized;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final setClickDestinationBackupUri newSession() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 15;
        int i3 = i2 % 128;
        RatingCompatStyle = i3;
        int i4 = i2 % 2;
        setClickDestinationBackupUri setclickdestinationbackupuri = this.newAuthTabSession;
        int i5 = i3 + 117;
        MediaSessionCompatToken = i5 % 128;
        int i6 = i5 % 2;
        return setclickdestinationbackupuri;
    }

    public final void onTransact(@Nullable setClickDestinationBackupUri setclickdestinationbackupuri) {
        int i = 2 % 2;
        int i2 = RatingCompatStyle + 91;
        int i3 = i2 % 128;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        this.newAuthTabSession = setclickdestinationbackupuri;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 59;
        RatingCompatStyle = i5 % 128;
        int i6 = i5 % 2;
    }

    public final r8lambdaBh8wf1u761UxGMlBMuxJ2edovsM IAuthTabCallback_Parcel() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (r8lambdaBh8wf1u761UxGMlBMuxJ2edovsM) onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, -1610667208, iOnWarmupCompleted, iOnWarmupCompleted2, 1610667214, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public final AppLovinNativeAdImplExternalSyntheticLambda11 ICustomTabsCallback() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (AppLovinNativeAdImplExternalSyntheticLambda11) onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, 1964287558, iOnWarmupCompleted, iOnWarmupCompleted2, -1964287533, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public final setViewableMRC100Requests onPostMessage() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (setViewableMRC100Requests) onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, 1981674223, iOnWarmupCompleted, iOnWarmupCompleted2, -1981674219, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public final showMediaImageView extraCommand() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (showMediaImageView) onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, 572852445, iOnWarmupCompleted, iOnWarmupCompleted2, -572852424, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public final AppLovinNativeAdImplExternalSyntheticLambda11 isEngagementSignalsApiAvailable() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (AppLovinNativeAdImplExternalSyntheticLambda11) onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, 484713179, iOnWarmupCompleted, iOnWarmupCompleted2, -484713163, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public final v0a mayLaunchUrl() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (v0a) onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, -2122364963, iOnWarmupCompleted, iOnWarmupCompleted2, 2122364965, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public final setClickDestinationBackupUri newSessionWithExtras() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (setClickDestinationBackupUri) onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, 1372151283, iOnWarmupCompleted, iOnWarmupCompleted2, -1372151283, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public final AppLovinNativeAdImplExternalSyntheticLambda11 requestPostMessageChannelWithExtras() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (AppLovinNativeAdImplExternalSyntheticLambda11) onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, 2097080180, iOnWarmupCompleted, iOnWarmupCompleted2, -2097080175, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public final AppLovinNativeAdImplExternalSyntheticLambda11 setEngagementSignalsCallback() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (AppLovinNativeAdImplExternalSyntheticLambda11) onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, 969118496, iOnWarmupCompleted, iOnWarmupCompleted2, -969118479, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public final long validateRelationship() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Long) onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, -980417895, iOnWarmupCompleted, iOnWarmupCompleted2, 980417918, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue();
    }

    public final long ICustomTabsServiceStubProxy() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Long) onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, -328674717, iOnWarmupCompleted, iOnWarmupCompleted2, 328674727, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue();
    }

    public final long ICustomTabsService_Parcel() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Long) onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, 1639774791, iOnWarmupCompleted, iOnWarmupCompleted2, -1639774783, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue();
    }

    public final long IPostMessageServiceDefault() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Long) onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, -315930479, iOnWarmupCompleted, iOnWarmupCompleted2, 315930490, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue();
    }

    public final long IPostMessageService_Parcel() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Long) onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, 1073202389, iOnWarmupCompleted, iOnWarmupCompleted2, -1073202377, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue();
    }

    public final long ITrustedWebActivityCallbackStubProxy() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Long) onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, -602759334, iOnWarmupCompleted, iOnWarmupCompleted2, 602759348, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue();
    }

    public final long getActiveNotifications() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Long) onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, 1510658777, iOnWarmupCompleted, iOnWarmupCompleted2, -1510658776, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue();
    }

    public final long notifyNotificationWithChannel() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Long) onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, -1790852836, iOnWarmupCompleted, iOnWarmupCompleted2, 1790852843, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue();
    }

    public final long ITrustedWebActivityServiceStub() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Long) onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, 426223906, iOnWarmupCompleted, iOnWarmupCompleted2, -426223887, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue();
    }

    public final long AudioAttributesImplApi26Parcelizer() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Long) onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, -238890612, iOnWarmupCompleted, iOnWarmupCompleted2, 238890634, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue();
    }

    public final long IconCompatParcelizer() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Long) onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, -320693169, iOnWarmupCompleted, iOnWarmupCompleted2, 320693189, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue();
    }

    public final long MediaDescriptionCompat() {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Long) onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, -1159030540, iOnWarmupCompleted, iOnWarmupCompleted2, 1159030555, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue();
    }

    public final void onExtraCallback(@Nullable AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, appLovinNativeAdImplExternalSyntheticLambda11}, -1298549420, iOnWarmupCompleted, iOnWarmupCompleted2, 1298549444, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public final void onWarmupCompleted(@Nullable v0a v0aVar) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, v0aVar}, -1787479873, iOnWarmupCompleted, iOnWarmupCompleted2, 1787479891, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public final void IAuthTabCallback(@Nullable setClickDestinationBackupUri setclickdestinationbackupuri) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, setclickdestinationbackupuri}, -981719394, iOnWarmupCompleted, iOnWarmupCompleted2, 981719397, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public final void onWarmupCompleted(@Nullable AppLovinVastMediaViewb appLovinVastMediaViewb) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, appLovinVastMediaViewb}, 1631146686, iOnWarmupCompleted, iOnWarmupCompleted2, -1631146677, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public final void asInterface(@Nullable AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, appLovinNativeAdImplExternalSyntheticLambda11}, -845248102, iOnWarmupCompleted, iOnWarmupCompleted2, 845248115, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }
}
