package o;

import androidx.glance.appwidget.protobuf.Reader;
import com.google.android.material.button.MaterialButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.LazyStaggeredGridMeasureKtExternalSyntheticLambda1;
import o.PagerKtExternalSyntheticLambda6;
import o.PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class LazyLayoutSemanticsModifierNodeExternalSyntheticLambda1 extends LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4<PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.IAuthTabCallback> {
    LazyLayoutSemanticsModifierNodeExternalSyntheticLambda1() {
    }

    @Override // o.LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4
    boolean onWarmupCompleted(LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda1) {
        return lazyStaggeredGridMeasureKtExternalSyntheticLambda1 instanceof PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.onWarmupCompleted;
    }

    @Override // o.LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4
    LazySaveableStateHolderExternalSyntheticLambda2<PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.IAuthTabCallback> IAuthTabCallback(Object obj) {
        return ((PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.onWarmupCompleted) obj).extensions;
    }

    @Override // o.LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4
    LazySaveableStateHolderExternalSyntheticLambda2<PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.IAuthTabCallback> onExtraCallback(Object obj) {
        return ((PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.onWarmupCompleted) obj).onExtraCallback();
    }

    @Override // o.LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4
    void onNavigationEvent(Object obj) {
        IAuthTabCallback(obj).getInterfaceDescriptor();
    }

    @Override // o.LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4
    <UT, UB> UB onExtraCallback(Object obj, Reader reader, Object obj2, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2, LazySaveableStateHolderExternalSyntheticLambda2<PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.IAuthTabCallback> lazySaveableStateHolderExternalSyntheticLambda2, UB ub, PagerKtExternalSyntheticLambda2<UT, UB> pagerKtExternalSyntheticLambda2) throws IOException {
        Object objValueOf;
        Object objOnExtraCallbackWithResult;
        ArrayList arrayList;
        PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.onExtraCallback onextracallback = (PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.onExtraCallback) obj2;
        int iOnNavigationEvent = onextracallback.onNavigationEvent();
        if (onextracallback.onWarmupCompleted.IAuthTabCallback() && onextracallback.onWarmupCompleted.onExtraCallbackWithResult()) {
            switch (AnonymousClass3.onNavigationEvent[onextracallback.onWarmupCompleted().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    reader.onWarmupCompleted(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    reader.IAuthTabCallbackStub(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    reader.onTransact(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    reader.extraCallback(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    reader.IAuthTabCallbackDefault(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    reader.asBinder(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    reader.IAuthTabCallback(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    reader.onNavigationEvent(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    reader.extraCallbackWithResult(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    reader.asInterface(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    reader.IAuthTabCallback_Parcel(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    reader.access000(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    reader.IAuthTabCallbackStubProxy(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    reader.onExtraCallback(arrayList);
                    ub = (UB) LazyLayoutPagerKtExternalSyntheticLambda3.onWarmupCompleted(obj, iOnNavigationEvent, arrayList, onextracallback.onWarmupCompleted.asBinder(), ub, pagerKtExternalSyntheticLambda2);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + onextracallback.onWarmupCompleted.onExtraCallback());
            }
            lazySaveableStateHolderExternalSyntheticLambda2.onWarmupCompleted((LazySaveableStateHolderExternalSyntheticLambda2<PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.IAuthTabCallback>) onextracallback.onWarmupCompleted, arrayList);
            return ub;
        }
        if (onextracallback.onWarmupCompleted() == PagerKtExternalSyntheticLambda6.onNavigationEvent.ENUM) {
            int iIAuthTabCallbackDefault = reader.IAuthTabCallbackDefault();
            if (onextracallback.onWarmupCompleted.asBinder().onWarmupCompleted(iIAuthTabCallbackDefault) == null) {
                return (UB) LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallback(obj, iOnNavigationEvent, iIAuthTabCallbackDefault, ub, pagerKtExternalSyntheticLambda2);
            }
            objValueOf = Integer.valueOf(iIAuthTabCallbackDefault);
        } else {
            switch (AnonymousClass3.onNavigationEvent[onextracallback.onWarmupCompleted().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(reader.IAuthTabCallback());
                    break;
                case 2:
                    objValueOf = Float.valueOf(reader.asInterface());
                    break;
                case 3:
                    objValueOf = Long.valueOf(reader.IAuthTabCallback_Parcel());
                    break;
                case 4:
                    objValueOf = Long.valueOf(reader.writeTypedObject());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(reader.IAuthTabCallbackDefault());
                    break;
                case 6:
                    objValueOf = Long.valueOf(reader.asBinder());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(reader.onTransact());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(reader.onExtraCallback());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(reader.extraCallback());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(reader.IAuthTabCallbackStubProxy());
                    break;
                case 11:
                    objValueOf = Long.valueOf(reader.access000());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(reader.access100());
                    break;
                case 13:
                    objValueOf = Long.valueOf(reader.getInterfaceDescriptor());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = reader.onNavigationEvent();
                    break;
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    objValueOf = reader.extraCallbackWithResult();
                    break;
                case 17:
                    if (!onextracallback.onExtraCallbackWithResult()) {
                        Object objOnExtraCallbackWithResult2 = lazySaveableStateHolderExternalSyntheticLambda2.onExtraCallbackWithResult((LazySaveableStateHolderExternalSyntheticLambda2<PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.IAuthTabCallback>) onextracallback.onWarmupCompleted);
                        if (objOnExtraCallbackWithResult2 instanceof PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0) {
                            PagerDefaultsExternalSyntheticLambda0 pagerDefaultsExternalSyntheticLambda0OnExtraCallbackWithResult = DefaultPagerStateExternalSyntheticLambda2.onNavigationEvent().onExtraCallbackWithResult(objOnExtraCallbackWithResult2);
                            if (!((PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0) objOnExtraCallbackWithResult2).onMessageChannelReady()) {
                                Object objOnExtraCallback = pagerDefaultsExternalSyntheticLambda0OnExtraCallbackWithResult.onExtraCallback();
                                pagerDefaultsExternalSyntheticLambda0OnExtraCallbackWithResult.onExtraCallbackWithResult(objOnExtraCallback, objOnExtraCallbackWithResult2);
                                lazySaveableStateHolderExternalSyntheticLambda2.onWarmupCompleted((LazySaveableStateHolderExternalSyntheticLambda2<PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.IAuthTabCallback>) onextracallback.onWarmupCompleted, objOnExtraCallback);
                                objOnExtraCallbackWithResult2 = objOnExtraCallback;
                            }
                            reader.IAuthTabCallback(objOnExtraCallbackWithResult2, pagerDefaultsExternalSyntheticLambda0OnExtraCallbackWithResult, lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2);
                            return ub;
                        }
                    }
                    objValueOf = reader.onExtraCallbackWithResult(onextracallback.IAuthTabCallback().getClass(), lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2);
                    break;
                case 18:
                    if (!onextracallback.onExtraCallbackWithResult()) {
                        Object objOnExtraCallbackWithResult3 = lazySaveableStateHolderExternalSyntheticLambda2.onExtraCallbackWithResult((LazySaveableStateHolderExternalSyntheticLambda2<PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.IAuthTabCallback>) onextracallback.onWarmupCompleted);
                        if (objOnExtraCallbackWithResult3 instanceof PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0) {
                            PagerDefaultsExternalSyntheticLambda0 pagerDefaultsExternalSyntheticLambda0OnExtraCallbackWithResult2 = DefaultPagerStateExternalSyntheticLambda2.onNavigationEvent().onExtraCallbackWithResult(objOnExtraCallbackWithResult3);
                            if (!((PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0) objOnExtraCallbackWithResult3).onMessageChannelReady()) {
                                Object objOnExtraCallback2 = pagerDefaultsExternalSyntheticLambda0OnExtraCallbackWithResult2.onExtraCallback();
                                pagerDefaultsExternalSyntheticLambda0OnExtraCallbackWithResult2.onExtraCallbackWithResult(objOnExtraCallback2, objOnExtraCallbackWithResult3);
                                lazySaveableStateHolderExternalSyntheticLambda2.onWarmupCompleted((LazySaveableStateHolderExternalSyntheticLambda2<PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.IAuthTabCallback>) onextracallback.onWarmupCompleted, objOnExtraCallback2);
                                objOnExtraCallbackWithResult3 = objOnExtraCallback2;
                            }
                            reader.onExtraCallbackWithResult((Reader) objOnExtraCallbackWithResult3, (PagerDefaultsExternalSyntheticLambda0<Reader>) pagerDefaultsExternalSyntheticLambda0OnExtraCallbackWithResult2, lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2);
                            return ub;
                        }
                    }
                    objValueOf = reader.onExtraCallback(onextracallback.IAuthTabCallback().getClass(), lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        }
        if (onextracallback.onExtraCallbackWithResult()) {
            lazySaveableStateHolderExternalSyntheticLambda2.onExtraCallback(onextracallback.onWarmupCompleted, objValueOf);
            return ub;
        }
        int i2 = AnonymousClass3.onNavigationEvent[onextracallback.onWarmupCompleted().ordinal()];
        if ((i2 == 17 || i2 == 18) && (objOnExtraCallbackWithResult = lazySaveableStateHolderExternalSyntheticLambda2.onExtraCallbackWithResult((LazySaveableStateHolderExternalSyntheticLambda2<PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.IAuthTabCallback>) onextracallback.onWarmupCompleted)) != null) {
            objValueOf = LazySaveableStateHolderKtExternalSyntheticLambda1.onWarmupCompleted(objOnExtraCallbackWithResult, objValueOf);
        }
        lazySaveableStateHolderExternalSyntheticLambda2.onWarmupCompleted((LazySaveableStateHolderExternalSyntheticLambda2<PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.IAuthTabCallback>) onextracallback.onWarmupCompleted, objValueOf);
        return ub;
    }

    /* renamed from: o.LazyLayoutSemanticsModifierNodeExternalSyntheticLambda1$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[PagerKtExternalSyntheticLambda6.onNavigationEvent.values().length];
            onNavigationEvent = iArr;
            try {
                iArr[PagerKtExternalSyntheticLambda6.onNavigationEvent.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // o.LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4
    int IAuthTabCallback(Map.Entry<?, ?> entry) {
        return ((PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.IAuthTabCallback) entry.getKey()).onWarmupCompleted();
    }

    @Override // o.LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4
    void onExtraCallback(PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3, Map.Entry<?, ?> entry) throws IOException {
        PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback = (PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.IAuthTabCallback) entry.getKey();
        if (iAuthTabCallback.IAuthTabCallback()) {
            switch (AnonymousClass3.onNavigationEvent[iAuthTabCallback.onExtraCallback().ordinal()]) {
                case 1:
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallback(iAuthTabCallback.onWarmupCompleted(), (List) entry.getValue(), pagerMeasureKtExternalSyntheticLambda3, iAuthTabCallback.onExtraCallbackWithResult());
                    break;
                case 2:
                    LazyLayoutPagerKtExternalSyntheticLambda3.asBinder(iAuthTabCallback.onWarmupCompleted(), (List) entry.getValue(), pagerMeasureKtExternalSyntheticLambda3, iAuthTabCallback.onExtraCallbackWithResult());
                    break;
                case 3:
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallbackStub(iAuthTabCallback.onWarmupCompleted(), (List) entry.getValue(), pagerMeasureKtExternalSyntheticLambda3, iAuthTabCallback.onExtraCallbackWithResult());
                    break;
                case 4:
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallbackStubProxy(iAuthTabCallback.onWarmupCompleted(), (List) entry.getValue(), pagerMeasureKtExternalSyntheticLambda3, iAuthTabCallback.onExtraCallbackWithResult());
                    break;
                case 5:
                    LazyLayoutPagerKtExternalSyntheticLambda3.asInterface(iAuthTabCallback.onWarmupCompleted(), (List) entry.getValue(), pagerMeasureKtExternalSyntheticLambda3, iAuthTabCallback.onExtraCallbackWithResult());
                    break;
                case 6:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onWarmupCompleted(iAuthTabCallback.onWarmupCompleted(), (List) entry.getValue(), pagerMeasureKtExternalSyntheticLambda3, iAuthTabCallback.onExtraCallbackWithResult());
                    break;
                case 7:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onNavigationEvent(iAuthTabCallback.onWarmupCompleted(), (List) entry.getValue(), pagerMeasureKtExternalSyntheticLambda3, iAuthTabCallback.onExtraCallbackWithResult());
                    break;
                case 8:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallback(iAuthTabCallback.onWarmupCompleted(), (List<Boolean>) entry.getValue(), pagerMeasureKtExternalSyntheticLambda3, iAuthTabCallback.onExtraCallbackWithResult());
                    break;
                case 9:
                    LazyLayoutPagerKtExternalSyntheticLambda3.getInterfaceDescriptor(iAuthTabCallback.onWarmupCompleted(), (List) entry.getValue(), pagerMeasureKtExternalSyntheticLambda3, iAuthTabCallback.onExtraCallbackWithResult());
                    break;
                case 10:
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallbackDefault(iAuthTabCallback.onWarmupCompleted(), (List) entry.getValue(), pagerMeasureKtExternalSyntheticLambda3, iAuthTabCallback.onExtraCallbackWithResult());
                    break;
                case 11:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onTransact(iAuthTabCallback.onWarmupCompleted(), (List) entry.getValue(), pagerMeasureKtExternalSyntheticLambda3, iAuthTabCallback.onExtraCallbackWithResult());
                    break;
                case 12:
                    LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallback_Parcel(iAuthTabCallback.onWarmupCompleted(), (List) entry.getValue(), pagerMeasureKtExternalSyntheticLambda3, iAuthTabCallback.onExtraCallbackWithResult());
                    break;
                case 13:
                    LazyLayoutPagerKtExternalSyntheticLambda3.access100(iAuthTabCallback.onWarmupCompleted(), (List) entry.getValue(), pagerMeasureKtExternalSyntheticLambda3, iAuthTabCallback.onExtraCallbackWithResult());
                    break;
                case 14:
                    LazyLayoutPagerKtExternalSyntheticLambda3.asInterface(iAuthTabCallback.onWarmupCompleted(), (List) entry.getValue(), pagerMeasureKtExternalSyntheticLambda3, iAuthTabCallback.onExtraCallbackWithResult());
                    break;
                case 15:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onWarmupCompleted(iAuthTabCallback.onWarmupCompleted(), (List<LazyLayoutKtExternalSyntheticLambda3>) entry.getValue(), pagerMeasureKtExternalSyntheticLambda3);
                    break;
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallback(iAuthTabCallback.onWarmupCompleted(), (List<String>) entry.getValue(), pagerMeasureKtExternalSyntheticLambda3);
                    break;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallback(iAuthTabCallback.onWarmupCompleted(), (List<?>) entry.getValue(), pagerMeasureKtExternalSyntheticLambda3, DefaultPagerStateExternalSyntheticLambda2.onNavigationEvent().IAuthTabCallback(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallbackWithResult(iAuthTabCallback.onWarmupCompleted(), (List<?>) entry.getValue(), pagerMeasureKtExternalSyntheticLambda3, DefaultPagerStateExternalSyntheticLambda2.onNavigationEvent().IAuthTabCallback(list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (AnonymousClass3.onNavigationEvent[iAuthTabCallback.onExtraCallback().ordinal()]) {
            case 1:
                pagerMeasureKtExternalSyntheticLambda3.onWarmupCompleted(iAuthTabCallback.onWarmupCompleted(), ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                pagerMeasureKtExternalSyntheticLambda3.onExtraCallbackWithResult(iAuthTabCallback.onWarmupCompleted(), ((Float) entry.getValue()).floatValue());
                break;
            case 3:
                pagerMeasureKtExternalSyntheticLambda3.onExtraCallbackWithResult(iAuthTabCallback.onWarmupCompleted(), ((Long) entry.getValue()).longValue());
                break;
            case 4:
                pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(iAuthTabCallback.onWarmupCompleted(), ((Long) entry.getValue()).longValue());
                break;
            case 5:
                pagerMeasureKtExternalSyntheticLambda3.onExtraCallbackWithResult(iAuthTabCallback.onWarmupCompleted(), ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallback(iAuthTabCallback.onWarmupCompleted(), ((Long) entry.getValue()).longValue());
                break;
            case 7:
                pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(iAuthTabCallback.onWarmupCompleted(), ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                pagerMeasureKtExternalSyntheticLambda3.onNavigationEvent(iAuthTabCallback.onWarmupCompleted(), ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                pagerMeasureKtExternalSyntheticLambda3.asBinder(iAuthTabCallback.onWarmupCompleted(), ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                pagerMeasureKtExternalSyntheticLambda3.onNavigationEvent(iAuthTabCallback.onWarmupCompleted(), ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                pagerMeasureKtExternalSyntheticLambda3.onWarmupCompleted(iAuthTabCallback.onWarmupCompleted(), ((Long) entry.getValue()).longValue());
                break;
            case 12:
                pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallback(iAuthTabCallback.onWarmupCompleted(), ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                pagerMeasureKtExternalSyntheticLambda3.onNavigationEvent(iAuthTabCallback.onWarmupCompleted(), ((Long) entry.getValue()).longValue());
                break;
            case 14:
                pagerMeasureKtExternalSyntheticLambda3.onExtraCallbackWithResult(iAuthTabCallback.onWarmupCompleted(), ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(iAuthTabCallback.onWarmupCompleted(), (LazyLayoutKtExternalSyntheticLambda3) entry.getValue());
                break;
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                pagerMeasureKtExternalSyntheticLambda3.onWarmupCompleted(iAuthTabCallback.onWarmupCompleted(), (String) entry.getValue());
                break;
            case 17:
                pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(iAuthTabCallback.onWarmupCompleted(), entry.getValue(), DefaultPagerStateExternalSyntheticLambda2.onNavigationEvent().IAuthTabCallback(entry.getValue().getClass()));
                break;
            case 18:
                pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallback(iAuthTabCallback.onWarmupCompleted(), entry.getValue(), DefaultPagerStateExternalSyntheticLambda2.onNavigationEvent().IAuthTabCallback(entry.getValue().getClass()));
                break;
        }
    }

    @Override // o.LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4
    Object onWarmupCompleted(LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2, LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda1, int i2) {
        return lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2.onExtraCallback(lazyStaggeredGridMeasureKtExternalSyntheticLambda1, i2);
    }

    @Override // o.LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4
    void onNavigationEvent(Reader reader, Object obj, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2, LazySaveableStateHolderExternalSyntheticLambda2<PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.IAuthTabCallback> lazySaveableStateHolderExternalSyntheticLambda2) throws IOException {
        PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.onExtraCallback onextracallback = (PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.onExtraCallback) obj;
        lazySaveableStateHolderExternalSyntheticLambda2.onWarmupCompleted((LazySaveableStateHolderExternalSyntheticLambda2<PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.IAuthTabCallback>) onextracallback.onWarmupCompleted, reader.onExtraCallback(onextracallback.IAuthTabCallback().getClass(), lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2));
    }

    @Override // o.LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4
    void onWarmupCompleted(LazyLayoutKtExternalSyntheticLambda3 lazyLayoutKtExternalSyntheticLambda3, Object obj, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2, LazySaveableStateHolderExternalSyntheticLambda2<PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.IAuthTabCallback> lazySaveableStateHolderExternalSyntheticLambda2) throws IOException {
        PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.onExtraCallback onextracallback = (PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.onExtraCallback) obj;
        LazyStaggeredGridMeasureKtExternalSyntheticLambda1.onExtraCallback onextracallbackICustomTabsCallbackStub = onextracallback.IAuthTabCallback().ICustomTabsCallbackStub();
        LazyLayoutPinnableItemKtExternalSyntheticLambda0 lazyLayoutPinnableItemKtExternalSyntheticLambda0AsBinder = lazyLayoutKtExternalSyntheticLambda3.asBinder();
        onextracallbackICustomTabsCallbackStub.onExtraCallbackWithResult(lazyLayoutPinnableItemKtExternalSyntheticLambda0AsBinder, lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2);
        lazySaveableStateHolderExternalSyntheticLambda2.onWarmupCompleted((LazySaveableStateHolderExternalSyntheticLambda2<PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.IAuthTabCallback>) onextracallback.onWarmupCompleted, onextracallbackICustomTabsCallbackStub.IAuthTabCallbackStub());
        lazyLayoutPinnableItemKtExternalSyntheticLambda0AsBinder.onNavigationEvent(0);
    }
}
