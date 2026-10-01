package o;

import java.lang.reflect.Field;
import o.LazySaveableStateHolderKtExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class LazySaveableStateHolderCompanionExternalSyntheticLambda1 implements Comparable<LazySaveableStateHolderCompanionExternalSyntheticLambda1> {
    private final LazySaveableStateHolderKtExternalSyntheticLambda1.onNavigationEvent IAuthTabCallback;
    private final Class<?> IAuthTabCallbackDefault;
    private final Object IAuthTabCallbackStub;
    private final LazySaveableStateHolderExternalSyntheticLambda0 IAuthTabCallbackStubProxy;
    private final boolean access100;
    private final Field asBinder;
    private final Class<?> asInterface;
    private final int getInterfaceDescriptor;
    private final Field onExtraCallback;
    private final Field onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final DefaultPagerStateExternalSyntheticLambda1 onTransact;
    private final int onWarmupCompleted;

    public int onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public Field IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public LazySaveableStateHolderExternalSyntheticLambda0 asBinder() {
        return this.IAuthTabCallbackStubProxy;
    }

    public DefaultPagerStateExternalSyntheticLambda1 onTransact() {
        return this.onTransact;
    }

    public LazySaveableStateHolderKtExternalSyntheticLambda1.onNavigationEvent onExtraCallback() {
        return this.IAuthTabCallback;
    }

    @Override // java.lang.Comparable
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public int compareTo(LazySaveableStateHolderCompanionExternalSyntheticLambda1 lazySaveableStateHolderCompanionExternalSyntheticLambda1) {
        return this.onWarmupCompleted - lazySaveableStateHolderCompanionExternalSyntheticLambda1.onWarmupCompleted;
    }

    public Field asInterface() {
        return this.asBinder;
    }

    public Object onExtraCallbackWithResult() {
        return this.IAuthTabCallbackStub;
    }

    public int IAuthTabCallbackStub() {
        return this.getInterfaceDescriptor;
    }

    public boolean getInterfaceDescriptor() {
        return this.access100;
    }

    public boolean access000() {
        return this.onNavigationEvent;
    }

    public Field onWarmupCompleted() {
        return this.onExtraCallback;
    }

    /* renamed from: o.LazySaveableStateHolderCompanionExternalSyntheticLambda1$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[LazySaveableStateHolderExternalSyntheticLambda0.values().length];
            onExtraCallbackWithResult = iArr;
            try {
                iArr[LazySaveableStateHolderExternalSyntheticLambda0.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallbackWithResult[LazySaveableStateHolderExternalSyntheticLambda0.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onExtraCallbackWithResult[LazySaveableStateHolderExternalSyntheticLambda0.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onExtraCallbackWithResult[LazySaveableStateHolderExternalSyntheticLambda0.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public Class<?> IAuthTabCallbackDefault() {
        int i2 = AnonymousClass2.onExtraCallbackWithResult[this.IAuthTabCallbackStubProxy.ordinal()];
        if (i2 == 1 || i2 == 2) {
            Field field = this.onExtraCallbackWithResult;
            return field != null ? field.getType() : this.asInterface;
        }
        if (i2 == 3 || i2 == 4) {
            return this.IAuthTabCallbackDefault;
        }
        return null;
    }
}
