package o;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.gesturehandler.RNSVGHitTester;
import com.swmansion.gesturehandler.core.GestureHandler$;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class addChangePayload {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static MotionEvent.PointerCoords[] IAuthTabCallback;
    private static short onExtraCallbackWithResult;
    private static final Void onNavigationEvent = null;
    private static MotionEvent.PointerProperties[] onWarmupCompleted;
    private float[] IAuthTabCallbackDefault;
    private WritableArray IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private float ICustomTabsCallback;
    private int ICustomTabsCallbackDefault;
    private int ICustomTabsCallbackStub;
    private boolean ICustomTabsCallbackStubProxy;
    private int ICustomTabsCallback_Parcel;
    private int ICustomTabsService;
    private getAdapterPosition access000;
    private boolean access100;
    private WritableArray asBinder;
    private int asInterface;
    private float extraCallback;
    private boolean extraCallbackWithResult;
    private int extraCommand;
    private boolean getInterfaceDescriptor;
    private final int[] isEngagementSignalsApiAvailable = new int[12];
    private final onExtraCallbackWithResult[] mayLaunchUrl;
    private float newAuthTabSession;
    private float newSession;
    private final int[] newSessionWithExtras;
    private boolean onActivityLayout;
    private int onActivityResized;
    private int onExtraCallback;
    private getLayoutPosition onMessageChannelReady;
    private int onMinimized;
    private doesTransientStatePreventRecycling onPostMessage;
    private int onRelationshipValidationResult;
    private short onTransact;
    private boolean onUnminimized;
    private View prefetch;
    private float readTypedObject;
    private float writeTypedObject;

    protected void IAuthTabCallback(int i, int i2) {
    }

    protected void ICustomTabsCallback_Parcel() {
    }

    public void newSessionWithExtras() {
    }

    protected void onNavigationEvent() {
    }

    protected void onWarmupCompleted() {
    }

    protected void onWarmupCompleted(@NotNull MotionEvent motionEvent, @NotNull MotionEvent motionEvent2) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        Intrinsics.checkNotNullParameter(motionEvent2, "");
    }

    protected void prefetch() {
    }

    public addChangePayload() {
        int[] iArr = new int[2];
        for (int i = 0; i < 2; i++) {
            iArr[i] = 0;
        }
        this.newSessionWithExtras = iArr;
        this.IAuthTabCallback_Parcel = true;
        onExtraCallbackWithResult[] onextracallbackwithresultArr = new onExtraCallbackWithResult[12];
        for (int i2 = 0; i2 < 12; i2++) {
            onextracallbackwithresultArr[i2] = null;
        }
        this.mayLaunchUrl = onextracallbackwithresultArr;
        this.ICustomTabsCallbackDefault = 3;
    }

    public final void asBinder(int i) {
        this.ICustomTabsCallbackStub = i;
    }

    public final int onUnminimized() {
        return this.ICustomTabsCallbackStub;
    }

    public final View ICustomTabsCallbackStub() {
        return this.prefetch;
    }

    public final int onRelationshipValidationResult() {
        return this.onRelationshipValidationResult;
    }

    public final boolean extraCommand() {
        return this.IAuthTabCallbackStubProxy;
    }

    public final boolean isEngagementSignalsApiAvailable() {
        return this.IAuthTabCallback_Parcel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTransact(boolean z) {
        if (this.prefetch != null && this.IAuthTabCallback_Parcel != z) {
            UiThreadUtil.runOnUiThread(new GestureHandler$.ExternalSyntheticLambda0(this));
        }
        this.IAuthTabCallback_Parcel = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackStub(addChangePayload addchangepayload) {
        addchangepayload.onTransact();
    }

    public final int access100() {
        return this.onExtraCallback;
    }

    public final void onExtraCallback(int i) {
        this.onExtraCallback = i;
    }

    public final int ICustomTabsCallbackDefault() {
        return this.ICustomTabsCallback_Parcel;
    }

    public final int ICustomTabsCallbackStubProxy() {
        return this.ICustomTabsService;
    }

    public final boolean onActivityResized() {
        return this.onActivityLayout;
    }

    public final void onNavigationEvent(boolean z) {
        this.onActivityLayout = z;
    }

    public final short extraCallbackWithResult() {
        return this.onTransact;
    }

    public final int onMessageChannelReady() {
        return this.onActivityResized;
    }

    protected final void IAuthTabCallbackStub(int i) {
        this.onActivityResized = i;
    }

    protected final void onExtraCallbackWithResult(boolean z) {
        this.ICustomTabsCallbackStubProxy = z;
    }

    public final doesTransientStatePreventRecycling onPostMessage() {
        return this.onPostMessage;
    }

    public final void onWarmupCompleted(@Nullable getLayoutPosition getlayoutposition) {
        this.onMessageChannelReady = getlayoutposition;
    }

    public final int onMinimized() {
        return this.ICustomTabsCallbackDefault;
    }

    protected final void onNavigationEvent(int i) {
        this.onMinimized = i;
    }

    public final int IAuthTabCallback_Parcel() {
        return this.asInterface;
    }

    public final void onWarmupCompleted(int i) {
        this.asInterface = i;
    }

    public final boolean ICustomTabsService() {
        return this.getInterfaceDescriptor;
    }

    public final void onWarmupCompleted(boolean z) {
        this.getInterfaceDescriptor = z;
    }

    public final void IAuthTabCallback(boolean z) {
        this.access100 = z;
    }

    public final boolean mayLaunchUrl() {
        return this.access100;
    }

    public final void IAuthTabCallbackStub(boolean z) {
        this.onUnminimized = z;
    }

    public final boolean onActivityLayout() {
        return this.onUnminimized;
    }

    public void onWarmupCompleted(int i, int i2) {
        getLayoutPosition getlayoutposition = this.onMessageChannelReady;
        if (getlayoutposition != null) {
            getlayoutposition.onNavigationEvent(this, i, i2);
        }
    }

    public void onExtraCallback(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        getLayoutPosition getlayoutposition = this.onMessageChannelReady;
        if (getlayoutposition != null) {
            getlayoutposition.onWarmupCompleted(this, motionEvent);
        }
    }

    public void IAuthTabCallbackStubProxy() {
        getLayoutPosition getlayoutposition;
        if (this.IAuthTabCallbackStub == null || (getlayoutposition = this.onMessageChannelReady) == null) {
            return;
        }
        getlayoutposition.onNavigationEvent(this);
    }

    public void onExtraCallbackWithResult() {
        this.onActivityLayout = false;
        this.extraCallbackWithResult = false;
        this.ICustomTabsCallbackStubProxy = false;
        onTransact(true);
        this.IAuthTabCallbackDefault = (float[]) onNavigationEvent;
        this.onMinimized = 0;
    }

    public final boolean onExtraCallbackWithResult(@NotNull addChangePayload addchangepayload) {
        Intrinsics.checkNotNullParameter(addchangepayload, "");
        int length = this.isEngagementSignalsApiAvailable.length;
        for (int i = 0; i < length; i++) {
            if (this.isEngagementSignalsApiAvailable[i] != -1 && addchangepayload.isEngagementSignalsApiAvailable[i] != -1) {
                return true;
            }
        }
        return false;
    }

    public final void onExtraCallback(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.IAuthTabCallbackDefault == null) {
            this.IAuthTabCallbackDefault = new float[6];
        }
        float[] fArr = this.IAuthTabCallbackDefault;
        Intrinsics.checkNotNull(fArr);
        fArr[0] = f;
        float[] fArr2 = this.IAuthTabCallbackDefault;
        Intrinsics.checkNotNull(fArr2);
        fArr2[1] = f2;
        float[] fArr3 = this.IAuthTabCallbackDefault;
        Intrinsics.checkNotNull(fArr3);
        fArr3[2] = f3;
        float[] fArr4 = this.IAuthTabCallbackDefault;
        Intrinsics.checkNotNull(fArr4);
        fArr4[3] = f4;
        float[] fArr5 = this.IAuthTabCallbackDefault;
        Intrinsics.checkNotNull(fArr5);
        fArr5[4] = f5;
        float[] fArr6 = this.IAuthTabCallbackDefault;
        Intrinsics.checkNotNull(fArr6);
        fArr6[5] = f6;
        onExtraCallback onextracallback = Companion;
        if (onextracallback.IAuthTabCallback(f5) && onextracallback.IAuthTabCallback(f) && onextracallback.IAuthTabCallback(f3)) {
            throw new IllegalArgumentException("Cannot have all of left, right and width defined");
        }
        if (onextracallback.IAuthTabCallback(f5) && !onextracallback.IAuthTabCallback(f) && !onextracallback.IAuthTabCallback(f3)) {
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined");
        }
        if (onextracallback.IAuthTabCallback(f6) && onextracallback.IAuthTabCallback(f4) && onextracallback.IAuthTabCallback(f2)) {
            throw new IllegalArgumentException("Cannot have all of top, bottom and height defined");
        }
        if (onextracallback.IAuthTabCallback(f6) && !onextracallback.IAuthTabCallback(f4) && !onextracallback.IAuthTabCallback(f2)) {
            throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined");
        }
    }

    public final void onExtraCallback(@Nullable getAdapterPosition getadapterposition) {
        this.access000 = getadapterposition;
    }

    public final void onNavigationEvent(@Nullable View view, @Nullable doesTransientStatePreventRecycling doestransientstatepreventrecycling) {
        if (this.prefetch != null || this.onPostMessage != null) {
            throw new IllegalStateException("Already prepared or hasn't been reset");
        }
        Arrays.fill(this.isEngagementSignalsApiAvailable, -1);
        this.extraCommand = 0;
        this.onRelationshipValidationResult = 0;
        this.prefetch = view;
        this.onPostMessage = doestransientstatepreventrecycling;
        Activity activityOnExtraCallbackWithResult = onExtraCallbackWithResult(view != null ? view.getContext() : null);
        View viewFindViewById = activityOnExtraCallbackWithResult != null ? activityOnExtraCallbackWithResult.findViewById(R.id.content) : null;
        if (viewFindViewById != null) {
            viewFindViewById.getLocationOnScreen(this.newSessionWithExtras);
        } else {
            int[] iArr = this.newSessionWithExtras;
            iArr[0] = 0;
            iArr[1] = 0;
        }
        prefetch();
    }

    private final Activity onExtraCallbackWithResult(Context context) {
        if (context instanceof ReactContext) {
            return ((ReactContext) context).getCurrentActivity();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return onExtraCallbackWithResult(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private final int requestPostMessageChannel() {
        int[] iArr;
        int i = 0;
        while (i < this.extraCommand) {
            int i2 = 0;
            while (true) {
                iArr = this.isEngagementSignalsApiAvailable;
                if (i2 >= iArr.length || iArr[i2] == i) {
                    break;
                }
                i2++;
            }
            if (i2 == iArr.length) {
                break;
            }
            i++;
        }
        return i;
    }

    public final void asInterface(int i) {
        if (IAuthTabCallback(i)) {
            return;
        }
        this.isEngagementSignalsApiAvailable[i] = requestPostMessageChannel();
        this.extraCommand++;
    }

    public final void onTransact(int i) {
        if (IAuthTabCallback(i)) {
            this.isEngagementSignalsApiAvailable[i] = -1;
            this.extraCommand--;
        }
    }

    private final boolean IAuthTabCallback(int i) {
        return this.isEngagementSignalsApiAvailable[i] != -1;
    }

    private final boolean onNavigationEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != this.extraCommand) {
            return true;
        }
        int length = this.isEngagementSignalsApiAvailable.length;
        for (int i = 0; i < length; i++) {
            int i2 = this.isEngagementSignalsApiAvailable[i];
            if (i2 != -1 && i2 != i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[PHI: r0
      0x0052: PHI (r0v5 int) = (r0v2 int), (r0v19 int) binds: [B:19:0x0043, B:13:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.view.MotionEvent$PointerProperties[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final MotionEvent onExtraCallbackWithResult(MotionEvent motionEvent) throws onWarmupCompleted {
        int actionIndex;
        int i;
        MotionEvent.PointerCoords[] pointerCoordsArr;
        MotionEvent.PointerCoords[] pointerCoordsArr2;
        if (!onNavigationEvent(motionEvent)) {
            return motionEvent;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i2 = 0;
        if (actionMasked == 0) {
            actionIndex = motionEvent.getActionIndex();
            if (this.isEngagementSignalsApiAvailable[motionEvent.getPointerId(actionIndex)] == -1) {
                i = actionIndex;
                actionMasked = 2;
            } else if (this.extraCommand == 1) {
                i = actionIndex;
                actionMasked = 0;
            } else {
                i = actionIndex;
                actionMasked = 5;
            }
        } else if (actionMasked == 1) {
            actionIndex = motionEvent.getActionIndex();
            if (this.isEngagementSignalsApiAvailable[motionEvent.getPointerId(actionIndex)] != -1) {
                if (this.extraCommand == 1) {
                    i = actionIndex;
                    actionMasked = 1;
                } else {
                    i = actionIndex;
                    actionMasked = 6;
                }
            }
        } else if (actionMasked != 5) {
            if (actionMasked != 6) {
                i = -1;
            }
        }
        Companion.onExtraCallbackWithResult(this.extraCommand);
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        int pointerCount = motionEvent.getPointerCount();
        int i3 = actionMasked;
        int i4 = 0;
        while (true) {
            pointerCoordsArr = null;
            if (i2 >= pointerCount) {
                break;
            }
            int pointerId = motionEvent.getPointerId(i2);
            if (this.isEngagementSignalsApiAvailable[pointerId] != -1) {
                MotionEvent.PointerProperties[] pointerPropertiesArr = onWarmupCompleted;
                if (pointerPropertiesArr == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    pointerPropertiesArr = null;
                }
                motionEvent.getPointerProperties(i2, pointerPropertiesArr[i4]);
                MotionEvent.PointerProperties[] pointerPropertiesArr2 = onWarmupCompleted;
                if (pointerPropertiesArr2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    pointerPropertiesArr2 = null;
                }
                MotionEvent.PointerProperties pointerProperties = pointerPropertiesArr2[i4];
                Intrinsics.checkNotNull(pointerProperties);
                pointerProperties.id = this.isEngagementSignalsApiAvailable[pointerId];
                MotionEvent.PointerCoords[] pointerCoordsArr3 = IAuthTabCallback;
                if (pointerCoordsArr3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    pointerCoordsArr = pointerCoordsArr3;
                }
                motionEvent.getPointerCoords(i2, pointerCoordsArr[i4]);
                if (i2 == i) {
                    i3 |= i4 << 8;
                }
                i4++;
            }
            i2++;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr3 = onWarmupCompleted;
        if (pointerPropertiesArr3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            pointerPropertiesArr3 = null;
        }
        if (pointerPropertiesArr3.length != 0) {
            MotionEvent.PointerCoords[] pointerCoordsArr4 = IAuthTabCallback;
            if (pointerCoordsArr4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                pointerCoordsArr4 = null;
            }
            if (pointerCoordsArr4.length != 0) {
                try {
                    long downTime = motionEvent.getDownTime();
                    long eventTime = motionEvent.getEventTime();
                    MotionEvent.PointerProperties[] pointerPropertiesArr4 = onWarmupCompleted;
                    if (pointerPropertiesArr4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        pointerPropertiesArr4 = null;
                    }
                    MotionEvent.PointerCoords[] pointerCoordsArr5 = IAuthTabCallback;
                    if (pointerCoordsArr5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        pointerCoordsArr2 = null;
                    } else {
                        pointerCoordsArr2 = pointerCoordsArr5;
                    }
                    MotionEvent motionEventObtain = MotionEvent.obtain(downTime, eventTime, i3, i4, pointerPropertiesArr4, pointerCoordsArr2, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
                    Intrinsics.checkNotNullExpressionValue(motionEventObtain, "");
                    float f = -rawX;
                    float f2 = -rawY;
                    motionEvent.offsetLocation(f, f2);
                    motionEventObtain.offsetLocation(f, f2);
                    return motionEventObtain;
                } catch (IllegalArgumentException e) {
                    throw new onWarmupCompleted(this, motionEvent, e);
                }
            }
        }
        MotionEvent.PointerCoords[] pointerCoordsArr6 = IAuthTabCallback;
        if (pointerCoordsArr6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            pointerCoordsArr6 = null;
        }
        int length = pointerCoordsArr6.length;
        ?? r3 = onWarmupCompleted;
        if (r3 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            pointerCoordsArr = r3;
        }
        throw new IllegalStateException("pointerCoords.size=" + length + ", pointerProps.size=" + pointerCoordsArr.length);
    }

    public static final class onWarmupCompleted extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull addChangePayload addchangepayload, @NotNull MotionEvent motionEvent, @NotNull IllegalArgumentException illegalArgumentException) {
            super(StringsKt.trimIndent("\n    handler: " + Reflection.getOrCreateKotlinClass(addchangepayload.getClass()).getSimpleName() + "\n    state: " + addchangepayload.onRelationshipValidationResult() + "\n    view: " + addchangepayload.ICustomTabsCallbackStub() + "\n    orchestrator: " + addchangepayload.onPostMessage() + "\n    isEnabled: " + addchangepayload.isEngagementSignalsApiAvailable() + "\n    isActive: " + addchangepayload.ICustomTabsService() + "\n    isAwaiting: " + addchangepayload.mayLaunchUrl() + "\n    trackedPointersCount: " + addchangepayload.extraCommand + "\n    trackedPointers: " + ArraysKt.joinToString$default(addchangepayload.isEngagementSignalsApiAvailable, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + "\n    while handling event: " + motionEvent + "\n      "), illegalArgumentException);
            Intrinsics.checkNotNullParameter(addchangepayload, "");
            Intrinsics.checkNotNullParameter(motionEvent, "");
            Intrinsics.checkNotNullParameter(illegalArgumentException, "");
        }
    }

    public final void IAuthTabCallback(@NotNull MotionEvent motionEvent, @NotNull MotionEvent motionEvent2) {
        int i;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        Intrinsics.checkNotNullParameter(motionEvent2, "");
        if (!this.IAuthTabCallback_Parcel || (i = this.onRelationshipValidationResult) == 3 || i == 1 || i == 5 || this.extraCommand <= 0) {
            return;
        }
        try {
            MotionEvent[] motionEventArr = {onExtraCallbackWithResult(motionEvent), onExtraCallbackWithResult(motionEvent2)};
            MotionEvent motionEvent3 = motionEventArr[0];
            MotionEvent motionEvent4 = motionEventArr[1];
            this.newSession = motionEvent3.getX();
            this.newAuthTabSession = motionEvent3.getY();
            this.onActivityResized = motionEvent3.getPointerCount();
            boolean zOnWarmupCompleted = onWarmupCompleted(this.prefetch, this.newSession, this.newAuthTabSession);
            this.IAuthTabCallbackStubProxy = zOnWarmupCompleted;
            if (this.ICustomTabsCallbackStubProxy && !zOnWarmupCompleted) {
                int i2 = this.onRelationshipValidationResult;
                if (i2 == 4) {
                    onTransact();
                    return;
                } else {
                    if (i2 == 2) {
                        access000();
                        return;
                    }
                    return;
                }
            }
            clearReturnedFromScrapFlag clearreturnedfromscrapflag = clearReturnedFromScrapFlag.onExtraCallbackWithResult;
            this.extraCallback = clearreturnedfromscrapflag.onExtraCallback(motionEvent3, true);
            this.writeTypedObject = clearreturnedfromscrapflag.onNavigationEvent(motionEvent3, true);
            this.readTypedObject = motionEvent3.getRawX() - motionEvent3.getX();
            this.ICustomTabsCallback = motionEvent3.getRawY() - motionEvent3.getY();
            if (motionEvent2.getAction() == 0 || motionEvent2.getAction() == 9 || motionEvent2.getAction() == 7) {
                IAuthTabCallbackStub(motionEvent2);
            }
            if (isTmpDetached.onExtraCallbackWithResult(motionEvent2)) {
                onWarmupCompleted(motionEvent3, motionEvent4);
            } else {
                onExtraCallbackWithResult(motionEvent3, motionEvent4);
            }
            if (!Intrinsics.areEqual(motionEvent3, motionEvent)) {
                motionEvent3.recycle();
            }
            if (Intrinsics.areEqual(motionEvent4, motionEvent2)) {
                return;
            }
            motionEvent4.recycle();
        } catch (onWarmupCompleted unused) {
            access000();
        }
    }

    private final void onNavigationEvent(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.IAuthTabCallbackStub = null;
        this.ICustomTabsCallback_Parcel = 1;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        float rawX = motionEvent2.getRawX();
        float x = motionEvent2.getX();
        float rawY = motionEvent2.getRawY();
        float y = motionEvent2.getY();
        this.mayLaunchUrl[pointerId] = new onExtraCallbackWithResult(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (rawX - x)) - this.newSessionWithExtras[0], (motionEvent2.getY(motionEvent.getActionIndex()) + (rawY - y)) - this.newSessionWithExtras[1]);
        this.ICustomTabsService++;
        onExtraCallbackWithResult onextracallbackwithresult = this.mayLaunchUrl[pointerId];
        Intrinsics.checkNotNull(onextracallbackwithresult);
        onWarmupCompleted(onextracallbackwithresult);
        postMessage();
        IAuthTabCallbackStubProxy();
    }

    private final void IAuthTabCallbackStub(MotionEvent motionEvent, MotionEvent motionEvent2) {
        postMessage();
        this.IAuthTabCallbackStub = null;
        this.ICustomTabsCallback_Parcel = 3;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        float rawX = motionEvent2.getRawX();
        float x = motionEvent2.getX();
        float rawY = motionEvent2.getRawY();
        float y = motionEvent2.getY();
        this.mayLaunchUrl[pointerId] = new onExtraCallbackWithResult(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (rawX - x)) - this.newSessionWithExtras[0], (motionEvent2.getY(motionEvent.getActionIndex()) + (rawY - y)) - this.newSessionWithExtras[1]);
        onExtraCallbackWithResult onextracallbackwithresult = this.mayLaunchUrl[pointerId];
        Intrinsics.checkNotNull(onextracallbackwithresult);
        onWarmupCompleted(onextracallbackwithresult);
        this.mayLaunchUrl[pointerId] = null;
        this.ICustomTabsService--;
        IAuthTabCallbackStubProxy();
    }

    private final void IAuthTabCallbackDefault(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.IAuthTabCallbackStub = null;
        this.ICustomTabsCallback_Parcel = 2;
        float rawX = motionEvent2.getRawX();
        float x = motionEvent2.getX();
        float rawY = motionEvent2.getRawY();
        float y = motionEvent2.getY();
        int pointerCount = motionEvent.getPointerCount();
        int i = 0;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            onExtraCallbackWithResult onextracallbackwithresult = this.mayLaunchUrl[motionEvent.getPointerId(i2)];
            if (onextracallbackwithresult != null && (onextracallbackwithresult.onWarmupCompleted() != motionEvent.getX(i2) || onextracallbackwithresult.IAuthTabCallback() != motionEvent.getY(i2))) {
                onextracallbackwithresult.onExtraCallbackWithResult(motionEvent.getX(i2));
                onextracallbackwithresult.IAuthTabCallback(motionEvent.getY(i2));
                onextracallbackwithresult.onNavigationEvent((motionEvent2.getX(i2) + (rawX - x)) - this.newSessionWithExtras[0]);
                onextracallbackwithresult.onExtraCallback((motionEvent2.getY(i2) + (rawY - y)) - this.newSessionWithExtras[1]);
                onWarmupCompleted(onextracallbackwithresult);
                i++;
            }
        }
        if (i > 0) {
            postMessage();
            IAuthTabCallbackStubProxy();
        }
    }

    public final void onExtraCallback(@NotNull MotionEvent motionEvent, @NotNull MotionEvent motionEvent2) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        Intrinsics.checkNotNullParameter(motionEvent2, "");
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            onNavigationEvent(motionEvent, motionEvent2);
            IAuthTabCallbackDefault(motionEvent, motionEvent2);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
            IAuthTabCallbackDefault(motionEvent, motionEvent2);
            IAuthTabCallbackStub(motionEvent, motionEvent2);
        } else if (motionEvent.getActionMasked() == 2) {
            IAuthTabCallbackDefault(motionEvent, motionEvent2);
        }
    }

    private final void postMessage() {
        this.asBinder = null;
        for (onExtraCallbackWithResult onextracallbackwithresult : this.mayLaunchUrl) {
            if (onextracallbackwithresult != null) {
                onExtraCallbackWithResult(onextracallbackwithresult);
            }
        }
    }

    private final void newSession() {
        this.ICustomTabsCallback_Parcel = 4;
        this.IAuthTabCallbackStub = null;
        postMessage();
        for (onExtraCallbackWithResult onextracallbackwithresult : this.mayLaunchUrl) {
            if (onextracallbackwithresult != null) {
                onWarmupCompleted(onextracallbackwithresult);
            }
        }
        this.ICustomTabsService = 0;
        ArraysKt.fill$default(this.mayLaunchUrl, (Object) null, 0, 0, 6, (Object) null);
        IAuthTabCallbackStubProxy();
    }

    private final void onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult) {
        if (this.IAuthTabCallbackStub == null) {
            this.IAuthTabCallbackStub = Arguments.createArray();
        }
        WritableArray writableArray = this.IAuthTabCallbackStub;
        Intrinsics.checkNotNull(writableArray);
        writableArray.pushMap(onNavigationEvent(onextracallbackwithresult));
    }

    private final void onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult) {
        if (this.asBinder == null) {
            this.asBinder = Arguments.createArray();
        }
        WritableArray writableArray = this.asBinder;
        Intrinsics.checkNotNull(writableArray);
        writableArray.pushMap(onNavigationEvent(onextracallbackwithresult));
    }

    private final WritableMap onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", onextracallbackwithresult.onExtraCallback());
        writableMapCreateMap.putDouble("x", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(onextracallbackwithresult.onWarmupCompleted()));
        writableMapCreateMap.putDouble("y", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(onextracallbackwithresult.IAuthTabCallback()));
        writableMapCreateMap.putDouble("absoluteX", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(onextracallbackwithresult.onNavigationEvent()));
        writableMapCreateMap.putDouble("absoluteY", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(onextracallbackwithresult.onExtraCallbackWithResult()));
        return writableMapCreateMap;
    }

    public final WritableArray IAuthTabCallbackDefault() {
        WritableArray writableArray = this.IAuthTabCallbackStub;
        this.IAuthTabCallbackStub = null;
        return writableArray;
    }

    public final WritableArray asBinder() {
        WritableArray writableArray = this.asBinder;
        this.asBinder = null;
        return writableArray;
    }

    private final void IAuthTabCallbackDefault(int i) {
        UiThreadUtil.assertOnUiThread();
        if (this.onRelationshipValidationResult == i) {
            return;
        }
        if (this.ICustomTabsService > 0 && (i == 5 || i == 3 || i == 1)) {
            newSession();
        }
        int i2 = this.onRelationshipValidationResult;
        this.onRelationshipValidationResult = i;
        if (i == 4) {
            short s = onExtraCallbackWithResult;
            onExtraCallbackWithResult = (short) (s + 1);
            this.onTransact = s;
        }
        doesTransientStatePreventRecycling doestransientstatepreventrecycling = this.onPostMessage;
        Intrinsics.checkNotNull(doestransientstatepreventrecycling);
        doestransientstatepreventrecycling.onExtraCallback(this, i, i2);
        IAuthTabCallback(i, i2);
    }

    public final boolean IAuthTabCallback(@NotNull MotionEvent motionEvent) {
        int i;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        return (!this.IAuthTabCallback_Parcel || (i = this.onRelationshipValidationResult) == 1 || i == 3 || i == 5 || !IAuthTabCallback(motionEvent.getPointerId(motionEvent.getActionIndex()))) ? false : true;
    }

    public boolean IAuthTabCallbackDefault(@NotNull addChangePayload addchangepayload) {
        getAdapterPosition getadapterposition;
        Intrinsics.checkNotNullParameter(addchangepayload, "");
        if (addchangepayload == this || (getadapterposition = this.access000) == null) {
            return false;
        }
        return getadapterposition.onWarmupCompleted(this, addchangepayload);
    }

    public final boolean asInterface(@NotNull addChangePayload addchangepayload) {
        getAdapterPosition getadapterposition;
        Intrinsics.checkNotNullParameter(addchangepayload, "");
        if (addchangepayload == this || (getadapterposition = this.access000) == null) {
            return false;
        }
        return getadapterposition.onExtraCallback(this, addchangepayload);
    }

    public boolean onTransact(@NotNull addChangePayload addchangepayload) {
        Intrinsics.checkNotNullParameter(addchangepayload, "");
        if (addchangepayload == this) {
            return true;
        }
        getAdapterPosition getadapterposition = this.access000;
        if (getadapterposition != null) {
            return getadapterposition.onNavigationEvent(this, addchangepayload);
        }
        return false;
    }

    public boolean asBinder(@NotNull addChangePayload addchangepayload) {
        getAdapterPosition getadapterposition;
        Intrinsics.checkNotNullParameter(addchangepayload, "");
        if (addchangepayload == this || (getadapterposition = this.access000) == null) {
            return false;
        }
        return getadapterposition.onExtraCallbackWithResult(this, addchangepayload);
    }

    public final boolean onWarmupCompleted(@Nullable View view, float f, float f2) {
        float f3;
        RNSVGHitTester.Companion companion = RNSVGHitTester.Companion;
        Intrinsics.checkNotNull(view);
        if (companion.onExtraCallbackWithResult((Object) view)) {
            return companion.onExtraCallbackWithResult(view, f, f2);
        }
        float width = view.getWidth();
        float height = view.getHeight();
        float[] fArr = this.IAuthTabCallbackDefault;
        if (fArr != null) {
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = fArr[2];
            float f7 = fArr[3];
            onExtraCallback onextracallback = Companion;
            float f8 = onextracallback.IAuthTabCallback(f4) ? 0.0f - f4 : 0.0f;
            f = onextracallback.IAuthTabCallback(f5) ? 0.0f - f5 : 0.0f;
            if (onextracallback.IAuthTabCallback(f6)) {
                width += f6;
            }
            if (onextracallback.IAuthTabCallback(f7)) {
                height += f7;
            }
            float f9 = fArr[4];
            float f10 = fArr[5];
            if (onextracallback.IAuthTabCallback(f9)) {
                if (!onextracallback.IAuthTabCallback(f4)) {
                    f8 = width - f9;
                } else if (!onextracallback.IAuthTabCallback(f6)) {
                    width = f9 + f8;
                }
            }
            if (onextracallback.IAuthTabCallback(f10)) {
                if (!onextracallback.IAuthTabCallback(f5)) {
                    f = height - f10;
                } else if (!onextracallback.IAuthTabCallback(f7)) {
                    height = f10 + f;
                }
            }
            f3 = f;
            f = f8;
        } else {
            f3 = 0.0f;
        }
        return f <= f && f <= width && f3 <= f2 && f2 <= height;
    }

    public final void onTransact() {
        int i = this.onRelationshipValidationResult;
        if (i == 4 || i == 0 || i == 2 || this.access100) {
            onWarmupCompleted();
            IAuthTabCallbackDefault(3);
        }
    }

    public final void access000() {
        int i = this.onRelationshipValidationResult;
        if (i == 4 || i == 0 || i == 2) {
            ICustomTabsCallback_Parcel();
            IAuthTabCallbackDefault(1);
        }
    }

    public final void asInterface() {
        onExtraCallback(false);
    }

    public void onExtraCallback(boolean z) {
        if (!this.extraCallbackWithResult || z) {
            int i = this.onRelationshipValidationResult;
            if (i == 0 || i == 2) {
                IAuthTabCallbackDefault(4);
            }
        }
    }

    public final void IAuthTabCallbackStub() {
        if (this.onRelationshipValidationResult == 0) {
            IAuthTabCallbackDefault(2);
        }
    }

    public final void getInterfaceDescriptor() {
        int i = this.onRelationshipValidationResult;
        if (i == 2 || i == 4) {
            IAuthTabCallbackDefault(5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0018, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onExtraCallback(@NotNull addChangePayload addchangepayload) {
        View view;
        Intrinsics.checkNotNullParameter(addchangepayload, "");
        View view2 = this.prefetch;
        Object parent = view2 != null ? view2.getParent() : null;
        if (parent instanceof View) {
            view = (View) parent;
            while (view != null) {
                if (Intrinsics.areEqual(view, addchangepayload.prefetch)) {
                    return true;
                }
                Object parent2 = view.getParent();
                if (parent2 instanceof View) {
                    view = (View) parent2;
                }
            }
            return false;
        }
        view = null;
    }

    protected void onExtraCallbackWithResult(@NotNull MotionEvent motionEvent, @NotNull MotionEvent motionEvent2) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        Intrinsics.checkNotNullParameter(motionEvent2, "");
        IAuthTabCallbackDefault(1);
    }

    private final boolean onExtraCallbackWithResult(int i) {
        int i2 = this.onMinimized;
        return i2 == 0 ? i == 1 : (i & i2) != 0;
    }

    protected final boolean onWarmupCompleted(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (motionEvent.getToolType(0) == 3) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6 || motionEvent.getAction() == 5 || !(motionEvent.getAction() == 2 || onExtraCallbackWithResult(motionEvent.getActionButton()))) {
                return false;
            }
            if (motionEvent.getAction() == 2 && !onExtraCallbackWithResult(motionEvent.getButtonState())) {
                return false;
            }
        }
        return true;
    }

    public final PointF IAuthTabCallback(@NotNull PointF pointF) {
        PointF pointFIAuthTabCallback;
        Intrinsics.checkNotNullParameter(pointF, "");
        doesTransientStatePreventRecycling doestransientstatepreventrecycling = this.onPostMessage;
        if (doestransientstatepreventrecycling != null && (pointFIAuthTabCallback = doestransientstatepreventrecycling.IAuthTabCallback(this.prefetch, pointF)) != null) {
            return pointFIAuthTabCallback;
        }
        pointF.x = Float.NaN;
        pointF.y = Float.NaN;
        return pointF;
    }

    public final void newAuthTabSession() {
        this.prefetch = null;
        this.onPostMessage = null;
        Arrays.fill(this.isEngagementSignalsApiAvailable, -1);
        this.extraCommand = 0;
        this.ICustomTabsService = 0;
        ArraysKt.fill$default(this.mayLaunchUrl, (Object) null, 0, 0, 6, (Object) null);
        this.ICustomTabsCallback_Parcel = 0;
        onNavigationEvent();
    }

    public final void onNavigationEvent(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.IAuthTabCallbackStubProxy = true;
        function0.invoke();
        this.IAuthTabCallbackStubProxy = false;
    }

    private final void IAuthTabCallbackStub(MotionEvent motionEvent) {
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        int i = 1;
        if (toolType == 1) {
            i = 0;
        } else if (toolType != 2) {
            i = 3;
            if (toolType == 3) {
                i = 2;
            }
        }
        this.ICustomTabsCallbackDefault = i;
    }

    public String toString() {
        String simpleName;
        View view = this.prefetch;
        if (view == null) {
            simpleName = null;
        } else {
            Intrinsics.checkNotNull(view);
            simpleName = view.getClass().getSimpleName();
        }
        return getClass().getSimpleName() + "@[" + this.ICustomTabsCallbackStub + "]:" + simpleName;
    }

    public final float writeTypedObject() {
        return this.extraCallback;
    }

    public final float extraCallback() {
        return this.writeTypedObject;
    }

    public final float readTypedObject() {
        return (this.extraCallback + this.readTypedObject) - this.newSessionWithExtras[0];
    }

    public final float ICustomTabsCallback() {
        return (this.writeTypedObject + this.ICustomTabsCallback) - this.newSessionWithExtras[1];
    }

    public static abstract class IAuthTabCallback<T extends addChangePayload> {
        public static final onExtraCallback Companion = new onExtraCallback(null);

        public abstract String IAuthTabCallback();

        protected abstract T IAuthTabCallback(@Nullable Context context);

        public abstract isScrap<T> onExtraCallback(@NotNull T t);

        public abstract Class<T> onWarmupCompleted();

        public final T onExtraCallback(@Nullable Context context, int i) {
            T t = (T) IAuthTabCallback(context);
            t.asBinder(i);
            return t;
        }

        public void onNavigationEvent(@NotNull T t, @NotNull ReadableMap readableMap) {
            Intrinsics.checkNotNullParameter(t, "");
            Intrinsics.checkNotNullParameter(readableMap, "");
            t.onExtraCallbackWithResult();
            if (readableMap.hasKey("shouldCancelWhenOutside")) {
                t.onExtraCallbackWithResult(readableMap.getBoolean("shouldCancelWhenOutside"));
            }
            if (readableMap.hasKey("enabled")) {
                t.onTransact(readableMap.getBoolean("enabled"));
            }
            if (readableMap.hasKey("hitSlop")) {
                Companion.onExtraCallback(t, readableMap);
            }
            if (readableMap.hasKey("needsPointerData")) {
                t.onNavigationEvent(readableMap.getBoolean("needsPointerData"));
            }
            if (readableMap.hasKey("manualActivation")) {
                ((addChangePayload) t).extraCallbackWithResult = readableMap.getBoolean("manualActivation");
            }
            if (readableMap.hasKey("mouseButton")) {
                t.onNavigationEvent(readableMap.getInt("mouseButton"));
            }
        }

        public static final class onExtraCallback {
            public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onExtraCallback() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void onExtraCallback(addChangePayload addchangepayload, ReadableMap readableMap) {
                if (readableMap.getType("hitSlop") == ReadableType.Number) {
                    float fOnNavigationEvent = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(readableMap.getDouble("hitSlop"));
                    addchangepayload.onExtraCallback(fOnNavigationEvent, fOnNavigationEvent, fOnNavigationEvent, fOnNavigationEvent, Float.NaN, Float.NaN);
                    return;
                }
                ReadableMap map = readableMap.getMap("hitSlop");
                Intrinsics.checkNotNull(map);
                float fOnNavigationEvent2 = map.hasKey("horizontal") ? CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(map.getDouble("horizontal")) : Float.NaN;
                float fOnNavigationEvent3 = map.hasKey("vertical") ? CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(map.getDouble("vertical")) : Float.NaN;
                float fOnNavigationEvent4 = map.hasKey("left") ? CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(map.getDouble("left")) : fOnNavigationEvent2;
                float fOnNavigationEvent5 = map.hasKey("top") ? CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(map.getDouble("top")) : fOnNavigationEvent3;
                if (map.hasKey("right")) {
                    fOnNavigationEvent2 = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(map.getDouble("right"));
                }
                float f = fOnNavigationEvent2;
                if (map.hasKey("bottom")) {
                    fOnNavigationEvent3 = CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(map.getDouble("bottom"));
                }
                addchangepayload.onExtraCallback(fOnNavigationEvent4, fOnNavigationEvent5, f, fOnNavigationEvent3, map.hasKey("width") ? CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(map.getDouble("width")) : Float.NaN, map.hasKey("height") ? CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onNavigationEvent(map.getDouble("height")) : Float.NaN);
            }
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onExtraCallbackWithResult(int i) {
            if (addChangePayload.onWarmupCompleted == null) {
                addChangePayload.onWarmupCompleted = new MotionEvent.PointerProperties[12];
                addChangePayload.IAuthTabCallback = new MotionEvent.PointerCoords[12];
            }
            while (i > 0) {
                MotionEvent.PointerProperties[] pointerPropertiesArr = addChangePayload.onWarmupCompleted;
                MotionEvent.PointerCoords[] pointerCoordsArr = null;
                if (pointerPropertiesArr == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    pointerPropertiesArr = null;
                }
                int i2 = i - 1;
                if (pointerPropertiesArr[i2] != null) {
                    return;
                }
                MotionEvent.PointerProperties[] pointerPropertiesArr2 = addChangePayload.onWarmupCompleted;
                if (pointerPropertiesArr2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    pointerPropertiesArr2 = null;
                }
                pointerPropertiesArr2[i2] = new MotionEvent.PointerProperties();
                MotionEvent.PointerCoords[] pointerCoordsArr2 = addChangePayload.IAuthTabCallback;
                if (pointerCoordsArr2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    pointerCoordsArr = pointerCoordsArr2;
                }
                pointerCoordsArr[i2] = new MotionEvent.PointerCoords();
                i--;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean IAuthTabCallback(float f) {
            return !Float.isNaN(f);
        }
    }

    static final class onExtraCallbackWithResult {
        private float IAuthTabCallback;
        private float onExtraCallback;
        private final int onExtraCallbackWithResult;
        private float onNavigationEvent;
        private float onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            return this.onExtraCallbackWithResult == onextracallbackwithresult.onExtraCallbackWithResult && Float.compare(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback) == 0 && Float.compare(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent) == 0 && Float.compare(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted) == 0 && Float.compare(this.onExtraCallback, onextracallbackwithresult.onExtraCallback) == 0;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.onExtraCallbackWithResult) * 31) + Float.hashCode(this.IAuthTabCallback)) * 31) + Float.hashCode(this.onNavigationEvent)) * 31) + Float.hashCode(this.onWarmupCompleted)) * 31) + Float.hashCode(this.onExtraCallback);
        }

        public String toString() {
            return "PointerData(pointerId=" + this.onExtraCallbackWithResult + ", x=" + this.IAuthTabCallback + ", y=" + this.onNavigationEvent + ", absoluteX=" + this.onWarmupCompleted + ", absoluteY=" + this.onExtraCallback + ")";
        }

        public onExtraCallbackWithResult(int i, float f, float f2, float f3, float f4) {
            this.onExtraCallbackWithResult = i;
            this.IAuthTabCallback = f;
            this.onNavigationEvent = f2;
            this.onWarmupCompleted = f3;
            this.onExtraCallback = f4;
        }

        public final int onExtraCallback() {
            return this.onExtraCallbackWithResult;
        }

        public final void onExtraCallbackWithResult(float f) {
            this.IAuthTabCallback = f;
        }

        public final float onWarmupCompleted() {
            return this.IAuthTabCallback;
        }

        public final float IAuthTabCallback() {
            return this.onNavigationEvent;
        }

        public final void IAuthTabCallback(float f) {
            this.onNavigationEvent = f;
        }

        public final float onNavigationEvent() {
            return this.onWarmupCompleted;
        }

        public final void onNavigationEvent(float f) {
            this.onWarmupCompleted = f;
        }

        public final void onExtraCallback(float f) {
            this.onExtraCallback = f;
        }

        public final float onExtraCallbackWithResult() {
            return this.onExtraCallback;
        }
    }
}
