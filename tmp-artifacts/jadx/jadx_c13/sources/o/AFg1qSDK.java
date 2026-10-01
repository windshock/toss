package o;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tosssecurities.uikit.dnd.RegionDropPosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.AFg1qSDK;
import o.getPreRenderJob;
import o.setUseCaseAttached;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFg1qSDK {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int newSession = 0;
    private static int postMessage = 1;
    private static int prefetchWithMultipleUrls = 0;
    private static int receiveFile = 1;
    private Function2<Object, Object, Boolean> IAuthTabCallback;
    private final Map<Object, Rect> IAuthTabCallbackDefault;
    private final Map<Object, Rect> IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private final Map<Object, Rect> IAuthTabCallback_Parcel;
    private Object ICustomTabsCallback;
    private final getSupportedHighSpeedResolutionsFor ICustomTabsCallbackDefault;
    private final getSupportedHighSpeedResolutionsFor ICustomTabsCallbackStub;
    private Function1<Object, Unit> ICustomTabsCallbackStubProxy;
    private getBacktraceNote<Object, ? super RegionDropPosition, Object, Unit> ICustomTabsCallback_Parcel;
    private Function2<Object, Object, Unit> ICustomTabsService;
    private final getSupportedHighSpeedResolutionsFor access000;
    private Function1<Object, Integer> access100;
    private final getSupportedHighSpeedResolutionsFor asBinder = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    private final Map<Object, Rect> asInterface;
    private RegionDropPosition extraCallback;
    private Object extraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor extraCommand;
    private Object getInterfaceDescriptor;
    private getBacktraceNote<? super Integer, ? super Integer, Object, Unit> isEngagementSignalsApiAvailable;
    private final Map<Object, Rect> mayLaunchUrl;
    private float newAuthTabSession;
    private float newSessionWithExtras;
    private boolean onActivityLayout;
    private setUseCaseAttached onActivityResized;
    private final getSupportedHighSpeedResolutionsFor onExtraCallback;
    private final Map<Object, Rect> onExtraCallbackWithResult;
    private Object onMessageChannelReady;
    private final getTimebase onMinimized;
    private Function2<Object, Object, Boolean> onNavigationEvent;
    private Object onPostMessage;
    private Function2<Object, Object, Unit> onRelationshipValidationResult;
    private boolean onTransact;
    private final float onUnminimized;
    private final Map<Object, Rect> onWarmupCompleted;
    private final Map<Object, Rect> prefetch;
    private boolean readTypedObject;
    private Object writeTypedObject;

    static {
        int i = receiveFile + 11;
        prefetchWithMultipleUrls = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = postMessage + 73;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, i2, obj);
        int i6 = postMessage + 29;
        newSession = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        int i = 2 % 2;
        int i2 = newSession + 81;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallback(new Object[]{obj, obj2}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 2045132110, -2045132100);
        int i4 = newSession + 115;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final boolean IAuthTabCallbackStub(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = newSession + 105;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        int i4 = newSession + 67;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return true;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~((~i5) | i6);
        int i11 = i9 | i10 | (~(i6 | i3));
        int i12 = (~(i3 | i5)) | (~(i7 | i5));
        int i13 = i8 | i10;
        int i14 = i5 + i6 + i4 + (793188503 * i) + (2090109681 * i2);
        int i15 = i14 * i14;
        int i16 = (837707615 * i5) + 1286602752 + ((-1676358574) * i6) + (i11 * (-838022063)) + (1676044126 * i12) + ((-838022063) * i13) + ((-838336512) * i4) + (1186463744 * i) + (1166540800 * i2) + ((-1956446208) * i15);
        int i17 = ((i5 * 1389925299) - 652765764) + (i6 * 1389927018) + (i11 * 573) + (i12 * (-1146)) + (i13 * 573) + (i4 * 1389926445) + (i * (-1551828341)) + (i2 * (-2047638435)) + (i15 * 1214709760);
        switch (i16 + (i17 * i17 * 445972480)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                Object obj = objArr[0];
                Object obj2 = objArr[1];
                int i18 = 2 % 2;
                int i19 = newSession + 83;
                postMessage = i19 % 128;
                int i20 = i19 % 2;
                Intrinsics.checkNotNullParameter(obj, "");
                Intrinsics.checkNotNullParameter(obj2, "");
                return Boolean.valueOf(i20 != 0);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
                Object obj3 = objArr[1];
                int i21 = 2 % 2;
                int i22 = newSession + 45;
                postMessage = i22 % 128;
                int i23 = i22 % 2;
                Intrinsics.checkNotNullParameter(obj3, "");
                boolean zAreEqual = Intrinsics.areEqual(aFg1qSDK.IAuthTabCallback(), obj3);
                int i24 = newSession + 11;
                postMessage = i24 % 128;
                int i25 = i24 % 2;
                return Boolean.valueOf(zAreEqual);
            case 6:
                return onNavigationEvent(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return asBinder(objArr);
            case 11:
                return onTransact(objArr);
            case 12:
                return access100(objArr);
            case 13:
                return getInterfaceDescriptor(objArr);
            case 14:
                return IAuthTabCallbackStubProxy(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(Object obj, RegionDropPosition regionDropPosition, Object obj2) {
        int i = 2 % 2;
        int i2 = postMessage + Imgproc.COLOR_YUV2RGBA_YVYU;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(obj, regionDropPosition, obj2);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(obj, regionDropPosition, obj2);
        int i3 = newSession + 15;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private final int onExtraCallbackWithResult(int i, int i2, boolean z) {
        int i3 = 2 % 2;
        if (!z) {
            i2++;
        }
        if (i2 > i) {
            int i4 = postMessage;
            int i5 = i4 + 15;
            newSession = i5 % 128;
            int i6 = i5 % 2;
            i2--;
            int i7 = i4 + 9;
            newSession = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = postMessage + 21;
        newSession = i9 % 128;
        if (i9 % 2 == 0) {
            return i2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = newSession + 51;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackStub = IAuthTabCallbackStub(obj, obj2);
        int i4 = postMessage + 39;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallbackStub;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(AFg1qSDK aFg1qSDK, Collection collection, long j, Map.Entry entry) {
        int i = 2 % 2;
        int i2 = newSession + 27;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(aFg1qSDK, collection, j, entry);
        int i4 = postMessage + 63;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            return zIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Integer onNavigationEvent(Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 21;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            return readTypedObject(obj);
        }
        readTypedObject(obj);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = postMessage + 87;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallback(new Object[]{obj, obj2}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1603536678, 1603536691);
        int i4 = newSession + 49;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 13;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsCallback(obj);
        }
        ICustomTabsCallback(obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onWarmupCompleted(Object obj, Object obj2) {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = newSession + 115;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            zBooleanValue = ((Boolean) onExtraCallback(new Object[]{obj, obj2}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 2130030102, -2130030099)).booleanValue();
            int i3 = 36 / 0;
        } else {
            zBooleanValue = ((Boolean) onExtraCallback(new Object[]{obj, obj2}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 2130030102, -2130030099)).booleanValue();
        }
        int i4 = postMessage + 45;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final Integer readTypedObject(Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 9;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        int i5 = postMessage + 97;
        newSession = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public AFg1qSDK(float f) {
        this.onUnminimized = f;
        setUseCaseAttached.onWarmupCompleted onwarmupcompleted = setUseCaseAttached.Companion;
        this.onExtraCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setUseCaseAttached.onNavigationEvent(onwarmupcompleted.IAuthTabCallback()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.access000 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setUseCaseDetached.onNavigationEvent(setUseCaseDetached.Companion.onExtraCallback()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.extraCommand = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setUseCaseAttached.onNavigationEvent(onwarmupcompleted.IAuthTabCallback()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onMinimized = notifyPublicListeners.onWarmupCompleted(0);
        this.ICustomTabsCallbackStub = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.ICustomTabsCallbackDefault = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.access100 = new Function1() { // from class: im.toss.tosssecurities.uikit.dnd.LazyListDragAndDropState$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 103;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Integer numOnNavigationEvent = AFg1qSDK.onNavigationEvent(obj);
                int i4 = onExtraCallback + 69;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return numOnNavigationEvent;
            }
        };
        this.isEngagementSignalsApiAvailable = new getBacktraceNote() { // from class: im.toss.tosssecurities.uikit.dnd.LazyListDragAndDropState$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // o.getBacktraceNote
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 5;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallback = AFg1qSDK.IAuthTabCallback(((Integer) obj).intValue(), ((Integer) obj2).intValue(), obj3);
                int i4 = IAuthTabCallback + 93;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                throw null;
            }
        };
        this.onRelationshipValidationResult = new Function2() { // from class: im.toss.tosssecurities.uikit.dnd.LazyListDragAndDropState$$ExternalSyntheticLambda2
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 3;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unit = (Unit) AFg1qSDK.onExtraCallback(new Object[]{obj, obj2}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1800720854, 1800720863);
                int i4 = onNavigationEvent + 69;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 12 / 0;
                }
                return unit;
            }
        };
        this.ICustomTabsCallbackStubProxy = new Function1() { // from class: im.toss.tosssecurities.uikit.dnd.LazyListDragAndDropState$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 119;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = AFg1qSDK.onWarmupCompleted(obj);
                int i4 = IAuthTabCallback + 11;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitOnWarmupCompleted;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        };
        this.IAuthTabCallback = new Function2() { // from class: im.toss.tosssecurities.uikit.dnd.LazyListDragAndDropState$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 17;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Boolean boolValueOf = Boolean.valueOf(AFg1qSDK.onExtraCallbackWithResult(obj, obj2));
                int i4 = onExtraCallbackWithResult + 85;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 63 / 0;
                }
                return boolValueOf;
            }
        };
        this.onNavigationEvent = new Function2() { // from class: im.toss.tosssecurities.uikit.dnd.LazyListDragAndDropState$$ExternalSyntheticLambda5
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 19;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                boolean zOnWarmupCompleted = AFg1qSDK.onWarmupCompleted(obj, obj2);
                if (i3 == 0) {
                    return Boolean.valueOf(zOnWarmupCompleted);
                }
                Boolean.valueOf(zOnWarmupCompleted);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        };
        this.ICustomTabsCallback_Parcel = new getBacktraceNote() { // from class: im.toss.tosssecurities.uikit.dnd.LazyListDragAndDropState$$ExternalSyntheticLambda6
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // o.getBacktraceNote
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 27;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallback = AFg1qSDK.onExtraCallback(obj, (RegionDropPosition) obj2, obj3);
                int i4 = onNavigationEvent + 23;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallback;
            }
        };
        this.ICustomTabsService = new Function2() { // from class: im.toss.tosssecurities.uikit.dnd.LazyListDragAndDropState$$ExternalSyntheticLambda7
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 67;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return AFg1qSDK.onNavigationEvent(obj, obj2);
                }
                AFg1qSDK.onNavigationEvent(obj, obj2);
                throw null;
            }
        };
        this.IAuthTabCallback_Parcel = new LinkedHashMap();
        this.mayLaunchUrl = new LinkedHashMap();
        this.IAuthTabCallbackStub = new LinkedHashMap();
        this.onWarmupCompleted = new LinkedHashMap();
        this.IAuthTabCallbackDefault = new LinkedHashMap();
        this.prefetch = new LinkedHashMap();
        this.asInterface = new LinkedHashMap();
        this.onExtraCallbackWithResult = new LinkedHashMap();
    }

    public final boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = newSession + 39;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        if (IAuthTabCallback() == null) {
            return false;
        }
        int i4 = postMessage + 113;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public final boolean onTransact(@NotNull Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 1;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zAreEqual = Intrinsics.areEqual(onExtraCallback(new Object[]{this}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -632598268, 632598268), obj);
        int i4 = postMessage + 7;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return zAreEqual;
    }

    public final void IAuthTabCallback(@NotNull Function1<Object, Integer> function1) {
        int i = 2 % 2;
        int i2 = newSession + 23;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        this.access100 = function1;
        int i4 = newSession + 53;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallbackWithResult(int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = postMessage + 69;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Unit unit = Unit.INSTANCE;
        int i6 = newSession + 81;
        postMessage = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 59 / 0;
        }
        return unit;
    }

    public final void onExtraCallback(@NotNull getBacktraceNote<? super Integer, ? super Integer, Object, Unit> getbacktracenote) {
        int i = 2 % 2;
        int i2 = postMessage + 101;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        this.isEngagementSignalsApiAvailable = getbacktracenote;
        int i4 = newSession + 15;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        int i = 2 % 2;
        int i2 = postMessage + 69;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Unit unit = Unit.INSTANCE;
        int i4 = postMessage + 25;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void onNavigationEvent(@NotNull Function2<Object, Object, Unit> function2) {
        int i = 2 % 2;
        int i2 = newSession + 9;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function2, "");
            this.onRelationshipValidationResult = function2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function2, "");
        this.onRelationshipValidationResult = function2;
        int i3 = newSession + 43;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final Unit ICustomTabsCallback(Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 101;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Unit unit = Unit.INSTANCE;
        int i4 = postMessage + 41;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(@NotNull Function1<Object, Unit> function1) {
        int i = 2 % 2;
        int i2 = postMessage + 35;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        this.ICustomTabsCallbackStubProxy = function1;
        int i4 = newSession + 115;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void onWarmupCompleted(@NotNull Function2<Object, Object, Boolean> function2) {
        int i = 2 % 2;
        int i2 = newSession + 87;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function2, "");
            this.IAuthTabCallback = function2;
            throw null;
        }
        Intrinsics.checkNotNullParameter(function2, "");
        this.IAuthTabCallback = function2;
        int i3 = postMessage + 1;
        newSession = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void onExtraCallback(@NotNull Function2<Object, Object, Boolean> function2) {
        int i = 2 % 2;
        int i2 = postMessage + 21;
        newSession = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function2, "");
            this.onNavigationEvent = function2;
        } else {
            Intrinsics.checkNotNullParameter(function2, "");
            this.onNavigationEvent = function2;
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(Object obj, RegionDropPosition regionDropPosition, Object obj2) {
        int i = 2 % 2;
        int i2 = newSession + 47;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(regionDropPosition, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Unit unit = Unit.INSTANCE;
        int i4 = postMessage + 35;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void onNavigationEvent(@NotNull getBacktraceNote<Object, ? super RegionDropPosition, Object, Unit> getbacktracenote) {
        int i = 2 % 2;
        int i2 = postMessage + 37;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getbacktracenote, "");
            this.ICustomTabsCallback_Parcel = getbacktracenote;
            throw null;
        }
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        this.ICustomTabsCallback_Parcel = getbacktracenote;
        int i3 = postMessage + 77;
        newSession = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        int i = 2 % 2;
        int i2 = postMessage + 43;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj2, "");
        Unit unit = Unit.INSTANCE;
        int i4 = postMessage + 9;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return unit;
    }

    public final void IAuthTabCallback(@NotNull Function2<Object, Object, Unit> function2) {
        int i = 2 % 2;
        int i2 = postMessage + 41;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        this.ICustomTabsService = function2;
        int i4 = postMessage + 73;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 65;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        aFg1qSDK.newAuthTabSession = fFloatValue;
        int i5 = i2 + 41;
        postMessage = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = postMessage + 41;
        int i3 = i2 % 128;
        newSession = i3;
        int i4 = i2 % 2;
        aFg1qSDK.newSessionWithExtras = fFloatValue;
        int i5 = i3 + 95;
        postMessage = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallbackStub<T> implements Comparator {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iOnExtraCallbackWithResult = getFaultAddress.onExtraCallbackWithResult(Float.valueOf(((onWarmupCompleted) t).onExtraCallback()), Float.valueOf(((onWarmupCompleted) t2).onExtraCallback()));
            int i4 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iOnExtraCallbackWithResult;
        }
    }

    public static final class asBinder<T> implements Comparator {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iOnExtraCallbackWithResult = getFaultAddress.onExtraCallbackWithResult(Float.valueOf(((Rect) ((Pair) t).getSecond()).extraCallback()), Float.valueOf(((Rect) ((Pair) t2).getSecond()).extraCallback()));
            int i4 = IAuthTabCallback + 13;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iOnExtraCallbackWithResult;
        }
    }

    public static final class asInterface<T> implements Comparator {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iOnExtraCallbackWithResult = getFaultAddress.onExtraCallbackWithResult(Float.valueOf(((Rect) t).extraCallback()), Float.valueOf(((Rect) t2).extraCallback()));
            int i4 = onWarmupCompleted + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iOnExtraCallbackWithResult;
        }
    }

    public static final class onNavigationEvent<T> implements Comparator {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onNavigationEvent = i2 % 128;
            Rect rect = (Rect) t;
            if (i2 % 2 != 0) {
                return getFaultAddress.onExtraCallbackWithResult(Float.valueOf(rect.extraCallback()), Float.valueOf(((Rect) t2).extraCallback()));
            }
            int iOnExtraCallbackWithResult = getFaultAddress.onExtraCallbackWithResult(Float.valueOf(rect.extraCallback()), Float.valueOf(((Rect) t2).extraCallback()));
            int i3 = 76 / 0;
            return iOnExtraCallbackWithResult;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull Object obj, @NotNull Rect rect) {
        int i = 2 % 2;
        int i2 = postMessage + 125;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(rect, "");
            this.IAuthTabCallback_Parcel.put(obj, rect);
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(rect, "");
        this.IAuthTabCallback_Parcel.put(obj, rect);
        int i3 = postMessage + 83;
        newSession = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void asInterface(@NotNull Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 59;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        this.IAuthTabCallback_Parcel.remove(obj);
        int i4 = newSession + 49;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void onExtraCallback(@NotNull Object obj, @NotNull Rect rect) {
        int i = 2 % 2;
        int i2 = newSession + 69;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(rect, "");
            this.mayLaunchUrl.put(obj, rect);
            int i3 = 86 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(rect, "");
            this.mayLaunchUrl.put(obj, rect);
        }
        int i4 = newSession + 91;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void IAuthTabCallbackStub(@NotNull Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 77;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.mayLaunchUrl.remove(obj);
            this.prefetch.remove(obj);
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        this.mayLaunchUrl.remove(obj);
        this.prefetch.remove(obj);
        int i3 = newSession + 39;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void onWarmupCompleted(@NotNull Object obj, @NotNull Rect rect) {
        int i = 2 % 2;
        int i2 = postMessage + 55;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(rect, "");
        this.IAuthTabCallbackStub.put(obj, rect);
        int i4 = newSession + 33;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallback(@NotNull Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 51;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.IAuthTabCallbackStub.remove(obj);
            this.asInterface.remove(obj);
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            this.IAuthTabCallbackStub.remove(obj);
            this.asInterface.remove(obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public final void IAuthTabCallback(@NotNull Object obj, @NotNull Rect rect) {
        int i = 2 % 2;
        int i2 = newSession + 31;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(rect, "");
            this.onWarmupCompleted.put(obj, rect);
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(rect, "");
            this.onWarmupCompleted.put(obj, rect);
            int i3 = 33 / 0;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 57;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        this.onWarmupCompleted.remove(obj);
        this.onExtraCallbackWithResult.remove(obj);
        int i4 = newSession + 77;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onNavigationEvent(@NotNull Object obj, @NotNull Rect rect) {
        int i = 2 % 2;
        int i2 = newSession + 45;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(rect, "");
        this.IAuthTabCallbackDefault.put(obj, rect);
        int i4 = postMessage + 33;
        newSession = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void IAuthTabCallback(@NotNull Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 21;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.IAuthTabCallbackDefault.remove(obj);
            int i3 = 94 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            this.IAuthTabCallbackDefault.remove(obj);
        }
        int i4 = postMessage + 25;
        newSession = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = postMessage + 47;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        this.prefetch.clear();
        this.prefetch.putAll(this.mayLaunchUrl);
        this.asInterface.clear();
        this.asInterface.putAll(this.IAuthTabCallbackStub);
        this.onExtraCallbackWithResult.clear();
        this.onExtraCallbackWithResult.putAll(this.onWarmupCompleted);
        this.onTransact = true;
        int i4 = newSession + Imgproc.COLOR_YUV2RGB_YVYU;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void access100() {
        int i = 2 % 2;
        int i2 = newSession + 29;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        this.onTransact = false;
        this.prefetch.clear();
        this.asInterface.clear();
        this.onExtraCallbackWithResult.clear();
        int i4 = newSession + 31;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x006b A[PHI: r10
      0x006b: PHI (r10v3 androidx.compose.ui.geometry.Rect) = (r10v2 androidx.compose.ui.geometry.Rect), (r10v6 androidx.compose.ui.geometry.Rect) binds: [B:8:0x0069, B:5:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean IAuthTabCallback(AFg1qSDK aFg1qSDK, Collection collection, long j, Map.Entry entry) {
        Rect rect;
        int i = 2 % 2;
        int i2 = newSession + 53;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(entry, "");
            rect = (Rect) onExtraCallback(new Object[]{aFg1qSDK, (Rect) entry.getValue(), collection}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1640329293, 1640329295);
            int i3 = 90 / 0;
            if (rect != null) {
                int i4 = newSession + Imgproc.COLOR_YUV2RGBA_YVYU;
                postMessage = i4 % 128;
                int i5 = i4 % 2;
                boolean zOnNavigationEvent = rect.onNavigationEvent(j);
                if (i5 != 0 ? zOnNavigationEvent : zOnNavigationEvent) {
                    return true;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(entry, "");
            rect = (Rect) onExtraCallback(new Object[]{aFg1qSDK, (Rect) entry.getValue(), collection}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1640329293, 1640329295);
            if (rect != null) {
            }
        }
        return false;
    }

    public final Object onExtraCallbackWithResult(final long j) {
        Object next;
        Object next2;
        Object key;
        int i = 2 % 2;
        final Collection<Rect> collectionICustomTabsCallback = ICustomTabsCallback();
        Function1 function1 = new Function1() { // from class: im.toss.tosssecurities.uikit.dnd.LazyListDragAndDropState$$ExternalSyntheticLambda8
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 107;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolValueOf = Boolean.valueOf(AFg1qSDK.onExtraCallbackWithResult(this.f$0, collectionICustomTabsCallback, j, (Map.Entry) obj));
                int i5 = onExtraCallback + 83;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return boolValueOf;
            }
        };
        Iterator<T> it = this.IAuthTabCallbackDefault.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                int i2 = postMessage + 49;
                newSession = i2 % 128;
                int i3 = i2 % 2;
                next = null;
                break;
            }
            int i4 = postMessage + 71;
            newSession = i4 % 128;
            int i5 = i4 % 2;
            next = it.next();
            if (((Boolean) function1.invoke(next)).booleanValue()) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null && (key = entry.getKey()) != null) {
            return key;
        }
        Iterator<T> it2 = this.IAuthTabCallback_Parcel.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((Boolean) function1.invoke(next2)).booleanValue()) {
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) next2;
        if (entry2 == null) {
            return null;
        }
        int i6 = postMessage + 95;
        newSession = i6 % 128;
        if (i6 % 2 == 0) {
            return entry2.getKey();
        }
        entry2.getKey();
        throw null;
    }

    public final boolean IAuthTabCallbackStubProxy(@NotNull Object obj) {
        Rect rect;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Rect rect2 = this.IAuthTabCallbackDefault.get(obj);
        boolean z = false;
        if (rect2 == null) {
            rect = this.IAuthTabCallback_Parcel.get(obj);
            if (rect == null) {
                int i2 = newSession + 67;
                int i3 = i2 % 128;
                postMessage = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 69;
                newSession = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
        } else {
            rect = rect2;
        }
        if (rect2 != null) {
            int i7 = postMessage + 119;
            newSession = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        }
        this.IAuthTabCallbackStubProxy = z;
        asBinder(obj);
        onNavigationEvent(rect.ICustomTabsCallback());
        float fIAuthTabCallback_Parcel = rect.IAuthTabCallback_Parcel();
        float fIAuthTabCallbackStubProxy = rect.IAuthTabCallbackStubProxy();
        float fIAuthTabCallbackDefault = rect.IAuthTabCallbackDefault();
        float fExtraCallback = rect.extraCallback();
        onExtraCallback(new Object[]{this, Long.valueOf(setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(fIAuthTabCallbackDefault - fExtraCallback) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallback_Parcel - fIAuthTabCallbackStubProxy) << 32)))}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 1440721450, -1440721443);
        getInterfaceDescriptor((Object) null);
        IAuthTabCallback_Parcel(null);
        this.onPostMessage = null;
        this.onMessageChannelReady = null;
        this.extraCallbackWithResult = null;
        this.ICustomTabsCallback = null;
        this.writeTypedObject = null;
        this.extraCallback = null;
        this.onActivityResized = null;
        this.getInterfaceDescriptor = null;
        access100();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        onNavigationEvent(o.setUseCaseAttached.onNavigationEvent(onExtraCallback(), r4));
        getInterfaceDescriptor();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (IAuthTabCallback() == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (IAuthTabCallback() == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r4 = o.AFg1qSDK.newSession + 55;
        o.AFg1qSDK.postMessage = r4 % 128;
        r4 = r4 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(long j) {
        int i = 2 % 2;
        int i2 = newSession + 35;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 64 / 0;
        }
    }

    public final void access000() {
        int i = 2 % 2;
        int i2 = newSession + 51;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        if (IAuthTabCallback() != null) {
            this.onActivityResized = null;
            access100();
            getInterfaceDescriptor();
        } else {
            int i4 = newSession + Imgproc.COLOR_YUV2RGBA_YVYU;
            postMessage = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final class onExtraCallback {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final Object IAuthTabCallback;
        private final Object onExtraCallback;
        private final Rect onExtraCallbackWithResult;

        public onExtraCallback() {
            this(null, null, null, 7, null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i2 = onNavigationEvent + 89;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (!Intrinsics.areEqual(this.onExtraCallback, onextracallback.onExtraCallback) || !Intrinsics.areEqual(this.IAuthTabCallback, onextracallback.IAuthTabCallback)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallback.onExtraCallbackWithResult)) {
                int i4 = onWarmupCompleted + 89;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = onNavigationEvent + 61;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            Object obj = this.onExtraCallback;
            int iHashCode2 = 0;
            int iHashCode3 = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.IAuthTabCallback;
            if (obj2 == null) {
                int i2 = onNavigationEvent + 91;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 85;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 / 5;
                }
                iHashCode = 0;
            } else {
                iHashCode = obj2.hashCode();
            }
            Rect rect = this.onExtraCallbackWithResult;
            if (rect != null) {
                int i7 = onNavigationEvent + 87;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                iHashCode2 = rect.hashCode();
            }
            return (((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "CollisionTargets(mergeKey=" + this.onExtraCallback + ", swapKey=" + this.IAuthTabCallback + ", swapRect=" + this.onExtraCallbackWithResult + ")";
            int i2 = onNavigationEvent + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallback(@Nullable Object obj, @Nullable Object obj2, @Nullable Rect rect) {
            this.onExtraCallback = obj;
            this.IAuthTabCallback = obj2;
            this.onExtraCallbackWithResult = rect;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallback(Object obj, Object obj2, Rect rect, int i, DefaultConstructorMarker defaultConstructorMarker) {
            Object obj3 = null;
            if ((i & 1) != 0) {
                int i2 = 2 % 2;
                obj = null;
            }
            if ((i & 2) != 0) {
                int i3 = onWarmupCompleted + 61;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    obj3.hashCode();
                    throw null;
                }
                int i4 = 2 % 2;
                obj2 = null;
            }
            if ((i & 4) != 0) {
                int i5 = onNavigationEvent + 95;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                int i6 = 2 % 2;
                rect = null;
            }
            this(obj, obj2, rect);
        }

        public final Object onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Object obj = this.IAuthTabCallback;
            int i5 = i2 + 1;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 54 / 0;
            }
            return obj;
        }

        public final Rect onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Rect rect = this.onExtraCallbackWithResult;
            int i5 = i3 + 23;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return rect;
        }
    }

    private final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = postMessage + 85;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = IAuthTabCallback();
        if (objIAuthTabCallback == null) {
            return;
        }
        if (this.IAuthTabCallbackStubProxy) {
            int i4 = postMessage + 47;
            newSession = i4 % 128;
            int i5 = i4 % 2;
            access000(objIAuthTabCallback);
            return;
        }
        access100(objIAuthTabCallback);
    }

    private final void access100(Object obj) {
        int i = 2 % 2;
        Integer numInvoke = this.access100.invoke(obj);
        if (numInvoke != null) {
            int iIntValue = numInvoke.intValue();
            Rect rectIAuthTabCallback = RectKt.IAuthTabCallback(onExtraCallback(), onExtraCallbackWithResult());
            Object objOnExtraCallback = onExtraCallback(new Object[]{this, Long.valueOf(rectIAuthTabCallback.IAuthTabCallbackStub())}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -922755432, 922755438);
            if (!Intrinsics.areEqual(objOnExtraCallback, this.getInterfaceDescriptor)) {
                int i2 = postMessage + 71;
                newSession = i2 % 128;
                if (i2 % 2 != 0) {
                    this.getInterfaceDescriptor = objOnExtraCallback;
                    this.ICustomTabsService.invoke(objOnExtraCallback, obj);
                    int i3 = 76 / 0;
                } else {
                    this.getInterfaceDescriptor = objOnExtraCallback;
                    this.ICustomTabsService.invoke(objOnExtraCallback, obj);
                }
            }
            Object obj2 = null;
            if (objOnExtraCallback != null) {
                int i4 = postMessage + 19;
                newSession = i4 % 128;
                if (i4 % 2 != 0) {
                    this.writeTypedObject = null;
                    onExtraCallback(new Object[]{this}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 182742168, -182742160);
                    asBinder();
                    obj2.hashCode();
                    throw null;
                }
                this.writeTypedObject = null;
                onExtraCallback(new Object[]{this}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 182742168, -182742160);
                if (asBinder() != null) {
                    getInterfaceDescriptor((Object) null);
                }
                if (onExtraCallback(new Object[]{this}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -632598268, 632598268) != null) {
                    IAuthTabCallback_Parcel(null);
                    return;
                }
                return;
            }
            onExtraCallback onextracallback = (onExtraCallback) onExtraCallback(new Object[]{this, obj, rectIAuthTabCallback}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 383607537, -383607536);
            if (onextracallback.onExtraCallback() != null) {
                this.writeTypedObject = null;
                onExtraCallback(new Object[]{this}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 182742168, -182742160);
                if (Intrinsics.areEqual(asBinder(), onextracallback.onExtraCallback())) {
                    return;
                }
                int i5 = postMessage + 97;
                newSession = i5 % 128;
                int i6 = i5 % 2;
                getInterfaceDescriptor(onextracallback.onExtraCallback());
                return;
            }
            if (asBinder() != null) {
                getInterfaceDescriptor((Object) null);
            }
            if (onExtraCallback(new Object[]{this}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -632598268, 632598268) != null) {
                int i7 = newSession + 3;
                postMessage = i7 % 128;
                int i8 = i7 % 2;
                IAuthTabCallback_Parcel(null);
            }
            if (onextracallback.onNavigationEvent() != null) {
                int i9 = newSession + 13;
                postMessage = i9 % 128;
                int i10 = i9 % 2;
                if (onextracallback.onExtraCallbackWithResult() != null) {
                    this.writeTypedObject = null;
                    onExtraCallback(new Object[]{this, obj, Integer.valueOf(iIntValue), rectIAuthTabCallback, onextracallback.onNavigationEvent(), onextracallback.onExtraCallbackWithResult()}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1304421736, 1304421750);
                    return;
                }
            }
            int i11 = newSession + 81;
            postMessage = i11 % 128;
            int i12 = i11 % 2;
            Object objIAuthTabCallbackStub = IAuthTabCallbackStub(rectIAuthTabCallback.IAuthTabCallbackStub());
            if (!Intrinsics.areEqual(objIAuthTabCallbackStub, this.writeTypedObject)) {
                this.writeTypedObject = objIAuthTabCallbackStub;
                if (objIAuthTabCallbackStub != null) {
                    int i13 = postMessage + 77;
                    newSession = i13 % 128;
                    if (i13 % 2 != 0) {
                        this.ICustomTabsCallback_Parcel.invoke(objIAuthTabCallbackStub, RegionDropPosition.Before, obj);
                        int i14 = 69 / 0;
                    } else {
                        this.ICustomTabsCallback_Parcel.invoke(objIAuthTabCallbackStub, RegionDropPosition.Before, obj);
                    }
                    int i15 = postMessage + 15;
                    newSession = i15 % 128;
                    int i16 = i15 % 2;
                }
            }
            onExtraCallback(new Object[]{this}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 182742168, -182742160);
        }
    }

    private final void access000(Object obj) {
        Object objOnNavigationEvent;
        int i = 2 % 2;
        long jIAuthTabCallbackStub = RectKt.IAuthTabCallback(onExtraCallback(), onExtraCallbackWithResult()).IAuthTabCallbackStub();
        IAuthTabCallback iAuthTabCallbackOnExtraCallback = onExtraCallback(jIAuthTabCallbackStub, true);
        if (iAuthTabCallbackOnExtraCallback != null) {
            int i2 = newSession + Imgproc.COLOR_YUV2RGBA_YVYU;
            postMessage = i2 % 128;
            if (i2 % 2 == 0) {
                iAuthTabCallbackOnExtraCallback.onNavigationEvent();
                regionDropPositionIAuthTabCallback.hashCode();
                throw null;
            }
            objOnNavigationEvent = iAuthTabCallbackOnExtraCallback.onNavigationEvent();
        } else {
            objOnNavigationEvent = null;
        }
        regionDropPositionIAuthTabCallback = iAuthTabCallbackOnExtraCallback != null ? iAuthTabCallbackOnExtraCallback.IAuthTabCallback() : null;
        if (Intrinsics.areEqual(objOnNavigationEvent, this.writeTypedObject)) {
            int i3 = newSession + Imgproc.COLOR_YUV2RGBA_YVYU;
            postMessage = i3 % 128;
            int i4 = i3 % 2;
            if (regionDropPositionIAuthTabCallback == this.extraCallback) {
                if (this.onTransact || objOnNavigationEvent == null || regionDropPositionIAuthTabCallback == null) {
                    return;
                }
                IAuthTabCallback_Parcel();
                return;
            }
        }
        if (objOnNavigationEvent == null || regionDropPositionIAuthTabCallback == null) {
            this.writeTypedObject = objOnNavigationEvent;
            this.extraCallback = regionDropPositionIAuthTabCallback;
            return;
        }
        setUseCaseAttached setusecaseattached = this.onActivityResized;
        if (setusecaseattached != null) {
            int i5 = newSession + 67;
            postMessage = i5 % 128;
            if (i5 % 2 == 0) {
                if (Math.abs(Float.intBitsToFloat((int) jIAuthTabCallbackStub) / Float.intBitsToFloat((int) (4294967295L | setusecaseattached.onExtraCallback()))) < this.newAuthTabSession) {
                    return;
                }
            } else if (Math.abs(Float.intBitsToFloat((int) jIAuthTabCallbackStub) - Float.intBitsToFloat((int) (4294967295L & setusecaseattached.onExtraCallback()))) < this.newAuthTabSession) {
                return;
            }
        }
        this.writeTypedObject = objOnNavigationEvent;
        this.extraCallback = regionDropPositionIAuthTabCallback;
        this.onActivityResized = setUseCaseAttached.onNavigationEvent(jIAuthTabCallbackStub);
        this.ICustomTabsCallback_Parcel.invoke(objOnNavigationEvent, regionDropPositionIAuthTabCallback, obj);
        if (this.onTransact) {
            return;
        }
        int i6 = newSession + 123;
        postMessage = i6 % 128;
        int i7 = i6 % 2;
        IAuthTabCallback_Parcel();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ee A[PHI: r0 r16
      0x00ee: PHI (r0v9 float) = (r0v8 float), (r0v11 float) binds: [B:26:0x00ec, B:23:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x00ee: PHI (r16v6 boolean) = (r16v5 boolean), (r16v7 boolean) binds: [B:26:0x00ec, B:23:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        boolean z;
        float fExtraCallback;
        boolean z2 = false;
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        Object obj = objArr[1];
        Rect rect = (Rect) objArr[2];
        int i = 2 % 2;
        float f = aFg1qSDK.onUnminimized;
        float fIAuthTabCallbackDefault = rect.IAuthTabCallbackDefault() - rect.extraCallback();
        float fIntBitsToFloat = Float.intBitsToFloat((int) rect.IAuthTabCallbackStub());
        Collection<Rect> collectionICustomTabsCallback = aFg1qSDK.ICustomTabsCallback();
        Object obj2 = null;
        Object obj3 = null;
        Rect rect2 = null;
        for (Map.Entry<Object, Rect> entry : aFg1qSDK.IAuthTabCallback_Parcel.entrySet()) {
            Object key = entry.getKey();
            Rect value = entry.getValue();
            if (!Intrinsics.areEqual(key, obj)) {
                Rect rect3 = (Rect) onExtraCallback(new Object[]{aFg1qSDK, value, collectionICustomTabsCallback}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1640329293, 1640329295);
                if (rect3 == null) {
                    z = z2;
                } else {
                    if (fIAuthTabCallbackDefault > 0.0f && rect.onExtraCallback(rect3)) {
                        float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(Math.min(rect.IAuthTabCallbackDefault(), rect3.IAuthTabCallbackDefault()) - Math.max(rect.extraCallback(), rect3.extraCallback()), 0.0f) / fIAuthTabCallbackDefault;
                        if (fCoerceAtLeast > f && aFg1qSDK.onNavigationEvent.invoke(obj, key).booleanValue()) {
                            int i2 = postMessage + 31;
                            newSession = i2 % 128;
                            int i3 = i2 % 2;
                            f = fCoerceAtLeast;
                            obj2 = key;
                        }
                    }
                    if (obj3 == null) {
                        int i4 = newSession + 31;
                        postMessage = i4 % 128;
                        if (i4 % 2 == 0) {
                            fExtraCallback = rect3.extraCallback();
                            z = false;
                            int i5 = 66 / 0;
                            if (fIntBitsToFloat <= rect3.IAuthTabCallbackDefault()) {
                                if (fExtraCallback <= fIntBitsToFloat) {
                                    rect2 = rect3;
                                    obj3 = key;
                                }
                            }
                        } else {
                            z = false;
                            fExtraCallback = rect3.extraCallback();
                            if (fIntBitsToFloat <= rect3.IAuthTabCallbackDefault()) {
                            }
                        }
                    } else {
                        z = false;
                    }
                }
            }
            z2 = z;
        }
        if (obj2 != null) {
            return new onExtraCallback(obj2, null, null);
        }
        return new onExtraCallback(null, obj3, rect2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c9, code lost:
    
        if (java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) r6.IAuthTabCallbackStub()) - java.lang.Float.intBitsToFloat((int) r13.IAuthTabCallbackStub())) < ((r13.IAuthTabCallbackDefault() - r13.extraCallback()) * 0.25f)) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        boolean z = false;
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        Object obj = objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        Rect rect = (Rect) objArr[3];
        Object obj2 = objArr[4];
        Rect rect2 = (Rect) objArr[5];
        int i = 2 % 2;
        Object obj3 = null;
        if (aFg1qSDK.IAuthTabCallback.invoke(obj, obj2).booleanValue()) {
            int i2 = postMessage + 1;
            newSession = i2 % 128;
            int i3 = i2 % 2;
            Integer numInvoke = aFg1qSDK.access100.invoke(obj2);
            if (numInvoke != null) {
                int iIntValue2 = numInvoke.intValue();
                if (Float.intBitsToFloat((int) rect.IAuthTabCallbackStub()) < Float.intBitsToFloat((int) rect2.IAuthTabCallbackStub())) {
                    int i4 = postMessage + 87;
                    newSession = i4 % 128;
                    int i5 = i4 % 2;
                    z = true;
                }
                int iOnExtraCallbackWithResult = aFg1qSDK.onExtraCallbackWithResult(iIntValue, iIntValue2, z);
                if (!Intrinsics.areEqual(aFg1qSDK.extraCallbackWithResult, obj) || !Intrinsics.areEqual(aFg1qSDK.ICustomTabsCallback, obj2) || aFg1qSDK.readTypedObject != z) {
                    if (iOnExtraCallbackWithResult == iIntValue) {
                        aFg1qSDK.extraCallbackWithResult = obj;
                        aFg1qSDK.ICustomTabsCallback = obj2;
                        aFg1qSDK.readTypedObject = z;
                        aFg1qSDK.isEngagementSignalsApiAvailable.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iOnExtraCallbackWithResult), obj2);
                    } else {
                        if (Intrinsics.areEqual(aFg1qSDK.onPostMessage, obj)) {
                            int i6 = postMessage + 113;
                            newSession = i6 % 128;
                            if (i6 % 2 != 0) {
                                Intrinsics.areEqual(aFg1qSDK.onMessageChannelReady, obj2);
                                obj3.hashCode();
                                throw null;
                            }
                            if (Intrinsics.areEqual(aFg1qSDK.onMessageChannelReady, obj2)) {
                                if (aFg1qSDK.onActivityLayout != z) {
                                }
                            }
                        }
                        aFg1qSDK.onPostMessage = obj;
                        aFg1qSDK.onMessageChannelReady = obj2;
                        aFg1qSDK.onActivityLayout = z;
                        aFg1qSDK.extraCallbackWithResult = obj;
                        aFg1qSDK.ICustomTabsCallback = obj2;
                        aFg1qSDK.readTypedObject = z;
                        aFg1qSDK.isEngagementSignalsApiAvailable.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iOnExtraCallbackWithResult), obj2);
                    }
                }
            }
        }
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 51;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        aFg1qSDK.extraCallbackWithResult = null;
        aFg1qSDK.ICustomTabsCallback = null;
        aFg1qSDK.readTypedObject = false;
        int i5 = i2 + 125;
        postMessage = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallbackStub(long j) {
        Integer numValueOf;
        int i = 2 % 2;
        if (this.mayLaunchUrl.isEmpty()) {
            int i2 = postMessage + 103;
            newSession = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        Collection<Rect> collectionICustomTabsCallback = ICustomTabsCallback();
        Collection<Rect> collection = collectionICustomTabsCallback;
        if (collection instanceof Collection) {
            int i4 = postMessage + 47;
            newSession = i4 % 128;
            int i5 = i4 % 2;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    if (((Rect) it.next()).onNavigationEvent(j)) {
                        return null;
                    }
                }
            }
        }
        Set<Map.Entry<Object, Rect>> setEntrySet = this.mayLaunchUrl.entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Rect rect = (Rect) onExtraCallback(new Object[]{this, (Rect) entry.getValue(), collectionICustomTabsCallback}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1640329293, 1640329295);
            Pair pairIAuthTabCallback = rect == null ? null : getWrite.IAuthTabCallback(entry.getKey(), rect);
            if (pairIAuthTabCallback != null) {
                int i6 = postMessage + 7;
                newSession = i6 % 128;
                int i7 = i6 % 2;
                arrayList.add(pairIAuthTabCallback);
            }
        }
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new asBinder());
        float fIntBitsToFloat = Float.intBitsToFloat((int) j);
        Iterator it3 = listSortedWith.iterator();
        int i8 = 0;
        while (true) {
            if (!it3.hasNext()) {
                numValueOf = null;
                break;
            }
            int i9 = postMessage + 95;
            newSession = i9 % 128;
            int i10 = i9 % 2;
            Object next = it3.next();
            int i11 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            float fExtraCallback = i8 == 0 ? Float.NEGATIVE_INFINITY : ((Rect) ((Pair) next).getSecond()).extraCallback();
            float fExtraCallback2 = i8 == CollectionsKt__CollectionsKt.getLastIndex(listSortedWith) ? Float.POSITIVE_INFINITY : ((Rect) ((Pair) listSortedWith.get(i11)).getSecond()).extraCallback();
            if (fExtraCallback <= fIntBitsToFloat) {
                int i12 = postMessage + 115;
                newSession = i12 % 128;
                int i13 = i12 % 2;
                if (fIntBitsToFloat <= fExtraCallback2) {
                    numValueOf = Integer.valueOf(i8);
                    int i14 = postMessage + 7;
                    newSession = i14 % 128;
                    int i15 = i14 % 2;
                    break;
                }
            }
            i8 = i11;
        }
        if (numValueOf != null) {
            return ((Pair) listSortedWith.get(numValueOf.intValue())).getFirst();
        }
        return null;
    }

    public static final class IAuthTabCallback {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final Object IAuthTabCallback;
        private final RegionDropPosition onExtraCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 39;
                onNavigationEvent = i2 % 128;
                return i2 % 2 == 0;
            }
            if (obj instanceof IAuthTabCallback) {
                IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
                return Intrinsics.areEqual(this.IAuthTabCallback, iAuthTabCallback.IAuthTabCallback) && this.onExtraCallback == iAuthTabCallback.onExtraCallback;
            }
            int i3 = onWarmupCompleted + 73;
            onNavigationEvent = i3 % 128;
            return i3 % 2 != 0;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.IAuthTabCallback.hashCode();
            RegionDropPosition regionDropPosition = this.onExtraCallback;
            if (regionDropPosition == null) {
                int i4 = onNavigationEvent + 101;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = regionDropPosition.hashCode();
            }
            return (iHashCode2 * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "HandleHover(key=" + this.IAuthTabCallback + ", position=" + this.onExtraCallback + ")";
            int i2 = onWarmupCompleted + 83;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public IAuthTabCallback(@NotNull Object obj, @Nullable RegionDropPosition regionDropPosition) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.IAuthTabCallback = obj;
            this.onExtraCallback = regionDropPosition;
        }

        public final RegionDropPosition IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            Object obj = this.IAuthTabCallback;
            int i5 = i3 + 101;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return obj;
        }
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private final float onExtraCallbackWithResult;
        private final float onNavigationEvent;
        private final Object onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof onWarmupCompleted) {
                onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
                return Intrinsics.areEqual(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted) && Float.compare(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent) == 0 && Float.compare(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult) == 0;
            }
            int i4 = i3 + 29;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((this.onWarmupCompleted.hashCode() * 31) + Float.hashCode(this.onNavigationEvent)) * 31) + Float.hashCode(this.onExtraCallbackWithResult);
            int i4 = IAuthTabCallback + 75;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "HandleHoverSpan(key=" + this.onWarmupCompleted + ", top=" + this.onNavigationEvent + ", bottom=" + this.onExtraCallbackWithResult + ")";
            int i2 = IAuthTabCallback + 91;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 19 / 0;
            }
            return str;
        }

        public onWarmupCompleted(@NotNull Object obj, float f, float f2) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.onWarmupCompleted = obj;
            this.onNavigationEvent = f;
            this.onExtraCallbackWithResult = f2;
        }

        public final Object IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Object obj = this.onWarmupCompleted;
            int i5 = i3 + 77;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 18 / 0;
            }
            return obj;
        }

        public final float onExtraCallback() {
            float f;
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 103;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                f = this.onNavigationEvent;
                int i4 = 13 / 0;
            } else {
                f = this.onNavigationEvent;
            }
            int i5 = i2 + 47;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return f;
            }
            throw null;
        }

        public final float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            float f = this.onExtraCallbackWithResult;
            int i4 = i3 + 105;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 78 / 0;
            }
            return f;
        }
    }

    private final IAuthTabCallback onExtraCallback(long j, boolean z) {
        Map<Object, Rect> map;
        Map<Object, Rect> map2;
        Set<Map.Entry<Object, Rect>> setEntrySet;
        int i = 2 % 2;
        int i2 = newSession + Imgproc.COLOR_YUV2RGBA_YVYU;
        int i3 = i2 % 128;
        postMessage = i3;
        int i4 = i2 % 2;
        boolean z2 = this.onTransact;
        if (!(!z2)) {
            int i5 = i3 + 79;
            newSession = i5 % 128;
            int i6 = i5 % 2;
            map = this.prefetch;
        } else {
            map = this.mayLaunchUrl;
        }
        Map<Object, Rect> map3 = z2 ? this.asInterface : this.IAuthTabCallbackStub;
        if (z2) {
            int i7 = newSession + Imgproc.COLOR_YUV2RGBA_YVYU;
            postMessage = i7 % 128;
            int i8 = i7 % 2;
            map2 = this.onExtraCallbackWithResult;
        } else {
            map2 = this.onWarmupCompleted;
        }
        Collection<Rect> collectionValues = map2.values();
        int i9 = postMessage + 115;
        newSession = i9 % 128;
        int i10 = i9 % 2;
        boolean z3 = z && !map3.isEmpty();
        Object obj = null;
        if (map.isEmpty()) {
            int i11 = postMessage;
            int i12 = i11 + 61;
            newSession = i12 % 128;
            int i13 = i12 % 2;
            if (!z3) {
                int i14 = i11 + 3;
                newSession = i14 % 128;
                if (i14 % 2 == 0) {
                    return null;
                }
                throw null;
            }
        }
        int size = collectionValues.size();
        Collection<Rect> collection = collectionValues;
        List list = size <= 1 ? CollectionsKt___CollectionsKt.toList(collection) : CollectionsKt___CollectionsKt.sortedWith(collection, new onNavigationEvent());
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (!(!((Rect) it.next()).onNavigationEvent(j))) {
                    int i15 = newSession + 21;
                    postMessage = i15 % 128;
                    if (i15 % 2 != 0) {
                        return null;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
        }
        if (z3) {
            int i16 = newSession + 37;
            postMessage = i16 % 128;
            int i17 = i16 % 2;
            setEntrySet = clearSenderUid.onExtraCallback(map.entrySet(), map3.entrySet());
        } else {
            setEntrySet = map.entrySet();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Rect rect = (Rect) onExtraCallback(new Object[]{this, (Rect) entry.getValue(), list}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1640329293, 1640329295);
            onWarmupCompleted onwarmupcompleted = rect == null ? null : new onWarmupCompleted(entry.getKey(), rect.extraCallback(), rect.IAuthTabCallbackDefault());
            if (onwarmupcompleted != null) {
                int i18 = postMessage + 61;
                newSession = i18 % 128;
                int i19 = i18 % 2;
                arrayList.add(onwarmupcompleted);
            }
        }
        return Companion.onExtraCallbackWithResult(CollectionsKt___CollectionsKt.sortedWith(arrayList, new IAuthTabCallbackStub()), Float.intBitsToFloat((int) j), Float.intBitsToFloat((int) onTransact()) + asInterface(), Float.intBitsToFloat((int) onExtraCallbackWithResult()) + this.newSessionWithExtras, this.newAuthTabSession);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Object next;
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        if (aFg1qSDK.IAuthTabCallbackStub.isEmpty()) {
            int i2 = postMessage + 15;
            newSession = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 38 / 0;
            }
            return null;
        }
        Collection<Rect> collectionICustomTabsCallback = aFg1qSDK.ICustomTabsCallback();
        Collection<Rect> collection = collectionICustomTabsCallback;
        if (collection instanceof Collection) {
            int i4 = postMessage + 45;
            newSession = i4 % 128;
            int i5 = i4 % 2;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                int i6 = postMessage + 19;
                newSession = i6 % 128;
                int i7 = i6 % 2;
                while (it.hasNext()) {
                    if (((Rect) it.next()).onNavigationEvent(jLongValue)) {
                        int i8 = newSession + 29;
                        postMessage = i8 % 128;
                        int i9 = i8 % 2;
                        return null;
                    }
                }
            }
        }
        Iterator<T> it2 = aFg1qSDK.IAuthTabCallbackStub.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            Rect rect = (Rect) onExtraCallback(new Object[]{aFg1qSDK, (Rect) ((Map.Entry) next).getValue(), collectionICustomTabsCallback}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1640329293, 1640329295);
            if (rect != null && rect.onNavigationEvent(jLongValue)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if ((r2 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r1 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r1 == 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        return kotlin.collections.CollectionsKt___CollectionsKt.sortedWith(r4.onWarmupCompleted.values(), new o.AFg1qSDK.asInterface());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        return r4.onWarmupCompleted.values();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        return kotlin.collections.CollectionsKt__CollectionsKt.emptyList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r2 = o.AFg1qSDK.newSession + 51;
        o.AFg1qSDK.postMessage = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Collection<Rect> ICustomTabsCallback() {
        int size;
        int i = 2 % 2;
        int i2 = newSession + 43;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            size = this.onWarmupCompleted.size();
            int i3 = 59 / 0;
        } else {
            size = this.onWarmupCompleted.size();
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Rect rect = (Rect) objArr[1];
        Collection<Rect> collection = (Collection) objArr[2];
        int i = 2 % 2;
        if (collection.isEmpty()) {
            int i2 = newSession + Imgproc.COLOR_YUV2RGBA_YVYU;
            postMessage = i2 % 128;
            if (i2 % 2 != 0) {
                return rect;
            }
            throw null;
        }
        float fExtraCallback = rect.extraCallback();
        float fIAuthTabCallbackDefault = rect.IAuthTabCallbackDefault();
        for (Rect rect2 : collection) {
            int i3 = newSession + 29;
            postMessage = i3 % 128;
            int i4 = i3 % 2;
            if (rect2.IAuthTabCallback_Parcel() > rect.IAuthTabCallbackStubProxy() && rect2.IAuthTabCallbackStubProxy() < rect.IAuthTabCallback_Parcel() && Math.max(fExtraCallback, rect2.extraCallback()) < Math.min(fIAuthTabCallbackDefault, rect2.IAuthTabCallbackDefault())) {
                float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(rect2.extraCallback() - fExtraCallback, 0.0f);
                float fCoerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(fIAuthTabCallbackDefault - rect2.IAuthTabCallbackDefault(), 0.0f);
                if (fCoerceAtLeast == 0.0f && fCoerceAtLeast2 == 0.0f) {
                    return null;
                }
                if (fCoerceAtLeast2 >= fCoerceAtLeast) {
                    fExtraCallback = RangesKt___RangesKt.coerceAtMost(rect2.IAuthTabCallbackDefault(), fIAuthTabCallbackDefault);
                } else {
                    fIAuthTabCallbackDefault = RangesKt___RangesKt.coerceAtLeast(rect2.extraCallback(), fExtraCallback);
                }
            }
        }
        if (fIAuthTabCallbackDefault <= fExtraCallback) {
            return null;
        }
        return new Rect(rect.IAuthTabCallbackStubProxy(), fExtraCallback, rect.IAuthTabCallback_Parcel(), fIAuthTabCallbackDefault);
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = postMessage + 43;
        newSession = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            Object objIAuthTabCallback = IAuthTabCallback();
            Object objOnExtraCallback = onExtraCallback(new Object[]{this}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -632598268, 632598268);
            writeTypedObject();
            if (objIAuthTabCallback != null) {
                int i3 = postMessage + 1;
                newSession = i3 % 128;
                int i4 = i3 % 2;
                this.onRelationshipValidationResult.invoke(objIAuthTabCallback, objOnExtraCallback);
                return;
            }
            return;
        }
        int iIAuthTabCallback4 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback5 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback6 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        IAuthTabCallback();
        onExtraCallback(new Object[]{this}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -632598268, 632598268);
        writeTypedObject();
        throw null;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = newSession + 105;
        postMessage = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            Object objIAuthTabCallback = IAuthTabCallback();
            writeTypedObject();
            if (objIAuthTabCallback != null) {
                int i3 = newSession + 103;
                postMessage = i3 % 128;
                int i4 = i3 % 2;
                this.ICustomTabsCallbackStubProxy.invoke(objIAuthTabCallback);
                int i5 = newSession + 93;
                postMessage = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            return;
        }
        int iIAuthTabCallback4 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback5 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback6 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        IAuthTabCallback();
        writeTypedObject();
        throw null;
    }

    private final void writeTypedObject() {
        int i = 2 % 2;
        int i2 = newSession + 41;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        asBinder((Object) null);
        this.IAuthTabCallbackStubProxy = false;
        onNavigationEvent(setUseCaseAttached.Companion.IAuthTabCallback());
        onExtraCallback(new Object[]{this, Long.valueOf(setUseCaseDetached.Companion.onExtraCallback())}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 1440721450, -1440721443);
        getInterfaceDescriptor((Object) null);
        IAuthTabCallback_Parcel(null);
        this.onPostMessage = null;
        this.onMessageChannelReady = null;
        this.extraCallbackWithResult = null;
        this.ICustomTabsCallback = null;
        this.writeTypedObject = null;
        this.extraCallback = null;
        this.onActivityResized = null;
        this.getInterfaceDescriptor = null;
        access100();
        int i4 = newSession + 63;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[PHI: r3 r5
          0x0034: PHI (r3v6 java.lang.Object) = (r3v5 java.lang.Object), (r3v17 java.lang.Object) binds: [B:11:0x0032, B:8:0x0029] A[DONT_GENERATE, DONT_INLINE]
          0x0034: PHI (r5v2 int) = (r5v1 int), (r5v4 int) binds: [B:11:0x0032, B:8:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x006e A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final IAuthTabCallback onExtraCallbackWithResult(@NotNull List<onWarmupCompleted> list, float f, float f2, float f3, float f4) {
            Object obj;
            Integer numValueOf;
            float fOnExtraCallback;
            Object next;
            int i;
            float fOnExtraCallback2;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(list, "");
            Iterator<T> it = list.iterator();
            int i3 = 0;
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    numValueOf = null;
                    break;
                }
                int i4 = onWarmupCompleted + 23;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    next = it.next();
                    i = i3 % 0;
                    if (i3 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    fOnExtraCallback2 = i3 != 0 ? Float.NEGATIVE_INFINITY : ((onWarmupCompleted) next).onExtraCallback();
                    float fOnExtraCallback3 = i3 != CollectionsKt__CollectionsKt.getLastIndex(list) ? Float.POSITIVE_INFINITY : list.get(i).onExtraCallback();
                    if (fOnExtraCallback2 > f) {
                        int i5 = onNavigationEvent + 33;
                        onWarmupCompleted = i5 % 128;
                        if (i5 % 2 == 0) {
                            throw null;
                        }
                        if (f <= fOnExtraCallback3) {
                            numValueOf = Integer.valueOf(i3);
                            break;
                        }
                    }
                    i3 = i;
                } else {
                    next = it.next();
                    i = i3 + 1;
                    if (i3 < 0) {
                    }
                    if (i3 != 0) {
                    }
                    if (i3 != CollectionsKt__CollectionsKt.getLastIndex(list)) {
                    }
                    if (fOnExtraCallback2 > f) {
                    }
                    i3 = i;
                }
            }
            if (numValueOf == null) {
                return null;
            }
            int iIntValue = numValueOf.intValue();
            onWarmupCompleted onwarmupcompleted = list.get(iIntValue);
            if (iIntValue == CollectionsKt__CollectionsKt.getLastIndex(list)) {
                int i6 = onWarmupCompleted + 85;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    RangesKt___RangesKt.coerceAtLeast(f2, onwarmupcompleted.onExtraCallbackWithResult());
                    obj.hashCode();
                    throw null;
                }
                fOnExtraCallback = RangesKt___RangesKt.coerceAtLeast(f2, onwarmupcompleted.onExtraCallbackWithResult());
            } else {
                fOnExtraCallback = list.get(iIntValue + 1).onExtraCallback();
                int i7 = onNavigationEvent + 13;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
            }
            return new IAuthTabCallback(onwarmupcompleted.IAuthTabCallback(), onExtraCallbackWithResult(f, onwarmupcompleted.onExtraCallback(), fOnExtraCallback, RangesKt___RangesKt.coerceAtLeast(Math.min(f3, (fOnExtraCallback - onwarmupcompleted.onExtraCallback()) - (f4 * 2.0f)), 0.0f)));
        }

        public final RegionDropPosition onExtraCallbackWithResult(float f, float f2, float f3, float f4) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 107;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (f3 <= f2) {
                return null;
            }
            float f5 = (f2 + f3) / 2.0f;
            float f6 = f4 / 2.0f;
            if (f >= f5 - f6) {
                if (f >= f5 + f6) {
                    return RegionDropPosition.After;
                }
                return null;
            }
            int i5 = i2 + 63;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                RegionDropPosition regionDropPosition = RegionDropPosition.Before;
                int i6 = onNavigationEvent + 125;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return regionDropPosition;
            }
            RegionDropPosition regionDropPosition2 = RegionDropPosition.Before;
            throw null;
        }
    }

    public final Object IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = newSession + 89;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = this.asBinder.onExtraCallbackWithResult();
        int i4 = postMessage + 79;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallbackWithResult;
    }

    public final void asBinder(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 19;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder.IAuthTabCallback(obj);
        int i4 = newSession + 89;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = newSession + 47;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        long jOnExtraCallback = ((setUseCaseAttached) this.onExtraCallback.onExtraCallbackWithResult()).onExtraCallback();
        int i4 = postMessage + 71;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return jOnExtraCallback;
    }

    public final void onNavigationEvent(long j) {
        int i = 2 % 2;
        int i2 = newSession + 49;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.IAuthTabCallback(setUseCaseAttached.onNavigationEvent(j));
        int i4 = postMessage + 105;
        newSession = i4 % 128;
        int i5 = i4 % 2;
    }

    public final long onExtraCallbackWithResult() {
        long jOnNavigationEvent;
        int i = 2 % 2;
        int i2 = newSession + 53;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            jOnNavigationEvent = ((setUseCaseDetached) this.access000.onExtraCallbackWithResult()).onNavigationEvent();
            int i3 = 27 / 0;
        } else {
            jOnNavigationEvent = ((setUseCaseDetached) this.access000.onExtraCallbackWithResult()).onNavigationEvent();
        }
        int i4 = postMessage + 73;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            return jOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = newSession + 89;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        aFg1qSDK.access000.IAuthTabCallback(setUseCaseDetached.onNavigationEvent(jLongValue));
        int i4 = newSession + 43;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final long onTransact() {
        int i = 2 % 2;
        int i2 = postMessage + 21;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        long jOnExtraCallback = ((setUseCaseAttached) this.extraCommand.onExtraCallbackWithResult()).onExtraCallback();
        int i4 = postMessage + 67;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return jOnExtraCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = newSession + 37;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        aFg1qSDK.extraCommand.IAuthTabCallback(setUseCaseAttached.onNavigationEvent(jLongValue));
        int i4 = postMessage + 125;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final int asInterface() {
        int i = 2 % 2;
        int i2 = newSession + 77;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = this.onMinimized.onWarmupCompleted();
        int i4 = newSession + 19;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return iOnWarmupCompleted;
        }
        throw null;
    }

    public final void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = newSession + 103;
        postMessage = i3 % 128;
        int i4 = i3 % 2;
        this.onMinimized.onExtraCallback(i);
        int i5 = postMessage + 105;
        newSession = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final Object asBinder() {
        int i = 2 % 2;
        int i2 = newSession + 15;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = this.ICustomTabsCallbackStub.onExtraCallbackWithResult();
        int i4 = newSession + 75;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    public final void getInterfaceDescriptor(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 85;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            this.ICustomTabsCallbackStub.IAuthTabCallback(obj);
            int i3 = 4 / 0;
        } else {
            this.ICustomTabsCallbackStub.IAuthTabCallback(obj);
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        int i = 2 % 2;
        int i2 = newSession + 43;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = aFg1qSDK.ICustomTabsCallbackDefault.onExtraCallbackWithResult();
        int i4 = newSession + 25;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    public final void IAuthTabCallback_Parcel(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 55;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        this.ICustomTabsCallbackDefault.IAuthTabCallback(obj);
        int i4 = newSession + 55;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(Object obj, Object obj2) {
        return (Unit) onExtraCallback(new Object[]{obj, obj2}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1800720854, 1800720863);
    }

    private static final boolean IAuthTabCallback(Object obj, Object obj2) {
        return ((Boolean) onExtraCallback(new Object[]{obj, obj2}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 2130030102, -2130030099)).booleanValue();
    }

    private final onExtraCallback asBinder(Object obj, Rect rect) {
        return (onExtraCallback) onExtraCallback(new Object[]{this, obj, rect}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 383607537, -383607536);
    }

    private final Object IAuthTabCallbackDefault(long j) {
        return onExtraCallback(new Object[]{this, Long.valueOf(j)}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -922755432, 922755438);
    }

    private static final Unit onTransact(Object obj, Object obj2) {
        return (Unit) onExtraCallback(new Object[]{obj, obj2}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 2045132110, -2045132100);
    }

    private static final Unit IAuthTabCallbackDefault(Object obj, Object obj2) {
        return (Unit) onExtraCallback(new Object[]{obj, obj2}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1603536678, 1603536691);
    }

    private final void onWarmupCompleted(Object obj, int i, Rect rect, Object obj2, Rect rect2) {
        onExtraCallback(new Object[]{this, obj, Integer.valueOf(i), rect, obj2, rect2}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1304421736, 1304421750);
    }

    private final void IAuthTabCallbackStubProxy() {
        onExtraCallback(new Object[]{this}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 182742168, -182742160);
    }

    private final Rect onWarmupCompleted(Rect rect, Collection<Rect> collection) {
        return (Rect) onExtraCallback(new Object[]{this, rect, collection}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1640329293, 1640329295);
    }

    public final Object IAuthTabCallbackDefault() {
        return onExtraCallback(new Object[]{this}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -632598268, 632598268);
    }

    public final boolean IAuthTabCallbackDefault(@NotNull Object obj) {
        return ((Boolean) onExtraCallback(new Object[]{this, obj}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1530011264, 1530011269)).booleanValue();
    }

    public final void IAuthTabCallback(long j) {
        onExtraCallback(new Object[]{this, Long.valueOf(j)}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 1440721450, -1440721443);
    }

    public final void onExtraCallback(long j) {
        onExtraCallback(new Object[]{this, Long.valueOf(j)}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 1038743611, -1038743607);
    }

    public final void onNavigationEvent(float f) {
        onExtraCallback(new Object[]{this, Float.valueOf(f)}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -788700804, 788700816);
    }

    public final void onWarmupCompleted(float f) {
        onExtraCallback(new Object[]{this, Float.valueOf(f)}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 1871066867, -1871066856);
    }
}
