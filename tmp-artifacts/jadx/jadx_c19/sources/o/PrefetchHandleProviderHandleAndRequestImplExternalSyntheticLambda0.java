package o;

import androidx.glance.appwidget.protobuf.CodedOutputStream;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.glance.appwidget.protobuf.RawMessageInfo;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.LazyLayoutItemContentFactoryKtExternalSyntheticLambda1;
import o.LazySaveableStateHolderExternalSyntheticLambda2;
import o.LazySaveableStateHolderKtExternalSyntheticLambda1;
import o.LazyStaggeredGridMeasureKtExternalSyntheticLambda1;
import o.PagerKtExternalSyntheticLambda6;
import o.PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0;
import o.PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.onNavigationEvent;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0<MessageType extends PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0<MessageType, BuilderType>, BuilderType extends onNavigationEvent<MessageType, BuilderType>> extends LazyLayoutItemContentFactoryKtExternalSyntheticLambda1<MessageType, BuilderType> {
    private static Map<Object, PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0<?, ?>> onNavigationEvent = new ConcurrentHashMap();
    private int onExtraCallback = -1;
    protected PagerKtExternalSyntheticLambda7 IAuthTabCallback = PagerKtExternalSyntheticLambda7.onNavigationEvent();

    public enum onTransact {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected abstract Object onNavigationEvent(onTransact ontransact, Object obj, Object obj2);

    boolean onMessageChannelReady() {
        return (this.onExtraCallback & Integer.MIN_VALUE) != 0;
    }

    void onPostMessage() {
        this.onExtraCallback &= Integer.MAX_VALUE;
    }

    int extraCallbackWithResult() {
        return ((LazyLayoutItemContentFactoryKtExternalSyntheticLambda1) this).onExtraCallbackWithResult;
    }

    void onExtraCallback(int i2) {
        ((LazyLayoutItemContentFactoryKtExternalSyntheticLambda1) this).onExtraCallbackWithResult = i2;
    }

    void access100() {
        ((LazyLayoutItemContentFactoryKtExternalSyntheticLambda1) this).onExtraCallbackWithResult = 0;
    }

    boolean extraCallback() {
        return extraCallbackWithResult() == 0;
    }

    public final DefaultPagerStateExternalSyntheticLambda0<MessageType> writeTypedObject() {
        return (DefaultPagerStateExternalSyntheticLambda0) onWarmupCompleted(onTransact.GET_PARSER);
    }

    /* renamed from: access000, reason: merged with bridge method [inline-methods] */
    public final MessageType readTypedObject() {
        return (MessageType) onWarmupCompleted(onTransact.GET_DEFAULT_INSTANCE);
    }

    /* renamed from: onActivityLayout, reason: merged with bridge method [inline-methods] */
    public final BuilderType ICustomTabsCallbackStub() {
        return (BuilderType) onWarmupCompleted(onTransact.NEW_BUILDER);
    }

    MessageType onRelationshipValidationResult() {
        return (MessageType) onWarmupCompleted(onTransact.NEW_MUTABLE_INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        return LazyStaggeredGridMeasureKtExternalSyntheticLambda2.onNavigationEvent(this, super/*java.lang.Object*/.toString());
    }

    public int hashCode() {
        if (onMessageChannelReady()) {
            return IAuthTabCallbackStubProxy();
        }
        if (extraCallback()) {
            onExtraCallback(IAuthTabCallbackStubProxy());
        }
        return extraCallbackWithResult();
    }

    int IAuthTabCallbackStubProxy() {
        return DefaultPagerStateExternalSyntheticLambda2.onNavigationEvent().onExtraCallbackWithResult(this).IAuthTabCallback(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return DefaultPagerStateExternalSyntheticLambda2.onNavigationEvent().onExtraCallbackWithResult(this).onExtraCallback(this, (PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0) obj);
        }
        return false;
    }

    protected void onActivityResized() {
        DefaultPagerStateExternalSyntheticLambda2.onNavigationEvent().onExtraCallbackWithResult(this).onExtraCallbackWithResult(this);
        onPostMessage();
    }

    public final <MessageType extends PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0<MessageType, BuilderType>, BuilderType extends onNavigationEvent<MessageType, BuilderType>> BuilderType IAuthTabCallback_Parcel() {
        return (BuilderType) onWarmupCompleted(onTransact.NEW_BUILDER);
    }

    public final boolean onMinimized() {
        return onExtraCallback(this, true);
    }

    /* renamed from: ICustomTabsCallbackStubProxy, reason: merged with bridge method [inline-methods] */
    public final BuilderType onUnminimized() {
        return (BuilderType) ((onNavigationEvent) onWarmupCompleted(onTransact.NEW_BUILDER)).onExtraCallbackWithResult(this);
    }

    protected Object onNavigationEvent(onTransact ontransact, Object obj) {
        return onNavigationEvent(ontransact, obj, (Object) null);
    }

    protected Object onWarmupCompleted(onTransact ontransact) {
        return onNavigationEvent(ontransact, (Object) null, (Object) null);
    }

    void getInterfaceDescriptor() {
        onNavigationEvent(Integer.MAX_VALUE);
    }

    int onTransact() {
        return this.onExtraCallback & Integer.MAX_VALUE;
    }

    void onNavigationEvent(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("serialized size must be non-negative, was " + i2);
        }
        this.onExtraCallback = (i2 & Integer.MAX_VALUE) | (this.onExtraCallback & Integer.MIN_VALUE);
    }

    public void onExtraCallback(CodedOutputStream codedOutputStream) throws IOException {
        DefaultPagerStateExternalSyntheticLambda2.onNavigationEvent().onExtraCallbackWithResult(this).onNavigationEvent(this, LazyLayoutMeasuredItemKtExternalSyntheticLambda0.onExtraCallback(codedOutputStream));
    }

    int onExtraCallback(PagerDefaultsExternalSyntheticLambda0 pagerDefaultsExternalSyntheticLambda0) {
        if (onMessageChannelReady()) {
            int iIAuthTabCallback = IAuthTabCallback(pagerDefaultsExternalSyntheticLambda0);
            if (iIAuthTabCallback >= 0) {
                return iIAuthTabCallback;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iIAuthTabCallback);
        }
        if (onTransact() != Integer.MAX_VALUE) {
            return onTransact();
        }
        int iIAuthTabCallback2 = IAuthTabCallback(pagerDefaultsExternalSyntheticLambda0);
        onNavigationEvent(iIAuthTabCallback2);
        return iIAuthTabCallback2;
    }

    public int ICustomTabsCallback() {
        return onExtraCallback((PagerDefaultsExternalSyntheticLambda0) null);
    }

    private int IAuthTabCallback(PagerDefaultsExternalSyntheticLambda0<?> pagerDefaultsExternalSyntheticLambda0) {
        if (pagerDefaultsExternalSyntheticLambda0 == null) {
            return DefaultPagerStateExternalSyntheticLambda2.onNavigationEvent().onExtraCallbackWithResult(this).onExtraCallback(this);
        }
        return pagerDefaultsExternalSyntheticLambda0.onExtraCallback(this);
    }

    Object IAuthTabCallbackDefault() throws Exception {
        return onWarmupCompleted(onTransact.BUILD_MESSAGE_INFO);
    }

    static <T extends PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0<?, ?>> T onExtraCallback(Class<T> cls) throws ClassNotFoundException {
        T t = (T) onNavigationEvent.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) onNavigationEvent.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0) PagerKtExternalSyntheticLambda5.IAuthTabCallback(cls)).readTypedObject();
        if (t2 == null) {
            throw new IllegalStateException();
        }
        onNavigationEvent.put(cls, t2);
        return t2;
    }

    public static <T extends PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0<?, ?>> void onExtraCallback(Class<T> cls, T t) {
        t.onPostMessage();
        onNavigationEvent.put(cls, t);
    }

    public static Object IAuthTabCallback(LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda1, String str, Object[] objArr) {
        return new RawMessageInfo(lazyStaggeredGridMeasureKtExternalSyntheticLambda1, str, objArr);
    }

    public static abstract class onNavigationEvent<MessageType extends PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0<MessageType, BuilderType>, BuilderType extends onNavigationEvent<MessageType, BuilderType>> extends LazyLayoutItemContentFactoryKtExternalSyntheticLambda1.onExtraCallbackWithResult<MessageType, BuilderType> {
        private final MessageType onExtraCallbackWithResult;
        public MessageType onWarmupCompleted;

        public onNavigationEvent(MessageType messagetype) {
            this.onExtraCallbackWithResult = messagetype;
            if (messagetype.onMessageChannelReady()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.onWarmupCompleted = (MessageType) onExtraCallbackWithResult();
        }

        private MessageType onExtraCallbackWithResult() {
            return (MessageType) this.onExtraCallbackWithResult.onRelationshipValidationResult();
        }

        public final void asBinder() {
            if (this.onWarmupCompleted.onMessageChannelReady()) {
                return;
            }
            asInterface();
        }

        protected void asInterface() {
            MessageType messagetype = (MessageType) onExtraCallbackWithResult();
            onNavigationEvent(messagetype, this.onWarmupCompleted);
            this.onWarmupCompleted = messagetype;
        }

        public final boolean onMinimized() {
            return PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.onExtraCallback(this.onWarmupCompleted, false);
        }

        /* renamed from: onTransact, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType onWarmupCompleted() {
            BuilderType buildertype = (BuilderType) readTypedObject().ICustomTabsCallbackStub();
            buildertype.onWarmupCompleted = (MessageType) IAuthTabCallbackStub();
            return buildertype;
        }

        /* renamed from: IAuthTabCallbackDefault, reason: merged with bridge method [inline-methods] */
        public MessageType IAuthTabCallbackStub() {
            if (!this.onWarmupCompleted.onMessageChannelReady()) {
                return this.onWarmupCompleted;
            }
            this.onWarmupCompleted.onActivityResized();
            return this.onWarmupCompleted;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [MessageType extends o.PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0<MessageType, BuilderType>, o.LazyStaggeredGridMeasureKtExternalSyntheticLambda1, o.PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0] */
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final MessageType onNavigationEvent() {
            ?? r0 = (MessageType) IAuthTabCallbackStub();
            if (r0.onMinimized()) {
                return r0;
            }
            throw LazyLayoutItemContentFactoryKtExternalSyntheticLambda1.onExtraCallbackWithResult.onWarmupCompleted((LazyStaggeredGridMeasureKtExternalSyntheticLambda1) r0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public BuilderType onWarmupCompleted(MessageType messagetype) {
            return (BuilderType) onExtraCallbackWithResult(messagetype);
        }

        public BuilderType onExtraCallbackWithResult(MessageType messagetype) {
            if (readTypedObject().equals(messagetype)) {
                return this;
            }
            asBinder();
            onNavigationEvent(this.onWarmupCompleted, messagetype);
            return this;
        }

        private static <MessageType> void onNavigationEvent(MessageType messagetype, MessageType messagetype2) {
            DefaultPagerStateExternalSyntheticLambda2.onNavigationEvent().onExtraCallbackWithResult(messagetype).onExtraCallbackWithResult(messagetype, messagetype2);
        }

        /* renamed from: IAuthTabCallback_Parcel, reason: merged with bridge method [inline-methods] */
        public MessageType readTypedObject() {
            return this.onExtraCallbackWithResult;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType onNavigationEvent(LazyLayoutPinnableItemKtExternalSyntheticLambda0 lazyLayoutPinnableItemKtExternalSyntheticLambda0, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2) throws IOException {
            asBinder();
            try {
                DefaultPagerStateExternalSyntheticLambda2.onNavigationEvent().onExtraCallbackWithResult(this.onWarmupCompleted).onExtraCallback(this.onWarmupCompleted, LazyLayoutScrollScopeKtExternalSyntheticLambda1.onWarmupCompleted(lazyLayoutPinnableItemKtExternalSyntheticLambda0), lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    public static abstract class onWarmupCompleted<MessageType extends onWarmupCompleted<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0<MessageType, BuilderType> implements LazySaveableStateHolderKtExternalSyntheticLambda0<MessageType, BuilderType> {
        protected LazySaveableStateHolderExternalSyntheticLambda2<IAuthTabCallback> extensions = LazySaveableStateHolderExternalSyntheticLambda2.onExtraCallback();

        LazySaveableStateHolderExternalSyntheticLambda2<IAuthTabCallback> onExtraCallback() {
            if (this.extensions.IAuthTabCallbackDefault()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }
    }

    static final class IAuthTabCallback implements LazySaveableStateHolderExternalSyntheticLambda2.onExtraCallbackWithResult<IAuthTabCallback> {
        final PagerKtExternalSyntheticLambda6.onNavigationEvent IAuthTabCallback;
        final LazySaveableStateHolderKtExternalSyntheticLambda1.onExtraCallback<?> onExtraCallback;
        final int onExtraCallbackWithResult;
        final boolean onNavigationEvent;
        final boolean onWarmupCompleted;

        @Override // o.LazySaveableStateHolderExternalSyntheticLambda2.onExtraCallbackWithResult
        public int onWarmupCompleted() {
            return this.onExtraCallbackWithResult;
        }

        @Override // o.LazySaveableStateHolderExternalSyntheticLambda2.onExtraCallbackWithResult
        public PagerKtExternalSyntheticLambda6.onNavigationEvent onExtraCallback() {
            return this.IAuthTabCallback;
        }

        @Override // o.LazySaveableStateHolderExternalSyntheticLambda2.onExtraCallbackWithResult
        public PagerKtExternalSyntheticLambda6.onExtraCallback onNavigationEvent() {
            return this.IAuthTabCallback.getJavaType();
        }

        @Override // o.LazySaveableStateHolderExternalSyntheticLambda2.onExtraCallbackWithResult
        public boolean IAuthTabCallback() {
            return this.onNavigationEvent;
        }

        @Override // o.LazySaveableStateHolderExternalSyntheticLambda2.onExtraCallbackWithResult
        public boolean onExtraCallbackWithResult() {
            return this.onWarmupCompleted;
        }

        public LazySaveableStateHolderKtExternalSyntheticLambda1.onExtraCallback<?> asBinder() {
            return this.onExtraCallback;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.LazySaveableStateHolderExternalSyntheticLambda2.onExtraCallbackWithResult
        public LazyStaggeredGridMeasureKtExternalSyntheticLambda1.onExtraCallback onExtraCallbackWithResult(LazyStaggeredGridMeasureKtExternalSyntheticLambda1.onExtraCallback onextracallback, LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda1) {
            return ((onNavigationEvent) onextracallback).onExtraCallbackWithResult((PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0) lazyStaggeredGridMeasureKtExternalSyntheticLambda1);
        }

        @Override // java.lang.Comparable
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public int compareTo(IAuthTabCallback iAuthTabCallback) {
            return this.onExtraCallbackWithResult - iAuthTabCallback.onExtraCallbackWithResult;
        }
    }

    static Object onExtraCallback(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static class onExtraCallback<ContainingType extends LazyStaggeredGridMeasureKtExternalSyntheticLambda1, Type> extends LazyLayoutScrollScopeKtExternalSyntheticLambda0<ContainingType, Type> {
        final LazyStaggeredGridMeasureKtExternalSyntheticLambda1 onExtraCallbackWithResult;
        final IAuthTabCallback onWarmupCompleted;

        public int onNavigationEvent() {
            return this.onWarmupCompleted.onWarmupCompleted();
        }

        public LazyStaggeredGridMeasureKtExternalSyntheticLambda1 IAuthTabCallback() {
            return this.onExtraCallbackWithResult;
        }

        public PagerKtExternalSyntheticLambda6.onNavigationEvent onWarmupCompleted() {
            return this.onWarmupCompleted.onExtraCallback();
        }

        public boolean onExtraCallbackWithResult() {
            return this.onWarmupCompleted.onNavigationEvent;
        }
    }

    protected static final <T extends PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0<T, ?>> boolean onExtraCallback(T t, boolean z) {
        byte bByteValue = ((Byte) t.onWarmupCompleted(onTransact.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zOnWarmupCompleted = DefaultPagerStateExternalSyntheticLambda2.onNavigationEvent().onExtraCallbackWithResult(t).onWarmupCompleted(t);
        if (z) {
            t.onNavigationEvent(onTransact.SET_MEMOIZED_IS_INITIALIZED, zOnWarmupCompleted ? t : null);
        }
        return zOnWarmupCompleted;
    }

    public static <E> LazySaveableStateHolderKtExternalSyntheticLambda1.asBinder<E> IAuthTabCallbackStub() {
        return (LazySaveableStateHolderKtExternalSyntheticLambda1.asBinder<E>) LazyLayoutPagerKtExternalSyntheticLambda4.onWarmupCompleted();
    }

    public static <E> LazySaveableStateHolderKtExternalSyntheticLambda1.asBinder<E> onNavigationEvent(LazySaveableStateHolderKtExternalSyntheticLambda1.asBinder<E> asbinder) {
        int size = asbinder.size();
        return asbinder.onNavigationEvent(size == 0 ? 10 : size << 1);
    }

    public static class onExtraCallbackWithResult<T extends PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0<T, ?>> extends LazyLayoutItemContentFactoryCachedItemContentExternalSyntheticLambda0<T> {
        private final T onNavigationEvent;

        public onExtraCallbackWithResult(T t) {
            this.onNavigationEvent = t;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public T IAuthTabCallback(LazyLayoutPinnableItemKtExternalSyntheticLambda0 lazyLayoutPinnableItemKtExternalSyntheticLambda0, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2) throws InvalidProtocolBufferException {
            return (T) PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.onNavigationEvent(this.onNavigationEvent, lazyLayoutPinnableItemKtExternalSyntheticLambda0, lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T extends o.PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0<T, ?>, java.lang.Object, o.LazyStaggeredGridMeasureKtExternalSyntheticLambda1, o.PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0] */
    static <T extends PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0<T, ?>> T onNavigationEvent(T t, LazyLayoutPinnableItemKtExternalSyntheticLambda0 lazyLayoutPinnableItemKtExternalSyntheticLambda0, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2) throws InvalidProtocolBufferException {
        ?? r1 = (T) t.onRelationshipValidationResult();
        try {
            PagerDefaultsExternalSyntheticLambda0 pagerDefaultsExternalSyntheticLambda0OnExtraCallbackWithResult = DefaultPagerStateExternalSyntheticLambda2.onNavigationEvent().onExtraCallbackWithResult(r1);
            pagerDefaultsExternalSyntheticLambda0OnExtraCallbackWithResult.onExtraCallback(r1, LazyLayoutScrollScopeKtExternalSyntheticLambda1.onWarmupCompleted(lazyLayoutPinnableItemKtExternalSyntheticLambda0), lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2);
            pagerDefaultsExternalSyntheticLambda0OnExtraCallbackWithResult.onExtraCallbackWithResult(r1);
            return r1;
        } catch (InvalidProtocolBufferException e) {
            boolean zIAuthTabCallbackStubProxy = e.IAuthTabCallbackStubProxy();
            InvalidProtocolBufferException invalidProtocolBufferException = e;
            if (zIAuthTabCallbackStubProxy) {
                invalidProtocolBufferException = new InvalidProtocolBufferException(e);
            }
            throw invalidProtocolBufferException.IAuthTabCallback(r1);
        } catch (IOException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw new InvalidProtocolBufferException(e2).IAuthTabCallback(r1);
        } catch (PagerKtExternalSyntheticLambda3 e3) {
            throw e3.onNavigationEvent().IAuthTabCallback(r1);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T extends PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0<T, ?>> T onExtraCallback(T t) throws InvalidProtocolBufferException {
        if (t == 0 || t.onMinimized()) {
            return t;
        }
        throw t.asInterface().onNavigationEvent().IAuthTabCallback(t);
    }

    public static <T extends PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0<T, ?>> T IAuthTabCallback(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) onExtraCallback(onNavigationEvent(t, LazyLayoutPinnableItemKtExternalSyntheticLambda0.onExtraCallback(inputStream), LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2.IAuthTabCallback()));
    }
}
