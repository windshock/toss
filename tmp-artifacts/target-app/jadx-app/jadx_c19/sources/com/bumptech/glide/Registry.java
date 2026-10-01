package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.provider.ResourceDecoderRegistry;
import com.bumptech.glide.provider.ResourceEncoderRegistry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.MotionLayout;
import o.ResolvedTextDirection;
import o.SaversKtExternalSyntheticLambda24;
import o.SaversKtExternalSyntheticLambda32;
import o.SaversKtExternalSyntheticLambda33;
import o.SaversKtExternalSyntheticLambda54;
import o.Savers_androidKtExternalSyntheticLambda2;
import o.ShaderBrushSpanExternalSyntheticLambda0;
import o.TextForegroundStyleExternalSyntheticLambda1;
import o.forceLayout;
import o.setHorizontalAlign;
import o.setPivotY;
import o.setScaleX;
import o.setTranslationY;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class Registry {
    private final SaversKtExternalSyntheticLambda32 IAuthTabCallback;
    private final TextForegroundStyleExternalSyntheticLambda1 IAuthTabCallbackDefault;
    private final ResourceEncoderRegistry IAuthTabCallbackStub;
    private final Pools.onExtraCallback<List<Throwable>> asBinder;
    private final setHorizontalAlign asInterface;
    private final setPivotY onExtraCallback;
    private final setScaleX onExtraCallbackWithResult;
    private final ResourceDecoderRegistry onNavigationEvent;
    private final MotionLayout onTransact = new MotionLayout();
    private final setTranslationY onWarmupCompleted = new setTranslationY();

    public Registry() {
        Pools.onExtraCallback<List<Throwable>> onextracallbackIAuthTabCallback = forceLayout.IAuthTabCallback();
        this.asBinder = onextracallbackIAuthTabCallback;
        this.IAuthTabCallbackDefault = new TextForegroundStyleExternalSyntheticLambda1(onextracallbackIAuthTabCallback);
        this.onExtraCallback = new setPivotY();
        this.onNavigationEvent = new ResourceDecoderRegistry();
        this.IAuthTabCallbackStub = new ResourceEncoderRegistry();
        this.IAuthTabCallback = new SaversKtExternalSyntheticLambda32();
        this.asInterface = new setHorizontalAlign();
        this.onExtraCallbackWithResult = new setScaleX();
        onNavigationEvent(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    public <Data> Registry IAuthTabCallback(@NonNull Class<Data> cls, @NonNull SaversKtExternalSyntheticLambda24<Data> saversKtExternalSyntheticLambda24) {
        this.onExtraCallback.onExtraCallbackWithResult(cls, saversKtExternalSyntheticLambda24);
        return this;
    }

    public <Data, TResource> Registry onWarmupCompleted(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull ResourceDecoder<Data, TResource> resourceDecoder) {
        onExtraCallback("legacy_append", cls, cls2, resourceDecoder);
        return this;
    }

    public <Data, TResource> Registry onExtraCallback(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull ResourceDecoder<Data, TResource> resourceDecoder) {
        this.onNavigationEvent.onExtraCallbackWithResult(str, resourceDecoder, cls, cls2);
        return this;
    }

    public final Registry onNavigationEvent(@NonNull List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add("legacy_append");
        this.onNavigationEvent.onWarmupCompleted(arrayList);
        return this;
    }

    public <TResource> Registry onExtraCallback(@NonNull Class<TResource> cls, @NonNull ResourceEncoder<TResource> resourceEncoder) {
        this.IAuthTabCallbackStub.onNavigationEvent(cls, resourceEncoder);
        return this;
    }

    public Registry onWarmupCompleted(@NonNull SaversKtExternalSyntheticLambda33.onExtraCallback<?> onextracallback) {
        this.IAuthTabCallback.onNavigationEvent(onextracallback);
        return this;
    }

    public <TResource, Transcode> Registry onExtraCallbackWithResult(@NonNull Class<TResource> cls, @NonNull Class<Transcode> cls2, @NonNull ResourceTranscoder<TResource, Transcode> resourceTranscoder) {
        this.asInterface.onExtraCallback(cls, cls2, resourceTranscoder);
        return this;
    }

    public Registry IAuthTabCallback(@NonNull ImageHeaderParser imageHeaderParser) {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(imageHeaderParser);
        return this;
    }

    public <Model, Data> Registry onExtraCallbackWithResult(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ResolvedTextDirection<Model, Data> resolvedTextDirection) {
        this.IAuthTabCallbackDefault.onExtraCallbackWithResult(cls, cls2, resolvedTextDirection);
        return this;
    }

    public <Data, TResource, Transcode> Savers_androidKtExternalSyntheticLambda2<Data, TResource, Transcode> onNavigationEvent(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        Savers_androidKtExternalSyntheticLambda2<Data, TResource, Transcode> savers_androidKtExternalSyntheticLambda2IAuthTabCallback = this.onWarmupCompleted.IAuthTabCallback(cls, cls2, cls3);
        if (this.onWarmupCompleted.onExtraCallback(savers_androidKtExternalSyntheticLambda2IAuthTabCallback)) {
            return null;
        }
        if (savers_androidKtExternalSyntheticLambda2IAuthTabCallback != null) {
            return savers_androidKtExternalSyntheticLambda2IAuthTabCallback;
        }
        List<SaversKtExternalSyntheticLambda54<Data, TResource, Transcode>> listOnWarmupCompleted = onWarmupCompleted(cls, cls2, cls3);
        Savers_androidKtExternalSyntheticLambda2<Data, TResource, Transcode> savers_androidKtExternalSyntheticLambda2 = listOnWarmupCompleted.isEmpty() ? null : new Savers_androidKtExternalSyntheticLambda2<>(cls, cls2, cls3, listOnWarmupCompleted, this.asBinder);
        this.onWarmupCompleted.onNavigationEvent(cls, cls2, cls3, savers_androidKtExternalSyntheticLambda2);
        return savers_androidKtExternalSyntheticLambda2;
    }

    private <Data, TResource, Transcode> List<SaversKtExternalSyntheticLambda54<Data, TResource, Transcode>> onWarmupCompleted(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.onNavigationEvent.onExtraCallbackWithResult(cls, cls2)) {
            for (Class cls5 : this.asInterface.onExtraCallback(cls4, cls3)) {
                arrayList.add(new SaversKtExternalSyntheticLambda54(cls, cls4, cls5, this.onNavigationEvent.onWarmupCompleted(cls, cls4), this.asInterface.onNavigationEvent(cls4, cls5), this.asBinder));
            }
        }
        return arrayList;
    }

    public <Model, TResource, Transcode> List<Class<?>> onExtraCallback(@NonNull Class<Model> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        List<Class<?>> listIAuthTabCallback = this.onTransact.IAuthTabCallback(cls, cls2, cls3);
        if (listIAuthTabCallback == null) {
            listIAuthTabCallback = new ArrayList<>();
            Iterator<Class<?>> it = this.IAuthTabCallbackDefault.onWarmupCompleted(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.onNavigationEvent.onExtraCallbackWithResult(it.next(), cls2)) {
                    if (!this.asInterface.onExtraCallback(cls4, cls3).isEmpty() && !listIAuthTabCallback.contains(cls4)) {
                        listIAuthTabCallback.add(cls4);
                    }
                }
            }
            this.onTransact.onWarmupCompleted(cls, cls2, cls3, Collections.unmodifiableList(listIAuthTabCallback));
        }
        return listIAuthTabCallback;
    }

    public boolean onExtraCallback(@NonNull Resource<?> resource) {
        return this.IAuthTabCallbackStub.onExtraCallback(resource.onExtraCallbackWithResult()) != null;
    }

    public <X> ResourceEncoder<X> onWarmupCompleted(@NonNull Resource<X> resource) throws NoResultEncoderAvailableException {
        ResourceEncoder<X> resourceEncoderOnExtraCallback = this.IAuthTabCallbackStub.onExtraCallback(resource.onExtraCallbackWithResult());
        if (resourceEncoderOnExtraCallback != null) {
            return resourceEncoderOnExtraCallback;
        }
        throw new NoResultEncoderAvailableException(resource.onExtraCallbackWithResult());
    }

    public <X> SaversKtExternalSyntheticLambda24<X> onExtraCallback(@NonNull X x) throws NoSourceEncoderAvailableException {
        SaversKtExternalSyntheticLambda24<X> saversKtExternalSyntheticLambda24OnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult(x.getClass());
        if (saversKtExternalSyntheticLambda24OnExtraCallbackWithResult != null) {
            return saversKtExternalSyntheticLambda24OnExtraCallbackWithResult;
        }
        throw new NoSourceEncoderAvailableException(x.getClass());
    }

    public <X> SaversKtExternalSyntheticLambda33<X> onExtraCallbackWithResult(@NonNull X x) {
        return this.IAuthTabCallback.IAuthTabCallback(x);
    }

    public <Model> List<ShaderBrushSpanExternalSyntheticLambda0<Model, ?>> onNavigationEvent(@NonNull Model model) {
        return this.IAuthTabCallbackDefault.IAuthTabCallback(model);
    }

    public List<ImageHeaderParser> onExtraCallback() {
        List<ImageHeaderParser> listOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult();
        if (listOnExtraCallbackWithResult.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return listOnExtraCallbackWithResult;
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(@NonNull Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(@NonNull M m, @NonNull List<ShaderBrushSpanExternalSyntheticLambda0<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public NoModelLoaderAvailableException(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(@NonNull String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }
}
