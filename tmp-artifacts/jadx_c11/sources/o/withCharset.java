package o;

import im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda11;
import java.util.Map;
import kotlin.Pair;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class withCharset {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ withCharset[] $VALUES;
    public static final withCharset Blue;
    public static final withCharset BlueOpacity;
    public static final withCharset Green;
    public static final withCharset GreenOpacity;
    public static final withCharset Grey;
    public static final withCharset GreyOpacity;
    private static int IAuthTabCallback = 0;
    public static final withCharset Purple;
    public static final withCharset PurpleOpacity;
    public static final withCharset Red;
    public static final withCharset RedOpacity;
    public static final withCharset StaticWhiteOpacity;
    public static final withCharset Teal;
    public static final withCharset TealOpacity;
    public static final withCharset Yellow;
    public static final withCharset YellowOpacity;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final Map<Integer, CipherSuiteCompanion> colors;

    private static final /* synthetic */ withCharset[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 107;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        withCharset[] withcharsetArr = {Blue, BlueOpacity, Green, GreenOpacity, Grey, GreyOpacity, Purple, PurpleOpacity, Red, RedOpacity, StaticWhiteOpacity, Teal, TealOpacity, Yellow, YellowOpacity};
        int i5 = i2 + 45;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return withcharsetArr;
    }

    public static EnumEntries<withCharset> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static withCharset valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        withCharset withcharset = (withCharset) Enum.valueOf(withCharset.class, str);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return withcharset;
    }

    public static withCharset[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        withCharset[] withcharsetArr = (withCharset[]) $VALUES.clone();
        int i3 = onNavigationEvent + 27;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return withcharsetArr;
        }
        obj.hashCode();
        throw null;
    }

    private withCharset(String str, int i, Map map) {
        this.colors = map;
    }

    public final Map<Integer, CipherSuiteCompanion> getColors() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Map<Integer, CipherSuiteCompanion> map = this.colors;
        int i5 = i3 + 117;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    static {
        charset charsetVar = charset.onExtraCallbackWithResult;
        Blue = new withCharset("Blue", 0, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(50, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -425367459, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 425367460, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(100, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 2014272444, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -2014272425, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(200, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1663447833, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1663447851, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(300, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -881271034, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 881271043, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(400, charsetVar.IAuthTabCallback()), getWrite.IAuthTabCallback(500, charsetVar.asInterface()), getWrite.IAuthTabCallback(600, charsetVar.asBinder()), getWrite.IAuthTabCallback(700, charsetVar.IAuthTabCallbackDefault()), getWrite.IAuthTabCallback(800, charsetVar.onTransact()), getWrite.IAuthTabCallback(900, charsetVar.IAuthTabCallbackStub())}));
        BlueOpacity = new withCharset("BlueOpacity", 1, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(50, charsetVar.access000()), getWrite.IAuthTabCallback(100, charsetVar.getInterfaceDescriptor()), getWrite.IAuthTabCallback(200, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -111968868, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 111968881, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(300, charsetVar.IAuthTabCallbackStubProxy()), getWrite.IAuthTabCallback(400, charsetVar.IAuthTabCallback_Parcel()), getWrite.IAuthTabCallback(500, charsetVar.readTypedObject())}));
        Green = new withCharset("Green", 2, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(50, charsetVar.writeTypedObject()), getWrite.IAuthTabCallback(100, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1561047609, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1561047585, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(200, charsetVar.ICustomTabsCallback()), getWrite.IAuthTabCallback(300, charsetVar.extraCallback()), getWrite.IAuthTabCallback(400, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 864960333, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -864960322, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(500, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1506670724, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1506670716, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(600, charsetVar.onPostMessage()), getWrite.IAuthTabCallback(700, charsetVar.onMessageChannelReady()), getWrite.IAuthTabCallback(800, charsetVar.onActivityLayout()), getWrite.IAuthTabCallback(900, charsetVar.ICustomTabsCallbackStubProxy())}));
        GreenOpacity = new withCharset("GreenOpacity", 3, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(50, charsetVar.ICustomTabsCallbackStub()), getWrite.IAuthTabCallback(100, charsetVar.ICustomTabsCallbackDefault()), getWrite.IAuthTabCallback(200, charsetVar.onRelationshipValidationResult()), getWrite.IAuthTabCallback(300, charsetVar.onUnminimized()), getWrite.IAuthTabCallback(400, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1609731673, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1609731670, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(500, charsetVar.extraCommand())}));
        Grey = new withCharset("Grey", 4, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(50, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1404061333, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1404061356, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(100, charsetVar.ICustomTabsService()), getWrite.IAuthTabCallback(200, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 869218236, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -869218230, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(300, charsetVar.newAuthTabSession()), getWrite.IAuthTabCallback(400, charsetVar.newSessionWithExtras()), getWrite.IAuthTabCallback(500, charsetVar.prefetch()), getWrite.IAuthTabCallback(600, charsetVar.postMessage()), getWrite.IAuthTabCallback(700, charsetVar.newSession()), getWrite.IAuthTabCallback(800, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 382802400, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -382802383, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(900, charsetVar.receiveFile())}));
        GreyOpacity = new withCharset("GreyOpacity", 5, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(50, charsetVar.setEngagementSignalsCallback()), getWrite.IAuthTabCallback(100, charsetVar.requestPostMessageChannelWithExtras()), getWrite.IAuthTabCallback(200, charsetVar.prefetchWithMultipleUrls()), getWrite.IAuthTabCallback(300, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1621030900, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1621030898, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(400, charsetVar.ICustomTabsServiceDefault()), getWrite.IAuthTabCallback(500, charsetVar.validateRelationship()), getWrite.IAuthTabCallback(600, charsetVar.updateVisuals()), getWrite.IAuthTabCallback(700, charsetVar.warmup()), getWrite.IAuthTabCallback(800, charsetVar.access200()), getWrite.IAuthTabCallback(900, charsetVar.writeTypedList())}));
        Purple = new withCharset("Purple", 6, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(50, charsetVar.IEngagementSignalsCallback()), getWrite.IAuthTabCallback(100, charsetVar.ICustomTabsService_Parcel()), getWrite.IAuthTabCallback(200, charsetVar.ICustomTabsServiceStubProxy()), getWrite.IAuthTabCallback(300, charsetVar.onSessionEnded()), getWrite.IAuthTabCallback(400, charsetVar.onVerticalScrollEvent()), getWrite.IAuthTabCallback(500, charsetVar.IEngagementSignalsCallbackDefault()), getWrite.IAuthTabCallback(600, charsetVar.IEngagementSignalsCallbackStub()), getWrite.IAuthTabCallback(700, charsetVar.onGreatestScrollPercentageIncreased()), getWrite.IAuthTabCallback(800, charsetVar.IPostMessageServiceStub()), getWrite.IAuthTabCallback(900, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -653196507, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 653196517, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar}))}));
        PurpleOpacity = new withCharset("PurpleOpacity", 7, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(50, charsetVar.IEngagementSignalsCallbackStubProxy()), getWrite.IAuthTabCallback(100, charsetVar.IPostMessageServiceDefault()), getWrite.IAuthTabCallback(200, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 821589988, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -821589976, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(300, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1931492721, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1931492741, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(400, charsetVar.IPostMessageServiceStubProxy()), getWrite.IAuthTabCallback(500, charsetVar.IPostMessageService_Parcel())}));
        Red = new withCharset("Red", 8, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(50, charsetVar.ITrustedWebActivityCallbackDefault()), getWrite.IAuthTabCallback(100, charsetVar.ITrustedWebActivityCallback()), getWrite.IAuthTabCallback(200, charsetVar.ITrustedWebActivityCallback_Parcel()), getWrite.IAuthTabCallback(300, charsetVar.ITrustedWebActivityService()), getWrite.IAuthTabCallback(400, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 998757221, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -998757200, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(500, charsetVar.ITrustedWebActivityCallbackStubProxy()), getWrite.IAuthTabCallback(600, charsetVar.areNotificationsEnabled()), getWrite.IAuthTabCallback(700, charsetVar.getSmallIconBitmap()), getWrite.IAuthTabCallback(800, charsetVar.ITrustedWebActivityServiceDefault()), getWrite.IAuthTabCallback(900, charsetVar.getSmallIconId())}));
        RedOpacity = new withCharset("RedOpacity", 9, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(50, charsetVar.getActiveNotifications()), getWrite.IAuthTabCallback(100, charsetVar.notifyNotificationWithChannel()), getWrite.IAuthTabCallback(200, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 211560524, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -211560517, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(300, charsetVar.ITrustedWebActivityService_Parcel()), getWrite.IAuthTabCallback(400, charsetVar.ITrustedWebActivityServiceStubProxy()), getWrite.IAuthTabCallback(500, charsetVar.ITrustedWebActivityServiceStub())}));
        StaticWhiteOpacity = new withCharset("StaticWhiteOpacity", 10, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(50, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 2083542968, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -2083542953, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(100, charsetVar.write()), getWrite.IAuthTabCallback(200, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -322673163, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 322673179, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(300, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 411770135, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -411770131, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(400, charsetVar.RatingCompat()), getWrite.IAuthTabCallback(500, charsetVar.MediaBrowserCompatMediaItem()), getWrite.IAuthTabCallback(600, charsetVar.MediaDescriptionCompat()), getWrite.IAuthTabCallback(700, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1173038633, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1173038638, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(800, charsetVar.MediaMetadataCompat()), getWrite.IAuthTabCallback(900, charsetVar.MediaSessionCompatQueueItem())}));
        Teal = new withCharset("Teal", 11, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(50, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -305487413, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 305487435, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(100, charsetVar.RatingCompatStarStyle()), getWrite.IAuthTabCallback(200, charsetVar.RatingCompatApi19Impl()), getWrite.IAuthTabCallback(300, charsetVar.RatingCompatStyle()), getWrite.IAuthTabCallback(400, charsetVar.ParcelableVolumeInfo()), getWrite.IAuthTabCallback(500, charsetVar.MediaSessionCompatToken()), getWrite.IAuthTabCallback(600, charsetVar.PlaybackStateCompatCustomAction()), getWrite.IAuthTabCallback(700, charsetVar.MediaSessionCompatResultReceiverWrapper()), getWrite.IAuthTabCallback(800, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 702584624, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -702584610, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(900, charsetVar.ResultReceiverMyRunnable())}));
        TealOpacity = new withCharset("TealOpacity", 12, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(50, charsetVar.ResultReceiverMyResultReceiver()), getWrite.IAuthTabCallback(100, charsetVar.ResultReceiver()), getWrite.IAuthTabCallback(200, charsetVar.ComponentActivity()), getWrite.IAuthTabCallback(300, charsetVar.ResultReceiver1()), getWrite.IAuthTabCallback(400, charsetVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()), getWrite.IAuthTabCallback(500, charsetVar.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss())}));
        Yellow = new withCharset("Yellow", 13, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(50, charsetVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()), getWrite.IAuthTabCallback(100, charsetVar.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg()), getWrite.IAuthTabCallback(200, charsetVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus()), getWrite.IAuthTabCallback(300, charsetVar.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs()), getWrite.IAuthTabCallback(400, charsetVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()), getWrite.IAuthTabCallback(500, charsetVar.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8()), getWrite.IAuthTabCallback(600, charsetVar.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28()), getWrite.IAuthTabCallback(700, charsetVar.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4()), getWrite.IAuthTabCallback(800, (CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -265197280, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 265197280, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})), getWrite.IAuthTabCallback(900, charsetVar.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw())}));
        YellowOpacity = new withCharset("YellowOpacity", 14, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(50, charsetVar._init_lambda2()), getWrite.IAuthTabCallback(100, charsetVar.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0()), getWrite.IAuthTabCallback(200, charsetVar._init_lambda1()), getWrite.IAuthTabCallback(300, charsetVar._init_lambda3()), getWrite.IAuthTabCallback(400, charsetVar.addObserverForBackInvoker()), getWrite.IAuthTabCallback(500, charsetVar._init_lambda4())}));
        withCharset[] withcharsetArr$values = $values();
        $VALUES = withcharsetArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(withcharsetArr$values);
        int i = IAuthTabCallback + 81;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
