package o;

import com.google.firebase.messaging.FcmBroadcastProcessor$;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onAdViewAdDisplayed {
    private static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final Set<r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU> IAuthTabCallback = clearFaultAdjacentMetadata.onExtraCallback(r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU.IDLE);
    private static int IAuthTabCallbackDefault = 0;
    private static final Set<r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU> IAuthTabCallbackStub;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static final Set<r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU> onExtraCallback;
    private static final Set<r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU> onExtraCallbackWithResult;
    private static final Set<r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU> onNavigationEvent;
    private static int onTransact = 1;
    private static final Set<r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU> onWarmupCompleted;
    private volatile int asBinder;
    private volatile r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU asInterface = r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU.IDLE;

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = (~(i7 | i6)) | (~(i7 | i5));
        int i9 = (~i6) | i4;
        int i10 = ~(i9 | i5);
        int i11 = (~(i6 | (~i5))) | (~i9);
        int i12 = i4 + i5 + i + (243328196 * i2) + (549715570 * i3);
        int i13 = i12 * i12;
        int i14 = ((-90835549) * i4) + 1264254976 + ((-1099560353) * i5) + (i8 * 1643121246) + (1643121246 * i10) + ((-1643121246) * i11) + (1552285696 * i) + (781713408 * i2) + (665583616 * i3) + (1005256704 * i13);
        int i15 = (i4 * 1467389705) + 421362043 + (i5 * 1467387837) + (i8 * (-934)) + (i10 * (-934)) + (i11 * 934) + (i * 1467388771) + (i2 * (-1383267380)) + (i3 * 1030937622) + (i13 * 484507648);
        if (i14 + (i15 * i15 * 1164771328) == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        onAdViewAdDisplayed onadviewaddisplayed = (onAdViewAdDisplayed) objArr[0];
        int i16 = 2 % 2;
        if (onadviewaddisplayed.IAuthTabCallback(onNavigationEvent, r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU.TEARING_DOWN)) {
            onadviewaddisplayed.asBinder++;
            int i17 = access000 + 117;
            IAuthTabCallback_Parcel = i17 % 128;
            int i18 = i17 % 2;
            return true;
        }
        int i19 = access000;
        int i20 = i19 + 89;
        IAuthTabCallback_Parcel = i20 % 128;
        int i21 = i20 % 2;
        int i22 = i19 + 39;
        IAuthTabCallback_Parcel = i22 % 128;
        int i23 = i22 % 2;
        return false;
    }

    public final r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access000 + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU r8lambdaypbehz5ra5p5wnmtpdvivw5pddu = this.asInterface;
        int i3 = IAuthTabCallback_Parcel + 17;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return r8lambdaypbehz5ra5p5wnmtpdvivw5pddu;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        onAdViewAdDisplayed onadviewaddisplayed = (onAdViewAdDisplayed) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 17;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onadviewaddisplayed.asBinder;
        if (i3 == 0) {
            throw null;
        }
        int i5 = IAuthTabCallback_Parcel + 105;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return Integer.valueOf(i4);
        }
        int i6 = 48 / 0;
        return Integer.valueOf(i4);
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 105;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        if (this.asInterface != r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU.READY) {
            return false;
        }
        int i4 = access000 + 91;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 37;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted.contains(this.asInterface);
            throw null;
        }
        boolean zContains = onWarmupCompleted.contains(this.asInterface);
        int i3 = access000 + 105;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return zContains;
    }

    public final boolean asBinder() {
        int i = 2 % 2;
        int i2 = access000 + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Set<r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU> set = IAuthTabCallbackStub;
        if (i3 == 0) {
            return set.contains(this.asInterface);
        }
        int i4 = 56 / 0;
        return set.contains(this.asInterface);
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access000 + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(IAuthTabCallback, r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU.BOOTING);
        int i4 = IAuthTabCallback_Parcel + 109;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000 + 5;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(onExtraCallbackWithResult, r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU.READY);
            throw null;
        }
        boolean zIAuthTabCallback = IAuthTabCallback(onExtraCallbackWithResult, r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU.READY);
        int i3 = access000 + 99;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return zIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean onWarmupCompleted() {
        boolean zIAuthTabCallback;
        int i = 2 % 2;
        int i2 = access000 + 31;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            zIAuthTabCallback = IAuthTabCallback(onExtraCallbackWithResult, r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU.BOOT_FAILED);
            int i3 = 55 / 0;
        } else {
            zIAuthTabCallback = IAuthTabCallback(onExtraCallbackWithResult, r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU.BOOT_FAILED);
        }
        int i4 = IAuthTabCallback_Parcel + 89;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        return o.onInterstitialAdClicked.STALE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r5 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (IAuthTabCallback(o.onAdViewAdDisplayed.onExtraCallback, o.r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU.TEARDOWN_FAILED) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        return o.onInterstitialAdClicked.FAILED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        return o.onInterstitialAdClicked.ALREADY_CLOSED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (IAuthTabCallback(o.onAdViewAdDisplayed.onExtraCallback, o.r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU.IDLE) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        r4 = o.onAdViewAdDisplayed.access000 + 49;
        o.onAdViewAdDisplayed.IAuthTabCallback_Parcel = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if ((r4 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        return o.onInterstitialAdClicked.COMPLETED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        r4 = o.onInterstitialAdClicked.COMPLETED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r4 = o.onInterstitialAdClicked.ALREADY_CLOSED;
        r5 = o.onAdViewAdDisplayed.access000 + 75;
        o.onAdViewAdDisplayed.IAuthTabCallback_Parcel = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4 != r3.asBinder) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r4 != r3.asBinder) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final onInterstitialAdClicked IAuthTabCallback(int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 79;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 35 / 0;
        }
    }

    private final boolean IAuthTabCallback(Set<? extends r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU> set, r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU r8lambdaypbehz5ra5p5wnmtpdvivw5pddu) {
        int i = 2 % 2;
        if (set.contains(this.asInterface)) {
            this.asInterface = r8lambdaypbehz5ra5p5wnmtpdvivw5pddu;
            int i2 = access000 + 77;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = IAuthTabCallback_Parcel;
        int i5 = i4 + 101;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 5;
        access000 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 59 / 0;
        }
        return false;
    }

    static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    static {
        r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU r8lambdaypbehz5ra5p5wnmtpdvivw5pddu = r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU.BOOTING;
        onExtraCallbackWithResult = clearFaultAdjacentMetadata.onExtraCallback(r8lambdaypbehz5ra5p5wnmtpdvivw5pddu);
        r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU r8lambdaypbehz5ra5p5wnmtpdvivw5pddu2 = r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU.TEARING_DOWN;
        onExtraCallback = clearFaultAdjacentMetadata.onExtraCallback(r8lambdaypbehz5ra5p5wnmtpdvivw5pddu2);
        onNavigationEvent = clearFaultAdjacentMetadata.onExtraCallback(new r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU[]{r8lambdaypbehz5ra5p5wnmtpdvivw5pddu, r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU.READY});
        Set<r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU> setOnExtraCallback = clearFaultAdjacentMetadata.onExtraCallback(new r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU[]{r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU.BOOT_FAILED, r8lambdaypBeHZ5rA5P5wNMTPDvivW5PddU.TEARDOWN_FAILED});
        IAuthTabCallbackStub = setOnExtraCallback;
        onWarmupCompleted = clearFaultAdjacentMetadata.IAuthTabCallback(setOnExtraCallback, r8lambdaypbehz5ra5p5wnmtpdvivw5pddu2);
        int i = onTransact + 21;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public final boolean IAuthTabCallback() {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return ((Boolean) onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -767343973, 767343973, new Object[]{this}, iOnExtraCallback)).booleanValue();
    }

    public final int onNavigationEvent() {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return ((Integer) onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -205907750, 205907751, new Object[]{this}, iOnExtraCallback)).intValue();
    }
}
