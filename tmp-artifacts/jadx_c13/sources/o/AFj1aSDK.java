package o;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Range;
import android.view.View;
import im.toss.securities.widget.watchlist.R;
import im.toss.tosssecurities.core.base.model.SessionType;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState;
import im.toss.uikit.securities.PriceMiniChart;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1aSDK {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        static {
            int[] iArr = new int[DisplaySetting.values().length];
            try {
                iArr[DisplaySetting.DARK.ordinal()] = 1;
                int i = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                onNavigationEvent = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplaySetting.LIGHT.ordinal()] = 2;
                int i3 = onExtraCallback + 111;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisplaySetting.SYSTEM.ordinal()] = 3;
                int i5 = onNavigationEvent + 55;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            IAuthTabCallback = iArr;
        }
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onNavigationEvent + 57;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i4 = onNavigationEvent + 95;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i6 = onExtraCallback + 11;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                if (readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = IAuthTabCallback + 61;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    return getspecialfeatureoptinstatus;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onNavigationEvent);
            throw null;
        }
    }

    public static final class asBinder implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration IAuthTabCallback;

        public asBinder(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onNavigationEvent + 77;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class asInterface implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Configuration onWarmupCompleted;

        public asInterface(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = IAuthTabCallback + 53;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 71 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onWarmupCompleted);
            throw null;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallback;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onWarmupCompleted + 13;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 21 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onWarmupCompleted + 123;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onExtraCallback + 69;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onTransact implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallback;

        public onTransact(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onNavigationEvent + 113;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0369  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Bitmap onNavigationEvent(@NotNull Context context, @NotNull WatchlistWidgetState.RowItem rowItem, @NotNull DisplaySetting displaySetting) {
        double time;
        double time2;
        double dMax;
        Double dValueOf;
        double dDoubleValue;
        boolean z;
        int iICustomTabsCallbackStubProxy;
        double time3;
        boolean z2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(rowItem, "");
        Intrinsics.checkNotNullParameter(displaySetting, "");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.graph_width);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.graph_height);
        PriceMiniChart priceMiniChart = new PriceMiniChart(context, null, 0, 6, null);
        priceMiniChart.setBaselineValue(rowItem.onExtraCallback());
        priceMiniChart.setShowGradient(true);
        priceMiniChart.setYAxisRange(IAuthTabCallback(rowItem));
        String strAccess000 = rowItem.access000();
        if (strAccess000 != null) {
            int i2 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            time = setReferrerUID.onNavigationEvent(strAccess000) != null ? r3.getTime() : 0.0d;
        }
        String strIAuthTabCallbackStubProxy = rowItem.IAuthTabCallbackStubProxy();
        if (strIAuthTabCallbackStubProxy != null) {
            int i4 = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            Date dateOnNavigationEvent = setReferrerUID.onNavigationEvent(strIAuthTabCallbackStubProxy);
            if (dateOnNavigationEvent != null) {
                time2 = dateOnNavigationEvent.getTime();
            } else {
                int i6 = IAuthTabCallback + 27;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                time2 = 0.0d;
            }
        }
        Iterator it = rowItem.onNavigationEvent().iterator();
        Object obj = null;
        if (it.hasNext()) {
            Date dateOnNavigationEvent2 = setReferrerUID.onNavigationEvent(((WatchlistWidgetState.SimpleCandle) it.next()).onNavigationEvent());
            if (dateOnNavigationEvent2 != null) {
                int i8 = IAuthTabCallback + 65;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                dMax = dateOnNavigationEvent2.getTime();
            } else {
                dMax = 0.0d;
            }
            while (it.hasNext()) {
                Iterator it2 = it;
                dMax = Math.max(dMax, setReferrerUID.onNavigationEvent(((WatchlistWidgetState.SimpleCandle) it.next()).onNavigationEvent()) != null ? r15.getTime() : 0.0d);
                it = it2;
            }
            dValueOf = Double.valueOf(dMax);
        } else {
            dValueOf = null;
        }
        if (dValueOf != null) {
            int i10 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 == 0) {
                dValueOf.doubleValue();
                throw null;
            }
            dDoubleValue = dValueOf.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        priceMiniChart.setXAxisRange(new Range<>(Double.valueOf(time), Double.valueOf(Math.max(time2, dDoubleValue))));
        double dAsInterface = rowItem.asInterface();
        if (dAsInterface > priceMiniChart.onWarmupCompleted()) {
            int i11 = IAuthTabCallback.IAuthTabCallback[displaySetting.ordinal()];
            if (i11 != 1) {
                int i12 = onExtraCallbackWithResult + 63;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                if (i11 == 2) {
                    Context context2 = priceMiniChart.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    Configuration configuration = context2.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration, "");
                    iICustomTabsCallbackStubProxy = new getUrlokhttp(new onExtraCallbackWithResult(configuration)).requestPostMessageChannel().IEngagementSignalsCallback();
                } else {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context context3 = priceMiniChart.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    Configuration configuration2 = context3.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration2, "");
                    getUrlokhttp geturlokhttp = new getUrlokhttp(new onWarmupCompleted(configuration2));
                    iICustomTabsCallbackStubProxy = !(setDoNotSell.onExtraCallbackWithResult(geturlokhttp.ITrustedWebActivityCallbackDefault()) ^ true) ? geturlokhttp.getInterfaceDescriptor().ICustomTabsService_Parcel() : geturlokhttp.requestPostMessageChannel().IEngagementSignalsCallback();
                }
            } else {
                Context context4 = priceMiniChart.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                Configuration configuration3 = context4.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration3, "");
                iICustomTabsCallbackStubProxy = new getUrlokhttp(new onExtraCallback(configuration3)).getInterfaceDescriptor().ICustomTabsService_Parcel();
            }
        } else {
            if (dAsInterface >= priceMiniChart.onWarmupCompleted()) {
                int i14 = IAuthTabCallback.IAuthTabCallback[displaySetting.ordinal()];
                z = true;
                if (i14 == 1) {
                    Context context5 = priceMiniChart.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "");
                    Configuration configuration4 = context5.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration4, "");
                    iICustomTabsCallbackStubProxy = new getUrlokhttp(new asInterface(configuration4)).getInterfaceDescriptor().ICustomTabsCallbackStubProxy();
                } else if (i14 == 2) {
                    Context context6 = priceMiniChart.getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "");
                    Configuration configuration5 = context6.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration5, "");
                    iICustomTabsCallbackStubProxy = new getUrlokhttp(new onTransact(configuration5)).requestPostMessageChannel().onMinimized();
                } else {
                    if (i14 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context context7 = priceMiniChart.getContext();
                    Intrinsics.checkNotNullExpressionValue(context7, "");
                    Configuration configuration6 = context7.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration6, "");
                    getUrlokhttp geturlokhttp2 = new getUrlokhttp(new IAuthTabCallbackDefault(configuration6));
                    if (setDoNotSell.onExtraCallbackWithResult(geturlokhttp2.ITrustedWebActivityCallbackDefault())) {
                        int i15 = IAuthTabCallback + 125;
                        onExtraCallbackWithResult = i15 % 128;
                        if (i15 % 2 != 0) {
                            geturlokhttp2.getInterfaceDescriptor().ICustomTabsCallbackStubProxy();
                            obj.hashCode();
                            throw null;
                        }
                        iICustomTabsCallbackStubProxy = geturlokhttp2.getInterfaceDescriptor().ICustomTabsCallbackStubProxy();
                    } else {
                        iICustomTabsCallbackStubProxy = geturlokhttp2.requestPostMessageChannel().onMinimized();
                    }
                }
                priceMiniChart.setGraphColor(iICustomTabsCallbackStubProxy);
                List<WatchlistWidgetState.SimpleCandle> listOnNavigationEvent = rowItem.onNavigationEvent();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOnNavigationEvent, 10));
                for (WatchlistWidgetState.SimpleCandle simpleCandle : listOnNavigationEvent) {
                    Date dateOnNavigationEvent3 = setReferrerUID.onNavigationEvent(simpleCandle.onNavigationEvent());
                    if (dateOnNavigationEvent3 != null) {
                        int i16 = onExtraCallbackWithResult + 63;
                        IAuthTabCallback = i16 % 128;
                        if (i16 % 2 == 0) {
                            dateOnNavigationEvent3.getTime();
                            obj.hashCode();
                            throw null;
                        }
                        time3 = dateOnNavigationEvent3.getTime();
                    } else {
                        time3 = 0.0d;
                    }
                    double dOnWarmupCompleted = simpleCandle.onWarmupCompleted();
                    if (simpleCandle.onExtraCallbackWithResult() == SessionType.AFTER) {
                        int i17 = onExtraCallbackWithResult + 15;
                        IAuthTabCallback = i17 % 128;
                        int i18 = i17 % 2;
                        z2 = z;
                    } else {
                        z2 = false;
                    }
                    arrayList.add(new PriceMiniChart.onWarmupCompleted(time3, dOnWarmupCompleted, z2));
                }
                priceMiniChart.setEntries(arrayList);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                priceMiniChart.measure(View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, 1073741824), View.MeasureSpec.makeMeasureSpec(dimensionPixelSize2, 1073741824));
                priceMiniChart.layout(0, 0, priceMiniChart.getMeasuredWidth(), priceMiniChart.getMeasuredHeight());
                priceMiniChart.draw(canvas);
                return bitmapCreateBitmap;
            }
            int i19 = IAuthTabCallback.IAuthTabCallback[displaySetting.ordinal()];
            if (i19 == 1) {
                Context context8 = priceMiniChart.getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "");
                Configuration configuration7 = context8.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration7, "");
                iICustomTabsCallbackStubProxy = ((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new onNavigationEvent(configuration7)).getInterfaceDescriptor()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue();
            } else if (i19 != 2) {
                int i20 = onExtraCallbackWithResult + 1;
                IAuthTabCallback = i20 % 128;
                if (i20 % 2 != 0 ? i19 != 3 : i19 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                Context context9 = priceMiniChart.getContext();
                Intrinsics.checkNotNullExpressionValue(context9, "");
                Configuration configuration8 = context9.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration8, "");
                iICustomTabsCallbackStubProxy = new getUrlokhttp(new IAuthTabCallbackStub(configuration8)).asBinder();
            } else {
                Context context10 = priceMiniChart.getContext();
                Intrinsics.checkNotNullExpressionValue(context10, "");
                Configuration configuration9 = context10.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration9, "");
                iICustomTabsCallbackStubProxy = ((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new asBinder(configuration9)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue();
            }
        }
        z = true;
        priceMiniChart.setGraphColor(iICustomTabsCallbackStubProxy);
        List<WatchlistWidgetState.SimpleCandle> listOnNavigationEvent2 = rowItem.onNavigationEvent();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOnNavigationEvent2, 10));
        while (r1.hasNext()) {
        }
        priceMiniChart.setEntries(arrayList2);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize2, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        priceMiniChart.measure(View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, 1073741824), View.MeasureSpec.makeMeasureSpec(dimensionPixelSize2, 1073741824));
        priceMiniChart.layout(0, 0, priceMiniChart.getMeasuredWidth(), priceMiniChart.getMeasuredHeight());
        priceMiniChart.draw(canvas2);
        return bitmapCreateBitmap2;
    }

    private static final Range<Double> IAuthTabCallback(WatchlistWidgetState.RowItem rowItem) {
        Object next;
        double dOnWarmupCompleted;
        int i = 2 % 2;
        double dOnExtraCallback = rowItem.onExtraCallback();
        if (rowItem.onNavigationEvent().isEmpty()) {
            return new Range<>(Double.valueOf(dOnExtraCallback - 1.0d), Double.valueOf(dOnExtraCallback + 1.0d));
        }
        Iterator<T> it = rowItem.onNavigationEvent().iterator();
        Object next2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i2 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                double dOnWarmupCompleted2 = ((WatchlistWidgetState.SimpleCandle) next).onWarmupCompleted();
                do {
                    Object next3 = it.next();
                    double dOnWarmupCompleted3 = ((WatchlistWidgetState.SimpleCandle) next3).onWarmupCompleted();
                    if (Double.compare(dOnWarmupCompleted2, dOnWarmupCompleted3) < 0) {
                        next = next3;
                        dOnWarmupCompleted2 = dOnWarmupCompleted3;
                    }
                } while (!(!it.hasNext()));
            }
        } else {
            next = null;
        }
        WatchlistWidgetState.SimpleCandle simpleCandle = (WatchlistWidgetState.SimpleCandle) next;
        double dOnWarmupCompleted4 = simpleCandle != null ? simpleCandle.onWarmupCompleted() : 0.0d;
        Iterator<T> it2 = rowItem.onNavigationEvent().iterator();
        if (!it2.hasNext()) {
            int i4 = IAuthTabCallback + 1;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        } else {
            next2 = it2.next();
            if (it2.hasNext()) {
                double dOnWarmupCompleted5 = ((WatchlistWidgetState.SimpleCandle) next2).onWarmupCompleted();
                do {
                    Object next4 = it2.next();
                    double dOnWarmupCompleted6 = ((WatchlistWidgetState.SimpleCandle) next4).onWarmupCompleted();
                    if (Double.compare(dOnWarmupCompleted5, dOnWarmupCompleted6) > 0) {
                        int i6 = onExtraCallbackWithResult + 45;
                        IAuthTabCallback = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 4 / 5;
                        }
                        dOnWarmupCompleted5 = dOnWarmupCompleted6;
                        next2 = next4;
                    }
                } while (it2.hasNext());
            }
        }
        WatchlistWidgetState.SimpleCandle simpleCandle2 = (WatchlistWidgetState.SimpleCandle) next2;
        if (simpleCandle2 != null) {
            dOnWarmupCompleted = simpleCandle2.onWarmupCompleted();
        } else {
            int i8 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            dOnWarmupCompleted = 0.0d;
        }
        connectToInetAddress connecttoinetaddressIAuthTabCallback = JavaNetAuthenticatorWhenMappings.IAuthTabCallback(true, Double.valueOf(dOnExtraCallback), intersect.onExtraCallbackWithResult(rowItem.IAuthTabCallbackStub()));
        if (connecttoinetaddressIAuthTabCallback == null) {
            connecttoinetaddressIAuthTabCallback = new connectToInetAddress(1.0d, 0.0d);
        }
        return new Range<>(Double.valueOf(Math.min(dOnWarmupCompleted, connecttoinetaddressIAuthTabCallback.IAuthTabCallback())), Double.valueOf(Math.max(dOnWarmupCompleted4, connecttoinetaddressIAuthTabCallback.onExtraCallback())));
    }
}
