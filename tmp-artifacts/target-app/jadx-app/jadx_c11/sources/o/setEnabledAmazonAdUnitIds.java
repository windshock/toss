package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.ResourceUriFetcherFactory;
import o.setEnabledAmazonAdUnitIds;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setEnabledAmazonAdUnitIds {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ setEnabledAmazonAdUnitIds[] $VALUES;
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    public static final setEnabledAmazonAdUnitIds NON_SECURE;
    public static final setEnabledAmazonAdUnitIds SECURE;
    public static final setEnabledAmazonAdUnitIds UNDEFINED;
    private static boolean allowSecureScreenCapture;
    private static final Lazy<ResourceUriFetcherFactory> entity$delegate;
    private static long onNavigationEvent;
    private static char onWarmupCompleted;
    private static final byte[] $$a = {34, -66, 77, 18};
    private static final int $$b = 220;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, short s) {
        int i2;
        int i3 = 3 - (s * 2);
        byte[] bArr = $$a;
        int i4 = b * 4;
        int i5 = 110 - i;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i5 += i3;
            i3 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            int i8 = i2 + 1;
            int i9 = i3 + 1;
            i6 = i9;
            i3 = bArr[i9];
            i7 = i8;
            i5 += i3;
            i3 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    /* renamed from: $r8$lambda$395EIV-kHt0gepSKBUSuKFhjhhc, reason: not valid java name */
    public static /* synthetic */ ResourceUriFetcherFactory m98$r8$lambda$395EIVkHt0gepSKBUSuKFhjhhc() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return entity_delegate$lambda$0();
        }
        entity_delegate$lambda$0();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ setEnabledAmazonAdUnitIds[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 37;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        setEnabledAmazonAdUnitIds[] setenabledamazonadunitidsArr = {UNDEFINED, NON_SECURE, SECURE};
        int i5 = i2 + 27;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return setenabledamazonadunitidsArr;
    }

    public static EnumEntries<setEnabledAmazonAdUnitIds> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        EnumEntries<setEnabledAmazonAdUnitIds> enumEntries = $ENTRIES;
        int i5 = i3 + 113;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static setEnabledAmazonAdUnitIds valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        setEnabledAmazonAdUnitIds setenabledamazonadunitids = (setEnabledAmazonAdUnitIds) Enum.valueOf(setEnabledAmazonAdUnitIds.class, str);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 7;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return setenabledamazonadunitids;
        }
        throw null;
    }

    public static setEnabledAmazonAdUnitIds[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setEnabledAmazonAdUnitIds[] setenabledamazonadunitidsArr = (setEnabledAmazonAdUnitIds[]) $VALUES.clone();
        int i4 = onExtraCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return setenabledamazonadunitidsArr;
        }
        throw null;
    }

    private setEnabledAmazonAdUnitIds(String str, int i) {
    }

    public static final /* synthetic */ Lazy access$getEntity$delegate$cp() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Lazy<ResourceUriFetcherFactory> lazy = entity$delegate;
        int i5 = i3 + 7;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return lazy;
    }

    public static final /* synthetic */ void access$setAllowSecureScreenCapture$cp(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        allowSecureScreenCapture = z;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 67;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallbackStub = 0;
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a((char) View.MeasureSpec.getMode(0), 1639938628 - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{47359, 48209, 36111, 45460, 3434, 39706, 31788, 21143, 8190}, new char[]{0, 0, 0, 0}, new char[]{17846, 49018, 47457, 738}, objArr);
        UNDEFINED = new setEnabledAmazonAdUnitIds(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        a((char) View.MeasureSpec.makeMeasureSpec(0, 0), 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{48459, 37972, 21906, 32336, 64981, 37905, 39500, 46601, 32727, 23979}, new char[]{0, 0, 0, 0}, new char[]{4002, 12438, 9210, 28849}, objArr2);
        NON_SECURE = new setEnabledAmazonAdUnitIds(((String) objArr2[0]).intern(), 1);
        Object[] objArr3 = new Object[1];
        a((char) (54349 - KeyEvent.normalizeMetaState(0)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, new char[]{63960, 63772, 64714, 65122, 38330, 53707}, new char[]{0, 0, 0, 0}, new char[]{34102, 11560, 19761, 62420}, objArr3);
        SECURE = new setEnabledAmazonAdUnitIds(((String) objArr3[0]).intern(), 2);
        setEnabledAmazonAdUnitIds[] setenabledamazonadunitidsArr$values = $values();
        $VALUES = setenabledamazonadunitidsArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(setenabledamazonadunitidsArr$values);
        Companion = new onExtraCallbackWithResult(null);
        entity$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.spec.secure.SecureScreenMode$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = (i2 & 9) + (i2 | 9);
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                ResourceUriFetcherFactory resourceUriFetcherFactoryM98$r8$lambda$395EIVkHt0gepSKBUSuKFhjhhc = setEnabledAmazonAdUnitIds.m98$r8$lambda$395EIVkHt0gepSKBUSuKFhjhhc();
                int i5 = IAuthTabCallback;
                int i6 = (i5 ^ 111) + ((i5 & 111) << 1);
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return resourceUriFetcherFactoryM98$r8$lambda$395EIVkHt0gepSKBUSuKFhjhhc;
            }
        });
        int i = asInterface + 35;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public static final class onExtraCallbackWithResult {
        private static final byte[] $$a = {78, -86, Byte.MIN_VALUE, Byte.MIN_VALUE};
        private static final int $$b = 220;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static char[] onWarmupCompleted = {60853, 20959, 38262, 55438, 7231, 17284, 34779, 52070, 3737, 29241, 45495, 62954, 14691, 31901, 40979, 59320, 11210, 28480, 53899, 5633, 21932, 39378, 56700, 240};
        private static long onNavigationEvent = -5961787597621341773L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(int i, byte b, byte b2) {
            int i2;
            int i3;
            int i4 = 97 - (i * 3);
            int i5 = (b2 * 2) + 1;
            int i6 = 3 - (b * 4);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                int i7 = i4;
                i4 = i5;
                i3 = 0;
                i4 += i7;
                i2 = i3;
                i6++;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i4;
                if (i3 == i5) {
                    return new String(bArr2, 0);
                }
                i7 = bArr[i6];
                i4 += i7;
                i2 = i3;
                i6++;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i4;
                if (i3 == i5) {
                }
            } else {
                i2 = 0;
                i6++;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i4;
                if (i3 == i5) {
                }
            }
        }

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        private final ResourceUriFetcherFactory IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) setEnabledAmazonAdUnitIds.access$getEntity$delegate$cp().getValue();
            int i4 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return resourceUriFetcherFactory;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean onExtraCallback() throws Throwable {
            int i = 2 % 2;
            if (zzaj.onNavigationEvent().IconCompatParcelizer()) {
                int i2 = onExtraCallbackWithResult + 21;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (zzaj.onNavigationEvent().MediaBrowserCompatMediaItem()) {
                int i4 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1RequestPostMessageChannel = IAuthTabCallback().requestPostMessageChannel();
                Object[] objArr = new Object[1];
                a(ViewConfiguration.getJumpTapTimeout() >> 16, TextUtils.getTrimmedLength("") + 24, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
                return textRoundCornerProgressBarSavedState1RequestPostMessageChannel.onExtraCallback(((String) objArr[0]).intern(), true);
            }
            if (DERSet.onExtraCallback.onRequestPermissionsResult() || zzaj.onNavigationEvent().RemoteActionCompatParcelizer()) {
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1RequestPostMessageChannel2 = IAuthTabCallback().requestPostMessageChannel();
                Object[] objArr2 = new Object[1];
                a(View.MeasureSpec.getSize(0), 24 - TextUtils.getTrimmedLength(""), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
                if (textRoundCornerProgressBarSavedState1RequestPostMessageChannel2.onExtraCallback(((String) objArr2[0]).intern(), false)) {
                    int i6 = IAuthTabCallback + 93;
                    onExtraCallbackWithResult = i6 % 128;
                    return i6 % 2 != 0;
                }
            }
            int i7 = IAuthTabCallback + 113;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public final boolean onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                zzaj.onNavigationEvent().onActivityLayout();
                obj.hashCode();
                throw null;
            }
            if (!zzaj.onNavigationEvent().onActivityLayout()) {
                int i3 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                if (!onExtraCallback()) {
                    return false;
                }
            }
            int i5 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - ExpandableListView.getPackedPositionType(0L)), TextUtils.indexOf("", "", 0) + 17, ((byte) KeyEvent.getModifierMetaStateMask()) + 10974, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 46135), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getEdgeSlop() >> 16)), 44 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf("", "") + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i5 = $11 + 101;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i7 = $11 + 33;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 49124), 43 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), Color.blue(0) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr);
        }
    }

    private static final ResourceUriFetcherFactory entity_delegate$lambda$0() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Response response = Response.onNavigationEvent;
            ResourceUriFetcherFactory resourceUriFetcherFactoryExtraCallback = ((RealInterceptorChain) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), RealInterceptorChain.class)).extraCallback();
            int i3 = onExtraCallback + 87;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return resourceUriFetcherFactoryExtraCallback;
        }
        Response response2 = Response.onNavigationEvent;
        ((RealInterceptorChain) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), RealInterceptorChain.class)).extraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $11 + 81;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 42 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1451 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 1;
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Drawable.resolveOpacity(0, 0)), 44 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getPressedStateDuration() >> 16)), 50 - (ViewConfiguration.getPressedStateDuration() >> 16), View.MeasureSpec.getMode(0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 45848), 29 - (ViewConfiguration.getKeyRepeatDelay() >> 16), View.getDefaultSize(0, 0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            int i6 = $10 + 65;
                            $11 = i6 % 128;
                            int i7 = i6 % 2;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = 7798559133331975163L;
        IAuthTabCallback = -1776194565;
        onWarmupCompleted = (char) 11479;
    }
}
