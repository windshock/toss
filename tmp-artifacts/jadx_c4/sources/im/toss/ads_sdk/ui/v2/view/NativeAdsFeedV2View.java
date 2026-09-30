package im.toss.ads_sdk.ui.v2.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.ads_sdk.R;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.ui.v2.view.NativeAdsFeedV2View;
import im.toss.features.home.core.local.model.TransactionFilterLocal;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography13;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CustomVersionedParcelable;
import o.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import o.TimelineExternalSyntheticLambda0;
import o.access8100;
import o.deleteProfile;
import o.getAdService;
import o.getRearDisplayMetrics;
import o.getSpecialFeatureOptInStatus;
import o.getStrokeWidth;
import o.getUrlokhttp;
import o.getWrite;
import o.readIntokhttp;
import o.setTagsokhttp;
import o.setVisitUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeAdsFeedV2View extends ConstraintLayout {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static long onExtraCallbackWithResult = -3870755903842686781L;
    private static int onWarmupCompleted;
    private final CustomVersionedParcelable onExtraCallback;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsFeedV2View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsFeedV2View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit onExtraCallback(IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStub(iAuthTabCallback, feed, motionEvent);
        }
        IAuthTabCallbackStub(iAuthTabCallback, feed, motionEvent);
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i4);
        int i9 = ~i5;
        int i10 = ~i4;
        int i11 = (~(i10 | i7)) | i9;
        int i12 = (~(i3 | i4)) | (~(i7 | i9 | i10));
        int i13 = i5 + i4 + i + ((-1136091917) * i2) + (376669458 * i6);
        int i14 = i13 * i13;
        int i15 = ((-905468225) * i5) + 1718550528 + ((-1748215485) * i4) + (i8 * (-421373630)) + (421373630 * i11) + ((-421373630) * i12) + ((-1326841856) * i) + ((-2044854272) * i2) + (41156608 * i6) + (1721171968 * i14);
        int i16 = ((i5 * (-924404593)) - 1636593565) + (i4 * (-924403757)) + (i8 * 418) + (i11 * (-418)) + (i12 * 418) + (i * (-924404175)) + (i2 * (-2083730301)) + (i6 * 182666354) + (i14 * (-51970048));
        return i15 + ((i16 * i16) * (-653721600)) != 1 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface(iAuthTabCallback, feed, motionEvent);
        }
        asInterface(iAuthTabCallback, feed, motionEvent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
        NativeAdsDto.Creative.Feed feed = (NativeAdsDto.Creative.Feed) objArr[1];
        MotionEvent motionEvent = (MotionEvent) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(iAuthTabCallback, feed, motionEvent);
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onNavigationEvent(IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onTransact(iAuthTabCallback, feed, motionEvent);
            throw null;
        }
        Unit unitOnTransact = onTransact(iAuthTabCallback, feed, motionEvent);
        int i3 = IAuthTabCallback + 73;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 94 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onNavigationEvent(CustomVersionedParcelable customVersionedParcelable, IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        Unit unit = (Unit) onExtraCallbackWithResult(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 1550885138, -1550885138, new Object[]{customVersionedParcelable, iAuthTabCallback, feed, motionEvent}, TransactionFilterLocal.Companion.onNavigationEvent());
        int i4 = IAuthTabCallback + 47;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(iAuthTabCallback, feed, motionEvent);
        int i4 = onWarmupCompleted + 105;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeAdsFeedV2View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        CustomVersionedParcelable customVersionedParcelableOnExtraCallbackWithResult = CustomVersionedParcelable.onExtraCallbackWithResult(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(customVersionedParcelableOnExtraCallbackWithResult, "");
        this.onExtraCallback = customVersionedParcelableOnExtraCallbackWithResult;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeAdsFeedV2View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onWarmupCompleted + 91;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 30 / 0;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = IAuthTabCallback + 79;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 3;
            } else {
                int i7 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 35;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 83 - TextUtils.lastIndexOf("", '0'), Color.argb(0, 0, 0, 0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14184 - ((byte) KeyEvent.getModifierMetaStateMask())), 19 - KeyEvent.normalizeMetaState(0), ExpandableListView.getPackedPositionChild(0L) + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $11 + 71;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
        
            if ((r2 % 2) == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
        
            r0 = 96 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.IAuthTabCallback) != true) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r4.IAuthTabCallback)) != true) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        
            r1 = im.toss.ads_sdk.ui.v2.view.NativeAdsFeedV2View.IAuthTabCallbackDefault.onWarmupCompleted + 113;
            im.toss.ads_sdk.ui.v2.view.NativeAdsFeedV2View.IAuthTabCallbackDefault.onExtraCallbackWithResult = r1 % 128;
            r1 = r1 % 2;
            r1 = o.getSpecialFeatureOptInStatus.Dark;
            r2 = im.toss.ads_sdk.ui.v2.view.NativeAdsFeedV2View.IAuthTabCallbackDefault.onWarmupCompleted + 37;
            im.toss.ads_sdk.ui.v2.view.NativeAdsFeedV2View.IAuthTabCallbackDefault.onExtraCallbackWithResult = r2 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 73 / 0;
            }
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onExtraCallbackWithResult + 125;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class IAuthTabCallback_Parcel implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallback_Parcel(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i4 = onNavigationEvent + 11;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return getspecialfeatureoptinstatus;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i6 = onWarmupCompleted + 9;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class access000 implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public access000(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = IAuthTabCallback + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onNavigationEvent + 25;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 1 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class access100 implements getAdService {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration IAuthTabCallback;

        public access100(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onWarmupCompleted + 81;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i6 = onNavigationEvent + 69;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    public static final class asBinder implements getAdService {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public asBinder(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onExtraCallback + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onExtraCallback + 25;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class asInterface implements getAdService {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onNavigationEvent;

        public asInterface(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = onExtraCallbackWithResult + 125;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                if (i4 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onNavigationEvent);
            obj.hashCode();
            throw null;
        }
    }

    public static final class getInterfaceDescriptor implements getAdService {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public getInterfaceDescriptor(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onWarmupCompleted + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onExtraCallback + 39;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onExtraCallback + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = IAuthTabCallback + 111;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i2 = onNavigationEvent + 101;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
            int i4 = onWarmupCompleted + 63;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus2;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onNavigationEvent;

        public onNavigationEvent(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onNavigationEvent) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onNavigationEvent) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Dark;
            r2 = im.toss.ads_sdk.ui.v2.view.NativeAdsFeedV2View.onNavigationEvent.onExtraCallbackWithResult + 85;
            im.toss.ads_sdk.ui.v2.view.NativeAdsFeedV2View.onNavigationEvent.IAuthTabCallback = r2 % 128;
            r2 = r2 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 43 / 0;
            }
        }
    }

    public static final class onTransact implements getAdService {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onTransact(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallbackWithResult + 125;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i6 = onExtraCallback + 65;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onNavigationEvent;

        public onWarmupCompleted(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                if (readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onWarmupCompleted + 75;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onNavigationEvent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit IAuthTabCallbackStub(IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            iAuthTabCallback.onExtraCallbackWithResult(feed, feed.onWarmupCompleted(), "1004");
            return Unit.INSTANCE;
        }
        iAuthTabCallback.onExtraCallbackWithResult(feed, feed.onWarmupCompleted(), "1004");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asInterface(IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            iAuthTabCallback.onExtraCallbackWithResult(feed, feed.onWarmupCompleted(), "2500");
            return Unit.INSTANCE;
        }
        iAuthTabCallback.onExtraCallbackWithResult(feed, feed.onWarmupCompleted(), "2500");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str;
        CustomVersionedParcelable customVersionedParcelable = (CustomVersionedParcelable) objArr[0];
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[1];
        NativeAdsDto.Creative.Feed feed = (NativeAdsDto.Creative.Feed) objArr[2];
        MotionEvent motionEvent = (MotionEvent) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 41;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (motionEvent != null) {
            int i5 = i2 + 9;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(customVersionedParcelable.IAuthTabCallbackDefault, "");
            if (!(!getstrokewidth.onExtraCallback((View) r7, x, y))) {
                str = "1000";
            } else {
                Intrinsics.checkNotNullExpressionValue(customVersionedParcelable.access000, "");
                if (!(!getstrokewidth.onExtraCallback((View) r0, x, y))) {
                    int i7 = onWarmupCompleted + 67;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    str = "1002";
                } else {
                    str = null;
                }
            }
            iAuthTabCallback.onExtraCallbackWithResult(feed, feed.onWarmupCompleted(), str);
        } else {
            IAuthTabCallback.onExtraCallbackWithResult(iAuthTabCallback, feed, feed.onWarmupCompleted(), null, 4, null);
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback.onExtraCallbackWithResult(iAuthTabCallback, feed, feed.onWarmupCompleted(), null, 4, null);
        } else {
            IAuthTabCallback.onExtraCallbackWithResult(iAuthTabCallback, feed, feed.onWarmupCompleted(), null, 4, null);
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            iAuthTabCallback.onExtraCallbackWithResult(feed, feed.onWarmupCompleted(), "2005");
            int i3 = 6 / 0;
            return Unit.INSTANCE;
        }
        iAuthTabCallback.onExtraCallbackWithResult(feed, feed.onWarmupCompleted(), "2005");
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) throws Throwable {
        String strOnWarmupCompleted;
        Object obj;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            strOnWarmupCompleted = feed.onWarmupCompleted();
            Object[] objArr = new Object[1];
            a(new char[]{12121, 26283, 56811, 48394, 12137}, 1 - (TypedValue.complexToFraction(0, 2.0f, 0.0f) > 2.0f ? 1 : (TypedValue.complexToFraction(0, 2.0f, 0.0f) == 2.0f ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            strOnWarmupCompleted = feed.onWarmupCompleted();
            Object[] objArr2 = new Object[1];
            a(new char[]{12121, 26283, 56811, 48394, 12137}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr2);
            obj = objArr2[0];
        }
        iAuthTabCallback.onExtraCallbackWithResult(feed, strOnWarmupCompleted, ((String) obj).intern());
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 11;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setItem(@NotNull final NativeAdsDto.Creative.Feed feed, @NotNull deleteProfile deleteprofile, boolean z, @NotNull final IAuthTabCallback iAuthTabCallback) throws Throwable {
        int iIsEngagementSignalsApiAvailable;
        int iIsEngagementSignalsApiAvailable2;
        int iIsEngagementSignalsApiAvailable3;
        int iOnMinimized;
        int iOnActivityLayout;
        int i;
        float f;
        Configuration configuration;
        String strAsInterface;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(feed, "");
        Intrinsics.checkNotNullParameter(deleteprofile, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        final CustomVersionedParcelable customVersionedParcelable = this.onExtraCallback;
        getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        boolean zOnExtraCallbackWithResult = getstrokewidth.onExtraCallbackWithResult(context, deleteprofile);
        if (zOnExtraCallbackWithResult) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            iIsEngagementSignalsApiAvailable = new getUrlokhttp(new onExtraCallbackWithResult(configuration2)).onSessionEnded();
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration3 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            iIsEngagementSignalsApiAvailable = new getUrlokhttp(new IAuthTabCallbackStub(configuration3)).requestPostMessageChannel().isEngagementSignalsApiAvailable();
        }
        if (zOnExtraCallbackWithResult) {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            Configuration configuration4 = context4.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration4, "");
            iIsEngagementSignalsApiAvailable2 = new getUrlokhttp(new asInterface(configuration4)).onSessionEnded();
        } else {
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            Configuration configuration5 = context5.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration5, "");
            iIsEngagementSignalsApiAvailable2 = new getUrlokhttp(new asBinder(configuration5)).requestPostMessageChannel().isEngagementSignalsApiAvailable();
        }
        if (zOnExtraCallbackWithResult) {
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            Configuration configuration6 = context6.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration6, "");
            iIsEngagementSignalsApiAvailable3 = new getUrlokhttp(new IAuthTabCallbackDefault(configuration6)).onSessionEnded();
        } else {
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "");
            Configuration configuration7 = context7.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration7, "");
            iIsEngagementSignalsApiAvailable3 = new getUrlokhttp(new access000(configuration7)).requestPostMessageChannel().isEngagementSignalsApiAvailable();
        }
        this.onExtraCallback.asBinder.setBackgroundColor(iIsEngagementSignalsApiAvailable);
        this.onExtraCallback.asBinder.setStrokeColor(iIsEngagementSignalsApiAvailable2);
        Typography6 typography6 = this.onExtraCallback.getInterfaceDescriptor;
        if (zOnExtraCallbackWithResult) {
            Context context8 = getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "");
            Configuration configuration8 = context8.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration8, "");
            iOnMinimized = new getUrlokhttp(new getInterfaceDescriptor(configuration8)).IPostMessageService();
        } else {
            Context context9 = getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "");
            Configuration configuration9 = context9.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration9, "");
            iOnMinimized = new getUrlokhttp(new IAuthTabCallback_Parcel(configuration9)).requestPostMessageChannel().onMinimized();
        }
        typography6.setTextColor(iOnMinimized);
        Typography7 typography7 = this.onExtraCallback.IAuthTabCallback_Parcel;
        if (zOnExtraCallbackWithResult) {
            Context context10 = getContext();
            Intrinsics.checkNotNullExpressionValue(context10, "");
            Configuration configuration10 = context10.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration10, "");
            iOnActivityLayout = new getUrlokhttp(new access100(configuration10)).onVerticalScrollEvent();
        } else {
            Context context11 = getContext();
            Intrinsics.checkNotNullExpressionValue(context11, "");
            Configuration configuration11 = context11.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration11, "");
            iOnActivityLayout = new getUrlokhttp(new onWarmupCompleted(configuration11)).requestPostMessageChannel().onActivityLayout();
        }
        typography7.setTextColor(iOnActivityLayout);
        Typography6 typography62 = this.onExtraCallback.IAuthTabCallbackDefault;
        Context context12 = getContext();
        Intrinsics.checkNotNullExpressionValue(context12, "");
        Configuration configuration12 = context12.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration12, "");
        typography62.setTextColor(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onExtraCallback(configuration12))}, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
        SubTypography13 subTypography13 = this.onExtraCallback.access000;
        Context context13 = getContext();
        Intrinsics.checkNotNullExpressionValue(context13, "");
        Configuration configuration13 = context13.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration13, "");
        subTypography13.setTextColor(new getUrlokhttp(new onNavigationEvent(configuration13)).IPostMessageServiceStub());
        this.onExtraCallback.access100.setTextColor(Color.parseColor("#ff8b95a1"));
        TdsRoundLayout tdsRoundLayout = this.onExtraCallback.onTransact;
        Context context14 = getContext();
        Intrinsics.checkNotNullExpressionValue(context14, "");
        Configuration configuration14 = context14.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration14, "");
        tdsRoundLayout.setBackgroundColor(new getUrlokhttp(new onTransact(configuration14)).access200());
        this.onExtraCallback.onTransact.setStrokeColor(iIsEngagementSignalsApiAvailable3);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(customVersionedParcelable.getInterfaceDescriptor, "1004");
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(customVersionedParcelable.asBinder, "2500");
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(customVersionedParcelable.IAuthTabCallbackDefault, "1000");
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(customVersionedParcelable.access000, "1002");
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(customVersionedParcelable.onNavigationEvent, "2005");
        ConstraintLayout constraintLayout = customVersionedParcelable.asInterface;
        Object[] objArr = new Object[1];
        a(new char[]{12121, 26283, 56811, 48394, 12137}, KeyEvent.normalizeMetaState(0) + 1, objArr);
        Function0<Unit> function0OnWarmupCompleted = getRearDisplayMetrics.onWarmupCompleted(this, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, getWrite.IAuthTabCallback(constraintLayout, ((String) objArr[0]).intern())}));
        boolean zIsBlank = StringsKt.isBlank(feed.asBinder());
        TdsRoundLayout tdsRoundLayout2 = customVersionedParcelable.asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, "");
        tdsRoundLayout2.setVisibility(!zIsBlank ? 0 : 8);
        if (!zIsBlank) {
            TdsImageView tdsImageView = customVersionedParcelable.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            TdsImageView.setImage$default(tdsImageView, feed.asBinder(), (Function1) null, (Function1) null, 6, (Object) null);
        }
        customVersionedParcelable.onExtraCallback.setContentDescription(null);
        customVersionedParcelable.onExtraCallback.setImportantForAccessibility(2);
        customVersionedParcelable.onExtraCallback.setFocusable(false);
        customVersionedParcelable.getInterfaceDescriptor.setText(feed.IAuthTabCallbackDefault());
        customVersionedParcelable.getInterfaceDescriptor.setImportantForAccessibility(1);
        Typography6 typography63 = customVersionedParcelable.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(typography63, "");
        View root = this.onExtraCallback.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, typography63, false, null, 0, root, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.v2.view.NativeAdsFeedV2View$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 91;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                NativeAdsFeedV2View.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
                if (i5 != 0) {
                    return NativeAdsFeedV2View.onExtraCallback(iAuthTabCallback2, feed, (MotionEvent) obj);
                }
                NativeAdsFeedV2View.onExtraCallback(iAuthTabCallback2, feed, (MotionEvent) obj);
                throw null;
            }
        }, 1973, null);
        TdsRoundLayout tdsRoundLayout3 = customVersionedParcelable.asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout3, "");
        View root2 = this.onExtraCallback.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, tdsRoundLayout3, false, null, 0, root2, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.v2.view.NativeAdsFeedV2View$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 117;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                NativeAdsFeedV2View.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
                if (i5 == 0) {
                    return NativeAdsFeedV2View.onExtraCallbackWithResult(iAuthTabCallback2, feed, (MotionEvent) obj);
                }
                NativeAdsFeedV2View.onExtraCallbackWithResult(iAuthTabCallback2, feed, (MotionEvent) obj);
                throw null;
            }
        }, 1973, null);
        if (z) {
            customVersionedParcelable.getInterfaceDescriptor.setMinHeight(0);
            Typography7 typography72 = customVersionedParcelable.IAuthTabCallback_Parcel;
            Intrinsics.checkNotNullExpressionValue(typography72, "");
            typography72.setVisibility(0);
            customVersionedParcelable.IAuthTabCallback_Parcel.setContentDescription(null);
            customVersionedParcelable.IAuthTabCallback_Parcel.setFocusable(false);
        } else {
            customVersionedParcelable.getInterfaceDescriptor.setMinHeight(setTagsokhttp.onExtraCallbackWithResult(this, 36));
            Typography7 typography73 = customVersionedParcelable.IAuthTabCallback_Parcel;
            Intrinsics.checkNotNullExpressionValue(typography73, "");
            typography73.setVisibility(8);
        }
        if (StringsKt.isBlank(feed.asInterface())) {
            Typography6 typography64 = customVersionedParcelable.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(typography64, "");
            typography64.setVisibility(8);
            SubTypography13 subTypography132 = customVersionedParcelable.access000;
            Intrinsics.checkNotNullExpressionValue(subTypography132, "");
            subTypography132.setVisibility(8);
            ConstraintLayout constraintLayout2 = customVersionedParcelable.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(8);
        } else {
            customVersionedParcelable.IAuthTabCallbackDefault.setText(feed.asInterface());
            ConstraintLayout constraintLayout3 = customVersionedParcelable.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
            constraintLayout3.setVisibility(0);
            Typography6 typography65 = customVersionedParcelable.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(typography65, "");
            typography65.setVisibility(0);
            if (StringsKt.isBlank(feed.IAuthTabCallbackStub())) {
                SubTypography13 subTypography133 = customVersionedParcelable.access000;
                Intrinsics.checkNotNullExpressionValue(subTypography133, "");
                subTypography133.setVisibility(8);
            } else {
                int i3 = onWarmupCompleted + 35;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    customVersionedParcelable.access000.setText(feed.IAuthTabCallbackStub());
                    SubTypography13 subTypography134 = customVersionedParcelable.access000;
                    Intrinsics.checkNotNullExpressionValue(subTypography134, "");
                    subTypography134.setVisibility(1);
                } else {
                    customVersionedParcelable.access000.setText(feed.IAuthTabCallbackStub());
                    SubTypography13 subTypography135 = customVersionedParcelable.access000;
                    Intrinsics.checkNotNullExpressionValue(subTypography135, "");
                    subTypography135.setVisibility(0);
                }
            }
            if (StringsKt.isBlank(feed.IAuthTabCallbackStub())) {
                strAsInterface = feed.asInterface();
            } else {
                strAsInterface = feed.asInterface() + ", " + feed.IAuthTabCallbackStub();
            }
            customVersionedParcelable.IAuthTabCallbackStub.setContentDescription(strAsInterface);
            customVersionedParcelable.IAuthTabCallbackStub.setImportantForAccessibility(1);
            customVersionedParcelable.IAuthTabCallbackStub.setFocusable(true);
            ConstraintLayout constraintLayout4 = customVersionedParcelable.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
            View root3 = this.onExtraCallback.getRoot();
            Intrinsics.checkNotNullExpressionValue(root3, "");
            getStrokeWidth.onExtraCallback(getstrokewidth, constraintLayout4, false, null, 0, root3, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.v2.view.NativeAdsFeedV2View$$ExternalSyntheticLambda2
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 117;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    CustomVersionedParcelable customVersionedParcelable2 = customVersionedParcelable;
                    if (i6 == 0) {
                        return NativeAdsFeedV2View.onNavigationEvent(customVersionedParcelable2, iAuthTabCallback, feed, (MotionEvent) obj);
                    }
                    Unit unitOnNavigationEvent = NativeAdsFeedV2View.onNavigationEvent(customVersionedParcelable2, iAuthTabCallback, feed, (MotionEvent) obj);
                    int i7 = 34 / 0;
                    return unitOnNavigationEvent;
                }
            }, 1973, null);
        }
        TdsImageView tdsImageView2 = customVersionedParcelable.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        TdsImageView.setImage$default(tdsImageView2, feed.getInterfaceDescriptor(), (Function1) null, (Function1) null, 6, (Object) null);
        if (StringsKt.isBlank(feed.access000())) {
            customVersionedParcelable.onNavigationEvent.setContentDescription(null);
            customVersionedParcelable.onNavigationEvent.setImportantForAccessibility(2);
            customVersionedParcelable.onNavigationEvent.setFocusable(false);
        } else {
            int i4 = IAuthTabCallback + 65;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            customVersionedParcelable.onNavigationEvent.setContentDescription(feed.access000());
            customVersionedParcelable.onNavigationEvent.setImportantForAccessibility(1);
            customVersionedParcelable.onNavigationEvent.setFocusable(true);
            int i6 = IAuthTabCallback + 99;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
        View root4 = this.onExtraCallback.getRoot();
        Intrinsics.checkNotNullExpressionValue(root4, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, root4, false, null, 0, null, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.v2.view.NativeAdsFeedV2View$$ExternalSyntheticLambda3
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = onExtraCallback + 71;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                NativeAdsFeedV2View.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
                if (i10 == 0) {
                    Object[] objArr2 = {iAuthTabCallback2, feed, (MotionEvent) obj};
                    return (Unit) NativeAdsFeedV2View.onExtraCallbackWithResult(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1219174838, 1219174839, objArr2, TransactionFilterLocal.Companion.onNavigationEvent());
                }
                Object[] objArr3 = {iAuthTabCallback2, feed, (MotionEvent) obj};
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 1981, null);
        TdsImageView tdsImageView3 = customVersionedParcelable.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
        View root5 = this.onExtraCallback.getRoot();
        Intrinsics.checkNotNullExpressionValue(root5, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, tdsImageView3, false, null, 0, root5, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.v2.view.NativeAdsFeedV2View$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = onWarmupCompleted + 91;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                Unit unitOnWarmupCompleted = NativeAdsFeedV2View.onWarmupCompleted(iAuthTabCallback, feed, (MotionEvent) obj);
                int i11 = onWarmupCompleted + 43;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                return unitOnWarmupCompleted;
            }
        }, 1973, null);
        ConstraintLayout constraintLayout5 = customVersionedParcelable.asInterface;
        Intrinsics.checkNotNullExpressionValue(constraintLayout5, "");
        View root6 = this.onExtraCallback.getRoot();
        Intrinsics.checkNotNullExpressionValue(root6, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, constraintLayout5, false, null, 0, root6, null, 0.0f, 0.99f, null, false, 0L, null, function0OnWarmupCompleted, new Function1() { // from class: im.toss.ads_sdk.ui.v2.view.NativeAdsFeedV2View$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i8 = 2 % 2;
                int i9 = IAuthTabCallback + 49;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                Unit unitOnNavigationEvent = NativeAdsFeedV2View.onNavigationEvent(iAuthTabCallback, feed, (MotionEvent) obj);
                int i11 = onExtraCallbackWithResult + 107;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                return unitOnNavigationEvent;
            }
        }, 1973, null);
        if (StringsKt.isBlank((String) NativeAdsDto.Creative.Feed.IAuthTabCallback(790435775, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -790435774, new Object[]{feed}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback()))) {
            customVersionedParcelable.IAuthTabCallbackStubProxy.setText(getContext().getString(R.string.ads_sdk_text_more));
        } else {
            customVersionedParcelable.IAuthTabCallbackStubProxy.setText((String) NativeAdsDto.Creative.Feed.IAuthTabCallback(790435775, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -790435774, new Object[]{feed}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback()));
        }
        Context context15 = getContext();
        Intrinsics.checkNotNullExpressionValue(context15, "");
        int iIAuthTabCallback = getstrokewidth.IAuthTabCallback(context15, feed.IAuthTabCallback_Parcel(), -1);
        customVersionedParcelable.IAuthTabCallbackStubProxy.setTextColor(iIAuthTabCallback);
        customVersionedParcelable.onExtraCallbackWithResult.setImageTintList(ColorStateList.valueOf(iIAuthTabCallback));
        ConstraintLayout constraintLayout6 = customVersionedParcelable.asInterface;
        Context context16 = getContext();
        Intrinsics.checkNotNullExpressionValue(context16, "");
        constraintLayout6.setBackgroundColor(getstrokewidth.IAuthTabCallback(context16, (String) NativeAdsDto.Creative.Feed.IAuthTabCallback(545562487, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -545562487, new Object[]{feed}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback()), Color.parseColor("#3485fa")));
        if (feed.onTransact() == null || !(!StringsKt.isBlank(r2))) {
            SubTypography13 subTypography136 = customVersionedParcelable.access100;
            Intrinsics.checkNotNullExpressionValue(subTypography136, "");
            subTypography136.setVisibility(8);
        } else {
            SubTypography13 subTypography137 = customVersionedParcelable.access100;
            Intrinsics.checkNotNullExpressionValue(subTypography137, "");
            subTypography137.setVisibility(0);
            customVersionedParcelable.access100.setText(feed.onTransact());
        }
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(this);
        if (zIsBlank) {
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(customVersionedParcelable.getInterfaceDescriptor.getId(), 6, 0, 6);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(customVersionedParcelable.IAuthTabCallback_Parcel.getId(), 6, 0, 6);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(customVersionedParcelable.getInterfaceDescriptor.getId(), 6, 0);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(customVersionedParcelable.IAuthTabCallback_Parcel.getId(), 6, 0);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallback(customVersionedParcelable.asBinder.getId(), 3);
            i = 4;
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallback(customVersionedParcelable.asBinder.getId(), 4);
        } else {
            i = 4;
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(customVersionedParcelable.getInterfaceDescriptor.getId(), 6, customVersionedParcelable.asBinder.getId(), 7);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(customVersionedParcelable.IAuthTabCallback_Parcel.getId(), 6, customVersionedParcelable.asBinder.getId(), 7);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(customVersionedParcelable.getInterfaceDescriptor.getId(), 6, setTagsokhttp.onExtraCallbackWithResult(this, 10));
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(customVersionedParcelable.IAuthTabCallback_Parcel.getId(), 6, setTagsokhttp.onExtraCallbackWithResult(this, 10));
        }
        if (!zIsBlank) {
            if (z) {
                Context context17 = getContext();
                Intrinsics.checkNotNullExpressionValue(context17, "");
                Resources resources = context17.getResources();
                if (resources == null || (configuration = resources.getConfiguration()) == null) {
                    f = 1.0f;
                } else {
                    int i8 = onWarmupCompleted + 71;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    f = configuration.fontScale;
                }
                if (f > 1.1f) {
                    deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(customVersionedParcelable.asBinder.getId(), 3, 0, 3);
                    deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallback(customVersionedParcelable.asBinder.getId(), i);
                } else {
                    deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(customVersionedParcelable.asBinder.getId(), 3, customVersionedParcelable.getInterfaceDescriptor.getId(), 3);
                    deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(customVersionedParcelable.asBinder.getId(), i, customVersionedParcelable.IAuthTabCallback_Parcel.getId(), i);
                    deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(customVersionedParcelable.asBinder.getId(), 0.5f);
                }
            } else {
                int i10 = IAuthTabCallback + 5;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(customVersionedParcelable.asBinder.getId(), 3, customVersionedParcelable.getInterfaceDescriptor.getId(), 3);
                deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(customVersionedParcelable.asBinder.getId(), i, customVersionedParcelable.getInterfaceDescriptor.getId(), i);
                deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(customVersionedParcelable.asBinder.getId(), 0.5f);
            }
        }
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(this);
        requestLayout();
        Unit unit = Unit.INSTANCE;
    }

    public interface IAuthTabCallback {
        void onExtraCallbackWithResult(@NotNull NativeAdsDto.Creative.Feed feed, @NotNull String str, @Nullable String str2);

        static /* synthetic */ void onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onClick");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            iAuthTabCallback.onExtraCallbackWithResult(feed, str, str2);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -1219174838, 1219174839, new Object[]{iAuthTabCallback, feed, motionEvent}, TransactionFilterLocal.Companion.onNavigationEvent());
    }

    private static final Unit IAuthTabCallback(CustomVersionedParcelable customVersionedParcelable, IAuthTabCallback iAuthTabCallback, NativeAdsDto.Creative.Feed feed, MotionEvent motionEvent) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 1550885138, -1550885138, new Object[]{customVersionedParcelable, iAuthTabCallback, feed, motionEvent}, TransactionFilterLocal.Companion.onNavigationEvent());
    }
}
