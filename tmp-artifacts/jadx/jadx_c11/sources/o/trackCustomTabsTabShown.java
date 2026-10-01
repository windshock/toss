package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.core.tracker.entry.TrackEvent;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import im.toss.splittarget.impl.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import o.trackCustomTabsTabShown;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.util.RRNUtils;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class trackCustomTabsTabShown implements setSegmentCollection {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static long onExtraCallback = 0;
    private static int onTransact = 1;
    private final zzag IAuthTabCallback;
    private final Lazy onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private final trackEvent onWarmupCompleted;

    static {
        asInterface();
        Companion = new onExtraCallback(null);
        int i = onTransact + 65;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStubProxy();
        }
        IAuthTabCallbackStubProxy();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Inject
    public trackCustomTabsTabShown(@NotNull trackEvent trackevent, @NotNull zzag zzagVar) {
        Intrinsics.checkNotNullParameter(trackevent, "");
        Intrinsics.checkNotNullParameter(zzagVar, "");
        this.onWarmupCompleted = trackevent;
        this.IAuthTabCallback = zzagVar;
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.impl.guest.LoginUtilImpl$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 69;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return trackCustomTabsTabShown.IAuthTabCallback();
                }
                trackCustomTabsTabShown.IAuthTabCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
    }

    private final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onExtraCallbackWithResult.getValue();
        int i4 = IAuthTabCallbackDefault + 19;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        UserChoiceBillingListener userChoiceBillingListener = UserChoiceBillingListener.onExtraCallback;
        if (i3 == 0) {
            int i4 = 19 / 0;
            return ((LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) Response.onExtraCallback(userChoiceBillingListener.onExtraCallback(), LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class)).IAuthTabCallback_Parcel().IAuthTabCallbackDefault();
        }
        return ((LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) Response.onExtraCallback(userChoiceBillingListener.onExtraCallback(), LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class)).IAuthTabCallback_Parcel().IAuthTabCallbackDefault();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r10, ((java.lang.String) r1[0]).intern()) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f8, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r10, ((java.lang.String) r4[0]).intern()) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fa, code lost:
    
        r9 = o.trackCustomTabsTabShown.IAuthTabCallbackDefault + 57;
        o.trackCustomTabsTabShown.IAuthTabCallbackStub = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0103, code lost:
    
        if ((r9 % 2) == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0107, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // o.setSegmentCollection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onExtraCallback(@NotNull String str, @NotNull String str2) throws Throwable {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 11;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if (str.length() == 71) {
                if (str2.length() == 1 && TextUtils.isDigitsOnly(str) && TextUtils.isDigitsOnly(str2) && (i = Integer.parseInt(StringsKt.substring(str, new IntRange(2, 3)))) > 0) {
                    int i4 = IAuthTabCallbackStub + 103;
                    IAuthTabCallbackDefault = i4 % 128;
                    int i5 = i4 % 2;
                    if (i <= 12) {
                        int i6 = Integer.parseInt(StringsKt.substring(str, new IntRange(4, 5)));
                        int actualMaximum = new GregorianCalendar(Integer.parseInt(RRNUtils.onExtraCallback.onNavigationEvent(str2) + StringsKt.substring(str, new IntRange(0, 1))), i - 1, 1).getActualMaximum(5);
                        if (i6 > 0) {
                            int i7 = IAuthTabCallbackStub + 117;
                            IAuthTabCallbackDefault = i7 % 128;
                            if (i7 % 2 == 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            if (i6 <= actualMaximum && !Intrinsics.areEqual(str2, "9")) {
                                int i8 = IAuthTabCallbackStub + 57;
                                IAuthTabCallbackDefault = i8 % 128;
                                if (i8 % 2 == 0) {
                                    ExpandableListView.getPackedPositionGroup(1L);
                                    Object[] objArr = new Object[1];
                                    a(new char[]{39897, 39913, 23148, 5174, 656}, 0, objArr);
                                } else {
                                    Object[] objArr2 = new Object[1];
                                    a(new char[]{39897, 39913, 23148, 5174, 656}, 1 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if (str.length() == 6) {
            }
        }
        return false;
    }

    public boolean asBinder() throws Throwable {
        boolean zOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
            Object[] objArr = new Object[1];
            a(new char[]{28743, 28716, 38771, 13795, 2165, 9875, 19942, 52755, 64506, 47561, 55700, 21068, 26496, 11657, 21902, 9850, 54116, 53604, 57727, 43687, 24416, 17769, 32041, 16085, 51981, 51459, 2312, 33528, 14042, 32506}, 1 >> (ViewConfiguration.getScrollBarSize() >>> 86), objArr);
            zOnExtraCallback = textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onExtraCallback(((String) objArr[0]).intern(), true);
        } else {
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub2 = addPolicy.ITrustedWebActivityServiceStub();
            Object[] objArr2 = new Object[1];
            a(new char[]{28743, 28716, 38771, 13795, 2165, 9875, 19942, 52755, 64506, 47561, 55700, 21068, 26496, 11657, 21902, 9850, 54116, 53604, 57727, 43687, 24416, 17769, 32041, 16085, 51981, 51459, 2312, 33528, 14042, 32506}, 1 - (ViewConfiguration.getScrollBarSize() >> 8), objArr2);
            zOnExtraCallback = textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub2.onExtraCallback(((String) objArr2[0]).intern(), false);
        }
        int i3 = IAuthTabCallbackStub + 53;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallback;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 79;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 15;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45811 - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getTapTimeout() >> 16) + 84, Process.getGidForName("") + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 19 - View.resolveSize(0, 0), 8808 - View.resolveSizeAndState(0, 0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    @Override // o.setSegmentCollection
    public void onExtraCallback(boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr = new Object[1];
        a(new char[]{28743, 28716, 38771, 13795, 2165, 9875, 19942, 52755, 64506, 47561, 55700, 21068, 26496, 11657, 21902, 9850, 54116, 53604, 57727, 43687, 24416, 17769, 32041, 16085, 51981, 51459, 2312, 33528, 14042, 32506}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
        textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onExtraCallbackWithResult(((String) objArr[0]).intern(), z, true);
        TextRoundCornerProgressBarSavedState1 smallIconBitmap = addPolicy.getSmallIconBitmap();
        Object[] objArr2 = new Object[1];
        a(new char[]{28743, 28716, 38771, 13795, 2165, 9875, 19942, 52755, 64506, 47561, 55700, 21068, 26496, 11657, 21902, 9850, 54116, 53604, 57727, 43687, 24416, 17769, 32041, 16085, 51981, 51459, 2312, 33528, 14042, 32506}, 1 - TextUtils.getOffsetAfter("", 0), objArr2);
        smallIconBitmap.onExtraCallbackWithResult(((String) objArr2[0]).intern(), z, true);
        this.onNavigationEvent = z;
        int i4 = IAuthTabCallbackDefault + 115;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.setSegmentCollection
    public boolean onExtraCallbackWithResult() throws Throwable {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zAsBinder = asBinder();
        if (IAuthTabCallbackDefault().length() == 0) {
            int i4 = IAuthTabCallbackStub + 51;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        boolean zAccess000 = RemoteWorkManager.onWarmupCompleted.access000();
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), ExpandableListView.getPackedPositionChild(0L) + 31, 24887 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(226502819);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 30 - TextUtils.indexOf("", ""), 24887 - TextUtils.getOffsetAfter("", 0), 1019270707, false, "onTransact", new Class[0]);
            }
            boolean zBooleanValue = ((Boolean) ((Method) objOnExtraCallback2).invoke(obj, null)).booleanValue();
            if (!zAsBinder || z || !zAccess000 || zBooleanValue) {
                return false;
            }
            int i6 = IAuthTabCallbackStub + 69;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            return true;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // o.setSegmentCollection
    public boolean onNavigationEvent() {
        int i = 2 % 2;
        boolean z = IAuthTabCallbackDefault().length() == 0;
        boolean zAccess000 = RemoteWorkManager.onWarmupCompleted.access000();
        boolean z2 = onExtraCallback() == 0;
        if (!z && zAccess000) {
            int i2 = IAuthTabCallbackDefault + 49;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            if (!z2) {
                int i5 = i3 + 3;
                int i6 = i5 % 128;
                IAuthTabCallbackDefault = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 91;
                IAuthTabCallbackStub = i8 % 128;
                int i9 = i8 % 2;
                return true;
            }
        }
        return false;
    }

    @Override // o.setSegmentCollection
    public boolean IAuthTabCallbackStub() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 smallIconBitmap = addPolicy.getSmallIconBitmap();
        Object[] objArr = new Object[1];
        a(new char[]{33163, 33250, 7963, 48541, 28281, 31524, 11231, 37780, 2616, 12731, 49065, 4057, 38486, 42466, 13196, 31686, 8868, 22793, 34679, 63258, 44735, 52523, 6959, 25454, 15051}, 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        boolean zOnExtraCallback = smallIconBitmap.onExtraCallback(((String) objArr[0]).intern(), false);
        int i4 = IAuthTabCallbackDefault + 75;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }

    @Override // o.setSegmentCollection
    public void onTransact() throws Throwable {
        Date dateIAuthTabCallback;
        int i = 2 % 2;
        TextRoundCornerProgressBarSavedState1 smallIconBitmap = addPolicy.getSmallIconBitmap();
        Object[] objArr = new Object[1];
        a(new char[]{33163, 33250, 7963, 48541, 28281, 31524, 11231, 37780, 2616, 12731, 49065, 4057, 38486, 42466, 13196, 31686, 8868, 22793, 34679, 63258, 44735, 52523, 6959, 25454, 15051}, -TextUtils.lastIndexOf("", '0'), objArr);
        smallIconBitmap.onNavigationEvent(((String) objArr[0]).intern(), true);
        if (!zzaj.onNavigationEvent().onActivityLayout()) {
            zzag zzagVar = this.IAuthTabCallback;
            dateIAuthTabCallback = (Date) zzae.onExtraCallbackWithResult(GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 846572318, new Object[]{zzagVar, zzagVar.asBinder(), 24}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -846572318);
        } else {
            zzag zzagVar2 = this.IAuthTabCallback;
            dateIAuthTabCallback = zzae.IAuthTabCallback(zzagVar2, zzagVar2.asBinder(), 1);
            int i2 = IAuthTabCallbackDefault + 111;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
        }
        trackEvent trackevent = this.onWarmupCompleted;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("reservedId", "10003");
        UserChoiceBillingListener userChoiceBillingListener = UserChoiceBillingListener.onExtraCallback;
        Object[] objArr2 = new Object[1];
        a(new char[]{31004, 31080, 52006, 27066, 33620, 15264, 50890, 54035, 62125}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 1, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), userChoiceBillingListener.onExtraCallback().getString(R.string.split_target_impl_join_pending_title));
        Object[] objArr3 = new Object[1];
        a(new char[]{1545, 1636, 4890, 45450, 21331, 28905, 5834, 38981, 36284, 15796, 33416}, 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), userChoiceBillingListener.onExtraCallback().getString(R.string.split_target_impl_join_pending_message));
        Object[] objArr4 = new Object[1];
        a(new char[]{36269, 36318, 50615, 26423, 13895, 36825, 29661, 26467, 1547, 60170, 59286, 64281, 39542, 32528, 27642, 36721, 11964, 33703, 57160, 1004}, Color.green(0) + 1, objArr4);
        trackevent.onExtraCallbackWithResult(new trackInAppPurchase(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback("actionUri", ((String) objArr4[0]).intern()), getWrite.IAuthTabCallback("reservationDate", CommonModule_closeView.onWarmupCompleted.IAuthTabCallbackDefault().format(dateIAuthTabCallback))})));
        TrackEvent.IAuthTabCallback iAuthTabCallback = new TrackEvent.IAuthTabCallback("register_scheduled_notification");
        Object[] objArr5 = new Object[1];
        a(new char[]{29412, 29328, 47867, 6263, 22266, 44349, 4960, 17799}, -ExpandableListView.getPackedPositionChild(0L), objArr5);
        Object[] objArr6 = {iAuthTabCallback.onNavigationEvent(((String) objArr5[0]).intern(), "login_nudge").IAuthTabCallback(new r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc[]{r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.TOSS}).onWarmupCompleted()};
        ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -870178991, objArr6, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
        int i4 = IAuthTabCallbackDefault + 69;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.setSegmentCollection
    public void onWarmupCompleted() throws Throwable {
        int i = 2 % 2;
        this.onWarmupCompleted.IAuthTabCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), "10003");
        this.onWarmupCompleted.IAuthTabCallback(10003);
        TrackEvent.IAuthTabCallback iAuthTabCallback = new TrackEvent.IAuthTabCallback("cancel_scheduled_notification");
        Object[] objArr = new Object[1];
        a(new char[]{29412, 29328, 47867, 6263, 22266, 44349, 4960, 17799}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
        Object[] objArr2 = {iAuthTabCallback.onNavigationEvent(((String) objArr[0]).intern(), "login_nudge").IAuthTabCallback(new r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc[]{r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.TOSS}).onWarmupCompleted()};
        ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -870178991, objArr2, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
        int i2 = IAuthTabCallbackStub + 43;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.setSegmentCollection
    public long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        long jOnExtraCallback = addPolicy.getSmallIconBitmap().onExtraCallback("prefs_key_guest_install_id", 0L);
        int i4 = IAuthTabCallbackStub + 89;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return jOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setSegmentCollection
    public void IAuthTabCallback(long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        addPolicy.getSmallIconBitmap().onNavigationEvent("prefs_key_guest_install_id", j);
        int i4 = IAuthTabCallbackDefault + 37;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    static void asInterface() {
        onExtraCallback = -671030730793166343L;
    }
}
