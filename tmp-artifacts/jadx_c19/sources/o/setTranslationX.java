package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import o.setTranslationX;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class setTranslationX<T extends setTranslationX<T>> implements Cloneable {
    private Drawable IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private boolean ICustomTabsCallbackStubProxy;
    private boolean access000;
    private boolean asBinder;
    private boolean onActivityResized;
    private Drawable onExtraCallback;
    private int onExtraCallbackWithResult;
    private Resources.Theme onPostMessage;
    private int onWarmupCompleted;
    private Drawable readTypedObject;
    private int writeTypedObject;
    private float onMinimized = 1.0f;
    private SaversKtExternalSyntheticLambda58 onNavigationEvent = SaversKtExternalSyntheticLambda58.onExtraCallback;
    private SaversKtExternalSyntheticLambda11 extraCallback = SaversKtExternalSyntheticLambda11.NORMAL;
    private boolean onTransact = true;
    private int IAuthTabCallback_Parcel = -1;
    private int ICustomTabsCallback = -1;
    private SaversKtExternalSyntheticLambda26 onActivityLayout = setTransitionState.onExtraCallbackWithResult();
    private boolean getInterfaceDescriptor = true;
    private SaversKtExternalSyntheticLambda30 access100 = new SaversKtExternalSyntheticLambda30();
    private Map<Class<?>, SaversKtExternalSyntheticLambda29<?>> onMessageChannelReady = new getPaddingWidth();
    private Class<?> extraCallbackWithResult = Object.class;
    private boolean asInterface = true;

    private static boolean onExtraCallback(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    private T onNavigationEvent() {
        return this;
    }

    public T onExtraCallback(float f) {
        if (this.IAuthTabCallbackStub) {
            return (T) onWarmupCompleted().onExtraCallback(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.onMinimized = f;
        this.IAuthTabCallbackDefault |= 2;
        return (T) newSession();
    }

    public T onWarmupCompleted(boolean z) {
        if (this.IAuthTabCallbackStub) {
            return (T) onWarmupCompleted().onWarmupCompleted(z);
        }
        this.onActivityResized = z;
        this.IAuthTabCallbackDefault |= 1048576;
        return (T) newSession();
    }

    public T IAuthTabCallback(@NonNull SaversKtExternalSyntheticLambda58 saversKtExternalSyntheticLambda58) {
        if (this.IAuthTabCallbackStub) {
            return (T) onWarmupCompleted().IAuthTabCallback(saversKtExternalSyntheticLambda58);
        }
        this.onNavigationEvent = (SaversKtExternalSyntheticLambda58) markHierarchyDirty.onExtraCallbackWithResult(saversKtExternalSyntheticLambda58);
        this.IAuthTabCallbackDefault |= 4;
        return (T) newSession();
    }

    public T onWarmupCompleted(@NonNull SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11) {
        if (this.IAuthTabCallbackStub) {
            return (T) onWarmupCompleted().onWarmupCompleted(saversKtExternalSyntheticLambda11);
        }
        this.extraCallback = (SaversKtExternalSyntheticLambda11) markHierarchyDirty.onExtraCallbackWithResult(saversKtExternalSyntheticLambda11);
        this.IAuthTabCallbackDefault |= 8;
        return (T) newSession();
    }

    public T onNavigationEvent(@Nullable Drawable drawable) {
        if (this.IAuthTabCallbackStub) {
            return (T) onWarmupCompleted().onNavigationEvent(drawable);
        }
        this.readTypedObject = drawable;
        int i2 = this.IAuthTabCallbackDefault;
        this.writeTypedObject = 0;
        this.IAuthTabCallbackDefault = (i2 | 64) & (-129);
        return (T) newSession();
    }

    public T IAuthTabCallback(int i2) {
        if (this.IAuthTabCallbackStub) {
            return (T) onWarmupCompleted().IAuthTabCallback(i2);
        }
        this.writeTypedObject = i2;
        int i3 = this.IAuthTabCallbackDefault;
        this.readTypedObject = null;
        this.IAuthTabCallbackDefault = (i3 | 128) & (-65);
        return (T) newSession();
    }

    public T onNavigationEvent(int i2) {
        if (this.IAuthTabCallbackStub) {
            return (T) onWarmupCompleted().onNavigationEvent(i2);
        }
        this.onExtraCallbackWithResult = i2;
        int i3 = this.IAuthTabCallbackDefault;
        this.onExtraCallback = null;
        this.IAuthTabCallbackDefault = (i3 | 32) & (-17);
        return (T) newSession();
    }

    public T IAuthTabCallback(boolean z) {
        if (this.IAuthTabCallbackStub) {
            return (T) onWarmupCompleted().IAuthTabCallback(true);
        }
        this.onTransact = !z;
        this.IAuthTabCallbackDefault |= 256;
        return (T) newSession();
    }

    public T IAuthTabCallback(int i2, int i3) {
        if (this.IAuthTabCallbackStub) {
            return (T) onWarmupCompleted().IAuthTabCallback(i2, i3);
        }
        this.ICustomTabsCallback = i2;
        this.IAuthTabCallback_Parcel = i3;
        this.IAuthTabCallbackDefault |= 512;
        return (T) newSession();
    }

    public T onExtraCallbackWithResult(@NonNull SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26) {
        if (this.IAuthTabCallbackStub) {
            return (T) onWarmupCompleted().onExtraCallbackWithResult(saversKtExternalSyntheticLambda26);
        }
        this.onActivityLayout = (SaversKtExternalSyntheticLambda26) markHierarchyDirty.onExtraCallbackWithResult(saversKtExternalSyntheticLambda26);
        this.IAuthTabCallbackDefault |= 1024;
        return (T) newSession();
    }

    @Override // 
    public T onWarmupCompleted() {
        try {
            T t = (T) super.clone();
            SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30 = new SaversKtExternalSyntheticLambda30();
            t.access100 = saversKtExternalSyntheticLambda30;
            saversKtExternalSyntheticLambda30.onWarmupCompleted(this.access100);
            onMeasure getpaddingwidth = new getPaddingWidth();
            t.onMessageChannelReady = getpaddingwidth;
            getpaddingwidth.putAll(this.onMessageChannelReady);
            t.asBinder = false;
            t.IAuthTabCallbackStub = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public <Y> T onExtraCallback(@NonNull SaversKtExternalSyntheticLambda3<Y> saversKtExternalSyntheticLambda3, @NonNull Y y) {
        if (this.IAuthTabCallbackStub) {
            return (T) onWarmupCompleted().onExtraCallback((SaversKtExternalSyntheticLambda3<SaversKtExternalSyntheticLambda3<Y>>) saversKtExternalSyntheticLambda3, (SaversKtExternalSyntheticLambda3<Y>) y);
        }
        markHierarchyDirty.onExtraCallbackWithResult(saversKtExternalSyntheticLambda3);
        markHierarchyDirty.onExtraCallbackWithResult(y);
        this.access100.IAuthTabCallback(saversKtExternalSyntheticLambda3, y);
        return (T) newSession();
    }

    public T IAuthTabCallback(@NonNull Class<?> cls) {
        if (this.IAuthTabCallbackStub) {
            return (T) onWarmupCompleted().IAuthTabCallback(cls);
        }
        this.extraCallbackWithResult = (Class) markHierarchyDirty.onExtraCallbackWithResult(cls);
        this.IAuthTabCallbackDefault |= 4096;
        return (T) newSession();
    }

    public final boolean onRelationshipValidationResult() {
        return this.getInterfaceDescriptor;
    }

    public final boolean ICustomTabsCallbackDefault() {
        return onWarmupCompleted(2048);
    }

    public T onNavigationEvent(@NonNull AbstractResolvableFuture abstractResolvableFuture) {
        return (T) onExtraCallback((SaversKtExternalSyntheticLambda3<SaversKtExternalSyntheticLambda3>) AbstractResolvableFuture.asBinder, (SaversKtExternalSyntheticLambda3) markHierarchyDirty.onExtraCallbackWithResult(abstractResolvableFuture));
    }

    public T isEngagementSignalsApiAvailable() {
        return (T) IAuthTabCallback(AbstractResolvableFuture.onWarmupCompleted, new setResetBlock());
    }

    public T mayLaunchUrl() {
        return (T) onWarmupCompleted(AbstractResolvableFuture.asInterface, new checkNotNull());
    }

    public T extraCommand() {
        return (T) onWarmupCompleted(AbstractResolvableFuture.IAuthTabCallback, new AndroidViewHolderCompanionOnCommitAffectingUpdate1ExternalSyntheticLambda0());
    }

    public T onExtraCallback() {
        return (T) onExtraCallback(AbstractResolvableFuture.IAuthTabCallback, (SaversKtExternalSyntheticLambda29<Bitmap>) new PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0());
    }

    final T IAuthTabCallback(@NonNull AbstractResolvableFuture abstractResolvableFuture, @NonNull SaversKtExternalSyntheticLambda29<Bitmap> saversKtExternalSyntheticLambda29) {
        if (this.IAuthTabCallbackStub) {
            return (T) onWarmupCompleted().IAuthTabCallback(abstractResolvableFuture, saversKtExternalSyntheticLambda29);
        }
        onNavigationEvent(abstractResolvableFuture);
        return (T) onExtraCallback(saversKtExternalSyntheticLambda29, false);
    }

    final T onExtraCallback(@NonNull AbstractResolvableFuture abstractResolvableFuture, @NonNull SaversKtExternalSyntheticLambda29<Bitmap> saversKtExternalSyntheticLambda29) {
        if (this.IAuthTabCallbackStub) {
            return (T) onWarmupCompleted().onExtraCallback(abstractResolvableFuture, saversKtExternalSyntheticLambda29);
        }
        onNavigationEvent(abstractResolvableFuture);
        return (T) onWarmupCompleted(saversKtExternalSyntheticLambda29);
    }

    private T onWarmupCompleted(@NonNull AbstractResolvableFuture abstractResolvableFuture, @NonNull SaversKtExternalSyntheticLambda29<Bitmap> saversKtExternalSyntheticLambda29) {
        return (T) onExtraCallbackWithResult(abstractResolvableFuture, saversKtExternalSyntheticLambda29, false);
    }

    private T onExtraCallbackWithResult(@NonNull AbstractResolvableFuture abstractResolvableFuture, @NonNull SaversKtExternalSyntheticLambda29<Bitmap> saversKtExternalSyntheticLambda29, boolean z) {
        T t;
        if (z) {
            t = (T) onExtraCallback(abstractResolvableFuture, saversKtExternalSyntheticLambda29);
        } else {
            t = (T) IAuthTabCallback(abstractResolvableFuture, saversKtExternalSyntheticLambda29);
        }
        t.asInterface = true;
        return t;
    }

    public T onWarmupCompleted(@NonNull SaversKtExternalSyntheticLambda29<Bitmap> saversKtExternalSyntheticLambda29) {
        return (T) onExtraCallback(saversKtExternalSyntheticLambda29, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    T onExtraCallback(@NonNull SaversKtExternalSyntheticLambda29<Bitmap> saversKtExternalSyntheticLambda29, boolean z) {
        if (this.IAuthTabCallbackStub) {
            return (T) onWarmupCompleted().onExtraCallback(saversKtExternalSyntheticLambda29, z);
        }
        complete completeVar = new complete(saversKtExternalSyntheticLambda29, z);
        onExtraCallback(Bitmap.class, saversKtExternalSyntheticLambda29, z);
        onExtraCallback(Drawable.class, completeVar, z);
        onExtraCallback(BitmapDrawable.class, completeVar.onExtraCallback(), z);
        onExtraCallback(TransitionExternalSyntheticLambda6.class, new RunGroup(saversKtExternalSyntheticLambda29), z);
        return (T) newSession();
    }

    <Y> T onExtraCallback(@NonNull Class<Y> cls, @NonNull SaversKtExternalSyntheticLambda29<Y> saversKtExternalSyntheticLambda29, boolean z) {
        if (this.IAuthTabCallbackStub) {
            return (T) onWarmupCompleted().onExtraCallback(cls, saversKtExternalSyntheticLambda29, z);
        }
        markHierarchyDirty.onExtraCallbackWithResult(cls);
        markHierarchyDirty.onExtraCallbackWithResult(saversKtExternalSyntheticLambda29);
        this.onMessageChannelReady.put(cls, saversKtExternalSyntheticLambda29);
        int i2 = this.IAuthTabCallbackDefault;
        this.getInterfaceDescriptor = true;
        this.IAuthTabCallbackDefault = 67584 | i2;
        this.asInterface = false;
        if (z) {
            this.IAuthTabCallbackDefault = i2 | 198656;
            this.access000 = true;
        }
        return (T) newSession();
    }

    public T onExtraCallback(@NonNull setTranslationX<?> settranslationx) {
        if (this.IAuthTabCallbackStub) {
            return (T) onWarmupCompleted().onExtraCallback(settranslationx);
        }
        if (onExtraCallback(settranslationx.IAuthTabCallbackDefault, 2)) {
            this.onMinimized = settranslationx.onMinimized;
        }
        if (onExtraCallback(settranslationx.IAuthTabCallbackDefault, 262144)) {
            this.ICustomTabsCallbackStubProxy = settranslationx.ICustomTabsCallbackStubProxy;
        }
        if (onExtraCallback(settranslationx.IAuthTabCallbackDefault, 1048576)) {
            this.onActivityResized = settranslationx.onActivityResized;
        }
        if (onExtraCallback(settranslationx.IAuthTabCallbackDefault, 4)) {
            this.onNavigationEvent = settranslationx.onNavigationEvent;
        }
        if (onExtraCallback(settranslationx.IAuthTabCallbackDefault, 8)) {
            this.extraCallback = settranslationx.extraCallback;
        }
        if (onExtraCallback(settranslationx.IAuthTabCallbackDefault, 16)) {
            this.onExtraCallback = settranslationx.onExtraCallback;
            this.onExtraCallbackWithResult = 0;
            this.IAuthTabCallbackDefault &= -33;
        }
        if (onExtraCallback(settranslationx.IAuthTabCallbackDefault, 32)) {
            this.onExtraCallbackWithResult = settranslationx.onExtraCallbackWithResult;
            this.onExtraCallback = null;
            this.IAuthTabCallbackDefault &= -17;
        }
        if (onExtraCallback(settranslationx.IAuthTabCallbackDefault, 64)) {
            this.readTypedObject = settranslationx.readTypedObject;
            this.writeTypedObject = 0;
            this.IAuthTabCallbackDefault &= -129;
        }
        if (onExtraCallback(settranslationx.IAuthTabCallbackDefault, 128)) {
            this.writeTypedObject = settranslationx.writeTypedObject;
            this.readTypedObject = null;
            this.IAuthTabCallbackDefault &= -65;
        }
        if (onExtraCallback(settranslationx.IAuthTabCallbackDefault, 256)) {
            this.onTransact = settranslationx.onTransact;
        }
        if (onExtraCallback(settranslationx.IAuthTabCallbackDefault, 512)) {
            this.ICustomTabsCallback = settranslationx.ICustomTabsCallback;
            this.IAuthTabCallback_Parcel = settranslationx.IAuthTabCallback_Parcel;
        }
        if (onExtraCallback(settranslationx.IAuthTabCallbackDefault, 1024)) {
            this.onActivityLayout = settranslationx.onActivityLayout;
        }
        if (onExtraCallback(settranslationx.IAuthTabCallbackDefault, 4096)) {
            this.extraCallbackWithResult = settranslationx.extraCallbackWithResult;
        }
        if (onExtraCallback(settranslationx.IAuthTabCallbackDefault, 8192)) {
            this.IAuthTabCallback = settranslationx.IAuthTabCallback;
            this.onWarmupCompleted = 0;
            this.IAuthTabCallbackDefault &= -16385;
        }
        if (onExtraCallback(settranslationx.IAuthTabCallbackDefault, 16384)) {
            this.onWarmupCompleted = settranslationx.onWarmupCompleted;
            this.IAuthTabCallback = null;
            this.IAuthTabCallbackDefault &= -8193;
        }
        if (onExtraCallback(settranslationx.IAuthTabCallbackDefault, 32768)) {
            this.onPostMessage = settranslationx.onPostMessage;
        }
        if (onExtraCallback(settranslationx.IAuthTabCallbackDefault, 65536)) {
            this.getInterfaceDescriptor = settranslationx.getInterfaceDescriptor;
        }
        if (onExtraCallback(settranslationx.IAuthTabCallbackDefault, 131072)) {
            this.access000 = settranslationx.access000;
        }
        if (onExtraCallback(settranslationx.IAuthTabCallbackDefault, 2048)) {
            this.onMessageChannelReady.putAll(settranslationx.onMessageChannelReady);
            this.asInterface = settranslationx.asInterface;
        }
        if (onExtraCallback(settranslationx.IAuthTabCallbackDefault, 524288)) {
            this.IAuthTabCallbackStubProxy = settranslationx.IAuthTabCallbackStubProxy;
        }
        if (!this.getInterfaceDescriptor) {
            this.onMessageChannelReady.clear();
            int i2 = this.IAuthTabCallbackDefault;
            this.access000 = false;
            this.IAuthTabCallbackDefault = i2 & (-133121);
            this.asInterface = true;
        }
        this.IAuthTabCallbackDefault |= settranslationx.IAuthTabCallbackDefault;
        this.access100.onWarmupCompleted(settranslationx.access100);
        return (T) newSession();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof setTranslationX)) {
            return false;
        }
        setTranslationX settranslationx = (setTranslationX) obj;
        return Float.compare(settranslationx.onMinimized, this.onMinimized) == 0 && this.onExtraCallbackWithResult == settranslationx.onExtraCallbackWithResult && applyConstraintsFromLayoutParams.onExtraCallback(this.onExtraCallback, settranslationx.onExtraCallback) && this.writeTypedObject == settranslationx.writeTypedObject && applyConstraintsFromLayoutParams.onExtraCallback(this.readTypedObject, settranslationx.readTypedObject) && this.onWarmupCompleted == settranslationx.onWarmupCompleted && applyConstraintsFromLayoutParams.onExtraCallback(this.IAuthTabCallback, settranslationx.IAuthTabCallback) && this.onTransact == settranslationx.onTransact && this.IAuthTabCallback_Parcel == settranslationx.IAuthTabCallback_Parcel && this.ICustomTabsCallback == settranslationx.ICustomTabsCallback && this.access000 == settranslationx.access000 && this.getInterfaceDescriptor == settranslationx.getInterfaceDescriptor && this.ICustomTabsCallbackStubProxy == settranslationx.ICustomTabsCallbackStubProxy && this.IAuthTabCallbackStubProxy == settranslationx.IAuthTabCallbackStubProxy && this.onNavigationEvent.equals(settranslationx.onNavigationEvent) && this.extraCallback == settranslationx.extraCallback && this.access100.equals(settranslationx.access100) && this.onMessageChannelReady.equals(settranslationx.onMessageChannelReady) && this.extraCallbackWithResult.equals(settranslationx.extraCallbackWithResult) && applyConstraintsFromLayoutParams.onExtraCallback(this.onActivityLayout, settranslationx.onActivityLayout) && applyConstraintsFromLayoutParams.onExtraCallback(this.onPostMessage, settranslationx.onPostMessage);
    }

    public int hashCode() {
        return applyConstraintsFromLayoutParams.onExtraCallbackWithResult(this.onPostMessage, applyConstraintsFromLayoutParams.onExtraCallbackWithResult(this.onActivityLayout, applyConstraintsFromLayoutParams.onExtraCallbackWithResult(this.extraCallbackWithResult, applyConstraintsFromLayoutParams.onExtraCallbackWithResult(this.onMessageChannelReady, applyConstraintsFromLayoutParams.onExtraCallbackWithResult(this.access100, applyConstraintsFromLayoutParams.onExtraCallbackWithResult(this.extraCallback, applyConstraintsFromLayoutParams.onExtraCallbackWithResult(this.onNavigationEvent, applyConstraintsFromLayoutParams.onExtraCallback(this.IAuthTabCallbackStubProxy, applyConstraintsFromLayoutParams.onExtraCallback(this.ICustomTabsCallbackStubProxy, applyConstraintsFromLayoutParams.onExtraCallback(this.getInterfaceDescriptor, applyConstraintsFromLayoutParams.onExtraCallback(this.access000, applyConstraintsFromLayoutParams.onExtraCallbackWithResult(this.ICustomTabsCallback, applyConstraintsFromLayoutParams.onExtraCallbackWithResult(this.IAuthTabCallback_Parcel, applyConstraintsFromLayoutParams.onExtraCallback(this.onTransact, applyConstraintsFromLayoutParams.onExtraCallbackWithResult(this.IAuthTabCallback, applyConstraintsFromLayoutParams.onExtraCallbackWithResult(this.onWarmupCompleted, applyConstraintsFromLayoutParams.onExtraCallbackWithResult(this.readTypedObject, applyConstraintsFromLayoutParams.onExtraCallbackWithResult(this.writeTypedObject, applyConstraintsFromLayoutParams.onExtraCallbackWithResult(this.onExtraCallback, applyConstraintsFromLayoutParams.onExtraCallbackWithResult(this.onExtraCallbackWithResult, applyConstraintsFromLayoutParams.IAuthTabCallback(this.onMinimized)))))))))))))))))))));
    }

    public T ICustomTabsService() {
        this.asBinder = true;
        return (T) onNavigationEvent();
    }

    public T IAuthTabCallback() {
        if (this.asBinder && !this.IAuthTabCallbackStub) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.IAuthTabCallbackStub = true;
        return (T) ICustomTabsService();
    }

    public final T newSession() {
        if (this.asBinder) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return (T) onNavigationEvent();
    }

    public final boolean onPostMessage() {
        return this.IAuthTabCallbackStub;
    }

    public final Map<Class<?>, SaversKtExternalSyntheticLambda29<?>> onActivityResized() {
        return this.onMessageChannelReady;
    }

    public final boolean onUnminimized() {
        return this.access000;
    }

    public final SaversKtExternalSyntheticLambda30 getInterfaceDescriptor() {
        return this.access100;
    }

    public final Class<?> ICustomTabsCallback() {
        return this.extraCallbackWithResult;
    }

    public final SaversKtExternalSyntheticLambda58 onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public final Drawable asBinder() {
        return this.onExtraCallback;
    }

    public final int asInterface() {
        return this.onExtraCallbackWithResult;
    }

    public final int IAuthTabCallbackStubProxy() {
        return this.writeTypedObject;
    }

    public final Drawable IAuthTabCallback_Parcel() {
        return this.readTypedObject;
    }

    public final int IAuthTabCallbackDefault() {
        return this.onWarmupCompleted;
    }

    public final Drawable IAuthTabCallbackStub() {
        return this.IAuthTabCallback;
    }

    public final Resources.Theme readTypedObject() {
        return this.onPostMessage;
    }

    public final boolean onMessageChannelReady() {
        return this.onTransact;
    }

    public final SaversKtExternalSyntheticLambda26 writeTypedObject() {
        return this.onActivityLayout;
    }

    public final boolean ICustomTabsCallbackStubProxy() {
        return onWarmupCompleted(8);
    }

    public final SaversKtExternalSyntheticLambda11 extraCallback() {
        return this.extraCallback;
    }

    public final int access100() {
        return this.ICustomTabsCallback;
    }

    public final boolean ICustomTabsCallback_Parcel() {
        return applyConstraintsFromLayoutParams.onExtraCallback(this.ICustomTabsCallback, this.IAuthTabCallback_Parcel);
    }

    public final int access000() {
        return this.IAuthTabCallback_Parcel;
    }

    public final float extraCallbackWithResult() {
        return this.onMinimized;
    }

    boolean ICustomTabsCallbackStub() {
        return this.asInterface;
    }

    private boolean onWarmupCompleted(int i2) {
        return onExtraCallback(this.IAuthTabCallbackDefault, i2);
    }

    public final boolean onMinimized() {
        return this.ICustomTabsCallbackStubProxy;
    }

    public final boolean onActivityLayout() {
        return this.onActivityResized;
    }

    public final boolean onTransact() {
        return this.IAuthTabCallbackStubProxy;
    }
}
