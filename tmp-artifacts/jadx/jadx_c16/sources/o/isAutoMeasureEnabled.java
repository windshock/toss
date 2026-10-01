package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.naver.maps.geometry.LatLng;
import com.naver.maps.geometry.LatLngBounds;
import com.naver.maps.map.CameraPosition;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.R;
import com.naver.maps.map.text.DefaultTypefaceFactory;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isAutoMeasureEnabled implements Parcelable {
    public static final Parcelable.Creator<isAutoMeasureEnabled> CREATOR = new Parcelable.Creator<isAutoMeasureEnabled>() { // from class: o.isAutoMeasureEnabled.5
        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public isAutoMeasureEnabled createFromParcel(Parcel parcel) {
            return new isAutoMeasureEnabled(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public isAutoMeasureEnabled[] newArray(int i) {
            return new isAutoMeasureEnabled[i];
        }
    };
    private float IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private boolean ICustomTabsCallback;
    private String[] ICustomTabsCallbackDefault;
    private String ICustomTabsCallbackStub;
    private Locale ICustomTabsCallbackStubProxy;
    private double ICustomTabsCallback_Parcel;
    private int ICustomTabsService;
    private boolean ICustomTabsServiceDefault;
    private int ICustomTabsServiceStub;
    private boolean ICustomTabsServiceStubProxy;
    private int access000;
    private int[] access100;
    private boolean asBinder;
    private boolean asInterface;
    private boolean extraCallback;
    private boolean extraCallbackWithResult;
    private double extraCommand;
    private boolean getInterfaceDescriptor;
    private double isEngagementSignalsApiAvailable;
    private int[] mayLaunchUrl;
    private boolean newAuthTabSession;
    private NaverMap.onWarmupCompleted newSession;
    private HashSet<String> newSessionWithExtras;
    private Class<? extends cancelScroll> onActivityLayout;
    private boolean onActivityResized;
    private float onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private boolean onMessageChannelReady;
    private boolean onMinimized;
    private boolean onNavigationEvent;
    private boolean onPostMessage;
    private LatLngBounds onRelationshipValidationResult;
    private boolean onTransact;
    private CameraPosition onUnminimized;
    private float onWarmupCompleted;
    private float postMessage;
    private boolean prefetch;
    private float prefetchWithMultipleUrls;
    private float readTypedObject;
    private int receiveFile;
    private boolean requestPostMessageChannel;
    private float requestPostMessageChannelWithExtras;
    private float setEngagementSignalsCallback;
    private int updateVisuals;
    private int validateRelationship;
    private boolean warmup;
    private boolean writeTypedObject;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private static LatLngBounds onWarmupCompleted(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        if (string == null) {
            return null;
        }
        String[] strArrSplit = string.split(",");
        if (strArrSplit.length != 4) {
            return null;
        }
        try {
            return new LatLngBounds(new LatLng(Double.parseDouble(strArrSplit[0]), Double.parseDouble(strArrSplit[1])), new LatLng(Double.parseDouble(strArrSplit[2]), Double.parseDouble(strArrSplit[3])));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static isAutoMeasureEnabled onNavigationEvent(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        isAutoMeasureEnabled isautomeasureenabled = new isAutoMeasureEnabled();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.NaverMap, 0, 0);
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(R.styleable.NaverMap_navermap_latitude, Float.NaN);
            float f2 = typedArrayObtainStyledAttributes.getFloat(R.styleable.NaverMap_navermap_longitude, Float.NaN);
            if (!Float.isNaN(f) && !Float.isNaN(f2)) {
                isautomeasureenabled.onWarmupCompleted(new CameraPosition(new LatLng(f, f2), typedArrayObtainStyledAttributes.getFloat(R.styleable.NaverMap_navermap_zoom, (float) NaverMap.IAuthTabCallback.zoom), typedArrayObtainStyledAttributes.getFloat(R.styleable.NaverMap_navermap_tilt, 0.0f), typedArrayObtainStyledAttributes.getFloat(R.styleable.NaverMap_navermap_bearing, 0.0f)));
            }
            isautomeasureenabled.onWarmupCompleted(onWarmupCompleted(typedArrayObtainStyledAttributes, R.styleable.NaverMap_navermap_extent));
            isautomeasureenabled.onExtraCallback(typedArrayObtainStyledAttributes.getFloat(R.styleable.NaverMap_navermap_minZoom, 0.0f));
            isautomeasureenabled.IAuthTabCallback(typedArrayObtainStyledAttributes.getFloat(R.styleable.NaverMap_navermap_maxZoom, 21.0f));
            isautomeasureenabled.onWarmupCompleted(typedArrayObtainStyledAttributes.getFloat(R.styleable.NaverMap_navermap_maxTilt, 60.0f));
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NaverMap_navermap_contentPadding, -1);
            if (dimensionPixelSize >= 0) {
                isautomeasureenabled.onWarmupCompleted(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            } else {
                isautomeasureenabled.onWarmupCompleted(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NaverMap_navermap_contentPaddingLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NaverMap_navermap_contentPaddingTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NaverMap_navermap_contentPaddingRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NaverMap_navermap_contentPaddingBottom, 0));
            }
            isautomeasureenabled.onExtraCallback(typedArrayObtainStyledAttributes.getInt(R.styleable.NaverMap_navermap_defaultCameraAnimationDuration, 200));
            String string = typedArrayObtainStyledAttributes.getString(R.styleable.NaverMap_navermap_customStyleId);
            if (string != null) {
                isautomeasureenabled.onWarmupCompleted(string);
            }
            String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.NaverMap_navermap_mapType);
            if (string2 != null) {
                isautomeasureenabled.onExtraCallback(NaverMap.onWarmupCompleted.valueOf(string2));
            }
            String string3 = typedArrayObtainStyledAttributes.getString(R.styleable.NaverMap_navermap_enabledLayerGroups);
            if (string3 != null) {
                isautomeasureenabled.newSessionWithExtras.clear();
                Collections.addAll(isautomeasureenabled.newSessionWithExtras, string3.split("\\|"));
            }
            isautomeasureenabled.onNavigationEvent(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NaverMap_navermap_liteModeEnabled, false));
            isautomeasureenabled.IAuthTabCallbackStub(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NaverMap_navermap_nightModeEnabled, false));
            isautomeasureenabled.onWarmupCompleted(typedArrayObtainStyledAttributes.getFloat(R.styleable.NaverMap_navermap_buildingHeight, 1.0f));
            isautomeasureenabled.onExtraCallback(typedArrayObtainStyledAttributes.getFloat(R.styleable.NaverMap_navermap_lightness, 0.0f));
            isautomeasureenabled.IAuthTabCallbackDefault(typedArrayObtainStyledAttributes.getFloat(R.styleable.NaverMap_navermap_symbolScale, 1.0f));
            isautomeasureenabled.onExtraCallbackWithResult(typedArrayObtainStyledAttributes.getFloat(R.styleable.NaverMap_navermap_symbolPerspectiveRatio, 1.0f));
            isautomeasureenabled.onExtraCallbackWithResult(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NaverMap_navermap_indoorEnabled, false));
            isautomeasureenabled.onExtraCallbackWithResult(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NaverMap_navermap_indoorFocusRadius, -1));
            int i = R.styleable.NaverMap_navermap_background;
            if (typedArrayObtainStyledAttributes.hasValue(i)) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(i, 0);
                if (resourceId > 0) {
                    isautomeasureenabled.IAuthTabCallback(resourceId);
                } else {
                    isautomeasureenabled.onWarmupCompleted(typedArrayObtainStyledAttributes.getColor(i, -789775));
                }
            } else {
                isautomeasureenabled.onWarmupCompleted(typedArrayObtainStyledAttributes.getColor(R.styleable.NaverMap_navermap_backgroundColor, -789775));
                isautomeasureenabled.IAuthTabCallback(typedArrayObtainStyledAttributes.getResourceId(R.styleable.NaverMap_navermap_backgroundImage, NaverMap.onExtraCallback));
            }
            isautomeasureenabled.onTransact(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NaverMap_navermap_pickTolerance, -1));
            isautomeasureenabled.IAuthTabCallbackStubProxy(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NaverMap_navermap_scrollGesturesEnabled, true));
            isautomeasureenabled.writeTypedObject(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NaverMap_navermap_zoomGesturesEnabled, true));
            isautomeasureenabled.access000(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NaverMap_navermap_tiltGesturesEnabled, true));
            isautomeasureenabled.asInterface(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NaverMap_navermap_rotateGesturesEnabled, true));
            isautomeasureenabled.getInterfaceDescriptor(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NaverMap_navermap_stopGesturesEnabled, true));
            isautomeasureenabled.IAuthTabCallback(typedArrayObtainStyledAttributes.getFloat(R.styleable.NaverMap_navermap_scrollGesturesFriction, 0.088f));
            isautomeasureenabled.onTransact(typedArrayObtainStyledAttributes.getFloat(R.styleable.NaverMap_navermap_zoomGesturesFriction, 0.12375f));
            isautomeasureenabled.onNavigationEvent(typedArrayObtainStyledAttributes.getFloat(R.styleable.NaverMap_navermap_rotateGesturesFriction, 0.19333f));
            isautomeasureenabled.onExtraCallback(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NaverMap_navermap_compassEnabled, true));
            isautomeasureenabled.access100(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NaverMap_navermap_scaleBarEnabled, true));
            isautomeasureenabled.ICustomTabsCallback(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NaverMap_navermap_zoomControlEnabled, true));
            isautomeasureenabled.IAuthTabCallback(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NaverMap_navermap_indoorLevelPickerEnabled, true));
            isautomeasureenabled.onWarmupCompleted(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NaverMap_navermap_locationButtonEnabled, false));
            isautomeasureenabled.asBinder(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NaverMap_navermap_logoClickEnabled, true));
            isautomeasureenabled.IAuthTabCallbackStub(typedArrayObtainStyledAttributes.getInt(R.styleable.NaverMap_navermap_logoGravity, 0));
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NaverMap_navermap_logoMargin, -1);
            if (dimensionPixelSize2 >= 0) {
                isautomeasureenabled.onExtraCallbackWithResult(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
            } else {
                int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NaverMap_navermap_logoMarginStart, -1);
                int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NaverMap_navermap_logoMarginTop, -1);
                int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NaverMap_navermap_logoMarginEnd, -1);
                int dimensionPixelSize6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NaverMap_navermap_logoMarginBottom, -1);
                if (dimensionPixelSize3 >= 0 || dimensionPixelSize4 >= 0 || dimensionPixelSize5 >= 0 || dimensionPixelSize6 >= 0) {
                    isautomeasureenabled.onExtraCallbackWithResult(findFirstVisibleItemPosition.onNavigationEvent(dimensionPixelSize3, 0, Integer.MAX_VALUE), findFirstVisibleItemPosition.onNavigationEvent(dimensionPixelSize4, 0, Integer.MAX_VALUE), findFirstVisibleItemPosition.onNavigationEvent(dimensionPixelSize5, 0, Integer.MAX_VALUE), findFirstVisibleItemPosition.onNavigationEvent(dimensionPixelSize6, 0, Integer.MAX_VALUE));
                }
            }
            isautomeasureenabled.onNavigationEvent(typedArrayObtainStyledAttributes.getInt(R.styleable.NaverMap_navermap_fpsLimit, 0));
            isautomeasureenabled.asInterface(typedArrayObtainStyledAttributes.getFloat(R.styleable.NaverMap_navermap_mapScale, 1.0f));
            isautomeasureenabled.readTypedObject(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NaverMap_navermap_useTextureView, false));
            isautomeasureenabled.extraCallback(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NaverMap_navermap_useVulkanView, false));
            isautomeasureenabled.onTransact(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NaverMap_navermap_msaaEnabled, false));
            isautomeasureenabled.IAuthTabCallback_Parcel(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NaverMap_navermap_translucentTextureSurface, false));
            isautomeasureenabled.extraCallbackWithResult(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NaverMap_navermap_zOrderMediaOverlay, false));
            isautomeasureenabled.IAuthTabCallbackDefault(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NaverMap_navermap_preserveEGLContextOnPause, true));
            isautomeasureenabled.onMessageChannelReady(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NaverMap_navermap_object3dEnabled, false));
            String string4 = typedArrayObtainStyledAttributes.getString(R.styleable.NaverMap_navermap_localTypefaceFactoryClass);
            if (!TextUtils.isEmpty(string4)) {
                try {
                    Class<?> cls = Class.forName(string4);
                    if (cancelScroll.class.isAssignableFrom(cls)) {
                        isautomeasureenabled.onNavigationEvent((Class<? extends cancelScroll>) cls);
                    }
                } catch (Exception unused) {
                }
            }
            isautomeasureenabled.onActivityResized(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NaverMap_navermap_cjkLocalGlyphRasterizationEnabled, false));
            return isautomeasureenabled;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public isAutoMeasureEnabled() {
        this.isEngagementSignalsApiAvailable = 0.0d;
        this.ICustomTabsCallback_Parcel = 21.0d;
        this.extraCommand = 63.0d;
        this.mayLaunchUrl = new int[4];
        this.ICustomTabsService = 200;
        this.newSession = NaverMap.onWarmupCompleted.Basic;
        this.newSessionWithExtras = new HashSet<>(Collections.singleton("building"));
        this.prefetch = false;
        this.newAuthTabSession = false;
        this.postMessage = 1.0f;
        this.setEngagementSignalsCallback = 0.0f;
        this.requestPostMessageChannelWithExtras = 1.0f;
        this.prefetchWithMultipleUrls = 1.0f;
        this.requestPostMessageChannel = false;
        this.receiveFile = -1;
        this.ICustomTabsServiceStub = -789775;
        this.validateRelationship = NaverMap.onExtraCallback;
        this.updateVisuals = -1;
        this.ICustomTabsServiceDefault = true;
        this.warmup = true;
        this.ICustomTabsServiceStubProxy = true;
        this.onExtraCallbackWithResult = true;
        this.onNavigationEvent = true;
        this.onWarmupCompleted = 0.088f;
        this.IAuthTabCallback = 0.12375f;
        this.onExtraCallback = 0.19333f;
        this.IAuthTabCallbackDefault = true;
        this.asInterface = true;
        this.onTransact = true;
        this.asBinder = true;
        this.IAuthTabCallbackStub = false;
        this.IAuthTabCallbackStubProxy = true;
        this.getInterfaceDescriptor = true;
        this.IAuthTabCallback_Parcel = 0;
        this.readTypedObject = 1.0f;
        this.extraCallbackWithResult = false;
        this.extraCallback = false;
        this.ICustomTabsCallback = false;
        this.writeTypedObject = false;
        this.onMessageChannelReady = false;
        this.onPostMessage = true;
        this.onActivityResized = false;
        this.onActivityLayout = DefaultTypefaceFactory.class;
        this.onMinimized = false;
    }

    public isAutoMeasureEnabled onWarmupCompleted(@Nullable String str) {
        this.ICustomTabsCallbackStub = str;
        return this;
    }

    public isAutoMeasureEnabled onWarmupCompleted(@Nullable CameraPosition cameraPosition) {
        this.onUnminimized = cameraPosition;
        return this;
    }

    public isAutoMeasureEnabled onWarmupCompleted(@Nullable LatLngBounds latLngBounds) {
        this.onRelationshipValidationResult = latLngBounds;
        return this;
    }

    public isAutoMeasureEnabled onExtraCallback(double d) {
        this.isEngagementSignalsApiAvailable = d;
        return this;
    }

    public isAutoMeasureEnabled IAuthTabCallback(double d) {
        this.ICustomTabsCallback_Parcel = d;
        return this;
    }

    public isAutoMeasureEnabled onWarmupCompleted(double d) {
        this.extraCommand = d;
        return this;
    }

    public isAutoMeasureEnabled onWarmupCompleted(int i, int i2, int i3, int i4) {
        int[] iArr = this.mayLaunchUrl;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        return this;
    }

    public isAutoMeasureEnabled onExtraCallback(int i) {
        this.ICustomTabsService = i;
        return this;
    }

    public isAutoMeasureEnabled onExtraCallback(@NonNull NaverMap.onWarmupCompleted onwarmupcompleted) {
        this.newSession = onwarmupcompleted;
        return this;
    }

    public isAutoMeasureEnabled onNavigationEvent(boolean z) {
        this.prefetch = z;
        return this;
    }

    public isAutoMeasureEnabled IAuthTabCallbackStub(boolean z) {
        this.newAuthTabSession = z;
        return this;
    }

    public isAutoMeasureEnabled onWarmupCompleted(float f) {
        this.postMessage = f;
        return this;
    }

    public isAutoMeasureEnabled onExtraCallback(float f) {
        this.setEngagementSignalsCallback = f;
        return this;
    }

    public isAutoMeasureEnabled IAuthTabCallbackDefault(float f) {
        this.requestPostMessageChannelWithExtras = f;
        return this;
    }

    public isAutoMeasureEnabled onExtraCallbackWithResult(float f) {
        this.prefetchWithMultipleUrls = f;
        return this;
    }

    public isAutoMeasureEnabled onExtraCallbackWithResult(boolean z) {
        this.requestPostMessageChannel = z;
        return this;
    }

    public isAutoMeasureEnabled onExtraCallbackWithResult(int i) {
        this.receiveFile = i;
        return this;
    }

    public isAutoMeasureEnabled onWarmupCompleted(int i) {
        this.ICustomTabsServiceStub = i;
        return this;
    }

    public isAutoMeasureEnabled IAuthTabCallback(int i) {
        this.validateRelationship = i;
        return this;
    }

    public isAutoMeasureEnabled onTransact(int i) {
        this.updateVisuals = i;
        return this;
    }

    public isAutoMeasureEnabled IAuthTabCallbackStubProxy(boolean z) {
        this.ICustomTabsServiceDefault = z;
        return this;
    }

    public isAutoMeasureEnabled writeTypedObject(boolean z) {
        this.warmup = z;
        return this;
    }

    public isAutoMeasureEnabled access000(boolean z) {
        this.ICustomTabsServiceStubProxy = z;
        return this;
    }

    public isAutoMeasureEnabled asInterface(boolean z) {
        this.onExtraCallbackWithResult = z;
        return this;
    }

    public isAutoMeasureEnabled getInterfaceDescriptor(boolean z) {
        this.onNavigationEvent = z;
        return this;
    }

    public isAutoMeasureEnabled IAuthTabCallback(float f) {
        this.onWarmupCompleted = f;
        return this;
    }

    public isAutoMeasureEnabled onTransact(float f) {
        this.IAuthTabCallback = f;
        return this;
    }

    public isAutoMeasureEnabled onNavigationEvent(float f) {
        this.onExtraCallback = f;
        return this;
    }

    public isAutoMeasureEnabled onExtraCallback(boolean z) {
        this.IAuthTabCallbackDefault = z;
        return this;
    }

    public isAutoMeasureEnabled access100(boolean z) {
        this.asInterface = z;
        return this;
    }

    public isAutoMeasureEnabled ICustomTabsCallback(boolean z) {
        this.onTransact = z;
        return this;
    }

    public isAutoMeasureEnabled IAuthTabCallback(boolean z) {
        this.asBinder = z;
        return this;
    }

    public isAutoMeasureEnabled onWarmupCompleted(boolean z) {
        this.IAuthTabCallbackStub = z;
        return this;
    }

    public isAutoMeasureEnabled asBinder(boolean z) {
        this.getInterfaceDescriptor = z;
        return this;
    }

    public isAutoMeasureEnabled IAuthTabCallbackStub(int i) {
        this.IAuthTabCallback_Parcel = i;
        return this;
    }

    public isAutoMeasureEnabled onExtraCallbackWithResult(int i, int i2, int i3, int i4) {
        this.access100 = new int[]{i, i2, i3, i4};
        return this;
    }

    public isAutoMeasureEnabled onNavigationEvent(int i) {
        this.access000 = i;
        return this;
    }

    private isAutoMeasureEnabled asInterface(float f) {
        this.readTypedObject = f;
        return this;
    }

    public isAutoMeasureEnabled readTypedObject(boolean z) {
        this.extraCallbackWithResult = z;
        return this;
    }

    private isAutoMeasureEnabled extraCallback(boolean z) {
        this.extraCallback = z;
        return this;
    }

    public isAutoMeasureEnabled onTransact(boolean z) {
        this.ICustomTabsCallback = z;
        return this;
    }

    public isAutoMeasureEnabled IAuthTabCallback_Parcel(boolean z) {
        this.writeTypedObject = z;
        return this;
    }

    public isAutoMeasureEnabled extraCallbackWithResult(boolean z) {
        this.onMessageChannelReady = z;
        return this;
    }

    public isAutoMeasureEnabled IAuthTabCallbackDefault(boolean z) {
        this.onPostMessage = z;
        return this;
    }

    private isAutoMeasureEnabled onMessageChannelReady(boolean z) {
        this.onActivityResized = z;
        return this;
    }

    private isAutoMeasureEnabled onNavigationEvent(@NonNull Class<? extends cancelScroll> cls) {
        this.onActivityLayout = cls;
        return this;
    }

    private isAutoMeasureEnabled onActivityResized(boolean z) {
        this.onMinimized = z;
        return this;
    }

    String[] onExtraCallback() {
        return this.ICustomTabsCallbackDefault;
    }

    public String access100() {
        return this.ICustomTabsCallbackStub;
    }

    public Locale ICustomTabsCallback() {
        return this.ICustomTabsCallbackStubProxy;
    }

    public CameraPosition IAuthTabCallback_Parcel() {
        return this.onUnminimized;
    }

    public LatLngBounds extraCallback() {
        return this.onRelationshipValidationResult;
    }

    public double ICustomTabsCallbackDefault() {
        return this.isEngagementSignalsApiAvailable;
    }

    public double onActivityLayout() {
        return this.ICustomTabsCallback_Parcel;
    }

    public double onMessageChannelReady() {
        return this.extraCommand;
    }

    public int[] access000() {
        return this.mayLaunchUrl;
    }

    public int IAuthTabCallbackStubProxy() {
        return this.ICustomTabsService;
    }

    public NaverMap.onWarmupCompleted onPostMessage() {
        return this.newSession;
    }

    public Set<String> getInterfaceDescriptor() {
        return this.newSessionWithExtras;
    }

    public boolean prefetch() {
        return this.prefetch;
    }

    public boolean newSession() {
        return this.newAuthTabSession;
    }

    public float onTransact() {
        return this.postMessage;
    }

    public float extraCallbackWithResult() {
        return this.setEngagementSignalsCallback;
    }

    public float extraCommand() {
        return this.requestPostMessageChannelWithExtras;
    }

    public float ICustomTabsCallbackStubProxy() {
        return this.prefetchWithMultipleUrls;
    }

    public boolean ICustomTabsService() {
        return this.requestPostMessageChannel;
    }

    public int writeTypedObject() {
        return this.receiveFile;
    }

    public int asInterface() {
        return this.ICustomTabsServiceStub;
    }

    public int asBinder() {
        return this.validateRelationship;
    }

    public int onRelationshipValidationResult() {
        return this.updateVisuals;
    }

    public boolean prefetchWithMultipleUrls() {
        return this.ICustomTabsServiceDefault;
    }

    public boolean access200() {
        return this.warmup;
    }

    public boolean ICustomTabsServiceDefault() {
        return this.ICustomTabsServiceStubProxy;
    }

    public boolean setEngagementSignalsCallback() {
        return this.onExtraCallbackWithResult;
    }

    public boolean receiveFile() {
        return this.onNavigationEvent;
    }

    public float ICustomTabsCallbackStub() {
        return this.onWarmupCompleted;
    }

    public float mayLaunchUrl() {
        return this.IAuthTabCallback;
    }

    public float onUnminimized() {
        return this.onExtraCallback;
    }

    public boolean isEngagementSignalsApiAvailable() {
        return this.IAuthTabCallbackDefault;
    }

    public boolean requestPostMessageChannelWithExtras() {
        return this.asInterface;
    }

    public boolean updateVisuals() {
        return this.onTransact;
    }

    public boolean ICustomTabsCallback_Parcel() {
        return this.asBinder;
    }

    public boolean newAuthTabSession() {
        return this.IAuthTabCallbackStub;
    }

    boolean onExtraCallbackWithResult() {
        return this.IAuthTabCallbackStubProxy;
    }

    public boolean newSessionWithExtras() {
        return this.getInterfaceDescriptor;
    }

    public int onActivityResized() {
        return this.IAuthTabCallback_Parcel;
    }

    public int[] onMinimized() {
        return this.access100;
    }

    public int readTypedObject() {
        return this.access000;
    }

    public float IAuthTabCallback() {
        return this.readTypedObject;
    }

    public boolean warmup() {
        return this.extraCallbackWithResult;
    }

    public boolean onWarmupCompleted() {
        return this.extraCallback;
    }

    public boolean postMessage() {
        return this.ICustomTabsCallback;
    }

    public boolean ICustomTabsServiceStub() {
        return this.writeTypedObject;
    }

    public boolean validateRelationship() {
        return this.onMessageChannelReady;
    }

    public boolean requestPostMessageChannel() {
        return this.onPostMessage;
    }

    public boolean onNavigationEvent() {
        return this.onActivityResized;
    }

    public Class<? extends cancelScroll> IAuthTabCallbackStub() {
        return this.onActivityLayout;
    }

    public boolean IAuthTabCallbackDefault() {
        return this.onMinimized;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || isAutoMeasureEnabled.class != obj.getClass()) {
            return false;
        }
        isAutoMeasureEnabled isautomeasureenabled = (isAutoMeasureEnabled) obj;
        if (Double.compare(isautomeasureenabled.isEngagementSignalsApiAvailable, this.isEngagementSignalsApiAvailable) != 0 || Double.compare(isautomeasureenabled.ICustomTabsCallback_Parcel, this.ICustomTabsCallback_Parcel) != 0 || Double.compare(isautomeasureenabled.extraCommand, this.extraCommand) != 0 || this.ICustomTabsService != isautomeasureenabled.ICustomTabsService || this.prefetch != isautomeasureenabled.prefetch || this.newAuthTabSession != isautomeasureenabled.newAuthTabSession || Float.compare(isautomeasureenabled.postMessage, this.postMessage) != 0 || Float.compare(isautomeasureenabled.setEngagementSignalsCallback, this.setEngagementSignalsCallback) != 0 || Float.compare(isautomeasureenabled.requestPostMessageChannelWithExtras, this.requestPostMessageChannelWithExtras) != 0 || Float.compare(isautomeasureenabled.prefetchWithMultipleUrls, this.prefetchWithMultipleUrls) != 0 || this.requestPostMessageChannel != isautomeasureenabled.requestPostMessageChannel || this.receiveFile != isautomeasureenabled.receiveFile || this.ICustomTabsServiceStub != isautomeasureenabled.ICustomTabsServiceStub || this.validateRelationship != isautomeasureenabled.validateRelationship || this.updateVisuals != isautomeasureenabled.updateVisuals || this.ICustomTabsServiceDefault != isautomeasureenabled.ICustomTabsServiceDefault || this.warmup != isautomeasureenabled.warmup || this.ICustomTabsServiceStubProxy != isautomeasureenabled.ICustomTabsServiceStubProxy || this.onExtraCallbackWithResult != isautomeasureenabled.onExtraCallbackWithResult || this.onNavigationEvent != isautomeasureenabled.onNavigationEvent || Float.compare(isautomeasureenabled.onWarmupCompleted, this.onWarmupCompleted) != 0 || Float.compare(isautomeasureenabled.IAuthTabCallback, this.IAuthTabCallback) != 0 || Float.compare(isautomeasureenabled.onExtraCallback, this.onExtraCallback) != 0 || this.IAuthTabCallbackDefault != isautomeasureenabled.IAuthTabCallbackDefault || this.asInterface != isautomeasureenabled.asInterface || this.onTransact != isautomeasureenabled.onTransact || this.asBinder != isautomeasureenabled.asBinder || this.IAuthTabCallbackStub != isautomeasureenabled.IAuthTabCallbackStub || this.IAuthTabCallbackStubProxy != isautomeasureenabled.IAuthTabCallbackStubProxy || this.getInterfaceDescriptor != isautomeasureenabled.getInterfaceDescriptor || this.IAuthTabCallback_Parcel != isautomeasureenabled.IAuthTabCallback_Parcel || this.access000 != isautomeasureenabled.access000 || this.readTypedObject != isautomeasureenabled.readTypedObject || this.extraCallbackWithResult != isautomeasureenabled.extraCallbackWithResult || this.extraCallback != isautomeasureenabled.extraCallback || this.ICustomTabsCallback != isautomeasureenabled.ICustomTabsCallback || this.writeTypedObject != isautomeasureenabled.writeTypedObject || this.onMessageChannelReady != isautomeasureenabled.onMessageChannelReady || this.onPostMessage != isautomeasureenabled.onPostMessage || this.onActivityResized != isautomeasureenabled.onActivityResized || this.onMinimized != isautomeasureenabled.onMinimized || !Arrays.equals(this.ICustomTabsCallbackDefault, isautomeasureenabled.ICustomTabsCallbackDefault)) {
            return false;
        }
        String str = this.ICustomTabsCallbackStub;
        if (str == null ? isautomeasureenabled.ICustomTabsCallbackStub != null : !str.equals(isautomeasureenabled.ICustomTabsCallbackStub)) {
            return false;
        }
        Locale locale = this.ICustomTabsCallbackStubProxy;
        if (locale == null ? isautomeasureenabled.ICustomTabsCallbackStubProxy != null : !locale.equals(isautomeasureenabled.ICustomTabsCallbackStubProxy)) {
            return false;
        }
        CameraPosition cameraPosition = this.onUnminimized;
        if (cameraPosition == null ? isautomeasureenabled.onUnminimized != null : !cameraPosition.equals(isautomeasureenabled.onUnminimized)) {
            return false;
        }
        LatLngBounds latLngBounds = this.onRelationshipValidationResult;
        if (latLngBounds == null ? isautomeasureenabled.onRelationshipValidationResult != null : !latLngBounds.equals(isautomeasureenabled.onRelationshipValidationResult)) {
            return false;
        }
        if (Arrays.equals(this.mayLaunchUrl, isautomeasureenabled.mayLaunchUrl) && this.newSession == isautomeasureenabled.newSession && this.newSessionWithExtras.equals(isautomeasureenabled.newSessionWithExtras) && Arrays.equals(this.access100, isautomeasureenabled.access100)) {
            return this.onActivityLayout.equals(isautomeasureenabled.onActivityLayout);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.ICustomTabsCallbackDefault);
        String str = this.ICustomTabsCallbackStub;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        Locale locale = this.ICustomTabsCallbackStubProxy;
        int iHashCode3 = locale != null ? locale.hashCode() : 0;
        CameraPosition cameraPosition = this.onUnminimized;
        int iHashCode4 = cameraPosition != null ? cameraPosition.hashCode() : 0;
        LatLngBounds latLngBounds = this.onRelationshipValidationResult;
        int iHashCode5 = latLngBounds != null ? latLngBounds.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.isEngagementSignalsApiAvailable);
        int i = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.ICustomTabsCallback_Parcel);
        int i2 = (int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.extraCommand);
        int i3 = (int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32));
        int iHashCode6 = Arrays.hashCode(this.mayLaunchUrl);
        int i4 = this.ICustomTabsService;
        int iHashCode7 = this.newSession.hashCode();
        int iHashCode8 = this.newSessionWithExtras.hashCode();
        boolean z = this.prefetch;
        boolean z2 = this.newAuthTabSession;
        float f = this.postMessage;
        int iFloatToIntBits = f != 0.0f ? Float.floatToIntBits(f) : 0;
        float f2 = this.setEngagementSignalsCallback;
        int iFloatToIntBits2 = f2 != 0.0f ? Float.floatToIntBits(f2) : 0;
        float f3 = this.requestPostMessageChannelWithExtras;
        int iFloatToIntBits3 = f3 != 0.0f ? Float.floatToIntBits(f3) : 0;
        float f4 = this.prefetchWithMultipleUrls;
        int iFloatToIntBits4 = f4 != 0.0f ? Float.floatToIntBits(f4) : 0;
        boolean z3 = this.requestPostMessageChannel;
        int i5 = this.receiveFile;
        int i6 = this.ICustomTabsServiceStub;
        int i7 = this.validateRelationship;
        int i8 = this.updateVisuals;
        boolean z4 = this.ICustomTabsServiceDefault;
        boolean z5 = this.warmup;
        boolean z6 = this.ICustomTabsServiceStubProxy;
        boolean z7 = this.onExtraCallbackWithResult;
        boolean z8 = this.onNavigationEvent;
        float f5 = this.onWarmupCompleted;
        int iFloatToIntBits5 = f5 != 0.0f ? Float.floatToIntBits(f5) : 0;
        float f6 = this.IAuthTabCallback;
        int iFloatToIntBits6 = f6 != 0.0f ? Float.floatToIntBits(f6) : 0;
        float f7 = this.onExtraCallback;
        int iFloatToIntBits7 = f7 != 0.0f ? Float.floatToIntBits(f7) : 0;
        boolean z9 = this.IAuthTabCallbackDefault;
        boolean z10 = this.asInterface;
        boolean z11 = this.onTransact;
        boolean z12 = this.asBinder;
        boolean z13 = this.IAuthTabCallbackStub;
        boolean z14 = this.IAuthTabCallbackStubProxy;
        boolean z15 = this.getInterfaceDescriptor;
        int i9 = this.IAuthTabCallback_Parcel;
        int iHashCode9 = Arrays.hashCode(this.access100);
        int i10 = this.access000;
        float f8 = this.readTypedObject;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + i) * 31) + i2) * 31) + i3) * 31) + iHashCode6) * 31) + i4) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + iFloatToIntBits) * 31) + iFloatToIntBits2) * 31) + iFloatToIntBits3) * 31) + iFloatToIntBits4) * 31) + (z3 ? 1 : 0)) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + i8) * 31) + (z4 ? 1 : 0)) * 31) + (z5 ? 1 : 0)) * 31) + (z6 ? 1 : 0)) * 31) + (z7 ? 1 : 0)) * 31) + (z8 ? 1 : 0)) * 31) + iFloatToIntBits5) * 31) + iFloatToIntBits6) * 31) + iFloatToIntBits7) * 31) + (z9 ? 1 : 0)) * 31) + (z10 ? 1 : 0)) * 31) + (z11 ? 1 : 0)) * 31) + (z12 ? 1 : 0)) * 31) + (z13 ? 1 : 0)) * 31) + (z14 ? 1 : 0)) * 31) + (z15 ? 1 : 0)) * 31) + i9) * 31) + iHashCode9) * 31) + i10) * 31) + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0)) * 31) + (this.extraCallbackWithResult ? 1 : 0)) * 31) + (this.extraCallback ? 1 : 0)) * 31) + (this.ICustomTabsCallback ? 1 : 0)) * 31) + (this.writeTypedObject ? 1 : 0)) * 31) + (this.onMessageChannelReady ? 1 : 0)) * 31) + (this.onPostMessage ? 1 : 0)) * 31) + (this.onActivityResized ? 1 : 0)) * 31) + this.onActivityLayout.hashCode()) * 31) + (this.onMinimized ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(this.ICustomTabsCallbackDefault);
        parcel.writeString(this.ICustomTabsCallbackStub);
        parcel.writeSerializable(this.ICustomTabsCallbackStubProxy);
        parcel.writeParcelable(this.onUnminimized, i);
        parcel.writeParcelable(this.onRelationshipValidationResult, i);
        parcel.writeDouble(this.isEngagementSignalsApiAvailable);
        parcel.writeDouble(this.ICustomTabsCallback_Parcel);
        parcel.writeDouble(this.extraCommand);
        parcel.writeIntArray(this.mayLaunchUrl);
        parcel.writeInt(this.ICustomTabsService);
        parcel.writeInt(this.newSession.ordinal());
        parcel.writeSerializable(this.newSessionWithExtras);
        parcel.writeByte(this.prefetch ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.newAuthTabSession ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.postMessage);
        parcel.writeFloat(this.setEngagementSignalsCallback);
        parcel.writeFloat(this.requestPostMessageChannelWithExtras);
        parcel.writeFloat(this.prefetchWithMultipleUrls);
        parcel.writeByte(this.requestPostMessageChannel ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.receiveFile);
        parcel.writeInt(this.ICustomTabsServiceStub);
        parcel.writeInt(this.validateRelationship);
        parcel.writeInt(this.updateVisuals);
        parcel.writeByte(this.ICustomTabsServiceDefault ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.warmup ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.ICustomTabsServiceStubProxy ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.onExtraCallbackWithResult ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.onNavigationEvent ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.onWarmupCompleted);
        parcel.writeFloat(this.IAuthTabCallback);
        parcel.writeFloat(this.onExtraCallback);
        parcel.writeByte(this.IAuthTabCallbackDefault ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.asInterface ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.onTransact ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.asBinder ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.IAuthTabCallbackStub ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.IAuthTabCallbackStubProxy ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.getInterfaceDescriptor ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.IAuthTabCallback_Parcel);
        parcel.writeIntArray(this.access100);
        parcel.writeInt(this.access000);
        parcel.writeFloat(this.readTypedObject);
        parcel.writeByte(this.extraCallbackWithResult ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.extraCallback ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.ICustomTabsCallback ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.writeTypedObject ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.onMessageChannelReady ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.onPostMessage ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.onActivityResized ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.onActivityLayout);
        parcel.writeByte(this.onMinimized ? (byte) 1 : (byte) 0);
    }

    protected isAutoMeasureEnabled(Parcel parcel) {
        this.isEngagementSignalsApiAvailable = 0.0d;
        this.ICustomTabsCallback_Parcel = 21.0d;
        this.extraCommand = 63.0d;
        this.mayLaunchUrl = new int[4];
        this.ICustomTabsService = 200;
        this.newSession = NaverMap.onWarmupCompleted.Basic;
        this.newSessionWithExtras = new HashSet<>(Collections.singleton("building"));
        this.prefetch = false;
        this.newAuthTabSession = false;
        this.postMessage = 1.0f;
        this.setEngagementSignalsCallback = 0.0f;
        this.requestPostMessageChannelWithExtras = 1.0f;
        this.prefetchWithMultipleUrls = 1.0f;
        this.requestPostMessageChannel = false;
        this.receiveFile = -1;
        this.ICustomTabsServiceStub = -789775;
        this.validateRelationship = NaverMap.onExtraCallback;
        this.updateVisuals = -1;
        this.ICustomTabsServiceDefault = true;
        this.warmup = true;
        this.ICustomTabsServiceStubProxy = true;
        this.onExtraCallbackWithResult = true;
        this.onNavigationEvent = true;
        this.onWarmupCompleted = 0.088f;
        this.IAuthTabCallback = 0.12375f;
        this.onExtraCallback = 0.19333f;
        this.IAuthTabCallbackDefault = true;
        this.asInterface = true;
        this.onTransact = true;
        this.asBinder = true;
        this.IAuthTabCallbackStub = false;
        this.IAuthTabCallbackStubProxy = true;
        this.getInterfaceDescriptor = true;
        this.IAuthTabCallback_Parcel = 0;
        this.readTypedObject = 1.0f;
        this.extraCallbackWithResult = false;
        this.extraCallback = false;
        this.ICustomTabsCallback = false;
        this.writeTypedObject = false;
        this.onMessageChannelReady = false;
        this.onPostMessage = true;
        this.onActivityResized = false;
        this.onActivityLayout = DefaultTypefaceFactory.class;
        this.onMinimized = false;
        this.ICustomTabsCallbackDefault = parcel.createStringArray();
        this.ICustomTabsCallbackStub = parcel.readString();
        this.ICustomTabsCallbackStubProxy = (Locale) parcel.readSerializable();
        this.onUnminimized = (CameraPosition) parcel.readParcelable(CameraPosition.class.getClassLoader());
        this.onRelationshipValidationResult = (LatLngBounds) parcel.readParcelable(LatLngBounds.class.getClassLoader());
        this.isEngagementSignalsApiAvailable = parcel.readDouble();
        this.ICustomTabsCallback_Parcel = parcel.readDouble();
        this.extraCommand = parcel.readDouble();
        this.mayLaunchUrl = parcel.createIntArray();
        this.ICustomTabsService = parcel.readInt();
        int i = parcel.readInt();
        this.newSession = i == -1 ? null : NaverMap.onWarmupCompleted.values()[i];
        this.newSessionWithExtras = (HashSet) parcel.readSerializable();
        this.prefetch = parcel.readByte() != 0;
        this.newAuthTabSession = parcel.readByte() != 0;
        this.postMessage = parcel.readFloat();
        this.setEngagementSignalsCallback = parcel.readFloat();
        this.requestPostMessageChannelWithExtras = parcel.readFloat();
        this.prefetchWithMultipleUrls = parcel.readFloat();
        this.requestPostMessageChannel = parcel.readByte() != 0;
        this.receiveFile = parcel.readInt();
        this.ICustomTabsServiceStub = parcel.readInt();
        this.validateRelationship = parcel.readInt();
        this.updateVisuals = parcel.readInt();
        this.ICustomTabsServiceDefault = parcel.readByte() != 0;
        this.warmup = parcel.readByte() != 0;
        this.ICustomTabsServiceStubProxy = parcel.readByte() != 0;
        this.onExtraCallbackWithResult = parcel.readByte() != 0;
        this.onNavigationEvent = parcel.readByte() != 0;
        this.onWarmupCompleted = parcel.readFloat();
        this.IAuthTabCallback = parcel.readFloat();
        this.onExtraCallback = parcel.readFloat();
        this.IAuthTabCallbackDefault = parcel.readByte() != 0;
        this.asInterface = parcel.readByte() != 0;
        this.onTransact = parcel.readByte() != 0;
        this.asBinder = parcel.readByte() != 0;
        this.IAuthTabCallbackStub = parcel.readByte() != 0;
        this.IAuthTabCallbackStubProxy = parcel.readByte() != 0;
        this.getInterfaceDescriptor = parcel.readByte() != 0;
        this.IAuthTabCallback_Parcel = parcel.readInt();
        this.access100 = parcel.createIntArray();
        this.access000 = parcel.readInt();
        this.readTypedObject = parcel.readFloat();
        this.extraCallbackWithResult = parcel.readByte() != 0;
        this.extraCallback = parcel.readByte() != 0;
        this.ICustomTabsCallback = parcel.readByte() != 0;
        this.writeTypedObject = parcel.readByte() != 0;
        this.onMessageChannelReady = parcel.readByte() != 0;
        this.onPostMessage = parcel.readByte() != 0;
        this.onActivityResized = parcel.readByte() != 0;
        this.onActivityLayout = (Class) parcel.readSerializable();
        this.onMinimized = parcel.readByte() != 0;
    }
}
