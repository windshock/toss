package com.naver.maps.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.naver.maps.geometry.LatLng;
import com.naver.maps.geometry.LatLngBounds;
import com.naver.maps.map.indoor.IndoorView;
import com.naver.maps.map.internal.OverlayAccessor;
import com.naver.maps.map.overlay.LocationOverlay;
import com.naver.maps.map.overlay.Overlay;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.LinearSmoothScroller;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.calculateDxToMakeVisible;
import o.findViewByPosition;
import o.getRecycleChildrenOnDetach;
import o.getStackFromEnd;
import o.isAutoMeasureEnabled;
import o.isSmoothScrollbarEnabled;
import o.layoutChunk;
import o.onLayoutChildren;
import o.onLayoutCompleted;
import o.scrollVerticallyBy;
import o.setStackFromEnd;
import o.smoothScrollToPosition;
import o.supportsPredictiveItemAnimations;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class NaverMap {
    public static final CameraPosition IAuthTabCallback = new CameraPosition(new LatLng(37.5666102d, 126.9783881d), 14.0d, 0.0d, 0.0d);
    public static final int onExtraCallback = R.drawable.navermap_default_background_light;
    public static final int onExtraCallbackWithResult = R.drawable.navermap_default_background_dark;
    private static OverlayAccessor overlayAccessor;
    private onExtraCallbackWithResult IAuthTabCallbackDefault;
    private String IAuthTabCallbackStub;
    private final NativeMapView IAuthTabCallbackStubProxy;
    private final setStackFromEnd IAuthTabCallback_Parcel;
    private final List<IAuthTabCallbackStub> ICustomTabsCallback;
    private boolean ICustomTabsCallbackDefault;
    private boolean ICustomTabsCallbackStub;
    private boolean ICustomTabsCallbackStubProxy;
    private asBinder ICustomTabsCallback_Parcel;
    private boolean ICustomTabsService;
    private final onLayoutCompleted access000;
    private final layoutChunk access100;
    private String asBinder;
    private String[] asInterface;
    private final supportsPredictiveItemAnimations extraCallback;
    private final onLayoutChildren extraCallbackWithResult;
    private IAuthTabCallback_Parcel extraCommand;
    private final Context getInterfaceDescriptor;
    private asInterface isEngagementSignalsApiAvailable;
    private onTransact mayLaunchUrl;
    private IAuthTabCallbackStubProxy newSession;
    private final HashSet<ICustomTabsCallback> onActivityLayout;
    private final List<getInterfaceDescriptor> onActivityResized;
    private final List<access000> onMessageChannelReady;
    private final List<extraCallback> onMinimized;
    private access100 onNavigationEvent;
    private final HashSet<String> onPostMessage;
    private int onRelationshipValidationResult;
    private int onUnminimized;
    private readTypedObject onWarmupCompleted;
    private final LocationOverlay readTypedObject;
    private final LinearSmoothScroller onTransact = new LinearSmoothScroller() { // from class: com.naver.maps.map.NaverMap.2
        public void IAuthTabCallback(boolean z) {
            if (z) {
                NaverMap.this.postMessage();
            }
        }
    };
    private final scrollVerticallyBy writeTypedObject = new scrollVerticallyBy(this);

    public interface IAuthTabCallback {
        void onCameraIdle();
    }

    public interface onNavigationEvent {
        void onCameraChange(int i, boolean z);
    }

    public interface onTransact {
        void onMapClick(@NonNull PointF pointF, @NonNull LatLng latLng);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final onWarmupCompleted Basic;
        public static final onWarmupCompleted Hybrid;
        private static int IAuthTabCallback = 0;
        public static final onWarmupCompleted Navi;
        public static final onWarmupCompleted NaviHybrid;
        public static final onWarmupCompleted None;
        public static final onWarmupCompleted Satellite;
        public static final onWarmupCompleted Terrain;
        private static final /* synthetic */ onWarmupCompleted[] b;
        private static int onExtraCallback = 0;
        private static int[] onExtraCallbackWithResult = null;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        private final String a;

        private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int i2 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = onExtraCallbackWithResult;
            int i3 = -1469660336;
            if (iArr3 != null) {
                int i4 = $10 + 5;
                int i5 = i4 % 128;
                $11 = i5;
                int i6 = i4 % 2;
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int i7 = i5 + 123;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 3 / 2;
                }
                int i9 = 0;
                while (i9 < length2) {
                    int i10 = $11 + 121;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i9])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), Color.red(0) + 72, 8848 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr4[i9] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i9++;
                        i3 = -1469660336;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr3 = iArr4;
            }
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = onExtraCallbackWithResult;
            if (iArr6 != null) {
                int i12 = $10 + 39;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                }
                for (int i13 = 0; i13 < length; i13++) {
                    Object[] objArr3 = {Integer.valueOf(iArr6[i13])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), Color.rgb(0, 0, 0) + 16777288, 8848 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i13] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                }
                iArr6 = iArr2;
            }
            System.arraycopy(iArr6, 0, iArr5, 0, length3);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                int i14 = $11 + 7;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
                int i16 = 0;
                for (int i17 = 16; i16 < i17; i17 = 16) {
                    int i18 = $10 + 27;
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i16];
                    try {
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 39, 10301 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                        i16++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i20;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
                int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i22 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - View.resolveSize(0, 0)), 78 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 7399, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        private static /* synthetic */ onWarmupCompleted[] a() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = {Basic, Navi, Satellite, Hybrid, Terrain, None, NaviHybrid};
            int i5 = i3 + 111;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return onwarmupcompletedArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            int i4 = IAuthTabCallback + 123;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 72 / 0;
            }
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 3;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) b.clone();
            int i3 = onNavigationEvent + 93;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return onwarmupcompletedArr;
        }

        static /* synthetic */ onWarmupCompleted a(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedB = b(str);
            if (i3 == 0) {
                int i4 = 20 / 0;
            }
            int i5 = onNavigationEvent + 29;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return onwarmupcompletedB;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static /* synthetic */ String a(onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 9;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = onwarmupcompleted.a;
            int i5 = i2 + 87;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        static {
            IAuthTabCallback();
            Basic = new onWarmupCompleted("Basic", 0, "basic");
            Navi = new onWarmupCompleted("Navi", 1, "navi");
            Satellite = new onWarmupCompleted("Satellite", 2, "satellite");
            Hybrid = new onWarmupCompleted("Hybrid", 3, "hybrid");
            Terrain = new onWarmupCompleted("Terrain", 4, "terrain");
            Object[] objArr = new Object[1];
            c(new int[]{339583987, 1774726012}, View.resolveSizeAndState(0, 0, 0) + 4, objArr);
            None = new onWarmupCompleted("None", 5, ((String) objArr[0]).intern());
            NaviHybrid = new onWarmupCompleted("NaviHybrid", 6, "navi_satellite");
            b = a();
            int i = onWarmupCompleted + 69;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        private onWarmupCompleted(@NonNull String str, int i, String str2) {
            this.a = str2;
        }

        private static onWarmupCompleted b(@NonNull String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArrValues = values();
            int length = onwarmupcompletedArrValues.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = onNavigationEvent + 37;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    onwarmupcompletedArrValues[i4].a.equals(str);
                    throw null;
                }
                onWarmupCompleted onwarmupcompleted = onwarmupcompletedArrValues[i4];
                if (onwarmupcompleted.a.equals(str)) {
                    int i6 = onNavigationEvent + 1;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return onwarmupcompleted;
                }
                i4++;
                int i8 = IAuthTabCallback + 3;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            }
            return None;
        }

        static void IAuthTabCallback() {
            onExtraCallbackWithResult = new int[]{-307401293, 638969242, -1984927162, 1342708847, -411438887, 1969156659, -1944445819, 1035643248, 248324168, 760680878, 1516795245, -1233827954, -1797952433, 890615624, 908110869, 273489527, 1445080677, 303098364};
        }
    }

    public NaverMap(@NonNull Context context, @NonNull NativeMapView nativeMapView, @Nullable MapControlsView mapControlsView) {
        this.getInterfaceDescriptor = context;
        this.IAuthTabCallbackStubProxy = nativeMapView;
        this.access000 = new onLayoutCompleted(context, mapControlsView);
        this.access100 = new layoutChunk(this, nativeMapView);
        this.IAuthTabCallback_Parcel = new setStackFromEnd(nativeMapView);
        this.extraCallback = new supportsPredictiveItemAnimations(this, nativeMapView);
        this.extraCallbackWithResult = new onLayoutChildren(this, nativeMapView);
        LocationOverlay locationOverlayNewLocationOverlay = overlayAccessor.newLocationOverlay();
        this.readTypedObject = locationOverlayNewLocationOverlay;
        locationOverlayNewLocationOverlay.setCircleRadius((int) (nativeMapView.onExtraCallback() * 18.0f));
        this.ICustomTabsCallback = new CopyOnWriteArrayList();
        this.onMessageChannelReady = new CopyOnWriteArrayList();
        this.onMinimized = new CopyOnWriteArrayList();
        this.onActivityResized = new CopyOnWriteArrayList();
        this.onPostMessage = new HashSet<>();
        this.onActivityLayout = new HashSet<>();
        this.onWarmupCompleted = readTypedObject.a;
        postMessage();
    }

    public void onNavigationEvent(@NonNull isAutoMeasureEnabled isautomeasureenabled) {
        this.IAuthTabCallback_Parcel.IAuthTabCallback(this, isautomeasureenabled);
        this.access000.onNavigationEvent(isautomeasureenabled);
        this.extraCallback.onNavigationEvent(isautomeasureenabled);
        this.extraCallbackWithResult.onWarmupCompleted(isautomeasureenabled);
        onWarmupCompleted(isautomeasureenabled.access100(), (onExtraCallbackWithResult) null);
        onNavigationEvent(isautomeasureenabled.onPostMessage());
        Iterator<String> it = isautomeasureenabled.getInterfaceDescriptor().iterator();
        while (it.hasNext()) {
            onNavigationEvent(it.next(), true);
        }
        IAuthTabCallback(isautomeasureenabled.prefetch());
        onExtraCallbackWithResult(isautomeasureenabled.newSession());
        onNavigationEvent(isautomeasureenabled.onTransact());
        onExtraCallbackWithResult(isautomeasureenabled.extraCallbackWithResult());
        onWarmupCompleted(isautomeasureenabled.extraCommand());
        onExtraCallback(isautomeasureenabled.ICustomTabsCallbackStubProxy());
        int iWriteTypedObject = isautomeasureenabled.writeTypedObject();
        if (iWriteTypedObject < 0) {
            iWriteTypedObject = Math.round(this.getInterfaceDescriptor.getResources().getDisplayMetrics().density * 55.0f);
        }
        onExtraCallbackWithResult(iWriteTypedObject);
        IAuthTabCallback(isautomeasureenabled.asInterface());
        onWarmupCompleted(isautomeasureenabled.asBinder());
        this.IAuthTabCallbackStubProxy.onNavigationEvent(isautomeasureenabled.onNavigationEvent());
    }

    public void onWarmupCompleted(Bundle bundle) {
        this.IAuthTabCallback_Parcel.IAuthTabCallback(this, bundle);
        this.access000.onNavigationEvent(bundle);
        this.extraCallback.onNavigationEvent(bundle);
        this.extraCallbackWithResult.onNavigationEvent(bundle);
        this.writeTypedObject.onNavigationEvent(bundle);
        bundle.putString("NaverMap00", this.IAuthTabCallbackStub);
        bundle.putSerializable("NaverMap01", onActivityLayout());
        bundle.putSerializable("NaverMap02", this.onPostMessage);
        bundle.putSerializable("NaverMap03", this.onActivityLayout);
        bundle.putBoolean("NaverMap04", this.ICustomTabsCallbackStubProxy);
        bundle.putBoolean("NaverMap05", newAuthTabSession());
        bundle.putFloat("NaverMap06", asInterface());
        bundle.putFloat("NaverMap07", extraCallbackWithResult());
        bundle.putFloat("NaverMap08", onUnminimized());
        bundle.putFloat("NaverMap09", ICustomTabsCallbackDefault());
        bundle.putInt("NaverMap10", this.onUnminimized);
        bundle.putInt("NaverMap11", this.onRelationshipValidationResult);
        bundle.putBoolean("NaverMap12", this.IAuthTabCallbackStubProxy.onWarmupCompleted());
    }

    public void onNavigationEvent(Bundle bundle) {
        this.IAuthTabCallback_Parcel.onExtraCallbackWithResult(this, bundle);
        this.access000.onExtraCallback(bundle);
        this.extraCallback.IAuthTabCallback(bundle);
        this.extraCallbackWithResult.onWarmupCompleted(bundle);
        this.writeTypedObject.onWarmupCompleted(bundle);
        onWarmupCompleted(bundle.getString("NaverMap00"), (onExtraCallbackWithResult) null);
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) bundle.getSerializable("NaverMap01");
        if (onwarmupcompleted != null) {
            onNavigationEvent(onwarmupcompleted);
        }
        HashSet hashSet = (HashSet) bundle.getSerializable("NaverMap02");
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                onNavigationEvent((String) it.next(), true);
            }
        }
        HashSet hashSet2 = (HashSet) bundle.getSerializable("NaverMap03");
        if (hashSet2 != null) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ICustomTabsCallback iCustomTabsCallback = (ICustomTabsCallback) it2.next();
                onExtraCallback(ICustomTabsCallback.onWarmupCompleted(iCustomTabsCallback), ICustomTabsCallback.onWarmupCompleted(iCustomTabsCallback), true);
            }
        }
        IAuthTabCallback(bundle.getBoolean("NaverMap04"));
        onExtraCallbackWithResult(bundle.getBoolean("NaverMap05"));
        onNavigationEvent(bundle.getFloat("NaverMap06"));
        onExtraCallbackWithResult(bundle.getFloat("NaverMap07"));
        onWarmupCompleted(bundle.getFloat("NaverMap08"));
        onExtraCallback(bundle.getFloat("NaverMap09"));
        IAuthTabCallback(bundle.getInt("NaverMap10"));
        onWarmupCompleted(bundle.getInt("NaverMap11"));
        this.IAuthTabCallbackStubProxy.onNavigationEvent(bundle.getBoolean("NaverMap12"));
    }

    public void onExtraCallback() {
        this.IAuthTabCallbackStubProxy.asInterface();
        this.writeTypedObject.onExtraCallback();
        calculateDxToMakeVisible.onNavigationEvent(this.getInterfaceDescriptor).onExtraCallback(this.onTransact);
    }

    public void onExtraCallbackWithResult() {
        calculateDxToMakeVisible.onNavigationEvent(this.getInterfaceDescriptor).onNavigationEvent(this.onTransact);
        this.writeTypedObject.onNavigationEvent();
        this.IAuthTabCallbackStubProxy.onTransact();
    }

    public void onWarmupCompleted() {
        this.readTypedObject.setPosition(IAuthTabCallbackStub().target);
        this.readTypedObject.IAuthTabCallback(this);
    }

    public void IAuthTabCallback() {
        this.IAuthTabCallback_Parcel.onExtraCallbackWithResult();
        this.writeTypedObject.IAuthTabCallback();
    }

    public boolean mayLaunchUrl() {
        return this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult();
    }

    public Context getInterfaceDescriptor() {
        return this.getInterfaceDescriptor;
    }

    public onLayoutCompleted ICustomTabsCallbackStubProxy() {
        return this.access000;
    }

    public layoutChunk ICustomTabsCallbackStub() {
        return this.access100;
    }

    public supportsPredictiveItemAnimations onNavigationEvent() {
        return this.extraCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postMessage() {
        readTypedObject readtypedobject;
        readTypedObject readtypedobject2;
        if (mayLaunchUrl() || (readtypedobject = this.onWarmupCompleted) == (readtypedobject2 = readTypedObject.b) || readtypedobject == readTypedObject.d) {
            return;
        }
        this.onWarmupCompleted = readtypedobject2;
        getStackFromEnd.onWarmupCompleted(this.getInterfaceDescriptor).onNavigationEvent(new getStackFromEnd.access100() { // from class: com.naver.maps.map.NaverMap.4
            public void onNavigationEvent(@NonNull String[] strArr) {
                NaverMap.this.onWarmupCompleted = readTypedObject.d;
                NaverMap.this.onNavigationEvent(strArr);
                NaverMap.this.newSessionWithExtras();
            }

            public void onWarmupCompleted(@Nullable String[] strArr, @NonNull Exception exc) {
                NaverMap.this.onWarmupCompleted = readTypedObject.c;
                NaverMap.this.onNavigationEvent(strArr);
                NaverMap.this.newSessionWithExtras();
            }

            public void onExtraCallback(@NonNull getStackFromEnd.IAuthTabCallback iAuthTabCallback) {
                NaverMap.this.onWarmupCompleted = readTypedObject.a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNavigationEvent(@Nullable String[] strArr) {
        if (strArr == null || strArr.length != 2 || Arrays.equals(strArr, this.asInterface)) {
            return;
        }
        this.asInterface = strArr;
    }

    public void onWarmupCompleted(@Nullable String str, @Nullable onExtraCallbackWithResult onextracallbackwithresult) {
        this.IAuthTabCallbackStub = str;
        this.IAuthTabCallbackDefault = onextracallbackwithresult;
        readTypedObject readtypedobject = this.onWarmupCompleted;
        if (readtypedobject == readTypedObject.c || readtypedobject == readTypedObject.d) {
            newSessionWithExtras();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void newSessionWithExtras() {
        if (TextUtils.isEmpty(this.IAuthTabCallbackStub)) {
            this.asBinder = null;
            IAuthTabCallbackDefault();
        } else {
            getStackFromEnd.onWarmupCompleted(this.getInterfaceDescriptor).IAuthTabCallback(this.IAuthTabCallbackStub, new getStackFromEnd.IAuthTabCallbackStubProxy() { // from class: com.naver.maps.map.NaverMap.5
                public void onExtraCallbackWithResult(@NonNull String str) {
                    NaverMap.this.asBinder = str;
                    NaverMap.this.IAuthTabCallbackDefault();
                    if (NaverMap.this.IAuthTabCallbackDefault != null) {
                        onExtraCallbackWithResult unused = NaverMap.this.IAuthTabCallbackDefault;
                    }
                }

                public void onWarmupCompleted(@NonNull Exception exc) {
                    NaverMap.this.asBinder = null;
                    NaverMap.this.IAuthTabCallbackDefault();
                    if (NaverMap.this.IAuthTabCallbackDefault != null) {
                        onExtraCallbackWithResult unused = NaverMap.this.IAuthTabCallbackDefault;
                    }
                }
            });
        }
    }

    public void IAuthTabCallbackDefault() {
        readTypedObject readtypedobject = this.onWarmupCompleted;
        if (readtypedobject == readTypedObject.a || readtypedobject == readTypedObject.b) {
            return;
        }
        boolean z = this.ICustomTabsCallbackStubProxy;
        String strOnWarmupCompleted = onWarmupCompleted(this.extraCallback.IAuthTabCallback(), z ? 1 : 0);
        if (!TextUtils.isEmpty(strOnWarmupCompleted)) {
            this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(strOnWarmupCompleted);
            return;
        }
        String strOnWarmupCompleted2 = onWarmupCompleted(this.extraCallback.onExtraCallback(), z ? 1 : 0);
        if (!TextUtils.isEmpty(strOnWarmupCompleted2)) {
            this.IAuthTabCallbackStubProxy.onExtraCallback(strOnWarmupCompleted2);
            return;
        }
        if (!TextUtils.isEmpty(this.asBinder)) {
            this.IAuthTabCallbackStubProxy.onExtraCallback(this.asBinder);
            return;
        }
        String strOnWarmupCompleted3 = onWarmupCompleted(this.asInterface, z ? 1 : 0);
        if (TextUtils.isEmpty(strOnWarmupCompleted3)) {
            return;
        }
        this.IAuthTabCallbackStubProxy.onExtraCallback(strOnWarmupCompleted3);
    }

    public CameraPosition IAuthTabCallbackStub() {
        return this.IAuthTabCallback_Parcel.onExtraCallback();
    }

    public LatLngBounds IAuthTabCallbackStubProxy() {
        return this.IAuthTabCallback_Parcel.onWarmupCompleted();
    }

    public LatLngBounds readTypedObject() {
        return this.IAuthTabCallback_Parcel.onNavigationEvent();
    }

    public void onWarmupCompleted(@NonNull CameraPosition cameraPosition) {
        IAuthTabCallback(findViewByPosition.onExtraCallbackWithResult(cameraPosition));
    }

    public void IAuthTabCallback(@NonNull findViewByPosition findviewbyposition) {
        this.IAuthTabCallback_Parcel.onExtraCallbackWithResult(this, findviewbyposition);
    }

    public void onNavigationEvent(int i) {
        this.IAuthTabCallback_Parcel.onExtraCallback(i, false);
    }

    public double onRelationshipValidationResult() {
        return this.IAuthTabCallback_Parcel.IAuthTabCallbackStub();
    }

    public void onExtraCallbackWithResult(double d) {
        this.IAuthTabCallback_Parcel.onWarmupCompleted(d);
        ICustomTabsService();
    }

    public double onMinimized() {
        return this.IAuthTabCallback_Parcel.onTransact();
    }

    public void onNavigationEvent(double d) {
        this.IAuthTabCallback_Parcel.IAuthTabCallback(d);
        ICustomTabsService();
    }

    public double onPostMessage() {
        return this.IAuthTabCallback_Parcel.IAuthTabCallbackDefault();
    }

    public onWarmupCompleted onActivityLayout() {
        return onWarmupCompleted.a(this.IAuthTabCallbackStubProxy.extraCallback());
    }

    public void onNavigationEvent(@NonNull onWarmupCompleted onwarmupcompleted) {
        this.IAuthTabCallbackStubProxy.onNavigationEvent(onWarmupCompleted.a(onwarmupcompleted));
        ICustomTabsService();
    }

    public void onNavigationEvent(@NonNull String str, boolean z) {
        if (z) {
            if (this.onPostMessage.add(str)) {
                this.IAuthTabCallbackStubProxy.onNavigationEvent(str, true);
            }
        } else if (this.onPostMessage.remove(str)) {
            this.IAuthTabCallbackStubProxy.onNavigationEvent(str, false);
        }
        ICustomTabsService();
    }

    public boolean isEngagementSignalsApiAvailable() {
        onWarmupCompleted onwarmupcompletedOnActivityLayout = onActivityLayout();
        return newAuthTabSession() || onwarmupcompletedOnActivityLayout == onWarmupCompleted.Satellite || onwarmupcompletedOnActivityLayout == onWarmupCompleted.Hybrid || onwarmupcompletedOnActivityLayout == onWarmupCompleted.NaviHybrid;
    }

    public void IAuthTabCallback(boolean z) {
        if (this.ICustomTabsCallbackStubProxy == z) {
            return;
        }
        this.ICustomTabsCallbackStubProxy = z;
        IAuthTabCallbackDefault();
    }

    public boolean newAuthTabSession() {
        return this.IAuthTabCallbackStubProxy.extraCallbackWithResult();
    }

    public void onExtraCallbackWithResult(boolean z) {
        this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(z);
        ICustomTabsService();
    }

    public float asInterface() {
        return this.IAuthTabCallbackStubProxy.onActivityLayout();
    }

    public void onNavigationEvent(float f) {
        this.IAuthTabCallbackStubProxy.onWarmupCompleted(f);
        ICustomTabsService();
    }

    public float extraCallbackWithResult() {
        return this.IAuthTabCallbackStubProxy.onMessageChannelReady();
    }

    public void onExtraCallbackWithResult(float f) {
        this.IAuthTabCallbackStubProxy.IAuthTabCallback(f);
        ICustomTabsService();
    }

    public void onExtraCallback(@NonNull String str, @NonNull String str2, boolean z) {
        ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(str, str2);
        if (z) {
            if (this.onActivityLayout.add(iCustomTabsCallback)) {
                this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(str, str2, true);
            }
        } else if (this.onActivityLayout.remove(iCustomTabsCallback)) {
            this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(str, str2, false);
        }
    }

    public float onUnminimized() {
        return this.IAuthTabCallbackStubProxy.onActivityResized();
    }

    public void onWarmupCompleted(float f) {
        this.IAuthTabCallbackStubProxy.onExtraCallback(f);
        ICustomTabsService();
    }

    public float ICustomTabsCallbackDefault() {
        return this.IAuthTabCallbackStubProxy.onPostMessage();
    }

    public void onExtraCallback(float f) {
        this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult(f);
        ICustomTabsService();
    }

    public void onExtraCallbackWithResult(int i) {
        this.IAuthTabCallbackStubProxy.IAuthTabCallback(i);
        ICustomTabsService();
    }

    public void onWarmupCompleted(@Nullable IndoorView indoorView) {
        this.extraCallbackWithResult.onWarmupCompleted(indoorView);
    }

    public smoothScrollToPosition writeTypedObject() {
        return this.extraCallbackWithResult.onExtraCallback();
    }

    public void onWarmupCompleted(@NonNull onExtraCallback onextracallback) {
        this.extraCallbackWithResult.IAuthTabCallback(onextracallback);
    }

    public void onExtraCallbackWithResult(@NonNull onExtraCallback onextracallback) {
        this.extraCallbackWithResult.onExtraCallback(onextracallback);
    }

    public int asBinder() {
        return this.onUnminimized;
    }

    public void IAuthTabCallback(int i) {
        this.onUnminimized = i;
        this.IAuthTabCallbackStubProxy.onExtraCallback(i);
        ICustomTabsService();
    }

    public void onWarmupCompleted(int i) {
        this.onRelationshipValidationResult = i;
        this.IAuthTabCallbackStubProxy.onNavigationEvent(i);
        ICustomTabsService();
    }

    public LocationOverlay ICustomTabsCallback() {
        return this.readTypedObject;
    }

    public isSmoothScrollbarEnabled onActivityResized() {
        return this.writeTypedObject.onWarmupCompleted();
    }

    public void IAuthTabCallback(@NonNull isSmoothScrollbarEnabled issmoothscrollbarenabled) {
        if (this.writeTypedObject.IAuthTabCallback(issmoothscrollbarenabled)) {
            ICustomTabsService();
        }
    }

    public getRecycleChildrenOnDetach onMessageChannelReady() {
        return this.writeTypedObject.onExtraCallbackWithResult();
    }

    public void onWarmupCompleted(@Nullable getRecycleChildrenOnDetach getrecyclechildrenondetach) {
        if (this.writeTypedObject.onNavigationEvent(getrecyclechildrenondetach)) {
            ICustomTabsService();
        }
    }

    public void IAuthTabCallback(@NonNull IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        this.writeTypedObject.onExtraCallback(iAuthTabCallbackDefault);
    }

    public void onWarmupCompleted(@NonNull IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        this.writeTypedObject.onNavigationEvent(iAuthTabCallbackDefault);
    }

    public int extraCallback() {
        return this.IAuthTabCallbackStubProxy.IAuthTabCallback();
    }

    public int extraCommand() {
        return this.IAuthTabCallbackStubProxy.onNavigationEvent();
    }

    public int access000() {
        return (extraCommand() - access100()[0]) - access100()[2];
    }

    public int IAuthTabCallback_Parcel() {
        return (extraCallback() - access100()[1]) - access100()[3];
    }

    public int[] access100() {
        return this.IAuthTabCallback_Parcel.asInterface();
    }

    public void onWarmupCompleted(int i, int i2, int i3, int i4) {
        onWarmupCompleted(i, i2, i3, i4, -4);
    }

    public void onWarmupCompleted(int i, int i2, int i3, int i4, int i5) {
        IAuthTabCallback(i, i2, i3, i4, false, i5);
    }

    public void IAuthTabCallback(int i, int i2, int i3, int i4, boolean z, int i5) {
        this.access000.IAuthTabCallback(i, i2, i3, i4);
        this.IAuthTabCallback_Parcel.onNavigationEvent(i, i2, i3, i4, z, i5);
        ICustomTabsService();
    }

    public void onWarmupCompleted(@NonNull onNavigationEvent onnavigationevent) {
        this.IAuthTabCallback_Parcel.onWarmupCompleted(onnavigationevent);
    }

    public void IAuthTabCallback(@NonNull onNavigationEvent onnavigationevent) {
        this.IAuthTabCallback_Parcel.IAuthTabCallback(onnavigationevent);
    }

    public void onWarmupCompleted(@NonNull IAuthTabCallback iAuthTabCallback) {
        this.IAuthTabCallback_Parcel.onNavigationEvent(iAuthTabCallback);
    }

    public void onTransact() {
        this.ICustomTabsCallbackStub = true;
        for (IAuthTabCallbackStub iAuthTabCallbackStub : this.ICustomTabsCallback) {
        }
    }

    public void onWarmupCompleted(boolean z, boolean z2, double d, double d2) {
        this.ICustomTabsCallbackDefault = z;
        this.ICustomTabsService = z2;
        for (access000 access000Var : this.onMessageChannelReady) {
        }
        for (extraCallback extracallback : this.onMinimized) {
        }
    }

    public void onExtraCallback(@NonNull getInterfaceDescriptor getinterfacedescriptor) {
        this.onActivityResized.add(getinterfacedescriptor);
    }

    public void onWarmupCompleted(@NonNull getInterfaceDescriptor getinterfacedescriptor) {
        this.onActivityResized.remove(getinterfacedescriptor);
    }

    void ICustomTabsService() {
        Iterator<getInterfaceDescriptor> it = this.onActivityResized.iterator();
        while (it.hasNext()) {
            it.next().onExtraCallback();
        }
    }

    public void onExtraCallbackWithResult(@Nullable onTransact ontransact) {
        this.mayLaunchUrl = ontransact;
    }

    public boolean onExtraCallback(@NonNull PointF pointF) {
        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy;
        Symbol symbolOnNavigationEvent = this.IAuthTabCallbackStubProxy.onNavigationEvent(pointF, this.access000.onNavigationEvent());
        if (symbolOnNavigationEvent != null) {
            if (symbolOnNavigationEvent instanceof Overlay) {
                if (((Overlay) symbolOnNavigationEvent).asInterface()) {
                    return true;
                }
            } else if ((symbolOnNavigationEvent instanceof Symbol) && (iAuthTabCallbackStubProxy = this.newSession) != null && iAuthTabCallbackStubProxy.IAuthTabCallback(symbolOnNavigationEvent)) {
                return true;
            }
        }
        onTransact ontransact = this.mayLaunchUrl;
        if (ontransact == null) {
            return false;
        }
        ontransact.onMapClick(pointF, this.access100.onNavigationEvent(pointF));
        return true;
    }

    public boolean IAuthTabCallback(@NonNull PointF pointF) {
        if (this.isEngagementSignalsApiAvailable == null) {
            return false;
        }
        this.access100.onNavigationEvent(pointF);
        return true;
    }

    public boolean onExtraCallbackWithResult(@NonNull PointF pointF) {
        if (this.ICustomTabsCallback_Parcel == null) {
            return false;
        }
        this.access100.onNavigationEvent(pointF);
        return true;
    }

    public boolean onWarmupCompleted(@NonNull PointF pointF) {
        if (this.extraCommand == null) {
            return false;
        }
        this.access100.onNavigationEvent(pointF);
        return true;
    }

    public void onExtraCallbackWithResult(@NonNull Bitmap bitmap) {
        if (this.onNavigationEvent != null) {
            this.onNavigationEvent = null;
        }
    }

    public setStackFromEnd ICustomTabsCallback_Parcel() {
        return this.IAuthTabCallback_Parcel;
    }

    public onLayoutChildren newSession() {
        return this.extraCallbackWithResult;
    }

    private static String onWarmupCompleted(@Nullable String[] strArr, int i) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        if (strArr.length <= i) {
            return strArr[0];
        }
        return strArr[i];
    }
}
