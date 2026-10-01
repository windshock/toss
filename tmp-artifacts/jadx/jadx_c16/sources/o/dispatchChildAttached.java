package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.location.Location;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.wwx.lt;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.otaliastudios.cameraview.engine.offset.Reference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o.addRecyclerListener;
import o.removeAnimatingView;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class dispatchChildAttached extends dispatchChildDetached {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onGreatestScrollPercentageIncreased = 1;
    private static int onVerticalScrollEvent;
    protected stopGlowAnimations IAuthTabCallback;
    protected float IAuthTabCallbackDefault;
    protected animateAppearance IAuthTabCallbackStub;
    protected Location IAuthTabCallbackStubProxy;
    protected clearOnChildAttachStateChangeListeners IAuthTabCallback_Parcel;
    protected boolean ICustomTabsCallback;
    protected dispatchLayout ICustomTabsCallbackDefault;
    Task<Void> ICustomTabsCallbackStub;
    protected considerReleasingGlowsOnScroll ICustomTabsCallbackStubProxy;
    private int ICustomTabsCallback_Parcel;
    private int ICustomTabsServiceDefault;
    private int ICustomTabsServiceStub;
    protected boolean access000;
    Task<Void> access100;
    private long access200;
    protected removeOnChildAttachStateChangeListener asBinder;
    Task<Void> asInterface;
    protected boolean extraCallback;
    protected onSizeChanged extraCallbackWithResult;
    Task<Void> getInterfaceDescriptor;
    protected float isEngagementSignalsApiAvailable;
    private addItemDecoration mayLaunchUrl;
    private long newAuthTabSession;
    private clearOldPositions newSession;
    private int newSessionWithExtras;
    protected removeOnChildAttachStateChangeListener onActivityLayout;
    Task<Void> onActivityResized;
    Task<Void> onExtraCallback;
    protected addOnItemTouchListener onExtraCallbackWithResult;
    protected float onMessageChannelReady;
    Task<Void> onMinimized;
    protected removeOnChildAttachStateChangeListener onNavigationEvent;
    protected removeAnimatingView onPostMessage;
    protected removeOnScrollListener onRelationshipValidationResult;
    protected int onTransact;
    Task<Void> onUnminimized;
    private final getChildPosition onWarmupCompleted;
    private hasFixedSize postMessage;
    private int prefetch;
    private int prefetchWithMultipleUrls;
    protected boolean readTypedObject;
    private onChildAttachedToWindow receiveFile;
    private removeOnItemTouchListener requestPostMessageChannel;
    private boolean requestPostMessageChannelWithExtras;
    private clearOnScrollListeners setEngagementSignalsCallback;
    private removeOnItemTouchListener updateVisuals;
    private int validateRelationship;
    private int warmup;
    private removeOnItemTouchListener writeTypedList;
    protected consumeFlingInHorizontalStretch writeTypedObject;
    private static char[] ICustomTabsService_Parcel = {32738, 32736, 32747, 32746};
    private static int ICustomTabsServiceStubProxy = -1184333929;
    private static boolean IEngagementSignalsCallback = true;
    private static boolean onSessionEnded = true;

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i2);
        int i9 = (~(i7 | i)) | i8;
        int i10 = ~i2;
        int i11 = ~i;
        int i12 = i9 | (~(i10 | i11 | i5));
        int i13 = ~(i7 | i10 | i11);
        int i14 = i10 | i5;
        int i15 = (~(i | i14)) | i13;
        int i16 = (~i14) | i8;
        int i17 = i5 + i2 + i4 + ((-327997910) * i6) + ((-604038433) * i3);
        int i18 = i17 * i17;
        int i19 = ((i5 * 234895570) - 128974848) + (234895570 * i2) + (i12 * 695176798) + (695176798 * i15) + ((-347588399) * i16) + (582483968 * i4) + (36700160 * i6) + ((-297271296) * i3) + (1302134784 * i18);
        int i20 = (i5 * (-238133666)) + 182491156 + (i2 * (-238133666)) + (i12 * (-1294)) + (i15 * (-1294)) + (i16 * 647) + (i4 * (-238134313)) + (i6 * (-1022231738)) + (i3 * 4118089) + (i18 * (-35979264));
        switch (i19 + (i20 * i20 * 1404239872)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return onTransact(objArr);
            case 10:
                return IAuthTabCallbackStubProxy(objArr);
            case 11:
                return access000(objArr);
            case 12:
                return access100(objArr);
            case 13:
                return getInterfaceDescriptor(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    protected abstract void IAuthTabCallback();

    protected abstract List<removeOnChildAttachStateChangeListener> onExtraCallbackWithResult();

    protected abstract hasFixedSize onExtraCallbackWithResult(int i);

    protected abstract void onExtraCallbackWithResult(@NonNull addRecyclerListener.IAuthTabCallback iAuthTabCallback, @NonNull removeItemDecoration removeitemdecoration, boolean z);

    protected abstract void onExtraCallbackWithResult(@NonNull addRecyclerListener.IAuthTabCallback iAuthTabCallback, boolean z);

    protected abstract List<removeOnChildAttachStateChangeListener> onWarmupCompleted();

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        dispatchChildAttached dispatchchildattached = (dispatchChildAttached) objArr[0];
        Reference reference = (Reference) objArr[1];
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 21;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 != 0) {
            return dispatchchildattached.IAuthTabCallback(reference);
        }
        dispatchchildattached.IAuthTabCallback(reference);
        throw null;
    }

    static /* synthetic */ clearOldPositions onExtraCallback(dispatchChildAttached dispatchchildattached) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 121;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        clearOldPositions clearoldpositions = dispatchchildattached.newSession;
        if (i3 == 0) {
            return clearoldpositions;
        }
        throw null;
    }

    static /* synthetic */ clearOldPositions onWarmupCompleted(dispatchChildAttached dispatchchildattached, clearOldPositions clearoldpositions) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 31;
        int i3 = i2 % 128;
        onGreatestScrollPercentageIncreased = i3;
        int i4 = i2 % 2;
        dispatchchildattached.newSession = clearoldpositions;
        int i5 = i3 + 77;
        onVerticalScrollEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return clearoldpositions;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ clearOnScrollListeners onWarmupCompleted(dispatchChildAttached dispatchchildattached) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 121;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        clearOnScrollListeners clearonscrolllisteners = dispatchchildattached.setEngagementSignalsCallback;
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        return clearonscrolllisteners;
    }

    protected dispatchChildAttached(@NonNull dispatchChildDetached$onExtraCallbackWithResult dispatchchilddetached_onextracallbackwithresult) {
        super(dispatchchilddetached_onextracallbackwithresult);
        this.onWarmupCompleted = new getChildPosition();
        this.ICustomTabsCallbackStub = Tasks.forResult((Object) null);
        this.onExtraCallback = Tasks.forResult((Object) null);
        this.asInterface = Tasks.forResult((Object) null);
        this.onUnminimized = Tasks.forResult((Object) null);
        this.getInterfaceDescriptor = Tasks.forResult((Object) null);
        this.access100 = Tasks.forResult((Object) null);
        this.onMinimized = Tasks.forResult((Object) null);
        this.onActivityResized = Tasks.forResult((Object) null);
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        dispatchChildAttached dispatchchildattached = (dispatchChildAttached) objArr[0];
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent;
        int i3 = i2 + 9;
        onGreatestScrollPercentageIncreased = i3 % 128;
        int i4 = i3 % 2;
        getChildPosition getchildposition = dispatchchildattached.onWarmupCompleted;
        int i5 = i2 + 27;
        onGreatestScrollPercentageIncreased = i5 % 128;
        if (i5 % 2 != 0) {
            return getchildposition;
        }
        throw null;
    }

    public hasFixedSize onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 7;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 == 0) {
            if (this.postMessage == null) {
                this.postMessage = onExtraCallbackWithResult(this.prefetchWithMultipleUrls);
                int i3 = onGreatestScrollPercentageIncreased + 41;
                onVerticalScrollEvent = i3 % 128;
                int i4 = i3 % 2;
            }
            return this.postMessage;
        }
        throw null;
    }

    public final stopGlowAnimations onActivityResized() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 55;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        throw null;
    }

    public final void onWarmupCompleted(@NonNull removeAnimatingView removeanimatingview) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent;
        int i3 = i2 + 107;
        onGreatestScrollPercentageIncreased = i3 % 128;
        int i4 = i3 % 2;
        removeAnimatingView removeanimatingview2 = this.onPostMessage;
        if (removeanimatingview2 != null) {
            int i5 = i2 + 15;
            onGreatestScrollPercentageIncreased = i5 % 128;
            if (i5 % 2 == 0) {
                removeanimatingview2.IAuthTabCallback((removeAnimatingView.onWarmupCompleted) null);
                throw null;
            }
            removeanimatingview2.IAuthTabCallback((removeAnimatingView.onWarmupCompleted) null);
            int i6 = onGreatestScrollPercentageIncreased + 69;
            onVerticalScrollEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 % 2;
            }
        }
        this.onPostMessage = removeanimatingview;
        removeanimatingview.IAuthTabCallback(this);
    }

    public final removeAnimatingView newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 111;
        int i3 = i2 % 128;
        onVerticalScrollEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        removeAnimatingView removeanimatingview = this.onPostMessage;
        int i4 = i3 + 103;
        onGreatestScrollPercentageIncreased = i4 % 128;
        int i5 = i4 % 2;
        return removeanimatingview;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        dispatchChildAttached dispatchchildattached = (dispatchChildAttached) objArr[0];
        onChildAttachedToWindow onchildattachedtowindow = (onChildAttachedToWindow) objArr[1];
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 61;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        dispatchchildattached.receiveFile = onchildattachedtowindow;
        if (i3 == 0) {
            return null;
        }
        int i4 = 49 / 0;
        return null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        dispatchChildAttached dispatchchildattached = (dispatchChildAttached) objArr[0];
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 119;
        int i3 = i2 % 128;
        onVerticalScrollEvent = i3;
        int i4 = i2 % 2;
        onChildAttachedToWindow onchildattachedtowindow = dispatchchildattached.receiveFile;
        int i5 = i3 + 113;
        onGreatestScrollPercentageIncreased = i5 % 128;
        if (i5 % 2 != 0) {
            return onchildattachedtowindow;
        }
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = ICustomTabsService_Parcel;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 77, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(ICustomTabsServiceStubProxy)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 75, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i5 = 1052772399;
        if (onSessionEnded) {
            int i6 = $10 + 105;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i7 = $10 + 29;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >> 1) >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] >>> iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 62, 12213 - Process.getGidForName(""), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 63 - (ViewConfiguration.getTouchSlop() >> 8), View.getDefaultSize(0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                i5 = 1052772399;
            }
            objArr[0] = new String(cArr2);
            return;
        }
        if (!IEngagementSignalsCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $11 + 95;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback + 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >> i] + iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i9 = $11 + 33;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 64 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr6);
    }

    public final void onWarmupCompleted(@Nullable removeOnItemTouchListener removeonitemtouchlistener) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 23;
        int i3 = i2 % 128;
        onGreatestScrollPercentageIncreased = i3;
        int i4 = i2 % 2;
        this.updateVisuals = removeonitemtouchlistener;
        int i5 = i3 + 9;
        onVerticalScrollEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        dispatchChildAttached dispatchchildattached = (dispatchChildAttached) objArr[0];
        removeOnItemTouchListener removeonitemtouchlistener = (removeOnItemTouchListener) objArr[1];
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 3;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        dispatchchildattached.requestPostMessageChannel = removeonitemtouchlistener;
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final removeOnItemTouchListener ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 97;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        removeOnItemTouchListener removeonitemtouchlistener = this.requestPostMessageChannel;
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        return removeonitemtouchlistener;
    }

    public final void onNavigationEvent(@NonNull removeOnItemTouchListener removeonitemtouchlistener) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 3;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        this.writeTypedList = removeonitemtouchlistener;
        if (i3 == 0) {
            throw null;
        }
    }

    public final removeOnItemTouchListener warmup() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 83;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 != 0) {
            return this.writeTypedList;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        dispatchChildAttached dispatchchildattached = (dispatchChildAttached) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 19;
        int i3 = i2 % 128;
        onGreatestScrollPercentageIncreased = i3;
        int i4 = i2 % 2;
        dispatchchildattached.access200 = jLongValue;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 79;
        onVerticalScrollEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 23 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        dispatchChildAttached dispatchchildattached = (dispatchChildAttached) objArr[0];
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased;
        int i3 = i2 + 63;
        onVerticalScrollEvent = i3 % 128;
        int i4 = i3 % 2;
        long j = dispatchchildattached.access200;
        int i5 = i2 + 105;
        onVerticalScrollEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return Long.valueOf(j);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void asBinder(int i) {
        int i2 = 2 % 2;
        int i3 = onGreatestScrollPercentageIncreased + 45;
        onVerticalScrollEvent = i3 % 128;
        int i4 = i3 % 2;
        this.ICustomTabsServiceStub = i;
        if (i4 != 0) {
            throw null;
        }
    }

    public final int setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 27;
        int i3 = i2 % 128;
        onVerticalScrollEvent = i3;
        int i4 = i2 % 2;
        int i5 = this.ICustomTabsServiceStub;
        int i6 = i3 + 101;
        onGreatestScrollPercentageIncreased = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final void IAuthTabCallback(@NonNull considerReleasingGlowsOnScroll considerreleasingglowsonscroll) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent;
        int i3 = i2 + 21;
        onGreatestScrollPercentageIncreased = i3 % 128;
        int i4 = i3 % 2;
        this.ICustomTabsCallbackStubProxy = considerreleasingglowsonscroll;
        int i5 = i2 + 119;
        onGreatestScrollPercentageIncreased = i5 % 128;
        int i6 = i5 % 2;
    }

    public final considerReleasingGlowsOnScroll receiveFile() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 57;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ICustomTabsCallbackStubProxy;
        }
        throw null;
    }

    public final void onTransact(int i) {
        int i2 = 2 % 2;
        int i3 = onVerticalScrollEvent;
        int i4 = i3 + 31;
        onGreatestScrollPercentageIncreased = i4 % 128;
        int i5 = i4 % 2;
        this.warmup = i;
        int i6 = i3 + 113;
        onGreatestScrollPercentageIncreased = i6 % 128;
        int i7 = i6 % 2;
    }

    public final int prefetchWithMultipleUrls() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased;
        int i3 = i2 + 57;
        onVerticalScrollEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.warmup;
        int i6 = i2 + 105;
        onVerticalScrollEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final void IAuthTabCallback(@NonNull addOnItemTouchListener addonitemtouchlistener) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 87;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult = addonitemtouchlistener;
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
    }

    public final addOnItemTouchListener extraCallback() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 101;
        int i3 = i2 % 128;
        onGreatestScrollPercentageIncreased = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        addOnItemTouchListener addonitemtouchlistener = this.onExtraCallbackWithResult;
        int i4 = i3 + 5;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return addonitemtouchlistener;
    }

    public final void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = onGreatestScrollPercentageIncreased;
        int i4 = i3 + 13;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        this.ICustomTabsCallback_Parcel = i;
        int i6 = i3 + 37;
        onVerticalScrollEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    public final int writeTypedObject() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 85;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ICustomTabsCallback_Parcel;
        }
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        dispatchChildAttached dispatchchildattached = (dispatchChildAttached) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased;
        int i3 = i2 + 121;
        onVerticalScrollEvent = i3 % 128;
        int i4 = i3 % 2;
        dispatchchildattached.ICustomTabsServiceDefault = iIntValue;
        int i5 = i2 + 107;
        onVerticalScrollEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
        return null;
    }

    public final int requestPostMessageChannelWithExtras() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 25;
        int i3 = i2 % 128;
        onGreatestScrollPercentageIncreased = i3;
        int i4 = i2 % 2;
        int i5 = this.ICustomTabsServiceDefault;
        int i6 = i3 + 61;
        onVerticalScrollEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final void IAuthTabCallbackDefault(int i) {
        int i2 = 2 % 2;
        int i3 = onVerticalScrollEvent;
        int i4 = i3 + 75;
        onGreatestScrollPercentageIncreased = i4 % 128;
        int i5 = i4 % 2;
        this.validateRelationship = i;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i3 + 45;
        onGreatestScrollPercentageIncreased = i6 % 128;
        int i7 = i6 % 2;
    }

    public final int postMessage() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased;
        int i3 = i2 + 91;
        onVerticalScrollEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.validateRelationship;
        int i6 = i2 + 115;
        onVerticalScrollEvent = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onGreatestScrollPercentageIncreased;
        int i4 = i3 + 55;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        this.newSessionWithExtras = i;
        int i6 = i3 + 113;
        onVerticalScrollEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    public final int ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 23;
        int i3 = i2 % 128;
        onGreatestScrollPercentageIncreased = i3;
        int i4 = i2 % 2;
        int i5 = this.newSessionWithExtras;
        int i6 = i3 + 103;
        onVerticalScrollEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = onVerticalScrollEvent + 123;
        onGreatestScrollPercentageIncreased = i3 % 128;
        int i4 = i3 % 2;
        this.prefetch = i;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onUnminimized() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 119;
        int i3 = i2 % 128;
        onGreatestScrollPercentageIncreased = i3;
        int i4 = i2 % 2;
        int i5 = this.prefetch;
        int i6 = i3 + 111;
        onVerticalScrollEvent = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 25;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.onTransact;
        if (i3 == 0) {
            int i5 = 76 / 0;
        }
        return i4;
    }

    public final void asInterface(int i) {
        int i2 = 2 % 2;
        int i3 = onGreatestScrollPercentageIncreased + 25;
        int i4 = i3 % 128;
        onVerticalScrollEvent = i4;
        int i5 = i3 % 2;
        this.prefetchWithMultipleUrls = i;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 67;
        onGreatestScrollPercentageIncreased = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        dispatchChildAttached dispatchchildattached = (dispatchChildAttached) objArr[0];
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent;
        int i3 = i2 + 23;
        onGreatestScrollPercentageIncreased = i3 % 128;
        int i4 = i3 % 2;
        int i5 = dispatchchildattached.prefetchWithMultipleUrls;
        int i6 = i2 + 17;
        onGreatestScrollPercentageIncreased = i6 % 128;
        int i7 = i6 % 2;
        return Integer.valueOf(i5);
    }

    public final void onExtraCallback(long j) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 115;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        this.newAuthTabSession = j;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onMinimized() {
        long j;
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent;
        int i3 = i2 + 65;
        onGreatestScrollPercentageIncreased = i3 % 128;
        if (i3 % 2 == 0) {
            j = this.newAuthTabSession;
            int i4 = 25 / 0;
        } else {
            j = this.newAuthTabSession;
        }
        int i5 = i2 + 23;
        onGreatestScrollPercentageIncreased = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
      0x0024: PHI (r3v3 long) = (r3v2 long), (r3v4 long) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        long j;
        dispatchChildAttached dispatchchildattached = (dispatchChildAttached) objArr[0];
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased;
        int i3 = i2 + 41;
        onVerticalScrollEvent = i3 % 128;
        if (i3 % 2 != 0) {
            j = dispatchchildattached.newAuthTabSession;
            if (j > 1) {
                int i4 = i2 + 51;
                onVerticalScrollEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                if (j != Long.MAX_VALUE) {
                    return true;
                }
            }
        } else {
            j = dispatchchildattached.newAuthTabSession;
            if (j > 0) {
            }
        }
        int i5 = i2 + 33;
        onVerticalScrollEvent = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final void IAuthTabCallback(@NonNull final clearOldPositions clearoldpositions) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 83;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        final clearOldPositions clearoldpositions2 = this.newSession;
        if (clearoldpositions != clearoldpositions2) {
            this.newSession = clearoldpositions;
            onSessionEnded().IAuthTabCallback("facing", getItemDecorationCount.ENGINE, new Runnable() { // from class: o.dispatchChildAttached.5
                @Override // java.lang.Runnable
                public void run() {
                    if (dispatchChildAttached.this.onWarmupCompleted(clearoldpositions)) {
                        dispatchChildAttached.this.IPostMessageService();
                    } else {
                        dispatchChildAttached.onWarmupCompleted(dispatchChildAttached.this, clearoldpositions2);
                    }
                }
            });
        }
        int i4 = onVerticalScrollEvent + 103;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final clearOldPositions onActivityLayout() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased;
        int i3 = i2 + 107;
        onVerticalScrollEvent = i3 % 128;
        int i4 = i3 % 2;
        clearOldPositions clearoldpositions = this.newSession;
        int i5 = i2 + 87;
        onVerticalScrollEvent = i5 % 128;
        int i6 = i5 % 2;
        return clearoldpositions;
    }

    public final void IAuthTabCallback(@NonNull addItemDecoration additemdecoration) {
        int i = 2 % 2;
        if (this.mayLaunchUrl != additemdecoration) {
            int i2 = onVerticalScrollEvent + 93;
            onGreatestScrollPercentageIncreased = i2 % 128;
            int i3 = i2 % 2;
            if (((Boolean) onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 1142372969, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{this}, -1142372960, lt.40.onExtraCallbackWithResult())).booleanValue()) {
                int i4 = onVerticalScrollEvent + 43;
                onGreatestScrollPercentageIncreased = i4 % 128;
                int i5 = i4 % 2;
                dispatchChildDetached.extraCommand.onWarmupCompleted(new Object[]{"Audio setting was changed while recording. Changes will take place starting from next video"});
            }
            this.mayLaunchUrl = additemdecoration;
            int i6 = onVerticalScrollEvent + 61;
            onGreatestScrollPercentageIncreased = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = onVerticalScrollEvent + 45;
        onGreatestScrollPercentageIncreased = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    public final addItemDecoration extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 87;
        int i3 = i2 % 128;
        onGreatestScrollPercentageIncreased = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        addItemDecoration additemdecoration = this.mayLaunchUrl;
        int i4 = i3 + 105;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return additemdecoration;
    }

    public final void onExtraCallbackWithResult(@NonNull clearOnScrollListeners clearonscrolllisteners) throws Throwable {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 75;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        if (clearonscrolllisteners != this.setEngagementSignalsCallback) {
            this.setEngagementSignalsCallback = clearonscrolllisteners;
            getItemDecorationAt getitemdecorationatOnSessionEnded = onSessionEnded();
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-124, -125, -126, -127}, 127 - TextUtils.indexOf("", "", 0), objArr);
            getitemdecorationatOnSessionEnded.IAuthTabCallback(((String) objArr[0]).intern(), getItemDecorationCount.ENGINE, new Runnable() { // from class: o.dispatchChildAttached.2
                @Override // java.lang.Runnable
                public void run() {
                    dispatchChildAttached.this.IPostMessageService();
                }
            });
            int i4 = onGreatestScrollPercentageIncreased + 7;
            onVerticalScrollEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final clearOnScrollListeners mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 45;
        int i3 = i2 % 128;
        onGreatestScrollPercentageIncreased = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        clearOnScrollListeners clearonscrolllisteners = this.setEngagementSignalsCallback;
        int i4 = i3 + 27;
        onVerticalScrollEvent = i4 % 128;
        int i5 = i4 % 2;
        return clearonscrolllisteners;
    }

    public final float validateRelationship() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 103;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.isEngagementSignalsApiAvailable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        dispatchChildAttached dispatchchildattached = (dispatchChildAttached) objArr[0];
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 41;
        int i3 = i2 % 128;
        onGreatestScrollPercentageIncreased = i3;
        int i4 = i2 % 2;
        float f = dispatchchildattached.IAuthTabCallbackDefault;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 69;
        onVerticalScrollEvent = i5 % 128;
        int i6 = i5 % 2;
        return Float.valueOf(f);
    }

    public final animateAppearance onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 99;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final dispatchLayout ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 67;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ICustomTabsCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final clearOnChildAttachStateChangeListeners onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 47;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final consumeFlingInHorizontalStretch extraCommand() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 111;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 != 0) {
            return this.writeTypedObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallbackDefault(boolean z) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased;
        int i3 = i2 + 25;
        onVerticalScrollEvent = i3 % 128;
        int i4 = i3 % 2;
        this.requestPostMessageChannelWithExtras = z;
        int i5 = i2 + 91;
        onVerticalScrollEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean prefetch() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 5;
        int i3 = i2 % 128;
        onVerticalScrollEvent = i3;
        int i4 = i2 % 2;
        boolean z = this.requestPostMessageChannelWithExtras;
        int i5 = i3 + 23;
        onGreatestScrollPercentageIncreased = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final float newSession() {
        float f;
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased;
        int i3 = i2 + 51;
        onVerticalScrollEvent = i3 % 128;
        if (i3 % 2 != 0) {
            f = this.onMessageChannelReady;
            int i4 = 89 / 0;
        } else {
            f = this.onMessageChannelReady;
        }
        int i5 = i2 + 33;
        onVerticalScrollEvent = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final boolean updateVisuals() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 33;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.access000;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased;
        int i3 = i2 + 77;
        onVerticalScrollEvent = i3 % 128;
        int i4 = i3 % 2;
        this.extraCallback = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 77;
        onVerticalScrollEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
    }

    public final boolean isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 29;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 != 0) {
            return this.extraCallback;
        }
        throw null;
    }

    public final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased;
        int i3 = i2 + 81;
        onVerticalScrollEvent = i3 % 128;
        int i4 = i3 % 2;
        this.ICustomTabsCallback = z;
        int i5 = i2 + 81;
        onVerticalScrollEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean newAuthTabSession() {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 7;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ICustomTabsCallback;
        }
        throw null;
    }

    public final boolean ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent;
        int i3 = i2 + 59;
        onGreatestScrollPercentageIncreased = i3 % 128;
        int i4 = i3 % 2;
        if (this.extraCallbackWithResult == null) {
            return false;
        }
        int i5 = i2 + 1;
        onGreatestScrollPercentageIncreased = i5 % 128;
        return i5 % 2 != 0;
    }

    public void onExtraCallback(@NonNull final addRecyclerListener.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        final boolean z = this.extraCallback;
        onSessionEnded().IAuthTabCallback("take picture", getItemDecorationCount.BIND, new Runnable() { // from class: o.dispatchChildAttached.1
            @Override // java.lang.Runnable
            public void run() {
                dispatchChildDetached.extraCommand.onExtraCallbackWithResult(new Object[]{"takePicture:", "running. isTakingPicture:", Boolean.valueOf(dispatchChildAttached.this.ICustomTabsServiceStub())});
                if (dispatchChildAttached.this.ICustomTabsServiceStub()) {
                    return;
                }
                if (dispatchChildAttached.onWarmupCompleted(dispatchChildAttached.this) == clearOnScrollListeners.VIDEO) {
                    throw new IllegalStateException("Can't take hq pictures while in VIDEO mode");
                }
                addRecyclerListener.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
                iAuthTabCallback2.onWarmupCompleted = false;
                dispatchChildAttached dispatchchildattached = dispatchChildAttached.this;
                iAuthTabCallback2.onExtraCallback = dispatchchildattached.IAuthTabCallbackStubProxy;
                iAuthTabCallback2.IAuthTabCallback = dispatchChildAttached.onExtraCallback(dispatchchildattached);
                addRecyclerListener.IAuthTabCallback iAuthTabCallback3 = iAuthTabCallback;
                dispatchChildAttached dispatchchildattached2 = dispatchChildAttached.this;
                iAuthTabCallback3.onExtraCallbackWithResult = dispatchchildattached2.writeTypedObject;
                dispatchchildattached2.onExtraCallbackWithResult(iAuthTabCallback3, z);
            }
        });
        int i2 = onVerticalScrollEvent + 53;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void IAuthTabCallback(@NonNull final addRecyclerListener.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        final boolean z = this.ICustomTabsCallback;
        onSessionEnded().IAuthTabCallback("take picture snapshot", getItemDecorationCount.BIND, new Runnable() { // from class: o.dispatchChildAttached.4
            @Override // java.lang.Runnable
            public void run() {
                dispatchChildDetached.extraCommand.onExtraCallbackWithResult(new Object[]{"takePictureSnapshot:", "running. isTakingPicture:", Boolean.valueOf(dispatchChildAttached.this.ICustomTabsServiceStub())});
                if (dispatchChildAttached.this.ICustomTabsServiceStub()) {
                    return;
                }
                addRecyclerListener.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
                dispatchChildAttached dispatchchildattached = dispatchChildAttached.this;
                iAuthTabCallback2.onExtraCallback = dispatchchildattached.IAuthTabCallbackStubProxy;
                iAuthTabCallback2.onWarmupCompleted = true;
                iAuthTabCallback2.IAuthTabCallback = dispatchChildAttached.onExtraCallback(dispatchchildattached);
                iAuthTabCallback.onExtraCallbackWithResult = consumeFlingInHorizontalStretch.JPEG;
                Object[] objArr = {dispatchChildAttached.this, Reference.OUTPUT};
                dispatchChildAttached.this.onExtraCallbackWithResult(iAuthTabCallback, removeItemDecoration.onNavigationEvent((removeOnChildAttachStateChangeListener) dispatchChildAttached.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), -104498688, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), objArr, 104498693, lt.40.onExtraCallbackWithResult())), z);
            }
        });
        int i2 = onGreatestScrollPercentageIncreased + 89;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 97;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsService_Parcel().onNavigationEvent(!z);
        int i4 = onVerticalScrollEvent + 11;
        onGreatestScrollPercentageIncreased = i4 % 128;
        int i5 = i4 % 2;
    }

    public void IAuthTabCallback(@Nullable addRecyclerListener.IAuthTabCallback iAuthTabCallback, @Nullable Exception exc) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 109;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        this.extraCallbackWithResult = null;
        if (iAuthTabCallback != null) {
            ICustomTabsService_Parcel().onNavigationEvent(iAuthTabCallback);
            return;
        }
        dispatchChildDetached.extraCommand.onNavigationEvent(new Object[]{"onPictureResult", "result is null: something went wrong.", exc});
        ICustomTabsService_Parcel().IAuthTabCallback(new stopScrollersInternal(exc, 4));
        int i4 = onGreatestScrollPercentageIncreased + 71;
        onVerticalScrollEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i = 2 % 2;
        removeOnScrollListener removeonscrolllistener = ((dispatchChildAttached) objArr[0]).onRelationshipValidationResult;
        if (removeonscrolllistener != null) {
            int i2 = onGreatestScrollPercentageIncreased + 79;
            onVerticalScrollEvent = i2 % 128;
            if (i2 % 2 != 0) {
                removeonscrolllistener.IAuthTabCallbackDefault();
                throw null;
            }
            if (removeonscrolllistener.IAuthTabCallbackDefault()) {
                return true;
            }
        }
        int i3 = onGreatestScrollPercentageIncreased + 9;
        onVerticalScrollEvent = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public void IAuthTabCallback(@Nullable addOnChildAttachStateChangeListener$onWarmupCompleted addonchildattachstatechangelistener_onwarmupcompleted, @Nullable Exception exc) {
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 21;
        onVerticalScrollEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.onRelationshipValidationResult = null;
            if (addonchildattachstatechangelistener_onwarmupcompleted != null) {
                ICustomTabsService_Parcel().onExtraCallbackWithResult(addonchildattachstatechangelistener_onwarmupcompleted);
                int i3 = onGreatestScrollPercentageIncreased + 7;
                onVerticalScrollEvent = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            dispatchChildDetached.extraCommand.onNavigationEvent(new Object[]{"onVideoResult", "result is null: something went wrong.", exc});
            ICustomTabsService_Parcel().IAuthTabCallback(new stopScrollersInternal(exc, 5));
            return;
        }
        this.onRelationshipValidationResult = null;
        obj.hashCode();
        throw null;
    }

    public void writeTypedList() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 121;
        onGreatestScrollPercentageIncreased = i2 % 128;
        if (i2 % 2 == 0) {
            ICustomTabsService_Parcel().onExtraCallbackWithResult();
            int i3 = 25 / 0;
        } else {
            ICustomTabsService_Parcel().onExtraCallbackWithResult();
        }
        int i4 = onVerticalScrollEvent + 115;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 29;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsService_Parcel().IAuthTabCallback();
        int i4 = onVerticalScrollEvent + 91;
        onGreatestScrollPercentageIncreased = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void access200() {
        int i = 2 % 2;
        dispatchChildDetached.extraCommand.onExtraCallbackWithResult(new Object[]{"onSurfaceChanged:", "Size is", IAuthTabCallback(Reference.VIEW)});
        onSessionEnded().IAuthTabCallback("surface changed", getItemDecorationCount.BIND, new Runnable() { // from class: o.dispatchChildAttached.3
            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr = {dispatchChildAttached.this};
                removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener = (removeOnChildAttachStateChangeListener) dispatchChildAttached.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 742035432, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), objArr, -742035420, lt.40.onExtraCallbackWithResult());
                if (removeonchildattachstatechangelistener.equals(dispatchChildAttached.this.onActivityLayout)) {
                    dispatchChildDetached.extraCommand.onExtraCallbackWithResult(new Object[]{"onSurfaceChanged:", "The computed preview size is identical. No op."});
                    return;
                }
                dispatchChildDetached.extraCommand.onExtraCallbackWithResult(new Object[]{"onSurfaceChanged:", "Computed a new preview size. Calling onPreviewStreamSizeChanged()."});
                dispatchChildAttached dispatchchildattached = dispatchChildAttached.this;
                dispatchchildattached.onActivityLayout = removeonchildattachstatechangelistener;
                dispatchchildattached.IAuthTabCallback();
            }
        });
        int i2 = onGreatestScrollPercentageIncreased + 27;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    public final removeOnChildAttachStateChangeListener onExtraCallback(@NonNull Reference reference) {
        int i = 2 % 2;
        removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener = this.onNavigationEvent;
        if (removeonchildattachstatechangelistener != null) {
            int i2 = onVerticalScrollEvent + 19;
            onGreatestScrollPercentageIncreased = i2 % 128;
            int i3 = i2 % 2;
            if (this.setEngagementSignalsCallback != clearOnScrollListeners.VIDEO) {
                int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
                if (!((getChildPosition) onWarmupCompleted(iOnExtraCallbackWithResult, 532520487, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, -532520477, iOnExtraCallbackWithResult3)).IAuthTabCallback(Reference.SENSOR, reference)) {
                    int i4 = onGreatestScrollPercentageIncreased + 59;
                    onVerticalScrollEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return removeonchildattachstatechangelistener;
                }
                int i6 = onGreatestScrollPercentageIncreased + 65;
                onVerticalScrollEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    return removeonchildattachstatechangelistener.onNavigationEvent();
                }
                removeonchildattachstatechangelistener.onNavigationEvent();
                throw null;
            }
        }
        return null;
    }

    public final removeOnChildAttachStateChangeListener onWarmupCompleted(@NonNull Reference reference) {
        int i = 2 % 2;
        removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener = this.onActivityLayout;
        if (removeonchildattachstatechangelistener == null) {
            int i2 = onVerticalScrollEvent + 9;
            onGreatestScrollPercentageIncreased = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 73 / 0;
            }
            return null;
        }
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        if (!((getChildPosition) onWarmupCompleted(iOnExtraCallbackWithResult, 532520487, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, -532520477, iOnExtraCallbackWithResult3)).IAuthTabCallback(Reference.SENSOR, reference)) {
            return removeonchildattachstatechangelistener;
        }
        int i4 = onVerticalScrollEvent + 109;
        onGreatestScrollPercentageIncreased = i4 % 128;
        if (i4 % 2 != 0) {
            return removeonchildattachstatechangelistener.onNavigationEvent();
        }
        int i5 = 31 / 0;
        return removeonchildattachstatechangelistener.onNavigationEvent();
    }

    private removeOnChildAttachStateChangeListener IAuthTabCallback(@NonNull Reference reference) {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 49;
        int i3 = i2 % 128;
        onGreatestScrollPercentageIncreased = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            removeAnimatingView removeanimatingview = this.onPostMessage;
            if (removeanimatingview == null) {
                int i4 = i3 + 79;
                onVerticalScrollEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
            if (((getChildPosition) onWarmupCompleted(iOnExtraCallbackWithResult, 532520487, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, -532520477, iOnExtraCallbackWithResult3)).IAuthTabCallback(Reference.VIEW, reference)) {
                return removeanimatingview.an_().onNavigationEvent();
            }
            removeOnChildAttachStateChangeListener removeonchildattachstatechangelistenerAn_ = removeanimatingview.an_();
            int i5 = onVerticalScrollEvent + 21;
            onGreatestScrollPercentageIncreased = i5 % 128;
            int i6 = i5 % 2;
            return removeonchildattachstatechangelistenerAn_;
        }
        obj.hashCode();
        throw null;
    }

    public final removeOnChildAttachStateChangeListener onExtraCallbackWithResult(@NonNull Reference reference) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = onVerticalScrollEvent + 51;
        onGreatestScrollPercentageIncreased = i4 % 128;
        int i5 = i4 % 2;
        removeOnChildAttachStateChangeListener removeonchildattachstatechangelistenerOnWarmupCompleted = onWarmupCompleted(reference);
        Object obj = null;
        if (removeonchildattachstatechangelistenerOnWarmupCompleted != null) {
            boolean zIAuthTabCallback = ((getChildPosition) onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 532520487, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{this}, -532520477, lt.40.onExtraCallbackWithResult())).IAuthTabCallback(reference, Reference.VIEW);
            if (!(!zIAuthTabCallback)) {
                int i6 = onVerticalScrollEvent + 25;
                onGreatestScrollPercentageIncreased = i6 % 128;
                if (i6 % 2 == 0) {
                    i = this.validateRelationship;
                    int i7 = 9 / 0;
                } else {
                    i = this.validateRelationship;
                }
            } else {
                i = this.ICustomTabsServiceDefault;
            }
            if (zIAuthTabCallback) {
                int i8 = onVerticalScrollEvent + 47;
                onGreatestScrollPercentageIncreased = i8 % 128;
                if (i8 % 2 == 0) {
                    i2 = this.ICustomTabsServiceDefault;
                    int i9 = 1 / 0;
                } else {
                    i2 = this.ICustomTabsServiceDefault;
                }
            } else {
                i2 = this.validateRelationship;
            }
            if (i <= 0) {
                int i10 = onGreatestScrollPercentageIncreased + 59;
                onVerticalScrollEvent = i10 % 128;
                if (i10 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                i = Integer.MAX_VALUE;
            }
            if (i2 <= 0) {
                int i11 = onGreatestScrollPercentageIncreased + 39;
                onVerticalScrollEvent = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
                i2 = Integer.MAX_VALUE;
            }
            if (removeItemDecoration.onExtraCallback(i, i2).onWarmupCompleted() >= removeItemDecoration.onNavigationEvent(removeonchildattachstatechangelistenerOnWarmupCompleted).onWarmupCompleted()) {
                return new removeOnChildAttachStateChangeListener((int) Math.floor(r11 * r0), Math.min(removeonchildattachstatechangelistenerOnWarmupCompleted.onExtraCallbackWithResult(), i2));
            }
            return new removeOnChildAttachStateChangeListener(Math.min(removeonchildattachstatechangelistenerOnWarmupCompleted.onExtraCallback(), i), (int) Math.floor(r11 / r0));
        }
        int i12 = onVerticalScrollEvent + 99;
        onGreatestScrollPercentageIncreased = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }

    protected final removeOnChildAttachStateChangeListener IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onVerticalScrollEvent + 99;
        onGreatestScrollPercentageIncreased = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this, this.setEngagementSignalsCallback};
        removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener = (removeOnChildAttachStateChangeListener) onWarmupCompleted(lt.40.onExtraCallbackWithResult(), -1157751068, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), objArr, 1157751070, lt.40.onExtraCallbackWithResult());
        int i4 = onVerticalScrollEvent + 99;
        onGreatestScrollPercentageIncreased = i4 % 128;
        int i5 = i4 % 2;
        return removeonchildattachstatechangelistener;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        removeOnItemTouchListener removeonitemtouchlistener;
        Collection collectionAsInterface;
        dispatchChildAttached dispatchchildattached = (dispatchChildAttached) objArr[0];
        clearOnScrollListeners clearonscrolllisteners = (clearOnScrollListeners) objArr[1];
        int i = 2 % 2;
        int i2 = onGreatestScrollPercentageIncreased + 35;
        onVerticalScrollEvent = i2 % 128;
        if (i2 % 2 == 0) {
            boolean zIAuthTabCallback = ((getChildPosition) onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 532520487, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{dispatchchildattached}, -532520477, lt.40.onExtraCallbackWithResult())).IAuthTabCallback(Reference.SENSOR, Reference.VIEW);
            if (clearonscrolllisteners == clearOnScrollListeners.PICTURE) {
                removeonitemtouchlistener = dispatchchildattached.requestPostMessageChannel;
                collectionAsInterface = dispatchchildattached.IAuthTabCallback.onTransact();
            } else {
                removeonitemtouchlistener = dispatchchildattached.writeTypedList;
                collectionAsInterface = dispatchchildattached.IAuthTabCallback.asInterface();
            }
            removeOnItemTouchListener removeonitemtouchlistenerOnExtraCallback = removeRecyclerListener.onExtraCallback(new removeOnItemTouchListener[]{removeonitemtouchlistener, removeRecyclerListener.IAuthTabCallback()});
            List<removeOnChildAttachStateChangeListener> arrayList = new ArrayList<>((Collection<? extends removeOnChildAttachStateChangeListener>) collectionAsInterface);
            removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener = removeonitemtouchlistenerOnExtraCallback.onExtraCallbackWithResult(arrayList).get(0);
            if (arrayList.contains(removeonchildattachstatechangelistener)) {
                int i3 = onGreatestScrollPercentageIncreased + 81;
                onVerticalScrollEvent = i3 % 128;
                int i4 = i3 % 2;
                dispatchChildDetached.extraCommand.onExtraCallbackWithResult(new Object[]{"computeCaptureSize:", "result:", removeonchildattachstatechangelistener, "flip:", Boolean.valueOf(zIAuthTabCallback), "mode:", clearonscrolllisteners});
                return zIAuthTabCallback ? removeonchildattachstatechangelistener.onNavigationEvent() : removeonchildattachstatechangelistener;
            }
            throw new RuntimeException("SizeSelectors must not return Sizes other than those in the input list.");
        }
        ((getChildPosition) onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 532520487, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{dispatchchildattached}, -532520477, lt.40.onExtraCallbackWithResult())).IAuthTabCallback(Reference.SENSOR, Reference.VIEW);
        clearOnScrollListeners clearonscrolllisteners2 = clearOnScrollListeners.PICTURE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        dispatchChildAttached dispatchchildattached = (dispatchChildAttached) objArr[0];
        int i = 2 % 2;
        List<removeOnChildAttachStateChangeListener> listOnExtraCallbackWithResult = dispatchchildattached.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        boolean zIAuthTabCallback = ((getChildPosition) onWarmupCompleted(iOnExtraCallbackWithResult, 532520487, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{dispatchchildattached}, -532520477, iOnExtraCallbackWithResult3)).IAuthTabCallback(Reference.SENSOR, Reference.VIEW);
        List<removeOnChildAttachStateChangeListener> arrayList = new ArrayList<>(listOnExtraCallbackWithResult.size());
        Iterator<removeOnChildAttachStateChangeListener> it = listOnExtraCallbackWithResult.iterator();
        while (it.hasNext()) {
            int i2 = onVerticalScrollEvent + 3;
            onGreatestScrollPercentageIncreased = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                it.next();
                obj.hashCode();
                throw null;
            }
            removeOnChildAttachStateChangeListener next = it.next();
            if (zIAuthTabCallback) {
                int i3 = onVerticalScrollEvent + 117;
                onGreatestScrollPercentageIncreased = i3 % 128;
                if (i3 % 2 == 0) {
                    next.onNavigationEvent();
                    obj.hashCode();
                    throw null;
                }
                next = next.onNavigationEvent();
            }
            arrayList.add(next);
        }
        removeOnChildAttachStateChangeListener removeonchildattachstatechangelistenerIAuthTabCallback = dispatchchildattached.IAuthTabCallback(Reference.VIEW);
        if (removeonchildattachstatechangelistenerIAuthTabCallback == null) {
            throw new IllegalStateException("targetMinSize should not be null here.");
        }
        removeItemDecoration removeitemdecorationOnExtraCallback = removeItemDecoration.onExtraCallback(dispatchchildattached.onNavigationEvent.onExtraCallback(), dispatchchildattached.onNavigationEvent.onExtraCallbackWithResult());
        if (zIAuthTabCallback) {
            int i4 = onVerticalScrollEvent + 35;
            onGreatestScrollPercentageIncreased = i4 % 128;
            int i5 = i4 % 2;
            removeitemdecorationOnExtraCallback = removeitemdecorationOnExtraCallback.IAuthTabCallback();
        }
        addFocusables addfocusables = dispatchChildDetached.extraCommand;
        addfocusables.onExtraCallbackWithResult(new Object[]{"computePreviewStreamSize:", "targetRatio:", removeitemdecorationOnExtraCallback, "targetMinSize:", removeonchildattachstatechangelistenerIAuthTabCallback});
        removeOnItemTouchListener removeonitemtouchlistenerIAuthTabCallback = removeRecyclerListener.IAuthTabCallback(new removeOnItemTouchListener[]{removeRecyclerListener.onWarmupCompleted(removeitemdecorationOnExtraCallback, 0.0f), removeRecyclerListener.IAuthTabCallback()});
        removeOnItemTouchListener removeonitemtouchlistenerIAuthTabCallback2 = removeRecyclerListener.IAuthTabCallback(new removeOnItemTouchListener[]{removeRecyclerListener.onExtraCallback(removeonchildattachstatechangelistenerIAuthTabCallback.onExtraCallbackWithResult()), removeRecyclerListener.onTransact(removeonchildattachstatechangelistenerIAuthTabCallback.onExtraCallback()), removeRecyclerListener.onExtraCallbackWithResult()});
        removeOnItemTouchListener removeonitemtouchlistenerOnExtraCallback = removeRecyclerListener.onExtraCallback(new removeOnItemTouchListener[]{removeRecyclerListener.IAuthTabCallback(new removeOnItemTouchListener[]{removeonitemtouchlistenerIAuthTabCallback, removeonitemtouchlistenerIAuthTabCallback2}), removeonitemtouchlistenerIAuthTabCallback2, removeonitemtouchlistenerIAuthTabCallback, removeRecyclerListener.IAuthTabCallback()});
        removeOnItemTouchListener removeonitemtouchlistener = dispatchchildattached.updateVisuals;
        if (removeonitemtouchlistener != null) {
            removeonitemtouchlistenerOnExtraCallback = removeRecyclerListener.onExtraCallback(new removeOnItemTouchListener[]{removeonitemtouchlistener, removeonitemtouchlistenerOnExtraCallback});
        }
        removeOnChildAttachStateChangeListener removeonchildattachstatechangelistenerOnNavigationEvent = removeonitemtouchlistenerOnExtraCallback.onExtraCallbackWithResult(arrayList).get(0);
        if (!arrayList.contains(removeonchildattachstatechangelistenerOnNavigationEvent)) {
            throw new RuntimeException("SizeSelectors must not return Sizes other than those in the input list.");
        }
        if (zIAuthTabCallback) {
            removeonchildattachstatechangelistenerOnNavigationEvent = removeonchildattachstatechangelistenerOnNavigationEvent.onNavigationEvent();
        }
        addfocusables.onExtraCallbackWithResult(new Object[]{"computePreviewStreamSize:", "result:", removeonchildattachstatechangelistenerOnNavigationEvent, "flip:", Boolean.valueOf(zIAuthTabCallback)});
        return removeonchildattachstatechangelistenerOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final removeOnChildAttachStateChangeListener access000() {
        int i = 2 % 2;
        List<removeOnChildAttachStateChangeListener> listOnWarmupCompleted = onWarmupCompleted();
        boolean zIAuthTabCallback = ((getChildPosition) onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 532520487, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{this}, -532520477, lt.40.onExtraCallbackWithResult())).IAuthTabCallback(Reference.SENSOR, Reference.VIEW);
        List<removeOnChildAttachStateChangeListener> arrayList = new ArrayList<>(listOnWarmupCompleted.size());
        int i2 = onGreatestScrollPercentageIncreased + 57;
        onVerticalScrollEvent = i2 % 128;
        int i3 = i2 % 2;
        for (removeOnChildAttachStateChangeListener removeonchildattachstatechangelistenerOnNavigationEvent : listOnWarmupCompleted) {
            if (zIAuthTabCallback) {
                removeonchildattachstatechangelistenerOnNavigationEvent = removeonchildattachstatechangelistenerOnNavigationEvent.onNavigationEvent();
            }
            arrayList.add(removeonchildattachstatechangelistenerOnNavigationEvent);
        }
        removeItemDecoration removeitemdecorationOnExtraCallback = removeItemDecoration.onExtraCallback(this.onActivityLayout.onExtraCallback(), this.onActivityLayout.onExtraCallbackWithResult());
        if (zIAuthTabCallback) {
            removeitemdecorationOnExtraCallback = removeitemdecorationOnExtraCallback.IAuthTabCallback();
            int i4 = onVerticalScrollEvent + 59;
            onGreatestScrollPercentageIncreased = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = this.newSessionWithExtras;
        int i7 = this.prefetch;
        if (i6 <= 0 || i6 == Integer.MAX_VALUE) {
            i6 = 640;
        }
        if (i7 > 0) {
            int i8 = onVerticalScrollEvent + 51;
            onGreatestScrollPercentageIncreased = i8 % 128;
            int i9 = i8 % 2;
            if (i7 == Integer.MAX_VALUE) {
                i7 = 640;
            }
        }
        removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener = new removeOnChildAttachStateChangeListener(i6, i7);
        addFocusables addfocusables = dispatchChildDetached.extraCommand;
        addfocusables.onExtraCallbackWithResult(new Object[]{"computeFrameProcessingSize:", "targetRatio:", removeitemdecorationOnExtraCallback, "targetMaxSize:", removeonchildattachstatechangelistener});
        removeOnItemTouchListener removeonitemtouchlistenerOnWarmupCompleted = removeRecyclerListener.onWarmupCompleted(removeitemdecorationOnExtraCallback, 0.0f);
        removeOnItemTouchListener removeonitemtouchlistenerIAuthTabCallback = removeRecyclerListener.IAuthTabCallback(new removeOnItemTouchListener[]{removeRecyclerListener.onNavigationEvent(removeonchildattachstatechangelistener.onExtraCallbackWithResult()), removeRecyclerListener.onWarmupCompleted(removeonchildattachstatechangelistener.onExtraCallback()), removeRecyclerListener.IAuthTabCallback()});
        removeOnChildAttachStateChangeListener removeonchildattachstatechangelistenerOnNavigationEvent2 = removeRecyclerListener.onExtraCallback(new removeOnItemTouchListener[]{removeRecyclerListener.IAuthTabCallback(new removeOnItemTouchListener[]{removeonitemtouchlistenerOnWarmupCompleted, removeonitemtouchlistenerIAuthTabCallback}), removeonitemtouchlistenerIAuthTabCallback, removeRecyclerListener.onExtraCallbackWithResult()}).onExtraCallbackWithResult(arrayList).get(0);
        if (!arrayList.contains(removeonchildattachstatechangelistenerOnNavigationEvent2)) {
            throw new RuntimeException("SizeSelectors must not return Sizes other than those in the input list.");
        }
        if (zIAuthTabCallback) {
            removeonchildattachstatechangelistenerOnNavigationEvent2 = removeonchildattachstatechangelistenerOnNavigationEvent2.onNavigationEvent();
        }
        addfocusables.onExtraCallbackWithResult(new Object[]{"computeFrameProcessingSize:", "result:", removeonchildattachstatechangelistenerOnNavigationEvent2, "flip:", Boolean.valueOf(zIAuthTabCallback)});
        return removeonchildattachstatechangelistenerOnNavigationEvent2;
    }

    static /* synthetic */ removeOnChildAttachStateChangeListener onExtraCallback(dispatchChildAttached dispatchchildattached, Reference reference) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        return (removeOnChildAttachStateChangeListener) onWarmupCompleted(iOnExtraCallbackWithResult, -104498688, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{dispatchchildattached, reference}, 104498693, iOnExtraCallbackWithResult3);
    }

    protected final removeOnChildAttachStateChangeListener onWarmupCompleted(@NonNull clearOnScrollListeners clearonscrolllisteners) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        return (removeOnChildAttachStateChangeListener) onWarmupCompleted(iOnExtraCallbackWithResult, -1157751068, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this, clearonscrolllisteners}, 1157751070, iOnExtraCallbackWithResult3);
    }

    protected final removeOnChildAttachStateChangeListener readTypedObject() {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        return (removeOnChildAttachStateChangeListener) onWarmupCompleted(iOnExtraCallbackWithResult, 742035432, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, -742035420, iOnExtraCallbackWithResult3);
    }

    public final getChildPosition ICustomTabsCallback() {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        return (getChildPosition) onWarmupCompleted(iOnExtraCallbackWithResult, 532520487, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, -532520477, iOnExtraCallbackWithResult3);
    }

    public final float onPostMessage() {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        return ((Float) onWarmupCompleted(iOnExtraCallbackWithResult, -648988345, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, 648988351, iOnExtraCallbackWithResult3)).floatValue();
    }

    public final int ICustomTabsCallbackStub() {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        return ((Integer) onWarmupCompleted(iOnExtraCallbackWithResult, -879347596, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, 879347599, iOnExtraCallbackWithResult3)).intValue();
    }

    public final onChildAttachedToWindow ICustomTabsService() {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        return (onChildAttachedToWindow) onWarmupCompleted(iOnExtraCallbackWithResult, -629237862, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, 629237875, iOnExtraCallbackWithResult3);
    }

    public final long requestPostMessageChannel() {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        return ((Long) onWarmupCompleted(iOnExtraCallbackWithResult, -1700232476, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, 1700232477, iOnExtraCallbackWithResult3)).longValue();
    }

    public final boolean IEngagementSignalsCallback() {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        return ((Boolean) onWarmupCompleted(iOnExtraCallbackWithResult, 1142372969, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, -1142372960, iOnExtraCallbackWithResult3)).booleanValue();
    }

    public final void IAuthTabCallback(@Nullable onChildAttachedToWindow onchildattachedtowindow) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        onWarmupCompleted(iOnExtraCallbackWithResult, -494886173, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this, onchildattachedtowindow}, 494886177, iOnExtraCallbackWithResult3);
    }

    public final void onExtraCallbackWithResult(@NonNull removeOnItemTouchListener removeonitemtouchlistener) {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        onWarmupCompleted(iOnExtraCallbackWithResult, -1880207014, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this, removeonitemtouchlistener}, 1880207021, iOnExtraCallbackWithResult3);
    }

    public final void IAuthTabCallbackStub(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 1509176866, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), objArr, -1509176855, lt.40.onExtraCallbackWithResult());
    }

    public final void onWarmupCompleted(long j) {
        Object[] objArr = {this, Long.valueOf(j)};
        onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 2045264600, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), objArr, -2045264600, lt.40.onExtraCallbackWithResult());
    }

    protected final boolean ICustomTabsServiceStubProxy() {
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        return ((Boolean) onWarmupCompleted(iOnExtraCallbackWithResult, 1249804881, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, -1249804873, iOnExtraCallbackWithResult3)).booleanValue();
    }
}
