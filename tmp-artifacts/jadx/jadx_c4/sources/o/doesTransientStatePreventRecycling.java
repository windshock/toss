package o;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import com.facebook.react.uimanager.RootView;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootHelper;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootView;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.addChangePayload;
import o.doesTransientStatePreventRecycling;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class doesTransientStatePreventRecycling {
    private boolean IAuthTabCallbackDefault;
    private final HashSet<Integer> IAuthTabCallbackStub;
    private float IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private final clearTmpDetachFlag access000;
    private int access100;
    private final ArrayList<addChangePayload> asBinder;
    private final ArrayList<addChangePayload> asInterface;
    private final ViewGroup extraCallback;
    private final ArrayList<addChangePayload> getInterfaceDescriptor;
    private int onTransact;
    private final isRemoved readTypedObject;
    private final ViewGroup writeTypedObject;
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final PointF onExtraCallbackWithResult = new PointF();
    private static final float[] onWarmupCompleted = new float[2];
    private static final Matrix onNavigationEvent = new Matrix();
    private static final float[] onExtraCallback = new float[2];
    private static final Comparator<addChangePayload> IAuthTabCallback = new Comparator() { // from class: com.swmansion.gesturehandler.core.GestureHandlerOrchestrator$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return doesTransientStatePreventRecycling.onNavigationEvent((addChangePayload) obj, (addChangePayload) obj2);
        }
    };

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[isBound.values().length];
            try {
                iArr[isBound.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[isBound.BOX_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[isBound.BOX_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[isBound.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallback = iArr;
        }
    }

    public doesTransientStatePreventRecycling(@NotNull ViewGroup viewGroup, @NotNull clearTmpDetachFlag cleartmpdetachflag, @NotNull isRemoved isremoved, @NotNull ViewGroup viewGroup2) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(cleartmpdetachflag, "");
        Intrinsics.checkNotNullParameter(isremoved, "");
        Intrinsics.checkNotNullParameter(viewGroup2, "");
        this.extraCallback = viewGroup;
        this.access000 = cleartmpdetachflag;
        this.readTypedObject = isremoved;
        this.writeTypedObject = viewGroup2;
        this.asInterface = new ArrayList<>();
        this.asBinder = new ArrayList<>();
        this.getInterfaceDescriptor = new ArrayList<>();
        this.IAuthTabCallbackStub = new HashSet<>();
    }

    public final void onExtraCallbackWithResult(float f) {
        this.IAuthTabCallbackStubProxy = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onExtraCallback(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        this.IAuthTabCallback_Parcel = true;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            onNavigationEvent(motionEvent);
        } else if (actionMasked == 3) {
            onExtraCallback();
        } else if (actionMasked == 5 || actionMasked == 7) {
        }
        IAuthTabCallback(motionEvent);
        this.IAuthTabCallback_Parcel = false;
        if (this.IAuthTabCallbackDefault && this.access100 == 0) {
            asBinder();
        }
        if ((actionMasked == 1 || actionMasked == 3 || actionMasked == 10) && this.asInterface.isEmpty()) {
            RootView rootView = this.writeTypedObject;
            if (rootView instanceof RootView) {
                rootView.onChildEndedNativeGesture(rootView, motionEvent);
            }
        }
        return true;
    }

    public final ArrayList<addChangePayload> onExtraCallbackWithResult(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return this.access000.IAuthTabCallback(view);
    }

    private final void asInterface() {
        if (this.IAuthTabCallback_Parcel || this.access100 != 0) {
            this.IAuthTabCallbackDefault = true;
        } else {
            asBinder();
        }
    }

    private final void asBinder() {
        for (addChangePayload addchangepayload : CollectionsKt.asReversedMutable(this.asInterface)) {
            if (Companion.onExtraCallback(addchangepayload.onRelationshipValidationResult()) && !addchangepayload.mayLaunchUrl()) {
                addchangepayload.newAuthTabSession();
                addchangepayload.onWarmupCompleted(false);
                addchangepayload.IAuthTabCallback(false);
                addchangepayload.onWarmupCompleted(Integer.MAX_VALUE);
            }
        }
        CollectionsKt.removeAll(this.asInterface, new Function1() { // from class: com.swmansion.gesturehandler.core.GestureHandlerOrchestrator$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(doesTransientStatePreventRecycling.onNavigationEvent((addChangePayload) obj));
            }
        });
        this.IAuthTabCallbackDefault = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onNavigationEvent(addChangePayload addchangepayload) {
        Intrinsics.checkNotNullParameter(addchangepayload, "");
        return Companion.onExtraCallback(addchangepayload.onRelationshipValidationResult()) && !addchangepayload.mayLaunchUrl();
    }

    private final boolean asBinder(addChangePayload addchangepayload) {
        ArrayList<addChangePayload> arrayList = this.asInterface;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (addChangePayload addchangepayload2 : arrayList) {
            onNavigationEvent onnavigationevent = Companion;
            if (!onnavigationevent.onExtraCallback(addchangepayload2.onRelationshipValidationResult()) && onnavigationevent.onWarmupCompleted(addchangepayload, addchangepayload2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean asInterface(addChangePayload addchangepayload) {
        ArrayList<addChangePayload> arrayList = this.asInterface;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (addChangePayload addchangepayload2 : arrayList) {
            if (Companion.onWarmupCompleted(addchangepayload, addchangepayload2) && addchangepayload2.onRelationshipValidationResult() == 5) {
                return true;
            }
        }
        return false;
    }

    private final boolean IAuthTabCallbackDefault(addChangePayload addchangepayload) {
        ArrayList<addChangePayload> arrayList = this.asInterface;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (addChangePayload addchangepayload2 : arrayList) {
            if (addchangepayload.onExtraCallbackWithResult(addchangepayload2) && addchangepayload2.onRelationshipValidationResult() == 4 && !Companion.onNavigationEvent(addchangepayload, addchangepayload2) && addchangepayload.onExtraCallback(addchangepayload2)) {
                return true;
            }
        }
        return false;
    }

    private final void onTransact(addChangePayload addchangepayload) {
        if (asInterface(addchangepayload) || IAuthTabCallbackDefault(addchangepayload)) {
            addchangepayload.onTransact();
        } else if (asBinder(addchangepayload)) {
            onExtraCallbackWithResult(addchangepayload);
        } else {
            IAuthTabCallbackStub(addchangepayload);
            addchangepayload.IAuthTabCallback(false);
        }
    }

    private final void onNavigationEvent() {
        for (addChangePayload addchangepayload : CollectionsKt.toList(this.asBinder)) {
            if (!addchangepayload.mayLaunchUrl()) {
                this.asBinder.remove(addchangepayload);
                this.IAuthTabCallbackStub.remove(Integer.valueOf(addchangepayload.onUnminimized()));
            }
        }
    }

    public final void onExtraCallback(@NotNull addChangePayload addchangepayload, int i, int i2) {
        Intrinsics.checkNotNullParameter(addchangepayload, "");
        this.access100++;
        if (Companion.onExtraCallback(i)) {
            for (addChangePayload addchangepayload2 : CollectionsKt.toList(this.asBinder)) {
                if (Companion.onWarmupCompleted(addchangepayload2, addchangepayload) && this.IAuthTabCallbackStub.contains(Integer.valueOf(addchangepayload2.onUnminimized()))) {
                    if (i == 5) {
                        addchangepayload2.onTransact();
                        if (addchangepayload2.onRelationshipValidationResult() == 5) {
                            addchangepayload2.onWarmupCompleted(3, 2);
                        }
                        addchangepayload2.IAuthTabCallback(false);
                    } else {
                        onTransact(addchangepayload2);
                    }
                }
            }
            onNavigationEvent();
        }
        if (i == 4) {
            onTransact(addchangepayload);
        } else if (i2 == 4 || i2 == 5) {
            if (addchangepayload.ICustomTabsService()) {
                addchangepayload.onWarmupCompleted(i, i2);
            } else if (i2 == 4 && (i == 3 || i == 1)) {
                addchangepayload.onWarmupCompleted(i, 2);
            }
        } else if (i2 != 0 || i != 3) {
            addchangepayload.onWarmupCompleted(i, i2);
        }
        this.access100--;
        asInterface();
    }

    private final void IAuthTabCallbackStub(addChangePayload addchangepayload) {
        int iOnRelationshipValidationResult = addchangepayload.onRelationshipValidationResult();
        addchangepayload.IAuthTabCallback(false);
        addchangepayload.onWarmupCompleted(true);
        addchangepayload.IAuthTabCallbackStub(true);
        int i = this.onTransact;
        this.onTransact = i + 1;
        addchangepayload.onWarmupCompleted(i);
        for (addChangePayload addchangepayload2 : CollectionsKt.asReversedMutable(this.asInterface)) {
            if (Companion.onExtraCallbackWithResult(addchangepayload2, addchangepayload)) {
                addchangepayload2.onTransact();
            }
        }
        for (addChangePayload addchangepayload3 : CollectionsKt.asReversedMutable(this.asBinder)) {
            if (Companion.onExtraCallbackWithResult(addchangepayload3, addchangepayload)) {
                addchangepayload3.IAuthTabCallback(false);
            }
        }
        onNavigationEvent();
        if (iOnRelationshipValidationResult == 1 || iOnRelationshipValidationResult == 3) {
            return;
        }
        addchangepayload.onWarmupCompleted(4, 2);
        if (iOnRelationshipValidationResult != 4) {
            addchangepayload.onWarmupCompleted(5, 4);
            if (iOnRelationshipValidationResult != 5) {
                addchangepayload.onWarmupCompleted(0, 5);
            }
        }
    }

    private final void IAuthTabCallback(MotionEvent motionEvent) {
        this.getInterfaceDescriptor.clear();
        this.getInterfaceDescriptor.addAll(this.asInterface);
        CollectionsKt.sortWith(this.getInterfaceDescriptor, IAuthTabCallback);
        Iterator<addChangePayload> it = this.getInterfaceDescriptor.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            addChangePayload next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            onNavigationEvent(next, motionEvent);
        }
    }

    private final void onExtraCallback() {
        Iterator it = CollectionsKt.toList(CollectionsKt.asReversedMutable(this.asBinder)).iterator();
        while (it.hasNext()) {
            ((addChangePayload) it.next()).onTransact();
        }
        this.getInterfaceDescriptor.clear();
        this.getInterfaceDescriptor.addAll(this.asInterface);
        Iterator it2 = CollectionsKt.asReversedMutable(this.asInterface).iterator();
        while (it2.hasNext()) {
            ((addChangePayload) it2.next()).onTransact();
        }
    }

    private final void onNavigationEvent(addChangePayload addchangepayload, MotionEvent motionEvent) {
        if (!onWarmupCompleted(addchangepayload.ICustomTabsCallbackStub())) {
            addchangepayload.onTransact();
            return;
        }
        if (addchangepayload.IAuthTabCallback(motionEvent)) {
            int actionMasked = motionEvent.getActionMasked();
            View viewICustomTabsCallbackStub = addchangepayload.ICustomTabsCallbackStub();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Intrinsics.checkNotNullExpressionValue(motionEventObtain, "");
            MotionEvent motionEventOnNavigationEvent = onNavigationEvent(viewICustomTabsCallbackStub, motionEventObtain);
            if (addchangepayload.onActivityResized() && addchangepayload.onRelationshipValidationResult() != 0) {
                addchangepayload.onExtraCallback(motionEventOnNavigationEvent, motionEvent);
            }
            if (!addchangepayload.mayLaunchUrl() || actionMasked != 2) {
                boolean z = addchangepayload.onRelationshipValidationResult() == 0;
                addchangepayload.IAuthTabCallback(motionEventOnNavigationEvent, motionEvent);
                if (addchangepayload.ICustomTabsService()) {
                    if (addchangepayload.onActivityLayout()) {
                        addchangepayload.IAuthTabCallbackStub(false);
                        addchangepayload.newSessionWithExtras();
                    }
                    addchangepayload.onExtraCallback(motionEventOnNavigationEvent);
                }
                if (addchangepayload.onActivityResized() && z) {
                    addchangepayload.onExtraCallback(motionEventOnNavigationEvent, motionEvent);
                }
                if (actionMasked == 1 || actionMasked == 6 || actionMasked == 10) {
                    addchangepayload.onTransact(motionEventOnNavigationEvent.getPointerId(motionEventOnNavigationEvent.getActionIndex()));
                }
            }
            motionEventOnNavigationEvent.recycle();
        }
    }

    private final boolean onWarmupCompleted(View view) {
        if (view == null) {
            return false;
        }
        if (view == this.extraCallback) {
            return true;
        }
        ViewParent parent = view.getParent();
        while (parent != null && parent != this.extraCallback) {
            parent = parent.getParent();
        }
        return parent == this.extraCallback;
    }

    public final boolean onExtraCallbackWithResult() {
        ArrayList<addChangePayload> arrayList = this.asInterface;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            if (((addChangePayload) it.next()).onRelationshipValidationResult() == 4) {
                return true;
            }
        }
        return false;
    }

    public final MotionEvent onNavigationEvent(@Nullable View view, @NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (!Intrinsics.areEqual(viewGroup, this.extraCallback)) {
                onNavigationEvent(viewGroup, motionEvent);
            }
            if (viewGroup != null) {
                motionEvent.setLocation((motionEvent.getX() + viewGroup.getScrollX()) - view.getLeft(), (motionEvent.getY() + viewGroup.getScrollY()) - view.getTop());
            }
            if (!view.getMatrix().isIdentity()) {
                Matrix matrix = view.getMatrix();
                Matrix matrix2 = onNavigationEvent;
                matrix.invert(matrix2);
                motionEvent.transform(matrix2);
            }
        }
        return motionEvent;
    }

    public final PointF IAuthTabCallback(@Nullable View view, @NotNull PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "");
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (!Intrinsics.areEqual(viewGroup, this.extraCallback)) {
                IAuthTabCallback(viewGroup, pointF);
            }
            if (viewGroup != null) {
                pointF.x += viewGroup.getScrollX() - view.getLeft();
                pointF.y += viewGroup.getScrollY() - view.getTop();
            }
            if (!view.getMatrix().isIdentity()) {
                Matrix matrix = view.getMatrix();
                Matrix matrix2 = onNavigationEvent;
                matrix.invert(matrix2);
                float[] fArr = onExtraCallback;
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                matrix2.mapPoints(fArr);
                pointF.x = fArr[0];
                pointF.y = fArr[1];
            }
        }
        return pointF;
    }

    private final void onExtraCallbackWithResult(addChangePayload addchangepayload) {
        if (this.asBinder.contains(addchangepayload)) {
            return;
        }
        this.asBinder.add(addchangepayload);
        this.IAuthTabCallbackStub.add(Integer.valueOf(addchangepayload.onUnminimized()));
        addchangepayload.IAuthTabCallback(true);
        int i = this.onTransact;
        this.onTransact = i + 1;
        addchangepayload.onWarmupCompleted(i);
    }

    private final void onWarmupCompleted(addChangePayload addchangepayload, View view) {
        if (this.asInterface.contains(addchangepayload)) {
            return;
        }
        this.asInterface.add(addchangepayload);
        addchangepayload.onWarmupCompleted(false);
        addchangepayload.IAuthTabCallback(false);
        addchangepayload.onWarmupCompleted(Integer.MAX_VALUE);
        addchangepayload.onNavigationEvent(view, this);
    }

    private final boolean onTransact(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        Matrix matrix = view.getMatrix();
        float[] fArr = onWarmupCompleted;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        float left = fArr[0] + view.getLeft();
        float top = fArr[1] + view.getTop();
        return left < 0.0f || left + ((float) view.getWidth()) > ((float) viewGroup.getWidth()) || top < 0.0f || top + ((float) view.getHeight()) > ((float) viewGroup.getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    private final boolean onExtraCallbackWithResult(View view, float[] fArr, int i) {
        boolean z = false;
        for (RNGestureHandlerRootView parent = view.getParent(); parent != 0; parent = parent.getParent()) {
            if (parent instanceof ViewGroup) {
                if ((parent instanceof RNGestureHandlerRootView) && parent.onWarmupCompleted()) {
                    break;
                }
                ViewGroup viewGroup = parent;
                ArrayList<addChangePayload> arrayListIAuthTabCallback = this.access000.IAuthTabCallback(parent);
                if (arrayListIAuthTabCallback != null) {
                    synchronized (arrayListIAuthTabCallback) {
                        Iterator<addChangePayload> it = arrayListIAuthTabCallback.iterator();
                        Intrinsics.checkNotNullExpressionValue(it, "");
                        while (it.hasNext()) {
                            addChangePayload next = it.next();
                            Intrinsics.checkNotNullExpressionValue(next, "");
                            addChangePayload addchangepayload = next;
                            if (addchangepayload.isEngagementSignalsApiAvailable() && addchangepayload.onWarmupCompleted(view, fArr[0], fArr[1])) {
                                onWarmupCompleted(addchangepayload, viewGroup);
                                addchangepayload.asInterface(i);
                                z = true;
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                } else {
                    continue;
                }
            }
        }
        return z;
    }

    private final boolean onExtraCallback(addChangePayload addchangepayload, MotionEvent motionEvent) {
        return ((addchangepayload instanceof flagRemovedAndOffsetPosition) || (addchangepayload instanceof RNGestureHandlerRootHelper.RootViewGestureHandler) || !isTmpDetached.onExtraCallbackWithResult(motionEvent)) ? false : true;
    }

    private final boolean onWarmupCompleted(View view, float[] fArr, int i, MotionEvent motionEvent) {
        boolean z;
        ArrayList<addChangePayload> arrayListIAuthTabCallback = this.access000.IAuthTabCallback(view);
        if (arrayListIAuthTabCallback != null) {
            synchronized (arrayListIAuthTabCallback) {
                Iterator<addChangePayload> it = arrayListIAuthTabCallback.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "");
                z = false;
                while (it.hasNext()) {
                    addChangePayload next = it.next();
                    Intrinsics.checkNotNullExpressionValue(next, "");
                    addChangePayload addchangepayload = next;
                    if (addchangepayload.isEngagementSignalsApiAvailable() && addchangepayload.onWarmupCompleted(view, fArr[0], fArr[1]) && !onExtraCallback(addchangepayload, motionEvent)) {
                        onWarmupCompleted(addchangepayload, view);
                        addchangepayload.asInterface(i);
                        z = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        } else {
            z = false;
        }
        float width = view.getWidth();
        float f = fArr[0];
        if (0.0f <= f && f <= width) {
            float height = view.getHeight();
            float f2 = fArr[1];
            if (0.0f <= f2 && f2 <= height && onTransact(view) && onExtraCallbackWithResult(view, fArr, i)) {
                return true;
            }
        }
        return z;
    }

    private final void onNavigationEvent(MotionEvent motionEvent) throws NoWhenBranchMatchedException {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float[] fArr = onExtraCallback;
        fArr[0] = motionEvent.getX(actionIndex);
        fArr[1] = motionEvent.getY(actionIndex);
        onExtraCallback(this.extraCallback, fArr, pointerId, motionEvent);
        IAuthTabCallback(this.extraCallback, fArr, pointerId, motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean asBinder(View view) {
        return (view instanceof RNGestureHandlerRootView) && !Intrinsics.areEqual(view, this.extraCallback) && ((RNGestureHandlerRootView) view).onWarmupCompleted();
    }

    private final boolean IAuthTabCallback(ViewGroup viewGroup, float[] fArr, int i, MotionEvent motionEvent) {
        if (asBinder(viewGroup)) {
            return false;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View viewOnWarmupCompleted = this.readTypedObject.onWarmupCompleted(viewGroup, childCount);
            if (onExtraCallback(viewOnWarmupCompleted)) {
                PointF pointF = onExtraCallbackWithResult;
                onNavigationEvent onnavigationevent = Companion;
                onnavigationevent.onExtraCallback(fArr[0], fArr[1], viewGroup, viewOnWarmupCompleted, pointF);
                float f = fArr[0];
                float f2 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                boolean zOnExtraCallback = (!IAuthTabCallback(viewOnWarmupCompleted) || onnavigationevent.onWarmupCompleted(fArr[0], fArr[1], viewOnWarmupCompleted)) ? onExtraCallback(viewOnWarmupCompleted, fArr, i, motionEvent) : false;
                fArr[0] = f;
                fArr[1] = f2;
                if (zOnExtraCallback) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final boolean onExtraCallback(View view, float[] fArr, int i, MotionEvent motionEvent) throws NoWhenBranchMatchedException {
        if (asBinder(view)) {
            return false;
        }
        int i2 = onWarmupCompleted.onExtraCallback[this.readTypedObject.onExtraCallbackWithResult(view).ordinal()];
        if (i2 == 1) {
            return false;
        }
        if (i2 == 2) {
            return onWarmupCompleted(view, fArr, i, motionEvent) || Companion.onNavigationEvent(view, fArr);
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return onWarmupCompleted(view, fArr, i, motionEvent) || (view instanceof ViewGroup ? IAuthTabCallback((ViewGroup) view, fArr, i, motionEvent) : false) || Companion.onNavigationEvent(view, fArr);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (view instanceof ViewGroup) {
            boolean zIAuthTabCallback = IAuthTabCallback((ViewGroup) view, fArr, i, motionEvent);
            if (zIAuthTabCallback) {
                onWarmupCompleted(view, fArr, i, motionEvent);
            }
            return zIAuthTabCallback;
        }
        if (view instanceof EditText) {
            return onWarmupCompleted(view, fArr, i, motionEvent);
        }
        return false;
    }

    private final boolean onExtraCallback(View view) {
        return view.getVisibility() == 0 && view.getAlpha() >= this.IAuthTabCallbackStubProxy;
    }

    private final boolean IAuthTabCallback(View view) {
        return !(view instanceof ViewGroup) || this.readTypedObject.onExtraCallback((ViewGroup) view);
    }

    public final void onNavigationEvent(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ArrayList<addChangePayload> arrayListIAuthTabCallback = this.access000.IAuthTabCallback(view);
        if (arrayListIAuthTabCallback != null) {
            for (final addChangePayload addchangepayload : arrayListIAuthTabCallback) {
                if (addchangepayload instanceof getBindingAdapter) {
                    onWarmupCompleted(addchangepayload, view);
                    addchangepayload.onNavigationEvent(new Function0() { // from class: com.swmansion.gesturehandler.core.GestureHandlerOrchestrator$$ExternalSyntheticLambda2
                        public final Object invoke() {
                            return doesTransientStatePreventRecycling.onExtraCallback(addchangepayload);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(addChangePayload addchangepayload) {
        addchangepayload.IAuthTabCallbackStub();
        addchangepayload.asInterface();
        addchangepayload.getInterfaceDescriptor();
        return Unit.INSTANCE;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean onExtraCallback(int i) {
            return i == 3 || i == 1 || i == 5;
        }

        private onNavigationEvent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean onNavigationEvent(View view, float[] fArr) {
            return !((view instanceof ViewGroup) && view.getBackground() == null) && onWarmupCompleted(fArr[0], fArr[1], view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onExtraCallback(float f, float f2, ViewGroup viewGroup, View view, PointF pointF) {
            float scrollX = (f + viewGroup.getScrollX()) - view.getLeft();
            float scrollY = (f2 + viewGroup.getScrollY()) - view.getTop();
            Matrix matrix = view.getMatrix();
            if (!matrix.isIdentity()) {
                float[] fArr = doesTransientStatePreventRecycling.onWarmupCompleted;
                fArr[0] = scrollX;
                fArr[1] = scrollY;
                matrix.invert(doesTransientStatePreventRecycling.onNavigationEvent);
                doesTransientStatePreventRecycling.onNavigationEvent.mapPoints(fArr);
                float f3 = fArr[0];
                scrollY = fArr[1];
                scrollX = f3;
            }
            pointF.set(scrollX, scrollY);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean onWarmupCompleted(float f, float f2, View view) {
            return 0.0f <= f && f <= ((float) view.getWidth()) && 0.0f <= f2 && f2 <= ((float) view.getHeight());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean onWarmupCompleted(addChangePayload addchangepayload, addChangePayload addchangepayload2) {
            if (addchangepayload != addchangepayload2) {
                return addchangepayload.asInterface(addchangepayload2) || addchangepayload2.IAuthTabCallbackDefault(addchangepayload);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean onNavigationEvent(addChangePayload addchangepayload, addChangePayload addchangepayload2) {
            return addchangepayload == addchangepayload2 || addchangepayload.onTransact(addchangepayload2) || addchangepayload2.onTransact(addchangepayload);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean onExtraCallbackWithResult(addChangePayload addchangepayload, addChangePayload addchangepayload2) {
            if (!addchangepayload.onExtraCallbackWithResult(addchangepayload2) || onNavigationEvent(addchangepayload, addchangepayload2)) {
                return false;
            }
            if (addchangepayload == addchangepayload2) {
                return true;
            }
            if (addchangepayload.mayLaunchUrl() || addchangepayload.onRelationshipValidationResult() == 4) {
                return addchangepayload.asBinder(addchangepayload2);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onNavigationEvent(addChangePayload addchangepayload, addChangePayload addchangepayload2) {
        if ((addchangepayload.ICustomTabsService() && addchangepayload2.ICustomTabsService()) || (addchangepayload.mayLaunchUrl() && addchangepayload2.mayLaunchUrl())) {
            return Integer.signum(addchangepayload2.IAuthTabCallback_Parcel() - addchangepayload.IAuthTabCallback_Parcel());
        }
        if (addchangepayload.ICustomTabsService()) {
            return -1;
        }
        if (addchangepayload2.ICustomTabsService()) {
            return 1;
        }
        if (addchangepayload.mayLaunchUrl()) {
            return -1;
        }
        return addchangepayload2.mayLaunchUrl() ? 1 : 0;
    }
}
