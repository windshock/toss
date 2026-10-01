package o;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.manager.NativeAdsScreenManager$activityLifecycleObserver$1;
import im.toss.ads_sdk.manager.NativeAdsScreenManager$fragmentLifecycleObserver$1;
import im.toss.ads_sdk.ui.view.NativeAdsContainerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.requestParentDisallowInterceptTouchEvent;
import o.setApTextSize;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class requestParentDisallowInterceptTouchEvent {
    private static int access100 = 1;
    private static int getInterfaceDescriptor;
    private final CoroutineExceptionHandler IAuthTabCallback;
    private final List<RecyclerView> IAuthTabCallbackDefault;
    private ViewTreeObserver.OnScrollChangedListener IAuthTabCallbackStub;
    private final List<ScrollView> IAuthTabCallbackStubProxy;
    private final NativeAdsManager asBinder;
    private final onNavigationEvent asInterface;
    private final List<removeNonDecorViews> onExtraCallback;
    private final NativeAdsScreenManager$activityLifecycleObserver$1 onExtraCallbackWithResult;
    private final NativeAdsScreenManager$fragmentLifecycleObserver$1 onNavigationEvent;
    private getCornerRadius<Integer> onTransact;
    private WeakReference<TextFieldScrollKtExternalSyntheticLambda0> onWarmupCompleted;

    public static final /* synthetic */ class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.values().length];
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.DESTROYED.ordinal()] = 1;
                int i = onExtraCallback + 93;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED.ordinal()] = 4;
                int i4 = onExtraCallback + 57;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            onNavigationEvent = iArr;
        }
    }

    public static /* synthetic */ boolean onExtraCallback(Ref.BooleanRef booleanRef, requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttouchevent, Ref.BooleanRef booleanRef2, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = access100 + 21;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(booleanRef, requestparentdisallowintercepttouchevent, booleanRef2, view, motionEvent);
        int i4 = access100 + 91;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return zIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~((~i3) | i7);
        int i9 = ~(i4 | i7);
        int i10 = i8 | i9;
        int i11 = i9 | i3;
        int i12 = ~(i7 | i3);
        int i13 = i6 + i3 + i2 + (1577873432 * i) + (977123338 * i5);
        int i14 = i13 * i13;
        int i15 = (((-1026819430) * i6) - 865599488) + ((-647756440) * i3) + (i10 * 189531495) + ((-189531495) * i11) + (189531495 * i12) + ((-837287936) * i2) + ((-767557632) * i) + (1290797056 * i5) + ((-539361280) * i14);
        int i16 = (i6 * (-1177406726)) + 1326046462 + (i3 * (-1177405720)) + (i10 * 503) + (i11 * (-503)) + (i12 * 503) + (i2 * (-1177406223)) + (i * 1546282648) + (i5 * (-1884272278)) + (i14 * 70909952);
        int i17 = i15 + (i16 * i16 * 451280896);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? onWarmupCompleted(objArr) : IAuthTabCallbackDefault(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ void onWarmupCompleted(Ref.BooleanRef booleanRef, requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttouchevent, ScrollView scrollView) {
        int i = 2 % 2;
        int i2 = access100 + 11;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(booleanRef, requestparentdisallowintercepttouchevent, scrollView);
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
        int i5 = access100 + 119;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [im.toss.ads_sdk.manager.NativeAdsScreenManager$activityLifecycleObserver$1] */
    /* JADX WARN: Type inference failed for: r2v9, types: [im.toss.ads_sdk.manager.NativeAdsScreenManager$fragmentLifecycleObserver$1] */
    public requestParentDisallowInterceptTouchEvent(@NotNull NativeAdsManager nativeAdsManager) {
        Intrinsics.checkNotNullParameter(nativeAdsManager, "");
        this.asBinder = nativeAdsManager;
        this.IAuthTabCallback = new IAuthTabCallback(CoroutineExceptionHandler.extraCallbackWithResult);
        this.onTransact = setShine.onNavigationEvent(0);
        this.IAuthTabCallbackDefault = new ArrayList();
        this.IAuthTabCallbackStubProxy = new ArrayList();
        this.onExtraCallback = new ArrayList();
        this.asInterface = new onNavigationEvent();
        this.onNavigationEvent = new DefaultLifecycleObserver() { // from class: im.toss.ads_sdk.manager.NativeAdsScreenManager$fragmentLifecycleObserver$1
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 79;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                if (i3 != 0) {
                    throw null;
                }
                int i4 = onExtraCallbackWithResult + 17;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 78 / 0;
                }
            }

            public void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 87;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    requestParentDisallowInterceptTouchEvent.onWarmupCompleted(this.onExtraCallback);
                } else {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    requestParentDisallowInterceptTouchEvent.onWarmupCompleted(this.onExtraCallback);
                    int i3 = 18 / 0;
                }
            }

            public void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 23;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                requestParentDisallowInterceptTouchEvent.IAuthTabCallbackDefault(this.onExtraCallback);
                int i4 = onExtraCallbackWithResult + 5;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02;
                Fragment fragment;
                FragmentActivity activity;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                WeakReference weakReferenceOnExtraCallbackWithResult = requestParentDisallowInterceptTouchEvent.onExtraCallbackWithResult(this.onExtraCallback);
                TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallbackIAuthTabCallback = null;
                if (weakReferenceOnExtraCallbackWithResult != null) {
                    textFieldScrollKtExternalSyntheticLambda02 = (TextFieldScrollKtExternalSyntheticLambda0) weakReferenceOnExtraCallbackWithResult.get();
                } else {
                    int i2 = onExtraCallbackWithResult + 37;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    textFieldScrollKtExternalSyntheticLambda02 = null;
                }
                if (textFieldScrollKtExternalSyntheticLambda02 instanceof Fragment) {
                    int i4 = onNavigationEvent + 73;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    fragment = (Fragment) textFieldScrollKtExternalSyntheticLambda02;
                } else {
                    int i6 = onNavigationEvent + 25;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 2 / 3;
                    }
                    fragment = null;
                }
                if (fragment != null && (activity = fragment.getActivity()) != null) {
                    int i8 = onExtraCallbackWithResult + 71;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    TextFieldKeyInputExternalSyntheticLambda9 lifecycle = activity.getLifecycle();
                    if (lifecycle != null) {
                        onextracallbackIAuthTabCallback = lifecycle.IAuthTabCallback();
                    }
                }
                if (onextracallbackIAuthTabCallback == TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED) {
                    requestParentDisallowInterceptTouchEvent.IAuthTabCallbackStub(this.onExtraCallback);
                }
                int i10 = onExtraCallbackWithResult + 101;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 0 / 0;
                }
            }

            public void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 113;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                requestParentDisallowInterceptTouchEvent.IAuthTabCallbackStub(this.onExtraCallback);
                requestParentDisallowInterceptTouchEvent.onNavigationEvent(this.onExtraCallback);
                int i4 = onExtraCallbackWithResult + 97;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }

            public void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 39;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    Object[] objArr = {this.onExtraCallback};
                    int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                    requestParentDisallowInterceptTouchEvent.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, -832467689, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 832467691);
                    Object[] objArr2 = {this.onExtraCallback};
                    int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                    requestParentDisallowInterceptTouchEvent.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr2, -295296608, iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 295296613);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                Object[] objArr3 = {this.onExtraCallback};
                int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                requestParentDisallowInterceptTouchEvent.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr3, -832467689, iOnNavigationEvent3, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 832467691);
                Object[] objArr4 = {this.onExtraCallback};
                int iOnNavigationEvent4 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                requestParentDisallowInterceptTouchEvent.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr4, -295296608, iOnNavigationEvent4, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 295296613);
                int i3 = onExtraCallbackWithResult + 35;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 88 / 0;
                }
            }
        };
        this.onExtraCallbackWithResult = new DefaultLifecycleObserver() { // from class: im.toss.ads_sdk.manager.NativeAdsScreenManager$activityLifecycleObserver$1
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 11;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                if (i3 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = onExtraCallback + 125;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }

            public void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 37;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                int i4 = onWarmupCompleted + 25;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 44 / 0;
                }
            }

            public void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 25;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                if (i3 == 0) {
                    int i4 = 74 / 0;
                }
                int i5 = onWarmupCompleted + 97;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) throws Throwable {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 1;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                requestParentDisallowInterceptTouchEvent.IAuthTabCallbackDefault(this.onNavigationEvent);
                requestParentDisallowInterceptTouchEvent.onWarmupCompleted(this.onNavigationEvent);
                int i4 = onWarmupCompleted + 47;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }

            public void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 5;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    requestParentDisallowInterceptTouchEvent.IAuthTabCallbackStub(this.onNavigationEvent);
                    requestParentDisallowInterceptTouchEvent.onNavigationEvent(this.onNavigationEvent);
                } else {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    requestParentDisallowInterceptTouchEvent.IAuthTabCallbackStub(this.onNavigationEvent);
                    requestParentDisallowInterceptTouchEvent.onNavigationEvent(this.onNavigationEvent);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            public void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 113;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    Object[] objArr = {this.onNavigationEvent};
                    int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                    requestParentDisallowInterceptTouchEvent.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, -832467689, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 832467691);
                    Object[] objArr2 = {this.onNavigationEvent};
                    int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                    requestParentDisallowInterceptTouchEvent.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr2, -295296608, iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 295296613);
                    return;
                }
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                Object[] objArr3 = {this.onNavigationEvent};
                int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                requestParentDisallowInterceptTouchEvent.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr3, -832467689, iOnNavigationEvent3, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 832467691);
                Object[] objArr4 = {this.onNavigationEvent};
                int iOnNavigationEvent4 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                requestParentDisallowInterceptTouchEvent.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr4, -295296608, iOnNavigationEvent4, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 295296613);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttouchevent = (requestParentDisallowInterceptTouchEvent) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 15;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        requestparentdisallowintercepttouchevent.onWarmupCompleted();
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        int i5 = access100 + 85;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallbackDefault(requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttouchevent) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 19;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        requestparentdisallowintercepttouchevent.asInterface();
        int i4 = access100 + 109;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallbackStub(requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttouchevent) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        requestparentdisallowintercepttouchevent.IAuthTabCallbackStub();
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
    }

    public static final /* synthetic */ getCornerRadius onExtraCallback(requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttouchevent) {
        int i = 2 % 2;
        int i2 = access100 + 27;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        getCornerRadius<Integer> getcornerradius = requestparentdisallowintercepttouchevent.onTransact;
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        return getcornerradius;
    }

    public static final /* synthetic */ WeakReference onExtraCallbackWithResult(requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttouchevent) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 67;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        WeakReference<TextFieldScrollKtExternalSyntheticLambda0> weakReference = requestparentdisallowintercepttouchevent.onWarmupCompleted;
        int i5 = i2 + 63;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 8 / 0;
        }
        return weakReference;
    }

    public static final /* synthetic */ void onNavigationEvent(requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttouchevent) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 83;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        requestparentdisallowintercepttouchevent.IAuthTabCallbackDefault();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 95;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttouchevent = (requestParentDisallowInterceptTouchEvent) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        requestparentdisallowintercepttouchevent.onNavigationEvent(zBooleanValue);
        if (i3 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttouchevent) {
        int i = 2 % 2;
        int i2 = access100 + 125;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, new Object[]{requestparentdisallowintercepttouchevent}, 1683347222, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1683347219);
        int i4 = getInterfaceDescriptor + 97;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onNavigationEvent extends RecyclerView.OnScrollListener {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        onNavigationEvent() {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = onNavigationEvent + 57;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(recyclerView, "");
            if (i == 0) {
                int i6 = onNavigationEvent + 97;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                if (i2 == 0) {
                    return;
                }
            }
            Object[] objArr = {requestParentDisallowInterceptTouchEvent.this, true};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            requestParentDisallowInterceptTouchEvent.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, 936665749, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -936665749);
            Object[] objArr2 = {requestParentDisallowInterceptTouchEvent.this};
            int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            requestParentDisallowInterceptTouchEvent.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr2, -871835226, iOnNavigationEvent2, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 871835227);
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 107;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(recyclerView, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(recyclerView, "");
            if (i == 0) {
                requestParentDisallowInterceptTouchEvent.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{requestParentDisallowInterceptTouchEvent.this, false}, 936665749, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -936665749);
                requestParentDisallowInterceptTouchEvent.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{requestParentDisallowInterceptTouchEvent.this}, -871835226, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 871835227);
                return;
            }
            requestParentDisallowInterceptTouchEvent.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{requestParentDisallowInterceptTouchEvent.this, true}, 936665749, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -936665749);
            int i4 = onNavigationEvent + 83;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class IAuthTabCallback extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public IAuthTabCallback(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted) {
            super(onwarmupcompleted);
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "NativeAdsScreenManager", "handled error", th, (Map) null, 122, (Object) null);
            } else {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "NativeAdsScreenManager", "handled error", th, (Map) null, 8, (Object) null);
            }
        }
    }

    private final findResAndMsg onTransact() {
        int i = 2 % 2;
        WeakReference<TextFieldScrollKtExternalSyntheticLambda0> weakReference = this.onWarmupCompleted;
        if (weakReference == null) {
            return null;
        }
        int i2 = access100 + 93;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = weakReference.get();
        if (textFieldScrollKtExternalSyntheticLambda0 == null) {
            return null;
        }
        int i4 = access100 + 11;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0);
        if (i5 != 0) {
            int i6 = 12 / 0;
        }
        int i7 = getInterfaceDescriptor + 113;
        access100 = i7 % 128;
        int i8 = i7 % 2;
        return textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
    }

    public final void onWarmupCompleted(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        WeakReference<TextFieldScrollKtExternalSyntheticLambda0> weakReference = this.onWarmupCompleted;
        if (weakReference != null) {
            int i2 = access100 + 25;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                weakReference.get();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02 = weakReference.get();
            if (textFieldScrollKtExternalSyntheticLambda02 != null) {
                int i3 = getInterfaceDescriptor + 85;
                access100 = i3 % 128;
                int i4 = i3 % 2;
                TextFieldKeyInputExternalSyntheticLambda9 lifecycle = textFieldScrollKtExternalSyntheticLambda02.getLifecycle();
                if (lifecycle != null) {
                    int i5 = access100 + 17;
                    getInterfaceDescriptor = i5 % 128;
                    int i6 = i5 % 2;
                    lifecycle.onExtraCallbackWithResult(this.onNavigationEvent);
                    lifecycle.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
                }
            }
        }
        this.onWarmupCompleted = new WeakReference<>(textFieldScrollKtExternalSyntheticLambda0);
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle2 = textFieldScrollKtExternalSyntheticLambda0.getLifecycle();
        lifecycle2.onExtraCallbackWithResult(this.onNavigationEvent);
        lifecycle2.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
        if (textFieldScrollKtExternalSyntheticLambda0 instanceof Fragment) {
            int i7 = access100 + 69;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
            lifecycle2.IAuthTabCallback(this.onNavigationEvent);
            onExtraCallbackWithResult(lifecycle2.IAuthTabCallback());
            return;
        }
        if (textFieldScrollKtExternalSyntheticLambda0 instanceof Activity) {
            lifecycle2.IAuthTabCallback(this.onExtraCallbackWithResult);
            onWarmupCompleted(lifecycle2.IAuthTabCallback());
            int i9 = access100 + 41;
            getInterfaceDescriptor = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onExtraCallbackWithResult(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback) throws NoWhenBranchMatchedException {
        int i;
        Fragment fragment;
        FragmentActivity activity;
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle;
        int i2 = 2 % 2;
        int i3 = access100 + 97;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0 ? (i = onWarmupCompleted.onNavigationEvent[onextracallback.ordinal()]) != 1 : (i = onWarmupCompleted.onNavigationEvent[onextracallback.ordinal()]) != 1) {
            int i4 = access100 + 125;
            int i5 = i4 % 128;
            getInterfaceDescriptor = i5;
            int i6 = i4 % 2;
            if (i != 2 && i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i7 = i5 + 67;
                    access100 = i7 % 128;
                    int i8 = i7 % 2;
                    onWarmupCompleted();
                    asInterface();
                    return;
                }
                WeakReference<TextFieldScrollKtExternalSyntheticLambda0> weakReference = this.onWarmupCompleted;
                TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallbackIAuthTabCallback = null;
                TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = weakReference != null ? weakReference.get() : null;
                if (textFieldScrollKtExternalSyntheticLambda0 instanceof Fragment) {
                    int i9 = getInterfaceDescriptor + 39;
                    access100 = i9 % 128;
                    int i10 = i9 % 2;
                    fragment = (Fragment) textFieldScrollKtExternalSyntheticLambda0;
                } else {
                    fragment = null;
                }
                if (fragment != null && (activity = fragment.getActivity()) != null && (lifecycle = activity.getLifecycle()) != null) {
                    onextracallbackIAuthTabCallback = lifecycle.IAuthTabCallback();
                }
                if (onextracallbackIAuthTabCallback == TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED) {
                    IAuthTabCallbackStub();
                    int i11 = getInterfaceDescriptor + 71;
                    access100 = i11 % 128;
                    int i12 = i11 % 2;
                    return;
                }
                return;
            }
        }
        onWarmupCompleted();
        IAuthTabCallbackStub();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = access100 + 113;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onWarmupCompleted.onNavigationEvent[onextracallback.ordinal()];
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            onWarmupCompleted();
            IAuthTabCallbackStub();
            return;
        }
        int i5 = getInterfaceDescriptor + 95;
        int i6 = i5 % 128;
        access100 = i6;
        int i7 = i5 % 2;
        if (i4 != 4) {
            int i8 = i6 + 83;
            getInterfaceDescriptor = i8 % 128;
            int i9 = i8 % 2;
            if (i4 != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        onWarmupCompleted();
        asInterface();
        int i10 = getInterfaceDescriptor + 47;
        access100 = i10 % 128;
        int i11 = i10 % 2;
    }

    private final void asInterface() throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgOnTransact = onTransact();
        if (findresandmsgOnTransact != null) {
            NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1109048653, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1109048646, new Object[]{this.asBinder, findresandmsgOnTransact}, nSetPosition.onExtraCallbackWithResult());
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this}, -871835226, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 871835227);
            return;
        }
        int i4 = getInterfaceDescriptor + 85;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access100 + 9;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder.IAuthTabCallbackDefault();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder.onWarmupCompleted();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final getPackageType onWarmupCompleted(Function2<? super findResAndMsg, ? super access13800<? super Unit>, ? extends Object> function2) {
        int i = 2 % 2;
        findResAndMsg findresandmsgOnTransact = onTransact();
        if (findresandmsgOnTransact == null) {
            int i2 = getInterfaceDescriptor + 55;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = access100 + 81;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(findresandmsgOnTransact, this.IAuthTabCallback, (setRandomHost) null, function2, 2, (Object) null);
        int i6 = getInterfaceDescriptor + 35;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        return getpackagetypeOnNavigationEvent;
    }

    public final void onNavigationEvent(@NotNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (viewGroup instanceof RecyclerView) {
            onExtraCallback((RecyclerView) viewGroup);
            return;
        }
        if (viewGroup instanceof ScrollView) {
            int i4 = getInterfaceDescriptor + 15;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            IAuthTabCallback((ScrollView) viewGroup);
            int i6 = access100 + 59;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttouchevent = (requestParentDisallowInterceptTouchEvent) objArr[0];
        removeNonDecorViews removenondecorviews = (removeNonDecorViews) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 17;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(removenondecorviews, "");
        requestparentdisallowintercepttouchevent.onExtraCallback.remove(removenondecorviews);
        int i4 = getInterfaceDescriptor + 89;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return null;
    }

    public final void onNavigationEvent(@NotNull removeNonDecorViews removenondecorviews) {
        int i = 2 % 2;
        int i2 = access100 + 31;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(removenondecorviews, "");
        this.onExtraCallback.add(removenondecorviews);
        int i4 = getInterfaceDescriptor + 17;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttouchevent = (requestParentDisallowInterceptTouchEvent) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            requestparentdisallowintercepttouchevent.onExtraCallbackWithResult();
            requestparentdisallowintercepttouchevent.IAuthTabCallback();
            int i3 = 19 / 0;
        } else {
            requestparentdisallowintercepttouchevent.onExtraCallbackWithResult();
            requestparentdisallowintercepttouchevent.IAuthTabCallback();
        }
        int i4 = getInterfaceDescriptor + 95;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 107;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Iterator<T> it = this.IAuthTabCallbackStubProxy.iterator();
            while (it.hasNext()) {
                int i3 = getInterfaceDescriptor + 33;
                access100 = i3 % 128;
                if (i3 % 2 == 0) {
                    ((ScrollView) it.next()).getViewTreeObserver().removeOnScrollChangedListener(this.IAuthTabCallbackStub);
                    int i4 = 88 / 0;
                } else {
                    ((ScrollView) it.next()).getViewTreeObserver().removeOnScrollChangedListener(this.IAuthTabCallbackStub);
                }
                int i5 = getInterfaceDescriptor + 41;
                access100 = i5 % 128;
                int i6 = i5 % 2;
            }
            return;
        }
        this.IAuthTabCallbackStubProxy.iterator();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Iterator<T> it = this.IAuthTabCallbackDefault.iterator();
        while (it.hasNext()) {
            ((RecyclerView) it.next()).removeOnScrollListener(this.asInterface);
            int i4 = getInterfaceDescriptor + 59;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final void onExtraCallback(RecyclerView recyclerView) {
        int i = 2 % 2;
        int i2 = access100 + 7;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        recyclerView.addOnScrollListener(this.asInterface);
        this.IAuthTabCallbackDefault.add(recyclerView);
        int i4 = access100 + 25;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean IAuthTabCallback(Ref.BooleanRef booleanRef, requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttouchevent, Ref.BooleanRef booleanRef2, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int action = motionEvent.getAction();
        if (action != 0) {
            int i2 = access100 + 57;
            int i3 = i2 % 128;
            getInterfaceDescriptor = i3;
            if (i2 % 2 == 0 ? action == 1 : action == 1) {
                booleanRef.element = false;
                if (!booleanRef2.element) {
                    int i4 = access100 + 111;
                    getInterfaceDescriptor = i4 % 128;
                    int i5 = i4 % 2;
                    requestparentdisallowintercepttouchevent.onNavigationEvent(false);
                    int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                    onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{requestparentdisallowintercepttouchevent}, -871835226, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 871835227);
                }
            } else if (action == 2) {
                booleanRef.element = true;
                requestparentdisallowintercepttouchevent.onNavigationEvent(true);
            } else if (action != 3) {
                int i6 = i3 + 111;
                access100 = i6 % 128;
                int i7 = i6 % 2;
                if (action == 8) {
                }
            }
        }
        return false;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Ref.BooleanRef $isScrolling;
        final /* synthetic */ Ref.BooleanRef $isTouching;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$isTouching = booleanRef;
            this.$isScrolling = booleanRef2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = requestParentDisallowInterceptTouchEvent.this.new onExtraCallback(this.$isTouching, this.$isScrolling, access13800Var);
            int i2 = onWarmupCompleted + 87;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 33 / 0;
            }
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 65;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 11;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 != 0) {
                int i4 = onExtraCallback + 89;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0 ? i3 != 1 : i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                IAnimation iAnimationOnExtraCallbackWithResult = ycxycx.onExtraCallbackWithResult(requestParentDisallowInterceptTouchEvent.onExtraCallback(requestParentDisallowInterceptTouchEvent.this), 100L);
                final Ref.BooleanRef booleanRef = this.$isTouching;
                final Ref.BooleanRef booleanRef2 = this.$isScrolling;
                final requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttouchevent = requestParentDisallowInterceptTouchEvent.this;
                setRipple setripple = new setRipple() { // from class: o.requestParentDisallowInterceptTouchEvent.onExtraCallback.2
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public /* synthetic */ Object emit(Object obj3, access13800 access13800Var) {
                        int i5 = 2 % 2;
                        int i6 = onNavigationEvent + 61;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        Object objIAuthTabCallback = IAuthTabCallback(((Number) obj3).intValue(), access13800Var);
                        int i8 = onNavigationEvent + 43;
                        onExtraCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            return objIAuthTabCallback;
                        }
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }

                    public final Object IAuthTabCallback(int i5, access13800<? super Unit> access13800Var) {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallback + 9;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        if (!booleanRef.element) {
                            int i9 = onNavigationEvent + 89;
                            onExtraCallback = i9 % 128;
                            int i10 = i9 % 2;
                            booleanRef2.element = false;
                            requestParentDisallowInterceptTouchEvent.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{requestparentdisallowintercepttouchevent, false}, 936665749, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -936665749);
                            requestParentDisallowInterceptTouchEvent.onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{requestparentdisallowintercepttouchevent}, -871835226, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 871835227);
                            int i11 = onExtraCallback + 19;
                            onNavigationEvent = i11 % 128;
                            int i12 = i11 % 2;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (iAnimationOnExtraCallbackWithResult.collect(setripple, this) == objOnWarmupCompleted) {
                    int i5 = onExtraCallback + 97;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnWarmupCompleted;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i7 = onWarmupCompleted + 39;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    private static final void IAuthTabCallback(Ref.BooleanRef booleanRef, requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttouchevent, ScrollView scrollView) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            booleanRef.element = true;
            requestparentdisallowintercepttouchevent.onNavigationEvent(false);
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, new Object[]{requestparentdisallowintercepttouchevent}, -871835226, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 871835227);
        } else {
            booleanRef.element = true;
            requestparentdisallowintercepttouchevent.onNavigationEvent(true);
            int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int iOnNavigationEvent4 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent4, new Object[]{requestparentdisallowintercepttouchevent}, -871835226, iOnNavigationEvent3, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 871835227);
        }
        requestparentdisallowintercepttouchevent.onTransact.onWarmupCompleted(Integer.valueOf(scrollView.getScrollY()));
    }

    private final void IAuthTabCallback(final ScrollView scrollView) {
        int i = 2 % 2;
        onExtraCallbackWithResult();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        scrollView.setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.ads_sdk.manager.NativeAdsScreenManager$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 21;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Ref.BooleanRef booleanRef3 = booleanRef;
                if (i4 != 0) {
                    return requestParentDisallowInterceptTouchEvent.onExtraCallback(booleanRef3, this, booleanRef2, view, motionEvent);
                }
                requestParentDisallowInterceptTouchEvent.onExtraCallback(booleanRef3, this, booleanRef2, view, motionEvent);
                throw null;
            }
        });
        onWarmupCompleted(new onExtraCallback(booleanRef, booleanRef2, null));
        this.IAuthTabCallbackStub = new ViewTreeObserver.OnScrollChangedListener() { // from class: im.toss.ads_sdk.manager.NativeAdsScreenManager$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 3;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Ref.BooleanRef booleanRef3 = booleanRef2;
                if (i4 == 0) {
                    requestParentDisallowInterceptTouchEvent.onWarmupCompleted(booleanRef3, this, scrollView);
                    return;
                }
                requestParentDisallowInterceptTouchEvent.onWarmupCompleted(booleanRef3, this, scrollView);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        scrollView.getViewTreeObserver().addOnScrollChangedListener(this.IAuthTabCallbackStub);
        this.IAuthTabCallbackStubProxy.add(scrollView);
        int i2 = access100 + 91;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 29 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[PHI: r6
      0x0069: PHI (r6v7 android.view.View) = (r6v6 android.view.View), (r6v11 android.view.View) binds: [B:21:0x0067, B:18:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallbackDefault() {
        LinearLayoutManager linearLayoutManager;
        View childAt;
        int i = 2 % 2;
        Iterator<T> it = this.onExtraCallback.iterator();
        while (it.hasNext()) {
            int i2 = getInterfaceDescriptor + 93;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            ((removeNonDecorViews) it.next()).onExtraCallbackWithResult();
        }
        Iterator<T> it2 = this.IAuthTabCallbackDefault.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            LinearLayoutManager layoutManager = ((RecyclerView) it2.next()).getLayoutManager();
            linearLayoutManager = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
            if (linearLayoutManager != null) {
                int childCount = linearLayoutManager.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    int i5 = getInterfaceDescriptor + 31;
                    access100 = i5 % 128;
                    if (i5 % 2 == 0) {
                        childAt = linearLayoutManager.getChildAt(i4);
                        int i6 = 48 / 0;
                        if (childAt != null) {
                            if (childAt.isShown()) {
                                for (NativeAdsContainerView nativeAdsContainerView : IAuthTabCallback(childAt)) {
                                    int i7 = getInterfaceDescriptor + 119;
                                    access100 = i7 % 128;
                                    int i8 = i7 % 2;
                                    if (!Intrinsics.areEqual(nativeAdsContainerView.IAuthTabCallbackStub(), this.asBinder)) {
                                        nativeAdsContainerView.onNavigationEvent(this.asBinder);
                                    }
                                    nativeAdsContainerView.onNavigationEvent();
                                }
                            }
                        }
                    } else {
                        childAt = linearLayoutManager.getChildAt(i4);
                        if (childAt != null) {
                        }
                    }
                }
            }
        }
        Iterator<T> it3 = this.IAuthTabCallbackStubProxy.iterator();
        while (it3.hasNext()) {
            View childAt2 = ((ScrollView) it3.next()).getChildAt(0);
            ViewGroup viewGroup = childAt2 instanceof ViewGroup ? (ViewGroup) childAt2 : null;
            if (viewGroup != null) {
                int childCount2 = viewGroup.getChildCount();
                for (int i9 = 0; i9 < childCount2; i9++) {
                    View childAt3 = viewGroup.getChildAt(i9);
                    Intrinsics.checkNotNull(childAt3);
                    for (NativeAdsContainerView nativeAdsContainerView2 : IAuthTabCallback(childAt3)) {
                        if (!Intrinsics.areEqual(nativeAdsContainerView2.IAuthTabCallbackStub(), this.asBinder)) {
                            int i10 = access100 + 113;
                            getInterfaceDescriptor = i10 % 128;
                            if (i10 % 2 != 0) {
                                nativeAdsContainerView2.onNavigationEvent(this.asBinder);
                                linearLayoutManager.hashCode();
                                throw null;
                            }
                            nativeAdsContainerView2.onNavigationEvent(this.asBinder);
                        }
                        nativeAdsContainerView2.onNavigationEvent();
                    }
                }
            }
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Iterator it;
        requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttouchevent = (requestParentDisallowInterceptTouchEvent) objArr[0];
        int i = 2 % 2;
        Iterator<T> it2 = requestparentdisallowintercepttouchevent.onExtraCallback.iterator();
        while (it2.hasNext()) {
            ((removeNonDecorViews) it2.next()).onNavigationEvent();
        }
        Iterator<T> it3 = requestparentdisallowintercepttouchevent.IAuthTabCallbackDefault.iterator();
        int i2 = access100 + 123;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        while (it3.hasNext()) {
            int i4 = access100 + 47;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            LinearLayoutManager layoutManager = ((RecyclerView) it3.next()).getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
            if (linearLayoutManager != null) {
                int childCount = linearLayoutManager.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = linearLayoutManager.getChildAt(i6);
                    if (childAt != null && childAt.isShown()) {
                        int i7 = access100 + 109;
                        getInterfaceDescriptor = i7 % 128;
                        if (i7 % 2 != 0) {
                            it = requestparentdisallowintercepttouchevent.IAuthTabCallback(childAt).iterator();
                            int i8 = 7 / 0;
                        } else {
                            it = requestparentdisallowintercepttouchevent.IAuthTabCallback(childAt).iterator();
                        }
                        while (it.hasNext()) {
                            int i9 = access100 + 7;
                            getInterfaceDescriptor = i9 % 128;
                            int i10 = i9 % 2;
                            NativeAdsContainerView nativeAdsContainerView = (NativeAdsContainerView) it.next();
                            if (!Intrinsics.areEqual(nativeAdsContainerView.IAuthTabCallbackStub(), requestparentdisallowintercepttouchevent.asBinder)) {
                                int i11 = access100 + 113;
                                getInterfaceDescriptor = i11 % 128;
                                if (i11 % 2 != 0) {
                                    nativeAdsContainerView.onNavigationEvent(requestparentdisallowintercepttouchevent.asBinder);
                                    throw null;
                                }
                                nativeAdsContainerView.onNavigationEvent(requestparentdisallowintercepttouchevent.asBinder);
                            }
                            nativeAdsContainerView.asBinder();
                        }
                    }
                }
            }
        }
        Iterator<T> it4 = requestparentdisallowintercepttouchevent.IAuthTabCallbackStubProxy.iterator();
        while (it4.hasNext()) {
            View childAt2 = ((ScrollView) it4.next()).getChildAt(0);
            ViewGroup viewGroup = childAt2 instanceof ViewGroup ? (ViewGroup) childAt2 : null;
            if (viewGroup != null) {
                int childCount2 = viewGroup.getChildCount();
                for (int i12 = 0; i12 < childCount2; i12++) {
                    View childAt3 = viewGroup.getChildAt(i12);
                    Intrinsics.checkNotNull(childAt3);
                    for (NativeAdsContainerView nativeAdsContainerView2 : requestparentdisallowintercepttouchevent.IAuthTabCallback(childAt3)) {
                        int i13 = getInterfaceDescriptor + 13;
                        access100 = i13 % 128;
                        int i14 = i13 % 2;
                        if (!Intrinsics.areEqual(nativeAdsContainerView2.IAuthTabCallbackStub(), requestparentdisallowintercepttouchevent.asBinder)) {
                            nativeAdsContainerView2.onNavigationEvent(requestparentdisallowintercepttouchevent.asBinder);
                        }
                        nativeAdsContainerView2.asBinder();
                    }
                }
            }
        }
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttouchevent = (requestParentDisallowInterceptTouchEvent) objArr[0];
        int i = 2 % 2;
        Iterator<T> it = requestparentdisallowintercepttouchevent.onExtraCallback.iterator();
        while (it.hasNext()) {
            ((removeNonDecorViews) it.next()).IAuthTabCallback();
        }
        Iterator<T> it2 = requestparentdisallowintercepttouchevent.IAuthTabCallbackDefault.iterator();
        while (true) {
            Object obj = null;
            if (!it2.hasNext()) {
                Iterator<T> it3 = requestparentdisallowintercepttouchevent.IAuthTabCallbackStubProxy.iterator();
                while (it3.hasNext()) {
                    View childAt = ((ScrollView) it3.next()).getChildAt(0);
                    ViewGroup viewGroup = (childAt instanceof ViewGroup) ^ true ? null : (ViewGroup) childAt;
                    if (viewGroup != null) {
                        int childCount = viewGroup.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            int i3 = getInterfaceDescriptor + 113;
                            access100 = i3 % 128;
                            if (i3 % 2 == 0) {
                                View childAt2 = viewGroup.getChildAt(i2);
                                Intrinsics.checkNotNull(childAt2);
                                requestparentdisallowintercepttouchevent.IAuthTabCallback(childAt2).iterator();
                                obj.hashCode();
                                throw null;
                            }
                            View childAt3 = viewGroup.getChildAt(i2);
                            Intrinsics.checkNotNull(childAt3);
                            for (NativeAdsContainerView nativeAdsContainerView : requestparentdisallowintercepttouchevent.IAuthTabCallback(childAt3)) {
                                int i4 = getInterfaceDescriptor + 109;
                                access100 = i4 % 128;
                                int i5 = i4 % 2;
                                if (!Intrinsics.areEqual(nativeAdsContainerView.IAuthTabCallbackStub(), requestparentdisallowintercepttouchevent.asBinder)) {
                                    nativeAdsContainerView.onNavigationEvent(requestparentdisallowintercepttouchevent.asBinder);
                                }
                                nativeAdsContainerView.onExtraCallbackWithResult();
                            }
                        }
                    }
                }
                return null;
            }
            int i6 = getInterfaceDescriptor + 9;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            LinearLayoutManager layoutManager = ((RecyclerView) it2.next()).getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
            if (linearLayoutManager != null) {
                int childCount2 = linearLayoutManager.getChildCount();
                int i8 = getInterfaceDescriptor + 89;
                access100 = i8 % 128;
                int i9 = i8 % 2;
                for (int i10 = 0; i10 < childCount2; i10++) {
                    View childAt4 = linearLayoutManager.getChildAt(i10);
                    if (childAt4 != null && childAt4.isShown()) {
                        for (NativeAdsContainerView nativeAdsContainerView2 : requestparentdisallowintercepttouchevent.IAuthTabCallback(childAt4)) {
                            int i11 = getInterfaceDescriptor + 91;
                            access100 = i11 % 128;
                            int i12 = i11 % 2;
                            if (!Intrinsics.areEqual(nativeAdsContainerView2.IAuthTabCallbackStub(), requestparentdisallowintercepttouchevent.asBinder)) {
                                int i13 = getInterfaceDescriptor + 103;
                                access100 = i13 % 128;
                                if (i13 % 2 == 0) {
                                    nativeAdsContainerView2.onNavigationEvent(requestparentdisallowintercepttouchevent.asBinder);
                                    obj.hashCode();
                                    throw null;
                                }
                                nativeAdsContainerView2.onNavigationEvent(requestparentdisallowintercepttouchevent.asBinder);
                            }
                            nativeAdsContainerView2.onExtraCallbackWithResult();
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(boolean z) {
        ViewGroup viewGroup;
        int childCount;
        int i;
        LinearLayoutManager linearLayoutManager;
        int i2 = 2 % 2;
        Iterator<T> it = this.onExtraCallback.iterator();
        while (it.hasNext()) {
            ((removeNonDecorViews) it.next()).IAuthTabCallback(z);
        }
        Iterator<T> it2 = this.IAuthTabCallbackDefault.iterator();
        int i3 = access100 + 107;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 % 4;
        }
        while (it2.hasNext()) {
            LinearLayoutManager layoutManager = ((RecyclerView) it2.next()).getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                int i5 = getInterfaceDescriptor + 85;
                access100 = i5 % 128;
                int i6 = i5 % 2;
                linearLayoutManager = layoutManager;
            } else {
                linearLayoutManager = null;
            }
            if (linearLayoutManager != null) {
                int childCount2 = linearLayoutManager.getChildCount();
                for (int i7 = 0; i7 < childCount2; i7++) {
                    int i8 = access100 + 65;
                    getInterfaceDescriptor = i8 % 128;
                    int i9 = i8 % 2;
                    View childAt = linearLayoutManager.getChildAt(i7);
                    if (childAt != null) {
                        int i10 = getInterfaceDescriptor + 77;
                        access100 = i10 % 128;
                        if (i10 % 2 == 0) {
                            int i11 = 14 / 0;
                            if (childAt.isShown()) {
                                Iterator<T> it3 = IAuthTabCallback(childAt).iterator();
                                while (it3.hasNext()) {
                                    int i12 = access100 + 107;
                                    getInterfaceDescriptor = i12 % 128;
                                    if (i12 % 2 != 0) {
                                        Intrinsics.areEqual(((NativeAdsContainerView) it3.next()).IAuthTabCallbackStub(), this.asBinder);
                                        throw null;
                                    }
                                    NativeAdsContainerView nativeAdsContainerView = (NativeAdsContainerView) it3.next();
                                    if (!Intrinsics.areEqual(nativeAdsContainerView.IAuthTabCallbackStub(), this.asBinder)) {
                                        nativeAdsContainerView.onNavigationEvent(this.asBinder);
                                    }
                                    nativeAdsContainerView.onExtraCallbackWithResult(z);
                                }
                            } else {
                                continue;
                            }
                        } else if (!childAt.isShown()) {
                            continue;
                        }
                    }
                }
            }
        }
        Iterator<T> it4 = this.IAuthTabCallbackStubProxy.iterator();
        while (it4.hasNext()) {
            View childAt2 = ((ScrollView) it4.next()).getChildAt(0);
            if (childAt2 instanceof ViewGroup) {
                viewGroup = (ViewGroup) childAt2;
            } else {
                int i13 = getInterfaceDescriptor + 111;
                access100 = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 2 % 3;
                }
                viewGroup = null;
            }
            if (viewGroup != null) {
                int i15 = access100 + 29;
                getInterfaceDescriptor = i15 % 128;
                if (i15 % 2 != 0) {
                    childCount = viewGroup.getChildCount();
                    i = 1;
                } else {
                    childCount = viewGroup.getChildCount();
                    i = 0;
                }
                while (i < childCount) {
                    View childAt3 = viewGroup.getChildAt(i);
                    Intrinsics.checkNotNull(childAt3);
                    for (NativeAdsContainerView nativeAdsContainerView2 : IAuthTabCallback(childAt3)) {
                        if (!Intrinsics.areEqual(nativeAdsContainerView2.IAuthTabCallbackStub(), this.asBinder)) {
                            int i16 = access100 + 11;
                            getInterfaceDescriptor = i16 % 128;
                            int i17 = i16 % 2;
                            nativeAdsContainerView2.onNavigationEvent(this.asBinder);
                        }
                        nativeAdsContainerView2.onExtraCallbackWithResult(z);
                    }
                    i++;
                }
            }
        }
    }

    private final List<NativeAdsContainerView> IAuthTabCallback(View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 103;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (view instanceof NativeAdsContainerView) {
            return CollectionsKt.listOf(view);
        }
        if (view instanceof ViewGroup) {
            ArrayList arrayList = new ArrayList();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int i4 = 0;
            while (i4 < childCount) {
                View childAt = viewGroup.getChildAt(i4);
                Intrinsics.checkNotNullExpressionValue(childAt, "");
                CollectionsKt.addAll(arrayList, IAuthTabCallback(childAt));
                i4++;
                int i5 = getInterfaceDescriptor + 81;
                access100 = i5 % 128;
                int i6 = i5 % 2;
            }
            return arrayList;
        }
        List<NativeAdsContainerView> listEmptyList = CollectionsKt.emptyList();
        int i7 = access100 + 63;
        getInterfaceDescriptor = i7 % 128;
        int i8 = i7 % 2;
        return listEmptyList;
    }

    public static final /* synthetic */ void IAuthTabCallback(requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttouchevent) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, new Object[]{requestparentdisallowintercepttouchevent}, -295296608, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 295296613);
    }

    public static final /* synthetic */ void onWarmupCompleted(requestParentDisallowInterceptTouchEvent requestparentdisallowintercepttouchevent, boolean z) {
        Object[] objArr = {requestparentdisallowintercepttouchevent, Boolean.valueOf(z)};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, 936665749, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -936665749);
    }

    private final void asBinder() {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this}, 1683347222, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1683347219);
    }

    public final void onExtraCallback() {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this}, -832467689, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 832467691);
    }

    public final void onNavigationEvent() {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this}, -871835226, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 871835227);
    }

    public final void onWarmupCompleted(@NotNull removeNonDecorViews removenondecorviews) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        onNavigationEvent(setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this, removenondecorviews}, -912883003, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 912883007);
    }
}
