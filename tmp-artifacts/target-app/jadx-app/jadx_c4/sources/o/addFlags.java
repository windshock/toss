package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.addChangePayload;
import o.addFlags;
import o.needsUpdate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addFlags extends addChangePayload {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static final double onExtraCallbackWithResult;
    private static final double onNavigationEvent;
    private Handler IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private VelocityTracker asInterface;
    private int onTransact = 1;
    private int onExtraCallback = 1;
    private final long IAuthTabCallbackStub = 800;
    private final long asBinder = 2000;
    private final Runnable onWarmupCompleted = new Runnable() { // from class: com.swmansion.gesturehandler.core.FlingGestureHandler$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            addFlags.onExtraCallback(this.f$0);
        }
    };

    public final void onExtraCallbackWithResult(int i) {
        this.onTransact = i;
    }

    public final void IAuthTabCallback(int i) {
        this.onExtraCallback = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(addFlags addflags) {
        addflags.access000();
    }

    @Override // o.addChangePayload
    public void onExtraCallbackWithResult() {
        super.onExtraCallbackWithResult();
        this.onTransact = 1;
        this.onExtraCallback = 1;
    }

    private final void onExtraCallbackWithResult(MotionEvent motionEvent) {
        this.asInterface = VelocityTracker.obtain();
        IAuthTabCallbackStub();
        this.IAuthTabCallbackDefault = 1;
        Handler handler = this.IAuthTabCallback;
        if (handler == null) {
            this.IAuthTabCallback = new Handler(Looper.getMainLooper());
        } else {
            Intrinsics.checkNotNull(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.IAuthTabCallback;
        Intrinsics.checkNotNull(handler2);
        handler2.postDelayed(this.onWarmupCompleted, this.IAuthTabCallbackStub);
    }

    private final boolean asInterface(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        onNavigationEvent(this.asInterface, motionEvent);
        needsUpdate.onNavigationEvent onnavigationevent = needsUpdate.Companion;
        VelocityTracker velocityTracker = this.asInterface;
        Intrinsics.checkNotNull(velocityTracker);
        needsUpdate needsupdateOnExtraCallback = onnavigationevent.onExtraCallback(velocityTracker);
        Integer[] numArr = {2, 1, 4, 8};
        ArrayList arrayList = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            arrayList.add(Boolean.valueOf(onNavigationEvent(this, needsupdateOnExtraCallback, numArr[i].intValue(), onNavigationEvent)));
        }
        Integer[] numArr2 = {5, 9, 6, 10};
        ArrayList arrayList2 = new ArrayList(4);
        for (int i2 = 0; i2 < 4; i2++) {
            arrayList2.add(Boolean.valueOf(onNavigationEvent(this, needsupdateOnExtraCallback, numArr2[i2].intValue(), onExtraCallbackWithResult)));
        }
        if (arrayList.isEmpty()) {
            z = false;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Boolean) it.next()).booleanValue()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (arrayList2.isEmpty()) {
            z2 = false;
        } else {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (((Boolean) it2.next()).booleanValue()) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        boolean z3 = needsupdateOnExtraCallback.IAuthTabCallbackStub() > ((double) this.asBinder);
        if (this.IAuthTabCallbackDefault != this.onTransact || (!z && !z2) || !z3) {
            return false;
        }
        Handler handler = this.IAuthTabCallback;
        Intrinsics.checkNotNull(handler);
        handler.removeCallbacksAndMessages(null);
        asInterface();
        return true;
    }

    private static final boolean onNavigationEvent(addFlags addflags, needsUpdate needsupdate, int i, double d) {
        return (addflags.onExtraCallback & i) == i && needsupdate.onExtraCallback(needsUpdate.Companion.onExtraCallback(i), d);
    }

    @Override // o.addChangePayload
    public void onExtraCallback(boolean z) {
        super.onExtraCallback(z);
        getInterfaceDescriptor();
    }

    private final void onNavigationEvent(MotionEvent motionEvent) {
        if (asInterface(motionEvent)) {
            return;
        }
        access000();
    }

    @Override // o.addChangePayload
    protected void onExtraCallbackWithResult(@NotNull MotionEvent motionEvent, @NotNull MotionEvent motionEvent2) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        Intrinsics.checkNotNullParameter(motionEvent2, "");
        if (onWarmupCompleted(motionEvent2)) {
            int iOnRelationshipValidationResult = onRelationshipValidationResult();
            if (iOnRelationshipValidationResult == 0) {
                onExtraCallbackWithResult(motionEvent2);
            }
            if (iOnRelationshipValidationResult == 2) {
                asInterface(motionEvent2);
                if (motionEvent2.getPointerCount() > this.IAuthTabCallbackDefault) {
                    this.IAuthTabCallbackDefault = motionEvent2.getPointerCount();
                }
                if (motionEvent2.getActionMasked() == 1) {
                    onNavigationEvent(motionEvent2);
                }
            }
        }
    }

    @Override // o.addChangePayload
    protected void onWarmupCompleted() {
        Handler handler = this.IAuthTabCallback;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // o.addChangePayload
    protected void onNavigationEvent() {
        VelocityTracker velocityTracker = this.asInterface;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.asInterface = null;
        Handler handler = this.IAuthTabCallback;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private final void onNavigationEvent(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        Intrinsics.checkNotNull(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
    }

    public static final class onNavigationEvent extends addChangePayload.IAuthTabCallback<addFlags> {
        public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
        private final Class<addFlags> onExtraCallbackWithResult = addFlags.class;
        private final String onWarmupCompleted = "FlingGestureHandler";

        @Override // o.addChangePayload.IAuthTabCallback
        public Class<addFlags> onWarmupCompleted() {
            return this.onExtraCallbackWithResult;
        }

        @Override // o.addChangePayload.IAuthTabCallback
        public String IAuthTabCallback() {
            return this.onWarmupCompleted;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.addChangePayload.IAuthTabCallback
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public addFlags IAuthTabCallback(@Nullable Context context) {
            return new addFlags();
        }

        @Override // o.addChangePayload.IAuthTabCallback
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public void onNavigationEvent(@NotNull addFlags addflags, @NotNull ReadableMap readableMap) {
            Intrinsics.checkNotNullParameter(addflags, "");
            Intrinsics.checkNotNullParameter(readableMap, "");
            super.onNavigationEvent(addflags, readableMap);
            if (readableMap.hasKey("numberOfPointers")) {
                addflags.onExtraCallbackWithResult(readableMap.getInt("numberOfPointers"));
            }
            if (readableMap.hasKey("direction")) {
                addflags.IAuthTabCallback(readableMap.getInt("direction"));
            }
        }

        @Override // o.addChangePayload.IAuthTabCallback
        public isUpdated onExtraCallback(@NotNull addFlags addflags) {
            Intrinsics.checkNotNullParameter(addflags, "");
            return new isUpdated(addflags);
        }

        public static final class IAuthTabCallback {
            public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private IAuthTabCallback() {
            }
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    static {
        clearReturnedFromScrapFlag clearreturnedfromscrapflag = clearReturnedFromScrapFlag.onExtraCallbackWithResult;
        onNavigationEvent = clearreturnedfromscrapflag.IAuthTabCallback(30.0d);
        onExtraCallbackWithResult = clearreturnedfromscrapflag.IAuthTabCallback(60.0d);
    }
}
