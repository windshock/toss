package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import o.addChangePayload;
import o.getOldPosition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getOldPosition extends addChangePayload {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private long IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private long IAuthTabCallbackStub;
    private float asBinder;
    private long asInterface;
    private int onExtraCallback;
    private final float onExtraCallbackWithResult;
    private float onNavigationEvent;
    private float onTransact;
    private Handler onWarmupCompleted;

    public getOldPosition(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback = 500L;
        onExtraCallbackWithResult(true);
        float f = context.getResources().getDisplayMetrics().density * 10.0f;
        this.onExtraCallbackWithResult = f;
        this.onNavigationEvent = f;
        this.IAuthTabCallbackDefault = 1;
    }

    public final void IAuthTabCallback(long j) {
        this.IAuthTabCallback = j;
    }

    public final int newSession() {
        return (int) (this.IAuthTabCallbackStub - this.asInterface);
    }

    @Override // o.addChangePayload
    public void onExtraCallbackWithResult() {
        super.onExtraCallbackWithResult();
        this.IAuthTabCallback = 500L;
        this.onNavigationEvent = this.onExtraCallbackWithResult;
        onExtraCallbackWithResult(true);
    }

    static /* synthetic */ Pair onExtraCallbackWithResult(getOldPosition getoldposition, MotionEvent motionEvent, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return getoldposition.onNavigationEvent(motionEvent, z);
    }

    private final Pair<Float, Float> onNavigationEvent(MotionEvent motionEvent, boolean z) {
        if (!z) {
            IntRange intRangeUntil = RangesKt.until(0, motionEvent.getPointerCount());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            IntIterator it = intRangeUntil.iterator();
            while (it.hasNext()) {
                arrayList.add(Float.valueOf(motionEvent.getX(it.nextInt())));
            }
            float fAverageOfFloat = (float) CollectionsKt.averageOfFloat(arrayList);
            IntRange intRangeUntil2 = RangesKt.until(0, motionEvent.getPointerCount());
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil2, 10));
            IntIterator it2 = intRangeUntil2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Float.valueOf(motionEvent.getY(it2.nextInt())));
            }
            return new Pair<>(Float.valueOf(fAverageOfFloat), Float.valueOf((float) CollectionsKt.averageOfFloat(arrayList2)));
        }
        int pointerCount = motionEvent.getPointerCount();
        float x = 0.0f;
        float y = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            if (i != motionEvent.getActionIndex()) {
                x += motionEvent.getX(i);
                y += motionEvent.getY(i);
            }
        }
        return new Pair<>(Float.valueOf(x / (motionEvent.getPointerCount() - 1)), Float.valueOf(y / (motionEvent.getPointerCount() - 1)));
    }

    @Override // o.addChangePayload
    protected void onExtraCallbackWithResult(@NotNull MotionEvent motionEvent, @NotNull MotionEvent motionEvent2) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        Intrinsics.checkNotNullParameter(motionEvent2, "");
        if (onWarmupCompleted(motionEvent2)) {
            if (onRelationshipValidationResult() == 0) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                this.IAuthTabCallbackStub = jUptimeMillis;
                this.asInterface = jUptimeMillis;
                IAuthTabCallbackStub();
                Pair pairOnExtraCallbackWithResult = onExtraCallbackWithResult(this, motionEvent2, false, 2, null);
                float fFloatValue = ((Number) pairOnExtraCallbackWithResult.onExtraCallbackWithResult()).floatValue();
                float fFloatValue2 = ((Number) pairOnExtraCallbackWithResult.IAuthTabCallback()).floatValue();
                this.onTransact = fFloatValue;
                this.asBinder = fFloatValue2;
                this.onExtraCallback++;
            }
            if (motionEvent2.getActionMasked() == 5) {
                this.onExtraCallback++;
                Pair pairOnExtraCallbackWithResult2 = onExtraCallbackWithResult(this, motionEvent2, false, 2, null);
                float fFloatValue3 = ((Number) pairOnExtraCallbackWithResult2.onExtraCallbackWithResult()).floatValue();
                float fFloatValue4 = ((Number) pairOnExtraCallbackWithResult2.IAuthTabCallback()).floatValue();
                this.onTransact = fFloatValue3;
                this.asBinder = fFloatValue4;
                if (this.onExtraCallback > this.IAuthTabCallbackDefault) {
                    access000();
                    this.onExtraCallback = 0;
                }
            }
            if (onRelationshipValidationResult() == 2 && this.onExtraCallback == this.IAuthTabCallbackDefault && (motionEvent2.getActionMasked() == 0 || motionEvent2.getActionMasked() == 5)) {
                Handler handler = new Handler(Looper.getMainLooper());
                this.onWarmupCompleted = handler;
                long j = this.IAuthTabCallback;
                if (j > 0) {
                    Intrinsics.checkNotNull(handler);
                    handler.postDelayed(new Runnable() { // from class: com.swmansion.gesturehandler.core.LongPressGestureHandler$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            getOldPosition.onWarmupCompleted(this.f$0);
                        }
                    }, this.IAuthTabCallback);
                } else if (j == 0) {
                    asInterface();
                }
            }
            if (motionEvent2.getActionMasked() == 1 || motionEvent2.getActionMasked() == 12) {
                this.onExtraCallback--;
                Handler handler2 = this.onWarmupCompleted;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                    this.onWarmupCompleted = null;
                }
                if (onRelationshipValidationResult() == 4) {
                    getInterfaceDescriptor();
                    return;
                } else {
                    access000();
                    return;
                }
            }
            if (motionEvent2.getActionMasked() == 6) {
                int i = this.onExtraCallback - 1;
                this.onExtraCallback = i;
                if (i < this.IAuthTabCallbackDefault && onRelationshipValidationResult() != 4) {
                    access000();
                    this.onExtraCallback = 0;
                    return;
                }
                Pair<Float, Float> pairOnNavigationEvent = onNavigationEvent(motionEvent2, true);
                float fFloatValue5 = ((Number) pairOnNavigationEvent.onExtraCallbackWithResult()).floatValue();
                float fFloatValue6 = ((Number) pairOnNavigationEvent.IAuthTabCallback()).floatValue();
                this.onTransact = fFloatValue5;
                this.asBinder = fFloatValue6;
                return;
            }
            Pair pairOnExtraCallbackWithResult3 = onExtraCallbackWithResult(this, motionEvent2, false, 2, null);
            float fFloatValue7 = ((Number) pairOnExtraCallbackWithResult3.onExtraCallbackWithResult()).floatValue();
            float fFloatValue8 = ((Number) pairOnExtraCallbackWithResult3.IAuthTabCallback()).floatValue();
            float f = fFloatValue7 - this.onTransact;
            float f2 = fFloatValue8 - this.asBinder;
            float f3 = this.onNavigationEvent;
            if ((f * f) + (f2 * f2) > f3 * f3) {
                if (onRelationshipValidationResult() == 4) {
                    onTransact();
                } else {
                    access000();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(getOldPosition getoldposition) {
        getoldposition.asInterface();
    }

    @Override // o.addChangePayload
    protected void IAuthTabCallback(int i, int i2) {
        Handler handler = this.onWarmupCompleted;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.onWarmupCompleted = null;
        }
    }

    @Override // o.addChangePayload
    public void onWarmupCompleted(int i, int i2) {
        this.IAuthTabCallbackStub = SystemClock.uptimeMillis();
        super.onWarmupCompleted(i, i2);
    }

    @Override // o.addChangePayload
    public void onExtraCallback(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        this.IAuthTabCallbackStub = SystemClock.uptimeMillis();
        super.onExtraCallback(motionEvent);
    }

    @Override // o.addChangePayload
    protected void onNavigationEvent() {
        super.onNavigationEvent();
        this.onExtraCallback = 0;
    }

    public static final class onWarmupCompleted extends addChangePayload.IAuthTabCallback<getOldPosition> {
        public static final onNavigationEvent Companion = new onNavigationEvent(null);
        private final Class<getOldPosition> onExtraCallback = getOldPosition.class;
        private final String onWarmupCompleted = "LongPressGestureHandler";

        @Override // o.addChangePayload.IAuthTabCallback
        public Class<getOldPosition> onWarmupCompleted() {
            return this.onExtraCallback;
        }

        @Override // o.addChangePayload.IAuthTabCallback
        public String IAuthTabCallback() {
            return this.onWarmupCompleted;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.addChangePayload.IAuthTabCallback
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public getOldPosition IAuthTabCallback(@Nullable Context context) {
            Intrinsics.checkNotNull(context);
            return new getOldPosition(context);
        }

        @Override // o.addChangePayload.IAuthTabCallback
        public void onNavigationEvent(@NotNull getOldPosition getoldposition, @NotNull ReadableMap readableMap) {
            Intrinsics.checkNotNullParameter(getoldposition, "");
            Intrinsics.checkNotNullParameter(readableMap, "");
            super.onNavigationEvent((onWarmupCompleted) getoldposition, readableMap);
            if (readableMap.hasKey("minDurationMs")) {
                getoldposition.IAuthTabCallback(readableMap.getInt("minDurationMs"));
            }
            if (readableMap.hasKey("maxDist")) {
                getoldposition.onNavigationEvent = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(readableMap.getDouble("maxDist"));
            }
            if (readableMap.hasKey("numberOfPointers")) {
                getoldposition.IAuthTabCallbackStub(readableMap.getInt("numberOfPointers"));
            }
        }

        @Override // o.addChangePayload.IAuthTabCallback
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public saveOldPosition onExtraCallback(@NotNull getOldPosition getoldposition) {
            Intrinsics.checkNotNullParameter(getoldposition, "");
            return new saveOldPosition(getoldposition);
        }

        public static final class onNavigationEvent {
            public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onNavigationEvent() {
            }
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }
}
