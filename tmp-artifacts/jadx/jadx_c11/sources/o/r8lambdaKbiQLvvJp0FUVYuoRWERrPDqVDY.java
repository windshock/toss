package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaKbiQLvvJp0FUVYuoRWERrPDqVDY {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ class onWarmupCompleted {
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent;

        static {
            int[] iArr = new int[getSpecialFeatureOptInStatus.values().length];
            try {
                iArr[getSpecialFeatureOptInStatus.Light.ordinal()] = 1;
                int i = onNavigationEvent + 39;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getSpecialFeatureOptInStatus.Dark.ordinal()] = 2;
                int i4 = onNavigationEvent + 103;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 / 5;
                } else {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        r2 = o.r8lambdaKbiQLvvJp0FUVYuoRWERrPDqVDY.onWarmupCompleted + 27;
        o.r8lambdaKbiQLvvJp0FUVYuoRWERrPDqVDY.onExtraCallback = r2 % 128;
        r2 = r2 % 2;
        r5 = r134.onMessageChannelReady();
        r11 = r134.onActivityLayout();
        r1 = r134.extraCommand();
        r107 = r134.postMessage();
        r109 = ((java.lang.Long) o.addFixedPosition.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r134}, 1237084257, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue();
        r111 = r134.getInterfaceDescriptor();
        r61 = ((java.lang.Long) o.addFixedPosition.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r134}, 1237084257, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue();
        r91 = ((java.lang.Long) o.addFixedPosition.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r134}, 1368051753, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), -1368051749)).longValue();
        r87 = r134.IAuthTabCallbackStub();
        r63 = ((java.lang.Long) o.addFixedPosition.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r134}, 1368051753, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), -1368051749)).longValue();
        r89 = r134.getInterfaceDescriptor();
        r73 = r134.IEngagementSignalsCallbackStub();
        r99 = r134.IPostMessageServiceStub();
        r95 = r134.onVerticalScrollEvent();
        r75 = r134.IPostMessageServiceStub();
        r97 = r134.IEngagementSignalsCallbackStubProxy();
        r101 = r134.mayLaunchUrl();
        r81 = r134.IPostMessageService_Parcel();
        r83 = r134.IPostMessageServiceStubProxy();
        r79 = ((java.lang.Long) o.addFixedPosition.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r134}, -1444009137, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), 1444009151)).longValue();
        r77 = r134.mayLaunchUrl();
        r93 = r134.postMessage();
        r85 = r134.mayLaunchUrl();
        r65 = ((java.lang.Long) o.addFixedPosition.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r134}, 2111452320, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), -2111452315)).longValue();
        r103 = r134.extraCallback();
        r67 = r134.onPostMessage();
        r69 = r134.MediaDescriptionCompat();
        r105 = r134.RatingCompat();
        r71 = ((java.lang.Long) o.addFixedPosition.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r134}, 1889153104, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), -1889153086)).longValue();
        r27 = r134.onTransact();
        r15 = ((java.lang.Long) o.addFixedPosition.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r134}, -1572738860, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
        r29 = r134.IPostMessageService_Parcel();
        r31 = r134.IPostMessageService_Parcel();
        r19 = r134.receiveFile();
        r25 = r134.newSessionWithExtras();
        r21 = r134.newAuthTabSession();
        r17 = r134.ICustomTabsCallback();
        r23 = ((java.lang.Long) o.addFixedPosition.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r134}, -523958350, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), 523958365)).longValue();
        r35 = r134.newSession();
        r13 = r134.AudioAttributesImplBaseParcelizer();
        r45 = r134.onTransact();
        r49 = ((java.lang.Long) o.addFixedPosition.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r134}, -1572738860, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
        r39 = r134.IPostMessageService_Parcel();
        r59 = r134.IPostMessageService_Parcel();
        r51 = r134.setEngagementSignalsCallback();
        r57 = ((java.lang.Long) o.addFixedPosition.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r134}, -523958350, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), 523958365)).longValue();
        r53 = r134.receiveFile();
        r47 = r134.requestPostMessageChannelWithExtras();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x028a, code lost:
    
        return o.r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallbackWithResult(r134, r1, 0, r5, 0, 0, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, 0, r35, 0, r39, r134.AudioAttributesImplBaseParcelizer(), r134.ICustomTabsCallback(), r45, r47, r49, r51, r53, r134.newAuthTabSession(), r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79, r81, r83, r85, r87, r89, r91, r93, r95, r97, r99, r101, r103, r105, r107, r109, r111, 0, 0, 0, 0, 0, 0, null, 655412, -33554432, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0290, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0291, code lost:
    
        r4 = r134.onActivityLayout();
        r1 = r134.extraCommand();
        r54 = r134.postMessage();
        r56 = ((java.lang.Long) o.addFixedPosition.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r134}, 1237084257, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue();
        r58 = r134.getInterfaceDescriptor();
        r31 = ((java.lang.Long) o.addFixedPosition.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r134}, 1237084257, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue();
        r46 = ((java.lang.Long) o.addFixedPosition.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r134}, 1368051753, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), -1368051749)).longValue();
        r44 = r134.onTransact();
        r33 = ((java.lang.Long) o.addFixedPosition.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r134}, 1368051753, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), -1368051749)).longValue();
        r48 = r134.getInterfaceDescriptor();
        r37 = r134.IEngagementSignalsCallbackStub();
        r50 = r134.IPostMessageServiceStub();
        r52 = ((java.lang.Long) o.addFixedPosition.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r134}, -1572738860, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
        r39 = r134.IPostMessageServiceStub();
        r60 = r134.IEngagementSignalsCallbackStubProxy();
        r64 = r134.mayLaunchUrl();
        r41 = r134.IPostMessageService_Parcel();
        r67 = r134.IPostMessageServiceStubProxy();
        r69 = r134.ICustomTabsService();
        r71 = r134.mayLaunchUrl();
        r73 = r134.postMessage();
        r75 = r134.mayLaunchUrl();
        r35 = ((java.lang.Long) o.addFixedPosition.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r134}, 2111452320, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), -2111452315)).longValue();
        r77 = r134.ICustomTabsCallback();
        r79 = r134.onPostMessage();
        r81 = r134.MediaMetadataCompat();
        r83 = r134.RatingCompat();
        r85 = ((java.lang.Long) o.addFixedPosition.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r134}, 1889153104, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), -1889153086)).longValue();
        r20 = r134.onTransact();
        r8 = ((java.lang.Long) o.addFixedPosition.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r134}, -1572738860, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
        r22 = r134.IPostMessageService_Parcel();
        r24 = r134.IPostMessageService_Parcel();
        r26 = r134.requestPostMessageChannelWithExtras();
        r10 = r134.receiveFile();
        r28 = r134.newSessionWithExtras();
        r87 = r134.newAuthTabSession();
        r89 = r134.ICustomTabsCallback();
        r98 = ((java.lang.Long) o.addFixedPosition.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r134}, -523958350, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), 523958365)).longValue();
        r100 = r134.newSession();
        r102 = r134.AudioAttributesImplBaseParcelizer();
        r104 = r134.mayLaunchUrl();
        r106 = r134.postMessage();
        r108 = r134.extraCommand();
        r110 = r134.newSession();
        r112 = r134.postMessage();
        r114 = r134.postMessage();
        r116 = r134.onTransact();
        r118 = ((java.lang.Long) o.addFixedPosition.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r134}, -1572738860, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
        r120 = r134.IPostMessageService_Parcel();
        r122 = r134.IPostMessageService_Parcel();
        r124 = r134.isEngagementSignalsApiAvailable();
        r126 = r134.setEngagementSignalsCallback();
        r91 = ((java.lang.Long) o.addFixedPosition.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r134}, -523958350, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), 523958365)).longValue();
        r93 = r134.receiveFile();
        r95 = ((java.lang.Long) o.addFixedPosition.onExtraCallbackWithResult(im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), new java.lang.Object[]{r134}, -717684200, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
        r128 = r134.ICustomTabsCallback();
        r130 = r134.newAuthTabSession();
        r71 = new java.lang.Object[]{r134, java.lang.Long.valueOf(r1), 0L, 0L, java.lang.Long.valueOf(r4), 0L, 0L, java.lang.Long.valueOf(r102), java.lang.Long.valueOf(r8), java.lang.Long.valueOf(r89), java.lang.Long.valueOf(r10), java.lang.Long.valueOf(r87), java.lang.Long.valueOf(r98), java.lang.Long.valueOf(r28), java.lang.Long.valueOf(r20), java.lang.Long.valueOf(r22), java.lang.Long.valueOf(r24), java.lang.Long.valueOf(r26), java.lang.Long.valueOf(r100), java.lang.Long.valueOf(r124), java.lang.Long.valueOf(r120), java.lang.Long.valueOf(r134.AudioAttributesImplBaseParcelizer()), java.lang.Long.valueOf(r128), java.lang.Long.valueOf(r116), java.lang.Long.valueOf(r93), java.lang.Long.valueOf(r95), java.lang.Long.valueOf(r118), java.lang.Long.valueOf(r126), java.lang.Long.valueOf(r130), java.lang.Long.valueOf(r91), java.lang.Long.valueOf(r122), java.lang.Long.valueOf(r31), java.lang.Long.valueOf(r33), java.lang.Long.valueOf(r35), java.lang.Long.valueOf(r79), java.lang.Long.valueOf(r81), java.lang.Long.valueOf(r85), java.lang.Long.valueOf(r37), java.lang.Long.valueOf(r39), java.lang.Long.valueOf(r71), java.lang.Long.valueOf(r69), java.lang.Long.valueOf(r41), java.lang.Long.valueOf(r67), java.lang.Long.valueOf(r75), java.lang.Long.valueOf(r44), java.lang.Long.valueOf(r48), java.lang.Long.valueOf(r46), java.lang.Long.valueOf(r73), java.lang.Long.valueOf(r52), java.lang.Long.valueOf(r60), java.lang.Long.valueOf(r50), java.lang.Long.valueOf(r64), java.lang.Long.valueOf(r77), java.lang.Long.valueOf(r83), java.lang.Long.valueOf(r54), java.lang.Long.valueOf(r56), java.lang.Long.valueOf(r58), java.lang.Long.valueOf(r114), java.lang.Long.valueOf(r110), java.lang.Long.valueOf(r112), java.lang.Long.valueOf(r104), java.lang.Long.valueOf(r106), java.lang.Long.valueOf(r108), null, 108, Integer.MIN_VALUE, null};
        r70 = im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        r73 = im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x061e, code lost:
    
        return (o.y2) o.r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1976743403, im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), r70, r71, -1976743403, r73);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r2 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r2 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (r2 != 2) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final y2 IAuthTabCallback(@NotNull addFixedPosition addfixedposition) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 119;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(addfixedposition, "");
            i = onWarmupCompleted.onExtraCallbackWithResult[addfixedposition.AudioAttributesCompatParcelizer().ordinal()];
        } else {
            Intrinsics.checkNotNullParameter(addfixedposition, "");
            i = onWarmupCompleted.onExtraCallbackWithResult[addfixedposition.AudioAttributesCompatParcelizer().ordinal()];
        }
    }
}
