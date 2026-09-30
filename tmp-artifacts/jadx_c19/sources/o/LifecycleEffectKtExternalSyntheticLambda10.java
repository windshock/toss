package o;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class LifecycleEffectKtExternalSyntheticLambda10 {
    public static Collection<Map.Entry<Class<?>, Object>> onExtraCallbackWithResult() {
        HashMap map = new HashMap();
        map.put(URL.class, new LifecycleEffectKtExternalSyntheticLambda13(URL.class));
        map.put(URI.class, new LifecycleEffectKtExternalSyntheticLambda13(URI.class));
        map.put(Currency.class, new LifecycleEffectKtExternalSyntheticLambda13(Currency.class));
        map.put(UUID.class, new LifecycleEffectKtExternalSyntheticLambda17());
        map.put(Pattern.class, new LifecycleEffectKtExternalSyntheticLambda13(Pattern.class));
        map.put(Locale.class, new LifecycleEffectKtExternalSyntheticLambda13(Locale.class));
        map.put(AtomicBoolean.class, IAuthTabCallback.class);
        map.put(AtomicInteger.class, onWarmupCompleted.class);
        map.put(AtomicLong.class, onExtraCallbackWithResult.class);
        map.put(File.class, SavedStateHandlesProviderExternalSyntheticLambda0.class);
        map.put(Class.class, SavedStateHandleAttacher.class);
        TransformationsExternalSyntheticLambda4 transformationsExternalSyntheticLambda4 = TransformationsExternalSyntheticLambda4.onExtraCallbackWithResult;
        map.put(Void.class, transformationsExternalSyntheticLambda4);
        map.put(Void.TYPE, transformationsExternalSyntheticLambda4);
        return map.entrySet();
    }

    public static class IAuthTabCallback extends LifecycleEffectKtExternalSyntheticLambda1<AtomicBoolean> {
        public IAuthTabCallback() {
            super(AtomicBoolean.class, false);
        }

        @Override // o.LifecycleEffectKtExternalSyntheticLambda14, o.FragmentFactory
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public void onExtraCallback(AtomicBoolean atomicBoolean, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException {
            getview.onWarmupCompleted(atomicBoolean.get());
        }
    }

    public static class onWarmupCompleted extends LifecycleEffectKtExternalSyntheticLambda1<AtomicInteger> {
        public onWarmupCompleted() {
            super(AtomicInteger.class, false);
        }

        @Override // o.LifecycleEffectKtExternalSyntheticLambda14, o.FragmentFactory
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public void onExtraCallback(AtomicInteger atomicInteger, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException {
            getview.onExtraCallbackWithResult(atomicInteger.get());
        }
    }

    public static class onExtraCallbackWithResult extends LifecycleEffectKtExternalSyntheticLambda1<AtomicLong> {
        public onExtraCallbackWithResult() {
            super(AtomicLong.class, false);
        }

        @Override // o.LifecycleEffectKtExternalSyntheticLambda14, o.FragmentFactory
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public void onExtraCallback(AtomicLong atomicLong, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException {
            getview.onExtraCallback(atomicLong.get());
        }
    }
}
