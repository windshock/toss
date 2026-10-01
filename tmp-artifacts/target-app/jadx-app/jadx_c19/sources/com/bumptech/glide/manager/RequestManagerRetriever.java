package com.bumptech.glide.manager;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.FlowRowOverflowCompanionExternalSyntheticLambda4;
import o.MultiParagraphIntrinsicsExternalSyntheticLambda1;
import o.SaversKtExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.applyConstraintsFromLayoutParams;
import o.markHierarchyDirty;
import o.onMeasure;
import o.releaseWaiters;
import o.setLastHorizontalBias;
import o.setPaddingBottom;
import o.setPaddingLeft;
import o.setPaddingRight;
import o.setPaddingTop;
import o.setVerticalAlign;
import o.setVerticalGap;
import o.setVerticalStyle;
import o.setVisitUrl;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class RequestManagerRetriever implements Handler.Callback {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 0;
    private static int access100 = 1;
    private static int getInterfaceDescriptor = 1;
    private static final RequestManagerFactory onExtraCallback;
    private final setPaddingLeft IAuthTabCallbackStub;
    private final Handler asInterface;
    private final RequestManagerFactory onExtraCallbackWithResult;
    private volatile RequestManager onWarmupCompleted;
    final Map<FragmentManager, RequestManagerFragment> onNavigationEvent = new HashMap();
    final Map<FlowMeasureLazyPolicyExternalSyntheticLambda3, setVerticalGap> IAuthTabCallback = new HashMap();
    private final onMeasure<View, Fragment> IAuthTabCallbackDefault = new onMeasure<>();
    private final onMeasure<View, android.app.Fragment> onTransact = new onMeasure<>();
    private final Bundle asBinder = new Bundle();

    public interface RequestManagerFactory {
        RequestManager onExtraCallbackWithResult(@NonNull Glide glide, @NonNull setVerticalStyle setverticalstyle, @NonNull RequestManagerTreeNode requestManagerTreeNode, @NonNull Context context);
    }

    public static /* synthetic */ Object onExtraCallback(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~i5;
        int i9 = ~i3;
        int i10 = ~(i8 | i9);
        int i11 = i2 | i10;
        int i12 = (~(i8 | i2)) | i10 | (~(i9 | i2));
        int i13 = ~((~i2) | i5 | i3);
        int i14 = i5 + i3 + i4 + ((-2027816600) * i6) + ((-1234684791) * i7);
        int i15 = i14 * i14;
        int i16 = (i5 * (-132237830)) + 1711013888 + ((-132237830) * i3) + (i11 * 228444679) + (228444679 * i12) + ((-228444679) * i13) + (96206848 * i4) + (811597824 * i6) + (1100742656 * i7) + (1751056384 * i15);
        int i17 = ((i5 * 572746074) - 905264446) + (i3 * 572746074) + (i11 * (-489)) + (i12 * (-489)) + (i13 * 489) + (i4 * 572745585) + (i6 * 982511336) + (i7 * (-774025351)) + (i15 * 1257177088);
        int i18 = i16 + (i17 * i17 * 1874919424);
        return i18 != 1 ? i18 != 2 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallbackStubProxy ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i4 = $10 + 43;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i6 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallbackStubProxy)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 45813), 83 - Process.getGidForName(""), 21233 - (ViewConfiguration.getTapTimeout() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 14185), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 19, 8808 - ExpandableListView.getPackedPositionGroup(0L), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i7 = $11 + 77;
                $10 = i7 % 128;
                int i8 = i7 % 2;
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

    public RequestManagerRetriever(@Nullable RequestManagerFactory requestManagerFactory, SaversKtExternalSyntheticLambda0 saversKtExternalSyntheticLambda0) {
        if (requestManagerFactory == null) {
            requestManagerFactory = onExtraCallback;
            int i2 = access100 + 9;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.onExtraCallbackWithResult = requestManagerFactory;
        this.asInterface = new Handler(Looper.getMainLooper(), this);
        this.IAuthTabCallbackStub = onExtraCallback(saversKtExternalSyntheticLambda0);
        int i5 = access000 + 1;
        access100 = i5 % 128;
        int i6 = i5 % 2;
    }

    private static setPaddingLeft onExtraCallback(SaversKtExternalSyntheticLambda0 saversKtExternalSyntheticLambda0) {
        int i2 = 2 % 2;
        int i3 = access100 + 41;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            if (!releaseWaiters.onExtraCallbackWithResult || !releaseWaiters.IAuthTabCallback) {
                return new setPaddingTop();
            }
            if (saversKtExternalSyntheticLambda0.onWarmupCompleted(MultiParagraphIntrinsicsExternalSyntheticLambda1.onWarmupCompleted.class)) {
                setVerticalAlign setverticalalign = new setVerticalAlign();
                int i4 = access000 + 29;
                access100 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 19 / 0;
                }
                return setverticalalign;
            }
            return new setPaddingRight();
        }
        boolean z = releaseWaiters.onExtraCallbackWithResult;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private RequestManager onExtraCallback(@NonNull Context context) {
        if (this.onWarmupCompleted == null) {
            synchronized (this) {
                if (this.onWarmupCompleted == null) {
                    this.onWarmupCompleted = this.onExtraCallbackWithResult.onExtraCallbackWithResult(Glide.onNavigationEvent(context.getApplicationContext()), new setLastHorizontalBias(), new setPaddingBottom(), context.getApplicationContext());
                }
            }
        }
        return this.onWarmupCompleted;
    }

    public RequestManager onWarmupCompleted(@NonNull Context context) {
        int i2 = 2 % 2;
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        int i3 = access100 + 37;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        if (applyConstraintsFromLayoutParams.onWarmupCompleted()) {
            int i5 = access000 + 101;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            if (!(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return onNavigationEvent((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return onWarmupCompleted((Activity) context);
                }
                if (!(!(context instanceof ContextWrapper))) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return onWarmupCompleted(contextWrapper.getBaseContext());
                    }
                }
            }
        }
        return onExtraCallback(context);
    }

    public RequestManager onNavigationEvent(@NonNull FragmentActivity fragmentActivity) {
        int i2 = 2 % 2;
        int i3 = access000 + 89;
        access100 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            if (applyConstraintsFromLayoutParams.IAuthTabCallback()) {
                return onWarmupCompleted(fragmentActivity.getApplicationContext());
            }
            onExtraCallback(setVisitUrl.onExtraCallbackWithResult(), 173589507, new Object[]{fragmentActivity}, setVisitUrl.onExtraCallbackWithResult(), -173589505, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult());
            RequestManager requestManager = (RequestManager) onExtraCallback(setVisitUrl.onExtraCallbackWithResult(), -1618011442, new Object[]{this, fragmentActivity, fragmentActivity.getSupportFragmentManager(), null, Boolean.valueOf(onExtraCallbackWithResult((Context) fragmentActivity))}, setVisitUrl.onExtraCallbackWithResult(), 1618011443, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult());
            int i4 = access000 + 3;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                return requestManager;
            }
            obj.hashCode();
            throw null;
        }
        applyConstraintsFromLayoutParams.IAuthTabCallback();
        throw null;
    }

    public RequestManager IAuthTabCallback(@NonNull Fragment fragment) {
        int i2 = 2 % 2;
        int i3 = access100 + 3;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            markHierarchyDirty.onExtraCallbackWithResult(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
            applyConstraintsFromLayoutParams.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        markHierarchyDirty.onExtraCallbackWithResult(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (applyConstraintsFromLayoutParams.IAuthTabCallback()) {
            return onWarmupCompleted(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            int i4 = access100 + 107;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            fragment.getActivity();
            int i6 = access000 + 47;
            access100 = i6 % 128;
            int i7 = i6 % 2;
        }
        return (RequestManager) onExtraCallback(setVisitUrl.onExtraCallbackWithResult(), -1618011442, new Object[]{this, fragment.getContext(), fragment.getChildFragmentManager(), fragment, Boolean.valueOf(fragment.isVisible())}, setVisitUrl.onExtraCallbackWithResult(), 1618011443, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r9 instanceof androidx.fragment.app.FragmentActivity) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        return onNavigationEvent((androidx.fragment.app.FragmentActivity) r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        onExtraCallback(o.setVisitUrl.onExtraCallbackWithResult(), 173589507, new java.lang.Object[]{r9}, o.setVisitUrl.onExtraCallbackWithResult(), -173589505, o.setVisitUrl.onExtraCallbackWithResult(), o.setVisitUrl.onExtraCallbackWithResult());
        r9 = IAuthTabCallback(r9, r9.getFragmentManager(), null, onExtraCallbackWithResult((android.content.Context) r9));
        r1 = com.bumptech.glide.manager.RequestManagerRetriever.access100 + 3;
        com.bumptech.glide.manager.RequestManagerRetriever.access000 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
    
        if ((r1 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        return onWarmupCompleted(r9.getApplicationContext());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (o.applyConstraintsFromLayoutParams.IAuthTabCallback() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if ((!o.applyConstraintsFromLayoutParams.IAuthTabCallback()) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RequestManager onWarmupCompleted(@NonNull Activity activity) {
        int i2 = 2 % 2;
        int i3 = access100 + 125;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 70 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        if (r5 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r5 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        return IAuthTabCallback(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
    
        return onNavigationEvent(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RequestManager onNavigationEvent(@NonNull View view) {
        FragmentActivity fragmentActivity;
        Fragment fragmentOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        int i3 = access000 + 107;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        if (!applyConstraintsFromLayoutParams.IAuthTabCallback()) {
            markHierarchyDirty.onExtraCallbackWithResult(view);
            markHierarchyDirty.onExtraCallbackWithResult(view.getContext(), "Unable to obtain a request manager for a view without a Context");
            Activity activityOnNavigationEvent = onNavigationEvent(view.getContext());
            if (activityOnNavigationEvent == null) {
                return onWarmupCompleted(view.getContext().getApplicationContext());
            }
            if (activityOnNavigationEvent instanceof FragmentActivity) {
                int i5 = access100 + 77;
                access000 = i5 % 128;
                if (i5 % 2 != 0) {
                    fragmentActivity = (FragmentActivity) activityOnNavigationEvent;
                    fragmentOnExtraCallbackWithResult = onExtraCallbackWithResult(view, fragmentActivity);
                    int i6 = 39 / 0;
                } else {
                    fragmentActivity = (FragmentActivity) activityOnNavigationEvent;
                    fragmentOnExtraCallbackWithResult = onExtraCallbackWithResult(view, fragmentActivity);
                }
            } else {
                android.app.Fragment fragmentOnExtraCallbackWithResult2 = onExtraCallbackWithResult(view, activityOnNavigationEvent);
                if (fragmentOnExtraCallbackWithResult2 == null) {
                    return onWarmupCompleted(activityOnNavigationEvent);
                }
                return onExtraCallback(fragmentOnExtraCallbackWithResult2);
            }
        } else {
            int i7 = access000 + 119;
            access100 = i7 % 128;
            if (i7 % 2 != 0) {
                return onWarmupCompleted(view.getContext().getApplicationContext());
            }
            int i8 = 1 / 0;
            return onWarmupCompleted(view.getContext().getApplicationContext());
        }
    }

    private static void onExtraCallback(@Nullable Collection<Fragment> collection, @NonNull Map<View, Fragment> map) {
        int i2 = 2 % 2;
        if (collection != null) {
            int i3 = access100 + 125;
            access000 = i3 % 128;
            if (i3 % 2 == 0) {
                for (Fragment fragment : collection) {
                    if (fragment != null) {
                        int i4 = access000 + 103;
                        access100 = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 51 / 0;
                            if (fragment.getView() != null) {
                                map.put(fragment.getView(), fragment);
                                onExtraCallback(fragment.getChildFragmentManager().onActivityLayout(), map);
                            }
                        } else if (fragment.getView() != null) {
                            map.put(fragment.getView(), fragment);
                            onExtraCallback(fragment.getChildFragmentManager().onActivityLayout(), map);
                        }
                    }
                }
                return;
            }
            collection.iterator();
            throw null;
        }
    }

    private Fragment onExtraCallbackWithResult(@NonNull View view, @NonNull FragmentActivity fragmentActivity) {
        int i2 = 2 % 2;
        int i3 = access100 + 81;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackDefault.clear();
        onExtraCallback(fragmentActivity.getSupportFragmentManager().onActivityLayout(), this.IAuthTabCallbackDefault);
        View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        int i5 = access000 + 89;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = (Fragment) this.IAuthTabCallbackDefault.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.IAuthTabCallbackDefault.clear();
        return fragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        r5.onTransact.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        return r2;
     */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private android.app.Fragment onExtraCallbackWithResult(@NonNull View view, @NonNull Activity activity) {
        int i2 = 2 % 2;
        int i3 = access100 + 5;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        this.onTransact.clear();
        onExtraCallbackWithResult(activity.getFragmentManager(), this.onTransact);
        View viewFindViewById = activity.findViewById(R.id.content);
        Object obj = null;
        android.app.Fragment fragment = null;
        while (true) {
            if (!view.equals(viewFindViewById)) {
                int i5 = access000 + 95;
                access100 = i5 % 128;
                int i6 = i5 % 2;
                fragment = (android.app.Fragment) this.onTransact.get(view);
                if (fragment == null) {
                    if (!(view.getParent() instanceof View)) {
                        break;
                    }
                    int i7 = access000 + 93;
                    access100 = i7 % 128;
                    if (i7 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    view = (View) view.getParent();
                } else {
                    int i8 = access000 + 47;
                    access100 = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 93 / 0;
                    }
                }
            } else {
                break;
            }
        }
    }

    @Deprecated
    private void onExtraCallbackWithResult(@NonNull FragmentManager fragmentManager, @NonNull onMeasure<View, android.app.Fragment> onmeasure) {
        int i2 = 2 % 2;
        int i3 = access100 + 89;
        access000 = i3 % 128;
        if (i3 % 2 == 0 ? Build.VERSION.SDK_INT < 26 : Build.VERSION.SDK_INT < 35) {
            onExtraCallback(setVisitUrl.onExtraCallbackWithResult(), 1556241674, new Object[]{this, fragmentManager, onmeasure}, setVisitUrl.onExtraCallbackWithResult(), -1556241674, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult());
            int i4 = access000 + 97;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 40 / 0;
                return;
            }
            return;
        }
        for (android.app.Fragment fragment : fragmentManager.getFragments()) {
            int i6 = access100 + 107;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            if (fragment.getView() != null) {
                onmeasure.put(fragment.getView(), fragment);
                onExtraCallbackWithResult(fragment.getChildFragmentManager(), onmeasure);
            }
        }
        int i8 = access100 + 39;
        access000 = i8 % 128;
        int i9 = i8 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        android.app.Fragment fragment;
        RequestManagerRetriever requestManagerRetriever = (RequestManagerRetriever) objArr[0];
        FragmentManager fragmentManager = (FragmentManager) objArr[1];
        onMeasure<View, android.app.Fragment> onmeasure = (onMeasure) objArr[2];
        int i2 = 2 % 2;
        int i3 = 0;
        while (true) {
            Bundle bundle = requestManagerRetriever.asBinder;
            Object[] objArr2 = new Object[1];
            a(new char[]{15796, 15839, 22021, 62970, 28774, 14123, 8266}, ViewConfiguration.getDoubleTapTimeout() >> 16, objArr2);
            bundle.putInt(((String) objArr2[0]).intern(), i3);
            try {
                Bundle bundle2 = requestManagerRetriever.asBinder;
                Object[] objArr3 = new Object[1];
                a(new char[]{15796, 15839, 22021, 62970, 28774, 14123, 8266}, ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr3);
                fragment = fragmentManager.getFragment(bundle2, ((String) objArr3[0]).intern());
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment == null) {
                int i4 = access100 + 89;
                access000 = i4 % 128;
                if (i4 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            if (fragment.getView() != null) {
                int i5 = access100 + 45;
                access000 = i5 % 128;
                if (i5 % 2 != 0) {
                    onmeasure.put(fragment.getView(), fragment);
                    requestManagerRetriever.onExtraCallbackWithResult(fragment.getChildFragmentManager(), onmeasure);
                    throw null;
                }
                onmeasure.put(fragment.getView(), fragment);
                requestManagerRetriever.onExtraCallbackWithResult(fragment.getChildFragmentManager(), onmeasure);
            }
            i3++;
        }
    }

    private static Activity onNavigationEvent(@NonNull Context context) {
        int i2 = 2 % 2;
        int i3 = access100;
        int i4 = i3 + 111;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        if (context instanceof Activity) {
            int i6 = i3 + 107;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            return (Activity) context;
        }
        Object obj = null;
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        int i8 = i3 + 109;
        access000 = i8 % 128;
        int i9 = i8 % 2;
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (i9 != 0) {
            onNavigationEvent(baseContext);
            obj.hashCode();
            throw null;
        }
        Activity activityOnNavigationEvent = onNavigationEvent(baseContext);
        int i10 = access000 + 47;
        access100 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 61 / 0;
        }
        return activityOnNavigationEvent;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Activity activity = (Activity) objArr[0];
        int i2 = 2 % 2;
        int i3 = access100 + 83;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        int i5 = access000 + 43;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Deprecated
    public RequestManager onExtraCallback(@NonNull android.app.Fragment fragment) {
        int i2 = 2 % 2;
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        }
        int i3 = access100 + 29;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            applyConstraintsFromLayoutParams.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (applyConstraintsFromLayoutParams.IAuthTabCallback()) {
            return onWarmupCompleted(fragment.getActivity().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            int i4 = access100 + 15;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            fragment.getActivity();
        }
        RequestManager requestManagerIAuthTabCallback = IAuthTabCallback(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        int i6 = access100 + 103;
        access000 = i6 % 128;
        int i7 = i6 % 2;
        return requestManagerIAuthTabCallback;
    }

    @Deprecated
    RequestManagerFragment onExtraCallbackWithResult(Activity activity) {
        int i2 = 2 % 2;
        int i3 = access100 + 3;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (i4 == 0) {
            return onWarmupCompleted(fragmentManager, (android.app.Fragment) null);
        }
        onWarmupCompleted(fragmentManager, (android.app.Fragment) null);
        obj.hashCode();
        throw null;
    }

    private RequestManagerFragment onWarmupCompleted(@NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment) {
        int i2 = 2 % 2;
        int i3 = access100 + 31;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            this.onNavigationEvent.get(fragmentManager);
            throw null;
        }
        RequestManagerFragment requestManagerFragment = this.onNavigationEvent.get(fragmentManager);
        if (requestManagerFragment != null) {
            return requestManagerFragment;
        }
        RequestManagerFragment requestManagerFragment2 = (RequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (requestManagerFragment2 == null) {
            requestManagerFragment2 = new RequestManagerFragment();
            requestManagerFragment2.onWarmupCompleted(fragment);
            this.onNavigationEvent.put(fragmentManager, requestManagerFragment2);
            fragmentManager.beginTransaction().add(requestManagerFragment2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.asInterface.obtainMessage(1, fragmentManager).sendToTarget();
            int i4 = access000 + 1;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 % 5;
            }
        }
        int i6 = access100 + 31;
        access000 = i6 % 128;
        int i7 = i6 % 2;
        return requestManagerFragment2;
    }

    @Deprecated
    private RequestManager IAuthTabCallback(@NonNull Context context, @NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment, boolean z) {
        int i2 = 2 % 2;
        RequestManagerFragment requestManagerFragmentOnWarmupCompleted = onWarmupCompleted(fragmentManager, fragment);
        RequestManager requestManagerOnExtraCallback = requestManagerFragmentOnWarmupCompleted.onExtraCallback();
        if (requestManagerOnExtraCallback != null) {
            return requestManagerOnExtraCallback;
        }
        RequestManager requestManagerOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult(Glide.onNavigationEvent(context), requestManagerFragmentOnWarmupCompleted.onWarmupCompleted(), requestManagerFragmentOnWarmupCompleted.onNavigationEvent(), context);
        if (z) {
            int i3 = access000 + 23;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                requestManagerOnExtraCallbackWithResult.onStart();
            } else {
                requestManagerOnExtraCallbackWithResult.onStart();
                throw null;
            }
        }
        requestManagerFragmentOnWarmupCompleted.IAuthTabCallback(requestManagerOnExtraCallbackWithResult);
        int i4 = access000 + 85;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return requestManagerOnExtraCallbackWithResult;
    }

    public setVerticalGap onExtraCallback(FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3) {
        int i2 = 2 % 2;
        int i3 = access100 + 25;
        access000 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            IAuthTabCallback(flowMeasureLazyPolicyExternalSyntheticLambda3, (Fragment) null);
            obj.hashCode();
            throw null;
        }
        setVerticalGap setverticalgapIAuthTabCallback = IAuthTabCallback(flowMeasureLazyPolicyExternalSyntheticLambda3, (Fragment) null);
        int i4 = access100 + 37;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return setverticalgapIAuthTabCallback;
    }

    private static boolean onExtraCallbackWithResult(Context context) {
        int i2 = 2 % 2;
        int i3 = access000 + 87;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        if (onNavigationEvent(context) != null) {
            int i5 = access100 + 9;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            if (!(!r4.isFinishing())) {
                return false;
            }
        }
        return true;
    }

    private setVerticalGap IAuthTabCallback(@NonNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, @Nullable Fragment fragment) {
        int i2 = 2 % 2;
        int i3 = access100 + 71;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            this.IAuthTabCallback.get(flowMeasureLazyPolicyExternalSyntheticLambda3);
            throw null;
        }
        setVerticalGap setverticalgap = this.IAuthTabCallback.get(flowMeasureLazyPolicyExternalSyntheticLambda3);
        if (setverticalgap != null) {
            return setverticalgap;
        }
        setVerticalGap setverticalgap2 = (setVerticalGap) flowMeasureLazyPolicyExternalSyntheticLambda3.findFragmentByTag("com.bumptech.glide.manager");
        if (setverticalgap2 == null) {
            setverticalgap2 = new setVerticalGap();
            setverticalgap2.onExtraCallbackWithResult(fragment);
            this.IAuthTabCallback.put(flowMeasureLazyPolicyExternalSyntheticLambda3, setverticalgap2);
            flowMeasureLazyPolicyExternalSyntheticLambda3.onExtraCallbackWithResult().onExtraCallbackWithResult(setverticalgap2, "com.bumptech.glide.manager").onExtraCallbackWithResult();
            this.asInterface.obtainMessage(2, flowMeasureLazyPolicyExternalSyntheticLambda3).sendToTarget();
        }
        int i4 = access000 + 27;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return setverticalgap2;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
    
        if (r8 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        r8 = com.bumptech.glide.manager.RequestManagerRetriever.access000 + 85;
        com.bumptech.glide.manager.RequestManagerRetriever.access100 = r8 % 128;
        r8 = r8 % 2;
        r0.onStart();
        r8 = com.bumptech.glide.manager.RequestManagerRetriever.access100 + 33;
        com.bumptech.glide.manager.RequestManagerRetriever.access000 = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
    
        r4.IAuthTabCallback(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0035, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        r0 = r1.onExtraCallbackWithResult.onExtraCallbackWithResult(com.bumptech.glide.Glide.onNavigationEvent(r2), r4.onExtraCallbackWithResult(), r4.onWarmupCompleted(), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        setVerticalGap setverticalgapIAuthTabCallback;
        RequestManager requestManagerIAuthTabCallback;
        RequestManagerRetriever requestManagerRetriever = (RequestManagerRetriever) objArr[0];
        Context context = (Context) objArr[1];
        FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3 = (FlowMeasureLazyPolicyExternalSyntheticLambda3) objArr[2];
        Fragment fragment = (Fragment) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        int i2 = 2 % 2;
        int i3 = access000 + 25;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            setverticalgapIAuthTabCallback = requestManagerRetriever.IAuthTabCallback(flowMeasureLazyPolicyExternalSyntheticLambda3, fragment);
            requestManagerIAuthTabCallback = setverticalgapIAuthTabCallback.IAuthTabCallback();
            int i4 = 16 / 0;
        } else {
            setverticalgapIAuthTabCallback = requestManagerRetriever.IAuthTabCallback(flowMeasureLazyPolicyExternalSyntheticLambda3, fragment);
            requestManagerIAuthTabCallback = setverticalgapIAuthTabCallback.IAuthTabCallback();
        }
    }

    private boolean IAuthTabCallback(FragmentManager fragmentManager, boolean z) {
        int i2 = 2 % 2;
        RequestManagerFragment requestManagerFragment = this.onNavigationEvent.get(fragmentManager);
        RequestManagerFragment requestManagerFragment2 = (RequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (requestManagerFragment2 == requestManagerFragment) {
            return true;
        }
        if (requestManagerFragment2 != null && requestManagerFragment2.onExtraCallback() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + requestManagerFragment2 + " New: " + requestManagerFragment);
        }
        if (!(!z) || fragmentManager.isDestroyed()) {
            if (Log.isLoggable("RMRetriever", 5)) {
                fragmentManager.isDestroyed();
                int i3 = access100 + 69;
                access000 = i3 % 128;
                int i4 = i3 % 2;
            }
            requestManagerFragment.onWarmupCompleted().onWarmupCompleted();
            return true;
        }
        int i5 = access100 + 23;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            FragmentTransaction fragmentTransactionAdd = fragmentManager.beginTransaction().add(requestManagerFragment, "com.bumptech.glide.manager");
            if (requestManagerFragment2 != null) {
                fragmentTransactionAdd.remove(requestManagerFragment2);
            }
            fragmentTransactionAdd.commitAllowingStateLoss();
            this.asInterface.obtainMessage(1, 1, 0, fragmentManager).sendToTarget();
            return false;
        }
        fragmentManager.beginTransaction().add(requestManagerFragment, "com.bumptech.glide.manager");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private boolean onNavigationEvent(FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, boolean z) {
        int i2 = 2 % 2;
        int i3 = access000 + 43;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        setVerticalGap setverticalgap = this.IAuthTabCallback.get(flowMeasureLazyPolicyExternalSyntheticLambda3);
        setVerticalGap setverticalgap2 = (setVerticalGap) flowMeasureLazyPolicyExternalSyntheticLambda3.findFragmentByTag("com.bumptech.glide.manager");
        if (setverticalgap2 != setverticalgap) {
            if (setverticalgap2 != null) {
                int i5 = access000 + 125;
                access100 = i5 % 128;
                if (i5 % 2 != 0) {
                    if (setverticalgap2.IAuthTabCallback() != null) {
                        throw new IllegalStateException("We've added two fragments with requests! Old: " + setverticalgap2 + " New: " + setverticalgap);
                    }
                } else {
                    setverticalgap2.IAuthTabCallback();
                    throw null;
                }
            }
            if (!z && !flowMeasureLazyPolicyExternalSyntheticLambda3.mayLaunchUrl()) {
                FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult = flowMeasureLazyPolicyExternalSyntheticLambda3.onExtraCallbackWithResult().onExtraCallbackWithResult(setverticalgap, "com.bumptech.glide.manager");
                if (setverticalgap2 != null) {
                    flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.onNavigationEvent(setverticalgap2);
                }
                flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallback();
                this.asInterface.obtainMessage(2, 1, 0, flowMeasureLazyPolicyExternalSyntheticLambda3).sendToTarget();
                return false;
            }
            flowMeasureLazyPolicyExternalSyntheticLambda3.mayLaunchUrl();
            setverticalgap.onExtraCallbackWithResult().onWarmupCompleted();
            return true;
        }
        int i6 = access000 + 97;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3;
        Object objRemove;
        int i2 = 2 % 2;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = message.arg1 == 1;
        int i3 = message.what;
        if (i3 != 1) {
            int i4 = access100 + 49;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            if (i3 != 2) {
                z2 = false;
            } else {
                flowMeasureLazyPolicyExternalSyntheticLambda3 = (FlowMeasureLazyPolicyExternalSyntheticLambda3) message.obj;
                if (onNavigationEvent(flowMeasureLazyPolicyExternalSyntheticLambda3, z3)) {
                    objRemove = this.IAuthTabCallback.remove(flowMeasureLazyPolicyExternalSyntheticLambda3);
                    z = true;
                }
            }
            int i6 = access100 + 25;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            flowMeasureLazyPolicyExternalSyntheticLambda3 = null;
            objRemove = null;
        } else {
            flowMeasureLazyPolicyExternalSyntheticLambda3 = (FragmentManager) message.obj;
            if (IAuthTabCallback((FragmentManager) flowMeasureLazyPolicyExternalSyntheticLambda3, z3)) {
                objRemove = this.onNavigationEvent.remove(flowMeasureLazyPolicyExternalSyntheticLambda3);
                z = true;
            }
            int i62 = access100 + 25;
            access000 = i62 % 128;
            int i72 = i62 % 2;
            flowMeasureLazyPolicyExternalSyntheticLambda3 = null;
            objRemove = null;
        }
        if (Log.isLoggable("RMRetriever", 5)) {
            int i8 = access100 + 55;
            access000 = i8 % 128;
            int i9 = i8 % 2;
            if (z && objRemove == null) {
                Objects.toString(flowMeasureLazyPolicyExternalSyntheticLambda3);
            }
        }
        return z2;
    }

    static {
        onExtraCallbackWithResult();
        onExtraCallback = new RequestManagerFactory() { // from class: com.bumptech.glide.manager.RequestManagerRetriever.1
            @Override // com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory
            public RequestManager onExtraCallbackWithResult(@NonNull Glide glide, @NonNull setVerticalStyle setverticalstyle, @NonNull RequestManagerTreeNode requestManagerTreeNode, @NonNull Context context) {
                return new RequestManager(glide, setverticalstyle, requestManagerTreeNode, context);
            }
        };
        int i2 = getInterfaceDescriptor + 19;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static void onExtraCallback(@NonNull Activity activity) {
        onExtraCallback(setVisitUrl.onExtraCallbackWithResult(), 173589507, new Object[]{activity}, setVisitUrl.onExtraCallbackWithResult(), -173589505, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult());
    }

    @Deprecated
    private void onWarmupCompleted(@NonNull FragmentManager fragmentManager, @NonNull onMeasure<View, android.app.Fragment> onmeasure) {
        onExtraCallback(setVisitUrl.onExtraCallbackWithResult(), 1556241674, new Object[]{this, fragmentManager, onmeasure}, setVisitUrl.onExtraCallbackWithResult(), -1556241674, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult());
    }

    private RequestManager onNavigationEvent(@NonNull Context context, @NonNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, @Nullable Fragment fragment, boolean z) {
        return (RequestManager) onExtraCallback(setVisitUrl.onExtraCallbackWithResult(), -1618011442, new Object[]{this, context, flowMeasureLazyPolicyExternalSyntheticLambda3, fragment, Boolean.valueOf(z)}, setVisitUrl.onExtraCallbackWithResult(), 1618011443, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult());
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallbackStubProxy = 4609566785836144790L;
    }
}
