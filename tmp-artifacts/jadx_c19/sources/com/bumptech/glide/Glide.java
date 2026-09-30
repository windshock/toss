package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.model.ResourceLoader;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.ResourceBitmapDecoder;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.AndroidViewBindingKtExternalSyntheticLambda0;
import o.AndroidViewBindingKtExternalSyntheticLambda2;
import o.AndroidViewBindingKtExternalSyntheticLambda4;
import o.AndroidViewBindingKtExternalSyntheticLambda5;
import o.AndroidViewBindingKtExternalSyntheticLambda6;
import o.AndroidViewBindingKtExternalSyntheticLambda7;
import o.AndroidViewBindingKtExternalSyntheticLambda8;
import o.AndroidViewBindingKtExternalSyntheticLambda9;
import o.Api33ImplExternalSyntheticLambda0;
import o.Carousel;
import o.CarouselExternalSyntheticLambda0;
import o.EditProcessorExternalSyntheticLambda0;
import o.FontListFontFamilyTypefaceAdapterExternalSyntheticLambda0;
import o.KeyParserExternalSyntheticLambda1;
import o.LoremIpsumExternalSyntheticLambda0;
import o.MultiParagraphIntrinsicsExternalSyntheticLambda1;
import o.RegistryCallback;
import o.SaversKtExternalSyntheticLambda0;
import o.SaversKtExternalSyntheticLambda1;
import o.SaversKtExternalSyntheticLambda10;
import o.SaversKtExternalSyntheticLambda12;
import o.SaversKtExternalSyntheticLambda15;
import o.SaversKtExternalSyntheticLambda4;
import o.SaversKtExternalSyntheticLambda57;
import o.Savers_androidKtExternalSyntheticLambda5;
import o.Savers_androidKtExternalSyntheticLambda6;
import o.SpannableExtensions_androidKtExternalSyntheticLambda0;
import o.TextFieldValueExternalSyntheticLambda0;
import o.TextFieldValueExternalSyntheticLambda1;
import o.TextInputServiceAndroidExternalSyntheticLambda0;
import o.TextInputServiceAndroid_androidKtExternalSyntheticLambda0;
import o.TextInputServiceAndroid_androidKtExternalSyntheticLambda1;
import o.TransitionExternalSyntheticLambda4;
import o.TransitionExternalSyntheticLambda5;
import o.TransitionExternalSyntheticLambda6;
import o.ViewFactoryHolder;
import o.applyConstraintsFromLayoutParams;
import o.doFrame;
import o.getDoneValue;
import o.getFutureValue;
import o.interruptTask;
import o.markHierarchyDirty;
import o.pendingToString;
import o.setDensity;
import o.setElevation;
import o.setFirstHorizontalBias;
import o.setFirstHorizontalStyle;
import o.setFirstVerticalBias;
import o.setFirstVerticalStyle;
import o.setFuture;
import o.setHorizontalBias;
import o.setMaxElementsWrap;
import o.setOnDensityChangedui;
import o.setOnModifierChangedui;
import o.setOnRequestDisallowInterceptTouchEventui;
import o.setOnShow;
import o.setPivotX;
import o.setReleaseBlock;
import o.setTransitionDuration;
import o.userObjectToString;
import o.wasInterrupted;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class Glide implements ComponentCallbacks2 {
    private static volatile boolean IAuthTabCallback;
    private static volatile Glide onNavigationEvent;
    private final FontListFontFamilyTypefaceAdapterExternalSyntheticLambda0 IAuthTabCallbackDefault;
    private final SaversKtExternalSyntheticLambda57 IAuthTabCallbackStub;
    private final RequestManagerRetriever IAuthTabCallbackStubProxy;
    private final Registry access000;
    private final SaversKtExternalSyntheticLambda10 asBinder;
    private final Savers_androidKtExternalSyntheticLambda5 onExtraCallback;
    private final Savers_androidKtExternalSyntheticLambda6 onExtraCallbackWithResult;
    private final onWarmupCompleted onTransact;
    private final setMaxElementsWrap onWarmupCompleted;
    private final List<RequestManager> asInterface = new ArrayList();
    private SaversKtExternalSyntheticLambda1 IAuthTabCallback_Parcel = SaversKtExternalSyntheticLambda1.NORMAL;

    public interface onWarmupCompleted {
        RequestOptions onExtraCallback();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    public static Glide onNavigationEvent(@NonNull Context context) {
        if (onNavigationEvent == null) {
            GeneratedAppGlideModule generatedAppGlideModuleOnExtraCallback = onExtraCallback(context.getApplicationContext());
            synchronized (Glide.class) {
                if (onNavigationEvent == null) {
                    onExtraCallbackWithResult(context, generatedAppGlideModuleOnExtraCallback);
                }
            }
        }
        return onNavigationEvent;
    }

    private static void onExtraCallbackWithResult(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) throws PackageManager.NameNotFoundException {
        if (IAuthTabCallback) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        IAuthTabCallback = true;
        onExtraCallback(context, generatedAppGlideModule);
        IAuthTabCallback = false;
    }

    private static void onExtraCallback(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) throws PackageManager.NameNotFoundException {
        onNavigationEvent(context, new MultiParagraphIntrinsicsExternalSyntheticLambda1(), generatedAppGlideModule);
    }

    private static void onNavigationEvent(@NonNull Context context, @NonNull MultiParagraphIntrinsicsExternalSyntheticLambda1 multiParagraphIntrinsicsExternalSyntheticLambda1, @Nullable GeneratedAppGlideModule generatedAppGlideModule) throws PackageManager.NameNotFoundException {
        Context applicationContext = context.getApplicationContext();
        List<setElevation> listOnWarmupCompleted = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.onNavigationEvent()) {
            listOnWarmupCompleted = new setPivotX(applicationContext).onWarmupCompleted();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.IAuthTabCallback().isEmpty()) {
            Set<Class<?>> setIAuthTabCallback = generatedAppGlideModule.IAuthTabCallback();
            Iterator<setElevation> it = listOnWarmupCompleted.iterator();
            while (it.hasNext()) {
                setElevation next = it.next();
                if (setIAuthTabCallback.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Objects.toString(next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<setElevation> it2 = listOnWarmupCompleted.iterator();
            while (it2.hasNext()) {
                Objects.toString(it2.next().getClass());
            }
        }
        multiParagraphIntrinsicsExternalSyntheticLambda1.onExtraCallbackWithResult(generatedAppGlideModule != null ? generatedAppGlideModule.onExtraCallbackWithResult() : null);
        for (setElevation setelevation : listOnWarmupCompleted) {
        }
        Glide glideOnExtraCallback = multiParagraphIntrinsicsExternalSyntheticLambda1.onExtraCallback(applicationContext);
        for (setElevation setelevation2 : listOnWarmupCompleted) {
            try {
                Registry registry = glideOnExtraCallback.access000;
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + setelevation2.getClass().getName(), e);
            }
        }
        if (generatedAppGlideModule != null) {
            Registry registry2 = glideOnExtraCallback.access000;
        }
        applicationContext.registerComponentCallbacks(glideOnExtraCallback);
        onNavigationEvent = glideOnExtraCallback;
    }

    private static GeneratedAppGlideModule onExtraCallback(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (IllegalAccessException e) {
            onNavigationEvent(e);
            return null;
        } catch (InstantiationException e2) {
            onNavigationEvent(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            onNavigationEvent(e3);
            return null;
        } catch (InvocationTargetException e4) {
            onNavigationEvent(e4);
            return null;
        }
    }

    private static void onNavigationEvent(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [o.setReleaseBlock] */
    public Glide(@NonNull Context context, @NonNull SaversKtExternalSyntheticLambda57 saversKtExternalSyntheticLambda57, @NonNull FontListFontFamilyTypefaceAdapterExternalSyntheticLambda0 fontListFontFamilyTypefaceAdapterExternalSyntheticLambda0, @NonNull Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, @NonNull Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6, @NonNull RequestManagerRetriever requestManagerRetriever, @NonNull setMaxElementsWrap setmaxelementswrap, int i2, @NonNull onWarmupCompleted onwarmupcompleted, @NonNull Map<Class<?>, SaversKtExternalSyntheticLambda12<?, ?>> map, @NonNull List<RequestListener<Object>> list, SaversKtExternalSyntheticLambda0 saversKtExternalSyntheticLambda0) {
        ResourceDecoder setfuture;
        ViewFactoryHolder setreleaseblock;
        this.IAuthTabCallbackStub = saversKtExternalSyntheticLambda57;
        this.onExtraCallback = savers_androidKtExternalSyntheticLambda5;
        this.onExtraCallbackWithResult = savers_androidKtExternalSyntheticLambda6;
        this.IAuthTabCallbackDefault = fontListFontFamilyTypefaceAdapterExternalSyntheticLambda0;
        this.IAuthTabCallbackStubProxy = requestManagerRetriever;
        this.onWarmupCompleted = setmaxelementswrap;
        this.onTransact = onwarmupcompleted;
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.access000 = registry;
        registry.IAuthTabCallback(new DefaultImageHeaderParser());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 27) {
            registry.IAuthTabCallback(new getDoneValue());
        }
        List<ImageHeaderParser> listOnExtraCallback = registry.onExtraCallback();
        RegistryCallback registryCallback = new RegistryCallback(context, listOnExtraCallback, savers_androidKtExternalSyntheticLambda5, savers_androidKtExternalSyntheticLambda6);
        ResourceDecoder<ParcelFileDescriptor, Bitmap> resourceDecoderOnExtraCallbackWithResult = wasInterrupted.onExtraCallbackWithResult(savers_androidKtExternalSyntheticLambda5);
        Api33ImplExternalSyntheticLambda0 api33ImplExternalSyntheticLambda0 = new Api33ImplExternalSyntheticLambda0(registry.onExtraCallback(), resources.getDisplayMetrics(), savers_androidKtExternalSyntheticLambda5, savers_androidKtExternalSyntheticLambda6);
        if (i3 >= 28 && saversKtExternalSyntheticLambda0.onWarmupCompleted(MultiParagraphIntrinsicsExternalSyntheticLambda1.onExtraCallback.class)) {
            setfuture = new getFutureValue();
            setreleaseblock = new setReleaseBlock();
        } else {
            ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(api33ImplExternalSyntheticLambda0);
            setfuture = new setFuture(api33ImplExternalSyntheticLambda0, savers_androidKtExternalSyntheticLambda6);
            setreleaseblock = viewFactoryHolder;
        }
        if (i3 >= 28 && saversKtExternalSyntheticLambda0.onWarmupCompleted(MultiParagraphIntrinsicsExternalSyntheticLambda1.onNavigationEvent.class)) {
            registry.onExtraCallback("Animation", InputStream.class, Drawable.class, KeyParserExternalSyntheticLambda1.IAuthTabCallback(listOnExtraCallback, savers_androidKtExternalSyntheticLambda6));
            registry.onExtraCallback("Animation", ByteBuffer.class, Drawable.class, KeyParserExternalSyntheticLambda1.onWarmupCompleted(listOnExtraCallback, savers_androidKtExternalSyntheticLambda6));
        }
        ResourceDrawableDecoder resourceDrawableDecoder = new ResourceDrawableDecoder(context);
        ResourceLoader.StreamFactory streamFactory = new ResourceLoader.StreamFactory(resources);
        ResourceLoader.UriFactory uriFactory = new ResourceLoader.UriFactory(resources);
        ResourceLoader.FileDescriptorFactory fileDescriptorFactory = new ResourceLoader.FileDescriptorFactory(resources);
        ResourceLoader.AssetFileDescriptorFactory assetFileDescriptorFactory = new ResourceLoader.AssetFileDescriptorFactory(resources);
        setOnRequestDisallowInterceptTouchEventui setonrequestdisallowintercepttoucheventui = new setOnRequestDisallowInterceptTouchEventui(savers_androidKtExternalSyntheticLambda6);
        setFirstHorizontalStyle setfirsthorizontalstyle = new setFirstHorizontalStyle();
        setHorizontalBias sethorizontalbias = new setHorizontalBias();
        ContentResolver contentResolver = context.getContentResolver();
        registry.IAuthTabCallback(ByteBuffer.class, new TextInputServiceAndroidExternalSyntheticLambda0()).IAuthTabCallback(InputStream.class, new AndroidViewBindingKtExternalSyntheticLambda0(savers_androidKtExternalSyntheticLambda6)).onExtraCallback("Bitmap", ByteBuffer.class, Bitmap.class, setreleaseblock).onExtraCallback("Bitmap", InputStream.class, Bitmap.class, setfuture);
        if (ParcelFileDescriptorRewinder.IAuthTabCallback()) {
            registry.onExtraCallback("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new userObjectToString(api33ImplExternalSyntheticLambda0));
        }
        registry.onExtraCallback("Bitmap", ParcelFileDescriptor.class, Bitmap.class, resourceDecoderOnExtraCallbackWithResult).onExtraCallback("Bitmap", AssetFileDescriptor.class, Bitmap.class, wasInterrupted.onNavigationEvent(savers_androidKtExternalSyntheticLambda5)).onExtraCallbackWithResult(Bitmap.class, Bitmap.class, AndroidViewBindingKtExternalSyntheticLambda2.onExtraCallbackWithResult.onWarmupCompleted()).onExtraCallback("Bitmap", Bitmap.class, Bitmap.class, new pendingToString()).onExtraCallback(Bitmap.class, setonrequestdisallowintercepttoucheventui).onExtraCallback("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new setOnDensityChangedui(resources, setreleaseblock)).onExtraCallback("BitmapDrawable", InputStream.class, BitmapDrawable.class, new setOnDensityChangedui(resources, setfuture)).onExtraCallback("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new setOnDensityChangedui(resources, resourceDecoderOnExtraCallbackWithResult)).onExtraCallback(BitmapDrawable.class, new setOnModifierChangedui(savers_androidKtExternalSyntheticLambda5, setonrequestdisallowintercepttoucheventui)).onExtraCallback("Animation", InputStream.class, TransitionExternalSyntheticLambda6.class, new setFirstHorizontalBias(listOnExtraCallback, registryCallback, savers_androidKtExternalSyntheticLambda6)).onExtraCallback("Animation", ByteBuffer.class, TransitionExternalSyntheticLambda6.class, registryCallback).onExtraCallback(TransitionExternalSyntheticLambda6.class, new Carousel()).onExtraCallbackWithResult(SaversKtExternalSyntheticLambda15.class, SaversKtExternalSyntheticLambda15.class, AndroidViewBindingKtExternalSyntheticLambda2.onExtraCallbackWithResult.onWarmupCompleted()).onExtraCallback("Bitmap", SaversKtExternalSyntheticLambda15.class, Bitmap.class, new CarouselExternalSyntheticLambda0(savers_androidKtExternalSyntheticLambda5)).onWarmupCompleted(Uri.class, Drawable.class, resourceDrawableDecoder).onWarmupCompleted(Uri.class, Bitmap.class, new ResourceBitmapDecoder(resourceDrawableDecoder, savers_androidKtExternalSyntheticLambda5)).onWarmupCompleted(new interruptTask.onNavigationEvent()).onExtraCallbackWithResult(File.class, ByteBuffer.class, new TextFieldValueExternalSyntheticLambda1.onExtraCallback()).onExtraCallbackWithResult(File.class, InputStream.class, new TextInputServiceAndroid_androidKtExternalSyntheticLambda0.onExtraCallback()).onWarmupCompleted(File.class, File.class, new TransitionExternalSyntheticLambda5()).onExtraCallbackWithResult(File.class, ParcelFileDescriptor.class, new TextInputServiceAndroid_androidKtExternalSyntheticLambda0.onNavigationEvent()).onExtraCallbackWithResult(File.class, File.class, AndroidViewBindingKtExternalSyntheticLambda2.onExtraCallbackWithResult.onWarmupCompleted()).onWarmupCompleted(new SaversKtExternalSyntheticLambda4.IAuthTabCallback(savers_androidKtExternalSyntheticLambda6));
        if (ParcelFileDescriptorRewinder.IAuthTabCallback()) {
            registry.onWarmupCompleted(new ParcelFileDescriptorRewinder.onWarmupCompleted());
        }
        Class cls = Integer.TYPE;
        registry.onExtraCallbackWithResult(cls, InputStream.class, streamFactory).onExtraCallbackWithResult(cls, ParcelFileDescriptor.class, fileDescriptorFactory).onExtraCallbackWithResult(Integer.class, InputStream.class, streamFactory).onExtraCallbackWithResult(Integer.class, ParcelFileDescriptor.class, fileDescriptorFactory).onExtraCallbackWithResult(Integer.class, Uri.class, uriFactory).onExtraCallbackWithResult(cls, AssetFileDescriptor.class, assetFileDescriptorFactory).onExtraCallbackWithResult(Integer.class, AssetFileDescriptor.class, assetFileDescriptorFactory).onExtraCallbackWithResult(cls, Uri.class, uriFactory).onExtraCallbackWithResult(String.class, InputStream.class, new TextInputServiceAndroid_androidKtExternalSyntheticLambda1.IAuthTabCallback()).onExtraCallbackWithResult(Uri.class, InputStream.class, new TextInputServiceAndroid_androidKtExternalSyntheticLambda1.IAuthTabCallback()).onExtraCallbackWithResult(String.class, InputStream.class, new LoremIpsumExternalSyntheticLambda0.onExtraCallbackWithResult()).onExtraCallbackWithResult(String.class, ParcelFileDescriptor.class, new LoremIpsumExternalSyntheticLambda0.IAuthTabCallback()).onExtraCallbackWithResult(String.class, AssetFileDescriptor.class, new LoremIpsumExternalSyntheticLambda0.onWarmupCompleted()).onExtraCallbackWithResult(Uri.class, InputStream.class, new EditProcessorExternalSyntheticLambda0.onExtraCallback(context.getAssets())).onExtraCallbackWithResult(Uri.class, AssetFileDescriptor.class, new EditProcessorExternalSyntheticLambda0.IAuthTabCallback(context.getAssets())).onExtraCallbackWithResult(Uri.class, InputStream.class, new AndroidViewBindingKtExternalSyntheticLambda6.onWarmupCompleted(context)).onExtraCallbackWithResult(Uri.class, InputStream.class, new AndroidViewBindingKtExternalSyntheticLambda5.onNavigationEvent(context));
        if (i3 >= 29) {
            registry.onExtraCallbackWithResult(Uri.class, InputStream.class, new AndroidViewBindingKtExternalSyntheticLambda9.IAuthTabCallback(context));
            registry.onExtraCallbackWithResult(Uri.class, ParcelFileDescriptor.class, new AndroidViewBindingKtExternalSyntheticLambda9.onExtraCallback(context));
        }
        registry.onExtraCallbackWithResult(Uri.class, InputStream.class, new AndroidViewBindingKtExternalSyntheticLambda8.onWarmupCompleted(contentResolver)).onExtraCallbackWithResult(Uri.class, ParcelFileDescriptor.class, new AndroidViewBindingKtExternalSyntheticLambda8.onExtraCallback(contentResolver)).onExtraCallbackWithResult(Uri.class, AssetFileDescriptor.class, new AndroidViewBindingKtExternalSyntheticLambda8.onExtraCallbackWithResult(contentResolver)).onExtraCallbackWithResult(Uri.class, InputStream.class, new AndroidViewBindingKtExternalSyntheticLambda4.onWarmupCompleted()).onExtraCallbackWithResult(URL.class, InputStream.class, new setDensity.onExtraCallbackWithResult()).onExtraCallbackWithResult(Uri.class, File.class, new doFrame.onExtraCallback(context)).onExtraCallbackWithResult(SpannableExtensions_androidKtExternalSyntheticLambda0.class, InputStream.class, new AndroidViewBindingKtExternalSyntheticLambda7.onExtraCallbackWithResult()).onExtraCallbackWithResult(byte[].class, ByteBuffer.class, new TextFieldValueExternalSyntheticLambda0.IAuthTabCallback()).onExtraCallbackWithResult(byte[].class, InputStream.class, new TextFieldValueExternalSyntheticLambda0.onExtraCallback()).onExtraCallbackWithResult(Uri.class, Uri.class, AndroidViewBindingKtExternalSyntheticLambda2.onExtraCallbackWithResult.onWarmupCompleted()).onExtraCallbackWithResult(Drawable.class, Drawable.class, AndroidViewBindingKtExternalSyntheticLambda2.onExtraCallbackWithResult.onWarmupCompleted()).onWarmupCompleted(Drawable.class, Drawable.class, new TransitionExternalSyntheticLambda4()).onExtraCallbackWithResult(Bitmap.class, BitmapDrawable.class, new setFirstVerticalBias(resources)).onExtraCallbackWithResult(Bitmap.class, byte[].class, setfirsthorizontalstyle).onExtraCallbackWithResult(Drawable.class, byte[].class, new setFirstVerticalStyle(savers_androidKtExternalSyntheticLambda5, setfirsthorizontalstyle, sethorizontalbias)).onExtraCallbackWithResult(TransitionExternalSyntheticLambda6.class, byte[].class, sethorizontalbias);
        ResourceDecoder<ByteBuffer, Bitmap> resourceDecoderOnExtraCallback = wasInterrupted.onExtraCallback(savers_androidKtExternalSyntheticLambda5);
        registry.onWarmupCompleted(ByteBuffer.class, Bitmap.class, resourceDecoderOnExtraCallback);
        registry.onWarmupCompleted(ByteBuffer.class, BitmapDrawable.class, new setOnDensityChangedui(resources, resourceDecoderOnExtraCallback));
        this.asBinder = new SaversKtExternalSyntheticLambda10(context, savers_androidKtExternalSyntheticLambda6, registry, new setOnShow(), onwarmupcompleted, map, list, saversKtExternalSyntheticLambda57, saversKtExternalSyntheticLambda0, i2);
    }

    public Savers_androidKtExternalSyntheticLambda5 onNavigationEvent() {
        return this.onExtraCallback;
    }

    public Savers_androidKtExternalSyntheticLambda6 onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public Context onExtraCallback() {
        return this.asBinder.getBaseContext();
    }

    setMaxElementsWrap IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    SaversKtExternalSyntheticLambda10 asInterface() {
        return this.asBinder;
    }

    public void onWarmupCompleted() {
        applyConstraintsFromLayoutParams.onNavigationEvent();
        this.IAuthTabCallbackDefault.onWarmupCompleted();
        this.onExtraCallback.onExtraCallback();
        this.onExtraCallbackWithResult.onWarmupCompleted();
    }

    public void onNavigationEvent(int i2) {
        applyConstraintsFromLayoutParams.onNavigationEvent();
        synchronized (this.asInterface) {
            Iterator<RequestManager> it = this.asInterface.iterator();
            while (it.hasNext()) {
                it.next().onTrimMemory(i2);
            }
        }
        this.IAuthTabCallbackDefault.onExtraCallback(i2);
        this.onExtraCallback.onNavigationEvent(i2);
        this.onExtraCallbackWithResult.onNavigationEvent(i2);
    }

    public RequestManagerRetriever IAuthTabCallbackDefault() {
        return this.IAuthTabCallbackStubProxy;
    }

    private static RequestManagerRetriever onWarmupCompleted(@Nullable Context context) {
        markHierarchyDirty.onExtraCallbackWithResult(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return onNavigationEvent(context).IAuthTabCallbackDefault();
    }

    public static RequestManager IAuthTabCallback(@NonNull Context context) {
        return onWarmupCompleted(context).onWarmupCompleted(context);
    }

    public static RequestManager onExtraCallbackWithResult(@NonNull FragmentActivity fragmentActivity) {
        return onWarmupCompleted(fragmentActivity).onNavigationEvent(fragmentActivity);
    }

    public static RequestManager onNavigationEvent(@NonNull Fragment fragment) {
        return onWarmupCompleted(fragment.getContext()).IAuthTabCallback(fragment);
    }

    public static RequestManager onExtraCallbackWithResult(@NonNull View view) {
        return onWarmupCompleted(view.getContext()).onNavigationEvent(view);
    }

    public Registry onTransact() {
        return this.access000;
    }

    boolean IAuthTabCallback(@NonNull setTransitionDuration<?> settransitionduration) {
        synchronized (this.asInterface) {
            Iterator<RequestManager> it = this.asInterface.iterator();
            while (it.hasNext()) {
                if (it.next().onExtraCallback(settransitionduration)) {
                    return true;
                }
            }
            return false;
        }
    }

    void onExtraCallback(RequestManager requestManager) {
        synchronized (this.asInterface) {
            if (this.asInterface.contains(requestManager)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            this.asInterface.add(requestManager);
        }
    }

    void onExtraCallbackWithResult(RequestManager requestManager) {
        synchronized (this.asInterface) {
            if (!this.asInterface.contains(requestManager)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.asInterface.remove(requestManager);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        onNavigationEvent(i2);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onWarmupCompleted();
    }
}
